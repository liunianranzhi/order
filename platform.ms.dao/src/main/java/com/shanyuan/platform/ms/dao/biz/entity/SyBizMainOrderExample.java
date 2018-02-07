package com.shanyuan.platform.ms.dao.biz.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyBizMainOrderExample {
    /**
     * sy_biz_main_order
     */
    protected String orderByClause;

    /**
     * sy_biz_main_order
     */
    protected boolean distinct;

    /**
     * sy_biz_main_order
     */
    protected List<Criteria> oredCriteria;

    public SyBizMainOrderExample() {
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
     * sy_biz_main_order 2018-01-04
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

        public Criteria andMainOrderIdIsNull() {
            addCriterion("main_order_id is null");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdIsNotNull() {
            addCriterion("main_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdEqualTo(Integer value) {
            addCriterion("main_order_id =", value, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdNotEqualTo(Integer value) {
            addCriterion("main_order_id <>", value, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdGreaterThan(Integer value) {
            addCriterion("main_order_id >", value, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("main_order_id >=", value, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdLessThan(Integer value) {
            addCriterion("main_order_id <", value, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("main_order_id <=", value, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdIn(List<Integer> values) {
            addCriterion("main_order_id in", values, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdNotIn(List<Integer> values) {
            addCriterion("main_order_id not in", values, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("main_order_id between", value1, value2, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("main_order_id not between", value1, value2, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(Long value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(Long value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(Long value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(Long value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(Long value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(Long value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<Long> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<Long> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(Long value1, Long value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(Long value1, Long value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andCouponBatchSnIsNull() {
            addCriterion("coupon_batch_sn is null");
            return (Criteria) this;
        }

        public Criteria andCouponBatchSnIsNotNull() {
            addCriterion("coupon_batch_sn is not null");
            return (Criteria) this;
        }

        public Criteria andCouponBatchSnEqualTo(Long value) {
            addCriterion("coupon_batch_sn =", value, "couponBatchSn");
            return (Criteria) this;
        }

        public Criteria andCouponBatchSnNotEqualTo(Long value) {
            addCriterion("coupon_batch_sn <>", value, "couponBatchSn");
            return (Criteria) this;
        }

        public Criteria andCouponBatchSnGreaterThan(Long value) {
            addCriterion("coupon_batch_sn >", value, "couponBatchSn");
            return (Criteria) this;
        }

        public Criteria andCouponBatchSnGreaterThanOrEqualTo(Long value) {
            addCriterion("coupon_batch_sn >=", value, "couponBatchSn");
            return (Criteria) this;
        }

        public Criteria andCouponBatchSnLessThan(Long value) {
            addCriterion("coupon_batch_sn <", value, "couponBatchSn");
            return (Criteria) this;
        }

        public Criteria andCouponBatchSnLessThanOrEqualTo(Long value) {
            addCriterion("coupon_batch_sn <=", value, "couponBatchSn");
            return (Criteria) this;
        }

        public Criteria andCouponBatchSnIn(List<Long> values) {
            addCriterion("coupon_batch_sn in", values, "couponBatchSn");
            return (Criteria) this;
        }

        public Criteria andCouponBatchSnNotIn(List<Long> values) {
            addCriterion("coupon_batch_sn not in", values, "couponBatchSn");
            return (Criteria) this;
        }

        public Criteria andCouponBatchSnBetween(Long value1, Long value2) {
            addCriterion("coupon_batch_sn between", value1, value2, "couponBatchSn");
            return (Criteria) this;
        }

        public Criteria andCouponBatchSnNotBetween(Long value1, Long value2) {
            addCriterion("coupon_batch_sn not between", value1, value2, "couponBatchSn");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("buyer_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("buyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(Integer value) {
            addCriterion("buyer_id =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(Integer value) {
            addCriterion("buyer_id <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(Integer value) {
            addCriterion("buyer_id >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyer_id >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(Integer value) {
            addCriterion("buyer_id <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(Integer value) {
            addCriterion("buyer_id <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<Integer> values) {
            addCriterion("buyer_id in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<Integer> values) {
            addCriterion("buyer_id not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(Integer value1, Integer value2) {
            addCriterion("buyer_id between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("buyer_id not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNull() {
            addCriterion("buyer_name is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNotNull() {
            addCriterion("buyer_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameEqualTo(String value) {
            addCriterion("buyer_name =", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotEqualTo(String value) {
            addCriterion("buyer_name <>", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThan(String value) {
            addCriterion("buyer_name >", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_name >=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThan(String value) {
            addCriterion("buyer_name <", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThanOrEqualTo(String value) {
            addCriterion("buyer_name <=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLike(String value) {
            addCriterion("buyer_name like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotLike(String value) {
            addCriterion("buyer_name not like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIn(List<String> values) {
            addCriterion("buyer_name in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotIn(List<String> values) {
            addCriterion("buyer_name not in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameBetween(String value1, String value2) {
            addCriterion("buyer_name between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotBetween(String value1, String value2) {
            addCriterion("buyer_name not between", value1, value2, "buyerName");
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

        public Criteria andPaymentTimeIsNull() {
            addCriterion("payment_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(Integer value) {
            addCriterion("payment_time =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(Integer value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(Integer value) {
            addCriterion("payment_time >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_time >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(Integer value) {
            addCriterion("payment_time <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(Integer value) {
            addCriterion("payment_time <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<Integer> values) {
            addCriterion("payment_time in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<Integer> values) {
            addCriterion("payment_time not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(Integer value1, Integer value2) {
            addCriterion("payment_time between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_time not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeIsNull() {
            addCriterion("ship_time is null");
            return (Criteria) this;
        }

        public Criteria andShipTimeIsNotNull() {
            addCriterion("ship_time is not null");
            return (Criteria) this;
        }

        public Criteria andShipTimeEqualTo(Integer value) {
            addCriterion("ship_time =", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotEqualTo(Integer value) {
            addCriterion("ship_time <>", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeGreaterThan(Integer value) {
            addCriterion("ship_time >", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ship_time >=", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeLessThan(Integer value) {
            addCriterion("ship_time <", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeLessThanOrEqualTo(Integer value) {
            addCriterion("ship_time <=", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeIn(List<Integer> values) {
            addCriterion("ship_time in", values, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotIn(List<Integer> values) {
            addCriterion("ship_time not in", values, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeBetween(Integer value1, Integer value2) {
            addCriterion("ship_time between", value1, value2, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ship_time not between", value1, value2, "shipTime");
            return (Criteria) this;
        }

        public Criteria andFinnshedTimeIsNull() {
            addCriterion("finnshed_time is null");
            return (Criteria) this;
        }

        public Criteria andFinnshedTimeIsNotNull() {
            addCriterion("finnshed_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinnshedTimeEqualTo(Integer value) {
            addCriterion("finnshed_time =", value, "finnshedTime");
            return (Criteria) this;
        }

        public Criteria andFinnshedTimeNotEqualTo(Integer value) {
            addCriterion("finnshed_time <>", value, "finnshedTime");
            return (Criteria) this;
        }

        public Criteria andFinnshedTimeGreaterThan(Integer value) {
            addCriterion("finnshed_time >", value, "finnshedTime");
            return (Criteria) this;
        }

        public Criteria andFinnshedTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("finnshed_time >=", value, "finnshedTime");
            return (Criteria) this;
        }

        public Criteria andFinnshedTimeLessThan(Integer value) {
            addCriterion("finnshed_time <", value, "finnshedTime");
            return (Criteria) this;
        }

        public Criteria andFinnshedTimeLessThanOrEqualTo(Integer value) {
            addCriterion("finnshed_time <=", value, "finnshedTime");
            return (Criteria) this;
        }

        public Criteria andFinnshedTimeIn(List<Integer> values) {
            addCriterion("finnshed_time in", values, "finnshedTime");
            return (Criteria) this;
        }

        public Criteria andFinnshedTimeNotIn(List<Integer> values) {
            addCriterion("finnshed_time not in", values, "finnshedTime");
            return (Criteria) this;
        }

        public Criteria andFinnshedTimeBetween(Integer value1, Integer value2) {
            addCriterion("finnshed_time between", value1, value2, "finnshedTime");
            return (Criteria) this;
        }

        public Criteria andFinnshedTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("finnshed_time not between", value1, value2, "finnshedTime");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andCouponValueIsNull() {
            addCriterion("coupon_value is null");
            return (Criteria) this;
        }

        public Criteria andCouponValueIsNotNull() {
            addCriterion("coupon_value is not null");
            return (Criteria) this;
        }

        public Criteria andCouponValueEqualTo(BigDecimal value) {
            addCriterion("coupon_value =", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueNotEqualTo(BigDecimal value) {
            addCriterion("coupon_value <>", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueGreaterThan(BigDecimal value) {
            addCriterion("coupon_value >", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_value >=", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueLessThan(BigDecimal value) {
            addCriterion("coupon_value <", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_value <=", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueIn(List<BigDecimal> values) {
            addCriterion("coupon_value in", values, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueNotIn(List<BigDecimal> values) {
            addCriterion("coupon_value not in", values, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_value between", value1, value2, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_value not between", value1, value2, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponNumIsNull() {
            addCriterion("coupon_num is null");
            return (Criteria) this;
        }

        public Criteria andCouponNumIsNotNull() {
            addCriterion("coupon_num is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNumEqualTo(Integer value) {
            addCriterion("coupon_num =", value, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumNotEqualTo(Integer value) {
            addCriterion("coupon_num <>", value, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumGreaterThan(Integer value) {
            addCriterion("coupon_num >", value, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_num >=", value, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumLessThan(Integer value) {
            addCriterion("coupon_num <", value, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_num <=", value, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumIn(List<Integer> values) {
            addCriterion("coupon_num in", values, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumNotIn(List<Integer> values) {
            addCriterion("coupon_num not in", values, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumBetween(Integer value1, Integer value2) {
            addCriterion("coupon_num between", value1, value2, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_num not between", value1, value2, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponCreatorIsNull() {
            addCriterion("coupon_creator is null");
            return (Criteria) this;
        }

        public Criteria andCouponCreatorIsNotNull() {
            addCriterion("coupon_creator is not null");
            return (Criteria) this;
        }

        public Criteria andCouponCreatorEqualTo(String value) {
            addCriterion("coupon_creator =", value, "couponCreator");
            return (Criteria) this;
        }

        public Criteria andCouponCreatorNotEqualTo(String value) {
            addCriterion("coupon_creator <>", value, "couponCreator");
            return (Criteria) this;
        }

        public Criteria andCouponCreatorGreaterThan(String value) {
            addCriterion("coupon_creator >", value, "couponCreator");
            return (Criteria) this;
        }

        public Criteria andCouponCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_creator >=", value, "couponCreator");
            return (Criteria) this;
        }

        public Criteria andCouponCreatorLessThan(String value) {
            addCriterion("coupon_creator <", value, "couponCreator");
            return (Criteria) this;
        }

        public Criteria andCouponCreatorLessThanOrEqualTo(String value) {
            addCriterion("coupon_creator <=", value, "couponCreator");
            return (Criteria) this;
        }

        public Criteria andCouponCreatorLike(String value) {
            addCriterion("coupon_creator like", value, "couponCreator");
            return (Criteria) this;
        }

        public Criteria andCouponCreatorNotLike(String value) {
            addCriterion("coupon_creator not like", value, "couponCreator");
            return (Criteria) this;
        }

        public Criteria andCouponCreatorIn(List<String> values) {
            addCriterion("coupon_creator in", values, "couponCreator");
            return (Criteria) this;
        }

        public Criteria andCouponCreatorNotIn(List<String> values) {
            addCriterion("coupon_creator not in", values, "couponCreator");
            return (Criteria) this;
        }

        public Criteria andCouponCreatorBetween(String value1, String value2) {
            addCriterion("coupon_creator between", value1, value2, "couponCreator");
            return (Criteria) this;
        }

        public Criteria andCouponCreatorNotBetween(String value1, String value2) {
            addCriterion("coupon_creator not between", value1, value2, "couponCreator");
            return (Criteria) this;
        }

        public Criteria andInvInfoIsNull() {
            addCriterion("inv_info is null");
            return (Criteria) this;
        }

        public Criteria andInvInfoIsNotNull() {
            addCriterion("inv_info is not null");
            return (Criteria) this;
        }

        public Criteria andInvInfoEqualTo(String value) {
            addCriterion("inv_info =", value, "invInfo");
            return (Criteria) this;
        }

        public Criteria andInvInfoNotEqualTo(String value) {
            addCriterion("inv_info <>", value, "invInfo");
            return (Criteria) this;
        }

        public Criteria andInvInfoGreaterThan(String value) {
            addCriterion("inv_info >", value, "invInfo");
            return (Criteria) this;
        }

        public Criteria andInvInfoGreaterThanOrEqualTo(String value) {
            addCriterion("inv_info >=", value, "invInfo");
            return (Criteria) this;
        }

        public Criteria andInvInfoLessThan(String value) {
            addCriterion("inv_info <", value, "invInfo");
            return (Criteria) this;
        }

        public Criteria andInvInfoLessThanOrEqualTo(String value) {
            addCriterion("inv_info <=", value, "invInfo");
            return (Criteria) this;
        }

        public Criteria andInvInfoLike(String value) {
            addCriterion("inv_info like", value, "invInfo");
            return (Criteria) this;
        }

        public Criteria andInvInfoNotLike(String value) {
            addCriterion("inv_info not like", value, "invInfo");
            return (Criteria) this;
        }

        public Criteria andInvInfoIn(List<String> values) {
            addCriterion("inv_info in", values, "invInfo");
            return (Criteria) this;
        }

        public Criteria andInvInfoNotIn(List<String> values) {
            addCriterion("inv_info not in", values, "invInfo");
            return (Criteria) this;
        }

        public Criteria andInvInfoBetween(String value1, String value2) {
            addCriterion("inv_info between", value1, value2, "invInfo");
            return (Criteria) this;
        }

        public Criteria andInvInfoNotBetween(String value1, String value2) {
            addCriterion("inv_info not between", value1, value2, "invInfo");
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

        public Criteria andApplyCircleNameIsNull() {
            addCriterion("apply_circle_name is null");
            return (Criteria) this;
        }

        public Criteria andApplyCircleNameIsNotNull() {
            addCriterion("apply_circle_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCircleNameEqualTo(String value) {
            addCriterion("apply_circle_name =", value, "applyCircleName");
            return (Criteria) this;
        }

        public Criteria andApplyCircleNameNotEqualTo(String value) {
            addCriterion("apply_circle_name <>", value, "applyCircleName");
            return (Criteria) this;
        }

        public Criteria andApplyCircleNameGreaterThan(String value) {
            addCriterion("apply_circle_name >", value, "applyCircleName");
            return (Criteria) this;
        }

        public Criteria andApplyCircleNameGreaterThanOrEqualTo(String value) {
            addCriterion("apply_circle_name >=", value, "applyCircleName");
            return (Criteria) this;
        }

        public Criteria andApplyCircleNameLessThan(String value) {
            addCriterion("apply_circle_name <", value, "applyCircleName");
            return (Criteria) this;
        }

        public Criteria andApplyCircleNameLessThanOrEqualTo(String value) {
            addCriterion("apply_circle_name <=", value, "applyCircleName");
            return (Criteria) this;
        }

        public Criteria andApplyCircleNameLike(String value) {
            addCriterion("apply_circle_name like", value, "applyCircleName");
            return (Criteria) this;
        }

        public Criteria andApplyCircleNameNotLike(String value) {
            addCriterion("apply_circle_name not like", value, "applyCircleName");
            return (Criteria) this;
        }

        public Criteria andApplyCircleNameIn(List<String> values) {
            addCriterion("apply_circle_name in", values, "applyCircleName");
            return (Criteria) this;
        }

        public Criteria andApplyCircleNameNotIn(List<String> values) {
            addCriterion("apply_circle_name not in", values, "applyCircleName");
            return (Criteria) this;
        }

        public Criteria andApplyCircleNameBetween(String value1, String value2) {
            addCriterion("apply_circle_name between", value1, value2, "applyCircleName");
            return (Criteria) this;
        }

        public Criteria andApplyCircleNameNotBetween(String value1, String value2) {
            addCriterion("apply_circle_name not between", value1, value2, "applyCircleName");
            return (Criteria) this;
        }

        public Criteria andPaperContractIsNull() {
            addCriterion("paper_contract is null");
            return (Criteria) this;
        }

        public Criteria andPaperContractIsNotNull() {
            addCriterion("paper_contract is not null");
            return (Criteria) this;
        }

        public Criteria andPaperContractEqualTo(String value) {
            addCriterion("paper_contract =", value, "paperContract");
            return (Criteria) this;
        }

        public Criteria andPaperContractNotEqualTo(String value) {
            addCriterion("paper_contract <>", value, "paperContract");
            return (Criteria) this;
        }

        public Criteria andPaperContractGreaterThan(String value) {
            addCriterion("paper_contract >", value, "paperContract");
            return (Criteria) this;
        }

        public Criteria andPaperContractGreaterThanOrEqualTo(String value) {
            addCriterion("paper_contract >=", value, "paperContract");
            return (Criteria) this;
        }

        public Criteria andPaperContractLessThan(String value) {
            addCriterion("paper_contract <", value, "paperContract");
            return (Criteria) this;
        }

        public Criteria andPaperContractLessThanOrEqualTo(String value) {
            addCriterion("paper_contract <=", value, "paperContract");
            return (Criteria) this;
        }

        public Criteria andPaperContractLike(String value) {
            addCriterion("paper_contract like", value, "paperContract");
            return (Criteria) this;
        }

        public Criteria andPaperContractNotLike(String value) {
            addCriterion("paper_contract not like", value, "paperContract");
            return (Criteria) this;
        }

        public Criteria andPaperContractIn(List<String> values) {
            addCriterion("paper_contract in", values, "paperContract");
            return (Criteria) this;
        }

        public Criteria andPaperContractNotIn(List<String> values) {
            addCriterion("paper_contract not in", values, "paperContract");
            return (Criteria) this;
        }

        public Criteria andPaperContractBetween(String value1, String value2) {
            addCriterion("paper_contract between", value1, value2, "paperContract");
            return (Criteria) this;
        }

        public Criteria andPaperContractNotBetween(String value1, String value2) {
            addCriterion("paper_contract not between", value1, value2, "paperContract");
            return (Criteria) this;
        }

        public Criteria andPaymentRoleIsNull() {
            addCriterion("payment_role is null");
            return (Criteria) this;
        }

        public Criteria andPaymentRoleIsNotNull() {
            addCriterion("payment_role is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentRoleEqualTo(String value) {
            addCriterion("payment_role =", value, "paymentRole");
            return (Criteria) this;
        }

        public Criteria andPaymentRoleNotEqualTo(String value) {
            addCriterion("payment_role <>", value, "paymentRole");
            return (Criteria) this;
        }

        public Criteria andPaymentRoleGreaterThan(String value) {
            addCriterion("payment_role >", value, "paymentRole");
            return (Criteria) this;
        }

        public Criteria andPaymentRoleGreaterThanOrEqualTo(String value) {
            addCriterion("payment_role >=", value, "paymentRole");
            return (Criteria) this;
        }

        public Criteria andPaymentRoleLessThan(String value) {
            addCriterion("payment_role <", value, "paymentRole");
            return (Criteria) this;
        }

        public Criteria andPaymentRoleLessThanOrEqualTo(String value) {
            addCriterion("payment_role <=", value, "paymentRole");
            return (Criteria) this;
        }

        public Criteria andPaymentRoleLike(String value) {
            addCriterion("payment_role like", value, "paymentRole");
            return (Criteria) this;
        }

        public Criteria andPaymentRoleNotLike(String value) {
            addCriterion("payment_role not like", value, "paymentRole");
            return (Criteria) this;
        }

        public Criteria andPaymentRoleIn(List<String> values) {
            addCriterion("payment_role in", values, "paymentRole");
            return (Criteria) this;
        }

        public Criteria andPaymentRoleNotIn(List<String> values) {
            addCriterion("payment_role not in", values, "paymentRole");
            return (Criteria) this;
        }

        public Criteria andPaymentRoleBetween(String value1, String value2) {
            addCriterion("payment_role between", value1, value2, "paymentRole");
            return (Criteria) this;
        }

        public Criteria andPaymentRoleNotBetween(String value1, String value2) {
            addCriterion("payment_role not between", value1, value2, "paymentRole");
            return (Criteria) this;
        }

        public Criteria andPaymentModelIsNull() {
            addCriterion("payment_model is null");
            return (Criteria) this;
        }

        public Criteria andPaymentModelIsNotNull() {
            addCriterion("payment_model is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentModelEqualTo(String value) {
            addCriterion("payment_model =", value, "paymentModel");
            return (Criteria) this;
        }

        public Criteria andPaymentModelNotEqualTo(String value) {
            addCriterion("payment_model <>", value, "paymentModel");
            return (Criteria) this;
        }

        public Criteria andPaymentModelGreaterThan(String value) {
            addCriterion("payment_model >", value, "paymentModel");
            return (Criteria) this;
        }

        public Criteria andPaymentModelGreaterThanOrEqualTo(String value) {
            addCriterion("payment_model >=", value, "paymentModel");
            return (Criteria) this;
        }

        public Criteria andPaymentModelLessThan(String value) {
            addCriterion("payment_model <", value, "paymentModel");
            return (Criteria) this;
        }

        public Criteria andPaymentModelLessThanOrEqualTo(String value) {
            addCriterion("payment_model <=", value, "paymentModel");
            return (Criteria) this;
        }

        public Criteria andPaymentModelLike(String value) {
            addCriterion("payment_model like", value, "paymentModel");
            return (Criteria) this;
        }

        public Criteria andPaymentModelNotLike(String value) {
            addCriterion("payment_model not like", value, "paymentModel");
            return (Criteria) this;
        }

        public Criteria andPaymentModelIn(List<String> values) {
            addCriterion("payment_model in", values, "paymentModel");
            return (Criteria) this;
        }

        public Criteria andPaymentModelNotIn(List<String> values) {
            addCriterion("payment_model not in", values, "paymentModel");
            return (Criteria) this;
        }

        public Criteria andPaymentModelBetween(String value1, String value2) {
            addCriterion("payment_model between", value1, value2, "paymentModel");
            return (Criteria) this;
        }

        public Criteria andPaymentModelNotBetween(String value1, String value2) {
            addCriterion("payment_model not between", value1, value2, "paymentModel");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(String value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(String value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(String value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(String value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(String value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(String value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLike(String value) {
            addCriterion("order_state like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotLike(String value) {
            addCriterion("order_state not like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<String> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<String> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(String value1, String value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(String value1, String value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andInvStateIsNull() {
            addCriterion("inv_state is null");
            return (Criteria) this;
        }

        public Criteria andInvStateIsNotNull() {
            addCriterion("inv_state is not null");
            return (Criteria) this;
        }

        public Criteria andInvStateEqualTo(String value) {
            addCriterion("inv_state =", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateNotEqualTo(String value) {
            addCriterion("inv_state <>", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateGreaterThan(String value) {
            addCriterion("inv_state >", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateGreaterThanOrEqualTo(String value) {
            addCriterion("inv_state >=", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateLessThan(String value) {
            addCriterion("inv_state <", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateLessThanOrEqualTo(String value) {
            addCriterion("inv_state <=", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateLike(String value) {
            addCriterion("inv_state like", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateNotLike(String value) {
            addCriterion("inv_state not like", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateIn(List<String> values) {
            addCriterion("inv_state in", values, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateNotIn(List<String> values) {
            addCriterion("inv_state not in", values, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateBetween(String value1, String value2) {
            addCriterion("inv_state between", value1, value2, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateNotBetween(String value1, String value2) {
            addCriterion("inv_state not between", value1, value2, "invState");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNull() {
            addCriterion("pay_state is null");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNotNull() {
            addCriterion("pay_state is not null");
            return (Criteria) this;
        }

        public Criteria andPayStateEqualTo(String value) {
            addCriterion("pay_state =", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotEqualTo(String value) {
            addCriterion("pay_state <>", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThan(String value) {
            addCriterion("pay_state >", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThanOrEqualTo(String value) {
            addCriterion("pay_state >=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThan(String value) {
            addCriterion("pay_state <", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThanOrEqualTo(String value) {
            addCriterion("pay_state <=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLike(String value) {
            addCriterion("pay_state like", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotLike(String value) {
            addCriterion("pay_state not like", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateIn(List<String> values) {
            addCriterion("pay_state in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotIn(List<String> values) {
            addCriterion("pay_state not in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateBetween(String value1, String value2) {
            addCriterion("pay_state between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotBetween(String value1, String value2) {
            addCriterion("pay_state not between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIsNull() {
            addCriterion("goods_state is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIsNotNull() {
            addCriterion("goods_state is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStateEqualTo(String value) {
            addCriterion("goods_state =", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotEqualTo(String value) {
            addCriterion("goods_state <>", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateGreaterThan(String value) {
            addCriterion("goods_state >", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateGreaterThanOrEqualTo(String value) {
            addCriterion("goods_state >=", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLessThan(String value) {
            addCriterion("goods_state <", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLessThanOrEqualTo(String value) {
            addCriterion("goods_state <=", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLike(String value) {
            addCriterion("goods_state like", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotLike(String value) {
            addCriterion("goods_state not like", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIn(List<String> values) {
            addCriterion("goods_state in", values, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotIn(List<String> values) {
            addCriterion("goods_state not in", values, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateBetween(String value1, String value2) {
            addCriterion("goods_state between", value1, value2, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotBetween(String value1, String value2) {
            addCriterion("goods_state not between", value1, value2, "goodsState");
            return (Criteria) this;
        }

        public Criteria andPointsStateIsNull() {
            addCriterion("points_state is null");
            return (Criteria) this;
        }

        public Criteria andPointsStateIsNotNull() {
            addCriterion("points_state is not null");
            return (Criteria) this;
        }

        public Criteria andPointsStateEqualTo(String value) {
            addCriterion("points_state =", value, "pointsState");
            return (Criteria) this;
        }

        public Criteria andPointsStateNotEqualTo(String value) {
            addCriterion("points_state <>", value, "pointsState");
            return (Criteria) this;
        }

        public Criteria andPointsStateGreaterThan(String value) {
            addCriterion("points_state >", value, "pointsState");
            return (Criteria) this;
        }

        public Criteria andPointsStateGreaterThanOrEqualTo(String value) {
            addCriterion("points_state >=", value, "pointsState");
            return (Criteria) this;
        }

        public Criteria andPointsStateLessThan(String value) {
            addCriterion("points_state <", value, "pointsState");
            return (Criteria) this;
        }

        public Criteria andPointsStateLessThanOrEqualTo(String value) {
            addCriterion("points_state <=", value, "pointsState");
            return (Criteria) this;
        }

        public Criteria andPointsStateLike(String value) {
            addCriterion("points_state like", value, "pointsState");
            return (Criteria) this;
        }

        public Criteria andPointsStateNotLike(String value) {
            addCriterion("points_state not like", value, "pointsState");
            return (Criteria) this;
        }

        public Criteria andPointsStateIn(List<String> values) {
            addCriterion("points_state in", values, "pointsState");
            return (Criteria) this;
        }

        public Criteria andPointsStateNotIn(List<String> values) {
            addCriterion("points_state not in", values, "pointsState");
            return (Criteria) this;
        }

        public Criteria andPointsStateBetween(String value1, String value2) {
            addCriterion("points_state between", value1, value2, "pointsState");
            return (Criteria) this;
        }

        public Criteria andPointsStateNotBetween(String value1, String value2) {
            addCriterion("points_state not between", value1, value2, "pointsState");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("mark like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("mark not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("mark not between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Integer value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Integer value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Integer value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Integer value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Integer value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Integer> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Integer> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Integer value1, Integer value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeIsNull() {
            addCriterion("expired_time is null");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeIsNotNull() {
            addCriterion("expired_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeEqualTo(Integer value) {
            addCriterion("expired_time =", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeNotEqualTo(Integer value) {
            addCriterion("expired_time <>", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeGreaterThan(Integer value) {
            addCriterion("expired_time >", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("expired_time >=", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeLessThan(Integer value) {
            addCriterion("expired_time <", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeLessThanOrEqualTo(Integer value) {
            addCriterion("expired_time <=", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeIn(List<Integer> values) {
            addCriterion("expired_time in", values, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeNotIn(List<Integer> values) {
            addCriterion("expired_time not in", values, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeBetween(Integer value1, Integer value2) {
            addCriterion("expired_time between", value1, value2, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("expired_time not between", value1, value2, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andCancleStateIsNull() {
            addCriterion("cancle_state is null");
            return (Criteria) this;
        }

        public Criteria andCancleStateIsNotNull() {
            addCriterion("cancle_state is not null");
            return (Criteria) this;
        }

        public Criteria andCancleStateEqualTo(String value) {
            addCriterion("cancle_state =", value, "cancleState");
            return (Criteria) this;
        }

        public Criteria andCancleStateNotEqualTo(String value) {
            addCriterion("cancle_state <>", value, "cancleState");
            return (Criteria) this;
        }

        public Criteria andCancleStateGreaterThan(String value) {
            addCriterion("cancle_state >", value, "cancleState");
            return (Criteria) this;
        }

        public Criteria andCancleStateGreaterThanOrEqualTo(String value) {
            addCriterion("cancle_state >=", value, "cancleState");
            return (Criteria) this;
        }

        public Criteria andCancleStateLessThan(String value) {
            addCriterion("cancle_state <", value, "cancleState");
            return (Criteria) this;
        }

        public Criteria andCancleStateLessThanOrEqualTo(String value) {
            addCriterion("cancle_state <=", value, "cancleState");
            return (Criteria) this;
        }

        public Criteria andCancleStateLike(String value) {
            addCriterion("cancle_state like", value, "cancleState");
            return (Criteria) this;
        }

        public Criteria andCancleStateNotLike(String value) {
            addCriterion("cancle_state not like", value, "cancleState");
            return (Criteria) this;
        }

        public Criteria andCancleStateIn(List<String> values) {
            addCriterion("cancle_state in", values, "cancleState");
            return (Criteria) this;
        }

        public Criteria andCancleStateNotIn(List<String> values) {
            addCriterion("cancle_state not in", values, "cancleState");
            return (Criteria) this;
        }

        public Criteria andCancleStateBetween(String value1, String value2) {
            addCriterion("cancle_state between", value1, value2, "cancleState");
            return (Criteria) this;
        }

        public Criteria andCancleStateNotBetween(String value1, String value2) {
            addCriterion("cancle_state not between", value1, value2, "cancleState");
            return (Criteria) this;
        }

        public Criteria andAgreeShipTimeIsNull() {
            addCriterion("agree_ship_time is null");
            return (Criteria) this;
        }

        public Criteria andAgreeShipTimeIsNotNull() {
            addCriterion("agree_ship_time is not null");
            return (Criteria) this;
        }

        public Criteria andAgreeShipTimeEqualTo(Integer value) {
            addCriterion("agree_ship_time =", value, "agreeShipTime");
            return (Criteria) this;
        }

        public Criteria andAgreeShipTimeNotEqualTo(Integer value) {
            addCriterion("agree_ship_time <>", value, "agreeShipTime");
            return (Criteria) this;
        }

        public Criteria andAgreeShipTimeGreaterThan(Integer value) {
            addCriterion("agree_ship_time >", value, "agreeShipTime");
            return (Criteria) this;
        }

        public Criteria andAgreeShipTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("agree_ship_time >=", value, "agreeShipTime");
            return (Criteria) this;
        }

        public Criteria andAgreeShipTimeLessThan(Integer value) {
            addCriterion("agree_ship_time <", value, "agreeShipTime");
            return (Criteria) this;
        }

        public Criteria andAgreeShipTimeLessThanOrEqualTo(Integer value) {
            addCriterion("agree_ship_time <=", value, "agreeShipTime");
            return (Criteria) this;
        }

        public Criteria andAgreeShipTimeIn(List<Integer> values) {
            addCriterion("agree_ship_time in", values, "agreeShipTime");
            return (Criteria) this;
        }

        public Criteria andAgreeShipTimeNotIn(List<Integer> values) {
            addCriterion("agree_ship_time not in", values, "agreeShipTime");
            return (Criteria) this;
        }

        public Criteria andAgreeShipTimeBetween(Integer value1, Integer value2) {
            addCriterion("agree_ship_time between", value1, value2, "agreeShipTime");
            return (Criteria) this;
        }

        public Criteria andAgreeShipTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("agree_ship_time not between", value1, value2, "agreeShipTime");
            return (Criteria) this;
        }

        public Criteria andAllShipedTimeIsNull() {
            addCriterion("all_shiped_time is null");
            return (Criteria) this;
        }

        public Criteria andAllShipedTimeIsNotNull() {
            addCriterion("all_shiped_time is not null");
            return (Criteria) this;
        }

        public Criteria andAllShipedTimeEqualTo(Integer value) {
            addCriterion("all_shiped_time =", value, "allShipedTime");
            return (Criteria) this;
        }

        public Criteria andAllShipedTimeNotEqualTo(Integer value) {
            addCriterion("all_shiped_time <>", value, "allShipedTime");
            return (Criteria) this;
        }

        public Criteria andAllShipedTimeGreaterThan(Integer value) {
            addCriterion("all_shiped_time >", value, "allShipedTime");
            return (Criteria) this;
        }

        public Criteria andAllShipedTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("all_shiped_time >=", value, "allShipedTime");
            return (Criteria) this;
        }

        public Criteria andAllShipedTimeLessThan(Integer value) {
            addCriterion("all_shiped_time <", value, "allShipedTime");
            return (Criteria) this;
        }

        public Criteria andAllShipedTimeLessThanOrEqualTo(Integer value) {
            addCriterion("all_shiped_time <=", value, "allShipedTime");
            return (Criteria) this;
        }

        public Criteria andAllShipedTimeIn(List<Integer> values) {
            addCriterion("all_shiped_time in", values, "allShipedTime");
            return (Criteria) this;
        }

        public Criteria andAllShipedTimeNotIn(List<Integer> values) {
            addCriterion("all_shiped_time not in", values, "allShipedTime");
            return (Criteria) this;
        }

        public Criteria andAllShipedTimeBetween(Integer value1, Integer value2) {
            addCriterion("all_shiped_time between", value1, value2, "allShipedTime");
            return (Criteria) this;
        }

        public Criteria andAllShipedTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("all_shiped_time not between", value1, value2, "allShipedTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("receive_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Integer value) {
            addCriterion("receive_time =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Integer value) {
            addCriterion("receive_time <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Integer value) {
            addCriterion("receive_time >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_time >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Integer value) {
            addCriterion("receive_time <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Integer value) {
            addCriterion("receive_time <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Integer> values) {
            addCriterion("receive_time in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Integer> values) {
            addCriterion("receive_time not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Integer value1, Integer value2) {
            addCriterion("receive_time between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_time not between", value1, value2, "receiveTime");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_biz_main_order表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2018-01-04
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_biz_main_order 2018-01-04
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