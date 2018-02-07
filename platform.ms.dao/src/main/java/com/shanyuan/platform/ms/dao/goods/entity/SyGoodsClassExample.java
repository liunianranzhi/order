package com.shanyuan.platform.ms.dao.goods.entity;

import java.util.ArrayList;
import java.util.List;

public class SyGoodsClassExample {
    /**
     * sy_goods_class
     */
    protected String orderByClause;

    /**
     * sy_goods_class
     */
    protected boolean distinct;

    /**
     * sy_goods_class
     */
    protected List<Criteria> oredCriteria;

    public SyGoodsClassExample() {
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
     * sy_goods_class 2017-10-16
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

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andGcParentIdIsNull() {
            addCriterion("gc_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andGcParentIdIsNotNull() {
            addCriterion("gc_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andGcParentIdEqualTo(Integer value) {
            addCriterion("gc_parent_id =", value, "gcParentId");
            return (Criteria) this;
        }

        public Criteria andGcParentIdNotEqualTo(Integer value) {
            addCriterion("gc_parent_id <>", value, "gcParentId");
            return (Criteria) this;
        }

        public Criteria andGcParentIdGreaterThan(Integer value) {
            addCriterion("gc_parent_id >", value, "gcParentId");
            return (Criteria) this;
        }

        public Criteria andGcParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gc_parent_id >=", value, "gcParentId");
            return (Criteria) this;
        }

        public Criteria andGcParentIdLessThan(Integer value) {
            addCriterion("gc_parent_id <", value, "gcParentId");
            return (Criteria) this;
        }

        public Criteria andGcParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("gc_parent_id <=", value, "gcParentId");
            return (Criteria) this;
        }

        public Criteria andGcParentIdIn(List<Integer> values) {
            addCriterion("gc_parent_id in", values, "gcParentId");
            return (Criteria) this;
        }

        public Criteria andGcParentIdNotIn(List<Integer> values) {
            addCriterion("gc_parent_id not in", values, "gcParentId");
            return (Criteria) this;
        }

        public Criteria andGcParentIdBetween(Integer value1, Integer value2) {
            addCriterion("gc_parent_id between", value1, value2, "gcParentId");
            return (Criteria) this;
        }

        public Criteria andGcParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gc_parent_id not between", value1, value2, "gcParentId");
            return (Criteria) this;
        }

        public Criteria andGcSortIsNull() {
            addCriterion("gc_sort is null");
            return (Criteria) this;
        }

        public Criteria andGcSortIsNotNull() {
            addCriterion("gc_sort is not null");
            return (Criteria) this;
        }

        public Criteria andGcSortEqualTo(Short value) {
            addCriterion("gc_sort =", value, "gcSort");
            return (Criteria) this;
        }

        public Criteria andGcSortNotEqualTo(Short value) {
            addCriterion("gc_sort <>", value, "gcSort");
            return (Criteria) this;
        }

        public Criteria andGcSortGreaterThan(Short value) {
            addCriterion("gc_sort >", value, "gcSort");
            return (Criteria) this;
        }

        public Criteria andGcSortGreaterThanOrEqualTo(Short value) {
            addCriterion("gc_sort >=", value, "gcSort");
            return (Criteria) this;
        }

        public Criteria andGcSortLessThan(Short value) {
            addCriterion("gc_sort <", value, "gcSort");
            return (Criteria) this;
        }

        public Criteria andGcSortLessThanOrEqualTo(Short value) {
            addCriterion("gc_sort <=", value, "gcSort");
            return (Criteria) this;
        }

        public Criteria andGcSortIn(List<Short> values) {
            addCriterion("gc_sort in", values, "gcSort");
            return (Criteria) this;
        }

        public Criteria andGcSortNotIn(List<Short> values) {
            addCriterion("gc_sort not in", values, "gcSort");
            return (Criteria) this;
        }

