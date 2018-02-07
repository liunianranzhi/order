package com.shanyuan.platform.ms.portal.auth;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import javax.sql.DataSource;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.core.PriorityOrdered;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.alibaba.druid.support.spring.stat.DruidStatInterceptor;
import org.springframework.transaction.annotation.Transactional;

@EnableTransactionManagement(order = 10)
@Configuration
public class DruidConfiguration {

    public static final String DB_PREFIX = "spring.datasource";
    public static final String DB_READ_PREFIX = "spring.datasource.read";
    @Autowired
    private DruidStatInterceptor dsi ;
    @Value("${spring.datasource.druid.userName}")
    private String druidUserName="druid"  ;
    @Value("${spring.datasource.druid.password}")
    private String druidPassword="druid" ;
    @Bean
    public DruidStatInterceptor getDsi() {
        return new DruidStatInterceptor();
    }
    @Bean
    public ServletRegistrationBean druidServlet() {
        ServletRegistrationBean reg = new ServletRegistrationBean();
        reg.setServlet(new StatViewServlet());
        reg.addUrlMappings("druid/*");
        String un = StringUtils.isNotEmpty(druidUserName)?druidUserName:"druid";
        String ps = StringUtils.isNotEmpty(druidPassword)?druidPassword:"druid";
        reg.addInitParameter("loginUsername", un);
        reg.addInitParameter("loginPassword", ps);
        return reg;
    }


    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        filterRegistrationBean.addInitParameter("profileEnable", "true");
        filterRegistrationBean.addInitParameter("principalCookieName", "USER_COOKIE");
        filterRegistrationBean.addInitParameter("principalSessionName", "USER_SESSION");
        return filterRegistrationBean;
    }



    // 设置默认的aop配置对应的是原来的<aop:advisor>
    @Bean
    public Advisor druidAdvisor() {
        DefaultPointcutAdvisor defaultPointcutAdvisor = new DefaultPointcutAdvisor();
        AspectJExpressionPointcut  ajp = new AspectJExpressionPointcut();
        ajp.setExpression("execution(* com.shanyuan.platform.ms.core.*.impl.*.*(..))");
        defaultPointcutAdvisor.setPointcut(ajp);
        defaultPointcutAdvisor.setAdvice(dsi);
        return defaultPointcutAdvisor;
    }





}

//@Component("redisHealthIndicator")
class RedisHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        return Health.up().build();
    }

}
@Configuration
@AutoConfigureAfter({ IDataSourceProperties.class,IREADDataSrouceProperties.class })
@MapperScan(basePackages ="com.shanyuan.platform.ms.dao.*.mapper")
class MybatisConfiguration extends MybatisAutoConfiguration {

