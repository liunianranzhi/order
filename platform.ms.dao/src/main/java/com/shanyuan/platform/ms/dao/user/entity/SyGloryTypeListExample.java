package com.shanyuan.platform.ms.dao.user.entity;

import java.util.ArrayList;
import java.util.List;

public class SyGloryTypeListExample {
    /**
     * sy_glory_type_list
     */
    protected String orderByClause;

    /**
     * sy_glory_type_list
     */
    protected boolean distinct;

    /**
     * sy_glory_type_list
     */
    protected List<Criteria> oredCriteria;

    public SyGloryTypeListExample() {
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
     * sy_glory_type_list 2017-10-18
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

        public Criteria andGloryIdIsNull() {
            addCriterion("glory_id is null");
            return (Criteria) this;
        }

        public Criteria andGloryIdIsNotNull() {
            addCriterion("glory_id is not null");
            return (Criteria) this;
        }

        public Criteria andGloryIdEqualTo(Integer value) {
            addCriterion("glory_id =", value, "gloryId");
            return (Criteria) this;
        }

        public Criteria andGloryIdNotEqualTo(Integer value) {
            addCriterion("glory_id <>", value, "gloryId");
            return (Criteria) this;
        }

        public Criteria andGloryIdGreaterThan(Integer value) {
            addCriterion("glory_id >", value, "gloryId");
            return (Criteria) this;
        }

        public Criteria andGloryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("glory_id >=", value, "gloryId");
            return (Criteria) this;
        }

        public Criteria andGloryIdLessThan(Integer value) {
            addCriterion("glory_id <", value, "gloryId");
            return (Criteria) this;
        }

        public Criteria andGloryIdLessThanOrEqualTo(Integer value) {
            addCriterion("glory_id <=", value, "gloryId");
            return (Criteria) this;
        }

        public Criteria andGloryIdIn(List<Integer> values) {
            addCriterion("glory_id in", values, "gloryId");
            return (Criteria) this;
        }

        public Criteria andGloryIdNotIn(List<Integer> values) {
            addCriterion("glory_id not in", values, "gloryId");
            return (Criteria) this;
        }

        public Criteria andGloryIdBetween(Integer value1, Integer value2) {
            addCriterion("glory_id between", value1, value2, "gloryId");
            return (Criteria) this;
        }

