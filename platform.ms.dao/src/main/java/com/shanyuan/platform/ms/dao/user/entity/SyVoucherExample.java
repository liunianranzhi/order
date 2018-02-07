package com.shanyuan.platform.ms.dao.user.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyVoucherExample {
    /**
     * sy_voucher
     */
    protected String orderByClause;

    /**
     * sy_voucher
     */
    protected boolean distinct;

    /**
     * sy_voucher
     */
    protected List<Criteria> oredCriteria;

    public SyVoucherExample() {
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
     * sy_voucher 2017-10-16
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

        public Criteria andVoucherIdIsNull() {
            addCriterion("voucher_id is null");
            return (Criteria) this;
        }

        public Criteria andVoucherIdIsNotNull() {
            addCriterion("voucher_id is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherIdEqualTo(Integer value) {
            addCriterion("voucher_id =", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdNotEqualTo(Integer value) {
            addCriterion("voucher_id <>", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdGreaterThan(Integer value) {
            addCriterion("voucher_id >", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_id >=", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdLessThan(Integer value) {
            addCriterion("voucher_id <", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_id <=", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdIn(List<Integer> values) {
            addCriterion("voucher_id in", values, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdNotIn(List<Integer> values) {
            addCriterion("voucher_id not in", values, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdBetween(Integer value1, Integer value2) {
            addCriterion("voucher_id between", value1, value2, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_id not between", value1, value2, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeIsNull() {
            addCriterion("voucher_code is null");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeIsNotNull() {
            addCriterion("voucher_code is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeEqualTo(String value) {
            addCriterion("voucher_code =", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeNotEqualTo(String value) {
            addCriterion("voucher_code <>", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeGreaterThan(String value) {
            addCriterion("voucher_code >", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_code >=", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeLessThan(String value) {
            addCriterion("voucher_code <", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeLessThanOrEqualTo(String value) {
            addCriterion("voucher_code <=", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeLike(String value) {
            addCriterion("voucher_code like", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeNotLike(String value) {
            addCriterion("voucher_code not like", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeIn(List<String> values) {
            addCriterion("voucher_code in", values, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeNotIn(List<String> values) {
            addCriterion("voucher_code not in", values, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeBetween(String value1, String value2) {
            addCriterion("voucher_code between", value1, value2, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeNotBetween(String value1, String value2) {
            addCriterion("voucher_code not between", value1, value2, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherTIdIsNull() {
            addCriterion("voucher_t_id is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTIdIsNotNull() {
            addCriterion("voucher_t_id is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTIdEqualTo(Integer value) {
            addCriterion("voucher_t_id =", value, "voucherTId");
            return (Criteria) this;
        }

        public Criteria andVoucherTIdNotEqualTo(Integer value) {
            addCriterion("voucher_t_id <>", value, "voucherTId");
            return (Criteria) this;
        }

        public Criteria andVoucherTIdGreaterThan(Integer value) {
            addCriterion("voucher_t_id >", value, "voucherTId");
            return (Criteria) this;
        }

        public Criteria andVoucherTIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_id >=", value, "voucherTId");
            return (Criteria) this;
        }

        public Criteria andVoucherTIdLessThan(Integer value) {
            addCriterion("voucher_t_id <", value, "voucherTId");
            return (Criteria) this;
        }

        public Criteria andVoucherTIdLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_id <=", value, "voucherTId");
            return (Criteria) this;
        }

        public Criteria andVoucherTIdIn(List<Integer> values) {
            addCriterion("voucher_t_id in", values, "voucherTId");
            return (Criteria) this;
        }

        public Criteria andVoucherTIdNotIn(List<Integer> values) {
            addCriterion("voucher_t_id not in", values, "voucherTId");
            return (Criteria) this;
        }

        public Criteria andVoucherTIdBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_id between", value1, value2, "voucherTId");
            return (Criteria) this;
        }

        public Criteria andVoucherTIdNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_id not between", value1, value2, "voucherTId");
            return (Criteria) this;
        }

        public Criteria andVoucherTitleIsNull() {
            addCriterion("voucher_title is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTitleIsNotNull() {
            addCriterion("voucher_title is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTitleEqualTo(String value) {
            addCriterion("voucher_title =", value, "voucherTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTitleNotEqualTo(String value) {
            addCriterion("voucher_title <>", value, "voucherTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTitleGreaterThan(String value) {
            addCriterion("voucher_title >", value, "voucherTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTitleGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_title >=", value, "voucherTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTitleLessThan(String value) {
            addCriterion("voucher_title <", value, "voucherTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTitleLessThanOrEqualTo(String value) {
            addCriterion("voucher_title <=", value, "voucherTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTitleLike(String value) {
            addCriterion("voucher_title like", value, "voucherTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTitleNotLike(String value) {
            addCriterion("voucher_title not like", value, "voucherTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTitleIn(List<String> values) {
            addCriterion("voucher_title in", values, "voucherTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTitleNotIn(List<String> values) {
            addCriterion("voucher_title not in", values, "voucherTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTitleBetween(String value1, String value2) {
            addCriterion("voucher_title between", value1, value2, "voucherTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTitleNotBetween(String value1, String value2) {
            addCriterion("voucher_title not between", value1, value2, "voucherTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherDescIsNull() {
            addCriterion("voucher_desc is null");
            return (Criteria) this;
        }

        public Criteria andVoucherDescIsNotNull() {
            addCriterion("voucher_desc is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherDescEqualTo(String value) {
            addCriterion("voucher_desc =", value, "voucherDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherDescNotEqualTo(String value) {
            addCriterion("voucher_desc <>", value, "voucherDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherDescGreaterThan(String value) {
            addCriterion("voucher_desc >", value, "voucherDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherDescGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_desc >=", value, "voucherDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherDescLessThan(String value) {
            addCriterion("voucher_desc <", value, "voucherDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherDescLessThanOrEqualTo(String value) {
            addCriterion("voucher_desc <=", value, "voucherDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherDescLike(String value) {
            addCriterion("voucher_desc like", value, "voucherDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherDescNotLike(String value) {
            addCriterion("voucher_desc not like", value, "voucherDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherDescIn(List<String> values) {
            addCriterion("voucher_desc in", values, "voucherDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherDescNotIn(List<String> values) {
            addCriterion("voucher_desc not in", values, "voucherDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherDescBetween(String value1, String value2) {
            addCriterion("voucher_desc between", value1, value2, "voucherDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherDescNotBetween(String value1, String value2) {
            addCriterion("voucher_desc not between", value1, value2, "voucherDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherStartDateIsNull() {
            addCriterion("voucher_start_date is null");
            return (Criteria) this;
        }

        public Criteria andVoucherStartDateIsNotNull() {
            addCriterion("voucher_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherStartDateEqualTo(Integer value) {
            addCriterion("voucher_start_date =", value, "voucherStartDate");
            return (Criteria) this;
        }

        public Criteria andVoucherStartDateNotEqualTo(Integer value) {
            addCriterion("voucher_start_date <>", value, "voucherStartDate");
            return (Criteria) this;
        }

        public Criteria andVoucherStartDateGreaterThan(Integer value) {
            addCriterion("voucher_start_date >", value, "voucherStartDate");
            return (Criteria) this;
        }

        public Criteria andVoucherStartDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_start_date >=", value, "voucherStartDate");
            return (Criteria) this;
        }

        public Criteria andVoucherStartDateLessThan(Integer value) {
            addCriterion("voucher_start_date <", value, "voucherStartDate");
            return (Criteria) this;
        }

        public Criteria andVoucherStartDateLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_start_date <=", value, "voucherStartDate");
            return (Criteria) this;
        }

        public Criteria andVoucherStartDateIn(List<Integer> values) {
            addCriterion("voucher_start_date in", values, "voucherStartDate");
            return (Criteria) this;
        }

        public Criteria andVoucherStartDateNotIn(List<Integer> values) {
            addCriterion("voucher_start_date not in", values, "voucherStartDate");
            return (Criteria) this;
        }

        public Criteria andVoucherStartDateBetween(Integer value1, Integer value2) {
            addCriterion("voucher_start_date between", value1, value2, "voucherStartDate");
            return (Criteria) this;
        }

        public Criteria andVoucherStartDateNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_start_date not between", value1, value2, "voucherStartDate");
            return (Criteria) this;
        }

        public Criteria andVoucherEndDateIsNull() {
            addCriterion("voucher_end_date is null");
            return (Criteria) this;
        }

        public Criteria andVoucherEndDateIsNotNull() {
            addCriterion("voucher_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherEndDateEqualTo(Integer value) {
            addCriterion("voucher_end_date =", value, "voucherEndDate");
            return (Criteria) this;
        }

        public Criteria andVoucherEndDateNotEqualTo(Integer value) {
            addCriterion("voucher_end_date <>", value, "voucherEndDate");
            return (Criteria) this;
        }

        public Criteria andVoucherEndDateGreaterThan(Integer value) {
            addCriterion("voucher_end_date >", value, "voucherEndDate");
            return (Criteria) this;
        }

        public Criteria andVoucherEndDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_end_date >=", value, "voucherEndDate");
            return (Criteria) this;
        }

        public Criteria andVoucherEndDateLessThan(Integer value) {
            addCriterion("voucher_end_date <", value, "voucherEndDate");
            return (Criteria) this;
        }

        public Criteria andVoucherEndDateLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_end_date <=", value, "voucherEndDate");
            return (Criteria) this;
        }

        public Criteria andVoucherEndDateIn(List<Integer> values) {
            addCriterion("voucher_end_date in", values, "voucherEndDate");
            return (Criteria) this;
        }

        public Criteria andVoucherEndDateNotIn(List<Integer> values) {
            addCriterion("voucher_end_date not in", values, "voucherEndDate");
            return (Criteria) this;
        }

        public Criteria andVoucherEndDateBetween(Integer value1, Integer value2) {
            addCriterion("voucher_end_date between", value1, value2, "voucherEndDate");
            return (Criteria) this;
        }

        public Criteria andVoucherEndDateNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_end_date not between", value1, value2, "voucherEndDate");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceIsNull() {
            addCriterion("voucher_price is null");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceIsNotNull() {
            addCriterion("voucher_price is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceEqualTo(Integer value) {
            addCriterion("voucher_price =", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceNotEqualTo(Integer value) {
            addCriterion("voucher_price <>", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceGreaterThan(Integer value) {
            addCriterion("voucher_price >", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_price >=", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceLessThan(Integer value) {
            addCriterion("voucher_price <", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_price <=", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceIn(List<Integer> values) {
            addCriterion("voucher_price in", values, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceNotIn(List<Integer> values) {
            addCriterion("voucher_price not in", values, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceBetween(Integer value1, Integer value2) {
            addCriterion("voucher_price between", value1, value2, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_price not between", value1, value2, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherLimitIsNull() {
            addCriterion("voucher_limit is null");
            return (Criteria) this;
        }

        public Criteria andVoucherLimitIsNotNull() {
            addCriterion("voucher_limit is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherLimitEqualTo(BigDecimal value) {
            addCriterion("voucher_limit =", value, "voucherLimit");
            return (Criteria) this;
        }

        public Criteria andVoucherLimitNotEqualTo(BigDecimal value) {
            addCriterion("voucher_limit <>", value, "voucherLimit");
            return (Criteria) this;
        }

        public Criteria andVoucherLimitGreaterThan(BigDecimal value) {
            addCriterion("voucher_limit >", value, "voucherLimit");
            return (Criteria) this;
        }

        public Criteria andVoucherLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("voucher_limit >=", value, "voucherLimit");
            return (Criteria) this;
        }

        public Criteria andVoucherLimitLessThan(BigDecimal value) {
            addCriterion("voucher_limit <", value, "voucherLimit");
            return (Criteria) this;
        }

        public Criteria andVoucherLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("voucher_limit <=", value, "voucherLimit");
            return (Criteria) this;
        }

        public Criteria andVoucherLimitIn(List<BigDecimal> values) {
            addCriterion("voucher_limit in", values, "voucherLimit");
            return (Criteria) this;
        }

        public Criteria andVoucherLimitNotIn(List<BigDecimal> values) {
            addCriterion("voucher_limit not in", values, "voucherLimit");
            return (Criteria) this;
        }

        public Criteria andVoucherLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("voucher_limit between", value1, value2, "voucherLimit");
            return (Criteria) this;
        }

        public Criteria andVoucherLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("voucher_limit not between", value1, value2, "voucherLimit");
            return (Criteria) this;
        }

        public Criteria andVoucherStoreIdIsNull() {
            addCriterion("voucher_store_id is null");
            return (Criteria) this;
        }

        public Criteria andVoucherStoreIdIsNotNull() {
            addCriterion("voucher_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherStoreIdEqualTo(Integer value) {
            addCriterion("voucher_store_id =", value, "voucherStoreId");
            return (Criteria) this;
        }

        public Criteria andVoucherStoreIdNotEqualTo(Integer value) {
            addCriterion("voucher_store_id <>", value, "voucherStoreId");
            return (Criteria) this;
        }

        public Criteria andVoucherStoreIdGreaterThan(Integer value) {
            addCriterion("voucher_store_id >", value, "voucherStoreId");
            return (Criteria) this;
        }

        public Criteria andVoucherStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_store_id >=", value, "voucherStoreId");
            return (Criteria) this;
        }

        public Criteria andVoucherStoreIdLessThan(Integer value) {
            addCriterion("voucher_store_id <", value, "voucherStoreId");
            return (Criteria) this;
        }

        public Criteria andVoucherStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_store_id <=", value, "voucherStoreId");
            return (Criteria) this;
        }

        public Criteria andVoucherStoreIdIn(List<Integer> values) {
            addCriterion("voucher_store_id in", values, "voucherStoreId");
            return (Criteria) this;
        }

        public Criteria andVoucherStoreIdNotIn(List<Integer> values) {
            addCriterion("voucher_store_id not in", values, "voucherStoreId");
            return (Criteria) this;
        }

        public Criteria andVoucherStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("voucher_store_id between", value1, value2, "voucherStoreId");
            return (Criteria) this;
        }

        public Criteria andVoucherStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_store_id not between", value1, value2, "voucherStoreId");
            return (Criteria) this;
        }

        public Criteria andVoucherStateIsNull() {
            addCriterion("voucher_state is null");
            return (Criteria) this;
        }

        public Criteria andVoucherStateIsNotNull() {
            addCriterion("voucher_state is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherStateEqualTo(Byte value) {
            addCriterion("voucher_state =", value, "voucherState");
            return (Criteria) this;
        }

        public Criteria andVoucherStateNotEqualTo(Byte value) {
            addCriterion("voucher_state <>", value, "voucherState");
            return (Criteria) this;
        }

        public Criteria andVoucherStateGreaterThan(Byte value) {
            addCriterion("voucher_state >", value, "voucherState");
            return (Criteria) this;
        }

        public Criteria andVoucherStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("voucher_state >=", value, "voucherState");
            return (Criteria) this;
        }

        public Criteria andVoucherStateLessThan(Byte value) {
            addCriterion("voucher_state <", value, "voucherState");
            return (Criteria) this;
        }

        public Criteria andVoucherStateLessThanOrEqualTo(Byte value) {
            addCriterion("voucher_state <=", value, "voucherState");
            return (Criteria) this;
        }

        public Criteria andVoucherStateIn(List<Byte> values) {
            addCriterion("voucher_state in", values, "voucherState");
            return (Criteria) this;
        }

        public Criteria andVoucherStateNotIn(List<Byte> values) {
            addCriterion("voucher_state not in", values, "voucherState");
            return (Criteria) this;
        }

        public Criteria andVoucherStateBetween(Byte value1, Byte value2) {
            addCriterion("voucher_state between", value1, value2, "voucherState");
            return (Criteria) this;
        }

        public Criteria andVoucherStateNotBetween(Byte value1, Byte value2) {
            addCriterion("voucher_state not between", value1, value2, "voucherState");
            return (Criteria) this;
        }

        public Criteria andVoucherActiveDateIsNull() {
            addCriterion("voucher_active_date is null");
            return (Criteria) this;
        }

        public Criteria andVoucherActiveDateIsNotNull() {
            addCriterion("voucher_active_date is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherActiveDateEqualTo(Integer value) {
            addCriterion("voucher_active_date =", value, "voucherActiveDate");
            return (Criteria) this;
        }

        public Criteria andVoucherActiveDateNotEqualTo(Integer value) {
            addCriterion("voucher_active_date <>", value, "voucherActiveDate");
            return (Criteria) this;
        }

        public Criteria andVoucherActiveDateGreaterThan(Integer value) {
            addCriterion("voucher_active_date >", value, "voucherActiveDate");
            return (Criteria) this;
        }

        public Criteria andVoucherActiveDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_active_date >=", value, "voucherActiveDate");
            return (Criteria) this;
        }

        public Criteria andVoucherActiveDateLessThan(Integer value) {
            addCriterion("voucher_active_date <", value, "voucherActiveDate");
            return (Criteria) this;
        }

        public Criteria andVoucherActiveDateLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_active_date <=", value, "voucherActiveDate");
            return (Criteria) this;
        }

        public Criteria andVoucherActiveDateIn(List<Integer> values) {
            addCriterion("voucher_active_date in", values, "voucherActiveDate");
            return (Criteria) this;
        }

        public Criteria andVoucherActiveDateNotIn(List<Integer> values) {
            addCriterion("voucher_active_date not in", values, "voucherActiveDate");
            return (Criteria) this;
        }

        public Criteria andVoucherActiveDateBetween(Integer value1, Integer value2) {
            addCriterion("voucher_active_date between", value1, value2, "voucherActiveDate");
            return (Criteria) this;
        }

        public Criteria andVoucherActiveDateNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_active_date not between", value1, value2, "voucherActiveDate");
            return (Criteria) this;
        }

        public Criteria andVoucherUsedDateIsNull() {
            addCriterion("voucher_used_date is null");
            return (Criteria) this;
        }

        public Criteria andVoucherUsedDateIsNotNull() {
            addCriterion("voucher_used_date is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherUsedDateEqualTo(Integer value) {
            addCriterion("voucher_used_date =", value, "voucherUsedDate");
            return (Criteria) this;
        }

        public Criteria andVoucherUsedDateNotEqualTo(Integer value) {
            addCriterion("voucher_used_date <>", value, "voucherUsedDate");
            return (Criteria) this;
        }

        public Criteria andVoucherUsedDateGreaterThan(Integer value) {
            addCriterion("voucher_used_date >", value, "voucherUsedDate");
            return (Criteria) this;
        }

        public Criteria andVoucherUsedDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_used_date >=", value, "voucherUsedDate");
            return (Criteria) this;
        }

        public Criteria andVoucherUsedDateLessThan(Integer value) {
            addCriterion("voucher_used_date <", value, "voucherUsedDate");
            return (Criteria) this;
        }

        public Criteria andVoucherUsedDateLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_used_date <=", value, "voucherUsedDate");
            return (Criteria) this;
        }

        public Criteria andVoucherUsedDateIn(List<Integer> values) {
            addCriterion("voucher_used_date in", values, "voucherUsedDate");
            return (Criteria) this;
        }

        public Criteria andVoucherUsedDateNotIn(List<Integer> values) {
            addCriterion("voucher_used_date not in", values, "voucherUsedDate");
            return (Criteria) this;
        }

        public Criteria andVoucherUsedDateBetween(Integer value1, Integer value2) {
            addCriterion("voucher_used_date between", value1, value2, "voucherUsedDate");
            return (Criteria) this;
        }

        public Criteria andVoucherUsedDateNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_used_date not between", value1, value2, "voucherUsedDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeIsNull() {
            addCriterion("voucher_type is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeIsNotNull() {
            addCriterion("voucher_type is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeEqualTo(Byte value) {
            addCriterion("voucher_type =", value, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeNotEqualTo(Byte value) {
            addCriterion("voucher_type <>", value, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeGreaterThan(Byte value) {
            addCriterion("voucher_type >", value, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("voucher_type >=", value, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeLessThan(Byte value) {
            addCriterion("voucher_type <", value, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeLessThanOrEqualTo(Byte value) {
            addCriterion("voucher_type <=", value, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeIn(List<Byte> values) {
            addCriterion("voucher_type in", values, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeNotIn(List<Byte> values) {
            addCriterion("voucher_type not in", values, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeBetween(Byte value1, Byte value2) {
            addCriterion("voucher_type between", value1, value2, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("voucher_type not between", value1, value2, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerIdIsNull() {
            addCriterion("voucher_owner_id is null");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerIdIsNotNull() {
            addCriterion("voucher_owner_id is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerIdEqualTo(Integer value) {
            addCriterion("voucher_owner_id =", value, "voucherOwnerId");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerIdNotEqualTo(Integer value) {
            addCriterion("voucher_owner_id <>", value, "voucherOwnerId");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerIdGreaterThan(Integer value) {
            addCriterion("voucher_owner_id >", value, "voucherOwnerId");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_owner_id >=", value, "voucherOwnerId");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerIdLessThan(Integer value) {
            addCriterion("voucher_owner_id <", value, "voucherOwnerId");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_owner_id <=", value, "voucherOwnerId");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerIdIn(List<Integer> values) {
            addCriterion("voucher_owner_id in", values, "voucherOwnerId");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerIdNotIn(List<Integer> values) {
            addCriterion("voucher_owner_id not in", values, "voucherOwnerId");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerIdBetween(Integer value1, Integer value2) {
            addCriterion("voucher_owner_id between", value1, value2, "voucherOwnerId");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_owner_id not between", value1, value2, "voucherOwnerId");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerNameIsNull() {
            addCriterion("voucher_owner_name is null");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerNameIsNotNull() {
            addCriterion("voucher_owner_name is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerNameEqualTo(String value) {
            addCriterion("voucher_owner_name =", value, "voucherOwnerName");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerNameNotEqualTo(String value) {
            addCriterion("voucher_owner_name <>", value, "voucherOwnerName");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerNameGreaterThan(String value) {
            addCriterion("voucher_owner_name >", value, "voucherOwnerName");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_owner_name >=", value, "voucherOwnerName");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerNameLessThan(String value) {
            addCriterion("voucher_owner_name <", value, "voucherOwnerName");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerNameLessThanOrEqualTo(String value) {
            addCriterion("voucher_owner_name <=", value, "voucherOwnerName");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerNameLike(String value) {
            addCriterion("voucher_owner_name like", value, "voucherOwnerName");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerNameNotLike(String value) {
            addCriterion("voucher_owner_name not like", value, "voucherOwnerName");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerNameIn(List<String> values) {
            addCriterion("voucher_owner_name in", values, "voucherOwnerName");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerNameNotIn(List<String> values) {
            addCriterion("voucher_owner_name not in", values, "voucherOwnerName");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerNameBetween(String value1, String value2) {
            addCriterion("voucher_owner_name between", value1, value2, "voucherOwnerName");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerNameNotBetween(String value1, String value2) {
            addCriterion("voucher_owner_name not between", value1, value2, "voucherOwnerName");
            return (Criteria) this;
        }

        public Criteria andVoucherOrderIdIsNull() {
            addCriterion("voucher_order_id is null");
            return (Criteria) this;
        }

        public Criteria andVoucherOrderIdIsNotNull() {
            addCriterion("voucher_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherOrderIdEqualTo(Integer value) {
            addCriterion("voucher_order_id =", value, "voucherOrderId");
            return (Criteria) this;
        }

        public Criteria andVoucherOrderIdNotEqualTo(Integer value) {
            addCriterion("voucher_order_id <>", value, "voucherOrderId");
            return (Criteria) this;
        }

        public Criteria andVoucherOrderIdGreaterThan(Integer value) {
            addCriterion("voucher_order_id >", value, "voucherOrderId");
            return (Criteria) this;
        }

        public Criteria andVoucherOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_order_id >=", value, "voucherOrderId");
            return (Criteria) this;
        }

        public Criteria andVoucherOrderIdLessThan(Integer value) {
            addCriterion("voucher_order_id <", value, "voucherOrderId");
            return (Criteria) this;
        }

        public Criteria andVoucherOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_order_id <=", value, "voucherOrderId");
            return (Criteria) this;
        }

        public Criteria andVoucherOrderIdIn(List<Integer> values) {
            addCriterion("voucher_order_id in", values, "voucherOrderId");
            return (Criteria) this;
        }

        public Criteria andVoucherOrderIdNotIn(List<Integer> values) {
            addCriterion("voucher_order_id not in", values, "voucherOrderId");
            return (Criteria) this;
        }

        public Criteria andVoucherOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("voucher_order_id between", value1, value2, "voucherOrderId");
            return (Criteria) this;
        }

        public Criteria andVoucherOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_order_id not between", value1, value2, "voucherOrderId");
            return (Criteria) this;
        }

        public Criteria andVoucherTTypeIsNull() {
            addCriterion("voucher_t_type is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTTypeIsNotNull() {
            addCriterion("voucher_t_type is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTTypeEqualTo(Byte value) {
            addCriterion("voucher_t_type =", value, "voucherTType");
            return (Criteria) this;
        }

        public Criteria andVoucherTTypeNotEqualTo(Byte value) {
            addCriterion("voucher_t_type <>", value, "voucherTType");
            return (Criteria) this;
        }

        public Criteria andVoucherTTypeGreaterThan(Byte value) {
            addCriterion("voucher_t_type >", value, "voucherTType");
            return (Criteria) this;
        }

        public Criteria andVoucherTTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("voucher_t_type >=", value, "voucherTType");
            return (Criteria) this;
        }

        public Criteria andVoucherTTypeLessThan(Byte value) {
            addCriterion("voucher_t_type <", value, "voucherTType");
            return (Criteria) this;
        }

        public Criteria andVoucherTTypeLessThanOrEqualTo(Byte value) {
            addCriterion("voucher_t_type <=", value, "voucherTType");
            return (Criteria) this;
        }

        public Criteria andVoucherTTypeIn(List<Byte> values) {
            addCriterion("voucher_t_type in", values, "voucherTType");
            return (Criteria) this;
        }

        public Criteria andVoucherTTypeNotIn(List<Byte> values) {
            addCriterion("voucher_t_type not in", values, "voucherTType");
            return (Criteria) this;
        }

        public Criteria andVoucherTTypeBetween(Byte value1, Byte value2) {
            addCriterion("voucher_t_type between", value1, value2, "voucherTType");
            return (Criteria) this;
        }

        public Criteria andVoucherTTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("voucher_t_type not between", value1, value2, "voucherTType");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerMobileIsNull() {
            addCriterion("voucher_owner_mobile is null");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerMobileIsNotNull() {
            addCriterion("voucher_owner_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerMobileEqualTo(String value) {
            addCriterion("voucher_owner_mobile =", value, "voucherOwnerMobile");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerMobileNotEqualTo(String value) {
            addCriterion("voucher_owner_mobile <>", value, "voucherOwnerMobile");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerMobileGreaterThan(String value) {
            addCriterion("voucher_owner_mobile >", value, "voucherOwnerMobile");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerMobileGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_owner_mobile >=", value, "voucherOwnerMobile");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerMobileLessThan(String value) {
            addCriterion("voucher_owner_mobile <", value, "voucherOwnerMobile");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerMobileLessThanOrEqualTo(String value) {
            addCriterion("voucher_owner_mobile <=", value, "voucherOwnerMobile");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerMobileLike(String value) {
            addCriterion("voucher_owner_mobile like", value, "voucherOwnerMobile");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerMobileNotLike(String value) {
            addCriterion("voucher_owner_mobile not like", value, "voucherOwnerMobile");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerMobileIn(List<String> values) {
            addCriterion("voucher_owner_mobile in", values, "voucherOwnerMobile");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerMobileNotIn(List<String> values) {
            addCriterion("voucher_owner_mobile not in", values, "voucherOwnerMobile");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerMobileBetween(String value1, String value2) {
            addCriterion("voucher_owner_mobile between", value1, value2, "voucherOwnerMobile");
            return (Criteria) this;
        }

        public Criteria andVoucherOwnerMobileNotBetween(String value1, String value2) {
            addCriterion("voucher_owner_mobile not between", value1, value2, "voucherOwnerMobile");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_voucher表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-10-16
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_voucher 2017-10-16
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