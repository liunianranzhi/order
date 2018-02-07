package com.shanyuan.platform.ms.dao.biz.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyBizOrderGoodsExample {
    /**
     * sy_biz_order_goods
     */
    protected String orderByClause;

    /**
     * sy_biz_order_goods
     */
    protected boolean distinct;

    /**
     * sy_biz_order_goods
     */
    protected List<Criteria> oredCriteria;

    public SyBizOrderGoodsExample() {
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
     * sy_biz_order_goods 2018-01-04
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

        public Criteria andRefStoreIdIsNull() {
            addCriterion("ref_store_id is null");
            return (Criteria) this;
        }

        public Criteria andRefStoreIdIsNotNull() {
            addCriterion("ref_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefStoreIdEqualTo(Integer value) {
            addCriterion("ref_store_id =", value, "refStoreId");
            return (Criteria) this;
        }

        public Criteria andRefStoreIdNotEqualTo(Integer value) {
            addCriterion("ref_store_id <>", value, "refStoreId");
            return (Criteria) this;
        }

        public Criteria andRefStoreIdGreaterThan(Integer value) {
            addCriterion("ref_store_id >", value, "refStoreId");
            return (Criteria) this;
        }

        public Criteria andRefStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ref_store_id >=", value, "refStoreId");
            return (Criteria) this;
        }

        public Criteria andRefStoreIdLessThan(Integer value) {
            addCriterion("ref_store_id <", value, "refStoreId");
            return (Criteria) this;
        }

        public Criteria andRefStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("ref_store_id <=", value, "refStoreId");
            return (Criteria) this;
        }

        public Criteria andRefStoreIdIn(List<Integer> values) {
            addCriterion("ref_store_id in", values, "refStoreId");
            return (Criteria) this;
        }

        public Criteria andRefStoreIdNotIn(List<Integer> values) {
            addCriterion("ref_store_id not in", values, "refStoreId");
            return (Criteria) this;
        }

        public Criteria andRefStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("ref_store_id between", value1, value2, "refStoreId");
            return (Criteria) this;
        }

        public Criteria andRefStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ref_store_id not between", value1, value2, "refStoreId");
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

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitSpecIsNull() {
            addCriterion("unit_spec is null");
            return (Criteria) this;
        }

        public Criteria andUnitSpecIsNotNull() {
            addCriterion("unit_spec is not null");
            return (Criteria) this;
        }

        public Criteria andUnitSpecEqualTo(String value) {
            addCriterion("unit_spec =", value, "unitSpec");
            return (Criteria) this;
        }

        public Criteria andUnitSpecNotEqualTo(String value) {
            addCriterion("unit_spec <>", value, "unitSpec");
            return (Criteria) this;
        }

        public Criteria andUnitSpecGreaterThan(String value) {
            addCriterion("unit_spec >", value, "unitSpec");
            return (Criteria) this;
        }

        public Criteria andUnitSpecGreaterThanOrEqualTo(String value) {
            addCriterion("unit_spec >=", value, "unitSpec");
            return (Criteria) this;
        }

        public Criteria andUnitSpecLessThan(String value) {
            addCriterion("unit_spec <", value, "unitSpec");
            return (Criteria) this;
        }

        public Criteria andUnitSpecLessThanOrEqualTo(String value) {
            addCriterion("unit_spec <=", value, "unitSpec");
            return (Criteria) this;
        }

        public Criteria andUnitSpecLike(String value) {
            addCriterion("unit_spec like", value, "unitSpec");
            return (Criteria) this;
        }

        public Criteria andUnitSpecNotLike(String value) {
            addCriterion("unit_spec not like", value, "unitSpec");
            return (Criteria) this;
        }

        public Criteria andUnitSpecIn(List<String> values) {
            addCriterion("unit_spec in", values, "unitSpec");
            return (Criteria) this;
        }

        public Criteria andUnitSpecNotIn(List<String> values) {
            addCriterion("unit_spec not in", values, "unitSpec");
            return (Criteria) this;
        }

        public Criteria andUnitSpecBetween(String value1, String value2) {
            addCriterion("unit_spec between", value1, value2, "unitSpec");
            return (Criteria) this;
        }

        public Criteria andUnitSpecNotBetween(String value1, String value2) {
            addCriterion("unit_spec not between", value1, value2, "unitSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecIsNull() {
            addCriterion("product_spec is null");
            return (Criteria) this;
        }

        public Criteria andProductSpecIsNotNull() {
            addCriterion("product_spec is not null");
            return (Criteria) this;
        }

        public Criteria andProductSpecEqualTo(String value) {
            addCriterion("product_spec =", value, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecNotEqualTo(String value) {
            addCriterion("product_spec <>", value, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecGreaterThan(String value) {
            addCriterion("product_spec >", value, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecGreaterThanOrEqualTo(String value) {
            addCriterion("product_spec >=", value, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecLessThan(String value) {
            addCriterion("product_spec <", value, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecLessThanOrEqualTo(String value) {
            addCriterion("product_spec <=", value, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecLike(String value) {
            addCriterion("product_spec like", value, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecNotLike(String value) {
            addCriterion("product_spec not like", value, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecIn(List<String> values) {
            addCriterion("product_spec in", values, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecNotIn(List<String> values) {
            addCriterion("product_spec not in", values, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecBetween(String value1, String value2) {
            addCriterion("product_spec between", value1, value2, "productSpec");
            return (Criteria) this;
        }

        public Criteria andProductSpecNotBetween(String value1, String value2) {
            addCriterion("product_spec not between", value1, value2, "productSpec");
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

        public Criteria andGoodsStateEqualTo(String value) {
            addCriterion("goods_state =", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotEqualTo(String value) {
            addCriterion("goods_state <>", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateGreaterThan(String value) {
            addCriterion("goods_state >", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateGreaterThanOrEqualTo(String value) {
            addCriterion("goods_state >=", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLessThan(String value) {
            addCriterion("goods_state <", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLessThanOrEqualTo(String value) {
            addCriterion("goods_state <=", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLike(String value) {
            addCriterion("goods_state like", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotLike(String value) {
            addCriterion("goods_state not like", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIn(List<String> values) {
            addCriterion("goods_state in", values, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotIn(List<String> values) {
            addCriterion("goods_state not in", values, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateBetween(String value1, String value2) {
            addCriterion("goods_state between", value1, value2, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotBetween(String value1, String value2) {
            addCriterion("goods_state not between", value1, value2, "goodsState");
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

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Integer value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Integer value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Integer value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Integer value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Integer value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Integer> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Integer> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Integer value1, Integer value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
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

        public Criteria andWholesaleInfoIsNull() {
            addCriterion("wholesale_info is null");
            return (Criteria) this;
        }

        public Criteria andWholesaleInfoIsNotNull() {
            addCriterion("wholesale_info is not null");
            return (Criteria) this;
        }

        public Criteria andWholesaleInfoEqualTo(String value) {
            addCriterion("wholesale_info =", value, "wholesaleInfo");
            return (Criteria) this;
        }

        public Criteria andWholesaleInfoNotEqualTo(String value) {
            addCriterion("wholesale_info <>", value, "wholesaleInfo");
            return (Criteria) this;
        }

        public Criteria andWholesaleInfoGreaterThan(String value) {
            addCriterion("wholesale_info >", value, "wholesaleInfo");
            return (Criteria) this;
        }

        public Criteria andWholesaleInfoGreaterThanOrEqualTo(String value) {
            addCriterion("wholesale_info >=", value, "wholesaleInfo");
            return (Criteria) this;
        }

        public Criteria andWholesaleInfoLessThan(String value) {
            addCriterion("wholesale_info <", value, "wholesaleInfo");
            return (Criteria) this;
        }

        public Criteria andWholesaleInfoLessThanOrEqualTo(String value) {
            addCriterion("wholesale_info <=", value, "wholesaleInfo");
            return (Criteria) this;
        }

        public Criteria andWholesaleInfoLike(String value) {
            addCriterion("wholesale_info like", value, "wholesaleInfo");
            return (Criteria) this;
        }

        public Criteria andWholesaleInfoNotLike(String value) {
            addCriterion("wholesale_info not like", value, "wholesaleInfo");
            return (Criteria) this;
        }

        public Criteria andWholesaleInfoIn(List<String> values) {
            addCriterion("wholesale_info in", values, "wholesaleInfo");
            return (Criteria) this;
        }

        public Criteria andWholesaleInfoNotIn(List<String> values) {
            addCriterion("wholesale_info not in", values, "wholesaleInfo");
            return (Criteria) this;
        }

        public Criteria andWholesaleInfoBetween(String value1, String value2) {
            addCriterion("wholesale_info between", value1, value2, "wholesaleInfo");
            return (Criteria) this;
        }

        public Criteria andWholesaleInfoNotBetween(String value1, String value2) {
            addCriterion("wholesale_info not between", value1, value2, "wholesaleInfo");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_biz_order_goods表的实体类
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
     * sy_biz_order_goods 2018-01-04
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