        public Criteria andGloryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("glory_id not between", value1, value2, "gloryId");
            return (Criteria) this;
        }

        public Criteria andGloryNameIsNull() {
            addCriterion("glory_name is null");
            return (Criteria) this;
        }

        public Criteria andGloryNameIsNotNull() {
            addCriterion("glory_name is not null");
            return (Criteria) this;
        }

        public Criteria andGloryNameEqualTo(String value) {
            addCriterion("glory_name =", value, "gloryName");
            return (Criteria) this;
        }

        public Criteria andGloryNameNotEqualTo(String value) {
            addCriterion("glory_name <>", value, "gloryName");
            return (Criteria) this;
        }

        public Criteria andGloryNameGreaterThan(String value) {
            addCriterion("glory_name >", value, "gloryName");
            return (Criteria) this;
        }

        public Criteria andGloryNameGreaterThanOrEqualTo(String value) {
            addCriterion("glory_name >=", value, "gloryName");
            return (Criteria) this;
        }

        public Criteria andGloryNameLessThan(String value) {
            addCriterion("glory_name <", value, "gloryName");
            return (Criteria) this;
        }

        public Criteria andGloryNameLessThanOrEqualTo(String value) {
            addCriterion("glory_name <=", value, "gloryName");
            return (Criteria) this;
        }

        public Criteria andGloryNameLike(String value) {
            addCriterion("glory_name like", value, "gloryName");
            return (Criteria) this;
        }

        public Criteria andGloryNameNotLike(String value) {
            addCriterion("glory_name not like", value, "gloryName");
            return (Criteria) this;
        }

        public Criteria andGloryNameIn(List<String> values) {
            addCriterion("glory_name in", values, "gloryName");
            return (Criteria) this;
        }

        public Criteria andGloryNameNotIn(List<String> values) {
            addCriterion("glory_name not in", values, "gloryName");
            return (Criteria) this;
        }

        public Criteria andGloryNameBetween(String value1, String value2) {
            addCriterion("glory_name between", value1, value2, "gloryName");
            return (Criteria) this;
        }

        public Criteria andGloryNameNotBetween(String value1, String value2) {
            addCriterion("glory_name not between", value1, value2, "gloryName");
            return (Criteria) this;
        }

        public Criteria andGloryCodeIsNull() {
            addCriterion("glory_code is null");
            return (Criteria) this;
        }

        public Criteria andGloryCodeIsNotNull() {
            addCriterion("glory_code is not null");
            return (Criteria) this;
        }

        public Criteria andGloryCodeEqualTo(String value) {
            addCriterion("glory_code =", value, "gloryCode");
            return (Criteria) this;
        }

        public Criteria andGloryCodeNotEqualTo(String value) {
            addCriterion("glory_code <>", value, "gloryCode");
            return (Criteria) this;
        }

        public Criteria andGloryCodeGreaterThan(String value) {
            addCriterion("glory_code >", value, "gloryCode");
            return (Criteria) this;
        }

        public Criteria andGloryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("glory_code >=", value, "gloryCode");
            return (Criteria) this;
        }

        public Criteria andGloryCodeLessThan(String value) {
            addCriterion("glory_code <", value, "gloryCode");
            return (Criteria) this;
        }

        public Criteria andGloryCodeLessThanOrEqualTo(String value) {
            addCriterion("glory_code <=", value, "gloryCode");
            return (Criteria) this;
        }

        public Criteria andGloryCodeLike(String value) {
            addCriterion("glory_code like", value, "gloryCode");
            return (Criteria) this;
        }

        public Criteria andGloryCodeNotLike(String value) {
            addCriterion("glory_code not like", value, "gloryCode");
            return (Criteria) this;
        }

        public Criteria andGloryCodeIn(List<String> values) {
            addCriterion("glory_code in", values, "gloryCode");
            return (Criteria) this;
        }

        public Criteria andGloryCodeNotIn(List<String> values) {
            addCriterion("glory_code not in", values, "gloryCode");
            return (Criteria) this;
        }

        public Criteria andGloryCodeBetween(String value1, String value2) {
            addCriterion("glory_code between", value1, value2, "gloryCode");
            return (Criteria) this;
        }

        public Criteria andGloryCodeNotBetween(String value1, String value2) {
            addCriterion("glory_code not between", value1, value2, "gloryCode");
            return (Criteria) this;
        }

        public Criteria andGloryShowIndexIsNull() {
            addCriterion("glory_show_index is null");
            return (Criteria) this;
        }

        public Criteria andGloryShowIndexIsNotNull() {
            addCriterion("glory_show_index is not null");
            return (Criteria) this;
        }

        public Criteria andGloryShowIndexEqualTo(Integer value) {
            addCriterion("glory_show_index =", value, "gloryShowIndex");
            return (Criteria) this;
        }

        public Criteria andGloryShowIndexNotEqualTo(Integer value) {
            addCriterion("glory_show_index <>", value, "gloryShowIndex");
            return (Criteria) this;
        }

        public Criteria andGloryShowIndexGreaterThan(Integer value) {
            addCriterion("glory_show_index >", value, "gloryShowIndex");
            return (Criteria) this;
        }

        public Criteria andGloryShowIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("glory_show_index >=", value, "gloryShowIndex");
            return (Criteria) this;
        }

        public Criteria andGloryShowIndexLessThan(Integer value) {
            addCriterion("glory_show_index <", value, "gloryShowIndex");
            return (Criteria) this;
        }

        public Criteria andGloryShowIndexLessThanOrEqualTo(Integer value) {
            addCriterion("glory_show_index <=", value, "gloryShowIndex");
            return (Criteria) this;
        }

        public Criteria andGloryShowIndexIn(List<Integer> values) {
            addCriterion("glory_show_index in", values, "gloryShowIndex");
            return (Criteria) this;
        }

        public Criteria andGloryShowIndexNotIn(List<Integer> values) {
            addCriterion("glory_show_index not in", values, "gloryShowIndex");
            return (Criteria) this;
        }

        public Criteria andGloryShowIndexBetween(Integer value1, Integer value2) {
            addCriterion("glory_show_index between", value1, value2, "gloryShowIndex");
            return (Criteria) this;
        }

        public Criteria andGloryShowIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("glory_show_index not between", value1, value2, "gloryShowIndex");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgHilightedIsNull() {
            addCriterion("glory_show_img_hilighted is null");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgHilightedIsNotNull() {
            addCriterion("glory_show_img_hilighted is not null");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgHilightedEqualTo(String value) {
            addCriterion("glory_show_img_hilighted =", value, "gloryShowImgHilighted");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgHilightedNotEqualTo(String value) {
            addCriterion("glory_show_img_hilighted <>", value, "gloryShowImgHilighted");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgHilightedGreaterThan(String value) {
            addCriterion("glory_show_img_hilighted >", value, "gloryShowImgHilighted");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgHilightedGreaterThanOrEqualTo(String value) {
            addCriterion("glory_show_img_hilighted >=", value, "gloryShowImgHilighted");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgHilightedLessThan(String value) {
            addCriterion("glory_show_img_hilighted <", value, "gloryShowImgHilighted");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgHilightedLessThanOrEqualTo(String value) {
            addCriterion("glory_show_img_hilighted <=", value, "gloryShowImgHilighted");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgHilightedLike(String value) {
            addCriterion("glory_show_img_hilighted like", value, "gloryShowImgHilighted");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgHilightedNotLike(String value) {
            addCriterion("glory_show_img_hilighted not like", value, "gloryShowImgHilighted");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgHilightedIn(List<String> values) {
            addCriterion("glory_show_img_hilighted in", values, "gloryShowImgHilighted");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgHilightedNotIn(List<String> values) {
            addCriterion("glory_show_img_hilighted not in", values, "gloryShowImgHilighted");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgHilightedBetween(String value1, String value2) {
            addCriterion("glory_show_img_hilighted between", value1, value2, "gloryShowImgHilighted");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgHilightedNotBetween(String value1, String value2) {
            addCriterion("glory_show_img_hilighted not between", value1, value2, "gloryShowImgHilighted");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgGaryIsNull() {
            addCriterion("glory_show_img_gary is null");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgGaryIsNotNull() {
            addCriterion("glory_show_img_gary is not null");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgGaryEqualTo(String value) {
            addCriterion("glory_show_img_gary =", value, "gloryShowImgGary");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgGaryNotEqualTo(String value) {
            addCriterion("glory_show_img_gary <>", value, "gloryShowImgGary");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgGaryGreaterThan(String value) {
            addCriterion("glory_show_img_gary >", value, "gloryShowImgGary");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgGaryGreaterThanOrEqualTo(String value) {
            addCriterion("glory_show_img_gary >=", value, "gloryShowImgGary");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgGaryLessThan(String value) {
            addCriterion("glory_show_img_gary <", value, "gloryShowImgGary");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgGaryLessThanOrEqualTo(String value) {
            addCriterion("glory_show_img_gary <=", value, "gloryShowImgGary");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgGaryLike(String value) {
            addCriterion("glory_show_img_gary like", value, "gloryShowImgGary");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgGaryNotLike(String value) {
            addCriterion("glory_show_img_gary not like", value, "gloryShowImgGary");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgGaryIn(List<String> values) {
            addCriterion("glory_show_img_gary in", values, "gloryShowImgGary");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgGaryNotIn(List<String> values) {
            addCriterion("glory_show_img_gary not in", values, "gloryShowImgGary");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgGaryBetween(String value1, String value2) {
            addCriterion("glory_show_img_gary between", value1, value2, "gloryShowImgGary");
            return (Criteria) this;
        }

        public Criteria andGloryShowImgGaryNotBetween(String value1, String value2) {
            addCriterion("glory_show_img_gary not between", value1, value2, "gloryShowImgGary");
            return (Criteria) this;
        }

        public Criteria andGloryDescriptionIsNull() {
            addCriterion("glory_description is null");
            return (Criteria) this;
        }

        public Criteria andGloryDescriptionIsNotNull() {
            addCriterion("glory_description is not null");
            return (Criteria) this;
        }

        public Criteria andGloryDescriptionEqualTo(String value) {
            addCriterion("glory_description =", value, "gloryDescription");
            return (Criteria) this;
        }

        public Criteria andGloryDescriptionNotEqualTo(String value) {
            addCriterion("glory_description <>", value, "gloryDescription");
            return (Criteria) this;
        }

        public Criteria andGloryDescriptionGreaterThan(String value) {
            addCriterion("glory_description >", value, "gloryDescription");
            return (Criteria) this;
        }

        public Criteria andGloryDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("glory_description >=", value, "gloryDescription");
            return (Criteria) this;
        }

        public Criteria andGloryDescriptionLessThan(String value) {
            addCriterion("glory_description <", value, "gloryDescription");
            return (Criteria) this;
        }

        public Criteria andGloryDescriptionLessThanOrEqualTo(String value) {
            addCriterion("glory_description <=", value, "gloryDescription");
            return (Criteria) this;
        }

        public Criteria andGloryDescriptionLike(String value) {
            addCriterion("glory_description like", value, "gloryDescription");
            return (Criteria) this;
        }

        public Criteria andGloryDescriptionNotLike(String value) {
            addCriterion("glory_description not like", value, "gloryDescription");
            return (Criteria) this;
        }

        public Criteria andGloryDescriptionIn(List<String> values) {
            addCriterion("glory_description in", values, "gloryDescription");
            return (Criteria) this;
        }

        public Criteria andGloryDescriptionNotIn(List<String> values) {
            addCriterion("glory_description not in", values, "gloryDescription");
            return (Criteria) this;
        }

        public Criteria andGloryDescriptionBetween(String value1, String value2) {
            addCriterion("glory_description between", value1, value2, "gloryDescription");
            return (Criteria) this;
        }

        public Criteria andGloryDescriptionNotBetween(String value1, String value2) {
            addCriterion("glory_description not between", value1, value2, "gloryDescription");
            return (Criteria) this;
        }

        public Criteria andChannelRangeIsNull() {
            addCriterion("channel_range is null");
            return (Criteria) this;
        }

        public Criteria andChannelRangeIsNotNull() {
            addCriterion("channel_range is not null");
            return (Criteria) this;
        }

        public Criteria andChannelRangeEqualTo(String value) {
            addCriterion("channel_range =", value, "channelRange");
            return (Criteria) this;
        }

        public Criteria andChannelRangeNotEqualTo(String value) {
            addCriterion("channel_range <>", value, "channelRange");
            return (Criteria) this;
        }

        public Criteria andChannelRangeGreaterThan(String value) {
            addCriterion("channel_range >", value, "channelRange");
            return (Criteria) this;
        }

        public Criteria andChannelRangeGreaterThanOrEqualTo(String value) {
            addCriterion("channel_range >=", value, "channelRange");
            return (Criteria) this;
        }

        public Criteria andChannelRangeLessThan(String value) {
            addCriterion("channel_range <", value, "channelRange");
            return (Criteria) this;
        }

        public Criteria andChannelRangeLessThanOrEqualTo(String value) {
            addCriterion("channel_range <=", value, "channelRange");
            return (Criteria) this;
        }

        public Criteria andChannelRangeLike(String value) {
            addCriterion("channel_range like", value, "channelRange");
            return (Criteria) this;
        }

        public Criteria andChannelRangeNotLike(String value) {
            addCriterion("channel_range not like", value, "channelRange");
            return (Criteria) this;
        }

        public Criteria andChannelRangeIn(List<String> values) {
            addCriterion("channel_range in", values, "channelRange");
            return (Criteria) this;
        }

        public Criteria andChannelRangeNotIn(List<String> values) {
            addCriterion("channel_range not in", values, "channelRange");
            return (Criteria) this;
        }

        public Criteria andChannelRangeBetween(String value1, String value2) {
            addCriterion("channel_range between", value1, value2, "channelRange");
            return (Criteria) this;
        }

        public Criteria andChannelRangeNotBetween(String value1, String value2) {
            addCriterion("channel_range not between", value1, value2, "channelRange");
            return (Criteria) this;
        }

        public Criteria andCustTypeRangeIsNull() {
            addCriterion("cust_type_range is null");
            return (Criteria) this;
        }

        public Criteria andCustTypeRangeIsNotNull() {
            addCriterion("cust_type_range is not null");
            return (Criteria) this;
        }

        public Criteria andCustTypeRangeEqualTo(String value) {
            addCriterion("cust_type_range =", value, "custTypeRange");
            return (Criteria) this;
        }

        public Criteria andCustTypeRangeNotEqualTo(String value) {
            addCriterion("cust_type_range <>", value, "custTypeRange");
            return (Criteria) this;
        }

        public Criteria andCustTypeRangeGreaterThan(String value) {
            addCriterion("cust_type_range >", value, "custTypeRange");
            return (Criteria) this;
        }

        public Criteria andCustTypeRangeGreaterThanOrEqualTo(String value) {
            addCriterion("cust_type_range >=", value, "custTypeRange");
            return (Criteria) this;
        }

        public Criteria andCustTypeRangeLessThan(String value) {
            addCriterion("cust_type_range <", value, "custTypeRange");
            return (Criteria) this;
        }

        public Criteria andCustTypeRangeLessThanOrEqualTo(String value) {
            addCriterion("cust_type_range <=", value, "custTypeRange");
            return (Criteria) this;
        }

        public Criteria andCustTypeRangeLike(String value) {
            addCriterion("cust_type_range like", value, "custTypeRange");
            return (Criteria) this;
        }

        public Criteria andCustTypeRangeNotLike(String value) {
            addCriterion("cust_type_range not like", value, "custTypeRange");
            return (Criteria) this;
        }

        public Criteria andCustTypeRangeIn(List<String> values) {
            addCriterion("cust_type_range in", values, "custTypeRange");
            return (Criteria) this;
        }

        public Criteria andCustTypeRangeNotIn(List<String> values) {
            addCriterion("cust_type_range not in", values, "custTypeRange");
            return (Criteria) this;
        }

        public Criteria andCustTypeRangeBetween(String value1, String value2) {
            addCriterion("cust_type_range between", value1, value2, "custTypeRange");
            return (Criteria) this;
        }

        public Criteria andCustTypeRangeNotBetween(String value1, String value2) {
            addCriterion("cust_type_range not between", value1, value2, "custTypeRange");
            return (Criteria) this;
        }

        public Criteria andExtraCondition1IsNull() {
            addCriterion("extra_condition1 is null");
            return (Criteria) this;
        }

        public Criteria andExtraCondition1IsNotNull() {
            addCriterion("extra_condition1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtraCondition1EqualTo(String value) {
            addCriterion("extra_condition1 =", value, "extraCondition1");
            return (Criteria) this;
        }

        public Criteria andExtraCondition1NotEqualTo(String value) {
            addCriterion("extra_condition1 <>", value, "extraCondition1");
            return (Criteria) this;
        }

        public Criteria andExtraCondition1GreaterThan(String value) {
            addCriterion("extra_condition1 >", value, "extraCondition1");
            return (Criteria) this;
        }

        public Criteria andExtraCondition1GreaterThanOrEqualTo(String value) {
            addCriterion("extra_condition1 >=", value, "extraCondition1");
            return (Criteria) this;
        }

        public Criteria andExtraCondition1LessThan(String value) {
            addCriterion("extra_condition1 <", value, "extraCondition1");
            return (Criteria) this;
        }

        public Criteria andExtraCondition1LessThanOrEqualTo(String value) {
            addCriterion("extra_condition1 <=", value, "extraCondition1");
            return (Criteria) this;
        }

        public Criteria andExtraCondition1Like(String value) {
            addCriterion("extra_condition1 like", value, "extraCondition1");
            return (Criteria) this;
        }

        public Criteria andExtraCondition1NotLike(String value) {
            addCriterion("extra_condition1 not like", value, "extraCondition1");
            return (Criteria) this;
        }

        public Criteria andExtraCondition1In(List<String> values) {
            addCriterion("extra_condition1 in", values, "extraCondition1");
            return (Criteria) this;
        }

        public Criteria andExtraCondition1NotIn(List<String> values) {
            addCriterion("extra_condition1 not in", values, "extraCondition1");
            return (Criteria) this;
        }

        public Criteria andExtraCondition1Between(String value1, String value2) {
            addCriterion("extra_condition1 between", value1, value2, "extraCondition1");
            return (Criteria) this;
        }

        public Criteria andExtraCondition1NotBetween(String value1, String value2) {
            addCriterion("extra_condition1 not between", value1, value2, "extraCondition1");
            return (Criteria) this;
        }

        public Criteria andExtraCondition2IsNull() {
            addCriterion("extra_condition2 is null");
            return (Criteria) this;
        }

        public Criteria andExtraCondition2IsNotNull() {
            addCriterion("extra_condition2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtraCondition2EqualTo(String value) {
            addCriterion("extra_condition2 =", value, "extraCondition2");
            return (Criteria) this;
        }

        public Criteria andExtraCondition2NotEqualTo(String value) {
            addCriterion("extra_condition2 <>", value, "extraCondition2");
            return (Criteria) this;
        }

        public Criteria andExtraCondition2GreaterThan(String value) {
            addCriterion("extra_condition2 >", value, "extraCondition2");
            return (Criteria) this;
        }

        public Criteria andExtraCondition2GreaterThanOrEqualTo(String value) {
            addCriterion("extra_condition2 >=", value, "extraCondition2");
            return (Criteria) this;
        }

        public Criteria andExtraCondition2LessThan(String value) {
            addCriterion("extra_condition2 <", value, "extraCondition2");
            return (Criteria) this;
        }

        public Criteria andExtraCondition2LessThanOrEqualTo(String value) {
            addCriterion("extra_condition2 <=", value, "extraCondition2");
            return (Criteria) this;
        }

        public Criteria andExtraCondition2Like(String value) {
            addCriterion("extra_condition2 like", value, "extraCondition2");
            return (Criteria) this;
        }

        public Criteria andExtraCondition2NotLike(String value) {
            addCriterion("extra_condition2 not like", value, "extraCondition2");
            return (Criteria) this;
        }

        public Criteria andExtraCondition2In(List<String> values) {
            addCriterion("extra_condition2 in", values, "extraCondition2");
            return (Criteria) this;
        }

        public Criteria andExtraCondition2NotIn(List<String> values) {
            addCriterion("extra_condition2 not in", values, "extraCondition2");
            return (Criteria) this;
        }

        public Criteria andExtraCondition2Between(String value1, String value2) {
            addCriterion("extra_condition2 between", value1, value2, "extraCondition2");
            return (Criteria) this;
        }

        public Criteria andExtraCondition2NotBetween(String value1, String value2) {
            addCriterion("extra_condition2 not between", value1, value2, "extraCondition2");
            return (Criteria) this;
        }

        public Criteria andOnlineStateIsNull() {
            addCriterion("online_state is null");
            return (Criteria) this;
        }

        public Criteria andOnlineStateIsNotNull() {
            addCriterion("online_state is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineStateEqualTo(Integer value) {
            addCriterion("online_state =", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateNotEqualTo(Integer value) {
            addCriterion("online_state <>", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateGreaterThan(Integer value) {
            addCriterion("online_state >", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("online_state >=", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateLessThan(Integer value) {
            addCriterion("online_state <", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateLessThanOrEqualTo(Integer value) {
            addCriterion("online_state <=", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateIn(List<Integer> values) {
            addCriterion("online_state in", values, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateNotIn(List<Integer> values) {
            addCriterion("online_state not in", values, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateBetween(Integer value1, Integer value2) {
            addCriterion("online_state between", value1, value2, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateNotBetween(Integer value1, Integer value2) {
            addCriterion("online_state not between", value1, value2, "onlineState");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_glory_type_list表的实体类
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
     * sy_glory_type_list 2017-10-18
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