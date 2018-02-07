package com.shanyuan.platform.ms.dao.user.entity;

import java.util.ArrayList;
import java.util.List;

public class SyInviteCircleMemberExample {
    /**
     * sy_invite_circle_member
     */
    protected String orderByClause;

    /**
     * sy_invite_circle_member
     */
    protected boolean distinct;

    /**
     * sy_invite_circle_member
     */
    protected List<Criteria> oredCriteria;

    public SyInviteCircleMemberExample() {
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
     * sy_invite_circle_member 2017-10-16
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

        public Criteria andInviteMemberIdIsNull() {
            addCriterion("invite_member_id is null");
            return (Criteria) this;
        }

        public Criteria andInviteMemberIdIsNotNull() {
            addCriterion("invite_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andInviteMemberIdEqualTo(Integer value) {
            addCriterion("invite_member_id =", value, "inviteMemberId");
            return (Criteria) this;
        }

        public Criteria andInviteMemberIdNotEqualTo(Integer value) {
            addCriterion("invite_member_id <>", value, "inviteMemberId");
            return (Criteria) this;
        }

        public Criteria andInviteMemberIdGreaterThan(Integer value) {
            addCriterion("invite_member_id >", value, "inviteMemberId");
            return (Criteria) this;
        }

        public Criteria andInviteMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("invite_member_id >=", value, "inviteMemberId");
            return (Criteria) this;
        }

        public Criteria andInviteMemberIdLessThan(Integer value) {
            addCriterion("invite_member_id <", value, "inviteMemberId");
            return (Criteria) this;
        }

        public Criteria andInviteMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("invite_member_id <=", value, "inviteMemberId");
            return (Criteria) this;
        }

        public Criteria andInviteMemberIdIn(List<Integer> values) {
            addCriterion("invite_member_id in", values, "inviteMemberId");
            return (Criteria) this;
        }

        public Criteria andInviteMemberIdNotIn(List<Integer> values) {
            addCriterion("invite_member_id not in", values, "inviteMemberId");
            return (Criteria) this;
        }

        public Criteria andInviteMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("invite_member_id between", value1, value2, "inviteMemberId");
            return (Criteria) this;
        }

        public Criteria andInviteMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("invite_member_id not between", value1, value2, "inviteMemberId");
            return (Criteria) this;
        }

        public Criteria andInviteCircleIdIsNull() {
            addCriterion("invite_circle_id is null");
            return (Criteria) this;
        }

        public Criteria andInviteCircleIdIsNotNull() {
            addCriterion("invite_circle_id is not null");
            return (Criteria) this;
        }

        public Criteria andInviteCircleIdEqualTo(Integer value) {
            addCriterion("invite_circle_id =", value, "inviteCircleId");
            return (Criteria) this;
        }

        public Criteria andInviteCircleIdNotEqualTo(Integer value) {
            addCriterion("invite_circle_id <>", value, "inviteCircleId");
            return (Criteria) this;
        }

        public Criteria andInviteCircleIdGreaterThan(Integer value) {
            addCriterion("invite_circle_id >", value, "inviteCircleId");
            return (Criteria) this;
        }

        public Criteria andInviteCircleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("invite_circle_id >=", value, "inviteCircleId");
            return (Criteria) this;
        }

        public Criteria andInviteCircleIdLessThan(Integer value) {
            addCriterion("invite_circle_id <", value, "inviteCircleId");
            return (Criteria) this;
        }

        public Criteria andInviteCircleIdLessThanOrEqualTo(Integer value) {
            addCriterion("invite_circle_id <=", value, "inviteCircleId");
            return (Criteria) this;
        }

        public Criteria andInviteCircleIdIn(List<Integer> values) {
            addCriterion("invite_circle_id in", values, "inviteCircleId");
            return (Criteria) this;
        }

        public Criteria andInviteCircleIdNotIn(List<Integer> values) {
            addCriterion("invite_circle_id not in", values, "inviteCircleId");
            return (Criteria) this;
        }

        public Criteria andInviteCircleIdBetween(Integer value1, Integer value2) {
            addCriterion("invite_circle_id between", value1, value2, "inviteCircleId");
            return (Criteria) this;
        }

        public Criteria andInviteCircleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("invite_circle_id not between", value1, value2, "inviteCircleId");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("unit_name is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("unit_name =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("unit_name <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("unit_name >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("unit_name >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("unit_name <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("unit_name <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("unit_name like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("unit_name not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("unit_name in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("unit_name not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("unit_name between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("unit_name not between", value1, value2, "unitName");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_invite_circle_member表的实体类
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
     * sy_invite_circle_member 2017-10-16
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