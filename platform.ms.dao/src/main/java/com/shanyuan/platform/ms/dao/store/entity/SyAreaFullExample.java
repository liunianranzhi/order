package com.shanyuan.platform.ms.dao.store.entity;

import java.util.ArrayList;
import java.util.List;

public class SyAreaFullExample {
    /**
     * sy_area_full
     */
    protected String orderByClause;

    /**
     * sy_area_full
     */
    protected boolean distinct;

    /**
     * sy_area_full
     */
    protected List<Criteria> oredCriteria;

    public SyAreaFullExample() {
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
     * sy_area_full 2017-10-31
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

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Long value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Long value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Long value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Long value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Long> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Long> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Long value1, Long value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdIsNull() {
            addCriterion("area_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdIsNotNull() {
            addCriterion("area_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdEqualTo(Long value) {
            addCriterion("area_parent_id =", value, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdNotEqualTo(Long value) {
            addCriterion("area_parent_id <>", value, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdGreaterThan(Long value) {
            addCriterion("area_parent_id >", value, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("area_parent_id >=", value, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdLessThan(Long value) {
            addCriterion("area_parent_id <", value, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdLessThanOrEqualTo(Long value) {
            addCriterion("area_parent_id <=", value, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdIn(List<Long> values) {
            addCriterion("area_parent_id in", values, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdNotIn(List<Long> values) {
            addCriterion("area_parent_id not in", values, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdBetween(Long value1, Long value2) {
            addCriterion("area_parent_id between", value1, value2, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdNotBetween(Long value1, Long value2) {
            addCriterion("area_parent_id not between", value1, value2, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaSortIsNull() {
            addCriterion("area_sort is null");
            return (Criteria) this;
        }

        public Criteria andAreaSortIsNotNull() {
            addCriterion("area_sort is not null");
            return (Criteria) this;
        }

        public Criteria andAreaSortEqualTo(Byte value) {
            addCriterion("area_sort =", value, "areaSort");
            return (Criteria) this;
        }

        public Criteria andAreaSortNotEqualTo(Byte value) {
            addCriterion("area_sort <>", value, "areaSort");
            return (Criteria) this;
        }

        public Criteria andAreaSortGreaterThan(Byte value) {
            addCriterion("area_sort >", value, "areaSort");
            return (Criteria) this;
        }

        public Criteria andAreaSortGreaterThanOrEqualTo(Byte value) {
            addCriterion("area_sort >=", value, "areaSort");
            return (Criteria) this;
        }

        public Criteria andAreaSortLessThan(Byte value) {
            addCriterion("area_sort <", value, "areaSort");
            return (Criteria) this;
        }

        public Criteria andAreaSortLessThanOrEqualTo(Byte value) {
            addCriterion("area_sort <=", value, "areaSort");
            return (Criteria) this;
        }

        public Criteria andAreaSortIn(List<Byte> values) {
            addCriterion("area_sort in", values, "areaSort");
            return (Criteria) this;
        }

        public Criteria andAreaSortNotIn(List<Byte> values) {
            addCriterion("area_sort not in", values, "areaSort");
            return (Criteria) this;
        }

        public Criteria andAreaSortBetween(Byte value1, Byte value2) {
            addCriterion("area_sort between", value1, value2, "areaSort");
            return (Criteria) this;
        }

        public Criteria andAreaSortNotBetween(Byte value1, Byte value2) {
            addCriterion("area_sort not between", value1, value2, "areaSort");
            return (Criteria) this;
        }

        public Criteria andAreaDeepIsNull() {
            addCriterion("area_deep is null");
            return (Criteria) this;
        }

        public Criteria andAreaDeepIsNotNull() {
            addCriterion("area_deep is not null");
            return (Criteria) this;
        }

        public Criteria andAreaDeepEqualTo(Byte value) {
            addCriterion("area_deep =", value, "areaDeep");
            return (Criteria) this;
        }

        public Criteria andAreaDeepNotEqualTo(Byte value) {
            addCriterion("area_deep <>", value, "areaDeep");
            return (Criteria) this;
        }

        public Criteria andAreaDeepGreaterThan(Byte value) {
            addCriterion("area_deep >", value, "areaDeep");
            return (Criteria) this;
        }

        public Criteria andAreaDeepGreaterThanOrEqualTo(Byte value) {
            addCriterion("area_deep >=", value, "areaDeep");
            return (Criteria) this;
        }

        public Criteria andAreaDeepLessThan(Byte value) {
            addCriterion("area_deep <", value, "areaDeep");
            return (Criteria) this;
        }

        public Criteria andAreaDeepLessThanOrEqualTo(Byte value) {
            addCriterion("area_deep <=", value, "areaDeep");
            return (Criteria) this;
        }

        public Criteria andAreaDeepIn(List<Byte> values) {
            addCriterion("area_deep in", values, "areaDeep");
            return (Criteria) this;
        }

        public Criteria andAreaDeepNotIn(List<Byte> values) {
            addCriterion("area_deep not in", values, "areaDeep");
            return (Criteria) this;
        }

        public Criteria andAreaDeepBetween(Byte value1, Byte value2) {
            addCriterion("area_deep between", value1, value2, "areaDeep");
            return (Criteria) this;
        }

        public Criteria andAreaDeepNotBetween(Byte value1, Byte value2) {
            addCriterion("area_deep not between", value1, value2, "areaDeep");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_area_full表的实体类
     * @version
     * @author:  caoyongjun
     * @创建时间: 2017-10-31
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_area_full 2017-10-31
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