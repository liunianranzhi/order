package com.shanyuan.platform.ms.dao.omorder.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OmOrderPaymentExample {
    /**
     * om_order_payment
     */
    protected String orderByClause;

    /**
     * om_order_payment
     */
    protected boolean distinct;

    /**
     * om_order_payment
     */
    protected List<Criteria> oredCriteria;

    public OmOrderPaymentExample() {
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
     * om_order_payment 2017-11-13
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

        public Criteria andPayIdIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(String value) {
            addCriterion("pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(String value) {
            addCriterion("pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(String value) {
            addCriterion("pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(String value) {
            addCriterion("pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(String value) {
            addCriterion("pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLike(String value) {
            addCriterion("pay_id like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotLike(String value) {
            addCriterion("pay_id not like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<String> values) {
            addCriterion("pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<String> values) {
            addCriterion("pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(String value1, String value2) {
            addCriterion("pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(String value1, String value2) {
            addCriterion("pay_id not between", value1, value2, "payId");
            return (Criteria) this;
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

        public Criteria andPayCenterIsNull() {
            addCriterion("pay_center is null");
            return (Criteria) this;
        }

        public Criteria andPayCenterIsNotNull() {
            addCriterion("pay_center is not null");
            return (Criteria) this;
        }

        public Criteria andPayCenterEqualTo(String value) {
            addCriterion("pay_center =", value, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterNotEqualTo(String value) {
            addCriterion("pay_center <>", value, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterGreaterThan(String value) {
            addCriterion("pay_center >", value, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterGreaterThanOrEqualTo(String value) {
            addCriterion("pay_center >=", value, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterLessThan(String value) {
            addCriterion("pay_center <", value, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterLessThanOrEqualTo(String value) {
            addCriterion("pay_center <=", value, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterLike(String value) {
            addCriterion("pay_center like", value, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterNotLike(String value) {
            addCriterion("pay_center not like", value, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterIn(List<String> values) {
            addCriterion("pay_center in", values, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterNotIn(List<String> values) {
            addCriterion("pay_center not in", values, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterBetween(String value1, String value2) {
            addCriterion("pay_center between", value1, value2, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterNotBetween(String value1, String value2) {
            addCriterion("pay_center not between", value1, value2, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Byte value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Byte value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Byte value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Byte value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Byte value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Byte> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Byte> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Byte value1, Byte value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayFeeIsNull() {
            addCriterion("pay_fee is null");
            return (Criteria) this;
        }

        public Criteria andPayFeeIsNotNull() {
            addCriterion("pay_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPayFeeEqualTo(Integer value) {
            addCriterion("pay_fee =", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotEqualTo(Integer value) {
            addCriterion("pay_fee <>", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeGreaterThan(Integer value) {
            addCriterion("pay_fee >", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_fee >=", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeLessThan(Integer value) {
            addCriterion("pay_fee <", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_fee <=", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeIn(List<Integer> values) {
            addCriterion("pay_fee in", values, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotIn(List<Integer> values) {
            addCriterion("pay_fee not in", values, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeBetween(Integer value1, Integer value2) {
            addCriterion("pay_fee between", value1, value2, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_fee not between", value1, value2, "payFee");
            return (Criteria) this;
        }

        public Criteria andOuttradeIdIsNull() {
            addCriterion("outtrade_id is null");
            return (Criteria) this;
        }

        public Criteria andOuttradeIdIsNotNull() {
            addCriterion("outtrade_id is not null");
            return (Criteria) this;
        }

        public Criteria andOuttradeIdEqualTo(String value) {
            addCriterion("outtrade_id =", value, "outtradeId");
            return (Criteria) this;
        }

        public Criteria andOuttradeIdNotEqualTo(String value) {
            addCriterion("outtrade_id <>", value, "outtradeId");
            return (Criteria) this;
        }

        public Criteria andOuttradeIdGreaterThan(String value) {
            addCriterion("outtrade_id >", value, "outtradeId");
            return (Criteria) this;
        }

        public Criteria andOuttradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("outtrade_id >=", value, "outtradeId");
            return (Criteria) this;
        }

        public Criteria andOuttradeIdLessThan(String value) {
            addCriterion("outtrade_id <", value, "outtradeId");
            return (Criteria) this;
        }

        public Criteria andOuttradeIdLessThanOrEqualTo(String value) {
            addCriterion("outtrade_id <=", value, "outtradeId");
            return (Criteria) this;
        }

        public Criteria andOuttradeIdLike(String value) {
            addCriterion("outtrade_id like", value, "outtradeId");
            return (Criteria) this;
        }

        public Criteria andOuttradeIdNotLike(String value) {
            addCriterion("outtrade_id not like", value, "outtradeId");
            return (Criteria) this;
        }

        public Criteria andOuttradeIdIn(List<String> values) {
            addCriterion("outtrade_id in", values, "outtradeId");
            return (Criteria) this;
        }

        public Criteria andOuttradeIdNotIn(List<String> values) {
            addCriterion("outtrade_id not in", values, "outtradeId");
            return (Criteria) this;
        }

        public Criteria andOuttradeIdBetween(String value1, String value2) {
            addCriterion("outtrade_id between", value1, value2, "outtradeId");
            return (Criteria) this;
        }

        public Criteria andOuttradeIdNotBetween(String value1, String value2) {
            addCriterion("outtrade_id not between", value1, value2, "outtradeId");
            return (Criteria) this;
        }

        public Criteria andPaySerialIsNull() {
            addCriterion("pay_serial is null");
            return (Criteria) this;
        }

        public Criteria andPaySerialIsNotNull() {
            addCriterion("pay_serial is not null");
            return (Criteria) this;
        }

        public Criteria andPaySerialEqualTo(String value) {
            addCriterion("pay_serial =", value, "paySerial");
            return (Criteria) this;
        }

        public Criteria andPaySerialNotEqualTo(String value) {
            addCriterion("pay_serial <>", value, "paySerial");
            return (Criteria) this;
        }

        public Criteria andPaySerialGreaterThan(String value) {
            addCriterion("pay_serial >", value, "paySerial");
            return (Criteria) this;
        }

        public Criteria andPaySerialGreaterThanOrEqualTo(String value) {
            addCriterion("pay_serial >=", value, "paySerial");
            return (Criteria) this;
        }

        public Criteria andPaySerialLessThan(String value) {
            addCriterion("pay_serial <", value, "paySerial");
            return (Criteria) this;
        }

        public Criteria andPaySerialLessThanOrEqualTo(String value) {
            addCriterion("pay_serial <=", value, "paySerial");
            return (Criteria) this;
        }

        public Criteria andPaySerialLike(String value) {
            addCriterion("pay_serial like", value, "paySerial");
            return (Criteria) this;
        }

        public Criteria andPaySerialNotLike(String value) {
            addCriterion("pay_serial not like", value, "paySerial");
            return (Criteria) this;
        }

        public Criteria andPaySerialIn(List<String> values) {
            addCriterion("pay_serial in", values, "paySerial");
            return (Criteria) this;
        }

        public Criteria andPaySerialNotIn(List<String> values) {
            addCriterion("pay_serial not in", values, "paySerial");
            return (Criteria) this;
        }

        public Criteria andPaySerialBetween(String value1, String value2) {
            addCriterion("pay_serial between", value1, value2, "paySerial");
            return (Criteria) this;
        }

        public Criteria andPaySerialNotBetween(String value1, String value2) {
            addCriterion("pay_serial not between", value1, value2, "paySerial");
            return (Criteria) this;
        }

        public Criteria andPayReqTimeIsNull() {
            addCriterion("pay_req_time is null");
            return (Criteria) this;
        }

        public Criteria andPayReqTimeIsNotNull() {
            addCriterion("pay_req_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayReqTimeEqualTo(Date value) {
            addCriterion("pay_req_time =", value, "payReqTime");
            return (Criteria) this;
        }

        public Criteria andPayReqTimeNotEqualTo(Date value) {
            addCriterion("pay_req_time <>", value, "payReqTime");
            return (Criteria) this;
        }

        public Criteria andPayReqTimeGreaterThan(Date value) {
            addCriterion("pay_req_time >", value, "payReqTime");
            return (Criteria) this;
        }

        public Criteria andPayReqTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_req_time >=", value, "payReqTime");
            return (Criteria) this;
        }

        public Criteria andPayReqTimeLessThan(Date value) {
            addCriterion("pay_req_time <", value, "payReqTime");
            return (Criteria) this;
        }

        public Criteria andPayReqTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_req_time <=", value, "payReqTime");
            return (Criteria) this;
        }

        public Criteria andPayReqTimeIn(List<Date> values) {
            addCriterion("pay_req_time in", values, "payReqTime");
            return (Criteria) this;
        }

        public Criteria andPayReqTimeNotIn(List<Date> values) {
            addCriterion("pay_req_time not in", values, "payReqTime");
            return (Criteria) this;
        }

        public Criteria andPayReqTimeBetween(Date value1, Date value2) {
            addCriterion("pay_req_time between", value1, value2, "payReqTime");
            return (Criteria) this;
        }

        public Criteria andPayReqTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_req_time not between", value1, value2, "payReqTime");
            return (Criteria) this;
        }

        public Criteria andPayReqMsgIsNull() {
            addCriterion("pay_req_msg is null");
            return (Criteria) this;
        }

        public Criteria andPayReqMsgIsNotNull() {
            addCriterion("pay_req_msg is not null");
            return (Criteria) this;
        }

        public Criteria andPayReqMsgEqualTo(String value) {
            addCriterion("pay_req_msg =", value, "payReqMsg");
            return (Criteria) this;
        }

        public Criteria andPayReqMsgNotEqualTo(String value) {
            addCriterion("pay_req_msg <>", value, "payReqMsg");
            return (Criteria) this;
        }

        public Criteria andPayReqMsgGreaterThan(String value) {
            addCriterion("pay_req_msg >", value, "payReqMsg");
            return (Criteria) this;
        }

        public Criteria andPayReqMsgGreaterThanOrEqualTo(String value) {
            addCriterion("pay_req_msg >=", value, "payReqMsg");
            return (Criteria) this;
        }

        public Criteria andPayReqMsgLessThan(String value) {
            addCriterion("pay_req_msg <", value, "payReqMsg");
            return (Criteria) this;
        }

        public Criteria andPayReqMsgLessThanOrEqualTo(String value) {
            addCriterion("pay_req_msg <=", value, "payReqMsg");
            return (Criteria) this;
        }

        public Criteria andPayReqMsgLike(String value) {
            addCriterion("pay_req_msg like", value, "payReqMsg");
            return (Criteria) this;
        }

        public Criteria andPayReqMsgNotLike(String value) {
            addCriterion("pay_req_msg not like", value, "payReqMsg");
            return (Criteria) this;
        }

        public Criteria andPayReqMsgIn(List<String> values) {
            addCriterion("pay_req_msg in", values, "payReqMsg");
            return (Criteria) this;
        }

        public Criteria andPayReqMsgNotIn(List<String> values) {
            addCriterion("pay_req_msg not in", values, "payReqMsg");
            return (Criteria) this;
        }

        public Criteria andPayReqMsgBetween(String value1, String value2) {
            addCriterion("pay_req_msg between", value1, value2, "payReqMsg");
            return (Criteria) this;
        }

        public Criteria andPayReqMsgNotBetween(String value1, String value2) {
            addCriterion("pay_req_msg not between", value1, value2, "payReqMsg");
            return (Criteria) this;
        }

        public Criteria andPayNotifyTimeIsNull() {
            addCriterion("pay_notify_time is null");
            return (Criteria) this;
        }

        public Criteria andPayNotifyTimeIsNotNull() {
            addCriterion("pay_notify_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayNotifyTimeEqualTo(Date value) {
            addCriterion("pay_notify_time =", value, "payNotifyTime");
            return (Criteria) this;
        }

        public Criteria andPayNotifyTimeNotEqualTo(Date value) {
            addCriterion("pay_notify_time <>", value, "payNotifyTime");
            return (Criteria) this;
        }

        public Criteria andPayNotifyTimeGreaterThan(Date value) {
            addCriterion("pay_notify_time >", value, "payNotifyTime");
            return (Criteria) this;
        }

        public Criteria andPayNotifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_notify_time >=", value, "payNotifyTime");
            return (Criteria) this;
        }

        public Criteria andPayNotifyTimeLessThan(Date value) {
            addCriterion("pay_notify_time <", value, "payNotifyTime");
            return (Criteria) this;
        }

        public Criteria andPayNotifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_notify_time <=", value, "payNotifyTime");
            return (Criteria) this;
        }

        public Criteria andPayNotifyTimeIn(List<Date> values) {
            addCriterion("pay_notify_time in", values, "payNotifyTime");
            return (Criteria) this;
        }

        public Criteria andPayNotifyTimeNotIn(List<Date> values) {
            addCriterion("pay_notify_time not in", values, "payNotifyTime");
            return (Criteria) this;
        }

        public Criteria andPayNotifyTimeBetween(Date value1, Date value2) {
            addCriterion("pay_notify_time between", value1, value2, "payNotifyTime");
            return (Criteria) this;
        }

        public Criteria andPayNotifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_notify_time not between", value1, value2, "payNotifyTime");
            return (Criteria) this;
        }

        public Criteria andPayNotifyMsgIsNull() {
            addCriterion("pay_notify_msg is null");
            return (Criteria) this;
        }

        public Criteria andPayNotifyMsgIsNotNull() {
            addCriterion("pay_notify_msg is not null");
            return (Criteria) this;
        }

        public Criteria andPayNotifyMsgEqualTo(String value) {
            addCriterion("pay_notify_msg =", value, "payNotifyMsg");
            return (Criteria) this;
        }

        public Criteria andPayNotifyMsgNotEqualTo(String value) {
            addCriterion("pay_notify_msg <>", value, "payNotifyMsg");
            return (Criteria) this;
        }

        public Criteria andPayNotifyMsgGreaterThan(String value) {
            addCriterion("pay_notify_msg >", value, "payNotifyMsg");
            return (Criteria) this;
        }

        public Criteria andPayNotifyMsgGreaterThanOrEqualTo(String value) {
            addCriterion("pay_notify_msg >=", value, "payNotifyMsg");
            return (Criteria) this;
        }

        public Criteria andPayNotifyMsgLessThan(String value) {
            addCriterion("pay_notify_msg <", value, "payNotifyMsg");
            return (Criteria) this;
        }

        public Criteria andPayNotifyMsgLessThanOrEqualTo(String value) {
            addCriterion("pay_notify_msg <=", value, "payNotifyMsg");
            return (Criteria) this;
        }

        public Criteria andPayNotifyMsgLike(String value) {
            addCriterion("pay_notify_msg like", value, "payNotifyMsg");
            return (Criteria) this;
        }

        public Criteria andPayNotifyMsgNotLike(String value) {
            addCriterion("pay_notify_msg not like", value, "payNotifyMsg");
            return (Criteria) this;
        }

        public Criteria andPayNotifyMsgIn(List<String> values) {
            addCriterion("pay_notify_msg in", values, "payNotifyMsg");
            return (Criteria) this;
        }

        public Criteria andPayNotifyMsgNotIn(List<String> values) {
            addCriterion("pay_notify_msg not in", values, "payNotifyMsg");
            return (Criteria) this;
        }

        public Criteria andPayNotifyMsgBetween(String value1, String value2) {
            addCriterion("pay_notify_msg between", value1, value2, "payNotifyMsg");
            return (Criteria) this;
        }

        public Criteria andPayNotifyMsgNotBetween(String value1, String value2) {
            addCriterion("pay_notify_msg not between", value1, value2, "payNotifyMsg");
            return (Criteria) this;
        }

        public Criteria andPayCheckIsNull() {
            addCriterion("pay_check is null");
            return (Criteria) this;
        }

        public Criteria andPayCheckIsNotNull() {
            addCriterion("pay_check is not null");
            return (Criteria) this;
        }

        public Criteria andPayCheckEqualTo(Byte value) {
            addCriterion("pay_check =", value, "payCheck");
            return (Criteria) this;
        }

        public Criteria andPayCheckNotEqualTo(Byte value) {
            addCriterion("pay_check <>", value, "payCheck");
            return (Criteria) this;
        }

        public Criteria andPayCheckGreaterThan(Byte value) {
            addCriterion("pay_check >", value, "payCheck");
            return (Criteria) this;
        }

        public Criteria andPayCheckGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_check >=", value, "payCheck");
            return (Criteria) this;
        }

        public Criteria andPayCheckLessThan(Byte value) {
            addCriterion("pay_check <", value, "payCheck");
            return (Criteria) this;
        }

        public Criteria andPayCheckLessThanOrEqualTo(Byte value) {
            addCriterion("pay_check <=", value, "payCheck");
            return (Criteria) this;
        }

        public Criteria andPayCheckIn(List<Byte> values) {
            addCriterion("pay_check in", values, "payCheck");
            return (Criteria) this;
        }

        public Criteria andPayCheckNotIn(List<Byte> values) {
            addCriterion("pay_check not in", values, "payCheck");
            return (Criteria) this;
        }

        public Criteria andPayCheckBetween(Byte value1, Byte value2) {
            addCriterion("pay_check between", value1, value2, "payCheck");
            return (Criteria) this;
        }

        public Criteria andPayCheckNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_check not between", value1, value2, "payCheck");
            return (Criteria) this;
        }

        public Criteria andRefundSerialIsNull() {
            addCriterion("refund_serial is null");
            return (Criteria) this;
        }

        public Criteria andRefundSerialIsNotNull() {
            addCriterion("refund_serial is not null");
            return (Criteria) this;
        }

        public Criteria andRefundSerialEqualTo(String value) {
            addCriterion("refund_serial =", value, "refundSerial");
            return (Criteria) this;
        }

        public Criteria andRefundSerialNotEqualTo(String value) {
            addCriterion("refund_serial <>", value, "refundSerial");
            return (Criteria) this;
        }

        public Criteria andRefundSerialGreaterThan(String value) {
            addCriterion("refund_serial >", value, "refundSerial");
            return (Criteria) this;
        }

        public Criteria andRefundSerialGreaterThanOrEqualTo(String value) {
            addCriterion("refund_serial >=", value, "refundSerial");
            return (Criteria) this;
        }

        public Criteria andRefundSerialLessThan(String value) {
            addCriterion("refund_serial <", value, "refundSerial");
            return (Criteria) this;
        }

        public Criteria andRefundSerialLessThanOrEqualTo(String value) {
            addCriterion("refund_serial <=", value, "refundSerial");
            return (Criteria) this;
        }

        public Criteria andRefundSerialLike(String value) {
            addCriterion("refund_serial like", value, "refundSerial");
            return (Criteria) this;
        }

        public Criteria andRefundSerialNotLike(String value) {
            addCriterion("refund_serial not like", value, "refundSerial");
            return (Criteria) this;
        }

        public Criteria andRefundSerialIn(List<String> values) {
            addCriterion("refund_serial in", values, "refundSerial");
            return (Criteria) this;
        }

        public Criteria andRefundSerialNotIn(List<String> values) {
            addCriterion("refund_serial not in", values, "refundSerial");
            return (Criteria) this;
        }

        public Criteria andRefundSerialBetween(String value1, String value2) {
            addCriterion("refund_serial between", value1, value2, "refundSerial");
            return (Criteria) this;
        }

        public Criteria andRefundSerialNotBetween(String value1, String value2) {
            addCriterion("refund_serial not between", value1, value2, "refundSerial");
            return (Criteria) this;
        }

        public Criteria andRefundReqTimeIsNull() {
            addCriterion("refund_req_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundReqTimeIsNotNull() {
            addCriterion("refund_req_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundReqTimeEqualTo(Date value) {
            addCriterion("refund_req_time =", value, "refundReqTime");
            return (Criteria) this;
        }

        public Criteria andRefundReqTimeNotEqualTo(Date value) {
            addCriterion("refund_req_time <>", value, "refundReqTime");
            return (Criteria) this;
        }

        public Criteria andRefundReqTimeGreaterThan(Date value) {
            addCriterion("refund_req_time >", value, "refundReqTime");
            return (Criteria) this;
        }

        public Criteria andRefundReqTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_req_time >=", value, "refundReqTime");
            return (Criteria) this;
        }

        public Criteria andRefundReqTimeLessThan(Date value) {
            addCriterion("refund_req_time <", value, "refundReqTime");
            return (Criteria) this;
        }

        public Criteria andRefundReqTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_req_time <=", value, "refundReqTime");
            return (Criteria) this;
        }

        public Criteria andRefundReqTimeIn(List<Date> values) {
            addCriterion("refund_req_time in", values, "refundReqTime");
            return (Criteria) this;
        }

        public Criteria andRefundReqTimeNotIn(List<Date> values) {
            addCriterion("refund_req_time not in", values, "refundReqTime");
            return (Criteria) this;
        }

        public Criteria andRefundReqTimeBetween(Date value1, Date value2) {
            addCriterion("refund_req_time between", value1, value2, "refundReqTime");
            return (Criteria) this;
        }

        public Criteria andRefundReqTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_req_time not between", value1, value2, "refundReqTime");
            return (Criteria) this;
        }

        public Criteria andRefundReqMsgIsNull() {
            addCriterion("refund_req_msg is null");
            return (Criteria) this;
        }

        public Criteria andRefundReqMsgIsNotNull() {
            addCriterion("refund_req_msg is not null");
            return (Criteria) this;
        }

        public Criteria andRefundReqMsgEqualTo(String value) {
            addCriterion("refund_req_msg =", value, "refundReqMsg");
            return (Criteria) this;
        }

        public Criteria andRefundReqMsgNotEqualTo(String value) {
            addCriterion("refund_req_msg <>", value, "refundReqMsg");
            return (Criteria) this;
        }

        public Criteria andRefundReqMsgGreaterThan(String value) {
            addCriterion("refund_req_msg >", value, "refundReqMsg");
            return (Criteria) this;
        }

        public Criteria andRefundReqMsgGreaterThanOrEqualTo(String value) {
            addCriterion("refund_req_msg >=", value, "refundReqMsg");
            return (Criteria) this;
        }

        public Criteria andRefundReqMsgLessThan(String value) {
            addCriterion("refund_req_msg <", value, "refundReqMsg");
            return (Criteria) this;
        }

        public Criteria andRefundReqMsgLessThanOrEqualTo(String value) {
            addCriterion("refund_req_msg <=", value, "refundReqMsg");
            return (Criteria) this;
        }

        public Criteria andRefundReqMsgLike(String value) {
            addCriterion("refund_req_msg like", value, "refundReqMsg");
            return (Criteria) this;
        }

        public Criteria andRefundReqMsgNotLike(String value) {
            addCriterion("refund_req_msg not like", value, "refundReqMsg");
            return (Criteria) this;
        }

        public Criteria andRefundReqMsgIn(List<String> values) {
            addCriterion("refund_req_msg in", values, "refundReqMsg");
            return (Criteria) this;
        }

        public Criteria andRefundReqMsgNotIn(List<String> values) {
            addCriterion("refund_req_msg not in", values, "refundReqMsg");
            return (Criteria) this;
        }

        public Criteria andRefundReqMsgBetween(String value1, String value2) {
            addCriterion("refund_req_msg between", value1, value2, "refundReqMsg");
            return (Criteria) this;
        }

        public Criteria andRefundReqMsgNotBetween(String value1, String value2) {
            addCriterion("refund_req_msg not between", value1, value2, "refundReqMsg");
            return (Criteria) this;
        }

        public Criteria andRefundRespTimeIsNull() {
            addCriterion("refund_resp_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundRespTimeIsNotNull() {
            addCriterion("refund_resp_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundRespTimeEqualTo(Date value) {
            addCriterion("refund_resp_time =", value, "refundRespTime");
            return (Criteria) this;
        }

        public Criteria andRefundRespTimeNotEqualTo(Date value) {
            addCriterion("refund_resp_time <>", value, "refundRespTime");
            return (Criteria) this;
        }

        public Criteria andRefundRespTimeGreaterThan(Date value) {
            addCriterion("refund_resp_time >", value, "refundRespTime");
            return (Criteria) this;
        }

        public Criteria andRefundRespTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_resp_time >=", value, "refundRespTime");
            return (Criteria) this;
        }

        public Criteria andRefundRespTimeLessThan(Date value) {
            addCriterion("refund_resp_time <", value, "refundRespTime");
            return (Criteria) this;
        }

        public Criteria andRefundRespTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_resp_time <=", value, "refundRespTime");
            return (Criteria) this;
        }

        public Criteria andRefundRespTimeIn(List<Date> values) {
            addCriterion("refund_resp_time in", values, "refundRespTime");
            return (Criteria) this;
        }

        public Criteria andRefundRespTimeNotIn(List<Date> values) {
            addCriterion("refund_resp_time not in", values, "refundRespTime");
            return (Criteria) this;
        }

        public Criteria andRefundRespTimeBetween(Date value1, Date value2) {
            addCriterion("refund_resp_time between", value1, value2, "refundRespTime");
            return (Criteria) this;
        }

        public Criteria andRefundRespTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_resp_time not between", value1, value2, "refundRespTime");
            return (Criteria) this;
        }

        public Criteria andRefundRespMsgIsNull() {
            addCriterion("refund_resp_msg is null");
            return (Criteria) this;
        }

        public Criteria andRefundRespMsgIsNotNull() {
            addCriterion("refund_resp_msg is not null");
            return (Criteria) this;
        }

        public Criteria andRefundRespMsgEqualTo(String value) {
            addCriterion("refund_resp_msg =", value, "refundRespMsg");
            return (Criteria) this;
        }

        public Criteria andRefundRespMsgNotEqualTo(String value) {
            addCriterion("refund_resp_msg <>", value, "refundRespMsg");
            return (Criteria) this;
        }

        public Criteria andRefundRespMsgGreaterThan(String value) {
            addCriterion("refund_resp_msg >", value, "refundRespMsg");
            return (Criteria) this;
        }

        public Criteria andRefundRespMsgGreaterThanOrEqualTo(String value) {
            addCriterion("refund_resp_msg >=", value, "refundRespMsg");
            return (Criteria) this;
        }

        public Criteria andRefundRespMsgLessThan(String value) {
            addCriterion("refund_resp_msg <", value, "refundRespMsg");
            return (Criteria) this;
        }

        public Criteria andRefundRespMsgLessThanOrEqualTo(String value) {
            addCriterion("refund_resp_msg <=", value, "refundRespMsg");
            return (Criteria) this;
        }

        public Criteria andRefundRespMsgLike(String value) {
            addCriterion("refund_resp_msg like", value, "refundRespMsg");
            return (Criteria) this;
        }

        public Criteria andRefundRespMsgNotLike(String value) {
            addCriterion("refund_resp_msg not like", value, "refundRespMsg");
            return (Criteria) this;
        }

        public Criteria andRefundRespMsgIn(List<String> values) {
            addCriterion("refund_resp_msg in", values, "refundRespMsg");
            return (Criteria) this;
        }

        public Criteria andRefundRespMsgNotIn(List<String> values) {
            addCriterion("refund_resp_msg not in", values, "refundRespMsg");
            return (Criteria) this;
        }

        public Criteria andRefundRespMsgBetween(String value1, String value2) {
            addCriterion("refund_resp_msg between", value1, value2, "refundRespMsg");
            return (Criteria) this;
        }

        public Criteria andRefundRespMsgNotBetween(String value1, String value2) {
            addCriterion("refund_resp_msg not between", value1, value2, "refundRespMsg");
            return (Criteria) this;
        }

        public Criteria andRefundCheckIsNull() {
            addCriterion("refund_check is null");
            return (Criteria) this;
        }

        public Criteria andRefundCheckIsNotNull() {
            addCriterion("refund_check is not null");
            return (Criteria) this;
        }

        public Criteria andRefundCheckEqualTo(Byte value) {
            addCriterion("refund_check =", value, "refundCheck");
            return (Criteria) this;
        }

        public Criteria andRefundCheckNotEqualTo(Byte value) {
            addCriterion("refund_check <>", value, "refundCheck");
            return (Criteria) this;
        }

        public Criteria andRefundCheckGreaterThan(Byte value) {
            addCriterion("refund_check >", value, "refundCheck");
            return (Criteria) this;
        }

        public Criteria andRefundCheckGreaterThanOrEqualTo(Byte value) {
            addCriterion("refund_check >=", value, "refundCheck");
            return (Criteria) this;
        }

        public Criteria andRefundCheckLessThan(Byte value) {
            addCriterion("refund_check <", value, "refundCheck");
            return (Criteria) this;
        }

        public Criteria andRefundCheckLessThanOrEqualTo(Byte value) {
            addCriterion("refund_check <=", value, "refundCheck");
            return (Criteria) this;
        }

        public Criteria andRefundCheckIn(List<Byte> values) {
            addCriterion("refund_check in", values, "refundCheck");
            return (Criteria) this;
        }

        public Criteria andRefundCheckNotIn(List<Byte> values) {
            addCriterion("refund_check not in", values, "refundCheck");
            return (Criteria) this;
        }

        public Criteria andRefundCheckBetween(Byte value1, Byte value2) {
            addCriterion("refund_check between", value1, value2, "refundCheck");
            return (Criteria) this;
        }

        public Criteria andRefundCheckNotBetween(Byte value1, Byte value2) {
            addCriterion("refund_check not between", value1, value2, "refundCheck");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * 描述:om_order_payment表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-11-13
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * om_order_payment 2017-11-13
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