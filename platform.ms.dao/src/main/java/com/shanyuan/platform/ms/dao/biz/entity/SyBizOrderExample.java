package com.shanyuan.platform.ms.dao.biz.entity;

import java.util.ArrayList;
import java.util.List;

public class SyBizOrderExample {
    /**
     * sy_biz_order
     */
    protected String orderByClause;

    /**
     * sy_biz_order
     */
    protected boolean distinct;

    /**
     * sy_biz_order
     */
    protected List<Criteria> oredCriteria;

    public SyBizOrderExample() {
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
     * sy_biz_order 2018-01-03
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdIsNull() {
            addCriterion("main_order_id is null");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdIsNotNull() {
            addCriterion("main_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdEqualTo(Integer value) {
            addCriterion("main_order_id =", value, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdNotEqualTo(Integer value) {
            addCriterion("main_order_id <>", value, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdGreaterThan(Integer value) {
            addCriterion("main_order_id >", value, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("main_order_id >=", value, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdLessThan(Integer value) {
            addCriterion("main_order_id <", value, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("main_order_id <=", value, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdIn(List<Integer> values) {
            addCriterion("main_order_id in", values, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdNotIn(List<Integer> values) {
            addCriterion("main_order_id not in", values, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("main_order_id between", value1, value2, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("main_order_id not between", value1, value2, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andReciverInfoIsNull() {
            addCriterion("reciver_info is null");
            return (Criteria) this;
        }

        public Criteria andReciverInfoIsNotNull() {
            addCriterion("reciver_info is not null");
            return (Criteria) this;
        }

        public Criteria andReciverInfoEqualTo(String value) {
            addCriterion("reciver_info =", value, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoNotEqualTo(String value) {
            addCriterion("reciver_info <>", value, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoGreaterThan(String value) {
            addCriterion("reciver_info >", value, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoGreaterThanOrEqualTo(String value) {
            addCriterion("reciver_info >=", value, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoLessThan(String value) {
            addCriterion("reciver_info <", value, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoLessThanOrEqualTo(String value) {
            addCriterion("reciver_info <=", value, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoLike(String value) {
            addCriterion("reciver_info like", value, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoNotLike(String value) {
            addCriterion("reciver_info not like", value, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoIn(List<String> values) {
            addCriterion("reciver_info in", values, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoNotIn(List<String> values) {
            addCriterion("reciver_info not in", values, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoBetween(String value1, String value2) {
            addCriterion("reciver_info between", value1, value2, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoNotBetween(String value1, String value2) {
            addCriterion("reciver_info not between", value1, value2, "reciverInfo");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_biz_order表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2018-01-03
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_biz_order 2018-01-03
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