        public Criteria andGcSortBetween(Short value1, Short value2) {
            addCriterion("gc_sort between", value1, value2, "gcSort");
            return (Criteria) this;
        }

        public Criteria andGcSortNotBetween(Short value1, Short value2) {
            addCriterion("gc_sort not between", value1, value2, "gcSort");
            return (Criteria) this;
        }

        public Criteria andGcTitleIsNull() {
            addCriterion("gc_title is null");
            return (Criteria) this;
        }

        public Criteria andGcTitleIsNotNull() {
            addCriterion("gc_title is not null");
            return (Criteria) this;
        }

        public Criteria andGcTitleEqualTo(String value) {
            addCriterion("gc_title =", value, "gcTitle");
            return (Criteria) this;
        }

        public Criteria andGcTitleNotEqualTo(String value) {
            addCriterion("gc_title <>", value, "gcTitle");
            return (Criteria) this;
        }

        public Criteria andGcTitleGreaterThan(String value) {
            addCriterion("gc_title >", value, "gcTitle");
            return (Criteria) this;
        }

        public Criteria andGcTitleGreaterThanOrEqualTo(String value) {
            addCriterion("gc_title >=", value, "gcTitle");
            return (Criteria) this;
        }

        public Criteria andGcTitleLessThan(String value) {
            addCriterion("gc_title <", value, "gcTitle");
            return (Criteria) this;
        }

        public Criteria andGcTitleLessThanOrEqualTo(String value) {
            addCriterion("gc_title <=", value, "gcTitle");
            return (Criteria) this;
        }

        public Criteria andGcTitleLike(String value) {
            addCriterion("gc_title like", value, "gcTitle");
            return (Criteria) this;
        }

        public Criteria andGcTitleNotLike(String value) {
            addCriterion("gc_title not like", value, "gcTitle");
            return (Criteria) this;
        }

        public Criteria andGcTitleIn(List<String> values) {
            addCriterion("gc_title in", values, "gcTitle");
            return (Criteria) this;
        }

        public Criteria andGcTitleNotIn(List<String> values) {
            addCriterion("gc_title not in", values, "gcTitle");
            return (Criteria) this;
        }

        public Criteria andGcTitleBetween(String value1, String value2) {
            addCriterion("gc_title between", value1, value2, "gcTitle");
            return (Criteria) this;
        }

        public Criteria andGcTitleNotBetween(String value1, String value2) {
            addCriterion("gc_title not between", value1, value2, "gcTitle");
            return (Criteria) this;
        }

        public Criteria andGcKeywordsIsNull() {
            addCriterion("gc_keywords is null");
            return (Criteria) this;
        }

        public Criteria andGcKeywordsIsNotNull() {
            addCriterion("gc_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andGcKeywordsEqualTo(String value) {
            addCriterion("gc_keywords =", value, "gcKeywords");
            return (Criteria) this;
        }

        public Criteria andGcKeywordsNotEqualTo(String value) {
            addCriterion("gc_keywords <>", value, "gcKeywords");
            return (Criteria) this;
        }

        public Criteria andGcKeywordsGreaterThan(String value) {
            addCriterion("gc_keywords >", value, "gcKeywords");
            return (Criteria) this;
        }

        public Criteria andGcKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("gc_keywords >=", value, "gcKeywords");
            return (Criteria) this;
        }

        public Criteria andGcKeywordsLessThan(String value) {
            addCriterion("gc_keywords <", value, "gcKeywords");
            return (Criteria) this;
        }

        public Criteria andGcKeywordsLessThanOrEqualTo(String value) {
            addCriterion("gc_keywords <=", value, "gcKeywords");
            return (Criteria) this;
        }

        public Criteria andGcKeywordsLike(String value) {
            addCriterion("gc_keywords like", value, "gcKeywords");
            return (Criteria) this;
        }

        public Criteria andGcKeywordsNotLike(String value) {
            addCriterion("gc_keywords not like", value, "gcKeywords");
            return (Criteria) this;
        }

