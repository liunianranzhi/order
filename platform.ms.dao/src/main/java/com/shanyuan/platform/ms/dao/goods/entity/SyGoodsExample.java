package com.shanyuan.platform.ms.dao.goods.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyGoodsExample {
    /**
     * sy_goods
     */
    protected String orderByClause;

    /**
     * sy_goods
     */
    protected boolean distinct;

    /**
     * sy_goods
     */
    protected List<Criteria> oredCriteria;

    public SyGoodsExample() {
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
     * sy_goods 2017-10-16
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

        public Criteria andGoodsJingleIsNull() {
            addCriterion("goods_jingle is null");
            return (Criteria) this;
        }

        public Criteria andGoodsJingleIsNotNull() {
            addCriterion("goods_jingle is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsJingleEqualTo(String value) {
            addCriterion("goods_jingle =", value, "goodsJingle");
            return (Criteria) this;
        }

        public Criteria andGoodsJingleNotEqualTo(String value) {
            addCriterion("goods_jingle <>", value, "goodsJingle");
            return (Criteria) this;
        }

        public Criteria andGoodsJingleGreaterThan(String value) {
            addCriterion("goods_jingle >", value, "goodsJingle");
            return (Criteria) this;
        }

        public Criteria andGoodsJingleGreaterThanOrEqualTo(String value) {
            addCriterion("goods_jingle >=", value, "goodsJingle");
            return (Criteria) this;
        }

        public Criteria andGoodsJingleLessThan(String value) {
            addCriterion("goods_jingle <", value, "goodsJingle");
            return (Criteria) this;
        }

        public Criteria andGoodsJingleLessThanOrEqualTo(String value) {
            addCriterion("goods_jingle <=", value, "goodsJingle");
            return (Criteria) this;
        }

        public Criteria andGoodsJingleLike(String value) {
            addCriterion("goods_jingle like", value, "goodsJingle");
            return (Criteria) this;
        }

        public Criteria andGoodsJingleNotLike(String value) {
            addCriterion("goods_jingle not like", value, "goodsJingle");
            return (Criteria) this;
        }

        public Criteria andGoodsJingleIn(List<String> values) {
            addCriterion("goods_jingle in", values, "goodsJingle");
            return (Criteria) this;
        }

        public Criteria andGoodsJingleNotIn(List<String> values) {
            addCriterion("goods_jingle not in", values, "goodsJingle");
            return (Criteria) this;
        }

        public Criteria andGoodsJingleBetween(String value1, String value2) {
            addCriterion("goods_jingle between", value1, value2, "goodsJingle");
            return (Criteria) this;
        }

        public Criteria andGoodsJingleNotBetween(String value1, String value2) {
            addCriterion("goods_jingle not between", value1, value2, "goodsJingle");
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

        public Criteria andGcIdIsNull() {
            addCriterion("gc_id is null");
            return (Criteria) this;
        }

        public Criteria andGcIdIsNotNull() {
            addCriterion("gc_id is not null");
            return (Criteria) this;
        }

        public Criteria andGcIdEqualTo(Integer value) {
            addCriterion("gc_id =", value, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdNotEqualTo(Integer value) {
            addCriterion("gc_id <>", value, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdGreaterThan(Integer value) {
            addCriterion("gc_id >", value, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gc_id >=", value, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdLessThan(Integer value) {
            addCriterion("gc_id <", value, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdLessThanOrEqualTo(Integer value) {
            addCriterion("gc_id <=", value, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdIn(List<Integer> values) {
            addCriterion("gc_id in", values, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdNotIn(List<Integer> values) {
            addCriterion("gc_id not in", values, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdBetween(Integer value1, Integer value2) {
            addCriterion("gc_id between", value1, value2, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gc_id not between", value1, value2, "gcId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
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

        public Criteria andGoodsMarketpriceIsNull() {
            addCriterion("goods_marketprice is null");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketpriceIsNotNull() {
            addCriterion("goods_marketprice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketpriceEqualTo(BigDecimal value) {
            addCriterion("goods_marketprice =", value, "goodsMarketprice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketpriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_marketprice <>", value, "goodsMarketprice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketpriceGreaterThan(BigDecimal value) {
            addCriterion("goods_marketprice >", value, "goodsMarketprice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_marketprice >=", value, "goodsMarketprice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketpriceLessThan(BigDecimal value) {
            addCriterion("goods_marketprice <", value, "goodsMarketprice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_marketprice <=", value, "goodsMarketprice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketpriceIn(List<BigDecimal> values) {
            addCriterion("goods_marketprice in", values, "goodsMarketprice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketpriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_marketprice not in", values, "goodsMarketprice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_marketprice between", value1, value2, "goodsMarketprice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_marketprice not between", value1, value2, "goodsMarketprice");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialIsNull() {
            addCriterion("goods_serial is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialIsNotNull() {
            addCriterion("goods_serial is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialEqualTo(String value) {
            addCriterion("goods_serial =", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialNotEqualTo(String value) {
            addCriterion("goods_serial <>", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialGreaterThan(String value) {
            addCriterion("goods_serial >", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialGreaterThanOrEqualTo(String value) {
            addCriterion("goods_serial >=", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialLessThan(String value) {
            addCriterion("goods_serial <", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialLessThanOrEqualTo(String value) {
            addCriterion("goods_serial <=", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialLike(String value) {
            addCriterion("goods_serial like", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialNotLike(String value) {
            addCriterion("goods_serial not like", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialIn(List<String> values) {
            addCriterion("goods_serial in", values, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialNotIn(List<String> values) {
            addCriterion("goods_serial not in", values, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialBetween(String value1, String value2) {
            addCriterion("goods_serial between", value1, value2, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialNotBetween(String value1, String value2) {
            addCriterion("goods_serial not between", value1, value2, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsClickIsNull() {
            addCriterion("goods_click is null");
            return (Criteria) this;
        }

        public Criteria andGoodsClickIsNotNull() {
            addCriterion("goods_click is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsClickEqualTo(Integer value) {
            addCriterion("goods_click =", value, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNotEqualTo(Integer value) {
            addCriterion("goods_click <>", value, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickGreaterThan(Integer value) {
            addCriterion("goods_click >", value, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_click >=", value, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickLessThan(Integer value) {
            addCriterion("goods_click <", value, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickLessThanOrEqualTo(Integer value) {
            addCriterion("goods_click <=", value, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickIn(List<Integer> values) {
            addCriterion("goods_click in", values, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNotIn(List<Integer> values) {
            addCriterion("goods_click not in", values, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickBetween(Integer value1, Integer value2) {
            addCriterion("goods_click between", value1, value2, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_click not between", value1, value2, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsSalenumIsNull() {
            addCriterion("goods_salenum is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSalenumIsNotNull() {
            addCriterion("goods_salenum is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSalenumEqualTo(Integer value) {
            addCriterion("goods_salenum =", value, "goodsSalenum");
            return (Criteria) this;
        }

        public Criteria andGoodsSalenumNotEqualTo(Integer value) {
            addCriterion("goods_salenum <>", value, "goodsSalenum");
            return (Criteria) this;
        }

        public Criteria andGoodsSalenumGreaterThan(Integer value) {
            addCriterion("goods_salenum >", value, "goodsSalenum");
            return (Criteria) this;
        }

        public Criteria andGoodsSalenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_salenum >=", value, "goodsSalenum");
            return (Criteria) this;
        }

        public Criteria andGoodsSalenumLessThan(Integer value) {
            addCriterion("goods_salenum <", value, "goodsSalenum");
            return (Criteria) this;
        }

        public Criteria andGoodsSalenumLessThanOrEqualTo(Integer value) {
            addCriterion("goods_salenum <=", value, "goodsSalenum");
            return (Criteria) this;
        }

        public Criteria andGoodsSalenumIn(List<Integer> values) {
            addCriterion("goods_salenum in", values, "goodsSalenum");
            return (Criteria) this;
        }

        public Criteria andGoodsSalenumNotIn(List<Integer> values) {
            addCriterion("goods_salenum not in", values, "goodsSalenum");
            return (Criteria) this;
        }

        public Criteria andGoodsSalenumBetween(Integer value1, Integer value2) {
            addCriterion("goods_salenum between", value1, value2, "goodsSalenum");
            return (Criteria) this;
        }

        public Criteria andGoodsSalenumNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_salenum not between", value1, value2, "goodsSalenum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectIsNull() {
            addCriterion("goods_collect is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectIsNotNull() {
            addCriterion("goods_collect is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectEqualTo(Integer value) {
            addCriterion("goods_collect =", value, "goodsCollect");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNotEqualTo(Integer value) {
            addCriterion("goods_collect <>", value, "goodsCollect");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectGreaterThan(Integer value) {
            addCriterion("goods_collect >", value, "goodsCollect");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_collect >=", value, "goodsCollect");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectLessThan(Integer value) {
            addCriterion("goods_collect <", value, "goodsCollect");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectLessThanOrEqualTo(Integer value) {
            addCriterion("goods_collect <=", value, "goodsCollect");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectIn(List<Integer> values) {
            addCriterion("goods_collect in", values, "goodsCollect");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNotIn(List<Integer> values) {
            addCriterion("goods_collect not in", values, "goodsCollect");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectBetween(Integer value1, Integer value2) {
            addCriterion("goods_collect between", value1, value2, "goodsCollect");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_collect not between", value1, value2, "goodsCollect");
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

        public Criteria andGoodsVerifyIsNull() {
            addCriterion("goods_verify is null");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyIsNotNull() {
            addCriterion("goods_verify is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyEqualTo(Byte value) {
            addCriterion("goods_verify =", value, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyNotEqualTo(Byte value) {
            addCriterion("goods_verify <>", value, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyGreaterThan(Byte value) {
            addCriterion("goods_verify >", value, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_verify >=", value, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyLessThan(Byte value) {
            addCriterion("goods_verify <", value, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyLessThanOrEqualTo(Byte value) {
            addCriterion("goods_verify <=", value, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyIn(List<Byte> values) {
            addCriterion("goods_verify in", values, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyNotIn(List<Byte> values) {
            addCriterion("goods_verify not in", values, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyBetween(Byte value1, Byte value2) {
            addCriterion("goods_verify between", value1, value2, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_verify not between", value1, value2, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeIsNull() {
            addCriterion("goods_addtime is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeIsNotNull() {
            addCriterion("goods_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeEqualTo(Integer value) {
            addCriterion("goods_addtime =", value, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeNotEqualTo(Integer value) {
            addCriterion("goods_addtime <>", value, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeGreaterThan(Integer value) {
            addCriterion("goods_addtime >", value, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_addtime >=", value, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeLessThan(Integer value) {
            addCriterion("goods_addtime <", value, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("goods_addtime <=", value, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeIn(List<Integer> values) {
            addCriterion("goods_addtime in", values, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeNotIn(List<Integer> values) {
            addCriterion("goods_addtime not in", values, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("goods_addtime between", value1, value2, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_addtime not between", value1, value2, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsEdittimeIsNull() {
            addCriterion("goods_edittime is null");
            return (Criteria) this;
        }

        public Criteria andGoodsEdittimeIsNotNull() {
            addCriterion("goods_edittime is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsEdittimeEqualTo(Integer value) {
            addCriterion("goods_edittime =", value, "goodsEdittime");
            return (Criteria) this;
        }

        public Criteria andGoodsEdittimeNotEqualTo(Integer value) {
            addCriterion("goods_edittime <>", value, "goodsEdittime");
            return (Criteria) this;
        }

        public Criteria andGoodsEdittimeGreaterThan(Integer value) {
            addCriterion("goods_edittime >", value, "goodsEdittime");
            return (Criteria) this;
        }

        public Criteria andGoodsEdittimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_edittime >=", value, "goodsEdittime");
            return (Criteria) this;
        }

        public Criteria andGoodsEdittimeLessThan(Integer value) {
            addCriterion("goods_edittime <", value, "goodsEdittime");
            return (Criteria) this;
        }

        public Criteria andGoodsEdittimeLessThanOrEqualTo(Integer value) {
            addCriterion("goods_edittime <=", value, "goodsEdittime");
            return (Criteria) this;
        }

        public Criteria andGoodsEdittimeIn(List<Integer> values) {
            addCriterion("goods_edittime in", values, "goodsEdittime");
            return (Criteria) this;
        }

        public Criteria andGoodsEdittimeNotIn(List<Integer> values) {
            addCriterion("goods_edittime not in", values, "goodsEdittime");
            return (Criteria) this;
        }

        public Criteria andGoodsEdittimeBetween(Integer value1, Integer value2) {
            addCriterion("goods_edittime between", value1, value2, "goodsEdittime");
            return (Criteria) this;
        }

        public Criteria andGoodsEdittimeNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_edittime not between", value1, value2, "goodsEdittime");
            return (Criteria) this;
        }

        public Criteria andAreaid1IsNull() {
            addCriterion("areaid_1 is null");
            return (Criteria) this;
        }

        public Criteria andAreaid1IsNotNull() {
            addCriterion("areaid_1 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaid1EqualTo(Integer value) {
            addCriterion("areaid_1 =", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1NotEqualTo(Integer value) {
            addCriterion("areaid_1 <>", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1GreaterThan(Integer value) {
            addCriterion("areaid_1 >", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1GreaterThanOrEqualTo(Integer value) {
            addCriterion("areaid_1 >=", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1LessThan(Integer value) {
            addCriterion("areaid_1 <", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1LessThanOrEqualTo(Integer value) {
            addCriterion("areaid_1 <=", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1In(List<Integer> values) {
            addCriterion("areaid_1 in", values, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1NotIn(List<Integer> values) {
            addCriterion("areaid_1 not in", values, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1Between(Integer value1, Integer value2) {
            addCriterion("areaid_1 between", value1, value2, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1NotBetween(Integer value1, Integer value2) {
            addCriterion("areaid_1 not between", value1, value2, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid2IsNull() {
            addCriterion("areaid_2 is null");
            return (Criteria) this;
        }

        public Criteria andAreaid2IsNotNull() {
            addCriterion("areaid_2 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaid2EqualTo(Integer value) {
            addCriterion("areaid_2 =", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2NotEqualTo(Integer value) {
            addCriterion("areaid_2 <>", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2GreaterThan(Integer value) {
            addCriterion("areaid_2 >", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2GreaterThanOrEqualTo(Integer value) {
            addCriterion("areaid_2 >=", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2LessThan(Integer value) {
            addCriterion("areaid_2 <", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2LessThanOrEqualTo(Integer value) {
            addCriterion("areaid_2 <=", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2In(List<Integer> values) {
            addCriterion("areaid_2 in", values, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2NotIn(List<Integer> values) {
            addCriterion("areaid_2 not in", values, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2Between(Integer value1, Integer value2) {
            addCriterion("areaid_2 between", value1, value2, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2NotBetween(Integer value1, Integer value2) {
            addCriterion("areaid_2 not between", value1, value2, "areaid2");
            return (Criteria) this;
        }

        public Criteria andColorIdIsNull() {
            addCriterion("color_id is null");
            return (Criteria) this;
        }

        public Criteria andColorIdIsNotNull() {
            addCriterion("color_id is not null");
            return (Criteria) this;
        }

        public Criteria andColorIdEqualTo(Integer value) {
            addCriterion("color_id =", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotEqualTo(Integer value) {
            addCriterion("color_id <>", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdGreaterThan(Integer value) {
            addCriterion("color_id >", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("color_id >=", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdLessThan(Integer value) {
            addCriterion("color_id <", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdLessThanOrEqualTo(Integer value) {
            addCriterion("color_id <=", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdIn(List<Integer> values) {
            addCriterion("color_id in", values, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotIn(List<Integer> values) {
            addCriterion("color_id not in", values, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdBetween(Integer value1, Integer value2) {
            addCriterion("color_id between", value1, value2, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("color_id not between", value1, value2, "colorId");
            return (Criteria) this;
        }

        public Criteria andTransportIdIsNull() {
            addCriterion("transport_id is null");
            return (Criteria) this;
        }

        public Criteria andTransportIdIsNotNull() {
            addCriterion("transport_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransportIdEqualTo(Integer value) {
            addCriterion("transport_id =", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdNotEqualTo(Integer value) {
            addCriterion("transport_id <>", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdGreaterThan(Integer value) {
            addCriterion("transport_id >", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("transport_id >=", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdLessThan(Integer value) {
            addCriterion("transport_id <", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdLessThanOrEqualTo(Integer value) {
            addCriterion("transport_id <=", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdIn(List<Integer> values) {
            addCriterion("transport_id in", values, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdNotIn(List<Integer> values) {
            addCriterion("transport_id not in", values, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdBetween(Integer value1, Integer value2) {
            addCriterion("transport_id between", value1, value2, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdNotBetween(Integer value1, Integer value2) {
            addCriterion("transport_id not between", value1, value2, "transportId");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightIsNull() {
            addCriterion("goods_freight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightIsNotNull() {
            addCriterion("goods_freight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightEqualTo(BigDecimal value) {
            addCriterion("goods_freight =", value, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightNotEqualTo(BigDecimal value) {
            addCriterion("goods_freight <>", value, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightGreaterThan(BigDecimal value) {
            addCriterion("goods_freight >", value, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_freight >=", value, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightLessThan(BigDecimal value) {
            addCriterion("goods_freight <", value, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_freight <=", value, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightIn(List<BigDecimal> values) {
            addCriterion("goods_freight in", values, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightNotIn(List<BigDecimal> values) {
            addCriterion("goods_freight not in", values, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_freight between", value1, value2, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_freight not between", value1, value2, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsVatIsNull() {
            addCriterion("goods_vat is null");
            return (Criteria) this;
        }

        public Criteria andGoodsVatIsNotNull() {
            addCriterion("goods_vat is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsVatEqualTo(Byte value) {
            addCriterion("goods_vat =", value, "goodsVat");
            return (Criteria) this;
        }

        public Criteria andGoodsVatNotEqualTo(Byte value) {
            addCriterion("goods_vat <>", value, "goodsVat");
            return (Criteria) this;
        }

        public Criteria andGoodsVatGreaterThan(Byte value) {
            addCriterion("goods_vat >", value, "goodsVat");
            return (Criteria) this;
        }

        public Criteria andGoodsVatGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_vat >=", value, "goodsVat");
            return (Criteria) this;
        }

        public Criteria andGoodsVatLessThan(Byte value) {
            addCriterion("goods_vat <", value, "goodsVat");
            return (Criteria) this;
        }

        public Criteria andGoodsVatLessThanOrEqualTo(Byte value) {
            addCriterion("goods_vat <=", value, "goodsVat");
            return (Criteria) this;
        }

        public Criteria andGoodsVatIn(List<Byte> values) {
            addCriterion("goods_vat in", values, "goodsVat");
            return (Criteria) this;
        }

        public Criteria andGoodsVatNotIn(List<Byte> values) {
            addCriterion("goods_vat not in", values, "goodsVat");
            return (Criteria) this;
        }

        public Criteria andGoodsVatBetween(Byte value1, Byte value2) {
            addCriterion("goods_vat between", value1, value2, "goodsVat");
            return (Criteria) this;
        }

        public Criteria andGoodsVatNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_vat not between", value1, value2, "goodsVat");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendIsNull() {
            addCriterion("goods_commend is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendIsNotNull() {
            addCriterion("goods_commend is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendEqualTo(Byte value) {
            addCriterion("goods_commend =", value, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendNotEqualTo(Byte value) {
            addCriterion("goods_commend <>", value, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendGreaterThan(Byte value) {
            addCriterion("goods_commend >", value, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_commend >=", value, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendLessThan(Byte value) {
            addCriterion("goods_commend <", value, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendLessThanOrEqualTo(Byte value) {
            addCriterion("goods_commend <=", value, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendIn(List<Byte> values) {
            addCriterion("goods_commend in", values, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendNotIn(List<Byte> values) {
            addCriterion("goods_commend not in", values, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendBetween(Byte value1, Byte value2) {
            addCriterion("goods_commend between", value1, value2, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_commend not between", value1, value2, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsIsNull() {
            addCriterion("goods_stcids is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsIsNotNull() {
            addCriterion("goods_stcids is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsEqualTo(String value) {
            addCriterion("goods_stcids =", value, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsNotEqualTo(String value) {
            addCriterion("goods_stcids <>", value, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsGreaterThan(String value) {
            addCriterion("goods_stcids >", value, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsGreaterThanOrEqualTo(String value) {
            addCriterion("goods_stcids >=", value, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsLessThan(String value) {
            addCriterion("goods_stcids <", value, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsLessThanOrEqualTo(String value) {
            addCriterion("goods_stcids <=", value, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsLike(String value) {
            addCriterion("goods_stcids like", value, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsNotLike(String value) {
            addCriterion("goods_stcids not like", value, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsIn(List<String> values) {
            addCriterion("goods_stcids in", values, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsNotIn(List<String> values) {
            addCriterion("goods_stcids not in", values, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsBetween(String value1, String value2) {
            addCriterion("goods_stcids between", value1, value2, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsNotBetween(String value1, String value2) {
            addCriterion("goods_stcids not between", value1, value2, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andEvaluationGoodStarIsNull() {
            addCriterion("evaluation_good_star is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationGoodStarIsNotNull() {
            addCriterion("evaluation_good_star is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationGoodStarEqualTo(Byte value) {
            addCriterion("evaluation_good_star =", value, "evaluationGoodStar");
            return (Criteria) this;
        }

        public Criteria andEvaluationGoodStarNotEqualTo(Byte value) {
            addCriterion("evaluation_good_star <>", value, "evaluationGoodStar");
            return (Criteria) this;
        }

        public Criteria andEvaluationGoodStarGreaterThan(Byte value) {
            addCriterion("evaluation_good_star >", value, "evaluationGoodStar");
            return (Criteria) this;
        }

        public Criteria andEvaluationGoodStarGreaterThanOrEqualTo(Byte value) {
            addCriterion("evaluation_good_star >=", value, "evaluationGoodStar");
            return (Criteria) this;
        }

        public Criteria andEvaluationGoodStarLessThan(Byte value) {
            addCriterion("evaluation_good_star <", value, "evaluationGoodStar");
            return (Criteria) this;
        }

        public Criteria andEvaluationGoodStarLessThanOrEqualTo(Byte value) {
            addCriterion("evaluation_good_star <=", value, "evaluationGoodStar");
            return (Criteria) this;
        }

        public Criteria andEvaluationGoodStarIn(List<Byte> values) {
            addCriterion("evaluation_good_star in", values, "evaluationGoodStar");
            return (Criteria) this;
        }

        public Criteria andEvaluationGoodStarNotIn(List<Byte> values) {
            addCriterion("evaluation_good_star not in", values, "evaluationGoodStar");
            return (Criteria) this;
        }

        public Criteria andEvaluationGoodStarBetween(Byte value1, Byte value2) {
            addCriterion("evaluation_good_star between", value1, value2, "evaluationGoodStar");
            return (Criteria) this;
        }

        public Criteria andEvaluationGoodStarNotBetween(Byte value1, Byte value2) {
            addCriterion("evaluation_good_star not between", value1, value2, "evaluationGoodStar");
            return (Criteria) this;
        }

        public Criteria andEvaluationCountIsNull() {
            addCriterion("evaluation_count is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationCountIsNotNull() {
            addCriterion("evaluation_count is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationCountEqualTo(Integer value) {
            addCriterion("evaluation_count =", value, "evaluationCount");
            return (Criteria) this;
        }

        public Criteria andEvaluationCountNotEqualTo(Integer value) {
            addCriterion("evaluation_count <>", value, "evaluationCount");
            return (Criteria) this;
        }

        public Criteria andEvaluationCountGreaterThan(Integer value) {
            addCriterion("evaluation_count >", value, "evaluationCount");
            return (Criteria) this;
        }

        public Criteria andEvaluationCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluation_count >=", value, "evaluationCount");
            return (Criteria) this;
        }

        public Criteria andEvaluationCountLessThan(Integer value) {
            addCriterion("evaluation_count <", value, "evaluationCount");
            return (Criteria) this;
        }

        public Criteria andEvaluationCountLessThanOrEqualTo(Integer value) {
            addCriterion("evaluation_count <=", value, "evaluationCount");
            return (Criteria) this;
        }

        public Criteria andEvaluationCountIn(List<Integer> values) {
            addCriterion("evaluation_count in", values, "evaluationCount");
            return (Criteria) this;
        }

        public Criteria andEvaluationCountNotIn(List<Integer> values) {
            addCriterion("evaluation_count not in", values, "evaluationCount");
            return (Criteria) this;
        }

        public Criteria andEvaluationCountBetween(Integer value1, Integer value2) {
            addCriterion("evaluation_count between", value1, value2, "evaluationCount");
            return (Criteria) this;
        }

        public Criteria andEvaluationCountNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluation_count not between", value1, value2, "evaluationCount");
            return (Criteria) this;
        }

        public Criteria andGoodsApplynumIsNull() {
            addCriterion("goods_applynum is null");
            return (Criteria) this;
        }

        public Criteria andGoodsApplynumIsNotNull() {
            addCriterion("goods_applynum is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsApplynumEqualTo(Integer value) {
            addCriterion("goods_applynum =", value, "goodsApplynum");
            return (Criteria) this;
        }

        public Criteria andGoodsApplynumNotEqualTo(Integer value) {
            addCriterion("goods_applynum <>", value, "goodsApplynum");
            return (Criteria) this;
        }

        public Criteria andGoodsApplynumGreaterThan(Integer value) {
            addCriterion("goods_applynum >", value, "goodsApplynum");
            return (Criteria) this;
        }

        public Criteria andGoodsApplynumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_applynum >=", value, "goodsApplynum");
            return (Criteria) this;
        }

        public Criteria andGoodsApplynumLessThan(Integer value) {
            addCriterion("goods_applynum <", value, "goodsApplynum");
            return (Criteria) this;
        }

        public Criteria andGoodsApplynumLessThanOrEqualTo(Integer value) {
            addCriterion("goods_applynum <=", value, "goodsApplynum");
            return (Criteria) this;
        }

        public Criteria andGoodsApplynumIn(List<Integer> values) {
            addCriterion("goods_applynum in", values, "goodsApplynum");
            return (Criteria) this;
        }

        public Criteria andGoodsApplynumNotIn(List<Integer> values) {
            addCriterion("goods_applynum not in", values, "goodsApplynum");
            return (Criteria) this;
        }

        public Criteria andGoodsApplynumBetween(Integer value1, Integer value2) {
            addCriterion("goods_applynum between", value1, value2, "goodsApplynum");
            return (Criteria) this;
        }

        public Criteria andGoodsApplynumNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_applynum not between", value1, value2, "goodsApplynum");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderStateIsNull() {
            addCriterion("goods_order_state is null");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderStateIsNotNull() {
            addCriterion("goods_order_state is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderStateEqualTo(String value) {
            addCriterion("goods_order_state =", value, "goodsOrderState");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderStateNotEqualTo(String value) {
            addCriterion("goods_order_state <>", value, "goodsOrderState");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderStateGreaterThan(String value) {
            addCriterion("goods_order_state >", value, "goodsOrderState");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderStateGreaterThanOrEqualTo(String value) {
            addCriterion("goods_order_state >=", value, "goodsOrderState");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderStateLessThan(String value) {
            addCriterion("goods_order_state <", value, "goodsOrderState");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderStateLessThanOrEqualTo(String value) {
            addCriterion("goods_order_state <=", value, "goodsOrderState");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderStateLike(String value) {
            addCriterion("goods_order_state like", value, "goodsOrderState");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderStateNotLike(String value) {
            addCriterion("goods_order_state not like", value, "goodsOrderState");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderStateIn(List<String> values) {
            addCriterion("goods_order_state in", values, "goodsOrderState");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderStateNotIn(List<String> values) {
            addCriterion("goods_order_state not in", values, "goodsOrderState");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderStateBetween(String value1, String value2) {
            addCriterion("goods_order_state between", value1, value2, "goodsOrderState");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderStateNotBetween(String value1, String value2) {
            addCriterion("goods_order_state not between", value1, value2, "goodsOrderState");
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

        public Criteria andBuyerTypeIsNull() {
            addCriterion("buyer_type is null");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeIsNotNull() {
            addCriterion("buyer_type is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeEqualTo(String value) {
            addCriterion("buyer_type =", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeNotEqualTo(String value) {
            addCriterion("buyer_type <>", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeGreaterThan(String value) {
            addCriterion("buyer_type >", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_type >=", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeLessThan(String value) {
            addCriterion("buyer_type <", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeLessThanOrEqualTo(String value) {
            addCriterion("buyer_type <=", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeLike(String value) {
            addCriterion("buyer_type like", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeNotLike(String value) {
            addCriterion("buyer_type not like", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeIn(List<String> values) {
            addCriterion("buyer_type in", values, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeNotIn(List<String> values) {
            addCriterion("buyer_type not in", values, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeBetween(String value1, String value2) {
            addCriterion("buyer_type between", value1, value2, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeNotBetween(String value1, String value2) {
            addCriterion("buyer_type not between", value1, value2, "buyerType");
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

        public Criteria andMaxBuyNumIsNull() {
            addCriterion("max_buy_num is null");
            return (Criteria) this;
        }

        public Criteria andMaxBuyNumIsNotNull() {
            addCriterion("max_buy_num is not null");
            return (Criteria) this;
        }

        public Criteria andMaxBuyNumEqualTo(Integer value) {
            addCriterion("max_buy_num =", value, "maxBuyNum");
            return (Criteria) this;
        }

        public Criteria andMaxBuyNumNotEqualTo(Integer value) {
            addCriterion("max_buy_num <>", value, "maxBuyNum");
            return (Criteria) this;
        }

        public Criteria andMaxBuyNumGreaterThan(Integer value) {
            addCriterion("max_buy_num >", value, "maxBuyNum");
            return (Criteria) this;
        }

        public Criteria andMaxBuyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_buy_num >=", value, "maxBuyNum");
            return (Criteria) this;
        }

        public Criteria andMaxBuyNumLessThan(Integer value) {
            addCriterion("max_buy_num <", value, "maxBuyNum");
            return (Criteria) this;
        }

        public Criteria andMaxBuyNumLessThanOrEqualTo(Integer value) {
            addCriterion("max_buy_num <=", value, "maxBuyNum");
            return (Criteria) this;
        }

        public Criteria andMaxBuyNumIn(List<Integer> values) {
            addCriterion("max_buy_num in", values, "maxBuyNum");
            return (Criteria) this;
        }

        public Criteria andMaxBuyNumNotIn(List<Integer> values) {
            addCriterion("max_buy_num not in", values, "maxBuyNum");
            return (Criteria) this;
        }

        public Criteria andMaxBuyNumBetween(Integer value1, Integer value2) {
            addCriterion("max_buy_num between", value1, value2, "maxBuyNum");
            return (Criteria) this;
        }

        public Criteria andMaxBuyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("max_buy_num not between", value1, value2, "maxBuyNum");
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

        public Criteria andShowStateIsNull() {
            addCriterion("show_state is null");
            return (Criteria) this;
        }

        public Criteria andShowStateIsNotNull() {
            addCriterion("show_state is not null");
            return (Criteria) this;
        }

        public Criteria andShowStateEqualTo(String value) {
            addCriterion("show_state =", value, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateNotEqualTo(String value) {
            addCriterion("show_state <>", value, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateGreaterThan(String value) {
            addCriterion("show_state >", value, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateGreaterThanOrEqualTo(String value) {
            addCriterion("show_state >=", value, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateLessThan(String value) {
            addCriterion("show_state <", value, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateLessThanOrEqualTo(String value) {
            addCriterion("show_state <=", value, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateLike(String value) {
            addCriterion("show_state like", value, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateNotLike(String value) {
            addCriterion("show_state not like", value, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateIn(List<String> values) {
            addCriterion("show_state in", values, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateNotIn(List<String> values) {
            addCriterion("show_state not in", values, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateBetween(String value1, String value2) {
            addCriterion("show_state between", value1, value2, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateNotBetween(String value1, String value2) {
            addCriterion("show_state not between", value1, value2, "showState");
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
    }

    /**
     * 描述:sy_goods表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2017-10-16
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_goods 2017-10-16
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