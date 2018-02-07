package com.shanyuan.platform.ms.dao.order.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyOrderExample {
    /**
     * sy_order
     */
    protected String orderByClause;

    /**
     * sy_order
     */
    protected boolean distinct;

    /**
     * sy_order
     */
    protected List<Criteria> oredCriteria;

    public SyOrderExample() {
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
     * sy_order 2017-10-18
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

        public Criteria andPaySnIsNull() {
            addCriterion("pay_sn is null");
            return (Criteria) this;
        }

        public Criteria andPaySnIsNotNull() {
            addCriterion("pay_sn is not null");
            return (Criteria) this;
        }

        public Criteria andPaySnEqualTo(Long value) {
            addCriterion("pay_sn =", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotEqualTo(Long value) {
            addCriterion("pay_sn <>", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnGreaterThan(Long value) {
            addCriterion("pay_sn >", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_sn >=", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnLessThan(Long value) {
            addCriterion("pay_sn <", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnLessThanOrEqualTo(Long value) {
            addCriterion("pay_sn <=", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnIn(List<Long> values) {
            addCriterion("pay_sn in", values, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotIn(List<Long> values) {
            addCriterion("pay_sn not in", values, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnBetween(Long value1, Long value2) {
            addCriterion("pay_sn between", value1, value2, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotBetween(Long value1, Long value2) {
            addCriterion("pay_sn not between", value1, value2, "paySn");
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

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
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

        public Criteria andBuyerEmailIsNull() {
            addCriterion("buyer_email is null");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailIsNotNull() {
            addCriterion("buyer_email is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailEqualTo(String value) {
            addCriterion("buyer_email =", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailNotEqualTo(String value) {
            addCriterion("buyer_email <>", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailGreaterThan(String value) {
            addCriterion("buyer_email >", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_email >=", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailLessThan(String value) {
            addCriterion("buyer_email <", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailLessThanOrEqualTo(String value) {
            addCriterion("buyer_email <=", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailLike(String value) {
            addCriterion("buyer_email like", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailNotLike(String value) {
            addCriterion("buyer_email not like", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailIn(List<String> values) {
            addCriterion("buyer_email in", values, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailNotIn(List<String> values) {
            addCriterion("buyer_email not in", values, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailBetween(String value1, String value2) {
            addCriterion("buyer_email between", value1, value2, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailNotBetween(String value1, String value2) {
            addCriterion("buyer_email not between", value1, value2, "buyerEmail");
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

        public Criteria andPaymentCodeIsNull() {
            addCriterion("payment_code is null");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeIsNotNull() {
            addCriterion("payment_code is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeEqualTo(String value) {
            addCriterion("payment_code =", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotEqualTo(String value) {
            addCriterion("payment_code <>", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeGreaterThan(String value) {
            addCriterion("payment_code >", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_code >=", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeLessThan(String value) {
            addCriterion("payment_code <", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeLessThanOrEqualTo(String value) {
            addCriterion("payment_code <=", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeLike(String value) {
            addCriterion("payment_code like", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotLike(String value) {
            addCriterion("payment_code not like", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeIn(List<String> values) {
            addCriterion("payment_code in", values, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotIn(List<String> values) {
            addCriterion("payment_code not in", values, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeBetween(String value1, String value2) {
            addCriterion("payment_code between", value1, value2, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotBetween(String value1, String value2) {
            addCriterion("payment_code not between", value1, value2, "paymentCode");
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

        public Criteria andGoodsAmountIsNull() {
            addCriterion("goods_amount is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNotNull() {
            addCriterion("goods_amount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountEqualTo(BigDecimal value) {
            addCriterion("goods_amount =", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotEqualTo(BigDecimal value) {
            addCriterion("goods_amount <>", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThan(BigDecimal value) {
            addCriterion("goods_amount >", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_amount >=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThan(BigDecimal value) {
            addCriterion("goods_amount <", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_amount <=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIn(List<BigDecimal> values) {
            addCriterion("goods_amount in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotIn(List<BigDecimal> values) {
            addCriterion("goods_amount not in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_amount between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_amount not between", value1, value2, "goodsAmount");
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

        public Criteria andPdAmountIsNull() {
            addCriterion("pd_amount is null");
            return (Criteria) this;
        }

        public Criteria andPdAmountIsNotNull() {
            addCriterion("pd_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPdAmountEqualTo(BigDecimal value) {
            addCriterion("pd_amount =", value, "pdAmount");
            return (Criteria) this;
        }

        public Criteria andPdAmountNotEqualTo(BigDecimal value) {
            addCriterion("pd_amount <>", value, "pdAmount");
            return (Criteria) this;
        }

        public Criteria andPdAmountGreaterThan(BigDecimal value) {
            addCriterion("pd_amount >", value, "pdAmount");
            return (Criteria) this;
        }

        public Criteria andPdAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pd_amount >=", value, "pdAmount");
            return (Criteria) this;
        }

        public Criteria andPdAmountLessThan(BigDecimal value) {
            addCriterion("pd_amount <", value, "pdAmount");
            return (Criteria) this;
        }

        public Criteria andPdAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pd_amount <=", value, "pdAmount");
            return (Criteria) this;
        }

        public Criteria andPdAmountIn(List<BigDecimal> values) {
            addCriterion("pd_amount in", values, "pdAmount");
            return (Criteria) this;
        }

        public Criteria andPdAmountNotIn(List<BigDecimal> values) {
            addCriterion("pd_amount not in", values, "pdAmount");
            return (Criteria) this;
        }

        public Criteria andPdAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pd_amount between", value1, value2, "pdAmount");
            return (Criteria) this;
        }

        public Criteria andPdAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pd_amount not between", value1, value2, "pdAmount");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIsNull() {
            addCriterion("shipping_fee is null");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIsNotNull() {
            addCriterion("shipping_fee is not null");
            return (Criteria) this;
        }

        public Criteria andShippingFeeEqualTo(BigDecimal value) {
            addCriterion("shipping_fee =", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotEqualTo(BigDecimal value) {
            addCriterion("shipping_fee <>", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeGreaterThan(BigDecimal value) {
            addCriterion("shipping_fee >", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_fee >=", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeLessThan(BigDecimal value) {
            addCriterion("shipping_fee <", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_fee <=", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIn(List<BigDecimal> values) {
            addCriterion("shipping_fee in", values, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotIn(List<BigDecimal> values) {
            addCriterion("shipping_fee not in", values, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_fee between", value1, value2, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_fee not between", value1, value2, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateIsNull() {
            addCriterion("evaluation_state is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateIsNotNull() {
            addCriterion("evaluation_state is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateEqualTo(String value) {
            addCriterion("evaluation_state =", value, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateNotEqualTo(String value) {
            addCriterion("evaluation_state <>", value, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateGreaterThan(String value) {
            addCriterion("evaluation_state >", value, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateGreaterThanOrEqualTo(String value) {
            addCriterion("evaluation_state >=", value, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateLessThan(String value) {
            addCriterion("evaluation_state <", value, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateLessThanOrEqualTo(String value) {
            addCriterion("evaluation_state <=", value, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateLike(String value) {
            addCriterion("evaluation_state like", value, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateNotLike(String value) {
            addCriterion("evaluation_state not like", value, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateIn(List<String> values) {
            addCriterion("evaluation_state in", values, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateNotIn(List<String> values) {
            addCriterion("evaluation_state not in", values, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateBetween(String value1, String value2) {
            addCriterion("evaluation_state between", value1, value2, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateNotBetween(String value1, String value2) {
            addCriterion("evaluation_state not between", value1, value2, "evaluationState");
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

        public Criteria andRefundStateIsNull() {
            addCriterion("refund_state is null");
            return (Criteria) this;
        }

        public Criteria andRefundStateIsNotNull() {
            addCriterion("refund_state is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStateEqualTo(Byte value) {
            addCriterion("refund_state =", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotEqualTo(Byte value) {
            addCriterion("refund_state <>", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateGreaterThan(Byte value) {
            addCriterion("refund_state >", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("refund_state >=", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateLessThan(Byte value) {
            addCriterion("refund_state <", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateLessThanOrEqualTo(Byte value) {
            addCriterion("refund_state <=", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateIn(List<Byte> values) {
            addCriterion("refund_state in", values, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotIn(List<Byte> values) {
            addCriterion("refund_state not in", values, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateBetween(Byte value1, Byte value2) {
            addCriterion("refund_state between", value1, value2, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotBetween(Byte value1, Byte value2) {
            addCriterion("refund_state not between", value1, value2, "refundState");
            return (Criteria) this;
        }

        public Criteria andLockStateIsNull() {
            addCriterion("lock_state is null");
            return (Criteria) this;
        }

        public Criteria andLockStateIsNotNull() {
            addCriterion("lock_state is not null");
            return (Criteria) this;
        }

        public Criteria andLockStateEqualTo(Byte value) {
            addCriterion("lock_state =", value, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateNotEqualTo(Byte value) {
            addCriterion("lock_state <>", value, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateGreaterThan(Byte value) {
            addCriterion("lock_state >", value, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("lock_state >=", value, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateLessThan(Byte value) {
            addCriterion("lock_state <", value, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateLessThanOrEqualTo(Byte value) {
            addCriterion("lock_state <=", value, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateIn(List<Byte> values) {
            addCriterion("lock_state in", values, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateNotIn(List<Byte> values) {
            addCriterion("lock_state not in", values, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateBetween(Byte value1, Byte value2) {
            addCriterion("lock_state between", value1, value2, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateNotBetween(Byte value1, Byte value2) {
            addCriterion("lock_state not between", value1, value2, "lockState");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNull() {
            addCriterion("refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(BigDecimal value) {
            addCriterion("refund_amount =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(BigDecimal value) {
            addCriterion("refund_amount <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(BigDecimal value) {
            addCriterion("refund_amount >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_amount >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(BigDecimal value) {
            addCriterion("refund_amount <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_amount <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<BigDecimal> values) {
            addCriterion("refund_amount in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<BigDecimal> values) {
            addCriterion("refund_amount not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_amount between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_amount not between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andDelayTimeIsNull() {
            addCriterion("delay_time is null");
            return (Criteria) this;
        }

        public Criteria andDelayTimeIsNotNull() {
            addCriterion("delay_time is not null");
            return (Criteria) this;
        }

        public Criteria andDelayTimeEqualTo(Integer value) {
            addCriterion("delay_time =", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeNotEqualTo(Integer value) {
            addCriterion("delay_time <>", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeGreaterThan(Integer value) {
            addCriterion("delay_time >", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("delay_time >=", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeLessThan(Integer value) {
            addCriterion("delay_time <", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeLessThanOrEqualTo(Integer value) {
            addCriterion("delay_time <=", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeIn(List<Integer> values) {
            addCriterion("delay_time in", values, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeNotIn(List<Integer> values) {
            addCriterion("delay_time not in", values, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeBetween(Integer value1, Integer value2) {
            addCriterion("delay_time between", value1, value2, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("delay_time not between", value1, value2, "delayTime");
            return (Criteria) this;
        }

        public Criteria andOrderFromIsNull() {
            addCriterion("order_from is null");
            return (Criteria) this;
        }

        public Criteria andOrderFromIsNotNull() {
            addCriterion("order_from is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFromEqualTo(String value) {
            addCriterion("order_from =", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromNotEqualTo(String value) {
            addCriterion("order_from <>", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromGreaterThan(String value) {
            addCriterion("order_from >", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromGreaterThanOrEqualTo(String value) {
            addCriterion("order_from >=", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromLessThan(String value) {
            addCriterion("order_from <", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromLessThanOrEqualTo(String value) {
            addCriterion("order_from <=", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromLike(String value) {
            addCriterion("order_from like", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromNotLike(String value) {
            addCriterion("order_from not like", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromIn(List<String> values) {
            addCriterion("order_from in", values, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromNotIn(List<String> values) {
            addCriterion("order_from not in", values, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromBetween(String value1, String value2) {
            addCriterion("order_from between", value1, value2, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromNotBetween(String value1, String value2) {
            addCriterion("order_from not between", value1, value2, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIsNull() {
            addCriterion("shipping_code is null");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIsNotNull() {
            addCriterion("shipping_code is not null");
            return (Criteria) this;
        }

        public Criteria andShippingCodeEqualTo(String value) {
            addCriterion("shipping_code =", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotEqualTo(String value) {
            addCriterion("shipping_code <>", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeGreaterThan(String value) {
            addCriterion("shipping_code >", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_code >=", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLessThan(String value) {
            addCriterion("shipping_code <", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLessThanOrEqualTo(String value) {
            addCriterion("shipping_code <=", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLike(String value) {
            addCriterion("shipping_code like", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotLike(String value) {
            addCriterion("shipping_code not like", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIn(List<String> values) {
            addCriterion("shipping_code in", values, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotIn(List<String> values) {
            addCriterion("shipping_code not in", values, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeBetween(String value1, String value2) {
            addCriterion("shipping_code between", value1, value2, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotBetween(String value1, String value2) {
            addCriterion("shipping_code not between", value1, value2, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeIsNull() {
            addCriterion("goods_project_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeIsNotNull() {
            addCriterion("goods_project_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeEqualTo(Integer value) {
            addCriterion("goods_project_type =", value, "goodsProjectType");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeNotEqualTo(Integer value) {
            addCriterion("goods_project_type <>", value, "goodsProjectType");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeGreaterThan(Integer value) {
            addCriterion("goods_project_type >", value, "goodsProjectType");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_project_type >=", value, "goodsProjectType");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeLessThan(Integer value) {
            addCriterion("goods_project_type <", value, "goodsProjectType");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeLessThanOrEqualTo(Integer value) {
            addCriterion("goods_project_type <=", value, "goodsProjectType");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeIn(List<Integer> values) {
            addCriterion("goods_project_type in", values, "goodsProjectType");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeNotIn(List<Integer> values) {
            addCriterion("goods_project_type not in", values, "goodsProjectType");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeBetween(Integer value1, Integer value2) {
            addCriterion("goods_project_type between", value1, value2, "goodsProjectType");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_project_type not between", value1, value2, "goodsProjectType");
            return (Criteria) this;
        }

        public Criteria andOrderServiceStartimeIsNull() {
            addCriterion("order_service_startime is null");
            return (Criteria) this;
        }

        public Criteria andOrderServiceStartimeIsNotNull() {
            addCriterion("order_service_startime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderServiceStartimeEqualTo(Integer value) {
            addCriterion("order_service_startime =", value, "orderServiceStartime");
            return (Criteria) this;
        }

        public Criteria andOrderServiceStartimeNotEqualTo(Integer value) {
            addCriterion("order_service_startime <>", value, "orderServiceStartime");
            return (Criteria) this;
        }

        public Criteria andOrderServiceStartimeGreaterThan(Integer value) {
            addCriterion("order_service_startime >", value, "orderServiceStartime");
            return (Criteria) this;
        }

        public Criteria andOrderServiceStartimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_service_startime >=", value, "orderServiceStartime");
            return (Criteria) this;
        }

        public Criteria andOrderServiceStartimeLessThan(Integer value) {
            addCriterion("order_service_startime <", value, "orderServiceStartime");
            return (Criteria) this;
        }

        public Criteria andOrderServiceStartimeLessThanOrEqualTo(Integer value) {
            addCriterion("order_service_startime <=", value, "orderServiceStartime");
            return (Criteria) this;
        }

        public Criteria andOrderServiceStartimeIn(List<Integer> values) {
            addCriterion("order_service_startime in", values, "orderServiceStartime");
            return (Criteria) this;
        }

        public Criteria andOrderServiceStartimeNotIn(List<Integer> values) {
            addCriterion("order_service_startime not in", values, "orderServiceStartime");
            return (Criteria) this;
        }

        public Criteria andOrderServiceStartimeBetween(Integer value1, Integer value2) {
            addCriterion("order_service_startime between", value1, value2, "orderServiceStartime");
            return (Criteria) this;
        }

        public Criteria andOrderServiceStartimeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_service_startime not between", value1, value2, "orderServiceStartime");
            return (Criteria) this;
        }

        public Criteria andOrderServiceEndtimeIsNull() {
            addCriterion("order_service_endtime is null");
            return (Criteria) this;
        }

        public Criteria andOrderServiceEndtimeIsNotNull() {
            addCriterion("order_service_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderServiceEndtimeEqualTo(Integer value) {
            addCriterion("order_service_endtime =", value, "orderServiceEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderServiceEndtimeNotEqualTo(Integer value) {
            addCriterion("order_service_endtime <>", value, "orderServiceEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderServiceEndtimeGreaterThan(Integer value) {
            addCriterion("order_service_endtime >", value, "orderServiceEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderServiceEndtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_service_endtime >=", value, "orderServiceEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderServiceEndtimeLessThan(Integer value) {
            addCriterion("order_service_endtime <", value, "orderServiceEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderServiceEndtimeLessThanOrEqualTo(Integer value) {
            addCriterion("order_service_endtime <=", value, "orderServiceEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderServiceEndtimeIn(List<Integer> values) {
            addCriterion("order_service_endtime in", values, "orderServiceEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderServiceEndtimeNotIn(List<Integer> values) {
            addCriterion("order_service_endtime not in", values, "orderServiceEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderServiceEndtimeBetween(Integer value1, Integer value2) {
            addCriterion("order_service_endtime between", value1, value2, "orderServiceEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderServiceEndtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_service_endtime not between", value1, value2, "orderServiceEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderServiceInfoIsNull() {
            addCriterion("order_service_info is null");
            return (Criteria) this;
        }

        public Criteria andOrderServiceInfoIsNotNull() {
            addCriterion("order_service_info is not null");
            return (Criteria) this;
        }

        public Criteria andOrderServiceInfoEqualTo(String value) {
            addCriterion("order_service_info =", value, "orderServiceInfo");
            return (Criteria) this;
        }

        public Criteria andOrderServiceInfoNotEqualTo(String value) {
            addCriterion("order_service_info <>", value, "orderServiceInfo");
            return (Criteria) this;
        }

        public Criteria andOrderServiceInfoGreaterThan(String value) {
            addCriterion("order_service_info >", value, "orderServiceInfo");
            return (Criteria) this;
        }

        public Criteria andOrderServiceInfoGreaterThanOrEqualTo(String value) {
            addCriterion("order_service_info >=", value, "orderServiceInfo");
            return (Criteria) this;
        }

        public Criteria andOrderServiceInfoLessThan(String value) {
            addCriterion("order_service_info <", value, "orderServiceInfo");
            return (Criteria) this;
        }

        public Criteria andOrderServiceInfoLessThanOrEqualTo(String value) {
            addCriterion("order_service_info <=", value, "orderServiceInfo");
            return (Criteria) this;
        }

        public Criteria andOrderServiceInfoLike(String value) {
            addCriterion("order_service_info like", value, "orderServiceInfo");
            return (Criteria) this;
        }

        public Criteria andOrderServiceInfoNotLike(String value) {
            addCriterion("order_service_info not like", value, "orderServiceInfo");
            return (Criteria) this;
        }

        public Criteria andOrderServiceInfoIn(List<String> values) {
            addCriterion("order_service_info in", values, "orderServiceInfo");
            return (Criteria) this;
        }

        public Criteria andOrderServiceInfoNotIn(List<String> values) {
            addCriterion("order_service_info not in", values, "orderServiceInfo");
            return (Criteria) this;
        }

        public Criteria andOrderServiceInfoBetween(String value1, String value2) {
            addCriterion("order_service_info between", value1, value2, "orderServiceInfo");
            return (Criteria) this;
        }

        public Criteria andOrderServiceInfoNotBetween(String value1, String value2) {
            addCriterion("order_service_info not between", value1, value2, "orderServiceInfo");
            return (Criteria) this;
        }

        public Criteria andRewardIsNull() {
            addCriterion("reward is null");
            return (Criteria) this;
        }

        public Criteria andRewardIsNotNull() {
            addCriterion("reward is not null");
            return (Criteria) this;
        }

        public Criteria andRewardEqualTo(Byte value) {
            addCriterion("reward =", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotEqualTo(Byte value) {
            addCriterion("reward <>", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardGreaterThan(Byte value) {
            addCriterion("reward >", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardGreaterThanOrEqualTo(Byte value) {
            addCriterion("reward >=", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLessThan(Byte value) {
            addCriterion("reward <", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLessThanOrEqualTo(Byte value) {
            addCriterion("reward <=", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardIn(List<Byte> values) {
            addCriterion("reward in", values, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotIn(List<Byte> values) {
            addCriterion("reward not in", values, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardBetween(Byte value1, Byte value2) {
            addCriterion("reward between", value1, value2, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotBetween(Byte value1, Byte value2) {
            addCriterion("reward not between", value1, value2, "reward");
            return (Criteria) this;
        }

        public Criteria andApplyerIdIsNull() {
            addCriterion("applyer_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyerIdIsNotNull() {
            addCriterion("applyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyerIdEqualTo(Integer value) {
            addCriterion("applyer_id =", value, "applyerId");
            return (Criteria) this;
        }

        public Criteria andApplyerIdNotEqualTo(Integer value) {
            addCriterion("applyer_id <>", value, "applyerId");
            return (Criteria) this;
        }

        public Criteria andApplyerIdGreaterThan(Integer value) {
            addCriterion("applyer_id >", value, "applyerId");
            return (Criteria) this;
        }

        public Criteria andApplyerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("applyer_id >=", value, "applyerId");
            return (Criteria) this;
        }

        public Criteria andApplyerIdLessThan(Integer value) {
            addCriterion("applyer_id <", value, "applyerId");
            return (Criteria) this;
        }

        public Criteria andApplyerIdLessThanOrEqualTo(Integer value) {
            addCriterion("applyer_id <=", value, "applyerId");
            return (Criteria) this;
        }

        public Criteria andApplyerIdIn(List<Integer> values) {
            addCriterion("applyer_id in", values, "applyerId");
            return (Criteria) this;
        }

        public Criteria andApplyerIdNotIn(List<Integer> values) {
            addCriterion("applyer_id not in", values, "applyerId");
            return (Criteria) this;
        }

        public Criteria andApplyerIdBetween(Integer value1, Integer value2) {
            addCriterion("applyer_id between", value1, value2, "applyerId");
            return (Criteria) this;
        }

        public Criteria andApplyerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("applyer_id not between", value1, value2, "applyerId");
            return (Criteria) this;
        }

        public Criteria andServiceFeeRateIsNull() {
            addCriterion("service_fee_rate is null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeRateIsNotNull() {
            addCriterion("service_fee_rate is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeRateEqualTo(Short value) {
            addCriterion("service_fee_rate =", value, "serviceFeeRate");
            return (Criteria) this;
        }

        public Criteria andServiceFeeRateNotEqualTo(Short value) {
            addCriterion("service_fee_rate <>", value, "serviceFeeRate");
            return (Criteria) this;
        }

        public Criteria andServiceFeeRateGreaterThan(Short value) {
            addCriterion("service_fee_rate >", value, "serviceFeeRate");
            return (Criteria) this;
        }

        public Criteria andServiceFeeRateGreaterThanOrEqualTo(Short value) {
            addCriterion("service_fee_rate >=", value, "serviceFeeRate");
            return (Criteria) this;
        }

        public Criteria andServiceFeeRateLessThan(Short value) {
            addCriterion("service_fee_rate <", value, "serviceFeeRate");
            return (Criteria) this;
        }

        public Criteria andServiceFeeRateLessThanOrEqualTo(Short value) {
            addCriterion("service_fee_rate <=", value, "serviceFeeRate");
            return (Criteria) this;
        }

        public Criteria andServiceFeeRateIn(List<Short> values) {
            addCriterion("service_fee_rate in", values, "serviceFeeRate");
            return (Criteria) this;
        }

        public Criteria andServiceFeeRateNotIn(List<Short> values) {
            addCriterion("service_fee_rate not in", values, "serviceFeeRate");
            return (Criteria) this;
        }

        public Criteria andServiceFeeRateBetween(Short value1, Short value2) {
            addCriterion("service_fee_rate between", value1, value2, "serviceFeeRate");
            return (Criteria) this;
        }

        public Criteria andServiceFeeRateNotBetween(Short value1, Short value2) {
            addCriterion("service_fee_rate not between", value1, value2, "serviceFeeRate");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIsNull() {
            addCriterion("service_fee is null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIsNotNull() {
            addCriterion("service_fee is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeEqualTo(BigDecimal value) {
            addCriterion("service_fee =", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotEqualTo(BigDecimal value) {
            addCriterion("service_fee <>", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeGreaterThan(BigDecimal value) {
            addCriterion("service_fee >", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("service_fee >=", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLessThan(BigDecimal value) {
            addCriterion("service_fee <", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("service_fee <=", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIn(List<BigDecimal> values) {
            addCriterion("service_fee in", values, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotIn(List<BigDecimal> values) {
            addCriterion("service_fee not in", values, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_fee between", value1, value2, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_fee not between", value1, value2, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andAgentFeeIsNull() {
            addCriterion("agent_fee is null");
            return (Criteria) this;
        }

        public Criteria andAgentFeeIsNotNull() {
            addCriterion("agent_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAgentFeeEqualTo(BigDecimal value) {
            addCriterion("agent_fee =", value, "agentFee");
            return (Criteria) this;
        }

        public Criteria andAgentFeeNotEqualTo(BigDecimal value) {
            addCriterion("agent_fee <>", value, "agentFee");
            return (Criteria) this;
        }

        public Criteria andAgentFeeGreaterThan(BigDecimal value) {
            addCriterion("agent_fee >", value, "agentFee");
            return (Criteria) this;
        }

        public Criteria andAgentFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("agent_fee >=", value, "agentFee");
            return (Criteria) this;
        }

        public Criteria andAgentFeeLessThan(BigDecimal value) {
            addCriterion("agent_fee <", value, "agentFee");
            return (Criteria) this;
        }

        public Criteria andAgentFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("agent_fee <=", value, "agentFee");
            return (Criteria) this;
        }

        public Criteria andAgentFeeIn(List<BigDecimal> values) {
            addCriterion("agent_fee in", values, "agentFee");
            return (Criteria) this;
        }

        public Criteria andAgentFeeNotIn(List<BigDecimal> values) {
            addCriterion("agent_fee not in", values, "agentFee");
            return (Criteria) this;
        }

        public Criteria andAgentFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("agent_fee between", value1, value2, "agentFee");
            return (Criteria) this;
        }

        public Criteria andAgentFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("agent_fee not between", value1, value2, "agentFee");
            return (Criteria) this;
        }

        public Criteria andSenderIdIsNull() {
            addCriterion("sender_id is null");
            return (Criteria) this;
        }

        public Criteria andSenderIdIsNotNull() {
            addCriterion("sender_id is not null");
            return (Criteria) this;
        }

        public Criteria andSenderIdEqualTo(Integer value) {
            addCriterion("sender_id =", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotEqualTo(Integer value) {
            addCriterion("sender_id <>", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThan(Integer value) {
            addCriterion("sender_id >", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sender_id >=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThan(Integer value) {
            addCriterion("sender_id <", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThanOrEqualTo(Integer value) {
            addCriterion("sender_id <=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdIn(List<Integer> values) {
            addCriterion("sender_id in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotIn(List<Integer> values) {
            addCriterion("sender_id not in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdBetween(Integer value1, Integer value2) {
            addCriterion("sender_id between", value1, value2, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sender_id not between", value1, value2, "senderId");
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

        public Criteria andRefundTimeIsNull() {
            addCriterion("refund_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNotNull() {
            addCriterion("refund_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeEqualTo(Integer value) {
            addCriterion("refund_time =", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotEqualTo(Integer value) {
            addCriterion("refund_time <>", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThan(Integer value) {
            addCriterion("refund_time >", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_time >=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThan(Integer value) {
            addCriterion("refund_time <", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThanOrEqualTo(Integer value) {
            addCriterion("refund_time <=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIn(List<Integer> values) {
            addCriterion("refund_time in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotIn(List<Integer> values) {
            addCriterion("refund_time not in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeBetween(Integer value1, Integer value2) {
            addCriterion("refund_time between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_time not between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNull() {
            addCriterion("trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(String value) {
            addCriterion("trade_no =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLike(String value) {
            addCriterion("trade_no like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotLike(String value) {
            addCriterion("trade_no not like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<String> values) {
            addCriterion("trade_no in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<String> values) {
            addCriterion("trade_no not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(String value1, String value2) {
            addCriterion("trade_no between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(String value1, String value2) {
            addCriterion("trade_no not between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andStoreLookedOrderStateIsNull() {
            addCriterion("store_looked_order_state is null");
            return (Criteria) this;
        }

        public Criteria andStoreLookedOrderStateIsNotNull() {
            addCriterion("store_looked_order_state is not null");
            return (Criteria) this;
        }

        public Criteria andStoreLookedOrderStateEqualTo(Byte value) {
            addCriterion("store_looked_order_state =", value, "storeLookedOrderState");
            return (Criteria) this;
        }

        public Criteria andStoreLookedOrderStateNotEqualTo(Byte value) {
            addCriterion("store_looked_order_state <>", value, "storeLookedOrderState");
            return (Criteria) this;
        }

        public Criteria andStoreLookedOrderStateGreaterThan(Byte value) {
            addCriterion("store_looked_order_state >", value, "storeLookedOrderState");
            return (Criteria) this;
        }

        public Criteria andStoreLookedOrderStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("store_looked_order_state >=", value, "storeLookedOrderState");
            return (Criteria) this;
        }

        public Criteria andStoreLookedOrderStateLessThan(Byte value) {
            addCriterion("store_looked_order_state <", value, "storeLookedOrderState");
            return (Criteria) this;
        }

        public Criteria andStoreLookedOrderStateLessThanOrEqualTo(Byte value) {
            addCriterion("store_looked_order_state <=", value, "storeLookedOrderState");
            return (Criteria) this;
        }

        public Criteria andStoreLookedOrderStateIn(List<Byte> values) {
            addCriterion("store_looked_order_state in", values, "storeLookedOrderState");
            return (Criteria) this;
        }

        public Criteria andStoreLookedOrderStateNotIn(List<Byte> values) {
            addCriterion("store_looked_order_state not in", values, "storeLookedOrderState");
            return (Criteria) this;
        }

        public Criteria andStoreLookedOrderStateBetween(Byte value1, Byte value2) {
            addCriterion("store_looked_order_state between", value1, value2, "storeLookedOrderState");
            return (Criteria) this;
        }

        public Criteria andStoreLookedOrderStateNotBetween(Byte value1, Byte value2) {
            addCriterion("store_looked_order_state not between", value1, value2, "storeLookedOrderState");
            return (Criteria) this;
        }

        public Criteria andStoreLookedRefundStateIsNull() {
            addCriterion("store_looked_refund_state is null");
            return (Criteria) this;
        }

        public Criteria andStoreLookedRefundStateIsNotNull() {
            addCriterion("store_looked_refund_state is not null");
            return (Criteria) this;
        }

        public Criteria andStoreLookedRefundStateEqualTo(Byte value) {
            addCriterion("store_looked_refund_state =", value, "storeLookedRefundState");
            return (Criteria) this;
        }

        public Criteria andStoreLookedRefundStateNotEqualTo(Byte value) {
            addCriterion("store_looked_refund_state <>", value, "storeLookedRefundState");
            return (Criteria) this;
        }

        public Criteria andStoreLookedRefundStateGreaterThan(Byte value) {
            addCriterion("store_looked_refund_state >", value, "storeLookedRefundState");
            return (Criteria) this;
        }

        public Criteria andStoreLookedRefundStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("store_looked_refund_state >=", value, "storeLookedRefundState");
            return (Criteria) this;
        }

        public Criteria andStoreLookedRefundStateLessThan(Byte value) {
            addCriterion("store_looked_refund_state <", value, "storeLookedRefundState");
            return (Criteria) this;
        }

        public Criteria andStoreLookedRefundStateLessThanOrEqualTo(Byte value) {
            addCriterion("store_looked_refund_state <=", value, "storeLookedRefundState");
            return (Criteria) this;
        }

        public Criteria andStoreLookedRefundStateIn(List<Byte> values) {
            addCriterion("store_looked_refund_state in", values, "storeLookedRefundState");
            return (Criteria) this;
        }

        public Criteria andStoreLookedRefundStateNotIn(List<Byte> values) {
            addCriterion("store_looked_refund_state not in", values, "storeLookedRefundState");
            return (Criteria) this;
        }

        public Criteria andStoreLookedRefundStateBetween(Byte value1, Byte value2) {
            addCriterion("store_looked_refund_state between", value1, value2, "storeLookedRefundState");
            return (Criteria) this;
        }

        public Criteria andStoreLookedRefundStateNotBetween(Byte value1, Byte value2) {
            addCriterion("store_looked_refund_state not between", value1, value2, "storeLookedRefundState");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedOrderStateIsNull() {
            addCriterion("buyer_looked_order_state is null");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedOrderStateIsNotNull() {
            addCriterion("buyer_looked_order_state is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedOrderStateEqualTo(Byte value) {
            addCriterion("buyer_looked_order_state =", value, "buyerLookedOrderState");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedOrderStateNotEqualTo(Byte value) {
            addCriterion("buyer_looked_order_state <>", value, "buyerLookedOrderState");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedOrderStateGreaterThan(Byte value) {
            addCriterion("buyer_looked_order_state >", value, "buyerLookedOrderState");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedOrderStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("buyer_looked_order_state >=", value, "buyerLookedOrderState");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedOrderStateLessThan(Byte value) {
            addCriterion("buyer_looked_order_state <", value, "buyerLookedOrderState");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedOrderStateLessThanOrEqualTo(Byte value) {
            addCriterion("buyer_looked_order_state <=", value, "buyerLookedOrderState");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedOrderStateIn(List<Byte> values) {
            addCriterion("buyer_looked_order_state in", values, "buyerLookedOrderState");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedOrderStateNotIn(List<Byte> values) {
            addCriterion("buyer_looked_order_state not in", values, "buyerLookedOrderState");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedOrderStateBetween(Byte value1, Byte value2) {
            addCriterion("buyer_looked_order_state between", value1, value2, "buyerLookedOrderState");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedOrderStateNotBetween(Byte value1, Byte value2) {
            addCriterion("buyer_looked_order_state not between", value1, value2, "buyerLookedOrderState");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedRefundStateIsNull() {
            addCriterion("buyer_looked_refund_state is null");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedRefundStateIsNotNull() {
            addCriterion("buyer_looked_refund_state is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedRefundStateEqualTo(Byte value) {
            addCriterion("buyer_looked_refund_state =", value, "buyerLookedRefundState");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedRefundStateNotEqualTo(Byte value) {
            addCriterion("buyer_looked_refund_state <>", value, "buyerLookedRefundState");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedRefundStateGreaterThan(Byte value) {
            addCriterion("buyer_looked_refund_state >", value, "buyerLookedRefundState");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedRefundStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("buyer_looked_refund_state >=", value, "buyerLookedRefundState");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedRefundStateLessThan(Byte value) {
            addCriterion("buyer_looked_refund_state <", value, "buyerLookedRefundState");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedRefundStateLessThanOrEqualTo(Byte value) {
            addCriterion("buyer_looked_refund_state <=", value, "buyerLookedRefundState");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedRefundStateIn(List<Byte> values) {
            addCriterion("buyer_looked_refund_state in", values, "buyerLookedRefundState");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedRefundStateNotIn(List<Byte> values) {
            addCriterion("buyer_looked_refund_state not in", values, "buyerLookedRefundState");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedRefundStateBetween(Byte value1, Byte value2) {
            addCriterion("buyer_looked_refund_state between", value1, value2, "buyerLookedRefundState");
            return (Criteria) this;
        }

        public Criteria andBuyerLookedRefundStateNotBetween(Byte value1, Byte value2) {
            addCriterion("buyer_looked_refund_state not between", value1, value2, "buyerLookedRefundState");
            return (Criteria) this;
        }

        public Criteria andPublisherIdIsNull() {
            addCriterion("publisher_id is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIdIsNotNull() {
            addCriterion("publisher_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherIdEqualTo(Integer value) {
            addCriterion("publisher_id =", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdNotEqualTo(Integer value) {
            addCriterion("publisher_id <>", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdGreaterThan(Integer value) {
            addCriterion("publisher_id >", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("publisher_id >=", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdLessThan(Integer value) {
            addCriterion("publisher_id <", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdLessThanOrEqualTo(Integer value) {
            addCriterion("publisher_id <=", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdIn(List<Integer> values) {
            addCriterion("publisher_id in", values, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdNotIn(List<Integer> values) {
            addCriterion("publisher_id not in", values, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdBetween(Integer value1, Integer value2) {
            addCriterion("publisher_id between", value1, value2, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("publisher_id not between", value1, value2, "publisherId");
            return (Criteria) this;
        }

        public Criteria andSyPointsIsNull() {
            addCriterion("sy_points is null");
            return (Criteria) this;
        }

        public Criteria andSyPointsIsNotNull() {
            addCriterion("sy_points is not null");
            return (Criteria) this;
        }

        public Criteria andSyPointsEqualTo(Long value) {
            addCriterion("sy_points =", value, "syPoints");
            return (Criteria) this;
        }

        public Criteria andSyPointsNotEqualTo(Long value) {
            addCriterion("sy_points <>", value, "syPoints");
            return (Criteria) this;
        }

        public Criteria andSyPointsGreaterThan(Long value) {
            addCriterion("sy_points >", value, "syPoints");
            return (Criteria) this;
        }

        public Criteria andSyPointsGreaterThanOrEqualTo(Long value) {
            addCriterion("sy_points >=", value, "syPoints");
            return (Criteria) this;
        }

        public Criteria andSyPointsLessThan(Long value) {
            addCriterion("sy_points <", value, "syPoints");
            return (Criteria) this;
        }

        public Criteria andSyPointsLessThanOrEqualTo(Long value) {
            addCriterion("sy_points <=", value, "syPoints");
            return (Criteria) this;
        }

        public Criteria andSyPointsIn(List<Long> values) {
            addCriterion("sy_points in", values, "syPoints");
            return (Criteria) this;
        }

        public Criteria andSyPointsNotIn(List<Long> values) {
            addCriterion("sy_points not in", values, "syPoints");
            return (Criteria) this;
        }

        public Criteria andSyPointsBetween(Long value1, Long value2) {
            addCriterion("sy_points between", value1, value2, "syPoints");
            return (Criteria) this;
        }

        public Criteria andSyPointsNotBetween(Long value1, Long value2) {
            addCriterion("sy_points not between", value1, value2, "syPoints");
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

        public Criteria andExtendTypeIsNull() {
            addCriterion("extend_type is null");
            return (Criteria) this;
        }

        public Criteria andExtendTypeIsNotNull() {
            addCriterion("extend_type is not null");
            return (Criteria) this;
        }

        public Criteria andExtendTypeEqualTo(String value) {
            addCriterion("extend_type =", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeNotEqualTo(String value) {
            addCriterion("extend_type <>", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeGreaterThan(String value) {
            addCriterion("extend_type >", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeGreaterThanOrEqualTo(String value) {
            addCriterion("extend_type >=", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeLessThan(String value) {
            addCriterion("extend_type <", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeLessThanOrEqualTo(String value) {
            addCriterion("extend_type <=", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeLike(String value) {
            addCriterion("extend_type like", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeNotLike(String value) {
            addCriterion("extend_type not like", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeIn(List<String> values) {
            addCriterion("extend_type in", values, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeNotIn(List<String> values) {
            addCriterion("extend_type not in", values, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeBetween(String value1, String value2) {
            addCriterion("extend_type between", value1, value2, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeNotBetween(String value1, String value2) {
            addCriterion("extend_type not between", value1, value2, "extendType");
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

        public Criteria andFundFeeIsNull() {
            addCriterion("fund_fee is null");
            return (Criteria) this;
        }

        public Criteria andFundFeeIsNotNull() {
            addCriterion("fund_fee is not null");
            return (Criteria) this;
        }

        public Criteria andFundFeeEqualTo(BigDecimal value) {
            addCriterion("fund_fee =", value, "fundFee");
            return (Criteria) this;
        }

        public Criteria andFundFeeNotEqualTo(BigDecimal value) {
            addCriterion("fund_fee <>", value, "fundFee");
            return (Criteria) this;
        }

        public Criteria andFundFeeGreaterThan(BigDecimal value) {
            addCriterion("fund_fee >", value, "fundFee");
            return (Criteria) this;
        }

        public Criteria andFundFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fund_fee >=", value, "fundFee");
            return (Criteria) this;
        }

        public Criteria andFundFeeLessThan(BigDecimal value) {
            addCriterion("fund_fee <", value, "fundFee");
            return (Criteria) this;
        }

        public Criteria andFundFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fund_fee <=", value, "fundFee");
            return (Criteria) this;
        }

        public Criteria andFundFeeIn(List<BigDecimal> values) {
            addCriterion("fund_fee in", values, "fundFee");
            return (Criteria) this;
        }

        public Criteria andFundFeeNotIn(List<BigDecimal> values) {
            addCriterion("fund_fee not in", values, "fundFee");
            return (Criteria) this;
        }

        public Criteria andFundFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fund_fee between", value1, value2, "fundFee");
            return (Criteria) this;
        }

        public Criteria andFundFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fund_fee not between", value1, value2, "fundFee");
            return (Criteria) this;
        }

        public Criteria andLastConsultTimeIsNull() {
            addCriterion("last_consult_time is null");
            return (Criteria) this;
        }

        public Criteria andLastConsultTimeIsNotNull() {
            addCriterion("last_consult_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastConsultTimeEqualTo(Integer value) {
            addCriterion("last_consult_time =", value, "lastConsultTime");
            return (Criteria) this;
        }

        public Criteria andLastConsultTimeNotEqualTo(Integer value) {
            addCriterion("last_consult_time <>", value, "lastConsultTime");
            return (Criteria) this;
        }

        public Criteria andLastConsultTimeGreaterThan(Integer value) {
            addCriterion("last_consult_time >", value, "lastConsultTime");
            return (Criteria) this;
        }

        public Criteria andLastConsultTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_consult_time >=", value, "lastConsultTime");
            return (Criteria) this;
        }

        public Criteria andLastConsultTimeLessThan(Integer value) {
            addCriterion("last_consult_time <", value, "lastConsultTime");
            return (Criteria) this;
        }

        public Criteria andLastConsultTimeLessThanOrEqualTo(Integer value) {
            addCriterion("last_consult_time <=", value, "lastConsultTime");
            return (Criteria) this;
        }

        public Criteria andLastConsultTimeIn(List<Integer> values) {
            addCriterion("last_consult_time in", values, "lastConsultTime");
            return (Criteria) this;
        }

        public Criteria andLastConsultTimeNotIn(List<Integer> values) {
            addCriterion("last_consult_time not in", values, "lastConsultTime");
            return (Criteria) this;
        }

        public Criteria andLastConsultTimeBetween(Integer value1, Integer value2) {
            addCriterion("last_consult_time between", value1, value2, "lastConsultTime");
            return (Criteria) this;
        }

        public Criteria andLastConsultTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_consult_time not between", value1, value2, "lastConsultTime");
            return (Criteria) this;
        }

        public Criteria andRemindBuyerTimeIsNull() {
            addCriterion("remind_buyer_time is null");
            return (Criteria) this;
        }

        public Criteria andRemindBuyerTimeIsNotNull() {
            addCriterion("remind_buyer_time is not null");
            return (Criteria) this;
        }

        public Criteria andRemindBuyerTimeEqualTo(Integer value) {
            addCriterion("remind_buyer_time =", value, "remindBuyerTime");
            return (Criteria) this;
        }

        public Criteria andRemindBuyerTimeNotEqualTo(Integer value) {
            addCriterion("remind_buyer_time <>", value, "remindBuyerTime");
            return (Criteria) this;
        }

        public Criteria andRemindBuyerTimeGreaterThan(Integer value) {
            addCriterion("remind_buyer_time >", value, "remindBuyerTime");
            return (Criteria) this;
        }

        public Criteria andRemindBuyerTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("remind_buyer_time >=", value, "remindBuyerTime");
            return (Criteria) this;
        }

        public Criteria andRemindBuyerTimeLessThan(Integer value) {
            addCriterion("remind_buyer_time <", value, "remindBuyerTime");
            return (Criteria) this;
        }

        public Criteria andRemindBuyerTimeLessThanOrEqualTo(Integer value) {
            addCriterion("remind_buyer_time <=", value, "remindBuyerTime");
            return (Criteria) this;
        }

        public Criteria andRemindBuyerTimeIn(List<Integer> values) {
            addCriterion("remind_buyer_time in", values, "remindBuyerTime");
            return (Criteria) this;
        }

        public Criteria andRemindBuyerTimeNotIn(List<Integer> values) {
            addCriterion("remind_buyer_time not in", values, "remindBuyerTime");
            return (Criteria) this;
        }

        public Criteria andRemindBuyerTimeBetween(Integer value1, Integer value2) {
            addCriterion("remind_buyer_time between", value1, value2, "remindBuyerTime");
            return (Criteria) this;
        }

        public Criteria andRemindBuyerTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("remind_buyer_time not between", value1, value2, "remindBuyerTime");
            return (Criteria) this;
        }

        public Criteria andLastConsultStateIsNull() {
            addCriterion("last_consult_state is null");
            return (Criteria) this;
        }

        public Criteria andLastConsultStateIsNotNull() {
            addCriterion("last_consult_state is not null");
            return (Criteria) this;
        }

        public Criteria andLastConsultStateEqualTo(Byte value) {
            addCriterion("last_consult_state =", value, "lastConsultState");
            return (Criteria) this;
        }

        public Criteria andLastConsultStateNotEqualTo(Byte value) {
            addCriterion("last_consult_state <>", value, "lastConsultState");
            return (Criteria) this;
        }

        public Criteria andLastConsultStateGreaterThan(Byte value) {
            addCriterion("last_consult_state >", value, "lastConsultState");
            return (Criteria) this;
        }

        public Criteria andLastConsultStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("last_consult_state >=", value, "lastConsultState");
            return (Criteria) this;
        }

        public Criteria andLastConsultStateLessThan(Byte value) {
            addCriterion("last_consult_state <", value, "lastConsultState");
            return (Criteria) this;
        }

        public Criteria andLastConsultStateLessThanOrEqualTo(Byte value) {
            addCriterion("last_consult_state <=", value, "lastConsultState");
            return (Criteria) this;
        }

        public Criteria andLastConsultStateIn(List<Byte> values) {
            addCriterion("last_consult_state in", values, "lastConsultState");
            return (Criteria) this;
        }

        public Criteria andLastConsultStateNotIn(List<Byte> values) {
            addCriterion("last_consult_state not in", values, "lastConsultState");
            return (Criteria) this;
        }

        public Criteria andLastConsultStateBetween(Byte value1, Byte value2) {
            addCriterion("last_consult_state between", value1, value2, "lastConsultState");
            return (Criteria) this;
        }

        public Criteria andLastConsultStateNotBetween(Byte value1, Byte value2) {
            addCriterion("last_consult_state not between", value1, value2, "lastConsultState");
            return (Criteria) this;
        }

        public Criteria andRefundIdIsNull() {
            addCriterion("refund_id is null");
            return (Criteria) this;
        }

        public Criteria andRefundIdIsNotNull() {
            addCriterion("refund_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefundIdEqualTo(Integer value) {
            addCriterion("refund_id =", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotEqualTo(Integer value) {
            addCriterion("refund_id <>", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdGreaterThan(Integer value) {
            addCriterion("refund_id >", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_id >=", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLessThan(Integer value) {
            addCriterion("refund_id <", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLessThanOrEqualTo(Integer value) {
            addCriterion("refund_id <=", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdIn(List<Integer> values) {
            addCriterion("refund_id in", values, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotIn(List<Integer> values) {
            addCriterion("refund_id not in", values, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdBetween(Integer value1, Integer value2) {
            addCriterion("refund_id between", value1, value2, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_id not between", value1, value2, "refundId");
            return (Criteria) this;
        }

        public Criteria andCouponPayIsNull() {
            addCriterion("coupon_pay is null");
            return (Criteria) this;
        }

        public Criteria andCouponPayIsNotNull() {
            addCriterion("coupon_pay is not null");
            return (Criteria) this;
        }

        public Criteria andCouponPayEqualTo(BigDecimal value) {
            addCriterion("coupon_pay =", value, "couponPay");
            return (Criteria) this;
        }

        public Criteria andCouponPayNotEqualTo(BigDecimal value) {
            addCriterion("coupon_pay <>", value, "couponPay");
            return (Criteria) this;
        }

        public Criteria andCouponPayGreaterThan(BigDecimal value) {
            addCriterion("coupon_pay >", value, "couponPay");
            return (Criteria) this;
        }

        public Criteria andCouponPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_pay >=", value, "couponPay");
            return (Criteria) this;
        }

        public Criteria andCouponPayLessThan(BigDecimal value) {
            addCriterion("coupon_pay <", value, "couponPay");
            return (Criteria) this;
        }

        public Criteria andCouponPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_pay <=", value, "couponPay");
            return (Criteria) this;
        }

        public Criteria andCouponPayIn(List<BigDecimal> values) {
            addCriterion("coupon_pay in", values, "couponPay");
            return (Criteria) this;
        }

        public Criteria andCouponPayNotIn(List<BigDecimal> values) {
            addCriterion("coupon_pay not in", values, "couponPay");
            return (Criteria) this;
        }

        public Criteria andCouponPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_pay between", value1, value2, "couponPay");
            return (Criteria) this;
        }

        public Criteria andCouponPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_pay not between", value1, value2, "couponPay");
            return (Criteria) this;
        }

        public Criteria andMoneyPayIsNull() {
            addCriterion("money_pay is null");
            return (Criteria) this;
        }

        public Criteria andMoneyPayIsNotNull() {
            addCriterion("money_pay is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyPayEqualTo(BigDecimal value) {
            addCriterion("money_pay =", value, "moneyPay");
            return (Criteria) this;
        }

        public Criteria andMoneyPayNotEqualTo(BigDecimal value) {
            addCriterion("money_pay <>", value, "moneyPay");
            return (Criteria) this;
        }

        public Criteria andMoneyPayGreaterThan(BigDecimal value) {
            addCriterion("money_pay >", value, "moneyPay");
            return (Criteria) this;
        }

        public Criteria andMoneyPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_pay >=", value, "moneyPay");
            return (Criteria) this;
        }

        public Criteria andMoneyPayLessThan(BigDecimal value) {
            addCriterion("money_pay <", value, "moneyPay");
            return (Criteria) this;
        }

        public Criteria andMoneyPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_pay <=", value, "moneyPay");
            return (Criteria) this;
        }

        public Criteria andMoneyPayIn(List<BigDecimal> values) {
            addCriterion("money_pay in", values, "moneyPay");
            return (Criteria) this;
        }

        public Criteria andMoneyPayNotIn(List<BigDecimal> values) {
            addCriterion("money_pay not in", values, "moneyPay");
            return (Criteria) this;
        }

        public Criteria andMoneyPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_pay between", value1, value2, "moneyPay");
            return (Criteria) this;
        }

        public Criteria andMoneyPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_pay not between", value1, value2, "moneyPay");
            return (Criteria) this;
        }

        public Criteria andAssistIdIsNull() {
            addCriterion("assist_id is null");
            return (Criteria) this;
        }

        public Criteria andAssistIdIsNotNull() {
            addCriterion("assist_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssistIdEqualTo(Integer value) {
            addCriterion("assist_id =", value, "assistId");
            return (Criteria) this;
        }

        public Criteria andAssistIdNotEqualTo(Integer value) {
            addCriterion("assist_id <>", value, "assistId");
            return (Criteria) this;
        }

        public Criteria andAssistIdGreaterThan(Integer value) {
            addCriterion("assist_id >", value, "assistId");
            return (Criteria) this;
        }

        public Criteria andAssistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("assist_id >=", value, "assistId");
            return (Criteria) this;
        }

        public Criteria andAssistIdLessThan(Integer value) {
            addCriterion("assist_id <", value, "assistId");
            return (Criteria) this;
        }

        public Criteria andAssistIdLessThanOrEqualTo(Integer value) {
            addCriterion("assist_id <=", value, "assistId");
            return (Criteria) this;
        }

        public Criteria andAssistIdIn(List<Integer> values) {
            addCriterion("assist_id in", values, "assistId");
            return (Criteria) this;
        }

        public Criteria andAssistIdNotIn(List<Integer> values) {
            addCriterion("assist_id not in", values, "assistId");
            return (Criteria) this;
        }

        public Criteria andAssistIdBetween(Integer value1, Integer value2) {
            addCriterion("assist_id between", value1, value2, "assistId");
            return (Criteria) this;
        }

        public Criteria andAssistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("assist_id not between", value1, value2, "assistId");
            return (Criteria) this;
        }

        public Criteria andVerIsNull() {
            addCriterion("ver is null");
            return (Criteria) this;
        }

        public Criteria andVerIsNotNull() {
            addCriterion("ver is not null");
            return (Criteria) this;
        }

        public Criteria andVerEqualTo(Byte value) {
            addCriterion("ver =", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotEqualTo(Byte value) {
            addCriterion("ver <>", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerGreaterThan(Byte value) {
            addCriterion("ver >", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerGreaterThanOrEqualTo(Byte value) {
            addCriterion("ver >=", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerLessThan(Byte value) {
            addCriterion("ver <", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerLessThanOrEqualTo(Byte value) {
            addCriterion("ver <=", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerIn(List<Byte> values) {
            addCriterion("ver in", values, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotIn(List<Byte> values) {
            addCriterion("ver not in", values, "ver");
            return (Criteria) this;
        }

        public Criteria andVerBetween(Byte value1, Byte value2) {
            addCriterion("ver between", value1, value2, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotBetween(Byte value1, Byte value2) {
            addCriterion("ver not between", value1, value2, "ver");
            return (Criteria) this;
        }

        public Criteria andBalanceStateIsNull() {
            addCriterion("balance_state is null");
            return (Criteria) this;
        }

        public Criteria andBalanceStateIsNotNull() {
            addCriterion("balance_state is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceStateEqualTo(Byte value) {
            addCriterion("balance_state =", value, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateNotEqualTo(Byte value) {
            addCriterion("balance_state <>", value, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateGreaterThan(Byte value) {
            addCriterion("balance_state >", value, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("balance_state >=", value, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateLessThan(Byte value) {
            addCriterion("balance_state <", value, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateLessThanOrEqualTo(Byte value) {
            addCriterion("balance_state <=", value, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateIn(List<Byte> values) {
            addCriterion("balance_state in", values, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateNotIn(List<Byte> values) {
            addCriterion("balance_state not in", values, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateBetween(Byte value1, Byte value2) {
            addCriterion("balance_state between", value1, value2, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateNotBetween(Byte value1, Byte value2) {
            addCriterion("balance_state not between", value1, value2, "balanceState");
            return (Criteria) this;
        }

        public Criteria andRemindSellerTimeIsNull() {
            addCriterion("remind_seller_time is null");
            return (Criteria) this;
        }

        public Criteria andRemindSellerTimeIsNotNull() {
            addCriterion("remind_seller_time is not null");
            return (Criteria) this;
        }

        public Criteria andRemindSellerTimeEqualTo(Integer value) {
            addCriterion("remind_seller_time =", value, "remindSellerTime");
            return (Criteria) this;
        }

        public Criteria andRemindSellerTimeNotEqualTo(Integer value) {
            addCriterion("remind_seller_time <>", value, "remindSellerTime");
            return (Criteria) this;
        }

        public Criteria andRemindSellerTimeGreaterThan(Integer value) {
            addCriterion("remind_seller_time >", value, "remindSellerTime");
            return (Criteria) this;
        }

        public Criteria andRemindSellerTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("remind_seller_time >=", value, "remindSellerTime");
            return (Criteria) this;
        }

        public Criteria andRemindSellerTimeLessThan(Integer value) {
            addCriterion("remind_seller_time <", value, "remindSellerTime");
            return (Criteria) this;
        }

        public Criteria andRemindSellerTimeLessThanOrEqualTo(Integer value) {
            addCriterion("remind_seller_time <=", value, "remindSellerTime");
            return (Criteria) this;
        }

        public Criteria andRemindSellerTimeIn(List<Integer> values) {
            addCriterion("remind_seller_time in", values, "remindSellerTime");
            return (Criteria) this;
        }

        public Criteria andRemindSellerTimeNotIn(List<Integer> values) {
            addCriterion("remind_seller_time not in", values, "remindSellerTime");
            return (Criteria) this;
        }

        public Criteria andRemindSellerTimeBetween(Integer value1, Integer value2) {
            addCriterion("remind_seller_time between", value1, value2, "remindSellerTime");
            return (Criteria) this;
        }

        public Criteria andRemindSellerTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("remind_seller_time not between", value1, value2, "remindSellerTime");
            return (Criteria) this;
        }

        public Criteria andWarnLevelIsNull() {
            addCriterion("warn_level is null");
            return (Criteria) this;
        }

        public Criteria andWarnLevelIsNotNull() {
            addCriterion("warn_level is not null");
            return (Criteria) this;
        }

        public Criteria andWarnLevelEqualTo(Byte value) {
            addCriterion("warn_level =", value, "warnLevel");
            return (Criteria) this;
        }

        public Criteria andWarnLevelNotEqualTo(Byte value) {
            addCriterion("warn_level <>", value, "warnLevel");
            return (Criteria) this;
        }

        public Criteria andWarnLevelGreaterThan(Byte value) {
            addCriterion("warn_level >", value, "warnLevel");
            return (Criteria) this;
        }

        public Criteria andWarnLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("warn_level >=", value, "warnLevel");
            return (Criteria) this;
        }

        public Criteria andWarnLevelLessThan(Byte value) {
            addCriterion("warn_level <", value, "warnLevel");
            return (Criteria) this;
        }

        public Criteria andWarnLevelLessThanOrEqualTo(Byte value) {
            addCriterion("warn_level <=", value, "warnLevel");
            return (Criteria) this;
        }

        public Criteria andWarnLevelIn(List<Byte> values) {
            addCriterion("warn_level in", values, "warnLevel");
            return (Criteria) this;
        }

        public Criteria andWarnLevelNotIn(List<Byte> values) {
            addCriterion("warn_level not in", values, "warnLevel");
            return (Criteria) this;
        }

        public Criteria andWarnLevelBetween(Byte value1, Byte value2) {
            addCriterion("warn_level between", value1, value2, "warnLevel");
            return (Criteria) this;
        }

        public Criteria andWarnLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("warn_level not between", value1, value2, "warnLevel");
            return (Criteria) this;
        }

        public Criteria andCommunicationStatusIsNull() {
            addCriterion("communication_status is null");
            return (Criteria) this;
        }

        public Criteria andCommunicationStatusIsNotNull() {
            addCriterion("communication_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicationStatusEqualTo(Byte value) {
            addCriterion("communication_status =", value, "communicationStatus");
            return (Criteria) this;
        }

        public Criteria andCommunicationStatusNotEqualTo(Byte value) {
            addCriterion("communication_status <>", value, "communicationStatus");
            return (Criteria) this;
        }

        public Criteria andCommunicationStatusGreaterThan(Byte value) {
            addCriterion("communication_status >", value, "communicationStatus");
            return (Criteria) this;
        }

        public Criteria andCommunicationStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("communication_status >=", value, "communicationStatus");
            return (Criteria) this;
        }

        public Criteria andCommunicationStatusLessThan(Byte value) {
            addCriterion("communication_status <", value, "communicationStatus");
            return (Criteria) this;
        }

        public Criteria andCommunicationStatusLessThanOrEqualTo(Byte value) {
            addCriterion("communication_status <=", value, "communicationStatus");
            return (Criteria) this;
        }

        public Criteria andCommunicationStatusIn(List<Byte> values) {
            addCriterion("communication_status in", values, "communicationStatus");
            return (Criteria) this;
        }

        public Criteria andCommunicationStatusNotIn(List<Byte> values) {
            addCriterion("communication_status not in", values, "communicationStatus");
            return (Criteria) this;
        }

        public Criteria andCommunicationStatusBetween(Byte value1, Byte value2) {
            addCriterion("communication_status between", value1, value2, "communicationStatus");
            return (Criteria) this;
        }

        public Criteria andCommunicationStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("communication_status not between", value1, value2, "communicationStatus");
            return (Criteria) this;
        }

        public Criteria andDelayedDeliveryStateIsNull() {
            addCriterion("delayed_delivery_state is null");
            return (Criteria) this;
        }

        public Criteria andDelayedDeliveryStateIsNotNull() {
            addCriterion("delayed_delivery_state is not null");
            return (Criteria) this;
        }

        public Criteria andDelayedDeliveryStateEqualTo(String value) {
            addCriterion("delayed_delivery_state =", value, "delayedDeliveryState");
            return (Criteria) this;
        }

        public Criteria andDelayedDeliveryStateNotEqualTo(String value) {
            addCriterion("delayed_delivery_state <>", value, "delayedDeliveryState");
            return (Criteria) this;
        }

        public Criteria andDelayedDeliveryStateGreaterThan(String value) {
            addCriterion("delayed_delivery_state >", value, "delayedDeliveryState");
            return (Criteria) this;
        }

        public Criteria andDelayedDeliveryStateGreaterThanOrEqualTo(String value) {
            addCriterion("delayed_delivery_state >=", value, "delayedDeliveryState");
            return (Criteria) this;
        }

        public Criteria andDelayedDeliveryStateLessThan(String value) {
            addCriterion("delayed_delivery_state <", value, "delayedDeliveryState");
            return (Criteria) this;
        }

        public Criteria andDelayedDeliveryStateLessThanOrEqualTo(String value) {
            addCriterion("delayed_delivery_state <=", value, "delayedDeliveryState");
            return (Criteria) this;
        }

        public Criteria andDelayedDeliveryStateLike(String value) {
            addCriterion("delayed_delivery_state like", value, "delayedDeliveryState");
            return (Criteria) this;
        }

        public Criteria andDelayedDeliveryStateNotLike(String value) {
            addCriterion("delayed_delivery_state not like", value, "delayedDeliveryState");
            return (Criteria) this;
        }

        public Criteria andDelayedDeliveryStateIn(List<String> values) {
            addCriterion("delayed_delivery_state in", values, "delayedDeliveryState");
            return (Criteria) this;
        }

        public Criteria andDelayedDeliveryStateNotIn(List<String> values) {
            addCriterion("delayed_delivery_state not in", values, "delayedDeliveryState");
            return (Criteria) this;
        }

        public Criteria andDelayedDeliveryStateBetween(String value1, String value2) {
            addCriterion("delayed_delivery_state between", value1, value2, "delayedDeliveryState");
            return (Criteria) this;
        }

        public Criteria andDelayedDeliveryStateNotBetween(String value1, String value2) {
            addCriterion("delayed_delivery_state not between", value1, value2, "delayedDeliveryState");
            return (Criteria) this;
        }

        public Criteria andDelayedReceiveDurationIsNull() {
            addCriterion("delayed_receive_duration is null");
            return (Criteria) this;
        }

        public Criteria andDelayedReceiveDurationIsNotNull() {
            addCriterion("delayed_receive_duration is not null");
            return (Criteria) this;
        }

        public Criteria andDelayedReceiveDurationEqualTo(Integer value) {
            addCriterion("delayed_receive_duration =", value, "delayedReceiveDuration");
            return (Criteria) this;
        }

        public Criteria andDelayedReceiveDurationNotEqualTo(Integer value) {
            addCriterion("delayed_receive_duration <>", value, "delayedReceiveDuration");
            return (Criteria) this;
        }

        public Criteria andDelayedReceiveDurationGreaterThan(Integer value) {
            addCriterion("delayed_receive_duration >", value, "delayedReceiveDuration");
            return (Criteria) this;
        }

        public Criteria andDelayedReceiveDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("delayed_receive_duration >=", value, "delayedReceiveDuration");
            return (Criteria) this;
        }

        public Criteria andDelayedReceiveDurationLessThan(Integer value) {
            addCriterion("delayed_receive_duration <", value, "delayedReceiveDuration");
            return (Criteria) this;
        }

        public Criteria andDelayedReceiveDurationLessThanOrEqualTo(Integer value) {
            addCriterion("delayed_receive_duration <=", value, "delayedReceiveDuration");
            return (Criteria) this;
        }

        public Criteria andDelayedReceiveDurationIn(List<Integer> values) {
            addCriterion("delayed_receive_duration in", values, "delayedReceiveDuration");
            return (Criteria) this;
        }

        public Criteria andDelayedReceiveDurationNotIn(List<Integer> values) {
            addCriterion("delayed_receive_duration not in", values, "delayedReceiveDuration");
            return (Criteria) this;
        }

        public Criteria andDelayedReceiveDurationBetween(Integer value1, Integer value2) {
            addCriterion("delayed_receive_duration between", value1, value2, "delayedReceiveDuration");
            return (Criteria) this;
        }

        public Criteria andDelayedReceiveDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("delayed_receive_duration not between", value1, value2, "delayedReceiveDuration");
            return (Criteria) this;
        }

        public Criteria andAppVariantIsNull() {
            addCriterion("app_variant is null");
            return (Criteria) this;
        }

        public Criteria andAppVariantIsNotNull() {
            addCriterion("app_variant is not null");
            return (Criteria) this;
        }

        public Criteria andAppVariantEqualTo(String value) {
            addCriterion("app_variant =", value, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantNotEqualTo(String value) {
            addCriterion("app_variant <>", value, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantGreaterThan(String value) {
            addCriterion("app_variant >", value, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantGreaterThanOrEqualTo(String value) {
            addCriterion("app_variant >=", value, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantLessThan(String value) {
            addCriterion("app_variant <", value, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantLessThanOrEqualTo(String value) {
            addCriterion("app_variant <=", value, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantLike(String value) {
            addCriterion("app_variant like", value, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantNotLike(String value) {
            addCriterion("app_variant not like", value, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantIn(List<String> values) {
            addCriterion("app_variant in", values, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantNotIn(List<String> values) {
            addCriterion("app_variant not in", values, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantBetween(String value1, String value2) {
            addCriterion("app_variant between", value1, value2, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantNotBetween(String value1, String value2) {
            addCriterion("app_variant not between", value1, value2, "appVariant");
            return (Criteria) this;
        }

        public Criteria andTradeModeIsNull() {
            addCriterion("trade_mode is null");
            return (Criteria) this;
        }

        public Criteria andTradeModeIsNotNull() {
            addCriterion("trade_mode is not null");
            return (Criteria) this;
        }

        public Criteria andTradeModeEqualTo(String value) {
            addCriterion("trade_mode =", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeNotEqualTo(String value) {
            addCriterion("trade_mode <>", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeGreaterThan(String value) {
            addCriterion("trade_mode >", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeGreaterThanOrEqualTo(String value) {
            addCriterion("trade_mode >=", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeLessThan(String value) {
            addCriterion("trade_mode <", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeLessThanOrEqualTo(String value) {
            addCriterion("trade_mode <=", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeLike(String value) {
            addCriterion("trade_mode like", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeNotLike(String value) {
            addCriterion("trade_mode not like", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeIn(List<String> values) {
            addCriterion("trade_mode in", values, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeNotIn(List<String> values) {
            addCriterion("trade_mode not in", values, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeBetween(String value1, String value2) {
            addCriterion("trade_mode between", value1, value2, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeNotBetween(String value1, String value2) {
            addCriterion("trade_mode not between", value1, value2, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andPresellTimeIsNull() {
            addCriterion("presell_time is null");
            return (Criteria) this;
        }

        public Criteria andPresellTimeIsNotNull() {
            addCriterion("presell_time is not null");
            return (Criteria) this;
        }

        public Criteria andPresellTimeEqualTo(Integer value) {
            addCriterion("presell_time =", value, "presellTime");
            return (Criteria) this;
        }

        public Criteria andPresellTimeNotEqualTo(Integer value) {
            addCriterion("presell_time <>", value, "presellTime");
            return (Criteria) this;
        }

        public Criteria andPresellTimeGreaterThan(Integer value) {
            addCriterion("presell_time >", value, "presellTime");
            return (Criteria) this;
        }

        public Criteria andPresellTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("presell_time >=", value, "presellTime");
            return (Criteria) this;
        }

        public Criteria andPresellTimeLessThan(Integer value) {
            addCriterion("presell_time <", value, "presellTime");
            return (Criteria) this;
        }

        public Criteria andPresellTimeLessThanOrEqualTo(Integer value) {
            addCriterion("presell_time <=", value, "presellTime");
            return (Criteria) this;
        }

        public Criteria andPresellTimeIn(List<Integer> values) {
            addCriterion("presell_time in", values, "presellTime");
            return (Criteria) this;
        }

        public Criteria andPresellTimeNotIn(List<Integer> values) {
            addCriterion("presell_time not in", values, "presellTime");
            return (Criteria) this;
        }

        public Criteria andPresellTimeBetween(Integer value1, Integer value2) {
            addCriterion("presell_time between", value1, value2, "presellTime");
            return (Criteria) this;
        }

        public Criteria andPresellTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("presell_time not between", value1, value2, "presellTime");
            return (Criteria) this;
        }

        public Criteria andSupportCountyIdIsNull() {
            addCriterion("support_county_id is null");
            return (Criteria) this;
        }

        public Criteria andSupportCountyIdIsNotNull() {
            addCriterion("support_county_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupportCountyIdEqualTo(Long value) {
            addCriterion("support_county_id =", value, "supportCountyId");
            return (Criteria) this;
        }

        public Criteria andSupportCountyIdNotEqualTo(Long value) {
            addCriterion("support_county_id <>", value, "supportCountyId");
            return (Criteria) this;
        }

        public Criteria andSupportCountyIdGreaterThan(Long value) {
            addCriterion("support_county_id >", value, "supportCountyId");
            return (Criteria) this;
        }

        public Criteria andSupportCountyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("support_county_id >=", value, "supportCountyId");
            return (Criteria) this;
        }

        public Criteria andSupportCountyIdLessThan(Long value) {
            addCriterion("support_county_id <", value, "supportCountyId");
            return (Criteria) this;
        }

        public Criteria andSupportCountyIdLessThanOrEqualTo(Long value) {
            addCriterion("support_county_id <=", value, "supportCountyId");
            return (Criteria) this;
        }

        public Criteria andSupportCountyIdIn(List<Long> values) {
            addCriterion("support_county_id in", values, "supportCountyId");
            return (Criteria) this;
        }

        public Criteria andSupportCountyIdNotIn(List<Long> values) {
            addCriterion("support_county_id not in", values, "supportCountyId");
            return (Criteria) this;
        }

        public Criteria andSupportCountyIdBetween(Long value1, Long value2) {
            addCriterion("support_county_id between", value1, value2, "supportCountyId");
            return (Criteria) this;
        }

        public Criteria andSupportCountyIdNotBetween(Long value1, Long value2) {
            addCriterion("support_county_id not between", value1, value2, "supportCountyId");
            return (Criteria) this;
        }

        public Criteria andBuyerChannelIsNull() {
            addCriterion("buyer_channel is null");
            return (Criteria) this;
        }

        public Criteria andBuyerChannelIsNotNull() {
            addCriterion("buyer_channel is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerChannelEqualTo(String value) {
            addCriterion("buyer_channel =", value, "buyerChannel");
            return (Criteria) this;
        }

        public Criteria andBuyerChannelNotEqualTo(String value) {
            addCriterion("buyer_channel <>", value, "buyerChannel");
            return (Criteria) this;
        }

        public Criteria andBuyerChannelGreaterThan(String value) {
            addCriterion("buyer_channel >", value, "buyerChannel");
            return (Criteria) this;
        }

        public Criteria andBuyerChannelGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_channel >=", value, "buyerChannel");
            return (Criteria) this;
        }

        public Criteria andBuyerChannelLessThan(String value) {
            addCriterion("buyer_channel <", value, "buyerChannel");
            return (Criteria) this;
        }

        public Criteria andBuyerChannelLessThanOrEqualTo(String value) {
            addCriterion("buyer_channel <=", value, "buyerChannel");
            return (Criteria) this;
        }

        public Criteria andBuyerChannelLike(String value) {
            addCriterion("buyer_channel like", value, "buyerChannel");
            return (Criteria) this;
        }

        public Criteria andBuyerChannelNotLike(String value) {
            addCriterion("buyer_channel not like", value, "buyerChannel");
            return (Criteria) this;
        }

        public Criteria andBuyerChannelIn(List<String> values) {
            addCriterion("buyer_channel in", values, "buyerChannel");
            return (Criteria) this;
        }

        public Criteria andBuyerChannelNotIn(List<String> values) {
            addCriterion("buyer_channel not in", values, "buyerChannel");
            return (Criteria) this;
        }

        public Criteria andBuyerChannelBetween(String value1, String value2) {
            addCriterion("buyer_channel between", value1, value2, "buyerChannel");
            return (Criteria) this;
        }

        public Criteria andBuyerChannelNotBetween(String value1, String value2) {
            addCriterion("buyer_channel not between", value1, value2, "buyerChannel");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNull() {
            addCriterion("discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("discount_amount =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("discount_amount <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("discount_amount >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(BigDecimal value) {
            addCriterion("discount_amount <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("discount_amount in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("discount_amount not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount not between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Byte value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Byte value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Byte value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Byte value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Byte value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Byte> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Byte> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Byte value1, Byte value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andBizOperationMidIsNull() {
            addCriterion("biz_operation_mid is null");
            return (Criteria) this;
        }

        public Criteria andBizOperationMidIsNotNull() {
            addCriterion("biz_operation_mid is not null");
            return (Criteria) this;
        }

        public Criteria andBizOperationMidEqualTo(Integer value) {
            addCriterion("biz_operation_mid =", value, "bizOperationMid");
            return (Criteria) this;
        }

        public Criteria andBizOperationMidNotEqualTo(Integer value) {
            addCriterion("biz_operation_mid <>", value, "bizOperationMid");
            return (Criteria) this;
        }

        public Criteria andBizOperationMidGreaterThan(Integer value) {
            addCriterion("biz_operation_mid >", value, "bizOperationMid");
            return (Criteria) this;
        }

        public Criteria andBizOperationMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("biz_operation_mid >=", value, "bizOperationMid");
            return (Criteria) this;
        }

        public Criteria andBizOperationMidLessThan(Integer value) {
            addCriterion("biz_operation_mid <", value, "bizOperationMid");
            return (Criteria) this;
        }

        public Criteria andBizOperationMidLessThanOrEqualTo(Integer value) {
            addCriterion("biz_operation_mid <=", value, "bizOperationMid");
            return (Criteria) this;
        }

        public Criteria andBizOperationMidIn(List<Integer> values) {
            addCriterion("biz_operation_mid in", values, "bizOperationMid");
            return (Criteria) this;
        }

        public Criteria andBizOperationMidNotIn(List<Integer> values) {
            addCriterion("biz_operation_mid not in", values, "bizOperationMid");
            return (Criteria) this;
        }

        public Criteria andBizOperationMidBetween(Integer value1, Integer value2) {
            addCriterion("biz_operation_mid between", value1, value2, "bizOperationMid");
            return (Criteria) this;
        }

        public Criteria andBizOperationMidNotBetween(Integer value1, Integer value2) {
            addCriterion("biz_operation_mid not between", value1, value2, "bizOperationMid");
            return (Criteria) this;
        }

        public Criteria andPlatformPayIsNull() {
            addCriterion("platform_pay is null");
            return (Criteria) this;
        }

        public Criteria andPlatformPayIsNotNull() {
            addCriterion("platform_pay is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformPayEqualTo(BigDecimal value) {
            addCriterion("platform_pay =", value, "platformPay");
            return (Criteria) this;
        }

        public Criteria andPlatformPayNotEqualTo(BigDecimal value) {
            addCriterion("platform_pay <>", value, "platformPay");
            return (Criteria) this;
        }

        public Criteria andPlatformPayGreaterThan(BigDecimal value) {
            addCriterion("platform_pay >", value, "platformPay");
            return (Criteria) this;
        }

        public Criteria andPlatformPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("platform_pay >=", value, "platformPay");
            return (Criteria) this;
        }

        public Criteria andPlatformPayLessThan(BigDecimal value) {
            addCriterion("platform_pay <", value, "platformPay");
            return (Criteria) this;
        }

        public Criteria andPlatformPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("platform_pay <=", value, "platformPay");
            return (Criteria) this;
        }

        public Criteria andPlatformPayIn(List<BigDecimal> values) {
            addCriterion("platform_pay in", values, "platformPay");
            return (Criteria) this;
        }

        public Criteria andPlatformPayNotIn(List<BigDecimal> values) {
            addCriterion("platform_pay not in", values, "platformPay");
            return (Criteria) this;
        }

        public Criteria andPlatformPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platform_pay between", value1, value2, "platformPay");
            return (Criteria) this;
        }

        public Criteria andPlatformPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platform_pay not between", value1, value2, "platformPay");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_order表的实体类
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
     * sy_order 2017-10-18
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