package com.shanyuan.platform.ms.dao.project.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyProjectMoneyOrderExample {
    /**
     * sy_project_money_order
     */
    protected String orderByClause;

    /**
     * sy_project_money_order
     */
    protected boolean distinct;

    /**
     * sy_project_money_order
     */
    protected List<Criteria> oredCriteria;

    public SyProjectMoneyOrderExample() {
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
     * sy_project_money_order 2017-11-01
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

        public Criteria andPublicProjectIdIsNull() {
            addCriterion("public_project_id is null");
            return (Criteria) this;
        }

        public Criteria andPublicProjectIdIsNotNull() {
            addCriterion("public_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublicProjectIdEqualTo(Integer value) {
            addCriterion("public_project_id =", value, "publicProjectId");
            return (Criteria) this;
        }

        public Criteria andPublicProjectIdNotEqualTo(Integer value) {
            addCriterion("public_project_id <>", value, "publicProjectId");
            return (Criteria) this;
        }

        public Criteria andPublicProjectIdGreaterThan(Integer value) {
            addCriterion("public_project_id >", value, "publicProjectId");
            return (Criteria) this;
        }

        public Criteria andPublicProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("public_project_id >=", value, "publicProjectId");
            return (Criteria) this;
        }

        public Criteria andPublicProjectIdLessThan(Integer value) {
            addCriterion("public_project_id <", value, "publicProjectId");
            return (Criteria) this;
        }

        public Criteria andPublicProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("public_project_id <=", value, "publicProjectId");
            return (Criteria) this;
        }

        public Criteria andPublicProjectIdIn(List<Integer> values) {
            addCriterion("public_project_id in", values, "publicProjectId");
            return (Criteria) this;
        }

        public Criteria andPublicProjectIdNotIn(List<Integer> values) {
            addCriterion("public_project_id not in", values, "publicProjectId");
            return (Criteria) this;
        }

        public Criteria andPublicProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("public_project_id between", value1, value2, "publicProjectId");
            return (Criteria) this;
        }

        public Criteria andPublicProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("public_project_id not between", value1, value2, "publicProjectId");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectImageIsNull() {
            addCriterion("project_image is null");
            return (Criteria) this;
        }

        public Criteria andProjectImageIsNotNull() {
            addCriterion("project_image is not null");
            return (Criteria) this;
        }

        public Criteria andProjectImageEqualTo(String value) {
            addCriterion("project_image =", value, "projectImage");
            return (Criteria) this;
        }

        public Criteria andProjectImageNotEqualTo(String value) {
            addCriterion("project_image <>", value, "projectImage");
            return (Criteria) this;
        }

        public Criteria andProjectImageGreaterThan(String value) {
            addCriterion("project_image >", value, "projectImage");
            return (Criteria) this;
        }

        public Criteria andProjectImageGreaterThanOrEqualTo(String value) {
            addCriterion("project_image >=", value, "projectImage");
            return (Criteria) this;
        }

        public Criteria andProjectImageLessThan(String value) {
            addCriterion("project_image <", value, "projectImage");
            return (Criteria) this;
        }

        public Criteria andProjectImageLessThanOrEqualTo(String value) {
            addCriterion("project_image <=", value, "projectImage");
            return (Criteria) this;
        }

        public Criteria andProjectImageLike(String value) {
            addCriterion("project_image like", value, "projectImage");
            return (Criteria) this;
        }

        public Criteria andProjectImageNotLike(String value) {
            addCriterion("project_image not like", value, "projectImage");
            return (Criteria) this;
        }

        public Criteria andProjectImageIn(List<String> values) {
            addCriterion("project_image in", values, "projectImage");
            return (Criteria) this;
        }

        public Criteria andProjectImageNotIn(List<String> values) {
            addCriterion("project_image not in", values, "projectImage");
            return (Criteria) this;
        }

        public Criteria andProjectImageBetween(String value1, String value2) {
            addCriterion("project_image between", value1, value2, "projectImage");
            return (Criteria) this;
        }

        public Criteria andProjectImageNotBetween(String value1, String value2) {
            addCriterion("project_image not between", value1, value2, "projectImage");
            return (Criteria) this;
        }

        public Criteria andProjectSponsorIsNull() {
            addCriterion("project_sponsor is null");
            return (Criteria) this;
        }

        public Criteria andProjectSponsorIsNotNull() {
            addCriterion("project_sponsor is not null");
            return (Criteria) this;
        }

        public Criteria andProjectSponsorEqualTo(String value) {
            addCriterion("project_sponsor =", value, "projectSponsor");
            return (Criteria) this;
        }

        public Criteria andProjectSponsorNotEqualTo(String value) {
            addCriterion("project_sponsor <>", value, "projectSponsor");
            return (Criteria) this;
        }

        public Criteria andProjectSponsorGreaterThan(String value) {
            addCriterion("project_sponsor >", value, "projectSponsor");
            return (Criteria) this;
        }

        public Criteria andProjectSponsorGreaterThanOrEqualTo(String value) {
            addCriterion("project_sponsor >=", value, "projectSponsor");
            return (Criteria) this;
        }

        public Criteria andProjectSponsorLessThan(String value) {
            addCriterion("project_sponsor <", value, "projectSponsor");
            return (Criteria) this;
        }

        public Criteria andProjectSponsorLessThanOrEqualTo(String value) {
            addCriterion("project_sponsor <=", value, "projectSponsor");
            return (Criteria) this;
        }

        public Criteria andProjectSponsorLike(String value) {
            addCriterion("project_sponsor like", value, "projectSponsor");
            return (Criteria) this;
        }

        public Criteria andProjectSponsorNotLike(String value) {
            addCriterion("project_sponsor not like", value, "projectSponsor");
            return (Criteria) this;
        }

        public Criteria andProjectSponsorIn(List<String> values) {
            addCriterion("project_sponsor in", values, "projectSponsor");
            return (Criteria) this;
        }

        public Criteria andProjectSponsorNotIn(List<String> values) {
            addCriterion("project_sponsor not in", values, "projectSponsor");
            return (Criteria) this;
        }

        public Criteria andProjectSponsorBetween(String value1, String value2) {
            addCriterion("project_sponsor between", value1, value2, "projectSponsor");
            return (Criteria) this;
        }

        public Criteria andProjectSponsorNotBetween(String value1, String value2) {
            addCriterion("project_sponsor not between", value1, value2, "projectSponsor");
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

        public Criteria andIsanonymousIsNull() {
            addCriterion("isanonymous is null");
            return (Criteria) this;
        }

        public Criteria andIsanonymousIsNotNull() {
            addCriterion("isanonymous is not null");
            return (Criteria) this;
        }

        public Criteria andIsanonymousEqualTo(Byte value) {
            addCriterion("isanonymous =", value, "isanonymous");
            return (Criteria) this;
        }

        public Criteria andIsanonymousNotEqualTo(Byte value) {
            addCriterion("isanonymous <>", value, "isanonymous");
            return (Criteria) this;
        }

        public Criteria andIsanonymousGreaterThan(Byte value) {
            addCriterion("isanonymous >", value, "isanonymous");
            return (Criteria) this;
        }

        public Criteria andIsanonymousGreaterThanOrEqualTo(Byte value) {
            addCriterion("isanonymous >=", value, "isanonymous");
            return (Criteria) this;
        }

        public Criteria andIsanonymousLessThan(Byte value) {
            addCriterion("isanonymous <", value, "isanonymous");
            return (Criteria) this;
        }

        public Criteria andIsanonymousLessThanOrEqualTo(Byte value) {
            addCriterion("isanonymous <=", value, "isanonymous");
            return (Criteria) this;
        }

        public Criteria andIsanonymousIn(List<Byte> values) {
            addCriterion("isanonymous in", values, "isanonymous");
            return (Criteria) this;
        }

        public Criteria andIsanonymousNotIn(List<Byte> values) {
            addCriterion("isanonymous not in", values, "isanonymous");
            return (Criteria) this;
        }

        public Criteria andIsanonymousBetween(Byte value1, Byte value2) {
            addCriterion("isanonymous between", value1, value2, "isanonymous");
            return (Criteria) this;
        }

        public Criteria andIsanonymousNotBetween(Byte value1, Byte value2) {
            addCriterion("isanonymous not between", value1, value2, "isanonymous");
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
    }

    /**
     * 描述:sy_project_money_order表的实体类
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
     * sy_project_money_order 2017-11-01
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