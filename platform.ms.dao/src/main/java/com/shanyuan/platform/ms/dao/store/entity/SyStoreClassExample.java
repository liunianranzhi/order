package com.shanyuan.platform.ms.dao.store.entity;

import java.util.ArrayList;
import java.util.List;

public class SyStoreClassExample {
    /**
     * sy_store_class
     */
    protected String orderByClause;

    /**
     * sy_store_class
     */
    protected boolean distinct;

    /**
     * sy_store_class
     */
    protected List<Criteria> oredCriteria;

    public SyStoreClassExample() {
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
     * sy_store_class 2017-10-16
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

        public Criteria andScIdIsNull() {
            addCriterion("sc_id is null");
            return (Criteria) this;
        }

        public Criteria andScIdIsNotNull() {
            addCriterion("sc_id is not null");
            return (Criteria) this;
        }

        public Criteria andScIdEqualTo(Integer value) {
            addCriterion("sc_id =", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotEqualTo(Integer value) {
            addCriterion("sc_id <>", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThan(Integer value) {
            addCriterion("sc_id >", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_id >=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThan(Integer value) {
            addCriterion("sc_id <", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThanOrEqualTo(Integer value) {
            addCriterion("sc_id <=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdIn(List<Integer> values) {
            addCriterion("sc_id in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotIn(List<Integer> values) {
            addCriterion("sc_id not in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdBetween(Integer value1, Integer value2) {
            addCriterion("sc_id between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_id not between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andScNameIsNull() {
            addCriterion("sc_name is null");
            return (Criteria) this;
        }

        public Criteria andScNameIsNotNull() {
            addCriterion("sc_name is not null");
            return (Criteria) this;
        }

        public Criteria andScNameEqualTo(String value) {
            addCriterion("sc_name =", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotEqualTo(String value) {
            addCriterion("sc_name <>", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameGreaterThan(String value) {
            addCriterion("sc_name >", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameGreaterThanOrEqualTo(String value) {
            addCriterion("sc_name >=", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLessThan(String value) {
            addCriterion("sc_name <", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLessThanOrEqualTo(String value) {
            addCriterion("sc_name <=", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLike(String value) {
            addCriterion("sc_name like", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotLike(String value) {
            addCriterion("sc_name not like", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameIn(List<String> values) {
            addCriterion("sc_name in", values, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotIn(List<String> values) {
            addCriterion("sc_name not in", values, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameBetween(String value1, String value2) {
            addCriterion("sc_name between", value1, value2, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotBetween(String value1, String value2) {
            addCriterion("sc_name not between", value1, value2, "scName");
            return (Criteria) this;
        }

        public Criteria andScParentIdIsNull() {
            addCriterion("sc_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andScParentIdIsNotNull() {
            addCriterion("sc_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andScParentIdEqualTo(Integer value) {
            addCriterion("sc_parent_id =", value, "scParentId");
            return (Criteria) this;
        }

        public Criteria andScParentIdNotEqualTo(Integer value) {
            addCriterion("sc_parent_id <>", value, "scParentId");
            return (Criteria) this;
        }

        public Criteria andScParentIdGreaterThan(Integer value) {
            addCriterion("sc_parent_id >", value, "scParentId");
            return (Criteria) this;
        }

        public Criteria andScParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_parent_id >=", value, "scParentId");
            return (Criteria) this;
        }

        public Criteria andScParentIdLessThan(Integer value) {
            addCriterion("sc_parent_id <", value, "scParentId");
            return (Criteria) this;
        }

        public Criteria andScParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("sc_parent_id <=", value, "scParentId");
            return (Criteria) this;
        }

        public Criteria andScParentIdIn(List<Integer> values) {
            addCriterion("sc_parent_id in", values, "scParentId");
            return (Criteria) this;
        }

        public Criteria andScParentIdNotIn(List<Integer> values) {
            addCriterion("sc_parent_id not in", values, "scParentId");
            return (Criteria) this;
        }

        public Criteria andScParentIdBetween(Integer value1, Integer value2) {
            addCriterion("sc_parent_id between", value1, value2, "scParentId");
            return (Criteria) this;
        }

        public Criteria andScParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_parent_id not between", value1, value2, "scParentId");
            return (Criteria) this;
        }

        public Criteria andScSortIsNull() {
            addCriterion("sc_sort is null");
            return (Criteria) this;
        }

        public Criteria andScSortIsNotNull() {
            addCriterion("sc_sort is not null");
            return (Criteria) this;
        }

        public Criteria andScSortEqualTo(Byte value) {
            addCriterion("sc_sort =", value, "scSort");
            return (Criteria) this;
        }

        public Criteria andScSortNotEqualTo(Byte value) {
            addCriterion("sc_sort <>", value, "scSort");
            return (Criteria) this;
        }

        public Criteria andScSortGreaterThan(Byte value) {
            addCriterion("sc_sort >", value, "scSort");
            return (Criteria) this;
        }

        public Criteria andScSortGreaterThanOrEqualTo(Byte value) {
            addCriterion("sc_sort >=", value, "scSort");
            return (Criteria) this;
        }

        public Criteria andScSortLessThan(Byte value) {
            addCriterion("sc_sort <", value, "scSort");
            return (Criteria) this;
        }

        public Criteria andScSortLessThanOrEqualTo(Byte value) {
            addCriterion("sc_sort <=", value, "scSort");
            return (Criteria) this;
        }

        public Criteria andScSortIn(List<Byte> values) {
            addCriterion("sc_sort in", values, "scSort");
            return (Criteria) this;
        }

        public Criteria andScSortNotIn(List<Byte> values) {
            addCriterion("sc_sort not in", values, "scSort");
            return (Criteria) this;
        }

        public Criteria andScSortBetween(Byte value1, Byte value2) {
            addCriterion("sc_sort between", value1, value2, "scSort");
            return (Criteria) this;
        }

        public Criteria andScSortNotBetween(Byte value1, Byte value2) {
            addCriterion("sc_sort not between", value1, value2, "scSort");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_store_class表的实体类
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
     * sy_store_class 2017-10-16
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