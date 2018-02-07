package com.shanyuan.platform.ms.dao.goods.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyGoodsCommonExample {
    /**
     * sy_goods_common
     */
    protected String orderByClause;

    /**
     * sy_goods_common
     */
    protected boolean distinct;

    /**
     * sy_goods_common
     */
    protected List<Criteria> oredCriteria;

    public SyGoodsCommonExample() {
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
     * sy_goods_common 2017-10-25
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

        public Criteria andGoodsTitleIsNull() {
            addCriterion("goods_title is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleIsNotNull() {
            addCriterion("goods_title is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleEqualTo(String value) {
            addCriterion("goods_title =", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotEqualTo(String value) {
            addCriterion("goods_title <>", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleGreaterThan(String value) {
            addCriterion("goods_title >", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("goods_title >=", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLessThan(String value) {
            addCriterion("goods_title <", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLessThanOrEqualTo(String value) {
            addCriterion("goods_title <=", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLike(String value) {
            addCriterion("goods_title like", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotLike(String value) {
            addCriterion("goods_title not like", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleIn(List<String> values) {
            addCriterion("goods_title in", values, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotIn(List<String> values) {
            addCriterion("goods_title not in", values, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleBetween(String value1, String value2) {
            addCriterion("goods_title between", value1, value2, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotBetween(String value1, String value2) {
            addCriterion("goods_title not between", value1, value2, "goodsTitle");
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

        public Criteria andGcNameIsNull() {
            addCriterion("gc_name is null");
            return (Criteria) this;
        }

        public Criteria andGcNameIsNotNull() {
            addCriterion("gc_name is not null");
            return (Criteria) this;
        }

        public Criteria andGcNameEqualTo(String value) {
            addCriterion("gc_name =", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameNotEqualTo(String value) {
            addCriterion("gc_name <>", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameGreaterThan(String value) {
            addCriterion("gc_name >", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameGreaterThanOrEqualTo(String value) {
            addCriterion("gc_name >=", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameLessThan(String value) {
            addCriterion("gc_name <", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameLessThanOrEqualTo(String value) {
            addCriterion("gc_name <=", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameLike(String value) {
            addCriterion("gc_name like", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameNotLike(String value) {
            addCriterion("gc_name not like", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameIn(List<String> values) {
            addCriterion("gc_name in", values, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameNotIn(List<String> values) {
            addCriterion("gc_name not in", values, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameBetween(String value1, String value2) {
            addCriterion("gc_name between", value1, value2, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameNotBetween(String value1, String value2) {
            addCriterion("gc_name not between", value1, value2, "gcName");
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

        public Criteria andSpecNameIsNull() {
            addCriterion("spec_name is null");
            return (Criteria) this;
        }

        public Criteria andSpecNameIsNotNull() {
            addCriterion("spec_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpecNameEqualTo(String value) {
            addCriterion("spec_name =", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotEqualTo(String value) {
            addCriterion("spec_name <>", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThan(String value) {
            addCriterion("spec_name >", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThanOrEqualTo(String value) {
            addCriterion("spec_name >=", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThan(String value) {
            addCriterion("spec_name <", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThanOrEqualTo(String value) {
            addCriterion("spec_name <=", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLike(String value) {
            addCriterion("spec_name like", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotLike(String value) {
            addCriterion("spec_name not like", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameIn(List<String> values) {
            addCriterion("spec_name in", values, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotIn(List<String> values) {
            addCriterion("spec_name not in", values, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameBetween(String value1, String value2) {
            addCriterion("spec_name between", value1, value2, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotBetween(String value1, String value2) {
            addCriterion("spec_name not between", value1, value2, "specName");
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

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
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

        public Criteria andGoodsStateremarkIsNull() {
            addCriterion("goods_stateremark is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkIsNotNull() {
            addCriterion("goods_stateremark is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkEqualTo(String value) {
            addCriterion("goods_stateremark =", value, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkNotEqualTo(String value) {
            addCriterion("goods_stateremark <>", value, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkGreaterThan(String value) {
            addCriterion("goods_stateremark >", value, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkGreaterThanOrEqualTo(String value) {
            addCriterion("goods_stateremark >=", value, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkLessThan(String value) {
            addCriterion("goods_stateremark <", value, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkLessThanOrEqualTo(String value) {
            addCriterion("goods_stateremark <=", value, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkLike(String value) {
            addCriterion("goods_stateremark like", value, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkNotLike(String value) {
            addCriterion("goods_stateremark not like", value, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkIn(List<String> values) {
            addCriterion("goods_stateremark in", values, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkNotIn(List<String> values) {
            addCriterion("goods_stateremark not in", values, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkBetween(String value1, String value2) {
            addCriterion("goods_stateremark between", value1, value2, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkNotBetween(String value1, String value2) {
            addCriterion("goods_stateremark not between", value1, value2, "goodsStateremark");
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

        public Criteria andGoodsVerifyremarkIsNull() {
            addCriterion("goods_verifyremark is null");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkIsNotNull() {
            addCriterion("goods_verifyremark is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkEqualTo(String value) {
            addCriterion("goods_verifyremark =", value, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkNotEqualTo(String value) {
            addCriterion("goods_verifyremark <>", value, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkGreaterThan(String value) {
            addCriterion("goods_verifyremark >", value, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkGreaterThanOrEqualTo(String value) {
            addCriterion("goods_verifyremark >=", value, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkLessThan(String value) {
            addCriterion("goods_verifyremark <", value, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkLessThanOrEqualTo(String value) {
            addCriterion("goods_verifyremark <=", value, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkLike(String value) {
            addCriterion("goods_verifyremark like", value, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkNotLike(String value) {
            addCriterion("goods_verifyremark not like", value, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkIn(List<String> values) {
            addCriterion("goods_verifyremark in", values, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkNotIn(List<String> values) {
            addCriterion("goods_verifyremark not in", values, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkBetween(String value1, String value2) {
            addCriterion("goods_verifyremark between", value1, value2, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkNotBetween(String value1, String value2) {
            addCriterion("goods_verifyremark not between", value1, value2, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsLockIsNull() {
            addCriterion("goods_lock is null");
            return (Criteria) this;
        }

        public Criteria andGoodsLockIsNotNull() {
            addCriterion("goods_lock is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsLockEqualTo(Byte value) {
            addCriterion("goods_lock =", value, "goodsLock");
            return (Criteria) this;
        }

        public Criteria andGoodsLockNotEqualTo(Byte value) {
            addCriterion("goods_lock <>", value, "goodsLock");
            return (Criteria) this;
        }

        public Criteria andGoodsLockGreaterThan(Byte value) {
            addCriterion("goods_lock >", value, "goodsLock");
            return (Criteria) this;
        }

        public Criteria andGoodsLockGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_lock >=", value, "goodsLock");
            return (Criteria) this;
        }

        public Criteria andGoodsLockLessThan(Byte value) {
            addCriterion("goods_lock <", value, "goodsLock");
            return (Criteria) this;
        }

        public Criteria andGoodsLockLessThanOrEqualTo(Byte value) {
            addCriterion("goods_lock <=", value, "goodsLock");
            return (Criteria) this;
        }

        public Criteria andGoodsLockIn(List<Byte> values) {
            addCriterion("goods_lock in", values, "goodsLock");
            return (Criteria) this;
        }

        public Criteria andGoodsLockNotIn(List<Byte> values) {
            addCriterion("goods_lock not in", values, "goodsLock");
            return (Criteria) this;
        }

        public Criteria andGoodsLockBetween(Byte value1, Byte value2) {
            addCriterion("goods_lock between", value1, value2, "goodsLock");
            return (Criteria) this;
        }

        public Criteria andGoodsLockNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_lock not between", value1, value2, "goodsLock");
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

        public Criteria andGoodsSelltimeIsNull() {
            addCriterion("goods_selltime is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSelltimeIsNotNull() {
            addCriterion("goods_selltime is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSelltimeEqualTo(Integer value) {
            addCriterion("goods_selltime =", value, "goodsSelltime");
            return (Criteria) this;
        }

        public Criteria andGoodsSelltimeNotEqualTo(Integer value) {
            addCriterion("goods_selltime <>", value, "goodsSelltime");
            return (Criteria) this;
        }

        public Criteria andGoodsSelltimeGreaterThan(Integer value) {
            addCriterion("goods_selltime >", value, "goodsSelltime");
            return (Criteria) this;
        }

        public Criteria andGoodsSelltimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_selltime >=", value, "goodsSelltime");
            return (Criteria) this;
        }

        public Criteria andGoodsSelltimeLessThan(Integer value) {
            addCriterion("goods_selltime <", value, "goodsSelltime");
            return (Criteria) this;
        }

        public Criteria andGoodsSelltimeLessThanOrEqualTo(Integer value) {
            addCriterion("goods_selltime <=", value, "goodsSelltime");
            return (Criteria) this;
        }

        public Criteria andGoodsSelltimeIn(List<Integer> values) {
            addCriterion("goods_selltime in", values, "goodsSelltime");
            return (Criteria) this;
        }

        public Criteria andGoodsSelltimeNotIn(List<Integer> values) {
            addCriterion("goods_selltime not in", values, "goodsSelltime");
            return (Criteria) this;
        }

        public Criteria andGoodsSelltimeBetween(Integer value1, Integer value2) {
            addCriterion("goods_selltime between", value1, value2, "goodsSelltime");
            return (Criteria) this;
        }

        public Criteria andGoodsSelltimeNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_selltime not between", value1, value2, "goodsSelltime");
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

        public Criteria andGoodsCostpriceIsNull() {
            addCriterion("goods_costprice is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCostpriceIsNotNull() {
            addCriterion("goods_costprice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCostpriceEqualTo(BigDecimal value) {
            addCriterion("goods_costprice =", value, "goodsCostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostpriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_costprice <>", value, "goodsCostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostpriceGreaterThan(BigDecimal value) {
            addCriterion("goods_costprice >", value, "goodsCostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_costprice >=", value, "goodsCostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostpriceLessThan(BigDecimal value) {
            addCriterion("goods_costprice <", value, "goodsCostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_costprice <=", value, "goodsCostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostpriceIn(List<BigDecimal> values) {
            addCriterion("goods_costprice in", values, "goodsCostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostpriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_costprice not in", values, "goodsCostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_costprice between", value1, value2, "goodsCostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_costprice not between", value1, value2, "goodsCostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountIsNull() {
            addCriterion("goods_discount is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountIsNotNull() {
            addCriterion("goods_discount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountEqualTo(Float value) {
            addCriterion("goods_discount =", value, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNotEqualTo(Float value) {
            addCriterion("goods_discount <>", value, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountGreaterThan(Float value) {
            addCriterion("goods_discount >", value, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("goods_discount >=", value, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountLessThan(Float value) {
            addCriterion("goods_discount <", value, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountLessThanOrEqualTo(Float value) {
            addCriterion("goods_discount <=", value, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountIn(List<Float> values) {
            addCriterion("goods_discount in", values, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNotIn(List<Float> values) {
            addCriterion("goods_discount not in", values, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountBetween(Float value1, Float value2) {
            addCriterion("goods_discount between", value1, value2, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNotBetween(Float value1, Float value2) {
            addCriterion("goods_discount not between", value1, value2, "goodsDiscount");
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

        public Criteria andTransportTitleIsNull() {
            addCriterion("transport_title is null");
            return (Criteria) this;
        }

        public Criteria andTransportTitleIsNotNull() {
            addCriterion("transport_title is not null");
            return (Criteria) this;
        }

        public Criteria andTransportTitleEqualTo(String value) {
            addCriterion("transport_title =", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleNotEqualTo(String value) {
            addCriterion("transport_title <>", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleGreaterThan(String value) {
            addCriterion("transport_title >", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleGreaterThanOrEqualTo(String value) {
            addCriterion("transport_title >=", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleLessThan(String value) {
            addCriterion("transport_title <", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleLessThanOrEqualTo(String value) {
            addCriterion("transport_title <=", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleLike(String value) {
            addCriterion("transport_title like", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleNotLike(String value) {
            addCriterion("transport_title not like", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleIn(List<String> values) {
            addCriterion("transport_title in", values, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleNotIn(List<String> values) {
            addCriterion("transport_title not in", values, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleBetween(String value1, String value2) {
            addCriterion("transport_title between", value1, value2, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleNotBetween(String value1, String value2) {
            addCriterion("transport_title not between", value1, value2, "transportTitle");
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

        public Criteria andAreaid1IsNull() {
            addCriterion("areaid_1 is null");
            return (Criteria) this;
        }

        public Criteria andAreaid1IsNotNull() {
            addCriterion("areaid_1 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaid1EqualTo(Long value) {
            addCriterion("areaid_1 =", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1NotEqualTo(Long value) {
            addCriterion("areaid_1 <>", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1GreaterThan(Long value) {
            addCriterion("areaid_1 >", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1GreaterThanOrEqualTo(Long value) {
            addCriterion("areaid_1 >=", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1LessThan(Long value) {
            addCriterion("areaid_1 <", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1LessThanOrEqualTo(Long value) {
            addCriterion("areaid_1 <=", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1In(List<Long> values) {
            addCriterion("areaid_1 in", values, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1NotIn(List<Long> values) {
            addCriterion("areaid_1 not in", values, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1Between(Long value1, Long value2) {
            addCriterion("areaid_1 between", value1, value2, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1NotBetween(Long value1, Long value2) {
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

        public Criteria andAreaid2EqualTo(Long value) {
            addCriterion("areaid_2 =", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2NotEqualTo(Long value) {
            addCriterion("areaid_2 <>", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2GreaterThan(Long value) {
            addCriterion("areaid_2 >", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2GreaterThanOrEqualTo(Long value) {
            addCriterion("areaid_2 >=", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2LessThan(Long value) {
            addCriterion("areaid_2 <", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2LessThanOrEqualTo(Long value) {
            addCriterion("areaid_2 <=", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2In(List<Long> values) {
            addCriterion("areaid_2 in", values, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2NotIn(List<Long> values) {
            addCriterion("areaid_2 not in", values, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2Between(Long value1, Long value2) {
            addCriterion("areaid_2 between", value1, value2, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2NotBetween(Long value1, Long value2) {
            addCriterion("areaid_2 not between", value1, value2, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid3IsNull() {
            addCriterion("areaid_3 is null");
            return (Criteria) this;
        }

        public Criteria andAreaid3IsNotNull() {
            addCriterion("areaid_3 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaid3EqualTo(Long value) {
            addCriterion("areaid_3 =", value, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3NotEqualTo(Long value) {
            addCriterion("areaid_3 <>", value, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3GreaterThan(Long value) {
            addCriterion("areaid_3 >", value, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3GreaterThanOrEqualTo(Long value) {
            addCriterion("areaid_3 >=", value, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3LessThan(Long value) {
            addCriterion("areaid_3 <", value, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3LessThanOrEqualTo(Long value) {
            addCriterion("areaid_3 <=", value, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3In(List<Long> values) {
            addCriterion("areaid_3 in", values, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3NotIn(List<Long> values) {
            addCriterion("areaid_3 not in", values, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3Between(Long value1, Long value2) {
            addCriterion("areaid_3 between", value1, value2, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3NotBetween(Long value1, Long value2) {
            addCriterion("areaid_3 not between", value1, value2, "areaid3");
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

        public Criteria andPlateidTopIsNull() {
            addCriterion("plateid_top is null");
            return (Criteria) this;
        }

        public Criteria andPlateidTopIsNotNull() {
            addCriterion("plateid_top is not null");
            return (Criteria) this;
        }

        public Criteria andPlateidTopEqualTo(Integer value) {
            addCriterion("plateid_top =", value, "plateidTop");
            return (Criteria) this;
        }

        public Criteria andPlateidTopNotEqualTo(Integer value) {
            addCriterion("plateid_top <>", value, "plateidTop");
            return (Criteria) this;
        }

        public Criteria andPlateidTopGreaterThan(Integer value) {
            addCriterion("plateid_top >", value, "plateidTop");
            return (Criteria) this;
        }

        public Criteria andPlateidTopGreaterThanOrEqualTo(Integer value) {
            addCriterion("plateid_top >=", value, "plateidTop");
            return (Criteria) this;
        }

        public Criteria andPlateidTopLessThan(Integer value) {
            addCriterion("plateid_top <", value, "plateidTop");
            return (Criteria) this;
        }

        public Criteria andPlateidTopLessThanOrEqualTo(Integer value) {
            addCriterion("plateid_top <=", value, "plateidTop");
            return (Criteria) this;
        }

        public Criteria andPlateidTopIn(List<Integer> values) {
            addCriterion("plateid_top in", values, "plateidTop");
            return (Criteria) this;
        }

        public Criteria andPlateidTopNotIn(List<Integer> values) {
            addCriterion("plateid_top not in", values, "plateidTop");
            return (Criteria) this;
        }

        public Criteria andPlateidTopBetween(Integer value1, Integer value2) {
            addCriterion("plateid_top between", value1, value2, "plateidTop");
            return (Criteria) this;
        }

        public Criteria andPlateidTopNotBetween(Integer value1, Integer value2) {
            addCriterion("plateid_top not between", value1, value2, "plateidTop");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomIsNull() {
            addCriterion("plateid_bottom is null");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomIsNotNull() {
            addCriterion("plateid_bottom is not null");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomEqualTo(Integer value) {
            addCriterion("plateid_bottom =", value, "plateidBottom");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomNotEqualTo(Integer value) {
            addCriterion("plateid_bottom <>", value, "plateidBottom");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomGreaterThan(Integer value) {
            addCriterion("plateid_bottom >", value, "plateidBottom");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomGreaterThanOrEqualTo(Integer value) {
            addCriterion("plateid_bottom >=", value, "plateidBottom");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomLessThan(Integer value) {
            addCriterion("plateid_bottom <", value, "plateidBottom");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomLessThanOrEqualTo(Integer value) {
            addCriterion("plateid_bottom <=", value, "plateidBottom");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomIn(List<Integer> values) {
            addCriterion("plateid_bottom in", values, "plateidBottom");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomNotIn(List<Integer> values) {
            addCriterion("plateid_bottom not in", values, "plateidBottom");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomBetween(Integer value1, Integer value2) {
            addCriterion("plateid_bottom between", value1, value2, "plateidBottom");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomNotBetween(Integer value1, Integer value2) {
            addCriterion("plateid_bottom not between", value1, value2, "plateidBottom");
            return (Criteria) this;
        }

        public Criteria andGoodsStartimeIsNull() {
            addCriterion("goods_startime is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStartimeIsNotNull() {
            addCriterion("goods_startime is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStartimeEqualTo(Integer value) {
            addCriterion("goods_startime =", value, "goodsStartime");
            return (Criteria) this;
        }

        public Criteria andGoodsStartimeNotEqualTo(Integer value) {
            addCriterion("goods_startime <>", value, "goodsStartime");
            return (Criteria) this;
        }

        public Criteria andGoodsStartimeGreaterThan(Integer value) {
            addCriterion("goods_startime >", value, "goodsStartime");
            return (Criteria) this;
        }

        public Criteria andGoodsStartimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_startime >=", value, "goodsStartime");
            return (Criteria) this;
        }

        public Criteria andGoodsStartimeLessThan(Integer value) {
            addCriterion("goods_startime <", value, "goodsStartime");
            return (Criteria) this;
        }

        public Criteria andGoodsStartimeLessThanOrEqualTo(Integer value) {
            addCriterion("goods_startime <=", value, "goodsStartime");
            return (Criteria) this;
        }

        public Criteria andGoodsStartimeIn(List<Integer> values) {
            addCriterion("goods_startime in", values, "goodsStartime");
            return (Criteria) this;
        }

        public Criteria andGoodsStartimeNotIn(List<Integer> values) {
            addCriterion("goods_startime not in", values, "goodsStartime");
            return (Criteria) this;
        }

        public Criteria andGoodsStartimeBetween(Integer value1, Integer value2) {
            addCriterion("goods_startime between", value1, value2, "goodsStartime");
            return (Criteria) this;
        }

        public Criteria andGoodsStartimeNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_startime not between", value1, value2, "goodsStartime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeIsNull() {
            addCriterion("goods_endtime is null");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeIsNotNull() {
            addCriterion("goods_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeEqualTo(Integer value) {
            addCriterion("goods_endtime =", value, "goodsEndtime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeNotEqualTo(Integer value) {
            addCriterion("goods_endtime <>", value, "goodsEndtime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeGreaterThan(Integer value) {
            addCriterion("goods_endtime >", value, "goodsEndtime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_endtime >=", value, "goodsEndtime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeLessThan(Integer value) {
            addCriterion("goods_endtime <", value, "goodsEndtime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeLessThanOrEqualTo(Integer value) {
            addCriterion("goods_endtime <=", value, "goodsEndtime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeIn(List<Integer> values) {
            addCriterion("goods_endtime in", values, "goodsEndtime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeNotIn(List<Integer> values) {
            addCriterion("goods_endtime not in", values, "goodsEndtime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeBetween(Integer value1, Integer value2) {
            addCriterion("goods_endtime between", value1, value2, "goodsEndtime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_endtime not between", value1, value2, "goodsEndtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAreainfoIsNull() {
            addCriterion("goods_areainfo is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAreainfoIsNotNull() {
            addCriterion("goods_areainfo is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAreainfoEqualTo(String value) {
            addCriterion("goods_areainfo =", value, "goodsAreainfo");
            return (Criteria) this;
        }

        public Criteria andGoodsAreainfoNotEqualTo(String value) {
            addCriterion("goods_areainfo <>", value, "goodsAreainfo");
            return (Criteria) this;
        }

        public Criteria andGoodsAreainfoGreaterThan(String value) {
            addCriterion("goods_areainfo >", value, "goodsAreainfo");
            return (Criteria) this;
        }

        public Criteria andGoodsAreainfoGreaterThanOrEqualTo(String value) {
            addCriterion("goods_areainfo >=", value, "goodsAreainfo");
            return (Criteria) this;
        }

        public Criteria andGoodsAreainfoLessThan(String value) {
            addCriterion("goods_areainfo <", value, "goodsAreainfo");
            return (Criteria) this;
        }

        public Criteria andGoodsAreainfoLessThanOrEqualTo(String value) {
            addCriterion("goods_areainfo <=", value, "goodsAreainfo");
            return (Criteria) this;
        }

        public Criteria andGoodsAreainfoLike(String value) {
            addCriterion("goods_areainfo like", value, "goodsAreainfo");
            return (Criteria) this;
        }

        public Criteria andGoodsAreainfoNotLike(String value) {
            addCriterion("goods_areainfo not like", value, "goodsAreainfo");
            return (Criteria) this;
        }

        public Criteria andGoodsAreainfoIn(List<String> values) {
            addCriterion("goods_areainfo in", values, "goodsAreainfo");
            return (Criteria) this;
        }

        public Criteria andGoodsAreainfoNotIn(List<String> values) {
            addCriterion("goods_areainfo not in", values, "goodsAreainfo");
            return (Criteria) this;
        }

        public Criteria andGoodsAreainfoBetween(String value1, String value2) {
            addCriterion("goods_areainfo between", value1, value2, "goodsAreainfo");
            return (Criteria) this;
        }

        public Criteria andGoodsAreainfoNotBetween(String value1, String value2) {
            addCriterion("goods_areainfo not between", value1, value2, "goodsAreainfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoIsNull() {
            addCriterion("goods_delivery_info is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoIsNotNull() {
            addCriterion("goods_delivery_info is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoEqualTo(String value) {
            addCriterion("goods_delivery_info =", value, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoNotEqualTo(String value) {
            addCriterion("goods_delivery_info <>", value, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoGreaterThan(String value) {
            addCriterion("goods_delivery_info >", value, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoGreaterThanOrEqualTo(String value) {
            addCriterion("goods_delivery_info >=", value, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoLessThan(String value) {
            addCriterion("goods_delivery_info <", value, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoLessThanOrEqualTo(String value) {
            addCriterion("goods_delivery_info <=", value, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoLike(String value) {
            addCriterion("goods_delivery_info like", value, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoNotLike(String value) {
            addCriterion("goods_delivery_info not like", value, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoIn(List<String> values) {
            addCriterion("goods_delivery_info in", values, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoNotIn(List<String> values) {
            addCriterion("goods_delivery_info not in", values, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoBetween(String value1, String value2) {
            addCriterion("goods_delivery_info between", value1, value2, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsDeliveryInfoNotBetween(String value1, String value2) {
            addCriterion("goods_delivery_info not between", value1, value2, "goodsDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andServiceStartimeIsNull() {
            addCriterion("service_startime is null");
            return (Criteria) this;
        }

        public Criteria andServiceStartimeIsNotNull() {
            addCriterion("service_startime is not null");
            return (Criteria) this;
        }

        public Criteria andServiceStartimeEqualTo(Integer value) {
            addCriterion("service_startime =", value, "serviceStartime");
            return (Criteria) this;
        }

        public Criteria andServiceStartimeNotEqualTo(Integer value) {
            addCriterion("service_startime <>", value, "serviceStartime");
            return (Criteria) this;
        }

        public Criteria andServiceStartimeGreaterThan(Integer value) {
            addCriterion("service_startime >", value, "serviceStartime");
            return (Criteria) this;
        }

        public Criteria andServiceStartimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_startime >=", value, "serviceStartime");
            return (Criteria) this;
        }

        public Criteria andServiceStartimeLessThan(Integer value) {
            addCriterion("service_startime <", value, "serviceStartime");
            return (Criteria) this;
        }

        public Criteria andServiceStartimeLessThanOrEqualTo(Integer value) {
            addCriterion("service_startime <=", value, "serviceStartime");
            return (Criteria) this;
        }

        public Criteria andServiceStartimeIn(List<Integer> values) {
            addCriterion("service_startime in", values, "serviceStartime");
            return (Criteria) this;
        }

        public Criteria andServiceStartimeNotIn(List<Integer> values) {
            addCriterion("service_startime not in", values, "serviceStartime");
            return (Criteria) this;
        }

        public Criteria andServiceStartimeBetween(Integer value1, Integer value2) {
            addCriterion("service_startime between", value1, value2, "serviceStartime");
            return (Criteria) this;
        }

        public Criteria andServiceStartimeNotBetween(Integer value1, Integer value2) {
            addCriterion("service_startime not between", value1, value2, "serviceStartime");
            return (Criteria) this;
        }

        public Criteria andServiceEndtimeIsNull() {
            addCriterion("service_endtime is null");
            return (Criteria) this;
        }

        public Criteria andServiceEndtimeIsNotNull() {
            addCriterion("service_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEndtimeEqualTo(Integer value) {
            addCriterion("service_endtime =", value, "serviceEndtime");
            return (Criteria) this;
        }

        public Criteria andServiceEndtimeNotEqualTo(Integer value) {
            addCriterion("service_endtime <>", value, "serviceEndtime");
            return (Criteria) this;
        }

        public Criteria andServiceEndtimeGreaterThan(Integer value) {
            addCriterion("service_endtime >", value, "serviceEndtime");
            return (Criteria) this;
        }

        public Criteria andServiceEndtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_endtime >=", value, "serviceEndtime");
            return (Criteria) this;
        }

        public Criteria andServiceEndtimeLessThan(Integer value) {
            addCriterion("service_endtime <", value, "serviceEndtime");
            return (Criteria) this;
        }

        public Criteria andServiceEndtimeLessThanOrEqualTo(Integer value) {
            addCriterion("service_endtime <=", value, "serviceEndtime");
            return (Criteria) this;
        }

        public Criteria andServiceEndtimeIn(List<Integer> values) {
            addCriterion("service_endtime in", values, "serviceEndtime");
            return (Criteria) this;
        }

        public Criteria andServiceEndtimeNotIn(List<Integer> values) {
            addCriterion("service_endtime not in", values, "serviceEndtime");
            return (Criteria) this;
        }

        public Criteria andServiceEndtimeBetween(Integer value1, Integer value2) {
            addCriterion("service_endtime between", value1, value2, "serviceEndtime");
            return (Criteria) this;
        }

        public Criteria andServiceEndtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("service_endtime not between", value1, value2, "serviceEndtime");
            return (Criteria) this;
        }

        public Criteria andServiceFixtimePatternIsNull() {
            addCriterion("service_fixtime_pattern is null");
            return (Criteria) this;
        }

        public Criteria andServiceFixtimePatternIsNotNull() {
            addCriterion("service_fixtime_pattern is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFixtimePatternEqualTo(String value) {
            addCriterion("service_fixtime_pattern =", value, "serviceFixtimePattern");
            return (Criteria) this;
        }

        public Criteria andServiceFixtimePatternNotEqualTo(String value) {
            addCriterion("service_fixtime_pattern <>", value, "serviceFixtimePattern");
            return (Criteria) this;
        }

        public Criteria andServiceFixtimePatternGreaterThan(String value) {
            addCriterion("service_fixtime_pattern >", value, "serviceFixtimePattern");
            return (Criteria) this;
        }

        public Criteria andServiceFixtimePatternGreaterThanOrEqualTo(String value) {
            addCriterion("service_fixtime_pattern >=", value, "serviceFixtimePattern");
            return (Criteria) this;
        }

        public Criteria andServiceFixtimePatternLessThan(String value) {
            addCriterion("service_fixtime_pattern <", value, "serviceFixtimePattern");
            return (Criteria) this;
        }

        public Criteria andServiceFixtimePatternLessThanOrEqualTo(String value) {
            addCriterion("service_fixtime_pattern <=", value, "serviceFixtimePattern");
            return (Criteria) this;
        }

        public Criteria andServiceFixtimePatternLike(String value) {
            addCriterion("service_fixtime_pattern like", value, "serviceFixtimePattern");
            return (Criteria) this;
        }

        public Criteria andServiceFixtimePatternNotLike(String value) {
            addCriterion("service_fixtime_pattern not like", value, "serviceFixtimePattern");
            return (Criteria) this;
        }

        public Criteria andServiceFixtimePatternIn(List<String> values) {
            addCriterion("service_fixtime_pattern in", values, "serviceFixtimePattern");
            return (Criteria) this;
        }

        public Criteria andServiceFixtimePatternNotIn(List<String> values) {
            addCriterion("service_fixtime_pattern not in", values, "serviceFixtimePattern");
            return (Criteria) this;
        }

        public Criteria andServiceFixtimePatternBetween(String value1, String value2) {
            addCriterion("service_fixtime_pattern between", value1, value2, "serviceFixtimePattern");
            return (Criteria) this;
        }

        public Criteria andServiceFixtimePatternNotBetween(String value1, String value2) {
            addCriterion("service_fixtime_pattern not between", value1, value2, "serviceFixtimePattern");
            return (Criteria) this;
        }

        public Criteria andServiceInfoIsNull() {
            addCriterion("service_info is null");
            return (Criteria) this;
        }

        public Criteria andServiceInfoIsNotNull() {
            addCriterion("service_info is not null");
            return (Criteria) this;
        }

        public Criteria andServiceInfoEqualTo(String value) {
            addCriterion("service_info =", value, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoNotEqualTo(String value) {
            addCriterion("service_info <>", value, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoGreaterThan(String value) {
            addCriterion("service_info >", value, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoGreaterThanOrEqualTo(String value) {
            addCriterion("service_info >=", value, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoLessThan(String value) {
            addCriterion("service_info <", value, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoLessThanOrEqualTo(String value) {
            addCriterion("service_info <=", value, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoLike(String value) {
            addCriterion("service_info like", value, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoNotLike(String value) {
            addCriterion("service_info not like", value, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoIn(List<String> values) {
            addCriterion("service_info in", values, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoNotIn(List<String> values) {
            addCriterion("service_info not in", values, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoBetween(String value1, String value2) {
            addCriterion("service_info between", value1, value2, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoNotBetween(String value1, String value2) {
            addCriterion("service_info not between", value1, value2, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceTimemodeIsNull() {
            addCriterion("service_timemode is null");
            return (Criteria) this;
        }

        public Criteria andServiceTimemodeIsNotNull() {
            addCriterion("service_timemode is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTimemodeEqualTo(String value) {
            addCriterion("service_timemode =", value, "serviceTimemode");
            return (Criteria) this;
        }

        public Criteria andServiceTimemodeNotEqualTo(String value) {
            addCriterion("service_timemode <>", value, "serviceTimemode");
            return (Criteria) this;
        }

        public Criteria andServiceTimemodeGreaterThan(String value) {
            addCriterion("service_timemode >", value, "serviceTimemode");
            return (Criteria) this;
        }

        public Criteria andServiceTimemodeGreaterThanOrEqualTo(String value) {
            addCriterion("service_timemode >=", value, "serviceTimemode");
            return (Criteria) this;
        }

        public Criteria andServiceTimemodeLessThan(String value) {
            addCriterion("service_timemode <", value, "serviceTimemode");
            return (Criteria) this;
        }

        public Criteria andServiceTimemodeLessThanOrEqualTo(String value) {
            addCriterion("service_timemode <=", value, "serviceTimemode");
            return (Criteria) this;
        }

        public Criteria andServiceTimemodeLike(String value) {
            addCriterion("service_timemode like", value, "serviceTimemode");
            return (Criteria) this;
        }

        public Criteria andServiceTimemodeNotLike(String value) {
            addCriterion("service_timemode not like", value, "serviceTimemode");
            return (Criteria) this;
        }

        public Criteria andServiceTimemodeIn(List<String> values) {
            addCriterion("service_timemode in", values, "serviceTimemode");
            return (Criteria) this;
        }

        public Criteria andServiceTimemodeNotIn(List<String> values) {
            addCriterion("service_timemode not in", values, "serviceTimemode");
            return (Criteria) this;
        }

        public Criteria andServiceTimemodeBetween(String value1, String value2) {
            addCriterion("service_timemode between", value1, value2, "serviceTimemode");
            return (Criteria) this;
        }

        public Criteria andServiceTimemodeNotBetween(String value1, String value2) {
            addCriterion("service_timemode not between", value1, value2, "serviceTimemode");
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

        public Criteria andGoodsStorageTargetIsNull() {
            addCriterion("goods_storage_target is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageTargetIsNotNull() {
            addCriterion("goods_storage_target is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageTargetEqualTo(Long value) {
            addCriterion("goods_storage_target =", value, "goodsStorageTarget");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageTargetNotEqualTo(Long value) {
            addCriterion("goods_storage_target <>", value, "goodsStorageTarget");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageTargetGreaterThan(Long value) {
            addCriterion("goods_storage_target >", value, "goodsStorageTarget");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageTargetGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_storage_target >=", value, "goodsStorageTarget");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageTargetLessThan(Long value) {
            addCriterion("goods_storage_target <", value, "goodsStorageTarget");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageTargetLessThanOrEqualTo(Long value) {
            addCriterion("goods_storage_target <=", value, "goodsStorageTarget");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageTargetIn(List<Long> values) {
            addCriterion("goods_storage_target in", values, "goodsStorageTarget");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageTargetNotIn(List<Long> values) {
            addCriterion("goods_storage_target not in", values, "goodsStorageTarget");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageTargetBetween(Long value1, Long value2) {
            addCriterion("goods_storage_target between", value1, value2, "goodsStorageTarget");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageTargetNotBetween(Long value1, Long value2) {
            addCriterion("goods_storage_target not between", value1, value2, "goodsStorageTarget");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityIdIsNull() {
            addCriterion("goods_activity_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityIdIsNotNull() {
            addCriterion("goods_activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityIdEqualTo(Integer value) {
            addCriterion("goods_activity_id =", value, "goodsActivityId");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityIdNotEqualTo(Integer value) {
            addCriterion("goods_activity_id <>", value, "goodsActivityId");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityIdGreaterThan(Integer value) {
            addCriterion("goods_activity_id >", value, "goodsActivityId");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_activity_id >=", value, "goodsActivityId");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityIdLessThan(Integer value) {
            addCriterion("goods_activity_id <", value, "goodsActivityId");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_activity_id <=", value, "goodsActivityId");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityIdIn(List<Integer> values) {
            addCriterion("goods_activity_id in", values, "goodsActivityId");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityIdNotIn(List<Integer> values) {
            addCriterion("goods_activity_id not in", values, "goodsActivityId");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_activity_id between", value1, value2, "goodsActivityId");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_activity_id not between", value1, value2, "goodsActivityId");
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

        public Criteria andReceiverAddressIsNull() {
            addCriterion("receiver_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNotNull() {
            addCriterion("receiver_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressEqualTo(String value) {
            addCriterion("receiver_address =", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotEqualTo(String value) {
            addCriterion("receiver_address <>", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThan(String value) {
            addCriterion("receiver_address >", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_address >=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThan(String value) {
            addCriterion("receiver_address <", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThanOrEqualTo(String value) {
            addCriterion("receiver_address <=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLike(String value) {
            addCriterion("receiver_address like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotLike(String value) {
            addCriterion("receiver_address not like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIn(List<String> values) {
            addCriterion("receiver_address in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotIn(List<String> values) {
            addCriterion("receiver_address not in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressBetween(String value1, String value2) {
            addCriterion("receiver_address between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotBetween(String value1, String value2) {
            addCriterion("receiver_address not between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNull() {
            addCriterion("receiver_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNotNull() {
            addCriterion("receiver_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameEqualTo(String value) {
            addCriterion("receiver_name =", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotEqualTo(String value) {
            addCriterion("receiver_name <>", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThan(String value) {
            addCriterion("receiver_name >", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_name >=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThan(String value) {
            addCriterion("receiver_name <", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThanOrEqualTo(String value) {
            addCriterion("receiver_name <=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLike(String value) {
            addCriterion("receiver_name like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotLike(String value) {
            addCriterion("receiver_name not like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIn(List<String> values) {
            addCriterion("receiver_name in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotIn(List<String> values) {
            addCriterion("receiver_name not in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameBetween(String value1, String value2) {
            addCriterion("receiver_name between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotBetween(String value1, String value2) {
            addCriterion("receiver_name not between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIsNull() {
            addCriterion("receiver_mobile is null");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIsNotNull() {
            addCriterion("receiver_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileEqualTo(String value) {
            addCriterion("receiver_mobile =", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotEqualTo(String value) {
            addCriterion("receiver_mobile <>", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileGreaterThan(String value) {
            addCriterion("receiver_mobile >", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_mobile >=", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLessThan(String value) {
            addCriterion("receiver_mobile <", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLessThanOrEqualTo(String value) {
            addCriterion("receiver_mobile <=", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLike(String value) {
            addCriterion("receiver_mobile like", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotLike(String value) {
            addCriterion("receiver_mobile not like", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIn(List<String> values) {
            addCriterion("receiver_mobile in", values, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotIn(List<String> values) {
            addCriterion("receiver_mobile not in", values, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileBetween(String value1, String value2) {
            addCriterion("receiver_mobile between", value1, value2, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotBetween(String value1, String value2) {
            addCriterion("receiver_mobile not between", value1, value2, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeIsNull() {
            addCriterion("receiver_postcode is null");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeIsNotNull() {
            addCriterion("receiver_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeEqualTo(String value) {
            addCriterion("receiver_postcode =", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeNotEqualTo(String value) {
            addCriterion("receiver_postcode <>", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeGreaterThan(String value) {
            addCriterion("receiver_postcode >", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_postcode >=", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeLessThan(String value) {
            addCriterion("receiver_postcode <", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeLessThanOrEqualTo(String value) {
            addCriterion("receiver_postcode <=", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeLike(String value) {
            addCriterion("receiver_postcode like", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeNotLike(String value) {
            addCriterion("receiver_postcode not like", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeIn(List<String> values) {
            addCriterion("receiver_postcode in", values, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeNotIn(List<String> values) {
            addCriterion("receiver_postcode not in", values, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeBetween(String value1, String value2) {
            addCriterion("receiver_postcode between", value1, value2, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeNotBetween(String value1, String value2) {
            addCriterion("receiver_postcode not between", value1, value2, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityNameIsNull() {
            addCriterion("goods_activity_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityNameIsNotNull() {
            addCriterion("goods_activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityNameEqualTo(String value) {
            addCriterion("goods_activity_name =", value, "goodsActivityName");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityNameNotEqualTo(String value) {
            addCriterion("goods_activity_name <>", value, "goodsActivityName");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityNameGreaterThan(String value) {
            addCriterion("goods_activity_name >", value, "goodsActivityName");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_activity_name >=", value, "goodsActivityName");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityNameLessThan(String value) {
            addCriterion("goods_activity_name <", value, "goodsActivityName");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityNameLessThanOrEqualTo(String value) {
            addCriterion("goods_activity_name <=", value, "goodsActivityName");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityNameLike(String value) {
            addCriterion("goods_activity_name like", value, "goodsActivityName");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityNameNotLike(String value) {
            addCriterion("goods_activity_name not like", value, "goodsActivityName");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityNameIn(List<String> values) {
            addCriterion("goods_activity_name in", values, "goodsActivityName");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityNameNotIn(List<String> values) {
            addCriterion("goods_activity_name not in", values, "goodsActivityName");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityNameBetween(String value1, String value2) {
            addCriterion("goods_activity_name between", value1, value2, "goodsActivityName");
            return (Criteria) this;
        }

        public Criteria andGoodsActivityNameNotBetween(String value1, String value2) {
            addCriterion("goods_activity_name not between", value1, value2, "goodsActivityName");
            return (Criteria) this;
        }

        public Criteria andSkillIdIsNull() {
            addCriterion("skill_id is null");
            return (Criteria) this;
        }

        public Criteria andSkillIdIsNotNull() {
            addCriterion("skill_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkillIdEqualTo(String value) {
            addCriterion("skill_id =", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdNotEqualTo(String value) {
            addCriterion("skill_id <>", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdGreaterThan(String value) {
            addCriterion("skill_id >", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdGreaterThanOrEqualTo(String value) {
            addCriterion("skill_id >=", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdLessThan(String value) {
            addCriterion("skill_id <", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdLessThanOrEqualTo(String value) {
            addCriterion("skill_id <=", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdLike(String value) {
            addCriterion("skill_id like", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdNotLike(String value) {
            addCriterion("skill_id not like", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdIn(List<String> values) {
            addCriterion("skill_id in", values, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdNotIn(List<String> values) {
            addCriterion("skill_id not in", values, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdBetween(String value1, String value2) {
            addCriterion("skill_id between", value1, value2, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdNotBetween(String value1, String value2) {
            addCriterion("skill_id not between", value1, value2, "skillId");
            return (Criteria) this;
        }

        public Criteria andGoodsTemplateIsNull() {
            addCriterion("goods_template is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTemplateIsNotNull() {
            addCriterion("goods_template is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTemplateEqualTo(String value) {
            addCriterion("goods_template =", value, "goodsTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsTemplateNotEqualTo(String value) {
            addCriterion("goods_template <>", value, "goodsTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsTemplateGreaterThan(String value) {
            addCriterion("goods_template >", value, "goodsTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("goods_template >=", value, "goodsTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsTemplateLessThan(String value) {
            addCriterion("goods_template <", value, "goodsTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsTemplateLessThanOrEqualTo(String value) {
            addCriterion("goods_template <=", value, "goodsTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsTemplateLike(String value) {
            addCriterion("goods_template like", value, "goodsTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsTemplateNotLike(String value) {
            addCriterion("goods_template not like", value, "goodsTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsTemplateIn(List<String> values) {
            addCriterion("goods_template in", values, "goodsTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsTemplateNotIn(List<String> values) {
            addCriterion("goods_template not in", values, "goodsTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsTemplateBetween(String value1, String value2) {
            addCriterion("goods_template between", value1, value2, "goodsTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsTemplateNotBetween(String value1, String value2) {
            addCriterion("goods_template not between", value1, value2, "goodsTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentIsNull() {
            addCriterion("goods_comment is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentIsNotNull() {
            addCriterion("goods_comment is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentEqualTo(String value) {
            addCriterion("goods_comment =", value, "goodsComment");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentNotEqualTo(String value) {
            addCriterion("goods_comment <>", value, "goodsComment");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentGreaterThan(String value) {
            addCriterion("goods_comment >", value, "goodsComment");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentGreaterThanOrEqualTo(String value) {
            addCriterion("goods_comment >=", value, "goodsComment");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentLessThan(String value) {
            addCriterion("goods_comment <", value, "goodsComment");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentLessThanOrEqualTo(String value) {
            addCriterion("goods_comment <=", value, "goodsComment");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentLike(String value) {
            addCriterion("goods_comment like", value, "goodsComment");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentNotLike(String value) {
            addCriterion("goods_comment not like", value, "goodsComment");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentIn(List<String> values) {
            addCriterion("goods_comment in", values, "goodsComment");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentNotIn(List<String> values) {
            addCriterion("goods_comment not in", values, "goodsComment");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentBetween(String value1, String value2) {
            addCriterion("goods_comment between", value1, value2, "goodsComment");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentNotBetween(String value1, String value2) {
            addCriterion("goods_comment not between", value1, value2, "goodsComment");
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

        public Criteria andImage1IsNull() {
            addCriterion("image1 is null");
            return (Criteria) this;
        }

        public Criteria andImage1IsNotNull() {
            addCriterion("image1 is not null");
            return (Criteria) this;
        }

        public Criteria andImage1EqualTo(String value) {
            addCriterion("image1 =", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1NotEqualTo(String value) {
            addCriterion("image1 <>", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1GreaterThan(String value) {
            addCriterion("image1 >", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1GreaterThanOrEqualTo(String value) {
            addCriterion("image1 >=", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1LessThan(String value) {
            addCriterion("image1 <", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1LessThanOrEqualTo(String value) {
            addCriterion("image1 <=", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1Like(String value) {
            addCriterion("image1 like", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1NotLike(String value) {
            addCriterion("image1 not like", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1In(List<String> values) {
            addCriterion("image1 in", values, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1NotIn(List<String> values) {
            addCriterion("image1 not in", values, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1Between(String value1, String value2) {
            addCriterion("image1 between", value1, value2, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1NotBetween(String value1, String value2) {
            addCriterion("image1 not between", value1, value2, "image1");
            return (Criteria) this;
        }

        public Criteria andImage2IsNull() {
            addCriterion("image2 is null");
            return (Criteria) this;
        }

        public Criteria andImage2IsNotNull() {
            addCriterion("image2 is not null");
            return (Criteria) this;
        }

        public Criteria andImage2EqualTo(String value) {
            addCriterion("image2 =", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2NotEqualTo(String value) {
            addCriterion("image2 <>", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2GreaterThan(String value) {
            addCriterion("image2 >", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2GreaterThanOrEqualTo(String value) {
            addCriterion("image2 >=", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2LessThan(String value) {
            addCriterion("image2 <", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2LessThanOrEqualTo(String value) {
            addCriterion("image2 <=", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2Like(String value) {
            addCriterion("image2 like", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2NotLike(String value) {
            addCriterion("image2 not like", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2In(List<String> values) {
            addCriterion("image2 in", values, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2NotIn(List<String> values) {
            addCriterion("image2 not in", values, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2Between(String value1, String value2) {
            addCriterion("image2 between", value1, value2, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2NotBetween(String value1, String value2) {
            addCriterion("image2 not between", value1, value2, "image2");
            return (Criteria) this;
        }

        public Criteria andImage3IsNull() {
            addCriterion("image3 is null");
            return (Criteria) this;
        }

        public Criteria andImage3IsNotNull() {
            addCriterion("image3 is not null");
            return (Criteria) this;
        }

        public Criteria andImage3EqualTo(String value) {
            addCriterion("image3 =", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3NotEqualTo(String value) {
            addCriterion("image3 <>", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3GreaterThan(String value) {
            addCriterion("image3 >", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3GreaterThanOrEqualTo(String value) {
            addCriterion("image3 >=", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3LessThan(String value) {
            addCriterion("image3 <", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3LessThanOrEqualTo(String value) {
            addCriterion("image3 <=", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3Like(String value) {
            addCriterion("image3 like", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3NotLike(String value) {
            addCriterion("image3 not like", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3In(List<String> values) {
            addCriterion("image3 in", values, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3NotIn(List<String> values) {
            addCriterion("image3 not in", values, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3Between(String value1, String value2) {
            addCriterion("image3 between", value1, value2, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3NotBetween(String value1, String value2) {
            addCriterion("image3 not between", value1, value2, "image3");
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

        public Criteria andExtendTypeIsNull() {
            addCriterion("extend_type is null");
            return (Criteria) this;
        }

        public Criteria andExtendTypeIsNotNull() {
            addCriterion("extend_type is not null");
            return (Criteria) this;
        }

        public Criteria andExtendTypeEqualTo(String value) {
            addCriterion("extend_type =", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeNotEqualTo(String value) {
            addCriterion("extend_type <>", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeGreaterThan(String value) {
            addCriterion("extend_type >", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeGreaterThanOrEqualTo(String value) {
            addCriterion("extend_type >=", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeLessThan(String value) {
            addCriterion("extend_type <", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeLessThanOrEqualTo(String value) {
            addCriterion("extend_type <=", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeLike(String value) {
            addCriterion("extend_type like", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeNotLike(String value) {
            addCriterion("extend_type not like", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeIn(List<String> values) {
            addCriterion("extend_type in", values, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeNotIn(List<String> values) {
            addCriterion("extend_type not in", values, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeBetween(String value1, String value2) {
            addCriterion("extend_type between", value1, value2, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeNotBetween(String value1, String value2) {
            addCriterion("extend_type not between", value1, value2, "extendType");
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

        public Criteria andSaleNumIsNull() {
            addCriterion("sale_num is null");
            return (Criteria) this;
        }

        public Criteria andSaleNumIsNotNull() {
            addCriterion("sale_num is not null");
            return (Criteria) this;
        }

        public Criteria andSaleNumEqualTo(Integer value) {
            addCriterion("sale_num =", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotEqualTo(Integer value) {
            addCriterion("sale_num <>", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumGreaterThan(Integer value) {
            addCriterion("sale_num >", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_num >=", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLessThan(Integer value) {
            addCriterion("sale_num <", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLessThanOrEqualTo(Integer value) {
            addCriterion("sale_num <=", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumIn(List<Integer> values) {
            addCriterion("sale_num in", values, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotIn(List<Integer> values) {
            addCriterion("sale_num not in", values, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumBetween(Integer value1, Integer value2) {
            addCriterion("sale_num between", value1, value2, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_num not between", value1, value2, "saleNum");
            return (Criteria) this;
        }

        public Criteria andOverallSortIsNull() {
            addCriterion("overall_sort is null");
            return (Criteria) this;
        }

        public Criteria andOverallSortIsNotNull() {
            addCriterion("overall_sort is not null");
            return (Criteria) this;
        }

        public Criteria andOverallSortEqualTo(BigDecimal value) {
            addCriterion("overall_sort =", value, "overallSort");
            return (Criteria) this;
        }

        public Criteria andOverallSortNotEqualTo(BigDecimal value) {
            addCriterion("overall_sort <>", value, "overallSort");
            return (Criteria) this;
        }

        public Criteria andOverallSortGreaterThan(BigDecimal value) {
            addCriterion("overall_sort >", value, "overallSort");
            return (Criteria) this;
        }

        public Criteria andOverallSortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overall_sort >=", value, "overallSort");
            return (Criteria) this;
        }

        public Criteria andOverallSortLessThan(BigDecimal value) {
            addCriterion("overall_sort <", value, "overallSort");
            return (Criteria) this;
        }

        public Criteria andOverallSortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overall_sort <=", value, "overallSort");
            return (Criteria) this;
        }

        public Criteria andOverallSortIn(List<BigDecimal> values) {
            addCriterion("overall_sort in", values, "overallSort");
            return (Criteria) this;
        }

        public Criteria andOverallSortNotIn(List<BigDecimal> values) {
            addCriterion("overall_sort not in", values, "overallSort");
            return (Criteria) this;
        }

        public Criteria andOverallSortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overall_sort between", value1, value2, "overallSort");
            return (Criteria) this;
        }

        public Criteria andOverallSortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overall_sort not between", value1, value2, "overallSort");
            return (Criteria) this;
        }

        public Criteria andAreaid4IsNull() {
            addCriterion("areaid_4 is null");
            return (Criteria) this;
        }

        public Criteria andAreaid4IsNotNull() {
            addCriterion("areaid_4 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaid4EqualTo(Long value) {
            addCriterion("areaid_4 =", value, "areaid4");
            return (Criteria) this;
        }

        public Criteria andAreaid4NotEqualTo(Long value) {
            addCriterion("areaid_4 <>", value, "areaid4");
            return (Criteria) this;
        }

        public Criteria andAreaid4GreaterThan(Long value) {
            addCriterion("areaid_4 >", value, "areaid4");
            return (Criteria) this;
        }

        public Criteria andAreaid4GreaterThanOrEqualTo(Long value) {
            addCriterion("areaid_4 >=", value, "areaid4");
            return (Criteria) this;
        }

        public Criteria andAreaid4LessThan(Long value) {
            addCriterion("areaid_4 <", value, "areaid4");
            return (Criteria) this;
        }

        public Criteria andAreaid4LessThanOrEqualTo(Long value) {
            addCriterion("areaid_4 <=", value, "areaid4");
            return (Criteria) this;
        }

        public Criteria andAreaid4In(List<Long> values) {
            addCriterion("areaid_4 in", values, "areaid4");
            return (Criteria) this;
        }

        public Criteria andAreaid4NotIn(List<Long> values) {
            addCriterion("areaid_4 not in", values, "areaid4");
            return (Criteria) this;
        }

        public Criteria andAreaid4Between(Long value1, Long value2) {
            addCriterion("areaid_4 between", value1, value2, "areaid4");
            return (Criteria) this;
        }

        public Criteria andAreaid4NotBetween(Long value1, Long value2) {
            addCriterion("areaid_4 not between", value1, value2, "areaid4");
            return (Criteria) this;
        }

        public Criteria andAreaid5IsNull() {
            addCriterion("areaid_5 is null");
            return (Criteria) this;
        }

        public Criteria andAreaid5IsNotNull() {
            addCriterion("areaid_5 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaid5EqualTo(Long value) {
            addCriterion("areaid_5 =", value, "areaid5");
            return (Criteria) this;
        }

        public Criteria andAreaid5NotEqualTo(Long value) {
            addCriterion("areaid_5 <>", value, "areaid5");
            return (Criteria) this;
        }

        public Criteria andAreaid5GreaterThan(Long value) {
            addCriterion("areaid_5 >", value, "areaid5");
            return (Criteria) this;
        }

        public Criteria andAreaid5GreaterThanOrEqualTo(Long value) {
            addCriterion("areaid_5 >=", value, "areaid5");
            return (Criteria) this;
        }

        public Criteria andAreaid5LessThan(Long value) {
            addCriterion("areaid_5 <", value, "areaid5");
            return (Criteria) this;
        }

        public Criteria andAreaid5LessThanOrEqualTo(Long value) {
            addCriterion("areaid_5 <=", value, "areaid5");
            return (Criteria) this;
        }

        public Criteria andAreaid5In(List<Long> values) {
            addCriterion("areaid_5 in", values, "areaid5");
            return (Criteria) this;
        }

        public Criteria andAreaid5NotIn(List<Long> values) {
            addCriterion("areaid_5 not in", values, "areaid5");
            return (Criteria) this;
        }

        public Criteria andAreaid5Between(Long value1, Long value2) {
            addCriterion("areaid_5 between", value1, value2, "areaid5");
            return (Criteria) this;
        }

        public Criteria andAreaid5NotBetween(Long value1, Long value2) {
            addCriterion("areaid_5 not between", value1, value2, "areaid5");
            return (Criteria) this;
        }

        public Criteria andGoodsCertIsNull() {
            addCriterion("goods_cert is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCertIsNotNull() {
            addCriterion("goods_cert is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCertEqualTo(String value) {
            addCriterion("goods_cert =", value, "goodsCert");
            return (Criteria) this;
        }

        public Criteria andGoodsCertNotEqualTo(String value) {
            addCriterion("goods_cert <>", value, "goodsCert");
            return (Criteria) this;
        }

        public Criteria andGoodsCertGreaterThan(String value) {
            addCriterion("goods_cert >", value, "goodsCert");
            return (Criteria) this;
        }

        public Criteria andGoodsCertGreaterThanOrEqualTo(String value) {
            addCriterion("goods_cert >=", value, "goodsCert");
            return (Criteria) this;
        }

        public Criteria andGoodsCertLessThan(String value) {
            addCriterion("goods_cert <", value, "goodsCert");
            return (Criteria) this;
        }

        public Criteria andGoodsCertLessThanOrEqualTo(String value) {
            addCriterion("goods_cert <=", value, "goodsCert");
            return (Criteria) this;
        }

        public Criteria andGoodsCertLike(String value) {
            addCriterion("goods_cert like", value, "goodsCert");
            return (Criteria) this;
        }

        public Criteria andGoodsCertNotLike(String value) {
            addCriterion("goods_cert not like", value, "goodsCert");
            return (Criteria) this;
        }

        public Criteria andGoodsCertIn(List<String> values) {
            addCriterion("goods_cert in", values, "goodsCert");
            return (Criteria) this;
        }

        public Criteria andGoodsCertNotIn(List<String> values) {
            addCriterion("goods_cert not in", values, "goodsCert");
            return (Criteria) this;
        }

        public Criteria andGoodsCertBetween(String value1, String value2) {
            addCriterion("goods_cert between", value1, value2, "goodsCert");
            return (Criteria) this;
        }

        public Criteria andGoodsCertNotBetween(String value1, String value2) {
            addCriterion("goods_cert not between", value1, value2, "goodsCert");
            return (Criteria) this;
        }

        public Criteria andImage4IsNull() {
            addCriterion("image4 is null");
            return (Criteria) this;
        }

        public Criteria andImage4IsNotNull() {
            addCriterion("image4 is not null");
            return (Criteria) this;
        }

        public Criteria andImage4EqualTo(String value) {
            addCriterion("image4 =", value, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4NotEqualTo(String value) {
            addCriterion("image4 <>", value, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4GreaterThan(String value) {
            addCriterion("image4 >", value, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4GreaterThanOrEqualTo(String value) {
            addCriterion("image4 >=", value, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4LessThan(String value) {
            addCriterion("image4 <", value, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4LessThanOrEqualTo(String value) {
            addCriterion("image4 <=", value, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4Like(String value) {
            addCriterion("image4 like", value, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4NotLike(String value) {
            addCriterion("image4 not like", value, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4In(List<String> values) {
            addCriterion("image4 in", values, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4NotIn(List<String> values) {
            addCriterion("image4 not in", values, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4Between(String value1, String value2) {
            addCriterion("image4 between", value1, value2, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4NotBetween(String value1, String value2) {
            addCriterion("image4 not between", value1, value2, "image4");
            return (Criteria) this;
        }

        public Criteria andImage5IsNull() {
            addCriterion("image5 is null");
            return (Criteria) this;
        }

        public Criteria andImage5IsNotNull() {
            addCriterion("image5 is not null");
            return (Criteria) this;
        }

        public Criteria andImage5EqualTo(String value) {
            addCriterion("image5 =", value, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5NotEqualTo(String value) {
            addCriterion("image5 <>", value, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5GreaterThan(String value) {
            addCriterion("image5 >", value, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5GreaterThanOrEqualTo(String value) {
            addCriterion("image5 >=", value, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5LessThan(String value) {
            addCriterion("image5 <", value, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5LessThanOrEqualTo(String value) {
            addCriterion("image5 <=", value, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5Like(String value) {
            addCriterion("image5 like", value, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5NotLike(String value) {
            addCriterion("image5 not like", value, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5In(List<String> values) {
            addCriterion("image5 in", values, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5NotIn(List<String> values) {
            addCriterion("image5 not in", values, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5Between(String value1, String value2) {
            addCriterion("image5 between", value1, value2, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5NotBetween(String value1, String value2) {
            addCriterion("image5 not between", value1, value2, "image5");
            return (Criteria) this;
        }

        public Criteria andBuyAreaIsNull() {
            addCriterion("buy_area is null");
            return (Criteria) this;
        }

        public Criteria andBuyAreaIsNotNull() {
            addCriterion("buy_area is not null");
            return (Criteria) this;
        }

        public Criteria andBuyAreaEqualTo(String value) {
            addCriterion("buy_area =", value, "buyArea");
            return (Criteria) this;
        }

        public Criteria andBuyAreaNotEqualTo(String value) {
            addCriterion("buy_area <>", value, "buyArea");
            return (Criteria) this;
        }

        public Criteria andBuyAreaGreaterThan(String value) {
            addCriterion("buy_area >", value, "buyArea");
            return (Criteria) this;
        }

        public Criteria andBuyAreaGreaterThanOrEqualTo(String value) {
            addCriterion("buy_area >=", value, "buyArea");
            return (Criteria) this;
        }

        public Criteria andBuyAreaLessThan(String value) {
            addCriterion("buy_area <", value, "buyArea");
            return (Criteria) this;
        }

        public Criteria andBuyAreaLessThanOrEqualTo(String value) {
            addCriterion("buy_area <=", value, "buyArea");
            return (Criteria) this;
        }

        public Criteria andBuyAreaLike(String value) {
            addCriterion("buy_area like", value, "buyArea");
            return (Criteria) this;
        }

        public Criteria andBuyAreaNotLike(String value) {
            addCriterion("buy_area not like", value, "buyArea");
            return (Criteria) this;
        }

        public Criteria andBuyAreaIn(List<String> values) {
            addCriterion("buy_area in", values, "buyArea");
            return (Criteria) this;
        }

        public Criteria andBuyAreaNotIn(List<String> values) {
            addCriterion("buy_area not in", values, "buyArea");
            return (Criteria) this;
        }

        public Criteria andBuyAreaBetween(String value1, String value2) {
            addCriterion("buy_area between", value1, value2, "buyArea");
            return (Criteria) this;
        }

        public Criteria andBuyAreaNotBetween(String value1, String value2) {
            addCriterion("buy_area not between", value1, value2, "buyArea");
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

        public Criteria andPriceReferIsNull() {
            addCriterion("price_refer is null");
            return (Criteria) this;
        }

        public Criteria andPriceReferIsNotNull() {
            addCriterion("price_refer is not null");
            return (Criteria) this;
        }

        public Criteria andPriceReferEqualTo(String value) {
            addCriterion("price_refer =", value, "priceRefer");
            return (Criteria) this;
        }

        public Criteria andPriceReferNotEqualTo(String value) {
            addCriterion("price_refer <>", value, "priceRefer");
            return (Criteria) this;
        }

        public Criteria andPriceReferGreaterThan(String value) {
            addCriterion("price_refer >", value, "priceRefer");
            return (Criteria) this;
        }

        public Criteria andPriceReferGreaterThanOrEqualTo(String value) {
            addCriterion("price_refer >=", value, "priceRefer");
            return (Criteria) this;
        }

        public Criteria andPriceReferLessThan(String value) {
            addCriterion("price_refer <", value, "priceRefer");
            return (Criteria) this;
        }

        public Criteria andPriceReferLessThanOrEqualTo(String value) {
            addCriterion("price_refer <=", value, "priceRefer");
            return (Criteria) this;
        }

        public Criteria andPriceReferLike(String value) {
            addCriterion("price_refer like", value, "priceRefer");
            return (Criteria) this;
        }

        public Criteria andPriceReferNotLike(String value) {
            addCriterion("price_refer not like", value, "priceRefer");
            return (Criteria) this;
        }

        public Criteria andPriceReferIn(List<String> values) {
            addCriterion("price_refer in", values, "priceRefer");
            return (Criteria) this;
        }

        public Criteria andPriceReferNotIn(List<String> values) {
            addCriterion("price_refer not in", values, "priceRefer");
            return (Criteria) this;
        }

        public Criteria andPriceReferBetween(String value1, String value2) {
            addCriterion("price_refer between", value1, value2, "priceRefer");
            return (Criteria) this;
        }

        public Criteria andPriceReferNotBetween(String value1, String value2) {
            addCriterion("price_refer not between", value1, value2, "priceRefer");
            return (Criteria) this;
        }

        public Criteria andSpecialitySortIsNull() {
            addCriterion("speciality_sort is null");
            return (Criteria) this;
        }

        public Criteria andSpecialitySortIsNotNull() {
            addCriterion("speciality_sort is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialitySortEqualTo(BigDecimal value) {
            addCriterion("speciality_sort =", value, "specialitySort");
            return (Criteria) this;
        }

        public Criteria andSpecialitySortNotEqualTo(BigDecimal value) {
            addCriterion("speciality_sort <>", value, "specialitySort");
            return (Criteria) this;
        }

        public Criteria andSpecialitySortGreaterThan(BigDecimal value) {
            addCriterion("speciality_sort >", value, "specialitySort");
            return (Criteria) this;
        }

        public Criteria andSpecialitySortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("speciality_sort >=", value, "specialitySort");
            return (Criteria) this;
        }

        public Criteria andSpecialitySortLessThan(BigDecimal value) {
            addCriterion("speciality_sort <", value, "specialitySort");
            return (Criteria) this;
        }

        public Criteria andSpecialitySortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("speciality_sort <=", value, "specialitySort");
            return (Criteria) this;
        }

        public Criteria andSpecialitySortIn(List<BigDecimal> values) {
            addCriterion("speciality_sort in", values, "specialitySort");
            return (Criteria) this;
        }

        public Criteria andSpecialitySortNotIn(List<BigDecimal> values) {
            addCriterion("speciality_sort not in", values, "specialitySort");
            return (Criteria) this;
        }

        public Criteria andSpecialitySortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("speciality_sort between", value1, value2, "specialitySort");
            return (Criteria) this;
        }

        public Criteria andSpecialitySortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("speciality_sort not between", value1, value2, "specialitySort");
            return (Criteria) this;
        }

        public Criteria andSameGcSortIsNull() {
            addCriterion("same_gc_sort is null");
            return (Criteria) this;
        }

        public Criteria andSameGcSortIsNotNull() {
            addCriterion("same_gc_sort is not null");
            return (Criteria) this;
        }

        public Criteria andSameGcSortEqualTo(BigDecimal value) {
            addCriterion("same_gc_sort =", value, "sameGcSort");
            return (Criteria) this;
        }

        public Criteria andSameGcSortNotEqualTo(BigDecimal value) {
            addCriterion("same_gc_sort <>", value, "sameGcSort");
            return (Criteria) this;
        }

        public Criteria andSameGcSortGreaterThan(BigDecimal value) {
            addCriterion("same_gc_sort >", value, "sameGcSort");
            return (Criteria) this;
        }

        public Criteria andSameGcSortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("same_gc_sort >=", value, "sameGcSort");
            return (Criteria) this;
        }

        public Criteria andSameGcSortLessThan(BigDecimal value) {
            addCriterion("same_gc_sort <", value, "sameGcSort");
            return (Criteria) this;
        }

        public Criteria andSameGcSortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("same_gc_sort <=", value, "sameGcSort");
            return (Criteria) this;
        }

        public Criteria andSameGcSortIn(List<BigDecimal> values) {
            addCriterion("same_gc_sort in", values, "sameGcSort");
            return (Criteria) this;
        }

        public Criteria andSameGcSortNotIn(List<BigDecimal> values) {
            addCriterion("same_gc_sort not in", values, "sameGcSort");
            return (Criteria) this;
        }

        public Criteria andSameGcSortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("same_gc_sort between", value1, value2, "sameGcSort");
            return (Criteria) this;
        }

        public Criteria andSameGcSortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("same_gc_sort not between", value1, value2, "sameGcSort");
            return (Criteria) this;
        }

        public Criteria andTradeModeIsNull() {
            addCriterion("trade_mode is null");
            return (Criteria) this;
        }

        public Criteria andTradeModeIsNotNull() {
            addCriterion("trade_mode is not null");
            return (Criteria) this;
        }

        public Criteria andTradeModeEqualTo(String value) {
            addCriterion("trade_mode =", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeNotEqualTo(String value) {
            addCriterion("trade_mode <>", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeGreaterThan(String value) {
            addCriterion("trade_mode >", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeGreaterThanOrEqualTo(String value) {
            addCriterion("trade_mode >=", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeLessThan(String value) {
            addCriterion("trade_mode <", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeLessThanOrEqualTo(String value) {
            addCriterion("trade_mode <=", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeLike(String value) {
            addCriterion("trade_mode like", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeNotLike(String value) {
            addCriterion("trade_mode not like", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeIn(List<String> values) {
            addCriterion("trade_mode in", values, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeNotIn(List<String> values) {
            addCriterion("trade_mode not in", values, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeBetween(String value1, String value2) {
            addCriterion("trade_mode between", value1, value2, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeNotBetween(String value1, String value2) {
            addCriterion("trade_mode not between", value1, value2, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andPresellTimeIsNull() {
            addCriterion("presell_time is null");
            return (Criteria) this;
        }

        public Criteria andPresellTimeIsNotNull() {
            addCriterion("presell_time is not null");
            return (Criteria) this;
        }

        public Criteria andPresellTimeEqualTo(Integer value) {
            addCriterion("presell_time =", value, "presellTime");
            return (Criteria) this;
        }

        public Criteria andPresellTimeNotEqualTo(Integer value) {
            addCriterion("presell_time <>", value, "presellTime");
            return (Criteria) this;
        }

        public Criteria andPresellTimeGreaterThan(Integer value) {
            addCriterion("presell_time >", value, "presellTime");
            return (Criteria) this;
        }

        public Criteria andPresellTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("presell_time >=", value, "presellTime");
            return (Criteria) this;
        }

        public Criteria andPresellTimeLessThan(Integer value) {
            addCriterion("presell_time <", value, "presellTime");
            return (Criteria) this;
        }

        public Criteria andPresellTimeLessThanOrEqualTo(Integer value) {
            addCriterion("presell_time <=", value, "presellTime");
            return (Criteria) this;
        }

        public Criteria andPresellTimeIn(List<Integer> values) {
            addCriterion("presell_time in", values, "presellTime");
            return (Criteria) this;
        }

        public Criteria andPresellTimeNotIn(List<Integer> values) {
            addCriterion("presell_time not in", values, "presellTime");
            return (Criteria) this;
        }

        public Criteria andPresellTimeBetween(Integer value1, Integer value2) {
            addCriterion("presell_time between", value1, value2, "presellTime");
            return (Criteria) this;
        }

        public Criteria andPresellTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("presell_time not between", value1, value2, "presellTime");
            return (Criteria) this;
        }

        public Criteria andMostNeedSortIsNull() {
            addCriterion("most_need_sort is null");
            return (Criteria) this;
        }

        public Criteria andMostNeedSortIsNotNull() {
            addCriterion("most_need_sort is not null");
            return (Criteria) this;
        }

        public Criteria andMostNeedSortEqualTo(BigDecimal value) {
            addCriterion("most_need_sort =", value, "mostNeedSort");
            return (Criteria) this;
        }

        public Criteria andMostNeedSortNotEqualTo(BigDecimal value) {
            addCriterion("most_need_sort <>", value, "mostNeedSort");
            return (Criteria) this;
        }

        public Criteria andMostNeedSortGreaterThan(BigDecimal value) {
            addCriterion("most_need_sort >", value, "mostNeedSort");
            return (Criteria) this;
        }

        public Criteria andMostNeedSortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("most_need_sort >=", value, "mostNeedSort");
            return (Criteria) this;
        }

        public Criteria andMostNeedSortLessThan(BigDecimal value) {
            addCriterion("most_need_sort <", value, "mostNeedSort");
            return (Criteria) this;
        }

        public Criteria andMostNeedSortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("most_need_sort <=", value, "mostNeedSort");
            return (Criteria) this;
        }

        public Criteria andMostNeedSortIn(List<BigDecimal> values) {
            addCriterion("most_need_sort in", values, "mostNeedSort");
            return (Criteria) this;
        }

        public Criteria andMostNeedSortNotIn(List<BigDecimal> values) {
            addCriterion("most_need_sort not in", values, "mostNeedSort");
            return (Criteria) this;
        }

        public Criteria andMostNeedSortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("most_need_sort between", value1, value2, "mostNeedSort");
            return (Criteria) this;
        }

        public Criteria andMostNeedSortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("most_need_sort not between", value1, value2, "mostNeedSort");
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
    }

    /**
     * 描述:sy_goods_common表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-10-25
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_goods_common 2017-10-25
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