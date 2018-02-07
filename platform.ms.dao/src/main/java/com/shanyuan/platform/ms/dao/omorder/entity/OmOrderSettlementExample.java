package com.shanyuan.platform.ms.dao.omorder.entity;

import java.util.ArrayList;
import java.util.List;

public class OmOrderSettlementExample {
    /**
     * om_order_settlement
     */
    protected String orderByClause;

    /**
     * om_order_settlement
     */
    protected boolean distinct;

    /**
     * om_order_settlement
     */
    protected List<Criteria> oredCriteria;

    public OmOrderSettlementExample() {
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
     * om_order_settlement 2017-11-10
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andMainIdIsNull() {
            addCriterion("main_id is null");
            return (Criteria) this;
        }

        public Criteria andMainIdIsNotNull() {
            addCriterion("main_id is not null");
            return (Criteria) this;
        }

        public Criteria andMainIdEqualTo(String value) {
            addCriterion("main_id =", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotEqualTo(String value) {
            addCriterion("main_id <>", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdGreaterThan(String value) {
            addCriterion("main_id >", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdGreaterThanOrEqualTo(String value) {
            addCriterion("main_id >=", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLessThan(String value) {
            addCriterion("main_id <", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLessThanOrEqualTo(String value) {
            addCriterion("main_id <=", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLike(String value) {
            addCriterion("main_id like", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotLike(String value) {
            addCriterion("main_id not like", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdIn(List<String> values) {
            addCriterion("main_id in", values, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotIn(List<String> values) {
            addCriterion("main_id not in", values, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdBetween(String value1, String value2) {
            addCriterion("main_id between", value1, value2, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotBetween(String value1, String value2) {
            addCriterion("main_id not between", value1, value2, "mainId");
            return (Criteria) this;
        }

        public Criteria andHandingRateIsNull() {
            addCriterion("handing_rate is null");
            return (Criteria) this;
        }

        public Criteria andHandingRateIsNotNull() {
            addCriterion("handing_rate is not null");
            return (Criteria) this;
        }

        public Criteria andHandingRateEqualTo(Integer value) {
            addCriterion("handing_rate =", value, "handingRate");
            return (Criteria) this;
        }

        public Criteria andHandingRateNotEqualTo(Integer value) {
            addCriterion("handing_rate <>", value, "handingRate");
            return (Criteria) this;
        }

        public Criteria andHandingRateGreaterThan(Integer value) {
            addCriterion("handing_rate >", value, "handingRate");
            return (Criteria) this;
        }

        public Criteria andHandingRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("handing_rate >=", value, "handingRate");
            return (Criteria) this;
        }

        public Criteria andHandingRateLessThan(Integer value) {
            addCriterion("handing_rate <", value, "handingRate");
            return (Criteria) this;
        }

        public Criteria andHandingRateLessThanOrEqualTo(Integer value) {
            addCriterion("handing_rate <=", value, "handingRate");
            return (Criteria) this;
        }

        public Criteria andHandingRateIn(List<Integer> values) {
            addCriterion("handing_rate in", values, "handingRate");
            return (Criteria) this;
        }

        public Criteria andHandingRateNotIn(List<Integer> values) {
            addCriterion("handing_rate not in", values, "handingRate");
            return (Criteria) this;
        }

        public Criteria andHandingRateBetween(Integer value1, Integer value2) {
            addCriterion("handing_rate between", value1, value2, "handingRate");
            return (Criteria) this;
        }

        public Criteria andHandingRateNotBetween(Integer value1, Integer value2) {
            addCriterion("handing_rate not between", value1, value2, "handingRate");
            return (Criteria) this;
        }

        public Criteria andHandingFeeIsNull() {
            addCriterion("handing_fee is null");
            return (Criteria) this;
        }

        public Criteria andHandingFeeIsNotNull() {
            addCriterion("handing_fee is not null");
            return (Criteria) this;
        }

        public Criteria andHandingFeeEqualTo(Integer value) {
            addCriterion("handing_fee =", value, "handingFee");
            return (Criteria) this;
        }

        public Criteria andHandingFeeNotEqualTo(Integer value) {
            addCriterion("handing_fee <>", value, "handingFee");
            return (Criteria) this;
        }

        public Criteria andHandingFeeGreaterThan(Integer value) {
            addCriterion("handing_fee >", value, "handingFee");
            return (Criteria) this;
        }

        public Criteria andHandingFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("handing_fee >=", value, "handingFee");
            return (Criteria) this;
        }

        public Criteria andHandingFeeLessThan(Integer value) {
            addCriterion("handing_fee <", value, "handingFee");
            return (Criteria) this;
        }

        public Criteria andHandingFeeLessThanOrEqualTo(Integer value) {
            addCriterion("handing_fee <=", value, "handingFee");
            return (Criteria) this;
        }

        public Criteria andHandingFeeIn(List<Integer> values) {
            addCriterion("handing_fee in", values, "handingFee");
            return (Criteria) this;
        }

        public Criteria andHandingFeeNotIn(List<Integer> values) {
            addCriterion("handing_fee not in", values, "handingFee");
            return (Criteria) this;
        }

        public Criteria andHandingFeeBetween(Integer value1, Integer value2) {
            addCriterion("handing_fee between", value1, value2, "handingFee");
            return (Criteria) this;
        }

        public Criteria andHandingFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("handing_fee not between", value1, value2, "handingFee");
            return (Criteria) this;
        }

        public Criteria andBaseFeeIsNull() {
            addCriterion("base_fee is null");
            return (Criteria) this;
        }

        public Criteria andBaseFeeIsNotNull() {
            addCriterion("base_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBaseFeeEqualTo(Integer value) {
            addCriterion("base_fee =", value, "baseFee");
            return (Criteria) this;
        }

        public Criteria andBaseFeeNotEqualTo(Integer value) {
            addCriterion("base_fee <>", value, "baseFee");
            return (Criteria) this;
        }

        public Criteria andBaseFeeGreaterThan(Integer value) {
            addCriterion("base_fee >", value, "baseFee");
            return (Criteria) this;
        }

        public Criteria andBaseFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("base_fee >=", value, "baseFee");
            return (Criteria) this;
        }

        public Criteria andBaseFeeLessThan(Integer value) {
            addCriterion("base_fee <", value, "baseFee");
            return (Criteria) this;
        }

        public Criteria andBaseFeeLessThanOrEqualTo(Integer value) {
            addCriterion("base_fee <=", value, "baseFee");
            return (Criteria) this;
        }

        public Criteria andBaseFeeIn(List<Integer> values) {
            addCriterion("base_fee in", values, "baseFee");
            return (Criteria) this;
        }

        public Criteria andBaseFeeNotIn(List<Integer> values) {
            addCriterion("base_fee not in", values, "baseFee");
            return (Criteria) this;
        }

        public Criteria andBaseFeeBetween(Integer value1, Integer value2) {
            addCriterion("base_fee between", value1, value2, "baseFee");
            return (Criteria) this;
        }

        public Criteria andBaseFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("base_fee not between", value1, value2, "baseFee");
            return (Criteria) this;
        }

        public Criteria andSendPointRateIsNull() {
            addCriterion("send_point_rate is null");
            return (Criteria) this;
        }

        public Criteria andSendPointRateIsNotNull() {
            addCriterion("send_point_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSendPointRateEqualTo(Integer value) {
            addCriterion("send_point_rate =", value, "sendPointRate");
            return (Criteria) this;
        }

        public Criteria andSendPointRateNotEqualTo(Integer value) {
            addCriterion("send_point_rate <>", value, "sendPointRate");
            return (Criteria) this;
        }

        public Criteria andSendPointRateGreaterThan(Integer value) {
            addCriterion("send_point_rate >", value, "sendPointRate");
            return (Criteria) this;
        }

        public Criteria andSendPointRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_point_rate >=", value, "sendPointRate");
            return (Criteria) this;
        }

        public Criteria andSendPointRateLessThan(Integer value) {
            addCriterion("send_point_rate <", value, "sendPointRate");
            return (Criteria) this;
        }

        public Criteria andSendPointRateLessThanOrEqualTo(Integer value) {
            addCriterion("send_point_rate <=", value, "sendPointRate");
            return (Criteria) this;
        }

        public Criteria andSendPointRateIn(List<Integer> values) {
            addCriterion("send_point_rate in", values, "sendPointRate");
            return (Criteria) this;
        }

        public Criteria andSendPointRateNotIn(List<Integer> values) {
            addCriterion("send_point_rate not in", values, "sendPointRate");
            return (Criteria) this;
        }

        public Criteria andSendPointRateBetween(Integer value1, Integer value2) {
            addCriterion("send_point_rate between", value1, value2, "sendPointRate");
            return (Criteria) this;
        }

        public Criteria andSendPointRateNotBetween(Integer value1, Integer value2) {
            addCriterion("send_point_rate not between", value1, value2, "sendPointRate");
            return (Criteria) this;
        }

        public Criteria andSendPointIsNull() {
            addCriterion("send_point is null");
            return (Criteria) this;
        }

        public Criteria andSendPointIsNotNull() {
            addCriterion("send_point is not null");
            return (Criteria) this;
        }

        public Criteria andSendPointEqualTo(Integer value) {
            addCriterion("send_point =", value, "sendPoint");
            return (Criteria) this;
        }

        public Criteria andSendPointNotEqualTo(Integer value) {
            addCriterion("send_point <>", value, "sendPoint");
            return (Criteria) this;
        }

        public Criteria andSendPointGreaterThan(Integer value) {
            addCriterion("send_point >", value, "sendPoint");
            return (Criteria) this;
        }

        public Criteria andSendPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_point >=", value, "sendPoint");
            return (Criteria) this;
        }

        public Criteria andSendPointLessThan(Integer value) {
            addCriterion("send_point <", value, "sendPoint");
            return (Criteria) this;
        }

        public Criteria andSendPointLessThanOrEqualTo(Integer value) {
            addCriterion("send_point <=", value, "sendPoint");
            return (Criteria) this;
        }

        public Criteria andSendPointIn(List<Integer> values) {
            addCriterion("send_point in", values, "sendPoint");
            return (Criteria) this;
        }

        public Criteria andSendPointNotIn(List<Integer> values) {
            addCriterion("send_point not in", values, "sendPoint");
            return (Criteria) this;
        }

        public Criteria andSendPointBetween(Integer value1, Integer value2) {
            addCriterion("send_point between", value1, value2, "sendPoint");
            return (Criteria) this;
        }

        public Criteria andSendPointNotBetween(Integer value1, Integer value2) {
            addCriterion("send_point not between", value1, value2, "sendPoint");
            return (Criteria) this;
        }

        public Criteria andHelpRateIsNull() {
            addCriterion("help_rate is null");
            return (Criteria) this;
        }

        public Criteria andHelpRateIsNotNull() {
            addCriterion("help_rate is not null");
            return (Criteria) this;
        }

        public Criteria andHelpRateEqualTo(Integer value) {
            addCriterion("help_rate =", value, "helpRate");
            return (Criteria) this;
        }

        public Criteria andHelpRateNotEqualTo(Integer value) {
            addCriterion("help_rate <>", value, "helpRate");
            return (Criteria) this;
        }

        public Criteria andHelpRateGreaterThan(Integer value) {
            addCriterion("help_rate >", value, "helpRate");
            return (Criteria) this;
        }

        public Criteria andHelpRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("help_rate >=", value, "helpRate");
            return (Criteria) this;
        }

        public Criteria andHelpRateLessThan(Integer value) {
            addCriterion("help_rate <", value, "helpRate");
            return (Criteria) this;
        }

        public Criteria andHelpRateLessThanOrEqualTo(Integer value) {
            addCriterion("help_rate <=", value, "helpRate");
            return (Criteria) this;
        }

        public Criteria andHelpRateIn(List<Integer> values) {
            addCriterion("help_rate in", values, "helpRate");
            return (Criteria) this;
        }

        public Criteria andHelpRateNotIn(List<Integer> values) {
            addCriterion("help_rate not in", values, "helpRate");
            return (Criteria) this;
        }

        public Criteria andHelpRateBetween(Integer value1, Integer value2) {
            addCriterion("help_rate between", value1, value2, "helpRate");
            return (Criteria) this;
        }

        public Criteria andHelpRateNotBetween(Integer value1, Integer value2) {
            addCriterion("help_rate not between", value1, value2, "helpRate");
            return (Criteria) this;
        }

        public Criteria andHelpFeeIsNull() {
            addCriterion("help_fee is null");
            return (Criteria) this;
        }

        public Criteria andHelpFeeIsNotNull() {
            addCriterion("help_fee is not null");
            return (Criteria) this;
        }

        public Criteria andHelpFeeEqualTo(Integer value) {
            addCriterion("help_fee =", value, "helpFee");
            return (Criteria) this;
        }

        public Criteria andHelpFeeNotEqualTo(Integer value) {
            addCriterion("help_fee <>", value, "helpFee");
            return (Criteria) this;
        }

        public Criteria andHelpFeeGreaterThan(Integer value) {
            addCriterion("help_fee >", value, "helpFee");
            return (Criteria) this;
        }

        public Criteria andHelpFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("help_fee >=", value, "helpFee");
            return (Criteria) this;
        }

        public Criteria andHelpFeeLessThan(Integer value) {
            addCriterion("help_fee <", value, "helpFee");
            return (Criteria) this;
        }

        public Criteria andHelpFeeLessThanOrEqualTo(Integer value) {
            addCriterion("help_fee <=", value, "helpFee");
            return (Criteria) this;
        }

        public Criteria andHelpFeeIn(List<Integer> values) {
            addCriterion("help_fee in", values, "helpFee");
            return (Criteria) this;
        }

        public Criteria andHelpFeeNotIn(List<Integer> values) {
            addCriterion("help_fee not in", values, "helpFee");
            return (Criteria) this;
        }

        public Criteria andHelpFeeBetween(Integer value1, Integer value2) {
            addCriterion("help_fee between", value1, value2, "helpFee");
            return (Criteria) this;
        }

        public Criteria andHelpFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("help_fee not between", value1, value2, "helpFee");
            return (Criteria) this;
        }

        public Criteria andFundRateIsNull() {
            addCriterion("fund_rate is null");
            return (Criteria) this;
        }

        public Criteria andFundRateIsNotNull() {
            addCriterion("fund_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFundRateEqualTo(Integer value) {
            addCriterion("fund_rate =", value, "fundRate");
            return (Criteria) this;
        }

        public Criteria andFundRateNotEqualTo(Integer value) {
            addCriterion("fund_rate <>", value, "fundRate");
            return (Criteria) this;
        }

        public Criteria andFundRateGreaterThan(Integer value) {
            addCriterion("fund_rate >", value, "fundRate");
            return (Criteria) this;
        }

        public Criteria andFundRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("fund_rate >=", value, "fundRate");
            return (Criteria) this;
        }

        public Criteria andFundRateLessThan(Integer value) {
            addCriterion("fund_rate <", value, "fundRate");
            return (Criteria) this;
        }

        public Criteria andFundRateLessThanOrEqualTo(Integer value) {
            addCriterion("fund_rate <=", value, "fundRate");
            return (Criteria) this;
        }

        public Criteria andFundRateIn(List<Integer> values) {
            addCriterion("fund_rate in", values, "fundRate");
            return (Criteria) this;
        }

        public Criteria andFundRateNotIn(List<Integer> values) {
            addCriterion("fund_rate not in", values, "fundRate");
            return (Criteria) this;
        }

        public Criteria andFundRateBetween(Integer value1, Integer value2) {
            addCriterion("fund_rate between", value1, value2, "fundRate");
            return (Criteria) this;
        }

        public Criteria andFundRateNotBetween(Integer value1, Integer value2) {
            addCriterion("fund_rate not between", value1, value2, "fundRate");
            return (Criteria) this;
        }

        public Criteria andFundFeeIsNull() {
            addCriterion("fund_fee is null");
            return (Criteria) this;
        }

        public Criteria andFundFeeIsNotNull() {
            addCriterion("fund_fee is not null");
            return (Criteria) this;
        }

        public Criteria andFundFeeEqualTo(Integer value) {
            addCriterion("fund_fee =", value, "fundFee");
            return (Criteria) this;
        }

        public Criteria andFundFeeNotEqualTo(Integer value) {
            addCriterion("fund_fee <>", value, "fundFee");
            return (Criteria) this;
        }

        public Criteria andFundFeeGreaterThan(Integer value) {
            addCriterion("fund_fee >", value, "fundFee");
            return (Criteria) this;
        }

        public Criteria andFundFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fund_fee >=", value, "fundFee");
            return (Criteria) this;
        }

        public Criteria andFundFeeLessThan(Integer value) {
            addCriterion("fund_fee <", value, "fundFee");
            return (Criteria) this;
        }

        public Criteria andFundFeeLessThanOrEqualTo(Integer value) {
            addCriterion("fund_fee <=", value, "fundFee");
            return (Criteria) this;
        }

        public Criteria andFundFeeIn(List<Integer> values) {
            addCriterion("fund_fee in", values, "fundFee");
            return (Criteria) this;
        }

        public Criteria andFundFeeNotIn(List<Integer> values) {
            addCriterion("fund_fee not in", values, "fundFee");
            return (Criteria) this;
        }

        public Criteria andFundFeeBetween(Integer value1, Integer value2) {
            addCriterion("fund_fee between", value1, value2, "fundFee");
            return (Criteria) this;
        }

        public Criteria andFundFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("fund_fee not between", value1, value2, "fundFee");
            return (Criteria) this;
        }

        public Criteria andSellerIncomeIsNull() {
            addCriterion("seller_income is null");
            return (Criteria) this;
        }

        public Criteria andSellerIncomeIsNotNull() {
            addCriterion("seller_income is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIncomeEqualTo(Integer value) {
            addCriterion("seller_income =", value, "sellerIncome");
            return (Criteria) this;
        }

        public Criteria andSellerIncomeNotEqualTo(Integer value) {
            addCriterion("seller_income <>", value, "sellerIncome");
            return (Criteria) this;
        }

        public Criteria andSellerIncomeGreaterThan(Integer value) {
            addCriterion("seller_income >", value, "sellerIncome");
            return (Criteria) this;
        }

        public Criteria andSellerIncomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_income >=", value, "sellerIncome");
            return (Criteria) this;
        }

        public Criteria andSellerIncomeLessThan(Integer value) {
            addCriterion("seller_income <", value, "sellerIncome");
            return (Criteria) this;
        }

        public Criteria andSellerIncomeLessThanOrEqualTo(Integer value) {
            addCriterion("seller_income <=", value, "sellerIncome");
            return (Criteria) this;
        }

        public Criteria andSellerIncomeIn(List<Integer> values) {
            addCriterion("seller_income in", values, "sellerIncome");
            return (Criteria) this;
        }

        public Criteria andSellerIncomeNotIn(List<Integer> values) {
            addCriterion("seller_income not in", values, "sellerIncome");
            return (Criteria) this;
        }

        public Criteria andSellerIncomeBetween(Integer value1, Integer value2) {
            addCriterion("seller_income between", value1, value2, "sellerIncome");
            return (Criteria) this;
        }

        public Criteria andSellerIncomeNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_income not between", value1, value2, "sellerIncome");
            return (Criteria) this;
        }

        public Criteria andColumn13IsNull() {
            addCriterion("Column_13 is null");
            return (Criteria) this;
        }

        public Criteria andColumn13IsNotNull() {
            addCriterion("Column_13 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn13EqualTo(String value) {
            addCriterion("Column_13 =", value, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13NotEqualTo(String value) {
            addCriterion("Column_13 <>", value, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13GreaterThan(String value) {
            addCriterion("Column_13 >", value, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13GreaterThanOrEqualTo(String value) {
            addCriterion("Column_13 >=", value, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13LessThan(String value) {
            addCriterion("Column_13 <", value, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13LessThanOrEqualTo(String value) {
            addCriterion("Column_13 <=", value, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13Like(String value) {
            addCriterion("Column_13 like", value, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13NotLike(String value) {
            addCriterion("Column_13 not like", value, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13In(List<String> values) {
            addCriterion("Column_13 in", values, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13NotIn(List<String> values) {
            addCriterion("Column_13 not in", values, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13Between(String value1, String value2) {
            addCriterion("Column_13 between", value1, value2, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13NotBetween(String value1, String value2) {
            addCriterion("Column_13 not between", value1, value2, "column13");
            return (Criteria) this;
        }
    }

    /**
     * 描述:om_order_settlement表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-11-10
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * om_order_settlement 2017-11-10
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