        public Criteria andGcKeywordsIn(List<String> values) {
            addCriterion("gc_keywords in", values, "gcKeywords");
            return (Criteria) this;
        }

        public Criteria andGcKeywordsNotIn(List<String> values) {
            addCriterion("gc_keywords not in", values, "gcKeywords");
            return (Criteria) this;
        }

        public Criteria andGcKeywordsBetween(String value1, String value2) {
            addCriterion("gc_keywords between", value1, value2, "gcKeywords");
            return (Criteria) this;
        }

        public Criteria andGcKeywordsNotBetween(String value1, String value2) {
            addCriterion("gc_keywords not between", value1, value2, "gcKeywords");
            return (Criteria) this;
        }

        public Criteria andGcDescriptionIsNull() {
            addCriterion("gc_description is null");
            return (Criteria) this;
        }

        public Criteria andGcDescriptionIsNotNull() {
            addCriterion("gc_description is not null");
            return (Criteria) this;
        }

        public Criteria andGcDescriptionEqualTo(String value) {
            addCriterion("gc_description =", value, "gcDescription");
            return (Criteria) this;
        }

        public Criteria andGcDescriptionNotEqualTo(String value) {
            addCriterion("gc_description <>", value, "gcDescription");
            return (Criteria) this;
        }

        public Criteria andGcDescriptionGreaterThan(String value) {
            addCriterion("gc_description >", value, "gcDescription");
            return (Criteria) this;
        }

