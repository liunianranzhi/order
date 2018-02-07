package com.shanyuan.platform.ms.dao.goods.entity;

import java.util.ArrayList;
import java.util.List;

public class SyGoodsImagesExample {
    /**
     * sy_goods_images
     */
    protected String orderByClause;

    /**
     * sy_goods_images
     */
    protected boolean distinct;

    /**
     * sy_goods_images
     */
    protected List<Criteria> oredCriteria;

    public SyGoodsImagesExample() {
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
     * sy_goods_images 2017-10-16
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

        public Criteria andGoodsImageIdIsNull() {
            addCriterion("goods_image_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdIsNotNull() {
            addCriterion("goods_image_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdEqualTo(Integer value) {
            addCriterion("goods_image_id =", value, "goodsImageId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdNotEqualTo(Integer value) {
            addCriterion("goods_image_id <>", value, "goodsImageId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdGreaterThan(Integer value) {
            addCriterion("goods_image_id >", value, "goodsImageId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_image_id >=", value, "goodsImageId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdLessThan(Integer value) {
            addCriterion("goods_image_id <", value, "goodsImageId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_image_id <=", value, "goodsImageId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdIn(List<Integer> values) {
            addCriterion("goods_image_id in", values, "goodsImageId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdNotIn(List<Integer> values) {
            addCriterion("goods_image_id not in", values, "goodsImageId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_image_id between", value1, value2, "goodsImageId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_image_id not between", value1, value2, "goodsImageId");
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

        public Criteria andGoodsImageSortIsNull() {
            addCriterion("goods_image_sort is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortIsNotNull() {
            addCriterion("goods_image_sort is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortEqualTo(Byte value) {
            addCriterion("goods_image_sort =", value, "goodsImageSort");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortNotEqualTo(Byte value) {
            addCriterion("goods_image_sort <>", value, "goodsImageSort");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortGreaterThan(Byte value) {
            addCriterion("goods_image_sort >", value, "goodsImageSort");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_image_sort >=", value, "goodsImageSort");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortLessThan(Byte value) {
            addCriterion("goods_image_sort <", value, "goodsImageSort");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortLessThanOrEqualTo(Byte value) {
            addCriterion("goods_image_sort <=", value, "goodsImageSort");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortIn(List<Byte> values) {
            addCriterion("goods_image_sort in", values, "goodsImageSort");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortNotIn(List<Byte> values) {
            addCriterion("goods_image_sort not in", values, "goodsImageSort");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortBetween(Byte value1, Byte value2) {
            addCriterion("goods_image_sort between", value1, value2, "goodsImageSort");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_image_sort not between", value1, value2, "goodsImageSort");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(Byte value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(Byte value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(Byte value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(Byte value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(Byte value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<Byte> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<Byte> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(Byte value1, Byte value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(Byte value1, Byte value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_goods_images表的实体类
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
     * sy_goods_images 2017-10-16
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