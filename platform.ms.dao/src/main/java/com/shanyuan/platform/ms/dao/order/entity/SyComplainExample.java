package com.shanyuan.platform.ms.dao.order.entity;

import java.util.ArrayList;
import java.util.List;

public class SyComplainExample {
    /**
     * sy_complain
     */
    protected String orderByClause;

    /**
     * sy_complain
     */
    protected boolean distinct;

    /**
     * sy_complain
     */
    protected List<Criteria> oredCriteria;

    public SyComplainExample() {
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
     * sy_complain 2017-10-30
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

        public Criteria andComplainIdIsNull() {
            addCriterion("complain_id is null");
            return (Criteria) this;
        }

        public Criteria andComplainIdIsNotNull() {
            addCriterion("complain_id is not null");
            return (Criteria) this;
        }

        public Criteria andComplainIdEqualTo(Integer value) {
            addCriterion("complain_id =", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotEqualTo(Integer value) {
            addCriterion("complain_id <>", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdGreaterThan(Integer value) {
            addCriterion("complain_id >", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("complain_id >=", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdLessThan(Integer value) {
            addCriterion("complain_id <", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdLessThanOrEqualTo(Integer value) {
            addCriterion("complain_id <=", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdIn(List<Integer> values) {
            addCriterion("complain_id in", values, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotIn(List<Integer> values) {
            addCriterion("complain_id not in", values, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdBetween(Integer value1, Integer value2) {
            addCriterion("complain_id between", value1, value2, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("complain_id not between", value1, value2, "complainId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andAccuserIdIsNull() {
            addCriterion("accuser_id is null");
            return (Criteria) this;
        }

        public Criteria andAccuserIdIsNotNull() {
            addCriterion("accuser_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccuserIdEqualTo(Integer value) {
            addCriterion("accuser_id =", value, "accuserId");
            return (Criteria) this;
        }

        public Criteria andAccuserIdNotEqualTo(Integer value) {
            addCriterion("accuser_id <>", value, "accuserId");
            return (Criteria) this;
        }

        public Criteria andAccuserIdGreaterThan(Integer value) {
            addCriterion("accuser_id >", value, "accuserId");
            return (Criteria) this;
        }

        public Criteria andAccuserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("accuser_id >=", value, "accuserId");
            return (Criteria) this;
        }

        public Criteria andAccuserIdLessThan(Integer value) {
            addCriterion("accuser_id <", value, "accuserId");
            return (Criteria) this;
        }

        public Criteria andAccuserIdLessThanOrEqualTo(Integer value) {
            addCriterion("accuser_id <=", value, "accuserId");
            return (Criteria) this;
        }

        public Criteria andAccuserIdIn(List<Integer> values) {
            addCriterion("accuser_id in", values, "accuserId");
            return (Criteria) this;
        }

        public Criteria andAccuserIdNotIn(List<Integer> values) {
            addCriterion("accuser_id not in", values, "accuserId");
            return (Criteria) this;
        }

        public Criteria andAccuserIdBetween(Integer value1, Integer value2) {
            addCriterion("accuser_id between", value1, value2, "accuserId");
            return (Criteria) this;
        }

        public Criteria andAccuserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("accuser_id not between", value1, value2, "accuserId");
            return (Criteria) this;
        }

        public Criteria andAccuserNameIsNull() {
            addCriterion("accuser_name is null");
            return (Criteria) this;
        }

        public Criteria andAccuserNameIsNotNull() {
            addCriterion("accuser_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccuserNameEqualTo(String value) {
            addCriterion("accuser_name =", value, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameNotEqualTo(String value) {
            addCriterion("accuser_name <>", value, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameGreaterThan(String value) {
            addCriterion("accuser_name >", value, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameGreaterThanOrEqualTo(String value) {
            addCriterion("accuser_name >=", value, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameLessThan(String value) {
            addCriterion("accuser_name <", value, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameLessThanOrEqualTo(String value) {
            addCriterion("accuser_name <=", value, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameLike(String value) {
            addCriterion("accuser_name like", value, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameNotLike(String value) {
            addCriterion("accuser_name not like", value, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameIn(List<String> values) {
            addCriterion("accuser_name in", values, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameNotIn(List<String> values) {
            addCriterion("accuser_name not in", values, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameBetween(String value1, String value2) {
            addCriterion("accuser_name between", value1, value2, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameNotBetween(String value1, String value2) {
            addCriterion("accuser_name not between", value1, value2, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccusedIdIsNull() {
            addCriterion("accused_id is null");
            return (Criteria) this;
        }

        public Criteria andAccusedIdIsNotNull() {
            addCriterion("accused_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccusedIdEqualTo(Integer value) {
            addCriterion("accused_id =", value, "accusedId");
            return (Criteria) this;
        }

        public Criteria andAccusedIdNotEqualTo(Integer value) {
            addCriterion("accused_id <>", value, "accusedId");
            return (Criteria) this;
        }

        public Criteria andAccusedIdGreaterThan(Integer value) {
            addCriterion("accused_id >", value, "accusedId");
            return (Criteria) this;
        }

        public Criteria andAccusedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("accused_id >=", value, "accusedId");
            return (Criteria) this;
        }

        public Criteria andAccusedIdLessThan(Integer value) {
            addCriterion("accused_id <", value, "accusedId");
            return (Criteria) this;
        }

        public Criteria andAccusedIdLessThanOrEqualTo(Integer value) {
            addCriterion("accused_id <=", value, "accusedId");
            return (Criteria) this;
        }

        public Criteria andAccusedIdIn(List<Integer> values) {
            addCriterion("accused_id in", values, "accusedId");
            return (Criteria) this;
        }

        public Criteria andAccusedIdNotIn(List<Integer> values) {
            addCriterion("accused_id not in", values, "accusedId");
            return (Criteria) this;
        }

        public Criteria andAccusedIdBetween(Integer value1, Integer value2) {
            addCriterion("accused_id between", value1, value2, "accusedId");
            return (Criteria) this;
        }

        public Criteria andAccusedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("accused_id not between", value1, value2, "accusedId");
            return (Criteria) this;
        }

        public Criteria andAccusedNameIsNull() {
            addCriterion("accused_name is null");
            return (Criteria) this;
        }

        public Criteria andAccusedNameIsNotNull() {
            addCriterion("accused_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccusedNameEqualTo(String value) {
            addCriterion("accused_name =", value, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameNotEqualTo(String value) {
            addCriterion("accused_name <>", value, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameGreaterThan(String value) {
            addCriterion("accused_name >", value, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameGreaterThanOrEqualTo(String value) {
            addCriterion("accused_name >=", value, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameLessThan(String value) {
            addCriterion("accused_name <", value, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameLessThanOrEqualTo(String value) {
            addCriterion("accused_name <=", value, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameLike(String value) {
            addCriterion("accused_name like", value, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameNotLike(String value) {
            addCriterion("accused_name not like", value, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameIn(List<String> values) {
            addCriterion("accused_name in", values, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameNotIn(List<String> values) {
            addCriterion("accused_name not in", values, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameBetween(String value1, String value2) {
            addCriterion("accused_name between", value1, value2, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameNotBetween(String value1, String value2) {
            addCriterion("accused_name not between", value1, value2, "accusedName");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectContentIsNull() {
            addCriterion("complain_subject_content is null");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectContentIsNotNull() {
            addCriterion("complain_subject_content is not null");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectContentEqualTo(String value) {
            addCriterion("complain_subject_content =", value, "complainSubjectContent");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectContentNotEqualTo(String value) {
            addCriterion("complain_subject_content <>", value, "complainSubjectContent");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectContentGreaterThan(String value) {
            addCriterion("complain_subject_content >", value, "complainSubjectContent");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectContentGreaterThanOrEqualTo(String value) {
            addCriterion("complain_subject_content >=", value, "complainSubjectContent");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectContentLessThan(String value) {
            addCriterion("complain_subject_content <", value, "complainSubjectContent");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectContentLessThanOrEqualTo(String value) {
            addCriterion("complain_subject_content <=", value, "complainSubjectContent");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectContentLike(String value) {
            addCriterion("complain_subject_content like", value, "complainSubjectContent");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectContentNotLike(String value) {
            addCriterion("complain_subject_content not like", value, "complainSubjectContent");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectContentIn(List<String> values) {
            addCriterion("complain_subject_content in", values, "complainSubjectContent");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectContentNotIn(List<String> values) {
            addCriterion("complain_subject_content not in", values, "complainSubjectContent");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectContentBetween(String value1, String value2) {
            addCriterion("complain_subject_content between", value1, value2, "complainSubjectContent");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectContentNotBetween(String value1, String value2) {
            addCriterion("complain_subject_content not between", value1, value2, "complainSubjectContent");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectIdIsNull() {
            addCriterion("complain_subject_id is null");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectIdIsNotNull() {
            addCriterion("complain_subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectIdEqualTo(Integer value) {
            addCriterion("complain_subject_id =", value, "complainSubjectId");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectIdNotEqualTo(Integer value) {
            addCriterion("complain_subject_id <>", value, "complainSubjectId");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectIdGreaterThan(Integer value) {
            addCriterion("complain_subject_id >", value, "complainSubjectId");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("complain_subject_id >=", value, "complainSubjectId");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectIdLessThan(Integer value) {
            addCriterion("complain_subject_id <", value, "complainSubjectId");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("complain_subject_id <=", value, "complainSubjectId");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectIdIn(List<Integer> values) {
            addCriterion("complain_subject_id in", values, "complainSubjectId");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectIdNotIn(List<Integer> values) {
            addCriterion("complain_subject_id not in", values, "complainSubjectId");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("complain_subject_id between", value1, value2, "complainSubjectId");
            return (Criteria) this;
        }

        public Criteria andComplainSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("complain_subject_id not between", value1, value2, "complainSubjectId");
            return (Criteria) this;
        }

        public Criteria andComplainContentIsNull() {
            addCriterion("complain_content is null");
            return (Criteria) this;
        }

        public Criteria andComplainContentIsNotNull() {
            addCriterion("complain_content is not null");
            return (Criteria) this;
        }

        public Criteria andComplainContentEqualTo(String value) {
            addCriterion("complain_content =", value, "complainContent");
            return (Criteria) this;
        }

        public Criteria andComplainContentNotEqualTo(String value) {
            addCriterion("complain_content <>", value, "complainContent");
            return (Criteria) this;
        }

        public Criteria andComplainContentGreaterThan(String value) {
            addCriterion("complain_content >", value, "complainContent");
            return (Criteria) this;
        }

        public Criteria andComplainContentGreaterThanOrEqualTo(String value) {
            addCriterion("complain_content >=", value, "complainContent");
            return (Criteria) this;
        }

        public Criteria andComplainContentLessThan(String value) {
            addCriterion("complain_content <", value, "complainContent");
            return (Criteria) this;
        }

        public Criteria andComplainContentLessThanOrEqualTo(String value) {
            addCriterion("complain_content <=", value, "complainContent");
            return (Criteria) this;
        }

        public Criteria andComplainContentLike(String value) {
            addCriterion("complain_content like", value, "complainContent");
            return (Criteria) this;
        }

        public Criteria andComplainContentNotLike(String value) {
            addCriterion("complain_content not like", value, "complainContent");
            return (Criteria) this;
        }

        public Criteria andComplainContentIn(List<String> values) {
            addCriterion("complain_content in", values, "complainContent");
            return (Criteria) this;
        }

        public Criteria andComplainContentNotIn(List<String> values) {
            addCriterion("complain_content not in", values, "complainContent");
            return (Criteria) this;
        }

        public Criteria andComplainContentBetween(String value1, String value2) {
            addCriterion("complain_content between", value1, value2, "complainContent");
            return (Criteria) this;
        }

        public Criteria andComplainContentNotBetween(String value1, String value2) {
            addCriterion("complain_content not between", value1, value2, "complainContent");
            return (Criteria) this;
        }

        public Criteria andComplainPic1IsNull() {
            addCriterion("complain_pic1 is null");
            return (Criteria) this;
        }

        public Criteria andComplainPic1IsNotNull() {
            addCriterion("complain_pic1 is not null");
            return (Criteria) this;
        }

        public Criteria andComplainPic1EqualTo(String value) {
            addCriterion("complain_pic1 =", value, "complainPic1");
            return (Criteria) this;
        }

        public Criteria andComplainPic1NotEqualTo(String value) {
            addCriterion("complain_pic1 <>", value, "complainPic1");
            return (Criteria) this;
        }

        public Criteria andComplainPic1GreaterThan(String value) {
            addCriterion("complain_pic1 >", value, "complainPic1");
            return (Criteria) this;
        }

        public Criteria andComplainPic1GreaterThanOrEqualTo(String value) {
            addCriterion("complain_pic1 >=", value, "complainPic1");
            return (Criteria) this;
        }

        public Criteria andComplainPic1LessThan(String value) {
            addCriterion("complain_pic1 <", value, "complainPic1");
            return (Criteria) this;
        }

        public Criteria andComplainPic1LessThanOrEqualTo(String value) {
            addCriterion("complain_pic1 <=", value, "complainPic1");
            return (Criteria) this;
        }

        public Criteria andComplainPic1Like(String value) {
            addCriterion("complain_pic1 like", value, "complainPic1");
            return (Criteria) this;
        }

        public Criteria andComplainPic1NotLike(String value) {
            addCriterion("complain_pic1 not like", value, "complainPic1");
            return (Criteria) this;
        }

        public Criteria andComplainPic1In(List<String> values) {
            addCriterion("complain_pic1 in", values, "complainPic1");
            return (Criteria) this;
        }

        public Criteria andComplainPic1NotIn(List<String> values) {
            addCriterion("complain_pic1 not in", values, "complainPic1");
            return (Criteria) this;
        }

        public Criteria andComplainPic1Between(String value1, String value2) {
            addCriterion("complain_pic1 between", value1, value2, "complainPic1");
            return (Criteria) this;
        }

        public Criteria andComplainPic1NotBetween(String value1, String value2) {
            addCriterion("complain_pic1 not between", value1, value2, "complainPic1");
            return (Criteria) this;
        }

        public Criteria andComplainPic2IsNull() {
            addCriterion("complain_pic2 is null");
            return (Criteria) this;
        }

        public Criteria andComplainPic2IsNotNull() {
            addCriterion("complain_pic2 is not null");
            return (Criteria) this;
        }

        public Criteria andComplainPic2EqualTo(String value) {
            addCriterion("complain_pic2 =", value, "complainPic2");
            return (Criteria) this;
        }

        public Criteria andComplainPic2NotEqualTo(String value) {
            addCriterion("complain_pic2 <>", value, "complainPic2");
            return (Criteria) this;
        }

        public Criteria andComplainPic2GreaterThan(String value) {
            addCriterion("complain_pic2 >", value, "complainPic2");
            return (Criteria) this;
        }

        public Criteria andComplainPic2GreaterThanOrEqualTo(String value) {
            addCriterion("complain_pic2 >=", value, "complainPic2");
            return (Criteria) this;
        }

        public Criteria andComplainPic2LessThan(String value) {
            addCriterion("complain_pic2 <", value, "complainPic2");
            return (Criteria) this;
        }

        public Criteria andComplainPic2LessThanOrEqualTo(String value) {
            addCriterion("complain_pic2 <=", value, "complainPic2");
            return (Criteria) this;
        }

        public Criteria andComplainPic2Like(String value) {
            addCriterion("complain_pic2 like", value, "complainPic2");
            return (Criteria) this;
        }

        public Criteria andComplainPic2NotLike(String value) {
            addCriterion("complain_pic2 not like", value, "complainPic2");
            return (Criteria) this;
        }

        public Criteria andComplainPic2In(List<String> values) {
            addCriterion("complain_pic2 in", values, "complainPic2");
            return (Criteria) this;
        }

        public Criteria andComplainPic2NotIn(List<String> values) {
            addCriterion("complain_pic2 not in", values, "complainPic2");
            return (Criteria) this;
        }

        public Criteria andComplainPic2Between(String value1, String value2) {
            addCriterion("complain_pic2 between", value1, value2, "complainPic2");
            return (Criteria) this;
        }

        public Criteria andComplainPic2NotBetween(String value1, String value2) {
            addCriterion("complain_pic2 not between", value1, value2, "complainPic2");
            return (Criteria) this;
        }

        public Criteria andComplainPic3IsNull() {
            addCriterion("complain_pic3 is null");
            return (Criteria) this;
        }

        public Criteria andComplainPic3IsNotNull() {
            addCriterion("complain_pic3 is not null");
            return (Criteria) this;
        }

        public Criteria andComplainPic3EqualTo(String value) {
            addCriterion("complain_pic3 =", value, "complainPic3");
            return (Criteria) this;
        }

        public Criteria andComplainPic3NotEqualTo(String value) {
            addCriterion("complain_pic3 <>", value, "complainPic3");
            return (Criteria) this;
        }

        public Criteria andComplainPic3GreaterThan(String value) {
            addCriterion("complain_pic3 >", value, "complainPic3");
            return (Criteria) this;
        }

        public Criteria andComplainPic3GreaterThanOrEqualTo(String value) {
            addCriterion("complain_pic3 >=", value, "complainPic3");
            return (Criteria) this;
        }

        public Criteria andComplainPic3LessThan(String value) {
            addCriterion("complain_pic3 <", value, "complainPic3");
            return (Criteria) this;
        }

        public Criteria andComplainPic3LessThanOrEqualTo(String value) {
            addCriterion("complain_pic3 <=", value, "complainPic3");
            return (Criteria) this;
        }

        public Criteria andComplainPic3Like(String value) {
            addCriterion("complain_pic3 like", value, "complainPic3");
            return (Criteria) this;
        }

        public Criteria andComplainPic3NotLike(String value) {
            addCriterion("complain_pic3 not like", value, "complainPic3");
            return (Criteria) this;
        }

        public Criteria andComplainPic3In(List<String> values) {
            addCriterion("complain_pic3 in", values, "complainPic3");
            return (Criteria) this;
        }

        public Criteria andComplainPic3NotIn(List<String> values) {
            addCriterion("complain_pic3 not in", values, "complainPic3");
            return (Criteria) this;
        }

        public Criteria andComplainPic3Between(String value1, String value2) {
            addCriterion("complain_pic3 between", value1, value2, "complainPic3");
            return (Criteria) this;
        }

        public Criteria andComplainPic3NotBetween(String value1, String value2) {
            addCriterion("complain_pic3 not between", value1, value2, "complainPic3");
            return (Criteria) this;
        }

        public Criteria andComplainDatetimeIsNull() {
            addCriterion("complain_datetime is null");
            return (Criteria) this;
        }

        public Criteria andComplainDatetimeIsNotNull() {
            addCriterion("complain_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andComplainDatetimeEqualTo(Integer value) {
            addCriterion("complain_datetime =", value, "complainDatetime");
            return (Criteria) this;
        }

        public Criteria andComplainDatetimeNotEqualTo(Integer value) {
            addCriterion("complain_datetime <>", value, "complainDatetime");
            return (Criteria) this;
        }

        public Criteria andComplainDatetimeGreaterThan(Integer value) {
            addCriterion("complain_datetime >", value, "complainDatetime");
            return (Criteria) this;
        }

        public Criteria andComplainDatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("complain_datetime >=", value, "complainDatetime");
            return (Criteria) this;
        }

        public Criteria andComplainDatetimeLessThan(Integer value) {
            addCriterion("complain_datetime <", value, "complainDatetime");
            return (Criteria) this;
        }

        public Criteria andComplainDatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("complain_datetime <=", value, "complainDatetime");
            return (Criteria) this;
        }

        public Criteria andComplainDatetimeIn(List<Integer> values) {
            addCriterion("complain_datetime in", values, "complainDatetime");
            return (Criteria) this;
        }

        public Criteria andComplainDatetimeNotIn(List<Integer> values) {
            addCriterion("complain_datetime not in", values, "complainDatetime");
            return (Criteria) this;
        }

        public Criteria andComplainDatetimeBetween(Integer value1, Integer value2) {
            addCriterion("complain_datetime between", value1, value2, "complainDatetime");
            return (Criteria) this;
        }

        public Criteria andComplainDatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("complain_datetime not between", value1, value2, "complainDatetime");
            return (Criteria) this;
        }

        public Criteria andComplainHandleDatetimeIsNull() {
            addCriterion("complain_handle_datetime is null");
            return (Criteria) this;
        }

        public Criteria andComplainHandleDatetimeIsNotNull() {
            addCriterion("complain_handle_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andComplainHandleDatetimeEqualTo(Integer value) {
            addCriterion("complain_handle_datetime =", value, "complainHandleDatetime");
            return (Criteria) this;
        }

        public Criteria andComplainHandleDatetimeNotEqualTo(Integer value) {
            addCriterion("complain_handle_datetime <>", value, "complainHandleDatetime");
            return (Criteria) this;
        }

        public Criteria andComplainHandleDatetimeGreaterThan(Integer value) {
            addCriterion("complain_handle_datetime >", value, "complainHandleDatetime");
            return (Criteria) this;
        }

        public Criteria andComplainHandleDatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("complain_handle_datetime >=", value, "complainHandleDatetime");
            return (Criteria) this;
        }

        public Criteria andComplainHandleDatetimeLessThan(Integer value) {
            addCriterion("complain_handle_datetime <", value, "complainHandleDatetime");
            return (Criteria) this;
        }

        public Criteria andComplainHandleDatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("complain_handle_datetime <=", value, "complainHandleDatetime");
            return (Criteria) this;
        }

        public Criteria andComplainHandleDatetimeIn(List<Integer> values) {
            addCriterion("complain_handle_datetime in", values, "complainHandleDatetime");
            return (Criteria) this;
        }

        public Criteria andComplainHandleDatetimeNotIn(List<Integer> values) {
            addCriterion("complain_handle_datetime not in", values, "complainHandleDatetime");
            return (Criteria) this;
        }

        public Criteria andComplainHandleDatetimeBetween(Integer value1, Integer value2) {
            addCriterion("complain_handle_datetime between", value1, value2, "complainHandleDatetime");
            return (Criteria) this;
        }

        public Criteria andComplainHandleDatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("complain_handle_datetime not between", value1, value2, "complainHandleDatetime");
            return (Criteria) this;
        }

        public Criteria andComplainHandleMemberIdIsNull() {
            addCriterion("complain_handle_member_id is null");
            return (Criteria) this;
        }

        public Criteria andComplainHandleMemberIdIsNotNull() {
            addCriterion("complain_handle_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andComplainHandleMemberIdEqualTo(Integer value) {
            addCriterion("complain_handle_member_id =", value, "complainHandleMemberId");
            return (Criteria) this;
        }

        public Criteria andComplainHandleMemberIdNotEqualTo(Integer value) {
            addCriterion("complain_handle_member_id <>", value, "complainHandleMemberId");
            return (Criteria) this;
        }

        public Criteria andComplainHandleMemberIdGreaterThan(Integer value) {
            addCriterion("complain_handle_member_id >", value, "complainHandleMemberId");
            return (Criteria) this;
        }

        public Criteria andComplainHandleMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("complain_handle_member_id >=", value, "complainHandleMemberId");
            return (Criteria) this;
        }

        public Criteria andComplainHandleMemberIdLessThan(Integer value) {
            addCriterion("complain_handle_member_id <", value, "complainHandleMemberId");
            return (Criteria) this;
        }

        public Criteria andComplainHandleMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("complain_handle_member_id <=", value, "complainHandleMemberId");
            return (Criteria) this;
        }

        public Criteria andComplainHandleMemberIdIn(List<Integer> values) {
            addCriterion("complain_handle_member_id in", values, "complainHandleMemberId");
            return (Criteria) this;
        }

        public Criteria andComplainHandleMemberIdNotIn(List<Integer> values) {
            addCriterion("complain_handle_member_id not in", values, "complainHandleMemberId");
            return (Criteria) this;
        }

        public Criteria andComplainHandleMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("complain_handle_member_id between", value1, value2, "complainHandleMemberId");
            return (Criteria) this;
        }

        public Criteria andComplainHandleMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("complain_handle_member_id not between", value1, value2, "complainHandleMemberId");
            return (Criteria) this;
        }

        public Criteria andAppealMessageIsNull() {
            addCriterion("appeal_message is null");
            return (Criteria) this;
        }

        public Criteria andAppealMessageIsNotNull() {
            addCriterion("appeal_message is not null");
            return (Criteria) this;
        }

        public Criteria andAppealMessageEqualTo(String value) {
            addCriterion("appeal_message =", value, "appealMessage");
            return (Criteria) this;
        }

        public Criteria andAppealMessageNotEqualTo(String value) {
            addCriterion("appeal_message <>", value, "appealMessage");
            return (Criteria) this;
        }

        public Criteria andAppealMessageGreaterThan(String value) {
            addCriterion("appeal_message >", value, "appealMessage");
            return (Criteria) this;
        }

        public Criteria andAppealMessageGreaterThanOrEqualTo(String value) {
            addCriterion("appeal_message >=", value, "appealMessage");
            return (Criteria) this;
        }

        public Criteria andAppealMessageLessThan(String value) {
            addCriterion("appeal_message <", value, "appealMessage");
            return (Criteria) this;
        }

        public Criteria andAppealMessageLessThanOrEqualTo(String value) {
            addCriterion("appeal_message <=", value, "appealMessage");
            return (Criteria) this;
        }

        public Criteria andAppealMessageLike(String value) {
            addCriterion("appeal_message like", value, "appealMessage");
            return (Criteria) this;
        }

        public Criteria andAppealMessageNotLike(String value) {
            addCriterion("appeal_message not like", value, "appealMessage");
            return (Criteria) this;
        }

        public Criteria andAppealMessageIn(List<String> values) {
            addCriterion("appeal_message in", values, "appealMessage");
            return (Criteria) this;
        }

        public Criteria andAppealMessageNotIn(List<String> values) {
            addCriterion("appeal_message not in", values, "appealMessage");
            return (Criteria) this;
        }

        public Criteria andAppealMessageBetween(String value1, String value2) {
            addCriterion("appeal_message between", value1, value2, "appealMessage");
            return (Criteria) this;
        }

        public Criteria andAppealMessageNotBetween(String value1, String value2) {
            addCriterion("appeal_message not between", value1, value2, "appealMessage");
            return (Criteria) this;
        }

        public Criteria andAppealDatetimeIsNull() {
            addCriterion("appeal_datetime is null");
            return (Criteria) this;
        }

        public Criteria andAppealDatetimeIsNotNull() {
            addCriterion("appeal_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andAppealDatetimeEqualTo(Integer value) {
            addCriterion("appeal_datetime =", value, "appealDatetime");
            return (Criteria) this;
        }

        public Criteria andAppealDatetimeNotEqualTo(Integer value) {
            addCriterion("appeal_datetime <>", value, "appealDatetime");
            return (Criteria) this;
        }

        public Criteria andAppealDatetimeGreaterThan(Integer value) {
            addCriterion("appeal_datetime >", value, "appealDatetime");
            return (Criteria) this;
        }

        public Criteria andAppealDatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("appeal_datetime >=", value, "appealDatetime");
            return (Criteria) this;
        }

        public Criteria andAppealDatetimeLessThan(Integer value) {
            addCriterion("appeal_datetime <", value, "appealDatetime");
            return (Criteria) this;
        }

        public Criteria andAppealDatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("appeal_datetime <=", value, "appealDatetime");
            return (Criteria) this;
        }

        public Criteria andAppealDatetimeIn(List<Integer> values) {
            addCriterion("appeal_datetime in", values, "appealDatetime");
            return (Criteria) this;
        }

        public Criteria andAppealDatetimeNotIn(List<Integer> values) {
            addCriterion("appeal_datetime not in", values, "appealDatetime");
            return (Criteria) this;
        }

        public Criteria andAppealDatetimeBetween(Integer value1, Integer value2) {
            addCriterion("appeal_datetime between", value1, value2, "appealDatetime");
            return (Criteria) this;
        }

        public Criteria andAppealDatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("appeal_datetime not between", value1, value2, "appealDatetime");
            return (Criteria) this;
        }

        public Criteria andAppealPic1IsNull() {
            addCriterion("appeal_pic1 is null");
            return (Criteria) this;
        }

        public Criteria andAppealPic1IsNotNull() {
            addCriterion("appeal_pic1 is not null");
            return (Criteria) this;
        }

        public Criteria andAppealPic1EqualTo(String value) {
            addCriterion("appeal_pic1 =", value, "appealPic1");
            return (Criteria) this;
        }

        public Criteria andAppealPic1NotEqualTo(String value) {
            addCriterion("appeal_pic1 <>", value, "appealPic1");
            return (Criteria) this;
        }

        public Criteria andAppealPic1GreaterThan(String value) {
            addCriterion("appeal_pic1 >", value, "appealPic1");
            return (Criteria) this;
        }

        public Criteria andAppealPic1GreaterThanOrEqualTo(String value) {
            addCriterion("appeal_pic1 >=", value, "appealPic1");
            return (Criteria) this;
        }

        public Criteria andAppealPic1LessThan(String value) {
            addCriterion("appeal_pic1 <", value, "appealPic1");
            return (Criteria) this;
        }

        public Criteria andAppealPic1LessThanOrEqualTo(String value) {
            addCriterion("appeal_pic1 <=", value, "appealPic1");
            return (Criteria) this;
        }

        public Criteria andAppealPic1Like(String value) {
            addCriterion("appeal_pic1 like", value, "appealPic1");
            return (Criteria) this;
        }

        public Criteria andAppealPic1NotLike(String value) {
            addCriterion("appeal_pic1 not like", value, "appealPic1");
            return (Criteria) this;
        }

        public Criteria andAppealPic1In(List<String> values) {
            addCriterion("appeal_pic1 in", values, "appealPic1");
            return (Criteria) this;
        }

        public Criteria andAppealPic1NotIn(List<String> values) {
            addCriterion("appeal_pic1 not in", values, "appealPic1");
            return (Criteria) this;
        }

        public Criteria andAppealPic1Between(String value1, String value2) {
            addCriterion("appeal_pic1 between", value1, value2, "appealPic1");
            return (Criteria) this;
        }

        public Criteria andAppealPic1NotBetween(String value1, String value2) {
            addCriterion("appeal_pic1 not between", value1, value2, "appealPic1");
            return (Criteria) this;
        }

        public Criteria andAppealPic2IsNull() {
            addCriterion("appeal_pic2 is null");
            return (Criteria) this;
        }

        public Criteria andAppealPic2IsNotNull() {
            addCriterion("appeal_pic2 is not null");
            return (Criteria) this;
        }

        public Criteria andAppealPic2EqualTo(String value) {
            addCriterion("appeal_pic2 =", value, "appealPic2");
            return (Criteria) this;
        }

        public Criteria andAppealPic2NotEqualTo(String value) {
            addCriterion("appeal_pic2 <>", value, "appealPic2");
            return (Criteria) this;
        }

        public Criteria andAppealPic2GreaterThan(String value) {
            addCriterion("appeal_pic2 >", value, "appealPic2");
            return (Criteria) this;
        }

        public Criteria andAppealPic2GreaterThanOrEqualTo(String value) {
            addCriterion("appeal_pic2 >=", value, "appealPic2");
            return (Criteria) this;
        }

        public Criteria andAppealPic2LessThan(String value) {
            addCriterion("appeal_pic2 <", value, "appealPic2");
            return (Criteria) this;
        }

        public Criteria andAppealPic2LessThanOrEqualTo(String value) {
            addCriterion("appeal_pic2 <=", value, "appealPic2");
            return (Criteria) this;
        }

        public Criteria andAppealPic2Like(String value) {
            addCriterion("appeal_pic2 like", value, "appealPic2");
            return (Criteria) this;
        }

        public Criteria andAppealPic2NotLike(String value) {
            addCriterion("appeal_pic2 not like", value, "appealPic2");
            return (Criteria) this;
        }

        public Criteria andAppealPic2In(List<String> values) {
            addCriterion("appeal_pic2 in", values, "appealPic2");
            return (Criteria) this;
        }

        public Criteria andAppealPic2NotIn(List<String> values) {
            addCriterion("appeal_pic2 not in", values, "appealPic2");
            return (Criteria) this;
        }

        public Criteria andAppealPic2Between(String value1, String value2) {
            addCriterion("appeal_pic2 between", value1, value2, "appealPic2");
            return (Criteria) this;
        }

        public Criteria andAppealPic2NotBetween(String value1, String value2) {
            addCriterion("appeal_pic2 not between", value1, value2, "appealPic2");
            return (Criteria) this;
        }

        public Criteria andAppealPic3IsNull() {
            addCriterion("appeal_pic3 is null");
            return (Criteria) this;
        }

        public Criteria andAppealPic3IsNotNull() {
            addCriterion("appeal_pic3 is not null");
            return (Criteria) this;
        }

        public Criteria andAppealPic3EqualTo(String value) {
            addCriterion("appeal_pic3 =", value, "appealPic3");
            return (Criteria) this;
        }

        public Criteria andAppealPic3NotEqualTo(String value) {
            addCriterion("appeal_pic3 <>", value, "appealPic3");
            return (Criteria) this;
        }

        public Criteria andAppealPic3GreaterThan(String value) {
            addCriterion("appeal_pic3 >", value, "appealPic3");
            return (Criteria) this;
        }

        public Criteria andAppealPic3GreaterThanOrEqualTo(String value) {
            addCriterion("appeal_pic3 >=", value, "appealPic3");
            return (Criteria) this;
        }

        public Criteria andAppealPic3LessThan(String value) {
            addCriterion("appeal_pic3 <", value, "appealPic3");
            return (Criteria) this;
        }

        public Criteria andAppealPic3LessThanOrEqualTo(String value) {
            addCriterion("appeal_pic3 <=", value, "appealPic3");
            return (Criteria) this;
        }

        public Criteria andAppealPic3Like(String value) {
            addCriterion("appeal_pic3 like", value, "appealPic3");
            return (Criteria) this;
        }

        public Criteria andAppealPic3NotLike(String value) {
            addCriterion("appeal_pic3 not like", value, "appealPic3");
            return (Criteria) this;
        }

        public Criteria andAppealPic3In(List<String> values) {
            addCriterion("appeal_pic3 in", values, "appealPic3");
            return (Criteria) this;
        }

        public Criteria andAppealPic3NotIn(List<String> values) {
            addCriterion("appeal_pic3 not in", values, "appealPic3");
            return (Criteria) this;
        }

        public Criteria andAppealPic3Between(String value1, String value2) {
            addCriterion("appeal_pic3 between", value1, value2, "appealPic3");
            return (Criteria) this;
        }

        public Criteria andAppealPic3NotBetween(String value1, String value2) {
            addCriterion("appeal_pic3 not between", value1, value2, "appealPic3");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMessageIsNull() {
            addCriterion("final_handle_message is null");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMessageIsNotNull() {
            addCriterion("final_handle_message is not null");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMessageEqualTo(String value) {
            addCriterion("final_handle_message =", value, "finalHandleMessage");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMessageNotEqualTo(String value) {
            addCriterion("final_handle_message <>", value, "finalHandleMessage");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMessageGreaterThan(String value) {
            addCriterion("final_handle_message >", value, "finalHandleMessage");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMessageGreaterThanOrEqualTo(String value) {
            addCriterion("final_handle_message >=", value, "finalHandleMessage");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMessageLessThan(String value) {
            addCriterion("final_handle_message <", value, "finalHandleMessage");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMessageLessThanOrEqualTo(String value) {
            addCriterion("final_handle_message <=", value, "finalHandleMessage");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMessageLike(String value) {
            addCriterion("final_handle_message like", value, "finalHandleMessage");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMessageNotLike(String value) {
            addCriterion("final_handle_message not like", value, "finalHandleMessage");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMessageIn(List<String> values) {
            addCriterion("final_handle_message in", values, "finalHandleMessage");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMessageNotIn(List<String> values) {
            addCriterion("final_handle_message not in", values, "finalHandleMessage");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMessageBetween(String value1, String value2) {
            addCriterion("final_handle_message between", value1, value2, "finalHandleMessage");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMessageNotBetween(String value1, String value2) {
            addCriterion("final_handle_message not between", value1, value2, "finalHandleMessage");
            return (Criteria) this;
        }

        public Criteria andFinalHandleDatetimeIsNull() {
            addCriterion("final_handle_datetime is null");
            return (Criteria) this;
        }

        public Criteria andFinalHandleDatetimeIsNotNull() {
            addCriterion("final_handle_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andFinalHandleDatetimeEqualTo(Integer value) {
            addCriterion("final_handle_datetime =", value, "finalHandleDatetime");
            return (Criteria) this;
        }

        public Criteria andFinalHandleDatetimeNotEqualTo(Integer value) {
            addCriterion("final_handle_datetime <>", value, "finalHandleDatetime");
            return (Criteria) this;
        }

        public Criteria andFinalHandleDatetimeGreaterThan(Integer value) {
            addCriterion("final_handle_datetime >", value, "finalHandleDatetime");
            return (Criteria) this;
        }

        public Criteria andFinalHandleDatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("final_handle_datetime >=", value, "finalHandleDatetime");
            return (Criteria) this;
        }

        public Criteria andFinalHandleDatetimeLessThan(Integer value) {
            addCriterion("final_handle_datetime <", value, "finalHandleDatetime");
            return (Criteria) this;
        }

        public Criteria andFinalHandleDatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("final_handle_datetime <=", value, "finalHandleDatetime");
            return (Criteria) this;
        }

        public Criteria andFinalHandleDatetimeIn(List<Integer> values) {
            addCriterion("final_handle_datetime in", values, "finalHandleDatetime");
            return (Criteria) this;
        }

        public Criteria andFinalHandleDatetimeNotIn(List<Integer> values) {
            addCriterion("final_handle_datetime not in", values, "finalHandleDatetime");
            return (Criteria) this;
        }

        public Criteria andFinalHandleDatetimeBetween(Integer value1, Integer value2) {
            addCriterion("final_handle_datetime between", value1, value2, "finalHandleDatetime");
            return (Criteria) this;
        }

        public Criteria andFinalHandleDatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("final_handle_datetime not between", value1, value2, "finalHandleDatetime");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMemberIdIsNull() {
            addCriterion("final_handle_member_id is null");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMemberIdIsNotNull() {
            addCriterion("final_handle_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMemberIdEqualTo(Integer value) {
            addCriterion("final_handle_member_id =", value, "finalHandleMemberId");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMemberIdNotEqualTo(Integer value) {
            addCriterion("final_handle_member_id <>", value, "finalHandleMemberId");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMemberIdGreaterThan(Integer value) {
            addCriterion("final_handle_member_id >", value, "finalHandleMemberId");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("final_handle_member_id >=", value, "finalHandleMemberId");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMemberIdLessThan(Integer value) {
            addCriterion("final_handle_member_id <", value, "finalHandleMemberId");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("final_handle_member_id <=", value, "finalHandleMemberId");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMemberIdIn(List<Integer> values) {
            addCriterion("final_handle_member_id in", values, "finalHandleMemberId");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMemberIdNotIn(List<Integer> values) {
            addCriterion("final_handle_member_id not in", values, "finalHandleMemberId");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("final_handle_member_id between", value1, value2, "finalHandleMemberId");
            return (Criteria) this;
        }

        public Criteria andFinalHandleMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("final_handle_member_id not between", value1, value2, "finalHandleMemberId");
            return (Criteria) this;
        }

        public Criteria andComplainStateIsNull() {
            addCriterion("complain_state is null");
            return (Criteria) this;
        }

        public Criteria andComplainStateIsNotNull() {
            addCriterion("complain_state is not null");
            return (Criteria) this;
        }

        public Criteria andComplainStateEqualTo(Byte value) {
            addCriterion("complain_state =", value, "complainState");
            return (Criteria) this;
        }

        public Criteria andComplainStateNotEqualTo(Byte value) {
            addCriterion("complain_state <>", value, "complainState");
            return (Criteria) this;
        }

        public Criteria andComplainStateGreaterThan(Byte value) {
            addCriterion("complain_state >", value, "complainState");
            return (Criteria) this;
        }

        public Criteria andComplainStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("complain_state >=", value, "complainState");
            return (Criteria) this;
        }

        public Criteria andComplainStateLessThan(Byte value) {
            addCriterion("complain_state <", value, "complainState");
            return (Criteria) this;
        }

        public Criteria andComplainStateLessThanOrEqualTo(Byte value) {
            addCriterion("complain_state <=", value, "complainState");
            return (Criteria) this;
        }

        public Criteria andComplainStateIn(List<Byte> values) {
            addCriterion("complain_state in", values, "complainState");
            return (Criteria) this;
        }

        public Criteria andComplainStateNotIn(List<Byte> values) {
            addCriterion("complain_state not in", values, "complainState");
            return (Criteria) this;
        }

        public Criteria andComplainStateBetween(Byte value1, Byte value2) {
            addCriterion("complain_state between", value1, value2, "complainState");
            return (Criteria) this;
        }

        public Criteria andComplainStateNotBetween(Byte value1, Byte value2) {
            addCriterion("complain_state not between", value1, value2, "complainState");
            return (Criteria) this;
        }

        public Criteria andComplainResultIsNull() {
            addCriterion("complain_result is null");
            return (Criteria) this;
        }

        public Criteria andComplainResultIsNotNull() {
            addCriterion("complain_result is not null");
            return (Criteria) this;
        }

        public Criteria andComplainResultEqualTo(Byte value) {
            addCriterion("complain_result =", value, "complainResult");
            return (Criteria) this;
        }

        public Criteria andComplainResultNotEqualTo(Byte value) {
            addCriterion("complain_result <>", value, "complainResult");
            return (Criteria) this;
        }

        public Criteria andComplainResultGreaterThan(Byte value) {
            addCriterion("complain_result >", value, "complainResult");
            return (Criteria) this;
        }

        public Criteria andComplainResultGreaterThanOrEqualTo(Byte value) {
            addCriterion("complain_result >=", value, "complainResult");
            return (Criteria) this;
        }

        public Criteria andComplainResultLessThan(Byte value) {
            addCriterion("complain_result <", value, "complainResult");
            return (Criteria) this;
        }

        public Criteria andComplainResultLessThanOrEqualTo(Byte value) {
            addCriterion("complain_result <=", value, "complainResult");
            return (Criteria) this;
        }

        public Criteria andComplainResultIn(List<Byte> values) {
            addCriterion("complain_result in", values, "complainResult");
            return (Criteria) this;
        }

        public Criteria andComplainResultNotIn(List<Byte> values) {
            addCriterion("complain_result not in", values, "complainResult");
            return (Criteria) this;
        }

        public Criteria andComplainResultBetween(Byte value1, Byte value2) {
            addCriterion("complain_result between", value1, value2, "complainResult");
            return (Criteria) this;
        }

        public Criteria andComplainResultNotBetween(Byte value1, Byte value2) {
            addCriterion("complain_result not between", value1, value2, "complainResult");
            return (Criteria) this;
        }

        public Criteria andComplainActiveIsNull() {
            addCriterion("complain_active is null");
            return (Criteria) this;
        }

        public Criteria andComplainActiveIsNotNull() {
            addCriterion("complain_active is not null");
            return (Criteria) this;
        }

        public Criteria andComplainActiveEqualTo(Byte value) {
            addCriterion("complain_active =", value, "complainActive");
            return (Criteria) this;
        }

        public Criteria andComplainActiveNotEqualTo(Byte value) {
            addCriterion("complain_active <>", value, "complainActive");
            return (Criteria) this;
        }

        public Criteria andComplainActiveGreaterThan(Byte value) {
            addCriterion("complain_active >", value, "complainActive");
            return (Criteria) this;
        }

        public Criteria andComplainActiveGreaterThanOrEqualTo(Byte value) {
            addCriterion("complain_active >=", value, "complainActive");
            return (Criteria) this;
        }

        public Criteria andComplainActiveLessThan(Byte value) {
            addCriterion("complain_active <", value, "complainActive");
            return (Criteria) this;
        }

        public Criteria andComplainActiveLessThanOrEqualTo(Byte value) {
            addCriterion("complain_active <=", value, "complainActive");
            return (Criteria) this;
        }

        public Criteria andComplainActiveIn(List<Byte> values) {
            addCriterion("complain_active in", values, "complainActive");
            return (Criteria) this;
        }

        public Criteria andComplainActiveNotIn(List<Byte> values) {
            addCriterion("complain_active not in", values, "complainActive");
            return (Criteria) this;
        }

        public Criteria andComplainActiveBetween(Byte value1, Byte value2) {
            addCriterion("complain_active between", value1, value2, "complainActive");
            return (Criteria) this;
        }

        public Criteria andComplainActiveNotBetween(Byte value1, Byte value2) {
            addCriterion("complain_active not between", value1, value2, "complainActive");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(Long value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(Long value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(Long value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(Long value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(Long value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(Long value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<Long> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<Long> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(Long value1, Long value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(Long value1, Long value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_complain表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-10-30
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_complain 2017-10-30
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