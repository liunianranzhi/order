package com.shanyuan.platform.ms.dao.recommend.entity;

import java.util.ArrayList;
import java.util.List;

public class SyRecommendResourceExample {
    /**
     * sy_recommend_resource
     */
    protected String orderByClause;

    /**
     * sy_recommend_resource
     */
    protected boolean distinct;

    /**
     * sy_recommend_resource
     */
    protected List<Criteria> oredCriteria;

    public SyRecommendResourceExample() {
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
     * sy_recommend_resource 2017-10-31
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

        public Criteria andResIdIsNull() {
            addCriterion("res_id is null");
            return (Criteria) this;
        }

        public Criteria andResIdIsNotNull() {
            addCriterion("res_id is not null");
            return (Criteria) this;
        }

        public Criteria andResIdEqualTo(Integer value) {
            addCriterion("res_id =", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotEqualTo(Integer value) {
            addCriterion("res_id <>", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThan(Integer value) {
            addCriterion("res_id >", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("res_id >=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThan(Integer value) {
            addCriterion("res_id <", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThanOrEqualTo(Integer value) {
            addCriterion("res_id <=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdIn(List<Integer> values) {
            addCriterion("res_id in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotIn(List<Integer> values) {
            addCriterion("res_id not in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdBetween(Integer value1, Integer value2) {
            addCriterion("res_id between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotBetween(Integer value1, Integer value2) {
            addCriterion("res_id not between", value1, value2, "resId");
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

        public Criteria andResTitleIsNull() {
            addCriterion("res_title is null");
            return (Criteria) this;
        }

        public Criteria andResTitleIsNotNull() {
            addCriterion("res_title is not null");
            return (Criteria) this;
        }

        public Criteria andResTitleEqualTo(String value) {
            addCriterion("res_title =", value, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleNotEqualTo(String value) {
            addCriterion("res_title <>", value, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleGreaterThan(String value) {
            addCriterion("res_title >", value, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleGreaterThanOrEqualTo(String value) {
            addCriterion("res_title >=", value, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleLessThan(String value) {
            addCriterion("res_title <", value, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleLessThanOrEqualTo(String value) {
            addCriterion("res_title <=", value, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleLike(String value) {
            addCriterion("res_title like", value, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleNotLike(String value) {
            addCriterion("res_title not like", value, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleIn(List<String> values) {
            addCriterion("res_title in", values, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleNotIn(List<String> values) {
            addCriterion("res_title not in", values, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleBetween(String value1, String value2) {
            addCriterion("res_title between", value1, value2, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleNotBetween(String value1, String value2) {
            addCriterion("res_title not between", value1, value2, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResDescIsNull() {
            addCriterion("res_desc is null");
            return (Criteria) this;
        }

        public Criteria andResDescIsNotNull() {
            addCriterion("res_desc is not null");
            return (Criteria) this;
        }

        public Criteria andResDescEqualTo(String value) {
            addCriterion("res_desc =", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescNotEqualTo(String value) {
            addCriterion("res_desc <>", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescGreaterThan(String value) {
            addCriterion("res_desc >", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescGreaterThanOrEqualTo(String value) {
            addCriterion("res_desc >=", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescLessThan(String value) {
            addCriterion("res_desc <", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescLessThanOrEqualTo(String value) {
            addCriterion("res_desc <=", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescLike(String value) {
            addCriterion("res_desc like", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescNotLike(String value) {
            addCriterion("res_desc not like", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescIn(List<String> values) {
            addCriterion("res_desc in", values, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescNotIn(List<String> values) {
            addCriterion("res_desc not in", values, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescBetween(String value1, String value2) {
            addCriterion("res_desc between", value1, value2, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescNotBetween(String value1, String value2) {
            addCriterion("res_desc not between", value1, value2, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResImageIsNull() {
            addCriterion("res_image is null");
            return (Criteria) this;
        }

        public Criteria andResImageIsNotNull() {
            addCriterion("res_image is not null");
            return (Criteria) this;
        }

        public Criteria andResImageEqualTo(String value) {
            addCriterion("res_image =", value, "resImage");
            return (Criteria) this;
        }

        public Criteria andResImageNotEqualTo(String value) {
            addCriterion("res_image <>", value, "resImage");
            return (Criteria) this;
        }

        public Criteria andResImageGreaterThan(String value) {
            addCriterion("res_image >", value, "resImage");
            return (Criteria) this;
        }

        public Criteria andResImageGreaterThanOrEqualTo(String value) {
            addCriterion("res_image >=", value, "resImage");
            return (Criteria) this;
        }

        public Criteria andResImageLessThan(String value) {
            addCriterion("res_image <", value, "resImage");
            return (Criteria) this;
        }

        public Criteria andResImageLessThanOrEqualTo(String value) {
            addCriterion("res_image <=", value, "resImage");
            return (Criteria) this;
        }

        public Criteria andResImageLike(String value) {
            addCriterion("res_image like", value, "resImage");
            return (Criteria) this;
        }

        public Criteria andResImageNotLike(String value) {
            addCriterion("res_image not like", value, "resImage");
            return (Criteria) this;
        }

        public Criteria andResImageIn(List<String> values) {
            addCriterion("res_image in", values, "resImage");
            return (Criteria) this;
        }

        public Criteria andResImageNotIn(List<String> values) {
            addCriterion("res_image not in", values, "resImage");
            return (Criteria) this;
        }

        public Criteria andResImageBetween(String value1, String value2) {
            addCriterion("res_image between", value1, value2, "resImage");
            return (Criteria) this;
        }

        public Criteria andResImageNotBetween(String value1, String value2) {
            addCriterion("res_image not between", value1, value2, "resImage");
            return (Criteria) this;
        }

        public Criteria andResAddtimeIsNull() {
            addCriterion("res_addtime is null");
            return (Criteria) this;
        }

        public Criteria andResAddtimeIsNotNull() {
            addCriterion("res_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andResAddtimeEqualTo(Integer value) {
            addCriterion("res_addtime =", value, "resAddtime");
            return (Criteria) this;
        }

        public Criteria andResAddtimeNotEqualTo(Integer value) {
            addCriterion("res_addtime <>", value, "resAddtime");
            return (Criteria) this;
        }

        public Criteria andResAddtimeGreaterThan(Integer value) {
            addCriterion("res_addtime >", value, "resAddtime");
            return (Criteria) this;
        }

        public Criteria andResAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("res_addtime >=", value, "resAddtime");
            return (Criteria) this;
        }

        public Criteria andResAddtimeLessThan(Integer value) {
            addCriterion("res_addtime <", value, "resAddtime");
            return (Criteria) this;
        }

        public Criteria andResAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("res_addtime <=", value, "resAddtime");
            return (Criteria) this;
        }

        public Criteria andResAddtimeIn(List<Integer> values) {
            addCriterion("res_addtime in", values, "resAddtime");
            return (Criteria) this;
        }

        public Criteria andResAddtimeNotIn(List<Integer> values) {
            addCriterion("res_addtime not in", values, "resAddtime");
            return (Criteria) this;
        }

        public Criteria andResAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("res_addtime between", value1, value2, "resAddtime");
            return (Criteria) this;
        }

        public Criteria andResAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("res_addtime not between", value1, value2, "resAddtime");
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

        public Criteria andResSortIsNull() {
            addCriterion("res_sort is null");
            return (Criteria) this;
        }

        public Criteria andResSortIsNotNull() {
            addCriterion("res_sort is not null");
            return (Criteria) this;
        }

        public Criteria andResSortEqualTo(Byte value) {
            addCriterion("res_sort =", value, "resSort");
            return (Criteria) this;
        }

        public Criteria andResSortNotEqualTo(Byte value) {
            addCriterion("res_sort <>", value, "resSort");
            return (Criteria) this;
        }

        public Criteria andResSortGreaterThan(Byte value) {
            addCriterion("res_sort >", value, "resSort");
            return (Criteria) this;
        }

        public Criteria andResSortGreaterThanOrEqualTo(Byte value) {
            addCriterion("res_sort >=", value, "resSort");
            return (Criteria) this;
        }

        public Criteria andResSortLessThan(Byte value) {
            addCriterion("res_sort <", value, "resSort");
            return (Criteria) this;
        }

        public Criteria andResSortLessThanOrEqualTo(Byte value) {
            addCriterion("res_sort <=", value, "resSort");
            return (Criteria) this;
        }

        public Criteria andResSortIn(List<Byte> values) {
            addCriterion("res_sort in", values, "resSort");
            return (Criteria) this;
        }

        public Criteria andResSortNotIn(List<Byte> values) {
            addCriterion("res_sort not in", values, "resSort");
            return (Criteria) this;
        }

        public Criteria andResSortBetween(Byte value1, Byte value2) {
            addCriterion("res_sort between", value1, value2, "resSort");
            return (Criteria) this;
        }

        public Criteria andResSortNotBetween(Byte value1, Byte value2) {
            addCriterion("res_sort not between", value1, value2, "resSort");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_recommend_resource表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2017-10-31
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_recommend_resource 2017-10-31
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