    @Autowired
    @Qualifier("writeDataSource")
    private DataSource writeDataSource;
    @Autowired
    @Qualifier("readDataSource")
    private DataSource readDataSource;
    @Value("${mybatis.mapper-locations}")
    private String[] mapperLocations;
    @Autowired
    @Qualifier("roundRobinDataSouceProxy")
    private AbstractRoutingDataSource routingDataSource ;
    @Bean(name="sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactorys() throws Exception {
        try {
            SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
            sessionFactoryBean.setDataSource(roundRobinDataSouceProxy());
            //设置mapper.xml文件所在位置
//            sessionFactoryBean.setConfigLocation( new DefaultResourceLoader().getResource(mapperLocations));
            sessionFactoryBean.setMapperLocations(this.resolveMapperLocations());
            return sessionFactoryBean.getObject();
        } catch (IOException e) {
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    @Bean(name="roundRobinDataSouceProxy")
    public AbstractRoutingDataSource roundRobinDataSouceProxy() {

        Map<Object, Object> targetDataSources = new HashMap<Object, Object>();
        //把所有数据库都放在targetDataSources中,注意key值要和determineCurrentLookupKey()中代码写的一至，
        //否则切换数据源时找不到正确的数据源
        targetDataSources.put(DataSourceType.write.getType(), writeDataSource);
        targetDataSources.put(DataSourceType.read.getType() , readDataSource );


        //路由类，寻找对应的数据源
        AbstractRoutingDataSource proxy = new AbstractRoutingDataSource(){
            private AtomicInteger count = new AtomicInteger(0);
            /**
             * 这是AbstractRoutingDataSource类中的一个抽象方法，
             * 而它的返回值是你所要用的数据源dataSource的key值，有了这个key值，
             * targetDataSources就从中取出对应的DataSource，如果找不到，就用配置默认的数据源。
             */
            @Override
            protected Object determineCurrentLookupKey() {
                String typeKey = DataSourceContextHolder.getReadOrWrite();

                if(typeKey == null){
                    //  System.err.println("使用数据库write.............");
                    return DataSourceType.write.getType();
//                    throw new NullPointerException("数据库路由时，决定使用哪个数据库源类型不能为空...");
                }

                if (typeKey.equals(DataSourceType.write.getType())){
                    return DataSourceType.write.getType();
                }
                //读库， 简单负载均衡
                return DataSourceType.read.getType() ;
            }
        };

        proxy.setDefaultTargetDataSource(writeDataSource);//默认库
        proxy.setTargetDataSources(targetDataSources);
        return proxy;
    }


    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    //事务管理
    @Bean
    public PlatformTransactionManager annotationDrivenTransactionManager() {

        return new DataSourceTransactionManager((DataSource)routingDataSource);
    }


    public Resource[] resolveMapperLocations() {
        List<Resource> resources = new ArrayList<Resource>();
        if (this.mapperLocations != null) {
            for (String mapperLocation : this.mapperLocations) {
                Resource[] mappers;
                try {
                    mappers = new PathMatchingResourcePatternResolver().getResources(mapperLocation);
                    resources.addAll(Arrays.asList(mappers));
                } catch (IOException e) {

                }
            }
        }

        Resource[] mapperLocations = new Resource[resources.size()];
        mapperLocations = resources.toArray(mapperLocations);
        return mapperLocations;
    }

}
@AutoConfigureAfter({ IDataSourceProperties.class  })
@ConfigurationProperties(prefix= DruidConfiguration.DB_READ_PREFIX)
@Configuration
class IREADDataSrouceProperties  {
    private String url;
    private String username;
    private String password;
    private String driverClassName;
    private int initialSize;
    private int minIdle;
    private int maxActive;
    private int maxWait;
    private int timeBetweenEvictionRunsMillis;
    private int minEvictableIdleTimeMillis;
    private String validationQuery;
    private boolean testWhileIdle;
    private boolean testOnBorrow;
    private boolean testOnReturn;
    private boolean poolPreparedStatements;
    private int maxPoolPreparedStatementPerConnectionSize;
    private String filters;
    private String connectionProperties;

    @Autowired
    @Qualifier("writeDataSource")
    private DataSource ds;
    @Bean(name = "readDataSource")     //声明其为Bean实例
    public DataSource dataSource() {
        if(StringUtils.isEmpty(url)) {
            return ds;
        }
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(url);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setDriverClassName(driverClassName);

        //configuration
        datasource.setInitialSize(initialSize);
        datasource.setMinIdle(minIdle);
        datasource.setMaxActive(maxActive);
        datasource.setMaxWait(maxWait);
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        datasource.setValidationQuery(validationQuery);
        datasource.setTestWhileIdle(testWhileIdle);
        datasource.setTestOnBorrow(testOnBorrow);
        datasource.setTestOnReturn(testOnReturn);
        datasource.setPoolPreparedStatements(poolPreparedStatements);
        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        try {
            datasource.setFilters(filters);
        } catch (SQLException e) {
            System.err.println("druid configuration initialization filter: " + e);
        }
        datasource.setConnectionProperties(connectionProperties);
        return datasource;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public int getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(int initialSize) {
        this.initialSize = initialSize;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public int getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(int maxWait) {
        this.maxWait = maxWait;
    }

    public int getTimeBetweenEvictionRunsMillis() {
        return timeBetweenEvictionRunsMillis;
    }

    public void setTimeBetweenEvictionRunsMillis(int timeBetweenEvictionRunsMillis) {
        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    }

    public int getMinEvictableIdleTimeMillis() {
        return minEvictableIdleTimeMillis;
    }

    public void setMinEvictableIdleTimeMillis(int minEvictableIdleTimeMillis) {
        this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
    }

    public String getValidationQuery() {
        return validationQuery;
    }

    public void setValidationQuery(String validationQuery) {
        this.validationQuery = validationQuery;
    }

    public boolean isTestWhileIdle() {
        return testWhileIdle;
    }

    public void setTestWhileIdle(boolean testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }

    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public boolean isTestOnReturn() {
        return testOnReturn;
    }

    public void setTestOnReturn(boolean testOnReturn) {
        this.testOnReturn = testOnReturn;
    }

    public boolean isPoolPreparedStatements() {
        return poolPreparedStatements;
    }

    public void setPoolPreparedStatements(boolean poolPreparedStatements) {
        this.poolPreparedStatements = poolPreparedStatements;
    }

    public int getMaxPoolPreparedStatementPerConnectionSize() {
        return maxPoolPreparedStatementPerConnectionSize;
    }

    public void setMaxPoolPreparedStatementPerConnectionSize(int maxPoolPreparedStatementPerConnectionSize) {
        this.maxPoolPreparedStatementPerConnectionSize = maxPoolPreparedStatementPerConnectionSize;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public String getConnectionProperties() {
        return connectionProperties;
    }

    public void setConnectionProperties(String connectionProperties) {
        this.connectionProperties = connectionProperties;
    }

}


@ConfigurationProperties(prefix = DruidConfiguration.DB_PREFIX)
@Configuration
class IDataSourceProperties {
    private String url;
    private String username;
    private String password;
    private String driverClassName;
    private int initialSize;
    private int minIdle;
    private int maxActive;
    private int maxWait;
    private int timeBetweenEvictionRunsMillis;
    private int minEvictableIdleTimeMillis;
    private String validationQuery;
    private boolean testWhileIdle;
    private boolean testOnBorrow;
    private boolean testOnReturn;
    private boolean poolPreparedStatements;
    private int maxPoolPreparedStatementPerConnectionSize;
    private String filters;
    private String connectionProperties;

    @Bean(name = "writeDataSource")      //声明其为Bean实例
    @Primary  //在同样的DataSource中，首先使用被标注的DataSource
    public DataSource dataSource() {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(url);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setDriverClassName(driverClassName);

        //configuration
        datasource.setInitialSize(initialSize);
        datasource.setMinIdle(minIdle);
        datasource.setMaxActive(maxActive);
        datasource.setMaxWait(maxWait);
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        datasource.setValidationQuery(validationQuery);
        datasource.setTestWhileIdle(testWhileIdle);
        datasource.setTestOnBorrow(testOnBorrow);
        datasource.setTestOnReturn(testOnReturn);
        datasource.setPoolPreparedStatements(poolPreparedStatements);
        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        try {
            datasource.setFilters(filters);
        } catch (SQLException e) {
            System.err.println("druid configuration initialization filter: " + e);
        }
        datasource.setConnectionProperties(connectionProperties);
        return datasource;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public int getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(int initialSize) {
        this.initialSize = initialSize;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public int getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(int maxWait) {
        this.maxWait = maxWait;
    }

    public int getTimeBetweenEvictionRunsMillis() {
        return timeBetweenEvictionRunsMillis;
    }

    public void setTimeBetweenEvictionRunsMillis(int timeBetweenEvictionRunsMillis) {
        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    }

    public int getMinEvictableIdleTimeMillis() {
        return minEvictableIdleTimeMillis;
    }

    public void setMinEvictableIdleTimeMillis(int minEvictableIdleTimeMillis) {
        this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
    }

    public String getValidationQuery() {
        return validationQuery;
    }

    public void setValidationQuery(String validationQuery) {
        this.validationQuery = validationQuery;
    }

    public boolean isTestWhileIdle() {
        return testWhileIdle;
    }

    public void setTestWhileIdle(boolean testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }

    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public boolean isTestOnReturn() {
        return testOnReturn;
    }

    public void setTestOnReturn(boolean testOnReturn) {
        this.testOnReturn = testOnReturn;
    }

    public boolean isPoolPreparedStatements() {
        return poolPreparedStatements;
    }

    public void setPoolPreparedStatements(boolean poolPreparedStatements) {
        this.poolPreparedStatements = poolPreparedStatements;
    }

    public int getMaxPoolPreparedStatementPerConnectionSize() {
        return maxPoolPreparedStatementPerConnectionSize;
    }

    public void setMaxPoolPreparedStatementPerConnectionSize(int maxPoolPreparedStatementPerConnectionSize) {
        this.maxPoolPreparedStatementPerConnectionSize = maxPoolPreparedStatementPerConnectionSize;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public String getConnectionProperties() {
        return connectionProperties;
    }

    public void setConnectionProperties(String connectionProperties) {
        this.connectionProperties = connectionProperties;
    }
}

class DataSourceContextHolder {


    //线程本地环境
    private static final ThreadLocal<String> local = new ThreadLocal<String>();

    public static ThreadLocal<String> getLocal() {
        return local;
    }

    /**
     * 读库
     */
    public static void setRead() {
        local.set(DataSourceType.read.getType());
    }

    /**
     * 写库
     */
    public static void setWrite() {
        local.set(DataSourceType.write.getType());
    }

    public static String getReadOrWrite() {
        return local.get();
    }

    public static void clear(){
        local.remove();
    }
}

enum DataSourceType {

    read("read", "从库"),
    write("write", "主库");

    private String type;

    private String name;

    DataSourceType(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
@AutoConfigureAfter(MybatisConfiguration.class)
@Aspect
@EnableAspectJAutoProxy(exposeProxy=true,proxyTargetClass=true)
@Component
class DataSourceAopInService implements PriorityOrdered{
    private final Logger logger = Logger.getLogger( getClass());


    @Before("execution(* com.shanyuan.platform.ms.core..*.*(..)) "
            + " && @annotation(org.springframework.transaction.annotation.Transactional) ")
    public void setReadDataSourceType() {
        logger.info("aopstart  core  set Write ");
        if(logger.isDebugEnabled()){
            logger.debug("aopstart  core  set Write ");
        }
        //如果已经开启写事务了，那之后的所有读都从写库读
        DataSourceContextHolder.setWrite();

    }

    @Before("execution(* com.shanyuan.platform.ms.facade..*.*(..)) "
            + " && @annotation(org.springframework.transaction.annotation.Transactional) ")
    public void setWriteDataSourceType() {

        logger.info("aopstart  facade  set write ");
        if(logger.isDebugEnabled()){
            logger.debug("aopstart  facade  set write ");
        }
        DataSourceContextHolder.setWrite();
    }

    @Before("execution(* com.shanyuan.platform.ms.dao..*.updat*(..))   "
            + " ||  execution(* com.shanyuan.platform.ms.dao..*.inser*(..))  "
            + " ||  execution(* com.shanyuan.platform.ms.dao..*.delet*(..))  "
    )
    public void setWriteDataSourceTypeDAO()
    {
        logger.info("aopstart   set write ");
        if(logger.isDebugEnabled()){
            logger.debug("aopstart   set write ");
        }

        DataSourceContextHolder.setWrite();
    }


    @Before("execution(* com.shanyuan.platform.ms.dao..*.select*(..))   "
            + " ||  execution(* com.shanyuan.platform.ms.dao..*.query*(..))  "
            + " ||  execution(* com.shanyuan.platform.ms.dao..*.count*(..))  "
            + " ||  execution(* com.shanyuan.platform.ms.dao..*.get*(..))  "
    )
    public void setReadDataSourceTypeDAO() {
        logger.info("aopstart   set read ");
        if(logger.isDebugEnabled()){
            logger.debug("aopstart   set read ");
        }
        DataSourceContextHolder.setRead();;
    }

    @Override
    public int getOrder() {
        /**
         * 值越小，越优先执行
         * 要优于事务的执行
         * 在启动类中加上了@EnableTransactionManagement(order = 10)
         */
        return 1;
    }

}
