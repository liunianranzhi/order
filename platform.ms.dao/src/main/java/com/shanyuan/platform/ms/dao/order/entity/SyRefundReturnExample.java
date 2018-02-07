package com.shanyuan.platform.ms.dao.order.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyRefundReturnExample {
    /**
     * sy_refund_return
     */
    protected String orderByClause;

    /**
     * sy_refund_return
     */
    protected boolean distinct;

    /**
     * sy_refund_return
     */
    protected List<Criteria> oredCriteria;

    public SyRefundReturnExample() {
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
     * sy_refund_return 2017-10-30
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

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("order_sn like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("order_sn not like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnIsNull() {
            addCriterion("refund_sn is null");
            return (Criteria) this;
        }

        public Criteria andRefundSnIsNotNull() {
            addCriterion("refund_sn is not null");
            return (Criteria) this;
        }

        public Criteria andRefundSnEqualTo(String value) {
            addCriterion("refund_sn =", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnNotEqualTo(String value) {
            addCriterion("refund_sn <>", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnGreaterThan(String value) {
            addCriterion("refund_sn >", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnGreaterThanOrEqualTo(String value) {
            addCriterion("refund_sn >=", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnLessThan(String value) {
            addCriterion("refund_sn <", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnLessThanOrEqualTo(String value) {
            addCriterion("refund_sn <=", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnLike(String value) {
            addCriterion("refund_sn like", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnNotLike(String value) {
            addCriterion("refund_sn not like", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnIn(List<String> values) {
            addCriterion("refund_sn in", values, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnNotIn(List<String> values) {
            addCriterion("refund_sn not in", values, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnBetween(String value1, String value2) {
            addCriterion("refund_sn between", value1, value2, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnNotBetween(String value1, String value2) {
            addCriterion("refund_sn not between", value1, value2, "refundSn");
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

        public Criteria andOrderGoodsIdIsNull() {
            addCriterion("order_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdIsNotNull() {
            addCriterion("order_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdEqualTo(Integer value) {
            addCriterion("order_goods_id =", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdNotEqualTo(Integer value) {
            addCriterion("order_goods_id <>", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdGreaterThan(Integer value) {
            addCriterion("order_goods_id >", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_goods_id >=", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdLessThan(Integer value) {
            addCriterion("order_goods_id <", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_goods_id <=", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdIn(List<Integer> values) {
            addCriterion("order_goods_id in", values, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdNotIn(List<Integer> values) {
            addCriterion("order_goods_id not in", values, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("order_goods_id between", value1, value2, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_goods_id not between", value1, value2, "orderGoodsId");
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

        public Criteria andOrderGoodsTypeIsNull() {
            addCriterion("order_goods_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeIsNotNull() {
            addCriterion("order_goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeEqualTo(Byte value) {
            addCriterion("order_goods_type =", value, "orderGoodsType");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeNotEqualTo(Byte value) {
            addCriterion("order_goods_type <>", value, "orderGoodsType");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeGreaterThan(Byte value) {
            addCriterion("order_goods_type >", value, "orderGoodsType");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_goods_type >=", value, "orderGoodsType");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeLessThan(Byte value) {
            addCriterion("order_goods_type <", value, "orderGoodsType");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeLessThanOrEqualTo(Byte value) {
            addCriterion("order_goods_type <=", value, "orderGoodsType");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeIn(List<Byte> values) {
            addCriterion("order_goods_type in", values, "orderGoodsType");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeNotIn(List<Byte> values) {
            addCriterion("order_goods_type not in", values, "orderGoodsType");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeBetween(Byte value1, Byte value2) {
            addCriterion("order_goods_type between", value1, value2, "orderGoodsType");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("order_goods_type not between", value1, value2, "orderGoodsType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIsNull() {
            addCriterion("refund_type is null");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIsNotNull() {
            addCriterion("refund_type is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTypeEqualTo(Byte value) {
            addCriterion("refund_type =", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeNotEqualTo(Byte value) {
            addCriterion("refund_type <>", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeGreaterThan(Byte value) {
            addCriterion("refund_type >", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("refund_type >=", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeLessThan(Byte value) {
            addCriterion("refund_type <", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeLessThanOrEqualTo(Byte value) {
            addCriterion("refund_type <=", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIn(List<Byte> values) {
            addCriterion("refund_type in", values, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeNotIn(List<Byte> values) {
            addCriterion("refund_type not in", values, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeBetween(Byte value1, Byte value2) {
            addCriterion("refund_type between", value1, value2, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("refund_type not between", value1, value2, "refundType");
            return (Criteria) this;
        }

        public Criteria andSellerStateIsNull() {
            addCriterion("seller_state is null");
            return (Criteria) this;
        }

        public Criteria andSellerStateIsNotNull() {
            addCriterion("seller_state is not null");
            return (Criteria) this;
        }

        public Criteria andSellerStateEqualTo(Byte value) {
            addCriterion("seller_state =", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateNotEqualTo(Byte value) {
            addCriterion("seller_state <>", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateGreaterThan(Byte value) {
            addCriterion("seller_state >", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("seller_state >=", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateLessThan(Byte value) {
            addCriterion("seller_state <", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateLessThanOrEqualTo(Byte value) {
            addCriterion("seller_state <=", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateIn(List<Byte> values) {
            addCriterion("seller_state in", values, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateNotIn(List<Byte> values) {
            addCriterion("seller_state not in", values, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateBetween(Byte value1, Byte value2) {
            addCriterion("seller_state between", value1, value2, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateNotBetween(Byte value1, Byte value2) {
            addCriterion("seller_state not between", value1, value2, "sellerState");
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

        public Criteria andReturnTypeIsNull() {
            addCriterion("return_type is null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIsNotNull() {
            addCriterion("return_type is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeEqualTo(Byte value) {
            addCriterion("return_type =", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotEqualTo(Byte value) {
            addCriterion("return_type <>", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeGreaterThan(Byte value) {
            addCriterion("return_type >", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("return_type >=", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLessThan(Byte value) {
            addCriterion("return_type <", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLessThanOrEqualTo(Byte value) {
            addCriterion("return_type <=", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIn(List<Byte> values) {
            addCriterion("return_type in", values, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotIn(List<Byte> values) {
            addCriterion("return_type not in", values, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeBetween(Byte value1, Byte value2) {
            addCriterion("return_type between", value1, value2, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("return_type not between", value1, value2, "returnType");
            return (Criteria) this;
        }

        public Criteria andOrderLockIsNull() {
            addCriterion("order_lock is null");
            return (Criteria) this;
        }

        public Criteria andOrderLockIsNotNull() {
            addCriterion("order_lock is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLockEqualTo(Byte value) {
            addCriterion("order_lock =", value, "orderLock");
            return (Criteria) this;
        }

        public Criteria andOrderLockNotEqualTo(Byte value) {
            addCriterion("order_lock <>", value, "orderLock");
            return (Criteria) this;
        }

        public Criteria andOrderLockGreaterThan(Byte value) {
            addCriterion("order_lock >", value, "orderLock");
            return (Criteria) this;
        }

        public Criteria andOrderLockGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_lock >=", value, "orderLock");
            return (Criteria) this;
        }

        public Criteria andOrderLockLessThan(Byte value) {
            addCriterion("order_lock <", value, "orderLock");
            return (Criteria) this;
        }

        public Criteria andOrderLockLessThanOrEqualTo(Byte value) {
            addCriterion("order_lock <=", value, "orderLock");
            return (Criteria) this;
        }

        public Criteria andOrderLockIn(List<Byte> values) {
            addCriterion("order_lock in", values, "orderLock");
            return (Criteria) this;
        }

        public Criteria andOrderLockNotIn(List<Byte> values) {
            addCriterion("order_lock not in", values, "orderLock");
            return (Criteria) this;
        }

        public Criteria andOrderLockBetween(Byte value1, Byte value2) {
            addCriterion("order_lock between", value1, value2, "orderLock");
            return (Criteria) this;
        }

        public Criteria andOrderLockNotBetween(Byte value1, Byte value2) {
            addCriterion("order_lock not between", value1, value2, "orderLock");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIsNull() {
            addCriterion("goods_state is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIsNotNull() {
            addCriterion("goods_state is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStateEqualTo(Byte value) {
            addCriterion("goods_state =", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotEqualTo(Byte value) {
            addCriterion("goods_state <>", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateGreaterThan(Byte value) {
            addCriterion("goods_state >", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_state >=", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLessThan(Byte value) {
            addCriterion("goods_state <", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLessThanOrEqualTo(Byte value) {
            addCriterion("goods_state <=", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIn(List<Byte> values) {
            addCriterion("goods_state in", values, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotIn(List<Byte> values) {
            addCriterion("goods_state not in", values, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateBetween(Byte value1, Byte value2) {
            addCriterion("goods_state between", value1, value2, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_state not between", value1, value2, "goodsState");
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

        public Criteria andSellerTimeIsNull() {
            addCriterion("seller_time is null");
            return (Criteria) this;
        }

        public Criteria andSellerTimeIsNotNull() {
            addCriterion("seller_time is not null");
            return (Criteria) this;
        }

        public Criteria andSellerTimeEqualTo(Integer value) {
            addCriterion("seller_time =", value, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeNotEqualTo(Integer value) {
            addCriterion("seller_time <>", value, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeGreaterThan(Integer value) {
            addCriterion("seller_time >", value, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_time >=", value, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeLessThan(Integer value) {
            addCriterion("seller_time <", value, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeLessThanOrEqualTo(Integer value) {
            addCriterion("seller_time <=", value, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeIn(List<Integer> values) {
            addCriterion("seller_time in", values, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeNotIn(List<Integer> values) {
            addCriterion("seller_time not in", values, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeBetween(Integer value1, Integer value2) {
            addCriterion("seller_time between", value1, value2, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_time not between", value1, value2, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeIsNull() {
            addCriterion("admin_time is null");
            return (Criteria) this;
        }

        public Criteria andAdminTimeIsNotNull() {
            addCriterion("admin_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdminTimeEqualTo(Integer value) {
            addCriterion("admin_time =", value, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeNotEqualTo(Integer value) {
            addCriterion("admin_time <>", value, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeGreaterThan(Integer value) {
            addCriterion("admin_time >", value, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_time >=", value, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeLessThan(Integer value) {
            addCriterion("admin_time <", value, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeLessThanOrEqualTo(Integer value) {
            addCriterion("admin_time <=", value, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeIn(List<Integer> values) {
            addCriterion("admin_time in", values, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeNotIn(List<Integer> values) {
            addCriterion("admin_time not in", values, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeBetween(Integer value1, Integer value2) {
            addCriterion("admin_time between", value1, value2, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_time not between", value1, value2, "adminTime");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageIsNull() {
            addCriterion("buyer_message is null");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageIsNotNull() {
            addCriterion("buyer_message is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageEqualTo(String value) {
            addCriterion("buyer_message =", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageNotEqualTo(String value) {
            addCriterion("buyer_message <>", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageGreaterThan(String value) {
            addCriterion("buyer_message >", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_message >=", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageLessThan(String value) {
            addCriterion("buyer_message <", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageLessThanOrEqualTo(String value) {
            addCriterion("buyer_message <=", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageLike(String value) {
            addCriterion("buyer_message like", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageNotLike(String value) {
            addCriterion("buyer_message not like", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageIn(List<String> values) {
            addCriterion("buyer_message in", values, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageNotIn(List<String> values) {
            addCriterion("buyer_message not in", values, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageBetween(String value1, String value2) {
            addCriterion("buyer_message between", value1, value2, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageNotBetween(String value1, String value2) {
            addCriterion("buyer_message not between", value1, value2, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIsNull() {
            addCriterion("refund_reason is null");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIsNotNull() {
            addCriterion("refund_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRefundReasonEqualTo(Byte value) {
            addCriterion("refund_reason =", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotEqualTo(Byte value) {
            addCriterion("refund_reason <>", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonGreaterThan(Byte value) {
            addCriterion("refund_reason >", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonGreaterThanOrEqualTo(Byte value) {
            addCriterion("refund_reason >=", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonLessThan(Byte value) {
            addCriterion("refund_reason <", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonLessThanOrEqualTo(Byte value) {
            addCriterion("refund_reason <=", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIn(List<Byte> values) {
            addCriterion("refund_reason in", values, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotIn(List<Byte> values) {
            addCriterion("refund_reason not in", values, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonBetween(Byte value1, Byte value2) {
            addCriterion("refund_reason between", value1, value2, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotBetween(Byte value1, Byte value2) {
            addCriterion("refund_reason not between", value1, value2, "refundReason");
            return (Criteria) this;
        }

        public Criteria andSellerMessageIsNull() {
            addCriterion("seller_message is null");
            return (Criteria) this;
        }

        public Criteria andSellerMessageIsNotNull() {
            addCriterion("seller_message is not null");
            return (Criteria) this;
        }

        public Criteria andSellerMessageEqualTo(String value) {
            addCriterion("seller_message =", value, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageNotEqualTo(String value) {
            addCriterion("seller_message <>", value, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageGreaterThan(String value) {
            addCriterion("seller_message >", value, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageGreaterThanOrEqualTo(String value) {
            addCriterion("seller_message >=", value, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageLessThan(String value) {
            addCriterion("seller_message <", value, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageLessThanOrEqualTo(String value) {
            addCriterion("seller_message <=", value, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageLike(String value) {
            addCriterion("seller_message like", value, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageNotLike(String value) {
            addCriterion("seller_message not like", value, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageIn(List<String> values) {
            addCriterion("seller_message in", values, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageNotIn(List<String> values) {
            addCriterion("seller_message not in", values, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageBetween(String value1, String value2) {
            addCriterion("seller_message between", value1, value2, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageNotBetween(String value1, String value2) {
            addCriterion("seller_message not between", value1, value2, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageIsNull() {
            addCriterion("admin_message is null");
            return (Criteria) this;
        }

        public Criteria andAdminMessageIsNotNull() {
            addCriterion("admin_message is not null");
            return (Criteria) this;
        }

        public Criteria andAdminMessageEqualTo(String value) {
            addCriterion("admin_message =", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageNotEqualTo(String value) {
            addCriterion("admin_message <>", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageGreaterThan(String value) {
            addCriterion("admin_message >", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageGreaterThanOrEqualTo(String value) {
            addCriterion("admin_message >=", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageLessThan(String value) {
            addCriterion("admin_message <", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageLessThanOrEqualTo(String value) {
            addCriterion("admin_message <=", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageLike(String value) {
            addCriterion("admin_message like", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageNotLike(String value) {
            addCriterion("admin_message not like", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageIn(List<String> values) {
            addCriterion("admin_message in", values, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageNotIn(List<String> values) {
            addCriterion("admin_message not in", values, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageBetween(String value1, String value2) {
            addCriterion("admin_message between", value1, value2, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageNotBetween(String value1, String value2) {
            addCriterion("admin_message not between", value1, value2, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andExpressIdIsNull() {
            addCriterion("express_id is null");
            return (Criteria) this;
        }

        public Criteria andExpressIdIsNotNull() {
            addCriterion("express_id is not null");
            return (Criteria) this;
        }

        public Criteria andExpressIdEqualTo(Byte value) {
            addCriterion("express_id =", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotEqualTo(Byte value) {
            addCriterion("express_id <>", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdGreaterThan(Byte value) {
            addCriterion("express_id >", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("express_id >=", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdLessThan(Byte value) {
            addCriterion("express_id <", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdLessThanOrEqualTo(Byte value) {
            addCriterion("express_id <=", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdIn(List<Byte> values) {
            addCriterion("express_id in", values, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotIn(List<Byte> values) {
            addCriterion("express_id not in", values, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdBetween(Byte value1, Byte value2) {
            addCriterion("express_id between", value1, value2, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotBetween(Byte value1, Byte value2) {
            addCriterion("express_id not between", value1, value2, "expressId");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNull() {
            addCriterion("invoice_no is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNotNull() {
            addCriterion("invoice_no is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoEqualTo(String value) {
            addCriterion("invoice_no =", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotEqualTo(String value) {
            addCriterion("invoice_no <>", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThan(String value) {
            addCriterion("invoice_no >", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_no >=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThan(String value) {
            addCriterion("invoice_no <", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThanOrEqualTo(String value) {
            addCriterion("invoice_no <=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLike(String value) {
            addCriterion("invoice_no like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotLike(String value) {
            addCriterion("invoice_no not like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIn(List<String> values) {
            addCriterion("invoice_no in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotIn(List<String> values) {
            addCriterion("invoice_no not in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoBetween(String value1, String value2) {
            addCriterion("invoice_no between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotBetween(String value1, String value2) {
            addCriterion("invoice_no not between", value1, value2, "invoiceNo");
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

        public Criteria andReceiveTimeIsNull() {
            addCriterion("receive_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Integer value) {
            addCriterion("receive_time =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Integer value) {
            addCriterion("receive_time <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Integer value) {
            addCriterion("receive_time >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_time >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Integer value) {
            addCriterion("receive_time <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Integer value) {
            addCriterion("receive_time <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Integer> values) {
            addCriterion("receive_time in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Integer> values) {
            addCriterion("receive_time not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Integer value1, Integer value2) {
            addCriterion("receive_time between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_time not between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageIsNull() {
            addCriterion("receive_message is null");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageIsNotNull() {
            addCriterion("receive_message is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageEqualTo(String value) {
            addCriterion("receive_message =", value, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageNotEqualTo(String value) {
            addCriterion("receive_message <>", value, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageGreaterThan(String value) {
            addCriterion("receive_message >", value, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageGreaterThanOrEqualTo(String value) {
            addCriterion("receive_message >=", value, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageLessThan(String value) {
            addCriterion("receive_message <", value, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageLessThanOrEqualTo(String value) {
            addCriterion("receive_message <=", value, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageLike(String value) {
            addCriterion("receive_message like", value, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageNotLike(String value) {
            addCriterion("receive_message not like", value, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageIn(List<String> values) {
            addCriterion("receive_message in", values, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageNotIn(List<String> values) {
            addCriterion("receive_message not in", values, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageBetween(String value1, String value2) {
            addCriterion("receive_message between", value1, value2, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageNotBetween(String value1, String value2) {
            addCriterion("receive_message not between", value1, value2, "receiveMessage");
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

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(Integer value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(Integer value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(Integer value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(Integer value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<Integer> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<Integer> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(Integer value1, Integer value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
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

        public Criteria andConsultStateIsNull() {
            addCriterion("consult_state is null");
            return (Criteria) this;
        }

        public Criteria andConsultStateIsNotNull() {
            addCriterion("consult_state is not null");
            return (Criteria) this;
        }

        public Criteria andConsultStateEqualTo(Byte value) {
            addCriterion("consult_state =", value, "consultState");
            return (Criteria) this;
        }

        public Criteria andConsultStateNotEqualTo(Byte value) {
            addCriterion("consult_state <>", value, "consultState");
            return (Criteria) this;
        }

        public Criteria andConsultStateGreaterThan(Byte value) {
            addCriterion("consult_state >", value, "consultState");
            return (Criteria) this;
        }

        public Criteria andConsultStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("consult_state >=", value, "consultState");
            return (Criteria) this;
        }

        public Criteria andConsultStateLessThan(Byte value) {
            addCriterion("consult_state <", value, "consultState");
            return (Criteria) this;
        }

        public Criteria andConsultStateLessThanOrEqualTo(Byte value) {
            addCriterion("consult_state <=", value, "consultState");
            return (Criteria) this;
        }

        public Criteria andConsultStateIn(List<Byte> values) {
            addCriterion("consult_state in", values, "consultState");
            return (Criteria) this;
        }

        public Criteria andConsultStateNotIn(List<Byte> values) {
            addCriterion("consult_state not in", values, "consultState");
            return (Criteria) this;
        }

        public Criteria andConsultStateBetween(Byte value1, Byte value2) {
            addCriterion("consult_state between", value1, value2, "consultState");
            return (Criteria) this;
        }

        public Criteria andConsultStateNotBetween(Byte value1, Byte value2) {
            addCriterion("consult_state not between", value1, value2, "consultState");
            return (Criteria) this;
        }

        public Criteria andConsultTimeIsNull() {
            addCriterion("consult_time is null");
            return (Criteria) this;
        }

        public Criteria andConsultTimeIsNotNull() {
            addCriterion("consult_time is not null");
            return (Criteria) this;
        }

        public Criteria andConsultTimeEqualTo(Integer value) {
            addCriterion("consult_time =", value, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeNotEqualTo(Integer value) {
            addCriterion("consult_time <>", value, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeGreaterThan(Integer value) {
            addCriterion("consult_time >", value, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("consult_time >=", value, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeLessThan(Integer value) {
            addCriterion("consult_time <", value, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeLessThanOrEqualTo(Integer value) {
            addCriterion("consult_time <=", value, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeIn(List<Integer> values) {
            addCriterion("consult_time in", values, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeNotIn(List<Integer> values) {
            addCriterion("consult_time not in", values, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeBetween(Integer value1, Integer value2) {
            addCriterion("consult_time between", value1, value2, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("consult_time not between", value1, value2, "consultTime");
            return (Criteria) this;
        }

        public Criteria andApplyConsultMIdIsNull() {
            addCriterion("apply_consult_m_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyConsultMIdIsNotNull() {
            addCriterion("apply_consult_m_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyConsultMIdEqualTo(Integer value) {
            addCriterion("apply_consult_m_id =", value, "applyConsultMId");
            return (Criteria) this;
        }

        public Criteria andApplyConsultMIdNotEqualTo(Integer value) {
            addCriterion("apply_consult_m_id <>", value, "applyConsultMId");
            return (Criteria) this;
        }

        public Criteria andApplyConsultMIdGreaterThan(Integer value) {
            addCriterion("apply_consult_m_id >", value, "applyConsultMId");
            return (Criteria) this;
        }

        public Criteria andApplyConsultMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_consult_m_id >=", value, "applyConsultMId");
            return (Criteria) this;
        }

        public Criteria andApplyConsultMIdLessThan(Integer value) {
            addCriterion("apply_consult_m_id <", value, "applyConsultMId");
            return (Criteria) this;
        }

        public Criteria andApplyConsultMIdLessThanOrEqualTo(Integer value) {
            addCriterion("apply_consult_m_id <=", value, "applyConsultMId");
            return (Criteria) this;
        }

        public Criteria andApplyConsultMIdIn(List<Integer> values) {
            addCriterion("apply_consult_m_id in", values, "applyConsultMId");
            return (Criteria) this;
        }

        public Criteria andApplyConsultMIdNotIn(List<Integer> values) {
            addCriterion("apply_consult_m_id not in", values, "applyConsultMId");
            return (Criteria) this;
        }

        public Criteria andApplyConsultMIdBetween(Integer value1, Integer value2) {
            addCriterion("apply_consult_m_id between", value1, value2, "applyConsultMId");
            return (Criteria) this;
        }

        public Criteria andApplyConsultMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_consult_m_id not between", value1, value2, "applyConsultMId");
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
    }

    /**
     * 描述:sy_refund_return表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-10-30
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_refund_return 2017-10-30
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