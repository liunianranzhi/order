package com.shanyuan.platform.ms.dao.store.entity;

import java.util.ArrayList;
import java.util.List;

public class SyCircleExample {
    /**
     * sy_circle
     */
    protected String orderByClause;

    /**
     * sy_circle
     */
    protected boolean distinct;

    /**
     * sy_circle
     */
    protected List<Criteria> oredCriteria;

    public SyCircleExample() {
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
     * sy_circle 2017-10-19
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

        public Criteria andCircleNameIsNull() {
            addCriterion("circle_name is null");
            return (Criteria) this;
        }

        public Criteria andCircleNameIsNotNull() {
            addCriterion("circle_name is not null");
            return (Criteria) this;
        }

        public Criteria andCircleNameEqualTo(String value) {
            addCriterion("circle_name =", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameNotEqualTo(String value) {
            addCriterion("circle_name <>", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameGreaterThan(String value) {
            addCriterion("circle_name >", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameGreaterThanOrEqualTo(String value) {
            addCriterion("circle_name >=", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameLessThan(String value) {
            addCriterion("circle_name <", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameLessThanOrEqualTo(String value) {
            addCriterion("circle_name <=", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameLike(String value) {
            addCriterion("circle_name like", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameNotLike(String value) {
            addCriterion("circle_name not like", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameIn(List<String> values) {
            addCriterion("circle_name in", values, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameNotIn(List<String> values) {
            addCriterion("circle_name not in", values, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameBetween(String value1, String value2) {
            addCriterion("circle_name between", value1, value2, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameNotBetween(String value1, String value2) {
            addCriterion("circle_name not between", value1, value2, "circleName");
            return (Criteria) this;
        }

        public Criteria andParentCircleNameIsNull() {
            addCriterion("parent_circle_name is null");
            return (Criteria) this;
        }

        public Criteria andParentCircleNameIsNotNull() {
            addCriterion("parent_circle_name is not null");
            return (Criteria) this;
        }

        public Criteria andParentCircleNameEqualTo(String value) {
            addCriterion("parent_circle_name =", value, "parentCircleName");
            return (Criteria) this;
        }

        public Criteria andParentCircleNameNotEqualTo(String value) {
            addCriterion("parent_circle_name <>", value, "parentCircleName");
            return (Criteria) this;
        }

        public Criteria andParentCircleNameGreaterThan(String value) {
            addCriterion("parent_circle_name >", value, "parentCircleName");
            return (Criteria) this;
        }

        public Criteria andParentCircleNameGreaterThanOrEqualTo(String value) {
            addCriterion("parent_circle_name >=", value, "parentCircleName");
            return (Criteria) this;
        }

        public Criteria andParentCircleNameLessThan(String value) {
            addCriterion("parent_circle_name <", value, "parentCircleName");
            return (Criteria) this;
        }

        public Criteria andParentCircleNameLessThanOrEqualTo(String value) {
            addCriterion("parent_circle_name <=", value, "parentCircleName");
            return (Criteria) this;
        }

        public Criteria andParentCircleNameLike(String value) {
            addCriterion("parent_circle_name like", value, "parentCircleName");
            return (Criteria) this;
        }

        public Criteria andParentCircleNameNotLike(String value) {
            addCriterion("parent_circle_name not like", value, "parentCircleName");
            return (Criteria) this;
        }

        public Criteria andParentCircleNameIn(List<String> values) {
            addCriterion("parent_circle_name in", values, "parentCircleName");
            return (Criteria) this;
        }

        public Criteria andParentCircleNameNotIn(List<String> values) {
            addCriterion("parent_circle_name not in", values, "parentCircleName");
            return (Criteria) this;
        }

        public Criteria andParentCircleNameBetween(String value1, String value2) {
            addCriterion("parent_circle_name between", value1, value2, "parentCircleName");
            return (Criteria) this;
        }

        public Criteria andParentCircleNameNotBetween(String value1, String value2) {
            addCriterion("parent_circle_name not between", value1, value2, "parentCircleName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andCircleDescIsNull() {
            addCriterion("circle_desc is null");
            return (Criteria) this;
        }

        public Criteria andCircleDescIsNotNull() {
            addCriterion("circle_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCircleDescEqualTo(String value) {
            addCriterion("circle_desc =", value, "circleDesc");
            return (Criteria) this;
        }

        public Criteria andCircleDescNotEqualTo(String value) {
            addCriterion("circle_desc <>", value, "circleDesc");
            return (Criteria) this;
        }

        public Criteria andCircleDescGreaterThan(String value) {
            addCriterion("circle_desc >", value, "circleDesc");
            return (Criteria) this;
        }

        public Criteria andCircleDescGreaterThanOrEqualTo(String value) {
            addCriterion("circle_desc >=", value, "circleDesc");
            return (Criteria) this;
        }

        public Criteria andCircleDescLessThan(String value) {
            addCriterion("circle_desc <", value, "circleDesc");
            return (Criteria) this;
        }

        public Criteria andCircleDescLessThanOrEqualTo(String value) {
            addCriterion("circle_desc <=", value, "circleDesc");
            return (Criteria) this;
        }

        public Criteria andCircleDescLike(String value) {
            addCriterion("circle_desc like", value, "circleDesc");
            return (Criteria) this;
        }

        public Criteria andCircleDescNotLike(String value) {
            addCriterion("circle_desc not like", value, "circleDesc");
            return (Criteria) this;
        }

        public Criteria andCircleDescIn(List<String> values) {
            addCriterion("circle_desc in", values, "circleDesc");
            return (Criteria) this;
        }

        public Criteria andCircleDescNotIn(List<String> values) {
            addCriterion("circle_desc not in", values, "circleDesc");
            return (Criteria) this;
        }

        public Criteria andCircleDescBetween(String value1, String value2) {
            addCriterion("circle_desc between", value1, value2, "circleDesc");
            return (Criteria) this;
        }

        public Criteria andCircleDescNotBetween(String value1, String value2) {
            addCriterion("circle_desc not between", value1, value2, "circleDesc");
            return (Criteria) this;
        }

        public Criteria andCircleMasteridIsNull() {
            addCriterion("circle_masterid is null");
            return (Criteria) this;
        }

        public Criteria andCircleMasteridIsNotNull() {
            addCriterion("circle_masterid is not null");
            return (Criteria) this;
        }

        public Criteria andCircleMasteridEqualTo(Integer value) {
            addCriterion("circle_masterid =", value, "circleMasterid");
            return (Criteria) this;
        }

        public Criteria andCircleMasteridNotEqualTo(Integer value) {
            addCriterion("circle_masterid <>", value, "circleMasterid");
            return (Criteria) this;
        }

        public Criteria andCircleMasteridGreaterThan(Integer value) {
            addCriterion("circle_masterid >", value, "circleMasterid");
            return (Criteria) this;
        }

        public Criteria andCircleMasteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("circle_masterid >=", value, "circleMasterid");
            return (Criteria) this;
        }

        public Criteria andCircleMasteridLessThan(Integer value) {
            addCriterion("circle_masterid <", value, "circleMasterid");
            return (Criteria) this;
        }

        public Criteria andCircleMasteridLessThanOrEqualTo(Integer value) {
            addCriterion("circle_masterid <=", value, "circleMasterid");
            return (Criteria) this;
        }

        public Criteria andCircleMasteridIn(List<Integer> values) {
            addCriterion("circle_masterid in", values, "circleMasterid");
            return (Criteria) this;
        }

        public Criteria andCircleMasteridNotIn(List<Integer> values) {
            addCriterion("circle_masterid not in", values, "circleMasterid");
            return (Criteria) this;
        }

        public Criteria andCircleMasteridBetween(Integer value1, Integer value2) {
            addCriterion("circle_masterid between", value1, value2, "circleMasterid");
            return (Criteria) this;
        }

        public Criteria andCircleMasteridNotBetween(Integer value1, Integer value2) {
            addCriterion("circle_masterid not between", value1, value2, "circleMasterid");
            return (Criteria) this;
        }

        public Criteria andCircleMasternameIsNull() {
            addCriterion("circle_mastername is null");
            return (Criteria) this;
        }

        public Criteria andCircleMasternameIsNotNull() {
            addCriterion("circle_mastername is not null");
            return (Criteria) this;
        }

        public Criteria andCircleMasternameEqualTo(String value) {
            addCriterion("circle_mastername =", value, "circleMastername");
            return (Criteria) this;
        }

        public Criteria andCircleMasternameNotEqualTo(String value) {
            addCriterion("circle_mastername <>", value, "circleMastername");
            return (Criteria) this;
        }

        public Criteria andCircleMasternameGreaterThan(String value) {
            addCriterion("circle_mastername >", value, "circleMastername");
            return (Criteria) this;
        }

        public Criteria andCircleMasternameGreaterThanOrEqualTo(String value) {
            addCriterion("circle_mastername >=", value, "circleMastername");
            return (Criteria) this;
        }

        public Criteria andCircleMasternameLessThan(String value) {
            addCriterion("circle_mastername <", value, "circleMastername");
            return (Criteria) this;
        }

        public Criteria andCircleMasternameLessThanOrEqualTo(String value) {
            addCriterion("circle_mastername <=", value, "circleMastername");
            return (Criteria) this;
        }

        public Criteria andCircleMasternameLike(String value) {
            addCriterion("circle_mastername like", value, "circleMastername");
            return (Criteria) this;
        }

        public Criteria andCircleMasternameNotLike(String value) {
            addCriterion("circle_mastername not like", value, "circleMastername");
            return (Criteria) this;
        }

        public Criteria andCircleMasternameIn(List<String> values) {
            addCriterion("circle_mastername in", values, "circleMastername");
            return (Criteria) this;
        }

        public Criteria andCircleMasternameNotIn(List<String> values) {
            addCriterion("circle_mastername not in", values, "circleMastername");
            return (Criteria) this;
        }

        public Criteria andCircleMasternameBetween(String value1, String value2) {
            addCriterion("circle_mastername between", value1, value2, "circleMastername");
            return (Criteria) this;
        }

        public Criteria andCircleMasternameNotBetween(String value1, String value2) {
            addCriterion("circle_mastername not between", value1, value2, "circleMastername");
            return (Criteria) this;
        }

        public Criteria andCircleImgIsNull() {
            addCriterion("circle_img is null");
            return (Criteria) this;
        }

        public Criteria andCircleImgIsNotNull() {
            addCriterion("circle_img is not null");
            return (Criteria) this;
        }

        public Criteria andCircleImgEqualTo(String value) {
            addCriterion("circle_img =", value, "circleImg");
            return (Criteria) this;
        }

        public Criteria andCircleImgNotEqualTo(String value) {
            addCriterion("circle_img <>", value, "circleImg");
            return (Criteria) this;
        }

        public Criteria andCircleImgGreaterThan(String value) {
            addCriterion("circle_img >", value, "circleImg");
            return (Criteria) this;
        }

        public Criteria andCircleImgGreaterThanOrEqualTo(String value) {
            addCriterion("circle_img >=", value, "circleImg");
            return (Criteria) this;
        }

        public Criteria andCircleImgLessThan(String value) {
            addCriterion("circle_img <", value, "circleImg");
            return (Criteria) this;
        }

        public Criteria andCircleImgLessThanOrEqualTo(String value) {
            addCriterion("circle_img <=", value, "circleImg");
            return (Criteria) this;
        }

        public Criteria andCircleImgLike(String value) {
            addCriterion("circle_img like", value, "circleImg");
            return (Criteria) this;
        }

        public Criteria andCircleImgNotLike(String value) {
            addCriterion("circle_img not like", value, "circleImg");
            return (Criteria) this;
        }

        public Criteria andCircleImgIn(List<String> values) {
            addCriterion("circle_img in", values, "circleImg");
            return (Criteria) this;
        }

        public Criteria andCircleImgNotIn(List<String> values) {
            addCriterion("circle_img not in", values, "circleImg");
            return (Criteria) this;
        }

        public Criteria andCircleImgBetween(String value1, String value2) {
            addCriterion("circle_img between", value1, value2, "circleImg");
            return (Criteria) this;
        }

        public Criteria andCircleImgNotBetween(String value1, String value2) {
            addCriterion("circle_img not between", value1, value2, "circleImg");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andCircleMcountIsNull() {
            addCriterion("circle_mcount is null");
            return (Criteria) this;
        }

        public Criteria andCircleMcountIsNotNull() {
            addCriterion("circle_mcount is not null");
            return (Criteria) this;
        }

        public Criteria andCircleMcountEqualTo(Integer value) {
            addCriterion("circle_mcount =", value, "circleMcount");
            return (Criteria) this;
        }

        public Criteria andCircleMcountNotEqualTo(Integer value) {
            addCriterion("circle_mcount <>", value, "circleMcount");
            return (Criteria) this;
        }

        public Criteria andCircleMcountGreaterThan(Integer value) {
            addCriterion("circle_mcount >", value, "circleMcount");
            return (Criteria) this;
        }

        public Criteria andCircleMcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("circle_mcount >=", value, "circleMcount");
            return (Criteria) this;
        }

        public Criteria andCircleMcountLessThan(Integer value) {
            addCriterion("circle_mcount <", value, "circleMcount");
            return (Criteria) this;
        }

        public Criteria andCircleMcountLessThanOrEqualTo(Integer value) {
            addCriterion("circle_mcount <=", value, "circleMcount");
            return (Criteria) this;
        }

        public Criteria andCircleMcountIn(List<Integer> values) {
            addCriterion("circle_mcount in", values, "circleMcount");
            return (Criteria) this;
        }

        public Criteria andCircleMcountNotIn(List<Integer> values) {
            addCriterion("circle_mcount not in", values, "circleMcount");
            return (Criteria) this;
        }

        public Criteria andCircleMcountBetween(Integer value1, Integer value2) {
            addCriterion("circle_mcount between", value1, value2, "circleMcount");
            return (Criteria) this;
        }

        public Criteria andCircleMcountNotBetween(Integer value1, Integer value2) {
            addCriterion("circle_mcount not between", value1, value2, "circleMcount");
            return (Criteria) this;
        }

        public Criteria andCircleThcountIsNull() {
            addCriterion("circle_thcount is null");
            return (Criteria) this;
        }

        public Criteria andCircleThcountIsNotNull() {
            addCriterion("circle_thcount is not null");
            return (Criteria) this;
        }

        public Criteria andCircleThcountEqualTo(Integer value) {
            addCriterion("circle_thcount =", value, "circleThcount");
            return (Criteria) this;
        }

        public Criteria andCircleThcountNotEqualTo(Integer value) {
            addCriterion("circle_thcount <>", value, "circleThcount");
            return (Criteria) this;
        }

        public Criteria andCircleThcountGreaterThan(Integer value) {
            addCriterion("circle_thcount >", value, "circleThcount");
            return (Criteria) this;
        }

        public Criteria andCircleThcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("circle_thcount >=", value, "circleThcount");
            return (Criteria) this;
        }

        public Criteria andCircleThcountLessThan(Integer value) {
            addCriterion("circle_thcount <", value, "circleThcount");
            return (Criteria) this;
        }

        public Criteria andCircleThcountLessThanOrEqualTo(Integer value) {
            addCriterion("circle_thcount <=", value, "circleThcount");
            return (Criteria) this;
        }

        public Criteria andCircleThcountIn(List<Integer> values) {
            addCriterion("circle_thcount in", values, "circleThcount");
            return (Criteria) this;
        }

        public Criteria andCircleThcountNotIn(List<Integer> values) {
            addCriterion("circle_thcount not in", values, "circleThcount");
            return (Criteria) this;
        }

        public Criteria andCircleThcountBetween(Integer value1, Integer value2) {
            addCriterion("circle_thcount between", value1, value2, "circleThcount");
            return (Criteria) this;
        }

        public Criteria andCircleThcountNotBetween(Integer value1, Integer value2) {
            addCriterion("circle_thcount not between", value1, value2, "circleThcount");
            return (Criteria) this;
        }

        public Criteria andCircleGcountIsNull() {
            addCriterion("circle_gcount is null");
            return (Criteria) this;
        }

        public Criteria andCircleGcountIsNotNull() {
            addCriterion("circle_gcount is not null");
            return (Criteria) this;
        }

        public Criteria andCircleGcountEqualTo(Integer value) {
            addCriterion("circle_gcount =", value, "circleGcount");
            return (Criteria) this;
        }

        public Criteria andCircleGcountNotEqualTo(Integer value) {
            addCriterion("circle_gcount <>", value, "circleGcount");
            return (Criteria) this;
        }

        public Criteria andCircleGcountGreaterThan(Integer value) {
            addCriterion("circle_gcount >", value, "circleGcount");
            return (Criteria) this;
        }

        public Criteria andCircleGcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("circle_gcount >=", value, "circleGcount");
            return (Criteria) this;
        }

        public Criteria andCircleGcountLessThan(Integer value) {
            addCriterion("circle_gcount <", value, "circleGcount");
            return (Criteria) this;
        }

        public Criteria andCircleGcountLessThanOrEqualTo(Integer value) {
            addCriterion("circle_gcount <=", value, "circleGcount");
            return (Criteria) this;
        }

        public Criteria andCircleGcountIn(List<Integer> values) {
            addCriterion("circle_gcount in", values, "circleGcount");
            return (Criteria) this;
        }

        public Criteria andCircleGcountNotIn(List<Integer> values) {
            addCriterion("circle_gcount not in", values, "circleGcount");
            return (Criteria) this;
        }

        public Criteria andCircleGcountBetween(Integer value1, Integer value2) {
            addCriterion("circle_gcount between", value1, value2, "circleGcount");
            return (Criteria) this;
        }

        public Criteria andCircleGcountNotBetween(Integer value1, Integer value2) {
            addCriterion("circle_gcount not between", value1, value2, "circleGcount");
            return (Criteria) this;
        }

        public Criteria andCirclePursuereasonIsNull() {
            addCriterion("circle_pursuereason is null");
            return (Criteria) this;
        }

        public Criteria andCirclePursuereasonIsNotNull() {
            addCriterion("circle_pursuereason is not null");
            return (Criteria) this;
        }

        public Criteria andCirclePursuereasonEqualTo(String value) {
            addCriterion("circle_pursuereason =", value, "circlePursuereason");
            return (Criteria) this;
        }

        public Criteria andCirclePursuereasonNotEqualTo(String value) {
            addCriterion("circle_pursuereason <>", value, "circlePursuereason");
            return (Criteria) this;
        }

        public Criteria andCirclePursuereasonGreaterThan(String value) {
            addCriterion("circle_pursuereason >", value, "circlePursuereason");
            return (Criteria) this;
        }

        public Criteria andCirclePursuereasonGreaterThanOrEqualTo(String value) {
            addCriterion("circle_pursuereason >=", value, "circlePursuereason");
            return (Criteria) this;
        }

        public Criteria andCirclePursuereasonLessThan(String value) {
            addCriterion("circle_pursuereason <", value, "circlePursuereason");
            return (Criteria) this;
        }

        public Criteria andCirclePursuereasonLessThanOrEqualTo(String value) {
            addCriterion("circle_pursuereason <=", value, "circlePursuereason");
            return (Criteria) this;
        }

        public Criteria andCirclePursuereasonLike(String value) {
            addCriterion("circle_pursuereason like", value, "circlePursuereason");
            return (Criteria) this;
        }

        public Criteria andCirclePursuereasonNotLike(String value) {
            addCriterion("circle_pursuereason not like", value, "circlePursuereason");
            return (Criteria) this;
        }

        public Criteria andCirclePursuereasonIn(List<String> values) {
            addCriterion("circle_pursuereason in", values, "circlePursuereason");
            return (Criteria) this;
        }

        public Criteria andCirclePursuereasonNotIn(List<String> values) {
            addCriterion("circle_pursuereason not in", values, "circlePursuereason");
            return (Criteria) this;
        }

        public Criteria andCirclePursuereasonBetween(String value1, String value2) {
            addCriterion("circle_pursuereason between", value1, value2, "circlePursuereason");
            return (Criteria) this;
        }

        public Criteria andCirclePursuereasonNotBetween(String value1, String value2) {
            addCriterion("circle_pursuereason not between", value1, value2, "circlePursuereason");
            return (Criteria) this;
        }

        public Criteria andCircleNoticeIsNull() {
            addCriterion("circle_notice is null");
            return (Criteria) this;
        }

        public Criteria andCircleNoticeIsNotNull() {
            addCriterion("circle_notice is not null");
            return (Criteria) this;
        }

        public Criteria andCircleNoticeEqualTo(String value) {
            addCriterion("circle_notice =", value, "circleNotice");
            return (Criteria) this;
        }

        public Criteria andCircleNoticeNotEqualTo(String value) {
            addCriterion("circle_notice <>", value, "circleNotice");
            return (Criteria) this;
        }

        public Criteria andCircleNoticeGreaterThan(String value) {
            addCriterion("circle_notice >", value, "circleNotice");
            return (Criteria) this;
        }

        public Criteria andCircleNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("circle_notice >=", value, "circleNotice");
            return (Criteria) this;
        }

        public Criteria andCircleNoticeLessThan(String value) {
            addCriterion("circle_notice <", value, "circleNotice");
            return (Criteria) this;
        }

        public Criteria andCircleNoticeLessThanOrEqualTo(String value) {
            addCriterion("circle_notice <=", value, "circleNotice");
            return (Criteria) this;
        }

        public Criteria andCircleNoticeLike(String value) {
            addCriterion("circle_notice like", value, "circleNotice");
            return (Criteria) this;
        }

        public Criteria andCircleNoticeNotLike(String value) {
            addCriterion("circle_notice not like", value, "circleNotice");
            return (Criteria) this;
        }

        public Criteria andCircleNoticeIn(List<String> values) {
            addCriterion("circle_notice in", values, "circleNotice");
            return (Criteria) this;
        }

        public Criteria andCircleNoticeNotIn(List<String> values) {
            addCriterion("circle_notice not in", values, "circleNotice");
            return (Criteria) this;
        }

        public Criteria andCircleNoticeBetween(String value1, String value2) {
            addCriterion("circle_notice between", value1, value2, "circleNotice");
            return (Criteria) this;
        }

        public Criteria andCircleNoticeNotBetween(String value1, String value2) {
            addCriterion("circle_notice not between", value1, value2, "circleNotice");
            return (Criteria) this;
        }

        public Criteria andCircleStatusIsNull() {
            addCriterion("circle_status is null");
            return (Criteria) this;
        }

        public Criteria andCircleStatusIsNotNull() {
            addCriterion("circle_status is not null");
            return (Criteria) this;
        }

        public Criteria andCircleStatusEqualTo(Byte value) {
            addCriterion("circle_status =", value, "circleStatus");
            return (Criteria) this;
        }

        public Criteria andCircleStatusNotEqualTo(Byte value) {
            addCriterion("circle_status <>", value, "circleStatus");
            return (Criteria) this;
        }

        public Criteria andCircleStatusGreaterThan(Byte value) {
            addCriterion("circle_status >", value, "circleStatus");
            return (Criteria) this;
        }

        public Criteria andCircleStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("circle_status >=", value, "circleStatus");
            return (Criteria) this;
        }

        public Criteria andCircleStatusLessThan(Byte value) {
            addCriterion("circle_status <", value, "circleStatus");
            return (Criteria) this;
        }

        public Criteria andCircleStatusLessThanOrEqualTo(Byte value) {
            addCriterion("circle_status <=", value, "circleStatus");
            return (Criteria) this;
        }

        public Criteria andCircleStatusIn(List<Byte> values) {
            addCriterion("circle_status in", values, "circleStatus");
            return (Criteria) this;
        }

        public Criteria andCircleStatusNotIn(List<Byte> values) {
            addCriterion("circle_status not in", values, "circleStatus");
            return (Criteria) this;
        }

        public Criteria andCircleStatusBetween(Byte value1, Byte value2) {
            addCriterion("circle_status between", value1, value2, "circleStatus");
            return (Criteria) this;
        }

        public Criteria andCircleStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("circle_status not between", value1, value2, "circleStatus");
            return (Criteria) this;
        }

        public Criteria andCircleStatusinfoIsNull() {
            addCriterion("circle_statusinfo is null");
            return (Criteria) this;
        }

        public Criteria andCircleStatusinfoIsNotNull() {
            addCriterion("circle_statusinfo is not null");
            return (Criteria) this;
        }

        public Criteria andCircleStatusinfoEqualTo(String value) {
            addCriterion("circle_statusinfo =", value, "circleStatusinfo");
            return (Criteria) this;
        }

        public Criteria andCircleStatusinfoNotEqualTo(String value) {
            addCriterion("circle_statusinfo <>", value, "circleStatusinfo");
            return (Criteria) this;
        }

        public Criteria andCircleStatusinfoGreaterThan(String value) {
            addCriterion("circle_statusinfo >", value, "circleStatusinfo");
            return (Criteria) this;
        }

        public Criteria andCircleStatusinfoGreaterThanOrEqualTo(String value) {
            addCriterion("circle_statusinfo >=", value, "circleStatusinfo");
            return (Criteria) this;
        }

        public Criteria andCircleStatusinfoLessThan(String value) {
            addCriterion("circle_statusinfo <", value, "circleStatusinfo");
            return (Criteria) this;
        }

        public Criteria andCircleStatusinfoLessThanOrEqualTo(String value) {
            addCriterion("circle_statusinfo <=", value, "circleStatusinfo");
            return (Criteria) this;
        }

        public Criteria andCircleStatusinfoLike(String value) {
            addCriterion("circle_statusinfo like", value, "circleStatusinfo");
            return (Criteria) this;
        }

        public Criteria andCircleStatusinfoNotLike(String value) {
            addCriterion("circle_statusinfo not like", value, "circleStatusinfo");
            return (Criteria) this;
        }

        public Criteria andCircleStatusinfoIn(List<String> values) {
            addCriterion("circle_statusinfo in", values, "circleStatusinfo");
            return (Criteria) this;
        }

        public Criteria andCircleStatusinfoNotIn(List<String> values) {
            addCriterion("circle_statusinfo not in", values, "circleStatusinfo");
            return (Criteria) this;
        }

        public Criteria andCircleStatusinfoBetween(String value1, String value2) {
            addCriterion("circle_statusinfo between", value1, value2, "circleStatusinfo");
            return (Criteria) this;
        }

        public Criteria andCircleStatusinfoNotBetween(String value1, String value2) {
            addCriterion("circle_statusinfo not between", value1, value2, "circleStatusinfo");
            return (Criteria) this;
        }

        public Criteria andCircleJoinauditIsNull() {
            addCriterion("circle_joinaudit is null");
            return (Criteria) this;
        }

        public Criteria andCircleJoinauditIsNotNull() {
            addCriterion("circle_joinaudit is not null");
            return (Criteria) this;
        }

        public Criteria andCircleJoinauditEqualTo(Byte value) {
            addCriterion("circle_joinaudit =", value, "circleJoinaudit");
            return (Criteria) this;
        }

        public Criteria andCircleJoinauditNotEqualTo(Byte value) {
            addCriterion("circle_joinaudit <>", value, "circleJoinaudit");
            return (Criteria) this;
        }

        public Criteria andCircleJoinauditGreaterThan(Byte value) {
            addCriterion("circle_joinaudit >", value, "circleJoinaudit");
            return (Criteria) this;
        }

        public Criteria andCircleJoinauditGreaterThanOrEqualTo(Byte value) {
            addCriterion("circle_joinaudit >=", value, "circleJoinaudit");
            return (Criteria) this;
        }

        public Criteria andCircleJoinauditLessThan(Byte value) {
            addCriterion("circle_joinaudit <", value, "circleJoinaudit");
            return (Criteria) this;
        }

        public Criteria andCircleJoinauditLessThanOrEqualTo(Byte value) {
            addCriterion("circle_joinaudit <=", value, "circleJoinaudit");
            return (Criteria) this;
        }

        public Criteria andCircleJoinauditIn(List<Byte> values) {
            addCriterion("circle_joinaudit in", values, "circleJoinaudit");
            return (Criteria) this;
        }

        public Criteria andCircleJoinauditNotIn(List<Byte> values) {
            addCriterion("circle_joinaudit not in", values, "circleJoinaudit");
            return (Criteria) this;
        }

        public Criteria andCircleJoinauditBetween(Byte value1, Byte value2) {
            addCriterion("circle_joinaudit between", value1, value2, "circleJoinaudit");
            return (Criteria) this;
        }

        public Criteria andCircleJoinauditNotBetween(Byte value1, Byte value2) {
            addCriterion("circle_joinaudit not between", value1, value2, "circleJoinaudit");
            return (Criteria) this;
        }

        public Criteria andCircleAddtimeIsNull() {
            addCriterion("circle_addtime is null");
            return (Criteria) this;
        }

        public Criteria andCircleAddtimeIsNotNull() {
            addCriterion("circle_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andCircleAddtimeEqualTo(String value) {
            addCriterion("circle_addtime =", value, "circleAddtime");
            return (Criteria) this;
        }

        public Criteria andCircleAddtimeNotEqualTo(String value) {
            addCriterion("circle_addtime <>", value, "circleAddtime");
            return (Criteria) this;
        }

        public Criteria andCircleAddtimeGreaterThan(String value) {
            addCriterion("circle_addtime >", value, "circleAddtime");
            return (Criteria) this;
        }

        public Criteria andCircleAddtimeGreaterThanOrEqualTo(String value) {
            addCriterion("circle_addtime >=", value, "circleAddtime");
            return (Criteria) this;
        }

        public Criteria andCircleAddtimeLessThan(String value) {
            addCriterion("circle_addtime <", value, "circleAddtime");
            return (Criteria) this;
        }

        public Criteria andCircleAddtimeLessThanOrEqualTo(String value) {
            addCriterion("circle_addtime <=", value, "circleAddtime");
            return (Criteria) this;
        }

        public Criteria andCircleAddtimeLike(String value) {
            addCriterion("circle_addtime like", value, "circleAddtime");
            return (Criteria) this;
        }

        public Criteria andCircleAddtimeNotLike(String value) {
            addCriterion("circle_addtime not like", value, "circleAddtime");
            return (Criteria) this;
        }

        public Criteria andCircleAddtimeIn(List<String> values) {
            addCriterion("circle_addtime in", values, "circleAddtime");
            return (Criteria) this;
        }

        public Criteria andCircleAddtimeNotIn(List<String> values) {
            addCriterion("circle_addtime not in", values, "circleAddtime");
            return (Criteria) this;
        }

        public Criteria andCircleAddtimeBetween(String value1, String value2) {
            addCriterion("circle_addtime between", value1, value2, "circleAddtime");
            return (Criteria) this;
        }

        public Criteria andCircleAddtimeNotBetween(String value1, String value2) {
            addCriterion("circle_addtime not between", value1, value2, "circleAddtime");
            return (Criteria) this;
        }

        public Criteria andCircleNoticetimeIsNull() {
            addCriterion("circle_noticetime is null");
            return (Criteria) this;
        }

        public Criteria andCircleNoticetimeIsNotNull() {
            addCriterion("circle_noticetime is not null");
            return (Criteria) this;
        }

        public Criteria andCircleNoticetimeEqualTo(String value) {
            addCriterion("circle_noticetime =", value, "circleNoticetime");
            return (Criteria) this;
        }

        public Criteria andCircleNoticetimeNotEqualTo(String value) {
            addCriterion("circle_noticetime <>", value, "circleNoticetime");
            return (Criteria) this;
        }

        public Criteria andCircleNoticetimeGreaterThan(String value) {
            addCriterion("circle_noticetime >", value, "circleNoticetime");
            return (Criteria) this;
        }

        public Criteria andCircleNoticetimeGreaterThanOrEqualTo(String value) {
            addCriterion("circle_noticetime >=", value, "circleNoticetime");
            return (Criteria) this;
        }

        public Criteria andCircleNoticetimeLessThan(String value) {
            addCriterion("circle_noticetime <", value, "circleNoticetime");
            return (Criteria) this;
        }

        public Criteria andCircleNoticetimeLessThanOrEqualTo(String value) {
            addCriterion("circle_noticetime <=", value, "circleNoticetime");
            return (Criteria) this;
        }

        public Criteria andCircleNoticetimeLike(String value) {
            addCriterion("circle_noticetime like", value, "circleNoticetime");
            return (Criteria) this;
        }

        public Criteria andCircleNoticetimeNotLike(String value) {
            addCriterion("circle_noticetime not like", value, "circleNoticetime");
            return (Criteria) this;
        }

        public Criteria andCircleNoticetimeIn(List<String> values) {
            addCriterion("circle_noticetime in", values, "circleNoticetime");
            return (Criteria) this;
        }

        public Criteria andCircleNoticetimeNotIn(List<String> values) {
            addCriterion("circle_noticetime not in", values, "circleNoticetime");
            return (Criteria) this;
        }

        public Criteria andCircleNoticetimeBetween(String value1, String value2) {
            addCriterion("circle_noticetime between", value1, value2, "circleNoticetime");
            return (Criteria) this;
        }

        public Criteria andCircleNoticetimeNotBetween(String value1, String value2) {
            addCriterion("circle_noticetime not between", value1, value2, "circleNoticetime");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNull() {
            addCriterion("is_recommend is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNotNull() {
            addCriterion("is_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendEqualTo(Byte value) {
            addCriterion("is_recommend =", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotEqualTo(Byte value) {
            addCriterion("is_recommend <>", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThan(Byte value) {
            addCriterion("is_recommend >", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_recommend >=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThan(Byte value) {
            addCriterion("is_recommend <", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThanOrEqualTo(Byte value) {
            addCriterion("is_recommend <=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIn(List<Byte> values) {
            addCriterion("is_recommend in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotIn(List<Byte> values) {
            addCriterion("is_recommend not in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendBetween(Byte value1, Byte value2) {
            addCriterion("is_recommend between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotBetween(Byte value1, Byte value2) {
            addCriterion("is_recommend not between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(Byte value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(Byte value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(Byte value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(Byte value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(Byte value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<Byte> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<Byte> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(Byte value1, Byte value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(Byte value1, Byte value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andCircleTagIsNull() {
            addCriterion("circle_tag is null");
            return (Criteria) this;
        }

        public Criteria andCircleTagIsNotNull() {
            addCriterion("circle_tag is not null");
            return (Criteria) this;
        }

        public Criteria andCircleTagEqualTo(String value) {
            addCriterion("circle_tag =", value, "circleTag");
            return (Criteria) this;
        }

        public Criteria andCircleTagNotEqualTo(String value) {
            addCriterion("circle_tag <>", value, "circleTag");
            return (Criteria) this;
        }

        public Criteria andCircleTagGreaterThan(String value) {
            addCriterion("circle_tag >", value, "circleTag");
            return (Criteria) this;
        }

        public Criteria andCircleTagGreaterThanOrEqualTo(String value) {
            addCriterion("circle_tag >=", value, "circleTag");
            return (Criteria) this;
        }

        public Criteria andCircleTagLessThan(String value) {
            addCriterion("circle_tag <", value, "circleTag");
            return (Criteria) this;
        }

        public Criteria andCircleTagLessThanOrEqualTo(String value) {
            addCriterion("circle_tag <=", value, "circleTag");
            return (Criteria) this;
        }

        public Criteria andCircleTagLike(String value) {
            addCriterion("circle_tag like", value, "circleTag");
            return (Criteria) this;
        }

        public Criteria andCircleTagNotLike(String value) {
            addCriterion("circle_tag not like", value, "circleTag");
            return (Criteria) this;
        }

        public Criteria andCircleTagIn(List<String> values) {
            addCriterion("circle_tag in", values, "circleTag");
            return (Criteria) this;
        }

        public Criteria andCircleTagNotIn(List<String> values) {
            addCriterion("circle_tag not in", values, "circleTag");
            return (Criteria) this;
        }

        public Criteria andCircleTagBetween(String value1, String value2) {
            addCriterion("circle_tag between", value1, value2, "circleTag");
            return (Criteria) this;
        }

        public Criteria andCircleTagNotBetween(String value1, String value2) {
            addCriterion("circle_tag not between", value1, value2, "circleTag");
            return (Criteria) this;
        }

        public Criteria andNewVerifycountIsNull() {
            addCriterion("new_verifycount is null");
            return (Criteria) this;
        }

        public Criteria andNewVerifycountIsNotNull() {
            addCriterion("new_verifycount is not null");
            return (Criteria) this;
        }

        public Criteria andNewVerifycountEqualTo(Integer value) {
            addCriterion("new_verifycount =", value, "newVerifycount");
            return (Criteria) this;
        }

        public Criteria andNewVerifycountNotEqualTo(Integer value) {
            addCriterion("new_verifycount <>", value, "newVerifycount");
            return (Criteria) this;
        }

        public Criteria andNewVerifycountGreaterThan(Integer value) {
            addCriterion("new_verifycount >", value, "newVerifycount");
            return (Criteria) this;
        }

        public Criteria andNewVerifycountGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_verifycount >=", value, "newVerifycount");
            return (Criteria) this;
        }

        public Criteria andNewVerifycountLessThan(Integer value) {
            addCriterion("new_verifycount <", value, "newVerifycount");
            return (Criteria) this;
        }

        public Criteria andNewVerifycountLessThanOrEqualTo(Integer value) {
            addCriterion("new_verifycount <=", value, "newVerifycount");
            return (Criteria) this;
        }

        public Criteria andNewVerifycountIn(List<Integer> values) {
            addCriterion("new_verifycount in", values, "newVerifycount");
            return (Criteria) this;
        }

        public Criteria andNewVerifycountNotIn(List<Integer> values) {
            addCriterion("new_verifycount not in", values, "newVerifycount");
            return (Criteria) this;
        }

        public Criteria andNewVerifycountBetween(Integer value1, Integer value2) {
            addCriterion("new_verifycount between", value1, value2, "newVerifycount");
            return (Criteria) this;
        }

        public Criteria andNewVerifycountNotBetween(Integer value1, Integer value2) {
            addCriterion("new_verifycount not between", value1, value2, "newVerifycount");
            return (Criteria) this;
        }

        public Criteria andNewInformcountIsNull() {
            addCriterion("new_informcount is null");
            return (Criteria) this;
        }

        public Criteria andNewInformcountIsNotNull() {
            addCriterion("new_informcount is not null");
            return (Criteria) this;
        }

        public Criteria andNewInformcountEqualTo(Integer value) {
            addCriterion("new_informcount =", value, "newInformcount");
            return (Criteria) this;
        }

        public Criteria andNewInformcountNotEqualTo(Integer value) {
            addCriterion("new_informcount <>", value, "newInformcount");
            return (Criteria) this;
        }

        public Criteria andNewInformcountGreaterThan(Integer value) {
            addCriterion("new_informcount >", value, "newInformcount");
            return (Criteria) this;
        }

        public Criteria andNewInformcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_informcount >=", value, "newInformcount");
            return (Criteria) this;
        }

        public Criteria andNewInformcountLessThan(Integer value) {
            addCriterion("new_informcount <", value, "newInformcount");
            return (Criteria) this;
        }

        public Criteria andNewInformcountLessThanOrEqualTo(Integer value) {
            addCriterion("new_informcount <=", value, "newInformcount");
            return (Criteria) this;
        }

        public Criteria andNewInformcountIn(List<Integer> values) {
            addCriterion("new_informcount in", values, "newInformcount");
            return (Criteria) this;
        }

        public Criteria andNewInformcountNotIn(List<Integer> values) {
            addCriterion("new_informcount not in", values, "newInformcount");
            return (Criteria) this;
        }

        public Criteria andNewInformcountBetween(Integer value1, Integer value2) {
            addCriterion("new_informcount between", value1, value2, "newInformcount");
            return (Criteria) this;
        }

        public Criteria andNewInformcountNotBetween(Integer value1, Integer value2) {
            addCriterion("new_informcount not between", value1, value2, "newInformcount");
            return (Criteria) this;
        }

        public Criteria andMapplyOpenIsNull() {
            addCriterion("mapply_open is null");
            return (Criteria) this;
        }

        public Criteria andMapplyOpenIsNotNull() {
            addCriterion("mapply_open is not null");
            return (Criteria) this;
        }

        public Criteria andMapplyOpenEqualTo(Byte value) {
            addCriterion("mapply_open =", value, "mapplyOpen");
            return (Criteria) this;
        }

        public Criteria andMapplyOpenNotEqualTo(Byte value) {
            addCriterion("mapply_open <>", value, "mapplyOpen");
            return (Criteria) this;
        }

        public Criteria andMapplyOpenGreaterThan(Byte value) {
            addCriterion("mapply_open >", value, "mapplyOpen");
            return (Criteria) this;
        }

        public Criteria andMapplyOpenGreaterThanOrEqualTo(Byte value) {
            addCriterion("mapply_open >=", value, "mapplyOpen");
            return (Criteria) this;
        }

        public Criteria andMapplyOpenLessThan(Byte value) {
            addCriterion("mapply_open <", value, "mapplyOpen");
            return (Criteria) this;
        }

        public Criteria andMapplyOpenLessThanOrEqualTo(Byte value) {
            addCriterion("mapply_open <=", value, "mapplyOpen");
            return (Criteria) this;
        }

        public Criteria andMapplyOpenIn(List<Byte> values) {
            addCriterion("mapply_open in", values, "mapplyOpen");
            return (Criteria) this;
        }

        public Criteria andMapplyOpenNotIn(List<Byte> values) {
            addCriterion("mapply_open not in", values, "mapplyOpen");
            return (Criteria) this;
        }

        public Criteria andMapplyOpenBetween(Byte value1, Byte value2) {
            addCriterion("mapply_open between", value1, value2, "mapplyOpen");
            return (Criteria) this;
        }

        public Criteria andMapplyOpenNotBetween(Byte value1, Byte value2) {
            addCriterion("mapply_open not between", value1, value2, "mapplyOpen");
            return (Criteria) this;
        }

        public Criteria andMapplyMlIsNull() {
            addCriterion("mapply_ml is null");
            return (Criteria) this;
        }

        public Criteria andMapplyMlIsNotNull() {
            addCriterion("mapply_ml is not null");
            return (Criteria) this;
        }

        public Criteria andMapplyMlEqualTo(Byte value) {
            addCriterion("mapply_ml =", value, "mapplyMl");
            return (Criteria) this;
        }

        public Criteria andMapplyMlNotEqualTo(Byte value) {
            addCriterion("mapply_ml <>", value, "mapplyMl");
            return (Criteria) this;
        }

        public Criteria andMapplyMlGreaterThan(Byte value) {
            addCriterion("mapply_ml >", value, "mapplyMl");
            return (Criteria) this;
        }

        public Criteria andMapplyMlGreaterThanOrEqualTo(Byte value) {
            addCriterion("mapply_ml >=", value, "mapplyMl");
            return (Criteria) this;
        }

        public Criteria andMapplyMlLessThan(Byte value) {
            addCriterion("mapply_ml <", value, "mapplyMl");
            return (Criteria) this;
        }

        public Criteria andMapplyMlLessThanOrEqualTo(Byte value) {
            addCriterion("mapply_ml <=", value, "mapplyMl");
            return (Criteria) this;
        }

        public Criteria andMapplyMlIn(List<Byte> values) {
            addCriterion("mapply_ml in", values, "mapplyMl");
            return (Criteria) this;
        }

        public Criteria andMapplyMlNotIn(List<Byte> values) {
            addCriterion("mapply_ml not in", values, "mapplyMl");
            return (Criteria) this;
        }

        public Criteria andMapplyMlBetween(Byte value1, Byte value2) {
            addCriterion("mapply_ml between", value1, value2, "mapplyMl");
            return (Criteria) this;
        }

        public Criteria andMapplyMlNotBetween(Byte value1, Byte value2) {
            addCriterion("mapply_ml not between", value1, value2, "mapplyMl");
            return (Criteria) this;
        }

        public Criteria andNewMapplycountIsNull() {
            addCriterion("new_mapplycount is null");
            return (Criteria) this;
        }

        public Criteria andNewMapplycountIsNotNull() {
            addCriterion("new_mapplycount is not null");
            return (Criteria) this;
        }

        public Criteria andNewMapplycountEqualTo(Integer value) {
            addCriterion("new_mapplycount =", value, "newMapplycount");
            return (Criteria) this;
        }

        public Criteria andNewMapplycountNotEqualTo(Integer value) {
            addCriterion("new_mapplycount <>", value, "newMapplycount");
            return (Criteria) this;
        }

        public Criteria andNewMapplycountGreaterThan(Integer value) {
            addCriterion("new_mapplycount >", value, "newMapplycount");
            return (Criteria) this;
        }

        public Criteria andNewMapplycountGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_mapplycount >=", value, "newMapplycount");
            return (Criteria) this;
        }

        public Criteria andNewMapplycountLessThan(Integer value) {
            addCriterion("new_mapplycount <", value, "newMapplycount");
            return (Criteria) this;
        }

        public Criteria andNewMapplycountLessThanOrEqualTo(Integer value) {
            addCriterion("new_mapplycount <=", value, "newMapplycount");
            return (Criteria) this;
        }

        public Criteria andNewMapplycountIn(List<Integer> values) {
            addCriterion("new_mapplycount in", values, "newMapplycount");
            return (Criteria) this;
        }

        public Criteria andNewMapplycountNotIn(List<Integer> values) {
            addCriterion("new_mapplycount not in", values, "newMapplycount");
            return (Criteria) this;
        }

        public Criteria andNewMapplycountBetween(Integer value1, Integer value2) {
            addCriterion("new_mapplycount between", value1, value2, "newMapplycount");
            return (Criteria) this;
        }

        public Criteria andNewMapplycountNotBetween(Integer value1, Integer value2) {
            addCriterion("new_mapplycount not between", value1, value2, "newMapplycount");
            return (Criteria) this;
        }

        public Criteria andCircleTypeIsNull() {
            addCriterion("circle_type is null");
            return (Criteria) this;
        }

        public Criteria andCircleTypeIsNotNull() {
            addCriterion("circle_type is not null");
            return (Criteria) this;
        }

        public Criteria andCircleTypeEqualTo(Byte value) {
            addCriterion("circle_type =", value, "circleType");
            return (Criteria) this;
        }

        public Criteria andCircleTypeNotEqualTo(Byte value) {
            addCriterion("circle_type <>", value, "circleType");
            return (Criteria) this;
        }

        public Criteria andCircleTypeGreaterThan(Byte value) {
            addCriterion("circle_type >", value, "circleType");
            return (Criteria) this;
        }

        public Criteria andCircleTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("circle_type >=", value, "circleType");
            return (Criteria) this;
        }

        public Criteria andCircleTypeLessThan(Byte value) {
            addCriterion("circle_type <", value, "circleType");
            return (Criteria) this;
        }

        public Criteria andCircleTypeLessThanOrEqualTo(Byte value) {
            addCriterion("circle_type <=", value, "circleType");
            return (Criteria) this;
        }

        public Criteria andCircleTypeIn(List<Byte> values) {
            addCriterion("circle_type in", values, "circleType");
            return (Criteria) this;
        }

        public Criteria andCircleTypeNotIn(List<Byte> values) {
            addCriterion("circle_type not in", values, "circleType");
            return (Criteria) this;
        }

        public Criteria andCircleTypeBetween(Byte value1, Byte value2) {
            addCriterion("circle_type between", value1, value2, "circleType");
            return (Criteria) this;
        }

        public Criteria andCircleTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("circle_type not between", value1, value2, "circleType");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdIsNull() {
            addCriterion("parent_circle_id is null");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdIsNotNull() {
            addCriterion("parent_circle_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdEqualTo(Integer value) {
            addCriterion("parent_circle_id =", value, "parentCircleId");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdNotEqualTo(Integer value) {
            addCriterion("parent_circle_id <>", value, "parentCircleId");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdGreaterThan(Integer value) {
            addCriterion("parent_circle_id >", value, "parentCircleId");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_circle_id >=", value, "parentCircleId");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdLessThan(Integer value) {
            addCriterion("parent_circle_id <", value, "parentCircleId");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_circle_id <=", value, "parentCircleId");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdIn(List<Integer> values) {
            addCriterion("parent_circle_id in", values, "parentCircleId");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdNotIn(List<Integer> values) {
            addCriterion("parent_circle_id not in", values, "parentCircleId");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_circle_id between", value1, value2, "parentCircleId");
            return (Criteria) this;
        }

        public Criteria andParentCircleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_circle_id not between", value1, value2, "parentCircleId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andRespIdIsNull() {
            addCriterion("resp_id is null");
            return (Criteria) this;
        }

        public Criteria andRespIdIsNotNull() {
            addCriterion("resp_id is not null");
            return (Criteria) this;
        }

        public Criteria andRespIdEqualTo(Integer value) {
            addCriterion("resp_id =", value, "respId");
            return (Criteria) this;
        }

        public Criteria andRespIdNotEqualTo(Integer value) {
            addCriterion("resp_id <>", value, "respId");
            return (Criteria) this;
        }

        public Criteria andRespIdGreaterThan(Integer value) {
            addCriterion("resp_id >", value, "respId");
            return (Criteria) this;
        }

        public Criteria andRespIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resp_id >=", value, "respId");
            return (Criteria) this;
        }

        public Criteria andRespIdLessThan(Integer value) {
            addCriterion("resp_id <", value, "respId");
            return (Criteria) this;
        }

        public Criteria andRespIdLessThanOrEqualTo(Integer value) {
            addCriterion("resp_id <=", value, "respId");
            return (Criteria) this;
        }

        public Criteria andRespIdIn(List<Integer> values) {
            addCriterion("resp_id in", values, "respId");
            return (Criteria) this;
        }

        public Criteria andRespIdNotIn(List<Integer> values) {
            addCriterion("resp_id not in", values, "respId");
            return (Criteria) this;
        }

        public Criteria andRespIdBetween(Integer value1, Integer value2) {
            addCriterion("resp_id between", value1, value2, "respId");
            return (Criteria) this;
        }

        public Criteria andRespIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resp_id not between", value1, value2, "respId");
            return (Criteria) this;
        }

        public Criteria andRespNameIsNull() {
            addCriterion("resp_name is null");
            return (Criteria) this;
        }

        public Criteria andRespNameIsNotNull() {
            addCriterion("resp_name is not null");
            return (Criteria) this;
        }

        public Criteria andRespNameEqualTo(String value) {
            addCriterion("resp_name =", value, "respName");
            return (Criteria) this;
        }

        public Criteria andRespNameNotEqualTo(String value) {
            addCriterion("resp_name <>", value, "respName");
            return (Criteria) this;
        }

        public Criteria andRespNameGreaterThan(String value) {
            addCriterion("resp_name >", value, "respName");
            return (Criteria) this;
        }

        public Criteria andRespNameGreaterThanOrEqualTo(String value) {
            addCriterion("resp_name >=", value, "respName");
            return (Criteria) this;
        }

        public Criteria andRespNameLessThan(String value) {
            addCriterion("resp_name <", value, "respName");
            return (Criteria) this;
        }

        public Criteria andRespNameLessThanOrEqualTo(String value) {
            addCriterion("resp_name <=", value, "respName");
            return (Criteria) this;
        }

        public Criteria andRespNameLike(String value) {
            addCriterion("resp_name like", value, "respName");
            return (Criteria) this;
        }

        public Criteria andRespNameNotLike(String value) {
            addCriterion("resp_name not like", value, "respName");
            return (Criteria) this;
        }

        public Criteria andRespNameIn(List<String> values) {
            addCriterion("resp_name in", values, "respName");
            return (Criteria) this;
        }

        public Criteria andRespNameNotIn(List<String> values) {
            addCriterion("resp_name not in", values, "respName");
            return (Criteria) this;
        }

        public Criteria andRespNameBetween(String value1, String value2) {
            addCriterion("resp_name between", value1, value2, "respName");
            return (Criteria) this;
        }

        public Criteria andRespNameNotBetween(String value1, String value2) {
            addCriterion("resp_name not between", value1, value2, "respName");
            return (Criteria) this;
        }

        public Criteria andRespMobileIsNull() {
            addCriterion("resp_mobile is null");
            return (Criteria) this;
        }

        public Criteria andRespMobileIsNotNull() {
            addCriterion("resp_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andRespMobileEqualTo(String value) {
            addCriterion("resp_mobile =", value, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileNotEqualTo(String value) {
            addCriterion("resp_mobile <>", value, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileGreaterThan(String value) {
            addCriterion("resp_mobile >", value, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileGreaterThanOrEqualTo(String value) {
            addCriterion("resp_mobile >=", value, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileLessThan(String value) {
            addCriterion("resp_mobile <", value, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileLessThanOrEqualTo(String value) {
            addCriterion("resp_mobile <=", value, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileLike(String value) {
            addCriterion("resp_mobile like", value, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileNotLike(String value) {
            addCriterion("resp_mobile not like", value, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileIn(List<String> values) {
            addCriterion("resp_mobile in", values, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileNotIn(List<String> values) {
            addCriterion("resp_mobile not in", values, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileBetween(String value1, String value2) {
            addCriterion("resp_mobile between", value1, value2, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileNotBetween(String value1, String value2) {
            addCriterion("resp_mobile not between", value1, value2, "respMobile");
            return (Criteria) this;
        }

        public Criteria andBocSortIsNull() {
            addCriterion("boc_sort is null");
            return (Criteria) this;
        }

        public Criteria andBocSortIsNotNull() {
            addCriterion("boc_sort is not null");
            return (Criteria) this;
        }

        public Criteria andBocSortEqualTo(Integer value) {
            addCriterion("boc_sort =", value, "bocSort");
            return (Criteria) this;
        }

        public Criteria andBocSortNotEqualTo(Integer value) {
            addCriterion("boc_sort <>", value, "bocSort");
            return (Criteria) this;
        }

        public Criteria andBocSortGreaterThan(Integer value) {
            addCriterion("boc_sort >", value, "bocSort");
            return (Criteria) this;
        }

        public Criteria andBocSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("boc_sort >=", value, "bocSort");
            return (Criteria) this;
        }

        public Criteria andBocSortLessThan(Integer value) {
            addCriterion("boc_sort <", value, "bocSort");
            return (Criteria) this;
        }

        public Criteria andBocSortLessThanOrEqualTo(Integer value) {
            addCriterion("boc_sort <=", value, "bocSort");
            return (Criteria) this;
        }

        public Criteria andBocSortIn(List<Integer> values) {
            addCriterion("boc_sort in", values, "bocSort");
            return (Criteria) this;
        }

        public Criteria andBocSortNotIn(List<Integer> values) {
            addCriterion("boc_sort not in", values, "bocSort");
            return (Criteria) this;
        }

        public Criteria andBocSortBetween(Integer value1, Integer value2) {
            addCriterion("boc_sort between", value1, value2, "bocSort");
            return (Criteria) this;
        }

        public Criteria andBocSortNotBetween(Integer value1, Integer value2) {
            addCriterion("boc_sort not between", value1, value2, "bocSort");
            return (Criteria) this;
        }

        public Criteria andDeptLevelIsNull() {
            addCriterion("dept_level is null");
            return (Criteria) this;
        }

        public Criteria andDeptLevelIsNotNull() {
            addCriterion("dept_level is not null");
            return (Criteria) this;
        }

        public Criteria andDeptLevelEqualTo(Byte value) {
            addCriterion("dept_level =", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelNotEqualTo(Byte value) {
            addCriterion("dept_level <>", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelGreaterThan(Byte value) {
            addCriterion("dept_level >", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("dept_level >=", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelLessThan(Byte value) {
            addCriterion("dept_level <", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelLessThanOrEqualTo(Byte value) {
            addCriterion("dept_level <=", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelIn(List<Byte> values) {
            addCriterion("dept_level in", values, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelNotIn(List<Byte> values) {
            addCriterion("dept_level not in", values, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelBetween(Byte value1, Byte value2) {
            addCriterion("dept_level between", value1, value2, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("dept_level not between", value1, value2, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andOrgCircleIdIsNull() {
            addCriterion("org_circle_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgCircleIdIsNotNull() {
            addCriterion("org_circle_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCircleIdEqualTo(Integer value) {
            addCriterion("org_circle_id =", value, "orgCircleId");
            return (Criteria) this;
        }

        public Criteria andOrgCircleIdNotEqualTo(Integer value) {
            addCriterion("org_circle_id <>", value, "orgCircleId");
            return (Criteria) this;
        }

        public Criteria andOrgCircleIdGreaterThan(Integer value) {
            addCriterion("org_circle_id >", value, "orgCircleId");
            return (Criteria) this;
        }

        public Criteria andOrgCircleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_circle_id >=", value, "orgCircleId");
            return (Criteria) this;
        }

        public Criteria andOrgCircleIdLessThan(Integer value) {
            addCriterion("org_circle_id <", value, "orgCircleId");
            return (Criteria) this;
        }

        public Criteria andOrgCircleIdLessThanOrEqualTo(Integer value) {
            addCriterion("org_circle_id <=", value, "orgCircleId");
            return (Criteria) this;
        }

        public Criteria andOrgCircleIdIn(List<Integer> values) {
            addCriterion("org_circle_id in", values, "orgCircleId");
            return (Criteria) this;
        }

        public Criteria andOrgCircleIdNotIn(List<Integer> values) {
            addCriterion("org_circle_id not in", values, "orgCircleId");
            return (Criteria) this;
        }

        public Criteria andOrgCircleIdBetween(Integer value1, Integer value2) {
            addCriterion("org_circle_id between", value1, value2, "orgCircleId");
            return (Criteria) this;
        }

        public Criteria andOrgCircleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("org_circle_id not between", value1, value2, "orgCircleId");
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
    }

    /**
     * 描述:sy_circle表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2017-10-19
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_circle 2017-10-19
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