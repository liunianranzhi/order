package com.shanyuan.platform.ms.dao.user.entity;

import java.util.ArrayList;
import java.util.List;

public class SyRoleExample {
    /**
     * sy_role
     */
    protected String orderByClause;

    /**
     * sy_role
     */
    protected boolean distinct;

    /**
     * sy_role
     */
    protected List<Criteria> oredCriteria;

    public SyRoleExample() {
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
     * sy_role 2017-10-17
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

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
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

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIsNull() {
            addCriterion("role_type is null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIsNotNull() {
            addCriterion("role_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeEqualTo(Byte value) {
            addCriterion("role_type =", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotEqualTo(Byte value) {
            addCriterion("role_type <>", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeGreaterThan(Byte value) {
            addCriterion("role_type >", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("role_type >=", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLessThan(Byte value) {
            addCriterion("role_type <", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLessThanOrEqualTo(Byte value) {
            addCriterion("role_type <=", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIn(List<Byte> values) {
            addCriterion("role_type in", values, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotIn(List<Byte> values) {
            addCriterion("role_type not in", values, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeBetween(Byte value1, Byte value2) {
            addCriterion("role_type between", value1, value2, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("role_type not between", value1, value2, "roleType");
            return (Criteria) this;
        }

        public Criteria andMFeeRateIsNull() {
            addCriterion("m_fee_rate is null");
            return (Criteria) this;
        }

        public Criteria andMFeeRateIsNotNull() {
            addCriterion("m_fee_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMFeeRateEqualTo(Short value) {
            addCriterion("m_fee_rate =", value, "mFeeRate");
            return (Criteria) this;
        }

        public Criteria andMFeeRateNotEqualTo(Short value) {
            addCriterion("m_fee_rate <>", value, "mFeeRate");
            return (Criteria) this;
        }

        public Criteria andMFeeRateGreaterThan(Short value) {
            addCriterion("m_fee_rate >", value, "mFeeRate");
            return (Criteria) this;
        }

        public Criteria andMFeeRateGreaterThanOrEqualTo(Short value) {
            addCriterion("m_fee_rate >=", value, "mFeeRate");
            return (Criteria) this;
        }

        public Criteria andMFeeRateLessThan(Short value) {
            addCriterion("m_fee_rate <", value, "mFeeRate");
            return (Criteria) this;
        }

        public Criteria andMFeeRateLessThanOrEqualTo(Short value) {
            addCriterion("m_fee_rate <=", value, "mFeeRate");
            return (Criteria) this;
        }

        public Criteria andMFeeRateIn(List<Short> values) {
            addCriterion("m_fee_rate in", values, "mFeeRate");
            return (Criteria) this;
        }

        public Criteria andMFeeRateNotIn(List<Short> values) {
            addCriterion("m_fee_rate not in", values, "mFeeRate");
            return (Criteria) this;
        }

        public Criteria andMFeeRateBetween(Short value1, Short value2) {
            addCriterion("m_fee_rate between", value1, value2, "mFeeRate");
            return (Criteria) this;
        }

        public Criteria andMFeeRateNotBetween(Short value1, Short value2) {
            addCriterion("m_fee_rate not between", value1, value2, "mFeeRate");
            return (Criteria) this;
        }

        public Criteria andSureAgreementIsNull() {
            addCriterion("sure_agreement is null");
            return (Criteria) this;
        }

        public Criteria andSureAgreementIsNotNull() {
            addCriterion("sure_agreement is not null");
            return (Criteria) this;
        }

        public Criteria andSureAgreementEqualTo(Byte value) {
            addCriterion("sure_agreement =", value, "sureAgreement");
            return (Criteria) this;
        }

        public Criteria andSureAgreementNotEqualTo(Byte value) {
            addCriterion("sure_agreement <>", value, "sureAgreement");
            return (Criteria) this;
        }

        public Criteria andSureAgreementGreaterThan(Byte value) {
            addCriterion("sure_agreement >", value, "sureAgreement");
            return (Criteria) this;
        }

        public Criteria andSureAgreementGreaterThanOrEqualTo(Byte value) {
            addCriterion("sure_agreement >=", value, "sureAgreement");
            return (Criteria) this;
        }

        public Criteria andSureAgreementLessThan(Byte value) {
            addCriterion("sure_agreement <", value, "sureAgreement");
            return (Criteria) this;
        }

        public Criteria andSureAgreementLessThanOrEqualTo(Byte value) {
            addCriterion("sure_agreement <=", value, "sureAgreement");
            return (Criteria) this;
        }

        public Criteria andSureAgreementIn(List<Byte> values) {
            addCriterion("sure_agreement in", values, "sureAgreement");
            return (Criteria) this;
        }

        public Criteria andSureAgreementNotIn(List<Byte> values) {
            addCriterion("sure_agreement not in", values, "sureAgreement");
            return (Criteria) this;
        }

        public Criteria andSureAgreementBetween(Byte value1, Byte value2) {
            addCriterion("sure_agreement between", value1, value2, "sureAgreement");
            return (Criteria) this;
        }

        public Criteria andSureAgreementNotBetween(Byte value1, Byte value2) {
            addCriterion("sure_agreement not between", value1, value2, "sureAgreement");
            return (Criteria) this;
        }

        public Criteria andSureAgreementTimeIsNull() {
            addCriterion("sure_agreement_time is null");
            return (Criteria) this;
        }

        public Criteria andSureAgreementTimeIsNotNull() {
            addCriterion("sure_agreement_time is not null");
            return (Criteria) this;
        }

        public Criteria andSureAgreementTimeEqualTo(Integer value) {
            addCriterion("sure_agreement_time =", value, "sureAgreementTime");
            return (Criteria) this;
        }

        public Criteria andSureAgreementTimeNotEqualTo(Integer value) {
            addCriterion("sure_agreement_time <>", value, "sureAgreementTime");
            return (Criteria) this;
        }

        public Criteria andSureAgreementTimeGreaterThan(Integer value) {
            addCriterion("sure_agreement_time >", value, "sureAgreementTime");
            return (Criteria) this;
        }

        public Criteria andSureAgreementTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sure_agreement_time >=", value, "sureAgreementTime");
            return (Criteria) this;
        }

        public Criteria andSureAgreementTimeLessThan(Integer value) {
            addCriterion("sure_agreement_time <", value, "sureAgreementTime");
            return (Criteria) this;
        }

        public Criteria andSureAgreementTimeLessThanOrEqualTo(Integer value) {
            addCriterion("sure_agreement_time <=", value, "sureAgreementTime");
            return (Criteria) this;
        }

        public Criteria andSureAgreementTimeIn(List<Integer> values) {
            addCriterion("sure_agreement_time in", values, "sureAgreementTime");
            return (Criteria) this;
        }

        public Criteria andSureAgreementTimeNotIn(List<Integer> values) {
            addCriterion("sure_agreement_time not in", values, "sureAgreementTime");
            return (Criteria) this;
        }

        public Criteria andSureAgreementTimeBetween(Integer value1, Integer value2) {
            addCriterion("sure_agreement_time between", value1, value2, "sureAgreementTime");
            return (Criteria) this;
        }

        public Criteria andSureAgreementTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("sure_agreement_time not between", value1, value2, "sureAgreementTime");
            return (Criteria) this;
        }

        public Criteria andSurePoorIsNull() {
            addCriterion("sure_poor is null");
            return (Criteria) this;
        }

        public Criteria andSurePoorIsNotNull() {
            addCriterion("sure_poor is not null");
            return (Criteria) this;
        }

        public Criteria andSurePoorEqualTo(Byte value) {
            addCriterion("sure_poor =", value, "surePoor");
            return (Criteria) this;
        }

        public Criteria andSurePoorNotEqualTo(Byte value) {
            addCriterion("sure_poor <>", value, "surePoor");
            return (Criteria) this;
        }

        public Criteria andSurePoorGreaterThan(Byte value) {
            addCriterion("sure_poor >", value, "surePoor");
            return (Criteria) this;
        }

        public Criteria andSurePoorGreaterThanOrEqualTo(Byte value) {
            addCriterion("sure_poor >=", value, "surePoor");
            return (Criteria) this;
        }

        public Criteria andSurePoorLessThan(Byte value) {
            addCriterion("sure_poor <", value, "surePoor");
            return (Criteria) this;
        }

        public Criteria andSurePoorLessThanOrEqualTo(Byte value) {
            addCriterion("sure_poor <=", value, "surePoor");
            return (Criteria) this;
        }

        public Criteria andSurePoorIn(List<Byte> values) {
            addCriterion("sure_poor in", values, "surePoor");
            return (Criteria) this;
        }

        public Criteria andSurePoorNotIn(List<Byte> values) {
            addCriterion("sure_poor not in", values, "surePoor");
            return (Criteria) this;
        }

        public Criteria andSurePoorBetween(Byte value1, Byte value2) {
            addCriterion("sure_poor between", value1, value2, "surePoor");
            return (Criteria) this;
        }

        public Criteria andSurePoorNotBetween(Byte value1, Byte value2) {
            addCriterion("sure_poor not between", value1, value2, "surePoor");
            return (Criteria) this;
        }

        public Criteria andSurePoorTimeIsNull() {
            addCriterion("sure_poor_time is null");
            return (Criteria) this;
        }

        public Criteria andSurePoorTimeIsNotNull() {
            addCriterion("sure_poor_time is not null");
            return (Criteria) this;
        }

        public Criteria andSurePoorTimeEqualTo(Integer value) {
            addCriterion("sure_poor_time =", value, "surePoorTime");
            return (Criteria) this;
        }

        public Criteria andSurePoorTimeNotEqualTo(Integer value) {
            addCriterion("sure_poor_time <>", value, "surePoorTime");
            return (Criteria) this;
        }

        public Criteria andSurePoorTimeGreaterThan(Integer value) {
            addCriterion("sure_poor_time >", value, "surePoorTime");
            return (Criteria) this;
        }

        public Criteria andSurePoorTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sure_poor_time >=", value, "surePoorTime");
            return (Criteria) this;
        }

        public Criteria andSurePoorTimeLessThan(Integer value) {
            addCriterion("sure_poor_time <", value, "surePoorTime");
            return (Criteria) this;
        }

        public Criteria andSurePoorTimeLessThanOrEqualTo(Integer value) {
            addCriterion("sure_poor_time <=", value, "surePoorTime");
            return (Criteria) this;
        }

        public Criteria andSurePoorTimeIn(List<Integer> values) {
            addCriterion("sure_poor_time in", values, "surePoorTime");
            return (Criteria) this;
        }

        public Criteria andSurePoorTimeNotIn(List<Integer> values) {
            addCriterion("sure_poor_time not in", values, "surePoorTime");
            return (Criteria) this;
        }

        public Criteria andSurePoorTimeBetween(Integer value1, Integer value2) {
            addCriterion("sure_poor_time between", value1, value2, "surePoorTime");
            return (Criteria) this;
        }

        public Criteria andSurePoorTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("sure_poor_time not between", value1, value2, "surePoorTime");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIsNull() {
            addCriterion("recommend_reason is null");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIsNotNull() {
            addCriterion("recommend_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonEqualTo(String value) {
            addCriterion("recommend_reason =", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonNotEqualTo(String value) {
            addCriterion("recommend_reason <>", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonGreaterThan(String value) {
            addCriterion("recommend_reason >", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonGreaterThanOrEqualTo(String value) {
            addCriterion("recommend_reason >=", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonLessThan(String value) {
            addCriterion("recommend_reason <", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonLessThanOrEqualTo(String value) {
            addCriterion("recommend_reason <=", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonLike(String value) {
            addCriterion("recommend_reason like", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonNotLike(String value) {
            addCriterion("recommend_reason not like", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIn(List<String> values) {
            addCriterion("recommend_reason in", values, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonNotIn(List<String> values) {
            addCriterion("recommend_reason not in", values, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonBetween(String value1, String value2) {
            addCriterion("recommend_reason between", value1, value2, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonNotBetween(String value1, String value2) {
            addCriterion("recommend_reason not between", value1, value2, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNull() {
            addCriterion("recommend is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNotNull() {
            addCriterion("recommend is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendEqualTo(String value) {
            addCriterion("recommend =", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotEqualTo(String value) {
            addCriterion("recommend <>", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThan(String value) {
            addCriterion("recommend >", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("recommend >=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThan(String value) {
            addCriterion("recommend <", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThanOrEqualTo(String value) {
            addCriterion("recommend <=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLike(String value) {
            addCriterion("recommend like", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotLike(String value) {
            addCriterion("recommend not like", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendIn(List<String> values) {
            addCriterion("recommend in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotIn(List<String> values) {
            addCriterion("recommend not in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendBetween(String value1, String value2) {
            addCriterion("recommend between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotBetween(String value1, String value2) {
            addCriterion("recommend not between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeIsNull() {
            addCriterion("recommend_time is null");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeIsNotNull() {
            addCriterion("recommend_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeEqualTo(Integer value) {
            addCriterion("recommend_time =", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeNotEqualTo(Integer value) {
            addCriterion("recommend_time <>", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeGreaterThan(Integer value) {
            addCriterion("recommend_time >", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommend_time >=", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeLessThan(Integer value) {
            addCriterion("recommend_time <", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeLessThanOrEqualTo(Integer value) {
            addCriterion("recommend_time <=", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeIn(List<Integer> values) {
            addCriterion("recommend_time in", values, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeNotIn(List<Integer> values) {
            addCriterion("recommend_time not in", values, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeBetween(Integer value1, Integer value2) {
            addCriterion("recommend_time between", value1, value2, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("recommend_time not between", value1, value2, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andFundFeeRateIsNull() {
            addCriterion("fund_fee_rate is null");
            return (Criteria) this;
        }

        public Criteria andFundFeeRateIsNotNull() {
            addCriterion("fund_fee_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFundFeeRateEqualTo(Short value) {
            addCriterion("fund_fee_rate =", value, "fundFeeRate");
            return (Criteria) this;
        }

        public Criteria andFundFeeRateNotEqualTo(Short value) {
            addCriterion("fund_fee_rate <>", value, "fundFeeRate");
            return (Criteria) this;
        }

        public Criteria andFundFeeRateGreaterThan(Short value) {
            addCriterion("fund_fee_rate >", value, "fundFeeRate");
            return (Criteria) this;
        }

        public Criteria andFundFeeRateGreaterThanOrEqualTo(Short value) {
            addCriterion("fund_fee_rate >=", value, "fundFeeRate");
            return (Criteria) this;
        }

        public Criteria andFundFeeRateLessThan(Short value) {
            addCriterion("fund_fee_rate <", value, "fundFeeRate");
            return (Criteria) this;
        }

        public Criteria andFundFeeRateLessThanOrEqualTo(Short value) {
            addCriterion("fund_fee_rate <=", value, "fundFeeRate");
            return (Criteria) this;
        }

        public Criteria andFundFeeRateIn(List<Short> values) {
            addCriterion("fund_fee_rate in", values, "fundFeeRate");
            return (Criteria) this;
        }

        public Criteria andFundFeeRateNotIn(List<Short> values) {
            addCriterion("fund_fee_rate not in", values, "fundFeeRate");
            return (Criteria) this;
        }

        public Criteria andFundFeeRateBetween(Short value1, Short value2) {
            addCriterion("fund_fee_rate between", value1, value2, "fundFeeRate");
            return (Criteria) this;
        }

        public Criteria andFundFeeRateNotBetween(Short value1, Short value2) {
            addCriterion("fund_fee_rate not between", value1, value2, "fundFeeRate");
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

        public Criteria andAreaid1IsNull() {
            addCriterion("areaid_1 is null");
            return (Criteria) this;
        }

        public Criteria andAreaid1IsNotNull() {
            addCriterion("areaid_1 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaid1EqualTo(Long value) {
            addCriterion("areaid_1 =", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1NotEqualTo(Long value) {
            addCriterion("areaid_1 <>", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1GreaterThan(Long value) {
            addCriterion("areaid_1 >", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1GreaterThanOrEqualTo(Long value) {
            addCriterion("areaid_1 >=", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1LessThan(Long value) {
            addCriterion("areaid_1 <", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1LessThanOrEqualTo(Long value) {
            addCriterion("areaid_1 <=", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1In(List<Long> values) {
            addCriterion("areaid_1 in", values, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1NotIn(List<Long> values) {
            addCriterion("areaid_1 not in", values, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1Between(Long value1, Long value2) {
            addCriterion("areaid_1 between", value1, value2, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1NotBetween(Long value1, Long value2) {
            addCriterion("areaid_1 not between", value1, value2, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid2IsNull() {
            addCriterion("areaid_2 is null");
            return (Criteria) this;
        }

        public Criteria andAreaid2IsNotNull() {
            addCriterion("areaid_2 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaid2EqualTo(Long value) {
            addCriterion("areaid_2 =", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2NotEqualTo(Long value) {
            addCriterion("areaid_2 <>", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2GreaterThan(Long value) {
            addCriterion("areaid_2 >", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2GreaterThanOrEqualTo(Long value) {
            addCriterion("areaid_2 >=", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2LessThan(Long value) {
            addCriterion("areaid_2 <", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2LessThanOrEqualTo(Long value) {
            addCriterion("areaid_2 <=", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2In(List<Long> values) {
            addCriterion("areaid_2 in", values, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2NotIn(List<Long> values) {
            addCriterion("areaid_2 not in", values, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2Between(Long value1, Long value2) {
            addCriterion("areaid_2 between", value1, value2, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2NotBetween(Long value1, Long value2) {
            addCriterion("areaid_2 not between", value1, value2, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid3IsNull() {
            addCriterion("areaid_3 is null");
            return (Criteria) this;
        }

        public Criteria andAreaid3IsNotNull() {
            addCriterion("areaid_3 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaid3EqualTo(Long value) {
            addCriterion("areaid_3 =", value, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3NotEqualTo(Long value) {
            addCriterion("areaid_3 <>", value, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3GreaterThan(Long value) {
            addCriterion("areaid_3 >", value, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3GreaterThanOrEqualTo(Long value) {
            addCriterion("areaid_3 >=", value, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3LessThan(Long value) {
            addCriterion("areaid_3 <", value, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3LessThanOrEqualTo(Long value) {
            addCriterion("areaid_3 <=", value, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3In(List<Long> values) {
            addCriterion("areaid_3 in", values, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3NotIn(List<Long> values) {
            addCriterion("areaid_3 not in", values, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3Between(Long value1, Long value2) {
            addCriterion("areaid_3 between", value1, value2, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3NotBetween(Long value1, Long value2) {
            addCriterion("areaid_3 not between", value1, value2, "areaid3");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_role表的实体类
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
     * sy_role 2017-10-17
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