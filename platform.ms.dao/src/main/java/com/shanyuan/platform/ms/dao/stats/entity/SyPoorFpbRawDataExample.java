package com.shanyuan.platform.ms.dao.stats.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyPoorFpbRawDataExample {
    /**
     * sy_poor_fpb_raw_data
     */
    protected String orderByClause;

    /**
     * sy_poor_fpb_raw_data
     */
    protected boolean distinct;

    /**
     * sy_poor_fpb_raw_data
     */
    protected List<Criteria> oredCriteria;

    public SyPoorFpbRawDataExample() {
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
     * sy_poor_fpb_raw_data 2017-11-10
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

        public Criteria andRecIdIsNull() {
            addCriterion("rec_id is null");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNotNull() {
            addCriterion("rec_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecIdEqualTo(Integer value) {
            addCriterion("rec_id =", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotEqualTo(Integer value) {
            addCriterion("rec_id <>", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThan(Integer value) {
            addCriterion("rec_id >", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_id >=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThan(Integer value) {
            addCriterion("rec_id <", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThanOrEqualTo(Integer value) {
            addCriterion("rec_id <=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdIn(List<Integer> values) {
            addCriterion("rec_id in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotIn(List<Integer> values) {
            addCriterion("rec_id not in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdBetween(Integer value1, Integer value2) {
            addCriterion("rec_id between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_id not between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("id_type is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("id_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(Byte value) {
            addCriterion("id_type =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(Byte value) {
            addCriterion("id_type <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(Byte value) {
            addCriterion("id_type >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("id_type >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(Byte value) {
            addCriterion("id_type <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(Byte value) {
            addCriterion("id_type <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<Byte> values) {
            addCriterion("id_type in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<Byte> values) {
            addCriterion("id_type not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(Byte value1, Byte value2) {
            addCriterion("id_type between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("id_type not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdValueIsNull() {
            addCriterion("id_value is null");
            return (Criteria) this;
        }

        public Criteria andIdValueIsNotNull() {
            addCriterion("id_value is not null");
            return (Criteria) this;
        }

        public Criteria andIdValueEqualTo(String value) {
            addCriterion("id_value =", value, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueNotEqualTo(String value) {
            addCriterion("id_value <>", value, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueGreaterThan(String value) {
            addCriterion("id_value >", value, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueGreaterThanOrEqualTo(String value) {
            addCriterion("id_value >=", value, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueLessThan(String value) {
            addCriterion("id_value <", value, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueLessThanOrEqualTo(String value) {
            addCriterion("id_value <=", value, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueLike(String value) {
            addCriterion("id_value like", value, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueNotLike(String value) {
            addCriterion("id_value not like", value, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueIn(List<String> values) {
            addCriterion("id_value in", values, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueNotIn(List<String> values) {
            addCriterion("id_value not in", values, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueBetween(String value1, String value2) {
            addCriterion("id_value between", value1, value2, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueNotBetween(String value1, String value2) {
            addCriterion("id_value not between", value1, value2, "idValue");
            return (Criteria) this;
        }

        public Criteria andMemberSexIsNull() {
            addCriterion("member_sex is null");
            return (Criteria) this;
        }

        public Criteria andMemberSexIsNotNull() {
            addCriterion("member_sex is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSexEqualTo(String value) {
            addCriterion("member_sex =", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotEqualTo(String value) {
            addCriterion("member_sex <>", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThan(String value) {
            addCriterion("member_sex >", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThanOrEqualTo(String value) {
            addCriterion("member_sex >=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThan(String value) {
            addCriterion("member_sex <", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThanOrEqualTo(String value) {
            addCriterion("member_sex <=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLike(String value) {
            addCriterion("member_sex like", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotLike(String value) {
            addCriterion("member_sex not like", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexIn(List<String> values) {
            addCriterion("member_sex in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotIn(List<String> values) {
            addCriterion("member_sex not in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexBetween(String value1, String value2) {
            addCriterion("member_sex between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotBetween(String value1, String value2) {
            addCriterion("member_sex not between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andIsMasterIsNull() {
            addCriterion("is_master is null");
            return (Criteria) this;
        }

        public Criteria andIsMasterIsNotNull() {
            addCriterion("is_master is not null");
            return (Criteria) this;
        }

        public Criteria andIsMasterEqualTo(Byte value) {
            addCriterion("is_master =", value, "isMaster");
            return (Criteria) this;
        }

        public Criteria andIsMasterNotEqualTo(Byte value) {
            addCriterion("is_master <>", value, "isMaster");
            return (Criteria) this;
        }

        public Criteria andIsMasterGreaterThan(Byte value) {
            addCriterion("is_master >", value, "isMaster");
            return (Criteria) this;
        }

        public Criteria andIsMasterGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_master >=", value, "isMaster");
            return (Criteria) this;
        }

        public Criteria andIsMasterLessThan(Byte value) {
            addCriterion("is_master <", value, "isMaster");
            return (Criteria) this;
        }

        public Criteria andIsMasterLessThanOrEqualTo(Byte value) {
            addCriterion("is_master <=", value, "isMaster");
            return (Criteria) this;
        }

        public Criteria andIsMasterIn(List<Byte> values) {
            addCriterion("is_master in", values, "isMaster");
            return (Criteria) this;
        }

        public Criteria andIsMasterNotIn(List<Byte> values) {
            addCriterion("is_master not in", values, "isMaster");
            return (Criteria) this;
        }

        public Criteria andIsMasterBetween(Byte value1, Byte value2) {
            addCriterion("is_master between", value1, value2, "isMaster");
            return (Criteria) this;
        }

        public Criteria andIsMasterNotBetween(Byte value1, Byte value2) {
            addCriterion("is_master not between", value1, value2, "isMaster");
            return (Criteria) this;
        }

        public Criteria andRelationIsNull() {
            addCriterion("relation is null");
            return (Criteria) this;
        }

        public Criteria andRelationIsNotNull() {
            addCriterion("relation is not null");
            return (Criteria) this;
        }

        public Criteria andRelationEqualTo(String value) {
            addCriterion("relation =", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotEqualTo(String value) {
            addCriterion("relation <>", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThan(String value) {
            addCriterion("relation >", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThanOrEqualTo(String value) {
            addCriterion("relation >=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThan(String value) {
            addCriterion("relation <", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThanOrEqualTo(String value) {
            addCriterion("relation <=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLike(String value) {
            addCriterion("relation like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotLike(String value) {
            addCriterion("relation not like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationIn(List<String> values) {
            addCriterion("relation in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotIn(List<String> values) {
            addCriterion("relation not in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationBetween(String value1, String value2) {
            addCriterion("relation between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotBetween(String value1, String value2) {
            addCriterion("relation not between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andNationalIsNull() {
            addCriterion("national is null");
            return (Criteria) this;
        }

        public Criteria andNationalIsNotNull() {
            addCriterion("national is not null");
            return (Criteria) this;
        }

        public Criteria andNationalEqualTo(String value) {
            addCriterion("national =", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotEqualTo(String value) {
            addCriterion("national <>", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalGreaterThan(String value) {
            addCriterion("national >", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalGreaterThanOrEqualTo(String value) {
            addCriterion("national >=", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLessThan(String value) {
            addCriterion("national <", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLessThanOrEqualTo(String value) {
            addCriterion("national <=", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLike(String value) {
            addCriterion("national like", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotLike(String value) {
            addCriterion("national not like", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalIn(List<String> values) {
            addCriterion("national in", values, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotIn(List<String> values) {
            addCriterion("national not in", values, "national");
            return (Criteria) this;
        }

        public Criteria andNationalBetween(String value1, String value2) {
            addCriterion("national between", value1, value2, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotBetween(String value1, String value2) {
            addCriterion("national not between", value1, value2, "national");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Integer value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Integer value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Integer value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Integer value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Integer value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Integer> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Integer> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Integer value1, Integer value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Integer value1, Integer value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andStudentIsNull() {
            addCriterion("student is null");
            return (Criteria) this;
        }

        public Criteria andStudentIsNotNull() {
            addCriterion("student is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEqualTo(String value) {
            addCriterion("student =", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentNotEqualTo(String value) {
            addCriterion("student <>", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentGreaterThan(String value) {
            addCriterion("student >", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentGreaterThanOrEqualTo(String value) {
            addCriterion("student >=", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentLessThan(String value) {
            addCriterion("student <", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentLessThanOrEqualTo(String value) {
            addCriterion("student <=", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentLike(String value) {
            addCriterion("student like", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentNotLike(String value) {
            addCriterion("student not like", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentIn(List<String> values) {
            addCriterion("student in", values, "student");
            return (Criteria) this;
        }

        public Criteria andStudentNotIn(List<String> values) {
            addCriterion("student not in", values, "student");
            return (Criteria) this;
        }

        public Criteria andStudentBetween(String value1, String value2) {
            addCriterion("student between", value1, value2, "student");
            return (Criteria) this;
        }

        public Criteria andStudentNotBetween(String value1, String value2) {
            addCriterion("student not between", value1, value2, "student");
            return (Criteria) this;
        }

        public Criteria andHealthIsNull() {
            addCriterion("health is null");
            return (Criteria) this;
        }

        public Criteria andHealthIsNotNull() {
            addCriterion("health is not null");
            return (Criteria) this;
        }

        public Criteria andHealthEqualTo(String value) {
            addCriterion("health =", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotEqualTo(String value) {
            addCriterion("health <>", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthGreaterThan(String value) {
            addCriterion("health >", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthGreaterThanOrEqualTo(String value) {
            addCriterion("health >=", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLessThan(String value) {
            addCriterion("health <", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLessThanOrEqualTo(String value) {
            addCriterion("health <=", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLike(String value) {
            addCriterion("health like", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotLike(String value) {
            addCriterion("health not like", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthIn(List<String> values) {
            addCriterion("health in", values, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotIn(List<String> values) {
            addCriterion("health not in", values, "health");
            return (Criteria) this;
        }

        public Criteria andHealthBetween(String value1, String value2) {
            addCriterion("health between", value1, value2, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotBetween(String value1, String value2) {
            addCriterion("health not between", value1, value2, "health");
            return (Criteria) this;
        }

        public Criteria andSkillIsNull() {
            addCriterion("skill is null");
            return (Criteria) this;
        }

        public Criteria andSkillIsNotNull() {
            addCriterion("skill is not null");
            return (Criteria) this;
        }

        public Criteria andSkillEqualTo(String value) {
            addCriterion("skill =", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotEqualTo(String value) {
            addCriterion("skill <>", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillGreaterThan(String value) {
            addCriterion("skill >", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillGreaterThanOrEqualTo(String value) {
            addCriterion("skill >=", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillLessThan(String value) {
            addCriterion("skill <", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillLessThanOrEqualTo(String value) {
            addCriterion("skill <=", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillLike(String value) {
            addCriterion("skill like", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotLike(String value) {
            addCriterion("skill not like", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillIn(List<String> values) {
            addCriterion("skill in", values, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotIn(List<String> values) {
            addCriterion("skill not in", values, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillBetween(String value1, String value2) {
            addCriterion("skill between", value1, value2, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotBetween(String value1, String value2) {
            addCriterion("skill not between", value1, value2, "skill");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionIsNull() {
            addCriterion("working_condition is null");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionIsNotNull() {
            addCriterion("working_condition is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionEqualTo(String value) {
            addCriterion("working_condition =", value, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionNotEqualTo(String value) {
            addCriterion("working_condition <>", value, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionGreaterThan(String value) {
            addCriterion("working_condition >", value, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionGreaterThanOrEqualTo(String value) {
            addCriterion("working_condition >=", value, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionLessThan(String value) {
            addCriterion("working_condition <", value, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionLessThanOrEqualTo(String value) {
            addCriterion("working_condition <=", value, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionLike(String value) {
            addCriterion("working_condition like", value, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionNotLike(String value) {
            addCriterion("working_condition not like", value, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionIn(List<String> values) {
            addCriterion("working_condition in", values, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionNotIn(List<String> values) {
            addCriterion("working_condition not in", values, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionBetween(String value1, String value2) {
            addCriterion("working_condition between", value1, value2, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionNotBetween(String value1, String value2) {
            addCriterion("working_condition not between", value1, value2, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andPovertyPropIsNull() {
            addCriterion("poverty_prop is null");
            return (Criteria) this;
        }

        public Criteria andPovertyPropIsNotNull() {
            addCriterion("poverty_prop is not null");
            return (Criteria) this;
        }

        public Criteria andPovertyPropEqualTo(String value) {
            addCriterion("poverty_prop =", value, "povertyProp");
            return (Criteria) this;
        }

        public Criteria andPovertyPropNotEqualTo(String value) {
            addCriterion("poverty_prop <>", value, "povertyProp");
            return (Criteria) this;
        }

        public Criteria andPovertyPropGreaterThan(String value) {
            addCriterion("poverty_prop >", value, "povertyProp");
            return (Criteria) this;
        }

        public Criteria andPovertyPropGreaterThanOrEqualTo(String value) {
            addCriterion("poverty_prop >=", value, "povertyProp");
            return (Criteria) this;
        }

        public Criteria andPovertyPropLessThan(String value) {
            addCriterion("poverty_prop <", value, "povertyProp");
            return (Criteria) this;
        }

        public Criteria andPovertyPropLessThanOrEqualTo(String value) {
            addCriterion("poverty_prop <=", value, "povertyProp");
            return (Criteria) this;
        }

        public Criteria andPovertyPropLike(String value) {
            addCriterion("poverty_prop like", value, "povertyProp");
            return (Criteria) this;
        }

        public Criteria andPovertyPropNotLike(String value) {
            addCriterion("poverty_prop not like", value, "povertyProp");
            return (Criteria) this;
        }

        public Criteria andPovertyPropIn(List<String> values) {
            addCriterion("poverty_prop in", values, "povertyProp");
            return (Criteria) this;
        }

        public Criteria andPovertyPropNotIn(List<String> values) {
            addCriterion("poverty_prop not in", values, "povertyProp");
            return (Criteria) this;
        }

        public Criteria andPovertyPropBetween(String value1, String value2) {
            addCriterion("poverty_prop between", value1, value2, "povertyProp");
            return (Criteria) this;
        }

        public Criteria andPovertyPropNotBetween(String value1, String value2) {
            addCriterion("poverty_prop not between", value1, value2, "povertyProp");
            return (Criteria) this;
        }

        public Criteria andPoorPropIsNull() {
            addCriterion("poor_prop is null");
            return (Criteria) this;
        }

        public Criteria andPoorPropIsNotNull() {
            addCriterion("poor_prop is not null");
            return (Criteria) this;
        }

        public Criteria andPoorPropEqualTo(String value) {
            addCriterion("poor_prop =", value, "poorProp");
            return (Criteria) this;
        }

        public Criteria andPoorPropNotEqualTo(String value) {
            addCriterion("poor_prop <>", value, "poorProp");
            return (Criteria) this;
        }

        public Criteria andPoorPropGreaterThan(String value) {
            addCriterion("poor_prop >", value, "poorProp");
            return (Criteria) this;
        }

        public Criteria andPoorPropGreaterThanOrEqualTo(String value) {
            addCriterion("poor_prop >=", value, "poorProp");
            return (Criteria) this;
        }

        public Criteria andPoorPropLessThan(String value) {
            addCriterion("poor_prop <", value, "poorProp");
            return (Criteria) this;
        }

        public Criteria andPoorPropLessThanOrEqualTo(String value) {
            addCriterion("poor_prop <=", value, "poorProp");
            return (Criteria) this;
        }

        public Criteria andPoorPropLike(String value) {
            addCriterion("poor_prop like", value, "poorProp");
            return (Criteria) this;
        }

        public Criteria andPoorPropNotLike(String value) {
            addCriterion("poor_prop not like", value, "poorProp");
            return (Criteria) this;
        }

        public Criteria andPoorPropIn(List<String> values) {
            addCriterion("poor_prop in", values, "poorProp");
            return (Criteria) this;
        }

        public Criteria andPoorPropNotIn(List<String> values) {
            addCriterion("poor_prop not in", values, "poorProp");
            return (Criteria) this;
        }

        public Criteria andPoorPropBetween(String value1, String value2) {
            addCriterion("poor_prop between", value1, value2, "poorProp");
            return (Criteria) this;
        }

        public Criteria andPoorPropNotBetween(String value1, String value2) {
            addCriterion("poor_prop not between", value1, value2, "poorProp");
            return (Criteria) this;
        }

        public Criteria andMemberMobileIsNull() {
            addCriterion("member_mobile is null");
            return (Criteria) this;
        }

        public Criteria andMemberMobileIsNotNull() {
            addCriterion("member_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMemberMobileEqualTo(String value) {
            addCriterion("member_mobile =", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotEqualTo(String value) {
            addCriterion("member_mobile <>", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileGreaterThan(String value) {
            addCriterion("member_mobile >", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileGreaterThanOrEqualTo(String value) {
            addCriterion("member_mobile >=", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileLessThan(String value) {
            addCriterion("member_mobile <", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileLessThanOrEqualTo(String value) {
            addCriterion("member_mobile <=", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileLike(String value) {
            addCriterion("member_mobile like", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotLike(String value) {
            addCriterion("member_mobile not like", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileIn(List<String> values) {
            addCriterion("member_mobile in", values, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotIn(List<String> values) {
            addCriterion("member_mobile not in", values, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileBetween(String value1, String value2) {
            addCriterion("member_mobile between", value1, value2, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotBetween(String value1, String value2) {
            addCriterion("member_mobile not between", value1, value2, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andPovertyReasonIsNull() {
            addCriterion("poverty_reason is null");
            return (Criteria) this;
        }

        public Criteria andPovertyReasonIsNotNull() {
            addCriterion("poverty_reason is not null");
            return (Criteria) this;
        }

        public Criteria andPovertyReasonEqualTo(String value) {
            addCriterion("poverty_reason =", value, "povertyReason");
            return (Criteria) this;
        }

        public Criteria andPovertyReasonNotEqualTo(String value) {
            addCriterion("poverty_reason <>", value, "povertyReason");
            return (Criteria) this;
        }

        public Criteria andPovertyReasonGreaterThan(String value) {
            addCriterion("poverty_reason >", value, "povertyReason");
            return (Criteria) this;
        }

        public Criteria andPovertyReasonGreaterThanOrEqualTo(String value) {
            addCriterion("poverty_reason >=", value, "povertyReason");
            return (Criteria) this;
        }

        public Criteria andPovertyReasonLessThan(String value) {
            addCriterion("poverty_reason <", value, "povertyReason");
            return (Criteria) this;
        }

        public Criteria andPovertyReasonLessThanOrEqualTo(String value) {
            addCriterion("poverty_reason <=", value, "povertyReason");
            return (Criteria) this;
        }

        public Criteria andPovertyReasonLike(String value) {
            addCriterion("poverty_reason like", value, "povertyReason");
            return (Criteria) this;
        }

        public Criteria andPovertyReasonNotLike(String value) {
            addCriterion("poverty_reason not like", value, "povertyReason");
            return (Criteria) this;
        }

        public Criteria andPovertyReasonIn(List<String> values) {
            addCriterion("poverty_reason in", values, "povertyReason");
            return (Criteria) this;
        }

        public Criteria andPovertyReasonNotIn(List<String> values) {
            addCriterion("poverty_reason not in", values, "povertyReason");
            return (Criteria) this;
        }

        public Criteria andPovertyReasonBetween(String value1, String value2) {
            addCriterion("poverty_reason between", value1, value2, "povertyReason");
            return (Criteria) this;
        }

        public Criteria andPovertyReasonNotBetween(String value1, String value2) {
            addCriterion("poverty_reason not between", value1, value2, "povertyReason");
            return (Criteria) this;
        }

        public Criteria andIncomeYearPerPersonIsNull() {
            addCriterion("income_year_per_person is null");
            return (Criteria) this;
        }

        public Criteria andIncomeYearPerPersonIsNotNull() {
            addCriterion("income_year_per_person is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeYearPerPersonEqualTo(BigDecimal value) {
            addCriterion("income_year_per_person =", value, "incomeYearPerPerson");
            return (Criteria) this;
        }

        public Criteria andIncomeYearPerPersonNotEqualTo(BigDecimal value) {
            addCriterion("income_year_per_person <>", value, "incomeYearPerPerson");
            return (Criteria) this;
        }

        public Criteria andIncomeYearPerPersonGreaterThan(BigDecimal value) {
            addCriterion("income_year_per_person >", value, "incomeYearPerPerson");
            return (Criteria) this;
        }

        public Criteria andIncomeYearPerPersonGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("income_year_per_person >=", value, "incomeYearPerPerson");
            return (Criteria) this;
        }

        public Criteria andIncomeYearPerPersonLessThan(BigDecimal value) {
            addCriterion("income_year_per_person <", value, "incomeYearPerPerson");
            return (Criteria) this;
        }

        public Criteria andIncomeYearPerPersonLessThanOrEqualTo(BigDecimal value) {
            addCriterion("income_year_per_person <=", value, "incomeYearPerPerson");
            return (Criteria) this;
        }

        public Criteria andIncomeYearPerPersonIn(List<BigDecimal> values) {
            addCriterion("income_year_per_person in", values, "incomeYearPerPerson");
            return (Criteria) this;
        }

        public Criteria andIncomeYearPerPersonNotIn(List<BigDecimal> values) {
            addCriterion("income_year_per_person not in", values, "incomeYearPerPerson");
            return (Criteria) this;
        }

        public Criteria andIncomeYearPerPersonBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income_year_per_person between", value1, value2, "incomeYearPerPerson");
            return (Criteria) this;
        }

        public Criteria andIncomeYearPerPersonNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income_year_per_person not between", value1, value2, "incomeYearPerPerson");
            return (Criteria) this;
        }

        public Criteria andPAddr1IsNull() {
            addCriterion("p_addr1 is null");
            return (Criteria) this;
        }

        public Criteria andPAddr1IsNotNull() {
            addCriterion("p_addr1 is not null");
            return (Criteria) this;
        }

        public Criteria andPAddr1EqualTo(String value) {
            addCriterion("p_addr1 =", value, "pAddr1");
            return (Criteria) this;
        }

        public Criteria andPAddr1NotEqualTo(String value) {
            addCriterion("p_addr1 <>", value, "pAddr1");
            return (Criteria) this;
        }

        public Criteria andPAddr1GreaterThan(String value) {
            addCriterion("p_addr1 >", value, "pAddr1");
            return (Criteria) this;
        }

        public Criteria andPAddr1GreaterThanOrEqualTo(String value) {
            addCriterion("p_addr1 >=", value, "pAddr1");
            return (Criteria) this;
        }

        public Criteria andPAddr1LessThan(String value) {
            addCriterion("p_addr1 <", value, "pAddr1");
            return (Criteria) this;
        }

        public Criteria andPAddr1LessThanOrEqualTo(String value) {
            addCriterion("p_addr1 <=", value, "pAddr1");
            return (Criteria) this;
        }

        public Criteria andPAddr1Like(String value) {
            addCriterion("p_addr1 like", value, "pAddr1");
            return (Criteria) this;
        }

        public Criteria andPAddr1NotLike(String value) {
            addCriterion("p_addr1 not like", value, "pAddr1");
            return (Criteria) this;
        }

        public Criteria andPAddr1In(List<String> values) {
            addCriterion("p_addr1 in", values, "pAddr1");
            return (Criteria) this;
        }

        public Criteria andPAddr1NotIn(List<String> values) {
            addCriterion("p_addr1 not in", values, "pAddr1");
            return (Criteria) this;
        }

        public Criteria andPAddr1Between(String value1, String value2) {
            addCriterion("p_addr1 between", value1, value2, "pAddr1");
            return (Criteria) this;
        }

        public Criteria andPAddr1NotBetween(String value1, String value2) {
            addCriterion("p_addr1 not between", value1, value2, "pAddr1");
            return (Criteria) this;
        }

        public Criteria andPAddr2IsNull() {
            addCriterion("p_addr2 is null");
            return (Criteria) this;
        }

        public Criteria andPAddr2IsNotNull() {
            addCriterion("p_addr2 is not null");
            return (Criteria) this;
        }

        public Criteria andPAddr2EqualTo(String value) {
            addCriterion("p_addr2 =", value, "pAddr2");
            return (Criteria) this;
        }

        public Criteria andPAddr2NotEqualTo(String value) {
            addCriterion("p_addr2 <>", value, "pAddr2");
            return (Criteria) this;
        }

        public Criteria andPAddr2GreaterThan(String value) {
            addCriterion("p_addr2 >", value, "pAddr2");
            return (Criteria) this;
        }

        public Criteria andPAddr2GreaterThanOrEqualTo(String value) {
            addCriterion("p_addr2 >=", value, "pAddr2");
            return (Criteria) this;
        }

        public Criteria andPAddr2LessThan(String value) {
            addCriterion("p_addr2 <", value, "pAddr2");
            return (Criteria) this;
        }

        public Criteria andPAddr2LessThanOrEqualTo(String value) {
            addCriterion("p_addr2 <=", value, "pAddr2");
            return (Criteria) this;
        }

        public Criteria andPAddr2Like(String value) {
            addCriterion("p_addr2 like", value, "pAddr2");
            return (Criteria) this;
        }

        public Criteria andPAddr2NotLike(String value) {
            addCriterion("p_addr2 not like", value, "pAddr2");
            return (Criteria) this;
        }

        public Criteria andPAddr2In(List<String> values) {
            addCriterion("p_addr2 in", values, "pAddr2");
            return (Criteria) this;
        }

        public Criteria andPAddr2NotIn(List<String> values) {
            addCriterion("p_addr2 not in", values, "pAddr2");
            return (Criteria) this;
        }

        public Criteria andPAddr2Between(String value1, String value2) {
            addCriterion("p_addr2 between", value1, value2, "pAddr2");
            return (Criteria) this;
        }

        public Criteria andPAddr2NotBetween(String value1, String value2) {
            addCriterion("p_addr2 not between", value1, value2, "pAddr2");
            return (Criteria) this;
        }

        public Criteria andPAddr3IsNull() {
            addCriterion("p_addr3 is null");
            return (Criteria) this;
        }

        public Criteria andPAddr3IsNotNull() {
            addCriterion("p_addr3 is not null");
            return (Criteria) this;
        }

        public Criteria andPAddr3EqualTo(String value) {
            addCriterion("p_addr3 =", value, "pAddr3");
            return (Criteria) this;
        }

        public Criteria andPAddr3NotEqualTo(String value) {
            addCriterion("p_addr3 <>", value, "pAddr3");
            return (Criteria) this;
        }

        public Criteria andPAddr3GreaterThan(String value) {
            addCriterion("p_addr3 >", value, "pAddr3");
            return (Criteria) this;
        }

        public Criteria andPAddr3GreaterThanOrEqualTo(String value) {
            addCriterion("p_addr3 >=", value, "pAddr3");
            return (Criteria) this;
        }

        public Criteria andPAddr3LessThan(String value) {
            addCriterion("p_addr3 <", value, "pAddr3");
            return (Criteria) this;
        }

        public Criteria andPAddr3LessThanOrEqualTo(String value) {
            addCriterion("p_addr3 <=", value, "pAddr3");
            return (Criteria) this;
        }

        public Criteria andPAddr3Like(String value) {
            addCriterion("p_addr3 like", value, "pAddr3");
            return (Criteria) this;
        }

        public Criteria andPAddr3NotLike(String value) {
            addCriterion("p_addr3 not like", value, "pAddr3");
            return (Criteria) this;
        }

        public Criteria andPAddr3In(List<String> values) {
            addCriterion("p_addr3 in", values, "pAddr3");
            return (Criteria) this;
        }

        public Criteria andPAddr3NotIn(List<String> values) {
            addCriterion("p_addr3 not in", values, "pAddr3");
            return (Criteria) this;
        }

        public Criteria andPAddr3Between(String value1, String value2) {
            addCriterion("p_addr3 between", value1, value2, "pAddr3");
            return (Criteria) this;
        }

        public Criteria andPAddr3NotBetween(String value1, String value2) {
            addCriterion("p_addr3 not between", value1, value2, "pAddr3");
            return (Criteria) this;
        }

        public Criteria andPAddr4IsNull() {
            addCriterion("p_addr4 is null");
            return (Criteria) this;
        }

        public Criteria andPAddr4IsNotNull() {
            addCriterion("p_addr4 is not null");
            return (Criteria) this;
        }

        public Criteria andPAddr4EqualTo(String value) {
            addCriterion("p_addr4 =", value, "pAddr4");
            return (Criteria) this;
        }

        public Criteria andPAddr4NotEqualTo(String value) {
            addCriterion("p_addr4 <>", value, "pAddr4");
            return (Criteria) this;
        }

        public Criteria andPAddr4GreaterThan(String value) {
            addCriterion("p_addr4 >", value, "pAddr4");
            return (Criteria) this;
        }

        public Criteria andPAddr4GreaterThanOrEqualTo(String value) {
            addCriterion("p_addr4 >=", value, "pAddr4");
            return (Criteria) this;
        }

        public Criteria andPAddr4LessThan(String value) {
            addCriterion("p_addr4 <", value, "pAddr4");
            return (Criteria) this;
        }

        public Criteria andPAddr4LessThanOrEqualTo(String value) {
            addCriterion("p_addr4 <=", value, "pAddr4");
            return (Criteria) this;
        }

        public Criteria andPAddr4Like(String value) {
            addCriterion("p_addr4 like", value, "pAddr4");
            return (Criteria) this;
        }

        public Criteria andPAddr4NotLike(String value) {
            addCriterion("p_addr4 not like", value, "pAddr4");
            return (Criteria) this;
        }

        public Criteria andPAddr4In(List<String> values) {
            addCriterion("p_addr4 in", values, "pAddr4");
            return (Criteria) this;
        }

        public Criteria andPAddr4NotIn(List<String> values) {
            addCriterion("p_addr4 not in", values, "pAddr4");
            return (Criteria) this;
        }

        public Criteria andPAddr4Between(String value1, String value2) {
            addCriterion("p_addr4 between", value1, value2, "pAddr4");
            return (Criteria) this;
        }

        public Criteria andPAddr4NotBetween(String value1, String value2) {
            addCriterion("p_addr4 not between", value1, value2, "pAddr4");
            return (Criteria) this;
        }

        public Criteria andPAddr5IsNull() {
            addCriterion("p_addr5 is null");
            return (Criteria) this;
        }

        public Criteria andPAddr5IsNotNull() {
            addCriterion("p_addr5 is not null");
            return (Criteria) this;
        }

        public Criteria andPAddr5EqualTo(String value) {
            addCriterion("p_addr5 =", value, "pAddr5");
            return (Criteria) this;
        }

        public Criteria andPAddr5NotEqualTo(String value) {
            addCriterion("p_addr5 <>", value, "pAddr5");
            return (Criteria) this;
        }

        public Criteria andPAddr5GreaterThan(String value) {
            addCriterion("p_addr5 >", value, "pAddr5");
            return (Criteria) this;
        }

        public Criteria andPAddr5GreaterThanOrEqualTo(String value) {
            addCriterion("p_addr5 >=", value, "pAddr5");
            return (Criteria) this;
        }

        public Criteria andPAddr5LessThan(String value) {
            addCriterion("p_addr5 <", value, "pAddr5");
            return (Criteria) this;
        }

        public Criteria andPAddr5LessThanOrEqualTo(String value) {
            addCriterion("p_addr5 <=", value, "pAddr5");
            return (Criteria) this;
        }

        public Criteria andPAddr5Like(String value) {
            addCriterion("p_addr5 like", value, "pAddr5");
            return (Criteria) this;
        }

        public Criteria andPAddr5NotLike(String value) {
            addCriterion("p_addr5 not like", value, "pAddr5");
            return (Criteria) this;
        }

        public Criteria andPAddr5In(List<String> values) {
            addCriterion("p_addr5 in", values, "pAddr5");
            return (Criteria) this;
        }

        public Criteria andPAddr5NotIn(List<String> values) {
            addCriterion("p_addr5 not in", values, "pAddr5");
            return (Criteria) this;
        }

        public Criteria andPAddr5Between(String value1, String value2) {
            addCriterion("p_addr5 between", value1, value2, "pAddr5");
            return (Criteria) this;
        }

        public Criteria andPAddr5NotBetween(String value1, String value2) {
            addCriterion("p_addr5 not between", value1, value2, "pAddr5");
            return (Criteria) this;
        }

        public Criteria andPAddr6IsNull() {
            addCriterion("p_addr6 is null");
            return (Criteria) this;
        }

        public Criteria andPAddr6IsNotNull() {
            addCriterion("p_addr6 is not null");
            return (Criteria) this;
        }

        public Criteria andPAddr6EqualTo(String value) {
            addCriterion("p_addr6 =", value, "pAddr6");
            return (Criteria) this;
        }

        public Criteria andPAddr6NotEqualTo(String value) {
            addCriterion("p_addr6 <>", value, "pAddr6");
            return (Criteria) this;
        }

        public Criteria andPAddr6GreaterThan(String value) {
            addCriterion("p_addr6 >", value, "pAddr6");
            return (Criteria) this;
        }

        public Criteria andPAddr6GreaterThanOrEqualTo(String value) {
            addCriterion("p_addr6 >=", value, "pAddr6");
            return (Criteria) this;
        }

        public Criteria andPAddr6LessThan(String value) {
            addCriterion("p_addr6 <", value, "pAddr6");
            return (Criteria) this;
        }

        public Criteria andPAddr6LessThanOrEqualTo(String value) {
            addCriterion("p_addr6 <=", value, "pAddr6");
            return (Criteria) this;
        }

        public Criteria andPAddr6Like(String value) {
            addCriterion("p_addr6 like", value, "pAddr6");
            return (Criteria) this;
        }

        public Criteria andPAddr6NotLike(String value) {
            addCriterion("p_addr6 not like", value, "pAddr6");
            return (Criteria) this;
        }

        public Criteria andPAddr6In(List<String> values) {
            addCriterion("p_addr6 in", values, "pAddr6");
            return (Criteria) this;
        }

        public Criteria andPAddr6NotIn(List<String> values) {
            addCriterion("p_addr6 not in", values, "pAddr6");
            return (Criteria) this;
        }

        public Criteria andPAddr6Between(String value1, String value2) {
            addCriterion("p_addr6 between", value1, value2, "pAddr6");
            return (Criteria) this;
        }

        public Criteria andPAddr6NotBetween(String value1, String value2) {
            addCriterion("p_addr6 not between", value1, value2, "pAddr6");
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

        public Criteria andPoorBankAccountNumberIsNull() {
            addCriterion("poor_bank_account_number is null");
            return (Criteria) this;
        }

        public Criteria andPoorBankAccountNumberIsNotNull() {
            addCriterion("poor_bank_account_number is not null");
            return (Criteria) this;
        }

        public Criteria andPoorBankAccountNumberEqualTo(String value) {
            addCriterion("poor_bank_account_number =", value, "poorBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPoorBankAccountNumberNotEqualTo(String value) {
            addCriterion("poor_bank_account_number <>", value, "poorBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPoorBankAccountNumberGreaterThan(String value) {
            addCriterion("poor_bank_account_number >", value, "poorBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPoorBankAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("poor_bank_account_number >=", value, "poorBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPoorBankAccountNumberLessThan(String value) {
            addCriterion("poor_bank_account_number <", value, "poorBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPoorBankAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("poor_bank_account_number <=", value, "poorBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPoorBankAccountNumberLike(String value) {
            addCriterion("poor_bank_account_number like", value, "poorBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPoorBankAccountNumberNotLike(String value) {
            addCriterion("poor_bank_account_number not like", value, "poorBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPoorBankAccountNumberIn(List<String> values) {
            addCriterion("poor_bank_account_number in", values, "poorBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPoorBankAccountNumberNotIn(List<String> values) {
            addCriterion("poor_bank_account_number not in", values, "poorBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPoorBankAccountNumberBetween(String value1, String value2) {
            addCriterion("poor_bank_account_number between", value1, value2, "poorBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPoorBankAccountNumberNotBetween(String value1, String value2) {
            addCriterion("poor_bank_account_number not between", value1, value2, "poorBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPoorReceiverNameIsNull() {
            addCriterion("poor_receiver_name is null");
            return (Criteria) this;
        }

        public Criteria andPoorReceiverNameIsNotNull() {
            addCriterion("poor_receiver_name is not null");
            return (Criteria) this;
        }

        public Criteria andPoorReceiverNameEqualTo(String value) {
            addCriterion("poor_receiver_name =", value, "poorReceiverName");
            return (Criteria) this;
        }

        public Criteria andPoorReceiverNameNotEqualTo(String value) {
            addCriterion("poor_receiver_name <>", value, "poorReceiverName");
            return (Criteria) this;
        }

        public Criteria andPoorReceiverNameGreaterThan(String value) {
            addCriterion("poor_receiver_name >", value, "poorReceiverName");
            return (Criteria) this;
        }

        public Criteria andPoorReceiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("poor_receiver_name >=", value, "poorReceiverName");
            return (Criteria) this;
        }

        public Criteria andPoorReceiverNameLessThan(String value) {
            addCriterion("poor_receiver_name <", value, "poorReceiverName");
            return (Criteria) this;
        }

        public Criteria andPoorReceiverNameLessThanOrEqualTo(String value) {
            addCriterion("poor_receiver_name <=", value, "poorReceiverName");
            return (Criteria) this;
        }

        public Criteria andPoorReceiverNameLike(String value) {
            addCriterion("poor_receiver_name like", value, "poorReceiverName");
            return (Criteria) this;
        }

        public Criteria andPoorReceiverNameNotLike(String value) {
            addCriterion("poor_receiver_name not like", value, "poorReceiverName");
            return (Criteria) this;
        }

        public Criteria andPoorReceiverNameIn(List<String> values) {
            addCriterion("poor_receiver_name in", values, "poorReceiverName");
            return (Criteria) this;
        }

        public Criteria andPoorReceiverNameNotIn(List<String> values) {
            addCriterion("poor_receiver_name not in", values, "poorReceiverName");
            return (Criteria) this;
        }

        public Criteria andPoorReceiverNameBetween(String value1, String value2) {
            addCriterion("poor_receiver_name between", value1, value2, "poorReceiverName");
            return (Criteria) this;
        }

        public Criteria andPoorReceiverNameNotBetween(String value1, String value2) {
            addCriterion("poor_receiver_name not between", value1, value2, "poorReceiverName");
            return (Criteria) this;
        }

        public Criteria andPoorBankNameIsNull() {
            addCriterion("poor_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andPoorBankNameIsNotNull() {
            addCriterion("poor_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andPoorBankNameEqualTo(String value) {
            addCriterion("poor_bank_name =", value, "poorBankName");
            return (Criteria) this;
        }

        public Criteria andPoorBankNameNotEqualTo(String value) {
            addCriterion("poor_bank_name <>", value, "poorBankName");
            return (Criteria) this;
        }

        public Criteria andPoorBankNameGreaterThan(String value) {
            addCriterion("poor_bank_name >", value, "poorBankName");
            return (Criteria) this;
        }

        public Criteria andPoorBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("poor_bank_name >=", value, "poorBankName");
            return (Criteria) this;
        }

        public Criteria andPoorBankNameLessThan(String value) {
            addCriterion("poor_bank_name <", value, "poorBankName");
            return (Criteria) this;
        }

        public Criteria andPoorBankNameLessThanOrEqualTo(String value) {
            addCriterion("poor_bank_name <=", value, "poorBankName");
            return (Criteria) this;
        }

        public Criteria andPoorBankNameLike(String value) {
            addCriterion("poor_bank_name like", value, "poorBankName");
            return (Criteria) this;
        }

        public Criteria andPoorBankNameNotLike(String value) {
            addCriterion("poor_bank_name not like", value, "poorBankName");
            return (Criteria) this;
        }

        public Criteria andPoorBankNameIn(List<String> values) {
            addCriterion("poor_bank_name in", values, "poorBankName");
            return (Criteria) this;
        }

        public Criteria andPoorBankNameNotIn(List<String> values) {
            addCriterion("poor_bank_name not in", values, "poorBankName");
            return (Criteria) this;
        }

        public Criteria andPoorBankNameBetween(String value1, String value2) {
            addCriterion("poor_bank_name between", value1, value2, "poorBankName");
            return (Criteria) this;
        }

        public Criteria andPoorBankNameNotBetween(String value1, String value2) {
            addCriterion("poor_bank_name not between", value1, value2, "poorBankName");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNumIsNull() {
            addCriterion("family_member_num is null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNumIsNotNull() {
            addCriterion("family_member_num is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNumEqualTo(Byte value) {
            addCriterion("family_member_num =", value, "familyMemberNum");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNumNotEqualTo(Byte value) {
            addCriterion("family_member_num <>", value, "familyMemberNum");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNumGreaterThan(Byte value) {
            addCriterion("family_member_num >", value, "familyMemberNum");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("family_member_num >=", value, "familyMemberNum");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNumLessThan(Byte value) {
            addCriterion("family_member_num <", value, "familyMemberNum");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNumLessThanOrEqualTo(Byte value) {
            addCriterion("family_member_num <=", value, "familyMemberNum");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNumIn(List<Byte> values) {
            addCriterion("family_member_num in", values, "familyMemberNum");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNumNotIn(List<Byte> values) {
            addCriterion("family_member_num not in", values, "familyMemberNum");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNumBetween(Byte value1, Byte value2) {
            addCriterion("family_member_num between", value1, value2, "familyMemberNum");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNumNotBetween(Byte value1, Byte value2) {
            addCriterion("family_member_num not between", value1, value2, "familyMemberNum");
            return (Criteria) this;
        }

        public Criteria andMasterRecIdIsNull() {
            addCriterion("master_rec_id is null");
            return (Criteria) this;
        }

        public Criteria andMasterRecIdIsNotNull() {
            addCriterion("master_rec_id is not null");
            return (Criteria) this;
        }

        public Criteria andMasterRecIdEqualTo(Integer value) {
            addCriterion("master_rec_id =", value, "masterRecId");
            return (Criteria) this;
        }

        public Criteria andMasterRecIdNotEqualTo(Integer value) {
            addCriterion("master_rec_id <>", value, "masterRecId");
            return (Criteria) this;
        }

        public Criteria andMasterRecIdGreaterThan(Integer value) {
            addCriterion("master_rec_id >", value, "masterRecId");
            return (Criteria) this;
        }

        public Criteria andMasterRecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("master_rec_id >=", value, "masterRecId");
            return (Criteria) this;
        }

        public Criteria andMasterRecIdLessThan(Integer value) {
            addCriterion("master_rec_id <", value, "masterRecId");
            return (Criteria) this;
        }

        public Criteria andMasterRecIdLessThanOrEqualTo(Integer value) {
            addCriterion("master_rec_id <=", value, "masterRecId");
            return (Criteria) this;
        }

        public Criteria andMasterRecIdIn(List<Integer> values) {
            addCriterion("master_rec_id in", values, "masterRecId");
            return (Criteria) this;
        }

        public Criteria andMasterRecIdNotIn(List<Integer> values) {
            addCriterion("master_rec_id not in", values, "masterRecId");
            return (Criteria) this;
        }

        public Criteria andMasterRecIdBetween(Integer value1, Integer value2) {
            addCriterion("master_rec_id between", value1, value2, "masterRecId");
            return (Criteria) this;
        }

        public Criteria andMasterRecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("master_rec_id not between", value1, value2, "masterRecId");
            return (Criteria) this;
        }

        public Criteria andFamilyNoIsNull() {
            addCriterion("family_no is null");
            return (Criteria) this;
        }

        public Criteria andFamilyNoIsNotNull() {
            addCriterion("family_no is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyNoEqualTo(String value) {
            addCriterion("family_no =", value, "familyNo");
            return (Criteria) this;
        }

        public Criteria andFamilyNoNotEqualTo(String value) {
            addCriterion("family_no <>", value, "familyNo");
            return (Criteria) this;
        }

        public Criteria andFamilyNoGreaterThan(String value) {
            addCriterion("family_no >", value, "familyNo");
            return (Criteria) this;
        }

        public Criteria andFamilyNoGreaterThanOrEqualTo(String value) {
            addCriterion("family_no >=", value, "familyNo");
            return (Criteria) this;
        }

        public Criteria andFamilyNoLessThan(String value) {
            addCriterion("family_no <", value, "familyNo");
            return (Criteria) this;
        }

        public Criteria andFamilyNoLessThanOrEqualTo(String value) {
            addCriterion("family_no <=", value, "familyNo");
            return (Criteria) this;
        }

        public Criteria andFamilyNoLike(String value) {
            addCriterion("family_no like", value, "familyNo");
            return (Criteria) this;
        }

        public Criteria andFamilyNoNotLike(String value) {
            addCriterion("family_no not like", value, "familyNo");
            return (Criteria) this;
        }

        public Criteria andFamilyNoIn(List<String> values) {
            addCriterion("family_no in", values, "familyNo");
            return (Criteria) this;
        }

        public Criteria andFamilyNoNotIn(List<String> values) {
            addCriterion("family_no not in", values, "familyNo");
            return (Criteria) this;
        }

        public Criteria andFamilyNoBetween(String value1, String value2) {
            addCriterion("family_no between", value1, value2, "familyNo");
            return (Criteria) this;
        }

        public Criteria andFamilyNoNotBetween(String value1, String value2) {
            addCriterion("family_no not between", value1, value2, "familyNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoIsNull() {
            addCriterion("member_no is null");
            return (Criteria) this;
        }

        public Criteria andMemberNoIsNotNull() {
            addCriterion("member_no is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNoEqualTo(String value) {
            addCriterion("member_no =", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotEqualTo(String value) {
            addCriterion("member_no <>", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoGreaterThan(String value) {
            addCriterion("member_no >", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoGreaterThanOrEqualTo(String value) {
            addCriterion("member_no >=", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoLessThan(String value) {
            addCriterion("member_no <", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoLessThanOrEqualTo(String value) {
            addCriterion("member_no <=", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoLike(String value) {
            addCriterion("member_no like", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotLike(String value) {
            addCriterion("member_no not like", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoIn(List<String> values) {
            addCriterion("member_no in", values, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotIn(List<String> values) {
            addCriterion("member_no not in", values, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoBetween(String value1, String value2) {
            addCriterion("member_no between", value1, value2, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotBetween(String value1, String value2) {
            addCriterion("member_no not between", value1, value2, "memberNo");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andIsSoldiersFamilyIsNull() {
            addCriterion("is_soldiers_family is null");
            return (Criteria) this;
        }

        public Criteria andIsSoldiersFamilyIsNotNull() {
            addCriterion("is_soldiers_family is not null");
            return (Criteria) this;
        }

        public Criteria andIsSoldiersFamilyEqualTo(Byte value) {
            addCriterion("is_soldiers_family =", value, "isSoldiersFamily");
            return (Criteria) this;
        }

        public Criteria andIsSoldiersFamilyNotEqualTo(Byte value) {
            addCriterion("is_soldiers_family <>", value, "isSoldiersFamily");
            return (Criteria) this;
        }

        public Criteria andIsSoldiersFamilyGreaterThan(Byte value) {
            addCriterion("is_soldiers_family >", value, "isSoldiersFamily");
            return (Criteria) this;
        }

        public Criteria andIsSoldiersFamilyGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_soldiers_family >=", value, "isSoldiersFamily");
            return (Criteria) this;
        }

        public Criteria andIsSoldiersFamilyLessThan(Byte value) {
            addCriterion("is_soldiers_family <", value, "isSoldiersFamily");
            return (Criteria) this;
        }

        public Criteria andIsSoldiersFamilyLessThanOrEqualTo(Byte value) {
            addCriterion("is_soldiers_family <=", value, "isSoldiersFamily");
            return (Criteria) this;
        }

        public Criteria andIsSoldiersFamilyIn(List<Byte> values) {
            addCriterion("is_soldiers_family in", values, "isSoldiersFamily");
            return (Criteria) this;
        }

        public Criteria andIsSoldiersFamilyNotIn(List<Byte> values) {
            addCriterion("is_soldiers_family not in", values, "isSoldiersFamily");
            return (Criteria) this;
        }

        public Criteria andIsSoldiersFamilyBetween(Byte value1, Byte value2) {
            addCriterion("is_soldiers_family between", value1, value2, "isSoldiersFamily");
            return (Criteria) this;
        }

        public Criteria andIsSoldiersFamilyNotBetween(Byte value1, Byte value2) {
            addCriterion("is_soldiers_family not between", value1, value2, "isSoldiersFamily");
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

        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Byte value) {
            addCriterion("valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Byte value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Byte value) {
            addCriterion("valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Byte value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Byte value) {
            addCriterion("valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Byte value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Byte> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Byte> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Byte value1, Byte value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Byte value1, Byte value2) {
            addCriterion("valid not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andErrorIsNull() {
            addCriterion("error is null");
            return (Criteria) this;
        }

        public Criteria andErrorIsNotNull() {
            addCriterion("error is not null");
            return (Criteria) this;
        }

        public Criteria andErrorEqualTo(String value) {
            addCriterion("error =", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorNotEqualTo(String value) {
            addCriterion("error <>", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorGreaterThan(String value) {
            addCriterion("error >", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorGreaterThanOrEqualTo(String value) {
            addCriterion("error >=", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorLessThan(String value) {
            addCriterion("error <", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorLessThanOrEqualTo(String value) {
            addCriterion("error <=", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorLike(String value) {
            addCriterion("error like", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorNotLike(String value) {
            addCriterion("error not like", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorIn(List<String> values) {
            addCriterion("error in", values, "error");
            return (Criteria) this;
        }

        public Criteria andErrorNotIn(List<String> values) {
            addCriterion("error not in", values, "error");
            return (Criteria) this;
        }

        public Criteria andErrorBetween(String value1, String value2) {
            addCriterion("error between", value1, value2, "error");
            return (Criteria) this;
        }

        public Criteria andErrorNotBetween(String value1, String value2) {
            addCriterion("error not between", value1, value2, "error");
            return (Criteria) this;
        }

        public Criteria andError2IsNull() {
            addCriterion("error2 is null");
            return (Criteria) this;
        }

        public Criteria andError2IsNotNull() {
            addCriterion("error2 is not null");
            return (Criteria) this;
        }

        public Criteria andError2EqualTo(String value) {
            addCriterion("error2 =", value, "error2");
            return (Criteria) this;
        }

        public Criteria andError2NotEqualTo(String value) {
            addCriterion("error2 <>", value, "error2");
            return (Criteria) this;
        }

        public Criteria andError2GreaterThan(String value) {
            addCriterion("error2 >", value, "error2");
            return (Criteria) this;
        }

        public Criteria andError2GreaterThanOrEqualTo(String value) {
            addCriterion("error2 >=", value, "error2");
            return (Criteria) this;
        }

        public Criteria andError2LessThan(String value) {
            addCriterion("error2 <", value, "error2");
            return (Criteria) this;
        }

        public Criteria andError2LessThanOrEqualTo(String value) {
            addCriterion("error2 <=", value, "error2");
            return (Criteria) this;
        }

        public Criteria andError2Like(String value) {
            addCriterion("error2 like", value, "error2");
            return (Criteria) this;
        }

        public Criteria andError2NotLike(String value) {
            addCriterion("error2 not like", value, "error2");
            return (Criteria) this;
        }

        public Criteria andError2In(List<String> values) {
            addCriterion("error2 in", values, "error2");
            return (Criteria) this;
        }

        public Criteria andError2NotIn(List<String> values) {
            addCriterion("error2 not in", values, "error2");
            return (Criteria) this;
        }

        public Criteria andError2Between(String value1, String value2) {
            addCriterion("error2 between", value1, value2, "error2");
            return (Criteria) this;
        }

        public Criteria andError2NotBetween(String value1, String value2) {
            addCriterion("error2 not between", value1, value2, "error2");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_poor_fpb_raw_data表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2017-11-10
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_poor_fpb_raw_data 2017-11-10
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