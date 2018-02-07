package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderStatisticsBaseDataExample {
    /**
     * order_statistics_base_data
     */
    protected String orderByClause;

    /**
     * order_statistics_base_data
     */
    protected boolean distinct;

    /**
     * order_statistics_base_data
     */
    protected List<Criteria> oredCriteria;

    public OrderStatisticsBaseDataExample() {
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
     * order_statistics_base_data 2018-01-08
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

        public Criteria andSUnionIdIsNull() {
            addCriterion("s_union_id is null");
            return (Criteria) this;
        }

        public Criteria andSUnionIdIsNotNull() {
            addCriterion("s_union_id is not null");
            return (Criteria) this;
        }

        public Criteria andSUnionIdEqualTo(Integer value) {
            addCriterion("s_union_id =", value, "sUnionId");
            return (Criteria) this;
        }

        public Criteria andSUnionIdNotEqualTo(Integer value) {
            addCriterion("s_union_id <>", value, "sUnionId");
            return (Criteria) this;
        }

        public Criteria andSUnionIdGreaterThan(Integer value) {
            addCriterion("s_union_id >", value, "sUnionId");
            return (Criteria) this;
        }

        public Criteria andSUnionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_union_id >=", value, "sUnionId");
            return (Criteria) this;
        }

        public Criteria andSUnionIdLessThan(Integer value) {
            addCriterion("s_union_id <", value, "sUnionId");
            return (Criteria) this;
        }

        public Criteria andSUnionIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_union_id <=", value, "sUnionId");
            return (Criteria) this;
        }

        public Criteria andSUnionIdIn(List<Integer> values) {
            addCriterion("s_union_id in", values, "sUnionId");
            return (Criteria) this;
        }

        public Criteria andSUnionIdNotIn(List<Integer> values) {
            addCriterion("s_union_id not in", values, "sUnionId");
            return (Criteria) this;
        }

        public Criteria andSUnionIdBetween(Integer value1, Integer value2) {
            addCriterion("s_union_id between", value1, value2, "sUnionId");
            return (Criteria) this;
        }

        public Criteria andSUnionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_union_id not between", value1, value2, "sUnionId");
            return (Criteria) this;
        }

        public Criteria andSUnionNameIsNull() {
            addCriterion("s_union_name is null");
            return (Criteria) this;
        }

        public Criteria andSUnionNameIsNotNull() {
            addCriterion("s_union_name is not null");
            return (Criteria) this;
        }

        public Criteria andSUnionNameEqualTo(String value) {
            addCriterion("s_union_name =", value, "sUnionName");
            return (Criteria) this;
        }

        public Criteria andSUnionNameNotEqualTo(String value) {
            addCriterion("s_union_name <>", value, "sUnionName");
            return (Criteria) this;
        }

        public Criteria andSUnionNameGreaterThan(String value) {
            addCriterion("s_union_name >", value, "sUnionName");
            return (Criteria) this;
        }

        public Criteria andSUnionNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_union_name >=", value, "sUnionName");
            return (Criteria) this;
        }

        public Criteria andSUnionNameLessThan(String value) {
            addCriterion("s_union_name <", value, "sUnionName");
            return (Criteria) this;
        }

        public Criteria andSUnionNameLessThanOrEqualTo(String value) {
            addCriterion("s_union_name <=", value, "sUnionName");
            return (Criteria) this;
        }

        public Criteria andSUnionNameLike(String value) {
            addCriterion("s_union_name like", value, "sUnionName");
            return (Criteria) this;
        }

        public Criteria andSUnionNameNotLike(String value) {
            addCriterion("s_union_name not like", value, "sUnionName");
            return (Criteria) this;
        }

        public Criteria andSUnionNameIn(List<String> values) {
            addCriterion("s_union_name in", values, "sUnionName");
            return (Criteria) this;
        }

        public Criteria andSUnionNameNotIn(List<String> values) {
            addCriterion("s_union_name not in", values, "sUnionName");
            return (Criteria) this;
        }

        public Criteria andSUnionNameBetween(String value1, String value2) {
            addCriterion("s_union_name between", value1, value2, "sUnionName");
            return (Criteria) this;
        }

        public Criteria andSUnionNameNotBetween(String value1, String value2) {
            addCriterion("s_union_name not between", value1, value2, "sUnionName");
            return (Criteria) this;
        }

        public Criteria andSChannelIsNull() {
            addCriterion("s_channel is null");
            return (Criteria) this;
        }

        public Criteria andSChannelIsNotNull() {
            addCriterion("s_channel is not null");
            return (Criteria) this;
        }

        public Criteria andSChannelEqualTo(String value) {
            addCriterion("s_channel =", value, "sChannel");
            return (Criteria) this;
        }

        public Criteria andSChannelNotEqualTo(String value) {
            addCriterion("s_channel <>", value, "sChannel");
            return (Criteria) this;
        }

        public Criteria andSChannelGreaterThan(String value) {
            addCriterion("s_channel >", value, "sChannel");
            return (Criteria) this;
        }

        public Criteria andSChannelGreaterThanOrEqualTo(String value) {
            addCriterion("s_channel >=", value, "sChannel");
            return (Criteria) this;
        }

        public Criteria andSChannelLessThan(String value) {
            addCriterion("s_channel <", value, "sChannel");
            return (Criteria) this;
        }

        public Criteria andSChannelLessThanOrEqualTo(String value) {
            addCriterion("s_channel <=", value, "sChannel");
            return (Criteria) this;
        }

        public Criteria andSChannelLike(String value) {
            addCriterion("s_channel like", value, "sChannel");
            return (Criteria) this;
        }

        public Criteria andSChannelNotLike(String value) {
            addCriterion("s_channel not like", value, "sChannel");
            return (Criteria) this;
        }

        public Criteria andSChannelIn(List<String> values) {
            addCriterion("s_channel in", values, "sChannel");
            return (Criteria) this;
        }

        public Criteria andSChannelNotIn(List<String> values) {
            addCriterion("s_channel not in", values, "sChannel");
            return (Criteria) this;
        }

        public Criteria andSChannelBetween(String value1, String value2) {
            addCriterion("s_channel between", value1, value2, "sChannel");
            return (Criteria) this;
        }

        public Criteria andSChannelNotBetween(String value1, String value2) {
            addCriterion("s_channel not between", value1, value2, "sChannel");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep1IsNull() {
            addCriterion("s_circle_id_deep_1 is null");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep1IsNotNull() {
            addCriterion("s_circle_id_deep_1 is not null");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep1EqualTo(Integer value) {
            addCriterion("s_circle_id_deep_1 =", value, "sCircleIdDeep1");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep1NotEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_1 <>", value, "sCircleIdDeep1");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep1GreaterThan(Integer value) {
            addCriterion("s_circle_id_deep_1 >", value, "sCircleIdDeep1");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep1GreaterThanOrEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_1 >=", value, "sCircleIdDeep1");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep1LessThan(Integer value) {
            addCriterion("s_circle_id_deep_1 <", value, "sCircleIdDeep1");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep1LessThanOrEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_1 <=", value, "sCircleIdDeep1");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep1In(List<Integer> values) {
            addCriterion("s_circle_id_deep_1 in", values, "sCircleIdDeep1");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep1NotIn(List<Integer> values) {
            addCriterion("s_circle_id_deep_1 not in", values, "sCircleIdDeep1");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep1Between(Integer value1, Integer value2) {
            addCriterion("s_circle_id_deep_1 between", value1, value2, "sCircleIdDeep1");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep1NotBetween(Integer value1, Integer value2) {
            addCriterion("s_circle_id_deep_1 not between", value1, value2, "sCircleIdDeep1");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep2IsNull() {
            addCriterion("s_circle_id_deep_2 is null");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep2IsNotNull() {
            addCriterion("s_circle_id_deep_2 is not null");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep2EqualTo(Integer value) {
            addCriterion("s_circle_id_deep_2 =", value, "sCircleIdDeep2");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep2NotEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_2 <>", value, "sCircleIdDeep2");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep2GreaterThan(Integer value) {
            addCriterion("s_circle_id_deep_2 >", value, "sCircleIdDeep2");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep2GreaterThanOrEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_2 >=", value, "sCircleIdDeep2");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep2LessThan(Integer value) {
            addCriterion("s_circle_id_deep_2 <", value, "sCircleIdDeep2");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep2LessThanOrEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_2 <=", value, "sCircleIdDeep2");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep2In(List<Integer> values) {
            addCriterion("s_circle_id_deep_2 in", values, "sCircleIdDeep2");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep2NotIn(List<Integer> values) {
            addCriterion("s_circle_id_deep_2 not in", values, "sCircleIdDeep2");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep2Between(Integer value1, Integer value2) {
            addCriterion("s_circle_id_deep_2 between", value1, value2, "sCircleIdDeep2");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep2NotBetween(Integer value1, Integer value2) {
            addCriterion("s_circle_id_deep_2 not between", value1, value2, "sCircleIdDeep2");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep3IsNull() {
            addCriterion("s_circle_id_deep_3 is null");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep3IsNotNull() {
            addCriterion("s_circle_id_deep_3 is not null");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep3EqualTo(Integer value) {
            addCriterion("s_circle_id_deep_3 =", value, "sCircleIdDeep3");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep3NotEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_3 <>", value, "sCircleIdDeep3");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep3GreaterThan(Integer value) {
            addCriterion("s_circle_id_deep_3 >", value, "sCircleIdDeep3");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep3GreaterThanOrEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_3 >=", value, "sCircleIdDeep3");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep3LessThan(Integer value) {
            addCriterion("s_circle_id_deep_3 <", value, "sCircleIdDeep3");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep3LessThanOrEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_3 <=", value, "sCircleIdDeep3");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep3In(List<Integer> values) {
            addCriterion("s_circle_id_deep_3 in", values, "sCircleIdDeep3");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep3NotIn(List<Integer> values) {
            addCriterion("s_circle_id_deep_3 not in", values, "sCircleIdDeep3");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep3Between(Integer value1, Integer value2) {
            addCriterion("s_circle_id_deep_3 between", value1, value2, "sCircleIdDeep3");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep3NotBetween(Integer value1, Integer value2) {
            addCriterion("s_circle_id_deep_3 not between", value1, value2, "sCircleIdDeep3");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep4IsNull() {
            addCriterion("s_circle_id_deep_4 is null");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep4IsNotNull() {
            addCriterion("s_circle_id_deep_4 is not null");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep4EqualTo(Integer value) {
            addCriterion("s_circle_id_deep_4 =", value, "sCircleIdDeep4");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep4NotEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_4 <>", value, "sCircleIdDeep4");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep4GreaterThan(Integer value) {
            addCriterion("s_circle_id_deep_4 >", value, "sCircleIdDeep4");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep4GreaterThanOrEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_4 >=", value, "sCircleIdDeep4");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep4LessThan(Integer value) {
            addCriterion("s_circle_id_deep_4 <", value, "sCircleIdDeep4");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep4LessThanOrEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_4 <=", value, "sCircleIdDeep4");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep4In(List<Integer> values) {
            addCriterion("s_circle_id_deep_4 in", values, "sCircleIdDeep4");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep4NotIn(List<Integer> values) {
            addCriterion("s_circle_id_deep_4 not in", values, "sCircleIdDeep4");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep4Between(Integer value1, Integer value2) {
            addCriterion("s_circle_id_deep_4 between", value1, value2, "sCircleIdDeep4");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep4NotBetween(Integer value1, Integer value2) {
            addCriterion("s_circle_id_deep_4 not between", value1, value2, "sCircleIdDeep4");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep5IsNull() {
            addCriterion("s_circle_id_deep_5 is null");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep5IsNotNull() {
            addCriterion("s_circle_id_deep_5 is not null");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep5EqualTo(Integer value) {
            addCriterion("s_circle_id_deep_5 =", value, "sCircleIdDeep5");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep5NotEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_5 <>", value, "sCircleIdDeep5");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep5GreaterThan(Integer value) {
            addCriterion("s_circle_id_deep_5 >", value, "sCircleIdDeep5");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep5GreaterThanOrEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_5 >=", value, "sCircleIdDeep5");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep5LessThan(Integer value) {
            addCriterion("s_circle_id_deep_5 <", value, "sCircleIdDeep5");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep5LessThanOrEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_5 <=", value, "sCircleIdDeep5");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep5In(List<Integer> values) {
            addCriterion("s_circle_id_deep_5 in", values, "sCircleIdDeep5");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep5NotIn(List<Integer> values) {
            addCriterion("s_circle_id_deep_5 not in", values, "sCircleIdDeep5");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep5Between(Integer value1, Integer value2) {
            addCriterion("s_circle_id_deep_5 between", value1, value2, "sCircleIdDeep5");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep5NotBetween(Integer value1, Integer value2) {
            addCriterion("s_circle_id_deep_5 not between", value1, value2, "sCircleIdDeep5");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep6IsNull() {
            addCriterion("s_circle_id_deep_6 is null");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep6IsNotNull() {
            addCriterion("s_circle_id_deep_6 is not null");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep6EqualTo(Integer value) {
            addCriterion("s_circle_id_deep_6 =", value, "sCircleIdDeep6");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep6NotEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_6 <>", value, "sCircleIdDeep6");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep6GreaterThan(Integer value) {
            addCriterion("s_circle_id_deep_6 >", value, "sCircleIdDeep6");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep6GreaterThanOrEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_6 >=", value, "sCircleIdDeep6");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep6LessThan(Integer value) {
            addCriterion("s_circle_id_deep_6 <", value, "sCircleIdDeep6");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep6LessThanOrEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_6 <=", value, "sCircleIdDeep6");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep6In(List<Integer> values) {
            addCriterion("s_circle_id_deep_6 in", values, "sCircleIdDeep6");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep6NotIn(List<Integer> values) {
            addCriterion("s_circle_id_deep_6 not in", values, "sCircleIdDeep6");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep6Between(Integer value1, Integer value2) {
            addCriterion("s_circle_id_deep_6 between", value1, value2, "sCircleIdDeep6");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep6NotBetween(Integer value1, Integer value2) {
            addCriterion("s_circle_id_deep_6 not between", value1, value2, "sCircleIdDeep6");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep7IsNull() {
            addCriterion("s_circle_id_deep_7 is null");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep7IsNotNull() {
            addCriterion("s_circle_id_deep_7 is not null");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep7EqualTo(Integer value) {
            addCriterion("s_circle_id_deep_7 =", value, "sCircleIdDeep7");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep7NotEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_7 <>", value, "sCircleIdDeep7");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep7GreaterThan(Integer value) {
            addCriterion("s_circle_id_deep_7 >", value, "sCircleIdDeep7");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep7GreaterThanOrEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_7 >=", value, "sCircleIdDeep7");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep7LessThan(Integer value) {
            addCriterion("s_circle_id_deep_7 <", value, "sCircleIdDeep7");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep7LessThanOrEqualTo(Integer value) {
            addCriterion("s_circle_id_deep_7 <=", value, "sCircleIdDeep7");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep7In(List<Integer> values) {
            addCriterion("s_circle_id_deep_7 in", values, "sCircleIdDeep7");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep7NotIn(List<Integer> values) {
            addCriterion("s_circle_id_deep_7 not in", values, "sCircleIdDeep7");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep7Between(Integer value1, Integer value2) {
            addCriterion("s_circle_id_deep_7 between", value1, value2, "sCircleIdDeep7");
            return (Criteria) this;
        }

        public Criteria andSCircleIdDeep7NotBetween(Integer value1, Integer value2) {
            addCriterion("s_circle_id_deep_7 not between", value1, value2, "sCircleIdDeep7");
            return (Criteria) this;
        }

        public Criteria andSCircleNameIsNull() {
            addCriterion("s_circle_name is null");
            return (Criteria) this;
        }

        public Criteria andSCircleNameIsNotNull() {
            addCriterion("s_circle_name is not null");
            return (Criteria) this;
        }

        public Criteria andSCircleNameEqualTo(String value) {
            addCriterion("s_circle_name =", value, "sCircleName");
            return (Criteria) this;
        }

        public Criteria andSCircleNameNotEqualTo(String value) {
            addCriterion("s_circle_name <>", value, "sCircleName");
            return (Criteria) this;
        }

        public Criteria andSCircleNameGreaterThan(String value) {
            addCriterion("s_circle_name >", value, "sCircleName");
            return (Criteria) this;
        }

        public Criteria andSCircleNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_circle_name >=", value, "sCircleName");
            return (Criteria) this;
        }

        public Criteria andSCircleNameLessThan(String value) {
            addCriterion("s_circle_name <", value, "sCircleName");
            return (Criteria) this;
        }

        public Criteria andSCircleNameLessThanOrEqualTo(String value) {
            addCriterion("s_circle_name <=", value, "sCircleName");
            return (Criteria) this;
        }

        public Criteria andSCircleNameLike(String value) {
            addCriterion("s_circle_name like", value, "sCircleName");
            return (Criteria) this;
        }

        public Criteria andSCircleNameNotLike(String value) {
            addCriterion("s_circle_name not like", value, "sCircleName");
            return (Criteria) this;
        }

        public Criteria andSCircleNameIn(List<String> values) {
            addCriterion("s_circle_name in", values, "sCircleName");
            return (Criteria) this;
        }

        public Criteria andSCircleNameNotIn(List<String> values) {
            addCriterion("s_circle_name not in", values, "sCircleName");
            return (Criteria) this;
        }

        public Criteria andSCircleNameBetween(String value1, String value2) {
            addCriterion("s_circle_name between", value1, value2, "sCircleName");
            return (Criteria) this;
        }

        public Criteria andSCircleNameNotBetween(String value1, String value2) {
            addCriterion("s_circle_name not between", value1, value2, "sCircleName");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Long value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Long value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Long value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Long value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Long> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Long> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Long value1, Long value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("province_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("province_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("province_name =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("province_name <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("province_name >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_name >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("province_name <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("province_name <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("province_name like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("province_name not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("province_name in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("province_name not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("province_name between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("province_name not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Long value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Long value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Long value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Long value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Long value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Long> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Long> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Long value1, Long value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Long value1, Long value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(Long value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(Long value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(Long value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(Long value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(Long value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<Long> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<Long> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(Long value1, Long value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(Long value1, Long value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNull() {
            addCriterion("country_name is null");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNotNull() {
            addCriterion("country_name is not null");
            return (Criteria) this;
        }

        public Criteria andCountryNameEqualTo(String value) {
            addCriterion("country_name =", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotEqualTo(String value) {
            addCriterion("country_name <>", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThan(String value) {
            addCriterion("country_name >", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("country_name >=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThan(String value) {
            addCriterion("country_name <", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThanOrEqualTo(String value) {
            addCriterion("country_name <=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLike(String value) {
            addCriterion("country_name like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotLike(String value) {
            addCriterion("country_name not like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameIn(List<String> values) {
            addCriterion("country_name in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotIn(List<String> values) {
            addCriterion("country_name not in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameBetween(String value1, String value2) {
            addCriterion("country_name between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotBetween(String value1, String value2) {
            addCriterion("country_name not between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andTownshipIdIsNull() {
            addCriterion("township_id is null");
            return (Criteria) this;
        }

        public Criteria andTownshipIdIsNotNull() {
            addCriterion("township_id is not null");
            return (Criteria) this;
        }

        public Criteria andTownshipIdEqualTo(Long value) {
            addCriterion("township_id =", value, "townshipId");
            return (Criteria) this;
        }

        public Criteria andTownshipIdNotEqualTo(Long value) {
            addCriterion("township_id <>", value, "townshipId");
            return (Criteria) this;
        }

        public Criteria andTownshipIdGreaterThan(Long value) {
            addCriterion("township_id >", value, "townshipId");
            return (Criteria) this;
        }

        public Criteria andTownshipIdGreaterThanOrEqualTo(Long value) {
            addCriterion("township_id >=", value, "townshipId");
            return (Criteria) this;
        }

        public Criteria andTownshipIdLessThan(Long value) {
            addCriterion("township_id <", value, "townshipId");
            return (Criteria) this;
        }

        public Criteria andTownshipIdLessThanOrEqualTo(Long value) {
            addCriterion("township_id <=", value, "townshipId");
            return (Criteria) this;
        }

        public Criteria andTownshipIdIn(List<Long> values) {
            addCriterion("township_id in", values, "townshipId");
            return (Criteria) this;
        }

        public Criteria andTownshipIdNotIn(List<Long> values) {
            addCriterion("township_id not in", values, "townshipId");
            return (Criteria) this;
        }

        public Criteria andTownshipIdBetween(Long value1, Long value2) {
            addCriterion("township_id between", value1, value2, "townshipId");
            return (Criteria) this;
        }

        public Criteria andTownshipIdNotBetween(Long value1, Long value2) {
            addCriterion("township_id not between", value1, value2, "townshipId");
            return (Criteria) this;
        }

        public Criteria andTownshipNameIsNull() {
            addCriterion("township_name is null");
            return (Criteria) this;
        }

        public Criteria andTownshipNameIsNotNull() {
            addCriterion("township_name is not null");
            return (Criteria) this;
        }

        public Criteria andTownshipNameEqualTo(String value) {
            addCriterion("township_name =", value, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameNotEqualTo(String value) {
            addCriterion("township_name <>", value, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameGreaterThan(String value) {
            addCriterion("township_name >", value, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameGreaterThanOrEqualTo(String value) {
            addCriterion("township_name >=", value, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameLessThan(String value) {
            addCriterion("township_name <", value, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameLessThanOrEqualTo(String value) {
            addCriterion("township_name <=", value, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameLike(String value) {
            addCriterion("township_name like", value, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameNotLike(String value) {
            addCriterion("township_name not like", value, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameIn(List<String> values) {
            addCriterion("township_name in", values, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameNotIn(List<String> values) {
            addCriterion("township_name not in", values, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameBetween(String value1, String value2) {
            addCriterion("township_name between", value1, value2, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameNotBetween(String value1, String value2) {
            addCriterion("township_name not between", value1, value2, "townshipName");
            return (Criteria) this;
        }

        public Criteria andVillageIdIsNull() {
            addCriterion("village_id is null");
            return (Criteria) this;
        }

        public Criteria andVillageIdIsNotNull() {
            addCriterion("village_id is not null");
            return (Criteria) this;
        }

        public Criteria andVillageIdEqualTo(Long value) {
            addCriterion("village_id =", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotEqualTo(Long value) {
            addCriterion("village_id <>", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdGreaterThan(Long value) {
            addCriterion("village_id >", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("village_id >=", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdLessThan(Long value) {
            addCriterion("village_id <", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdLessThanOrEqualTo(Long value) {
            addCriterion("village_id <=", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdIn(List<Long> values) {
            addCriterion("village_id in", values, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotIn(List<Long> values) {
            addCriterion("village_id not in", values, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdBetween(Long value1, Long value2) {
            addCriterion("village_id between", value1, value2, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotBetween(Long value1, Long value2) {
            addCriterion("village_id not between", value1, value2, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageNameIsNull() {
            addCriterion("village_name is null");
            return (Criteria) this;
        }

        public Criteria andVillageNameIsNotNull() {
            addCriterion("village_name is not null");
            return (Criteria) this;
        }

        public Criteria andVillageNameEqualTo(String value) {
            addCriterion("village_name =", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameNotEqualTo(String value) {
            addCriterion("village_name <>", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameGreaterThan(String value) {
            addCriterion("village_name >", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameGreaterThanOrEqualTo(String value) {
            addCriterion("village_name >=", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameLessThan(String value) {
            addCriterion("village_name <", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameLessThanOrEqualTo(String value) {
            addCriterion("village_name <=", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameLike(String value) {
            addCriterion("village_name like", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameNotLike(String value) {
            addCriterion("village_name not like", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameIn(List<String> values) {
            addCriterion("village_name in", values, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameNotIn(List<String> values) {
            addCriterion("village_name not in", values, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameBetween(String value1, String value2) {
            addCriterion("village_name between", value1, value2, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameNotBetween(String value1, String value2) {
            addCriterion("village_name not between", value1, value2, "villageName");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdIsNull() {
            addCriterion("p_province_id is null");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdIsNotNull() {
            addCriterion("p_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdEqualTo(Long value) {
            addCriterion("p_province_id =", value, "pProvinceId");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdNotEqualTo(Long value) {
            addCriterion("p_province_id <>", value, "pProvinceId");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdGreaterThan(Long value) {
            addCriterion("p_province_id >", value, "pProvinceId");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("p_province_id >=", value, "pProvinceId");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdLessThan(Long value) {
            addCriterion("p_province_id <", value, "pProvinceId");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("p_province_id <=", value, "pProvinceId");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdIn(List<Long> values) {
            addCriterion("p_province_id in", values, "pProvinceId");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdNotIn(List<Long> values) {
            addCriterion("p_province_id not in", values, "pProvinceId");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdBetween(Long value1, Long value2) {
            addCriterion("p_province_id between", value1, value2, "pProvinceId");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("p_province_id not between", value1, value2, "pProvinceId");
            return (Criteria) this;
        }

        public Criteria andPProvinceNameIsNull() {
            addCriterion("p_province_name is null");
            return (Criteria) this;
        }

        public Criteria andPProvinceNameIsNotNull() {
            addCriterion("p_province_name is not null");
            return (Criteria) this;
        }

        public Criteria andPProvinceNameEqualTo(String value) {
            addCriterion("p_province_name =", value, "pProvinceName");
            return (Criteria) this;
        }

        public Criteria andPProvinceNameNotEqualTo(String value) {
            addCriterion("p_province_name <>", value, "pProvinceName");
            return (Criteria) this;
        }

        public Criteria andPProvinceNameGreaterThan(String value) {
            addCriterion("p_province_name >", value, "pProvinceName");
            return (Criteria) this;
        }

        public Criteria andPProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_province_name >=", value, "pProvinceName");
            return (Criteria) this;
        }

        public Criteria andPProvinceNameLessThan(String value) {
            addCriterion("p_province_name <", value, "pProvinceName");
            return (Criteria) this;
        }

        public Criteria andPProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("p_province_name <=", value, "pProvinceName");
            return (Criteria) this;
        }

        public Criteria andPProvinceNameLike(String value) {
            addCriterion("p_province_name like", value, "pProvinceName");
            return (Criteria) this;
        }

        public Criteria andPProvinceNameNotLike(String value) {
            addCriterion("p_province_name not like", value, "pProvinceName");
            return (Criteria) this;
        }

        public Criteria andPProvinceNameIn(List<String> values) {
            addCriterion("p_province_name in", values, "pProvinceName");
            return (Criteria) this;
        }

        public Criteria andPProvinceNameNotIn(List<String> values) {
            addCriterion("p_province_name not in", values, "pProvinceName");
            return (Criteria) this;
        }

        public Criteria andPProvinceNameBetween(String value1, String value2) {
            addCriterion("p_province_name between", value1, value2, "pProvinceName");
            return (Criteria) this;
        }

        public Criteria andPProvinceNameNotBetween(String value1, String value2) {
            addCriterion("p_province_name not between", value1, value2, "pProvinceName");
            return (Criteria) this;
        }

        public Criteria andPCityIdIsNull() {
            addCriterion("p_city_id is null");
            return (Criteria) this;
        }

        public Criteria andPCityIdIsNotNull() {
            addCriterion("p_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andPCityIdEqualTo(Long value) {
            addCriterion("p_city_id =", value, "pCityId");
            return (Criteria) this;
        }

        public Criteria andPCityIdNotEqualTo(Long value) {
            addCriterion("p_city_id <>", value, "pCityId");
            return (Criteria) this;
        }

        public Criteria andPCityIdGreaterThan(Long value) {
            addCriterion("p_city_id >", value, "pCityId");
            return (Criteria) this;
        }

        public Criteria andPCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("p_city_id >=", value, "pCityId");
            return (Criteria) this;
        }

        public Criteria andPCityIdLessThan(Long value) {
            addCriterion("p_city_id <", value, "pCityId");
            return (Criteria) this;
        }

        public Criteria andPCityIdLessThanOrEqualTo(Long value) {
            addCriterion("p_city_id <=", value, "pCityId");
            return (Criteria) this;
        }

        public Criteria andPCityIdIn(List<Long> values) {
            addCriterion("p_city_id in", values, "pCityId");
            return (Criteria) this;
        }

        public Criteria andPCityIdNotIn(List<Long> values) {
            addCriterion("p_city_id not in", values, "pCityId");
            return (Criteria) this;
        }

        public Criteria andPCityIdBetween(Long value1, Long value2) {
            addCriterion("p_city_id between", value1, value2, "pCityId");
            return (Criteria) this;
        }

        public Criteria andPCityIdNotBetween(Long value1, Long value2) {
            addCriterion("p_city_id not between", value1, value2, "pCityId");
            return (Criteria) this;
        }

        public Criteria andPCityNameIsNull() {
            addCriterion("p_city_name is null");
            return (Criteria) this;
        }

        public Criteria andPCityNameIsNotNull() {
            addCriterion("p_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andPCityNameEqualTo(String value) {
            addCriterion("p_city_name =", value, "pCityName");
            return (Criteria) this;
        }

        public Criteria andPCityNameNotEqualTo(String value) {
            addCriterion("p_city_name <>", value, "pCityName");
            return (Criteria) this;
        }

        public Criteria andPCityNameGreaterThan(String value) {
            addCriterion("p_city_name >", value, "pCityName");
            return (Criteria) this;
        }

        public Criteria andPCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_city_name >=", value, "pCityName");
            return (Criteria) this;
        }

        public Criteria andPCityNameLessThan(String value) {
            addCriterion("p_city_name <", value, "pCityName");
            return (Criteria) this;
        }

        public Criteria andPCityNameLessThanOrEqualTo(String value) {
            addCriterion("p_city_name <=", value, "pCityName");
            return (Criteria) this;
        }

        public Criteria andPCityNameLike(String value) {
            addCriterion("p_city_name like", value, "pCityName");
            return (Criteria) this;
        }

        public Criteria andPCityNameNotLike(String value) {
            addCriterion("p_city_name not like", value, "pCityName");
            return (Criteria) this;
        }

        public Criteria andPCityNameIn(List<String> values) {
            addCriterion("p_city_name in", values, "pCityName");
            return (Criteria) this;
        }

        public Criteria andPCityNameNotIn(List<String> values) {
            addCriterion("p_city_name not in", values, "pCityName");
            return (Criteria) this;
        }

        public Criteria andPCityNameBetween(String value1, String value2) {
            addCriterion("p_city_name between", value1, value2, "pCityName");
            return (Criteria) this;
        }

        public Criteria andPCityNameNotBetween(String value1, String value2) {
            addCriterion("p_city_name not between", value1, value2, "pCityName");
            return (Criteria) this;
        }

        public Criteria andPCountryIdIsNull() {
            addCriterion("p_country_id is null");
            return (Criteria) this;
        }

        public Criteria andPCountryIdIsNotNull() {
            addCriterion("p_country_id is not null");
            return (Criteria) this;
        }

        public Criteria andPCountryIdEqualTo(Long value) {
            addCriterion("p_country_id =", value, "pCountryId");
            return (Criteria) this;
        }

        public Criteria andPCountryIdNotEqualTo(Long value) {
            addCriterion("p_country_id <>", value, "pCountryId");
            return (Criteria) this;
        }

        public Criteria andPCountryIdGreaterThan(Long value) {
            addCriterion("p_country_id >", value, "pCountryId");
            return (Criteria) this;
        }

        public Criteria andPCountryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("p_country_id >=", value, "pCountryId");
            return (Criteria) this;
        }

        public Criteria andPCountryIdLessThan(Long value) {
            addCriterion("p_country_id <", value, "pCountryId");
            return (Criteria) this;
        }

        public Criteria andPCountryIdLessThanOrEqualTo(Long value) {
            addCriterion("p_country_id <=", value, "pCountryId");
            return (Criteria) this;
        }

        public Criteria andPCountryIdIn(List<Long> values) {
            addCriterion("p_country_id in", values, "pCountryId");
            return (Criteria) this;
        }

        public Criteria andPCountryIdNotIn(List<Long> values) {
            addCriterion("p_country_id not in", values, "pCountryId");
            return (Criteria) this;
        }

        public Criteria andPCountryIdBetween(Long value1, Long value2) {
            addCriterion("p_country_id between", value1, value2, "pCountryId");
            return (Criteria) this;
        }

        public Criteria andPCountryIdNotBetween(Long value1, Long value2) {
            addCriterion("p_country_id not between", value1, value2, "pCountryId");
            return (Criteria) this;
        }

        public Criteria andPCountryNameIsNull() {
            addCriterion("p_country_name is null");
            return (Criteria) this;
        }

        public Criteria andPCountryNameIsNotNull() {
            addCriterion("p_country_name is not null");
            return (Criteria) this;
        }

        public Criteria andPCountryNameEqualTo(String value) {
            addCriterion("p_country_name =", value, "pCountryName");
            return (Criteria) this;
        }

        public Criteria andPCountryNameNotEqualTo(String value) {
            addCriterion("p_country_name <>", value, "pCountryName");
            return (Criteria) this;
        }

        public Criteria andPCountryNameGreaterThan(String value) {
            addCriterion("p_country_name >", value, "pCountryName");
            return (Criteria) this;
        }

        public Criteria andPCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_country_name >=", value, "pCountryName");
            return (Criteria) this;
        }

        public Criteria andPCountryNameLessThan(String value) {
            addCriterion("p_country_name <", value, "pCountryName");
            return (Criteria) this;
        }

        public Criteria andPCountryNameLessThanOrEqualTo(String value) {
            addCriterion("p_country_name <=", value, "pCountryName");
            return (Criteria) this;
        }

        public Criteria andPCountryNameLike(String value) {
            addCriterion("p_country_name like", value, "pCountryName");
            return (Criteria) this;
        }

        public Criteria andPCountryNameNotLike(String value) {
            addCriterion("p_country_name not like", value, "pCountryName");
            return (Criteria) this;
        }

        public Criteria andPCountryNameIn(List<String> values) {
            addCriterion("p_country_name in", values, "pCountryName");
            return (Criteria) this;
        }

        public Criteria andPCountryNameNotIn(List<String> values) {
            addCriterion("p_country_name not in", values, "pCountryName");
            return (Criteria) this;
        }

        public Criteria andPCountryNameBetween(String value1, String value2) {
            addCriterion("p_country_name between", value1, value2, "pCountryName");
            return (Criteria) this;
        }

        public Criteria andPCountryNameNotBetween(String value1, String value2) {
            addCriterion("p_country_name not between", value1, value2, "pCountryName");
            return (Criteria) this;
        }

        public Criteria andPTownshipIdIsNull() {
            addCriterion("p_township_id is null");
            return (Criteria) this;
        }

        public Criteria andPTownshipIdIsNotNull() {
            addCriterion("p_township_id is not null");
            return (Criteria) this;
        }

        public Criteria andPTownshipIdEqualTo(Long value) {
            addCriterion("p_township_id =", value, "pTownshipId");
            return (Criteria) this;
        }

        public Criteria andPTownshipIdNotEqualTo(Long value) {
            addCriterion("p_township_id <>", value, "pTownshipId");
            return (Criteria) this;
        }

        public Criteria andPTownshipIdGreaterThan(Long value) {
            addCriterion("p_township_id >", value, "pTownshipId");
            return (Criteria) this;
        }

        public Criteria andPTownshipIdGreaterThanOrEqualTo(Long value) {
            addCriterion("p_township_id >=", value, "pTownshipId");
            return (Criteria) this;
        }

        public Criteria andPTownshipIdLessThan(Long value) {
            addCriterion("p_township_id <", value, "pTownshipId");
            return (Criteria) this;
        }

        public Criteria andPTownshipIdLessThanOrEqualTo(Long value) {
            addCriterion("p_township_id <=", value, "pTownshipId");
            return (Criteria) this;
        }

        public Criteria andPTownshipIdIn(List<Long> values) {
            addCriterion("p_township_id in", values, "pTownshipId");
            return (Criteria) this;
        }

        public Criteria andPTownshipIdNotIn(List<Long> values) {
            addCriterion("p_township_id not in", values, "pTownshipId");
            return (Criteria) this;
        }

        public Criteria andPTownshipIdBetween(Long value1, Long value2) {
            addCriterion("p_township_id between", value1, value2, "pTownshipId");
            return (Criteria) this;
        }

        public Criteria andPTownshipIdNotBetween(Long value1, Long value2) {
            addCriterion("p_township_id not between", value1, value2, "pTownshipId");
            return (Criteria) this;
        }

        public Criteria andPTownshipNameIsNull() {
            addCriterion("p_township_name is null");
            return (Criteria) this;
        }

        public Criteria andPTownshipNameIsNotNull() {
            addCriterion("p_township_name is not null");
            return (Criteria) this;
        }

        public Criteria andPTownshipNameEqualTo(String value) {
            addCriterion("p_township_name =", value, "pTownshipName");
            return (Criteria) this;
        }

        public Criteria andPTownshipNameNotEqualTo(String value) {
            addCriterion("p_township_name <>", value, "pTownshipName");
            return (Criteria) this;
        }

        public Criteria andPTownshipNameGreaterThan(String value) {
            addCriterion("p_township_name >", value, "pTownshipName");
            return (Criteria) this;
        }

        public Criteria andPTownshipNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_township_name >=", value, "pTownshipName");
            return (Criteria) this;
        }

        public Criteria andPTownshipNameLessThan(String value) {
            addCriterion("p_township_name <", value, "pTownshipName");
            return (Criteria) this;
        }

        public Criteria andPTownshipNameLessThanOrEqualTo(String value) {
            addCriterion("p_township_name <=", value, "pTownshipName");
            return (Criteria) this;
        }

        public Criteria andPTownshipNameLike(String value) {
            addCriterion("p_township_name like", value, "pTownshipName");
            return (Criteria) this;
        }

        public Criteria andPTownshipNameNotLike(String value) {
            addCriterion("p_township_name not like", value, "pTownshipName");
            return (Criteria) this;
        }

        public Criteria andPTownshipNameIn(List<String> values) {
            addCriterion("p_township_name in", values, "pTownshipName");
            return (Criteria) this;
        }

        public Criteria andPTownshipNameNotIn(List<String> values) {
            addCriterion("p_township_name not in", values, "pTownshipName");
            return (Criteria) this;
        }

        public Criteria andPTownshipNameBetween(String value1, String value2) {
            addCriterion("p_township_name between", value1, value2, "pTownshipName");
            return (Criteria) this;
        }

        public Criteria andPTownshipNameNotBetween(String value1, String value2) {
            addCriterion("p_township_name not between", value1, value2, "pTownshipName");
            return (Criteria) this;
        }

        public Criteria andPVillageIdIsNull() {
            addCriterion("p_village_id is null");
            return (Criteria) this;
        }

        public Criteria andPVillageIdIsNotNull() {
            addCriterion("p_village_id is not null");
            return (Criteria) this;
        }

        public Criteria andPVillageIdEqualTo(Long value) {
            addCriterion("p_village_id =", value, "pVillageId");
            return (Criteria) this;
        }

        public Criteria andPVillageIdNotEqualTo(Long value) {
            addCriterion("p_village_id <>", value, "pVillageId");
            return (Criteria) this;
        }

        public Criteria andPVillageIdGreaterThan(Long value) {
            addCriterion("p_village_id >", value, "pVillageId");
            return (Criteria) this;
        }

        public Criteria andPVillageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("p_village_id >=", value, "pVillageId");
            return (Criteria) this;
        }

        public Criteria andPVillageIdLessThan(Long value) {
            addCriterion("p_village_id <", value, "pVillageId");
            return (Criteria) this;
        }

        public Criteria andPVillageIdLessThanOrEqualTo(Long value) {
            addCriterion("p_village_id <=", value, "pVillageId");
            return (Criteria) this;
        }

        public Criteria andPVillageIdIn(List<Long> values) {
            addCriterion("p_village_id in", values, "pVillageId");
            return (Criteria) this;
        }

        public Criteria andPVillageIdNotIn(List<Long> values) {
            addCriterion("p_village_id not in", values, "pVillageId");
            return (Criteria) this;
        }

        public Criteria andPVillageIdBetween(Long value1, Long value2) {
            addCriterion("p_village_id between", value1, value2, "pVillageId");
            return (Criteria) this;
        }

        public Criteria andPVillageIdNotBetween(Long value1, Long value2) {
            addCriterion("p_village_id not between", value1, value2, "pVillageId");
            return (Criteria) this;
        }

        public Criteria andPVillageNameIsNull() {
            addCriterion("p_village_name is null");
            return (Criteria) this;
        }

        public Criteria andPVillageNameIsNotNull() {
            addCriterion("p_village_name is not null");
            return (Criteria) this;
        }

        public Criteria andPVillageNameEqualTo(String value) {
            addCriterion("p_village_name =", value, "pVillageName");
            return (Criteria) this;
        }

        public Criteria andPVillageNameNotEqualTo(String value) {
            addCriterion("p_village_name <>", value, "pVillageName");
            return (Criteria) this;
        }

        public Criteria andPVillageNameGreaterThan(String value) {
            addCriterion("p_village_name >", value, "pVillageName");
            return (Criteria) this;
        }

        public Criteria andPVillageNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_village_name >=", value, "pVillageName");
            return (Criteria) this;
        }

        public Criteria andPVillageNameLessThan(String value) {
            addCriterion("p_village_name <", value, "pVillageName");
            return (Criteria) this;
        }

        public Criteria andPVillageNameLessThanOrEqualTo(String value) {
            addCriterion("p_village_name <=", value, "pVillageName");
            return (Criteria) this;
        }

        public Criteria andPVillageNameLike(String value) {
            addCriterion("p_village_name like", value, "pVillageName");
            return (Criteria) this;
        }

        public Criteria andPVillageNameNotLike(String value) {
            addCriterion("p_village_name not like", value, "pVillageName");
            return (Criteria) this;
        }

        public Criteria andPVillageNameIn(List<String> values) {
            addCriterion("p_village_name in", values, "pVillageName");
            return (Criteria) this;
        }

        public Criteria andPVillageNameNotIn(List<String> values) {
            addCriterion("p_village_name not in", values, "pVillageName");
            return (Criteria) this;
        }

        public Criteria andPVillageNameBetween(String value1, String value2) {
            addCriterion("p_village_name between", value1, value2, "pVillageName");
            return (Criteria) this;
        }

        public Criteria andPVillageNameNotBetween(String value1, String value2) {
            addCriterion("p_village_name not between", value1, value2, "pVillageName");
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

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Integer value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Integer value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Integer value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Integer value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Integer> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Integer> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNull() {
            addCriterion("seller_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("seller_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("seller_name =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("seller_name <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("seller_name >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_name >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("seller_name <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("seller_name <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("seller_name like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("seller_name not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("seller_name in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("seller_name not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("seller_name between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("seller_name not between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerTypeIsNull() {
            addCriterion("seller_type is null");
            return (Criteria) this;
        }

        public Criteria andSellerTypeIsNotNull() {
            addCriterion("seller_type is not null");
            return (Criteria) this;
        }

        public Criteria andSellerTypeEqualTo(Boolean value) {
            addCriterion("seller_type =", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeNotEqualTo(Boolean value) {
            addCriterion("seller_type <>", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeGreaterThan(Boolean value) {
            addCriterion("seller_type >", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("seller_type >=", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeLessThan(Boolean value) {
            addCriterion("seller_type <", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("seller_type <=", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeIn(List<Boolean> values) {
            addCriterion("seller_type in", values, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeNotIn(List<Boolean> values) {
            addCriterion("seller_type not in", values, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("seller_type between", value1, value2, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("seller_type not between", value1, value2, "sellerType");
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

        public Criteria andGoodsNumIsNull() {
            addCriterion("goods_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNotNull() {
            addCriterion("goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumEqualTo(Integer value) {
            addCriterion("goods_num =", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotEqualTo(Integer value) {
            addCriterion("goods_num <>", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThan(Integer value) {
            addCriterion("goods_num >", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_num >=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThan(Integer value) {
            addCriterion("goods_num <", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("goods_num <=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIn(List<Integer> values) {
            addCriterion("goods_num in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotIn(List<Integer> values) {
            addCriterion("goods_num not in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("goods_num between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_num not between", value1, value2, "goodsNum");
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

        public Criteria andUnionIdIsNull() {
            addCriterion("union_id is null");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNotNull() {
            addCriterion("union_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnionIdEqualTo(Integer value) {
            addCriterion("union_id =", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotEqualTo(Integer value) {
            addCriterion("union_id <>", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThan(Integer value) {
            addCriterion("union_id >", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("union_id >=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThan(Integer value) {
            addCriterion("union_id <", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThanOrEqualTo(Integer value) {
            addCriterion("union_id <=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIn(List<Integer> values) {
            addCriterion("union_id in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotIn(List<Integer> values) {
            addCriterion("union_id not in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdBetween(Integer value1, Integer value2) {
            addCriterion("union_id between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("union_id not between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionNameIsNull() {
            addCriterion("union_name is null");
            return (Criteria) this;
        }

        public Criteria andUnionNameIsNotNull() {
            addCriterion("union_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnionNameEqualTo(String value) {
            addCriterion("union_name =", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameNotEqualTo(String value) {
            addCriterion("union_name <>", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameGreaterThan(String value) {
            addCriterion("union_name >", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameGreaterThanOrEqualTo(String value) {
            addCriterion("union_name >=", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameLessThan(String value) {
            addCriterion("union_name <", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameLessThanOrEqualTo(String value) {
            addCriterion("union_name <=", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameLike(String value) {
            addCriterion("union_name like", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameNotLike(String value) {
            addCriterion("union_name not like", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameIn(List<String> values) {
            addCriterion("union_name in", values, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameNotIn(List<String> values) {
            addCriterion("union_name not in", values, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameBetween(String value1, String value2) {
            addCriterion("union_name between", value1, value2, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameNotBetween(String value1, String value2) {
            addCriterion("union_name not between", value1, value2, "unionName");
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
    }

    /**
     * 描述:order_statistics_base_data表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2018-01-08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * order_statistics_base_data 2018-01-08
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