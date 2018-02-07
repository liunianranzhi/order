package com.shanyuan.platform.ms.dao.goods.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SyTopicGoodsExample {
    /**
     * sy_topic_goods
     */
    protected String orderByClause;

    /**
     * sy_topic_goods
     */
    protected boolean distinct;

    /**
     * sy_topic_goods
     */
    protected List<Criteria> oredCriteria;

    public SyTopicGoodsExample() {
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
     * sy_topic_goods 2017-12-11
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

        public Criteria andTopicIdIsNull() {
            addCriterion("topic_id is null");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNotNull() {
            addCriterion("topic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopicIdEqualTo(Integer value) {
            addCriterion("topic_id =", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotEqualTo(Integer value) {
            addCriterion("topic_id <>", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThan(Integer value) {
            addCriterion("topic_id >", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_id >=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThan(Integer value) {
            addCriterion("topic_id <", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThanOrEqualTo(Integer value) {
            addCriterion("topic_id <=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdIn(List<Integer> values) {
            addCriterion("topic_id in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotIn(List<Integer> values) {
            addCriterion("topic_id not in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdBetween(Integer value1, Integer value2) {
            addCriterion("topic_id between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_id not between", value1, value2, "topicId");
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

        public Criteria andActGoodsPriceIsNull() {
            addCriterion("act_goods_price is null");
            return (Criteria) this;
        }

        public Criteria andActGoodsPriceIsNotNull() {
            addCriterion("act_goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andActGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("act_goods_price =", value, "actGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andActGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("act_goods_price <>", value, "actGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andActGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("act_goods_price >", value, "actGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andActGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("act_goods_price >=", value, "actGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andActGoodsPriceLessThan(BigDecimal value) {
            addCriterion("act_goods_price <", value, "actGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andActGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("act_goods_price <=", value, "actGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andActGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("act_goods_price in", values, "actGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andActGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("act_goods_price not in", values, "actGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andActGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("act_goods_price between", value1, value2, "actGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andActGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("act_goods_price not between", value1, value2, "actGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andActGoodsStorageIsNull() {
            addCriterion("act_goods_storage is null");
            return (Criteria) this;
        }

        public Criteria andActGoodsStorageIsNotNull() {
            addCriterion("act_goods_storage is not null");
            return (Criteria) this;
        }

        public Criteria andActGoodsStorageEqualTo(Long value) {
            addCriterion("act_goods_storage =", value, "actGoodsStorage");
            return (Criteria) this;
        }

        public Criteria andActGoodsStorageNotEqualTo(Long value) {
            addCriterion("act_goods_storage <>", value, "actGoodsStorage");
            return (Criteria) this;
        }

        public Criteria andActGoodsStorageGreaterThan(Long value) {
            addCriterion("act_goods_storage >", value, "actGoodsStorage");
            return (Criteria) this;
        }

        public Criteria andActGoodsStorageGreaterThanOrEqualTo(Long value) {
            addCriterion("act_goods_storage >=", value, "actGoodsStorage");
            return (Criteria) this;
        }

        public Criteria andActGoodsStorageLessThan(Long value) {
            addCriterion("act_goods_storage <", value, "actGoodsStorage");
            return (Criteria) this;
        }

        public Criteria andActGoodsStorageLessThanOrEqualTo(Long value) {
            addCriterion("act_goods_storage <=", value, "actGoodsStorage");
            return (Criteria) this;
        }

        public Criteria andActGoodsStorageIn(List<Long> values) {
            addCriterion("act_goods_storage in", values, "actGoodsStorage");
            return (Criteria) this;
        }

        public Criteria andActGoodsStorageNotIn(List<Long> values) {
            addCriterion("act_goods_storage not in", values, "actGoodsStorage");
            return (Criteria) this;
        }

        public Criteria andActGoodsStorageBetween(Long value1, Long value2) {
            addCriterion("act_goods_storage between", value1, value2, "actGoodsStorage");
            return (Criteria) this;
        }

        public Criteria andActGoodsStorageNotBetween(Long value1, Long value2) {
            addCriterion("act_goods_storage not between", value1, value2, "actGoodsStorage");
            return (Criteria) this;
        }

        public Criteria andActSaleNumIsNull() {
            addCriterion("act_sale_num is null");
            return (Criteria) this;
        }

        public Criteria andActSaleNumIsNotNull() {
            addCriterion("act_sale_num is not null");
            return (Criteria) this;
        }

        public Criteria andActSaleNumEqualTo(Long value) {
            addCriterion("act_sale_num =", value, "actSaleNum");
            return (Criteria) this;
        }

        public Criteria andActSaleNumNotEqualTo(Long value) {
            addCriterion("act_sale_num <>", value, "actSaleNum");
            return (Criteria) this;
        }

        public Criteria andActSaleNumGreaterThan(Long value) {
            addCriterion("act_sale_num >", value, "actSaleNum");
            return (Criteria) this;
        }

        public Criteria andActSaleNumGreaterThanOrEqualTo(Long value) {
            addCriterion("act_sale_num >=", value, "actSaleNum");
            return (Criteria) this;
        }

        public Criteria andActSaleNumLessThan(Long value) {
            addCriterion("act_sale_num <", value, "actSaleNum");
            return (Criteria) this;
        }

        public Criteria andActSaleNumLessThanOrEqualTo(Long value) {
            addCriterion("act_sale_num <=", value, "actSaleNum");
            return (Criteria) this;
        }

        public Criteria andActSaleNumIn(List<Long> values) {
            addCriterion("act_sale_num in", values, "actSaleNum");
            return (Criteria) this;
        }

        public Criteria andActSaleNumNotIn(List<Long> values) {
            addCriterion("act_sale_num not in", values, "actSaleNum");
            return (Criteria) this;
        }

        public Criteria andActSaleNumBetween(Long value1, Long value2) {
            addCriterion("act_sale_num between", value1, value2, "actSaleNum");
            return (Criteria) this;
        }

        public Criteria andActSaleNumNotBetween(Long value1, Long value2) {
            addCriterion("act_sale_num not between", value1, value2, "actSaleNum");
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

        public Criteria andPublisherTruenameIsNull() {
            addCriterion("publisher_truename is null");
            return (Criteria) this;
        }

        public Criteria andPublisherTruenameIsNotNull() {
            addCriterion("publisher_truename is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherTruenameEqualTo(String value) {
            addCriterion("publisher_truename =", value, "publisherTruename");
            return (Criteria) this;
        }

        public Criteria andPublisherTruenameNotEqualTo(String value) {
            addCriterion("publisher_truename <>", value, "publisherTruename");
            return (Criteria) this;
        }

        public Criteria andPublisherTruenameGreaterThan(String value) {
            addCriterion("publisher_truename >", value, "publisherTruename");
            return (Criteria) this;
        }

        public Criteria andPublisherTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("publisher_truename >=", value, "publisherTruename");
            return (Criteria) this;
        }

        public Criteria andPublisherTruenameLessThan(String value) {
            addCriterion("publisher_truename <", value, "publisherTruename");
            return (Criteria) this;
        }

        public Criteria andPublisherTruenameLessThanOrEqualTo(String value) {
            addCriterion("publisher_truename <=", value, "publisherTruename");
            return (Criteria) this;
        }

        public Criteria andPublisherTruenameLike(String value) {
            addCriterion("publisher_truename like", value, "publisherTruename");
            return (Criteria) this;
        }

        public Criteria andPublisherTruenameNotLike(String value) {
            addCriterion("publisher_truename not like", value, "publisherTruename");
            return (Criteria) this;
        }

        public Criteria andPublisherTruenameIn(List<String> values) {
            addCriterion("publisher_truename in", values, "publisherTruename");
            return (Criteria) this;
        }

        public Criteria andPublisherTruenameNotIn(List<String> values) {
            addCriterion("publisher_truename not in", values, "publisherTruename");
            return (Criteria) this;
        }

        public Criteria andPublisherTruenameBetween(String value1, String value2) {
            addCriterion("publisher_truename between", value1, value2, "publisherTruename");
            return (Criteria) this;
        }

        public Criteria andPublisherTruenameNotBetween(String value1, String value2) {
            addCriterion("publisher_truename not between", value1, value2, "publisherTruename");
            return (Criteria) this;
        }

        public Criteria andActivityImageIsNull() {
            addCriterion("activity_image is null");
            return (Criteria) this;
        }

        public Criteria andActivityImageIsNotNull() {
            addCriterion("activity_image is not null");
            return (Criteria) this;
        }

        public Criteria andActivityImageEqualTo(String value) {
            addCriterion("activity_image =", value, "activityImage");
            return (Criteria) this;
        }

        public Criteria andActivityImageNotEqualTo(String value) {
            addCriterion("activity_image <>", value, "activityImage");
            return (Criteria) this;
        }

        public Criteria andActivityImageGreaterThan(String value) {
            addCriterion("activity_image >", value, "activityImage");
            return (Criteria) this;
        }

        public Criteria andActivityImageGreaterThanOrEqualTo(String value) {
            addCriterion("activity_image >=", value, "activityImage");
            return (Criteria) this;
        }

        public Criteria andActivityImageLessThan(String value) {
            addCriterion("activity_image <", value, "activityImage");
            return (Criteria) this;
        }

        public Criteria andActivityImageLessThanOrEqualTo(String value) {
            addCriterion("activity_image <=", value, "activityImage");
            return (Criteria) this;
        }

        public Criteria andActivityImageLike(String value) {
            addCriterion("activity_image like", value, "activityImage");
            return (Criteria) this;
        }

        public Criteria andActivityImageNotLike(String value) {
            addCriterion("activity_image not like", value, "activityImage");
            return (Criteria) this;
        }

        public Criteria andActivityImageIn(List<String> values) {
            addCriterion("activity_image in", values, "activityImage");
            return (Criteria) this;
        }

        public Criteria andActivityImageNotIn(List<String> values) {
            addCriterion("activity_image not in", values, "activityImage");
            return (Criteria) this;
        }

        public Criteria andActivityImageBetween(String value1, String value2) {
            addCriterion("activity_image between", value1, value2, "activityImage");
            return (Criteria) this;
        }

        public Criteria andActivityImageNotBetween(String value1, String value2) {
            addCriterion("activity_image not between", value1, value2, "activityImage");
            return (Criteria) this;
        }

        public Criteria andLatestSalenumIsNull() {
            addCriterion("latest_salenum is null");
            return (Criteria) this;
        }

        public Criteria andLatestSalenumIsNotNull() {
            addCriterion("latest_salenum is not null");
            return (Criteria) this;
        }

        public Criteria andLatestSalenumEqualTo(Integer value) {
            addCriterion("latest_salenum =", value, "latestSalenum");
            return (Criteria) this;
        }

        public Criteria andLatestSalenumNotEqualTo(Integer value) {
            addCriterion("latest_salenum <>", value, "latestSalenum");
            return (Criteria) this;
        }

        public Criteria andLatestSalenumGreaterThan(Integer value) {
            addCriterion("latest_salenum >", value, "latestSalenum");
            return (Criteria) this;
        }

        public Criteria andLatestSalenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("latest_salenum >=", value, "latestSalenum");
            return (Criteria) this;
        }

        public Criteria andLatestSalenumLessThan(Integer value) {
            addCriterion("latest_salenum <", value, "latestSalenum");
            return (Criteria) this;
        }

        public Criteria andLatestSalenumLessThanOrEqualTo(Integer value) {
            addCriterion("latest_salenum <=", value, "latestSalenum");
            return (Criteria) this;
        }

        public Criteria andLatestSalenumIn(List<Integer> values) {
            addCriterion("latest_salenum in", values, "latestSalenum");
            return (Criteria) this;
        }

        public Criteria andLatestSalenumNotIn(List<Integer> values) {
            addCriterion("latest_salenum not in", values, "latestSalenum");
            return (Criteria) this;
        }

        public Criteria andLatestSalenumBetween(Integer value1, Integer value2) {
            addCriterion("latest_salenum between", value1, value2, "latestSalenum");
            return (Criteria) this;
        }

        public Criteria andLatestSalenumNotBetween(Integer value1, Integer value2) {
            addCriterion("latest_salenum not between", value1, value2, "latestSalenum");
            return (Criteria) this;
        }

        public Criteria andGoodsModuleTypeIsNull() {
            addCriterion("goods_module_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsModuleTypeIsNotNull() {
            addCriterion("goods_module_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsModuleTypeEqualTo(Byte value) {
            addCriterion("goods_module_type =", value, "goodsModuleType");
            return (Criteria) this;
        }

        public Criteria andGoodsModuleTypeNotEqualTo(Byte value) {
            addCriterion("goods_module_type <>", value, "goodsModuleType");
            return (Criteria) this;
        }

        public Criteria andGoodsModuleTypeGreaterThan(Byte value) {
            addCriterion("goods_module_type >", value, "goodsModuleType");
            return (Criteria) this;
        }

        public Criteria andGoodsModuleTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_module_type >=", value, "goodsModuleType");
            return (Criteria) this;
        }

        public Criteria andGoodsModuleTypeLessThan(Byte value) {
            addCriterion("goods_module_type <", value, "goodsModuleType");
            return (Criteria) this;
        }

        public Criteria andGoodsModuleTypeLessThanOrEqualTo(Byte value) {
            addCriterion("goods_module_type <=", value, "goodsModuleType");
            return (Criteria) this;
        }

        public Criteria andGoodsModuleTypeIn(List<Byte> values) {
            addCriterion("goods_module_type in", values, "goodsModuleType");
            return (Criteria) this;
        }

        public Criteria andGoodsModuleTypeNotIn(List<Byte> values) {
            addCriterion("goods_module_type not in", values, "goodsModuleType");
            return (Criteria) this;
        }

        public Criteria andGoodsModuleTypeBetween(Byte value1, Byte value2) {
            addCriterion("goods_module_type between", value1, value2, "goodsModuleType");
            return (Criteria) this;
        }

        public Criteria andGoodsModuleTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_module_type not between", value1, value2, "goodsModuleType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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
     * 描述:sy_topic_goods表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-12-11
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_topic_goods 2017-12-11
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