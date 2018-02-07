package com.shanyuan.platform.ms.dao.project.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyProjectExample {
    /**
     * sy_project
     */
    protected String orderByClause;

    /**
     * sy_project
     */
    protected boolean distinct;

    /**
     * sy_project
     */
    protected List<Criteria> oredCriteria;

    public SyProjectExample() {
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
     * sy_project 2017-10-18
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

        public Criteria andProjIdIsNull() {
            addCriterion("proj_id is null");
            return (Criteria) this;
        }

        public Criteria andProjIdIsNotNull() {
            addCriterion("proj_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjIdEqualTo(Integer value) {
            addCriterion("proj_id =", value, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdNotEqualTo(Integer value) {
            addCriterion("proj_id <>", value, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdGreaterThan(Integer value) {
            addCriterion("proj_id >", value, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("proj_id >=", value, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdLessThan(Integer value) {
            addCriterion("proj_id <", value, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdLessThanOrEqualTo(Integer value) {
            addCriterion("proj_id <=", value, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdIn(List<Integer> values) {
            addCriterion("proj_id in", values, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdNotIn(List<Integer> values) {
            addCriterion("proj_id not in", values, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdBetween(Integer value1, Integer value2) {
            addCriterion("proj_id between", value1, value2, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdNotBetween(Integer value1, Integer value2) {
            addCriterion("proj_id not between", value1, value2, "projId");
            return (Criteria) this;
        }

        public Criteria andProjTitleIsNull() {
            addCriterion("proj_title is null");
            return (Criteria) this;
        }

        public Criteria andProjTitleIsNotNull() {
            addCriterion("proj_title is not null");
            return (Criteria) this;
        }

        public Criteria andProjTitleEqualTo(String value) {
            addCriterion("proj_title =", value, "projTitle");
            return (Criteria) this;
        }

        public Criteria andProjTitleNotEqualTo(String value) {
            addCriterion("proj_title <>", value, "projTitle");
            return (Criteria) this;
        }

        public Criteria andProjTitleGreaterThan(String value) {
            addCriterion("proj_title >", value, "projTitle");
            return (Criteria) this;
        }

        public Criteria andProjTitleGreaterThanOrEqualTo(String value) {
            addCriterion("proj_title >=", value, "projTitle");
            return (Criteria) this;
        }

        public Criteria andProjTitleLessThan(String value) {
            addCriterion("proj_title <", value, "projTitle");
            return (Criteria) this;
        }

        public Criteria andProjTitleLessThanOrEqualTo(String value) {
            addCriterion("proj_title <=", value, "projTitle");
            return (Criteria) this;
        }

        public Criteria andProjTitleLike(String value) {
            addCriterion("proj_title like", value, "projTitle");
            return (Criteria) this;
        }

        public Criteria andProjTitleNotLike(String value) {
            addCriterion("proj_title not like", value, "projTitle");
            return (Criteria) this;
        }

        public Criteria andProjTitleIn(List<String> values) {
            addCriterion("proj_title in", values, "projTitle");
            return (Criteria) this;
        }

        public Criteria andProjTitleNotIn(List<String> values) {
            addCriterion("proj_title not in", values, "projTitle");
            return (Criteria) this;
        }

        public Criteria andProjTitleBetween(String value1, String value2) {
            addCriterion("proj_title between", value1, value2, "projTitle");
            return (Criteria) this;
        }

        public Criteria andProjTitleNotBetween(String value1, String value2) {
            addCriterion("proj_title not between", value1, value2, "projTitle");
            return (Criteria) this;
        }

        public Criteria andProjIntroIsNull() {
            addCriterion("proj_intro is null");
            return (Criteria) this;
        }

        public Criteria andProjIntroIsNotNull() {
            addCriterion("proj_intro is not null");
            return (Criteria) this;
        }

        public Criteria andProjIntroEqualTo(String value) {
            addCriterion("proj_intro =", value, "projIntro");
            return (Criteria) this;
        }

        public Criteria andProjIntroNotEqualTo(String value) {
            addCriterion("proj_intro <>", value, "projIntro");
            return (Criteria) this;
        }

        public Criteria andProjIntroGreaterThan(String value) {
            addCriterion("proj_intro >", value, "projIntro");
            return (Criteria) this;
        }

        public Criteria andProjIntroGreaterThanOrEqualTo(String value) {
            addCriterion("proj_intro >=", value, "projIntro");
            return (Criteria) this;
        }

        public Criteria andProjIntroLessThan(String value) {
            addCriterion("proj_intro <", value, "projIntro");
            return (Criteria) this;
        }

        public Criteria andProjIntroLessThanOrEqualTo(String value) {
            addCriterion("proj_intro <=", value, "projIntro");
            return (Criteria) this;
        }

        public Criteria andProjIntroLike(String value) {
            addCriterion("proj_intro like", value, "projIntro");
            return (Criteria) this;
        }

        public Criteria andProjIntroNotLike(String value) {
            addCriterion("proj_intro not like", value, "projIntro");
            return (Criteria) this;
        }

        public Criteria andProjIntroIn(List<String> values) {
            addCriterion("proj_intro in", values, "projIntro");
            return (Criteria) this;
        }

        public Criteria andProjIntroNotIn(List<String> values) {
            addCriterion("proj_intro not in", values, "projIntro");
            return (Criteria) this;
        }

        public Criteria andProjIntroBetween(String value1, String value2) {
            addCriterion("proj_intro between", value1, value2, "projIntro");
            return (Criteria) this;
        }

        public Criteria andProjIntroNotBetween(String value1, String value2) {
            addCriterion("proj_intro not between", value1, value2, "projIntro");
            return (Criteria) this;
        }

        public Criteria andProjUrlIsNull() {
            addCriterion("proj_url is null");
            return (Criteria) this;
        }

        public Criteria andProjUrlIsNotNull() {
            addCriterion("proj_url is not null");
            return (Criteria) this;
        }

        public Criteria andProjUrlEqualTo(String value) {
            addCriterion("proj_url =", value, "projUrl");
            return (Criteria) this;
        }

        public Criteria andProjUrlNotEqualTo(String value) {
            addCriterion("proj_url <>", value, "projUrl");
            return (Criteria) this;
        }

        public Criteria andProjUrlGreaterThan(String value) {
            addCriterion("proj_url >", value, "projUrl");
            return (Criteria) this;
        }

        public Criteria andProjUrlGreaterThanOrEqualTo(String value) {
            addCriterion("proj_url >=", value, "projUrl");
            return (Criteria) this;
        }

        public Criteria andProjUrlLessThan(String value) {
            addCriterion("proj_url <", value, "projUrl");
            return (Criteria) this;
        }

        public Criteria andProjUrlLessThanOrEqualTo(String value) {
            addCriterion("proj_url <=", value, "projUrl");
            return (Criteria) this;
        }

        public Criteria andProjUrlLike(String value) {
            addCriterion("proj_url like", value, "projUrl");
            return (Criteria) this;
        }

        public Criteria andProjUrlNotLike(String value) {
            addCriterion("proj_url not like", value, "projUrl");
            return (Criteria) this;
        }

        public Criteria andProjUrlIn(List<String> values) {
            addCriterion("proj_url in", values, "projUrl");
            return (Criteria) this;
        }

        public Criteria andProjUrlNotIn(List<String> values) {
            addCriterion("proj_url not in", values, "projUrl");
            return (Criteria) this;
        }

        public Criteria andProjUrlBetween(String value1, String value2) {
            addCriterion("proj_url between", value1, value2, "projUrl");
            return (Criteria) this;
        }

        public Criteria andProjUrlNotBetween(String value1, String value2) {
            addCriterion("proj_url not between", value1, value2, "projUrl");
            return (Criteria) this;
        }

        public Criteria andProjImageIsNull() {
            addCriterion("proj_image is null");
            return (Criteria) this;
        }

        public Criteria andProjImageIsNotNull() {
            addCriterion("proj_image is not null");
            return (Criteria) this;
        }

        public Criteria andProjImageEqualTo(String value) {
            addCriterion("proj_image =", value, "projImage");
            return (Criteria) this;
        }

        public Criteria andProjImageNotEqualTo(String value) {
            addCriterion("proj_image <>", value, "projImage");
            return (Criteria) this;
        }

        public Criteria andProjImageGreaterThan(String value) {
            addCriterion("proj_image >", value, "projImage");
            return (Criteria) this;
        }

        public Criteria andProjImageGreaterThanOrEqualTo(String value) {
            addCriterion("proj_image >=", value, "projImage");
            return (Criteria) this;
        }

        public Criteria andProjImageLessThan(String value) {
            addCriterion("proj_image <", value, "projImage");
            return (Criteria) this;
        }

        public Criteria andProjImageLessThanOrEqualTo(String value) {
            addCriterion("proj_image <=", value, "projImage");
            return (Criteria) this;
        }

        public Criteria andProjImageLike(String value) {
            addCriterion("proj_image like", value, "projImage");
            return (Criteria) this;
        }

        public Criteria andProjImageNotLike(String value) {
            addCriterion("proj_image not like", value, "projImage");
            return (Criteria) this;
        }

        public Criteria andProjImageIn(List<String> values) {
            addCriterion("proj_image in", values, "projImage");
            return (Criteria) this;
        }

        public Criteria andProjImageNotIn(List<String> values) {
            addCriterion("proj_image not in", values, "projImage");
            return (Criteria) this;
        }

        public Criteria andProjImageBetween(String value1, String value2) {
            addCriterion("proj_image between", value1, value2, "projImage");
            return (Criteria) this;
        }

        public Criteria andProjImageNotBetween(String value1, String value2) {
            addCriterion("proj_image not between", value1, value2, "projImage");
            return (Criteria) this;
        }

        public Criteria andProjSponsorIsNull() {
            addCriterion("proj_sponsor is null");
            return (Criteria) this;
        }

        public Criteria andProjSponsorIsNotNull() {
            addCriterion("proj_sponsor is not null");
            return (Criteria) this;
        }

        public Criteria andProjSponsorEqualTo(String value) {
            addCriterion("proj_sponsor =", value, "projSponsor");
            return (Criteria) this;
        }

        public Criteria andProjSponsorNotEqualTo(String value) {
            addCriterion("proj_sponsor <>", value, "projSponsor");
            return (Criteria) this;
        }

        public Criteria andProjSponsorGreaterThan(String value) {
            addCriterion("proj_sponsor >", value, "projSponsor");
            return (Criteria) this;
        }

        public Criteria andProjSponsorGreaterThanOrEqualTo(String value) {
            addCriterion("proj_sponsor >=", value, "projSponsor");
            return (Criteria) this;
        }

        public Criteria andProjSponsorLessThan(String value) {
            addCriterion("proj_sponsor <", value, "projSponsor");
            return (Criteria) this;
        }

        public Criteria andProjSponsorLessThanOrEqualTo(String value) {
            addCriterion("proj_sponsor <=", value, "projSponsor");
            return (Criteria) this;
        }

        public Criteria andProjSponsorLike(String value) {
            addCriterion("proj_sponsor like", value, "projSponsor");
            return (Criteria) this;
        }

        public Criteria andProjSponsorNotLike(String value) {
            addCriterion("proj_sponsor not like", value, "projSponsor");
            return (Criteria) this;
        }

        public Criteria andProjSponsorIn(List<String> values) {
            addCriterion("proj_sponsor in", values, "projSponsor");
            return (Criteria) this;
        }

        public Criteria andProjSponsorNotIn(List<String> values) {
            addCriterion("proj_sponsor not in", values, "projSponsor");
            return (Criteria) this;
        }

        public Criteria andProjSponsorBetween(String value1, String value2) {
            addCriterion("proj_sponsor between", value1, value2, "projSponsor");
            return (Criteria) this;
        }

        public Criteria andProjSponsorNotBetween(String value1, String value2) {
            addCriterion("proj_sponsor not between", value1, value2, "projSponsor");
            return (Criteria) this;
        }

        public Criteria andProjSponsorIntroIsNull() {
            addCriterion("proj_sponsor_intro is null");
            return (Criteria) this;
        }

        public Criteria andProjSponsorIntroIsNotNull() {
            addCriterion("proj_sponsor_intro is not null");
            return (Criteria) this;
        }

        public Criteria andProjSponsorIntroEqualTo(String value) {
            addCriterion("proj_sponsor_intro =", value, "projSponsorIntro");
            return (Criteria) this;
        }

        public Criteria andProjSponsorIntroNotEqualTo(String value) {
            addCriterion("proj_sponsor_intro <>", value, "projSponsorIntro");
            return (Criteria) this;
        }

        public Criteria andProjSponsorIntroGreaterThan(String value) {
            addCriterion("proj_sponsor_intro >", value, "projSponsorIntro");
            return (Criteria) this;
        }

        public Criteria andProjSponsorIntroGreaterThanOrEqualTo(String value) {
            addCriterion("proj_sponsor_intro >=", value, "projSponsorIntro");
            return (Criteria) this;
        }

        public Criteria andProjSponsorIntroLessThan(String value) {
            addCriterion("proj_sponsor_intro <", value, "projSponsorIntro");
            return (Criteria) this;
        }

        public Criteria andProjSponsorIntroLessThanOrEqualTo(String value) {
            addCriterion("proj_sponsor_intro <=", value, "projSponsorIntro");
            return (Criteria) this;
        }

        public Criteria andProjSponsorIntroLike(String value) {
            addCriterion("proj_sponsor_intro like", value, "projSponsorIntro");
            return (Criteria) this;
        }

        public Criteria andProjSponsorIntroNotLike(String value) {
            addCriterion("proj_sponsor_intro not like", value, "projSponsorIntro");
            return (Criteria) this;
        }

        public Criteria andProjSponsorIntroIn(List<String> values) {
            addCriterion("proj_sponsor_intro in", values, "projSponsorIntro");
            return (Criteria) this;
        }

        public Criteria andProjSponsorIntroNotIn(List<String> values) {
            addCriterion("proj_sponsor_intro not in", values, "projSponsorIntro");
            return (Criteria) this;
        }

        public Criteria andProjSponsorIntroBetween(String value1, String value2) {
            addCriterion("proj_sponsor_intro between", value1, value2, "projSponsorIntro");
            return (Criteria) this;
        }

        public Criteria andProjSponsorIntroNotBetween(String value1, String value2) {
            addCriterion("proj_sponsor_intro not between", value1, value2, "projSponsorIntro");
            return (Criteria) this;
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

        public Criteria andTargetSybIsNull() {
            addCriterion("target_syb is null");
            return (Criteria) this;
        }

        public Criteria andTargetSybIsNotNull() {
            addCriterion("target_syb is not null");
            return (Criteria) this;
        }

        public Criteria andTargetSybEqualTo(Integer value) {
            addCriterion("target_syb =", value, "targetSyb");
            return (Criteria) this;
        }

        public Criteria andTargetSybNotEqualTo(Integer value) {
            addCriterion("target_syb <>", value, "targetSyb");
            return (Criteria) this;
        }

        public Criteria andTargetSybGreaterThan(Integer value) {
            addCriterion("target_syb >", value, "targetSyb");
            return (Criteria) this;
        }

        public Criteria andTargetSybGreaterThanOrEqualTo(Integer value) {
            addCriterion("target_syb >=", value, "targetSyb");
            return (Criteria) this;
        }

        public Criteria andTargetSybLessThan(Integer value) {
            addCriterion("target_syb <", value, "targetSyb");
            return (Criteria) this;
        }

        public Criteria andTargetSybLessThanOrEqualTo(Integer value) {
            addCriterion("target_syb <=", value, "targetSyb");
            return (Criteria) this;
        }

        public Criteria andTargetSybIn(List<Integer> values) {
            addCriterion("target_syb in", values, "targetSyb");
            return (Criteria) this;
        }

        public Criteria andTargetSybNotIn(List<Integer> values) {
            addCriterion("target_syb not in", values, "targetSyb");
            return (Criteria) this;
        }

        public Criteria andTargetSybBetween(Integer value1, Integer value2) {
            addCriterion("target_syb between", value1, value2, "targetSyb");
            return (Criteria) this;
        }

        public Criteria andTargetSybNotBetween(Integer value1, Integer value2) {
            addCriterion("target_syb not between", value1, value2, "targetSyb");
            return (Criteria) this;
        }

        public Criteria andProjTypeIsNull() {
            addCriterion("proj_type is null");
            return (Criteria) this;
        }

        public Criteria andProjTypeIsNotNull() {
            addCriterion("proj_type is not null");
            return (Criteria) this;
        }

        public Criteria andProjTypeEqualTo(String value) {
            addCriterion("proj_type =", value, "projType");
            return (Criteria) this;
        }

        public Criteria andProjTypeNotEqualTo(String value) {
            addCriterion("proj_type <>", value, "projType");
            return (Criteria) this;
        }

        public Criteria andProjTypeGreaterThan(String value) {
            addCriterion("proj_type >", value, "projType");
            return (Criteria) this;
        }

        public Criteria andProjTypeGreaterThanOrEqualTo(String value) {
            addCriterion("proj_type >=", value, "projType");
            return (Criteria) this;
        }

        public Criteria andProjTypeLessThan(String value) {
            addCriterion("proj_type <", value, "projType");
            return (Criteria) this;
        }

        public Criteria andProjTypeLessThanOrEqualTo(String value) {
            addCriterion("proj_type <=", value, "projType");
            return (Criteria) this;
        }

        public Criteria andProjTypeLike(String value) {
            addCriterion("proj_type like", value, "projType");
            return (Criteria) this;
        }

        public Criteria andProjTypeNotLike(String value) {
            addCriterion("proj_type not like", value, "projType");
            return (Criteria) this;
        }

        public Criteria andProjTypeIn(List<String> values) {
            addCriterion("proj_type in", values, "projType");
            return (Criteria) this;
        }

        public Criteria andProjTypeNotIn(List<String> values) {
            addCriterion("proj_type not in", values, "projType");
            return (Criteria) this;
        }

        public Criteria andProjTypeBetween(String value1, String value2) {
            addCriterion("proj_type between", value1, value2, "projType");
            return (Criteria) this;
        }

        public Criteria andProjTypeNotBetween(String value1, String value2) {
            addCriterion("proj_type not between", value1, value2, "projType");
            return (Criteria) this;
        }

        public Criteria andProjOwnerIdIsNull() {
            addCriterion("proj_owner_id is null");
            return (Criteria) this;
        }

        public Criteria andProjOwnerIdIsNotNull() {
            addCriterion("proj_owner_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjOwnerIdEqualTo(Integer value) {
            addCriterion("proj_owner_id =", value, "projOwnerId");
            return (Criteria) this;
        }

        public Criteria andProjOwnerIdNotEqualTo(Integer value) {
            addCriterion("proj_owner_id <>", value, "projOwnerId");
            return (Criteria) this;
        }

        public Criteria andProjOwnerIdGreaterThan(Integer value) {
            addCriterion("proj_owner_id >", value, "projOwnerId");
            return (Criteria) this;
        }

        public Criteria andProjOwnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("proj_owner_id >=", value, "projOwnerId");
            return (Criteria) this;
        }

        public Criteria andProjOwnerIdLessThan(Integer value) {
            addCriterion("proj_owner_id <", value, "projOwnerId");
            return (Criteria) this;
        }

        public Criteria andProjOwnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("proj_owner_id <=", value, "projOwnerId");
            return (Criteria) this;
        }

        public Criteria andProjOwnerIdIn(List<Integer> values) {
            addCriterion("proj_owner_id in", values, "projOwnerId");
            return (Criteria) this;
        }

        public Criteria andProjOwnerIdNotIn(List<Integer> values) {
            addCriterion("proj_owner_id not in", values, "projOwnerId");
            return (Criteria) this;
        }

        public Criteria andProjOwnerIdBetween(Integer value1, Integer value2) {
            addCriterion("proj_owner_id between", value1, value2, "projOwnerId");
            return (Criteria) this;
        }

        public Criteria andProjOwnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("proj_owner_id not between", value1, value2, "projOwnerId");
            return (Criteria) this;
        }

        public Criteria andBfIdIsNull() {
            addCriterion("bf_id is null");
            return (Criteria) this;
        }

        public Criteria andBfIdIsNotNull() {
            addCriterion("bf_id is not null");
            return (Criteria) this;
        }

        public Criteria andBfIdEqualTo(Integer value) {
            addCriterion("bf_id =", value, "bfId");
            return (Criteria) this;
        }

        public Criteria andBfIdNotEqualTo(Integer value) {
            addCriterion("bf_id <>", value, "bfId");
            return (Criteria) this;
        }

        public Criteria andBfIdGreaterThan(Integer value) {
            addCriterion("bf_id >", value, "bfId");
            return (Criteria) this;
        }

        public Criteria andBfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bf_id >=", value, "bfId");
            return (Criteria) this;
        }

        public Criteria andBfIdLessThan(Integer value) {
            addCriterion("bf_id <", value, "bfId");
            return (Criteria) this;
        }

        public Criteria andBfIdLessThanOrEqualTo(Integer value) {
            addCriterion("bf_id <=", value, "bfId");
            return (Criteria) this;
        }

        public Criteria andBfIdIn(List<Integer> values) {
            addCriterion("bf_id in", values, "bfId");
            return (Criteria) this;
        }

        public Criteria andBfIdNotIn(List<Integer> values) {
            addCriterion("bf_id not in", values, "bfId");
            return (Criteria) this;
        }

        public Criteria andBfIdBetween(Integer value1, Integer value2) {
            addCriterion("bf_id between", value1, value2, "bfId");
            return (Criteria) this;
        }

        public Criteria andBfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bf_id not between", value1, value2, "bfId");
            return (Criteria) this;
        }

        public Criteria andProjStateIsNull() {
            addCriterion("proj_state is null");
            return (Criteria) this;
        }

        public Criteria andProjStateIsNotNull() {
            addCriterion("proj_state is not null");
            return (Criteria) this;
        }

        public Criteria andProjStateEqualTo(Byte value) {
            addCriterion("proj_state =", value, "projState");
            return (Criteria) this;
        }

        public Criteria andProjStateNotEqualTo(Byte value) {
            addCriterion("proj_state <>", value, "projState");
            return (Criteria) this;
        }

        public Criteria andProjStateGreaterThan(Byte value) {
            addCriterion("proj_state >", value, "projState");
            return (Criteria) this;
        }

        public Criteria andProjStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("proj_state >=", value, "projState");
            return (Criteria) this;
        }

        public Criteria andProjStateLessThan(Byte value) {
            addCriterion("proj_state <", value, "projState");
            return (Criteria) this;
        }

        public Criteria andProjStateLessThanOrEqualTo(Byte value) {
            addCriterion("proj_state <=", value, "projState");
            return (Criteria) this;
        }

        public Criteria andProjStateIn(List<Byte> values) {
            addCriterion("proj_state in", values, "projState");
            return (Criteria) this;
        }

        public Criteria andProjStateNotIn(List<Byte> values) {
            addCriterion("proj_state not in", values, "projState");
            return (Criteria) this;
        }

        public Criteria andProjStateBetween(Byte value1, Byte value2) {
            addCriterion("proj_state between", value1, value2, "projState");
            return (Criteria) this;
        }

        public Criteria andProjStateNotBetween(Byte value1, Byte value2) {
            addCriterion("proj_state not between", value1, value2, "projState");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Integer value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Integer value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Integer> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andDonationTypeIsNull() {
            addCriterion("donation_type is null");
            return (Criteria) this;
        }

        public Criteria andDonationTypeIsNotNull() {
            addCriterion("donation_type is not null");
            return (Criteria) this;
        }

        public Criteria andDonationTypeEqualTo(String value) {
            addCriterion("donation_type =", value, "donationType");
            return (Criteria) this;
        }

        public Criteria andDonationTypeNotEqualTo(String value) {
            addCriterion("donation_type <>", value, "donationType");
            return (Criteria) this;
        }

        public Criteria andDonationTypeGreaterThan(String value) {
            addCriterion("donation_type >", value, "donationType");
            return (Criteria) this;
        }

        public Criteria andDonationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("donation_type >=", value, "donationType");
            return (Criteria) this;
        }

        public Criteria andDonationTypeLessThan(String value) {
            addCriterion("donation_type <", value, "donationType");
            return (Criteria) this;
        }

        public Criteria andDonationTypeLessThanOrEqualTo(String value) {
            addCriterion("donation_type <=", value, "donationType");
            return (Criteria) this;
        }

        public Criteria andDonationTypeLike(String value) {
            addCriterion("donation_type like", value, "donationType");
            return (Criteria) this;
        }

        public Criteria andDonationTypeNotLike(String value) {
            addCriterion("donation_type not like", value, "donationType");
            return (Criteria) this;
        }

        public Criteria andDonationTypeIn(List<String> values) {
            addCriterion("donation_type in", values, "donationType");
            return (Criteria) this;
        }

        public Criteria andDonationTypeNotIn(List<String> values) {
            addCriterion("donation_type not in", values, "donationType");
            return (Criteria) this;
        }

        public Criteria andDonationTypeBetween(String value1, String value2) {
            addCriterion("donation_type between", value1, value2, "donationType");
            return (Criteria) this;
        }

        public Criteria andDonationTypeNotBetween(String value1, String value2) {
            addCriterion("donation_type not between", value1, value2, "donationType");
            return (Criteria) this;
        }

        public Criteria andProjSortIsNull() {
            addCriterion("proj_sort is null");
            return (Criteria) this;
        }

        public Criteria andProjSortIsNotNull() {
            addCriterion("proj_sort is not null");
            return (Criteria) this;
        }

        public Criteria andProjSortEqualTo(Integer value) {
            addCriterion("proj_sort =", value, "projSort");
            return (Criteria) this;
        }

        public Criteria andProjSortNotEqualTo(Integer value) {
            addCriterion("proj_sort <>", value, "projSort");
            return (Criteria) this;
        }

        public Criteria andProjSortGreaterThan(Integer value) {
            addCriterion("proj_sort >", value, "projSort");
            return (Criteria) this;
        }

        public Criteria andProjSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("proj_sort >=", value, "projSort");
            return (Criteria) this;
        }

        public Criteria andProjSortLessThan(Integer value) {
            addCriterion("proj_sort <", value, "projSort");
            return (Criteria) this;
        }

        public Criteria andProjSortLessThanOrEqualTo(Integer value) {
            addCriterion("proj_sort <=", value, "projSort");
            return (Criteria) this;
        }

        public Criteria andProjSortIn(List<Integer> values) {
            addCriterion("proj_sort in", values, "projSort");
            return (Criteria) this;
        }

        public Criteria andProjSortNotIn(List<Integer> values) {
            addCriterion("proj_sort not in", values, "projSort");
            return (Criteria) this;
        }

        public Criteria andProjSortBetween(Integer value1, Integer value2) {
            addCriterion("proj_sort between", value1, value2, "projSort");
            return (Criteria) this;
        }

        public Criteria andProjSortNotBetween(Integer value1, Integer value2) {
            addCriterion("proj_sort not between", value1, value2, "projSort");
            return (Criteria) this;
        }

        public Criteria andAuditCommentIsNull() {
            addCriterion("audit_comment is null");
            return (Criteria) this;
        }

        public Criteria andAuditCommentIsNotNull() {
            addCriterion("audit_comment is not null");
            return (Criteria) this;
        }

        public Criteria andAuditCommentEqualTo(String value) {
            addCriterion("audit_comment =", value, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentNotEqualTo(String value) {
            addCriterion("audit_comment <>", value, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentGreaterThan(String value) {
            addCriterion("audit_comment >", value, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentGreaterThanOrEqualTo(String value) {
            addCriterion("audit_comment >=", value, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentLessThan(String value) {
            addCriterion("audit_comment <", value, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentLessThanOrEqualTo(String value) {
            addCriterion("audit_comment <=", value, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentLike(String value) {
            addCriterion("audit_comment like", value, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentNotLike(String value) {
            addCriterion("audit_comment not like", value, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentIn(List<String> values) {
            addCriterion("audit_comment in", values, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentNotIn(List<String> values) {
            addCriterion("audit_comment not in", values, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentBetween(String value1, String value2) {
            addCriterion("audit_comment between", value1, value2, "auditComment");
            return (Criteria) this;
        }

        public Criteria andAuditCommentNotBetween(String value1, String value2) {
            addCriterion("audit_comment not between", value1, value2, "auditComment");
            return (Criteria) this;
        }

        public Criteria andProjAuditorIdIsNull() {
            addCriterion("proj_auditor_id is null");
            return (Criteria) this;
        }

        public Criteria andProjAuditorIdIsNotNull() {
            addCriterion("proj_auditor_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjAuditorIdEqualTo(Integer value) {
            addCriterion("proj_auditor_id =", value, "projAuditorId");
            return (Criteria) this;
        }

        public Criteria andProjAuditorIdNotEqualTo(Integer value) {
            addCriterion("proj_auditor_id <>", value, "projAuditorId");
            return (Criteria) this;
        }

        public Criteria andProjAuditorIdGreaterThan(Integer value) {
            addCriterion("proj_auditor_id >", value, "projAuditorId");
            return (Criteria) this;
        }

        public Criteria andProjAuditorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("proj_auditor_id >=", value, "projAuditorId");
            return (Criteria) this;
        }

        public Criteria andProjAuditorIdLessThan(Integer value) {
            addCriterion("proj_auditor_id <", value, "projAuditorId");
            return (Criteria) this;
        }

        public Criteria andProjAuditorIdLessThanOrEqualTo(Integer value) {
            addCriterion("proj_auditor_id <=", value, "projAuditorId");
            return (Criteria) this;
        }

        public Criteria andProjAuditorIdIn(List<Integer> values) {
            addCriterion("proj_auditor_id in", values, "projAuditorId");
            return (Criteria) this;
        }

        public Criteria andProjAuditorIdNotIn(List<Integer> values) {
            addCriterion("proj_auditor_id not in", values, "projAuditorId");
            return (Criteria) this;
        }

        public Criteria andProjAuditorIdBetween(Integer value1, Integer value2) {
            addCriterion("proj_auditor_id between", value1, value2, "projAuditorId");
            return (Criteria) this;
        }

        public Criteria andProjAuditorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("proj_auditor_id not between", value1, value2, "projAuditorId");
            return (Criteria) this;
        }

        public Criteria andProjSponsorImageIsNull() {
            addCriterion("proj_sponsor_image is null");
            return (Criteria) this;
        }

        public Criteria andProjSponsorImageIsNotNull() {
            addCriterion("proj_sponsor_image is not null");
            return (Criteria) this;
        }

        public Criteria andProjSponsorImageEqualTo(String value) {
            addCriterion("proj_sponsor_image =", value, "projSponsorImage");
            return (Criteria) this;
        }

        public Criteria andProjSponsorImageNotEqualTo(String value) {
            addCriterion("proj_sponsor_image <>", value, "projSponsorImage");
            return (Criteria) this;
        }

        public Criteria andProjSponsorImageGreaterThan(String value) {
            addCriterion("proj_sponsor_image >", value, "projSponsorImage");
            return (Criteria) this;
        }

        public Criteria andProjSponsorImageGreaterThanOrEqualTo(String value) {
            addCriterion("proj_sponsor_image >=", value, "projSponsorImage");
            return (Criteria) this;
        }

        public Criteria andProjSponsorImageLessThan(String value) {
            addCriterion("proj_sponsor_image <", value, "projSponsorImage");
            return (Criteria) this;
        }

        public Criteria andProjSponsorImageLessThanOrEqualTo(String value) {
            addCriterion("proj_sponsor_image <=", value, "projSponsorImage");
            return (Criteria) this;
        }

        public Criteria andProjSponsorImageLike(String value) {
            addCriterion("proj_sponsor_image like", value, "projSponsorImage");
            return (Criteria) this;
        }

        public Criteria andProjSponsorImageNotLike(String value) {
            addCriterion("proj_sponsor_image not like", value, "projSponsorImage");
            return (Criteria) this;
        }

        public Criteria andProjSponsorImageIn(List<String> values) {
            addCriterion("proj_sponsor_image in", values, "projSponsorImage");
            return (Criteria) this;
        }

        public Criteria andProjSponsorImageNotIn(List<String> values) {
            addCriterion("proj_sponsor_image not in", values, "projSponsorImage");
            return (Criteria) this;
        }

        public Criteria andProjSponsorImageBetween(String value1, String value2) {
            addCriterion("proj_sponsor_image between", value1, value2, "projSponsorImage");
            return (Criteria) this;
        }

        public Criteria andProjSponsorImageNotBetween(String value1, String value2) {
            addCriterion("proj_sponsor_image not between", value1, value2, "projSponsorImage");
            return (Criteria) this;
        }

        public Criteria andProjBfNameIsNull() {
            addCriterion("proj_bf_name is null");
            return (Criteria) this;
        }

        public Criteria andProjBfNameIsNotNull() {
            addCriterion("proj_bf_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjBfNameEqualTo(String value) {
            addCriterion("proj_bf_name =", value, "projBfName");
            return (Criteria) this;
        }

        public Criteria andProjBfNameNotEqualTo(String value) {
            addCriterion("proj_bf_name <>", value, "projBfName");
            return (Criteria) this;
        }

        public Criteria andProjBfNameGreaterThan(String value) {
            addCriterion("proj_bf_name >", value, "projBfName");
            return (Criteria) this;
        }

        public Criteria andProjBfNameGreaterThanOrEqualTo(String value) {
            addCriterion("proj_bf_name >=", value, "projBfName");
            return (Criteria) this;
        }

        public Criteria andProjBfNameLessThan(String value) {
            addCriterion("proj_bf_name <", value, "projBfName");
            return (Criteria) this;
        }

        public Criteria andProjBfNameLessThanOrEqualTo(String value) {
            addCriterion("proj_bf_name <=", value, "projBfName");
            return (Criteria) this;
        }

        public Criteria andProjBfNameLike(String value) {
            addCriterion("proj_bf_name like", value, "projBfName");
            return (Criteria) this;
        }

        public Criteria andProjBfNameNotLike(String value) {
            addCriterion("proj_bf_name not like", value, "projBfName");
            return (Criteria) this;
        }

        public Criteria andProjBfNameIn(List<String> values) {
            addCriterion("proj_bf_name in", values, "projBfName");
            return (Criteria) this;
        }

        public Criteria andProjBfNameNotIn(List<String> values) {
            addCriterion("proj_bf_name not in", values, "projBfName");
            return (Criteria) this;
        }

        public Criteria andProjBfNameBetween(String value1, String value2) {
            addCriterion("proj_bf_name between", value1, value2, "projBfName");
            return (Criteria) this;
        }

        public Criteria andProjBfNameNotBetween(String value1, String value2) {
            addCriterion("proj_bf_name not between", value1, value2, "projBfName");
            return (Criteria) this;
        }

        public Criteria andProjBfImageIsNull() {
            addCriterion("proj_bf_image is null");
            return (Criteria) this;
        }

        public Criteria andProjBfImageIsNotNull() {
            addCriterion("proj_bf_image is not null");
            return (Criteria) this;
        }

        public Criteria andProjBfImageEqualTo(String value) {
            addCriterion("proj_bf_image =", value, "projBfImage");
            return (Criteria) this;
        }

        public Criteria andProjBfImageNotEqualTo(String value) {
            addCriterion("proj_bf_image <>", value, "projBfImage");
            return (Criteria) this;
        }

        public Criteria andProjBfImageGreaterThan(String value) {
            addCriterion("proj_bf_image >", value, "projBfImage");
            return (Criteria) this;
        }

        public Criteria andProjBfImageGreaterThanOrEqualTo(String value) {
            addCriterion("proj_bf_image >=", value, "projBfImage");
            return (Criteria) this;
        }

        public Criteria andProjBfImageLessThan(String value) {
            addCriterion("proj_bf_image <", value, "projBfImage");
            return (Criteria) this;
        }

        public Criteria andProjBfImageLessThanOrEqualTo(String value) {
            addCriterion("proj_bf_image <=", value, "projBfImage");
            return (Criteria) this;
        }

        public Criteria andProjBfImageLike(String value) {
            addCriterion("proj_bf_image like", value, "projBfImage");
            return (Criteria) this;
        }

        public Criteria andProjBfImageNotLike(String value) {
            addCriterion("proj_bf_image not like", value, "projBfImage");
            return (Criteria) this;
        }

        public Criteria andProjBfImageIn(List<String> values) {
            addCriterion("proj_bf_image in", values, "projBfImage");
            return (Criteria) this;
        }

        public Criteria andProjBfImageNotIn(List<String> values) {
            addCriterion("proj_bf_image not in", values, "projBfImage");
            return (Criteria) this;
        }

        public Criteria andProjBfImageBetween(String value1, String value2) {
            addCriterion("proj_bf_image between", value1, value2, "projBfImage");
            return (Criteria) this;
        }

        public Criteria andProjBfImageNotBetween(String value1, String value2) {
            addCriterion("proj_bf_image not between", value1, value2, "projBfImage");
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
    }

    /**
     * 描述:sy_project表的实体类
     * @version
     * @author:  caoyongjun
     * @创建时间: 2017-10-18
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_project 2017-10-18
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