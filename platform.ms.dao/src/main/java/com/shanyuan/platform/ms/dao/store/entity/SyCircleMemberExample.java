package com.shanyuan.platform.ms.dao.store.entity;

import java.util.ArrayList;
import java.util.List;

public class SyCircleMemberExample {
    /**
     * sy_circle_member
     */
    protected String orderByClause;

    /**
     * sy_circle_member
     */
    protected boolean distinct;

    /**
     * sy_circle_member
     */
    protected List<Criteria> oredCriteria;

    public SyCircleMemberExample() {
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
     * sy_circle_member 2017-10-17
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

        public Criteria andCircleNameIsNull() {
            addCriterion("circle_name is null");
            return (Criteria) this;
        }

        public Criteria andCircleNameIsNotNull() {
            addCriterion("circle_name is not null");
            return (Criteria) this;
        }

        public Criteria andCircleNameEqualTo(String value) {
            addCriterion("circle_name =", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameNotEqualTo(String value) {
            addCriterion("circle_name <>", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameGreaterThan(String value) {
            addCriterion("circle_name >", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameGreaterThanOrEqualTo(String value) {
            addCriterion("circle_name >=", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameLessThan(String value) {
            addCriterion("circle_name <", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameLessThanOrEqualTo(String value) {
            addCriterion("circle_name <=", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameLike(String value) {
            addCriterion("circle_name like", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameNotLike(String value) {
            addCriterion("circle_name not like", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameIn(List<String> values) {
            addCriterion("circle_name in", values, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameNotIn(List<String> values) {
            addCriterion("circle_name not in", values, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameBetween(String value1, String value2) {
            addCriterion("circle_name between", value1, value2, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameNotBetween(String value1, String value2) {
            addCriterion("circle_name not between", value1, value2, "circleName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andCmApplycontentIsNull() {
            addCriterion("cm_applycontent is null");
            return (Criteria) this;
        }

        public Criteria andCmApplycontentIsNotNull() {
            addCriterion("cm_applycontent is not null");
            return (Criteria) this;
        }

        public Criteria andCmApplycontentEqualTo(String value) {
            addCriterion("cm_applycontent =", value, "cmApplycontent");
            return (Criteria) this;
        }

        public Criteria andCmApplycontentNotEqualTo(String value) {
            addCriterion("cm_applycontent <>", value, "cmApplycontent");
            return (Criteria) this;
        }

        public Criteria andCmApplycontentGreaterThan(String value) {
            addCriterion("cm_applycontent >", value, "cmApplycontent");
            return (Criteria) this;
        }

        public Criteria andCmApplycontentGreaterThanOrEqualTo(String value) {
            addCriterion("cm_applycontent >=", value, "cmApplycontent");
            return (Criteria) this;
        }

        public Criteria andCmApplycontentLessThan(String value) {
            addCriterion("cm_applycontent <", value, "cmApplycontent");
            return (Criteria) this;
        }

        public Criteria andCmApplycontentLessThanOrEqualTo(String value) {
            addCriterion("cm_applycontent <=", value, "cmApplycontent");
            return (Criteria) this;
        }

        public Criteria andCmApplycontentLike(String value) {
            addCriterion("cm_applycontent like", value, "cmApplycontent");
            return (Criteria) this;
        }

        public Criteria andCmApplycontentNotLike(String value) {
            addCriterion("cm_applycontent not like", value, "cmApplycontent");
            return (Criteria) this;
        }

        public Criteria andCmApplycontentIn(List<String> values) {
            addCriterion("cm_applycontent in", values, "cmApplycontent");
            return (Criteria) this;
        }

        public Criteria andCmApplycontentNotIn(List<String> values) {
            addCriterion("cm_applycontent not in", values, "cmApplycontent");
            return (Criteria) this;
        }

        public Criteria andCmApplycontentBetween(String value1, String value2) {
            addCriterion("cm_applycontent between", value1, value2, "cmApplycontent");
            return (Criteria) this;
        }

        public Criteria andCmApplycontentNotBetween(String value1, String value2) {
            addCriterion("cm_applycontent not between", value1, value2, "cmApplycontent");
            return (Criteria) this;
        }

        public Criteria andCmApplytimeIsNull() {
            addCriterion("cm_applytime is null");
            return (Criteria) this;
        }

        public Criteria andCmApplytimeIsNotNull() {
            addCriterion("cm_applytime is not null");
            return (Criteria) this;
        }

        public Criteria andCmApplytimeEqualTo(String value) {
            addCriterion("cm_applytime =", value, "cmApplytime");
            return (Criteria) this;
        }

        public Criteria andCmApplytimeNotEqualTo(String value) {
            addCriterion("cm_applytime <>", value, "cmApplytime");
            return (Criteria) this;
        }

        public Criteria andCmApplytimeGreaterThan(String value) {
            addCriterion("cm_applytime >", value, "cmApplytime");
            return (Criteria) this;
        }

        public Criteria andCmApplytimeGreaterThanOrEqualTo(String value) {
            addCriterion("cm_applytime >=", value, "cmApplytime");
            return (Criteria) this;
        }

        public Criteria andCmApplytimeLessThan(String value) {
            addCriterion("cm_applytime <", value, "cmApplytime");
            return (Criteria) this;
        }

        public Criteria andCmApplytimeLessThanOrEqualTo(String value) {
            addCriterion("cm_applytime <=", value, "cmApplytime");
            return (Criteria) this;
        }

        public Criteria andCmApplytimeLike(String value) {
            addCriterion("cm_applytime like", value, "cmApplytime");
            return (Criteria) this;
        }

        public Criteria andCmApplytimeNotLike(String value) {
            addCriterion("cm_applytime not like", value, "cmApplytime");
            return (Criteria) this;
        }

        public Criteria andCmApplytimeIn(List<String> values) {
            addCriterion("cm_applytime in", values, "cmApplytime");
            return (Criteria) this;
        }

        public Criteria andCmApplytimeNotIn(List<String> values) {
            addCriterion("cm_applytime not in", values, "cmApplytime");
            return (Criteria) this;
        }

        public Criteria andCmApplytimeBetween(String value1, String value2) {
            addCriterion("cm_applytime between", value1, value2, "cmApplytime");
            return (Criteria) this;
        }

        public Criteria andCmApplytimeNotBetween(String value1, String value2) {
            addCriterion("cm_applytime not between", value1, value2, "cmApplytime");
            return (Criteria) this;
        }

        public Criteria andCmStateIsNull() {
            addCriterion("cm_state is null");
            return (Criteria) this;
        }

        public Criteria andCmStateIsNotNull() {
            addCriterion("cm_state is not null");
            return (Criteria) this;
        }

        public Criteria andCmStateEqualTo(Byte value) {
            addCriterion("cm_state =", value, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateNotEqualTo(Byte value) {
            addCriterion("cm_state <>", value, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateGreaterThan(Byte value) {
            addCriterion("cm_state >", value, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("cm_state >=", value, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateLessThan(Byte value) {
            addCriterion("cm_state <", value, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateLessThanOrEqualTo(Byte value) {
            addCriterion("cm_state <=", value, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateIn(List<Byte> values) {
            addCriterion("cm_state in", values, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateNotIn(List<Byte> values) {
            addCriterion("cm_state not in", values, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateBetween(Byte value1, Byte value2) {
            addCriterion("cm_state between", value1, value2, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateNotBetween(Byte value1, Byte value2) {
            addCriterion("cm_state not between", value1, value2, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmIntroIsNull() {
            addCriterion("cm_intro is null");
            return (Criteria) this;
        }

        public Criteria andCmIntroIsNotNull() {
            addCriterion("cm_intro is not null");
            return (Criteria) this;
        }

        public Criteria andCmIntroEqualTo(String value) {
            addCriterion("cm_intro =", value, "cmIntro");
            return (Criteria) this;
        }

        public Criteria andCmIntroNotEqualTo(String value) {
            addCriterion("cm_intro <>", value, "cmIntro");
            return (Criteria) this;
        }

        public Criteria andCmIntroGreaterThan(String value) {
            addCriterion("cm_intro >", value, "cmIntro");
            return (Criteria) this;
        }

        public Criteria andCmIntroGreaterThanOrEqualTo(String value) {
            addCriterion("cm_intro >=", value, "cmIntro");
            return (Criteria) this;
        }

        public Criteria andCmIntroLessThan(String value) {
            addCriterion("cm_intro <", value, "cmIntro");
            return (Criteria) this;
        }

        public Criteria andCmIntroLessThanOrEqualTo(String value) {
            addCriterion("cm_intro <=", value, "cmIntro");
            return (Criteria) this;
        }

        public Criteria andCmIntroLike(String value) {
            addCriterion("cm_intro like", value, "cmIntro");
            return (Criteria) this;
        }

        public Criteria andCmIntroNotLike(String value) {
            addCriterion("cm_intro not like", value, "cmIntro");
            return (Criteria) this;
        }

        public Criteria andCmIntroIn(List<String> values) {
            addCriterion("cm_intro in", values, "cmIntro");
            return (Criteria) this;
        }

        public Criteria andCmIntroNotIn(List<String> values) {
            addCriterion("cm_intro not in", values, "cmIntro");
            return (Criteria) this;
        }

        public Criteria andCmIntroBetween(String value1, String value2) {
            addCriterion("cm_intro between", value1, value2, "cmIntro");
            return (Criteria) this;
        }

        public Criteria andCmIntroNotBetween(String value1, String value2) {
            addCriterion("cm_intro not between", value1, value2, "cmIntro");
            return (Criteria) this;
        }

        public Criteria andCmJointimeIsNull() {
            addCriterion("cm_jointime is null");
            return (Criteria) this;
        }

        public Criteria andCmJointimeIsNotNull() {
            addCriterion("cm_jointime is not null");
            return (Criteria) this;
        }

        public Criteria andCmJointimeEqualTo(String value) {
            addCriterion("cm_jointime =", value, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmJointimeNotEqualTo(String value) {
            addCriterion("cm_jointime <>", value, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmJointimeGreaterThan(String value) {
            addCriterion("cm_jointime >", value, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmJointimeGreaterThanOrEqualTo(String value) {
            addCriterion("cm_jointime >=", value, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmJointimeLessThan(String value) {
            addCriterion("cm_jointime <", value, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmJointimeLessThanOrEqualTo(String value) {
            addCriterion("cm_jointime <=", value, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmJointimeLike(String value) {
            addCriterion("cm_jointime like", value, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmJointimeNotLike(String value) {
            addCriterion("cm_jointime not like", value, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmJointimeIn(List<String> values) {
            addCriterion("cm_jointime in", values, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmJointimeNotIn(List<String> values) {
            addCriterion("cm_jointime not in", values, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmJointimeBetween(String value1, String value2) {
            addCriterion("cm_jointime between", value1, value2, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmJointimeNotBetween(String value1, String value2) {
            addCriterion("cm_jointime not between", value1, value2, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmLevelIsNull() {
            addCriterion("cm_level is null");
            return (Criteria) this;
        }

        public Criteria andCmLevelIsNotNull() {
            addCriterion("cm_level is not null");
            return (Criteria) this;
        }

        public Criteria andCmLevelEqualTo(Integer value) {
            addCriterion("cm_level =", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelNotEqualTo(Integer value) {
            addCriterion("cm_level <>", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelGreaterThan(Integer value) {
            addCriterion("cm_level >", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_level >=", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelLessThan(Integer value) {
            addCriterion("cm_level <", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelLessThanOrEqualTo(Integer value) {
            addCriterion("cm_level <=", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelIn(List<Integer> values) {
            addCriterion("cm_level in", values, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelNotIn(List<Integer> values) {
            addCriterion("cm_level not in", values, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelBetween(Integer value1, Integer value2) {
            addCriterion("cm_level between", value1, value2, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_level not between", value1, value2, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelnameIsNull() {
            addCriterion("cm_levelname is null");
            return (Criteria) this;
        }

        public Criteria andCmLevelnameIsNotNull() {
            addCriterion("cm_levelname is not null");
            return (Criteria) this;
        }

        public Criteria andCmLevelnameEqualTo(String value) {
            addCriterion("cm_levelname =", value, "cmLevelname");
            return (Criteria) this;
        }

        public Criteria andCmLevelnameNotEqualTo(String value) {
            addCriterion("cm_levelname <>", value, "cmLevelname");
            return (Criteria) this;
        }

        public Criteria andCmLevelnameGreaterThan(String value) {
            addCriterion("cm_levelname >", value, "cmLevelname");
            return (Criteria) this;
        }

        public Criteria andCmLevelnameGreaterThanOrEqualTo(String value) {
            addCriterion("cm_levelname >=", value, "cmLevelname");
            return (Criteria) this;
        }

        public Criteria andCmLevelnameLessThan(String value) {
            addCriterion("cm_levelname <", value, "cmLevelname");
            return (Criteria) this;
        }

        public Criteria andCmLevelnameLessThanOrEqualTo(String value) {
            addCriterion("cm_levelname <=", value, "cmLevelname");
            return (Criteria) this;
        }

        public Criteria andCmLevelnameLike(String value) {
            addCriterion("cm_levelname like", value, "cmLevelname");
            return (Criteria) this;
        }

        public Criteria andCmLevelnameNotLike(String value) {
            addCriterion("cm_levelname not like", value, "cmLevelname");
            return (Criteria) this;
        }

        public Criteria andCmLevelnameIn(List<String> values) {
            addCriterion("cm_levelname in", values, "cmLevelname");
            return (Criteria) this;
        }

        public Criteria andCmLevelnameNotIn(List<String> values) {
            addCriterion("cm_levelname not in", values, "cmLevelname");
            return (Criteria) this;
        }

        public Criteria andCmLevelnameBetween(String value1, String value2) {
            addCriterion("cm_levelname between", value1, value2, "cmLevelname");
            return (Criteria) this;
        }

        public Criteria andCmLevelnameNotBetween(String value1, String value2) {
            addCriterion("cm_levelname not between", value1, value2, "cmLevelname");
            return (Criteria) this;
        }

        public Criteria andCmExpIsNull() {
            addCriterion("cm_exp is null");
            return (Criteria) this;
        }

        public Criteria andCmExpIsNotNull() {
            addCriterion("cm_exp is not null");
            return (Criteria) this;
        }

        public Criteria andCmExpEqualTo(Integer value) {
            addCriterion("cm_exp =", value, "cmExp");
            return (Criteria) this;
        }

        public Criteria andCmExpNotEqualTo(Integer value) {
            addCriterion("cm_exp <>", value, "cmExp");
            return (Criteria) this;
        }

        public Criteria andCmExpGreaterThan(Integer value) {
            addCriterion("cm_exp >", value, "cmExp");
            return (Criteria) this;
        }

        public Criteria andCmExpGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_exp >=", value, "cmExp");
            return (Criteria) this;
        }

        public Criteria andCmExpLessThan(Integer value) {
            addCriterion("cm_exp <", value, "cmExp");
            return (Criteria) this;
        }

        public Criteria andCmExpLessThanOrEqualTo(Integer value) {
            addCriterion("cm_exp <=", value, "cmExp");
            return (Criteria) this;
        }

        public Criteria andCmExpIn(List<Integer> values) {
            addCriterion("cm_exp in", values, "cmExp");
            return (Criteria) this;
        }

        public Criteria andCmExpNotIn(List<Integer> values) {
            addCriterion("cm_exp not in", values, "cmExp");
            return (Criteria) this;
        }

        public Criteria andCmExpBetween(Integer value1, Integer value2) {
            addCriterion("cm_exp between", value1, value2, "cmExp");
            return (Criteria) this;
        }

        public Criteria andCmExpNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_exp not between", value1, value2, "cmExp");
            return (Criteria) this;
        }

        public Criteria andCmNextexpIsNull() {
            addCriterion("cm_nextexp is null");
            return (Criteria) this;
        }

        public Criteria andCmNextexpIsNotNull() {
            addCriterion("cm_nextexp is not null");
            return (Criteria) this;
        }

        public Criteria andCmNextexpEqualTo(Integer value) {
            addCriterion("cm_nextexp =", value, "cmNextexp");
            return (Criteria) this;
        }

        public Criteria andCmNextexpNotEqualTo(Integer value) {
            addCriterion("cm_nextexp <>", value, "cmNextexp");
            return (Criteria) this;
        }

        public Criteria andCmNextexpGreaterThan(Integer value) {
            addCriterion("cm_nextexp >", value, "cmNextexp");
            return (Criteria) this;
        }

        public Criteria andCmNextexpGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_nextexp >=", value, "cmNextexp");
            return (Criteria) this;
        }

        public Criteria andCmNextexpLessThan(Integer value) {
            addCriterion("cm_nextexp <", value, "cmNextexp");
            return (Criteria) this;
        }

        public Criteria andCmNextexpLessThanOrEqualTo(Integer value) {
            addCriterion("cm_nextexp <=", value, "cmNextexp");
            return (Criteria) this;
        }

        public Criteria andCmNextexpIn(List<Integer> values) {
            addCriterion("cm_nextexp in", values, "cmNextexp");
            return (Criteria) this;
        }

        public Criteria andCmNextexpNotIn(List<Integer> values) {
            addCriterion("cm_nextexp not in", values, "cmNextexp");
            return (Criteria) this;
        }

        public Criteria andCmNextexpBetween(Integer value1, Integer value2) {
            addCriterion("cm_nextexp between", value1, value2, "cmNextexp");
            return (Criteria) this;
        }

        public Criteria andCmNextexpNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_nextexp not between", value1, value2, "cmNextexp");
            return (Criteria) this;
        }

        public Criteria andIsIdentityIsNull() {
            addCriterion("is_identity is null");
            return (Criteria) this;
        }

        public Criteria andIsIdentityIsNotNull() {
            addCriterion("is_identity is not null");
            return (Criteria) this;
        }

        public Criteria andIsIdentityEqualTo(Byte value) {
            addCriterion("is_identity =", value, "isIdentity");
            return (Criteria) this;
        }

        public Criteria andIsIdentityNotEqualTo(Byte value) {
            addCriterion("is_identity <>", value, "isIdentity");
            return (Criteria) this;
        }

        public Criteria andIsIdentityGreaterThan(Byte value) {
            addCriterion("is_identity >", value, "isIdentity");
            return (Criteria) this;
        }

        public Criteria andIsIdentityGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_identity >=", value, "isIdentity");
            return (Criteria) this;
        }

        public Criteria andIsIdentityLessThan(Byte value) {
            addCriterion("is_identity <", value, "isIdentity");
            return (Criteria) this;
        }

        public Criteria andIsIdentityLessThanOrEqualTo(Byte value) {
            addCriterion("is_identity <=", value, "isIdentity");
            return (Criteria) this;
        }

        public Criteria andIsIdentityIn(List<Byte> values) {
            addCriterion("is_identity in", values, "isIdentity");
            return (Criteria) this;
        }

        public Criteria andIsIdentityNotIn(List<Byte> values) {
            addCriterion("is_identity not in", values, "isIdentity");
            return (Criteria) this;
        }

        public Criteria andIsIdentityBetween(Byte value1, Byte value2) {
            addCriterion("is_identity between", value1, value2, "isIdentity");
            return (Criteria) this;
        }

        public Criteria andIsIdentityNotBetween(Byte value1, Byte value2) {
            addCriterion("is_identity not between", value1, value2, "isIdentity");
            return (Criteria) this;
        }

        public Criteria andIsAllowspeakIsNull() {
            addCriterion("is_allowspeak is null");
            return (Criteria) this;
        }

        public Criteria andIsAllowspeakIsNotNull() {
            addCriterion("is_allowspeak is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllowspeakEqualTo(Byte value) {
            addCriterion("is_allowspeak =", value, "isAllowspeak");
            return (Criteria) this;
        }

        public Criteria andIsAllowspeakNotEqualTo(Byte value) {
            addCriterion("is_allowspeak <>", value, "isAllowspeak");
            return (Criteria) this;
        }

        public Criteria andIsAllowspeakGreaterThan(Byte value) {
            addCriterion("is_allowspeak >", value, "isAllowspeak");
            return (Criteria) this;
        }

        public Criteria andIsAllowspeakGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_allowspeak >=", value, "isAllowspeak");
            return (Criteria) this;
        }

        public Criteria andIsAllowspeakLessThan(Byte value) {
            addCriterion("is_allowspeak <", value, "isAllowspeak");
            return (Criteria) this;
        }

        public Criteria andIsAllowspeakLessThanOrEqualTo(Byte value) {
            addCriterion("is_allowspeak <=", value, "isAllowspeak");
            return (Criteria) this;
        }

        public Criteria andIsAllowspeakIn(List<Byte> values) {
            addCriterion("is_allowspeak in", values, "isAllowspeak");
            return (Criteria) this;
        }

        public Criteria andIsAllowspeakNotIn(List<Byte> values) {
            addCriterion("is_allowspeak not in", values, "isAllowspeak");
            return (Criteria) this;
        }

        public Criteria andIsAllowspeakBetween(Byte value1, Byte value2) {
            addCriterion("is_allowspeak between", value1, value2, "isAllowspeak");
            return (Criteria) this;
        }

        public Criteria andIsAllowspeakNotBetween(Byte value1, Byte value2) {
            addCriterion("is_allowspeak not between", value1, value2, "isAllowspeak");
            return (Criteria) this;
        }

        public Criteria andIsStarIsNull() {
            addCriterion("is_star is null");
            return (Criteria) this;
        }

        public Criteria andIsStarIsNotNull() {
            addCriterion("is_star is not null");
            return (Criteria) this;
        }

        public Criteria andIsStarEqualTo(Byte value) {
            addCriterion("is_star =", value, "isStar");
            return (Criteria) this;
        }

        public Criteria andIsStarNotEqualTo(Byte value) {
            addCriterion("is_star <>", value, "isStar");
            return (Criteria) this;
        }

        public Criteria andIsStarGreaterThan(Byte value) {
            addCriterion("is_star >", value, "isStar");
            return (Criteria) this;
        }

        public Criteria andIsStarGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_star >=", value, "isStar");
            return (Criteria) this;
        }

        public Criteria andIsStarLessThan(Byte value) {
            addCriterion("is_star <", value, "isStar");
            return (Criteria) this;
        }

        public Criteria andIsStarLessThanOrEqualTo(Byte value) {
            addCriterion("is_star <=", value, "isStar");
            return (Criteria) this;
        }

        public Criteria andIsStarIn(List<Byte> values) {
            addCriterion("is_star in", values, "isStar");
            return (Criteria) this;
        }

        public Criteria andIsStarNotIn(List<Byte> values) {
            addCriterion("is_star not in", values, "isStar");
            return (Criteria) this;
        }

        public Criteria andIsStarBetween(Byte value1, Byte value2) {
            addCriterion("is_star between", value1, value2, "isStar");
            return (Criteria) this;
        }

        public Criteria andIsStarNotBetween(Byte value1, Byte value2) {
            addCriterion("is_star not between", value1, value2, "isStar");
            return (Criteria) this;
        }

        public Criteria andCmThcountIsNull() {
            addCriterion("cm_thcount is null");
            return (Criteria) this;
        }

        public Criteria andCmThcountIsNotNull() {
            addCriterion("cm_thcount is not null");
            return (Criteria) this;
        }

        public Criteria andCmThcountEqualTo(Integer value) {
            addCriterion("cm_thcount =", value, "cmThcount");
            return (Criteria) this;
        }

        public Criteria andCmThcountNotEqualTo(Integer value) {
            addCriterion("cm_thcount <>", value, "cmThcount");
            return (Criteria) this;
        }

        public Criteria andCmThcountGreaterThan(Integer value) {
            addCriterion("cm_thcount >", value, "cmThcount");
            return (Criteria) this;
        }

        public Criteria andCmThcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_thcount >=", value, "cmThcount");
            return (Criteria) this;
        }

        public Criteria andCmThcountLessThan(Integer value) {
            addCriterion("cm_thcount <", value, "cmThcount");
            return (Criteria) this;
        }

        public Criteria andCmThcountLessThanOrEqualTo(Integer value) {
            addCriterion("cm_thcount <=", value, "cmThcount");
            return (Criteria) this;
        }

        public Criteria andCmThcountIn(List<Integer> values) {
            addCriterion("cm_thcount in", values, "cmThcount");
            return (Criteria) this;
        }

        public Criteria andCmThcountNotIn(List<Integer> values) {
            addCriterion("cm_thcount not in", values, "cmThcount");
            return (Criteria) this;
        }

        public Criteria andCmThcountBetween(Integer value1, Integer value2) {
            addCriterion("cm_thcount between", value1, value2, "cmThcount");
            return (Criteria) this;
        }

        public Criteria andCmThcountNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_thcount not between", value1, value2, "cmThcount");
            return (Criteria) this;
        }

        public Criteria andCmComcountIsNull() {
            addCriterion("cm_comcount is null");
            return (Criteria) this;
        }

        public Criteria andCmComcountIsNotNull() {
            addCriterion("cm_comcount is not null");
            return (Criteria) this;
        }

        public Criteria andCmComcountEqualTo(Integer value) {
            addCriterion("cm_comcount =", value, "cmComcount");
            return (Criteria) this;
        }

        public Criteria andCmComcountNotEqualTo(Integer value) {
            addCriterion("cm_comcount <>", value, "cmComcount");
            return (Criteria) this;
        }

        public Criteria andCmComcountGreaterThan(Integer value) {
            addCriterion("cm_comcount >", value, "cmComcount");
            return (Criteria) this;
        }

        public Criteria andCmComcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_comcount >=", value, "cmComcount");
            return (Criteria) this;
        }

        public Criteria andCmComcountLessThan(Integer value) {
            addCriterion("cm_comcount <", value, "cmComcount");
            return (Criteria) this;
        }

        public Criteria andCmComcountLessThanOrEqualTo(Integer value) {
            addCriterion("cm_comcount <=", value, "cmComcount");
            return (Criteria) this;
        }

        public Criteria andCmComcountIn(List<Integer> values) {
            addCriterion("cm_comcount in", values, "cmComcount");
            return (Criteria) this;
        }

        public Criteria andCmComcountNotIn(List<Integer> values) {
            addCriterion("cm_comcount not in", values, "cmComcount");
            return (Criteria) this;
        }

        public Criteria andCmComcountBetween(Integer value1, Integer value2) {
            addCriterion("cm_comcount between", value1, value2, "cmComcount");
            return (Criteria) this;
        }

        public Criteria andCmComcountNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_comcount not between", value1, value2, "cmComcount");
            return (Criteria) this;
        }

        public Criteria andCmLastspeaktimeIsNull() {
            addCriterion("cm_lastspeaktime is null");
            return (Criteria) this;
        }

        public Criteria andCmLastspeaktimeIsNotNull() {
            addCriterion("cm_lastspeaktime is not null");
            return (Criteria) this;
        }

        public Criteria andCmLastspeaktimeEqualTo(String value) {
            addCriterion("cm_lastspeaktime =", value, "cmLastspeaktime");
            return (Criteria) this;
        }

        public Criteria andCmLastspeaktimeNotEqualTo(String value) {
            addCriterion("cm_lastspeaktime <>", value, "cmLastspeaktime");
            return (Criteria) this;
        }

        public Criteria andCmLastspeaktimeGreaterThan(String value) {
            addCriterion("cm_lastspeaktime >", value, "cmLastspeaktime");
            return (Criteria) this;
        }

        public Criteria andCmLastspeaktimeGreaterThanOrEqualTo(String value) {
            addCriterion("cm_lastspeaktime >=", value, "cmLastspeaktime");
            return (Criteria) this;
        }

        public Criteria andCmLastspeaktimeLessThan(String value) {
            addCriterion("cm_lastspeaktime <", value, "cmLastspeaktime");
            return (Criteria) this;
        }

        public Criteria andCmLastspeaktimeLessThanOrEqualTo(String value) {
            addCriterion("cm_lastspeaktime <=", value, "cmLastspeaktime");
            return (Criteria) this;
        }

        public Criteria andCmLastspeaktimeLike(String value) {
            addCriterion("cm_lastspeaktime like", value, "cmLastspeaktime");
            return (Criteria) this;
        }

        public Criteria andCmLastspeaktimeNotLike(String value) {
            addCriterion("cm_lastspeaktime not like", value, "cmLastspeaktime");
            return (Criteria) this;
        }

        public Criteria andCmLastspeaktimeIn(List<String> values) {
            addCriterion("cm_lastspeaktime in", values, "cmLastspeaktime");
            return (Criteria) this;
        }

        public Criteria andCmLastspeaktimeNotIn(List<String> values) {
            addCriterion("cm_lastspeaktime not in", values, "cmLastspeaktime");
            return (Criteria) this;
        }

        public Criteria andCmLastspeaktimeBetween(String value1, String value2) {
            addCriterion("cm_lastspeaktime between", value1, value2, "cmLastspeaktime");
            return (Criteria) this;
        }

        public Criteria andCmLastspeaktimeNotBetween(String value1, String value2) {
            addCriterion("cm_lastspeaktime not between", value1, value2, "cmLastspeaktime");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNull() {
            addCriterion("is_recommend is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNotNull() {
            addCriterion("is_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendEqualTo(Byte value) {
            addCriterion("is_recommend =", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotEqualTo(Byte value) {
            addCriterion("is_recommend <>", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThan(Byte value) {
            addCriterion("is_recommend >", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_recommend >=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThan(Byte value) {
            addCriterion("is_recommend <", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThanOrEqualTo(Byte value) {
            addCriterion("is_recommend <=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIn(List<Byte> values) {
            addCriterion("is_recommend in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotIn(List<Byte> values) {
            addCriterion("is_recommend not in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendBetween(Byte value1, Byte value2) {
            addCriterion("is_recommend between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotBetween(Byte value1, Byte value2) {
            addCriterion("is_recommend not between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Integer value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Integer value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Integer value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Integer> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Integer> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andSendmsgStateIsNull() {
            addCriterion("sendmsg_state is null");
            return (Criteria) this;
        }

        public Criteria andSendmsgStateIsNotNull() {
            addCriterion("sendmsg_state is not null");
            return (Criteria) this;
        }

        public Criteria andSendmsgStateEqualTo(Byte value) {
            addCriterion("sendmsg_state =", value, "sendmsgState");
            return (Criteria) this;
        }

        public Criteria andSendmsgStateNotEqualTo(Byte value) {
            addCriterion("sendmsg_state <>", value, "sendmsgState");
            return (Criteria) this;
        }

        public Criteria andSendmsgStateGreaterThan(Byte value) {
            addCriterion("sendmsg_state >", value, "sendmsgState");
            return (Criteria) this;
        }

        public Criteria andSendmsgStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("sendmsg_state >=", value, "sendmsgState");
            return (Criteria) this;
        }

        public Criteria andSendmsgStateLessThan(Byte value) {
            addCriterion("sendmsg_state <", value, "sendmsgState");
            return (Criteria) this;
        }

        public Criteria andSendmsgStateLessThanOrEqualTo(Byte value) {
            addCriterion("sendmsg_state <=", value, "sendmsgState");
            return (Criteria) this;
        }

        public Criteria andSendmsgStateIn(List<Byte> values) {
            addCriterion("sendmsg_state in", values, "sendmsgState");
            return (Criteria) this;
        }

        public Criteria andSendmsgStateNotIn(List<Byte> values) {
            addCriterion("sendmsg_state not in", values, "sendmsgState");
            return (Criteria) this;
        }

        public Criteria andSendmsgStateBetween(Byte value1, Byte value2) {
            addCriterion("sendmsg_state between", value1, value2, "sendmsgState");
            return (Criteria) this;
        }

        public Criteria andSendmsgStateNotBetween(Byte value1, Byte value2) {
            addCriterion("sendmsg_state not between", value1, value2, "sendmsgState");
            return (Criteria) this;
        }

        public Criteria andIssendingIsNull() {
            addCriterion("issending is null");
            return (Criteria) this;
        }

        public Criteria andIssendingIsNotNull() {
            addCriterion("issending is not null");
            return (Criteria) this;
        }

        public Criteria andIssendingEqualTo(Byte value) {
            addCriterion("issending =", value, "issending");
            return (Criteria) this;
        }

        public Criteria andIssendingNotEqualTo(Byte value) {
            addCriterion("issending <>", value, "issending");
            return (Criteria) this;
        }

        public Criteria andIssendingGreaterThan(Byte value) {
            addCriterion("issending >", value, "issending");
            return (Criteria) this;
        }

        public Criteria andIssendingGreaterThanOrEqualTo(Byte value) {
            addCriterion("issending >=", value, "issending");
            return (Criteria) this;
        }

        public Criteria andIssendingLessThan(Byte value) {
            addCriterion("issending <", value, "issending");
            return (Criteria) this;
        }

        public Criteria andIssendingLessThanOrEqualTo(Byte value) {
            addCriterion("issending <=", value, "issending");
            return (Criteria) this;
        }

        public Criteria andIssendingIn(List<Byte> values) {
            addCriterion("issending in", values, "issending");
            return (Criteria) this;
        }

        public Criteria andIssendingNotIn(List<Byte> values) {
            addCriterion("issending not in", values, "issending");
            return (Criteria) this;
        }

        public Criteria andIssendingBetween(Byte value1, Byte value2) {
            addCriterion("issending between", value1, value2, "issending");
            return (Criteria) this;
        }

        public Criteria andIssendingNotBetween(Byte value1, Byte value2) {
            addCriterion("issending not between", value1, value2, "issending");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andEmpNoIsNull() {
            addCriterion("emp_no is null");
            return (Criteria) this;
        }

        public Criteria andEmpNoIsNotNull() {
            addCriterion("emp_no is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNoEqualTo(String value) {
            addCriterion("emp_no =", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotEqualTo(String value) {
            addCriterion("emp_no <>", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThan(String value) {
            addCriterion("emp_no >", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThanOrEqualTo(String value) {
            addCriterion("emp_no >=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThan(String value) {
            addCriterion("emp_no <", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThanOrEqualTo(String value) {
            addCriterion("emp_no <=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLike(String value) {
            addCriterion("emp_no like", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotLike(String value) {
            addCriterion("emp_no not like", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoIn(List<String> values) {
            addCriterion("emp_no in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotIn(List<String> values) {
            addCriterion("emp_no not in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoBetween(String value1, String value2) {
            addCriterion("emp_no between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotBetween(String value1, String value2) {
            addCriterion("emp_no not between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andCmTagIsNull() {
            addCriterion("cm_tag is null");
            return (Criteria) this;
        }

        public Criteria andCmTagIsNotNull() {
            addCriterion("cm_tag is not null");
            return (Criteria) this;
        }

        public Criteria andCmTagEqualTo(String value) {
            addCriterion("cm_tag =", value, "cmTag");
            return (Criteria) this;
        }

        public Criteria andCmTagNotEqualTo(String value) {
            addCriterion("cm_tag <>", value, "cmTag");
            return (Criteria) this;
        }

        public Criteria andCmTagGreaterThan(String value) {
            addCriterion("cm_tag >", value, "cmTag");
            return (Criteria) this;
        }

        public Criteria andCmTagGreaterThanOrEqualTo(String value) {
            addCriterion("cm_tag >=", value, "cmTag");
            return (Criteria) this;
        }

        public Criteria andCmTagLessThan(String value) {
            addCriterion("cm_tag <", value, "cmTag");
            return (Criteria) this;
        }

        public Criteria andCmTagLessThanOrEqualTo(String value) {
            addCriterion("cm_tag <=", value, "cmTag");
            return (Criteria) this;
        }

        public Criteria andCmTagLike(String value) {
            addCriterion("cm_tag like", value, "cmTag");
            return (Criteria) this;
        }

        public Criteria andCmTagNotLike(String value) {
            addCriterion("cm_tag not like", value, "cmTag");
            return (Criteria) this;
        }

        public Criteria andCmTagIn(List<String> values) {
            addCriterion("cm_tag in", values, "cmTag");
            return (Criteria) this;
        }

        public Criteria andCmTagNotIn(List<String> values) {
            addCriterion("cm_tag not in", values, "cmTag");
            return (Criteria) this;
        }

        public Criteria andCmTagBetween(String value1, String value2) {
            addCriterion("cm_tag between", value1, value2, "cmTag");
            return (Criteria) this;
        }

        public Criteria andCmTagNotBetween(String value1, String value2) {
            addCriterion("cm_tag not between", value1, value2, "cmTag");
            return (Criteria) this;
        }

        public Criteria andDeptTag1IsNull() {
            addCriterion("dept_tag1 is null");
            return (Criteria) this;
        }

        public Criteria andDeptTag1IsNotNull() {
            addCriterion("dept_tag1 is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTag1EqualTo(String value) {
            addCriterion("dept_tag1 =", value, "deptTag1");
            return (Criteria) this;
        }

        public Criteria andDeptTag1NotEqualTo(String value) {
            addCriterion("dept_tag1 <>", value, "deptTag1");
            return (Criteria) this;
        }

        public Criteria andDeptTag1GreaterThan(String value) {
            addCriterion("dept_tag1 >", value, "deptTag1");
            return (Criteria) this;
        }

        public Criteria andDeptTag1GreaterThanOrEqualTo(String value) {
            addCriterion("dept_tag1 >=", value, "deptTag1");
            return (Criteria) this;
        }

        public Criteria andDeptTag1LessThan(String value) {
            addCriterion("dept_tag1 <", value, "deptTag1");
            return (Criteria) this;
        }

        public Criteria andDeptTag1LessThanOrEqualTo(String value) {
            addCriterion("dept_tag1 <=", value, "deptTag1");
            return (Criteria) this;
        }

        public Criteria andDeptTag1Like(String value) {
            addCriterion("dept_tag1 like", value, "deptTag1");
            return (Criteria) this;
        }

        public Criteria andDeptTag1NotLike(String value) {
            addCriterion("dept_tag1 not like", value, "deptTag1");
            return (Criteria) this;
        }

        public Criteria andDeptTag1In(List<String> values) {
            addCriterion("dept_tag1 in", values, "deptTag1");
            return (Criteria) this;
        }

        public Criteria andDeptTag1NotIn(List<String> values) {
            addCriterion("dept_tag1 not in", values, "deptTag1");
            return (Criteria) this;
        }

        public Criteria andDeptTag1Between(String value1, String value2) {
            addCriterion("dept_tag1 between", value1, value2, "deptTag1");
            return (Criteria) this;
        }

        public Criteria andDeptTag1NotBetween(String value1, String value2) {
            addCriterion("dept_tag1 not between", value1, value2, "deptTag1");
            return (Criteria) this;
        }

        public Criteria andDeptTag2IsNull() {
            addCriterion("dept_tag2 is null");
            return (Criteria) this;
        }

        public Criteria andDeptTag2IsNotNull() {
            addCriterion("dept_tag2 is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTag2EqualTo(String value) {
            addCriterion("dept_tag2 =", value, "deptTag2");
            return (Criteria) this;
        }

        public Criteria andDeptTag2NotEqualTo(String value) {
            addCriterion("dept_tag2 <>", value, "deptTag2");
            return (Criteria) this;
        }

        public Criteria andDeptTag2GreaterThan(String value) {
            addCriterion("dept_tag2 >", value, "deptTag2");
            return (Criteria) this;
        }

        public Criteria andDeptTag2GreaterThanOrEqualTo(String value) {
            addCriterion("dept_tag2 >=", value, "deptTag2");
            return (Criteria) this;
        }

        public Criteria andDeptTag2LessThan(String value) {
            addCriterion("dept_tag2 <", value, "deptTag2");
            return (Criteria) this;
        }

        public Criteria andDeptTag2LessThanOrEqualTo(String value) {
            addCriterion("dept_tag2 <=", value, "deptTag2");
            return (Criteria) this;
        }

        public Criteria andDeptTag2Like(String value) {
            addCriterion("dept_tag2 like", value, "deptTag2");
            return (Criteria) this;
        }

        public Criteria andDeptTag2NotLike(String value) {
            addCriterion("dept_tag2 not like", value, "deptTag2");
            return (Criteria) this;
        }

        public Criteria andDeptTag2In(List<String> values) {
            addCriterion("dept_tag2 in", values, "deptTag2");
            return (Criteria) this;
        }

        public Criteria andDeptTag2NotIn(List<String> values) {
            addCriterion("dept_tag2 not in", values, "deptTag2");
            return (Criteria) this;
        }

        public Criteria andDeptTag2Between(String value1, String value2) {
            addCriterion("dept_tag2 between", value1, value2, "deptTag2");
            return (Criteria) this;
        }

        public Criteria andDeptTag2NotBetween(String value1, String value2) {
            addCriterion("dept_tag2 not between", value1, value2, "deptTag2");
            return (Criteria) this;
        }

        public Criteria andDeptTag3IsNull() {
            addCriterion("dept_tag3 is null");
            return (Criteria) this;
        }

        public Criteria andDeptTag3IsNotNull() {
            addCriterion("dept_tag3 is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTag3EqualTo(String value) {
            addCriterion("dept_tag3 =", value, "deptTag3");
            return (Criteria) this;
        }

        public Criteria andDeptTag3NotEqualTo(String value) {
            addCriterion("dept_tag3 <>", value, "deptTag3");
            return (Criteria) this;
        }

        public Criteria andDeptTag3GreaterThan(String value) {
            addCriterion("dept_tag3 >", value, "deptTag3");
            return (Criteria) this;
        }

        public Criteria andDeptTag3GreaterThanOrEqualTo(String value) {
            addCriterion("dept_tag3 >=", value, "deptTag3");
            return (Criteria) this;
        }

        public Criteria andDeptTag3LessThan(String value) {
            addCriterion("dept_tag3 <", value, "deptTag3");
            return (Criteria) this;
        }

        public Criteria andDeptTag3LessThanOrEqualTo(String value) {
            addCriterion("dept_tag3 <=", value, "deptTag3");
            return (Criteria) this;
        }

        public Criteria andDeptTag3Like(String value) {
            addCriterion("dept_tag3 like", value, "deptTag3");
            return (Criteria) this;
        }

        public Criteria andDeptTag3NotLike(String value) {
            addCriterion("dept_tag3 not like", value, "deptTag3");
            return (Criteria) this;
        }

        public Criteria andDeptTag3In(List<String> values) {
            addCriterion("dept_tag3 in", values, "deptTag3");
            return (Criteria) this;
        }

        public Criteria andDeptTag3NotIn(List<String> values) {
            addCriterion("dept_tag3 not in", values, "deptTag3");
            return (Criteria) this;
        }

        public Criteria andDeptTag3Between(String value1, String value2) {
            addCriterion("dept_tag3 between", value1, value2, "deptTag3");
            return (Criteria) this;
        }

        public Criteria andDeptTag3NotBetween(String value1, String value2) {
            addCriterion("dept_tag3 not between", value1, value2, "deptTag3");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_circle_member表的实体类
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
     * sy_circle_member 2017-10-17
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