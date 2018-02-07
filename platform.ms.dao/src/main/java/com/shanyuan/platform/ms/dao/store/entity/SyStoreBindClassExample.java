package com.shanyuan.platform.ms.dao.store.entity;

import java.util.ArrayList;
import java.util.List;

public class SyStoreBindClassExample {
    /**
     * sy_store_bind_class
     */
    protected String orderByClause;

    /**
     * sy_store_bind_class
     */
    protected boolean distinct;

    /**
     * sy_store_bind_class
     */
    protected List<Criteria> oredCriteria;

    public SyStoreBindClassExample() {
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
     * sy_store_bind_class 2017-10-16
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andCommisRateIsNull() {
            addCriterion("commis_rate is null");
            return (Criteria) this;
        }

        public Criteria andCommisRateIsNotNull() {
            addCriterion("commis_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCommisRateEqualTo(Byte value) {
            addCriterion("commis_rate =", value, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateNotEqualTo(Byte value) {
            addCriterion("commis_rate <>", value, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateGreaterThan(Byte value) {
            addCriterion("commis_rate >", value, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateGreaterThanOrEqualTo(Byte value) {
            addCriterion("commis_rate >=", value, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateLessThan(Byte value) {
            addCriterion("commis_rate <", value, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateLessThanOrEqualTo(Byte value) {
            addCriterion("commis_rate <=", value, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateIn(List<Byte> values) {
            addCriterion("commis_rate in", values, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateNotIn(List<Byte> values) {
            addCriterion("commis_rate not in", values, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateBetween(Byte value1, Byte value2) {
            addCriterion("commis_rate between", value1, value2, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateNotBetween(Byte value1, Byte value2) {
            addCriterion("commis_rate not between", value1, value2, "commisRate");
            return (Criteria) this;
        }

        public Criteria andClass1IsNull() {
            addCriterion("class_1 is null");
            return (Criteria) this;
        }

        public Criteria andClass1IsNotNull() {
            addCriterion("class_1 is not null");
            return (Criteria) this;
        }

        public Criteria andClass1EqualTo(Integer value) {
            addCriterion("class_1 =", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1NotEqualTo(Integer value) {
            addCriterion("class_1 <>", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1GreaterThan(Integer value) {
            addCriterion("class_1 >", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1GreaterThanOrEqualTo(Integer value) {
            addCriterion("class_1 >=", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1LessThan(Integer value) {
            addCriterion("class_1 <", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1LessThanOrEqualTo(Integer value) {
            addCriterion("class_1 <=", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1In(List<Integer> values) {
            addCriterion("class_1 in", values, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1NotIn(List<Integer> values) {
            addCriterion("class_1 not in", values, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1Between(Integer value1, Integer value2) {
            addCriterion("class_1 between", value1, value2, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1NotBetween(Integer value1, Integer value2) {
            addCriterion("class_1 not between", value1, value2, "class1");
            return (Criteria) this;
        }

        public Criteria andClass2IsNull() {
            addCriterion("class_2 is null");
            return (Criteria) this;
        }

        public Criteria andClass2IsNotNull() {
            addCriterion("class_2 is not null");
            return (Criteria) this;
        }

        public Criteria andClass2EqualTo(Integer value) {
            addCriterion("class_2 =", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2NotEqualTo(Integer value) {
            addCriterion("class_2 <>", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2GreaterThan(Integer value) {
            addCriterion("class_2 >", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2GreaterThanOrEqualTo(Integer value) {
            addCriterion("class_2 >=", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2LessThan(Integer value) {
            addCriterion("class_2 <", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2LessThanOrEqualTo(Integer value) {
            addCriterion("class_2 <=", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2In(List<Integer> values) {
            addCriterion("class_2 in", values, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2NotIn(List<Integer> values) {
            addCriterion("class_2 not in", values, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2Between(Integer value1, Integer value2) {
            addCriterion("class_2 between", value1, value2, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2NotBetween(Integer value1, Integer value2) {
            addCriterion("class_2 not between", value1, value2, "class2");
            return (Criteria) this;
        }

        public Criteria andClass3IsNull() {
            addCriterion("class_3 is null");
            return (Criteria) this;
        }

        public Criteria andClass3IsNotNull() {
            addCriterion("class_3 is not null");
            return (Criteria) this;
        }

        public Criteria andClass3EqualTo(Integer value) {
            addCriterion("class_3 =", value, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3NotEqualTo(Integer value) {
            addCriterion("class_3 <>", value, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3GreaterThan(Integer value) {
            addCriterion("class_3 >", value, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3GreaterThanOrEqualTo(Integer value) {
            addCriterion("class_3 >=", value, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3LessThan(Integer value) {
            addCriterion("class_3 <", value, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3LessThanOrEqualTo(Integer value) {
            addCriterion("class_3 <=", value, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3In(List<Integer> values) {
            addCriterion("class_3 in", values, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3NotIn(List<Integer> values) {
            addCriterion("class_3 not in", values, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3Between(Integer value1, Integer value2) {
            addCriterion("class_3 between", value1, value2, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3NotBetween(Integer value1, Integer value2) {
            addCriterion("class_3 not between", value1, value2, "class3");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_store_bind_class表的实体类
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
     * sy_store_bind_class 2017-10-16
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