package com.shanyuan.platform.ms.dao.omorder.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OmOrderGoodsExample {
    /**
     * om_order_goods
     */
    protected String orderByClause;

    /**
     * om_order_goods
     */
    protected boolean distinct;

    /**
     * om_order_goods
     */
    protected List<Criteria> oredCriteria;

    public OmOrderGoodsExample() {
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
     * om_order_goods 2017-11-11
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

        public Criteria andInsIdIsNull() {
            addCriterion("ins_id is null");
            return (Criteria) this;
        }

        public Criteria andInsIdIsNotNull() {
            addCriterion("ins_id is not null");
            return (Criteria) this;
        }

        public Criteria andInsIdEqualTo(Integer value) {
            addCriterion("ins_id =", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdNotEqualTo(Integer value) {
            addCriterion("ins_id <>", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdGreaterThan(Integer value) {
            addCriterion("ins_id >", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ins_id >=", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdLessThan(Integer value) {
            addCriterion("ins_id <", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ins_id <=", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdIn(List<Integer> values) {
            addCriterion("ins_id in", values, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdNotIn(List<Integer> values) {
            addCriterion("ins_id not in", values, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdBetween(Integer value1, Integer value2) {
            addCriterion("ins_id between", value1, value2, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ins_id not between", value1, value2, "insId");
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

        public Criteria andGoodsCommonIdIsNull() {
            addCriterion("goods_common_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdIsNotNull() {
            addCriterion("goods_common_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdEqualTo(Integer value) {
            addCriterion("goods_common_id =", value, "goodsCommonId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdNotEqualTo(Integer value) {
            addCriterion("goods_common_id <>", value, "goodsCommonId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdGreaterThan(Integer value) {
            addCriterion("goods_common_id >", value, "goodsCommonId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_common_id >=", value, "goodsCommonId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdLessThan(Integer value) {
            addCriterion("goods_common_id <", value, "goodsCommonId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_common_id <=", value, "goodsCommonId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdIn(List<Integer> values) {
            addCriterion("goods_common_id in", values, "goodsCommonId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdNotIn(List<Integer> values) {
            addCriterion("goods_common_id not in", values, "goodsCommonId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_common_id between", value1, value2, "goodsCommonId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_common_id not between", value1, value2, "goodsCommonId");
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

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsPointIsNull() {
            addCriterion("goods_point is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPointIsNotNull() {
            addCriterion("goods_point is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPointEqualTo(Integer value) {
            addCriterion("goods_point =", value, "goodsPoint");
            return (Criteria) this;
        }

        public Criteria andGoodsPointNotEqualTo(Integer value) {
            addCriterion("goods_point <>", value, "goodsPoint");
            return (Criteria) this;
        }

        public Criteria andGoodsPointGreaterThan(Integer value) {
            addCriterion("goods_point >", value, "goodsPoint");
            return (Criteria) this;
        }

        public Criteria andGoodsPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_point >=", value, "goodsPoint");
            return (Criteria) this;
        }

        public Criteria andGoodsPointLessThan(Integer value) {
            addCriterion("goods_point <", value, "goodsPoint");
            return (Criteria) this;
        }

        public Criteria andGoodsPointLessThanOrEqualTo(Integer value) {
            addCriterion("goods_point <=", value, "goodsPoint");
            return (Criteria) this;
        }

        public Criteria andGoodsPointIn(List<Integer> values) {
            addCriterion("goods_point in", values, "goodsPoint");
            return (Criteria) this;
        }

        public Criteria andGoodsPointNotIn(List<Integer> values) {
            addCriterion("goods_point not in", values, "goodsPoint");
            return (Criteria) this;
        }

        public Criteria andGoodsPointBetween(Integer value1, Integer value2) {
            addCriterion("goods_point between", value1, value2, "goodsPoint");
            return (Criteria) this;
        }

        public Criteria andGoodsPointNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_point not between", value1, value2, "goodsPoint");
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

        public Criteria andGoodsPriceEqualTo(Integer value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(Integer value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(Integer value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(Integer value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(Integer value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<Integer> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<Integer> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(Integer value1, Integer value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
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

        public Criteria andGoodsImageIsNull() {
            addCriterion("goods_image is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIsNotNull() {
            addCriterion("goods_image is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageEqualTo(String value) {
            addCriterion("goods_image =", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotEqualTo(String value) {
            addCriterion("goods_image <>", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageGreaterThan(String value) {
            addCriterion("goods_image >", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageGreaterThanOrEqualTo(String value) {
            addCriterion("goods_image >=", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLessThan(String value) {
            addCriterion("goods_image <", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLessThanOrEqualTo(String value) {
            addCriterion("goods_image <=", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLike(String value) {
            addCriterion("goods_image like", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotLike(String value) {
            addCriterion("goods_image not like", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIn(List<String> values) {
            addCriterion("goods_image in", values, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotIn(List<String> values) {
            addCriterion("goods_image not in", values, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageBetween(String value1, String value2) {
            addCriterion("goods_image between", value1, value2, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotBetween(String value1, String value2) {
            addCriterion("goods_image not between", value1, value2, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPriceIsNull() {
            addCriterion("goods_amount_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPriceIsNotNull() {
            addCriterion("goods_amount_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPriceEqualTo(Integer value) {
            addCriterion("goods_amount_price =", value, "goodsAmountPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPriceNotEqualTo(Integer value) {
            addCriterion("goods_amount_price <>", value, "goodsAmountPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPriceGreaterThan(Integer value) {
            addCriterion("goods_amount_price >", value, "goodsAmountPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_amount_price >=", value, "goodsAmountPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPriceLessThan(Integer value) {
            addCriterion("goods_amount_price <", value, "goodsAmountPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPriceLessThanOrEqualTo(Integer value) {
            addCriterion("goods_amount_price <=", value, "goodsAmountPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPriceIn(List<Integer> values) {
            addCriterion("goods_amount_price in", values, "goodsAmountPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPriceNotIn(List<Integer> values) {
            addCriterion("goods_amount_price not in", values, "goodsAmountPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPriceBetween(Integer value1, Integer value2) {
            addCriterion("goods_amount_price between", value1, value2, "goodsAmountPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_amount_price not between", value1, value2, "goodsAmountPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPointIsNull() {
            addCriterion("goods_amount_point is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPointIsNotNull() {
            addCriterion("goods_amount_point is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPointEqualTo(Integer value) {
            addCriterion("goods_amount_point =", value, "goodsAmountPoint");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPointNotEqualTo(Integer value) {
            addCriterion("goods_amount_point <>", value, "goodsAmountPoint");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPointGreaterThan(Integer value) {
            addCriterion("goods_amount_point >", value, "goodsAmountPoint");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_amount_point >=", value, "goodsAmountPoint");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPointLessThan(Integer value) {
            addCriterion("goods_amount_point <", value, "goodsAmountPoint");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPointLessThanOrEqualTo(Integer value) {
            addCriterion("goods_amount_point <=", value, "goodsAmountPoint");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPointIn(List<Integer> values) {
            addCriterion("goods_amount_point in", values, "goodsAmountPoint");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPointNotIn(List<Integer> values) {
            addCriterion("goods_amount_point not in", values, "goodsAmountPoint");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPointBetween(Integer value1, Integer value2) {
            addCriterion("goods_amount_point between", value1, value2, "goodsAmountPoint");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountPointNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_amount_point not between", value1, value2, "goodsAmountPoint");
            return (Criteria) this;
        }

        public Criteria andGoodsHelpRateIsNull() {
            addCriterion("goods_help_rate is null");
            return (Criteria) this;
        }

        public Criteria andGoodsHelpRateIsNotNull() {
            addCriterion("goods_help_rate is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsHelpRateEqualTo(Integer value) {
            addCriterion("goods_help_rate =", value, "goodsHelpRate");
            return (Criteria) this;
        }

        public Criteria andGoodsHelpRateNotEqualTo(Integer value) {
            addCriterion("goods_help_rate <>", value, "goodsHelpRate");
            return (Criteria) this;
        }

        public Criteria andGoodsHelpRateGreaterThan(Integer value) {
            addCriterion("goods_help_rate >", value, "goodsHelpRate");
            return (Criteria) this;
        }

        public Criteria andGoodsHelpRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_help_rate >=", value, "goodsHelpRate");
            return (Criteria) this;
        }

        public Criteria andGoodsHelpRateLessThan(Integer value) {
            addCriterion("goods_help_rate <", value, "goodsHelpRate");
            return (Criteria) this;
        }

        public Criteria andGoodsHelpRateLessThanOrEqualTo(Integer value) {
            addCriterion("goods_help_rate <=", value, "goodsHelpRate");
            return (Criteria) this;
        }

        public Criteria andGoodsHelpRateIn(List<Integer> values) {
            addCriterion("goods_help_rate in", values, "goodsHelpRate");
            return (Criteria) this;
        }

        public Criteria andGoodsHelpRateNotIn(List<Integer> values) {
            addCriterion("goods_help_rate not in", values, "goodsHelpRate");
            return (Criteria) this;
        }

        public Criteria andGoodsHelpRateBetween(Integer value1, Integer value2) {
            addCriterion("goods_help_rate between", value1, value2, "goodsHelpRate");
            return (Criteria) this;
        }

        public Criteria andGoodsHelpRateNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_help_rate not between", value1, value2, "goodsHelpRate");
            return (Criteria) this;
        }

        public Criteria andShareIdIsNull() {
            addCriterion("share_id is null");
            return (Criteria) this;
        }

        public Criteria andShareIdIsNotNull() {
            addCriterion("share_id is not null");
            return (Criteria) this;
        }

        public Criteria andShareIdEqualTo(Integer value) {
            addCriterion("share_id =", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdNotEqualTo(Integer value) {
            addCriterion("share_id <>", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdGreaterThan(Integer value) {
            addCriterion("share_id >", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_id >=", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdLessThan(Integer value) {
            addCriterion("share_id <", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdLessThanOrEqualTo(Integer value) {
            addCriterion("share_id <=", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdIn(List<Integer> values) {
            addCriterion("share_id in", values, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdNotIn(List<Integer> values) {
            addCriterion("share_id not in", values, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdBetween(Integer value1, Integer value2) {
            addCriterion("share_id between", value1, value2, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdNotBetween(Integer value1, Integer value2) {
            addCriterion("share_id not between", value1, value2, "shareId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIsNull() {
            addCriterion("goods_spec is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIsNotNull() {
            addCriterion("goods_spec is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecEqualTo(String value) {
            addCriterion("goods_spec =", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotEqualTo(String value) {
            addCriterion("goods_spec <>", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecGreaterThan(String value) {
            addCriterion("goods_spec >", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecGreaterThanOrEqualTo(String value) {
            addCriterion("goods_spec >=", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLessThan(String value) {
            addCriterion("goods_spec <", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLessThanOrEqualTo(String value) {
            addCriterion("goods_spec <=", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLike(String value) {
            addCriterion("goods_spec like", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotLike(String value) {
            addCriterion("goods_spec not like", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIn(List<String> values) {
            addCriterion("goods_spec in", values, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotIn(List<String> values) {
            addCriterion("goods_spec not in", values, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecBetween(String value1, String value2) {
            addCriterion("goods_spec between", value1, value2, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotBetween(String value1, String value2) {
            addCriterion("goods_spec not between", value1, value2, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNull() {
            addCriterion("goods_unit is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNotNull() {
            addCriterion("goods_unit is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitEqualTo(String value) {
            addCriterion("goods_unit =", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotEqualTo(String value) {
            addCriterion("goods_unit <>", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThan(String value) {
            addCriterion("goods_unit >", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThanOrEqualTo(String value) {
            addCriterion("goods_unit >=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThan(String value) {
            addCriterion("goods_unit <", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThanOrEqualTo(String value) {
            addCriterion("goods_unit <=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLike(String value) {
            addCriterion("goods_unit like", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotLike(String value) {
            addCriterion("goods_unit not like", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIn(List<String> values) {
            addCriterion("goods_unit in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotIn(List<String> values) {
            addCriterion("goods_unit not in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitBetween(String value1, String value2) {
            addCriterion("goods_unit between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotBetween(String value1, String value2) {
            addCriterion("goods_unit not between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountFeeIsNull() {
            addCriterion("store_discount_fee is null");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountFeeIsNotNull() {
            addCriterion("store_discount_fee is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountFeeEqualTo(Integer value) {
            addCriterion("store_discount_fee =", value, "storeDiscountFee");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountFeeNotEqualTo(Integer value) {
            addCriterion("store_discount_fee <>", value, "storeDiscountFee");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountFeeGreaterThan(Integer value) {
            addCriterion("store_discount_fee >", value, "storeDiscountFee");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_discount_fee >=", value, "storeDiscountFee");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountFeeLessThan(Integer value) {
            addCriterion("store_discount_fee <", value, "storeDiscountFee");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountFeeLessThanOrEqualTo(Integer value) {
            addCriterion("store_discount_fee <=", value, "storeDiscountFee");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountFeeIn(List<Integer> values) {
            addCriterion("store_discount_fee in", values, "storeDiscountFee");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountFeeNotIn(List<Integer> values) {
            addCriterion("store_discount_fee not in", values, "storeDiscountFee");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountFeeBetween(Integer value1, Integer value2) {
            addCriterion("store_discount_fee between", value1, value2, "storeDiscountFee");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("store_discount_fee not between", value1, value2, "storeDiscountFee");
            return (Criteria) this;
        }

        public Criteria andPlatDiscountFeeIsNull() {
            addCriterion("plat_discount_fee is null");
            return (Criteria) this;
        }

        public Criteria andPlatDiscountFeeIsNotNull() {
            addCriterion("plat_discount_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPlatDiscountFeeEqualTo(Integer value) {
            addCriterion("plat_discount_fee =", value, "platDiscountFee");
            return (Criteria) this;
        }

        public Criteria andPlatDiscountFeeNotEqualTo(Integer value) {
            addCriterion("plat_discount_fee <>", value, "platDiscountFee");
            return (Criteria) this;
        }

        public Criteria andPlatDiscountFeeGreaterThan(Integer value) {
            addCriterion("plat_discount_fee >", value, "platDiscountFee");
            return (Criteria) this;
        }

        public Criteria andPlatDiscountFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("plat_discount_fee >=", value, "platDiscountFee");
            return (Criteria) this;
        }

        public Criteria andPlatDiscountFeeLessThan(Integer value) {
            addCriterion("plat_discount_fee <", value, "platDiscountFee");
            return (Criteria) this;
        }

        public Criteria andPlatDiscountFeeLessThanOrEqualTo(Integer value) {
            addCriterion("plat_discount_fee <=", value, "platDiscountFee");
            return (Criteria) this;
        }

        public Criteria andPlatDiscountFeeIn(List<Integer> values) {
            addCriterion("plat_discount_fee in", values, "platDiscountFee");
            return (Criteria) this;
        }

        public Criteria andPlatDiscountFeeNotIn(List<Integer> values) {
            addCriterion("plat_discount_fee not in", values, "platDiscountFee");
            return (Criteria) this;
        }

        public Criteria andPlatDiscountFeeBetween(Integer value1, Integer value2) {
            addCriterion("plat_discount_fee between", value1, value2, "platDiscountFee");
            return (Criteria) this;
        }

        public Criteria andPlatDiscountFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("plat_discount_fee not between", value1, value2, "platDiscountFee");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIsNull() {
            addCriterion("purchase_price is null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIsNotNull() {
            addCriterion("purchase_price is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceEqualTo(Integer value) {
            addCriterion("purchase_price =", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotEqualTo(Integer value) {
            addCriterion("purchase_price <>", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThan(Integer value) {
            addCriterion("purchase_price >", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_price >=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThan(Integer value) {
            addCriterion("purchase_price <", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_price <=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIn(List<Integer> values) {
            addCriterion("purchase_price in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotIn(List<Integer> values) {
            addCriterion("purchase_price not in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceBetween(Integer value1, Integer value2) {
            addCriterion("purchase_price between", value1, value2, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_price not between", value1, value2, "purchasePrice");
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
     * 描述:om_order_goods表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-11-11
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * om_order_goods 2017-11-11
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