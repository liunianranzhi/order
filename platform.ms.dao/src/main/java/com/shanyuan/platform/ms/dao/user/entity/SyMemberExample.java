package com.shanyuan.platform.ms.dao.user.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SyMemberExample {
    /**
     * sy_member
     */
    protected String orderByClause;

    /**
     * sy_member
     */
    protected boolean distinct;

    /**
     * sy_member
     */
    protected List<Criteria> oredCriteria;

    public SyMemberExample() {
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
     * sy_member 2017-10-16
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andSyIdIsNull() {
            addCriterion("sy_id is null");
            return (Criteria) this;
        }

        public Criteria andSyIdIsNotNull() {
            addCriterion("sy_id is not null");
            return (Criteria) this;
        }

        public Criteria andSyIdEqualTo(Integer value) {
            addCriterion("sy_id =", value, "syId");
            return (Criteria) this;
        }

        public Criteria andSyIdNotEqualTo(Integer value) {
            addCriterion("sy_id <>", value, "syId");
            return (Criteria) this;
        }

        public Criteria andSyIdGreaterThan(Integer value) {
            addCriterion("sy_id >", value, "syId");
            return (Criteria) this;
        }

        public Criteria andSyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sy_id >=", value, "syId");
            return (Criteria) this;
        }

        public Criteria andSyIdLessThan(Integer value) {
            addCriterion("sy_id <", value, "syId");
            return (Criteria) this;
        }

        public Criteria andSyIdLessThanOrEqualTo(Integer value) {
            addCriterion("sy_id <=", value, "syId");
            return (Criteria) this;
        }

        public Criteria andSyIdIn(List<Integer> values) {
            addCriterion("sy_id in", values, "syId");
            return (Criteria) this;
        }

        public Criteria andSyIdNotIn(List<Integer> values) {
            addCriterion("sy_id not in", values, "syId");
            return (Criteria) this;
        }

        public Criteria andSyIdBetween(Integer value1, Integer value2) {
            addCriterion("sy_id between", value1, value2, "syId");
            return (Criteria) this;
        }

        public Criteria andSyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sy_id not between", value1, value2, "syId");
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

        public Criteria andMemberDispNameIsNull() {
            addCriterion("member_disp_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameIsNotNull() {
            addCriterion("member_disp_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameEqualTo(String value) {
            addCriterion("member_disp_name =", value, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameNotEqualTo(String value) {
            addCriterion("member_disp_name <>", value, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameGreaterThan(String value) {
            addCriterion("member_disp_name >", value, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_disp_name >=", value, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameLessThan(String value) {
            addCriterion("member_disp_name <", value, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameLessThanOrEqualTo(String value) {
            addCriterion("member_disp_name <=", value, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameLike(String value) {
            addCriterion("member_disp_name like", value, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameNotLike(String value) {
            addCriterion("member_disp_name not like", value, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameIn(List<String> values) {
            addCriterion("member_disp_name in", values, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameNotIn(List<String> values) {
            addCriterion("member_disp_name not in", values, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameBetween(String value1, String value2) {
            addCriterion("member_disp_name between", value1, value2, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberDispNameNotBetween(String value1, String value2) {
            addCriterion("member_disp_name not between", value1, value2, "memberDispName");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameIsNull() {
            addCriterion("member_truename is null");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameIsNotNull() {
            addCriterion("member_truename is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameEqualTo(String value) {
            addCriterion("member_truename =", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameNotEqualTo(String value) {
            addCriterion("member_truename <>", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameGreaterThan(String value) {
            addCriterion("member_truename >", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("member_truename >=", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameLessThan(String value) {
            addCriterion("member_truename <", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameLessThanOrEqualTo(String value) {
            addCriterion("member_truename <=", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameLike(String value) {
            addCriterion("member_truename like", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameNotLike(String value) {
            addCriterion("member_truename not like", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameIn(List<String> values) {
            addCriterion("member_truename in", values, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameNotIn(List<String> values) {
            addCriterion("member_truename not in", values, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameBetween(String value1, String value2) {
            addCriterion("member_truename between", value1, value2, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameNotBetween(String value1, String value2) {
            addCriterion("member_truename not between", value1, value2, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNull() {
            addCriterion("member_type is null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNotNull() {
            addCriterion("member_type is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeEqualTo(Byte value) {
            addCriterion("member_type =", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotEqualTo(Byte value) {
            addCriterion("member_type <>", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThan(Byte value) {
            addCriterion("member_type >", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("member_type >=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThan(Byte value) {
            addCriterion("member_type <", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThanOrEqualTo(Byte value) {
            addCriterion("member_type <=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIn(List<Byte> values) {
            addCriterion("member_type in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotIn(List<Byte> values) {
            addCriterion("member_type not in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeBetween(Byte value1, Byte value2) {
            addCriterion("member_type between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("member_type not between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberIdTypeIsNull() {
            addCriterion("member_id_type is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdTypeIsNotNull() {
            addCriterion("member_id_type is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdTypeEqualTo(Byte value) {
            addCriterion("member_id_type =", value, "memberIdType");
            return (Criteria) this;
        }

        public Criteria andMemberIdTypeNotEqualTo(Byte value) {
            addCriterion("member_id_type <>", value, "memberIdType");
            return (Criteria) this;
        }

        public Criteria andMemberIdTypeGreaterThan(Byte value) {
            addCriterion("member_id_type >", value, "memberIdType");
            return (Criteria) this;
        }

        public Criteria andMemberIdTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("member_id_type >=", value, "memberIdType");
            return (Criteria) this;
        }

        public Criteria andMemberIdTypeLessThan(Byte value) {
            addCriterion("member_id_type <", value, "memberIdType");
            return (Criteria) this;
        }

        public Criteria andMemberIdTypeLessThanOrEqualTo(Byte value) {
            addCriterion("member_id_type <=", value, "memberIdType");
            return (Criteria) this;
        }

        public Criteria andMemberIdTypeIn(List<Byte> values) {
            addCriterion("member_id_type in", values, "memberIdType");
            return (Criteria) this;
        }

        public Criteria andMemberIdTypeNotIn(List<Byte> values) {
            addCriterion("member_id_type not in", values, "memberIdType");
            return (Criteria) this;
        }

        public Criteria andMemberIdTypeBetween(Byte value1, Byte value2) {
            addCriterion("member_id_type between", value1, value2, "memberIdType");
            return (Criteria) this;
        }

        public Criteria andMemberIdTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("member_id_type not between", value1, value2, "memberIdType");
            return (Criteria) this;
        }

        public Criteria andMemberIdValueIsNull() {
            addCriterion("member_id_value is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdValueIsNotNull() {
            addCriterion("member_id_value is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdValueEqualTo(String value) {
            addCriterion("member_id_value =", value, "memberIdValue");
            return (Criteria) this;
        }

        public Criteria andMemberIdValueNotEqualTo(String value) {
            addCriterion("member_id_value <>", value, "memberIdValue");
            return (Criteria) this;
        }

        public Criteria andMemberIdValueGreaterThan(String value) {
            addCriterion("member_id_value >", value, "memberIdValue");
            return (Criteria) this;
        }

        public Criteria andMemberIdValueGreaterThanOrEqualTo(String value) {
            addCriterion("member_id_value >=", value, "memberIdValue");
            return (Criteria) this;
        }

        public Criteria andMemberIdValueLessThan(String value) {
            addCriterion("member_id_value <", value, "memberIdValue");
            return (Criteria) this;
        }

        public Criteria andMemberIdValueLessThanOrEqualTo(String value) {
            addCriterion("member_id_value <=", value, "memberIdValue");
            return (Criteria) this;
        }

        public Criteria andMemberIdValueLike(String value) {
            addCriterion("member_id_value like", value, "memberIdValue");
            return (Criteria) this;
        }

        public Criteria andMemberIdValueNotLike(String value) {
            addCriterion("member_id_value not like", value, "memberIdValue");
            return (Criteria) this;
        }

        public Criteria andMemberIdValueIn(List<String> values) {
            addCriterion("member_id_value in", values, "memberIdValue");
            return (Criteria) this;
        }

        public Criteria andMemberIdValueNotIn(List<String> values) {
            addCriterion("member_id_value not in", values, "memberIdValue");
            return (Criteria) this;
        }

        public Criteria andMemberIdValueBetween(String value1, String value2) {
            addCriterion("member_id_value between", value1, value2, "memberIdValue");
            return (Criteria) this;
        }

        public Criteria andMemberIdValueNotBetween(String value1, String value2) {
            addCriterion("member_id_value not between", value1, value2, "memberIdValue");
            return (Criteria) this;
        }

        public Criteria andMemberParentIdIsNull() {
            addCriterion("member_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberParentIdIsNotNull() {
            addCriterion("member_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberParentIdEqualTo(Integer value) {
            addCriterion("member_parent_id =", value, "memberParentId");
            return (Criteria) this;
        }

        public Criteria andMemberParentIdNotEqualTo(Integer value) {
            addCriterion("member_parent_id <>", value, "memberParentId");
            return (Criteria) this;
        }

        public Criteria andMemberParentIdGreaterThan(Integer value) {
            addCriterion("member_parent_id >", value, "memberParentId");
            return (Criteria) this;
        }

        public Criteria andMemberParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_parent_id >=", value, "memberParentId");
            return (Criteria) this;
        }

        public Criteria andMemberParentIdLessThan(Integer value) {
            addCriterion("member_parent_id <", value, "memberParentId");
            return (Criteria) this;
        }

        public Criteria andMemberParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_parent_id <=", value, "memberParentId");
            return (Criteria) this;
        }

        public Criteria andMemberParentIdIn(List<Integer> values) {
            addCriterion("member_parent_id in", values, "memberParentId");
            return (Criteria) this;
        }

        public Criteria andMemberParentIdNotIn(List<Integer> values) {
            addCriterion("member_parent_id not in", values, "memberParentId");
            return (Criteria) this;
        }

        public Criteria andMemberParentIdBetween(Integer value1, Integer value2) {
            addCriterion("member_parent_id between", value1, value2, "memberParentId");
            return (Criteria) this;
        }

        public Criteria andMemberParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_parent_id not between", value1, value2, "memberParentId");
            return (Criteria) this;
        }

        public Criteria andMemberIntroIsNull() {
            addCriterion("member_intro is null");
            return (Criteria) this;
        }

        public Criteria andMemberIntroIsNotNull() {
            addCriterion("member_intro is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIntroEqualTo(String value) {
            addCriterion("member_intro =", value, "memberIntro");
            return (Criteria) this;
        }

        public Criteria andMemberIntroNotEqualTo(String value) {
            addCriterion("member_intro <>", value, "memberIntro");
            return (Criteria) this;
        }

        public Criteria andMemberIntroGreaterThan(String value) {
            addCriterion("member_intro >", value, "memberIntro");
            return (Criteria) this;
        }

        public Criteria andMemberIntroGreaterThanOrEqualTo(String value) {
            addCriterion("member_intro >=", value, "memberIntro");
            return (Criteria) this;
        }

        public Criteria andMemberIntroLessThan(String value) {
            addCriterion("member_intro <", value, "memberIntro");
            return (Criteria) this;
        }

        public Criteria andMemberIntroLessThanOrEqualTo(String value) {
            addCriterion("member_intro <=", value, "memberIntro");
            return (Criteria) this;
        }

        public Criteria andMemberIntroLike(String value) {
            addCriterion("member_intro like", value, "memberIntro");
            return (Criteria) this;
        }

        public Criteria andMemberIntroNotLike(String value) {
            addCriterion("member_intro not like", value, "memberIntro");
            return (Criteria) this;
        }

        public Criteria andMemberIntroIn(List<String> values) {
            addCriterion("member_intro in", values, "memberIntro");
            return (Criteria) this;
        }

        public Criteria andMemberIntroNotIn(List<String> values) {
            addCriterion("member_intro not in", values, "memberIntro");
            return (Criteria) this;
        }

        public Criteria andMemberIntroBetween(String value1, String value2) {
            addCriterion("member_intro between", value1, value2, "memberIntro");
            return (Criteria) this;
        }

        public Criteria andMemberIntroNotBetween(String value1, String value2) {
            addCriterion("member_intro not between", value1, value2, "memberIntro");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarIsNull() {
            addCriterion("member_avatar is null");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarIsNotNull() {
            addCriterion("member_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarEqualTo(String value) {
            addCriterion("member_avatar =", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarNotEqualTo(String value) {
            addCriterion("member_avatar <>", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarGreaterThan(String value) {
            addCriterion("member_avatar >", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("member_avatar >=", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarLessThan(String value) {
            addCriterion("member_avatar <", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarLessThanOrEqualTo(String value) {
            addCriterion("member_avatar <=", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarLike(String value) {
            addCriterion("member_avatar like", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarNotLike(String value) {
            addCriterion("member_avatar not like", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarIn(List<String> values) {
            addCriterion("member_avatar in", values, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarNotIn(List<String> values) {
            addCriterion("member_avatar not in", values, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarBetween(String value1, String value2) {
            addCriterion("member_avatar between", value1, value2, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarNotBetween(String value1, String value2) {
            addCriterion("member_avatar not between", value1, value2, "memberAvatar");
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

        public Criteria andMemberSexEqualTo(Byte value) {
            addCriterion("member_sex =", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotEqualTo(Byte value) {
            addCriterion("member_sex <>", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThan(Byte value) {
            addCriterion("member_sex >", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("member_sex >=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThan(Byte value) {
            addCriterion("member_sex <", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThanOrEqualTo(Byte value) {
            addCriterion("member_sex <=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexIn(List<Byte> values) {
            addCriterion("member_sex in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotIn(List<Byte> values) {
            addCriterion("member_sex not in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexBetween(Byte value1, Byte value2) {
            addCriterion("member_sex between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotBetween(Byte value1, Byte value2) {
            addCriterion("member_sex not between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayIsNull() {
            addCriterion("member_birthday is null");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayIsNotNull() {
            addCriterion("member_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("member_birthday =", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("member_birthday <>", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("member_birthday >", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("member_birthday >=", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("member_birthday <", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("member_birthday <=", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("member_birthday in", values, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("member_birthday not in", values, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("member_birthday between", value1, value2, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("member_birthday not between", value1, value2, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdIsNull() {
            addCriterion("member_passwd is null");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdIsNotNull() {
            addCriterion("member_passwd is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdEqualTo(String value) {
            addCriterion("member_passwd =", value, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdNotEqualTo(String value) {
            addCriterion("member_passwd <>", value, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdGreaterThan(String value) {
            addCriterion("member_passwd >", value, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("member_passwd >=", value, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdLessThan(String value) {
            addCriterion("member_passwd <", value, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdLessThanOrEqualTo(String value) {
            addCriterion("member_passwd <=", value, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdLike(String value) {
            addCriterion("member_passwd like", value, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdNotLike(String value) {
            addCriterion("member_passwd not like", value, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdIn(List<String> values) {
            addCriterion("member_passwd in", values, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdNotIn(List<String> values) {
            addCriterion("member_passwd not in", values, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdBetween(String value1, String value2) {
            addCriterion("member_passwd between", value1, value2, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdNotBetween(String value1, String value2) {
            addCriterion("member_passwd not between", value1, value2, "memberPasswd");
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

        public Criteria andMemberEmailIsNull() {
            addCriterion("member_email is null");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIsNotNull() {
            addCriterion("member_email is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEmailEqualTo(String value) {
            addCriterion("member_email =", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotEqualTo(String value) {
            addCriterion("member_email <>", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailGreaterThan(String value) {
            addCriterion("member_email >", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailGreaterThanOrEqualTo(String value) {
            addCriterion("member_email >=", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLessThan(String value) {
            addCriterion("member_email <", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLessThanOrEqualTo(String value) {
            addCriterion("member_email <=", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLike(String value) {
            addCriterion("member_email like", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotLike(String value) {
            addCriterion("member_email not like", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIn(List<String> values) {
            addCriterion("member_email in", values, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotIn(List<String> values) {
            addCriterion("member_email not in", values, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailBetween(String value1, String value2) {
            addCriterion("member_email between", value1, value2, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotBetween(String value1, String value2) {
            addCriterion("member_email not between", value1, value2, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberQqIsNull() {
            addCriterion("member_qq is null");
            return (Criteria) this;
        }

        public Criteria andMemberQqIsNotNull() {
            addCriterion("member_qq is not null");
            return (Criteria) this;
        }

        public Criteria andMemberQqEqualTo(String value) {
            addCriterion("member_qq =", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotEqualTo(String value) {
            addCriterion("member_qq <>", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqGreaterThan(String value) {
            addCriterion("member_qq >", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqGreaterThanOrEqualTo(String value) {
            addCriterion("member_qq >=", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqLessThan(String value) {
            addCriterion("member_qq <", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqLessThanOrEqualTo(String value) {
            addCriterion("member_qq <=", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqLike(String value) {
            addCriterion("member_qq like", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotLike(String value) {
            addCriterion("member_qq not like", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqIn(List<String> values) {
            addCriterion("member_qq in", values, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotIn(List<String> values) {
            addCriterion("member_qq not in", values, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqBetween(String value1, String value2) {
            addCriterion("member_qq between", value1, value2, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotBetween(String value1, String value2) {
            addCriterion("member_qq not between", value1, value2, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberWwIsNull() {
            addCriterion("member_ww is null");
            return (Criteria) this;
        }

        public Criteria andMemberWwIsNotNull() {
            addCriterion("member_ww is not null");
            return (Criteria) this;
        }

        public Criteria andMemberWwEqualTo(String value) {
            addCriterion("member_ww =", value, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwNotEqualTo(String value) {
            addCriterion("member_ww <>", value, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwGreaterThan(String value) {
            addCriterion("member_ww >", value, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwGreaterThanOrEqualTo(String value) {
            addCriterion("member_ww >=", value, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwLessThan(String value) {
            addCriterion("member_ww <", value, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwLessThanOrEqualTo(String value) {
            addCriterion("member_ww <=", value, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwLike(String value) {
            addCriterion("member_ww like", value, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwNotLike(String value) {
            addCriterion("member_ww not like", value, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwIn(List<String> values) {
            addCriterion("member_ww in", values, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwNotIn(List<String> values) {
            addCriterion("member_ww not in", values, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwBetween(String value1, String value2) {
            addCriterion("member_ww between", value1, value2, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwNotBetween(String value1, String value2) {
            addCriterion("member_ww not between", value1, value2, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumIsNull() {
            addCriterion("member_login_num is null");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumIsNotNull() {
            addCriterion("member_login_num is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumEqualTo(Integer value) {
            addCriterion("member_login_num =", value, "memberLoginNum");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumNotEqualTo(Integer value) {
            addCriterion("member_login_num <>", value, "memberLoginNum");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumGreaterThan(Integer value) {
            addCriterion("member_login_num >", value, "memberLoginNum");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_login_num >=", value, "memberLoginNum");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumLessThan(Integer value) {
            addCriterion("member_login_num <", value, "memberLoginNum");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumLessThanOrEqualTo(Integer value) {
            addCriterion("member_login_num <=", value, "memberLoginNum");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumIn(List<Integer> values) {
            addCriterion("member_login_num in", values, "memberLoginNum");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumNotIn(List<Integer> values) {
            addCriterion("member_login_num not in", values, "memberLoginNum");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumBetween(Integer value1, Integer value2) {
            addCriterion("member_login_num between", value1, value2, "memberLoginNum");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumNotBetween(Integer value1, Integer value2) {
            addCriterion("member_login_num not between", value1, value2, "memberLoginNum");
            return (Criteria) this;
        }

        public Criteria andMemberTimeIsNull() {
            addCriterion("member_time is null");
            return (Criteria) this;
        }

        public Criteria andMemberTimeIsNotNull() {
            addCriterion("member_time is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTimeEqualTo(String value) {
            addCriterion("member_time =", value, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberTimeNotEqualTo(String value) {
            addCriterion("member_time <>", value, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberTimeGreaterThan(String value) {
            addCriterion("member_time >", value, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberTimeGreaterThanOrEqualTo(String value) {
            addCriterion("member_time >=", value, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberTimeLessThan(String value) {
            addCriterion("member_time <", value, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberTimeLessThanOrEqualTo(String value) {
            addCriterion("member_time <=", value, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberTimeLike(String value) {
            addCriterion("member_time like", value, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberTimeNotLike(String value) {
            addCriterion("member_time not like", value, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberTimeIn(List<String> values) {
            addCriterion("member_time in", values, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberTimeNotIn(List<String> values) {
            addCriterion("member_time not in", values, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberTimeBetween(String value1, String value2) {
            addCriterion("member_time between", value1, value2, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberTimeNotBetween(String value1, String value2) {
            addCriterion("member_time not between", value1, value2, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeIsNull() {
            addCriterion("member_login_time is null");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeIsNotNull() {
            addCriterion("member_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeEqualTo(String value) {
            addCriterion("member_login_time =", value, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeNotEqualTo(String value) {
            addCriterion("member_login_time <>", value, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeGreaterThan(String value) {
            addCriterion("member_login_time >", value, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeGreaterThanOrEqualTo(String value) {
            addCriterion("member_login_time >=", value, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeLessThan(String value) {
            addCriterion("member_login_time <", value, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeLessThanOrEqualTo(String value) {
            addCriterion("member_login_time <=", value, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeLike(String value) {
            addCriterion("member_login_time like", value, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeNotLike(String value) {
            addCriterion("member_login_time not like", value, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeIn(List<String> values) {
            addCriterion("member_login_time in", values, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeNotIn(List<String> values) {
            addCriterion("member_login_time not in", values, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeBetween(String value1, String value2) {
            addCriterion("member_login_time between", value1, value2, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeNotBetween(String value1, String value2) {
            addCriterion("member_login_time not between", value1, value2, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeIsNull() {
            addCriterion("member_old_login_time is null");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeIsNotNull() {
            addCriterion("member_old_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeEqualTo(String value) {
            addCriterion("member_old_login_time =", value, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeNotEqualTo(String value) {
            addCriterion("member_old_login_time <>", value, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeGreaterThan(String value) {
            addCriterion("member_old_login_time >", value, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeGreaterThanOrEqualTo(String value) {
            addCriterion("member_old_login_time >=", value, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeLessThan(String value) {
            addCriterion("member_old_login_time <", value, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeLessThanOrEqualTo(String value) {
            addCriterion("member_old_login_time <=", value, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeLike(String value) {
            addCriterion("member_old_login_time like", value, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeNotLike(String value) {
            addCriterion("member_old_login_time not like", value, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeIn(List<String> values) {
            addCriterion("member_old_login_time in", values, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeNotIn(List<String> values) {
            addCriterion("member_old_login_time not in", values, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeBetween(String value1, String value2) {
            addCriterion("member_old_login_time between", value1, value2, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeNotBetween(String value1, String value2) {
            addCriterion("member_old_login_time not between", value1, value2, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpIsNull() {
            addCriterion("member_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpIsNotNull() {
            addCriterion("member_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpEqualTo(String value) {
            addCriterion("member_login_ip =", value, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpNotEqualTo(String value) {
            addCriterion("member_login_ip <>", value, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpGreaterThan(String value) {
            addCriterion("member_login_ip >", value, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("member_login_ip >=", value, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpLessThan(String value) {
            addCriterion("member_login_ip <", value, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpLessThanOrEqualTo(String value) {
            addCriterion("member_login_ip <=", value, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpLike(String value) {
            addCriterion("member_login_ip like", value, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpNotLike(String value) {
            addCriterion("member_login_ip not like", value, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpIn(List<String> values) {
            addCriterion("member_login_ip in", values, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpNotIn(List<String> values) {
            addCriterion("member_login_ip not in", values, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpBetween(String value1, String value2) {
            addCriterion("member_login_ip between", value1, value2, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpNotBetween(String value1, String value2) {
            addCriterion("member_login_ip not between", value1, value2, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpIsNull() {
            addCriterion("member_old_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpIsNotNull() {
            addCriterion("member_old_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpEqualTo(String value) {
            addCriterion("member_old_login_ip =", value, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpNotEqualTo(String value) {
            addCriterion("member_old_login_ip <>", value, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpGreaterThan(String value) {
            addCriterion("member_old_login_ip >", value, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("member_old_login_ip >=", value, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpLessThan(String value) {
            addCriterion("member_old_login_ip <", value, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpLessThanOrEqualTo(String value) {
            addCriterion("member_old_login_ip <=", value, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpLike(String value) {
            addCriterion("member_old_login_ip like", value, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpNotLike(String value) {
            addCriterion("member_old_login_ip not like", value, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpIn(List<String> values) {
            addCriterion("member_old_login_ip in", values, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpNotIn(List<String> values) {
            addCriterion("member_old_login_ip not in", values, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpBetween(String value1, String value2) {
            addCriterion("member_old_login_ip between", value1, value2, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpNotBetween(String value1, String value2) {
            addCriterion("member_old_login_ip not between", value1, value2, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberQqopenidIsNull() {
            addCriterion("member_qqopenid is null");
            return (Criteria) this;
        }

        public Criteria andMemberQqopenidIsNotNull() {
            addCriterion("member_qqopenid is not null");
            return (Criteria) this;
        }

        public Criteria andMemberQqopenidEqualTo(String value) {
            addCriterion("member_qqopenid =", value, "memberQqopenid");
            return (Criteria) this;
        }

        public Criteria andMemberQqopenidNotEqualTo(String value) {
            addCriterion("member_qqopenid <>", value, "memberQqopenid");
            return (Criteria) this;
        }

        public Criteria andMemberQqopenidGreaterThan(String value) {
            addCriterion("member_qqopenid >", value, "memberQqopenid");
            return (Criteria) this;
        }

        public Criteria andMemberQqopenidGreaterThanOrEqualTo(String value) {
            addCriterion("member_qqopenid >=", value, "memberQqopenid");
            return (Criteria) this;
        }

        public Criteria andMemberQqopenidLessThan(String value) {
            addCriterion("member_qqopenid <", value, "memberQqopenid");
            return (Criteria) this;
        }

        public Criteria andMemberQqopenidLessThanOrEqualTo(String value) {
            addCriterion("member_qqopenid <=", value, "memberQqopenid");
            return (Criteria) this;
        }

        public Criteria andMemberQqopenidLike(String value) {
            addCriterion("member_qqopenid like", value, "memberQqopenid");
            return (Criteria) this;
        }

        public Criteria andMemberQqopenidNotLike(String value) {
            addCriterion("member_qqopenid not like", value, "memberQqopenid");
            return (Criteria) this;
        }

        public Criteria andMemberQqopenidIn(List<String> values) {
            addCriterion("member_qqopenid in", values, "memberQqopenid");
            return (Criteria) this;
        }

        public Criteria andMemberQqopenidNotIn(List<String> values) {
            addCriterion("member_qqopenid not in", values, "memberQqopenid");
            return (Criteria) this;
        }

        public Criteria andMemberQqopenidBetween(String value1, String value2) {
            addCriterion("member_qqopenid between", value1, value2, "memberQqopenid");
            return (Criteria) this;
        }

        public Criteria andMemberQqopenidNotBetween(String value1, String value2) {
            addCriterion("member_qqopenid not between", value1, value2, "memberQqopenid");
            return (Criteria) this;
        }

        public Criteria andMemberSinaopenidIsNull() {
            addCriterion("member_sinaopenid is null");
            return (Criteria) this;
        }

        public Criteria andMemberSinaopenidIsNotNull() {
            addCriterion("member_sinaopenid is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSinaopenidEqualTo(String value) {
            addCriterion("member_sinaopenid =", value, "memberSinaopenid");
            return (Criteria) this;
        }

        public Criteria andMemberSinaopenidNotEqualTo(String value) {
            addCriterion("member_sinaopenid <>", value, "memberSinaopenid");
            return (Criteria) this;
        }

        public Criteria andMemberSinaopenidGreaterThan(String value) {
            addCriterion("member_sinaopenid >", value, "memberSinaopenid");
            return (Criteria) this;
        }

        public Criteria andMemberSinaopenidGreaterThanOrEqualTo(String value) {
            addCriterion("member_sinaopenid >=", value, "memberSinaopenid");
            return (Criteria) this;
        }

        public Criteria andMemberSinaopenidLessThan(String value) {
            addCriterion("member_sinaopenid <", value, "memberSinaopenid");
            return (Criteria) this;
        }

        public Criteria andMemberSinaopenidLessThanOrEqualTo(String value) {
            addCriterion("member_sinaopenid <=", value, "memberSinaopenid");
            return (Criteria) this;
        }

        public Criteria andMemberSinaopenidLike(String value) {
            addCriterion("member_sinaopenid like", value, "memberSinaopenid");
            return (Criteria) this;
        }

        public Criteria andMemberSinaopenidNotLike(String value) {
            addCriterion("member_sinaopenid not like", value, "memberSinaopenid");
            return (Criteria) this;
        }

        public Criteria andMemberSinaopenidIn(List<String> values) {
            addCriterion("member_sinaopenid in", values, "memberSinaopenid");
            return (Criteria) this;
        }

        public Criteria andMemberSinaopenidNotIn(List<String> values) {
            addCriterion("member_sinaopenid not in", values, "memberSinaopenid");
            return (Criteria) this;
        }

        public Criteria andMemberSinaopenidBetween(String value1, String value2) {
            addCriterion("member_sinaopenid between", value1, value2, "memberSinaopenid");
            return (Criteria) this;
        }

        public Criteria andMemberSinaopenidNotBetween(String value1, String value2) {
            addCriterion("member_sinaopenid not between", value1, value2, "memberSinaopenid");
            return (Criteria) this;
        }

        public Criteria andMemberPointsIsNull() {
            addCriterion("member_points is null");
            return (Criteria) this;
        }

        public Criteria andMemberPointsIsNotNull() {
            addCriterion("member_points is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPointsEqualTo(Integer value) {
            addCriterion("member_points =", value, "memberPoints");
            return (Criteria) this;
        }

        public Criteria andMemberPointsNotEqualTo(Integer value) {
            addCriterion("member_points <>", value, "memberPoints");
            return (Criteria) this;
        }

        public Criteria andMemberPointsGreaterThan(Integer value) {
            addCriterion("member_points >", value, "memberPoints");
            return (Criteria) this;
        }

        public Criteria andMemberPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_points >=", value, "memberPoints");
            return (Criteria) this;
        }

        public Criteria andMemberPointsLessThan(Integer value) {
            addCriterion("member_points <", value, "memberPoints");
            return (Criteria) this;
        }

        public Criteria andMemberPointsLessThanOrEqualTo(Integer value) {
            addCriterion("member_points <=", value, "memberPoints");
            return (Criteria) this;
        }

        public Criteria andMemberPointsIn(List<Integer> values) {
            addCriterion("member_points in", values, "memberPoints");
            return (Criteria) this;
        }

        public Criteria andMemberPointsNotIn(List<Integer> values) {
            addCriterion("member_points not in", values, "memberPoints");
            return (Criteria) this;
        }

        public Criteria andMemberPointsBetween(Integer value1, Integer value2) {
            addCriterion("member_points between", value1, value2, "memberPoints");
            return (Criteria) this;
        }

        public Criteria andMemberPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("member_points not between", value1, value2, "memberPoints");
            return (Criteria) this;
        }

        public Criteria andAvailablePredepositIsNull() {
            addCriterion("available_predeposit is null");
            return (Criteria) this;
        }

        public Criteria andAvailablePredepositIsNotNull() {
            addCriterion("available_predeposit is not null");
            return (Criteria) this;
        }

        public Criteria andAvailablePredepositEqualTo(BigDecimal value) {
            addCriterion("available_predeposit =", value, "availablePredeposit");
            return (Criteria) this;
        }

        public Criteria andAvailablePredepositNotEqualTo(BigDecimal value) {
            addCriterion("available_predeposit <>", value, "availablePredeposit");
            return (Criteria) this;
        }

        public Criteria andAvailablePredepositGreaterThan(BigDecimal value) {
            addCriterion("available_predeposit >", value, "availablePredeposit");
            return (Criteria) this;
        }

        public Criteria andAvailablePredepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("available_predeposit >=", value, "availablePredeposit");
            return (Criteria) this;
        }

        public Criteria andAvailablePredepositLessThan(BigDecimal value) {
            addCriterion("available_predeposit <", value, "availablePredeposit");
            return (Criteria) this;
        }

        public Criteria andAvailablePredepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("available_predeposit <=", value, "availablePredeposit");
            return (Criteria) this;
        }

        public Criteria andAvailablePredepositIn(List<BigDecimal> values) {
            addCriterion("available_predeposit in", values, "availablePredeposit");
            return (Criteria) this;
        }

        public Criteria andAvailablePredepositNotIn(List<BigDecimal> values) {
            addCriterion("available_predeposit not in", values, "availablePredeposit");
            return (Criteria) this;
        }

        public Criteria andAvailablePredepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_predeposit between", value1, value2, "availablePredeposit");
            return (Criteria) this;
        }

        public Criteria andAvailablePredepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_predeposit not between", value1, value2, "availablePredeposit");
            return (Criteria) this;
        }

        public Criteria andAvailableGiftdepositIsNull() {
            addCriterion("available_giftdeposit is null");
            return (Criteria) this;
        }

        public Criteria andAvailableGiftdepositIsNotNull() {
            addCriterion("available_giftdeposit is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableGiftdepositEqualTo(BigDecimal value) {
            addCriterion("available_giftdeposit =", value, "availableGiftdeposit");
            return (Criteria) this;
        }

        public Criteria andAvailableGiftdepositNotEqualTo(BigDecimal value) {
            addCriterion("available_giftdeposit <>", value, "availableGiftdeposit");
            return (Criteria) this;
        }

        public Criteria andAvailableGiftdepositGreaterThan(BigDecimal value) {
            addCriterion("available_giftdeposit >", value, "availableGiftdeposit");
            return (Criteria) this;
        }

        public Criteria andAvailableGiftdepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("available_giftdeposit >=", value, "availableGiftdeposit");
            return (Criteria) this;
        }

        public Criteria andAvailableGiftdepositLessThan(BigDecimal value) {
            addCriterion("available_giftdeposit <", value, "availableGiftdeposit");
            return (Criteria) this;
        }

        public Criteria andAvailableGiftdepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("available_giftdeposit <=", value, "availableGiftdeposit");
            return (Criteria) this;
        }

        public Criteria andAvailableGiftdepositIn(List<BigDecimal> values) {
            addCriterion("available_giftdeposit in", values, "availableGiftdeposit");
            return (Criteria) this;
        }

        public Criteria andAvailableGiftdepositNotIn(List<BigDecimal> values) {
            addCriterion("available_giftdeposit not in", values, "availableGiftdeposit");
            return (Criteria) this;
        }

        public Criteria andAvailableGiftdepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_giftdeposit between", value1, value2, "availableGiftdeposit");
            return (Criteria) this;
        }

        public Criteria andAvailableGiftdepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_giftdeposit not between", value1, value2, "availableGiftdeposit");
            return (Criteria) this;
        }

        public Criteria andFreezePredepositIsNull() {
            addCriterion("freeze_predeposit is null");
            return (Criteria) this;
        }

        public Criteria andFreezePredepositIsNotNull() {
            addCriterion("freeze_predeposit is not null");
            return (Criteria) this;
        }

        public Criteria andFreezePredepositEqualTo(BigDecimal value) {
            addCriterion("freeze_predeposit =", value, "freezePredeposit");
            return (Criteria) this;
        }

        public Criteria andFreezePredepositNotEqualTo(BigDecimal value) {
            addCriterion("freeze_predeposit <>", value, "freezePredeposit");
            return (Criteria) this;
        }

        public Criteria andFreezePredepositGreaterThan(BigDecimal value) {
            addCriterion("freeze_predeposit >", value, "freezePredeposit");
            return (Criteria) this;
        }

        public Criteria andFreezePredepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freeze_predeposit >=", value, "freezePredeposit");
            return (Criteria) this;
        }

        public Criteria andFreezePredepositLessThan(BigDecimal value) {
            addCriterion("freeze_predeposit <", value, "freezePredeposit");
            return (Criteria) this;
        }

        public Criteria andFreezePredepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freeze_predeposit <=", value, "freezePredeposit");
            return (Criteria) this;
        }

        public Criteria andFreezePredepositIn(List<BigDecimal> values) {
            addCriterion("freeze_predeposit in", values, "freezePredeposit");
            return (Criteria) this;
        }

        public Criteria andFreezePredepositNotIn(List<BigDecimal> values) {
            addCriterion("freeze_predeposit not in", values, "freezePredeposit");
            return (Criteria) this;
        }

        public Criteria andFreezePredepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freeze_predeposit between", value1, value2, "freezePredeposit");
            return (Criteria) this;
        }

        public Criteria andFreezePredepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freeze_predeposit not between", value1, value2, "freezePredeposit");
            return (Criteria) this;
        }

        public Criteria andInformAllowIsNull() {
            addCriterion("inform_allow is null");
            return (Criteria) this;
        }

        public Criteria andInformAllowIsNotNull() {
            addCriterion("inform_allow is not null");
            return (Criteria) this;
        }

        public Criteria andInformAllowEqualTo(Byte value) {
            addCriterion("inform_allow =", value, "informAllow");
            return (Criteria) this;
        }

        public Criteria andInformAllowNotEqualTo(Byte value) {
            addCriterion("inform_allow <>", value, "informAllow");
            return (Criteria) this;
        }

        public Criteria andInformAllowGreaterThan(Byte value) {
            addCriterion("inform_allow >", value, "informAllow");
            return (Criteria) this;
        }

        public Criteria andInformAllowGreaterThanOrEqualTo(Byte value) {
            addCriterion("inform_allow >=", value, "informAllow");
            return (Criteria) this;
        }

        public Criteria andInformAllowLessThan(Byte value) {
            addCriterion("inform_allow <", value, "informAllow");
            return (Criteria) this;
        }

        public Criteria andInformAllowLessThanOrEqualTo(Byte value) {
            addCriterion("inform_allow <=", value, "informAllow");
            return (Criteria) this;
        }

        public Criteria andInformAllowIn(List<Byte> values) {
            addCriterion("inform_allow in", values, "informAllow");
            return (Criteria) this;
        }

        public Criteria andInformAllowNotIn(List<Byte> values) {
            addCriterion("inform_allow not in", values, "informAllow");
            return (Criteria) this;
        }

        public Criteria andInformAllowBetween(Byte value1, Byte value2) {
            addCriterion("inform_allow between", value1, value2, "informAllow");
            return (Criteria) this;
        }

        public Criteria andInformAllowNotBetween(Byte value1, Byte value2) {
            addCriterion("inform_allow not between", value1, value2, "informAllow");
            return (Criteria) this;
        }

        public Criteria andIsBuyIsNull() {
            addCriterion("is_buy is null");
            return (Criteria) this;
        }

        public Criteria andIsBuyIsNotNull() {
            addCriterion("is_buy is not null");
            return (Criteria) this;
        }

        public Criteria andIsBuyEqualTo(Byte value) {
            addCriterion("is_buy =", value, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyNotEqualTo(Byte value) {
            addCriterion("is_buy <>", value, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyGreaterThan(Byte value) {
            addCriterion("is_buy >", value, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_buy >=", value, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyLessThan(Byte value) {
            addCriterion("is_buy <", value, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyLessThanOrEqualTo(Byte value) {
            addCriterion("is_buy <=", value, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyIn(List<Byte> values) {
            addCriterion("is_buy in", values, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyNotIn(List<Byte> values) {
            addCriterion("is_buy not in", values, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyBetween(Byte value1, Byte value2) {
            addCriterion("is_buy between", value1, value2, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyNotBetween(Byte value1, Byte value2) {
            addCriterion("is_buy not between", value1, value2, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsAllowtalkIsNull() {
            addCriterion("is_allowtalk is null");
            return (Criteria) this;
        }

        public Criteria andIsAllowtalkIsNotNull() {
            addCriterion("is_allowtalk is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllowtalkEqualTo(Byte value) {
            addCriterion("is_allowtalk =", value, "isAllowtalk");
            return (Criteria) this;
        }

        public Criteria andIsAllowtalkNotEqualTo(Byte value) {
            addCriterion("is_allowtalk <>", value, "isAllowtalk");
            return (Criteria) this;
        }

        public Criteria andIsAllowtalkGreaterThan(Byte value) {
            addCriterion("is_allowtalk >", value, "isAllowtalk");
            return (Criteria) this;
        }

        public Criteria andIsAllowtalkGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_allowtalk >=", value, "isAllowtalk");
            return (Criteria) this;
        }

        public Criteria andIsAllowtalkLessThan(Byte value) {
            addCriterion("is_allowtalk <", value, "isAllowtalk");
            return (Criteria) this;
        }

        public Criteria andIsAllowtalkLessThanOrEqualTo(Byte value) {
            addCriterion("is_allowtalk <=", value, "isAllowtalk");
            return (Criteria) this;
        }

        public Criteria andIsAllowtalkIn(List<Byte> values) {
            addCriterion("is_allowtalk in", values, "isAllowtalk");
            return (Criteria) this;
        }

        public Criteria andIsAllowtalkNotIn(List<Byte> values) {
            addCriterion("is_allowtalk not in", values, "isAllowtalk");
            return (Criteria) this;
        }

        public Criteria andIsAllowtalkBetween(Byte value1, Byte value2) {
            addCriterion("is_allowtalk between", value1, value2, "isAllowtalk");
            return (Criteria) this;
        }

        public Criteria andIsAllowtalkNotBetween(Byte value1, Byte value2) {
            addCriterion("is_allowtalk not between", value1, value2, "isAllowtalk");
            return (Criteria) this;
        }

        public Criteria andMemberStateIsNull() {
            addCriterion("member_state is null");
            return (Criteria) this;
        }

        public Criteria andMemberStateIsNotNull() {
            addCriterion("member_state is not null");
            return (Criteria) this;
        }

        public Criteria andMemberStateEqualTo(Byte value) {
            addCriterion("member_state =", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateNotEqualTo(Byte value) {
            addCriterion("member_state <>", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateGreaterThan(Byte value) {
            addCriterion("member_state >", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("member_state >=", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateLessThan(Byte value) {
            addCriterion("member_state <", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateLessThanOrEqualTo(Byte value) {
            addCriterion("member_state <=", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateIn(List<Byte> values) {
            addCriterion("member_state in", values, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateNotIn(List<Byte> values) {
            addCriterion("member_state not in", values, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateBetween(Byte value1, Byte value2) {
            addCriterion("member_state between", value1, value2, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateNotBetween(Byte value1, Byte value2) {
            addCriterion("member_state not between", value1, value2, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberCreditIsNull() {
            addCriterion("member_credit is null");
            return (Criteria) this;
        }

        public Criteria andMemberCreditIsNotNull() {
            addCriterion("member_credit is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCreditEqualTo(Integer value) {
            addCriterion("member_credit =", value, "memberCredit");
            return (Criteria) this;
        }

        public Criteria andMemberCreditNotEqualTo(Integer value) {
            addCriterion("member_credit <>", value, "memberCredit");
            return (Criteria) this;
        }

        public Criteria andMemberCreditGreaterThan(Integer value) {
            addCriterion("member_credit >", value, "memberCredit");
            return (Criteria) this;
        }

        public Criteria andMemberCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_credit >=", value, "memberCredit");
            return (Criteria) this;
        }

        public Criteria andMemberCreditLessThan(Integer value) {
            addCriterion("member_credit <", value, "memberCredit");
            return (Criteria) this;
        }

        public Criteria andMemberCreditLessThanOrEqualTo(Integer value) {
            addCriterion("member_credit <=", value, "memberCredit");
            return (Criteria) this;
        }

        public Criteria andMemberCreditIn(List<Integer> values) {
            addCriterion("member_credit in", values, "memberCredit");
            return (Criteria) this;
        }

        public Criteria andMemberCreditNotIn(List<Integer> values) {
            addCriterion("member_credit not in", values, "memberCredit");
            return (Criteria) this;
        }

        public Criteria andMemberCreditBetween(Integer value1, Integer value2) {
            addCriterion("member_credit between", value1, value2, "memberCredit");
            return (Criteria) this;
        }

        public Criteria andMemberCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("member_credit not between", value1, value2, "memberCredit");
            return (Criteria) this;
        }

        public Criteria andMemberSnsvisitnumIsNull() {
            addCriterion("member_snsvisitnum is null");
            return (Criteria) this;
        }

        public Criteria andMemberSnsvisitnumIsNotNull() {
            addCriterion("member_snsvisitnum is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSnsvisitnumEqualTo(Integer value) {
            addCriterion("member_snsvisitnum =", value, "memberSnsvisitnum");
            return (Criteria) this;
        }

        public Criteria andMemberSnsvisitnumNotEqualTo(Integer value) {
            addCriterion("member_snsvisitnum <>", value, "memberSnsvisitnum");
            return (Criteria) this;
        }

        public Criteria andMemberSnsvisitnumGreaterThan(Integer value) {
            addCriterion("member_snsvisitnum >", value, "memberSnsvisitnum");
            return (Criteria) this;
        }

        public Criteria andMemberSnsvisitnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_snsvisitnum >=", value, "memberSnsvisitnum");
            return (Criteria) this;
        }

        public Criteria andMemberSnsvisitnumLessThan(Integer value) {
            addCriterion("member_snsvisitnum <", value, "memberSnsvisitnum");
            return (Criteria) this;
        }

        public Criteria andMemberSnsvisitnumLessThanOrEqualTo(Integer value) {
            addCriterion("member_snsvisitnum <=", value, "memberSnsvisitnum");
            return (Criteria) this;
        }

        public Criteria andMemberSnsvisitnumIn(List<Integer> values) {
            addCriterion("member_snsvisitnum in", values, "memberSnsvisitnum");
            return (Criteria) this;
        }

        public Criteria andMemberSnsvisitnumNotIn(List<Integer> values) {
            addCriterion("member_snsvisitnum not in", values, "memberSnsvisitnum");
            return (Criteria) this;
        }

        public Criteria andMemberSnsvisitnumBetween(Integer value1, Integer value2) {
            addCriterion("member_snsvisitnum between", value1, value2, "memberSnsvisitnum");
            return (Criteria) this;
        }

        public Criteria andMemberSnsvisitnumNotBetween(Integer value1, Integer value2) {
            addCriterion("member_snsvisitnum not between", value1, value2, "memberSnsvisitnum");
            return (Criteria) this;
        }

        public Criteria andMemberAreaidIsNull() {
            addCriterion("member_areaid is null");
            return (Criteria) this;
        }

        public Criteria andMemberAreaidIsNotNull() {
            addCriterion("member_areaid is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAreaidEqualTo(Integer value) {
            addCriterion("member_areaid =", value, "memberAreaid");
            return (Criteria) this;
        }

        public Criteria andMemberAreaidNotEqualTo(Integer value) {
            addCriterion("member_areaid <>", value, "memberAreaid");
            return (Criteria) this;
        }

        public Criteria andMemberAreaidGreaterThan(Integer value) {
            addCriterion("member_areaid >", value, "memberAreaid");
            return (Criteria) this;
        }

        public Criteria andMemberAreaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_areaid >=", value, "memberAreaid");
            return (Criteria) this;
        }

        public Criteria andMemberAreaidLessThan(Integer value) {
            addCriterion("member_areaid <", value, "memberAreaid");
            return (Criteria) this;
        }

        public Criteria andMemberAreaidLessThanOrEqualTo(Integer value) {
            addCriterion("member_areaid <=", value, "memberAreaid");
            return (Criteria) this;
        }

        public Criteria andMemberAreaidIn(List<Integer> values) {
            addCriterion("member_areaid in", values, "memberAreaid");
            return (Criteria) this;
        }

        public Criteria andMemberAreaidNotIn(List<Integer> values) {
            addCriterion("member_areaid not in", values, "memberAreaid");
            return (Criteria) this;
        }

        public Criteria andMemberAreaidBetween(Integer value1, Integer value2) {
            addCriterion("member_areaid between", value1, value2, "memberAreaid");
            return (Criteria) this;
        }

        public Criteria andMemberAreaidNotBetween(Integer value1, Integer value2) {
            addCriterion("member_areaid not between", value1, value2, "memberAreaid");
            return (Criteria) this;
        }

        public Criteria andMemberCityidIsNull() {
            addCriterion("member_cityid is null");
            return (Criteria) this;
        }

        public Criteria andMemberCityidIsNotNull() {
            addCriterion("member_cityid is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCityidEqualTo(Integer value) {
            addCriterion("member_cityid =", value, "memberCityid");
            return (Criteria) this;
        }

        public Criteria andMemberCityidNotEqualTo(Integer value) {
            addCriterion("member_cityid <>", value, "memberCityid");
            return (Criteria) this;
        }

        public Criteria andMemberCityidGreaterThan(Integer value) {
            addCriterion("member_cityid >", value, "memberCityid");
            return (Criteria) this;
        }

        public Criteria andMemberCityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_cityid >=", value, "memberCityid");
            return (Criteria) this;
        }

        public Criteria andMemberCityidLessThan(Integer value) {
            addCriterion("member_cityid <", value, "memberCityid");
            return (Criteria) this;
        }

        public Criteria andMemberCityidLessThanOrEqualTo(Integer value) {
            addCriterion("member_cityid <=", value, "memberCityid");
            return (Criteria) this;
        }

        public Criteria andMemberCityidIn(List<Integer> values) {
            addCriterion("member_cityid in", values, "memberCityid");
            return (Criteria) this;
        }

        public Criteria andMemberCityidNotIn(List<Integer> values) {
            addCriterion("member_cityid not in", values, "memberCityid");
            return (Criteria) this;
        }

        public Criteria andMemberCityidBetween(Integer value1, Integer value2) {
            addCriterion("member_cityid between", value1, value2, "memberCityid");
            return (Criteria) this;
        }

        public Criteria andMemberCityidNotBetween(Integer value1, Integer value2) {
            addCriterion("member_cityid not between", value1, value2, "memberCityid");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceidIsNull() {
            addCriterion("member_provinceid is null");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceidIsNotNull() {
            addCriterion("member_provinceid is not null");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceidEqualTo(Integer value) {
            addCriterion("member_provinceid =", value, "memberProvinceid");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceidNotEqualTo(Integer value) {
            addCriterion("member_provinceid <>", value, "memberProvinceid");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceidGreaterThan(Integer value) {
            addCriterion("member_provinceid >", value, "memberProvinceid");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_provinceid >=", value, "memberProvinceid");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceidLessThan(Integer value) {
            addCriterion("member_provinceid <", value, "memberProvinceid");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceidLessThanOrEqualTo(Integer value) {
            addCriterion("member_provinceid <=", value, "memberProvinceid");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceidIn(List<Integer> values) {
            addCriterion("member_provinceid in", values, "memberProvinceid");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceidNotIn(List<Integer> values) {
            addCriterion("member_provinceid not in", values, "memberProvinceid");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceidBetween(Integer value1, Integer value2) {
            addCriterion("member_provinceid between", value1, value2, "memberProvinceid");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceidNotBetween(Integer value1, Integer value2) {
            addCriterion("member_provinceid not between", value1, value2, "memberProvinceid");
            return (Criteria) this;
        }

        public Criteria andMemberAreainfoIsNull() {
            addCriterion("member_areainfo is null");
            return (Criteria) this;
        }

        public Criteria andMemberAreainfoIsNotNull() {
            addCriterion("member_areainfo is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAreainfoEqualTo(String value) {
            addCriterion("member_areainfo =", value, "memberAreainfo");
            return (Criteria) this;
        }

        public Criteria andMemberAreainfoNotEqualTo(String value) {
            addCriterion("member_areainfo <>", value, "memberAreainfo");
            return (Criteria) this;
        }

        public Criteria andMemberAreainfoGreaterThan(String value) {
            addCriterion("member_areainfo >", value, "memberAreainfo");
            return (Criteria) this;
        }

        public Criteria andMemberAreainfoGreaterThanOrEqualTo(String value) {
            addCriterion("member_areainfo >=", value, "memberAreainfo");
            return (Criteria) this;
        }

        public Criteria andMemberAreainfoLessThan(String value) {
            addCriterion("member_areainfo <", value, "memberAreainfo");
            return (Criteria) this;
        }

        public Criteria andMemberAreainfoLessThanOrEqualTo(String value) {
            addCriterion("member_areainfo <=", value, "memberAreainfo");
            return (Criteria) this;
        }

        public Criteria andMemberAreainfoLike(String value) {
            addCriterion("member_areainfo like", value, "memberAreainfo");
            return (Criteria) this;
        }

        public Criteria andMemberAreainfoNotLike(String value) {
            addCriterion("member_areainfo not like", value, "memberAreainfo");
            return (Criteria) this;
        }

        public Criteria andMemberAreainfoIn(List<String> values) {
            addCriterion("member_areainfo in", values, "memberAreainfo");
            return (Criteria) this;
        }

        public Criteria andMemberAreainfoNotIn(List<String> values) {
            addCriterion("member_areainfo not in", values, "memberAreainfo");
            return (Criteria) this;
        }

        public Criteria andMemberAreainfoBetween(String value1, String value2) {
            addCriterion("member_areainfo between", value1, value2, "memberAreainfo");
            return (Criteria) this;
        }

        public Criteria andMemberAreainfoNotBetween(String value1, String value2) {
            addCriterion("member_areainfo not between", value1, value2, "memberAreainfo");
            return (Criteria) this;
        }

        public Criteria andMemberIdImageIsNull() {
            addCriterion("member_id_image is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdImageIsNotNull() {
            addCriterion("member_id_image is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdImageEqualTo(String value) {
            addCriterion("member_id_image =", value, "memberIdImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdImageNotEqualTo(String value) {
            addCriterion("member_id_image <>", value, "memberIdImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdImageGreaterThan(String value) {
            addCriterion("member_id_image >", value, "memberIdImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdImageGreaterThanOrEqualTo(String value) {
            addCriterion("member_id_image >=", value, "memberIdImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdImageLessThan(String value) {
            addCriterion("member_id_image <", value, "memberIdImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdImageLessThanOrEqualTo(String value) {
            addCriterion("member_id_image <=", value, "memberIdImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdImageLike(String value) {
            addCriterion("member_id_image like", value, "memberIdImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdImageNotLike(String value) {
            addCriterion("member_id_image not like", value, "memberIdImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdImageIn(List<String> values) {
            addCriterion("member_id_image in", values, "memberIdImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdImageNotIn(List<String> values) {
            addCriterion("member_id_image not in", values, "memberIdImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdImageBetween(String value1, String value2) {
            addCriterion("member_id_image between", value1, value2, "memberIdImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdImageNotBetween(String value1, String value2) {
            addCriterion("member_id_image not between", value1, value2, "memberIdImage");
            return (Criteria) this;
        }

        public Criteria andMemberAuthenticationCommentIsNull() {
            addCriterion("member_authentication_comment is null");
            return (Criteria) this;
        }

        public Criteria andMemberAuthenticationCommentIsNotNull() {
            addCriterion("member_authentication_comment is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAuthenticationCommentEqualTo(String value) {
            addCriterion("member_authentication_comment =", value, "memberAuthenticationComment");
            return (Criteria) this;
        }

        public Criteria andMemberAuthenticationCommentNotEqualTo(String value) {
            addCriterion("member_authentication_comment <>", value, "memberAuthenticationComment");
            return (Criteria) this;
        }

        public Criteria andMemberAuthenticationCommentGreaterThan(String value) {
            addCriterion("member_authentication_comment >", value, "memberAuthenticationComment");
            return (Criteria) this;
        }

        public Criteria andMemberAuthenticationCommentGreaterThanOrEqualTo(String value) {
            addCriterion("member_authentication_comment >=", value, "memberAuthenticationComment");
            return (Criteria) this;
        }

        public Criteria andMemberAuthenticationCommentLessThan(String value) {
            addCriterion("member_authentication_comment <", value, "memberAuthenticationComment");
            return (Criteria) this;
        }

        public Criteria andMemberAuthenticationCommentLessThanOrEqualTo(String value) {
            addCriterion("member_authentication_comment <=", value, "memberAuthenticationComment");
            return (Criteria) this;
        }

        public Criteria andMemberAuthenticationCommentLike(String value) {
            addCriterion("member_authentication_comment like", value, "memberAuthenticationComment");
            return (Criteria) this;
        }

        public Criteria andMemberAuthenticationCommentNotLike(String value) {
            addCriterion("member_authentication_comment not like", value, "memberAuthenticationComment");
            return (Criteria) this;
        }

        public Criteria andMemberAuthenticationCommentIn(List<String> values) {
            addCriterion("member_authentication_comment in", values, "memberAuthenticationComment");
            return (Criteria) this;
        }

        public Criteria andMemberAuthenticationCommentNotIn(List<String> values) {
            addCriterion("member_authentication_comment not in", values, "memberAuthenticationComment");
            return (Criteria) this;
        }

        public Criteria andMemberAuthenticationCommentBetween(String value1, String value2) {
            addCriterion("member_authentication_comment between", value1, value2, "memberAuthenticationComment");
            return (Criteria) this;
        }

        public Criteria andMemberAuthenticationCommentNotBetween(String value1, String value2) {
            addCriterion("member_authentication_comment not between", value1, value2, "memberAuthenticationComment");
            return (Criteria) this;
        }

        public Criteria andMemberContributeSyNumIsNull() {
            addCriterion("member_contribute_sy_num is null");
            return (Criteria) this;
        }

        public Criteria andMemberContributeSyNumIsNotNull() {
            addCriterion("member_contribute_sy_num is not null");
            return (Criteria) this;
        }

        public Criteria andMemberContributeSyNumEqualTo(Integer value) {
            addCriterion("member_contribute_sy_num =", value, "memberContributeSyNum");
            return (Criteria) this;
        }

        public Criteria andMemberContributeSyNumNotEqualTo(Integer value) {
            addCriterion("member_contribute_sy_num <>", value, "memberContributeSyNum");
            return (Criteria) this;
        }

        public Criteria andMemberContributeSyNumGreaterThan(Integer value) {
            addCriterion("member_contribute_sy_num >", value, "memberContributeSyNum");
            return (Criteria) this;
        }

        public Criteria andMemberContributeSyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_contribute_sy_num >=", value, "memberContributeSyNum");
            return (Criteria) this;
        }

        public Criteria andMemberContributeSyNumLessThan(Integer value) {
            addCriterion("member_contribute_sy_num <", value, "memberContributeSyNum");
            return (Criteria) this;
        }

        public Criteria andMemberContributeSyNumLessThanOrEqualTo(Integer value) {
            addCriterion("member_contribute_sy_num <=", value, "memberContributeSyNum");
            return (Criteria) this;
        }

        public Criteria andMemberContributeSyNumIn(List<Integer> values) {
            addCriterion("member_contribute_sy_num in", values, "memberContributeSyNum");
            return (Criteria) this;
        }

        public Criteria andMemberContributeSyNumNotIn(List<Integer> values) {
            addCriterion("member_contribute_sy_num not in", values, "memberContributeSyNum");
            return (Criteria) this;
        }

        public Criteria andMemberContributeSyNumBetween(Integer value1, Integer value2) {
            addCriterion("member_contribute_sy_num between", value1, value2, "memberContributeSyNum");
            return (Criteria) this;
        }

        public Criteria andMemberContributeSyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("member_contribute_sy_num not between", value1, value2, "memberContributeSyNum");
            return (Criteria) this;
        }

        public Criteria andMemberUsedSyNumIsNull() {
            addCriterion("member_used_sy_num is null");
            return (Criteria) this;
        }

        public Criteria andMemberUsedSyNumIsNotNull() {
            addCriterion("member_used_sy_num is not null");
            return (Criteria) this;
        }

        public Criteria andMemberUsedSyNumEqualTo(Integer value) {
            addCriterion("member_used_sy_num =", value, "memberUsedSyNum");
            return (Criteria) this;
        }

        public Criteria andMemberUsedSyNumNotEqualTo(Integer value) {
            addCriterion("member_used_sy_num <>", value, "memberUsedSyNum");
            return (Criteria) this;
        }

        public Criteria andMemberUsedSyNumGreaterThan(Integer value) {
            addCriterion("member_used_sy_num >", value, "memberUsedSyNum");
            return (Criteria) this;
        }

        public Criteria andMemberUsedSyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_used_sy_num >=", value, "memberUsedSyNum");
            return (Criteria) this;
        }

        public Criteria andMemberUsedSyNumLessThan(Integer value) {
            addCriterion("member_used_sy_num <", value, "memberUsedSyNum");
            return (Criteria) this;
        }

        public Criteria andMemberUsedSyNumLessThanOrEqualTo(Integer value) {
            addCriterion("member_used_sy_num <=", value, "memberUsedSyNum");
            return (Criteria) this;
        }

        public Criteria andMemberUsedSyNumIn(List<Integer> values) {
            addCriterion("member_used_sy_num in", values, "memberUsedSyNum");
            return (Criteria) this;
        }

        public Criteria andMemberUsedSyNumNotIn(List<Integer> values) {
            addCriterion("member_used_sy_num not in", values, "memberUsedSyNum");
            return (Criteria) this;
        }

        public Criteria andMemberUsedSyNumBetween(Integer value1, Integer value2) {
            addCriterion("member_used_sy_num between", value1, value2, "memberUsedSyNum");
            return (Criteria) this;
        }

        public Criteria andMemberUsedSyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("member_used_sy_num not between", value1, value2, "memberUsedSyNum");
            return (Criteria) this;
        }

        public Criteria andMemberContributeMoneyIsNull() {
            addCriterion("member_contribute_money is null");
            return (Criteria) this;
        }

        public Criteria andMemberContributeMoneyIsNotNull() {
            addCriterion("member_contribute_money is not null");
            return (Criteria) this;
        }

        public Criteria andMemberContributeMoneyEqualTo(BigDecimal value) {
            addCriterion("member_contribute_money =", value, "memberContributeMoney");
            return (Criteria) this;
        }

        public Criteria andMemberContributeMoneyNotEqualTo(BigDecimal value) {
            addCriterion("member_contribute_money <>", value, "memberContributeMoney");
            return (Criteria) this;
        }

        public Criteria andMemberContributeMoneyGreaterThan(BigDecimal value) {
            addCriterion("member_contribute_money >", value, "memberContributeMoney");
            return (Criteria) this;
        }

        public Criteria andMemberContributeMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("member_contribute_money >=", value, "memberContributeMoney");
            return (Criteria) this;
        }

        public Criteria andMemberContributeMoneyLessThan(BigDecimal value) {
            addCriterion("member_contribute_money <", value, "memberContributeMoney");
            return (Criteria) this;
        }

        public Criteria andMemberContributeMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("member_contribute_money <=", value, "memberContributeMoney");
            return (Criteria) this;
        }

        public Criteria andMemberContributeMoneyIn(List<BigDecimal> values) {
            addCriterion("member_contribute_money in", values, "memberContributeMoney");
            return (Criteria) this;
        }

        public Criteria andMemberContributeMoneyNotIn(List<BigDecimal> values) {
            addCriterion("member_contribute_money not in", values, "memberContributeMoney");
            return (Criteria) this;
        }

        public Criteria andMemberContributeMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_contribute_money between", value1, value2, "memberContributeMoney");
            return (Criteria) this;
        }

        public Criteria andMemberContributeMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_contribute_money not between", value1, value2, "memberContributeMoney");
            return (Criteria) this;
        }

        public Criteria andShowGoodsDonationAgreementIsNull() {
            addCriterion("show_goods_donation_agreement is null");
            return (Criteria) this;
        }

        public Criteria andShowGoodsDonationAgreementIsNotNull() {
            addCriterion("show_goods_donation_agreement is not null");
            return (Criteria) this;
        }

        public Criteria andShowGoodsDonationAgreementEqualTo(Byte value) {
            addCriterion("show_goods_donation_agreement =", value, "showGoodsDonationAgreement");
            return (Criteria) this;
        }

        public Criteria andShowGoodsDonationAgreementNotEqualTo(Byte value) {
            addCriterion("show_goods_donation_agreement <>", value, "showGoodsDonationAgreement");
            return (Criteria) this;
        }

        public Criteria andShowGoodsDonationAgreementGreaterThan(Byte value) {
            addCriterion("show_goods_donation_agreement >", value, "showGoodsDonationAgreement");
            return (Criteria) this;
        }

        public Criteria andShowGoodsDonationAgreementGreaterThanOrEqualTo(Byte value) {
            addCriterion("show_goods_donation_agreement >=", value, "showGoodsDonationAgreement");
            return (Criteria) this;
        }

        public Criteria andShowGoodsDonationAgreementLessThan(Byte value) {
            addCriterion("show_goods_donation_agreement <", value, "showGoodsDonationAgreement");
            return (Criteria) this;
        }

        public Criteria andShowGoodsDonationAgreementLessThanOrEqualTo(Byte value) {
            addCriterion("show_goods_donation_agreement <=", value, "showGoodsDonationAgreement");
            return (Criteria) this;
        }

        public Criteria andShowGoodsDonationAgreementIn(List<Byte> values) {
            addCriterion("show_goods_donation_agreement in", values, "showGoodsDonationAgreement");
            return (Criteria) this;
        }

        public Criteria andShowGoodsDonationAgreementNotIn(List<Byte> values) {
            addCriterion("show_goods_donation_agreement not in", values, "showGoodsDonationAgreement");
            return (Criteria) this;
        }

        public Criteria andShowGoodsDonationAgreementBetween(Byte value1, Byte value2) {
            addCriterion("show_goods_donation_agreement between", value1, value2, "showGoodsDonationAgreement");
            return (Criteria) this;
        }

        public Criteria andShowGoodsDonationAgreementNotBetween(Byte value1, Byte value2) {
            addCriterion("show_goods_donation_agreement not between", value1, value2, "showGoodsDonationAgreement");
            return (Criteria) this;
        }

        public Criteria andMemberWxopenidIsNull() {
            addCriterion("member_wxopenid is null");
            return (Criteria) this;
        }

        public Criteria andMemberWxopenidIsNotNull() {
            addCriterion("member_wxopenid is not null");
            return (Criteria) this;
        }

        public Criteria andMemberWxopenidEqualTo(String value) {
            addCriterion("member_wxopenid =", value, "memberWxopenid");
            return (Criteria) this;
        }

        public Criteria andMemberWxopenidNotEqualTo(String value) {
            addCriterion("member_wxopenid <>", value, "memberWxopenid");
            return (Criteria) this;
        }

        public Criteria andMemberWxopenidGreaterThan(String value) {
            addCriterion("member_wxopenid >", value, "memberWxopenid");
            return (Criteria) this;
        }

        public Criteria andMemberWxopenidGreaterThanOrEqualTo(String value) {
            addCriterion("member_wxopenid >=", value, "memberWxopenid");
            return (Criteria) this;
        }

        public Criteria andMemberWxopenidLessThan(String value) {
            addCriterion("member_wxopenid <", value, "memberWxopenid");
            return (Criteria) this;
        }

        public Criteria andMemberWxopenidLessThanOrEqualTo(String value) {
            addCriterion("member_wxopenid <=", value, "memberWxopenid");
            return (Criteria) this;
        }

        public Criteria andMemberWxopenidLike(String value) {
            addCriterion("member_wxopenid like", value, "memberWxopenid");
            return (Criteria) this;
        }

        public Criteria andMemberWxopenidNotLike(String value) {
            addCriterion("member_wxopenid not like", value, "memberWxopenid");
            return (Criteria) this;
        }

        public Criteria andMemberWxopenidIn(List<String> values) {
            addCriterion("member_wxopenid in", values, "memberWxopenid");
            return (Criteria) this;
        }

        public Criteria andMemberWxopenidNotIn(List<String> values) {
            addCriterion("member_wxopenid not in", values, "memberWxopenid");
            return (Criteria) this;
        }

        public Criteria andMemberWxopenidBetween(String value1, String value2) {
            addCriterion("member_wxopenid between", value1, value2, "memberWxopenid");
            return (Criteria) this;
        }

        public Criteria andMemberWxopenidNotBetween(String value1, String value2) {
            addCriterion("member_wxopenid not between", value1, value2, "memberWxopenid");
            return (Criteria) this;
        }

        public Criteria andSyPointsIsNull() {
            addCriterion("sy_points is null");
            return (Criteria) this;
        }

        public Criteria andSyPointsIsNotNull() {
            addCriterion("sy_points is not null");
            return (Criteria) this;
        }

        public Criteria andSyPointsEqualTo(Long value) {
            addCriterion("sy_points =", value, "syPoints");
            return (Criteria) this;
        }

        public Criteria andSyPointsNotEqualTo(Long value) {
            addCriterion("sy_points <>", value, "syPoints");
            return (Criteria) this;
        }

        public Criteria andSyPointsGreaterThan(Long value) {
            addCriterion("sy_points >", value, "syPoints");
            return (Criteria) this;
        }

        public Criteria andSyPointsGreaterThanOrEqualTo(Long value) {
            addCriterion("sy_points >=", value, "syPoints");
            return (Criteria) this;
        }

        public Criteria andSyPointsLessThan(Long value) {
            addCriterion("sy_points <", value, "syPoints");
            return (Criteria) this;
        }

        public Criteria andSyPointsLessThanOrEqualTo(Long value) {
            addCriterion("sy_points <=", value, "syPoints");
            return (Criteria) this;
        }

        public Criteria andSyPointsIn(List<Long> values) {
            addCriterion("sy_points in", values, "syPoints");
            return (Criteria) this;
        }

        public Criteria andSyPointsNotIn(List<Long> values) {
            addCriterion("sy_points not in", values, "syPoints");
            return (Criteria) this;
        }

        public Criteria andSyPointsBetween(Long value1, Long value2) {
            addCriterion("sy_points between", value1, value2, "syPoints");
            return (Criteria) this;
        }

        public Criteria andSyPointsNotBetween(Long value1, Long value2) {
            addCriterion("sy_points not between", value1, value2, "syPoints");
            return (Criteria) this;
        }

        public Criteria andSyPointsUsedIsNull() {
            addCriterion("sy_points_used is null");
            return (Criteria) this;
        }

        public Criteria andSyPointsUsedIsNotNull() {
            addCriterion("sy_points_used is not null");
            return (Criteria) this;
        }

        public Criteria andSyPointsUsedEqualTo(Long value) {
            addCriterion("sy_points_used =", value, "syPointsUsed");
            return (Criteria) this;
        }

        public Criteria andSyPointsUsedNotEqualTo(Long value) {
            addCriterion("sy_points_used <>", value, "syPointsUsed");
            return (Criteria) this;
        }

        public Criteria andSyPointsUsedGreaterThan(Long value) {
            addCriterion("sy_points_used >", value, "syPointsUsed");
            return (Criteria) this;
        }

        public Criteria andSyPointsUsedGreaterThanOrEqualTo(Long value) {
            addCriterion("sy_points_used >=", value, "syPointsUsed");
            return (Criteria) this;
        }

        public Criteria andSyPointsUsedLessThan(Long value) {
            addCriterion("sy_points_used <", value, "syPointsUsed");
            return (Criteria) this;
        }

        public Criteria andSyPointsUsedLessThanOrEqualTo(Long value) {
            addCriterion("sy_points_used <=", value, "syPointsUsed");
            return (Criteria) this;
        }

        public Criteria andSyPointsUsedIn(List<Long> values) {
            addCriterion("sy_points_used in", values, "syPointsUsed");
            return (Criteria) this;
        }

        public Criteria andSyPointsUsedNotIn(List<Long> values) {
            addCriterion("sy_points_used not in", values, "syPointsUsed");
            return (Criteria) this;
        }

        public Criteria andSyPointsUsedBetween(Long value1, Long value2) {
            addCriterion("sy_points_used between", value1, value2, "syPointsUsed");
            return (Criteria) this;
        }

        public Criteria andSyPointsUsedNotBetween(Long value1, Long value2) {
            addCriterion("sy_points_used not between", value1, value2, "syPointsUsed");
            return (Criteria) this;
        }

        public Criteria andExtraLuckyDrawNumIsNull() {
            addCriterion("extra_lucky_draw_num is null");
            return (Criteria) this;
        }

        public Criteria andExtraLuckyDrawNumIsNotNull() {
            addCriterion("extra_lucky_draw_num is not null");
            return (Criteria) this;
        }

        public Criteria andExtraLuckyDrawNumEqualTo(Integer value) {
            addCriterion("extra_lucky_draw_num =", value, "extraLuckyDrawNum");
            return (Criteria) this;
        }

        public Criteria andExtraLuckyDrawNumNotEqualTo(Integer value) {
            addCriterion("extra_lucky_draw_num <>", value, "extraLuckyDrawNum");
            return (Criteria) this;
        }

        public Criteria andExtraLuckyDrawNumGreaterThan(Integer value) {
            addCriterion("extra_lucky_draw_num >", value, "extraLuckyDrawNum");
            return (Criteria) this;
        }

        public Criteria andExtraLuckyDrawNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("extra_lucky_draw_num >=", value, "extraLuckyDrawNum");
            return (Criteria) this;
        }

        public Criteria andExtraLuckyDrawNumLessThan(Integer value) {
            addCriterion("extra_lucky_draw_num <", value, "extraLuckyDrawNum");
            return (Criteria) this;
        }

        public Criteria andExtraLuckyDrawNumLessThanOrEqualTo(Integer value) {
            addCriterion("extra_lucky_draw_num <=", value, "extraLuckyDrawNum");
            return (Criteria) this;
        }

        public Criteria andExtraLuckyDrawNumIn(List<Integer> values) {
            addCriterion("extra_lucky_draw_num in", values, "extraLuckyDrawNum");
            return (Criteria) this;
        }

        public Criteria andExtraLuckyDrawNumNotIn(List<Integer> values) {
            addCriterion("extra_lucky_draw_num not in", values, "extraLuckyDrawNum");
            return (Criteria) this;
        }

        public Criteria andExtraLuckyDrawNumBetween(Integer value1, Integer value2) {
            addCriterion("extra_lucky_draw_num between", value1, value2, "extraLuckyDrawNum");
            return (Criteria) this;
        }

        public Criteria andExtraLuckyDrawNumNotBetween(Integer value1, Integer value2) {
            addCriterion("extra_lucky_draw_num not between", value1, value2, "extraLuckyDrawNum");
            return (Criteria) this;
        }

        public Criteria andLuckyDrawNumUsedIsNull() {
            addCriterion("lucky_draw_num_used is null");
            return (Criteria) this;
        }

        public Criteria andLuckyDrawNumUsedIsNotNull() {
            addCriterion("lucky_draw_num_used is not null");
            return (Criteria) this;
        }

        public Criteria andLuckyDrawNumUsedEqualTo(Integer value) {
            addCriterion("lucky_draw_num_used =", value, "luckyDrawNumUsed");
            return (Criteria) this;
        }

        public Criteria andLuckyDrawNumUsedNotEqualTo(Integer value) {
            addCriterion("lucky_draw_num_used <>", value, "luckyDrawNumUsed");
            return (Criteria) this;
        }

        public Criteria andLuckyDrawNumUsedGreaterThan(Integer value) {
            addCriterion("lucky_draw_num_used >", value, "luckyDrawNumUsed");
            return (Criteria) this;
        }

        public Criteria andLuckyDrawNumUsedGreaterThanOrEqualTo(Integer value) {
            addCriterion("lucky_draw_num_used >=", value, "luckyDrawNumUsed");
            return (Criteria) this;
        }

        public Criteria andLuckyDrawNumUsedLessThan(Integer value) {
            addCriterion("lucky_draw_num_used <", value, "luckyDrawNumUsed");
            return (Criteria) this;
        }

        public Criteria andLuckyDrawNumUsedLessThanOrEqualTo(Integer value) {
            addCriterion("lucky_draw_num_used <=", value, "luckyDrawNumUsed");
            return (Criteria) this;
        }

        public Criteria andLuckyDrawNumUsedIn(List<Integer> values) {
            addCriterion("lucky_draw_num_used in", values, "luckyDrawNumUsed");
            return (Criteria) this;
        }

        public Criteria andLuckyDrawNumUsedNotIn(List<Integer> values) {
            addCriterion("lucky_draw_num_used not in", values, "luckyDrawNumUsed");
            return (Criteria) this;
        }

        public Criteria andLuckyDrawNumUsedBetween(Integer value1, Integer value2) {
            addCriterion("lucky_draw_num_used between", value1, value2, "luckyDrawNumUsed");
            return (Criteria) this;
        }

        public Criteria andLuckyDrawNumUsedNotBetween(Integer value1, Integer value2) {
            addCriterion("lucky_draw_num_used not between", value1, value2, "luckyDrawNumUsed");
            return (Criteria) this;
        }

        public Criteria andMemberIcIdIsNull() {
            addCriterion("member_ic_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIcIdIsNotNull() {
            addCriterion("member_ic_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIcIdEqualTo(Integer value) {
            addCriterion("member_ic_id =", value, "memberIcId");
            return (Criteria) this;
        }

        public Criteria andMemberIcIdNotEqualTo(Integer value) {
            addCriterion("member_ic_id <>", value, "memberIcId");
            return (Criteria) this;
        }

        public Criteria andMemberIcIdGreaterThan(Integer value) {
            addCriterion("member_ic_id >", value, "memberIcId");
            return (Criteria) this;
        }

        public Criteria andMemberIcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_ic_id >=", value, "memberIcId");
            return (Criteria) this;
        }

        public Criteria andMemberIcIdLessThan(Integer value) {
            addCriterion("member_ic_id <", value, "memberIcId");
            return (Criteria) this;
        }

        public Criteria andMemberIcIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_ic_id <=", value, "memberIcId");
            return (Criteria) this;
        }

        public Criteria andMemberIcIdIn(List<Integer> values) {
            addCriterion("member_ic_id in", values, "memberIcId");
            return (Criteria) this;
        }

        public Criteria andMemberIcIdNotIn(List<Integer> values) {
            addCriterion("member_ic_id not in", values, "memberIcId");
            return (Criteria) this;
        }

        public Criteria andMemberIcIdBetween(Integer value1, Integer value2) {
            addCriterion("member_ic_id between", value1, value2, "memberIcId");
            return (Criteria) this;
        }

        public Criteria andMemberIcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_ic_id not between", value1, value2, "memberIcId");
            return (Criteria) this;
        }

        public Criteria andMemberUrlIsNull() {
            addCriterion("member_url is null");
            return (Criteria) this;
        }

        public Criteria andMemberUrlIsNotNull() {
            addCriterion("member_url is not null");
            return (Criteria) this;
        }

        public Criteria andMemberUrlEqualTo(String value) {
            addCriterion("member_url =", value, "memberUrl");
            return (Criteria) this;
        }

        public Criteria andMemberUrlNotEqualTo(String value) {
            addCriterion("member_url <>", value, "memberUrl");
            return (Criteria) this;
        }

        public Criteria andMemberUrlGreaterThan(String value) {
            addCriterion("member_url >", value, "memberUrl");
            return (Criteria) this;
        }

        public Criteria andMemberUrlGreaterThanOrEqualTo(String value) {
            addCriterion("member_url >=", value, "memberUrl");
            return (Criteria) this;
        }

        public Criteria andMemberUrlLessThan(String value) {
            addCriterion("member_url <", value, "memberUrl");
            return (Criteria) this;
        }

        public Criteria andMemberUrlLessThanOrEqualTo(String value) {
            addCriterion("member_url <=", value, "memberUrl");
            return (Criteria) this;
        }

        public Criteria andMemberUrlLike(String value) {
            addCriterion("member_url like", value, "memberUrl");
            return (Criteria) this;
        }

        public Criteria andMemberUrlNotLike(String value) {
            addCriterion("member_url not like", value, "memberUrl");
            return (Criteria) this;
        }

        public Criteria andMemberUrlIn(List<String> values) {
            addCriterion("member_url in", values, "memberUrl");
            return (Criteria) this;
        }

        public Criteria andMemberUrlNotIn(List<String> values) {
            addCriterion("member_url not in", values, "memberUrl");
            return (Criteria) this;
        }

        public Criteria andMemberUrlBetween(String value1, String value2) {
            addCriterion("member_url between", value1, value2, "memberUrl");
            return (Criteria) this;
        }

        public Criteria andMemberUrlNotBetween(String value1, String value2) {
            addCriterion("member_url not between", value1, value2, "memberUrl");
            return (Criteria) this;
        }

        public Criteria andMemberFamilyIdIsNull() {
            addCriterion("member_family_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberFamilyIdIsNotNull() {
            addCriterion("member_family_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberFamilyIdEqualTo(Integer value) {
            addCriterion("member_family_id =", value, "memberFamilyId");
            return (Criteria) this;
        }

        public Criteria andMemberFamilyIdNotEqualTo(Integer value) {
            addCriterion("member_family_id <>", value, "memberFamilyId");
            return (Criteria) this;
        }

        public Criteria andMemberFamilyIdGreaterThan(Integer value) {
            addCriterion("member_family_id >", value, "memberFamilyId");
            return (Criteria) this;
        }

        public Criteria andMemberFamilyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_family_id >=", value, "memberFamilyId");
            return (Criteria) this;
        }

        public Criteria andMemberFamilyIdLessThan(Integer value) {
            addCriterion("member_family_id <", value, "memberFamilyId");
            return (Criteria) this;
        }

        public Criteria andMemberFamilyIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_family_id <=", value, "memberFamilyId");
            return (Criteria) this;
        }

        public Criteria andMemberFamilyIdIn(List<Integer> values) {
            addCriterion("member_family_id in", values, "memberFamilyId");
            return (Criteria) this;
        }

        public Criteria andMemberFamilyIdNotIn(List<Integer> values) {
            addCriterion("member_family_id not in", values, "memberFamilyId");
            return (Criteria) this;
        }

        public Criteria andMemberFamilyIdBetween(Integer value1, Integer value2) {
            addCriterion("member_family_id between", value1, value2, "memberFamilyId");
            return (Criteria) this;
        }

        public Criteria andMemberFamilyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_family_id not between", value1, value2, "memberFamilyId");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNull() {
            addCriterion("native_place is null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNotNull() {
            addCriterion("native_place is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceEqualTo(String value) {
            addCriterion("native_place =", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotEqualTo(String value) {
            addCriterion("native_place <>", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThan(String value) {
            addCriterion("native_place >", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("native_place >=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThan(String value) {
            addCriterion("native_place <", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("native_place <=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLike(String value) {
            addCriterion("native_place like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotLike(String value) {
            addCriterion("native_place not like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIn(List<String> values) {
            addCriterion("native_place in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotIn(List<String> values) {
            addCriterion("native_place not in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceBetween(String value1, String value2) {
            addCriterion("native_place between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotBetween(String value1, String value2) {
            addCriterion("native_place not between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andCmLevelIsNull() {
            addCriterion("cm_level is null");
            return (Criteria) this;
        }

        public Criteria andCmLevelIsNotNull() {
            addCriterion("cm_level is not null");
            return (Criteria) this;
        }

        public Criteria andCmLevelEqualTo(Integer value) {
            addCriterion("cm_level =", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelNotEqualTo(Integer value) {
            addCriterion("cm_level <>", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelGreaterThan(Integer value) {
            addCriterion("cm_level >", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_level >=", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelLessThan(Integer value) {
            addCriterion("cm_level <", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelLessThanOrEqualTo(Integer value) {
            addCriterion("cm_level <=", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelIn(List<Integer> values) {
            addCriterion("cm_level in", values, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelNotIn(List<Integer> values) {
            addCriterion("cm_level not in", values, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelBetween(Integer value1, Integer value2) {
            addCriterion("cm_level between", value1, value2, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_level not between", value1, value2, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andBocPointsIsNull() {
            addCriterion("boc_points is null");
            return (Criteria) this;
        }

        public Criteria andBocPointsIsNotNull() {
            addCriterion("boc_points is not null");
            return (Criteria) this;
        }

        public Criteria andBocPointsEqualTo(Long value) {
            addCriterion("boc_points =", value, "bocPoints");
            return (Criteria) this;
        }

        public Criteria andBocPointsNotEqualTo(Long value) {
            addCriterion("boc_points <>", value, "bocPoints");
            return (Criteria) this;
        }

        public Criteria andBocPointsGreaterThan(Long value) {
            addCriterion("boc_points >", value, "bocPoints");
            return (Criteria) this;
        }

        public Criteria andBocPointsGreaterThanOrEqualTo(Long value) {
            addCriterion("boc_points >=", value, "bocPoints");
            return (Criteria) this;
        }

        public Criteria andBocPointsLessThan(Long value) {
            addCriterion("boc_points <", value, "bocPoints");
            return (Criteria) this;
        }

        public Criteria andBocPointsLessThanOrEqualTo(Long value) {
            addCriterion("boc_points <=", value, "bocPoints");
            return (Criteria) this;
        }

        public Criteria andBocPointsIn(List<Long> values) {
            addCriterion("boc_points in", values, "bocPoints");
            return (Criteria) this;
        }

        public Criteria andBocPointsNotIn(List<Long> values) {
            addCriterion("boc_points not in", values, "bocPoints");
            return (Criteria) this;
        }

        public Criteria andBocPointsBetween(Long value1, Long value2) {
            addCriterion("boc_points between", value1, value2, "bocPoints");
            return (Criteria) this;
        }

        public Criteria andBocPointsNotBetween(Long value1, Long value2) {
            addCriterion("boc_points not between", value1, value2, "bocPoints");
            return (Criteria) this;
        }

        public Criteria andBocPointsUsedIsNull() {
            addCriterion("boc_points_used is null");
            return (Criteria) this;
        }

        public Criteria andBocPointsUsedIsNotNull() {
            addCriterion("boc_points_used is not null");
            return (Criteria) this;
        }

        public Criteria andBocPointsUsedEqualTo(Long value) {
            addCriterion("boc_points_used =", value, "bocPointsUsed");
            return (Criteria) this;
        }

        public Criteria andBocPointsUsedNotEqualTo(Long value) {
            addCriterion("boc_points_used <>", value, "bocPointsUsed");
            return (Criteria) this;
        }

        public Criteria andBocPointsUsedGreaterThan(Long value) {
            addCriterion("boc_points_used >", value, "bocPointsUsed");
            return (Criteria) this;
        }

        public Criteria andBocPointsUsedGreaterThanOrEqualTo(Long value) {
            addCriterion("boc_points_used >=", value, "bocPointsUsed");
            return (Criteria) this;
        }

        public Criteria andBocPointsUsedLessThan(Long value) {
            addCriterion("boc_points_used <", value, "bocPointsUsed");
            return (Criteria) this;
        }

        public Criteria andBocPointsUsedLessThanOrEqualTo(Long value) {
            addCriterion("boc_points_used <=", value, "bocPointsUsed");
            return (Criteria) this;
        }

        public Criteria andBocPointsUsedIn(List<Long> values) {
            addCriterion("boc_points_used in", values, "bocPointsUsed");
            return (Criteria) this;
        }

        public Criteria andBocPointsUsedNotIn(List<Long> values) {
            addCriterion("boc_points_used not in", values, "bocPointsUsed");
            return (Criteria) this;
        }

        public Criteria andBocPointsUsedBetween(Long value1, Long value2) {
            addCriterion("boc_points_used between", value1, value2, "bocPointsUsed");
            return (Criteria) this;
        }

        public Criteria andBocPointsUsedNotBetween(Long value1, Long value2) {
            addCriterion("boc_points_used not between", value1, value2, "bocPointsUsed");
            return (Criteria) this;
        }

        public Criteria andBocPointsRankIsNull() {
            addCriterion("boc_points_rank is null");
            return (Criteria) this;
        }

        public Criteria andBocPointsRankIsNotNull() {
            addCriterion("boc_points_rank is not null");
            return (Criteria) this;
        }

        public Criteria andBocPointsRankEqualTo(Integer value) {
            addCriterion("boc_points_rank =", value, "bocPointsRank");
            return (Criteria) this;
        }

        public Criteria andBocPointsRankNotEqualTo(Integer value) {
            addCriterion("boc_points_rank <>", value, "bocPointsRank");
            return (Criteria) this;
        }

        public Criteria andBocPointsRankGreaterThan(Integer value) {
            addCriterion("boc_points_rank >", value, "bocPointsRank");
            return (Criteria) this;
        }

        public Criteria andBocPointsRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("boc_points_rank >=", value, "bocPointsRank");
            return (Criteria) this;
        }

        public Criteria andBocPointsRankLessThan(Integer value) {
            addCriterion("boc_points_rank <", value, "bocPointsRank");
            return (Criteria) this;
        }

        public Criteria andBocPointsRankLessThanOrEqualTo(Integer value) {
            addCriterion("boc_points_rank <=", value, "bocPointsRank");
            return (Criteria) this;
        }

        public Criteria andBocPointsRankIn(List<Integer> values) {
            addCriterion("boc_points_rank in", values, "bocPointsRank");
            return (Criteria) this;
        }

        public Criteria andBocPointsRankNotIn(List<Integer> values) {
            addCriterion("boc_points_rank not in", values, "bocPointsRank");
            return (Criteria) this;
        }

        public Criteria andBocPointsRankBetween(Integer value1, Integer value2) {
            addCriterion("boc_points_rank between", value1, value2, "bocPointsRank");
            return (Criteria) this;
        }

        public Criteria andBocPointsRankNotBetween(Integer value1, Integer value2) {
            addCriterion("boc_points_rank not between", value1, value2, "bocPointsRank");
            return (Criteria) this;
        }

        public Criteria andBocPointsDeptRankIsNull() {
            addCriterion("boc_points_dept_rank is null");
            return (Criteria) this;
        }

        public Criteria andBocPointsDeptRankIsNotNull() {
            addCriterion("boc_points_dept_rank is not null");
            return (Criteria) this;
        }

        public Criteria andBocPointsDeptRankEqualTo(Integer value) {
            addCriterion("boc_points_dept_rank =", value, "bocPointsDeptRank");
            return (Criteria) this;
        }

        public Criteria andBocPointsDeptRankNotEqualTo(Integer value) {
            addCriterion("boc_points_dept_rank <>", value, "bocPointsDeptRank");
            return (Criteria) this;
        }

        public Criteria andBocPointsDeptRankGreaterThan(Integer value) {
            addCriterion("boc_points_dept_rank >", value, "bocPointsDeptRank");
            return (Criteria) this;
        }

        public Criteria andBocPointsDeptRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("boc_points_dept_rank >=", value, "bocPointsDeptRank");
            return (Criteria) this;
        }

        public Criteria andBocPointsDeptRankLessThan(Integer value) {
            addCriterion("boc_points_dept_rank <", value, "bocPointsDeptRank");
            return (Criteria) this;
        }

        public Criteria andBocPointsDeptRankLessThanOrEqualTo(Integer value) {
            addCriterion("boc_points_dept_rank <=", value, "bocPointsDeptRank");
            return (Criteria) this;
        }

        public Criteria andBocPointsDeptRankIn(List<Integer> values) {
            addCriterion("boc_points_dept_rank in", values, "bocPointsDeptRank");
            return (Criteria) this;
        }

        public Criteria andBocPointsDeptRankNotIn(List<Integer> values) {
            addCriterion("boc_points_dept_rank not in", values, "bocPointsDeptRank");
            return (Criteria) this;
        }

        public Criteria andBocPointsDeptRankBetween(Integer value1, Integer value2) {
            addCriterion("boc_points_dept_rank between", value1, value2, "bocPointsDeptRank");
            return (Criteria) this;
        }

        public Criteria andBocPointsDeptRankNotBetween(Integer value1, Integer value2) {
            addCriterion("boc_points_dept_rank not between", value1, value2, "bocPointsDeptRank");
            return (Criteria) this;
        }

        public Criteria andBocLevelIsNull() {
            addCriterion("boc_level is null");
            return (Criteria) this;
        }

        public Criteria andBocLevelIsNotNull() {
            addCriterion("boc_level is not null");
            return (Criteria) this;
        }

        public Criteria andBocLevelEqualTo(Integer value) {
            addCriterion("boc_level =", value, "bocLevel");
            return (Criteria) this;
        }

        public Criteria andBocLevelNotEqualTo(Integer value) {
            addCriterion("boc_level <>", value, "bocLevel");
            return (Criteria) this;
        }

        public Criteria andBocLevelGreaterThan(Integer value) {
            addCriterion("boc_level >", value, "bocLevel");
            return (Criteria) this;
        }

        public Criteria andBocLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("boc_level >=", value, "bocLevel");
            return (Criteria) this;
        }

        public Criteria andBocLevelLessThan(Integer value) {
            addCriterion("boc_level <", value, "bocLevel");
            return (Criteria) this;
        }

        public Criteria andBocLevelLessThanOrEqualTo(Integer value) {
            addCriterion("boc_level <=", value, "bocLevel");
            return (Criteria) this;
        }

        public Criteria andBocLevelIn(List<Integer> values) {
            addCriterion("boc_level in", values, "bocLevel");
            return (Criteria) this;
        }

        public Criteria andBocLevelNotIn(List<Integer> values) {
            addCriterion("boc_level not in", values, "bocLevel");
            return (Criteria) this;
        }

        public Criteria andBocLevelBetween(Integer value1, Integer value2) {
            addCriterion("boc_level between", value1, value2, "bocLevel");
            return (Criteria) this;
        }

        public Criteria andBocLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("boc_level not between", value1, value2, "bocLevel");
            return (Criteria) this;
        }

        public Criteria andBocLevelTimeIsNull() {
            addCriterion("boc_level_time is null");
            return (Criteria) this;
        }

        public Criteria andBocLevelTimeIsNotNull() {
            addCriterion("boc_level_time is not null");
            return (Criteria) this;
        }

        public Criteria andBocLevelTimeEqualTo(String value) {
            addCriterion("boc_level_time =", value, "bocLevelTime");
            return (Criteria) this;
        }

        public Criteria andBocLevelTimeNotEqualTo(String value) {
            addCriterion("boc_level_time <>", value, "bocLevelTime");
            return (Criteria) this;
        }

        public Criteria andBocLevelTimeGreaterThan(String value) {
            addCriterion("boc_level_time >", value, "bocLevelTime");
            return (Criteria) this;
        }

        public Criteria andBocLevelTimeGreaterThanOrEqualTo(String value) {
            addCriterion("boc_level_time >=", value, "bocLevelTime");
            return (Criteria) this;
        }

        public Criteria andBocLevelTimeLessThan(String value) {
            addCriterion("boc_level_time <", value, "bocLevelTime");
            return (Criteria) this;
        }

        public Criteria andBocLevelTimeLessThanOrEqualTo(String value) {
            addCriterion("boc_level_time <=", value, "bocLevelTime");
            return (Criteria) this;
        }

        public Criteria andBocLevelTimeLike(String value) {
            addCriterion("boc_level_time like", value, "bocLevelTime");
            return (Criteria) this;
        }

        public Criteria andBocLevelTimeNotLike(String value) {
            addCriterion("boc_level_time not like", value, "bocLevelTime");
            return (Criteria) this;
        }

        public Criteria andBocLevelTimeIn(List<String> values) {
            addCriterion("boc_level_time in", values, "bocLevelTime");
            return (Criteria) this;
        }

        public Criteria andBocLevelTimeNotIn(List<String> values) {
            addCriterion("boc_level_time not in", values, "bocLevelTime");
            return (Criteria) this;
        }

        public Criteria andBocLevelTimeBetween(String value1, String value2) {
            addCriterion("boc_level_time between", value1, value2, "bocLevelTime");
            return (Criteria) this;
        }

        public Criteria andBocLevelTimeNotBetween(String value1, String value2) {
            addCriterion("boc_level_time not between", value1, value2, "bocLevelTime");
            return (Criteria) this;
        }

        public Criteria andMemberIdBackImageIsNull() {
            addCriterion("member_id_back_image is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdBackImageIsNotNull() {
            addCriterion("member_id_back_image is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdBackImageEqualTo(String value) {
            addCriterion("member_id_back_image =", value, "memberIdBackImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdBackImageNotEqualTo(String value) {
            addCriterion("member_id_back_image <>", value, "memberIdBackImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdBackImageGreaterThan(String value) {
            addCriterion("member_id_back_image >", value, "memberIdBackImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdBackImageGreaterThanOrEqualTo(String value) {
            addCriterion("member_id_back_image >=", value, "memberIdBackImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdBackImageLessThan(String value) {
            addCriterion("member_id_back_image <", value, "memberIdBackImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdBackImageLessThanOrEqualTo(String value) {
            addCriterion("member_id_back_image <=", value, "memberIdBackImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdBackImageLike(String value) {
            addCriterion("member_id_back_image like", value, "memberIdBackImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdBackImageNotLike(String value) {
            addCriterion("member_id_back_image not like", value, "memberIdBackImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdBackImageIn(List<String> values) {
            addCriterion("member_id_back_image in", values, "memberIdBackImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdBackImageNotIn(List<String> values) {
            addCriterion("member_id_back_image not in", values, "memberIdBackImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdBackImageBetween(String value1, String value2) {
            addCriterion("member_id_back_image between", value1, value2, "memberIdBackImage");
            return (Criteria) this;
        }

        public Criteria andMemberIdBackImageNotBetween(String value1, String value2) {
            addCriterion("member_id_back_image not between", value1, value2, "memberIdBackImage");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_member表的实体类
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
     * sy_member 2017-10-16
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