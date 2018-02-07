package com.shanyuan.platform.ms.dao.store.entity;

import java.util.ArrayList;
import java.util.List;

public class SyBocOrgExample {
    /**
     * sy_boc_org
     */
    protected String orderByClause;

    /**
     * sy_boc_org
     */
    protected boolean distinct;

    /**
     * sy_boc_org
     */
    protected List<Criteria> oredCriteria;

    public SyBocOrgExample() {
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
     * sy_boc_org 2017-10-17
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

        public Criteria andCircleIdIsNull() {
            addCriterion("circle_id is null");
            return (Criteria) this;
        }

        public Criteria andCircleIdIsNotNull() {
            addCriterion("circle_id is not null");
            return (Criteria) this;
        }

        public Criteria andCircleIdEqualTo(Integer value) {
            addCriterion("circle_id =", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdNotEqualTo(Integer value) {
            addCriterion("circle_id <>", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdGreaterThan(Integer value) {
            addCriterion("circle_id >", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("circle_id >=", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdLessThan(Integer value) {
            addCriterion("circle_id <", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdLessThanOrEqualTo(Integer value) {
            addCriterion("circle_id <=", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdIn(List<Integer> values) {
            addCriterion("circle_id in", values, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdNotIn(List<Integer> values) {
            addCriterion("circle_id not in", values, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdBetween(Integer value1, Integer value2) {
            addCriterion("circle_id between", value1, value2, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("circle_id not between", value1, value2, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleDeptNameIsNull() {
            addCriterion("circle_dept_name is null");
            return (Criteria) this;
        }

        public Criteria andCircleDeptNameIsNotNull() {
            addCriterion("circle_dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andCircleDeptNameEqualTo(String value) {
            addCriterion("circle_dept_name =", value, "circleDeptName");
            return (Criteria) this;
        }

        public Criteria andCircleDeptNameNotEqualTo(String value) {
            addCriterion("circle_dept_name <>", value, "circleDeptName");
            return (Criteria) this;
        }

        public Criteria andCircleDeptNameGreaterThan(String value) {
            addCriterion("circle_dept_name >", value, "circleDeptName");
            return (Criteria) this;
        }

        public Criteria andCircleDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("circle_dept_name >=", value, "circleDeptName");
            return (Criteria) this;
        }

        public Criteria andCircleDeptNameLessThan(String value) {
            addCriterion("circle_dept_name <", value, "circleDeptName");
            return (Criteria) this;
        }

        public Criteria andCircleDeptNameLessThanOrEqualTo(String value) {
            addCriterion("circle_dept_name <=", value, "circleDeptName");
            return (Criteria) this;
        }

        public Criteria andCircleDeptNameLike(String value) {
            addCriterion("circle_dept_name like", value, "circleDeptName");
            return (Criteria) this;
        }

        public Criteria andCircleDeptNameNotLike(String value) {
            addCriterion("circle_dept_name not like", value, "circleDeptName");
            return (Criteria) this;
        }

        public Criteria andCircleDeptNameIn(List<String> values) {
            addCriterion("circle_dept_name in", values, "circleDeptName");
            return (Criteria) this;
        }

        public Criteria andCircleDeptNameNotIn(List<String> values) {
            addCriterion("circle_dept_name not in", values, "circleDeptName");
            return (Criteria) this;
        }

        public Criteria andCircleDeptNameBetween(String value1, String value2) {
            addCriterion("circle_dept_name between", value1, value2, "circleDeptName");
            return (Criteria) this;
        }

        public Criteria andCircleDeptNameNotBetween(String value1, String value2) {
            addCriterion("circle_dept_name not between", value1, value2, "circleDeptName");
            return (Criteria) this;
        }

        public Criteria andParentCircleDeptNameIsNull() {
            addCriterion("parent_circle_dept_name is null");
            return (Criteria) this;
        }

        public Criteria andParentCircleDeptNameIsNotNull() {
            addCriterion("parent_circle_dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andParentCircleDeptNameEqualTo(String value) {
            addCriterion("parent_circle_dept_name =", value, "parentCircleDeptName");
            return (Criteria) this;
        }

        public Criteria andParentCircleDeptNameNotEqualTo(String value) {
            addCriterion("parent_circle_dept_name <>", value, "parentCircleDeptName");
            return (Criteria) this;
        }

        public Criteria andParentCircleDeptNameGreaterThan(String value) {
            addCriterion("parent_circle_dept_name >", value, "parentCircleDeptName");
            return (Criteria) this;
        }

        public Criteria andParentCircleDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("parent_circle_dept_name >=", value, "parentCircleDeptName");
            return (Criteria) this;
        }

        public Criteria andParentCircleDeptNameLessThan(String value) {
            addCriterion("parent_circle_dept_name <", value, "parentCircleDeptName");
            return (Criteria) this;
        }

        public Criteria andParentCircleDeptNameLessThanOrEqualTo(String value) {
            addCriterion("parent_circle_dept_name <=", value, "parentCircleDeptName");
            return (Criteria) this;
        }

        public Criteria andParentCircleDeptNameLike(String value) {
            addCriterion("parent_circle_dept_name like", value, "parentCircleDeptName");
            return (Criteria) this;
        }

        public Criteria andParentCircleDeptNameNotLike(String value) {
            addCriterion("parent_circle_dept_name not like", value, "parentCircleDeptName");
            return (Criteria) this;
        }

        public Criteria andParentCircleDeptNameIn(List<String> values) {
            addCriterion("parent_circle_dept_name in", values, "parentCircleDeptName");
            return (Criteria) this;
        }

        public Criteria andParentCircleDeptNameNotIn(List<String> values) {
            addCriterion("parent_circle_dept_name not in", values, "parentCircleDeptName");
            return (Criteria) this;
        }

        public Criteria andParentCircleDeptNameBetween(String value1, String value2) {
            addCriterion("parent_circle_dept_name between", value1, value2, "parentCircleDeptName");
            return (Criteria) this;
        }

        public Criteria andParentCircleDeptNameNotBetween(String value1, String value2) {
            addCriterion("parent_circle_dept_name not between", value1, value2, "parentCircleDeptName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNull() {
            addCriterion("org_type is null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNotNull() {
            addCriterion("org_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeEqualTo(String value) {
            addCriterion("org_type =", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotEqualTo(String value) {
            addCriterion("org_type <>", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThan(String value) {
            addCriterion("org_type >", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("org_type >=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThan(String value) {
            addCriterion("org_type <", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThanOrEqualTo(String value) {
            addCriterion("org_type <=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLike(String value) {
            addCriterion("org_type like", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotLike(String value) {
            addCriterion("org_type not like", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIn(List<String> values) {
            addCriterion("org_type in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotIn(List<String> values) {
            addCriterion("org_type not in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeBetween(String value1, String value2) {
            addCriterion("org_type between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotBetween(String value1, String value2) {
            addCriterion("org_type not between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("org_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("org_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("org_code =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("org_code <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("org_code >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_code >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("org_code <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("org_code <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("org_code like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("org_code not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("org_code in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("org_code not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("org_code not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andDeptCircleIdIsNull() {
            addCriterion("dept_circle_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptCircleIdIsNotNull() {
            addCriterion("dept_circle_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCircleIdEqualTo(Integer value) {
            addCriterion("dept_circle_id =", value, "deptCircleId");
            return (Criteria) this;
        }

        public Criteria andDeptCircleIdNotEqualTo(Integer value) {
            addCriterion("dept_circle_id <>", value, "deptCircleId");
            return (Criteria) this;
        }

        public Criteria andDeptCircleIdGreaterThan(Integer value) {
            addCriterion("dept_circle_id >", value, "deptCircleId");
            return (Criteria) this;
        }

        public Criteria andDeptCircleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_circle_id >=", value, "deptCircleId");
            return (Criteria) this;
        }

        public Criteria andDeptCircleIdLessThan(Integer value) {
            addCriterion("dept_circle_id <", value, "deptCircleId");
            return (Criteria) this;
        }

        public Criteria andDeptCircleIdLessThanOrEqualTo(Integer value) {
            addCriterion("dept_circle_id <=", value, "deptCircleId");
            return (Criteria) this;
        }

        public Criteria andDeptCircleIdIn(List<Integer> values) {
            addCriterion("dept_circle_id in", values, "deptCircleId");
            return (Criteria) this;
        }

        public Criteria andDeptCircleIdNotIn(List<Integer> values) {
            addCriterion("dept_circle_id not in", values, "deptCircleId");
            return (Criteria) this;
        }

        public Criteria andDeptCircleIdBetween(Integer value1, Integer value2) {
            addCriterion("dept_circle_id between", value1, value2, "deptCircleId");
            return (Criteria) this;
        }

        public Criteria andDeptCircleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_circle_id not between", value1, value2, "deptCircleId");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_boc_org表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2017-10-17
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_boc_org 2017-10-17
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