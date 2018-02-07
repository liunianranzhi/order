package com.shanyuan.platform.ms.dao.store.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyStoreExample {
    /**
     * sy_store
     */
    protected String orderByClause;

    /**
     * sy_store
     */
    protected boolean distinct;

    /**
     * sy_store
     */
    protected List<Criteria> oredCriteria;

    public SyStoreExample() {
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
     * sy_store 2017-10-16
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

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreAuthIsNull() {
            addCriterion("store_auth is null");
            return (Criteria) this;
        }

        public Criteria andStoreAuthIsNotNull() {
            addCriterion("store_auth is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAuthEqualTo(Byte value) {
            addCriterion("store_auth =", value, "storeAuth");
            return (Criteria) this;
        }

        public Criteria andStoreAuthNotEqualTo(Byte value) {
            addCriterion("store_auth <>", value, "storeAuth");
            return (Criteria) this;
        }

        public Criteria andStoreAuthGreaterThan(Byte value) {
            addCriterion("store_auth >", value, "storeAuth");
            return (Criteria) this;
        }

        public Criteria andStoreAuthGreaterThanOrEqualTo(Byte value) {
            addCriterion("store_auth >=", value, "storeAuth");
            return (Criteria) this;
        }

        public Criteria andStoreAuthLessThan(Byte value) {
            addCriterion("store_auth <", value, "storeAuth");
            return (Criteria) this;
        }

        public Criteria andStoreAuthLessThanOrEqualTo(Byte value) {
            addCriterion("store_auth <=", value, "storeAuth");
            return (Criteria) this;
        }

        public Criteria andStoreAuthIn(List<Byte> values) {
            addCriterion("store_auth in", values, "storeAuth");
            return (Criteria) this;
        }

        public Criteria andStoreAuthNotIn(List<Byte> values) {
            addCriterion("store_auth not in", values, "storeAuth");
            return (Criteria) this;
        }

        public Criteria andStoreAuthBetween(Byte value1, Byte value2) {
            addCriterion("store_auth between", value1, value2, "storeAuth");
            return (Criteria) this;
        }

        public Criteria andStoreAuthNotBetween(Byte value1, Byte value2) {
            addCriterion("store_auth not between", value1, value2, "storeAuth");
            return (Criteria) this;
        }

        public Criteria andNameAuthIsNull() {
            addCriterion("name_auth is null");
            return (Criteria) this;
        }

        public Criteria andNameAuthIsNotNull() {
            addCriterion("name_auth is not null");
            return (Criteria) this;
        }

        public Criteria andNameAuthEqualTo(Byte value) {
            addCriterion("name_auth =", value, "nameAuth");
            return (Criteria) this;
        }

        public Criteria andNameAuthNotEqualTo(Byte value) {
            addCriterion("name_auth <>", value, "nameAuth");
            return (Criteria) this;
        }

        public Criteria andNameAuthGreaterThan(Byte value) {
            addCriterion("name_auth >", value, "nameAuth");
            return (Criteria) this;
        }

        public Criteria andNameAuthGreaterThanOrEqualTo(Byte value) {
            addCriterion("name_auth >=", value, "nameAuth");
            return (Criteria) this;
        }

        public Criteria andNameAuthLessThan(Byte value) {
            addCriterion("name_auth <", value, "nameAuth");
            return (Criteria) this;
        }

        public Criteria andNameAuthLessThanOrEqualTo(Byte value) {
            addCriterion("name_auth <=", value, "nameAuth");
            return (Criteria) this;
        }

        public Criteria andNameAuthIn(List<Byte> values) {
            addCriterion("name_auth in", values, "nameAuth");
            return (Criteria) this;
        }

        public Criteria andNameAuthNotIn(List<Byte> values) {
            addCriterion("name_auth not in", values, "nameAuth");
            return (Criteria) this;
        }

        public Criteria andNameAuthBetween(Byte value1, Byte value2) {
            addCriterion("name_auth between", value1, value2, "nameAuth");
            return (Criteria) this;
        }

        public Criteria andNameAuthNotBetween(Byte value1, Byte value2) {
            addCriterion("name_auth not between", value1, value2, "nameAuth");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNull() {
            addCriterion("grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(Integer value) {
            addCriterion("grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Integer value) {
            addCriterion("grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Integer value) {
            addCriterion("grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Integer value) {
            addCriterion("grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Integer> values) {
            addCriterion("grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Integer> values) {
            addCriterion("grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_id not between", value1, value2, "gradeId");
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

        public Criteria andSellerNameIsNull() {
            addCriterion("seller_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("seller_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("seller_name =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("seller_name <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("seller_name >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_name >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("seller_name <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("seller_name <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("seller_name like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("seller_name not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("seller_name in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("seller_name not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("seller_name between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("seller_name not between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCardIsNull() {
            addCriterion("store_owner_card is null");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCardIsNotNull() {
            addCriterion("store_owner_card is not null");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCardEqualTo(String value) {
            addCriterion("store_owner_card =", value, "storeOwnerCard");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCardNotEqualTo(String value) {
            addCriterion("store_owner_card <>", value, "storeOwnerCard");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCardGreaterThan(String value) {
            addCriterion("store_owner_card >", value, "storeOwnerCard");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCardGreaterThanOrEqualTo(String value) {
            addCriterion("store_owner_card >=", value, "storeOwnerCard");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCardLessThan(String value) {
            addCriterion("store_owner_card <", value, "storeOwnerCard");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCardLessThanOrEqualTo(String value) {
            addCriterion("store_owner_card <=", value, "storeOwnerCard");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCardLike(String value) {
            addCriterion("store_owner_card like", value, "storeOwnerCard");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCardNotLike(String value) {
            addCriterion("store_owner_card not like", value, "storeOwnerCard");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCardIn(List<String> values) {
            addCriterion("store_owner_card in", values, "storeOwnerCard");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCardNotIn(List<String> values) {
            addCriterion("store_owner_card not in", values, "storeOwnerCard");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCardBetween(String value1, String value2) {
            addCriterion("store_owner_card between", value1, value2, "storeOwnerCard");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCardNotBetween(String value1, String value2) {
            addCriterion("store_owner_card not between", value1, value2, "storeOwnerCard");
            return (Criteria) this;
        }

        public Criteria andScIdIsNull() {
            addCriterion("sc_id is null");
            return (Criteria) this;
        }

        public Criteria andScIdIsNotNull() {
            addCriterion("sc_id is not null");
            return (Criteria) this;
        }

        public Criteria andScIdEqualTo(Integer value) {
            addCriterion("sc_id =", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotEqualTo(Integer value) {
            addCriterion("sc_id <>", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThan(Integer value) {
            addCriterion("sc_id >", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_id >=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThan(Integer value) {
            addCriterion("sc_id <", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThanOrEqualTo(Integer value) {
            addCriterion("sc_id <=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdIn(List<Integer> values) {
            addCriterion("sc_id in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotIn(List<Integer> values) {
            addCriterion("sc_id not in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdBetween(Integer value1, Integer value2) {
            addCriterion("sc_id between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_id not between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameIsNull() {
            addCriterion("store_company_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameIsNotNull() {
            addCriterion("store_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameEqualTo(String value) {
            addCriterion("store_company_name =", value, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameNotEqualTo(String value) {
            addCriterion("store_company_name <>", value, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameGreaterThan(String value) {
            addCriterion("store_company_name >", value, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_company_name >=", value, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameLessThan(String value) {
            addCriterion("store_company_name <", value, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("store_company_name <=", value, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameLike(String value) {
            addCriterion("store_company_name like", value, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameNotLike(String value) {
            addCriterion("store_company_name not like", value, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameIn(List<String> values) {
            addCriterion("store_company_name in", values, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameNotIn(List<String> values) {
            addCriterion("store_company_name not in", values, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameBetween(String value1, String value2) {
            addCriterion("store_company_name between", value1, value2, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameNotBetween(String value1, String value2) {
            addCriterion("store_company_name not between", value1, value2, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaInfoIsNull() {
            addCriterion("area_info is null");
            return (Criteria) this;
        }

        public Criteria andAreaInfoIsNotNull() {
            addCriterion("area_info is not null");
            return (Criteria) this;
        }

        public Criteria andAreaInfoEqualTo(String value) {
            addCriterion("area_info =", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoNotEqualTo(String value) {
            addCriterion("area_info <>", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoGreaterThan(String value) {
            addCriterion("area_info >", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoGreaterThanOrEqualTo(String value) {
            addCriterion("area_info >=", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoLessThan(String value) {
            addCriterion("area_info <", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoLessThanOrEqualTo(String value) {
            addCriterion("area_info <=", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoLike(String value) {
            addCriterion("area_info like", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoNotLike(String value) {
            addCriterion("area_info not like", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoIn(List<String> values) {
            addCriterion("area_info in", values, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoNotIn(List<String> values) {
            addCriterion("area_info not in", values, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoBetween(String value1, String value2) {
            addCriterion("area_info between", value1, value2, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoNotBetween(String value1, String value2) {
            addCriterion("area_info not between", value1, value2, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIsNull() {
            addCriterion("store_address is null");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIsNotNull() {
            addCriterion("store_address is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAddressEqualTo(String value) {
            addCriterion("store_address =", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotEqualTo(String value) {
            addCriterion("store_address <>", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressGreaterThan(String value) {
            addCriterion("store_address >", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressGreaterThanOrEqualTo(String value) {
            addCriterion("store_address >=", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLessThan(String value) {
            addCriterion("store_address <", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLessThanOrEqualTo(String value) {
            addCriterion("store_address <=", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLike(String value) {
            addCriterion("store_address like", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotLike(String value) {
            addCriterion("store_address not like", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIn(List<String> values) {
            addCriterion("store_address in", values, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotIn(List<String> values) {
            addCriterion("store_address not in", values, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressBetween(String value1, String value2) {
            addCriterion("store_address between", value1, value2, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotBetween(String value1, String value2) {
            addCriterion("store_address not between", value1, value2, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreZipIsNull() {
            addCriterion("store_zip is null");
            return (Criteria) this;
        }

        public Criteria andStoreZipIsNotNull() {
            addCriterion("store_zip is not null");
            return (Criteria) this;
        }

        public Criteria andStoreZipEqualTo(String value) {
            addCriterion("store_zip =", value, "storeZip");
            return (Criteria) this;
        }

        public Criteria andStoreZipNotEqualTo(String value) {
            addCriterion("store_zip <>", value, "storeZip");
            return (Criteria) this;
        }

        public Criteria andStoreZipGreaterThan(String value) {
            addCriterion("store_zip >", value, "storeZip");
            return (Criteria) this;
        }

        public Criteria andStoreZipGreaterThanOrEqualTo(String value) {
            addCriterion("store_zip >=", value, "storeZip");
            return (Criteria) this;
        }

        public Criteria andStoreZipLessThan(String value) {
            addCriterion("store_zip <", value, "storeZip");
            return (Criteria) this;
        }

        public Criteria andStoreZipLessThanOrEqualTo(String value) {
            addCriterion("store_zip <=", value, "storeZip");
            return (Criteria) this;
        }

        public Criteria andStoreZipLike(String value) {
            addCriterion("store_zip like", value, "storeZip");
            return (Criteria) this;
        }

        public Criteria andStoreZipNotLike(String value) {
            addCriterion("store_zip not like", value, "storeZip");
            return (Criteria) this;
        }

        public Criteria andStoreZipIn(List<String> values) {
            addCriterion("store_zip in", values, "storeZip");
            return (Criteria) this;
        }

        public Criteria andStoreZipNotIn(List<String> values) {
            addCriterion("store_zip not in", values, "storeZip");
            return (Criteria) this;
        }

        public Criteria andStoreZipBetween(String value1, String value2) {
            addCriterion("store_zip between", value1, value2, "storeZip");
            return (Criteria) this;
        }

        public Criteria andStoreZipNotBetween(String value1, String value2) {
            addCriterion("store_zip not between", value1, value2, "storeZip");
            return (Criteria) this;
        }

        public Criteria andStoreTelIsNull() {
            addCriterion("store_tel is null");
            return (Criteria) this;
        }

        public Criteria andStoreTelIsNotNull() {
            addCriterion("store_tel is not null");
            return (Criteria) this;
        }

        public Criteria andStoreTelEqualTo(String value) {
            addCriterion("store_tel =", value, "storeTel");
            return (Criteria) this;
        }

        public Criteria andStoreTelNotEqualTo(String value) {
            addCriterion("store_tel <>", value, "storeTel");
            return (Criteria) this;
        }

        public Criteria andStoreTelGreaterThan(String value) {
            addCriterion("store_tel >", value, "storeTel");
            return (Criteria) this;
        }

        public Criteria andStoreTelGreaterThanOrEqualTo(String value) {
            addCriterion("store_tel >=", value, "storeTel");
            return (Criteria) this;
        }

        public Criteria andStoreTelLessThan(String value) {
            addCriterion("store_tel <", value, "storeTel");
            return (Criteria) this;
        }

        public Criteria andStoreTelLessThanOrEqualTo(String value) {
            addCriterion("store_tel <=", value, "storeTel");
            return (Criteria) this;
        }

        public Criteria andStoreTelLike(String value) {
            addCriterion("store_tel like", value, "storeTel");
            return (Criteria) this;
        }

        public Criteria andStoreTelNotLike(String value) {
            addCriterion("store_tel not like", value, "storeTel");
            return (Criteria) this;
        }

        public Criteria andStoreTelIn(List<String> values) {
            addCriterion("store_tel in", values, "storeTel");
            return (Criteria) this;
        }

        public Criteria andStoreTelNotIn(List<String> values) {
            addCriterion("store_tel not in", values, "storeTel");
            return (Criteria) this;
        }

        public Criteria andStoreTelBetween(String value1, String value2) {
            addCriterion("store_tel between", value1, value2, "storeTel");
            return (Criteria) this;
        }

        public Criteria andStoreTelNotBetween(String value1, String value2) {
            addCriterion("store_tel not between", value1, value2, "storeTel");
            return (Criteria) this;
        }

        public Criteria andStoreImageIsNull() {
            addCriterion("store_image is null");
            return (Criteria) this;
        }

        public Criteria andStoreImageIsNotNull() {
            addCriterion("store_image is not null");
            return (Criteria) this;
        }

        public Criteria andStoreImageEqualTo(String value) {
            addCriterion("store_image =", value, "storeImage");
            return (Criteria) this;
        }

        public Criteria andStoreImageNotEqualTo(String value) {
            addCriterion("store_image <>", value, "storeImage");
            return (Criteria) this;
        }

        public Criteria andStoreImageGreaterThan(String value) {
            addCriterion("store_image >", value, "storeImage");
            return (Criteria) this;
        }

        public Criteria andStoreImageGreaterThanOrEqualTo(String value) {
            addCriterion("store_image >=", value, "storeImage");
            return (Criteria) this;
        }

        public Criteria andStoreImageLessThan(String value) {
            addCriterion("store_image <", value, "storeImage");
            return (Criteria) this;
        }

        public Criteria andStoreImageLessThanOrEqualTo(String value) {
            addCriterion("store_image <=", value, "storeImage");
            return (Criteria) this;
        }

        public Criteria andStoreImageLike(String value) {
            addCriterion("store_image like", value, "storeImage");
            return (Criteria) this;
        }

        public Criteria andStoreImageNotLike(String value) {
            addCriterion("store_image not like", value, "storeImage");
            return (Criteria) this;
        }

        public Criteria andStoreImageIn(List<String> values) {
            addCriterion("store_image in", values, "storeImage");
            return (Criteria) this;
        }

        public Criteria andStoreImageNotIn(List<String> values) {
            addCriterion("store_image not in", values, "storeImage");
            return (Criteria) this;
        }

        public Criteria andStoreImageBetween(String value1, String value2) {
            addCriterion("store_image between", value1, value2, "storeImage");
            return (Criteria) this;
        }

        public Criteria andStoreImageNotBetween(String value1, String value2) {
            addCriterion("store_image not between", value1, value2, "storeImage");
            return (Criteria) this;
        }

        public Criteria andStoreImage1IsNull() {
            addCriterion("store_image1 is null");
            return (Criteria) this;
        }

        public Criteria andStoreImage1IsNotNull() {
            addCriterion("store_image1 is not null");
            return (Criteria) this;
        }

        public Criteria andStoreImage1EqualTo(String value) {
            addCriterion("store_image1 =", value, "storeImage1");
            return (Criteria) this;
        }

        public Criteria andStoreImage1NotEqualTo(String value) {
            addCriterion("store_image1 <>", value, "storeImage1");
            return (Criteria) this;
        }

        public Criteria andStoreImage1GreaterThan(String value) {
            addCriterion("store_image1 >", value, "storeImage1");
            return (Criteria) this;
        }

        public Criteria andStoreImage1GreaterThanOrEqualTo(String value) {
            addCriterion("store_image1 >=", value, "storeImage1");
            return (Criteria) this;
        }

        public Criteria andStoreImage1LessThan(String value) {
            addCriterion("store_image1 <", value, "storeImage1");
            return (Criteria) this;
        }

        public Criteria andStoreImage1LessThanOrEqualTo(String value) {
            addCriterion("store_image1 <=", value, "storeImage1");
            return (Criteria) this;
        }

        public Criteria andStoreImage1Like(String value) {
            addCriterion("store_image1 like", value, "storeImage1");
            return (Criteria) this;
        }

        public Criteria andStoreImage1NotLike(String value) {
            addCriterion("store_image1 not like", value, "storeImage1");
            return (Criteria) this;
        }

        public Criteria andStoreImage1In(List<String> values) {
            addCriterion("store_image1 in", values, "storeImage1");
            return (Criteria) this;
        }

        public Criteria andStoreImage1NotIn(List<String> values) {
            addCriterion("store_image1 not in", values, "storeImage1");
            return (Criteria) this;
        }

        public Criteria andStoreImage1Between(String value1, String value2) {
            addCriterion("store_image1 between", value1, value2, "storeImage1");
            return (Criteria) this;
        }

        public Criteria andStoreImage1NotBetween(String value1, String value2) {
            addCriterion("store_image1 not between", value1, value2, "storeImage1");
            return (Criteria) this;
        }

        public Criteria andStoreStateIsNull() {
            addCriterion("store_state is null");
            return (Criteria) this;
        }

        public Criteria andStoreStateIsNotNull() {
            addCriterion("store_state is not null");
            return (Criteria) this;
        }

        public Criteria andStoreStateEqualTo(Byte value) {
            addCriterion("store_state =", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotEqualTo(Byte value) {
            addCriterion("store_state <>", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateGreaterThan(Byte value) {
            addCriterion("store_state >", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("store_state >=", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateLessThan(Byte value) {
            addCriterion("store_state <", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateLessThanOrEqualTo(Byte value) {
            addCriterion("store_state <=", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateIn(List<Byte> values) {
            addCriterion("store_state in", values, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotIn(List<Byte> values) {
            addCriterion("store_state not in", values, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateBetween(Byte value1, Byte value2) {
            addCriterion("store_state between", value1, value2, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotBetween(Byte value1, Byte value2) {
            addCriterion("store_state not between", value1, value2, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoIsNull() {
            addCriterion("store_close_info is null");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoIsNotNull() {
            addCriterion("store_close_info is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoEqualTo(String value) {
            addCriterion("store_close_info =", value, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoNotEqualTo(String value) {
            addCriterion("store_close_info <>", value, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoGreaterThan(String value) {
            addCriterion("store_close_info >", value, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoGreaterThanOrEqualTo(String value) {
            addCriterion("store_close_info >=", value, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoLessThan(String value) {
            addCriterion("store_close_info <", value, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoLessThanOrEqualTo(String value) {
            addCriterion("store_close_info <=", value, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoLike(String value) {
            addCriterion("store_close_info like", value, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoNotLike(String value) {
            addCriterion("store_close_info not like", value, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoIn(List<String> values) {
            addCriterion("store_close_info in", values, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoNotIn(List<String> values) {
            addCriterion("store_close_info not in", values, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoBetween(String value1, String value2) {
            addCriterion("store_close_info between", value1, value2, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoNotBetween(String value1, String value2) {
            addCriterion("store_close_info not between", value1, value2, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreSortIsNull() {
            addCriterion("store_sort is null");
            return (Criteria) this;
        }

        public Criteria andStoreSortIsNotNull() {
            addCriterion("store_sort is not null");
            return (Criteria) this;
        }

        public Criteria andStoreSortEqualTo(Integer value) {
            addCriterion("store_sort =", value, "storeSort");
            return (Criteria) this;
        }

        public Criteria andStoreSortNotEqualTo(Integer value) {
            addCriterion("store_sort <>", value, "storeSort");
            return (Criteria) this;
        }

        public Criteria andStoreSortGreaterThan(Integer value) {
            addCriterion("store_sort >", value, "storeSort");
            return (Criteria) this;
        }

        public Criteria andStoreSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_sort >=", value, "storeSort");
            return (Criteria) this;
        }

        public Criteria andStoreSortLessThan(Integer value) {
            addCriterion("store_sort <", value, "storeSort");
            return (Criteria) this;
        }

        public Criteria andStoreSortLessThanOrEqualTo(Integer value) {
            addCriterion("store_sort <=", value, "storeSort");
            return (Criteria) this;
        }

        public Criteria andStoreSortIn(List<Integer> values) {
            addCriterion("store_sort in", values, "storeSort");
            return (Criteria) this;
        }

        public Criteria andStoreSortNotIn(List<Integer> values) {
            addCriterion("store_sort not in", values, "storeSort");
            return (Criteria) this;
        }

        public Criteria andStoreSortBetween(Integer value1, Integer value2) {
            addCriterion("store_sort between", value1, value2, "storeSort");
            return (Criteria) this;
        }

        public Criteria andStoreSortNotBetween(Integer value1, Integer value2) {
            addCriterion("store_sort not between", value1, value2, "storeSort");
            return (Criteria) this;
        }

        public Criteria andStoreTimeIsNull() {
            addCriterion("store_time is null");
            return (Criteria) this;
        }

        public Criteria andStoreTimeIsNotNull() {
            addCriterion("store_time is not null");
            return (Criteria) this;
        }

        public Criteria andStoreTimeEqualTo(String value) {
            addCriterion("store_time =", value, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeNotEqualTo(String value) {
            addCriterion("store_time <>", value, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeGreaterThan(String value) {
            addCriterion("store_time >", value, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeGreaterThanOrEqualTo(String value) {
            addCriterion("store_time >=", value, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeLessThan(String value) {
            addCriterion("store_time <", value, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeLessThanOrEqualTo(String value) {
            addCriterion("store_time <=", value, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeLike(String value) {
            addCriterion("store_time like", value, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeNotLike(String value) {
            addCriterion("store_time not like", value, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeIn(List<String> values) {
            addCriterion("store_time in", values, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeNotIn(List<String> values) {
            addCriterion("store_time not in", values, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeBetween(String value1, String value2) {
            addCriterion("store_time between", value1, value2, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeNotBetween(String value1, String value2) {
            addCriterion("store_time not between", value1, value2, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeIsNull() {
            addCriterion("store_end_time is null");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeIsNotNull() {
            addCriterion("store_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeEqualTo(String value) {
            addCriterion("store_end_time =", value, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeNotEqualTo(String value) {
            addCriterion("store_end_time <>", value, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeGreaterThan(String value) {
            addCriterion("store_end_time >", value, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("store_end_time >=", value, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeLessThan(String value) {
            addCriterion("store_end_time <", value, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeLessThanOrEqualTo(String value) {
            addCriterion("store_end_time <=", value, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeLike(String value) {
            addCriterion("store_end_time like", value, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeNotLike(String value) {
            addCriterion("store_end_time not like", value, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeIn(List<String> values) {
            addCriterion("store_end_time in", values, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeNotIn(List<String> values) {
            addCriterion("store_end_time not in", values, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeBetween(String value1, String value2) {
            addCriterion("store_end_time between", value1, value2, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeNotBetween(String value1, String value2) {
            addCriterion("store_end_time not between", value1, value2, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreLabelIsNull() {
            addCriterion("store_label is null");
            return (Criteria) this;
        }

        public Criteria andStoreLabelIsNotNull() {
            addCriterion("store_label is not null");
            return (Criteria) this;
        }

        public Criteria andStoreLabelEqualTo(String value) {
            addCriterion("store_label =", value, "storeLabel");
            return (Criteria) this;
        }

        public Criteria andStoreLabelNotEqualTo(String value) {
            addCriterion("store_label <>", value, "storeLabel");
            return (Criteria) this;
        }

        public Criteria andStoreLabelGreaterThan(String value) {
            addCriterion("store_label >", value, "storeLabel");
            return (Criteria) this;
        }

        public Criteria andStoreLabelGreaterThanOrEqualTo(String value) {
            addCriterion("store_label >=", value, "storeLabel");
            return (Criteria) this;
        }

        public Criteria andStoreLabelLessThan(String value) {
            addCriterion("store_label <", value, "storeLabel");
            return (Criteria) this;
        }

        public Criteria andStoreLabelLessThanOrEqualTo(String value) {
            addCriterion("store_label <=", value, "storeLabel");
            return (Criteria) this;
        }

        public Criteria andStoreLabelLike(String value) {
            addCriterion("store_label like", value, "storeLabel");
            return (Criteria) this;
        }

        public Criteria andStoreLabelNotLike(String value) {
            addCriterion("store_label not like", value, "storeLabel");
            return (Criteria) this;
        }

        public Criteria andStoreLabelIn(List<String> values) {
            addCriterion("store_label in", values, "storeLabel");
            return (Criteria) this;
        }

        public Criteria andStoreLabelNotIn(List<String> values) {
            addCriterion("store_label not in", values, "storeLabel");
            return (Criteria) this;
        }

        public Criteria andStoreLabelBetween(String value1, String value2) {
            addCriterion("store_label between", value1, value2, "storeLabel");
            return (Criteria) this;
        }

        public Criteria andStoreLabelNotBetween(String value1, String value2) {
            addCriterion("store_label not between", value1, value2, "storeLabel");
            return (Criteria) this;
        }

        public Criteria andStoreBannerIsNull() {
            addCriterion("store_banner is null");
            return (Criteria) this;
        }

        public Criteria andStoreBannerIsNotNull() {
            addCriterion("store_banner is not null");
            return (Criteria) this;
        }

        public Criteria andStoreBannerEqualTo(String value) {
            addCriterion("store_banner =", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerNotEqualTo(String value) {
            addCriterion("store_banner <>", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerGreaterThan(String value) {
            addCriterion("store_banner >", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerGreaterThanOrEqualTo(String value) {
            addCriterion("store_banner >=", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerLessThan(String value) {
            addCriterion("store_banner <", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerLessThanOrEqualTo(String value) {
            addCriterion("store_banner <=", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerLike(String value) {
            addCriterion("store_banner like", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerNotLike(String value) {
            addCriterion("store_banner not like", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerIn(List<String> values) {
            addCriterion("store_banner in", values, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerNotIn(List<String> values) {
            addCriterion("store_banner not in", values, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerBetween(String value1, String value2) {
            addCriterion("store_banner between", value1, value2, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerNotBetween(String value1, String value2) {
            addCriterion("store_banner not between", value1, value2, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsIsNull() {
            addCriterion("store_keywords is null");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsIsNotNull() {
            addCriterion("store_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsEqualTo(String value) {
            addCriterion("store_keywords =", value, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsNotEqualTo(String value) {
            addCriterion("store_keywords <>", value, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsGreaterThan(String value) {
            addCriterion("store_keywords >", value, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("store_keywords >=", value, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsLessThan(String value) {
            addCriterion("store_keywords <", value, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsLessThanOrEqualTo(String value) {
            addCriterion("store_keywords <=", value, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsLike(String value) {
            addCriterion("store_keywords like", value, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsNotLike(String value) {
            addCriterion("store_keywords not like", value, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsIn(List<String> values) {
            addCriterion("store_keywords in", values, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsNotIn(List<String> values) {
            addCriterion("store_keywords not in", values, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsBetween(String value1, String value2) {
            addCriterion("store_keywords between", value1, value2, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsNotBetween(String value1, String value2) {
            addCriterion("store_keywords not between", value1, value2, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionIsNull() {
            addCriterion("store_description is null");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionIsNotNull() {
            addCriterion("store_description is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionEqualTo(String value) {
            addCriterion("store_description =", value, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionNotEqualTo(String value) {
            addCriterion("store_description <>", value, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionGreaterThan(String value) {
            addCriterion("store_description >", value, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("store_description >=", value, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionLessThan(String value) {
            addCriterion("store_description <", value, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionLessThanOrEqualTo(String value) {
            addCriterion("store_description <=", value, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionLike(String value) {
            addCriterion("store_description like", value, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionNotLike(String value) {
            addCriterion("store_description not like", value, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionIn(List<String> values) {
            addCriterion("store_description in", values, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionNotIn(List<String> values) {
            addCriterion("store_description not in", values, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionBetween(String value1, String value2) {
            addCriterion("store_description between", value1, value2, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionNotBetween(String value1, String value2) {
            addCriterion("store_description not between", value1, value2, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreQqIsNull() {
            addCriterion("store_qq is null");
            return (Criteria) this;
        }

        public Criteria andStoreQqIsNotNull() {
            addCriterion("store_qq is not null");
            return (Criteria) this;
        }

        public Criteria andStoreQqEqualTo(String value) {
            addCriterion("store_qq =", value, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqNotEqualTo(String value) {
            addCriterion("store_qq <>", value, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqGreaterThan(String value) {
            addCriterion("store_qq >", value, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqGreaterThanOrEqualTo(String value) {
            addCriterion("store_qq >=", value, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqLessThan(String value) {
            addCriterion("store_qq <", value, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqLessThanOrEqualTo(String value) {
            addCriterion("store_qq <=", value, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqLike(String value) {
            addCriterion("store_qq like", value, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqNotLike(String value) {
            addCriterion("store_qq not like", value, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqIn(List<String> values) {
            addCriterion("store_qq in", values, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqNotIn(List<String> values) {
            addCriterion("store_qq not in", values, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqBetween(String value1, String value2) {
            addCriterion("store_qq between", value1, value2, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqNotBetween(String value1, String value2) {
            addCriterion("store_qq not between", value1, value2, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreWwIsNull() {
            addCriterion("store_ww is null");
            return (Criteria) this;
        }

        public Criteria andStoreWwIsNotNull() {
            addCriterion("store_ww is not null");
            return (Criteria) this;
        }

        public Criteria andStoreWwEqualTo(String value) {
            addCriterion("store_ww =", value, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwNotEqualTo(String value) {
            addCriterion("store_ww <>", value, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwGreaterThan(String value) {
            addCriterion("store_ww >", value, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwGreaterThanOrEqualTo(String value) {
            addCriterion("store_ww >=", value, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwLessThan(String value) {
            addCriterion("store_ww <", value, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwLessThanOrEqualTo(String value) {
            addCriterion("store_ww <=", value, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwLike(String value) {
            addCriterion("store_ww like", value, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwNotLike(String value) {
            addCriterion("store_ww not like", value, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwIn(List<String> values) {
            addCriterion("store_ww in", values, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwNotIn(List<String> values) {
            addCriterion("store_ww not in", values, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwBetween(String value1, String value2) {
            addCriterion("store_ww between", value1, value2, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwNotBetween(String value1, String value2) {
            addCriterion("store_ww not between", value1, value2, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreDomainIsNull() {
            addCriterion("store_domain is null");
            return (Criteria) this;
        }

        public Criteria andStoreDomainIsNotNull() {
            addCriterion("store_domain is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDomainEqualTo(String value) {
            addCriterion("store_domain =", value, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainNotEqualTo(String value) {
            addCriterion("store_domain <>", value, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainGreaterThan(String value) {
            addCriterion("store_domain >", value, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainGreaterThanOrEqualTo(String value) {
            addCriterion("store_domain >=", value, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainLessThan(String value) {
            addCriterion("store_domain <", value, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainLessThanOrEqualTo(String value) {
            addCriterion("store_domain <=", value, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainLike(String value) {
            addCriterion("store_domain like", value, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainNotLike(String value) {
            addCriterion("store_domain not like", value, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainIn(List<String> values) {
            addCriterion("store_domain in", values, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainNotIn(List<String> values) {
            addCriterion("store_domain not in", values, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainBetween(String value1, String value2) {
            addCriterion("store_domain between", value1, value2, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainNotBetween(String value1, String value2) {
            addCriterion("store_domain not between", value1, value2, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainTimesIsNull() {
            addCriterion("store_domain_times is null");
            return (Criteria) this;
        }

        public Criteria andStoreDomainTimesIsNotNull() {
            addCriterion("store_domain_times is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDomainTimesEqualTo(Byte value) {
            addCriterion("store_domain_times =", value, "storeDomainTimes");
            return (Criteria) this;
        }

        public Criteria andStoreDomainTimesNotEqualTo(Byte value) {
            addCriterion("store_domain_times <>", value, "storeDomainTimes");
            return (Criteria) this;
        }

        public Criteria andStoreDomainTimesGreaterThan(Byte value) {
            addCriterion("store_domain_times >", value, "storeDomainTimes");
            return (Criteria) this;
        }

        public Criteria andStoreDomainTimesGreaterThanOrEqualTo(Byte value) {
            addCriterion("store_domain_times >=", value, "storeDomainTimes");
            return (Criteria) this;
        }

        public Criteria andStoreDomainTimesLessThan(Byte value) {
            addCriterion("store_domain_times <", value, "storeDomainTimes");
            return (Criteria) this;
        }

        public Criteria andStoreDomainTimesLessThanOrEqualTo(Byte value) {
            addCriterion("store_domain_times <=", value, "storeDomainTimes");
            return (Criteria) this;
        }

        public Criteria andStoreDomainTimesIn(List<Byte> values) {
            addCriterion("store_domain_times in", values, "storeDomainTimes");
            return (Criteria) this;
        }

        public Criteria andStoreDomainTimesNotIn(List<Byte> values) {
            addCriterion("store_domain_times not in", values, "storeDomainTimes");
            return (Criteria) this;
        }

        public Criteria andStoreDomainTimesBetween(Byte value1, Byte value2) {
            addCriterion("store_domain_times between", value1, value2, "storeDomainTimes");
            return (Criteria) this;
        }

        public Criteria andStoreDomainTimesNotBetween(Byte value1, Byte value2) {
            addCriterion("store_domain_times not between", value1, value2, "storeDomainTimes");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendIsNull() {
            addCriterion("store_recommend is null");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendIsNotNull() {
            addCriterion("store_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendEqualTo(Byte value) {
            addCriterion("store_recommend =", value, "storeRecommend");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendNotEqualTo(Byte value) {
            addCriterion("store_recommend <>", value, "storeRecommend");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendGreaterThan(Byte value) {
            addCriterion("store_recommend >", value, "storeRecommend");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendGreaterThanOrEqualTo(Byte value) {
            addCriterion("store_recommend >=", value, "storeRecommend");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendLessThan(Byte value) {
            addCriterion("store_recommend <", value, "storeRecommend");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendLessThanOrEqualTo(Byte value) {
            addCriterion("store_recommend <=", value, "storeRecommend");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendIn(List<Byte> values) {
            addCriterion("store_recommend in", values, "storeRecommend");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendNotIn(List<Byte> values) {
            addCriterion("store_recommend not in", values, "storeRecommend");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendBetween(Byte value1, Byte value2) {
            addCriterion("store_recommend between", value1, value2, "storeRecommend");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendNotBetween(Byte value1, Byte value2) {
            addCriterion("store_recommend not between", value1, value2, "storeRecommend");
            return (Criteria) this;
        }

        public Criteria andStoreThemeIsNull() {
            addCriterion("store_theme is null");
            return (Criteria) this;
        }

        public Criteria andStoreThemeIsNotNull() {
            addCriterion("store_theme is not null");
            return (Criteria) this;
        }

        public Criteria andStoreThemeEqualTo(String value) {
            addCriterion("store_theme =", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeNotEqualTo(String value) {
            addCriterion("store_theme <>", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeGreaterThan(String value) {
            addCriterion("store_theme >", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeGreaterThanOrEqualTo(String value) {
            addCriterion("store_theme >=", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeLessThan(String value) {
            addCriterion("store_theme <", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeLessThanOrEqualTo(String value) {
            addCriterion("store_theme <=", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeLike(String value) {
            addCriterion("store_theme like", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeNotLike(String value) {
            addCriterion("store_theme not like", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeIn(List<String> values) {
            addCriterion("store_theme in", values, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeNotIn(List<String> values) {
            addCriterion("store_theme not in", values, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeBetween(String value1, String value2) {
            addCriterion("store_theme between", value1, value2, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeNotBetween(String value1, String value2) {
            addCriterion("store_theme not between", value1, value2, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreCreditIsNull() {
            addCriterion("store_credit is null");
            return (Criteria) this;
        }

        public Criteria andStoreCreditIsNotNull() {
            addCriterion("store_credit is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCreditEqualTo(Integer value) {
            addCriterion("store_credit =", value, "storeCredit");
            return (Criteria) this;
        }

        public Criteria andStoreCreditNotEqualTo(Integer value) {
            addCriterion("store_credit <>", value, "storeCredit");
            return (Criteria) this;
        }

        public Criteria andStoreCreditGreaterThan(Integer value) {
            addCriterion("store_credit >", value, "storeCredit");
            return (Criteria) this;
        }

        public Criteria andStoreCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_credit >=", value, "storeCredit");
            return (Criteria) this;
        }

        public Criteria andStoreCreditLessThan(Integer value) {
            addCriterion("store_credit <", value, "storeCredit");
            return (Criteria) this;
        }

        public Criteria andStoreCreditLessThanOrEqualTo(Integer value) {
            addCriterion("store_credit <=", value, "storeCredit");
            return (Criteria) this;
        }

        public Criteria andStoreCreditIn(List<Integer> values) {
            addCriterion("store_credit in", values, "storeCredit");
            return (Criteria) this;
        }

        public Criteria andStoreCreditNotIn(List<Integer> values) {
            addCriterion("store_credit not in", values, "storeCredit");
            return (Criteria) this;
        }

        public Criteria andStoreCreditBetween(Integer value1, Integer value2) {
            addCriterion("store_credit between", value1, value2, "storeCredit");
            return (Criteria) this;
        }

        public Criteria andStoreCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("store_credit not between", value1, value2, "storeCredit");
            return (Criteria) this;
        }

        public Criteria andPraiseRateIsNull() {
            addCriterion("praise_rate is null");
            return (Criteria) this;
        }

        public Criteria andPraiseRateIsNotNull() {
            addCriterion("praise_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPraiseRateEqualTo(Float value) {
            addCriterion("praise_rate =", value, "praiseRate");
            return (Criteria) this;
        }

        public Criteria andPraiseRateNotEqualTo(Float value) {
            addCriterion("praise_rate <>", value, "praiseRate");
            return (Criteria) this;
        }

        public Criteria andPraiseRateGreaterThan(Float value) {
            addCriterion("praise_rate >", value, "praiseRate");
            return (Criteria) this;
        }

        public Criteria andPraiseRateGreaterThanOrEqualTo(Float value) {
            addCriterion("praise_rate >=", value, "praiseRate");
            return (Criteria) this;
        }

        public Criteria andPraiseRateLessThan(Float value) {
            addCriterion("praise_rate <", value, "praiseRate");
            return (Criteria) this;
        }

        public Criteria andPraiseRateLessThanOrEqualTo(Float value) {
            addCriterion("praise_rate <=", value, "praiseRate");
            return (Criteria) this;
        }

        public Criteria andPraiseRateIn(List<Float> values) {
            addCriterion("praise_rate in", values, "praiseRate");
            return (Criteria) this;
        }

        public Criteria andPraiseRateNotIn(List<Float> values) {
            addCriterion("praise_rate not in", values, "praiseRate");
            return (Criteria) this;
        }

        public Criteria andPraiseRateBetween(Float value1, Float value2) {
            addCriterion("praise_rate between", value1, value2, "praiseRate");
            return (Criteria) this;
        }

        public Criteria andPraiseRateNotBetween(Float value1, Float value2) {
            addCriterion("praise_rate not between", value1, value2, "praiseRate");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditIsNull() {
            addCriterion("store_desccredit is null");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditIsNotNull() {
            addCriterion("store_desccredit is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditEqualTo(Float value) {
            addCriterion("store_desccredit =", value, "storeDesccredit");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditNotEqualTo(Float value) {
            addCriterion("store_desccredit <>", value, "storeDesccredit");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditGreaterThan(Float value) {
            addCriterion("store_desccredit >", value, "storeDesccredit");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditGreaterThanOrEqualTo(Float value) {
            addCriterion("store_desccredit >=", value, "storeDesccredit");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditLessThan(Float value) {
            addCriterion("store_desccredit <", value, "storeDesccredit");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditLessThanOrEqualTo(Float value) {
            addCriterion("store_desccredit <=", value, "storeDesccredit");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditIn(List<Float> values) {
            addCriterion("store_desccredit in", values, "storeDesccredit");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditNotIn(List<Float> values) {
            addCriterion("store_desccredit not in", values, "storeDesccredit");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditBetween(Float value1, Float value2) {
            addCriterion("store_desccredit between", value1, value2, "storeDesccredit");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditNotBetween(Float value1, Float value2) {
            addCriterion("store_desccredit not between", value1, value2, "storeDesccredit");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditIsNull() {
            addCriterion("store_servicecredit is null");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditIsNotNull() {
            addCriterion("store_servicecredit is not null");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditEqualTo(Float value) {
            addCriterion("store_servicecredit =", value, "storeServicecredit");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditNotEqualTo(Float value) {
            addCriterion("store_servicecredit <>", value, "storeServicecredit");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditGreaterThan(Float value) {
            addCriterion("store_servicecredit >", value, "storeServicecredit");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditGreaterThanOrEqualTo(Float value) {
            addCriterion("store_servicecredit >=", value, "storeServicecredit");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditLessThan(Float value) {
            addCriterion("store_servicecredit <", value, "storeServicecredit");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditLessThanOrEqualTo(Float value) {
            addCriterion("store_servicecredit <=", value, "storeServicecredit");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditIn(List<Float> values) {
            addCriterion("store_servicecredit in", values, "storeServicecredit");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditNotIn(List<Float> values) {
            addCriterion("store_servicecredit not in", values, "storeServicecredit");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditBetween(Float value1, Float value2) {
            addCriterion("store_servicecredit between", value1, value2, "storeServicecredit");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditNotBetween(Float value1, Float value2) {
            addCriterion("store_servicecredit not between", value1, value2, "storeServicecredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditIsNull() {
            addCriterion("store_deliverycredit is null");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditIsNotNull() {
            addCriterion("store_deliverycredit is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditEqualTo(Float value) {
            addCriterion("store_deliverycredit =", value, "storeDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditNotEqualTo(Float value) {
            addCriterion("store_deliverycredit <>", value, "storeDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditGreaterThan(Float value) {
            addCriterion("store_deliverycredit >", value, "storeDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditGreaterThanOrEqualTo(Float value) {
            addCriterion("store_deliverycredit >=", value, "storeDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditLessThan(Float value) {
            addCriterion("store_deliverycredit <", value, "storeDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditLessThanOrEqualTo(Float value) {
            addCriterion("store_deliverycredit <=", value, "storeDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditIn(List<Float> values) {
            addCriterion("store_deliverycredit in", values, "storeDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditNotIn(List<Float> values) {
            addCriterion("store_deliverycredit not in", values, "storeDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditBetween(Float value1, Float value2) {
            addCriterion("store_deliverycredit between", value1, value2, "storeDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditNotBetween(Float value1, Float value2) {
            addCriterion("store_deliverycredit not between", value1, value2, "storeDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andStoreCollectIsNull() {
            addCriterion("store_collect is null");
            return (Criteria) this;
        }

        public Criteria andStoreCollectIsNotNull() {
            addCriterion("store_collect is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCollectEqualTo(Integer value) {
            addCriterion("store_collect =", value, "storeCollect");
            return (Criteria) this;
        }

        public Criteria andStoreCollectNotEqualTo(Integer value) {
            addCriterion("store_collect <>", value, "storeCollect");
            return (Criteria) this;
        }

        public Criteria andStoreCollectGreaterThan(Integer value) {
            addCriterion("store_collect >", value, "storeCollect");
            return (Criteria) this;
        }

        public Criteria andStoreCollectGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_collect >=", value, "storeCollect");
            return (Criteria) this;
        }

        public Criteria andStoreCollectLessThan(Integer value) {
            addCriterion("store_collect <", value, "storeCollect");
            return (Criteria) this;
        }

        public Criteria andStoreCollectLessThanOrEqualTo(Integer value) {
            addCriterion("store_collect <=", value, "storeCollect");
            return (Criteria) this;
        }

        public Criteria andStoreCollectIn(List<Integer> values) {
            addCriterion("store_collect in", values, "storeCollect");
            return (Criteria) this;
        }

        public Criteria andStoreCollectNotIn(List<Integer> values) {
            addCriterion("store_collect not in", values, "storeCollect");
            return (Criteria) this;
        }

        public Criteria andStoreCollectBetween(Integer value1, Integer value2) {
            addCriterion("store_collect between", value1, value2, "storeCollect");
            return (Criteria) this;
        }

        public Criteria andStoreCollectNotBetween(Integer value1, Integer value2) {
            addCriterion("store_collect not between", value1, value2, "storeCollect");
            return (Criteria) this;
        }

        public Criteria andStoreStampIsNull() {
            addCriterion("store_stamp is null");
            return (Criteria) this;
        }

        public Criteria andStoreStampIsNotNull() {
            addCriterion("store_stamp is not null");
            return (Criteria) this;
        }

        public Criteria andStoreStampEqualTo(String value) {
            addCriterion("store_stamp =", value, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampNotEqualTo(String value) {
            addCriterion("store_stamp <>", value, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampGreaterThan(String value) {
            addCriterion("store_stamp >", value, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampGreaterThanOrEqualTo(String value) {
            addCriterion("store_stamp >=", value, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampLessThan(String value) {
            addCriterion("store_stamp <", value, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampLessThanOrEqualTo(String value) {
            addCriterion("store_stamp <=", value, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampLike(String value) {
            addCriterion("store_stamp like", value, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampNotLike(String value) {
            addCriterion("store_stamp not like", value, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampIn(List<String> values) {
            addCriterion("store_stamp in", values, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampNotIn(List<String> values) {
            addCriterion("store_stamp not in", values, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampBetween(String value1, String value2) {
            addCriterion("store_stamp between", value1, value2, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampNotBetween(String value1, String value2) {
            addCriterion("store_stamp not between", value1, value2, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStorePrintdescIsNull() {
            addCriterion("store_printdesc is null");
            return (Criteria) this;
        }

        public Criteria andStorePrintdescIsNotNull() {
            addCriterion("store_printdesc is not null");
            return (Criteria) this;
        }

        public Criteria andStorePrintdescEqualTo(String value) {
            addCriterion("store_printdesc =", value, "storePrintdesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintdescNotEqualTo(String value) {
            addCriterion("store_printdesc <>", value, "storePrintdesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintdescGreaterThan(String value) {
            addCriterion("store_printdesc >", value, "storePrintdesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintdescGreaterThanOrEqualTo(String value) {
            addCriterion("store_printdesc >=", value, "storePrintdesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintdescLessThan(String value) {
            addCriterion("store_printdesc <", value, "storePrintdesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintdescLessThanOrEqualTo(String value) {
            addCriterion("store_printdesc <=", value, "storePrintdesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintdescLike(String value) {
            addCriterion("store_printdesc like", value, "storePrintdesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintdescNotLike(String value) {
            addCriterion("store_printdesc not like", value, "storePrintdesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintdescIn(List<String> values) {
            addCriterion("store_printdesc in", values, "storePrintdesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintdescNotIn(List<String> values) {
            addCriterion("store_printdesc not in", values, "storePrintdesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintdescBetween(String value1, String value2) {
            addCriterion("store_printdesc between", value1, value2, "storePrintdesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintdescNotBetween(String value1, String value2) {
            addCriterion("store_printdesc not between", value1, value2, "storePrintdesc");
            return (Criteria) this;
        }

        public Criteria andStoreSalesIsNull() {
            addCriterion("store_sales is null");
            return (Criteria) this;
        }

        public Criteria andStoreSalesIsNotNull() {
            addCriterion("store_sales is not null");
            return (Criteria) this;
        }

        public Criteria andStoreSalesEqualTo(Integer value) {
            addCriterion("store_sales =", value, "storeSales");
            return (Criteria) this;
        }

        public Criteria andStoreSalesNotEqualTo(Integer value) {
            addCriterion("store_sales <>", value, "storeSales");
            return (Criteria) this;
        }

        public Criteria andStoreSalesGreaterThan(Integer value) {
            addCriterion("store_sales >", value, "storeSales");
            return (Criteria) this;
        }

        public Criteria andStoreSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_sales >=", value, "storeSales");
            return (Criteria) this;
        }

        public Criteria andStoreSalesLessThan(Integer value) {
            addCriterion("store_sales <", value, "storeSales");
            return (Criteria) this;
        }

        public Criteria andStoreSalesLessThanOrEqualTo(Integer value) {
            addCriterion("store_sales <=", value, "storeSales");
            return (Criteria) this;
        }

        public Criteria andStoreSalesIn(List<Integer> values) {
            addCriterion("store_sales in", values, "storeSales");
            return (Criteria) this;
        }

        public Criteria andStoreSalesNotIn(List<Integer> values) {
            addCriterion("store_sales not in", values, "storeSales");
            return (Criteria) this;
        }

        public Criteria andStoreSalesBetween(Integer value1, Integer value2) {
            addCriterion("store_sales between", value1, value2, "storeSales");
            return (Criteria) this;
        }

        public Criteria andStoreSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("store_sales not between", value1, value2, "storeSales");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeIsNull() {
            addCriterion("store_workingtime is null");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeIsNotNull() {
            addCriterion("store_workingtime is not null");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeEqualTo(String value) {
            addCriterion("store_workingtime =", value, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeNotEqualTo(String value) {
            addCriterion("store_workingtime <>", value, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeGreaterThan(String value) {
            addCriterion("store_workingtime >", value, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeGreaterThanOrEqualTo(String value) {
            addCriterion("store_workingtime >=", value, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeLessThan(String value) {
            addCriterion("store_workingtime <", value, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeLessThanOrEqualTo(String value) {
            addCriterion("store_workingtime <=", value, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeLike(String value) {
            addCriterion("store_workingtime like", value, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeNotLike(String value) {
            addCriterion("store_workingtime not like", value, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeIn(List<String> values) {
            addCriterion("store_workingtime in", values, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeNotIn(List<String> values) {
            addCriterion("store_workingtime not in", values, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeBetween(String value1, String value2) {
            addCriterion("store_workingtime between", value1, value2, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeNotBetween(String value1, String value2) {
            addCriterion("store_workingtime not between", value1, value2, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceIsNull() {
            addCriterion("store_free_price is null");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceIsNotNull() {
            addCriterion("store_free_price is not null");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceEqualTo(BigDecimal value) {
            addCriterion("store_free_price =", value, "storeFreePrice");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceNotEqualTo(BigDecimal value) {
            addCriterion("store_free_price <>", value, "storeFreePrice");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceGreaterThan(BigDecimal value) {
            addCriterion("store_free_price >", value, "storeFreePrice");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("store_free_price >=", value, "storeFreePrice");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceLessThan(BigDecimal value) {
            addCriterion("store_free_price <", value, "storeFreePrice");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("store_free_price <=", value, "storeFreePrice");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceIn(List<BigDecimal> values) {
            addCriterion("store_free_price in", values, "storeFreePrice");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceNotIn(List<BigDecimal> values) {
            addCriterion("store_free_price not in", values, "storeFreePrice");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_free_price between", value1, value2, "storeFreePrice");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_free_price not between", value1, value2, "storeFreePrice");
            return (Criteria) this;
        }

        public Criteria andStoreStorageAlarmIsNull() {
            addCriterion("store_storage_alarm is null");
            return (Criteria) this;
        }

        public Criteria andStoreStorageAlarmIsNotNull() {
            addCriterion("store_storage_alarm is not null");
            return (Criteria) this;
        }

        public Criteria andStoreStorageAlarmEqualTo(Byte value) {
            addCriterion("store_storage_alarm =", value, "storeStorageAlarm");
            return (Criteria) this;
        }

        public Criteria andStoreStorageAlarmNotEqualTo(Byte value) {
            addCriterion("store_storage_alarm <>", value, "storeStorageAlarm");
            return (Criteria) this;
        }

        public Criteria andStoreStorageAlarmGreaterThan(Byte value) {
            addCriterion("store_storage_alarm >", value, "storeStorageAlarm");
            return (Criteria) this;
        }

        public Criteria andStoreStorageAlarmGreaterThanOrEqualTo(Byte value) {
            addCriterion("store_storage_alarm >=", value, "storeStorageAlarm");
            return (Criteria) this;
        }

        public Criteria andStoreStorageAlarmLessThan(Byte value) {
            addCriterion("store_storage_alarm <", value, "storeStorageAlarm");
            return (Criteria) this;
        }

        public Criteria andStoreStorageAlarmLessThanOrEqualTo(Byte value) {
            addCriterion("store_storage_alarm <=", value, "storeStorageAlarm");
            return (Criteria) this;
        }

        public Criteria andStoreStorageAlarmIn(List<Byte> values) {
            addCriterion("store_storage_alarm in", values, "storeStorageAlarm");
            return (Criteria) this;
        }

        public Criteria andStoreStorageAlarmNotIn(List<Byte> values) {
            addCriterion("store_storage_alarm not in", values, "storeStorageAlarm");
            return (Criteria) this;
        }

        public Criteria andStoreStorageAlarmBetween(Byte value1, Byte value2) {
            addCriterion("store_storage_alarm between", value1, value2, "storeStorageAlarm");
            return (Criteria) this;
        }

        public Criteria andStoreStorageAlarmNotBetween(Byte value1, Byte value2) {
            addCriterion("store_storage_alarm not between", value1, value2, "storeStorageAlarm");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_store表的实体类
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
     * sy_store 2017-10-16
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