        public Criteria andGcDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("gc_description >=", value, "gcDescription");
            return (Criteria) this;
        }

        public Criteria andGcDescriptionLessThan(String value) {
            addCriterion("gc_description <", value, "gcDescription");
            return (Criteria) this;
        }

        public Criteria andGcDescriptionLessThanOrEqualTo(String value) {
            addCriterion("gc_description <=", value, "gcDescription");
            return (Criteria) this;
        }

        public Criteria andGcDescriptionLike(String value) {
            addCriterion("gc_description like", value, "gcDescription");
            return (Criteria) this;
        }

        public Criteria andGcDescriptionNotLike(String value) {
            addCriterion("gc_description not like", value, "gcDescription");
            return (Criteria) this;
        }

        public Criteria andGcDescriptionIn(List<String> values) {
            addCriterion("gc_description in", values, "gcDescription");
            return (Criteria) this;
        }

        public Criteria andGcDescriptionNotIn(List<String> values) {
            addCriterion("gc_description not in", values, "gcDescription");
            return (Criteria) this;
        }

        public Criteria andGcDescriptionBetween(String value1, String value2) {
            addCriterion("gc_description between", value1, value2, "gcDescription");
            return (Criteria) this;
        }

        public Criteria andGcDescriptionNotBetween(String value1, String value2) {
            addCriterion("gc_description not between", value1, value2, "gcDescription");
            return (Criteria) this;
        }

        public Criteria andGcCodeIsNull() {
            addCriterion("gc_code is null");
            return (Criteria) this;
        }

        public Criteria andGcCodeIsNotNull() {
            addCriterion("gc_code is not null");
            return (Criteria) this;
        }

        public Criteria andGcCodeEqualTo(String value) {
            addCriterion("gc_code =", value, "gcCode");
            return (Criteria) this;
        }

        public Criteria andGcCodeNotEqualTo(String value) {
            addCriterion("gc_code <>", value, "gcCode");
            return (Criteria) this;
        }

        public Criteria andGcCodeGreaterThan(String value) {
            addCriterion("gc_code >", value, "gcCode");
            return (Criteria) this;
        }

        public Criteria andGcCodeGreaterThanOrEqualTo(String value) {
            addCriterion("gc_code >=", value, "gcCode");
            return (Criteria) this;
        }

        public Criteria andGcCodeLessThan(String value) {
            addCriterion("gc_code <", value, "gcCode");
            return (Criteria) this;
        }

        public Criteria andGcCodeLessThanOrEqualTo(String value) {
            addCriterion("gc_code <=", value, "gcCode");
            return (Criteria) this;
        }

        public Criteria andGcCodeLike(String value) {
            addCriterion("gc_code like", value, "gcCode");
            return (Criteria) this;
        }

        public Criteria andGcCodeNotLike(String value) {
            addCriterion("gc_code not like", value, "gcCode");
            return (Criteria) this;
        }

        public Criteria andGcCodeIn(List<String> values) {
            addCriterion("gc_code in", values, "gcCode");
            return (Criteria) this;
        }

        public Criteria andGcCodeNotIn(List<String> values) {
            addCriterion("gc_code not in", values, "gcCode");
            return (Criteria) this;
        }

        public Criteria andGcCodeBetween(String value1, String value2) {
            addCriterion("gc_code between", value1, value2, "gcCode");
            return (Criteria) this;
        }

        public Criteria andGcCodeNotBetween(String value1, String value2) {
            addCriterion("gc_code not between", value1, value2, "gcCode");
            return (Criteria) this;
        }

        public Criteria andGoodsNameTemplateIsNull() {
            addCriterion("goods_name_template is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameTemplateIsNotNull() {
            addCriterion("goods_name_template is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameTemplateEqualTo(String value) {
            addCriterion("goods_name_template =", value, "goodsNameTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsNameTemplateNotEqualTo(String value) {
            addCriterion("goods_name_template <>", value, "goodsNameTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsNameTemplateGreaterThan(String value) {
            addCriterion("goods_name_template >", value, "goodsNameTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsNameTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name_template >=", value, "goodsNameTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsNameTemplateLessThan(String value) {
            addCriterion("goods_name_template <", value, "goodsNameTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsNameTemplateLessThanOrEqualTo(String value) {
            addCriterion("goods_name_template <=", value, "goodsNameTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsNameTemplateLike(String value) {
            addCriterion("goods_name_template like", value, "goodsNameTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsNameTemplateNotLike(String value) {
            addCriterion("goods_name_template not like", value, "goodsNameTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsNameTemplateIn(List<String> values) {
            addCriterion("goods_name_template in", values, "goodsNameTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsNameTemplateNotIn(List<String> values) {
            addCriterion("goods_name_template not in", values, "goodsNameTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsNameTemplateBetween(String value1, String value2) {
            addCriterion("goods_name_template between", value1, value2, "goodsNameTemplate");
            return (Criteria) this;
        }

        public Criteria andGoodsNameTemplateNotBetween(String value1, String value2) {
            addCriterion("goods_name_template not between", value1, value2, "goodsNameTemplate");
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

        public Criteria andDepreciationRateIsNull() {
            addCriterion("depreciation_rate is null");
            return (Criteria) this;
        }

        public Criteria andDepreciationRateIsNotNull() {
            addCriterion("depreciation_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDepreciationRateEqualTo(Float value) {
            addCriterion("depreciation_rate =", value, "depreciationRate");
            return (Criteria) this;
        }

        public Criteria andDepreciationRateNotEqualTo(Float value) {
            addCriterion("depreciation_rate <>", value, "depreciationRate");
            return (Criteria) this;
        }

        public Criteria andDepreciationRateGreaterThan(Float value) {
            addCriterion("depreciation_rate >", value, "depreciationRate");
            return (Criteria) this;
        }

        public Criteria andDepreciationRateGreaterThanOrEqualTo(Float value) {
            addCriterion("depreciation_rate >=", value, "depreciationRate");
            return (Criteria) this;
        }

        public Criteria andDepreciationRateLessThan(Float value) {
            addCriterion("depreciation_rate <", value, "depreciationRate");
            return (Criteria) this;
        }

        public Criteria andDepreciationRateLessThanOrEqualTo(Float value) {
            addCriterion("depreciation_rate <=", value, "depreciationRate");
            return (Criteria) this;
        }

        public Criteria andDepreciationRateIn(List<Float> values) {
            addCriterion("depreciation_rate in", values, "depreciationRate");
            return (Criteria) this;
        }

        public Criteria andDepreciationRateNotIn(List<Float> values) {
            addCriterion("depreciation_rate not in", values, "depreciationRate");
            return (Criteria) this;
        }

        public Criteria andDepreciationRateBetween(Float value1, Float value2) {
            addCriterion("depreciation_rate between", value1, value2, "depreciationRate");
            return (Criteria) this;
        }

        public Criteria andDepreciationRateNotBetween(Float value1, Float value2) {
            addCriterion("depreciation_rate not between", value1, value2, "depreciationRate");
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
        
        public Criteria andModuleIsNull() {
            addCriterion("module is null");
            return (Criteria) this;
        }

        public Criteria andModuleIsNotNull() {
            addCriterion("module is not null");
            return (Criteria) this;
        }

        public Criteria andModuleEqualTo(Integer value) {
            addCriterion("module =", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotEqualTo(Integer value) {
            addCriterion("module <>", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThan(Integer value) {
            addCriterion("module >", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("module >=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThan(Integer value) {
            addCriterion("module <", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThanOrEqualTo(Integer value) {
            addCriterion("module <=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleIn(List<Integer> values) {
            addCriterion("module in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotIn(List<Integer> values) {
            addCriterion("module not in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleBetween(Integer value1, Integer value2) {
            addCriterion("module between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotBetween(Integer value1, Integer value2) {
            addCriterion("module not between", value1, value2, "module");
            return (Criteria) this;
        }
        
        public Criteria andGcImageIsNull() {
            addCriterion("gc_image is null");
            return (Criteria) this;
        }

        public Criteria andGcImageIsNotNull() {
            addCriterion("gc_image is not null");
            return (Criteria) this;
        }

        public Criteria andGcImageEqualTo(String value) {
            addCriterion("gc_image =", value, "gcImage");
            return (Criteria) this;
        }

        public Criteria andGcImageNotEqualTo(String value) {
            addCriterion("gc_image <>", value, "gcImage");
            return (Criteria) this;
        }

        public Criteria andGcImageGreaterThan(String value) {
            addCriterion("gc_image >", value, "gcImage");
            return (Criteria) this;
        }

        public Criteria andGcImageGreaterThanOrEqualTo(String value) {
            addCriterion("gc_image >=", value, "gcImage");
            return (Criteria) this;
        }

        public Criteria andGcImageLessThan(String value) {
            addCriterion("gc_image <", value, "gcImage");
            return (Criteria) this;
        }

        public Criteria andGcImageLessThanOrEqualTo(String value) {
            addCriterion("gc_image <=", value, "gcImage");
            return (Criteria) this;
        }

        public Criteria andGcImageLike(String value) {
            addCriterion("gc_image like", value, "gcImage");
            return (Criteria) this;
        }

        public Criteria andGcImageNotLike(String value) {
            addCriterion("gc_image not like", value, "gcImage");
            return (Criteria) this;
        }

        public Criteria andGcImageIn(List<String> values) {
            addCriterion("gc_image in", values, "gcImage");
            return (Criteria) this;
        }

        public Criteria andGcImageNotIn(List<String> values) {
            addCriterion("gc_image not in", values, "gcImage");
            return (Criteria) this;
        }

        public Criteria andGcImageBetween(String value1, String value2) {
            addCriterion("gc_image between", value1, value2, "gcImage");
            return (Criteria) this;
        }

        public Criteria andGcImageNotBetween(String value1, String value2) {
            addCriterion("gc_image not between", value1, value2, "gcImage");
            return (Criteria) this;
        }

    }

    /**
     * 描述:sy_goods_class表的实体类
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
     * sy_goods_class 2017-10-16
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