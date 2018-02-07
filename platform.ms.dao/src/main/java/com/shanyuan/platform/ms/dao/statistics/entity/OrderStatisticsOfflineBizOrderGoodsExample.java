package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderStatisticsOfflineBizOrderGoodsExample {
    /**
     * order_statistics_offline_biz_order_goods
     */
    protected String orderByClause;

    /**
     * order_statistics_offline_biz_order_goods
     */
    protected boolean distinct;

    /**
     * order_statistics_offline_biz_order_goods
     */
    protected List<Criteria> oredCriteria;

    public OrderStatisticsOfflineBizOrderGoodsExample() {
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
     * order_statistics_offline_biz_order_goods 2018-01-04
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
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

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
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

        public Criteria andPubisherIdIsNull() {
            addCriterion("pubisher_id is null");
            return (Criteria) this;
        }

        public Criteria andPubisherIdIsNotNull() {
            addCriterion("pubisher_id is not null");
            return (Criteria) this;
        }

        public Criteria andPubisherIdEqualTo(Integer value) {
            addCriterion("pubisher_id =", value, "pubisherId");
            return (Criteria) this;
        }

        public Criteria andPubisherIdNotEqualTo(Integer value) {
            addCriterion("pubisher_id <>", value, "pubisherId");
            return (Criteria) this;
        }

        public Criteria andPubisherIdGreaterThan(Integer value) {
            addCriterion("pubisher_id >", value, "pubisherId");
            return (Criteria) this;
        }

        public Criteria andPubisherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pubisher_id >=", value, "pubisherId");
            return (Criteria) this;
        }

        public Criteria andPubisherIdLessThan(Integer value) {
            addCriterion("pubisher_id <", value, "pubisherId");
            return (Criteria) this;
        }

        public Criteria andPubisherIdLessThanOrEqualTo(Integer value) {
            addCriterion("pubisher_id <=", value, "pubisherId");
            return (Criteria) this;
        }

        public Criteria andPubisherIdIn(List<Integer> values) {
            addCriterion("pubisher_id in", values, "pubisherId");
            return (Criteria) this;
        }

        public Criteria andPubisherIdNotIn(List<Integer> values) {
            addCriterion("pubisher_id not in", values, "pubisherId");
            return (Criteria) this;
        }

        public Criteria andPubisherIdBetween(Integer value1, Integer value2) {
            addCriterion("pubisher_id between", value1, value2, "pubisherId");
            return (Criteria) this;
        }

        public Criteria andPubisherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pubisher_id not between", value1, value2, "pubisherId");
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

        public Criteria andPrivinceNameIsNull() {
            addCriterion("privince_name is null");
            return (Criteria) this;
        }

        public Criteria andPrivinceNameIsNotNull() {
            addCriterion("privince_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrivinceNameEqualTo(String value) {
            addCriterion("privince_name =", value, "privinceName");
            return (Criteria) this;
        }

        public Criteria andPrivinceNameNotEqualTo(String value) {
            addCriterion("privince_name <>", value, "privinceName");
            return (Criteria) this;
        }

        public Criteria andPrivinceNameGreaterThan(String value) {
            addCriterion("privince_name >", value, "privinceName");
            return (Criteria) this;
        }

        public Criteria andPrivinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("privince_name >=", value, "privinceName");
            return (Criteria) this;
        }

        public Criteria andPrivinceNameLessThan(String value) {
            addCriterion("privince_name <", value, "privinceName");
            return (Criteria) this;
        }

        public Criteria andPrivinceNameLessThanOrEqualTo(String value) {
            addCriterion("privince_name <=", value, "privinceName");
            return (Criteria) this;
        }

        public Criteria andPrivinceNameLike(String value) {
            addCriterion("privince_name like", value, "privinceName");
            return (Criteria) this;
        }

        public Criteria andPrivinceNameNotLike(String value) {
            addCriterion("privince_name not like", value, "privinceName");
            return (Criteria) this;
        }

        public Criteria andPrivinceNameIn(List<String> values) {
            addCriterion("privince_name in", values, "privinceName");
            return (Criteria) this;
        }

        public Criteria andPrivinceNameNotIn(List<String> values) {
            addCriterion("privince_name not in", values, "privinceName");
            return (Criteria) this;
        }

        public Criteria andPrivinceNameBetween(String value1, String value2) {
            addCriterion("privince_name between", value1, value2, "privinceName");
            return (Criteria) this;
        }

        public Criteria andPrivinceNameNotBetween(String value1, String value2) {
            addCriterion("privince_name not between", value1, value2, "privinceName");
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
    }

    /**
     * 描述:order_statistics_offline_biz_order_goods表的实体类
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
     * order_statistics_offline_biz_order_goods 2018-01-04
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