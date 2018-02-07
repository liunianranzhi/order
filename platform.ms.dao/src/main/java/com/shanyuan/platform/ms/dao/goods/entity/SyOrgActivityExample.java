package com.shanyuan.platform.ms.dao.goods.entity;

import java.util.ArrayList;
import java.util.List;

public class SyOrgActivityExample {
    /**
     * sy_org_activity
     */
    protected String orderByClause;

    /**
     * sy_org_activity
     */
    protected boolean distinct;

    /**
     * sy_org_activity
     */
    protected List<Criteria> oredCriteria;

    public SyOrgActivityExample() {
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
     * sy_org_activity 2017-11-10
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

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityTitleIsNull() {
            addCriterion("activity_title is null");
            return (Criteria) this;
        }

        public Criteria andActivityTitleIsNotNull() {
            addCriterion("activity_title is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTitleEqualTo(String value) {
            addCriterion("activity_title =", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotEqualTo(String value) {
            addCriterion("activity_title <>", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleGreaterThan(String value) {
            addCriterion("activity_title >", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleGreaterThanOrEqualTo(String value) {
            addCriterion("activity_title >=", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleLessThan(String value) {
            addCriterion("activity_title <", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleLessThanOrEqualTo(String value) {
            addCriterion("activity_title <=", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleLike(String value) {
            addCriterion("activity_title like", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotLike(String value) {
            addCriterion("activity_title not like", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleIn(List<String> values) {
            addCriterion("activity_title in", values, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotIn(List<String> values) {
            addCriterion("activity_title not in", values, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleBetween(String value1, String value2) {
            addCriterion("activity_title between", value1, value2, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotBetween(String value1, String value2) {
            addCriterion("activity_title not between", value1, value2, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNull() {
            addCriterion("activity_type is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNotNull() {
            addCriterion("activity_type is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeEqualTo(String value) {
            addCriterion("activity_type =", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotEqualTo(String value) {
            addCriterion("activity_type <>", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThan(String value) {
            addCriterion("activity_type >", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_type >=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThan(String value) {
            addCriterion("activity_type <", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThanOrEqualTo(String value) {
            addCriterion("activity_type <=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLike(String value) {
            addCriterion("activity_type like", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotLike(String value) {
            addCriterion("activity_type not like", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIn(List<String> values) {
            addCriterion("activity_type in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotIn(List<String> values) {
            addCriterion("activity_type not in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeBetween(String value1, String value2) {
            addCriterion("activity_type between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotBetween(String value1, String value2) {
            addCriterion("activity_type not between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityBannerIsNull() {
            addCriterion("activity_banner is null");
            return (Criteria) this;
        }

        public Criteria andActivityBannerIsNotNull() {
            addCriterion("activity_banner is not null");
            return (Criteria) this;
        }

        public Criteria andActivityBannerEqualTo(String value) {
            addCriterion("activity_banner =", value, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerNotEqualTo(String value) {
            addCriterion("activity_banner <>", value, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerGreaterThan(String value) {
            addCriterion("activity_banner >", value, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerGreaterThanOrEqualTo(String value) {
            addCriterion("activity_banner >=", value, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerLessThan(String value) {
            addCriterion("activity_banner <", value, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerLessThanOrEqualTo(String value) {
            addCriterion("activity_banner <=", value, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerLike(String value) {
            addCriterion("activity_banner like", value, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerNotLike(String value) {
            addCriterion("activity_banner not like", value, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerIn(List<String> values) {
            addCriterion("activity_banner in", values, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerNotIn(List<String> values) {
            addCriterion("activity_banner not in", values, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerBetween(String value1, String value2) {
            addCriterion("activity_banner between", value1, value2, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerNotBetween(String value1, String value2) {
            addCriterion("activity_banner not between", value1, value2, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityAddtimeIsNull() {
            addCriterion("activity_addtime is null");
            return (Criteria) this;
        }

        public Criteria andActivityAddtimeIsNotNull() {
            addCriterion("activity_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andActivityAddtimeEqualTo(Integer value) {
            addCriterion("activity_addtime =", value, "activityAddtime");
            return (Criteria) this;
        }

        public Criteria andActivityAddtimeNotEqualTo(Integer value) {
            addCriterion("activity_addtime <>", value, "activityAddtime");
            return (Criteria) this;
        }

        public Criteria andActivityAddtimeGreaterThan(Integer value) {
            addCriterion("activity_addtime >", value, "activityAddtime");
            return (Criteria) this;
        }

        public Criteria andActivityAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_addtime >=", value, "activityAddtime");
            return (Criteria) this;
        }

        public Criteria andActivityAddtimeLessThan(Integer value) {
            addCriterion("activity_addtime <", value, "activityAddtime");
            return (Criteria) this;
        }

        public Criteria andActivityAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("activity_addtime <=", value, "activityAddtime");
            return (Criteria) this;
        }

        public Criteria andActivityAddtimeIn(List<Integer> values) {
            addCriterion("activity_addtime in", values, "activityAddtime");
            return (Criteria) this;
        }

        public Criteria andActivityAddtimeNotIn(List<Integer> values) {
            addCriterion("activity_addtime not in", values, "activityAddtime");
            return (Criteria) this;
        }

        public Criteria andActivityAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("activity_addtime between", value1, value2, "activityAddtime");
            return (Criteria) this;
        }

        public Criteria andActivityAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_addtime not between", value1, value2, "activityAddtime");
            return (Criteria) this;
        }

        public Criteria andActivityEdittimeIsNull() {
            addCriterion("activity_edittime is null");
            return (Criteria) this;
        }

        public Criteria andActivityEdittimeIsNotNull() {
            addCriterion("activity_edittime is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEdittimeEqualTo(Integer value) {
            addCriterion("activity_edittime =", value, "activityEdittime");
            return (Criteria) this;
        }

        public Criteria andActivityEdittimeNotEqualTo(Integer value) {
            addCriterion("activity_edittime <>", value, "activityEdittime");
            return (Criteria) this;
        }

        public Criteria andActivityEdittimeGreaterThan(Integer value) {
            addCriterion("activity_edittime >", value, "activityEdittime");
            return (Criteria) this;
        }

        public Criteria andActivityEdittimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_edittime >=", value, "activityEdittime");
            return (Criteria) this;
        }

        public Criteria andActivityEdittimeLessThan(Integer value) {
            addCriterion("activity_edittime <", value, "activityEdittime");
            return (Criteria) this;
        }

        public Criteria andActivityEdittimeLessThanOrEqualTo(Integer value) {
            addCriterion("activity_edittime <=", value, "activityEdittime");
            return (Criteria) this;
        }

        public Criteria andActivityEdittimeIn(List<Integer> values) {
            addCriterion("activity_edittime in", values, "activityEdittime");
            return (Criteria) this;
        }

        public Criteria andActivityEdittimeNotIn(List<Integer> values) {
            addCriterion("activity_edittime not in", values, "activityEdittime");
            return (Criteria) this;
        }

        public Criteria andActivityEdittimeBetween(Integer value1, Integer value2) {
            addCriterion("activity_edittime between", value1, value2, "activityEdittime");
            return (Criteria) this;
        }

        public Criteria andActivityEdittimeNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_edittime not between", value1, value2, "activityEdittime");
            return (Criteria) this;
        }

        public Criteria andActivitySortIsNull() {
            addCriterion("activity_sort is null");
            return (Criteria) this;
        }

        public Criteria andActivitySortIsNotNull() {
            addCriterion("activity_sort is not null");
            return (Criteria) this;
        }

        public Criteria andActivitySortEqualTo(Integer value) {
            addCriterion("activity_sort =", value, "activitySort");
            return (Criteria) this;
        }

        public Criteria andActivitySortNotEqualTo(Integer value) {
            addCriterion("activity_sort <>", value, "activitySort");
            return (Criteria) this;
        }

        public Criteria andActivitySortGreaterThan(Integer value) {
            addCriterion("activity_sort >", value, "activitySort");
            return (Criteria) this;
        }

        public Criteria andActivitySortGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_sort >=", value, "activitySort");
            return (Criteria) this;
        }

        public Criteria andActivitySortLessThan(Integer value) {
            addCriterion("activity_sort <", value, "activitySort");
            return (Criteria) this;
        }

        public Criteria andActivitySortLessThanOrEqualTo(Integer value) {
            addCriterion("activity_sort <=", value, "activitySort");
            return (Criteria) this;
        }

        public Criteria andActivitySortIn(List<Integer> values) {
            addCriterion("activity_sort in", values, "activitySort");
            return (Criteria) this;
        }

        public Criteria andActivitySortNotIn(List<Integer> values) {
            addCriterion("activity_sort not in", values, "activitySort");
            return (Criteria) this;
        }

        public Criteria andActivitySortBetween(Integer value1, Integer value2) {
            addCriterion("activity_sort between", value1, value2, "activitySort");
            return (Criteria) this;
        }

        public Criteria andActivitySortNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_sort not between", value1, value2, "activitySort");
            return (Criteria) this;
        }

        public Criteria andActivityStateIsNull() {
            addCriterion("activity_state is null");
            return (Criteria) this;
        }

        public Criteria andActivityStateIsNotNull() {
            addCriterion("activity_state is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStateEqualTo(Byte value) {
            addCriterion("activity_state =", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateNotEqualTo(Byte value) {
            addCriterion("activity_state <>", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateGreaterThan(Byte value) {
            addCriterion("activity_state >", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("activity_state >=", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateLessThan(Byte value) {
            addCriterion("activity_state <", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateLessThanOrEqualTo(Byte value) {
            addCriterion("activity_state <=", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateIn(List<Byte> values) {
            addCriterion("activity_state in", values, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateNotIn(List<Byte> values) {
            addCriterion("activity_state not in", values, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateBetween(Byte value1, Byte value2) {
            addCriterion("activity_state between", value1, value2, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateNotBetween(Byte value1, Byte value2) {
            addCriterion("activity_state not between", value1, value2, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityOwnerIdIsNull() {
            addCriterion("activity_owner_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityOwnerIdIsNotNull() {
            addCriterion("activity_owner_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityOwnerIdEqualTo(Integer value) {
            addCriterion("activity_owner_id =", value, "activityOwnerId");
            return (Criteria) this;
        }

        public Criteria andActivityOwnerIdNotEqualTo(Integer value) {
            addCriterion("activity_owner_id <>", value, "activityOwnerId");
            return (Criteria) this;
        }

        public Criteria andActivityOwnerIdGreaterThan(Integer value) {
            addCriterion("activity_owner_id >", value, "activityOwnerId");
            return (Criteria) this;
        }

        public Criteria andActivityOwnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_owner_id >=", value, "activityOwnerId");
            return (Criteria) this;
        }

        public Criteria andActivityOwnerIdLessThan(Integer value) {
            addCriterion("activity_owner_id <", value, "activityOwnerId");
            return (Criteria) this;
        }

        public Criteria andActivityOwnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_owner_id <=", value, "activityOwnerId");
            return (Criteria) this;
        }

        public Criteria andActivityOwnerIdIn(List<Integer> values) {
            addCriterion("activity_owner_id in", values, "activityOwnerId");
            return (Criteria) this;
        }

        public Criteria andActivityOwnerIdNotIn(List<Integer> values) {
            addCriterion("activity_owner_id not in", values, "activityOwnerId");
            return (Criteria) this;
        }

        public Criteria andActivityOwnerIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_owner_id between", value1, value2, "activityOwnerId");
            return (Criteria) this;
        }

        public Criteria andActivityOwnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_owner_id not between", value1, value2, "activityOwnerId");
            return (Criteria) this;
        }

        public Criteria andParentActivityIdIsNull() {
            addCriterion("parent_activity_id is null");
            return (Criteria) this;
        }

        public Criteria andParentActivityIdIsNotNull() {
            addCriterion("parent_activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentActivityIdEqualTo(Integer value) {
            addCriterion("parent_activity_id =", value, "parentActivityId");
            return (Criteria) this;
        }

        public Criteria andParentActivityIdNotEqualTo(Integer value) {
            addCriterion("parent_activity_id <>", value, "parentActivityId");
            return (Criteria) this;
        }

        public Criteria andParentActivityIdGreaterThan(Integer value) {
            addCriterion("parent_activity_id >", value, "parentActivityId");
            return (Criteria) this;
        }

        public Criteria andParentActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_activity_id >=", value, "parentActivityId");
            return (Criteria) this;
        }

        public Criteria andParentActivityIdLessThan(Integer value) {
            addCriterion("parent_activity_id <", value, "parentActivityId");
            return (Criteria) this;
        }

        public Criteria andParentActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_activity_id <=", value, "parentActivityId");
            return (Criteria) this;
        }

        public Criteria andParentActivityIdIn(List<Integer> values) {
            addCriterion("parent_activity_id in", values, "parentActivityId");
            return (Criteria) this;
        }

        public Criteria andParentActivityIdNotIn(List<Integer> values) {
            addCriterion("parent_activity_id not in", values, "parentActivityId");
            return (Criteria) this;
        }

        public Criteria andParentActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_activity_id between", value1, value2, "parentActivityId");
            return (Criteria) this;
        }

        public Criteria andParentActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_activity_id not between", value1, value2, "parentActivityId");
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

        public Criteria andActivityIntroIsNull() {
            addCriterion("activity_intro is null");
            return (Criteria) this;
        }

        public Criteria andActivityIntroIsNotNull() {
            addCriterion("activity_intro is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIntroEqualTo(String value) {
            addCriterion("activity_intro =", value, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroNotEqualTo(String value) {
            addCriterion("activity_intro <>", value, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroGreaterThan(String value) {
            addCriterion("activity_intro >", value, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroGreaterThanOrEqualTo(String value) {
            addCriterion("activity_intro >=", value, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroLessThan(String value) {
            addCriterion("activity_intro <", value, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroLessThanOrEqualTo(String value) {
            addCriterion("activity_intro <=", value, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroLike(String value) {
            addCriterion("activity_intro like", value, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroNotLike(String value) {
            addCriterion("activity_intro not like", value, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroIn(List<String> values) {
            addCriterion("activity_intro in", values, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroNotIn(List<String> values) {
            addCriterion("activity_intro not in", values, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroBetween(String value1, String value2) {
            addCriterion("activity_intro between", value1, value2, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroNotBetween(String value1, String value2) {
            addCriterion("activity_intro not between", value1, value2, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityTemplateIsNull() {
            addCriterion("activity_template is null");
            return (Criteria) this;
        }

        public Criteria andActivityTemplateIsNotNull() {
            addCriterion("activity_template is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTemplateEqualTo(String value) {
            addCriterion("activity_template =", value, "activityTemplate");
            return (Criteria) this;
        }

        public Criteria andActivityTemplateNotEqualTo(String value) {
            addCriterion("activity_template <>", value, "activityTemplate");
            return (Criteria) this;
        }

        public Criteria andActivityTemplateGreaterThan(String value) {
            addCriterion("activity_template >", value, "activityTemplate");
            return (Criteria) this;
        }

        public Criteria andActivityTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("activity_template >=", value, "activityTemplate");
            return (Criteria) this;
        }

        public Criteria andActivityTemplateLessThan(String value) {
            addCriterion("activity_template <", value, "activityTemplate");
            return (Criteria) this;
        }

        public Criteria andActivityTemplateLessThanOrEqualTo(String value) {
            addCriterion("activity_template <=", value, "activityTemplate");
            return (Criteria) this;
        }

        public Criteria andActivityTemplateLike(String value) {
            addCriterion("activity_template like", value, "activityTemplate");
            return (Criteria) this;
        }

        public Criteria andActivityTemplateNotLike(String value) {
            addCriterion("activity_template not like", value, "activityTemplate");
            return (Criteria) this;
        }

        public Criteria andActivityTemplateIn(List<String> values) {
            addCriterion("activity_template in", values, "activityTemplate");
            return (Criteria) this;
        }

        public Criteria andActivityTemplateNotIn(List<String> values) {
            addCriterion("activity_template not in", values, "activityTemplate");
            return (Criteria) this;
        }

        public Criteria andActivityTemplateBetween(String value1, String value2) {
            addCriterion("activity_template between", value1, value2, "activityTemplate");
            return (Criteria) this;
        }

        public Criteria andActivityTemplateNotBetween(String value1, String value2) {
            addCriterion("activity_template not between", value1, value2, "activityTemplate");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_org_activity表的实体类
     * @version
     * @author:  caoyongjun
     * @创建时间: 2017-11-10
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_org_activity 2017-11-10
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