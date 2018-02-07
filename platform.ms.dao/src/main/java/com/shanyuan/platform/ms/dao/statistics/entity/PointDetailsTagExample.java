package com.shanyuan.platform.ms.dao.statistics.entity;

import java.util.ArrayList;
import java.util.List;

public class PointDetailsTagExample {
    /**
     * point_details_tag
     */
    protected String orderByClause;

    /**
     * point_details_tag
     */
    protected boolean distinct;

    /**
     * point_details_tag
     */
    protected List<Criteria> oredCriteria;

    public PointDetailsTagExample() {
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
     * point_details_tag 2018-01-09
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

        public Criteria andUnionIdIsNull() {
            addCriterion("union_id is null");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNotNull() {
            addCriterion("union_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnionIdEqualTo(Integer value) {
            addCriterion("union_id =", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotEqualTo(Integer value) {
            addCriterion("union_id <>", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThan(Integer value) {
            addCriterion("union_id >", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("union_id >=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThan(Integer value) {
            addCriterion("union_id <", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThanOrEqualTo(Integer value) {
            addCriterion("union_id <=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIn(List<Integer> values) {
            addCriterion("union_id in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotIn(List<Integer> values) {
            addCriterion("union_id not in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdBetween(Integer value1, Integer value2) {
            addCriterion("union_id between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("union_id not between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionNameIsNull() {
            addCriterion("union_name is null");
            return (Criteria) this;
        }

        public Criteria andUnionNameIsNotNull() {
            addCriterion("union_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnionNameEqualTo(String value) {
            addCriterion("union_name =", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameNotEqualTo(String value) {
            addCriterion("union_name <>", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameGreaterThan(String value) {
            addCriterion("union_name >", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameGreaterThanOrEqualTo(String value) {
            addCriterion("union_name >=", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameLessThan(String value) {
            addCriterion("union_name <", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameLessThanOrEqualTo(String value) {
            addCriterion("union_name <=", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameLike(String value) {
            addCriterion("union_name like", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameNotLike(String value) {
            addCriterion("union_name not like", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameIn(List<String> values) {
            addCriterion("union_name in", values, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameNotIn(List<String> values) {
            addCriterion("union_name not in", values, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameBetween(String value1, String value2) {
            addCriterion("union_name between", value1, value2, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameNotBetween(String value1, String value2) {
            addCriterion("union_name not between", value1, value2, "unionName");
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

        public Criteria andTotalPointTagIsNull() {
            addCriterion("total_point_tag is null");
            return (Criteria) this;
        }

        public Criteria andTotalPointTagIsNotNull() {
            addCriterion("total_point_tag is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPointTagEqualTo(Long value) {
            addCriterion("total_point_tag =", value, "totalPointTag");
            return (Criteria) this;
        }

        public Criteria andTotalPointTagNotEqualTo(Long value) {
            addCriterion("total_point_tag <>", value, "totalPointTag");
            return (Criteria) this;
        }

        public Criteria andTotalPointTagGreaterThan(Long value) {
            addCriterion("total_point_tag >", value, "totalPointTag");
            return (Criteria) this;
        }

        public Criteria andTotalPointTagGreaterThanOrEqualTo(Long value) {
            addCriterion("total_point_tag >=", value, "totalPointTag");
            return (Criteria) this;
        }

        public Criteria andTotalPointTagLessThan(Long value) {
            addCriterion("total_point_tag <", value, "totalPointTag");
            return (Criteria) this;
        }

        public Criteria andTotalPointTagLessThanOrEqualTo(Long value) {
            addCriterion("total_point_tag <=", value, "totalPointTag");
            return (Criteria) this;
        }

        public Criteria andTotalPointTagIn(List<Long> values) {
            addCriterion("total_point_tag in", values, "totalPointTag");
            return (Criteria) this;
        }

        public Criteria andTotalPointTagNotIn(List<Long> values) {
            addCriterion("total_point_tag not in", values, "totalPointTag");
            return (Criteria) this;
        }

        public Criteria andTotalPointTagBetween(Long value1, Long value2) {
            addCriterion("total_point_tag between", value1, value2, "totalPointTag");
            return (Criteria) this;
        }

        public Criteria andTotalPointTagNotBetween(Long value1, Long value2) {
            addCriterion("total_point_tag not between", value1, value2, "totalPointTag");
            return (Criteria) this;
        }

        public Criteria andValidPointTagIsNull() {
            addCriterion("valid_point_tag is null");
            return (Criteria) this;
        }

        public Criteria andValidPointTagIsNotNull() {
            addCriterion("valid_point_tag is not null");
            return (Criteria) this;
        }

        public Criteria andValidPointTagEqualTo(Long value) {
            addCriterion("valid_point_tag =", value, "validPointTag");
            return (Criteria) this;
        }

        public Criteria andValidPointTagNotEqualTo(Long value) {
            addCriterion("valid_point_tag <>", value, "validPointTag");
            return (Criteria) this;
        }

        public Criteria andValidPointTagGreaterThan(Long value) {
            addCriterion("valid_point_tag >", value, "validPointTag");
            return (Criteria) this;
        }

        public Criteria andValidPointTagGreaterThanOrEqualTo(Long value) {
            addCriterion("valid_point_tag >=", value, "validPointTag");
            return (Criteria) this;
        }

        public Criteria andValidPointTagLessThan(Long value) {
            addCriterion("valid_point_tag <", value, "validPointTag");
            return (Criteria) this;
        }

        public Criteria andValidPointTagLessThanOrEqualTo(Long value) {
            addCriterion("valid_point_tag <=", value, "validPointTag");
            return (Criteria) this;
        }

        public Criteria andValidPointTagIn(List<Long> values) {
            addCriterion("valid_point_tag in", values, "validPointTag");
            return (Criteria) this;
        }

        public Criteria andValidPointTagNotIn(List<Long> values) {
            addCriterion("valid_point_tag not in", values, "validPointTag");
            return (Criteria) this;
        }

        public Criteria andValidPointTagBetween(Long value1, Long value2) {
            addCriterion("valid_point_tag between", value1, value2, "validPointTag");
            return (Criteria) this;
        }

        public Criteria andValidPointTagNotBetween(Long value1, Long value2) {
            addCriterion("valid_point_tag not between", value1, value2, "validPointTag");
            return (Criteria) this;
        }

        public Criteria andTotalPointIsNull() {
            addCriterion("total_point is null");
            return (Criteria) this;
        }

        public Criteria andTotalPointIsNotNull() {
            addCriterion("total_point is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPointEqualTo(Long value) {
            addCriterion("total_point =", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointNotEqualTo(Long value) {
            addCriterion("total_point <>", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointGreaterThan(Long value) {
            addCriterion("total_point >", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointGreaterThanOrEqualTo(Long value) {
            addCriterion("total_point >=", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointLessThan(Long value) {
            addCriterion("total_point <", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointLessThanOrEqualTo(Long value) {
            addCriterion("total_point <=", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointIn(List<Long> values) {
            addCriterion("total_point in", values, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointNotIn(List<Long> values) {
            addCriterion("total_point not in", values, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointBetween(Long value1, Long value2) {
            addCriterion("total_point between", value1, value2, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointNotBetween(Long value1, Long value2) {
            addCriterion("total_point not between", value1, value2, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andValidPointIsNull() {
            addCriterion("valid_point is null");
            return (Criteria) this;
        }

        public Criteria andValidPointIsNotNull() {
            addCriterion("valid_point is not null");
            return (Criteria) this;
        }

        public Criteria andValidPointEqualTo(Long value) {
            addCriterion("valid_point =", value, "validPoint");
            return (Criteria) this;
        }

        public Criteria andValidPointNotEqualTo(Long value) {
            addCriterion("valid_point <>", value, "validPoint");
            return (Criteria) this;
        }

        public Criteria andValidPointGreaterThan(Long value) {
            addCriterion("valid_point >", value, "validPoint");
            return (Criteria) this;
        }

        public Criteria andValidPointGreaterThanOrEqualTo(Long value) {
            addCriterion("valid_point >=", value, "validPoint");
            return (Criteria) this;
        }

        public Criteria andValidPointLessThan(Long value) {
            addCriterion("valid_point <", value, "validPoint");
            return (Criteria) this;
        }

        public Criteria andValidPointLessThanOrEqualTo(Long value) {
            addCriterion("valid_point <=", value, "validPoint");
            return (Criteria) this;
        }

        public Criteria andValidPointIn(List<Long> values) {
            addCriterion("valid_point in", values, "validPoint");
            return (Criteria) this;
        }

        public Criteria andValidPointNotIn(List<Long> values) {
            addCriterion("valid_point not in", values, "validPoint");
            return (Criteria) this;
        }

        public Criteria andValidPointBetween(Long value1, Long value2) {
            addCriterion("valid_point between", value1, value2, "validPoint");
            return (Criteria) this;
        }

        public Criteria andValidPointNotBetween(Long value1, Long value2) {
            addCriterion("valid_point not between", value1, value2, "validPoint");
            return (Criteria) this;
        }

        public Criteria andMemberMobileIsNull() {
            addCriterion("member_mobile is null");
            return (Criteria) this;
        }

        public Criteria andMemberMobileIsNotNull() {
            addCriterion("member_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMemberMobileEqualTo(String value) {
            addCriterion("member_mobile =", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotEqualTo(String value) {
            addCriterion("member_mobile <>", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileGreaterThan(String value) {
            addCriterion("member_mobile >", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileGreaterThanOrEqualTo(String value) {
            addCriterion("member_mobile >=", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileLessThan(String value) {
            addCriterion("member_mobile <", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileLessThanOrEqualTo(String value) {
            addCriterion("member_mobile <=", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileLike(String value) {
            addCriterion("member_mobile like", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotLike(String value) {
            addCriterion("member_mobile not like", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileIn(List<String> values) {
            addCriterion("member_mobile in", values, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotIn(List<String> values) {
            addCriterion("member_mobile not in", values, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileBetween(String value1, String value2) {
            addCriterion("member_mobile between", value1, value2, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotBetween(String value1, String value2) {
            addCriterion("member_mobile not between", value1, value2, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameIsNull() {
            addCriterion("member_truename is null");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameIsNotNull() {
            addCriterion("member_truename is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameEqualTo(String value) {
            addCriterion("member_truename =", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameNotEqualTo(String value) {
            addCriterion("member_truename <>", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameGreaterThan(String value) {
            addCriterion("member_truename >", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("member_truename >=", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameLessThan(String value) {
            addCriterion("member_truename <", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameLessThanOrEqualTo(String value) {
            addCriterion("member_truename <=", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameLike(String value) {
            addCriterion("member_truename like", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameNotLike(String value) {
            addCriterion("member_truename not like", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameIn(List<String> values) {
            addCriterion("member_truename in", values, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameNotIn(List<String> values) {
            addCriterion("member_truename not in", values, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameBetween(String value1, String value2) {
            addCriterion("member_truename between", value1, value2, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameNotBetween(String value1, String value2) {
            addCriterion("member_truename not between", value1, value2, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameIsNull() {
            addCriterion("member_disp_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameIsNotNull() {
            addCriterion("member_disp_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameEqualTo(String value) {
            addCriterion("member_disp_name =", value, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameNotEqualTo(String value) {
            addCriterion("member_disp_name <>", value, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameGreaterThan(String value) {
            addCriterion("member_disp_name >", value, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_disp_name >=", value, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameLessThan(String value) {
            addCriterion("member_disp_name <", value, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameLessThanOrEqualTo(String value) {
            addCriterion("member_disp_name <=", value, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameLike(String value) {
            addCriterion("member_disp_name like", value, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameNotLike(String value) {
            addCriterion("member_disp_name not like", value, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameIn(List<String> values) {
            addCriterion("member_disp_name in", values, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameNotIn(List<String> values) {
            addCriterion("member_disp_name not in", values, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameBetween(String value1, String value2) {
            addCriterion("member_disp_name between", value1, value2, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameNotBetween(String value1, String value2) {
            addCriterion("member_disp_name not between", value1, value2, "memberDispName");
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
    }

    /**
     * 描述:point_details_tag表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2018-01-09
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * point_details_tag 2018-01-09
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