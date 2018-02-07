package com.shanyuan.platform.ms.dao.store.entity;

import java.util.ArrayList;
import java.util.List;

public class SyCircleMapplyExample {
    /**
     * sy_circle_mapply
     */
    protected String orderByClause;

    /**
     * sy_circle_mapply
     */
    protected boolean distinct;

    /**
     * sy_circle_mapply
     */
    protected List<Criteria> oredCriteria;

    public SyCircleMapplyExample() {
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
     * sy_circle_mapply 2017-10-17
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

        public Criteria andMapplyIdIsNull() {
            addCriterion("mapply_id is null");
            return (Criteria) this;
        }

        public Criteria andMapplyIdIsNotNull() {
            addCriterion("mapply_id is not null");
            return (Criteria) this;
        }

        public Criteria andMapplyIdEqualTo(Integer value) {
            addCriterion("mapply_id =", value, "mapplyId");
            return (Criteria) this;
        }

        public Criteria andMapplyIdNotEqualTo(Integer value) {
            addCriterion("mapply_id <>", value, "mapplyId");
            return (Criteria) this;
        }

        public Criteria andMapplyIdGreaterThan(Integer value) {
            addCriterion("mapply_id >", value, "mapplyId");
            return (Criteria) this;
        }

        public Criteria andMapplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mapply_id >=", value, "mapplyId");
            return (Criteria) this;
        }

        public Criteria andMapplyIdLessThan(Integer value) {
            addCriterion("mapply_id <", value, "mapplyId");
            return (Criteria) this;
        }

        public Criteria andMapplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("mapply_id <=", value, "mapplyId");
            return (Criteria) this;
        }

        public Criteria andMapplyIdIn(List<Integer> values) {
            addCriterion("mapply_id in", values, "mapplyId");
            return (Criteria) this;
        }

        public Criteria andMapplyIdNotIn(List<Integer> values) {
            addCriterion("mapply_id not in", values, "mapplyId");
            return (Criteria) this;
        }

        public Criteria andMapplyIdBetween(Integer value1, Integer value2) {
            addCriterion("mapply_id between", value1, value2, "mapplyId");
            return (Criteria) this;
        }

        public Criteria andMapplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mapply_id not between", value1, value2, "mapplyId");
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

        public Criteria andMapplyReasonIsNull() {
            addCriterion("mapply_reason is null");
            return (Criteria) this;
        }

        public Criteria andMapplyReasonIsNotNull() {
            addCriterion("mapply_reason is not null");
            return (Criteria) this;
        }

        public Criteria andMapplyReasonEqualTo(String value) {
            addCriterion("mapply_reason =", value, "mapplyReason");
            return (Criteria) this;
        }

        public Criteria andMapplyReasonNotEqualTo(String value) {
            addCriterion("mapply_reason <>", value, "mapplyReason");
            return (Criteria) this;
        }

        public Criteria andMapplyReasonGreaterThan(String value) {
            addCriterion("mapply_reason >", value, "mapplyReason");
            return (Criteria) this;
        }

        public Criteria andMapplyReasonGreaterThanOrEqualTo(String value) {
            addCriterion("mapply_reason >=", value, "mapplyReason");
            return (Criteria) this;
        }

        public Criteria andMapplyReasonLessThan(String value) {
            addCriterion("mapply_reason <", value, "mapplyReason");
            return (Criteria) this;
        }

        public Criteria andMapplyReasonLessThanOrEqualTo(String value) {
            addCriterion("mapply_reason <=", value, "mapplyReason");
            return (Criteria) this;
        }

        public Criteria andMapplyReasonLike(String value) {
            addCriterion("mapply_reason like", value, "mapplyReason");
            return (Criteria) this;
        }

        public Criteria andMapplyReasonNotLike(String value) {
            addCriterion("mapply_reason not like", value, "mapplyReason");
            return (Criteria) this;
        }

        public Criteria andMapplyReasonIn(List<String> values) {
            addCriterion("mapply_reason in", values, "mapplyReason");
            return (Criteria) this;
        }

        public Criteria andMapplyReasonNotIn(List<String> values) {
            addCriterion("mapply_reason not in", values, "mapplyReason");
            return (Criteria) this;
        }

        public Criteria andMapplyReasonBetween(String value1, String value2) {
            addCriterion("mapply_reason between", value1, value2, "mapplyReason");
            return (Criteria) this;
        }

        public Criteria andMapplyReasonNotBetween(String value1, String value2) {
            addCriterion("mapply_reason not between", value1, value2, "mapplyReason");
            return (Criteria) this;
        }

        public Criteria andMapplyTimeIsNull() {
            addCriterion("mapply_time is null");
            return (Criteria) this;
        }

        public Criteria andMapplyTimeIsNotNull() {
            addCriterion("mapply_time is not null");
            return (Criteria) this;
        }

        public Criteria andMapplyTimeEqualTo(String value) {
            addCriterion("mapply_time =", value, "mapplyTime");
            return (Criteria) this;
        }

        public Criteria andMapplyTimeNotEqualTo(String value) {
            addCriterion("mapply_time <>", value, "mapplyTime");
            return (Criteria) this;
        }

        public Criteria andMapplyTimeGreaterThan(String value) {
            addCriterion("mapply_time >", value, "mapplyTime");
            return (Criteria) this;
        }

        public Criteria andMapplyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("mapply_time >=", value, "mapplyTime");
            return (Criteria) this;
        }

        public Criteria andMapplyTimeLessThan(String value) {
            addCriterion("mapply_time <", value, "mapplyTime");
            return (Criteria) this;
        }

        public Criteria andMapplyTimeLessThanOrEqualTo(String value) {
            addCriterion("mapply_time <=", value, "mapplyTime");
            return (Criteria) this;
        }

        public Criteria andMapplyTimeLike(String value) {
            addCriterion("mapply_time like", value, "mapplyTime");
            return (Criteria) this;
        }

        public Criteria andMapplyTimeNotLike(String value) {
            addCriterion("mapply_time not like", value, "mapplyTime");
            return (Criteria) this;
        }

        public Criteria andMapplyTimeIn(List<String> values) {
            addCriterion("mapply_time in", values, "mapplyTime");
            return (Criteria) this;
        }

        public Criteria andMapplyTimeNotIn(List<String> values) {
            addCriterion("mapply_time not in", values, "mapplyTime");
            return (Criteria) this;
        }

        public Criteria andMapplyTimeBetween(String value1, String value2) {
            addCriterion("mapply_time between", value1, value2, "mapplyTime");
            return (Criteria) this;
        }

        public Criteria andMapplyTimeNotBetween(String value1, String value2) {
            addCriterion("mapply_time not between", value1, value2, "mapplyTime");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_circle_mapply表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-10-17
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_circle_mapply 2017-10-17
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