package com.shanyuan.platform.ms.dao.user.entity;

import java.util.ArrayList;
import java.util.List;

public class SyGloryUserListExample {
    /**
     * sy_glory_user_list
     */
    protected String orderByClause;

    /**
     * sy_glory_user_list
     */
    protected boolean distinct;

    /**
     * sy_glory_user_list
     */
    protected List<Criteria> oredCriteria;

    public SyGloryUserListExample() {
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
     * sy_glory_user_list 2017-10-18
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

        public Criteria andGloryMemberIdIsNull() {
            addCriterion("glory_member_id is null");
            return (Criteria) this;
        }

        public Criteria andGloryMemberIdIsNotNull() {
            addCriterion("glory_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andGloryMemberIdEqualTo(Integer value) {
            addCriterion("glory_member_id =", value, "gloryMemberId");
            return (Criteria) this;
        }

        public Criteria andGloryMemberIdNotEqualTo(Integer value) {
            addCriterion("glory_member_id <>", value, "gloryMemberId");
            return (Criteria) this;
        }

        public Criteria andGloryMemberIdGreaterThan(Integer value) {
            addCriterion("glory_member_id >", value, "gloryMemberId");
            return (Criteria) this;
        }

        public Criteria andGloryMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("glory_member_id >=", value, "gloryMemberId");
            return (Criteria) this;
        }

        public Criteria andGloryMemberIdLessThan(Integer value) {
            addCriterion("glory_member_id <", value, "gloryMemberId");
            return (Criteria) this;
        }

        public Criteria andGloryMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("glory_member_id <=", value, "gloryMemberId");
            return (Criteria) this;
        }

        public Criteria andGloryMemberIdIn(List<Integer> values) {
            addCriterion("glory_member_id in", values, "gloryMemberId");
            return (Criteria) this;
        }

        public Criteria andGloryMemberIdNotIn(List<Integer> values) {
            addCriterion("glory_member_id not in", values, "gloryMemberId");
            return (Criteria) this;
        }

        public Criteria andGloryMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("glory_member_id between", value1, value2, "gloryMemberId");
            return (Criteria) this;
        }

        public Criteria andGloryMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("glory_member_id not between", value1, value2, "gloryMemberId");
            return (Criteria) this;
        }

        public Criteria andGloryIdIsNull() {
            addCriterion("glory_id is null");
            return (Criteria) this;
        }

        public Criteria andGloryIdIsNotNull() {
            addCriterion("glory_id is not null");
            return (Criteria) this;
        }

        public Criteria andGloryIdEqualTo(Integer value) {
            addCriterion("glory_id =", value, "gloryId");
            return (Criteria) this;
        }

        public Criteria andGloryIdNotEqualTo(Integer value) {
            addCriterion("glory_id <>", value, "gloryId");
            return (Criteria) this;
        }

        public Criteria andGloryIdGreaterThan(Integer value) {
            addCriterion("glory_id >", value, "gloryId");
            return (Criteria) this;
        }

        public Criteria andGloryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("glory_id >=", value, "gloryId");
            return (Criteria) this;
        }

        public Criteria andGloryIdLessThan(Integer value) {
            addCriterion("glory_id <", value, "gloryId");
            return (Criteria) this;
        }

        public Criteria andGloryIdLessThanOrEqualTo(Integer value) {
            addCriterion("glory_id <=", value, "gloryId");
            return (Criteria) this;
        }

        public Criteria andGloryIdIn(List<Integer> values) {
            addCriterion("glory_id in", values, "gloryId");
            return (Criteria) this;
        }

        public Criteria andGloryIdNotIn(List<Integer> values) {
            addCriterion("glory_id not in", values, "gloryId");
            return (Criteria) this;
        }

        public Criteria andGloryIdBetween(Integer value1, Integer value2) {
            addCriterion("glory_id between", value1, value2, "gloryId");
            return (Criteria) this;
        }

        public Criteria andGloryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("glory_id not between", value1, value2, "gloryId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andEnableStateIsNull() {
            addCriterion("enable_state is null");
            return (Criteria) this;
        }

        public Criteria andEnableStateIsNotNull() {
            addCriterion("enable_state is not null");
            return (Criteria) this;
        }

        public Criteria andEnableStateEqualTo(Integer value) {
            addCriterion("enable_state =", value, "enableState");
            return (Criteria) this;
        }

        public Criteria andEnableStateNotEqualTo(Integer value) {
            addCriterion("enable_state <>", value, "enableState");
            return (Criteria) this;
        }

        public Criteria andEnableStateGreaterThan(Integer value) {
            addCriterion("enable_state >", value, "enableState");
            return (Criteria) this;
        }

        public Criteria andEnableStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("enable_state >=", value, "enableState");
            return (Criteria) this;
        }

        public Criteria andEnableStateLessThan(Integer value) {
            addCriterion("enable_state <", value, "enableState");
            return (Criteria) this;
        }

        public Criteria andEnableStateLessThanOrEqualTo(Integer value) {
            addCriterion("enable_state <=", value, "enableState");
            return (Criteria) this;
        }

        public Criteria andEnableStateIn(List<Integer> values) {
            addCriterion("enable_state in", values, "enableState");
            return (Criteria) this;
        }

        public Criteria andEnableStateNotIn(List<Integer> values) {
            addCriterion("enable_state not in", values, "enableState");
            return (Criteria) this;
        }

        public Criteria andEnableStateBetween(Integer value1, Integer value2) {
            addCriterion("enable_state between", value1, value2, "enableState");
            return (Criteria) this;
        }

        public Criteria andEnableStateNotBetween(Integer value1, Integer value2) {
            addCriterion("enable_state not between", value1, value2, "enableState");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_glory_user_list表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-10-18
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_glory_user_list 2017-10-18
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