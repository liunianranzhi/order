package com.shanyuan.platform.ms.dao.store.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SyStoreJoininExample {
    /**
     * sy_store_joinin
     */
    protected String orderByClause;

    /**
     * sy_store_joinin
     */
    protected boolean distinct;

    /**
     * sy_store_joinin
     */
    protected List<Criteria> oredCriteria;

    public SyStoreJoininExample() {
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
     * sy_store_joinin 2017-10-19
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailIsNull() {
            addCriterion("company_address_detail is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailIsNotNull() {
            addCriterion("company_address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailEqualTo(String value) {
            addCriterion("company_address_detail =", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailNotEqualTo(String value) {
            addCriterion("company_address_detail <>", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailGreaterThan(String value) {
            addCriterion("company_address_detail >", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("company_address_detail >=", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailLessThan(String value) {
            addCriterion("company_address_detail <", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("company_address_detail <=", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailLike(String value) {
            addCriterion("company_address_detail like", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailNotLike(String value) {
            addCriterion("company_address_detail not like", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailIn(List<String> values) {
            addCriterion("company_address_detail in", values, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailNotIn(List<String> values) {
            addCriterion("company_address_detail not in", values, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailBetween(String value1, String value2) {
            addCriterion("company_address_detail between", value1, value2, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailNotBetween(String value1, String value2) {
            addCriterion("company_address_detail not between", value1, value2, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNull() {
            addCriterion("company_phone is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNotNull() {
            addCriterion("company_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneEqualTo(String value) {
            addCriterion("company_phone =", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotEqualTo(String value) {
            addCriterion("company_phone <>", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThan(String value) {
            addCriterion("company_phone >", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("company_phone >=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThan(String value) {
            addCriterion("company_phone <", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("company_phone <=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLike(String value) {
            addCriterion("company_phone like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotLike(String value) {
            addCriterion("company_phone not like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIn(List<String> values) {
            addCriterion("company_phone in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotIn(List<String> values) {
            addCriterion("company_phone not in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneBetween(String value1, String value2) {
            addCriterion("company_phone between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("company_phone not between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountIsNull() {
            addCriterion("company_employee_count is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountIsNotNull() {
            addCriterion("company_employee_count is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountEqualTo(Integer value) {
            addCriterion("company_employee_count =", value, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountNotEqualTo(Integer value) {
            addCriterion("company_employee_count <>", value, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountGreaterThan(Integer value) {
            addCriterion("company_employee_count >", value, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_employee_count >=", value, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountLessThan(Integer value) {
            addCriterion("company_employee_count <", value, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountLessThanOrEqualTo(Integer value) {
            addCriterion("company_employee_count <=", value, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountIn(List<Integer> values) {
            addCriterion("company_employee_count in", values, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountNotIn(List<Integer> values) {
            addCriterion("company_employee_count not in", values, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountBetween(Integer value1, Integer value2) {
            addCriterion("company_employee_count between", value1, value2, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("company_employee_count not between", value1, value2, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalIsNull() {
            addCriterion("company_registered_capital is null");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalIsNotNull() {
            addCriterion("company_registered_capital is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalEqualTo(Integer value) {
            addCriterion("company_registered_capital =", value, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalNotEqualTo(Integer value) {
            addCriterion("company_registered_capital <>", value, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalGreaterThan(Integer value) {
            addCriterion("company_registered_capital >", value, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_registered_capital >=", value, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalLessThan(Integer value) {
            addCriterion("company_registered_capital <", value, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalLessThanOrEqualTo(Integer value) {
            addCriterion("company_registered_capital <=", value, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalIn(List<Integer> values) {
            addCriterion("company_registered_capital in", values, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalNotIn(List<Integer> values) {
            addCriterion("company_registered_capital not in", values, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalBetween(Integer value1, Integer value2) {
            addCriterion("company_registered_capital between", value1, value2, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalNotBetween(Integer value1, Integer value2) {
            addCriterion("company_registered_capital not between", value1, value2, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNull() {
            addCriterion("contacts_name is null");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNotNull() {
            addCriterion("contacts_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactsNameEqualTo(String value) {
            addCriterion("contacts_name =", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotEqualTo(String value) {
            addCriterion("contacts_name <>", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThan(String value) {
            addCriterion("contacts_name >", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_name >=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThan(String value) {
            addCriterion("contacts_name <", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThanOrEqualTo(String value) {
            addCriterion("contacts_name <=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLike(String value) {
            addCriterion("contacts_name like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotLike(String value) {
            addCriterion("contacts_name not like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameIn(List<String> values) {
            addCriterion("contacts_name in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotIn(List<String> values) {
            addCriterion("contacts_name not in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameBetween(String value1, String value2) {
            addCriterion("contacts_name between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotBetween(String value1, String value2) {
            addCriterion("contacts_name not between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIsNull() {
            addCriterion("contacts_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIsNotNull() {
            addCriterion("contacts_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneEqualTo(String value) {
            addCriterion("contacts_phone =", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotEqualTo(String value) {
            addCriterion("contacts_phone <>", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneGreaterThan(String value) {
            addCriterion("contacts_phone >", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_phone >=", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLessThan(String value) {
            addCriterion("contacts_phone <", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLessThanOrEqualTo(String value) {
            addCriterion("contacts_phone <=", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLike(String value) {
            addCriterion("contacts_phone like", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotLike(String value) {
            addCriterion("contacts_phone not like", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIn(List<String> values) {
            addCriterion("contacts_phone in", values, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotIn(List<String> values) {
            addCriterion("contacts_phone not in", values, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneBetween(String value1, String value2) {
            addCriterion("contacts_phone between", value1, value2, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotBetween(String value1, String value2) {
            addCriterion("contacts_phone not between", value1, value2, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsEmailIsNull() {
            addCriterion("contacts_email is null");
            return (Criteria) this;
        }

        public Criteria andContactsEmailIsNotNull() {
            addCriterion("contacts_email is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEmailEqualTo(String value) {
            addCriterion("contacts_email =", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailNotEqualTo(String value) {
            addCriterion("contacts_email <>", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailGreaterThan(String value) {
            addCriterion("contacts_email >", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_email >=", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailLessThan(String value) {
            addCriterion("contacts_email <", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailLessThanOrEqualTo(String value) {
            addCriterion("contacts_email <=", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailLike(String value) {
            addCriterion("contacts_email like", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailNotLike(String value) {
            addCriterion("contacts_email not like", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailIn(List<String> values) {
            addCriterion("contacts_email in", values, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailNotIn(List<String> values) {
            addCriterion("contacts_email not in", values, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailBetween(String value1, String value2) {
            addCriterion("contacts_email between", value1, value2, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailNotBetween(String value1, String value2) {
            addCriterion("contacts_email not between", value1, value2, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberIsNull() {
            addCriterion("business_licence_number is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberIsNotNull() {
            addCriterion("business_licence_number is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberEqualTo(String value) {
            addCriterion("business_licence_number =", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberNotEqualTo(String value) {
            addCriterion("business_licence_number <>", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberGreaterThan(String value) {
            addCriterion("business_licence_number >", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("business_licence_number >=", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberLessThan(String value) {
            addCriterion("business_licence_number <", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberLessThanOrEqualTo(String value) {
            addCriterion("business_licence_number <=", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberLike(String value) {
            addCriterion("business_licence_number like", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberNotLike(String value) {
            addCriterion("business_licence_number not like", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberIn(List<String> values) {
            addCriterion("business_licence_number in", values, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberNotIn(List<String> values) {
            addCriterion("business_licence_number not in", values, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberBetween(String value1, String value2) {
            addCriterion("business_licence_number between", value1, value2, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberNotBetween(String value1, String value2) {
            addCriterion("business_licence_number not between", value1, value2, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressIsNull() {
            addCriterion("business_licence_address is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressIsNotNull() {
            addCriterion("business_licence_address is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressEqualTo(String value) {
            addCriterion("business_licence_address =", value, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressNotEqualTo(String value) {
            addCriterion("business_licence_address <>", value, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressGreaterThan(String value) {
            addCriterion("business_licence_address >", value, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("business_licence_address >=", value, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressLessThan(String value) {
            addCriterion("business_licence_address <", value, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressLessThanOrEqualTo(String value) {
            addCriterion("business_licence_address <=", value, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressLike(String value) {
            addCriterion("business_licence_address like", value, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressNotLike(String value) {
            addCriterion("business_licence_address not like", value, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressIn(List<String> values) {
            addCriterion("business_licence_address in", values, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressNotIn(List<String> values) {
            addCriterion("business_licence_address not in", values, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressBetween(String value1, String value2) {
            addCriterion("business_licence_address between", value1, value2, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressNotBetween(String value1, String value2) {
            addCriterion("business_licence_address not between", value1, value2, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartIsNull() {
            addCriterion("business_licence_start is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartIsNotNull() {
            addCriterion("business_licence_start is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartEqualTo(Date value) {
            addCriterionForJDBCDate("business_licence_start =", value, "businessLicenceStart");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("business_licence_start <>", value, "businessLicenceStart");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartGreaterThan(Date value) {
            addCriterionForJDBCDate("business_licence_start >", value, "businessLicenceStart");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("business_licence_start >=", value, "businessLicenceStart");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartLessThan(Date value) {
            addCriterionForJDBCDate("business_licence_start <", value, "businessLicenceStart");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("business_licence_start <=", value, "businessLicenceStart");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartIn(List<Date> values) {
            addCriterionForJDBCDate("business_licence_start in", values, "businessLicenceStart");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("business_licence_start not in", values, "businessLicenceStart");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("business_licence_start between", value1, value2, "businessLicenceStart");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("business_licence_start not between", value1, value2, "businessLicenceStart");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndIsNull() {
            addCriterion("business_licence_end is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndIsNotNull() {
            addCriterion("business_licence_end is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndEqualTo(Date value) {
            addCriterionForJDBCDate("business_licence_end =", value, "businessLicenceEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("business_licence_end <>", value, "businessLicenceEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndGreaterThan(Date value) {
            addCriterionForJDBCDate("business_licence_end >", value, "businessLicenceEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("business_licence_end >=", value, "businessLicenceEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndLessThan(Date value) {
            addCriterionForJDBCDate("business_licence_end <", value, "businessLicenceEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("business_licence_end <=", value, "businessLicenceEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndIn(List<Date> values) {
            addCriterionForJDBCDate("business_licence_end in", values, "businessLicenceEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("business_licence_end not in", values, "businessLicenceEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("business_licence_end between", value1, value2, "businessLicenceEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("business_licence_end not between", value1, value2, "businessLicenceEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereIsNull() {
            addCriterion("business_sphere is null");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereIsNotNull() {
            addCriterion("business_sphere is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereEqualTo(String value) {
            addCriterion("business_sphere =", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereNotEqualTo(String value) {
            addCriterion("business_sphere <>", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereGreaterThan(String value) {
            addCriterion("business_sphere >", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereGreaterThanOrEqualTo(String value) {
            addCriterion("business_sphere >=", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereLessThan(String value) {
            addCriterion("business_sphere <", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereLessThanOrEqualTo(String value) {
            addCriterion("business_sphere <=", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereLike(String value) {
            addCriterion("business_sphere like", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereNotLike(String value) {
            addCriterion("business_sphere not like", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereIn(List<String> values) {
            addCriterion("business_sphere in", values, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereNotIn(List<String> values) {
            addCriterion("business_sphere not in", values, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereBetween(String value1, String value2) {
            addCriterion("business_sphere between", value1, value2, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereNotBetween(String value1, String value2) {
            addCriterion("business_sphere not between", value1, value2, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElectronicIsNull() {
            addCriterion("business_licence_number_electronic is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElectronicIsNotNull() {
            addCriterion("business_licence_number_electronic is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElectronicEqualTo(String value) {
            addCriterion("business_licence_number_electronic =", value, "businessLicenceNumberElectronic");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElectronicNotEqualTo(String value) {
            addCriterion("business_licence_number_electronic <>", value, "businessLicenceNumberElectronic");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElectronicGreaterThan(String value) {
            addCriterion("business_licence_number_electronic >", value, "businessLicenceNumberElectronic");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElectronicGreaterThanOrEqualTo(String value) {
            addCriterion("business_licence_number_electronic >=", value, "businessLicenceNumberElectronic");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElectronicLessThan(String value) {
            addCriterion("business_licence_number_electronic <", value, "businessLicenceNumberElectronic");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElectronicLessThanOrEqualTo(String value) {
            addCriterion("business_licence_number_electronic <=", value, "businessLicenceNumberElectronic");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElectronicLike(String value) {
            addCriterion("business_licence_number_electronic like", value, "businessLicenceNumberElectronic");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElectronicNotLike(String value) {
            addCriterion("business_licence_number_electronic not like", value, "businessLicenceNumberElectronic");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElectronicIn(List<String> values) {
            addCriterion("business_licence_number_electronic in", values, "businessLicenceNumberElectronic");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElectronicNotIn(List<String> values) {
            addCriterion("business_licence_number_electronic not in", values, "businessLicenceNumberElectronic");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElectronicBetween(String value1, String value2) {
            addCriterion("business_licence_number_electronic between", value1, value2, "businessLicenceNumberElectronic");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElectronicNotBetween(String value1, String value2) {
            addCriterion("business_licence_number_electronic not between", value1, value2, "businessLicenceNumberElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNull() {
            addCriterion("organization_code is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNotNull() {
            addCriterion("organization_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeEqualTo(String value) {
            addCriterion("organization_code =", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotEqualTo(String value) {
            addCriterion("organization_code <>", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThan(String value) {
            addCriterion("organization_code >", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("organization_code >=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThan(String value) {
            addCriterion("organization_code <", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThanOrEqualTo(String value) {
            addCriterion("organization_code <=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLike(String value) {
            addCriterion("organization_code like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotLike(String value) {
            addCriterion("organization_code not like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIn(List<String> values) {
            addCriterion("organization_code in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotIn(List<String> values) {
            addCriterion("organization_code not in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeBetween(String value1, String value2) {
            addCriterion("organization_code between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotBetween(String value1, String value2) {
            addCriterion("organization_code not between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicIsNull() {
            addCriterion("organization_code_electronic is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicIsNotNull() {
            addCriterion("organization_code_electronic is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicEqualTo(String value) {
            addCriterion("organization_code_electronic =", value, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicNotEqualTo(String value) {
            addCriterion("organization_code_electronic <>", value, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicGreaterThan(String value) {
            addCriterion("organization_code_electronic >", value, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicGreaterThanOrEqualTo(String value) {
            addCriterion("organization_code_electronic >=", value, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicLessThan(String value) {
            addCriterion("organization_code_electronic <", value, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicLessThanOrEqualTo(String value) {
            addCriterion("organization_code_electronic <=", value, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicLike(String value) {
            addCriterion("organization_code_electronic like", value, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicNotLike(String value) {
            addCriterion("organization_code_electronic not like", value, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicIn(List<String> values) {
            addCriterion("organization_code_electronic in", values, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicNotIn(List<String> values) {
            addCriterion("organization_code_electronic not in", values, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicBetween(String value1, String value2) {
            addCriterion("organization_code_electronic between", value1, value2, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicNotBetween(String value1, String value2) {
            addCriterion("organization_code_electronic not between", value1, value2, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerIsNull() {
            addCriterion("general_taxpayer is null");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerIsNotNull() {
            addCriterion("general_taxpayer is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerEqualTo(String value) {
            addCriterion("general_taxpayer =", value, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerNotEqualTo(String value) {
            addCriterion("general_taxpayer <>", value, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerGreaterThan(String value) {
            addCriterion("general_taxpayer >", value, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerGreaterThanOrEqualTo(String value) {
            addCriterion("general_taxpayer >=", value, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerLessThan(String value) {
            addCriterion("general_taxpayer <", value, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerLessThanOrEqualTo(String value) {
            addCriterion("general_taxpayer <=", value, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerLike(String value) {
            addCriterion("general_taxpayer like", value, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerNotLike(String value) {
            addCriterion("general_taxpayer not like", value, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerIn(List<String> values) {
            addCriterion("general_taxpayer in", values, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerNotIn(List<String> values) {
            addCriterion("general_taxpayer not in", values, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerBetween(String value1, String value2) {
            addCriterion("general_taxpayer between", value1, value2, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerNotBetween(String value1, String value2) {
            addCriterion("general_taxpayer not between", value1, value2, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNull() {
            addCriterion("bank_account_name is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNotNull() {
            addCriterion("bank_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameEqualTo(String value) {
            addCriterion("bank_account_name =", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotEqualTo(String value) {
            addCriterion("bank_account_name <>", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThan(String value) {
            addCriterion("bank_account_name >", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_name >=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThan(String value) {
            addCriterion("bank_account_name <", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThanOrEqualTo(String value) {
            addCriterion("bank_account_name <=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLike(String value) {
            addCriterion("bank_account_name like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotLike(String value) {
            addCriterion("bank_account_name not like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIn(List<String> values) {
            addCriterion("bank_account_name in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotIn(List<String> values) {
            addCriterion("bank_account_name not in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameBetween(String value1, String value2) {
            addCriterion("bank_account_name between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotBetween(String value1, String value2) {
            addCriterion("bank_account_name not between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberIsNull() {
            addCriterion("bank_account_number is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberIsNotNull() {
            addCriterion("bank_account_number is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberEqualTo(String value) {
            addCriterion("bank_account_number =", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberNotEqualTo(String value) {
            addCriterion("bank_account_number <>", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberGreaterThan(String value) {
            addCriterion("bank_account_number >", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_number >=", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberLessThan(String value) {
            addCriterion("bank_account_number <", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("bank_account_number <=", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberLike(String value) {
            addCriterion("bank_account_number like", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberNotLike(String value) {
            addCriterion("bank_account_number not like", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberIn(List<String> values) {
            addCriterion("bank_account_number in", values, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberNotIn(List<String> values) {
            addCriterion("bank_account_number not in", values, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberBetween(String value1, String value2) {
            addCriterion("bank_account_number between", value1, value2, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberNotBetween(String value1, String value2) {
            addCriterion("bank_account_number not between", value1, value2, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("bank_code is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("bank_code =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("bank_code <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("bank_code >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_code >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("bank_code <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("bank_code <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("bank_code like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("bank_code not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("bank_code in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("bank_code not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("bank_code between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("bank_code not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankAddressIsNull() {
            addCriterion("bank_address is null");
            return (Criteria) this;
        }

        public Criteria andBankAddressIsNotNull() {
            addCriterion("bank_address is not null");
            return (Criteria) this;
        }

        public Criteria andBankAddressEqualTo(String value) {
            addCriterion("bank_address =", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotEqualTo(String value) {
            addCriterion("bank_address <>", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressGreaterThan(String value) {
            addCriterion("bank_address >", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressGreaterThanOrEqualTo(String value) {
            addCriterion("bank_address >=", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLessThan(String value) {
            addCriterion("bank_address <", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLessThanOrEqualTo(String value) {
            addCriterion("bank_address <=", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLike(String value) {
            addCriterion("bank_address like", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotLike(String value) {
            addCriterion("bank_address not like", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressIn(List<String> values) {
            addCriterion("bank_address in", values, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotIn(List<String> values) {
            addCriterion("bank_address not in", values, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressBetween(String value1, String value2) {
            addCriterion("bank_address between", value1, value2, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotBetween(String value1, String value2) {
            addCriterion("bank_address not between", value1, value2, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicIsNull() {
            addCriterion("bank_licence_electronic is null");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicIsNotNull() {
            addCriterion("bank_licence_electronic is not null");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicEqualTo(String value) {
            addCriterion("bank_licence_electronic =", value, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicNotEqualTo(String value) {
            addCriterion("bank_licence_electronic <>", value, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicGreaterThan(String value) {
            addCriterion("bank_licence_electronic >", value, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicGreaterThanOrEqualTo(String value) {
            addCriterion("bank_licence_electronic >=", value, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicLessThan(String value) {
            addCriterion("bank_licence_electronic <", value, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicLessThanOrEqualTo(String value) {
            addCriterion("bank_licence_electronic <=", value, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicLike(String value) {
            addCriterion("bank_licence_electronic like", value, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicNotLike(String value) {
            addCriterion("bank_licence_electronic not like", value, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicIn(List<String> values) {
            addCriterion("bank_licence_electronic in", values, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicNotIn(List<String> values) {
            addCriterion("bank_licence_electronic not in", values, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicBetween(String value1, String value2) {
            addCriterion("bank_licence_electronic between", value1, value2, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicNotBetween(String value1, String value2) {
            addCriterion("bank_licence_electronic not between", value1, value2, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountIsNull() {
            addCriterion("is_settlement_account is null");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountIsNotNull() {
            addCriterion("is_settlement_account is not null");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountEqualTo(Byte value) {
            addCriterion("is_settlement_account =", value, "isSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountNotEqualTo(Byte value) {
            addCriterion("is_settlement_account <>", value, "isSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountGreaterThan(Byte value) {
            addCriterion("is_settlement_account >", value, "isSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_settlement_account >=", value, "isSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountLessThan(Byte value) {
            addCriterion("is_settlement_account <", value, "isSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountLessThanOrEqualTo(Byte value) {
            addCriterion("is_settlement_account <=", value, "isSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountIn(List<Byte> values) {
            addCriterion("is_settlement_account in", values, "isSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountNotIn(List<Byte> values) {
            addCriterion("is_settlement_account not in", values, "isSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountBetween(Byte value1, Byte value2) {
            addCriterion("is_settlement_account between", value1, value2, "isSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountNotBetween(Byte value1, Byte value2) {
            addCriterion("is_settlement_account not between", value1, value2, "isSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameIsNull() {
            addCriterion("settlement_bank_account_name is null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameIsNotNull() {
            addCriterion("settlement_bank_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameEqualTo(String value) {
            addCriterion("settlement_bank_account_name =", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameNotEqualTo(String value) {
            addCriterion("settlement_bank_account_name <>", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameGreaterThan(String value) {
            addCriterion("settlement_bank_account_name >", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_bank_account_name >=", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameLessThan(String value) {
            addCriterion("settlement_bank_account_name <", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameLessThanOrEqualTo(String value) {
            addCriterion("settlement_bank_account_name <=", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameLike(String value) {
            addCriterion("settlement_bank_account_name like", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameNotLike(String value) {
            addCriterion("settlement_bank_account_name not like", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameIn(List<String> values) {
            addCriterion("settlement_bank_account_name in", values, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameNotIn(List<String> values) {
            addCriterion("settlement_bank_account_name not in", values, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameBetween(String value1, String value2) {
            addCriterion("settlement_bank_account_name between", value1, value2, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameNotBetween(String value1, String value2) {
            addCriterion("settlement_bank_account_name not between", value1, value2, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberIsNull() {
            addCriterion("settlement_bank_account_number is null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberIsNotNull() {
            addCriterion("settlement_bank_account_number is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberEqualTo(String value) {
            addCriterion("settlement_bank_account_number =", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberNotEqualTo(String value) {
            addCriterion("settlement_bank_account_number <>", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberGreaterThan(String value) {
            addCriterion("settlement_bank_account_number >", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_bank_account_number >=", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberLessThan(String value) {
            addCriterion("settlement_bank_account_number <", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("settlement_bank_account_number <=", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberLike(String value) {
            addCriterion("settlement_bank_account_number like", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberNotLike(String value) {
            addCriterion("settlement_bank_account_number not like", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberIn(List<String> values) {
            addCriterion("settlement_bank_account_number in", values, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberNotIn(List<String> values) {
            addCriterion("settlement_bank_account_number not in", values, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberBetween(String value1, String value2) {
            addCriterion("settlement_bank_account_number between", value1, value2, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberNotBetween(String value1, String value2) {
            addCriterion("settlement_bank_account_number not between", value1, value2, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameIsNull() {
            addCriterion("settlement_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameIsNotNull() {
            addCriterion("settlement_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameEqualTo(String value) {
            addCriterion("settlement_bank_name =", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameNotEqualTo(String value) {
            addCriterion("settlement_bank_name <>", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameGreaterThan(String value) {
            addCriterion("settlement_bank_name >", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_bank_name >=", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameLessThan(String value) {
            addCriterion("settlement_bank_name <", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameLessThanOrEqualTo(String value) {
            addCriterion("settlement_bank_name <=", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameLike(String value) {
            addCriterion("settlement_bank_name like", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameNotLike(String value) {
            addCriterion("settlement_bank_name not like", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameIn(List<String> values) {
            addCriterion("settlement_bank_name in", values, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameNotIn(List<String> values) {
            addCriterion("settlement_bank_name not in", values, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameBetween(String value1, String value2) {
            addCriterion("settlement_bank_name between", value1, value2, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameNotBetween(String value1, String value2) {
            addCriterion("settlement_bank_name not between", value1, value2, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeIsNull() {
            addCriterion("settlement_bank_code is null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeIsNotNull() {
            addCriterion("settlement_bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeEqualTo(String value) {
            addCriterion("settlement_bank_code =", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeNotEqualTo(String value) {
            addCriterion("settlement_bank_code <>", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeGreaterThan(String value) {
            addCriterion("settlement_bank_code >", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_bank_code >=", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeLessThan(String value) {
            addCriterion("settlement_bank_code <", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeLessThanOrEqualTo(String value) {
            addCriterion("settlement_bank_code <=", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeLike(String value) {
            addCriterion("settlement_bank_code like", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeNotLike(String value) {
            addCriterion("settlement_bank_code not like", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeIn(List<String> values) {
            addCriterion("settlement_bank_code in", values, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeNotIn(List<String> values) {
            addCriterion("settlement_bank_code not in", values, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeBetween(String value1, String value2) {
            addCriterion("settlement_bank_code between", value1, value2, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeNotBetween(String value1, String value2) {
            addCriterion("settlement_bank_code not between", value1, value2, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressIsNull() {
            addCriterion("settlement_bank_address is null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressIsNotNull() {
            addCriterion("settlement_bank_address is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressEqualTo(String value) {
            addCriterion("settlement_bank_address =", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressNotEqualTo(String value) {
            addCriterion("settlement_bank_address <>", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressGreaterThan(String value) {
            addCriterion("settlement_bank_address >", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_bank_address >=", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressLessThan(String value) {
            addCriterion("settlement_bank_address <", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressLessThanOrEqualTo(String value) {
            addCriterion("settlement_bank_address <=", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressLike(String value) {
            addCriterion("settlement_bank_address like", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressNotLike(String value) {
            addCriterion("settlement_bank_address not like", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressIn(List<String> values) {
            addCriterion("settlement_bank_address in", values, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressNotIn(List<String> values) {
            addCriterion("settlement_bank_address not in", values, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressBetween(String value1, String value2) {
            addCriterion("settlement_bank_address between", value1, value2, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressNotBetween(String value1, String value2) {
            addCriterion("settlement_bank_address not between", value1, value2, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateIsNull() {
            addCriterion("tax_registration_certificate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateIsNotNull() {
            addCriterion("tax_registration_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateEqualTo(String value) {
            addCriterion("tax_registration_certificate =", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateNotEqualTo(String value) {
            addCriterion("tax_registration_certificate <>", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateGreaterThan(String value) {
            addCriterion("tax_registration_certificate >", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("tax_registration_certificate >=", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateLessThan(String value) {
            addCriterion("tax_registration_certificate <", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateLessThanOrEqualTo(String value) {
            addCriterion("tax_registration_certificate <=", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateLike(String value) {
            addCriterion("tax_registration_certificate like", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateNotLike(String value) {
            addCriterion("tax_registration_certificate not like", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateIn(List<String> values) {
            addCriterion("tax_registration_certificate in", values, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateNotIn(List<String> values) {
            addCriterion("tax_registration_certificate not in", values, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateBetween(String value1, String value2) {
            addCriterion("tax_registration_certificate between", value1, value2, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateNotBetween(String value1, String value2) {
            addCriterion("tax_registration_certificate not between", value1, value2, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdIsNull() {
            addCriterion("taxpayer_id is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdIsNotNull() {
            addCriterion("taxpayer_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdEqualTo(String value) {
            addCriterion("taxpayer_id =", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdNotEqualTo(String value) {
            addCriterion("taxpayer_id <>", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdGreaterThan(String value) {
            addCriterion("taxpayer_id >", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdGreaterThanOrEqualTo(String value) {
            addCriterion("taxpayer_id >=", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdLessThan(String value) {
            addCriterion("taxpayer_id <", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdLessThanOrEqualTo(String value) {
            addCriterion("taxpayer_id <=", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdLike(String value) {
            addCriterion("taxpayer_id like", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdNotLike(String value) {
            addCriterion("taxpayer_id not like", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdIn(List<String> values) {
            addCriterion("taxpayer_id in", values, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdNotIn(List<String> values) {
            addCriterion("taxpayer_id not in", values, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdBetween(String value1, String value2) {
            addCriterion("taxpayer_id between", value1, value2, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdNotBetween(String value1, String value2) {
            addCriterion("taxpayer_id not between", value1, value2, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateElectronicIsNull() {
            addCriterion("tax_registration_certificate_electronic is null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateElectronicIsNotNull() {
            addCriterion("tax_registration_certificate_electronic is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateElectronicEqualTo(String value) {
            addCriterion("tax_registration_certificate_electronic =", value, "taxRegistrationCertificateElectronic");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateElectronicNotEqualTo(String value) {
            addCriterion("tax_registration_certificate_electronic <>", value, "taxRegistrationCertificateElectronic");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateElectronicGreaterThan(String value) {
            addCriterion("tax_registration_certificate_electronic >", value, "taxRegistrationCertificateElectronic");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateElectronicGreaterThanOrEqualTo(String value) {
            addCriterion("tax_registration_certificate_electronic >=", value, "taxRegistrationCertificateElectronic");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateElectronicLessThan(String value) {
            addCriterion("tax_registration_certificate_electronic <", value, "taxRegistrationCertificateElectronic");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateElectronicLessThanOrEqualTo(String value) {
            addCriterion("tax_registration_certificate_electronic <=", value, "taxRegistrationCertificateElectronic");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateElectronicLike(String value) {
            addCriterion("tax_registration_certificate_electronic like", value, "taxRegistrationCertificateElectronic");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateElectronicNotLike(String value) {
            addCriterion("tax_registration_certificate_electronic not like", value, "taxRegistrationCertificateElectronic");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateElectronicIn(List<String> values) {
            addCriterion("tax_registration_certificate_electronic in", values, "taxRegistrationCertificateElectronic");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateElectronicNotIn(List<String> values) {
            addCriterion("tax_registration_certificate_electronic not in", values, "taxRegistrationCertificateElectronic");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateElectronicBetween(String value1, String value2) {
            addCriterion("tax_registration_certificate_electronic between", value1, value2, "taxRegistrationCertificateElectronic");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateElectronicNotBetween(String value1, String value2) {
            addCriterion("tax_registration_certificate_electronic not between", value1, value2, "taxRegistrationCertificateElectronic");
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

        public Criteria andStoreClassIdsIsNull() {
            addCriterion("store_class_ids is null");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsIsNotNull() {
            addCriterion("store_class_ids is not null");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsEqualTo(String value) {
            addCriterion("store_class_ids =", value, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsNotEqualTo(String value) {
            addCriterion("store_class_ids <>", value, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsGreaterThan(String value) {
            addCriterion("store_class_ids >", value, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsGreaterThanOrEqualTo(String value) {
            addCriterion("store_class_ids >=", value, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsLessThan(String value) {
            addCriterion("store_class_ids <", value, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsLessThanOrEqualTo(String value) {
            addCriterion("store_class_ids <=", value, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsLike(String value) {
            addCriterion("store_class_ids like", value, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsNotLike(String value) {
            addCriterion("store_class_ids not like", value, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsIn(List<String> values) {
            addCriterion("store_class_ids in", values, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsNotIn(List<String> values) {
            addCriterion("store_class_ids not in", values, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsBetween(String value1, String value2) {
            addCriterion("store_class_ids between", value1, value2, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsNotBetween(String value1, String value2) {
            addCriterion("store_class_ids not between", value1, value2, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesIsNull() {
            addCriterion("store_class_names is null");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesIsNotNull() {
            addCriterion("store_class_names is not null");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesEqualTo(String value) {
            addCriterion("store_class_names =", value, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesNotEqualTo(String value) {
            addCriterion("store_class_names <>", value, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesGreaterThan(String value) {
            addCriterion("store_class_names >", value, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesGreaterThanOrEqualTo(String value) {
            addCriterion("store_class_names >=", value, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesLessThan(String value) {
            addCriterion("store_class_names <", value, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesLessThanOrEqualTo(String value) {
            addCriterion("store_class_names <=", value, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesLike(String value) {
            addCriterion("store_class_names like", value, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesNotLike(String value) {
            addCriterion("store_class_names not like", value, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesIn(List<String> values) {
            addCriterion("store_class_names in", values, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesNotIn(List<String> values) {
            addCriterion("store_class_names not in", values, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesBetween(String value1, String value2) {
            addCriterion("store_class_names between", value1, value2, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesNotBetween(String value1, String value2) {
            addCriterion("store_class_names not between", value1, value2, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andJoininStateIsNull() {
            addCriterion("joinin_state is null");
            return (Criteria) this;
        }

        public Criteria andJoininStateIsNotNull() {
            addCriterion("joinin_state is not null");
            return (Criteria) this;
        }

        public Criteria andJoininStateEqualTo(String value) {
            addCriterion("joinin_state =", value, "joininState");
            return (Criteria) this;
        }

        public Criteria andJoininStateNotEqualTo(String value) {
            addCriterion("joinin_state <>", value, "joininState");
            return (Criteria) this;
        }

        public Criteria andJoininStateGreaterThan(String value) {
            addCriterion("joinin_state >", value, "joininState");
            return (Criteria) this;
        }

        public Criteria andJoininStateGreaterThanOrEqualTo(String value) {
            addCriterion("joinin_state >=", value, "joininState");
            return (Criteria) this;
        }

        public Criteria andJoininStateLessThan(String value) {
            addCriterion("joinin_state <", value, "joininState");
            return (Criteria) this;
        }

        public Criteria andJoininStateLessThanOrEqualTo(String value) {
            addCriterion("joinin_state <=", value, "joininState");
            return (Criteria) this;
        }

        public Criteria andJoininStateLike(String value) {
            addCriterion("joinin_state like", value, "joininState");
            return (Criteria) this;
        }

        public Criteria andJoininStateNotLike(String value) {
            addCriterion("joinin_state not like", value, "joininState");
            return (Criteria) this;
        }

        public Criteria andJoininStateIn(List<String> values) {
            addCriterion("joinin_state in", values, "joininState");
            return (Criteria) this;
        }

        public Criteria andJoininStateNotIn(List<String> values) {
            addCriterion("joinin_state not in", values, "joininState");
            return (Criteria) this;
        }

        public Criteria andJoininStateBetween(String value1, String value2) {
            addCriterion("joinin_state between", value1, value2, "joininState");
            return (Criteria) this;
        }

        public Criteria andJoininStateNotBetween(String value1, String value2) {
            addCriterion("joinin_state not between", value1, value2, "joininState");
            return (Criteria) this;
        }

        public Criteria andJoininMessageIsNull() {
            addCriterion("joinin_message is null");
            return (Criteria) this;
        }

        public Criteria andJoininMessageIsNotNull() {
            addCriterion("joinin_message is not null");
            return (Criteria) this;
        }

        public Criteria andJoininMessageEqualTo(String value) {
            addCriterion("joinin_message =", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageNotEqualTo(String value) {
            addCriterion("joinin_message <>", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageGreaterThan(String value) {
            addCriterion("joinin_message >", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageGreaterThanOrEqualTo(String value) {
            addCriterion("joinin_message >=", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageLessThan(String value) {
            addCriterion("joinin_message <", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageLessThanOrEqualTo(String value) {
            addCriterion("joinin_message <=", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageLike(String value) {
            addCriterion("joinin_message like", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageNotLike(String value) {
            addCriterion("joinin_message not like", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageIn(List<String> values) {
            addCriterion("joinin_message in", values, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageNotIn(List<String> values) {
            addCriterion("joinin_message not in", values, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageBetween(String value1, String value2) {
            addCriterion("joinin_message between", value1, value2, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageNotBetween(String value1, String value2) {
            addCriterion("joinin_message not between", value1, value2, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andSgNameIsNull() {
            addCriterion("sg_name is null");
            return (Criteria) this;
        }

        public Criteria andSgNameIsNotNull() {
            addCriterion("sg_name is not null");
            return (Criteria) this;
        }

        public Criteria andSgNameEqualTo(String value) {
            addCriterion("sg_name =", value, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameNotEqualTo(String value) {
            addCriterion("sg_name <>", value, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameGreaterThan(String value) {
            addCriterion("sg_name >", value, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameGreaterThanOrEqualTo(String value) {
            addCriterion("sg_name >=", value, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameLessThan(String value) {
            addCriterion("sg_name <", value, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameLessThanOrEqualTo(String value) {
            addCriterion("sg_name <=", value, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameLike(String value) {
            addCriterion("sg_name like", value, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameNotLike(String value) {
            addCriterion("sg_name not like", value, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameIn(List<String> values) {
            addCriterion("sg_name in", values, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameNotIn(List<String> values) {
            addCriterion("sg_name not in", values, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameBetween(String value1, String value2) {
            addCriterion("sg_name between", value1, value2, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameNotBetween(String value1, String value2) {
            addCriterion("sg_name not between", value1, value2, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgIdIsNull() {
            addCriterion("sg_id is null");
            return (Criteria) this;
        }

        public Criteria andSgIdIsNotNull() {
            addCriterion("sg_id is not null");
            return (Criteria) this;
        }

        public Criteria andSgIdEqualTo(Integer value) {
            addCriterion("sg_id =", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdNotEqualTo(Integer value) {
            addCriterion("sg_id <>", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdGreaterThan(Integer value) {
            addCriterion("sg_id >", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sg_id >=", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdLessThan(Integer value) {
            addCriterion("sg_id <", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdLessThanOrEqualTo(Integer value) {
            addCriterion("sg_id <=", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdIn(List<Integer> values) {
            addCriterion("sg_id in", values, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdNotIn(List<Integer> values) {
            addCriterion("sg_id not in", values, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdBetween(Integer value1, Integer value2) {
            addCriterion("sg_id between", value1, value2, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sg_id not between", value1, value2, "sgId");
            return (Criteria) this;
        }

        public Criteria andScNameIsNull() {
            addCriterion("sc_name is null");
            return (Criteria) this;
        }

        public Criteria andScNameIsNotNull() {
            addCriterion("sc_name is not null");
            return (Criteria) this;
        }

        public Criteria andScNameEqualTo(String value) {
            addCriterion("sc_name =", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotEqualTo(String value) {
            addCriterion("sc_name <>", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameGreaterThan(String value) {
            addCriterion("sc_name >", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameGreaterThanOrEqualTo(String value) {
            addCriterion("sc_name >=", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLessThan(String value) {
            addCriterion("sc_name <", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLessThanOrEqualTo(String value) {
            addCriterion("sc_name <=", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLike(String value) {
            addCriterion("sc_name like", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotLike(String value) {
            addCriterion("sc_name not like", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameIn(List<String> values) {
            addCriterion("sc_name in", values, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotIn(List<String> values) {
            addCriterion("sc_name not in", values, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameBetween(String value1, String value2) {
            addCriterion("sc_name between", value1, value2, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotBetween(String value1, String value2) {
            addCriterion("sc_name not between", value1, value2, "scName");
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

        public Criteria andStoreClassCommisRatesIsNull() {
            addCriterion("store_class_commis_rates is null");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesIsNotNull() {
            addCriterion("store_class_commis_rates is not null");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesEqualTo(String value) {
            addCriterion("store_class_commis_rates =", value, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesNotEqualTo(String value) {
            addCriterion("store_class_commis_rates <>", value, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesGreaterThan(String value) {
            addCriterion("store_class_commis_rates >", value, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesGreaterThanOrEqualTo(String value) {
            addCriterion("store_class_commis_rates >=", value, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesLessThan(String value) {
            addCriterion("store_class_commis_rates <", value, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesLessThanOrEqualTo(String value) {
            addCriterion("store_class_commis_rates <=", value, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesLike(String value) {
            addCriterion("store_class_commis_rates like", value, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesNotLike(String value) {
            addCriterion("store_class_commis_rates not like", value, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesIn(List<String> values) {
            addCriterion("store_class_commis_rates in", values, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesNotIn(List<String> values) {
            addCriterion("store_class_commis_rates not in", values, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesBetween(String value1, String value2) {
            addCriterion("store_class_commis_rates between", value1, value2, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesNotBetween(String value1, String value2) {
            addCriterion("store_class_commis_rates not between", value1, value2, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateIsNull() {
            addCriterion("paying_money_certificate is null");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateIsNotNull() {
            addCriterion("paying_money_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateEqualTo(String value) {
            addCriterion("paying_money_certificate =", value, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateNotEqualTo(String value) {
            addCriterion("paying_money_certificate <>", value, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateGreaterThan(String value) {
            addCriterion("paying_money_certificate >", value, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("paying_money_certificate >=", value, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateLessThan(String value) {
            addCriterion("paying_money_certificate <", value, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateLessThanOrEqualTo(String value) {
            addCriterion("paying_money_certificate <=", value, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateLike(String value) {
            addCriterion("paying_money_certificate like", value, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateNotLike(String value) {
            addCriterion("paying_money_certificate not like", value, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateIn(List<String> values) {
            addCriterion("paying_money_certificate in", values, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateNotIn(List<String> values) {
            addCriterion("paying_money_certificate not in", values, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateBetween(String value1, String value2) {
            addCriterion("paying_money_certificate between", value1, value2, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateNotBetween(String value1, String value2) {
            addCriterion("paying_money_certificate not between", value1, value2, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateExplainIsNull() {
            addCriterion("paying_money_certificate_explain is null");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateExplainIsNotNull() {
            addCriterion("paying_money_certificate_explain is not null");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateExplainEqualTo(String value) {
            addCriterion("paying_money_certificate_explain =", value, "payingMoneyCertificateExplain");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateExplainNotEqualTo(String value) {
            addCriterion("paying_money_certificate_explain <>", value, "payingMoneyCertificateExplain");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateExplainGreaterThan(String value) {
            addCriterion("paying_money_certificate_explain >", value, "payingMoneyCertificateExplain");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateExplainGreaterThanOrEqualTo(String value) {
            addCriterion("paying_money_certificate_explain >=", value, "payingMoneyCertificateExplain");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateExplainLessThan(String value) {
            addCriterion("paying_money_certificate_explain <", value, "payingMoneyCertificateExplain");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateExplainLessThanOrEqualTo(String value) {
            addCriterion("paying_money_certificate_explain <=", value, "payingMoneyCertificateExplain");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateExplainLike(String value) {
            addCriterion("paying_money_certificate_explain like", value, "payingMoneyCertificateExplain");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateExplainNotLike(String value) {
            addCriterion("paying_money_certificate_explain not like", value, "payingMoneyCertificateExplain");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateExplainIn(List<String> values) {
            addCriterion("paying_money_certificate_explain in", values, "payingMoneyCertificateExplain");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateExplainNotIn(List<String> values) {
            addCriterion("paying_money_certificate_explain not in", values, "payingMoneyCertificateExplain");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateExplainBetween(String value1, String value2) {
            addCriterion("paying_money_certificate_explain between", value1, value2, "payingMoneyCertificateExplain");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateExplainNotBetween(String value1, String value2) {
            addCriterion("paying_money_certificate_explain not between", value1, value2, "payingMoneyCertificateExplain");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNull() {
            addCriterion("car_num is null");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNotNull() {
            addCriterion("car_num is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumEqualTo(Integer value) {
            addCriterion("car_num =", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotEqualTo(Integer value) {
            addCriterion("car_num <>", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThan(Integer value) {
            addCriterion("car_num >", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_num >=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThan(Integer value) {
            addCriterion("car_num <", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThanOrEqualTo(Integer value) {
            addCriterion("car_num <=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumIn(List<Integer> values) {
            addCriterion("car_num in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotIn(List<Integer> values) {
            addCriterion("car_num not in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumBetween(Integer value1, Integer value2) {
            addCriterion("car_num between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotBetween(Integer value1, Integer value2) {
            addCriterion("car_num not between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaIsNull() {
            addCriterion("warehouse_area is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaIsNotNull() {
            addCriterion("warehouse_area is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaEqualTo(Integer value) {
            addCriterion("warehouse_area =", value, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaNotEqualTo(Integer value) {
            addCriterion("warehouse_area <>", value, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaGreaterThan(Integer value) {
            addCriterion("warehouse_area >", value, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("warehouse_area >=", value, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaLessThan(Integer value) {
            addCriterion("warehouse_area <", value, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaLessThanOrEqualTo(Integer value) {
            addCriterion("warehouse_area <=", value, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaIn(List<Integer> values) {
            addCriterion("warehouse_area in", values, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaNotIn(List<Integer> values) {
            addCriterion("warehouse_area not in", values, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_area between", value1, value2, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_area not between", value1, value2, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceNumIsNull() {
            addCriterion("single_device_num is null");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceNumIsNotNull() {
            addCriterion("single_device_num is not null");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceNumEqualTo(Integer value) {
            addCriterion("single_device_num =", value, "singleDeviceNum");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceNumNotEqualTo(Integer value) {
            addCriterion("single_device_num <>", value, "singleDeviceNum");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceNumGreaterThan(Integer value) {
            addCriterion("single_device_num >", value, "singleDeviceNum");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("single_device_num >=", value, "singleDeviceNum");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceNumLessThan(Integer value) {
            addCriterion("single_device_num <", value, "singleDeviceNum");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceNumLessThanOrEqualTo(Integer value) {
            addCriterion("single_device_num <=", value, "singleDeviceNum");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceNumIn(List<Integer> values) {
            addCriterion("single_device_num in", values, "singleDeviceNum");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceNumNotIn(List<Integer> values) {
            addCriterion("single_device_num not in", values, "singleDeviceNum");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceNumBetween(Integer value1, Integer value2) {
            addCriterion("single_device_num between", value1, value2, "singleDeviceNum");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceNumNotBetween(Integer value1, Integer value2) {
            addCriterion("single_device_num not between", value1, value2, "singleDeviceNum");
            return (Criteria) this;
        }

        public Criteria andComputerNumIsNull() {
            addCriterion("computer_num is null");
            return (Criteria) this;
        }

        public Criteria andComputerNumIsNotNull() {
            addCriterion("computer_num is not null");
            return (Criteria) this;
        }

        public Criteria andComputerNumEqualTo(Integer value) {
            addCriterion("computer_num =", value, "computerNum");
            return (Criteria) this;
        }

        public Criteria andComputerNumNotEqualTo(Integer value) {
            addCriterion("computer_num <>", value, "computerNum");
            return (Criteria) this;
        }

        public Criteria andComputerNumGreaterThan(Integer value) {
            addCriterion("computer_num >", value, "computerNum");
            return (Criteria) this;
        }

        public Criteria andComputerNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("computer_num >=", value, "computerNum");
            return (Criteria) this;
        }

        public Criteria andComputerNumLessThan(Integer value) {
            addCriterion("computer_num <", value, "computerNum");
            return (Criteria) this;
        }

        public Criteria andComputerNumLessThanOrEqualTo(Integer value) {
            addCriterion("computer_num <=", value, "computerNum");
            return (Criteria) this;
        }

        public Criteria andComputerNumIn(List<Integer> values) {
            addCriterion("computer_num in", values, "computerNum");
            return (Criteria) this;
        }

        public Criteria andComputerNumNotIn(List<Integer> values) {
            addCriterion("computer_num not in", values, "computerNum");
            return (Criteria) this;
        }

        public Criteria andComputerNumBetween(Integer value1, Integer value2) {
            addCriterion("computer_num between", value1, value2, "computerNum");
            return (Criteria) this;
        }

        public Criteria andComputerNumNotBetween(Integer value1, Integer value2) {
            addCriterion("computer_num not between", value1, value2, "computerNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameIsNull() {
            addCriterion("logistics_name is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameIsNotNull() {
            addCriterion("logistics_name is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameEqualTo(String value) {
            addCriterion("logistics_name =", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameNotEqualTo(String value) {
            addCriterion("logistics_name <>", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameGreaterThan(String value) {
            addCriterion("logistics_name >", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_name >=", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameLessThan(String value) {
            addCriterion("logistics_name <", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameLessThanOrEqualTo(String value) {
            addCriterion("logistics_name <=", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameLike(String value) {
            addCriterion("logistics_name like", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameNotLike(String value) {
            addCriterion("logistics_name not like", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameIn(List<String> values) {
            addCriterion("logistics_name in", values, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameNotIn(List<String> values) {
            addCriterion("logistics_name not in", values, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameBetween(String value1, String value2) {
            addCriterion("logistics_name between", value1, value2, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameNotBetween(String value1, String value2) {
            addCriterion("logistics_name not between", value1, value2, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementIsNull() {
            addCriterion("rental_agreement is null");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementIsNotNull() {
            addCriterion("rental_agreement is not null");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementEqualTo(String value) {
            addCriterion("rental_agreement =", value, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementNotEqualTo(String value) {
            addCriterion("rental_agreement <>", value, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementGreaterThan(String value) {
            addCriterion("rental_agreement >", value, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementGreaterThanOrEqualTo(String value) {
            addCriterion("rental_agreement >=", value, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementLessThan(String value) {
            addCriterion("rental_agreement <", value, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementLessThanOrEqualTo(String value) {
            addCriterion("rental_agreement <=", value, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementLike(String value) {
            addCriterion("rental_agreement like", value, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementNotLike(String value) {
            addCriterion("rental_agreement not like", value, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementIn(List<String> values) {
            addCriterion("rental_agreement in", values, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementNotIn(List<String> values) {
            addCriterion("rental_agreement not in", values, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementBetween(String value1, String value2) {
            addCriterion("rental_agreement between", value1, value2, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementNotBetween(String value1, String value2) {
            addCriterion("rental_agreement not between", value1, value2, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceImgIsNull() {
            addCriterion("single_device_img is null");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceImgIsNotNull() {
            addCriterion("single_device_img is not null");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceImgEqualTo(String value) {
            addCriterion("single_device_img =", value, "singleDeviceImg");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceImgNotEqualTo(String value) {
            addCriterion("single_device_img <>", value, "singleDeviceImg");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceImgGreaterThan(String value) {
            addCriterion("single_device_img >", value, "singleDeviceImg");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceImgGreaterThanOrEqualTo(String value) {
            addCriterion("single_device_img >=", value, "singleDeviceImg");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceImgLessThan(String value) {
            addCriterion("single_device_img <", value, "singleDeviceImg");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceImgLessThanOrEqualTo(String value) {
            addCriterion("single_device_img <=", value, "singleDeviceImg");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceImgLike(String value) {
            addCriterion("single_device_img like", value, "singleDeviceImg");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceImgNotLike(String value) {
            addCriterion("single_device_img not like", value, "singleDeviceImg");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceImgIn(List<String> values) {
            addCriterion("single_device_img in", values, "singleDeviceImg");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceImgNotIn(List<String> values) {
            addCriterion("single_device_img not in", values, "singleDeviceImg");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceImgBetween(String value1, String value2) {
            addCriterion("single_device_img between", value1, value2, "singleDeviceImg");
            return (Criteria) this;
        }

        public Criteria andSingleDeviceImgNotBetween(String value1, String value2) {
            addCriterion("single_device_img not between", value1, value2, "singleDeviceImg");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_store_joinin表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-10-19
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_store_joinin 2017-10-19
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