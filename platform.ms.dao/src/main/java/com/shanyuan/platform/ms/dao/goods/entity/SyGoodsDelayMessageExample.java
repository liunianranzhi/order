package com.shanyuan.platform.ms.dao.goods.entity;

import java.util.ArrayList;
import java.util.List;

public class SyGoodsDelayMessageExample {
    /**
     * sy_goods_delay_message
     */
    protected String orderByClause;

    /**
     * sy_goods_delay_message
     */
    protected boolean distinct;

    /**
     * sy_goods_delay_message
     */
    protected List<Criteria> oredCriteria;

    public SyGoodsDelayMessageExample() {
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
     * sy_goods_delay_message 2017-11-07
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

        public Criteria andDelayIdIsNull() {
            addCriterion("delay_id is null");
            return (Criteria) this;
        }

        public Criteria andDelayIdIsNotNull() {
            addCriterion("delay_id is not null");
            return (Criteria) this;
        }

        public Criteria andDelayIdEqualTo(Integer value) {
            addCriterion("delay_id =", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdNotEqualTo(Integer value) {
            addCriterion("delay_id <>", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdGreaterThan(Integer value) {
            addCriterion("delay_id >", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("delay_id >=", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdLessThan(Integer value) {
            addCriterion("delay_id <", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdLessThanOrEqualTo(Integer value) {
            addCriterion("delay_id <=", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdIn(List<Integer> values) {
            addCriterion("delay_id in", values, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdNotIn(List<Integer> values) {
            addCriterion("delay_id not in", values, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdBetween(Integer value1, Integer value2) {
            addCriterion("delay_id between", value1, value2, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("delay_id not between", value1, value2, "delayId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidIsNull() {
            addCriterion("goods_commonid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidIsNotNull() {
            addCriterion("goods_commonid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidEqualTo(Integer value) {
            addCriterion("goods_commonid =", value, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidNotEqualTo(Integer value) {
            addCriterion("goods_commonid <>", value, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidGreaterThan(Integer value) {
            addCriterion("goods_commonid >", value, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_commonid >=", value, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidLessThan(Integer value) {
            addCriterion("goods_commonid <", value, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidLessThanOrEqualTo(Integer value) {
            addCriterion("goods_commonid <=", value, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidIn(List<Integer> values) {
            addCriterion("goods_commonid in", values, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidNotIn(List<Integer> values) {
            addCriterion("goods_commonid not in", values, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidBetween(Integer value1, Integer value2) {
            addCriterion("goods_commonid between", value1, value2, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_commonid not between", value1, value2, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andPublisherIdIsNull() {
            addCriterion("publisher_id is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIdIsNotNull() {
            addCriterion("publisher_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherIdEqualTo(Integer value) {
            addCriterion("publisher_id =", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdNotEqualTo(Integer value) {
            addCriterion("publisher_id <>", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdGreaterThan(Integer value) {
            addCriterion("publisher_id >", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("publisher_id >=", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdLessThan(Integer value) {
            addCriterion("publisher_id <", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdLessThanOrEqualTo(Integer value) {
            addCriterion("publisher_id <=", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdIn(List<Integer> values) {
            addCriterion("publisher_id in", values, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdNotIn(List<Integer> values) {
            addCriterion("publisher_id not in", values, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdBetween(Integer value1, Integer value2) {
            addCriterion("publisher_id between", value1, value2, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("publisher_id not between", value1, value2, "publisherId");
            return (Criteria) this;
        }

        public Criteria andDelayReasonIsNull() {
            addCriterion("delay_reason is null");
            return (Criteria) this;
        }

        public Criteria andDelayReasonIsNotNull() {
            addCriterion("delay_reason is not null");
            return (Criteria) this;
        }

        public Criteria andDelayReasonEqualTo(String value) {
            addCriterion("delay_reason =", value, "delayReason");
            return (Criteria) this;
        }

        public Criteria andDelayReasonNotEqualTo(String value) {
            addCriterion("delay_reason <>", value, "delayReason");
            return (Criteria) this;
        }

        public Criteria andDelayReasonGreaterThan(String value) {
            addCriterion("delay_reason >", value, "delayReason");
            return (Criteria) this;
        }

        public Criteria andDelayReasonGreaterThanOrEqualTo(String value) {
            addCriterion("delay_reason >=", value, "delayReason");
            return (Criteria) this;
        }

        public Criteria andDelayReasonLessThan(String value) {
            addCriterion("delay_reason <", value, "delayReason");
            return (Criteria) this;
        }

        public Criteria andDelayReasonLessThanOrEqualTo(String value) {
            addCriterion("delay_reason <=", value, "delayReason");
            return (Criteria) this;
        }

        public Criteria andDelayReasonLike(String value) {
            addCriterion("delay_reason like", value, "delayReason");
            return (Criteria) this;
        }

        public Criteria andDelayReasonNotLike(String value) {
            addCriterion("delay_reason not like", value, "delayReason");
            return (Criteria) this;
        }

        public Criteria andDelayReasonIn(List<String> values) {
            addCriterion("delay_reason in", values, "delayReason");
            return (Criteria) this;
        }

        public Criteria andDelayReasonNotIn(List<String> values) {
            addCriterion("delay_reason not in", values, "delayReason");
            return (Criteria) this;
        }

        public Criteria andDelayReasonBetween(String value1, String value2) {
            addCriterion("delay_reason between", value1, value2, "delayReason");
            return (Criteria) this;
        }

        public Criteria andDelayReasonNotBetween(String value1, String value2) {
            addCriterion("delay_reason not between", value1, value2, "delayReason");
            return (Criteria) this;
        }

        public Criteria andDelayTimeIsNull() {
            addCriterion("delay_time is null");
            return (Criteria) this;
        }

        public Criteria andDelayTimeIsNotNull() {
            addCriterion("delay_time is not null");
            return (Criteria) this;
        }

        public Criteria andDelayTimeEqualTo(Integer value) {
            addCriterion("delay_time =", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeNotEqualTo(Integer value) {
            addCriterion("delay_time <>", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeGreaterThan(Integer value) {
            addCriterion("delay_time >", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("delay_time >=", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeLessThan(Integer value) {
            addCriterion("delay_time <", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeLessThanOrEqualTo(Integer value) {
            addCriterion("delay_time <=", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeIn(List<Integer> values) {
            addCriterion("delay_time in", values, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeNotIn(List<Integer> values) {
            addCriterion("delay_time not in", values, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeBetween(Integer value1, Integer value2) {
            addCriterion("delay_time between", value1, value2, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("delay_time not between", value1, value2, "delayTime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Integer value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Integer value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Integer value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Integer value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Integer> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Integer> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeIsNull() {
            addCriterion("latest_time is null");
            return (Criteria) this;
        }

        public Criteria andLatestTimeIsNotNull() {
            addCriterion("latest_time is not null");
            return (Criteria) this;
        }

        public Criteria andLatestTimeEqualTo(Integer value) {
            addCriterion("latest_time =", value, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeNotEqualTo(Integer value) {
            addCriterion("latest_time <>", value, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeGreaterThan(Integer value) {
            addCriterion("latest_time >", value, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("latest_time >=", value, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeLessThan(Integer value) {
            addCriterion("latest_time <", value, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeLessThanOrEqualTo(Integer value) {
            addCriterion("latest_time <=", value, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeIn(List<Integer> values) {
            addCriterion("latest_time in", values, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeNotIn(List<Integer> values) {
            addCriterion("latest_time not in", values, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeBetween(Integer value1, Integer value2) {
            addCriterion("latest_time between", value1, value2, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("latest_time not between", value1, value2, "latestTime");
            return (Criteria) this;
        }

        public Criteria andDelayStateIsNull() {
            addCriterion("delay_state is null");
            return (Criteria) this;
        }

        public Criteria andDelayStateIsNotNull() {
            addCriterion("delay_state is not null");
            return (Criteria) this;
        }

        public Criteria andDelayStateEqualTo(Byte value) {
            addCriterion("delay_state =", value, "delayState");
            return (Criteria) this;
        }

        public Criteria andDelayStateNotEqualTo(Byte value) {
            addCriterion("delay_state <>", value, "delayState");
            return (Criteria) this;
        }

        public Criteria andDelayStateGreaterThan(Byte value) {
            addCriterion("delay_state >", value, "delayState");
            return (Criteria) this;
        }

        public Criteria andDelayStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("delay_state >=", value, "delayState");
            return (Criteria) this;
        }

        public Criteria andDelayStateLessThan(Byte value) {
            addCriterion("delay_state <", value, "delayState");
            return (Criteria) this;
        }

        public Criteria andDelayStateLessThanOrEqualTo(Byte value) {
            addCriterion("delay_state <=", value, "delayState");
            return (Criteria) this;
        }

        public Criteria andDelayStateIn(List<Byte> values) {
            addCriterion("delay_state in", values, "delayState");
            return (Criteria) this;
        }

        public Criteria andDelayStateNotIn(List<Byte> values) {
            addCriterion("delay_state not in", values, "delayState");
            return (Criteria) this;
        }

        public Criteria andDelayStateBetween(Byte value1, Byte value2) {
            addCriterion("delay_state between", value1, value2, "delayState");
            return (Criteria) this;
        }

        public Criteria andDelayStateNotBetween(Byte value1, Byte value2) {
            addCriterion("delay_state not between", value1, value2, "delayState");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_goods_delay_message表的实体类
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
     * sy_goods_delay_message 2017-11-07
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