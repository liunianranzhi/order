package com.shanyuan.platform.ms.dao.union.entity;

import java.util.ArrayList;
import java.util.List;

public class SyUnionItemExample {
    /**
     * sy_union_item
     */
    protected String orderByClause;

    /**
     * sy_union_item
     */
    protected boolean distinct;

    /**
     * sy_union_item
     */
    protected List<Criteria> oredCriteria;

    public SyUnionItemExample() {
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
     * sy_union_item 2017-11-30
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

        public Criteria andUnionItemIdIsNull() {
            addCriterion("union_item_id is null");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdIsNotNull() {
            addCriterion("union_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdEqualTo(Integer value) {
            addCriterion("union_item_id =", value, "unionItemId");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdNotEqualTo(Integer value) {
            addCriterion("union_item_id <>", value, "unionItemId");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdGreaterThan(Integer value) {
            addCriterion("union_item_id >", value, "unionItemId");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("union_item_id >=", value, "unionItemId");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdLessThan(Integer value) {
            addCriterion("union_item_id <", value, "unionItemId");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("union_item_id <=", value, "unionItemId");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdIn(List<Integer> values) {
            addCriterion("union_item_id in", values, "unionItemId");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdNotIn(List<Integer> values) {
            addCriterion("union_item_id not in", values, "unionItemId");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdBetween(Integer value1, Integer value2) {
            addCriterion("union_item_id between", value1, value2, "unionItemId");
            return (Criteria) this;
        }

        public Criteria andUnionItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("union_item_id not between", value1, value2, "unionItemId");
            return (Criteria) this;
        }

        public Criteria andUnionItemNameIsNull() {
            addCriterion("union_item_name is null");
            return (Criteria) this;
        }

        public Criteria andUnionItemNameIsNotNull() {
            addCriterion("union_item_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnionItemNameEqualTo(String value) {
            addCriterion("union_item_name =", value, "unionItemName");
            return (Criteria) this;
        }

        public Criteria andUnionItemNameNotEqualTo(String value) {
            addCriterion("union_item_name <>", value, "unionItemName");
            return (Criteria) this;
        }

        public Criteria andUnionItemNameGreaterThan(String value) {
            addCriterion("union_item_name >", value, "unionItemName");
            return (Criteria) this;
        }

        public Criteria andUnionItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("union_item_name >=", value, "unionItemName");
            return (Criteria) this;
        }

        public Criteria andUnionItemNameLessThan(String value) {
            addCriterion("union_item_name <", value, "unionItemName");
            return (Criteria) this;
        }

        public Criteria andUnionItemNameLessThanOrEqualTo(String value) {
            addCriterion("union_item_name <=", value, "unionItemName");
            return (Criteria) this;
        }

        public Criteria andUnionItemNameLike(String value) {
            addCriterion("union_item_name like", value, "unionItemName");
            return (Criteria) this;
        }

        public Criteria andUnionItemNameNotLike(String value) {
            addCriterion("union_item_name not like", value, "unionItemName");
            return (Criteria) this;
        }

        public Criteria andUnionItemNameIn(List<String> values) {
            addCriterion("union_item_name in", values, "unionItemName");
            return (Criteria) this;
        }

        public Criteria andUnionItemNameNotIn(List<String> values) {
            addCriterion("union_item_name not in", values, "unionItemName");
            return (Criteria) this;
        }

        public Criteria andUnionItemNameBetween(String value1, String value2) {
            addCriterion("union_item_name between", value1, value2, "unionItemName");
            return (Criteria) this;
        }

        public Criteria andUnionItemNameNotBetween(String value1, String value2) {
            addCriterion("union_item_name not between", value1, value2, "unionItemName");
            return (Criteria) this;
        }

        public Criteria andUnionCodeIsNull() {
            addCriterion("union_code is null");
            return (Criteria) this;
        }

        public Criteria andUnionCodeIsNotNull() {
            addCriterion("union_code is not null");
            return (Criteria) this;
        }

        public Criteria andUnionCodeEqualTo(String value) {
            addCriterion("union_code =", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeNotEqualTo(String value) {
            addCriterion("union_code <>", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeGreaterThan(String value) {
            addCriterion("union_code >", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("union_code >=", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeLessThan(String value) {
            addCriterion("union_code <", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeLessThanOrEqualTo(String value) {
            addCriterion("union_code <=", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeLike(String value) {
            addCriterion("union_code like", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeNotLike(String value) {
            addCriterion("union_code not like", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeIn(List<String> values) {
            addCriterion("union_code in", values, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeNotIn(List<String> values) {
            addCriterion("union_code not in", values, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeBetween(String value1, String value2) {
            addCriterion("union_code between", value1, value2, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeNotBetween(String value1, String value2) {
            addCriterion("union_code not between", value1, value2, "unionCode");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdIsNull() {
            addCriterion("create_member_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdIsNotNull() {
            addCriterion("create_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdEqualTo(Integer value) {
            addCriterion("create_member_id =", value, "createMemberId");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdNotEqualTo(Integer value) {
            addCriterion("create_member_id <>", value, "createMemberId");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdGreaterThan(Integer value) {
            addCriterion("create_member_id >", value, "createMemberId");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_member_id >=", value, "createMemberId");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdLessThan(Integer value) {
            addCriterion("create_member_id <", value, "createMemberId");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_member_id <=", value, "createMemberId");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdIn(List<Integer> values) {
            addCriterion("create_member_id in", values, "createMemberId");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdNotIn(List<Integer> values) {
            addCriterion("create_member_id not in", values, "createMemberId");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("create_member_id between", value1, value2, "createMemberId");
            return (Criteria) this;
        }

        public Criteria andCreateMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_member_id not between", value1, value2, "createMemberId");
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

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCircleIdIsNull() {
            addCriterion("circle_id is null");
            return (Criteria) this;
        }

        public Criteria andCircleIdIsNotNull() {
            addCriterion("circle_id is not null");
            return (Criteria) this;
        }

        public Criteria andCircleIdEqualTo(Integer value) {
            addCriterion("circle_id =", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdNotEqualTo(Integer value) {
            addCriterion("circle_id <>", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdGreaterThan(Integer value) {
            addCriterion("circle_id >", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("circle_id >=", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdLessThan(Integer value) {
            addCriterion("circle_id <", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdLessThanOrEqualTo(Integer value) {
            addCriterion("circle_id <=", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdIn(List<Integer> values) {
            addCriterion("circle_id in", values, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdNotIn(List<Integer> values) {
            addCriterion("circle_id not in", values, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdBetween(Integer value1, Integer value2) {
            addCriterion("circle_id between", value1, value2, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("circle_id not between", value1, value2, "circleId");
            return (Criteria) this;
        }

        public Criteria andIndexTagIsNull() {
            addCriterion("index_tag is null");
            return (Criteria) this;
        }

        public Criteria andIndexTagIsNotNull() {
            addCriterion("index_tag is not null");
            return (Criteria) this;
        }

        public Criteria andIndexTagEqualTo(String value) {
            addCriterion("index_tag =", value, "indexTag");
            return (Criteria) this;
        }

        public Criteria andIndexTagNotEqualTo(String value) {
            addCriterion("index_tag <>", value, "indexTag");
            return (Criteria) this;
        }

        public Criteria andIndexTagGreaterThan(String value) {
            addCriterion("index_tag >", value, "indexTag");
            return (Criteria) this;
        }

        public Criteria andIndexTagGreaterThanOrEqualTo(String value) {
            addCriterion("index_tag >=", value, "indexTag");
            return (Criteria) this;
        }

        public Criteria andIndexTagLessThan(String value) {
            addCriterion("index_tag <", value, "indexTag");
            return (Criteria) this;
        }

        public Criteria andIndexTagLessThanOrEqualTo(String value) {
            addCriterion("index_tag <=", value, "indexTag");
            return (Criteria) this;
        }

        public Criteria andIndexTagLike(String value) {
            addCriterion("index_tag like", value, "indexTag");
            return (Criteria) this;
        }

        public Criteria andIndexTagNotLike(String value) {
            addCriterion("index_tag not like", value, "indexTag");
            return (Criteria) this;
        }

        public Criteria andIndexTagIn(List<String> values) {
            addCriterion("index_tag in", values, "indexTag");
            return (Criteria) this;
        }

        public Criteria andIndexTagNotIn(List<String> values) {
            addCriterion("index_tag not in", values, "indexTag");
            return (Criteria) this;
        }

        public Criteria andIndexTagBetween(String value1, String value2) {
            addCriterion("index_tag between", value1, value2, "indexTag");
            return (Criteria) this;
        }

        public Criteria andIndexTagNotBetween(String value1, String value2) {
            addCriterion("index_tag not between", value1, value2, "indexTag");
            return (Criteria) this;
        }

        public Criteria andShowpageTagIsNull() {
            addCriterion("showpage_tag is null");
            return (Criteria) this;
        }

        public Criteria andShowpageTagIsNotNull() {
            addCriterion("showpage_tag is not null");
            return (Criteria) this;
        }

        public Criteria andShowpageTagEqualTo(String value) {
            addCriterion("showpage_tag =", value, "showpageTag");
            return (Criteria) this;
        }

        public Criteria andShowpageTagNotEqualTo(String value) {
            addCriterion("showpage_tag <>", value, "showpageTag");
            return (Criteria) this;
        }

        public Criteria andShowpageTagGreaterThan(String value) {
            addCriterion("showpage_tag >", value, "showpageTag");
            return (Criteria) this;
        }

        public Criteria andShowpageTagGreaterThanOrEqualTo(String value) {
            addCriterion("showpage_tag >=", value, "showpageTag");
            return (Criteria) this;
        }

        public Criteria andShowpageTagLessThan(String value) {
            addCriterion("showpage_tag <", value, "showpageTag");
            return (Criteria) this;
        }

        public Criteria andShowpageTagLessThanOrEqualTo(String value) {
            addCriterion("showpage_tag <=", value, "showpageTag");
            return (Criteria) this;
        }

        public Criteria andShowpageTagLike(String value) {
            addCriterion("showpage_tag like", value, "showpageTag");
            return (Criteria) this;
        }

        public Criteria andShowpageTagNotLike(String value) {
            addCriterion("showpage_tag not like", value, "showpageTag");
            return (Criteria) this;
        }

        public Criteria andShowpageTagIn(List<String> values) {
            addCriterion("showpage_tag in", values, "showpageTag");
            return (Criteria) this;
        }

        public Criteria andShowpageTagNotIn(List<String> values) {
            addCriterion("showpage_tag not in", values, "showpageTag");
            return (Criteria) this;
        }

        public Criteria andShowpageTagBetween(String value1, String value2) {
            addCriterion("showpage_tag between", value1, value2, "showpageTag");
            return (Criteria) this;
        }

        public Criteria andShowpageTagNotBetween(String value1, String value2) {
            addCriterion("showpage_tag not between", value1, value2, "showpageTag");
            return (Criteria) this;
        }

        public Criteria andSortNumIsNull() {
            addCriterion("sort_num is null");
            return (Criteria) this;
        }

        public Criteria andSortNumIsNotNull() {
            addCriterion("sort_num is not null");
            return (Criteria) this;
        }

        public Criteria andSortNumEqualTo(Integer value) {
            addCriterion("sort_num =", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumNotEqualTo(Integer value) {
            addCriterion("sort_num <>", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumGreaterThan(Integer value) {
            addCriterion("sort_num >", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_num >=", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumLessThan(Integer value) {
            addCriterion("sort_num <", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumLessThanOrEqualTo(Integer value) {
            addCriterion("sort_num <=", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumIn(List<Integer> values) {
            addCriterion("sort_num in", values, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumNotIn(List<Integer> values) {
            addCriterion("sort_num not in", values, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumBetween(Integer value1, Integer value2) {
            addCriterion("sort_num between", value1, value2, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_num not between", value1, value2, "sortNum");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNull() {
            addCriterion("is_enabled is null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNotNull() {
            addCriterion("is_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledEqualTo(Byte value) {
            addCriterion("is_enabled =", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotEqualTo(Byte value) {
            addCriterion("is_enabled <>", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThan(Byte value) {
            addCriterion("is_enabled >", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_enabled >=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThan(Byte value) {
            addCriterion("is_enabled <", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThanOrEqualTo(Byte value) {
            addCriterion("is_enabled <=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIn(List<Byte> values) {
            addCriterion("is_enabled in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotIn(List<Byte> values) {
            addCriterion("is_enabled not in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledBetween(Byte value1, Byte value2) {
            addCriterion("is_enabled between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotBetween(Byte value1, Byte value2) {
            addCriterion("is_enabled not between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdIsNull() {
            addCriterion("update_member_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdIsNotNull() {
            addCriterion("update_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdEqualTo(Integer value) {
            addCriterion("update_member_id =", value, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdNotEqualTo(Integer value) {
            addCriterion("update_member_id <>", value, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdGreaterThan(Integer value) {
            addCriterion("update_member_id >", value, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_member_id >=", value, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdLessThan(Integer value) {
            addCriterion("update_member_id <", value, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("update_member_id <=", value, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdIn(List<Integer> values) {
            addCriterion("update_member_id in", values, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdNotIn(List<Integer> values) {
            addCriterion("update_member_id not in", values, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("update_member_id between", value1, value2, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("update_member_id not between", value1, value2, "updateMemberId");
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

        public Criteria andUpdateTimeEqualTo(Integer value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Integer value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Integer value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Integer value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Integer> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Integer> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Integer value1, Integer value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_union_item表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-11-30
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_union_item 2017-11-30
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