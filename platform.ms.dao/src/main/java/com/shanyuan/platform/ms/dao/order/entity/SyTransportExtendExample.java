package com.shanyuan.platform.ms.dao.order.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyTransportExtendExample {
    /**
     * sy_transport_extend
     */
    protected String orderByClause;

    /**
     * sy_transport_extend
     */
    protected boolean distinct;

    /**
     * sy_transport_extend
     */
    protected List<Criteria> oredCriteria;

    public SyTransportExtendExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * sy_transport_extend 2017-10-16
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSnumIsNull() {
            addCriterion("snum is null");
            return (Criteria) this;
        }

        public Criteria andSnumIsNotNull() {
            addCriterion("snum is not null");
            return (Criteria) this;
        }

        public Criteria andSnumEqualTo(Integer value) {
            addCriterion("snum =", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumNotEqualTo(Integer value) {
            addCriterion("snum <>", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumGreaterThan(Integer value) {
            addCriterion("snum >", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("snum >=", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumLessThan(Integer value) {
            addCriterion("snum <", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumLessThanOrEqualTo(Integer value) {
            addCriterion("snum <=", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumIn(List<Integer> values) {
            addCriterion("snum in", values, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumNotIn(List<Integer> values) {
            addCriterion("snum not in", values, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumBetween(Integer value1, Integer value2) {
            addCriterion("snum between", value1, value2, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumNotBetween(Integer value1, Integer value2) {
            addCriterion("snum not between", value1, value2, "snum");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNull() {
            addCriterion("sprice is null");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNotNull() {
            addCriterion("sprice is not null");
            return (Criteria) this;
        }

        public Criteria andSpriceEqualTo(BigDecimal value) {
            addCriterion("sprice =", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotEqualTo(BigDecimal value) {
            addCriterion("sprice <>", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThan(BigDecimal value) {
            addCriterion("sprice >", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sprice >=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThan(BigDecimal value) {
            addCriterion("sprice <", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sprice <=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceIn(List<BigDecimal> values) {
            addCriterion("sprice in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotIn(List<BigDecimal> values) {
            addCriterion("sprice not in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sprice between", value1, value2, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sprice not between", value1, value2, "sprice");
            return (Criteria) this;
        }

        public Criteria andXnumIsNull() {
            addCriterion("xnum is null");
            return (Criteria) this;
        }

        public Criteria andXnumIsNotNull() {
            addCriterion("xnum is not null");
            return (Criteria) this;
        }

        public Criteria andXnumEqualTo(Integer value) {
            addCriterion("xnum =", value, "xnum");
            return (Criteria) this;
        }

        public Criteria andXnumNotEqualTo(Integer value) {
            addCriterion("xnum <>", value, "xnum");
            return (Criteria) this;
        }

        public Criteria andXnumGreaterThan(Integer value) {
            addCriterion("xnum >", value, "xnum");
            return (Criteria) this;
        }

        public Criteria andXnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("xnum >=", value, "xnum");
            return (Criteria) this;
        }

        public Criteria andXnumLessThan(Integer value) {
            addCriterion("xnum <", value, "xnum");
            return (Criteria) this;
        }

        public Criteria andXnumLessThanOrEqualTo(Integer value) {
            addCriterion("xnum <=", value, "xnum");
            return (Criteria) this;
        }

        public Criteria andXnumIn(List<Integer> values) {
            addCriterion("xnum in", values, "xnum");
            return (Criteria) this;
        }

        public Criteria andXnumNotIn(List<Integer> values) {
            addCriterion("xnum not in", values, "xnum");
            return (Criteria) this;
        }

        public Criteria andXnumBetween(Integer value1, Integer value2) {
            addCriterion("xnum between", value1, value2, "xnum");
            return (Criteria) this;
        }

        public Criteria andXnumNotBetween(Integer value1, Integer value2) {
            addCriterion("xnum not between", value1, value2, "xnum");
            return (Criteria) this;
        }

        public Criteria andXpriceIsNull() {
            addCriterion("xprice is null");
            return (Criteria) this;
        }

        public Criteria andXpriceIsNotNull() {
            addCriterion("xprice is not null");
            return (Criteria) this;
        }

        public Criteria andXpriceEqualTo(BigDecimal value) {
            addCriterion("xprice =", value, "xprice");
            return (Criteria) this;
        }

        public Criteria andXpriceNotEqualTo(BigDecimal value) {
            addCriterion("xprice <>", value, "xprice");
            return (Criteria) this;
        }

        public Criteria andXpriceGreaterThan(BigDecimal value) {
            addCriterion("xprice >", value, "xprice");
            return (Criteria) this;
        }

        public Criteria andXpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("xprice >=", value, "xprice");
            return (Criteria) this;
        }

        public Criteria andXpriceLessThan(BigDecimal value) {
            addCriterion("xprice <", value, "xprice");
            return (Criteria) this;
        }

        public Criteria andXpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("xprice <=", value, "xprice");
            return (Criteria) this;
        }

        public Criteria andXpriceIn(List<BigDecimal> values) {
            addCriterion("xprice in", values, "xprice");
            return (Criteria) this;
        }

        public Criteria andXpriceNotIn(List<BigDecimal> values) {
            addCriterion("xprice not in", values, "xprice");
            return (Criteria) this;
        }

        public Criteria andXpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("xprice between", value1, value2, "xprice");
            return (Criteria) this;
        }

        public Criteria andXpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("xprice not between", value1, value2, "xprice");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(String value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(String value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(String value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(String value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(String value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLike(String value) {
            addCriterion("is_default like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotLike(String value) {
            addCriterion("is_default not like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<String> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<String> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(String value1, String value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(String value1, String value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andTransportIdIsNull() {
            addCriterion("transport_id is null");
            return (Criteria) this;
        }

        public Criteria andTransportIdIsNotNull() {
            addCriterion("transport_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransportIdEqualTo(Integer value) {
            addCriterion("transport_id =", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdNotEqualTo(Integer value) {
            addCriterion("transport_id <>", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdGreaterThan(Integer value) {
            addCriterion("transport_id >", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("transport_id >=", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdLessThan(Integer value) {
            addCriterion("transport_id <", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdLessThanOrEqualTo(Integer value) {
            addCriterion("transport_id <=", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdIn(List<Integer> values) {
            addCriterion("transport_id in", values, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdNotIn(List<Integer> values) {
            addCriterion("transport_id not in", values, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdBetween(Integer value1, Integer value2) {
            addCriterion("transport_id between", value1, value2, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdNotBetween(Integer value1, Integer value2) {
            addCriterion("transport_id not between", value1, value2, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportTitleIsNull() {
            addCriterion("transport_title is null");
            return (Criteria) this;
        }

        public Criteria andTransportTitleIsNotNull() {
            addCriterion("transport_title is not null");
            return (Criteria) this;
        }

        public Criteria andTransportTitleEqualTo(String value) {
            addCriterion("transport_title =", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleNotEqualTo(String value) {
            addCriterion("transport_title <>", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleGreaterThan(String value) {
            addCriterion("transport_title >", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleGreaterThanOrEqualTo(String value) {
            addCriterion("transport_title >=", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleLessThan(String value) {
            addCriterion("transport_title <", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleLessThanOrEqualTo(String value) {
            addCriterion("transport_title <=", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleLike(String value) {
            addCriterion("transport_title like", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleNotLike(String value) {
            addCriterion("transport_title not like", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleIn(List<String> values) {
            addCriterion("transport_title in", values, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleNotIn(List<String> values) {
            addCriterion("transport_title not in", values, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleBetween(String value1, String value2) {
            addCriterion("transport_title between", value1, value2, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleNotBetween(String value1, String value2) {
            addCriterion("transport_title not between", value1, value2, "transportTitle");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_transport_extend表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2017-10-16
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_transport_extend 2017-10-16
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}