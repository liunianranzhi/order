package com.shanyuan.platform.ms.dao.goods.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyPlatformStatsExample {
    /**
     * sy_platform_stats
     */
    protected String orderByClause;

    /**
     * sy_platform_stats
     */
    protected boolean distinct;

    /**
     * sy_platform_stats
     */
    protected List<Criteria> oredCriteria;

    public SyPlatformStatsExample() {
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
     * sy_platform_stats 2017-11-07
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

        public Criteria andRecIdIsNull() {
            addCriterion("rec_id is null");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNotNull() {
            addCriterion("rec_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecIdEqualTo(Integer value) {
            addCriterion("rec_id =", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotEqualTo(Integer value) {
            addCriterion("rec_id <>", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThan(Integer value) {
            addCriterion("rec_id >", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_id >=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThan(Integer value) {
            addCriterion("rec_id <", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThanOrEqualTo(Integer value) {
            addCriterion("rec_id <=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdIn(List<Integer> values) {
            addCriterion("rec_id in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotIn(List<Integer> values) {
            addCriterion("rec_id not in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdBetween(Integer value1, Integer value2) {
            addCriterion("rec_id between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_id not between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateIsNull() {
            addCriterion("latest_refund_rate is null");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateIsNotNull() {
            addCriterion("latest_refund_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateEqualTo(BigDecimal value) {
            addCriterion("latest_refund_rate =", value, "latestRefundRate");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateNotEqualTo(BigDecimal value) {
            addCriterion("latest_refund_rate <>", value, "latestRefundRate");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateGreaterThan(BigDecimal value) {
            addCriterion("latest_refund_rate >", value, "latestRefundRate");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latest_refund_rate >=", value, "latestRefundRate");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateLessThan(BigDecimal value) {
            addCriterion("latest_refund_rate <", value, "latestRefundRate");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latest_refund_rate <=", value, "latestRefundRate");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateIn(List<BigDecimal> values) {
            addCriterion("latest_refund_rate in", values, "latestRefundRate");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateNotIn(List<BigDecimal> values) {
            addCriterion("latest_refund_rate not in", values, "latestRefundRate");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latest_refund_rate between", value1, value2, "latestRefundRate");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latest_refund_rate not between", value1, value2, "latestRefundRate");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateIsNull() {
            addCriterion("latest_complain_rate is null");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateIsNotNull() {
            addCriterion("latest_complain_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateEqualTo(BigDecimal value) {
            addCriterion("latest_complain_rate =", value, "latestComplainRate");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateNotEqualTo(BigDecimal value) {
            addCriterion("latest_complain_rate <>", value, "latestComplainRate");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateGreaterThan(BigDecimal value) {
            addCriterion("latest_complain_rate >", value, "latestComplainRate");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latest_complain_rate >=", value, "latestComplainRate");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateLessThan(BigDecimal value) {
            addCriterion("latest_complain_rate <", value, "latestComplainRate");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latest_complain_rate <=", value, "latestComplainRate");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateIn(List<BigDecimal> values) {
            addCriterion("latest_complain_rate in", values, "latestComplainRate");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateNotIn(List<BigDecimal> values) {
            addCriterion("latest_complain_rate not in", values, "latestComplainRate");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latest_complain_rate between", value1, value2, "latestComplainRate");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latest_complain_rate not between", value1, value2, "latestComplainRate");
            return (Criteria) this;
        }

        public Criteria andStatsTimeIsNull() {
            addCriterion("stats_time is null");
            return (Criteria) this;
        }

        public Criteria andStatsTimeIsNotNull() {
            addCriterion("stats_time is not null");
            return (Criteria) this;
        }

        public Criteria andStatsTimeEqualTo(Integer value) {
            addCriterion("stats_time =", value, "statsTime");
            return (Criteria) this;
        }

        public Criteria andStatsTimeNotEqualTo(Integer value) {
            addCriterion("stats_time <>", value, "statsTime");
            return (Criteria) this;
        }

        public Criteria andStatsTimeGreaterThan(Integer value) {
            addCriterion("stats_time >", value, "statsTime");
            return (Criteria) this;
        }

        public Criteria andStatsTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stats_time >=", value, "statsTime");
            return (Criteria) this;
        }

        public Criteria andStatsTimeLessThan(Integer value) {
            addCriterion("stats_time <", value, "statsTime");
            return (Criteria) this;
        }

        public Criteria andStatsTimeLessThanOrEqualTo(Integer value) {
            addCriterion("stats_time <=", value, "statsTime");
            return (Criteria) this;
        }

        public Criteria andStatsTimeIn(List<Integer> values) {
            addCriterion("stats_time in", values, "statsTime");
            return (Criteria) this;
        }

        public Criteria andStatsTimeNotIn(List<Integer> values) {
            addCriterion("stats_time not in", values, "statsTime");
            return (Criteria) this;
        }

        public Criteria andStatsTimeBetween(Integer value1, Integer value2) {
            addCriterion("stats_time between", value1, value2, "statsTime");
            return (Criteria) this;
        }

        public Criteria andStatsTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("stats_time not between", value1, value2, "statsTime");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedIsNull() {
            addCriterion("latest_send_speed is null");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedIsNotNull() {
            addCriterion("latest_send_speed is not null");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedEqualTo(BigDecimal value) {
            addCriterion("latest_send_speed =", value, "latestSendSpeed");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedNotEqualTo(BigDecimal value) {
            addCriterion("latest_send_speed <>", value, "latestSendSpeed");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedGreaterThan(BigDecimal value) {
            addCriterion("latest_send_speed >", value, "latestSendSpeed");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latest_send_speed >=", value, "latestSendSpeed");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedLessThan(BigDecimal value) {
            addCriterion("latest_send_speed <", value, "latestSendSpeed");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latest_send_speed <=", value, "latestSendSpeed");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedIn(List<BigDecimal> values) {
            addCriterion("latest_send_speed in", values, "latestSendSpeed");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedNotIn(List<BigDecimal> values) {
            addCriterion("latest_send_speed not in", values, "latestSendSpeed");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latest_send_speed between", value1, value2, "latestSendSpeed");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latest_send_speed not between", value1, value2, "latestSendSpeed");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderAmountIsNull() {
            addCriterion("daai_order_amount is null");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderAmountIsNotNull() {
            addCriterion("daai_order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderAmountEqualTo(BigDecimal value) {
            addCriterion("daai_order_amount =", value, "daaiOrderAmount");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("daai_order_amount <>", value, "daaiOrderAmount");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("daai_order_amount >", value, "daaiOrderAmount");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("daai_order_amount >=", value, "daaiOrderAmount");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderAmountLessThan(BigDecimal value) {
            addCriterion("daai_order_amount <", value, "daaiOrderAmount");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("daai_order_amount <=", value, "daaiOrderAmount");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderAmountIn(List<BigDecimal> values) {
            addCriterion("daai_order_amount in", values, "daaiOrderAmount");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("daai_order_amount not in", values, "daaiOrderAmount");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("daai_order_amount between", value1, value2, "daaiOrderAmount");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("daai_order_amount not between", value1, value2, "daaiOrderAmount");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderCountIsNull() {
            addCriterion("daai_order_count is null");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderCountIsNotNull() {
            addCriterion("daai_order_count is not null");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderCountEqualTo(Integer value) {
            addCriterion("daai_order_count =", value, "daaiOrderCount");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderCountNotEqualTo(Integer value) {
            addCriterion("daai_order_count <>", value, "daaiOrderCount");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderCountGreaterThan(Integer value) {
            addCriterion("daai_order_count >", value, "daaiOrderCount");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("daai_order_count >=", value, "daaiOrderCount");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderCountLessThan(Integer value) {
            addCriterion("daai_order_count <", value, "daaiOrderCount");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderCountLessThanOrEqualTo(Integer value) {
            addCriterion("daai_order_count <=", value, "daaiOrderCount");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderCountIn(List<Integer> values) {
            addCriterion("daai_order_count in", values, "daaiOrderCount");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderCountNotIn(List<Integer> values) {
            addCriterion("daai_order_count not in", values, "daaiOrderCount");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderCountBetween(Integer value1, Integer value2) {
            addCriterion("daai_order_count between", value1, value2, "daaiOrderCount");
            return (Criteria) this;
        }

        public Criteria andDaaiOrderCountNotBetween(Integer value1, Integer value2) {
            addCriterion("daai_order_count not between", value1, value2, "daaiOrderCount");
            return (Criteria) this;
        }

        public Criteria andDaaiRefundCountIsNull() {
            addCriterion("daai_refund_count is null");
            return (Criteria) this;
        }

        public Criteria andDaaiRefundCountIsNotNull() {
            addCriterion("daai_refund_count is not null");
            return (Criteria) this;
        }

        public Criteria andDaaiRefundCountEqualTo(Integer value) {
            addCriterion("daai_refund_count =", value, "daaiRefundCount");
            return (Criteria) this;
        }

        public Criteria andDaaiRefundCountNotEqualTo(Integer value) {
            addCriterion("daai_refund_count <>", value, "daaiRefundCount");
            return (Criteria) this;
        }

        public Criteria andDaaiRefundCountGreaterThan(Integer value) {
            addCriterion("daai_refund_count >", value, "daaiRefundCount");
            return (Criteria) this;
        }

        public Criteria andDaaiRefundCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("daai_refund_count >=", value, "daaiRefundCount");
            return (Criteria) this;
        }

        public Criteria andDaaiRefundCountLessThan(Integer value) {
            addCriterion("daai_refund_count <", value, "daaiRefundCount");
            return (Criteria) this;
        }

        public Criteria andDaaiRefundCountLessThanOrEqualTo(Integer value) {
            addCriterion("daai_refund_count <=", value, "daaiRefundCount");
            return (Criteria) this;
        }

        public Criteria andDaaiRefundCountIn(List<Integer> values) {
            addCriterion("daai_refund_count in", values, "daaiRefundCount");
            return (Criteria) this;
        }

        public Criteria andDaaiRefundCountNotIn(List<Integer> values) {
            addCriterion("daai_refund_count not in", values, "daaiRefundCount");
            return (Criteria) this;
        }

        public Criteria andDaaiRefundCountBetween(Integer value1, Integer value2) {
            addCriterion("daai_refund_count between", value1, value2, "daaiRefundCount");
            return (Criteria) this;
        }

        public Criteria andDaaiRefundCountNotBetween(Integer value1, Integer value2) {
            addCriterion("daai_refund_count not between", value1, value2, "daaiRefundCount");
            return (Criteria) this;
        }

        public Criteria andDaaiComplainCountIsNull() {
            addCriterion("daai_complain_count is null");
            return (Criteria) this;
        }

        public Criteria andDaaiComplainCountIsNotNull() {
            addCriterion("daai_complain_count is not null");
            return (Criteria) this;
        }

        public Criteria andDaaiComplainCountEqualTo(Integer value) {
            addCriterion("daai_complain_count =", value, "daaiComplainCount");
            return (Criteria) this;
        }

        public Criteria andDaaiComplainCountNotEqualTo(Integer value) {
            addCriterion("daai_complain_count <>", value, "daaiComplainCount");
            return (Criteria) this;
        }

        public Criteria andDaaiComplainCountGreaterThan(Integer value) {
            addCriterion("daai_complain_count >", value, "daaiComplainCount");
            return (Criteria) this;
        }

        public Criteria andDaaiComplainCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("daai_complain_count >=", value, "daaiComplainCount");
            return (Criteria) this;
        }

        public Criteria andDaaiComplainCountLessThan(Integer value) {
            addCriterion("daai_complain_count <", value, "daaiComplainCount");
            return (Criteria) this;
        }

        public Criteria andDaaiComplainCountLessThanOrEqualTo(Integer value) {
            addCriterion("daai_complain_count <=", value, "daaiComplainCount");
            return (Criteria) this;
        }

        public Criteria andDaaiComplainCountIn(List<Integer> values) {
            addCriterion("daai_complain_count in", values, "daaiComplainCount");
            return (Criteria) this;
        }

        public Criteria andDaaiComplainCountNotIn(List<Integer> values) {
            addCriterion("daai_complain_count not in", values, "daaiComplainCount");
            return (Criteria) this;
        }

        public Criteria andDaaiComplainCountBetween(Integer value1, Integer value2) {
            addCriterion("daai_complain_count between", value1, value2, "daaiComplainCount");
            return (Criteria) this;
        }

        public Criteria andDaaiComplainCountNotBetween(Integer value1, Integer value2) {
            addCriterion("daai_complain_count not between", value1, value2, "daaiComplainCount");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderAmountIsNull() {
            addCriterion("jicai_order_amount is null");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderAmountIsNotNull() {
            addCriterion("jicai_order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderAmountEqualTo(BigDecimal value) {
            addCriterion("jicai_order_amount =", value, "jicaiOrderAmount");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("jicai_order_amount <>", value, "jicaiOrderAmount");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("jicai_order_amount >", value, "jicaiOrderAmount");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("jicai_order_amount >=", value, "jicaiOrderAmount");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderAmountLessThan(BigDecimal value) {
            addCriterion("jicai_order_amount <", value, "jicaiOrderAmount");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("jicai_order_amount <=", value, "jicaiOrderAmount");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderAmountIn(List<BigDecimal> values) {
            addCriterion("jicai_order_amount in", values, "jicaiOrderAmount");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("jicai_order_amount not in", values, "jicaiOrderAmount");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jicai_order_amount between", value1, value2, "jicaiOrderAmount");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jicai_order_amount not between", value1, value2, "jicaiOrderAmount");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderCountIsNull() {
            addCriterion("jicai_order_count is null");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderCountIsNotNull() {
            addCriterion("jicai_order_count is not null");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderCountEqualTo(Integer value) {
            addCriterion("jicai_order_count =", value, "jicaiOrderCount");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderCountNotEqualTo(Integer value) {
            addCriterion("jicai_order_count <>", value, "jicaiOrderCount");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderCountGreaterThan(Integer value) {
            addCriterion("jicai_order_count >", value, "jicaiOrderCount");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("jicai_order_count >=", value, "jicaiOrderCount");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderCountLessThan(Integer value) {
            addCriterion("jicai_order_count <", value, "jicaiOrderCount");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderCountLessThanOrEqualTo(Integer value) {
            addCriterion("jicai_order_count <=", value, "jicaiOrderCount");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderCountIn(List<Integer> values) {
            addCriterion("jicai_order_count in", values, "jicaiOrderCount");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderCountNotIn(List<Integer> values) {
            addCriterion("jicai_order_count not in", values, "jicaiOrderCount");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderCountBetween(Integer value1, Integer value2) {
            addCriterion("jicai_order_count between", value1, value2, "jicaiOrderCount");
            return (Criteria) this;
        }

        public Criteria andJicaiOrderCountNotBetween(Integer value1, Integer value2) {
            addCriterion("jicai_order_count not between", value1, value2, "jicaiOrderCount");
            return (Criteria) this;
        }

        public Criteria andJicaiRefundCountIsNull() {
            addCriterion("jicai_refund_count is null");
            return (Criteria) this;
        }

        public Criteria andJicaiRefundCountIsNotNull() {
            addCriterion("jicai_refund_count is not null");
            return (Criteria) this;
        }

        public Criteria andJicaiRefundCountEqualTo(Integer value) {
            addCriterion("jicai_refund_count =", value, "jicaiRefundCount");
            return (Criteria) this;
        }

        public Criteria andJicaiRefundCountNotEqualTo(Integer value) {
            addCriterion("jicai_refund_count <>", value, "jicaiRefundCount");
            return (Criteria) this;
        }

        public Criteria andJicaiRefundCountGreaterThan(Integer value) {
            addCriterion("jicai_refund_count >", value, "jicaiRefundCount");
            return (Criteria) this;
        }

        public Criteria andJicaiRefundCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("jicai_refund_count >=", value, "jicaiRefundCount");
            return (Criteria) this;
        }

        public Criteria andJicaiRefundCountLessThan(Integer value) {
            addCriterion("jicai_refund_count <", value, "jicaiRefundCount");
            return (Criteria) this;
        }

        public Criteria andJicaiRefundCountLessThanOrEqualTo(Integer value) {
            addCriterion("jicai_refund_count <=", value, "jicaiRefundCount");
            return (Criteria) this;
        }

        public Criteria andJicaiRefundCountIn(List<Integer> values) {
            addCriterion("jicai_refund_count in", values, "jicaiRefundCount");
            return (Criteria) this;
        }

        public Criteria andJicaiRefundCountNotIn(List<Integer> values) {
            addCriterion("jicai_refund_count not in", values, "jicaiRefundCount");
            return (Criteria) this;
        }

        public Criteria andJicaiRefundCountBetween(Integer value1, Integer value2) {
            addCriterion("jicai_refund_count between", value1, value2, "jicaiRefundCount");
            return (Criteria) this;
        }

        public Criteria andJicaiRefundCountNotBetween(Integer value1, Integer value2) {
            addCriterion("jicai_refund_count not between", value1, value2, "jicaiRefundCount");
            return (Criteria) this;
        }

        public Criteria andJicaiComplainCountIsNull() {
            addCriterion("jicai_complain_count is null");
            return (Criteria) this;
        }

        public Criteria andJicaiComplainCountIsNotNull() {
            addCriterion("jicai_complain_count is not null");
            return (Criteria) this;
        }

        public Criteria andJicaiComplainCountEqualTo(Integer value) {
            addCriterion("jicai_complain_count =", value, "jicaiComplainCount");
            return (Criteria) this;
        }

        public Criteria andJicaiComplainCountNotEqualTo(Integer value) {
            addCriterion("jicai_complain_count <>", value, "jicaiComplainCount");
            return (Criteria) this;
        }

        public Criteria andJicaiComplainCountGreaterThan(Integer value) {
            addCriterion("jicai_complain_count >", value, "jicaiComplainCount");
            return (Criteria) this;
        }

        public Criteria andJicaiComplainCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("jicai_complain_count >=", value, "jicaiComplainCount");
            return (Criteria) this;
        }

        public Criteria andJicaiComplainCountLessThan(Integer value) {
            addCriterion("jicai_complain_count <", value, "jicaiComplainCount");
            return (Criteria) this;
        }

        public Criteria andJicaiComplainCountLessThanOrEqualTo(Integer value) {
            addCriterion("jicai_complain_count <=", value, "jicaiComplainCount");
            return (Criteria) this;
        }

        public Criteria andJicaiComplainCountIn(List<Integer> values) {
            addCriterion("jicai_complain_count in", values, "jicaiComplainCount");
            return (Criteria) this;
        }

        public Criteria andJicaiComplainCountNotIn(List<Integer> values) {
            addCriterion("jicai_complain_count not in", values, "jicaiComplainCount");
            return (Criteria) this;
        }

        public Criteria andJicaiComplainCountBetween(Integer value1, Integer value2) {
            addCriterion("jicai_complain_count between", value1, value2, "jicaiComplainCount");
            return (Criteria) this;
        }

        public Criteria andJicaiComplainCountNotBetween(Integer value1, Integer value2) {
            addCriterion("jicai_complain_count not between", value1, value2, "jicaiComplainCount");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderAmountIsNull() {
            addCriterion("syshop_order_amount is null");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderAmountIsNotNull() {
            addCriterion("syshop_order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderAmountEqualTo(BigDecimal value) {
            addCriterion("syshop_order_amount =", value, "syshopOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("syshop_order_amount <>", value, "syshopOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("syshop_order_amount >", value, "syshopOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("syshop_order_amount >=", value, "syshopOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderAmountLessThan(BigDecimal value) {
            addCriterion("syshop_order_amount <", value, "syshopOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("syshop_order_amount <=", value, "syshopOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderAmountIn(List<BigDecimal> values) {
            addCriterion("syshop_order_amount in", values, "syshopOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("syshop_order_amount not in", values, "syshopOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("syshop_order_amount between", value1, value2, "syshopOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("syshop_order_amount not between", value1, value2, "syshopOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderCountIsNull() {
            addCriterion("syshop_order_count is null");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderCountIsNotNull() {
            addCriterion("syshop_order_count is not null");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderCountEqualTo(Integer value) {
            addCriterion("syshop_order_count =", value, "syshopOrderCount");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderCountNotEqualTo(Integer value) {
            addCriterion("syshop_order_count <>", value, "syshopOrderCount");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderCountGreaterThan(Integer value) {
            addCriterion("syshop_order_count >", value, "syshopOrderCount");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("syshop_order_count >=", value, "syshopOrderCount");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderCountLessThan(Integer value) {
            addCriterion("syshop_order_count <", value, "syshopOrderCount");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderCountLessThanOrEqualTo(Integer value) {
            addCriterion("syshop_order_count <=", value, "syshopOrderCount");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderCountIn(List<Integer> values) {
            addCriterion("syshop_order_count in", values, "syshopOrderCount");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderCountNotIn(List<Integer> values) {
            addCriterion("syshop_order_count not in", values, "syshopOrderCount");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderCountBetween(Integer value1, Integer value2) {
            addCriterion("syshop_order_count between", value1, value2, "syshopOrderCount");
            return (Criteria) this;
        }

        public Criteria andSyshopOrderCountNotBetween(Integer value1, Integer value2) {
            addCriterion("syshop_order_count not between", value1, value2, "syshopOrderCount");
            return (Criteria) this;
        }

        public Criteria andSyshopRefundCountIsNull() {
            addCriterion("syshop_refund_count is null");
            return (Criteria) this;
        }

        public Criteria andSyshopRefundCountIsNotNull() {
            addCriterion("syshop_refund_count is not null");
            return (Criteria) this;
        }

        public Criteria andSyshopRefundCountEqualTo(Integer value) {
            addCriterion("syshop_refund_count =", value, "syshopRefundCount");
            return (Criteria) this;
        }

        public Criteria andSyshopRefundCountNotEqualTo(Integer value) {
            addCriterion("syshop_refund_count <>", value, "syshopRefundCount");
            return (Criteria) this;
        }

        public Criteria andSyshopRefundCountGreaterThan(Integer value) {
            addCriterion("syshop_refund_count >", value, "syshopRefundCount");
            return (Criteria) this;
        }

        public Criteria andSyshopRefundCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("syshop_refund_count >=", value, "syshopRefundCount");
            return (Criteria) this;
        }

        public Criteria andSyshopRefundCountLessThan(Integer value) {
            addCriterion("syshop_refund_count <", value, "syshopRefundCount");
            return (Criteria) this;
        }

        public Criteria andSyshopRefundCountLessThanOrEqualTo(Integer value) {
            addCriterion("syshop_refund_count <=", value, "syshopRefundCount");
            return (Criteria) this;
        }

        public Criteria andSyshopRefundCountIn(List<Integer> values) {
            addCriterion("syshop_refund_count in", values, "syshopRefundCount");
            return (Criteria) this;
        }

        public Criteria andSyshopRefundCountNotIn(List<Integer> values) {
            addCriterion("syshop_refund_count not in", values, "syshopRefundCount");
            return (Criteria) this;
        }

        public Criteria andSyshopRefundCountBetween(Integer value1, Integer value2) {
            addCriterion("syshop_refund_count between", value1, value2, "syshopRefundCount");
            return (Criteria) this;
        }

        public Criteria andSyshopRefundCountNotBetween(Integer value1, Integer value2) {
            addCriterion("syshop_refund_count not between", value1, value2, "syshopRefundCount");
            return (Criteria) this;
        }

        public Criteria andSyshopComplainCountIsNull() {
            addCriterion("syshop_complain_count is null");
            return (Criteria) this;
        }

        public Criteria andSyshopComplainCountIsNotNull() {
            addCriterion("syshop_complain_count is not null");
            return (Criteria) this;
        }

        public Criteria andSyshopComplainCountEqualTo(Integer value) {
            addCriterion("syshop_complain_count =", value, "syshopComplainCount");
            return (Criteria) this;
        }

        public Criteria andSyshopComplainCountNotEqualTo(Integer value) {
            addCriterion("syshop_complain_count <>", value, "syshopComplainCount");
            return (Criteria) this;
        }

        public Criteria andSyshopComplainCountGreaterThan(Integer value) {
            addCriterion("syshop_complain_count >", value, "syshopComplainCount");
            return (Criteria) this;
        }

        public Criteria andSyshopComplainCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("syshop_complain_count >=", value, "syshopComplainCount");
            return (Criteria) this;
        }

        public Criteria andSyshopComplainCountLessThan(Integer value) {
            addCriterion("syshop_complain_count <", value, "syshopComplainCount");
            return (Criteria) this;
        }

        public Criteria andSyshopComplainCountLessThanOrEqualTo(Integer value) {
            addCriterion("syshop_complain_count <=", value, "syshopComplainCount");
            return (Criteria) this;
        }

        public Criteria andSyshopComplainCountIn(List<Integer> values) {
            addCriterion("syshop_complain_count in", values, "syshopComplainCount");
            return (Criteria) this;
        }

        public Criteria andSyshopComplainCountNotIn(List<Integer> values) {
            addCriterion("syshop_complain_count not in", values, "syshopComplainCount");
            return (Criteria) this;
        }

        public Criteria andSyshopComplainCountBetween(Integer value1, Integer value2) {
            addCriterion("syshop_complain_count between", value1, value2, "syshopComplainCount");
            return (Criteria) this;
        }

        public Criteria andSyshopComplainCountNotBetween(Integer value1, Integer value2) {
            addCriterion("syshop_complain_count not between", value1, value2, "syshopComplainCount");
            return (Criteria) this;
        }

        public Criteria andIncreaseMemberCountIsNull() {
            addCriterion("increase_member_count is null");
            return (Criteria) this;
        }

        public Criteria andIncreaseMemberCountIsNotNull() {
            addCriterion("increase_member_count is not null");
            return (Criteria) this;
        }

        public Criteria andIncreaseMemberCountEqualTo(Integer value) {
            addCriterion("increase_member_count =", value, "increaseMemberCount");
            return (Criteria) this;
        }

        public Criteria andIncreaseMemberCountNotEqualTo(Integer value) {
            addCriterion("increase_member_count <>", value, "increaseMemberCount");
            return (Criteria) this;
        }

        public Criteria andIncreaseMemberCountGreaterThan(Integer value) {
            addCriterion("increase_member_count >", value, "increaseMemberCount");
            return (Criteria) this;
        }

        public Criteria andIncreaseMemberCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("increase_member_count >=", value, "increaseMemberCount");
            return (Criteria) this;
        }

        public Criteria andIncreaseMemberCountLessThan(Integer value) {
            addCriterion("increase_member_count <", value, "increaseMemberCount");
            return (Criteria) this;
        }

        public Criteria andIncreaseMemberCountLessThanOrEqualTo(Integer value) {
            addCriterion("increase_member_count <=", value, "increaseMemberCount");
            return (Criteria) this;
        }

        public Criteria andIncreaseMemberCountIn(List<Integer> values) {
            addCriterion("increase_member_count in", values, "increaseMemberCount");
            return (Criteria) this;
        }

        public Criteria andIncreaseMemberCountNotIn(List<Integer> values) {
            addCriterion("increase_member_count not in", values, "increaseMemberCount");
            return (Criteria) this;
        }

        public Criteria andIncreaseMemberCountBetween(Integer value1, Integer value2) {
            addCriterion("increase_member_count between", value1, value2, "increaseMemberCount");
            return (Criteria) this;
        }

        public Criteria andIncreaseMemberCountNotBetween(Integer value1, Integer value2) {
            addCriterion("increase_member_count not between", value1, value2, "increaseMemberCount");
            return (Criteria) this;
        }

        public Criteria andIncreaseInviteMemberCountIsNull() {
            addCriterion("increase_invite_member_count is null");
            return (Criteria) this;
        }

        public Criteria andIncreaseInviteMemberCountIsNotNull() {
            addCriterion("increase_invite_member_count is not null");
            return (Criteria) this;
        }

        public Criteria andIncreaseInviteMemberCountEqualTo(Integer value) {
            addCriterion("increase_invite_member_count =", value, "increaseInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andIncreaseInviteMemberCountNotEqualTo(Integer value) {
            addCriterion("increase_invite_member_count <>", value, "increaseInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andIncreaseInviteMemberCountGreaterThan(Integer value) {
            addCriterion("increase_invite_member_count >", value, "increaseInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andIncreaseInviteMemberCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("increase_invite_member_count >=", value, "increaseInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andIncreaseInviteMemberCountLessThan(Integer value) {
            addCriterion("increase_invite_member_count <", value, "increaseInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andIncreaseInviteMemberCountLessThanOrEqualTo(Integer value) {
            addCriterion("increase_invite_member_count <=", value, "increaseInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andIncreaseInviteMemberCountIn(List<Integer> values) {
            addCriterion("increase_invite_member_count in", values, "increaseInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andIncreaseInviteMemberCountNotIn(List<Integer> values) {
            addCriterion("increase_invite_member_count not in", values, "increaseInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andIncreaseInviteMemberCountBetween(Integer value1, Integer value2) {
            addCriterion("increase_invite_member_count between", value1, value2, "increaseInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andIncreaseInviteMemberCountNotBetween(Integer value1, Integer value2) {
            addCriterion("increase_invite_member_count not between", value1, value2, "increaseInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andMemberCountIsNull() {
            addCriterion("member_count is null");
            return (Criteria) this;
        }

        public Criteria andMemberCountIsNotNull() {
            addCriterion("member_count is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCountEqualTo(Integer value) {
            addCriterion("member_count =", value, "memberCount");
            return (Criteria) this;
        }

        public Criteria andMemberCountNotEqualTo(Integer value) {
            addCriterion("member_count <>", value, "memberCount");
            return (Criteria) this;
        }

        public Criteria andMemberCountGreaterThan(Integer value) {
            addCriterion("member_count >", value, "memberCount");
            return (Criteria) this;
        }

        public Criteria andMemberCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_count >=", value, "memberCount");
            return (Criteria) this;
        }

        public Criteria andMemberCountLessThan(Integer value) {
            addCriterion("member_count <", value, "memberCount");
            return (Criteria) this;
        }

        public Criteria andMemberCountLessThanOrEqualTo(Integer value) {
            addCriterion("member_count <=", value, "memberCount");
            return (Criteria) this;
        }

        public Criteria andMemberCountIn(List<Integer> values) {
            addCriterion("member_count in", values, "memberCount");
            return (Criteria) this;
        }

        public Criteria andMemberCountNotIn(List<Integer> values) {
            addCriterion("member_count not in", values, "memberCount");
            return (Criteria) this;
        }

        public Criteria andMemberCountBetween(Integer value1, Integer value2) {
            addCriterion("member_count between", value1, value2, "memberCount");
            return (Criteria) this;
        }

        public Criteria andMemberCountNotBetween(Integer value1, Integer value2) {
            addCriterion("member_count not between", value1, value2, "memberCount");
            return (Criteria) this;
        }

        public Criteria andInviteMemberCountIsNull() {
            addCriterion("invite_member_count is null");
            return (Criteria) this;
        }

        public Criteria andInviteMemberCountIsNotNull() {
            addCriterion("invite_member_count is not null");
            return (Criteria) this;
        }

        public Criteria andInviteMemberCountEqualTo(Integer value) {
            addCriterion("invite_member_count =", value, "inviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andInviteMemberCountNotEqualTo(Integer value) {
            addCriterion("invite_member_count <>", value, "inviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andInviteMemberCountGreaterThan(Integer value) {
            addCriterion("invite_member_count >", value, "inviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andInviteMemberCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("invite_member_count >=", value, "inviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andInviteMemberCountLessThan(Integer value) {
            addCriterion("invite_member_count <", value, "inviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andInviteMemberCountLessThanOrEqualTo(Integer value) {
            addCriterion("invite_member_count <=", value, "inviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andInviteMemberCountIn(List<Integer> values) {
            addCriterion("invite_member_count in", values, "inviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andInviteMemberCountNotIn(List<Integer> values) {
            addCriterion("invite_member_count not in", values, "inviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andInviteMemberCountBetween(Integer value1, Integer value2) {
            addCriterion("invite_member_count between", value1, value2, "inviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andInviteMemberCountNotBetween(Integer value1, Integer value2) {
            addCriterion("invite_member_count not between", value1, value2, "inviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseMemberCountIsNull() {
            addCriterion("other_increase_member_count is null");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseMemberCountIsNotNull() {
            addCriterion("other_increase_member_count is not null");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseMemberCountEqualTo(Integer value) {
            addCriterion("other_increase_member_count =", value, "otherIncreaseMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseMemberCountNotEqualTo(Integer value) {
            addCriterion("other_increase_member_count <>", value, "otherIncreaseMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseMemberCountGreaterThan(Integer value) {
            addCriterion("other_increase_member_count >", value, "otherIncreaseMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseMemberCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_increase_member_count >=", value, "otherIncreaseMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseMemberCountLessThan(Integer value) {
            addCriterion("other_increase_member_count <", value, "otherIncreaseMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseMemberCountLessThanOrEqualTo(Integer value) {
            addCriterion("other_increase_member_count <=", value, "otherIncreaseMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseMemberCountIn(List<Integer> values) {
            addCriterion("other_increase_member_count in", values, "otherIncreaseMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseMemberCountNotIn(List<Integer> values) {
            addCriterion("other_increase_member_count not in", values, "otherIncreaseMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseMemberCountBetween(Integer value1, Integer value2) {
            addCriterion("other_increase_member_count between", value1, value2, "otherIncreaseMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseMemberCountNotBetween(Integer value1, Integer value2) {
            addCriterion("other_increase_member_count not between", value1, value2, "otherIncreaseMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseInviteMemberCountIsNull() {
            addCriterion("other_increase_invite_member_count is null");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseInviteMemberCountIsNotNull() {
            addCriterion("other_increase_invite_member_count is not null");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseInviteMemberCountEqualTo(Integer value) {
            addCriterion("other_increase_invite_member_count =", value, "otherIncreaseInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseInviteMemberCountNotEqualTo(Integer value) {
            addCriterion("other_increase_invite_member_count <>", value, "otherIncreaseInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseInviteMemberCountGreaterThan(Integer value) {
            addCriterion("other_increase_invite_member_count >", value, "otherIncreaseInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseInviteMemberCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_increase_invite_member_count >=", value, "otherIncreaseInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseInviteMemberCountLessThan(Integer value) {
            addCriterion("other_increase_invite_member_count <", value, "otherIncreaseInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseInviteMemberCountLessThanOrEqualTo(Integer value) {
            addCriterion("other_increase_invite_member_count <=", value, "otherIncreaseInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseInviteMemberCountIn(List<Integer> values) {
            addCriterion("other_increase_invite_member_count in", values, "otherIncreaseInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseInviteMemberCountNotIn(List<Integer> values) {
            addCriterion("other_increase_invite_member_count not in", values, "otherIncreaseInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseInviteMemberCountBetween(Integer value1, Integer value2) {
            addCriterion("other_increase_invite_member_count between", value1, value2, "otherIncreaseInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherIncreaseInviteMemberCountNotBetween(Integer value1, Integer value2) {
            addCriterion("other_increase_invite_member_count not between", value1, value2, "otherIncreaseInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherMemberCountIsNull() {
            addCriterion("other_member_count is null");
            return (Criteria) this;
        }

        public Criteria andOtherMemberCountIsNotNull() {
            addCriterion("other_member_count is not null");
            return (Criteria) this;
        }

        public Criteria andOtherMemberCountEqualTo(Integer value) {
            addCriterion("other_member_count =", value, "otherMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherMemberCountNotEqualTo(Integer value) {
            addCriterion("other_member_count <>", value, "otherMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherMemberCountGreaterThan(Integer value) {
            addCriterion("other_member_count >", value, "otherMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherMemberCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_member_count >=", value, "otherMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherMemberCountLessThan(Integer value) {
            addCriterion("other_member_count <", value, "otherMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherMemberCountLessThanOrEqualTo(Integer value) {
            addCriterion("other_member_count <=", value, "otherMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherMemberCountIn(List<Integer> values) {
            addCriterion("other_member_count in", values, "otherMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherMemberCountNotIn(List<Integer> values) {
            addCriterion("other_member_count not in", values, "otherMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherMemberCountBetween(Integer value1, Integer value2) {
            addCriterion("other_member_count between", value1, value2, "otherMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherMemberCountNotBetween(Integer value1, Integer value2) {
            addCriterion("other_member_count not between", value1, value2, "otherMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherInviteMemberCountIsNull() {
            addCriterion("other_invite_member_count is null");
            return (Criteria) this;
        }

        public Criteria andOtherInviteMemberCountIsNotNull() {
            addCriterion("other_invite_member_count is not null");
            return (Criteria) this;
        }

        public Criteria andOtherInviteMemberCountEqualTo(Integer value) {
            addCriterion("other_invite_member_count =", value, "otherInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherInviteMemberCountNotEqualTo(Integer value) {
            addCriterion("other_invite_member_count <>", value, "otherInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherInviteMemberCountGreaterThan(Integer value) {
            addCriterion("other_invite_member_count >", value, "otherInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherInviteMemberCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_invite_member_count >=", value, "otherInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherInviteMemberCountLessThan(Integer value) {
            addCriterion("other_invite_member_count <", value, "otherInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherInviteMemberCountLessThanOrEqualTo(Integer value) {
            addCriterion("other_invite_member_count <=", value, "otherInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherInviteMemberCountIn(List<Integer> values) {
            addCriterion("other_invite_member_count in", values, "otherInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherInviteMemberCountNotIn(List<Integer> values) {
            addCriterion("other_invite_member_count not in", values, "otherInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherInviteMemberCountBetween(Integer value1, Integer value2) {
            addCriterion("other_invite_member_count between", value1, value2, "otherInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andOtherInviteMemberCountNotBetween(Integer value1, Integer value2) {
            addCriterion("other_invite_member_count not between", value1, value2, "otherInviteMemberCount");
            return (Criteria) this;
        }

        public Criteria andAllMemberRegistCountIsNull() {
            addCriterion("all_member_regist_count is null");
            return (Criteria) this;
        }

        public Criteria andAllMemberRegistCountIsNotNull() {
            addCriterion("all_member_regist_count is not null");
            return (Criteria) this;
        }

        public Criteria andAllMemberRegistCountEqualTo(Integer value) {
            addCriterion("all_member_regist_count =", value, "allMemberRegistCount");
            return (Criteria) this;
        }

        public Criteria andAllMemberRegistCountNotEqualTo(Integer value) {
            addCriterion("all_member_regist_count <>", value, "allMemberRegistCount");
            return (Criteria) this;
        }

        public Criteria andAllMemberRegistCountGreaterThan(Integer value) {
            addCriterion("all_member_regist_count >", value, "allMemberRegistCount");
            return (Criteria) this;
        }

        public Criteria andAllMemberRegistCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("all_member_regist_count >=", value, "allMemberRegistCount");
            return (Criteria) this;
        }

        public Criteria andAllMemberRegistCountLessThan(Integer value) {
            addCriterion("all_member_regist_count <", value, "allMemberRegistCount");
            return (Criteria) this;
        }

        public Criteria andAllMemberRegistCountLessThanOrEqualTo(Integer value) {
            addCriterion("all_member_regist_count <=", value, "allMemberRegistCount");
            return (Criteria) this;
        }

        public Criteria andAllMemberRegistCountIn(List<Integer> values) {
            addCriterion("all_member_regist_count in", values, "allMemberRegistCount");
            return (Criteria) this;
        }

        public Criteria andAllMemberRegistCountNotIn(List<Integer> values) {
            addCriterion("all_member_regist_count not in", values, "allMemberRegistCount");
            return (Criteria) this;
        }

        public Criteria andAllMemberRegistCountBetween(Integer value1, Integer value2) {
            addCriterion("all_member_regist_count between", value1, value2, "allMemberRegistCount");
            return (Criteria) this;
        }

        public Criteria andAllMemberRegistCountNotBetween(Integer value1, Integer value2) {
            addCriterion("all_member_regist_count not between", value1, value2, "allMemberRegistCount");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Integer value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Integer value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Integer> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andMemberOnlySpendingIsNull() {
            addCriterion("member_only_spending is null");
            return (Criteria) this;
        }

        public Criteria andMemberOnlySpendingIsNotNull() {
            addCriterion("member_only_spending is not null");
            return (Criteria) this;
        }

        public Criteria andMemberOnlySpendingEqualTo(Integer value) {
            addCriterion("member_only_spending =", value, "memberOnlySpending");
            return (Criteria) this;
        }

        public Criteria andMemberOnlySpendingNotEqualTo(Integer value) {
            addCriterion("member_only_spending <>", value, "memberOnlySpending");
            return (Criteria) this;
        }

        public Criteria andMemberOnlySpendingGreaterThan(Integer value) {
            addCriterion("member_only_spending >", value, "memberOnlySpending");
            return (Criteria) this;
        }

        public Criteria andMemberOnlySpendingGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_only_spending >=", value, "memberOnlySpending");
            return (Criteria) this;
        }

        public Criteria andMemberOnlySpendingLessThan(Integer value) {
            addCriterion("member_only_spending <", value, "memberOnlySpending");
            return (Criteria) this;
        }

        public Criteria andMemberOnlySpendingLessThanOrEqualTo(Integer value) {
            addCriterion("member_only_spending <=", value, "memberOnlySpending");
            return (Criteria) this;
        }

        public Criteria andMemberOnlySpendingIn(List<Integer> values) {
            addCriterion("member_only_spending in", values, "memberOnlySpending");
            return (Criteria) this;
        }

        public Criteria andMemberOnlySpendingNotIn(List<Integer> values) {
            addCriterion("member_only_spending not in", values, "memberOnlySpending");
            return (Criteria) this;
        }

        public Criteria andMemberOnlySpendingBetween(Integer value1, Integer value2) {
            addCriterion("member_only_spending between", value1, value2, "memberOnlySpending");
            return (Criteria) this;
        }

        public Criteria andMemberOnlySpendingNotBetween(Integer value1, Integer value2) {
            addCriterion("member_only_spending not between", value1, value2, "memberOnlySpending");
            return (Criteria) this;
        }

        public Criteria andMemberOnlyDonativeIsNull() {
            addCriterion("member_only_donative is null");
            return (Criteria) this;
        }

        public Criteria andMemberOnlyDonativeIsNotNull() {
            addCriterion("member_only_donative is not null");
            return (Criteria) this;
        }

        public Criteria andMemberOnlyDonativeEqualTo(Integer value) {
            addCriterion("member_only_donative =", value, "memberOnlyDonative");
            return (Criteria) this;
        }

        public Criteria andMemberOnlyDonativeNotEqualTo(Integer value) {
            addCriterion("member_only_donative <>", value, "memberOnlyDonative");
            return (Criteria) this;
        }

        public Criteria andMemberOnlyDonativeGreaterThan(Integer value) {
            addCriterion("member_only_donative >", value, "memberOnlyDonative");
            return (Criteria) this;
        }

        public Criteria andMemberOnlyDonativeGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_only_donative >=", value, "memberOnlyDonative");
            return (Criteria) this;
        }

        public Criteria andMemberOnlyDonativeLessThan(Integer value) {
            addCriterion("member_only_donative <", value, "memberOnlyDonative");
            return (Criteria) this;
        }

        public Criteria andMemberOnlyDonativeLessThanOrEqualTo(Integer value) {
            addCriterion("member_only_donative <=", value, "memberOnlyDonative");
            return (Criteria) this;
        }

        public Criteria andMemberOnlyDonativeIn(List<Integer> values) {
            addCriterion("member_only_donative in", values, "memberOnlyDonative");
            return (Criteria) this;
        }

        public Criteria andMemberOnlyDonativeNotIn(List<Integer> values) {
            addCriterion("member_only_donative not in", values, "memberOnlyDonative");
            return (Criteria) this;
        }

        public Criteria andMemberOnlyDonativeBetween(Integer value1, Integer value2) {
            addCriterion("member_only_donative between", value1, value2, "memberOnlyDonative");
            return (Criteria) this;
        }

        public Criteria andMemberOnlyDonativeNotBetween(Integer value1, Integer value2) {
            addCriterion("member_only_donative not between", value1, value2, "memberOnlyDonative");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingAndDonativeIsNull() {
            addCriterion("member_spending_and_donative is null");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingAndDonativeIsNotNull() {
            addCriterion("member_spending_and_donative is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingAndDonativeEqualTo(Integer value) {
            addCriterion("member_spending_and_donative =", value, "memberSpendingAndDonative");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingAndDonativeNotEqualTo(Integer value) {
            addCriterion("member_spending_and_donative <>", value, "memberSpendingAndDonative");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingAndDonativeGreaterThan(Integer value) {
            addCriterion("member_spending_and_donative >", value, "memberSpendingAndDonative");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingAndDonativeGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_spending_and_donative >=", value, "memberSpendingAndDonative");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingAndDonativeLessThan(Integer value) {
            addCriterion("member_spending_and_donative <", value, "memberSpendingAndDonative");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingAndDonativeLessThanOrEqualTo(Integer value) {
            addCriterion("member_spending_and_donative <=", value, "memberSpendingAndDonative");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingAndDonativeIn(List<Integer> values) {
            addCriterion("member_spending_and_donative in", values, "memberSpendingAndDonative");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingAndDonativeNotIn(List<Integer> values) {
            addCriterion("member_spending_and_donative not in", values, "memberSpendingAndDonative");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingAndDonativeBetween(Integer value1, Integer value2) {
            addCriterion("member_spending_and_donative between", value1, value2, "memberSpendingAndDonative");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingAndDonativeNotBetween(Integer value1, Integer value2) {
            addCriterion("member_spending_and_donative not between", value1, value2, "memberSpendingAndDonative");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingOrDonativeIsNull() {
            addCriterion("member_spending_or_donative is null");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingOrDonativeIsNotNull() {
            addCriterion("member_spending_or_donative is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingOrDonativeEqualTo(Integer value) {
            addCriterion("member_spending_or_donative =", value, "memberSpendingOrDonative");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingOrDonativeNotEqualTo(Integer value) {
            addCriterion("member_spending_or_donative <>", value, "memberSpendingOrDonative");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingOrDonativeGreaterThan(Integer value) {
            addCriterion("member_spending_or_donative >", value, "memberSpendingOrDonative");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingOrDonativeGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_spending_or_donative >=", value, "memberSpendingOrDonative");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingOrDonativeLessThan(Integer value) {
            addCriterion("member_spending_or_donative <", value, "memberSpendingOrDonative");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingOrDonativeLessThanOrEqualTo(Integer value) {
            addCriterion("member_spending_or_donative <=", value, "memberSpendingOrDonative");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingOrDonativeIn(List<Integer> values) {
            addCriterion("member_spending_or_donative in", values, "memberSpendingOrDonative");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingOrDonativeNotIn(List<Integer> values) {
            addCriterion("member_spending_or_donative not in", values, "memberSpendingOrDonative");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingOrDonativeBetween(Integer value1, Integer value2) {
            addCriterion("member_spending_or_donative between", value1, value2, "memberSpendingOrDonative");
            return (Criteria) this;
        }

        public Criteria andMemberSpendingOrDonativeNotBetween(Integer value1, Integer value2) {
            addCriterion("member_spending_or_donative not between", value1, value2, "memberSpendingOrDonative");
            return (Criteria) this;
        }

        public Criteria andMemberNoneIsNull() {
            addCriterion("member_none is null");
            return (Criteria) this;
        }

        public Criteria andMemberNoneIsNotNull() {
            addCriterion("member_none is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNoneEqualTo(Integer value) {
            addCriterion("member_none =", value, "memberNone");
            return (Criteria) this;
        }

        public Criteria andMemberNoneNotEqualTo(Integer value) {
            addCriterion("member_none <>", value, "memberNone");
            return (Criteria) this;
        }

        public Criteria andMemberNoneGreaterThan(Integer value) {
            addCriterion("member_none >", value, "memberNone");
            return (Criteria) this;
        }

        public Criteria andMemberNoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_none >=", value, "memberNone");
            return (Criteria) this;
        }

        public Criteria andMemberNoneLessThan(Integer value) {
            addCriterion("member_none <", value, "memberNone");
            return (Criteria) this;
        }

        public Criteria andMemberNoneLessThanOrEqualTo(Integer value) {
            addCriterion("member_none <=", value, "memberNone");
            return (Criteria) this;
        }

        public Criteria andMemberNoneIn(List<Integer> values) {
            addCriterion("member_none in", values, "memberNone");
            return (Criteria) this;
        }

        public Criteria andMemberNoneNotIn(List<Integer> values) {
            addCriterion("member_none not in", values, "memberNone");
            return (Criteria) this;
        }

        public Criteria andMemberNoneBetween(Integer value1, Integer value2) {
            addCriterion("member_none between", value1, value2, "memberNone");
            return (Criteria) this;
        }

        public Criteria andMemberNoneNotBetween(Integer value1, Integer value2) {
            addCriterion("member_none not between", value1, value2, "memberNone");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_platform_stats表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2017-11-07
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_platform_stats 2017-11-07
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