package com.shanyuan.platform.ms.dao.order.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyOrderCommonExample {
    /**
     * sy_order_common
     */
    protected String orderByClause;

    /**
     * sy_order_common
     */
    protected boolean distinct;

    /**
     * sy_order_common
     */
    protected List<Criteria> oredCriteria;

    public SyOrderCommonExample() {
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
     * sy_order_common 2017-10-18
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

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIsNull() {
            addCriterion("shipping_time is null");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIsNotNull() {
            addCriterion("shipping_time is not null");
            return (Criteria) this;
        }

        public Criteria andShippingTimeEqualTo(Integer value) {
            addCriterion("shipping_time =", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotEqualTo(Integer value) {
            addCriterion("shipping_time <>", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThan(Integer value) {
            addCriterion("shipping_time >", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipping_time >=", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThan(Integer value) {
            addCriterion("shipping_time <", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThanOrEqualTo(Integer value) {
            addCriterion("shipping_time <=", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIn(List<Integer> values) {
            addCriterion("shipping_time in", values, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotIn(List<Integer> values) {
            addCriterion("shipping_time not in", values, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeBetween(Integer value1, Integer value2) {
            addCriterion("shipping_time between", value1, value2, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("shipping_time not between", value1, value2, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingExpressIdIsNull() {
            addCriterion("shipping_express_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingExpressIdIsNotNull() {
            addCriterion("shipping_express_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingExpressIdEqualTo(Byte value) {
            addCriterion("shipping_express_id =", value, "shippingExpressId");
            return (Criteria) this;
        }

        public Criteria andShippingExpressIdNotEqualTo(Byte value) {
            addCriterion("shipping_express_id <>", value, "shippingExpressId");
            return (Criteria) this;
        }

        public Criteria andShippingExpressIdGreaterThan(Byte value) {
            addCriterion("shipping_express_id >", value, "shippingExpressId");
            return (Criteria) this;
        }

        public Criteria andShippingExpressIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("shipping_express_id >=", value, "shippingExpressId");
            return (Criteria) this;
        }

        public Criteria andShippingExpressIdLessThan(Byte value) {
            addCriterion("shipping_express_id <", value, "shippingExpressId");
            return (Criteria) this;
        }

        public Criteria andShippingExpressIdLessThanOrEqualTo(Byte value) {
            addCriterion("shipping_express_id <=", value, "shippingExpressId");
            return (Criteria) this;
        }

        public Criteria andShippingExpressIdIn(List<Byte> values) {
            addCriterion("shipping_express_id in", values, "shippingExpressId");
            return (Criteria) this;
        }

        public Criteria andShippingExpressIdNotIn(List<Byte> values) {
            addCriterion("shipping_express_id not in", values, "shippingExpressId");
            return (Criteria) this;
        }

        public Criteria andShippingExpressIdBetween(Byte value1, Byte value2) {
            addCriterion("shipping_express_id between", value1, value2, "shippingExpressId");
            return (Criteria) this;
        }

        public Criteria andShippingExpressIdNotBetween(Byte value1, Byte value2) {
            addCriterion("shipping_express_id not between", value1, value2, "shippingExpressId");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIsNull() {
            addCriterion("evaluation_time is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIsNotNull() {
            addCriterion("evaluation_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeEqualTo(Integer value) {
            addCriterion("evaluation_time =", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotEqualTo(Integer value) {
            addCriterion("evaluation_time <>", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeGreaterThan(Integer value) {
            addCriterion("evaluation_time >", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluation_time >=", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeLessThan(Integer value) {
            addCriterion("evaluation_time <", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeLessThanOrEqualTo(Integer value) {
            addCriterion("evaluation_time <=", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIn(List<Integer> values) {
            addCriterion("evaluation_time in", values, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotIn(List<Integer> values) {
            addCriterion("evaluation_time not in", values, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeBetween(Integer value1, Integer value2) {
            addCriterion("evaluation_time between", value1, value2, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluation_time not between", value1, value2, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvalsellerStateIsNull() {
            addCriterion("evalseller_state is null");
            return (Criteria) this;
        }

        public Criteria andEvalsellerStateIsNotNull() {
            addCriterion("evalseller_state is not null");
            return (Criteria) this;
        }

        public Criteria andEvalsellerStateEqualTo(String value) {
            addCriterion("evalseller_state =", value, "evalsellerState");
            return (Criteria) this;
        }

        public Criteria andEvalsellerStateNotEqualTo(String value) {
            addCriterion("evalseller_state <>", value, "evalsellerState");
            return (Criteria) this;
        }

        public Criteria andEvalsellerStateGreaterThan(String value) {
            addCriterion("evalseller_state >", value, "evalsellerState");
            return (Criteria) this;
        }

        public Criteria andEvalsellerStateGreaterThanOrEqualTo(String value) {
            addCriterion("evalseller_state >=", value, "evalsellerState");
            return (Criteria) this;
        }

        public Criteria andEvalsellerStateLessThan(String value) {
            addCriterion("evalseller_state <", value, "evalsellerState");
            return (Criteria) this;
        }

        public Criteria andEvalsellerStateLessThanOrEqualTo(String value) {
            addCriterion("evalseller_state <=", value, "evalsellerState");
            return (Criteria) this;
        }

        public Criteria andEvalsellerStateLike(String value) {
            addCriterion("evalseller_state like", value, "evalsellerState");
            return (Criteria) this;
        }

        public Criteria andEvalsellerStateNotLike(String value) {
            addCriterion("evalseller_state not like", value, "evalsellerState");
            return (Criteria) this;
        }

        public Criteria andEvalsellerStateIn(List<String> values) {
            addCriterion("evalseller_state in", values, "evalsellerState");
            return (Criteria) this;
        }

        public Criteria andEvalsellerStateNotIn(List<String> values) {
            addCriterion("evalseller_state not in", values, "evalsellerState");
            return (Criteria) this;
        }

        public Criteria andEvalsellerStateBetween(String value1, String value2) {
            addCriterion("evalseller_state between", value1, value2, "evalsellerState");
            return (Criteria) this;
        }

        public Criteria andEvalsellerStateNotBetween(String value1, String value2) {
            addCriterion("evalseller_state not between", value1, value2, "evalsellerState");
            return (Criteria) this;
        }

        public Criteria andEvalsellerTimeIsNull() {
            addCriterion("evalseller_time is null");
            return (Criteria) this;
        }

        public Criteria andEvalsellerTimeIsNotNull() {
            addCriterion("evalseller_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvalsellerTimeEqualTo(Integer value) {
            addCriterion("evalseller_time =", value, "evalsellerTime");
            return (Criteria) this;
        }

        public Criteria andEvalsellerTimeNotEqualTo(Integer value) {
            addCriterion("evalseller_time <>", value, "evalsellerTime");
            return (Criteria) this;
        }

        public Criteria andEvalsellerTimeGreaterThan(Integer value) {
            addCriterion("evalseller_time >", value, "evalsellerTime");
            return (Criteria) this;
        }

        public Criteria andEvalsellerTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("evalseller_time >=", value, "evalsellerTime");
            return (Criteria) this;
        }

        public Criteria andEvalsellerTimeLessThan(Integer value) {
            addCriterion("evalseller_time <", value, "evalsellerTime");
            return (Criteria) this;
        }

        public Criteria andEvalsellerTimeLessThanOrEqualTo(Integer value) {
            addCriterion("evalseller_time <=", value, "evalsellerTime");
            return (Criteria) this;
        }

        public Criteria andEvalsellerTimeIn(List<Integer> values) {
            addCriterion("evalseller_time in", values, "evalsellerTime");
            return (Criteria) this;
        }

        public Criteria andEvalsellerTimeNotIn(List<Integer> values) {
            addCriterion("evalseller_time not in", values, "evalsellerTime");
            return (Criteria) this;
        }

        public Criteria andEvalsellerTimeBetween(Integer value1, Integer value2) {
            addCriterion("evalseller_time between", value1, value2, "evalsellerTime");
            return (Criteria) this;
        }

        public Criteria andEvalsellerTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("evalseller_time not between", value1, value2, "evalsellerTime");
            return (Criteria) this;
        }

        public Criteria andOrderMessageIsNull() {
            addCriterion("order_message is null");
            return (Criteria) this;
        }

        public Criteria andOrderMessageIsNotNull() {
            addCriterion("order_message is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMessageEqualTo(String value) {
            addCriterion("order_message =", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageNotEqualTo(String value) {
            addCriterion("order_message <>", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageGreaterThan(String value) {
            addCriterion("order_message >", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageGreaterThanOrEqualTo(String value) {
            addCriterion("order_message >=", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageLessThan(String value) {
            addCriterion("order_message <", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageLessThanOrEqualTo(String value) {
            addCriterion("order_message <=", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageLike(String value) {
            addCriterion("order_message like", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageNotLike(String value) {
            addCriterion("order_message not like", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageIn(List<String> values) {
            addCriterion("order_message in", values, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageNotIn(List<String> values) {
            addCriterion("order_message not in", values, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageBetween(String value1, String value2) {
            addCriterion("order_message between", value1, value2, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageNotBetween(String value1, String value2) {
            addCriterion("order_message not between", value1, value2, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderPointscountIsNull() {
            addCriterion("order_pointscount is null");
            return (Criteria) this;
        }

        public Criteria andOrderPointscountIsNotNull() {
            addCriterion("order_pointscount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPointscountEqualTo(Integer value) {
            addCriterion("order_pointscount =", value, "orderPointscount");
            return (Criteria) this;
        }

        public Criteria andOrderPointscountNotEqualTo(Integer value) {
            addCriterion("order_pointscount <>", value, "orderPointscount");
            return (Criteria) this;
        }

        public Criteria andOrderPointscountGreaterThan(Integer value) {
            addCriterion("order_pointscount >", value, "orderPointscount");
            return (Criteria) this;
        }

        public Criteria andOrderPointscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_pointscount >=", value, "orderPointscount");
            return (Criteria) this;
        }

        public Criteria andOrderPointscountLessThan(Integer value) {
            addCriterion("order_pointscount <", value, "orderPointscount");
            return (Criteria) this;
        }

        public Criteria andOrderPointscountLessThanOrEqualTo(Integer value) {
            addCriterion("order_pointscount <=", value, "orderPointscount");
            return (Criteria) this;
        }

        public Criteria andOrderPointscountIn(List<Integer> values) {
            addCriterion("order_pointscount in", values, "orderPointscount");
            return (Criteria) this;
        }

        public Criteria andOrderPointscountNotIn(List<Integer> values) {
            addCriterion("order_pointscount not in", values, "orderPointscount");
            return (Criteria) this;
        }

        public Criteria andOrderPointscountBetween(Integer value1, Integer value2) {
            addCriterion("order_pointscount between", value1, value2, "orderPointscount");
            return (Criteria) this;
        }

        public Criteria andOrderPointscountNotBetween(Integer value1, Integer value2) {
            addCriterion("order_pointscount not between", value1, value2, "orderPointscount");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceIsNull() {
            addCriterion("voucher_price is null");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceIsNotNull() {
            addCriterion("voucher_price is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceEqualTo(Integer value) {
            addCriterion("voucher_price =", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceNotEqualTo(Integer value) {
            addCriterion("voucher_price <>", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceGreaterThan(Integer value) {
            addCriterion("voucher_price >", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_price >=", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceLessThan(Integer value) {
            addCriterion("voucher_price <", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_price <=", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceIn(List<Integer> values) {
            addCriterion("voucher_price in", values, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceNotIn(List<Integer> values) {
            addCriterion("voucher_price not in", values, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceBetween(Integer value1, Integer value2) {
            addCriterion("voucher_price between", value1, value2, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_price not between", value1, value2, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeIsNull() {
            addCriterion("voucher_code is null");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeIsNotNull() {
            addCriterion("voucher_code is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeEqualTo(String value) {
            addCriterion("voucher_code =", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeNotEqualTo(String value) {
            addCriterion("voucher_code <>", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeGreaterThan(String value) {
            addCriterion("voucher_code >", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_code >=", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeLessThan(String value) {
            addCriterion("voucher_code <", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeLessThanOrEqualTo(String value) {
            addCriterion("voucher_code <=", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeLike(String value) {
            addCriterion("voucher_code like", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeNotLike(String value) {
            addCriterion("voucher_code not like", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeIn(List<String> values) {
            addCriterion("voucher_code in", values, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeNotIn(List<String> values) {
            addCriterion("voucher_code not in", values, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeBetween(String value1, String value2) {
            addCriterion("voucher_code between", value1, value2, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeNotBetween(String value1, String value2) {
            addCriterion("voucher_code not between", value1, value2, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andDaddressIdIsNull() {
            addCriterion("daddress_id is null");
            return (Criteria) this;
        }

        public Criteria andDaddressIdIsNotNull() {
            addCriterion("daddress_id is not null");
            return (Criteria) this;
        }

        public Criteria andDaddressIdEqualTo(Integer value) {
            addCriterion("daddress_id =", value, "daddressId");
            return (Criteria) this;
        }

        public Criteria andDaddressIdNotEqualTo(Integer value) {
            addCriterion("daddress_id <>", value, "daddressId");
            return (Criteria) this;
        }

        public Criteria andDaddressIdGreaterThan(Integer value) {
            addCriterion("daddress_id >", value, "daddressId");
            return (Criteria) this;
        }

        public Criteria andDaddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("daddress_id >=", value, "daddressId");
            return (Criteria) this;
        }

        public Criteria andDaddressIdLessThan(Integer value) {
            addCriterion("daddress_id <", value, "daddressId");
            return (Criteria) this;
        }

        public Criteria andDaddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("daddress_id <=", value, "daddressId");
            return (Criteria) this;
        }

        public Criteria andDaddressIdIn(List<Integer> values) {
            addCriterion("daddress_id in", values, "daddressId");
            return (Criteria) this;
        }

        public Criteria andDaddressIdNotIn(List<Integer> values) {
            addCriterion("daddress_id not in", values, "daddressId");
            return (Criteria) this;
        }

        public Criteria andDaddressIdBetween(Integer value1, Integer value2) {
            addCriterion("daddress_id between", value1, value2, "daddressId");
            return (Criteria) this;
        }

        public Criteria andDaddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("daddress_id not between", value1, value2, "daddressId");
            return (Criteria) this;
        }

        public Criteria andReciverNameIsNull() {
            addCriterion("reciver_name is null");
            return (Criteria) this;
        }

        public Criteria andReciverNameIsNotNull() {
            addCriterion("reciver_name is not null");
            return (Criteria) this;
        }

        public Criteria andReciverNameEqualTo(String value) {
            addCriterion("reciver_name =", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameNotEqualTo(String value) {
            addCriterion("reciver_name <>", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameGreaterThan(String value) {
            addCriterion("reciver_name >", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameGreaterThanOrEqualTo(String value) {
            addCriterion("reciver_name >=", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameLessThan(String value) {
            addCriterion("reciver_name <", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameLessThanOrEqualTo(String value) {
            addCriterion("reciver_name <=", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameLike(String value) {
            addCriterion("reciver_name like", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameNotLike(String value) {
            addCriterion("reciver_name not like", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameIn(List<String> values) {
            addCriterion("reciver_name in", values, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameNotIn(List<String> values) {
            addCriterion("reciver_name not in", values, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameBetween(String value1, String value2) {
            addCriterion("reciver_name between", value1, value2, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameNotBetween(String value1, String value2) {
            addCriterion("reciver_name not between", value1, value2, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverInfoIsNull() {
            addCriterion("reciver_info is null");
            return (Criteria) this;
        }

        public Criteria andReciverInfoIsNotNull() {
            addCriterion("reciver_info is not null");
            return (Criteria) this;
        }

        public Criteria andReciverInfoEqualTo(String value) {
            addCriterion("reciver_info =", value, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoNotEqualTo(String value) {
            addCriterion("reciver_info <>", value, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoGreaterThan(String value) {
            addCriterion("reciver_info >", value, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoGreaterThanOrEqualTo(String value) {
            addCriterion("reciver_info >=", value, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoLessThan(String value) {
            addCriterion("reciver_info <", value, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoLessThanOrEqualTo(String value) {
            addCriterion("reciver_info <=", value, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoLike(String value) {
            addCriterion("reciver_info like", value, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoNotLike(String value) {
            addCriterion("reciver_info not like", value, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoIn(List<String> values) {
            addCriterion("reciver_info in", values, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoNotIn(List<String> values) {
            addCriterion("reciver_info not in", values, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoBetween(String value1, String value2) {
            addCriterion("reciver_info between", value1, value2, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverInfoNotBetween(String value1, String value2) {
            addCriterion("reciver_info not between", value1, value2, "reciverInfo");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceIdIsNull() {
            addCriterion("reciver_province_id is null");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceIdIsNotNull() {
            addCriterion("reciver_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceIdEqualTo(Integer value) {
            addCriterion("reciver_province_id =", value, "reciverProvinceId");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceIdNotEqualTo(Integer value) {
            addCriterion("reciver_province_id <>", value, "reciverProvinceId");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceIdGreaterThan(Integer value) {
            addCriterion("reciver_province_id >", value, "reciverProvinceId");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reciver_province_id >=", value, "reciverProvinceId");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceIdLessThan(Integer value) {
            addCriterion("reciver_province_id <", value, "reciverProvinceId");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("reciver_province_id <=", value, "reciverProvinceId");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceIdIn(List<Integer> values) {
            addCriterion("reciver_province_id in", values, "reciverProvinceId");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceIdNotIn(List<Integer> values) {
            addCriterion("reciver_province_id not in", values, "reciverProvinceId");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("reciver_province_id between", value1, value2, "reciverProvinceId");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reciver_province_id not between", value1, value2, "reciverProvinceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfoIsNull() {
            addCriterion("invoice_info is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfoIsNotNull() {
            addCriterion("invoice_info is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfoEqualTo(String value) {
            addCriterion("invoice_info =", value, "invoiceInfo");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfoNotEqualTo(String value) {
            addCriterion("invoice_info <>", value, "invoiceInfo");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfoGreaterThan(String value) {
            addCriterion("invoice_info >", value, "invoiceInfo");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfoGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_info >=", value, "invoiceInfo");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfoLessThan(String value) {
            addCriterion("invoice_info <", value, "invoiceInfo");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfoLessThanOrEqualTo(String value) {
            addCriterion("invoice_info <=", value, "invoiceInfo");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfoLike(String value) {
            addCriterion("invoice_info like", value, "invoiceInfo");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfoNotLike(String value) {
            addCriterion("invoice_info not like", value, "invoiceInfo");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfoIn(List<String> values) {
            addCriterion("invoice_info in", values, "invoiceInfo");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfoNotIn(List<String> values) {
            addCriterion("invoice_info not in", values, "invoiceInfo");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfoBetween(String value1, String value2) {
            addCriterion("invoice_info between", value1, value2, "invoiceInfo");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfoNotBetween(String value1, String value2) {
            addCriterion("invoice_info not between", value1, value2, "invoiceInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoIsNull() {
            addCriterion("promotion_info is null");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoIsNotNull() {
            addCriterion("promotion_info is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoEqualTo(String value) {
            addCriterion("promotion_info =", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoNotEqualTo(String value) {
            addCriterion("promotion_info <>", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoGreaterThan(String value) {
            addCriterion("promotion_info >", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_info >=", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoLessThan(String value) {
            addCriterion("promotion_info <", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoLessThanOrEqualTo(String value) {
            addCriterion("promotion_info <=", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoLike(String value) {
            addCriterion("promotion_info like", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoNotLike(String value) {
            addCriterion("promotion_info not like", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoIn(List<String> values) {
            addCriterion("promotion_info in", values, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoNotIn(List<String> values) {
            addCriterion("promotion_info not in", values, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoBetween(String value1, String value2) {
            addCriterion("promotion_info between", value1, value2, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoNotBetween(String value1, String value2) {
            addCriterion("promotion_info not between", value1, value2, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andSpecNameIsNull() {
            addCriterion("spec_name is null");
            return (Criteria) this;
        }

        public Criteria andSpecNameIsNotNull() {
            addCriterion("spec_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpecNameEqualTo(String value) {
            addCriterion("spec_name =", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotEqualTo(String value) {
            addCriterion("spec_name <>", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThan(String value) {
            addCriterion("spec_name >", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThanOrEqualTo(String value) {
            addCriterion("spec_name >=", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThan(String value) {
            addCriterion("spec_name <", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThanOrEqualTo(String value) {
            addCriterion("spec_name <=", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLike(String value) {
            addCriterion("spec_name like", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotLike(String value) {
            addCriterion("spec_name not like", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameIn(List<String> values) {
            addCriterion("spec_name in", values, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotIn(List<String> values) {
            addCriterion("spec_name not in", values, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameBetween(String value1, String value2) {
            addCriterion("spec_name between", value1, value2, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotBetween(String value1, String value2) {
            addCriterion("spec_name not between", value1, value2, "specName");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleIsNull() {
            addCriterion("goods_title is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleIsNotNull() {
            addCriterion("goods_title is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleEqualTo(String value) {
            addCriterion("goods_title =", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotEqualTo(String value) {
            addCriterion("goods_title <>", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleGreaterThan(String value) {
            addCriterion("goods_title >", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("goods_title >=", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLessThan(String value) {
            addCriterion("goods_title <", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLessThanOrEqualTo(String value) {
            addCriterion("goods_title <=", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLike(String value) {
            addCriterion("goods_title like", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotLike(String value) {
            addCriterion("goods_title not like", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleIn(List<String> values) {
            addCriterion("goods_title in", values, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotIn(List<String> values) {
            addCriterion("goods_title not in", values, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleBetween(String value1, String value2) {
            addCriterion("goods_title between", value1, value2, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotBetween(String value1, String value2) {
            addCriterion("goods_title not between", value1, value2, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoIsNull() {
            addCriterion("goods_delivery_info is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoIsNotNull() {
            addCriterion("goods_delivery_info is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoEqualTo(String value) {
            addCriterion("goods_delivery_info =", value, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoNotEqualTo(String value) {
            addCriterion("goods_delivery_info <>", value, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoGreaterThan(String value) {
            addCriterion("goods_delivery_info >", value, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoGreaterThanOrEqualTo(String value) {
            addCriterion("goods_delivery_info >=", value, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoLessThan(String value) {
            addCriterion("goods_delivery_info <", value, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoLessThanOrEqualTo(String value) {
            addCriterion("goods_delivery_info <=", value, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoLike(String value) {
            addCriterion("goods_delivery_info like", value, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoNotLike(String value) {
            addCriterion("goods_delivery_info not like", value, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoIn(List<String> values) {
            addCriterion("goods_delivery_info in", values, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoNotIn(List<String> values) {
            addCriterion("goods_delivery_info not in", values, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoBetween(String value1, String value2) {
            addCriterion("goods_delivery_info between", value1, value2, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoNotBetween(String value1, String value2) {
            addCriterion("goods_delivery_info not between", value1, value2, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryInfoIsNull() {
            addCriterion("order_delivery_info is null");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryInfoIsNotNull() {
            addCriterion("order_delivery_info is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryInfoEqualTo(String value) {
            addCriterion("order_delivery_info =", value, "orderDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryInfoNotEqualTo(String value) {
            addCriterion("order_delivery_info <>", value, "orderDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryInfoGreaterThan(String value) {
            addCriterion("order_delivery_info >", value, "orderDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryInfoGreaterThanOrEqualTo(String value) {
            addCriterion("order_delivery_info >=", value, "orderDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryInfoLessThan(String value) {
            addCriterion("order_delivery_info <", value, "orderDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryInfoLessThanOrEqualTo(String value) {
            addCriterion("order_delivery_info <=", value, "orderDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryInfoLike(String value) {
            addCriterion("order_delivery_info like", value, "orderDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryInfoNotLike(String value) {
            addCriterion("order_delivery_info not like", value, "orderDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryInfoIn(List<String> values) {
            addCriterion("order_delivery_info in", values, "orderDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryInfoNotIn(List<String> values) {
            addCriterion("order_delivery_info not in", values, "orderDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryInfoBetween(String value1, String value2) {
            addCriterion("order_delivery_info between", value1, value2, "orderDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryInfoNotBetween(String value1, String value2) {
            addCriterion("order_delivery_info not between", value1, value2, "orderDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andChnlInfoIsNull() {
            addCriterion("chnl_info is null");
            return (Criteria) this;
        }

        public Criteria andChnlInfoIsNotNull() {
            addCriterion("chnl_info is not null");
            return (Criteria) this;
        }

        public Criteria andChnlInfoEqualTo(String value) {
            addCriterion("chnl_info =", value, "chnlInfo");
            return (Criteria) this;
        }

        public Criteria andChnlInfoNotEqualTo(String value) {
            addCriterion("chnl_info <>", value, "chnlInfo");
            return (Criteria) this;
        }

        public Criteria andChnlInfoGreaterThan(String value) {
            addCriterion("chnl_info >", value, "chnlInfo");
            return (Criteria) this;
        }

        public Criteria andChnlInfoGreaterThanOrEqualTo(String value) {
            addCriterion("chnl_info >=", value, "chnlInfo");
            return (Criteria) this;
        }

        public Criteria andChnlInfoLessThan(String value) {
            addCriterion("chnl_info <", value, "chnlInfo");
            return (Criteria) this;
        }

        public Criteria andChnlInfoLessThanOrEqualTo(String value) {
            addCriterion("chnl_info <=", value, "chnlInfo");
            return (Criteria) this;
        }

        public Criteria andChnlInfoLike(String value) {
            addCriterion("chnl_info like", value, "chnlInfo");
            return (Criteria) this;
        }

        public Criteria andChnlInfoNotLike(String value) {
            addCriterion("chnl_info not like", value, "chnlInfo");
            return (Criteria) this;
        }

        public Criteria andChnlInfoIn(List<String> values) {
            addCriterion("chnl_info in", values, "chnlInfo");
            return (Criteria) this;
        }

        public Criteria andChnlInfoNotIn(List<String> values) {
            addCriterion("chnl_info not in", values, "chnlInfo");
            return (Criteria) this;
        }

        public Criteria andChnlInfoBetween(String value1, String value2) {
            addCriterion("chnl_info between", value1, value2, "chnlInfo");
            return (Criteria) this;
        }

        public Criteria andChnlInfoNotBetween(String value1, String value2) {
            addCriterion("chnl_info not between", value1, value2, "chnlInfo");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIsNull() {
            addCriterion("transport_type is null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIsNotNull() {
            addCriterion("transport_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeEqualTo(Byte value) {
            addCriterion("transport_type =", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotEqualTo(Byte value) {
            addCriterion("transport_type <>", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThan(Byte value) {
            addCriterion("transport_type >", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("transport_type >=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThan(Byte value) {
            addCriterion("transport_type <", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThanOrEqualTo(Byte value) {
            addCriterion("transport_type <=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIn(List<Byte> values) {
            addCriterion("transport_type in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotIn(List<Byte> values) {
            addCriterion("transport_type not in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeBetween(Byte value1, Byte value2) {
            addCriterion("transport_type between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("transport_type not between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andExpressImageIsNull() {
            addCriterion("express_image is null");
            return (Criteria) this;
        }

        public Criteria andExpressImageIsNotNull() {
            addCriterion("express_image is not null");
            return (Criteria) this;
        }

        public Criteria andExpressImageEqualTo(String value) {
            addCriterion("express_image =", value, "expressImage");
            return (Criteria) this;
        }

        public Criteria andExpressImageNotEqualTo(String value) {
            addCriterion("express_image <>", value, "expressImage");
            return (Criteria) this;
        }

        public Criteria andExpressImageGreaterThan(String value) {
            addCriterion("express_image >", value, "expressImage");
            return (Criteria) this;
        }

        public Criteria andExpressImageGreaterThanOrEqualTo(String value) {
            addCriterion("express_image >=", value, "expressImage");
            return (Criteria) this;
        }

        public Criteria andExpressImageLessThan(String value) {
            addCriterion("express_image <", value, "expressImage");
            return (Criteria) this;
        }

        public Criteria andExpressImageLessThanOrEqualTo(String value) {
            addCriterion("express_image <=", value, "expressImage");
            return (Criteria) this;
        }

        public Criteria andExpressImageLike(String value) {
            addCriterion("express_image like", value, "expressImage");
            return (Criteria) this;
        }

        public Criteria andExpressImageNotLike(String value) {
            addCriterion("express_image not like", value, "expressImage");
            return (Criteria) this;
        }

        public Criteria andExpressImageIn(List<String> values) {
            addCriterion("express_image in", values, "expressImage");
            return (Criteria) this;
        }

        public Criteria andExpressImageNotIn(List<String> values) {
            addCriterion("express_image not in", values, "expressImage");
            return (Criteria) this;
        }

        public Criteria andExpressImageBetween(String value1, String value2) {
            addCriterion("express_image between", value1, value2, "expressImage");
            return (Criteria) this;
        }

        public Criteria andExpressImageNotBetween(String value1, String value2) {
            addCriterion("express_image not between", value1, value2, "expressImage");
            return (Criteria) this;
        }

        public Criteria andPurchaseReasonIsNull() {
            addCriterion("purchase_reason is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseReasonIsNotNull() {
            addCriterion("purchase_reason is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseReasonEqualTo(String value) {
            addCriterion("purchase_reason =", value, "purchaseReason");
            return (Criteria) this;
        }

        public Criteria andPurchaseReasonNotEqualTo(String value) {
            addCriterion("purchase_reason <>", value, "purchaseReason");
            return (Criteria) this;
        }

        public Criteria andPurchaseReasonGreaterThan(String value) {
            addCriterion("purchase_reason >", value, "purchaseReason");
            return (Criteria) this;
        }

        public Criteria andPurchaseReasonGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_reason >=", value, "purchaseReason");
            return (Criteria) this;
        }

        public Criteria andPurchaseReasonLessThan(String value) {
            addCriterion("purchase_reason <", value, "purchaseReason");
            return (Criteria) this;
        }

        public Criteria andPurchaseReasonLessThanOrEqualTo(String value) {
            addCriterion("purchase_reason <=", value, "purchaseReason");
            return (Criteria) this;
        }

        public Criteria andPurchaseReasonLike(String value) {
            addCriterion("purchase_reason like", value, "purchaseReason");
            return (Criteria) this;
        }

        public Criteria andPurchaseReasonNotLike(String value) {
            addCriterion("purchase_reason not like", value, "purchaseReason");
            return (Criteria) this;
        }

        public Criteria andPurchaseReasonIn(List<String> values) {
            addCriterion("purchase_reason in", values, "purchaseReason");
            return (Criteria) this;
        }

        public Criteria andPurchaseReasonNotIn(List<String> values) {
            addCriterion("purchase_reason not in", values, "purchaseReason");
            return (Criteria) this;
        }

        public Criteria andPurchaseReasonBetween(String value1, String value2) {
            addCriterion("purchase_reason between", value1, value2, "purchaseReason");
            return (Criteria) this;
        }

        public Criteria andPurchaseReasonNotBetween(String value1, String value2) {
            addCriterion("purchase_reason not between", value1, value2, "purchaseReason");
            return (Criteria) this;
        }

        public Criteria andPoorTypeIsNull() {
            addCriterion("poor_type is null");
            return (Criteria) this;
        }

        public Criteria andPoorTypeIsNotNull() {
            addCriterion("poor_type is not null");
            return (Criteria) this;
        }

        public Criteria andPoorTypeEqualTo(Byte value) {
            addCriterion("poor_type =", value, "poorType");
            return (Criteria) this;
        }

        public Criteria andPoorTypeNotEqualTo(Byte value) {
            addCriterion("poor_type <>", value, "poorType");
            return (Criteria) this;
        }

        public Criteria andPoorTypeGreaterThan(Byte value) {
            addCriterion("poor_type >", value, "poorType");
            return (Criteria) this;
        }

        public Criteria andPoorTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("poor_type >=", value, "poorType");
            return (Criteria) this;
        }

        public Criteria andPoorTypeLessThan(Byte value) {
            addCriterion("poor_type <", value, "poorType");
            return (Criteria) this;
        }

        public Criteria andPoorTypeLessThanOrEqualTo(Byte value) {
            addCriterion("poor_type <=", value, "poorType");
            return (Criteria) this;
        }

        public Criteria andPoorTypeIn(List<Byte> values) {
            addCriterion("poor_type in", values, "poorType");
            return (Criteria) this;
        }

        public Criteria andPoorTypeNotIn(List<Byte> values) {
            addCriterion("poor_type not in", values, "poorType");
            return (Criteria) this;
        }

        public Criteria andPoorTypeBetween(Byte value1, Byte value2) {
            addCriterion("poor_type between", value1, value2, "poorType");
            return (Criteria) this;
        }

        public Criteria andPoorTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("poor_type not between", value1, value2, "poorType");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_order_common表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-10-18
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_order_common 2017-10-18
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