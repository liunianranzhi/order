package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderStatisticsOfflineBizOrderExample {
    /**
     * order_statistics_offline_biz_order
     */
    protected String orderByClause;

    /**
     * order_statistics_offline_biz_order
     */
    protected boolean distinct;

    /**
     * order_statistics_offline_biz_order
     */
    protected List<Criteria> oredCriteria;

    public OrderStatisticsOfflineBizOrderExample() {
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
     * order_statistics_offline_biz_order 2018-01-04
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andFinishedTimeIsNull() {
            addCriterion("finished_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeIsNotNull() {
            addCriterion("finished_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeEqualTo(Integer value) {
            addCriterion("finished_time =", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeNotEqualTo(Integer value) {
            addCriterion("finished_time <>", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeGreaterThan(Integer value) {
            addCriterion("finished_time >", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("finished_time >=", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeLessThan(Integer value) {
            addCriterion("finished_time <", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeLessThanOrEqualTo(Integer value) {
            addCriterion("finished_time <=", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeIn(List<Integer> values) {
            addCriterion("finished_time in", values, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeNotIn(List<Integer> values) {
            addCriterion("finished_time not in", values, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeBetween(Integer value1, Integer value2) {
            addCriterion("finished_time between", value1, value2, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("finished_time not between", value1, value2, "finishedTime");
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

        public Criteria andCircleIdDeep1IsNull() {
            addCriterion("circle_id_deep_1 is null");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep1IsNotNull() {
            addCriterion("circle_id_deep_1 is not null");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep1EqualTo(Integer value) {
            addCriterion("circle_id_deep_1 =", value, "circleIdDeep1");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep1NotEqualTo(Integer value) {
            addCriterion("circle_id_deep_1 <>", value, "circleIdDeep1");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep1GreaterThan(Integer value) {
            addCriterion("circle_id_deep_1 >", value, "circleIdDeep1");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep1GreaterThanOrEqualTo(Integer value) {
            addCriterion("circle_id_deep_1 >=", value, "circleIdDeep1");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep1LessThan(Integer value) {
            addCriterion("circle_id_deep_1 <", value, "circleIdDeep1");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep1LessThanOrEqualTo(Integer value) {
            addCriterion("circle_id_deep_1 <=", value, "circleIdDeep1");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep1In(List<Integer> values) {
            addCriterion("circle_id_deep_1 in", values, "circleIdDeep1");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep1NotIn(List<Integer> values) {
            addCriterion("circle_id_deep_1 not in", values, "circleIdDeep1");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep1Between(Integer value1, Integer value2) {
            addCriterion("circle_id_deep_1 between", value1, value2, "circleIdDeep1");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep1NotBetween(Integer value1, Integer value2) {
            addCriterion("circle_id_deep_1 not between", value1, value2, "circleIdDeep1");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep2IsNull() {
            addCriterion("circle_id_deep_2 is null");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep2IsNotNull() {
            addCriterion("circle_id_deep_2 is not null");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep2EqualTo(Integer value) {
            addCriterion("circle_id_deep_2 =", value, "circleIdDeep2");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep2NotEqualTo(Integer value) {
            addCriterion("circle_id_deep_2 <>", value, "circleIdDeep2");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep2GreaterThan(Integer value) {
            addCriterion("circle_id_deep_2 >", value, "circleIdDeep2");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep2GreaterThanOrEqualTo(Integer value) {
            addCriterion("circle_id_deep_2 >=", value, "circleIdDeep2");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep2LessThan(Integer value) {
            addCriterion("circle_id_deep_2 <", value, "circleIdDeep2");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep2LessThanOrEqualTo(Integer value) {
            addCriterion("circle_id_deep_2 <=", value, "circleIdDeep2");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep2In(List<Integer> values) {
            addCriterion("circle_id_deep_2 in", values, "circleIdDeep2");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep2NotIn(List<Integer> values) {
            addCriterion("circle_id_deep_2 not in", values, "circleIdDeep2");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep2Between(Integer value1, Integer value2) {
            addCriterion("circle_id_deep_2 between", value1, value2, "circleIdDeep2");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep2NotBetween(Integer value1, Integer value2) {
            addCriterion("circle_id_deep_2 not between", value1, value2, "circleIdDeep2");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep3IsNull() {
            addCriterion("circle_id_deep_3 is null");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep3IsNotNull() {
            addCriterion("circle_id_deep_3 is not null");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep3EqualTo(Integer value) {
            addCriterion("circle_id_deep_3 =", value, "circleIdDeep3");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep3NotEqualTo(Integer value) {
            addCriterion("circle_id_deep_3 <>", value, "circleIdDeep3");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep3GreaterThan(Integer value) {
            addCriterion("circle_id_deep_3 >", value, "circleIdDeep3");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep3GreaterThanOrEqualTo(Integer value) {
            addCriterion("circle_id_deep_3 >=", value, "circleIdDeep3");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep3LessThan(Integer value) {
            addCriterion("circle_id_deep_3 <", value, "circleIdDeep3");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep3LessThanOrEqualTo(Integer value) {
            addCriterion("circle_id_deep_3 <=", value, "circleIdDeep3");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep3In(List<Integer> values) {
            addCriterion("circle_id_deep_3 in", values, "circleIdDeep3");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep3NotIn(List<Integer> values) {
            addCriterion("circle_id_deep_3 not in", values, "circleIdDeep3");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep3Between(Integer value1, Integer value2) {
            addCriterion("circle_id_deep_3 between", value1, value2, "circleIdDeep3");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep3NotBetween(Integer value1, Integer value2) {
            addCriterion("circle_id_deep_3 not between", value1, value2, "circleIdDeep3");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep4IsNull() {
            addCriterion("circle_id_deep_4 is null");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep4IsNotNull() {
            addCriterion("circle_id_deep_4 is not null");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep4EqualTo(Integer value) {
            addCriterion("circle_id_deep_4 =", value, "circleIdDeep4");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep4NotEqualTo(Integer value) {
            addCriterion("circle_id_deep_4 <>", value, "circleIdDeep4");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep4GreaterThan(Integer value) {
            addCriterion("circle_id_deep_4 >", value, "circleIdDeep4");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep4GreaterThanOrEqualTo(Integer value) {
            addCriterion("circle_id_deep_4 >=", value, "circleIdDeep4");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep4LessThan(Integer value) {
            addCriterion("circle_id_deep_4 <", value, "circleIdDeep4");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep4LessThanOrEqualTo(Integer value) {
            addCriterion("circle_id_deep_4 <=", value, "circleIdDeep4");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep4In(List<Integer> values) {
            addCriterion("circle_id_deep_4 in", values, "circleIdDeep4");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep4NotIn(List<Integer> values) {
            addCriterion("circle_id_deep_4 not in", values, "circleIdDeep4");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep4Between(Integer value1, Integer value2) {
            addCriterion("circle_id_deep_4 between", value1, value2, "circleIdDeep4");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep4NotBetween(Integer value1, Integer value2) {
            addCriterion("circle_id_deep_4 not between", value1, value2, "circleIdDeep4");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep5IsNull() {
            addCriterion("circle_id_deep_5 is null");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep5IsNotNull() {
            addCriterion("circle_id_deep_5 is not null");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep5EqualTo(Integer value) {
            addCriterion("circle_id_deep_5 =", value, "circleIdDeep5");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep5NotEqualTo(Integer value) {
            addCriterion("circle_id_deep_5 <>", value, "circleIdDeep5");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep5GreaterThan(Integer value) {
            addCriterion("circle_id_deep_5 >", value, "circleIdDeep5");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep5GreaterThanOrEqualTo(Integer value) {
            addCriterion("circle_id_deep_5 >=", value, "circleIdDeep5");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep5LessThan(Integer value) {
            addCriterion("circle_id_deep_5 <", value, "circleIdDeep5");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep5LessThanOrEqualTo(Integer value) {
            addCriterion("circle_id_deep_5 <=", value, "circleIdDeep5");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep5In(List<Integer> values) {
            addCriterion("circle_id_deep_5 in", values, "circleIdDeep5");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep5NotIn(List<Integer> values) {
            addCriterion("circle_id_deep_5 not in", values, "circleIdDeep5");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep5Between(Integer value1, Integer value2) {
            addCriterion("circle_id_deep_5 between", value1, value2, "circleIdDeep5");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep5NotBetween(Integer value1, Integer value2) {
            addCriterion("circle_id_deep_5 not between", value1, value2, "circleIdDeep5");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep6IsNull() {
            addCriterion("circle_id_deep_6 is null");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep6IsNotNull() {
            addCriterion("circle_id_deep_6 is not null");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep6EqualTo(Integer value) {
            addCriterion("circle_id_deep_6 =", value, "circleIdDeep6");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep6NotEqualTo(Integer value) {
            addCriterion("circle_id_deep_6 <>", value, "circleIdDeep6");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep6GreaterThan(Integer value) {
            addCriterion("circle_id_deep_6 >", value, "circleIdDeep6");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep6GreaterThanOrEqualTo(Integer value) {
            addCriterion("circle_id_deep_6 >=", value, "circleIdDeep6");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep6LessThan(Integer value) {
            addCriterion("circle_id_deep_6 <", value, "circleIdDeep6");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep6LessThanOrEqualTo(Integer value) {
            addCriterion("circle_id_deep_6 <=", value, "circleIdDeep6");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep6In(List<Integer> values) {
            addCriterion("circle_id_deep_6 in", values, "circleIdDeep6");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep6NotIn(List<Integer> values) {
            addCriterion("circle_id_deep_6 not in", values, "circleIdDeep6");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep6Between(Integer value1, Integer value2) {
            addCriterion("circle_id_deep_6 between", value1, value2, "circleIdDeep6");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep6NotBetween(Integer value1, Integer value2) {
            addCriterion("circle_id_deep_6 not between", value1, value2, "circleIdDeep6");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep7IsNull() {
            addCriterion("circle_id_deep_7 is null");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep7IsNotNull() {
            addCriterion("circle_id_deep_7 is not null");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep7EqualTo(Integer value) {
            addCriterion("circle_id_deep_7 =", value, "circleIdDeep7");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep7NotEqualTo(Integer value) {
            addCriterion("circle_id_deep_7 <>", value, "circleIdDeep7");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep7GreaterThan(Integer value) {
            addCriterion("circle_id_deep_7 >", value, "circleIdDeep7");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep7GreaterThanOrEqualTo(Integer value) {
            addCriterion("circle_id_deep_7 >=", value, "circleIdDeep7");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep7LessThan(Integer value) {
            addCriterion("circle_id_deep_7 <", value, "circleIdDeep7");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep7LessThanOrEqualTo(Integer value) {
            addCriterion("circle_id_deep_7 <=", value, "circleIdDeep7");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep7In(List<Integer> values) {
            addCriterion("circle_id_deep_7 in", values, "circleIdDeep7");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep7NotIn(List<Integer> values) {
            addCriterion("circle_id_deep_7 not in", values, "circleIdDeep7");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep7Between(Integer value1, Integer value2) {
            addCriterion("circle_id_deep_7 between", value1, value2, "circleIdDeep7");
            return (Criteria) this;
        }

        public Criteria andCircleIdDeep7NotBetween(Integer value1, Integer value2) {
            addCriterion("circle_id_deep_7 not between", value1, value2, "circleIdDeep7");
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

        public Criteria andCTimeIsNull() {
            addCriterion("c_time is null");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNotNull() {
            addCriterion("c_time is not null");
            return (Criteria) this;
        }

        public Criteria andCTimeEqualTo(Integer value) {
            addCriterion("c_time =", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotEqualTo(Integer value) {
            addCriterion("c_time <>", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThan(Integer value) {
            addCriterion("c_time >", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_time >=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThan(Integer value) {
            addCriterion("c_time <", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThanOrEqualTo(Integer value) {
            addCriterion("c_time <=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeIn(List<Integer> values) {
            addCriterion("c_time in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotIn(List<Integer> values) {
            addCriterion("c_time not in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeBetween(Integer value1, Integer value2) {
            addCriterion("c_time between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("c_time not between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andHelpPriceIsNull() {
            addCriterion("help_price is null");
            return (Criteria) this;
        }

        public Criteria andHelpPriceIsNotNull() {
            addCriterion("help_price is not null");
            return (Criteria) this;
        }

        public Criteria andHelpPriceEqualTo(BigDecimal value) {
            addCriterion("help_price =", value, "helpPrice");
            return (Criteria) this;
        }

        public Criteria andHelpPriceNotEqualTo(BigDecimal value) {
            addCriterion("help_price <>", value, "helpPrice");
            return (Criteria) this;
        }

        public Criteria andHelpPriceGreaterThan(BigDecimal value) {
            addCriterion("help_price >", value, "helpPrice");
            return (Criteria) this;
        }

        public Criteria andHelpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("help_price >=", value, "helpPrice");
            return (Criteria) this;
        }

        public Criteria andHelpPriceLessThan(BigDecimal value) {
            addCriterion("help_price <", value, "helpPrice");
            return (Criteria) this;
        }

        public Criteria andHelpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("help_price <=", value, "helpPrice");
            return (Criteria) this;
        }

        public Criteria andHelpPriceIn(List<BigDecimal> values) {
            addCriterion("help_price in", values, "helpPrice");
            return (Criteria) this;
        }

        public Criteria andHelpPriceNotIn(List<BigDecimal> values) {
            addCriterion("help_price not in", values, "helpPrice");
            return (Criteria) this;
        }

        public Criteria andHelpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("help_price between", value1, value2, "helpPrice");
            return (Criteria) this;
        }

        public Criteria andHelpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("help_price not between", value1, value2, "helpPrice");
            return (Criteria) this;
        }
    }

    /**
     * 描述:order_statistics_offline_biz_order表的实体类
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
     * order_statistics_offline_biz_order 2018-01-04
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