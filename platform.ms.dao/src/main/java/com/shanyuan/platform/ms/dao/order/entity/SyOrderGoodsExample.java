package com.shanyuan.platform.ms.dao.order.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyOrderGoodsExample {
    /**
     * sy_order_goods
     */
    protected String orderByClause;

    /**
     * sy_order_goods
     */
    protected boolean distinct;

    /**
     * sy_order_goods
     */
    protected List<Criteria> oredCriteria;

    public SyOrderGoodsExample() {
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
     * sy_order_goods 2017-10-18
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

        public Criteria andRecIdIsNull() {
            addCriterion("rec_id is null");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNotNull() {
            addCriterion("rec_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecIdEqualTo(Integer value) {
            addCriterion("rec_id =", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotEqualTo(Integer value) {
            addCriterion("rec_id <>", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThan(Integer value) {
            addCriterion("rec_id >", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_id >=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThan(Integer value) {
            addCriterion("rec_id <", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThanOrEqualTo(Integer value) {
            addCriterion("rec_id <=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdIn(List<Integer> values) {
            addCriterion("rec_id in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotIn(List<Integer> values) {
            addCriterion("rec_id not in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdBetween(Integer value1, Integer value2) {
            addCriterion("rec_id between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_id not between", value1, value2, "recId");
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

        public Criteria andGoodsPayPriceIsNull() {
            addCriterion("goods_pay_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPayPriceIsNotNull() {
            addCriterion("goods_pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPayPriceEqualTo(BigDecimal value) {
            addCriterion("goods_pay_price =", value, "goodsPayPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPayPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_pay_price <>", value, "goodsPayPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPayPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_pay_price >", value, "goodsPayPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPayPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_pay_price >=", value, "goodsPayPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPayPriceLessThan(BigDecimal value) {
            addCriterion("goods_pay_price <", value, "goodsPayPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPayPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_pay_price <=", value, "goodsPayPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPayPriceIn(List<BigDecimal> values) {
            addCriterion("goods_pay_price in", values, "goodsPayPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPayPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_pay_price not in", values, "goodsPayPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPayPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_pay_price between", value1, value2, "goodsPayPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPayPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_pay_price not between", value1, value2, "goodsPayPrice");
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

        public Criteria andGoodsTypeIsNull() {
            addCriterion("goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(String value) {
            addCriterion("goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(String value) {
            addCriterion("goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(String value) {
            addCriterion("goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(String value) {
            addCriterion("goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLike(String value) {
            addCriterion("goods_type like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotLike(String value) {
            addCriterion("goods_type not like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<String> values) {
            addCriterion("goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<String> values) {
            addCriterion("goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(String value1, String value2) {
            addCriterion("goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("goods_type not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdIsNull() {
            addCriterion("promotions_id is null");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdIsNotNull() {
            addCriterion("promotions_id is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdEqualTo(Integer value) {
            addCriterion("promotions_id =", value, "promotionsId");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdNotEqualTo(Integer value) {
            addCriterion("promotions_id <>", value, "promotionsId");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdGreaterThan(Integer value) {
            addCriterion("promotions_id >", value, "promotionsId");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("promotions_id >=", value, "promotionsId");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdLessThan(Integer value) {
            addCriterion("promotions_id <", value, "promotionsId");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdLessThanOrEqualTo(Integer value) {
            addCriterion("promotions_id <=", value, "promotionsId");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdIn(List<Integer> values) {
            addCriterion("promotions_id in", values, "promotionsId");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdNotIn(List<Integer> values) {
            addCriterion("promotions_id not in", values, "promotionsId");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdBetween(Integer value1, Integer value2) {
            addCriterion("promotions_id between", value1, value2, "promotionsId");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("promotions_id not between", value1, value2, "promotionsId");
            return (Criteria) this;
        }

        public Criteria andCommisRateIsNull() {
            addCriterion("commis_rate is null");
            return (Criteria) this;
        }

        public Criteria andCommisRateIsNotNull() {
            addCriterion("commis_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCommisRateEqualTo(Short value) {
            addCriterion("commis_rate =", value, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateNotEqualTo(Short value) {
            addCriterion("commis_rate <>", value, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateGreaterThan(Short value) {
            addCriterion("commis_rate >", value, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateGreaterThanOrEqualTo(Short value) {
            addCriterion("commis_rate >=", value, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateLessThan(Short value) {
            addCriterion("commis_rate <", value, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateLessThanOrEqualTo(Short value) {
            addCriterion("commis_rate <=", value, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateIn(List<Short> values) {
            addCriterion("commis_rate in", values, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateNotIn(List<Short> values) {
            addCriterion("commis_rate not in", values, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateBetween(Short value1, Short value2) {
            addCriterion("commis_rate between", value1, value2, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateNotBetween(Short value1, Short value2) {
            addCriterion("commis_rate not between", value1, value2, "commisRate");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageIsNull() {
            addCriterion("goods_storage is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageIsNotNull() {
            addCriterion("goods_storage is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageEqualTo(Long value) {
            addCriterion("goods_storage =", value, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageNotEqualTo(Long value) {
            addCriterion("goods_storage <>", value, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageGreaterThan(Long value) {
            addCriterion("goods_storage >", value, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_storage >=", value, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageLessThan(Long value) {
            addCriterion("goods_storage <", value, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageLessThanOrEqualTo(Long value) {
            addCriterion("goods_storage <=", value, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageIn(List<Long> values) {
            addCriterion("goods_storage in", values, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageNotIn(List<Long> values) {
            addCriterion("goods_storage not in", values, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageBetween(Long value1, Long value2) {
            addCriterion("goods_storage between", value1, value2, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageNotBetween(Long value1, Long value2) {
            addCriterion("goods_storage not between", value1, value2, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andMFeeRateIsNull() {
            addCriterion("m_fee_rate is null");
            return (Criteria) this;
        }

        public Criteria andMFeeRateIsNotNull() {
            addCriterion("m_fee_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMFeeRateEqualTo(Short value) {
            addCriterion("m_fee_rate =", value, "mFeeRate");
            return (Criteria) this;
        }

        public Criteria andMFeeRateNotEqualTo(Short value) {
            addCriterion("m_fee_rate <>", value, "mFeeRate");
            return (Criteria) this;
        }

        public Criteria andMFeeRateGreaterThan(Short value) {
            addCriterion("m_fee_rate >", value, "mFeeRate");
            return (Criteria) this;
        }

        public Criteria andMFeeRateGreaterThanOrEqualTo(Short value) {
            addCriterion("m_fee_rate >=", value, "mFeeRate");
            return (Criteria) this;
        }

        public Criteria andMFeeRateLessThan(Short value) {
            addCriterion("m_fee_rate <", value, "mFeeRate");
            return (Criteria) this;
        }

        public Criteria andMFeeRateLessThanOrEqualTo(Short value) {
            addCriterion("m_fee_rate <=", value, "mFeeRate");
            return (Criteria) this;
        }

        public Criteria andMFeeRateIn(List<Short> values) {
            addCriterion("m_fee_rate in", values, "mFeeRate");
            return (Criteria) this;
        }

        public Criteria andMFeeRateNotIn(List<Short> values) {
            addCriterion("m_fee_rate not in", values, "mFeeRate");
            return (Criteria) this;
        }

        public Criteria andMFeeRateBetween(Short value1, Short value2) {
            addCriterion("m_fee_rate between", value1, value2, "mFeeRate");
            return (Criteria) this;
        }

        public Criteria andMFeeRateNotBetween(Short value1, Short value2) {
            addCriterion("m_fee_rate not between", value1, value2, "mFeeRate");
            return (Criteria) this;
        }

        public Criteria andMFeeRate2IsNull() {
            addCriterion("m_fee_rate2 is null");
            return (Criteria) this;
        }

        public Criteria andMFeeRate2IsNotNull() {
            addCriterion("m_fee_rate2 is not null");
            return (Criteria) this;
        }

        public Criteria andMFeeRate2EqualTo(Short value) {
            addCriterion("m_fee_rate2 =", value, "mFeeRate2");
            return (Criteria) this;
        }

        public Criteria andMFeeRate2NotEqualTo(Short value) {
            addCriterion("m_fee_rate2 <>", value, "mFeeRate2");
            return (Criteria) this;
        }

        public Criteria andMFeeRate2GreaterThan(Short value) {
            addCriterion("m_fee_rate2 >", value, "mFeeRate2");
            return (Criteria) this;
        }

        public Criteria andMFeeRate2GreaterThanOrEqualTo(Short value) {
            addCriterion("m_fee_rate2 >=", value, "mFeeRate2");
            return (Criteria) this;
        }

        public Criteria andMFeeRate2LessThan(Short value) {
            addCriterion("m_fee_rate2 <", value, "mFeeRate2");
            return (Criteria) this;
        }

        public Criteria andMFeeRate2LessThanOrEqualTo(Short value) {
            addCriterion("m_fee_rate2 <=", value, "mFeeRate2");
            return (Criteria) this;
        }

        public Criteria andMFeeRate2In(List<Short> values) {
            addCriterion("m_fee_rate2 in", values, "mFeeRate2");
            return (Criteria) this;
        }

        public Criteria andMFeeRate2NotIn(List<Short> values) {
            addCriterion("m_fee_rate2 not in", values, "mFeeRate2");
            return (Criteria) this;
        }

        public Criteria andMFeeRate2Between(Short value1, Short value2) {
            addCriterion("m_fee_rate2 between", value1, value2, "mFeeRate2");
            return (Criteria) this;
        }

        public Criteria andMFeeRate2NotBetween(Short value1, Short value2) {
            addCriterion("m_fee_rate2 not between", value1, value2, "mFeeRate2");
            return (Criteria) this;
        }

        public Criteria andGevalIdIsNull() {
            addCriterion("geval_id is null");
            return (Criteria) this;
        }

        public Criteria andGevalIdIsNotNull() {
            addCriterion("geval_id is not null");
            return (Criteria) this;
        }

        public Criteria andGevalIdEqualTo(Integer value) {
            addCriterion("geval_id =", value, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdNotEqualTo(Integer value) {
            addCriterion("geval_id <>", value, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdGreaterThan(Integer value) {
            addCriterion("geval_id >", value, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("geval_id >=", value, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdLessThan(Integer value) {
            addCriterion("geval_id <", value, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdLessThanOrEqualTo(Integer value) {
            addCriterion("geval_id <=", value, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdIn(List<Integer> values) {
            addCriterion("geval_id in", values, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdNotIn(List<Integer> values) {
            addCriterion("geval_id not in", values, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdBetween(Integer value1, Integer value2) {
            addCriterion("geval_id between", value1, value2, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("geval_id not between", value1, value2, "gevalId");
            return (Criteria) this;
        }

        public Criteria andSharedMidIsNull() {
            addCriterion("shared_mid is null");
            return (Criteria) this;
        }

        public Criteria andSharedMidIsNotNull() {
            addCriterion("shared_mid is not null");
            return (Criteria) this;
        }

        public Criteria andSharedMidEqualTo(Integer value) {
            addCriterion("shared_mid =", value, "sharedMid");
            return (Criteria) this;
        }

        public Criteria andSharedMidNotEqualTo(Integer value) {
            addCriterion("shared_mid <>", value, "sharedMid");
            return (Criteria) this;
        }

        public Criteria andSharedMidGreaterThan(Integer value) {
            addCriterion("shared_mid >", value, "sharedMid");
            return (Criteria) this;
        }

        public Criteria andSharedMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shared_mid >=", value, "sharedMid");
            return (Criteria) this;
        }

        public Criteria andSharedMidLessThan(Integer value) {
            addCriterion("shared_mid <", value, "sharedMid");
            return (Criteria) this;
        }

        public Criteria andSharedMidLessThanOrEqualTo(Integer value) {
            addCriterion("shared_mid <=", value, "sharedMid");
            return (Criteria) this;
        }

        public Criteria andSharedMidIn(List<Integer> values) {
            addCriterion("shared_mid in", values, "sharedMid");
            return (Criteria) this;
        }

        public Criteria andSharedMidNotIn(List<Integer> values) {
            addCriterion("shared_mid not in", values, "sharedMid");
            return (Criteria) this;
        }

        public Criteria andSharedMidBetween(Integer value1, Integer value2) {
            addCriterion("shared_mid between", value1, value2, "sharedMid");
            return (Criteria) this;
        }

        public Criteria andSharedMidNotBetween(Integer value1, Integer value2) {
            addCriterion("shared_mid not between", value1, value2, "sharedMid");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIsNull() {
            addCriterion("owner_type is null");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIsNotNull() {
            addCriterion("owner_type is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeEqualTo(String value) {
            addCriterion("owner_type =", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotEqualTo(String value) {
            addCriterion("owner_type <>", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeGreaterThan(String value) {
            addCriterion("owner_type >", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("owner_type >=", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeLessThan(String value) {
            addCriterion("owner_type <", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeLessThanOrEqualTo(String value) {
            addCriterion("owner_type <=", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeLike(String value) {
            addCriterion("owner_type like", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotLike(String value) {
            addCriterion("owner_type not like", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIn(List<String> values) {
            addCriterion("owner_type in", values, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotIn(List<String> values) {
            addCriterion("owner_type not in", values, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeBetween(String value1, String value2) {
            addCriterion("owner_type between", value1, value2, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotBetween(String value1, String value2) {
            addCriterion("owner_type not between", value1, value2, "ownerType");
            return (Criteria) this;
        }

        public Criteria andBocPointsPriceIsNull() {
            addCriterion("boc_points_price is null");
            return (Criteria) this;
        }

        public Criteria andBocPointsPriceIsNotNull() {
            addCriterion("boc_points_price is not null");
            return (Criteria) this;
        }

        public Criteria andBocPointsPriceEqualTo(BigDecimal value) {
            addCriterion("boc_points_price =", value, "bocPointsPrice");
            return (Criteria) this;
        }

        public Criteria andBocPointsPriceNotEqualTo(BigDecimal value) {
            addCriterion("boc_points_price <>", value, "bocPointsPrice");
            return (Criteria) this;
        }

        public Criteria andBocPointsPriceGreaterThan(BigDecimal value) {
            addCriterion("boc_points_price >", value, "bocPointsPrice");
            return (Criteria) this;
        }

        public Criteria andBocPointsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("boc_points_price >=", value, "bocPointsPrice");
            return (Criteria) this;
        }

        public Criteria andBocPointsPriceLessThan(BigDecimal value) {
            addCriterion("boc_points_price <", value, "bocPointsPrice");
            return (Criteria) this;
        }

        public Criteria andBocPointsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("boc_points_price <=", value, "bocPointsPrice");
            return (Criteria) this;
        }

        public Criteria andBocPointsPriceIn(List<BigDecimal> values) {
            addCriterion("boc_points_price in", values, "bocPointsPrice");
            return (Criteria) this;
        }

        public Criteria andBocPointsPriceNotIn(List<BigDecimal> values) {
            addCriterion("boc_points_price not in", values, "bocPointsPrice");
            return (Criteria) this;
        }

        public Criteria andBocPointsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("boc_points_price between", value1, value2, "bocPointsPrice");
            return (Criteria) this;
        }

        public Criteria andBocPointsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("boc_points_price not between", value1, value2, "bocPointsPrice");
            return (Criteria) this;
        }

        public Criteria andBocPointRateIsNull() {
            addCriterion("boc_point_rate is null");
            return (Criteria) this;
        }

        public Criteria andBocPointRateIsNotNull() {
            addCriterion("boc_point_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBocPointRateEqualTo(Integer value) {
            addCriterion("boc_point_rate =", value, "bocPointRate");
            return (Criteria) this;
        }

        public Criteria andBocPointRateNotEqualTo(Integer value) {
            addCriterion("boc_point_rate <>", value, "bocPointRate");
            return (Criteria) this;
        }

        public Criteria andBocPointRateGreaterThan(Integer value) {
            addCriterion("boc_point_rate >", value, "bocPointRate");
            return (Criteria) this;
        }

        public Criteria andBocPointRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("boc_point_rate >=", value, "bocPointRate");
            return (Criteria) this;
        }

        public Criteria andBocPointRateLessThan(Integer value) {
            addCriterion("boc_point_rate <", value, "bocPointRate");
            return (Criteria) this;
        }

        public Criteria andBocPointRateLessThanOrEqualTo(Integer value) {
            addCriterion("boc_point_rate <=", value, "bocPointRate");
            return (Criteria) this;
        }

        public Criteria andBocPointRateIn(List<Integer> values) {
            addCriterion("boc_point_rate in", values, "bocPointRate");
            return (Criteria) this;
        }

        public Criteria andBocPointRateNotIn(List<Integer> values) {
            addCriterion("boc_point_rate not in", values, "bocPointRate");
            return (Criteria) this;
        }

        public Criteria andBocPointRateBetween(Integer value1, Integer value2) {
            addCriterion("boc_point_rate between", value1, value2, "bocPointRate");
            return (Criteria) this;
        }

        public Criteria andBocPointRateNotBetween(Integer value1, Integer value2) {
            addCriterion("boc_point_rate not between", value1, value2, "bocPointRate");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNull() {
            addCriterion("goods_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNotNull() {
            addCriterion("goods_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeEqualTo(String value) {
            addCriterion("goods_code =", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotEqualTo(String value) {
            addCriterion("goods_code <>", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThan(String value) {
            addCriterion("goods_code >", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_code >=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThan(String value) {
            addCriterion("goods_code <", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_code <=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLike(String value) {
            addCriterion("goods_code like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotLike(String value) {
            addCriterion("goods_code not like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIn(List<String> values) {
            addCriterion("goods_code in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotIn(List<String> values) {
            addCriterion("goods_code not in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeBetween(String value1, String value2) {
            addCriterion("goods_code between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("goods_code not between", value1, value2, "goodsCode");
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

        public Criteria andPoorMidIsNull() {
            addCriterion("poor_mid is null");
            return (Criteria) this;
        }

        public Criteria andPoorMidIsNotNull() {
            addCriterion("poor_mid is not null");
            return (Criteria) this;
        }

        public Criteria andPoorMidEqualTo(Integer value) {
            addCriterion("poor_mid =", value, "poorMid");
            return (Criteria) this;
        }

        public Criteria andPoorMidNotEqualTo(Integer value) {
            addCriterion("poor_mid <>", value, "poorMid");
            return (Criteria) this;
        }

        public Criteria andPoorMidGreaterThan(Integer value) {
            addCriterion("poor_mid >", value, "poorMid");
            return (Criteria) this;
        }

        public Criteria andPoorMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("poor_mid >=", value, "poorMid");
            return (Criteria) this;
        }

        public Criteria andPoorMidLessThan(Integer value) {
            addCriterion("poor_mid <", value, "poorMid");
            return (Criteria) this;
        }

        public Criteria andPoorMidLessThanOrEqualTo(Integer value) {
            addCriterion("poor_mid <=", value, "poorMid");
            return (Criteria) this;
        }

        public Criteria andPoorMidIn(List<Integer> values) {
            addCriterion("poor_mid in", values, "poorMid");
            return (Criteria) this;
        }

        public Criteria andPoorMidNotIn(List<Integer> values) {
            addCriterion("poor_mid not in", values, "poorMid");
            return (Criteria) this;
        }

        public Criteria andPoorMidBetween(Integer value1, Integer value2) {
            addCriterion("poor_mid between", value1, value2, "poorMid");
            return (Criteria) this;
        }

        public Criteria andPoorMidNotBetween(Integer value1, Integer value2) {
            addCriterion("poor_mid not between", value1, value2, "poorMid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidIsNull() {
            addCriterion("goods_commonid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidIsNotNull() {
            addCriterion("goods_commonid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidEqualTo(Integer value) {
            addCriterion("goods_commonid =", value, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidNotEqualTo(Integer value) {
            addCriterion("goods_commonid <>", value, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidGreaterThan(Integer value) {
            addCriterion("goods_commonid >", value, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_commonid >=", value, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidLessThan(Integer value) {
            addCriterion("goods_commonid <", value, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidLessThanOrEqualTo(Integer value) {
            addCriterion("goods_commonid <=", value, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidIn(List<Integer> values) {
            addCriterion("goods_commonid in", values, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidNotIn(List<Integer> values) {
            addCriterion("goods_commonid not in", values, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidBetween(Integer value1, Integer value2) {
            addCriterion("goods_commonid between", value1, value2, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_commonid not between", value1, value2, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andPackageNumIsNull() {
            addCriterion("package_num is null");
            return (Criteria) this;
        }

        public Criteria andPackageNumIsNotNull() {
            addCriterion("package_num is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNumEqualTo(Long value) {
            addCriterion("package_num =", value, "packageNum");
            return (Criteria) this;
        }

        public Criteria andPackageNumNotEqualTo(Long value) {
            addCriterion("package_num <>", value, "packageNum");
            return (Criteria) this;
        }

        public Criteria andPackageNumGreaterThan(Long value) {
            addCriterion("package_num >", value, "packageNum");
            return (Criteria) this;
        }

        public Criteria andPackageNumGreaterThanOrEqualTo(Long value) {
            addCriterion("package_num >=", value, "packageNum");
            return (Criteria) this;
        }

        public Criteria andPackageNumLessThan(Long value) {
            addCriterion("package_num <", value, "packageNum");
            return (Criteria) this;
        }

        public Criteria andPackageNumLessThanOrEqualTo(Long value) {
            addCriterion("package_num <=", value, "packageNum");
            return (Criteria) this;
        }

        public Criteria andPackageNumIn(List<Long> values) {
            addCriterion("package_num in", values, "packageNum");
            return (Criteria) this;
        }

        public Criteria andPackageNumNotIn(List<Long> values) {
            addCriterion("package_num not in", values, "packageNum");
            return (Criteria) this;
        }

        public Criteria andPackageNumBetween(Long value1, Long value2) {
            addCriterion("package_num between", value1, value2, "packageNum");
            return (Criteria) this;
        }

        public Criteria andPackageNumNotBetween(Long value1, Long value2) {
            addCriterion("package_num not between", value1, value2, "packageNum");
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

        public Criteria andDiscountMoneyIsNull() {
            addCriterion("discount_money is null");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyIsNotNull() {
            addCriterion("discount_money is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyEqualTo(BigDecimal value) {
            addCriterion("discount_money =", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyNotEqualTo(BigDecimal value) {
            addCriterion("discount_money <>", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyGreaterThan(BigDecimal value) {
            addCriterion("discount_money >", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_money >=", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyLessThan(BigDecimal value) {
            addCriterion("discount_money <", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_money <=", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyIn(List<BigDecimal> values) {
            addCriterion("discount_money in", values, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyNotIn(List<BigDecimal> values) {
            addCriterion("discount_money not in", values, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_money between", value1, value2, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_money not between", value1, value2, "discountMoney");
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

        public Criteria andPurchasePriceEqualTo(BigDecimal value) {
            addCriterion("purchase_price =", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotEqualTo(BigDecimal value) {
            addCriterion("purchase_price <>", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThan(BigDecimal value) {
            addCriterion("purchase_price >", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_price >=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThan(BigDecimal value) {
            addCriterion("purchase_price <", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_price <=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIn(List<BigDecimal> values) {
            addCriterion("purchase_price in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotIn(List<BigDecimal> values) {
            addCriterion("purchase_price not in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_price between", value1, value2, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_price not between", value1, value2, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPlatformPayMoneyIsNull() {
            addCriterion("platform_pay_money is null");
            return (Criteria) this;
        }

        public Criteria andPlatformPayMoneyIsNotNull() {
            addCriterion("platform_pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformPayMoneyEqualTo(BigDecimal value) {
            addCriterion("platform_pay_money =", value, "platformPayMoney");
            return (Criteria) this;
        }

        public Criteria andPlatformPayMoneyNotEqualTo(BigDecimal value) {
            addCriterion("platform_pay_money <>", value, "platformPayMoney");
            return (Criteria) this;
        }

        public Criteria andPlatformPayMoneyGreaterThan(BigDecimal value) {
            addCriterion("platform_pay_money >", value, "platformPayMoney");
            return (Criteria) this;
        }

        public Criteria andPlatformPayMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("platform_pay_money >=", value, "platformPayMoney");
            return (Criteria) this;
        }

        public Criteria andPlatformPayMoneyLessThan(BigDecimal value) {
            addCriterion("platform_pay_money <", value, "platformPayMoney");
            return (Criteria) this;
        }

        public Criteria andPlatformPayMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("platform_pay_money <=", value, "platformPayMoney");
            return (Criteria) this;
        }

        public Criteria andPlatformPayMoneyIn(List<BigDecimal> values) {
            addCriterion("platform_pay_money in", values, "platformPayMoney");
            return (Criteria) this;
        }

        public Criteria andPlatformPayMoneyNotIn(List<BigDecimal> values) {
            addCriterion("platform_pay_money not in", values, "platformPayMoney");
            return (Criteria) this;
        }

        public Criteria andPlatformPayMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platform_pay_money between", value1, value2, "platformPayMoney");
            return (Criteria) this;
        }

        public Criteria andPlatformPayMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platform_pay_money not between", value1, value2, "platformPayMoney");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_order_goods表的实体类
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
     * sy_order_goods 2017-10-18
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