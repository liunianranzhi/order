package com.shanyuan.platform.ms.dao.union.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyBocMemberStatsExample {
    /**
     * sy_boc_member_stats
     */
    protected String orderByClause;

    /**
     * sy_boc_member_stats
     */
    protected boolean distinct;

    /**
     * sy_boc_member_stats
     */
    protected List<Criteria> oredCriteria;

    public SyBocMemberStatsExample() {
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
     * sy_boc_member_stats 2017-11-08
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

        public Criteria andPartyTotalOrderAmountIsNull() {
            addCriterion("party_total_order_amount is null");
            return (Criteria) this;
        }

        public Criteria andPartyTotalOrderAmountIsNotNull() {
            addCriterion("party_total_order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPartyTotalOrderAmountEqualTo(Integer value) {
            addCriterion("party_total_order_amount =", value, "partyTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andPartyTotalOrderAmountNotEqualTo(Integer value) {
            addCriterion("party_total_order_amount <>", value, "partyTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andPartyTotalOrderAmountGreaterThan(Integer value) {
            addCriterion("party_total_order_amount >", value, "partyTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andPartyTotalOrderAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("party_total_order_amount >=", value, "partyTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andPartyTotalOrderAmountLessThan(Integer value) {
            addCriterion("party_total_order_amount <", value, "partyTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andPartyTotalOrderAmountLessThanOrEqualTo(Integer value) {
            addCriterion("party_total_order_amount <=", value, "partyTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andPartyTotalOrderAmountIn(List<Integer> values) {
            addCriterion("party_total_order_amount in", values, "partyTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andPartyTotalOrderAmountNotIn(List<Integer> values) {
            addCriterion("party_total_order_amount not in", values, "partyTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andPartyTotalOrderAmountBetween(Integer value1, Integer value2) {
            addCriterion("party_total_order_amount between", value1, value2, "partyTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andPartyTotalOrderAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("party_total_order_amount not between", value1, value2, "partyTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andPartyTotalPairedIsNull() {
            addCriterion("party_total_paired is null");
            return (Criteria) this;
        }

        public Criteria andPartyTotalPairedIsNotNull() {
            addCriterion("party_total_paired is not null");
            return (Criteria) this;
        }

        public Criteria andPartyTotalPairedEqualTo(Integer value) {
            addCriterion("party_total_paired =", value, "partyTotalPaired");
            return (Criteria) this;
        }

        public Criteria andPartyTotalPairedNotEqualTo(Integer value) {
            addCriterion("party_total_paired <>", value, "partyTotalPaired");
            return (Criteria) this;
        }

        public Criteria andPartyTotalPairedGreaterThan(Integer value) {
            addCriterion("party_total_paired >", value, "partyTotalPaired");
            return (Criteria) this;
        }

        public Criteria andPartyTotalPairedGreaterThanOrEqualTo(Integer value) {
            addCriterion("party_total_paired >=", value, "partyTotalPaired");
            return (Criteria) this;
        }

        public Criteria andPartyTotalPairedLessThan(Integer value) {
            addCriterion("party_total_paired <", value, "partyTotalPaired");
            return (Criteria) this;
        }

        public Criteria andPartyTotalPairedLessThanOrEqualTo(Integer value) {
            addCriterion("party_total_paired <=", value, "partyTotalPaired");
            return (Criteria) this;
        }

        public Criteria andPartyTotalPairedIn(List<Integer> values) {
            addCriterion("party_total_paired in", values, "partyTotalPaired");
            return (Criteria) this;
        }

        public Criteria andPartyTotalPairedNotIn(List<Integer> values) {
            addCriterion("party_total_paired not in", values, "partyTotalPaired");
            return (Criteria) this;
        }

        public Criteria andPartyTotalPairedBetween(Integer value1, Integer value2) {
            addCriterion("party_total_paired between", value1, value2, "partyTotalPaired");
            return (Criteria) this;
        }

        public Criteria andPartyTotalPairedNotBetween(Integer value1, Integer value2) {
            addCriterion("party_total_paired not between", value1, value2, "partyTotalPaired");
            return (Criteria) this;
        }

        public Criteria andPartyTotalMemberIsNull() {
            addCriterion("party_total_member is null");
            return (Criteria) this;
        }

        public Criteria andPartyTotalMemberIsNotNull() {
            addCriterion("party_total_member is not null");
            return (Criteria) this;
        }

        public Criteria andPartyTotalMemberEqualTo(Integer value) {
            addCriterion("party_total_member =", value, "partyTotalMember");
            return (Criteria) this;
        }

        public Criteria andPartyTotalMemberNotEqualTo(Integer value) {
            addCriterion("party_total_member <>", value, "partyTotalMember");
            return (Criteria) this;
        }

        public Criteria andPartyTotalMemberGreaterThan(Integer value) {
            addCriterion("party_total_member >", value, "partyTotalMember");
            return (Criteria) this;
        }

        public Criteria andPartyTotalMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("party_total_member >=", value, "partyTotalMember");
            return (Criteria) this;
        }

        public Criteria andPartyTotalMemberLessThan(Integer value) {
            addCriterion("party_total_member <", value, "partyTotalMember");
            return (Criteria) this;
        }

        public Criteria andPartyTotalMemberLessThanOrEqualTo(Integer value) {
            addCriterion("party_total_member <=", value, "partyTotalMember");
            return (Criteria) this;
        }

        public Criteria andPartyTotalMemberIn(List<Integer> values) {
            addCriterion("party_total_member in", values, "partyTotalMember");
            return (Criteria) this;
        }

        public Criteria andPartyTotalMemberNotIn(List<Integer> values) {
            addCriterion("party_total_member not in", values, "partyTotalMember");
            return (Criteria) this;
        }

        public Criteria andPartyTotalMemberBetween(Integer value1, Integer value2) {
            addCriterion("party_total_member between", value1, value2, "partyTotalMember");
            return (Criteria) this;
        }

        public Criteria andPartyTotalMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("party_total_member not between", value1, value2, "partyTotalMember");
            return (Criteria) this;
        }

        public Criteria andFullTotalOrderAmountIsNull() {
            addCriterion("full_total_order_amount is null");
            return (Criteria) this;
        }

        public Criteria andFullTotalOrderAmountIsNotNull() {
            addCriterion("full_total_order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFullTotalOrderAmountEqualTo(Long value) {
            addCriterion("full_total_order_amount =", value, "fullTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalOrderAmountNotEqualTo(Long value) {
            addCriterion("full_total_order_amount <>", value, "fullTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalOrderAmountGreaterThan(Long value) {
            addCriterion("full_total_order_amount >", value, "fullTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalOrderAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("full_total_order_amount >=", value, "fullTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalOrderAmountLessThan(Long value) {
            addCriterion("full_total_order_amount <", value, "fullTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalOrderAmountLessThanOrEqualTo(Long value) {
            addCriterion("full_total_order_amount <=", value, "fullTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalOrderAmountIn(List<Long> values) {
            addCriterion("full_total_order_amount in", values, "fullTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalOrderAmountNotIn(List<Long> values) {
            addCriterion("full_total_order_amount not in", values, "fullTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalOrderAmountBetween(Long value1, Long value2) {
            addCriterion("full_total_order_amount between", value1, value2, "fullTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalOrderAmountNotBetween(Long value1, Long value2) {
            addCriterion("full_total_order_amount not between", value1, value2, "fullTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalPairedIsNull() {
            addCriterion("full_total_paired is null");
            return (Criteria) this;
        }

        public Criteria andFullTotalPairedIsNotNull() {
            addCriterion("full_total_paired is not null");
            return (Criteria) this;
        }

        public Criteria andFullTotalPairedEqualTo(Integer value) {
            addCriterion("full_total_paired =", value, "fullTotalPaired");
            return (Criteria) this;
        }

        public Criteria andFullTotalPairedNotEqualTo(Integer value) {
            addCriterion("full_total_paired <>", value, "fullTotalPaired");
            return (Criteria) this;
        }

        public Criteria andFullTotalPairedGreaterThan(Integer value) {
            addCriterion("full_total_paired >", value, "fullTotalPaired");
            return (Criteria) this;
        }

        public Criteria andFullTotalPairedGreaterThanOrEqualTo(Integer value) {
            addCriterion("full_total_paired >=", value, "fullTotalPaired");
            return (Criteria) this;
        }

        public Criteria andFullTotalPairedLessThan(Integer value) {
            addCriterion("full_total_paired <", value, "fullTotalPaired");
            return (Criteria) this;
        }

        public Criteria andFullTotalPairedLessThanOrEqualTo(Integer value) {
            addCriterion("full_total_paired <=", value, "fullTotalPaired");
            return (Criteria) this;
        }

        public Criteria andFullTotalPairedIn(List<Integer> values) {
            addCriterion("full_total_paired in", values, "fullTotalPaired");
            return (Criteria) this;
        }

        public Criteria andFullTotalPairedNotIn(List<Integer> values) {
            addCriterion("full_total_paired not in", values, "fullTotalPaired");
            return (Criteria) this;
        }

        public Criteria andFullTotalPairedBetween(Integer value1, Integer value2) {
            addCriterion("full_total_paired between", value1, value2, "fullTotalPaired");
            return (Criteria) this;
        }

        public Criteria andFullTotalPairedNotBetween(Integer value1, Integer value2) {
            addCriterion("full_total_paired not between", value1, value2, "fullTotalPaired");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberIsNull() {
            addCriterion("full_total_member is null");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberIsNotNull() {
            addCriterion("full_total_member is not null");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberEqualTo(Integer value) {
            addCriterion("full_total_member =", value, "fullTotalMember");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberNotEqualTo(Integer value) {
            addCriterion("full_total_member <>", value, "fullTotalMember");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberGreaterThan(Integer value) {
            addCriterion("full_total_member >", value, "fullTotalMember");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("full_total_member >=", value, "fullTotalMember");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberLessThan(Integer value) {
            addCriterion("full_total_member <", value, "fullTotalMember");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberLessThanOrEqualTo(Integer value) {
            addCriterion("full_total_member <=", value, "fullTotalMember");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberIn(List<Integer> values) {
            addCriterion("full_total_member in", values, "fullTotalMember");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberNotIn(List<Integer> values) {
            addCriterion("full_total_member not in", values, "fullTotalMember");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberBetween(Integer value1, Integer value2) {
            addCriterion("full_total_member between", value1, value2, "fullTotalMember");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("full_total_member not between", value1, value2, "fullTotalMember");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalOrderAmountIsNull() {
            addCriterion("full_party_total_order_amount is null");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalOrderAmountIsNotNull() {
            addCriterion("full_party_total_order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalOrderAmountEqualTo(Integer value) {
            addCriterion("full_party_total_order_amount =", value, "fullPartyTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalOrderAmountNotEqualTo(Integer value) {
            addCriterion("full_party_total_order_amount <>", value, "fullPartyTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalOrderAmountGreaterThan(Integer value) {
            addCriterion("full_party_total_order_amount >", value, "fullPartyTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalOrderAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("full_party_total_order_amount >=", value, "fullPartyTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalOrderAmountLessThan(Integer value) {
            addCriterion("full_party_total_order_amount <", value, "fullPartyTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalOrderAmountLessThanOrEqualTo(Integer value) {
            addCriterion("full_party_total_order_amount <=", value, "fullPartyTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalOrderAmountIn(List<Integer> values) {
            addCriterion("full_party_total_order_amount in", values, "fullPartyTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalOrderAmountNotIn(List<Integer> values) {
            addCriterion("full_party_total_order_amount not in", values, "fullPartyTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalOrderAmountBetween(Integer value1, Integer value2) {
            addCriterion("full_party_total_order_amount between", value1, value2, "fullPartyTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalOrderAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("full_party_total_order_amount not between", value1, value2, "fullPartyTotalOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalPairedIsNull() {
            addCriterion("full_party_total_paired is null");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalPairedIsNotNull() {
            addCriterion("full_party_total_paired is not null");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalPairedEqualTo(Integer value) {
            addCriterion("full_party_total_paired =", value, "fullPartyTotalPaired");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalPairedNotEqualTo(Integer value) {
            addCriterion("full_party_total_paired <>", value, "fullPartyTotalPaired");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalPairedGreaterThan(Integer value) {
            addCriterion("full_party_total_paired >", value, "fullPartyTotalPaired");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalPairedGreaterThanOrEqualTo(Integer value) {
            addCriterion("full_party_total_paired >=", value, "fullPartyTotalPaired");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalPairedLessThan(Integer value) {
            addCriterion("full_party_total_paired <", value, "fullPartyTotalPaired");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalPairedLessThanOrEqualTo(Integer value) {
            addCriterion("full_party_total_paired <=", value, "fullPartyTotalPaired");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalPairedIn(List<Integer> values) {
            addCriterion("full_party_total_paired in", values, "fullPartyTotalPaired");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalPairedNotIn(List<Integer> values) {
            addCriterion("full_party_total_paired not in", values, "fullPartyTotalPaired");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalPairedBetween(Integer value1, Integer value2) {
            addCriterion("full_party_total_paired between", value1, value2, "fullPartyTotalPaired");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalPairedNotBetween(Integer value1, Integer value2) {
            addCriterion("full_party_total_paired not between", value1, value2, "fullPartyTotalPaired");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalMemberIsNull() {
            addCriterion("full_party_total_member is null");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalMemberIsNotNull() {
            addCriterion("full_party_total_member is not null");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalMemberEqualTo(Integer value) {
            addCriterion("full_party_total_member =", value, "fullPartyTotalMember");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalMemberNotEqualTo(Integer value) {
            addCriterion("full_party_total_member <>", value, "fullPartyTotalMember");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalMemberGreaterThan(Integer value) {
            addCriterion("full_party_total_member >", value, "fullPartyTotalMember");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("full_party_total_member >=", value, "fullPartyTotalMember");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalMemberLessThan(Integer value) {
            addCriterion("full_party_total_member <", value, "fullPartyTotalMember");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalMemberLessThanOrEqualTo(Integer value) {
            addCriterion("full_party_total_member <=", value, "fullPartyTotalMember");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalMemberIn(List<Integer> values) {
            addCriterion("full_party_total_member in", values, "fullPartyTotalMember");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalMemberNotIn(List<Integer> values) {
            addCriterion("full_party_total_member not in", values, "fullPartyTotalMember");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalMemberBetween(Integer value1, Integer value2) {
            addCriterion("full_party_total_member between", value1, value2, "fullPartyTotalMember");
            return (Criteria) this;
        }

        public Criteria andFullPartyTotalMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("full_party_total_member not between", value1, value2, "fullPartyTotalMember");
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

        public Criteria andParentCircleIdIsNull() {
            addCriterion("parent_circle_id is null");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdIsNotNull() {
            addCriterion("parent_circle_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdEqualTo(Integer value) {
            addCriterion("parent_circle_id =", value, "parentCircleId");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdNotEqualTo(Integer value) {
            addCriterion("parent_circle_id <>", value, "parentCircleId");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdGreaterThan(Integer value) {
            addCriterion("parent_circle_id >", value, "parentCircleId");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_circle_id >=", value, "parentCircleId");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdLessThan(Integer value) {
            addCriterion("parent_circle_id <", value, "parentCircleId");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_circle_id <=", value, "parentCircleId");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdIn(List<Integer> values) {
            addCriterion("parent_circle_id in", values, "parentCircleId");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdNotIn(List<Integer> values) {
            addCriterion("parent_circle_id not in", values, "parentCircleId");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_circle_id between", value1, value2, "parentCircleId");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_circle_id not between", value1, value2, "parentCircleId");
            return (Criteria) this;
        }

        public Criteria andFullTotalPayOrderAmountIsNull() {
            addCriterion("full_total_pay_order_amount is null");
            return (Criteria) this;
        }

        public Criteria andFullTotalPayOrderAmountIsNotNull() {
            addCriterion("full_total_pay_order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFullTotalPayOrderAmountEqualTo(Long value) {
            addCriterion("full_total_pay_order_amount =", value, "fullTotalPayOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalPayOrderAmountNotEqualTo(Long value) {
            addCriterion("full_total_pay_order_amount <>", value, "fullTotalPayOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalPayOrderAmountGreaterThan(Long value) {
            addCriterion("full_total_pay_order_amount >", value, "fullTotalPayOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalPayOrderAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("full_total_pay_order_amount >=", value, "fullTotalPayOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalPayOrderAmountLessThan(Long value) {
            addCriterion("full_total_pay_order_amount <", value, "fullTotalPayOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalPayOrderAmountLessThanOrEqualTo(Long value) {
            addCriterion("full_total_pay_order_amount <=", value, "fullTotalPayOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalPayOrderAmountIn(List<Long> values) {
            addCriterion("full_total_pay_order_amount in", values, "fullTotalPayOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalPayOrderAmountNotIn(List<Long> values) {
            addCriterion("full_total_pay_order_amount not in", values, "fullTotalPayOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalPayOrderAmountBetween(Long value1, Long value2) {
            addCriterion("full_total_pay_order_amount between", value1, value2, "fullTotalPayOrderAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalPayOrderAmountNotBetween(Long value1, Long value2) {
            addCriterion("full_total_pay_order_amount not between", value1, value2, "fullTotalPayOrderAmount");
            return (Criteria) this;
        }

        public Criteria andBizOfflineAmountIsNull() {
            addCriterion("biz_offline_amount is null");
            return (Criteria) this;
        }

        public Criteria andBizOfflineAmountIsNotNull() {
            addCriterion("biz_offline_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBizOfflineAmountEqualTo(Integer value) {
            addCriterion("biz_offline_amount =", value, "bizOfflineAmount");
            return (Criteria) this;
        }

        public Criteria andBizOfflineAmountNotEqualTo(Integer value) {
            addCriterion("biz_offline_amount <>", value, "bizOfflineAmount");
            return (Criteria) this;
        }

        public Criteria andBizOfflineAmountGreaterThan(Integer value) {
            addCriterion("biz_offline_amount >", value, "bizOfflineAmount");
            return (Criteria) this;
        }

        public Criteria andBizOfflineAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("biz_offline_amount >=", value, "bizOfflineAmount");
            return (Criteria) this;
        }

        public Criteria andBizOfflineAmountLessThan(Integer value) {
            addCriterion("biz_offline_amount <", value, "bizOfflineAmount");
            return (Criteria) this;
        }

        public Criteria andBizOfflineAmountLessThanOrEqualTo(Integer value) {
            addCriterion("biz_offline_amount <=", value, "bizOfflineAmount");
            return (Criteria) this;
        }

        public Criteria andBizOfflineAmountIn(List<Integer> values) {
            addCriterion("biz_offline_amount in", values, "bizOfflineAmount");
            return (Criteria) this;
        }

        public Criteria andBizOfflineAmountNotIn(List<Integer> values) {
            addCriterion("biz_offline_amount not in", values, "bizOfflineAmount");
            return (Criteria) this;
        }

        public Criteria andBizOfflineAmountBetween(Integer value1, Integer value2) {
            addCriterion("biz_offline_amount between", value1, value2, "bizOfflineAmount");
            return (Criteria) this;
        }

        public Criteria andBizOfflineAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("biz_offline_amount not between", value1, value2, "bizOfflineAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberBocPointsIsNull() {
            addCriterion("full_total_member_boc_points is null");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberBocPointsIsNotNull() {
            addCriterion("full_total_member_boc_points is not null");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberBocPointsEqualTo(Long value) {
            addCriterion("full_total_member_boc_points =", value, "fullTotalMemberBocPoints");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberBocPointsNotEqualTo(Long value) {
            addCriterion("full_total_member_boc_points <>", value, "fullTotalMemberBocPoints");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberBocPointsGreaterThan(Long value) {
            addCriterion("full_total_member_boc_points >", value, "fullTotalMemberBocPoints");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberBocPointsGreaterThanOrEqualTo(Long value) {
            addCriterion("full_total_member_boc_points >=", value, "fullTotalMemberBocPoints");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberBocPointsLessThan(Long value) {
            addCriterion("full_total_member_boc_points <", value, "fullTotalMemberBocPoints");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberBocPointsLessThanOrEqualTo(Long value) {
            addCriterion("full_total_member_boc_points <=", value, "fullTotalMemberBocPoints");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberBocPointsIn(List<Long> values) {
            addCriterion("full_total_member_boc_points in", values, "fullTotalMemberBocPoints");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberBocPointsNotIn(List<Long> values) {
            addCriterion("full_total_member_boc_points not in", values, "fullTotalMemberBocPoints");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberBocPointsBetween(Long value1, Long value2) {
            addCriterion("full_total_member_boc_points between", value1, value2, "fullTotalMemberBocPoints");
            return (Criteria) this;
        }

        public Criteria andFullTotalMemberBocPointsNotBetween(Long value1, Long value2) {
            addCriterion("full_total_member_boc_points not between", value1, value2, "fullTotalMemberBocPoints");
            return (Criteria) this;
        }

        public Criteria andBizOfflinePointsIsNull() {
            addCriterion("biz_offline_points is null");
            return (Criteria) this;
        }

        public Criteria andBizOfflinePointsIsNotNull() {
            addCriterion("biz_offline_points is not null");
            return (Criteria) this;
        }

        public Criteria andBizOfflinePointsEqualTo(Long value) {
            addCriterion("biz_offline_points =", value, "bizOfflinePoints");
            return (Criteria) this;
        }

        public Criteria andBizOfflinePointsNotEqualTo(Long value) {
            addCriterion("biz_offline_points <>", value, "bizOfflinePoints");
            return (Criteria) this;
        }

        public Criteria andBizOfflinePointsGreaterThan(Long value) {
            addCriterion("biz_offline_points >", value, "bizOfflinePoints");
            return (Criteria) this;
        }

        public Criteria andBizOfflinePointsGreaterThanOrEqualTo(Long value) {
            addCriterion("biz_offline_points >=", value, "bizOfflinePoints");
            return (Criteria) this;
        }

        public Criteria andBizOfflinePointsLessThan(Long value) {
            addCriterion("biz_offline_points <", value, "bizOfflinePoints");
            return (Criteria) this;
        }

        public Criteria andBizOfflinePointsLessThanOrEqualTo(Long value) {
            addCriterion("biz_offline_points <=", value, "bizOfflinePoints");
            return (Criteria) this;
        }

        public Criteria andBizOfflinePointsIn(List<Long> values) {
            addCriterion("biz_offline_points in", values, "bizOfflinePoints");
            return (Criteria) this;
        }

        public Criteria andBizOfflinePointsNotIn(List<Long> values) {
            addCriterion("biz_offline_points not in", values, "bizOfflinePoints");
            return (Criteria) this;
        }

        public Criteria andBizOfflinePointsBetween(Long value1, Long value2) {
            addCriterion("biz_offline_points between", value1, value2, "bizOfflinePoints");
            return (Criteria) this;
        }

        public Criteria andBizOfflinePointsNotBetween(Long value1, Long value2) {
            addCriterion("biz_offline_points not between", value1, value2, "bizOfflinePoints");
            return (Criteria) this;
        }

        public Criteria andDayOrderAmountIsNull() {
            addCriterion("day_order_amount is null");
            return (Criteria) this;
        }

        public Criteria andDayOrderAmountIsNotNull() {
            addCriterion("day_order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDayOrderAmountEqualTo(BigDecimal value) {
            addCriterion("day_order_amount =", value, "dayOrderAmount");
            return (Criteria) this;
        }

        public Criteria andDayOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("day_order_amount <>", value, "dayOrderAmount");
            return (Criteria) this;
        }

        public Criteria andDayOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("day_order_amount >", value, "dayOrderAmount");
            return (Criteria) this;
        }

        public Criteria andDayOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("day_order_amount >=", value, "dayOrderAmount");
            return (Criteria) this;
        }

        public Criteria andDayOrderAmountLessThan(BigDecimal value) {
            addCriterion("day_order_amount <", value, "dayOrderAmount");
            return (Criteria) this;
        }

        public Criteria andDayOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("day_order_amount <=", value, "dayOrderAmount");
            return (Criteria) this;
        }

        public Criteria andDayOrderAmountIn(List<BigDecimal> values) {
            addCriterion("day_order_amount in", values, "dayOrderAmount");
            return (Criteria) this;
        }

        public Criteria andDayOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("day_order_amount not in", values, "dayOrderAmount");
            return (Criteria) this;
        }

        public Criteria andDayOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("day_order_amount between", value1, value2, "dayOrderAmount");
            return (Criteria) this;
        }

        public Criteria andDayOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("day_order_amount not between", value1, value2, "dayOrderAmount");
            return (Criteria) this;
        }

        public Criteria andDayOrderNumIsNull() {
            addCriterion("day_order_num is null");
            return (Criteria) this;
        }

        public Criteria andDayOrderNumIsNotNull() {
            addCriterion("day_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andDayOrderNumEqualTo(Integer value) {
            addCriterion("day_order_num =", value, "dayOrderNum");
            return (Criteria) this;
        }

        public Criteria andDayOrderNumNotEqualTo(Integer value) {
            addCriterion("day_order_num <>", value, "dayOrderNum");
            return (Criteria) this;
        }

        public Criteria andDayOrderNumGreaterThan(Integer value) {
            addCriterion("day_order_num >", value, "dayOrderNum");
            return (Criteria) this;
        }

        public Criteria andDayOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_order_num >=", value, "dayOrderNum");
            return (Criteria) this;
        }

        public Criteria andDayOrderNumLessThan(Integer value) {
            addCriterion("day_order_num <", value, "dayOrderNum");
            return (Criteria) this;
        }

        public Criteria andDayOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("day_order_num <=", value, "dayOrderNum");
            return (Criteria) this;
        }

        public Criteria andDayOrderNumIn(List<Integer> values) {
            addCriterion("day_order_num in", values, "dayOrderNum");
            return (Criteria) this;
        }

        public Criteria andDayOrderNumNotIn(List<Integer> values) {
            addCriterion("day_order_num not in", values, "dayOrderNum");
            return (Criteria) this;
        }

        public Criteria andDayOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("day_order_num between", value1, value2, "dayOrderNum");
            return (Criteria) this;
        }

        public Criteria andDayOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("day_order_num not between", value1, value2, "dayOrderNum");
            return (Criteria) this;
        }

        public Criteria andInviteAmountIsNull() {
            addCriterion("invite_amount is null");
            return (Criteria) this;
        }

        public Criteria andInviteAmountIsNotNull() {
            addCriterion("invite_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInviteAmountEqualTo(Long value) {
            addCriterion("invite_amount =", value, "inviteAmount");
            return (Criteria) this;
        }

        public Criteria andInviteAmountNotEqualTo(Long value) {
            addCriterion("invite_amount <>", value, "inviteAmount");
            return (Criteria) this;
        }

        public Criteria andInviteAmountGreaterThan(Long value) {
            addCriterion("invite_amount >", value, "inviteAmount");
            return (Criteria) this;
        }

        public Criteria andInviteAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("invite_amount >=", value, "inviteAmount");
            return (Criteria) this;
        }

        public Criteria andInviteAmountLessThan(Long value) {
            addCriterion("invite_amount <", value, "inviteAmount");
            return (Criteria) this;
        }

        public Criteria andInviteAmountLessThanOrEqualTo(Long value) {
            addCriterion("invite_amount <=", value, "inviteAmount");
            return (Criteria) this;
        }

        public Criteria andInviteAmountIn(List<Long> values) {
            addCriterion("invite_amount in", values, "inviteAmount");
            return (Criteria) this;
        }

        public Criteria andInviteAmountNotIn(List<Long> values) {
            addCriterion("invite_amount not in", values, "inviteAmount");
            return (Criteria) this;
        }

        public Criteria andInviteAmountBetween(Long value1, Long value2) {
            addCriterion("invite_amount between", value1, value2, "inviteAmount");
            return (Criteria) this;
        }

        public Criteria andInviteAmountNotBetween(Long value1, Long value2) {
            addCriterion("invite_amount not between", value1, value2, "inviteAmount");
            return (Criteria) this;
        }

        public Criteria andInviteBocPointsIsNull() {
            addCriterion("invite_boc_points is null");
            return (Criteria) this;
        }

        public Criteria andInviteBocPointsIsNotNull() {
            addCriterion("invite_boc_points is not null");
            return (Criteria) this;
        }

        public Criteria andInviteBocPointsEqualTo(Long value) {
            addCriterion("invite_boc_points =", value, "inviteBocPoints");
            return (Criteria) this;
        }

        public Criteria andInviteBocPointsNotEqualTo(Long value) {
            addCriterion("invite_boc_points <>", value, "inviteBocPoints");
            return (Criteria) this;
        }

        public Criteria andInviteBocPointsGreaterThan(Long value) {
            addCriterion("invite_boc_points >", value, "inviteBocPoints");
            return (Criteria) this;
        }

        public Criteria andInviteBocPointsGreaterThanOrEqualTo(Long value) {
            addCriterion("invite_boc_points >=", value, "inviteBocPoints");
            return (Criteria) this;
        }

        public Criteria andInviteBocPointsLessThan(Long value) {
            addCriterion("invite_boc_points <", value, "inviteBocPoints");
            return (Criteria) this;
        }

        public Criteria andInviteBocPointsLessThanOrEqualTo(Long value) {
            addCriterion("invite_boc_points <=", value, "inviteBocPoints");
            return (Criteria) this;
        }

        public Criteria andInviteBocPointsIn(List<Long> values) {
            addCriterion("invite_boc_points in", values, "inviteBocPoints");
            return (Criteria) this;
        }

        public Criteria andInviteBocPointsNotIn(List<Long> values) {
            addCriterion("invite_boc_points not in", values, "inviteBocPoints");
            return (Criteria) this;
        }

        public Criteria andInviteBocPointsBetween(Long value1, Long value2) {
            addCriterion("invite_boc_points between", value1, value2, "inviteBocPoints");
            return (Criteria) this;
        }

        public Criteria andInviteBocPointsNotBetween(Long value1, Long value2) {
            addCriterion("invite_boc_points not between", value1, value2, "inviteBocPoints");
            return (Criteria) this;
        }

        public Criteria andBizOnlineAmountIsNull() {
            addCriterion("biz_online_amount is null");
            return (Criteria) this;
        }

        public Criteria andBizOnlineAmountIsNotNull() {
            addCriterion("biz_online_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBizOnlineAmountEqualTo(BigDecimal value) {
            addCriterion("biz_online_amount =", value, "bizOnlineAmount");
            return (Criteria) this;
        }

        public Criteria andBizOnlineAmountNotEqualTo(BigDecimal value) {
            addCriterion("biz_online_amount <>", value, "bizOnlineAmount");
            return (Criteria) this;
        }

        public Criteria andBizOnlineAmountGreaterThan(BigDecimal value) {
            addCriterion("biz_online_amount >", value, "bizOnlineAmount");
            return (Criteria) this;
        }

        public Criteria andBizOnlineAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("biz_online_amount >=", value, "bizOnlineAmount");
            return (Criteria) this;
        }

        public Criteria andBizOnlineAmountLessThan(BigDecimal value) {
            addCriterion("biz_online_amount <", value, "bizOnlineAmount");
            return (Criteria) this;
        }

        public Criteria andBizOnlineAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("biz_online_amount <=", value, "bizOnlineAmount");
            return (Criteria) this;
        }

        public Criteria andBizOnlineAmountIn(List<BigDecimal> values) {
            addCriterion("biz_online_amount in", values, "bizOnlineAmount");
            return (Criteria) this;
        }

        public Criteria andBizOnlineAmountNotIn(List<BigDecimal> values) {
            addCriterion("biz_online_amount not in", values, "bizOnlineAmount");
            return (Criteria) this;
        }

        public Criteria andBizOnlineAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("biz_online_amount between", value1, value2, "bizOnlineAmount");
            return (Criteria) this;
        }

        public Criteria andBizOnlineAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("biz_online_amount not between", value1, value2, "bizOnlineAmount");
            return (Criteria) this;
        }

        public Criteria andBizAllAmountIsNull() {
            addCriterion("biz_all_amount is null");
            return (Criteria) this;
        }

        public Criteria andBizAllAmountIsNotNull() {
            addCriterion("biz_all_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBizAllAmountEqualTo(Long value) {
            addCriterion("biz_all_amount =", value, "bizAllAmount");
            return (Criteria) this;
        }

        public Criteria andBizAllAmountNotEqualTo(Long value) {
            addCriterion("biz_all_amount <>", value, "bizAllAmount");
            return (Criteria) this;
        }

        public Criteria andBizAllAmountGreaterThan(Long value) {
            addCriterion("biz_all_amount >", value, "bizAllAmount");
            return (Criteria) this;
        }

        public Criteria andBizAllAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("biz_all_amount >=", value, "bizAllAmount");
            return (Criteria) this;
        }

        public Criteria andBizAllAmountLessThan(Long value) {
            addCriterion("biz_all_amount <", value, "bizAllAmount");
            return (Criteria) this;
        }

        public Criteria andBizAllAmountLessThanOrEqualTo(Long value) {
            addCriterion("biz_all_amount <=", value, "bizAllAmount");
            return (Criteria) this;
        }

        public Criteria andBizAllAmountIn(List<Long> values) {
            addCriterion("biz_all_amount in", values, "bizAllAmount");
            return (Criteria) this;
        }

        public Criteria andBizAllAmountNotIn(List<Long> values) {
            addCriterion("biz_all_amount not in", values, "bizAllAmount");
            return (Criteria) this;
        }

        public Criteria andBizAllAmountBetween(Long value1, Long value2) {
            addCriterion("biz_all_amount between", value1, value2, "bizAllAmount");
            return (Criteria) this;
        }

        public Criteria andBizAllAmountNotBetween(Long value1, Long value2) {
            addCriterion("biz_all_amount not between", value1, value2, "bizAllAmount");
            return (Criteria) this;
        }

        public Criteria andInviteNumIsNull() {
            addCriterion("invite_num is null");
            return (Criteria) this;
        }

        public Criteria andInviteNumIsNotNull() {
            addCriterion("invite_num is not null");
            return (Criteria) this;
        }

        public Criteria andInviteNumEqualTo(Integer value) {
            addCriterion("invite_num =", value, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumNotEqualTo(Integer value) {
            addCriterion("invite_num <>", value, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumGreaterThan(Integer value) {
            addCriterion("invite_num >", value, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("invite_num >=", value, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumLessThan(Integer value) {
            addCriterion("invite_num <", value, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumLessThanOrEqualTo(Integer value) {
            addCriterion("invite_num <=", value, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumIn(List<Integer> values) {
            addCriterion("invite_num in", values, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumNotIn(List<Integer> values) {
            addCriterion("invite_num not in", values, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumBetween(Integer value1, Integer value2) {
            addCriterion("invite_num between", value1, value2, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumNotBetween(Integer value1, Integer value2) {
            addCriterion("invite_num not between", value1, value2, "inviteNum");
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

        public Criteria andFullTotalSupportCountyAmountIsNull() {
            addCriterion("full_total_support_county_amount is null");
            return (Criteria) this;
        }

        public Criteria andFullTotalSupportCountyAmountIsNotNull() {
            addCriterion("full_total_support_county_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFullTotalSupportCountyAmountEqualTo(Long value) {
            addCriterion("full_total_support_county_amount =", value, "fullTotalSupportCountyAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalSupportCountyAmountNotEqualTo(Long value) {
            addCriterion("full_total_support_county_amount <>", value, "fullTotalSupportCountyAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalSupportCountyAmountGreaterThan(Long value) {
            addCriterion("full_total_support_county_amount >", value, "fullTotalSupportCountyAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalSupportCountyAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("full_total_support_county_amount >=", value, "fullTotalSupportCountyAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalSupportCountyAmountLessThan(Long value) {
            addCriterion("full_total_support_county_amount <", value, "fullTotalSupportCountyAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalSupportCountyAmountLessThanOrEqualTo(Long value) {
            addCriterion("full_total_support_county_amount <=", value, "fullTotalSupportCountyAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalSupportCountyAmountIn(List<Long> values) {
            addCriterion("full_total_support_county_amount in", values, "fullTotalSupportCountyAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalSupportCountyAmountNotIn(List<Long> values) {
            addCriterion("full_total_support_county_amount not in", values, "fullTotalSupportCountyAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalSupportCountyAmountBetween(Long value1, Long value2) {
            addCriterion("full_total_support_county_amount between", value1, value2, "fullTotalSupportCountyAmount");
            return (Criteria) this;
        }

        public Criteria andFullTotalSupportCountyAmountNotBetween(Long value1, Long value2) {
            addCriterion("full_total_support_county_amount not between", value1, value2, "fullTotalSupportCountyAmount");
            return (Criteria) this;
        }

        public Criteria andStaffsAmountIsNull() {
            addCriterion("staffs_amount is null");
            return (Criteria) this;
        }

        public Criteria andStaffsAmountIsNotNull() {
            addCriterion("staffs_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStaffsAmountEqualTo(Long value) {
            addCriterion("staffs_amount =", value, "staffsAmount");
            return (Criteria) this;
        }

        public Criteria andStaffsAmountNotEqualTo(Long value) {
            addCriterion("staffs_amount <>", value, "staffsAmount");
            return (Criteria) this;
        }

        public Criteria andStaffsAmountGreaterThan(Long value) {
            addCriterion("staffs_amount >", value, "staffsAmount");
            return (Criteria) this;
        }

        public Criteria andStaffsAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("staffs_amount >=", value, "staffsAmount");
            return (Criteria) this;
        }

        public Criteria andStaffsAmountLessThan(Long value) {
            addCriterion("staffs_amount <", value, "staffsAmount");
            return (Criteria) this;
        }

        public Criteria andStaffsAmountLessThanOrEqualTo(Long value) {
            addCriterion("staffs_amount <=", value, "staffsAmount");
            return (Criteria) this;
        }

        public Criteria andStaffsAmountIn(List<Long> values) {
            addCriterion("staffs_amount in", values, "staffsAmount");
            return (Criteria) this;
        }

        public Criteria andStaffsAmountNotIn(List<Long> values) {
            addCriterion("staffs_amount not in", values, "staffsAmount");
            return (Criteria) this;
        }

        public Criteria andStaffsAmountBetween(Long value1, Long value2) {
            addCriterion("staffs_amount between", value1, value2, "staffsAmount");
            return (Criteria) this;
        }

        public Criteria andStaffsAmountNotBetween(Long value1, Long value2) {
            addCriterion("staffs_amount not between", value1, value2, "staffsAmount");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_boc_member_stats表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-11-08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_boc_member_stats 2017-11-08
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