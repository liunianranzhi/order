package com.shanyuan.platform.ms.dao.union.entity;

import java.util.ArrayList;
import java.util.List;

public class SyUnionItemAgentExample {
    /**
     * sy_union_item_agent
     */
    protected String orderByClause;

    /**
     * sy_union_item_agent
     */
    protected boolean distinct;

    /**
     * sy_union_item_agent
     */
    protected List<Criteria> oredCriteria;

    public SyUnionItemAgentExample() {
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
     * sy_union_item_agent 2017-11-30
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

        public Criteria andItemAgentIdIsNull() {
            addCriterion("item_agent_id is null");
            return (Criteria) this;
        }

        public Criteria andItemAgentIdIsNotNull() {
            addCriterion("item_agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemAgentIdEqualTo(Integer value) {
            addCriterion("item_agent_id =", value, "itemAgentId");
            return (Criteria) this;
        }

        public Criteria andItemAgentIdNotEqualTo(Integer value) {
            addCriterion("item_agent_id <>", value, "itemAgentId");
            return (Criteria) this;
        }

        public Criteria andItemAgentIdGreaterThan(Integer value) {
            addCriterion("item_agent_id >", value, "itemAgentId");
            return (Criteria) this;
        }

        public Criteria andItemAgentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_agent_id >=", value, "itemAgentId");
            return (Criteria) this;
        }

        public Criteria andItemAgentIdLessThan(Integer value) {
            addCriterion("item_agent_id <", value, "itemAgentId");
            return (Criteria) this;
        }

        public Criteria andItemAgentIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_agent_id <=", value, "itemAgentId");
            return (Criteria) this;
        }

        public Criteria andItemAgentIdIn(List<Integer> values) {
            addCriterion("item_agent_id in", values, "itemAgentId");
            return (Criteria) this;
        }

        public Criteria andItemAgentIdNotIn(List<Integer> values) {
            addCriterion("item_agent_id not in", values, "itemAgentId");
            return (Criteria) this;
        }

        public Criteria andItemAgentIdBetween(Integer value1, Integer value2) {
            addCriterion("item_agent_id between", value1, value2, "itemAgentId");
            return (Criteria) this;
        }

        public Criteria andItemAgentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_agent_id not between", value1, value2, "itemAgentId");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdIsNull() {
            addCriterion("union_item_id is null");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdIsNotNull() {
            addCriterion("union_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdEqualTo(Integer value) {
            addCriterion("union_item_id =", value, "unionItemId");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdNotEqualTo(Integer value) {
            addCriterion("union_item_id <>", value, "unionItemId");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdGreaterThan(Integer value) {
            addCriterion("union_item_id >", value, "unionItemId");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("union_item_id >=", value, "unionItemId");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdLessThan(Integer value) {
            addCriterion("union_item_id <", value, "unionItemId");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("union_item_id <=", value, "unionItemId");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdIn(List<Integer> values) {
            addCriterion("union_item_id in", values, "unionItemId");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdNotIn(List<Integer> values) {
            addCriterion("union_item_id not in", values, "unionItemId");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdBetween(Integer value1, Integer value2) {
            addCriterion("union_item_id between", value1, value2, "unionItemId");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("union_item_id not between", value1, value2, "unionItemId");
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

        public Criteria andCreateMemberIdIsNull() {
            addCriterion("create_member_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdIsNotNull() {
            addCriterion("create_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdEqualTo(Integer value) {
            addCriterion("create_member_id =", value, "createMemberId");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdNotEqualTo(Integer value) {
            addCriterion("create_member_id <>", value, "createMemberId");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdGreaterThan(Integer value) {
            addCriterion("create_member_id >", value, "createMemberId");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_member_id >=", value, "createMemberId");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdLessThan(Integer value) {
            addCriterion("create_member_id <", value, "createMemberId");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_member_id <=", value, "createMemberId");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdIn(List<Integer> values) {
            addCriterion("create_member_id in", values, "createMemberId");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdNotIn(List<Integer> values) {
            addCriterion("create_member_id not in", values, "createMemberId");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("create_member_id between", value1, value2, "createMemberId");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_member_id not between", value1, value2, "createMemberId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_union_item_agent表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-11-30
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_union_item_agent 2017-11-30
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