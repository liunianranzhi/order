package com.shanyuan.platform.ms.dao.user.entity;

import java.util.ArrayList;
import java.util.List;

public class SyGuideShowStateExample {
    /**
     * sy_guide_show_state
     */
    protected String orderByClause;

    /**
     * sy_guide_show_state
     */
    protected boolean distinct;

    /**
     * sy_guide_show_state
     */
    protected List<Criteria> oredCriteria;

    public SyGuideShowStateExample() {
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
     * sy_guide_show_state 2017-11-28
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

        public Criteria andBocSupportIsNull() {
            addCriterion("boc_support is null");
            return (Criteria) this;
        }

        public Criteria andBocSupportIsNotNull() {
            addCriterion("boc_support is not null");
            return (Criteria) this;
        }

        public Criteria andBocSupportEqualTo(Byte value) {
            addCriterion("boc_support =", value, "bocSupport");
            return (Criteria) this;
        }

        public Criteria andBocSupportNotEqualTo(Byte value) {
            addCriterion("boc_support <>", value, "bocSupport");
            return (Criteria) this;
        }

        public Criteria andBocSupportGreaterThan(Byte value) {
            addCriterion("boc_support >", value, "bocSupport");
            return (Criteria) this;
        }

        public Criteria andBocSupportGreaterThanOrEqualTo(Byte value) {
            addCriterion("boc_support >=", value, "bocSupport");
            return (Criteria) this;
        }

        public Criteria andBocSupportLessThan(Byte value) {
            addCriterion("boc_support <", value, "bocSupport");
            return (Criteria) this;
        }

        public Criteria andBocSupportLessThanOrEqualTo(Byte value) {
            addCriterion("boc_support <=", value, "bocSupport");
            return (Criteria) this;
        }

        public Criteria andBocSupportIn(List<Byte> values) {
            addCriterion("boc_support in", values, "bocSupport");
            return (Criteria) this;
        }

        public Criteria andBocSupportNotIn(List<Byte> values) {
            addCriterion("boc_support not in", values, "bocSupport");
            return (Criteria) this;
        }

        public Criteria andBocSupportBetween(Byte value1, Byte value2) {
            addCriterion("boc_support between", value1, value2, "bocSupport");
            return (Criteria) this;
        }

        public Criteria andBocSupportNotBetween(Byte value1, Byte value2) {
            addCriterion("boc_support not between", value1, value2, "bocSupport");
            return (Criteria) this;
        }

        public Criteria andBocSupportIndexIsNull() {
            addCriterion("boc_support_index is null");
            return (Criteria) this;
        }

        public Criteria andBocSupportIndexIsNotNull() {
            addCriterion("boc_support_index is not null");
            return (Criteria) this;
        }

        public Criteria andBocSupportIndexEqualTo(Byte value) {
            addCriterion("boc_support_index =", value, "bocSupportIndex");
            return (Criteria) this;
        }

        public Criteria andBocSupportIndexNotEqualTo(Byte value) {
            addCriterion("boc_support_index <>", value, "bocSupportIndex");
            return (Criteria) this;
        }

        public Criteria andBocSupportIndexGreaterThan(Byte value) {
            addCriterion("boc_support_index >", value, "bocSupportIndex");
            return (Criteria) this;
        }

        public Criteria andBocSupportIndexGreaterThanOrEqualTo(Byte value) {
            addCriterion("boc_support_index >=", value, "bocSupportIndex");
            return (Criteria) this;
        }

        public Criteria andBocSupportIndexLessThan(Byte value) {
            addCriterion("boc_support_index <", value, "bocSupportIndex");
            return (Criteria) this;
        }

        public Criteria andBocSupportIndexLessThanOrEqualTo(Byte value) {
            addCriterion("boc_support_index <=", value, "bocSupportIndex");
            return (Criteria) this;
        }

        public Criteria andBocSupportIndexIn(List<Byte> values) {
            addCriterion("boc_support_index in", values, "bocSupportIndex");
            return (Criteria) this;
        }

        public Criteria andBocSupportIndexNotIn(List<Byte> values) {
            addCriterion("boc_support_index not in", values, "bocSupportIndex");
            return (Criteria) this;
        }

        public Criteria andBocSupportIndexBetween(Byte value1, Byte value2) {
            addCriterion("boc_support_index between", value1, value2, "bocSupportIndex");
            return (Criteria) this;
        }

        public Criteria andBocSupportIndexNotBetween(Byte value1, Byte value2) {
            addCriterion("boc_support_index not between", value1, value2, "bocSupportIndex");
            return (Criteria) this;
        }

        public Criteria andBocIndexIsNull() {
            addCriterion("boc_index is null");
            return (Criteria) this;
        }

        public Criteria andBocIndexIsNotNull() {
            addCriterion("boc_index is not null");
            return (Criteria) this;
        }

        public Criteria andBocIndexEqualTo(Byte value) {
            addCriterion("boc_index =", value, "bocIndex");
            return (Criteria) this;
        }

        public Criteria andBocIndexNotEqualTo(Byte value) {
            addCriterion("boc_index <>", value, "bocIndex");
            return (Criteria) this;
        }

        public Criteria andBocIndexGreaterThan(Byte value) {
            addCriterion("boc_index >", value, "bocIndex");
            return (Criteria) this;
        }

        public Criteria andBocIndexGreaterThanOrEqualTo(Byte value) {
            addCriterion("boc_index >=", value, "bocIndex");
            return (Criteria) this;
        }

        public Criteria andBocIndexLessThan(Byte value) {
            addCriterion("boc_index <", value, "bocIndex");
            return (Criteria) this;
        }

        public Criteria andBocIndexLessThanOrEqualTo(Byte value) {
            addCriterion("boc_index <=", value, "bocIndex");
            return (Criteria) this;
        }

        public Criteria andBocIndexIn(List<Byte> values) {
            addCriterion("boc_index in", values, "bocIndex");
            return (Criteria) this;
        }

        public Criteria andBocIndexNotIn(List<Byte> values) {
            addCriterion("boc_index not in", values, "bocIndex");
            return (Criteria) this;
        }

        public Criteria andBocIndexBetween(Byte value1, Byte value2) {
            addCriterion("boc_index between", value1, value2, "bocIndex");
            return (Criteria) this;
        }

        public Criteria andBocIndexNotBetween(Byte value1, Byte value2) {
            addCriterion("boc_index not between", value1, value2, "bocIndex");
            return (Criteria) this;
        }

        public Criteria andBocRankIsNull() {
            addCriterion("boc_rank is null");
            return (Criteria) this;
        }

        public Criteria andBocRankIsNotNull() {
            addCriterion("boc_rank is not null");
            return (Criteria) this;
        }

        public Criteria andBocRankEqualTo(Byte value) {
            addCriterion("boc_rank =", value, "bocRank");
            return (Criteria) this;
        }

        public Criteria andBocRankNotEqualTo(Byte value) {
            addCriterion("boc_rank <>", value, "bocRank");
            return (Criteria) this;
        }

        public Criteria andBocRankGreaterThan(Byte value) {
            addCriterion("boc_rank >", value, "bocRank");
            return (Criteria) this;
        }

        public Criteria andBocRankGreaterThanOrEqualTo(Byte value) {
            addCriterion("boc_rank >=", value, "bocRank");
            return (Criteria) this;
        }

        public Criteria andBocRankLessThan(Byte value) {
            addCriterion("boc_rank <", value, "bocRank");
            return (Criteria) this;
        }

        public Criteria andBocRankLessThanOrEqualTo(Byte value) {
            addCriterion("boc_rank <=", value, "bocRank");
            return (Criteria) this;
        }

        public Criteria andBocRankIn(List<Byte> values) {
            addCriterion("boc_rank in", values, "bocRank");
            return (Criteria) this;
        }

        public Criteria andBocRankNotIn(List<Byte> values) {
            addCriterion("boc_rank not in", values, "bocRank");
            return (Criteria) this;
        }

        public Criteria andBocRankBetween(Byte value1, Byte value2) {
            addCriterion("boc_rank between", value1, value2, "bocRank");
            return (Criteria) this;
        }

        public Criteria andBocRankNotBetween(Byte value1, Byte value2) {
            addCriterion("boc_rank not between", value1, value2, "bocRank");
            return (Criteria) this;
        }

        public Criteria andBocPoorGoodsIsNull() {
            addCriterion("boc_poor_goods is null");
            return (Criteria) this;
        }

        public Criteria andBocPoorGoodsIsNotNull() {
            addCriterion("boc_poor_goods is not null");
            return (Criteria) this;
        }

        public Criteria andBocPoorGoodsEqualTo(Byte value) {
            addCriterion("boc_poor_goods =", value, "bocPoorGoods");
            return (Criteria) this;
        }

        public Criteria andBocPoorGoodsNotEqualTo(Byte value) {
            addCriterion("boc_poor_goods <>", value, "bocPoorGoods");
            return (Criteria) this;
        }

        public Criteria andBocPoorGoodsGreaterThan(Byte value) {
            addCriterion("boc_poor_goods >", value, "bocPoorGoods");
            return (Criteria) this;
        }

        public Criteria andBocPoorGoodsGreaterThanOrEqualTo(Byte value) {
            addCriterion("boc_poor_goods >=", value, "bocPoorGoods");
            return (Criteria) this;
        }

        public Criteria andBocPoorGoodsLessThan(Byte value) {
            addCriterion("boc_poor_goods <", value, "bocPoorGoods");
            return (Criteria) this;
        }

        public Criteria andBocPoorGoodsLessThanOrEqualTo(Byte value) {
            addCriterion("boc_poor_goods <=", value, "bocPoorGoods");
            return (Criteria) this;
        }

        public Criteria andBocPoorGoodsIn(List<Byte> values) {
            addCriterion("boc_poor_goods in", values, "bocPoorGoods");
            return (Criteria) this;
        }

        public Criteria andBocPoorGoodsNotIn(List<Byte> values) {
            addCriterion("boc_poor_goods not in", values, "bocPoorGoods");
            return (Criteria) this;
        }

        public Criteria andBocPoorGoodsBetween(Byte value1, Byte value2) {
            addCriterion("boc_poor_goods between", value1, value2, "bocPoorGoods");
            return (Criteria) this;
        }

        public Criteria andBocPoorGoodsNotBetween(Byte value1, Byte value2) {
            addCriterion("boc_poor_goods not between", value1, value2, "bocPoorGoods");
            return (Criteria) this;
        }

        public Criteria andBocOtherGoodsIsNull() {
            addCriterion("boc_other_goods is null");
            return (Criteria) this;
        }

        public Criteria andBocOtherGoodsIsNotNull() {
            addCriterion("boc_other_goods is not null");
            return (Criteria) this;
        }

        public Criteria andBocOtherGoodsEqualTo(Byte value) {
            addCriterion("boc_other_goods =", value, "bocOtherGoods");
            return (Criteria) this;
        }

        public Criteria andBocOtherGoodsNotEqualTo(Byte value) {
            addCriterion("boc_other_goods <>", value, "bocOtherGoods");
            return (Criteria) this;
        }

        public Criteria andBocOtherGoodsGreaterThan(Byte value) {
            addCriterion("boc_other_goods >", value, "bocOtherGoods");
            return (Criteria) this;
        }

        public Criteria andBocOtherGoodsGreaterThanOrEqualTo(Byte value) {
            addCriterion("boc_other_goods >=", value, "bocOtherGoods");
            return (Criteria) this;
        }

        public Criteria andBocOtherGoodsLessThan(Byte value) {
            addCriterion("boc_other_goods <", value, "bocOtherGoods");
            return (Criteria) this;
        }

        public Criteria andBocOtherGoodsLessThanOrEqualTo(Byte value) {
            addCriterion("boc_other_goods <=", value, "bocOtherGoods");
            return (Criteria) this;
        }

        public Criteria andBocOtherGoodsIn(List<Byte> values) {
            addCriterion("boc_other_goods in", values, "bocOtherGoods");
            return (Criteria) this;
        }

        public Criteria andBocOtherGoodsNotIn(List<Byte> values) {
            addCriterion("boc_other_goods not in", values, "bocOtherGoods");
            return (Criteria) this;
        }

        public Criteria andBocOtherGoodsBetween(Byte value1, Byte value2) {
            addCriterion("boc_other_goods between", value1, value2, "bocOtherGoods");
            return (Criteria) this;
        }

        public Criteria andBocOtherGoodsNotBetween(Byte value1, Byte value2) {
            addCriterion("boc_other_goods not between", value1, value2, "bocOtherGoods");
            return (Criteria) this;
        }

        public Criteria andBocCartIsNull() {
            addCriterion("boc_cart is null");
            return (Criteria) this;
        }

        public Criteria andBocCartIsNotNull() {
            addCriterion("boc_cart is not null");
            return (Criteria) this;
        }

        public Criteria andBocCartEqualTo(Byte value) {
            addCriterion("boc_cart =", value, "bocCart");
            return (Criteria) this;
        }

        public Criteria andBocCartNotEqualTo(Byte value) {
            addCriterion("boc_cart <>", value, "bocCart");
            return (Criteria) this;
        }

        public Criteria andBocCartGreaterThan(Byte value) {
            addCriterion("boc_cart >", value, "bocCart");
            return (Criteria) this;
        }

        public Criteria andBocCartGreaterThanOrEqualTo(Byte value) {
            addCriterion("boc_cart >=", value, "bocCart");
            return (Criteria) this;
        }

        public Criteria andBocCartLessThan(Byte value) {
            addCriterion("boc_cart <", value, "bocCart");
            return (Criteria) this;
        }

        public Criteria andBocCartLessThanOrEqualTo(Byte value) {
            addCriterion("boc_cart <=", value, "bocCart");
            return (Criteria) this;
        }

        public Criteria andBocCartIn(List<Byte> values) {
            addCriterion("boc_cart in", values, "bocCart");
            return (Criteria) this;
        }

        public Criteria andBocCartNotIn(List<Byte> values) {
            addCriterion("boc_cart not in", values, "bocCart");
            return (Criteria) this;
        }

        public Criteria andBocCartBetween(Byte value1, Byte value2) {
            addCriterion("boc_cart between", value1, value2, "bocCart");
            return (Criteria) this;
        }

        public Criteria andBocCartNotBetween(Byte value1, Byte value2) {
            addCriterion("boc_cart not between", value1, value2, "bocCart");
            return (Criteria) this;
        }

        public Criteria andBocBuyIsNull() {
            addCriterion("boc_buy is null");
            return (Criteria) this;
        }

        public Criteria andBocBuyIsNotNull() {
            addCriterion("boc_buy is not null");
            return (Criteria) this;
        }

        public Criteria andBocBuyEqualTo(Byte value) {
            addCriterion("boc_buy =", value, "bocBuy");
            return (Criteria) this;
        }

        public Criteria andBocBuyNotEqualTo(Byte value) {
            addCriterion("boc_buy <>", value, "bocBuy");
            return (Criteria) this;
        }

        public Criteria andBocBuyGreaterThan(Byte value) {
            addCriterion("boc_buy >", value, "bocBuy");
            return (Criteria) this;
        }

        public Criteria andBocBuyGreaterThanOrEqualTo(Byte value) {
            addCriterion("boc_buy >=", value, "bocBuy");
            return (Criteria) this;
        }

        public Criteria andBocBuyLessThan(Byte value) {
            addCriterion("boc_buy <", value, "bocBuy");
            return (Criteria) this;
        }

        public Criteria andBocBuyLessThanOrEqualTo(Byte value) {
            addCriterion("boc_buy <=", value, "bocBuy");
            return (Criteria) this;
        }

        public Criteria andBocBuyIn(List<Byte> values) {
            addCriterion("boc_buy in", values, "bocBuy");
            return (Criteria) this;
        }

        public Criteria andBocBuyNotIn(List<Byte> values) {
            addCriterion("boc_buy not in", values, "bocBuy");
            return (Criteria) this;
        }

        public Criteria andBocBuyBetween(Byte value1, Byte value2) {
            addCriterion("boc_buy between", value1, value2, "bocBuy");
            return (Criteria) this;
        }

        public Criteria andBocBuyNotBetween(Byte value1, Byte value2) {
            addCriterion("boc_buy not between", value1, value2, "bocBuy");
            return (Criteria) this;
        }

        public Criteria andAgentHomeIsNull() {
            addCriterion("agent_home is null");
            return (Criteria) this;
        }

        public Criteria andAgentHomeIsNotNull() {
            addCriterion("agent_home is not null");
            return (Criteria) this;
        }

        public Criteria andAgentHomeEqualTo(Byte value) {
            addCriterion("agent_home =", value, "agentHome");
            return (Criteria) this;
        }

        public Criteria andAgentHomeNotEqualTo(Byte value) {
            addCriterion("agent_home <>", value, "agentHome");
            return (Criteria) this;
        }

        public Criteria andAgentHomeGreaterThan(Byte value) {
            addCriterion("agent_home >", value, "agentHome");
            return (Criteria) this;
        }

        public Criteria andAgentHomeGreaterThanOrEqualTo(Byte value) {
            addCriterion("agent_home >=", value, "agentHome");
            return (Criteria) this;
        }

        public Criteria andAgentHomeLessThan(Byte value) {
            addCriterion("agent_home <", value, "agentHome");
            return (Criteria) this;
        }

        public Criteria andAgentHomeLessThanOrEqualTo(Byte value) {
            addCriterion("agent_home <=", value, "agentHome");
            return (Criteria) this;
        }

        public Criteria andAgentHomeIn(List<Byte> values) {
            addCriterion("agent_home in", values, "agentHome");
            return (Criteria) this;
        }

        public Criteria andAgentHomeNotIn(List<Byte> values) {
            addCriterion("agent_home not in", values, "agentHome");
            return (Criteria) this;
        }

        public Criteria andAgentHomeBetween(Byte value1, Byte value2) {
            addCriterion("agent_home between", value1, value2, "agentHome");
            return (Criteria) this;
        }

        public Criteria andAgentHomeNotBetween(Byte value1, Byte value2) {
            addCriterion("agent_home not between", value1, value2, "agentHome");
            return (Criteria) this;
        }

        public Criteria andAgentPoorListIsNull() {
            addCriterion("agent_poor_list is null");
            return (Criteria) this;
        }

        public Criteria andAgentPoorListIsNotNull() {
            addCriterion("agent_poor_list is not null");
            return (Criteria) this;
        }

        public Criteria andAgentPoorListEqualTo(Byte value) {
            addCriterion("agent_poor_list =", value, "agentPoorList");
            return (Criteria) this;
        }

        public Criteria andAgentPoorListNotEqualTo(Byte value) {
            addCriterion("agent_poor_list <>", value, "agentPoorList");
            return (Criteria) this;
        }

        public Criteria andAgentPoorListGreaterThan(Byte value) {
            addCriterion("agent_poor_list >", value, "agentPoorList");
            return (Criteria) this;
        }

        public Criteria andAgentPoorListGreaterThanOrEqualTo(Byte value) {
            addCriterion("agent_poor_list >=", value, "agentPoorList");
            return (Criteria) this;
        }

        public Criteria andAgentPoorListLessThan(Byte value) {
            addCriterion("agent_poor_list <", value, "agentPoorList");
            return (Criteria) this;
        }

        public Criteria andAgentPoorListLessThanOrEqualTo(Byte value) {
            addCriterion("agent_poor_list <=", value, "agentPoorList");
            return (Criteria) this;
        }

        public Criteria andAgentPoorListIn(List<Byte> values) {
            addCriterion("agent_poor_list in", values, "agentPoorList");
            return (Criteria) this;
        }

        public Criteria andAgentPoorListNotIn(List<Byte> values) {
            addCriterion("agent_poor_list not in", values, "agentPoorList");
            return (Criteria) this;
        }

        public Criteria andAgentPoorListBetween(Byte value1, Byte value2) {
            addCriterion("agent_poor_list between", value1, value2, "agentPoorList");
            return (Criteria) this;
        }

        public Criteria andAgentPoorListNotBetween(Byte value1, Byte value2) {
            addCriterion("agent_poor_list not between", value1, value2, "agentPoorList");
            return (Criteria) this;
        }

        public Criteria andAgentPoorAddGoodsIsNull() {
            addCriterion("agent_poor_add_goods is null");
            return (Criteria) this;
        }

        public Criteria andAgentPoorAddGoodsIsNotNull() {
            addCriterion("agent_poor_add_goods is not null");
            return (Criteria) this;
        }

        public Criteria andAgentPoorAddGoodsEqualTo(Byte value) {
            addCriterion("agent_poor_add_goods =", value, "agentPoorAddGoods");
            return (Criteria) this;
        }

        public Criteria andAgentPoorAddGoodsNotEqualTo(Byte value) {
            addCriterion("agent_poor_add_goods <>", value, "agentPoorAddGoods");
            return (Criteria) this;
        }

        public Criteria andAgentPoorAddGoodsGreaterThan(Byte value) {
            addCriterion("agent_poor_add_goods >", value, "agentPoorAddGoods");
            return (Criteria) this;
        }

        public Criteria andAgentPoorAddGoodsGreaterThanOrEqualTo(Byte value) {
            addCriterion("agent_poor_add_goods >=", value, "agentPoorAddGoods");
            return (Criteria) this;
        }

        public Criteria andAgentPoorAddGoodsLessThan(Byte value) {
            addCriterion("agent_poor_add_goods <", value, "agentPoorAddGoods");
            return (Criteria) this;
        }

        public Criteria andAgentPoorAddGoodsLessThanOrEqualTo(Byte value) {
            addCriterion("agent_poor_add_goods <=", value, "agentPoorAddGoods");
            return (Criteria) this;
        }

        public Criteria andAgentPoorAddGoodsIn(List<Byte> values) {
            addCriterion("agent_poor_add_goods in", values, "agentPoorAddGoods");
            return (Criteria) this;
        }

        public Criteria andAgentPoorAddGoodsNotIn(List<Byte> values) {
            addCriterion("agent_poor_add_goods not in", values, "agentPoorAddGoods");
            return (Criteria) this;
        }

        public Criteria andAgentPoorAddGoodsBetween(Byte value1, Byte value2) {
            addCriterion("agent_poor_add_goods between", value1, value2, "agentPoorAddGoods");
            return (Criteria) this;
        }

        public Criteria andAgentPoorAddGoodsNotBetween(Byte value1, Byte value2) {
            addCriterion("agent_poor_add_goods not between", value1, value2, "agentPoorAddGoods");
            return (Criteria) this;
        }

        public Criteria andPoorHomeIsNull() {
            addCriterion("poor_home is null");
            return (Criteria) this;
        }

        public Criteria andPoorHomeIsNotNull() {
            addCriterion("poor_home is not null");
            return (Criteria) this;
        }

        public Criteria andPoorHomeEqualTo(Byte value) {
            addCriterion("poor_home =", value, "poorHome");
            return (Criteria) this;
        }

        public Criteria andPoorHomeNotEqualTo(Byte value) {
            addCriterion("poor_home <>", value, "poorHome");
            return (Criteria) this;
        }

        public Criteria andPoorHomeGreaterThan(Byte value) {
            addCriterion("poor_home >", value, "poorHome");
            return (Criteria) this;
        }

        public Criteria andPoorHomeGreaterThanOrEqualTo(Byte value) {
            addCriterion("poor_home >=", value, "poorHome");
            return (Criteria) this;
        }

        public Criteria andPoorHomeLessThan(Byte value) {
            addCriterion("poor_home <", value, "poorHome");
            return (Criteria) this;
        }

        public Criteria andPoorHomeLessThanOrEqualTo(Byte value) {
            addCriterion("poor_home <=", value, "poorHome");
            return (Criteria) this;
        }

        public Criteria andPoorHomeIn(List<Byte> values) {
            addCriterion("poor_home in", values, "poorHome");
            return (Criteria) this;
        }

        public Criteria andPoorHomeNotIn(List<Byte> values) {
            addCriterion("poor_home not in", values, "poorHome");
            return (Criteria) this;
        }

        public Criteria andPoorHomeBetween(Byte value1, Byte value2) {
            addCriterion("poor_home between", value1, value2, "poorHome");
            return (Criteria) this;
        }

        public Criteria andPoorHomeNotBetween(Byte value1, Byte value2) {
            addCriterion("poor_home not between", value1, value2, "poorHome");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsAddIsNull() {
            addCriterion("poor_goods_add is null");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsAddIsNotNull() {
            addCriterion("poor_goods_add is not null");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsAddEqualTo(Byte value) {
            addCriterion("poor_goods_add =", value, "poorGoodsAdd");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsAddNotEqualTo(Byte value) {
            addCriterion("poor_goods_add <>", value, "poorGoodsAdd");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsAddGreaterThan(Byte value) {
            addCriterion("poor_goods_add >", value, "poorGoodsAdd");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsAddGreaterThanOrEqualTo(Byte value) {
            addCriterion("poor_goods_add >=", value, "poorGoodsAdd");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsAddLessThan(Byte value) {
            addCriterion("poor_goods_add <", value, "poorGoodsAdd");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsAddLessThanOrEqualTo(Byte value) {
            addCriterion("poor_goods_add <=", value, "poorGoodsAdd");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsAddIn(List<Byte> values) {
            addCriterion("poor_goods_add in", values, "poorGoodsAdd");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsAddNotIn(List<Byte> values) {
            addCriterion("poor_goods_add not in", values, "poorGoodsAdd");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsAddBetween(Byte value1, Byte value2) {
            addCriterion("poor_goods_add between", value1, value2, "poorGoodsAdd");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsAddNotBetween(Byte value1, Byte value2) {
            addCriterion("poor_goods_add not between", value1, value2, "poorGoodsAdd");
            return (Criteria) this;
        }

        public Criteria andManagerAddIsNull() {
            addCriterion("manager_add is null");
            return (Criteria) this;
        }

        public Criteria andManagerAddIsNotNull() {
            addCriterion("manager_add is not null");
            return (Criteria) this;
        }

        public Criteria andManagerAddEqualTo(Byte value) {
            addCriterion("manager_add =", value, "managerAdd");
            return (Criteria) this;
        }

        public Criteria andManagerAddNotEqualTo(Byte value) {
            addCriterion("manager_add <>", value, "managerAdd");
            return (Criteria) this;
        }

        public Criteria andManagerAddGreaterThan(Byte value) {
            addCriterion("manager_add >", value, "managerAdd");
            return (Criteria) this;
        }

        public Criteria andManagerAddGreaterThanOrEqualTo(Byte value) {
            addCriterion("manager_add >=", value, "managerAdd");
            return (Criteria) this;
        }

        public Criteria andManagerAddLessThan(Byte value) {
            addCriterion("manager_add <", value, "managerAdd");
            return (Criteria) this;
        }

        public Criteria andManagerAddLessThanOrEqualTo(Byte value) {
            addCriterion("manager_add <=", value, "managerAdd");
            return (Criteria) this;
        }

        public Criteria andManagerAddIn(List<Byte> values) {
            addCriterion("manager_add in", values, "managerAdd");
            return (Criteria) this;
        }

        public Criteria andManagerAddNotIn(List<Byte> values) {
            addCriterion("manager_add not in", values, "managerAdd");
            return (Criteria) this;
        }

        public Criteria andManagerAddBetween(Byte value1, Byte value2) {
            addCriterion("manager_add between", value1, value2, "managerAdd");
            return (Criteria) this;
        }

        public Criteria andManagerAddNotBetween(Byte value1, Byte value2) {
            addCriterion("manager_add not between", value1, value2, "managerAdd");
            return (Criteria) this;
        }

        public Criteria andMemberCertIsNull() {
            addCriterion("member_cert is null");
            return (Criteria) this;
        }

        public Criteria andMemberCertIsNotNull() {
            addCriterion("member_cert is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCertEqualTo(Byte value) {
            addCriterion("member_cert =", value, "memberCert");
            return (Criteria) this;
        }

        public Criteria andMemberCertNotEqualTo(Byte value) {
            addCriterion("member_cert <>", value, "memberCert");
            return (Criteria) this;
        }

        public Criteria andMemberCertGreaterThan(Byte value) {
            addCriterion("member_cert >", value, "memberCert");
            return (Criteria) this;
        }

        public Criteria andMemberCertGreaterThanOrEqualTo(Byte value) {
            addCriterion("member_cert >=", value, "memberCert");
            return (Criteria) this;
        }

        public Criteria andMemberCertLessThan(Byte value) {
            addCriterion("member_cert <", value, "memberCert");
            return (Criteria) this;
        }

        public Criteria andMemberCertLessThanOrEqualTo(Byte value) {
            addCriterion("member_cert <=", value, "memberCert");
            return (Criteria) this;
        }

        public Criteria andMemberCertIn(List<Byte> values) {
            addCriterion("member_cert in", values, "memberCert");
            return (Criteria) this;
        }

        public Criteria andMemberCertNotIn(List<Byte> values) {
            addCriterion("member_cert not in", values, "memberCert");
            return (Criteria) this;
        }

        public Criteria andMemberCertBetween(Byte value1, Byte value2) {
            addCriterion("member_cert between", value1, value2, "memberCert");
            return (Criteria) this;
        }

        public Criteria andMemberCertNotBetween(Byte value1, Byte value2) {
            addCriterion("member_cert not between", value1, value2, "memberCert");
            return (Criteria) this;
        }

        public Criteria andUserAgreementIsNull() {
            addCriterion("user_agreement is null");
            return (Criteria) this;
        }

        public Criteria andUserAgreementIsNotNull() {
            addCriterion("user_agreement is not null");
            return (Criteria) this;
        }

        public Criteria andUserAgreementEqualTo(Byte value) {
            addCriterion("user_agreement =", value, "userAgreement");
            return (Criteria) this;
        }

        public Criteria andUserAgreementNotEqualTo(Byte value) {
            addCriterion("user_agreement <>", value, "userAgreement");
            return (Criteria) this;
        }

        public Criteria andUserAgreementGreaterThan(Byte value) {
            addCriterion("user_agreement >", value, "userAgreement");
            return (Criteria) this;
        }

        public Criteria andUserAgreementGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_agreement >=", value, "userAgreement");
            return (Criteria) this;
        }

        public Criteria andUserAgreementLessThan(Byte value) {
            addCriterion("user_agreement <", value, "userAgreement");
            return (Criteria) this;
        }

        public Criteria andUserAgreementLessThanOrEqualTo(Byte value) {
            addCriterion("user_agreement <=", value, "userAgreement");
            return (Criteria) this;
        }

        public Criteria andUserAgreementIn(List<Byte> values) {
            addCriterion("user_agreement in", values, "userAgreement");
            return (Criteria) this;
        }

        public Criteria andUserAgreementNotIn(List<Byte> values) {
            addCriterion("user_agreement not in", values, "userAgreement");
            return (Criteria) this;
        }

        public Criteria andUserAgreementBetween(Byte value1, Byte value2) {
            addCriterion("user_agreement between", value1, value2, "userAgreement");
            return (Criteria) this;
        }

        public Criteria andUserAgreementNotBetween(Byte value1, Byte value2) {
            addCriterion("user_agreement not between", value1, value2, "userAgreement");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_guide_show_state表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2017-11-28
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_guide_show_state 2017-11-28
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