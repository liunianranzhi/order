package com.shanyuan.platform.ms.dao.project.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyBazaarOrderExample {
    /**
     * sy_bazaar_order
     */
    protected String orderByClause;

    /**
     * sy_bazaar_order
     */
    protected boolean distinct;

    /**
     * sy_bazaar_order
     */
    protected List<Criteria> oredCriteria;

    public SyBazaarOrderExample() {
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
     * sy_bazaar_order 2017-11-01
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

        public Criteria andBazaarIdIsNull() {
            addCriterion("bazaar_id is null");
            return (Criteria) this;
        }

        public Criteria andBazaarIdIsNotNull() {
            addCriterion("bazaar_id is not null");
            return (Criteria) this;
        }

        public Criteria andBazaarIdEqualTo(Integer value) {
            addCriterion("bazaar_id =", value, "bazaarId");
            return (Criteria) this;
        }

        public Criteria andBazaarIdNotEqualTo(Integer value) {
            addCriterion("bazaar_id <>", value, "bazaarId");
            return (Criteria) this;
        }

        public Criteria andBazaarIdGreaterThan(Integer value) {
            addCriterion("bazaar_id >", value, "bazaarId");
            return (Criteria) this;
        }

        public Criteria andBazaarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bazaar_id >=", value, "bazaarId");
            return (Criteria) this;
        }

        public Criteria andBazaarIdLessThan(Integer value) {
            addCriterion("bazaar_id <", value, "bazaarId");
            return (Criteria) this;
        }

        public Criteria andBazaarIdLessThanOrEqualTo(Integer value) {
            addCriterion("bazaar_id <=", value, "bazaarId");
            return (Criteria) this;
        }

        public Criteria andBazaarIdIn(List<Integer> values) {
            addCriterion("bazaar_id in", values, "bazaarId");
            return (Criteria) this;
        }

        public Criteria andBazaarIdNotIn(List<Integer> values) {
            addCriterion("bazaar_id not in", values, "bazaarId");
            return (Criteria) this;
        }

        public Criteria andBazaarIdBetween(Integer value1, Integer value2) {
            addCriterion("bazaar_id between", value1, value2, "bazaarId");
            return (Criteria) this;
        }

        public Criteria andBazaarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bazaar_id not between", value1, value2, "bazaarId");
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
    }

    /**
     * 描述:sy_bazaar_order表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-11-01
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_bazaar_order 2017-11-01
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