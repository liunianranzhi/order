package com.shanyuan.platform.ms.dao.user.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyPointsOrderExample {
    /**
     * sy_points_order
     */
    protected String orderByClause;

    /**
     * sy_points_order
     */
    protected boolean distinct;

    /**
     * sy_points_order
     */
    protected List<Criteria> oredCriteria;

    public SyPointsOrderExample() {
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
     * sy_points_order 2017-10-17
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

        public Criteria andPointOrderidIsNull() {
            addCriterion("point_orderid is null");
            return (Criteria) this;
        }

        public Criteria andPointOrderidIsNotNull() {
            addCriterion("point_orderid is not null");
            return (Criteria) this;
        }

        public Criteria andPointOrderidEqualTo(Integer value) {
            addCriterion("point_orderid =", value, "pointOrderid");
            return (Criteria) this;
        }

        public Criteria andPointOrderidNotEqualTo(Integer value) {
            addCriterion("point_orderid <>", value, "pointOrderid");
            return (Criteria) this;
        }

        public Criteria andPointOrderidGreaterThan(Integer value) {
            addCriterion("point_orderid >", value, "pointOrderid");
            return (Criteria) this;
        }

        public Criteria andPointOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_orderid >=", value, "pointOrderid");
            return (Criteria) this;
        }

        public Criteria andPointOrderidLessThan(Integer value) {
            addCriterion("point_orderid <", value, "pointOrderid");
            return (Criteria) this;
        }

        public Criteria andPointOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("point_orderid <=", value, "pointOrderid");
            return (Criteria) this;
        }

        public Criteria andPointOrderidIn(List<Integer> values) {
            addCriterion("point_orderid in", values, "pointOrderid");
            return (Criteria) this;
        }

        public Criteria andPointOrderidNotIn(List<Integer> values) {
            addCriterion("point_orderid not in", values, "pointOrderid");
            return (Criteria) this;
        }

        public Criteria andPointOrderidBetween(Integer value1, Integer value2) {
            addCriterion("point_orderid between", value1, value2, "pointOrderid");
            return (Criteria) this;
        }

        public Criteria andPointOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("point_orderid not between", value1, value2, "pointOrderid");
            return (Criteria) this;
        }

        public Criteria andPointOrdersnIsNull() {
            addCriterion("point_ordersn is null");
            return (Criteria) this;
        }

        public Criteria andPointOrdersnIsNotNull() {
            addCriterion("point_ordersn is not null");
            return (Criteria) this;
        }

        public Criteria andPointOrdersnEqualTo(String value) {
            addCriterion("point_ordersn =", value, "pointOrdersn");
            return (Criteria) this;
        }

        public Criteria andPointOrdersnNotEqualTo(String value) {
            addCriterion("point_ordersn <>", value, "pointOrdersn");
            return (Criteria) this;
        }

        public Criteria andPointOrdersnGreaterThan(String value) {
            addCriterion("point_ordersn >", value, "pointOrdersn");
            return (Criteria) this;
        }

        public Criteria andPointOrdersnGreaterThanOrEqualTo(String value) {
            addCriterion("point_ordersn >=", value, "pointOrdersn");
            return (Criteria) this;
        }

        public Criteria andPointOrdersnLessThan(String value) {
            addCriterion("point_ordersn <", value, "pointOrdersn");
            return (Criteria) this;
        }

        public Criteria andPointOrdersnLessThanOrEqualTo(String value) {
            addCriterion("point_ordersn <=", value, "pointOrdersn");
            return (Criteria) this;
        }

        public Criteria andPointOrdersnLike(String value) {
            addCriterion("point_ordersn like", value, "pointOrdersn");
            return (Criteria) this;
        }

        public Criteria andPointOrdersnNotLike(String value) {
            addCriterion("point_ordersn not like", value, "pointOrdersn");
            return (Criteria) this;
        }

        public Criteria andPointOrdersnIn(List<String> values) {
            addCriterion("point_ordersn in", values, "pointOrdersn");
            return (Criteria) this;
        }

        public Criteria andPointOrdersnNotIn(List<String> values) {
            addCriterion("point_ordersn not in", values, "pointOrdersn");
            return (Criteria) this;
        }

        public Criteria andPointOrdersnBetween(String value1, String value2) {
            addCriterion("point_ordersn between", value1, value2, "pointOrdersn");
            return (Criteria) this;
        }

        public Criteria andPointOrdersnNotBetween(String value1, String value2) {
            addCriterion("point_ordersn not between", value1, value2, "pointOrdersn");
            return (Criteria) this;
        }

        public Criteria andPointBuyeridIsNull() {
            addCriterion("point_buyerid is null");
            return (Criteria) this;
        }

        public Criteria andPointBuyeridIsNotNull() {
            addCriterion("point_buyerid is not null");
            return (Criteria) this;
        }

        public Criteria andPointBuyeridEqualTo(Integer value) {
            addCriterion("point_buyerid =", value, "pointBuyerid");
            return (Criteria) this;
        }

        public Criteria andPointBuyeridNotEqualTo(Integer value) {
            addCriterion("point_buyerid <>", value, "pointBuyerid");
            return (Criteria) this;
        }

        public Criteria andPointBuyeridGreaterThan(Integer value) {
            addCriterion("point_buyerid >", value, "pointBuyerid");
            return (Criteria) this;
        }

        public Criteria andPointBuyeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_buyerid >=", value, "pointBuyerid");
            return (Criteria) this;
        }

        public Criteria andPointBuyeridLessThan(Integer value) {
            addCriterion("point_buyerid <", value, "pointBuyerid");
            return (Criteria) this;
        }

        public Criteria andPointBuyeridLessThanOrEqualTo(Integer value) {
            addCriterion("point_buyerid <=", value, "pointBuyerid");
            return (Criteria) this;
        }

        public Criteria andPointBuyeridIn(List<Integer> values) {
            addCriterion("point_buyerid in", values, "pointBuyerid");
            return (Criteria) this;
        }

        public Criteria andPointBuyeridNotIn(List<Integer> values) {
            addCriterion("point_buyerid not in", values, "pointBuyerid");
            return (Criteria) this;
        }

        public Criteria andPointBuyeridBetween(Integer value1, Integer value2) {
            addCriterion("point_buyerid between", value1, value2, "pointBuyerid");
            return (Criteria) this;
        }

        public Criteria andPointBuyeridNotBetween(Integer value1, Integer value2) {
            addCriterion("point_buyerid not between", value1, value2, "pointBuyerid");
            return (Criteria) this;
        }

        public Criteria andPointBuyernameIsNull() {
            addCriterion("point_buyername is null");
            return (Criteria) this;
        }

        public Criteria andPointBuyernameIsNotNull() {
            addCriterion("point_buyername is not null");
            return (Criteria) this;
        }

        public Criteria andPointBuyernameEqualTo(String value) {
            addCriterion("point_buyername =", value, "pointBuyername");
            return (Criteria) this;
        }

        public Criteria andPointBuyernameNotEqualTo(String value) {
            addCriterion("point_buyername <>", value, "pointBuyername");
            return (Criteria) this;
        }

        public Criteria andPointBuyernameGreaterThan(String value) {
            addCriterion("point_buyername >", value, "pointBuyername");
            return (Criteria) this;
        }

        public Criteria andPointBuyernameGreaterThanOrEqualTo(String value) {
            addCriterion("point_buyername >=", value, "pointBuyername");
            return (Criteria) this;
        }

        public Criteria andPointBuyernameLessThan(String value) {
            addCriterion("point_buyername <", value, "pointBuyername");
            return (Criteria) this;
        }

        public Criteria andPointBuyernameLessThanOrEqualTo(String value) {
            addCriterion("point_buyername <=", value, "pointBuyername");
            return (Criteria) this;
        }

        public Criteria andPointBuyernameLike(String value) {
            addCriterion("point_buyername like", value, "pointBuyername");
            return (Criteria) this;
        }

        public Criteria andPointBuyernameNotLike(String value) {
            addCriterion("point_buyername not like", value, "pointBuyername");
            return (Criteria) this;
        }

        public Criteria andPointBuyernameIn(List<String> values) {
            addCriterion("point_buyername in", values, "pointBuyername");
            return (Criteria) this;
        }

        public Criteria andPointBuyernameNotIn(List<String> values) {
            addCriterion("point_buyername not in", values, "pointBuyername");
            return (Criteria) this;
        }

        public Criteria andPointBuyernameBetween(String value1, String value2) {
            addCriterion("point_buyername between", value1, value2, "pointBuyername");
            return (Criteria) this;
        }

        public Criteria andPointBuyernameNotBetween(String value1, String value2) {
            addCriterion("point_buyername not between", value1, value2, "pointBuyername");
            return (Criteria) this;
        }

        public Criteria andPointBuyeremailIsNull() {
            addCriterion("point_buyeremail is null");
            return (Criteria) this;
        }

        public Criteria andPointBuyeremailIsNotNull() {
            addCriterion("point_buyeremail is not null");
            return (Criteria) this;
        }

        public Criteria andPointBuyeremailEqualTo(String value) {
            addCriterion("point_buyeremail =", value, "pointBuyeremail");
            return (Criteria) this;
        }

        public Criteria andPointBuyeremailNotEqualTo(String value) {
            addCriterion("point_buyeremail <>", value, "pointBuyeremail");
            return (Criteria) this;
        }

        public Criteria andPointBuyeremailGreaterThan(String value) {
            addCriterion("point_buyeremail >", value, "pointBuyeremail");
            return (Criteria) this;
        }

        public Criteria andPointBuyeremailGreaterThanOrEqualTo(String value) {
            addCriterion("point_buyeremail >=", value, "pointBuyeremail");
            return (Criteria) this;
        }

        public Criteria andPointBuyeremailLessThan(String value) {
            addCriterion("point_buyeremail <", value, "pointBuyeremail");
            return (Criteria) this;
        }

        public Criteria andPointBuyeremailLessThanOrEqualTo(String value) {
            addCriterion("point_buyeremail <=", value, "pointBuyeremail");
            return (Criteria) this;
        }

        public Criteria andPointBuyeremailLike(String value) {
            addCriterion("point_buyeremail like", value, "pointBuyeremail");
            return (Criteria) this;
        }

        public Criteria andPointBuyeremailNotLike(String value) {
            addCriterion("point_buyeremail not like", value, "pointBuyeremail");
            return (Criteria) this;
        }

        public Criteria andPointBuyeremailIn(List<String> values) {
            addCriterion("point_buyeremail in", values, "pointBuyeremail");
            return (Criteria) this;
        }

        public Criteria andPointBuyeremailNotIn(List<String> values) {
            addCriterion("point_buyeremail not in", values, "pointBuyeremail");
            return (Criteria) this;
        }

        public Criteria andPointBuyeremailBetween(String value1, String value2) {
            addCriterion("point_buyeremail between", value1, value2, "pointBuyeremail");
            return (Criteria) this;
        }

        public Criteria andPointBuyeremailNotBetween(String value1, String value2) {
            addCriterion("point_buyeremail not between", value1, value2, "pointBuyeremail");
            return (Criteria) this;
        }

        public Criteria andPointAddtimeIsNull() {
            addCriterion("point_addtime is null");
            return (Criteria) this;
        }

        public Criteria andPointAddtimeIsNotNull() {
            addCriterion("point_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andPointAddtimeEqualTo(Integer value) {
            addCriterion("point_addtime =", value, "pointAddtime");
            return (Criteria) this;
        }

        public Criteria andPointAddtimeNotEqualTo(Integer value) {
            addCriterion("point_addtime <>", value, "pointAddtime");
            return (Criteria) this;
        }

        public Criteria andPointAddtimeGreaterThan(Integer value) {
            addCriterion("point_addtime >", value, "pointAddtime");
            return (Criteria) this;
        }

        public Criteria andPointAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_addtime >=", value, "pointAddtime");
            return (Criteria) this;
        }

        public Criteria andPointAddtimeLessThan(Integer value) {
            addCriterion("point_addtime <", value, "pointAddtime");
            return (Criteria) this;
        }

        public Criteria andPointAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("point_addtime <=", value, "pointAddtime");
            return (Criteria) this;
        }

        public Criteria andPointAddtimeIn(List<Integer> values) {
            addCriterion("point_addtime in", values, "pointAddtime");
            return (Criteria) this;
        }

        public Criteria andPointAddtimeNotIn(List<Integer> values) {
            addCriterion("point_addtime not in", values, "pointAddtime");
            return (Criteria) this;
        }

        public Criteria andPointAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("point_addtime between", value1, value2, "pointAddtime");
            return (Criteria) this;
        }

        public Criteria andPointAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("point_addtime not between", value1, value2, "pointAddtime");
            return (Criteria) this;
        }

        public Criteria andPointPaymentidIsNull() {
            addCriterion("point_paymentid is null");
            return (Criteria) this;
        }

        public Criteria andPointPaymentidIsNotNull() {
            addCriterion("point_paymentid is not null");
            return (Criteria) this;
        }

        public Criteria andPointPaymentidEqualTo(Integer value) {
            addCriterion("point_paymentid =", value, "pointPaymentid");
            return (Criteria) this;
        }

        public Criteria andPointPaymentidNotEqualTo(Integer value) {
            addCriterion("point_paymentid <>", value, "pointPaymentid");
            return (Criteria) this;
        }

        public Criteria andPointPaymentidGreaterThan(Integer value) {
            addCriterion("point_paymentid >", value, "pointPaymentid");
            return (Criteria) this;
        }

        public Criteria andPointPaymentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_paymentid >=", value, "pointPaymentid");
            return (Criteria) this;
        }

        public Criteria andPointPaymentidLessThan(Integer value) {
            addCriterion("point_paymentid <", value, "pointPaymentid");
            return (Criteria) this;
        }

        public Criteria andPointPaymentidLessThanOrEqualTo(Integer value) {
            addCriterion("point_paymentid <=", value, "pointPaymentid");
            return (Criteria) this;
        }

        public Criteria andPointPaymentidIn(List<Integer> values) {
            addCriterion("point_paymentid in", values, "pointPaymentid");
            return (Criteria) this;
        }

        public Criteria andPointPaymentidNotIn(List<Integer> values) {
            addCriterion("point_paymentid not in", values, "pointPaymentid");
            return (Criteria) this;
        }

        public Criteria andPointPaymentidBetween(Integer value1, Integer value2) {
            addCriterion("point_paymentid between", value1, value2, "pointPaymentid");
            return (Criteria) this;
        }

        public Criteria andPointPaymentidNotBetween(Integer value1, Integer value2) {
            addCriterion("point_paymentid not between", value1, value2, "pointPaymentid");
            return (Criteria) this;
        }

        public Criteria andPointPaymentnameIsNull() {
            addCriterion("point_paymentname is null");
            return (Criteria) this;
        }

        public Criteria andPointPaymentnameIsNotNull() {
            addCriterion("point_paymentname is not null");
            return (Criteria) this;
        }

        public Criteria andPointPaymentnameEqualTo(String value) {
            addCriterion("point_paymentname =", value, "pointPaymentname");
            return (Criteria) this;
        }

        public Criteria andPointPaymentnameNotEqualTo(String value) {
            addCriterion("point_paymentname <>", value, "pointPaymentname");
            return (Criteria) this;
        }

        public Criteria andPointPaymentnameGreaterThan(String value) {
            addCriterion("point_paymentname >", value, "pointPaymentname");
            return (Criteria) this;
        }

        public Criteria andPointPaymentnameGreaterThanOrEqualTo(String value) {
            addCriterion("point_paymentname >=", value, "pointPaymentname");
            return (Criteria) this;
        }

        public Criteria andPointPaymentnameLessThan(String value) {
            addCriterion("point_paymentname <", value, "pointPaymentname");
            return (Criteria) this;
        }

        public Criteria andPointPaymentnameLessThanOrEqualTo(String value) {
            addCriterion("point_paymentname <=", value, "pointPaymentname");
            return (Criteria) this;
        }

        public Criteria andPointPaymentnameLike(String value) {
            addCriterion("point_paymentname like", value, "pointPaymentname");
            return (Criteria) this;
        }

        public Criteria andPointPaymentnameNotLike(String value) {
            addCriterion("point_paymentname not like", value, "pointPaymentname");
            return (Criteria) this;
        }

        public Criteria andPointPaymentnameIn(List<String> values) {
            addCriterion("point_paymentname in", values, "pointPaymentname");
            return (Criteria) this;
        }

        public Criteria andPointPaymentnameNotIn(List<String> values) {
            addCriterion("point_paymentname not in", values, "pointPaymentname");
            return (Criteria) this;
        }

        public Criteria andPointPaymentnameBetween(String value1, String value2) {
            addCriterion("point_paymentname between", value1, value2, "pointPaymentname");
            return (Criteria) this;
        }

        public Criteria andPointPaymentnameNotBetween(String value1, String value2) {
            addCriterion("point_paymentname not between", value1, value2, "pointPaymentname");
            return (Criteria) this;
        }

        public Criteria andPointPaymentcodeIsNull() {
            addCriterion("point_paymentcode is null");
            return (Criteria) this;
        }

        public Criteria andPointPaymentcodeIsNotNull() {
            addCriterion("point_paymentcode is not null");
            return (Criteria) this;
        }

        public Criteria andPointPaymentcodeEqualTo(String value) {
            addCriterion("point_paymentcode =", value, "pointPaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointPaymentcodeNotEqualTo(String value) {
            addCriterion("point_paymentcode <>", value, "pointPaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointPaymentcodeGreaterThan(String value) {
            addCriterion("point_paymentcode >", value, "pointPaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointPaymentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("point_paymentcode >=", value, "pointPaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointPaymentcodeLessThan(String value) {
            addCriterion("point_paymentcode <", value, "pointPaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointPaymentcodeLessThanOrEqualTo(String value) {
            addCriterion("point_paymentcode <=", value, "pointPaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointPaymentcodeLike(String value) {
            addCriterion("point_paymentcode like", value, "pointPaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointPaymentcodeNotLike(String value) {
            addCriterion("point_paymentcode not like", value, "pointPaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointPaymentcodeIn(List<String> values) {
            addCriterion("point_paymentcode in", values, "pointPaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointPaymentcodeNotIn(List<String> values) {
            addCriterion("point_paymentcode not in", values, "pointPaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointPaymentcodeBetween(String value1, String value2) {
            addCriterion("point_paymentcode between", value1, value2, "pointPaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointPaymentcodeNotBetween(String value1, String value2) {
            addCriterion("point_paymentcode not between", value1, value2, "pointPaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointPaymentdirectIsNull() {
            addCriterion("point_paymentdirect is null");
            return (Criteria) this;
        }

        public Criteria andPointPaymentdirectIsNotNull() {
            addCriterion("point_paymentdirect is not null");
            return (Criteria) this;
        }

        public Criteria andPointPaymentdirectEqualTo(Byte value) {
            addCriterion("point_paymentdirect =", value, "pointPaymentdirect");
            return (Criteria) this;
        }

        public Criteria andPointPaymentdirectNotEqualTo(Byte value) {
            addCriterion("point_paymentdirect <>", value, "pointPaymentdirect");
            return (Criteria) this;
        }

        public Criteria andPointPaymentdirectGreaterThan(Byte value) {
            addCriterion("point_paymentdirect >", value, "pointPaymentdirect");
            return (Criteria) this;
        }

        public Criteria andPointPaymentdirectGreaterThanOrEqualTo(Byte value) {
            addCriterion("point_paymentdirect >=", value, "pointPaymentdirect");
            return (Criteria) this;
        }

        public Criteria andPointPaymentdirectLessThan(Byte value) {
            addCriterion("point_paymentdirect <", value, "pointPaymentdirect");
            return (Criteria) this;
        }

        public Criteria andPointPaymentdirectLessThanOrEqualTo(Byte value) {
            addCriterion("point_paymentdirect <=", value, "pointPaymentdirect");
            return (Criteria) this;
        }

        public Criteria andPointPaymentdirectIn(List<Byte> values) {
            addCriterion("point_paymentdirect in", values, "pointPaymentdirect");
            return (Criteria) this;
        }

        public Criteria andPointPaymentdirectNotIn(List<Byte> values) {
            addCriterion("point_paymentdirect not in", values, "pointPaymentdirect");
            return (Criteria) this;
        }

        public Criteria andPointPaymentdirectBetween(Byte value1, Byte value2) {
            addCriterion("point_paymentdirect between", value1, value2, "pointPaymentdirect");
            return (Criteria) this;
        }

        public Criteria andPointPaymentdirectNotBetween(Byte value1, Byte value2) {
            addCriterion("point_paymentdirect not between", value1, value2, "pointPaymentdirect");
            return (Criteria) this;
        }

        public Criteria andPointOutsnIsNull() {
            addCriterion("point_outsn is null");
            return (Criteria) this;
        }

        public Criteria andPointOutsnIsNotNull() {
            addCriterion("point_outsn is not null");
            return (Criteria) this;
        }

        public Criteria andPointOutsnEqualTo(String value) {
            addCriterion("point_outsn =", value, "pointOutsn");
            return (Criteria) this;
        }

        public Criteria andPointOutsnNotEqualTo(String value) {
            addCriterion("point_outsn <>", value, "pointOutsn");
            return (Criteria) this;
        }

        public Criteria andPointOutsnGreaterThan(String value) {
            addCriterion("point_outsn >", value, "pointOutsn");
            return (Criteria) this;
        }

        public Criteria andPointOutsnGreaterThanOrEqualTo(String value) {
            addCriterion("point_outsn >=", value, "pointOutsn");
            return (Criteria) this;
        }

        public Criteria andPointOutsnLessThan(String value) {
            addCriterion("point_outsn <", value, "pointOutsn");
            return (Criteria) this;
        }

        public Criteria andPointOutsnLessThanOrEqualTo(String value) {
            addCriterion("point_outsn <=", value, "pointOutsn");
            return (Criteria) this;
        }

        public Criteria andPointOutsnLike(String value) {
            addCriterion("point_outsn like", value, "pointOutsn");
            return (Criteria) this;
        }

        public Criteria andPointOutsnNotLike(String value) {
            addCriterion("point_outsn not like", value, "pointOutsn");
            return (Criteria) this;
        }

        public Criteria andPointOutsnIn(List<String> values) {
            addCriterion("point_outsn in", values, "pointOutsn");
            return (Criteria) this;
        }

        public Criteria andPointOutsnNotIn(List<String> values) {
            addCriterion("point_outsn not in", values, "pointOutsn");
            return (Criteria) this;
        }

        public Criteria andPointOutsnBetween(String value1, String value2) {
            addCriterion("point_outsn between", value1, value2, "pointOutsn");
            return (Criteria) this;
        }

        public Criteria andPointOutsnNotBetween(String value1, String value2) {
            addCriterion("point_outsn not between", value1, value2, "pointOutsn");
            return (Criteria) this;
        }

        public Criteria andPointPaymenttimeIsNull() {
            addCriterion("point_paymenttime is null");
            return (Criteria) this;
        }

        public Criteria andPointPaymenttimeIsNotNull() {
            addCriterion("point_paymenttime is not null");
            return (Criteria) this;
        }

        public Criteria andPointPaymenttimeEqualTo(Integer value) {
            addCriterion("point_paymenttime =", value, "pointPaymenttime");
            return (Criteria) this;
        }

        public Criteria andPointPaymenttimeNotEqualTo(Integer value) {
            addCriterion("point_paymenttime <>", value, "pointPaymenttime");
            return (Criteria) this;
        }

        public Criteria andPointPaymenttimeGreaterThan(Integer value) {
            addCriterion("point_paymenttime >", value, "pointPaymenttime");
            return (Criteria) this;
        }

        public Criteria andPointPaymenttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_paymenttime >=", value, "pointPaymenttime");
            return (Criteria) this;
        }

        public Criteria andPointPaymenttimeLessThan(Integer value) {
            addCriterion("point_paymenttime <", value, "pointPaymenttime");
            return (Criteria) this;
        }

        public Criteria andPointPaymenttimeLessThanOrEqualTo(Integer value) {
            addCriterion("point_paymenttime <=", value, "pointPaymenttime");
            return (Criteria) this;
        }

        public Criteria andPointPaymenttimeIn(List<Integer> values) {
            addCriterion("point_paymenttime in", values, "pointPaymenttime");
            return (Criteria) this;
        }

        public Criteria andPointPaymenttimeNotIn(List<Integer> values) {
            addCriterion("point_paymenttime not in", values, "pointPaymenttime");
            return (Criteria) this;
        }

        public Criteria andPointPaymenttimeBetween(Integer value1, Integer value2) {
            addCriterion("point_paymenttime between", value1, value2, "pointPaymenttime");
            return (Criteria) this;
        }

        public Criteria andPointPaymenttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("point_paymenttime not between", value1, value2, "pointPaymenttime");
            return (Criteria) this;
        }

        public Criteria andPointPaymessageIsNull() {
            addCriterion("point_paymessage is null");
            return (Criteria) this;
        }

        public Criteria andPointPaymessageIsNotNull() {
            addCriterion("point_paymessage is not null");
            return (Criteria) this;
        }

        public Criteria andPointPaymessageEqualTo(String value) {
            addCriterion("point_paymessage =", value, "pointPaymessage");
            return (Criteria) this;
        }

        public Criteria andPointPaymessageNotEqualTo(String value) {
            addCriterion("point_paymessage <>", value, "pointPaymessage");
            return (Criteria) this;
        }

        public Criteria andPointPaymessageGreaterThan(String value) {
            addCriterion("point_paymessage >", value, "pointPaymessage");
            return (Criteria) this;
        }

        public Criteria andPointPaymessageGreaterThanOrEqualTo(String value) {
            addCriterion("point_paymessage >=", value, "pointPaymessage");
            return (Criteria) this;
        }

        public Criteria andPointPaymessageLessThan(String value) {
            addCriterion("point_paymessage <", value, "pointPaymessage");
            return (Criteria) this;
        }

        public Criteria andPointPaymessageLessThanOrEqualTo(String value) {
            addCriterion("point_paymessage <=", value, "pointPaymessage");
            return (Criteria) this;
        }

        public Criteria andPointPaymessageLike(String value) {
            addCriterion("point_paymessage like", value, "pointPaymessage");
            return (Criteria) this;
        }

        public Criteria andPointPaymessageNotLike(String value) {
            addCriterion("point_paymessage not like", value, "pointPaymessage");
            return (Criteria) this;
        }

        public Criteria andPointPaymessageIn(List<String> values) {
            addCriterion("point_paymessage in", values, "pointPaymessage");
            return (Criteria) this;
        }

        public Criteria andPointPaymessageNotIn(List<String> values) {
            addCriterion("point_paymessage not in", values, "pointPaymessage");
            return (Criteria) this;
        }

        public Criteria andPointPaymessageBetween(String value1, String value2) {
            addCriterion("point_paymessage between", value1, value2, "pointPaymessage");
            return (Criteria) this;
        }

        public Criteria andPointPaymessageNotBetween(String value1, String value2) {
            addCriterion("point_paymessage not between", value1, value2, "pointPaymessage");
            return (Criteria) this;
        }

        public Criteria andPointShippingtimeIsNull() {
            addCriterion("point_shippingtime is null");
            return (Criteria) this;
        }

        public Criteria andPointShippingtimeIsNotNull() {
            addCriterion("point_shippingtime is not null");
            return (Criteria) this;
        }

        public Criteria andPointShippingtimeEqualTo(Integer value) {
            addCriterion("point_shippingtime =", value, "pointShippingtime");
            return (Criteria) this;
        }

        public Criteria andPointShippingtimeNotEqualTo(Integer value) {
            addCriterion("point_shippingtime <>", value, "pointShippingtime");
            return (Criteria) this;
        }

        public Criteria andPointShippingtimeGreaterThan(Integer value) {
            addCriterion("point_shippingtime >", value, "pointShippingtime");
            return (Criteria) this;
        }

        public Criteria andPointShippingtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_shippingtime >=", value, "pointShippingtime");
            return (Criteria) this;
        }

        public Criteria andPointShippingtimeLessThan(Integer value) {
            addCriterion("point_shippingtime <", value, "pointShippingtime");
            return (Criteria) this;
        }

        public Criteria andPointShippingtimeLessThanOrEqualTo(Integer value) {
            addCriterion("point_shippingtime <=", value, "pointShippingtime");
            return (Criteria) this;
        }

        public Criteria andPointShippingtimeIn(List<Integer> values) {
            addCriterion("point_shippingtime in", values, "pointShippingtime");
            return (Criteria) this;
        }

        public Criteria andPointShippingtimeNotIn(List<Integer> values) {
            addCriterion("point_shippingtime not in", values, "pointShippingtime");
            return (Criteria) this;
        }

        public Criteria andPointShippingtimeBetween(Integer value1, Integer value2) {
            addCriterion("point_shippingtime between", value1, value2, "pointShippingtime");
            return (Criteria) this;
        }

        public Criteria andPointShippingtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("point_shippingtime not between", value1, value2, "pointShippingtime");
            return (Criteria) this;
        }

        public Criteria andPointShippingcodeIsNull() {
            addCriterion("point_shippingcode is null");
            return (Criteria) this;
        }

        public Criteria andPointShippingcodeIsNotNull() {
            addCriterion("point_shippingcode is not null");
            return (Criteria) this;
        }

        public Criteria andPointShippingcodeEqualTo(String value) {
            addCriterion("point_shippingcode =", value, "pointShippingcode");
            return (Criteria) this;
        }

        public Criteria andPointShippingcodeNotEqualTo(String value) {
            addCriterion("point_shippingcode <>", value, "pointShippingcode");
            return (Criteria) this;
        }

        public Criteria andPointShippingcodeGreaterThan(String value) {
            addCriterion("point_shippingcode >", value, "pointShippingcode");
            return (Criteria) this;
        }

        public Criteria andPointShippingcodeGreaterThanOrEqualTo(String value) {
            addCriterion("point_shippingcode >=", value, "pointShippingcode");
            return (Criteria) this;
        }

        public Criteria andPointShippingcodeLessThan(String value) {
            addCriterion("point_shippingcode <", value, "pointShippingcode");
            return (Criteria) this;
        }

        public Criteria andPointShippingcodeLessThanOrEqualTo(String value) {
            addCriterion("point_shippingcode <=", value, "pointShippingcode");
            return (Criteria) this;
        }

        public Criteria andPointShippingcodeLike(String value) {
            addCriterion("point_shippingcode like", value, "pointShippingcode");
            return (Criteria) this;
        }

        public Criteria andPointShippingcodeNotLike(String value) {
            addCriterion("point_shippingcode not like", value, "pointShippingcode");
            return (Criteria) this;
        }

        public Criteria andPointShippingcodeIn(List<String> values) {
            addCriterion("point_shippingcode in", values, "pointShippingcode");
            return (Criteria) this;
        }

        public Criteria andPointShippingcodeNotIn(List<String> values) {
            addCriterion("point_shippingcode not in", values, "pointShippingcode");
            return (Criteria) this;
        }

        public Criteria andPointShippingcodeBetween(String value1, String value2) {
            addCriterion("point_shippingcode between", value1, value2, "pointShippingcode");
            return (Criteria) this;
        }

        public Criteria andPointShippingcodeNotBetween(String value1, String value2) {
            addCriterion("point_shippingcode not between", value1, value2, "pointShippingcode");
            return (Criteria) this;
        }

        public Criteria andPointShippingdescIsNull() {
            addCriterion("point_shippingdesc is null");
            return (Criteria) this;
        }

        public Criteria andPointShippingdescIsNotNull() {
            addCriterion("point_shippingdesc is not null");
            return (Criteria) this;
        }

        public Criteria andPointShippingdescEqualTo(String value) {
            addCriterion("point_shippingdesc =", value, "pointShippingdesc");
            return (Criteria) this;
        }

        public Criteria andPointShippingdescNotEqualTo(String value) {
            addCriterion("point_shippingdesc <>", value, "pointShippingdesc");
            return (Criteria) this;
        }

        public Criteria andPointShippingdescGreaterThan(String value) {
            addCriterion("point_shippingdesc >", value, "pointShippingdesc");
            return (Criteria) this;
        }

        public Criteria andPointShippingdescGreaterThanOrEqualTo(String value) {
            addCriterion("point_shippingdesc >=", value, "pointShippingdesc");
            return (Criteria) this;
        }

        public Criteria andPointShippingdescLessThan(String value) {
            addCriterion("point_shippingdesc <", value, "pointShippingdesc");
            return (Criteria) this;
        }

        public Criteria andPointShippingdescLessThanOrEqualTo(String value) {
            addCriterion("point_shippingdesc <=", value, "pointShippingdesc");
            return (Criteria) this;
        }

        public Criteria andPointShippingdescLike(String value) {
            addCriterion("point_shippingdesc like", value, "pointShippingdesc");
            return (Criteria) this;
        }

        public Criteria andPointShippingdescNotLike(String value) {
            addCriterion("point_shippingdesc not like", value, "pointShippingdesc");
            return (Criteria) this;
        }

        public Criteria andPointShippingdescIn(List<String> values) {
            addCriterion("point_shippingdesc in", values, "pointShippingdesc");
            return (Criteria) this;
        }

        public Criteria andPointShippingdescNotIn(List<String> values) {
            addCriterion("point_shippingdesc not in", values, "pointShippingdesc");
            return (Criteria) this;
        }

        public Criteria andPointShippingdescBetween(String value1, String value2) {
            addCriterion("point_shippingdesc between", value1, value2, "pointShippingdesc");
            return (Criteria) this;
        }

        public Criteria andPointShippingdescNotBetween(String value1, String value2) {
            addCriterion("point_shippingdesc not between", value1, value2, "pointShippingdesc");
            return (Criteria) this;
        }

        public Criteria andPointOutpaymentcodeIsNull() {
            addCriterion("point_outpaymentcode is null");
            return (Criteria) this;
        }

        public Criteria andPointOutpaymentcodeIsNotNull() {
            addCriterion("point_outpaymentcode is not null");
            return (Criteria) this;
        }

        public Criteria andPointOutpaymentcodeEqualTo(String value) {
            addCriterion("point_outpaymentcode =", value, "pointOutpaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointOutpaymentcodeNotEqualTo(String value) {
            addCriterion("point_outpaymentcode <>", value, "pointOutpaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointOutpaymentcodeGreaterThan(String value) {
            addCriterion("point_outpaymentcode >", value, "pointOutpaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointOutpaymentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("point_outpaymentcode >=", value, "pointOutpaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointOutpaymentcodeLessThan(String value) {
            addCriterion("point_outpaymentcode <", value, "pointOutpaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointOutpaymentcodeLessThanOrEqualTo(String value) {
            addCriterion("point_outpaymentcode <=", value, "pointOutpaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointOutpaymentcodeLike(String value) {
            addCriterion("point_outpaymentcode like", value, "pointOutpaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointOutpaymentcodeNotLike(String value) {
            addCriterion("point_outpaymentcode not like", value, "pointOutpaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointOutpaymentcodeIn(List<String> values) {
            addCriterion("point_outpaymentcode in", values, "pointOutpaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointOutpaymentcodeNotIn(List<String> values) {
            addCriterion("point_outpaymentcode not in", values, "pointOutpaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointOutpaymentcodeBetween(String value1, String value2) {
            addCriterion("point_outpaymentcode between", value1, value2, "pointOutpaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointOutpaymentcodeNotBetween(String value1, String value2) {
            addCriterion("point_outpaymentcode not between", value1, value2, "pointOutpaymentcode");
            return (Criteria) this;
        }

        public Criteria andPointFinnshedtimeIsNull() {
            addCriterion("point_finnshedtime is null");
            return (Criteria) this;
        }

        public Criteria andPointFinnshedtimeIsNotNull() {
            addCriterion("point_finnshedtime is not null");
            return (Criteria) this;
        }

        public Criteria andPointFinnshedtimeEqualTo(Integer value) {
            addCriterion("point_finnshedtime =", value, "pointFinnshedtime");
            return (Criteria) this;
        }

        public Criteria andPointFinnshedtimeNotEqualTo(Integer value) {
            addCriterion("point_finnshedtime <>", value, "pointFinnshedtime");
            return (Criteria) this;
        }

        public Criteria andPointFinnshedtimeGreaterThan(Integer value) {
            addCriterion("point_finnshedtime >", value, "pointFinnshedtime");
            return (Criteria) this;
        }

        public Criteria andPointFinnshedtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_finnshedtime >=", value, "pointFinnshedtime");
            return (Criteria) this;
        }

        public Criteria andPointFinnshedtimeLessThan(Integer value) {
            addCriterion("point_finnshedtime <", value, "pointFinnshedtime");
            return (Criteria) this;
        }

        public Criteria andPointFinnshedtimeLessThanOrEqualTo(Integer value) {
            addCriterion("point_finnshedtime <=", value, "pointFinnshedtime");
            return (Criteria) this;
        }

        public Criteria andPointFinnshedtimeIn(List<Integer> values) {
            addCriterion("point_finnshedtime in", values, "pointFinnshedtime");
            return (Criteria) this;
        }

        public Criteria andPointFinnshedtimeNotIn(List<Integer> values) {
            addCriterion("point_finnshedtime not in", values, "pointFinnshedtime");
            return (Criteria) this;
        }

        public Criteria andPointFinnshedtimeBetween(Integer value1, Integer value2) {
            addCriterion("point_finnshedtime between", value1, value2, "pointFinnshedtime");
            return (Criteria) this;
        }

        public Criteria andPointFinnshedtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("point_finnshedtime not between", value1, value2, "pointFinnshedtime");
            return (Criteria) this;
        }

        public Criteria andPointAllpointIsNull() {
            addCriterion("point_allpoint is null");
            return (Criteria) this;
        }

        public Criteria andPointAllpointIsNotNull() {
            addCriterion("point_allpoint is not null");
            return (Criteria) this;
        }

        public Criteria andPointAllpointEqualTo(Integer value) {
            addCriterion("point_allpoint =", value, "pointAllpoint");
            return (Criteria) this;
        }

        public Criteria andPointAllpointNotEqualTo(Integer value) {
            addCriterion("point_allpoint <>", value, "pointAllpoint");
            return (Criteria) this;
        }

        public Criteria andPointAllpointGreaterThan(Integer value) {
            addCriterion("point_allpoint >", value, "pointAllpoint");
            return (Criteria) this;
        }

        public Criteria andPointAllpointGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_allpoint >=", value, "pointAllpoint");
            return (Criteria) this;
        }

        public Criteria andPointAllpointLessThan(Integer value) {
            addCriterion("point_allpoint <", value, "pointAllpoint");
            return (Criteria) this;
        }

        public Criteria andPointAllpointLessThanOrEqualTo(Integer value) {
            addCriterion("point_allpoint <=", value, "pointAllpoint");
            return (Criteria) this;
        }

        public Criteria andPointAllpointIn(List<Integer> values) {
            addCriterion("point_allpoint in", values, "pointAllpoint");
            return (Criteria) this;
        }

        public Criteria andPointAllpointNotIn(List<Integer> values) {
            addCriterion("point_allpoint not in", values, "pointAllpoint");
            return (Criteria) this;
        }

        public Criteria andPointAllpointBetween(Integer value1, Integer value2) {
            addCriterion("point_allpoint between", value1, value2, "pointAllpoint");
            return (Criteria) this;
        }

        public Criteria andPointAllpointNotBetween(Integer value1, Integer value2) {
            addCriterion("point_allpoint not between", value1, value2, "pointAllpoint");
            return (Criteria) this;
        }

        public Criteria andPointOrderamountIsNull() {
            addCriterion("point_orderamount is null");
            return (Criteria) this;
        }

        public Criteria andPointOrderamountIsNotNull() {
            addCriterion("point_orderamount is not null");
            return (Criteria) this;
        }

        public Criteria andPointOrderamountEqualTo(BigDecimal value) {
            addCriterion("point_orderamount =", value, "pointOrderamount");
            return (Criteria) this;
        }

        public Criteria andPointOrderamountNotEqualTo(BigDecimal value) {
            addCriterion("point_orderamount <>", value, "pointOrderamount");
            return (Criteria) this;
        }

        public Criteria andPointOrderamountGreaterThan(BigDecimal value) {
            addCriterion("point_orderamount >", value, "pointOrderamount");
            return (Criteria) this;
        }

        public Criteria andPointOrderamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("point_orderamount >=", value, "pointOrderamount");
            return (Criteria) this;
        }

        public Criteria andPointOrderamountLessThan(BigDecimal value) {
            addCriterion("point_orderamount <", value, "pointOrderamount");
            return (Criteria) this;
        }

        public Criteria andPointOrderamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("point_orderamount <=", value, "pointOrderamount");
            return (Criteria) this;
        }

        public Criteria andPointOrderamountIn(List<BigDecimal> values) {
            addCriterion("point_orderamount in", values, "pointOrderamount");
            return (Criteria) this;
        }

        public Criteria andPointOrderamountNotIn(List<BigDecimal> values) {
            addCriterion("point_orderamount not in", values, "pointOrderamount");
            return (Criteria) this;
        }

        public Criteria andPointOrderamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("point_orderamount between", value1, value2, "pointOrderamount");
            return (Criteria) this;
        }

        public Criteria andPointOrderamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("point_orderamount not between", value1, value2, "pointOrderamount");
            return (Criteria) this;
        }

        public Criteria andPointShippingchargeIsNull() {
            addCriterion("point_shippingcharge is null");
            return (Criteria) this;
        }

        public Criteria andPointShippingchargeIsNotNull() {
            addCriterion("point_shippingcharge is not null");
            return (Criteria) this;
        }

        public Criteria andPointShippingchargeEqualTo(Byte value) {
            addCriterion("point_shippingcharge =", value, "pointShippingcharge");
            return (Criteria) this;
        }

        public Criteria andPointShippingchargeNotEqualTo(Byte value) {
            addCriterion("point_shippingcharge <>", value, "pointShippingcharge");
            return (Criteria) this;
        }

        public Criteria andPointShippingchargeGreaterThan(Byte value) {
            addCriterion("point_shippingcharge >", value, "pointShippingcharge");
            return (Criteria) this;
        }

        public Criteria andPointShippingchargeGreaterThanOrEqualTo(Byte value) {
            addCriterion("point_shippingcharge >=", value, "pointShippingcharge");
            return (Criteria) this;
        }

        public Criteria andPointShippingchargeLessThan(Byte value) {
            addCriterion("point_shippingcharge <", value, "pointShippingcharge");
            return (Criteria) this;
        }

        public Criteria andPointShippingchargeLessThanOrEqualTo(Byte value) {
            addCriterion("point_shippingcharge <=", value, "pointShippingcharge");
            return (Criteria) this;
        }

        public Criteria andPointShippingchargeIn(List<Byte> values) {
            addCriterion("point_shippingcharge in", values, "pointShippingcharge");
            return (Criteria) this;
        }

        public Criteria andPointShippingchargeNotIn(List<Byte> values) {
            addCriterion("point_shippingcharge not in", values, "pointShippingcharge");
            return (Criteria) this;
        }

        public Criteria andPointShippingchargeBetween(Byte value1, Byte value2) {
            addCriterion("point_shippingcharge between", value1, value2, "pointShippingcharge");
            return (Criteria) this;
        }

        public Criteria andPointShippingchargeNotBetween(Byte value1, Byte value2) {
            addCriterion("point_shippingcharge not between", value1, value2, "pointShippingcharge");
            return (Criteria) this;
        }

        public Criteria andPointShippingfeeIsNull() {
            addCriterion("point_shippingfee is null");
            return (Criteria) this;
        }

        public Criteria andPointShippingfeeIsNotNull() {
            addCriterion("point_shippingfee is not null");
            return (Criteria) this;
        }

        public Criteria andPointShippingfeeEqualTo(BigDecimal value) {
            addCriterion("point_shippingfee =", value, "pointShippingfee");
            return (Criteria) this;
        }

        public Criteria andPointShippingfeeNotEqualTo(BigDecimal value) {
            addCriterion("point_shippingfee <>", value, "pointShippingfee");
            return (Criteria) this;
        }

        public Criteria andPointShippingfeeGreaterThan(BigDecimal value) {
            addCriterion("point_shippingfee >", value, "pointShippingfee");
            return (Criteria) this;
        }

        public Criteria andPointShippingfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("point_shippingfee >=", value, "pointShippingfee");
            return (Criteria) this;
        }

        public Criteria andPointShippingfeeLessThan(BigDecimal value) {
            addCriterion("point_shippingfee <", value, "pointShippingfee");
            return (Criteria) this;
        }

        public Criteria andPointShippingfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("point_shippingfee <=", value, "pointShippingfee");
            return (Criteria) this;
        }

        public Criteria andPointShippingfeeIn(List<BigDecimal> values) {
            addCriterion("point_shippingfee in", values, "pointShippingfee");
            return (Criteria) this;
        }

        public Criteria andPointShippingfeeNotIn(List<BigDecimal> values) {
            addCriterion("point_shippingfee not in", values, "pointShippingfee");
            return (Criteria) this;
        }

        public Criteria andPointShippingfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("point_shippingfee between", value1, value2, "pointShippingfee");
            return (Criteria) this;
        }

        public Criteria andPointShippingfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("point_shippingfee not between", value1, value2, "pointShippingfee");
            return (Criteria) this;
        }

        public Criteria andPointOrdermessageIsNull() {
            addCriterion("point_ordermessage is null");
            return (Criteria) this;
        }

        public Criteria andPointOrdermessageIsNotNull() {
            addCriterion("point_ordermessage is not null");
            return (Criteria) this;
        }

        public Criteria andPointOrdermessageEqualTo(String value) {
            addCriterion("point_ordermessage =", value, "pointOrdermessage");
            return (Criteria) this;
        }

        public Criteria andPointOrdermessageNotEqualTo(String value) {
            addCriterion("point_ordermessage <>", value, "pointOrdermessage");
            return (Criteria) this;
        }

        public Criteria andPointOrdermessageGreaterThan(String value) {
            addCriterion("point_ordermessage >", value, "pointOrdermessage");
            return (Criteria) this;
        }

        public Criteria andPointOrdermessageGreaterThanOrEqualTo(String value) {
            addCriterion("point_ordermessage >=", value, "pointOrdermessage");
            return (Criteria) this;
        }

        public Criteria andPointOrdermessageLessThan(String value) {
            addCriterion("point_ordermessage <", value, "pointOrdermessage");
            return (Criteria) this;
        }

        public Criteria andPointOrdermessageLessThanOrEqualTo(String value) {
            addCriterion("point_ordermessage <=", value, "pointOrdermessage");
            return (Criteria) this;
        }

        public Criteria andPointOrdermessageLike(String value) {
            addCriterion("point_ordermessage like", value, "pointOrdermessage");
            return (Criteria) this;
        }

        public Criteria andPointOrdermessageNotLike(String value) {
            addCriterion("point_ordermessage not like", value, "pointOrdermessage");
            return (Criteria) this;
        }

        public Criteria andPointOrdermessageIn(List<String> values) {
            addCriterion("point_ordermessage in", values, "pointOrdermessage");
            return (Criteria) this;
        }

        public Criteria andPointOrdermessageNotIn(List<String> values) {
            addCriterion("point_ordermessage not in", values, "pointOrdermessage");
            return (Criteria) this;
        }

        public Criteria andPointOrdermessageBetween(String value1, String value2) {
            addCriterion("point_ordermessage between", value1, value2, "pointOrdermessage");
            return (Criteria) this;
        }

        public Criteria andPointOrdermessageNotBetween(String value1, String value2) {
            addCriterion("point_ordermessage not between", value1, value2, "pointOrdermessage");
            return (Criteria) this;
        }

        public Criteria andPointOrderstateIsNull() {
            addCriterion("point_orderstate is null");
            return (Criteria) this;
        }

        public Criteria andPointOrderstateIsNotNull() {
            addCriterion("point_orderstate is not null");
            return (Criteria) this;
        }

        public Criteria andPointOrderstateEqualTo(Integer value) {
            addCriterion("point_orderstate =", value, "pointOrderstate");
            return (Criteria) this;
        }

        public Criteria andPointOrderstateNotEqualTo(Integer value) {
            addCriterion("point_orderstate <>", value, "pointOrderstate");
            return (Criteria) this;
        }

        public Criteria andPointOrderstateGreaterThan(Integer value) {
            addCriterion("point_orderstate >", value, "pointOrderstate");
            return (Criteria) this;
        }

        public Criteria andPointOrderstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_orderstate >=", value, "pointOrderstate");
            return (Criteria) this;
        }

        public Criteria andPointOrderstateLessThan(Integer value) {
            addCriterion("point_orderstate <", value, "pointOrderstate");
            return (Criteria) this;
        }

        public Criteria andPointOrderstateLessThanOrEqualTo(Integer value) {
            addCriterion("point_orderstate <=", value, "pointOrderstate");
            return (Criteria) this;
        }

        public Criteria andPointOrderstateIn(List<Integer> values) {
            addCriterion("point_orderstate in", values, "pointOrderstate");
            return (Criteria) this;
        }

        public Criteria andPointOrderstateNotIn(List<Integer> values) {
            addCriterion("point_orderstate not in", values, "pointOrderstate");
            return (Criteria) this;
        }

        public Criteria andPointOrderstateBetween(Integer value1, Integer value2) {
            addCriterion("point_orderstate between", value1, value2, "pointOrderstate");
            return (Criteria) this;
        }

        public Criteria andPointOrderstateNotBetween(Integer value1, Integer value2) {
            addCriterion("point_orderstate not between", value1, value2, "pointOrderstate");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_points_order表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2017-10-17
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_points_order 2017-10-17
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