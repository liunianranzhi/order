package com.shanyuan.platform.ms.dao.user.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyVoucherTemplateExample {
    /**
     * sy_voucher_template
     */
    protected String orderByClause;

    /**
     * sy_voucher_template
     */
    protected boolean distinct;

    /**
     * sy_voucher_template
     */
    protected List<Criteria> oredCriteria;

    public SyVoucherTemplateExample() {
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
     * sy_voucher_template 2017-10-17
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

        public Criteria andVoucherTTitleIsNull() {
            addCriterion("voucher_t_title is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTTitleIsNotNull() {
            addCriterion("voucher_t_title is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTTitleEqualTo(String value) {
            addCriterion("voucher_t_title =", value, "voucherTTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTTitleNotEqualTo(String value) {
            addCriterion("voucher_t_title <>", value, "voucherTTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTTitleGreaterThan(String value) {
            addCriterion("voucher_t_title >", value, "voucherTTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTTitleGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_t_title >=", value, "voucherTTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTTitleLessThan(String value) {
            addCriterion("voucher_t_title <", value, "voucherTTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTTitleLessThanOrEqualTo(String value) {
            addCriterion("voucher_t_title <=", value, "voucherTTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTTitleLike(String value) {
            addCriterion("voucher_t_title like", value, "voucherTTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTTitleNotLike(String value) {
            addCriterion("voucher_t_title not like", value, "voucherTTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTTitleIn(List<String> values) {
            addCriterion("voucher_t_title in", values, "voucherTTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTTitleNotIn(List<String> values) {
            addCriterion("voucher_t_title not in", values, "voucherTTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTTitleBetween(String value1, String value2) {
            addCriterion("voucher_t_title between", value1, value2, "voucherTTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTTitleNotBetween(String value1, String value2) {
            addCriterion("voucher_t_title not between", value1, value2, "voucherTTitle");
            return (Criteria) this;
        }

        public Criteria andVoucherTDescIsNull() {
            addCriterion("voucher_t_desc is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTDescIsNotNull() {
            addCriterion("voucher_t_desc is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTDescEqualTo(String value) {
            addCriterion("voucher_t_desc =", value, "voucherTDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherTDescNotEqualTo(String value) {
            addCriterion("voucher_t_desc <>", value, "voucherTDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherTDescGreaterThan(String value) {
            addCriterion("voucher_t_desc >", value, "voucherTDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherTDescGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_t_desc >=", value, "voucherTDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherTDescLessThan(String value) {
            addCriterion("voucher_t_desc <", value, "voucherTDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherTDescLessThanOrEqualTo(String value) {
            addCriterion("voucher_t_desc <=", value, "voucherTDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherTDescLike(String value) {
            addCriterion("voucher_t_desc like", value, "voucherTDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherTDescNotLike(String value) {
            addCriterion("voucher_t_desc not like", value, "voucherTDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherTDescIn(List<String> values) {
            addCriterion("voucher_t_desc in", values, "voucherTDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherTDescNotIn(List<String> values) {
            addCriterion("voucher_t_desc not in", values, "voucherTDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherTDescBetween(String value1, String value2) {
            addCriterion("voucher_t_desc between", value1, value2, "voucherTDesc");
            return (Criteria) this;
        }

        public Criteria andVoucherTDescNotBetween(String value1, String value2) {
            addCriterion("voucher_t_desc not between", value1, value2, "voucherTDesc");
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

        public Criteria andVoucherTStartDateIsNull() {
            addCriterion("voucher_t_start_date is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTStartDateIsNotNull() {
            addCriterion("voucher_t_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTStartDateEqualTo(Integer value) {
            addCriterion("voucher_t_start_date =", value, "voucherTStartDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTStartDateNotEqualTo(Integer value) {
            addCriterion("voucher_t_start_date <>", value, "voucherTStartDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTStartDateGreaterThan(Integer value) {
            addCriterion("voucher_t_start_date >", value, "voucherTStartDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTStartDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_start_date >=", value, "voucherTStartDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTStartDateLessThan(Integer value) {
            addCriterion("voucher_t_start_date <", value, "voucherTStartDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTStartDateLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_start_date <=", value, "voucherTStartDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTStartDateIn(List<Integer> values) {
            addCriterion("voucher_t_start_date in", values, "voucherTStartDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTStartDateNotIn(List<Integer> values) {
            addCriterion("voucher_t_start_date not in", values, "voucherTStartDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTStartDateBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_start_date between", value1, value2, "voucherTStartDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTStartDateNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_start_date not between", value1, value2, "voucherTStartDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTEndDateIsNull() {
            addCriterion("voucher_t_end_date is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTEndDateIsNotNull() {
            addCriterion("voucher_t_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTEndDateEqualTo(Integer value) {
            addCriterion("voucher_t_end_date =", value, "voucherTEndDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTEndDateNotEqualTo(Integer value) {
            addCriterion("voucher_t_end_date <>", value, "voucherTEndDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTEndDateGreaterThan(Integer value) {
            addCriterion("voucher_t_end_date >", value, "voucherTEndDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTEndDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_end_date >=", value, "voucherTEndDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTEndDateLessThan(Integer value) {
            addCriterion("voucher_t_end_date <", value, "voucherTEndDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTEndDateLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_end_date <=", value, "voucherTEndDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTEndDateIn(List<Integer> values) {
            addCriterion("voucher_t_end_date in", values, "voucherTEndDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTEndDateNotIn(List<Integer> values) {
            addCriterion("voucher_t_end_date not in", values, "voucherTEndDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTEndDateBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_end_date between", value1, value2, "voucherTEndDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTEndDateNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_end_date not between", value1, value2, "voucherTEndDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTPriceIsNull() {
            addCriterion("voucher_t_price is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTPriceIsNotNull() {
            addCriterion("voucher_t_price is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTPriceEqualTo(Integer value) {
            addCriterion("voucher_t_price =", value, "voucherTPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherTPriceNotEqualTo(Integer value) {
            addCriterion("voucher_t_price <>", value, "voucherTPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherTPriceGreaterThan(Integer value) {
            addCriterion("voucher_t_price >", value, "voucherTPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherTPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_price >=", value, "voucherTPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherTPriceLessThan(Integer value) {
            addCriterion("voucher_t_price <", value, "voucherTPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherTPriceLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_price <=", value, "voucherTPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherTPriceIn(List<Integer> values) {
            addCriterion("voucher_t_price in", values, "voucherTPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherTPriceNotIn(List<Integer> values) {
            addCriterion("voucher_t_price not in", values, "voucherTPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherTPriceBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_price between", value1, value2, "voucherTPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherTPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_price not between", value1, value2, "voucherTPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitIsNull() {
            addCriterion("voucher_t_limit is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitIsNotNull() {
            addCriterion("voucher_t_limit is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitEqualTo(BigDecimal value) {
            addCriterion("voucher_t_limit =", value, "voucherTLimit");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitNotEqualTo(BigDecimal value) {
            addCriterion("voucher_t_limit <>", value, "voucherTLimit");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitGreaterThan(BigDecimal value) {
            addCriterion("voucher_t_limit >", value, "voucherTLimit");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("voucher_t_limit >=", value, "voucherTLimit");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitLessThan(BigDecimal value) {
            addCriterion("voucher_t_limit <", value, "voucherTLimit");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("voucher_t_limit <=", value, "voucherTLimit");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitIn(List<BigDecimal> values) {
            addCriterion("voucher_t_limit in", values, "voucherTLimit");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitNotIn(List<BigDecimal> values) {
            addCriterion("voucher_t_limit not in", values, "voucherTLimit");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("voucher_t_limit between", value1, value2, "voucherTLimit");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("voucher_t_limit not between", value1, value2, "voucherTLimit");
            return (Criteria) this;
        }

        public Criteria andVoucherTStoreIdIsNull() {
            addCriterion("voucher_t_store_id is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTStoreIdIsNotNull() {
            addCriterion("voucher_t_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTStoreIdEqualTo(Integer value) {
            addCriterion("voucher_t_store_id =", value, "voucherTStoreId");
            return (Criteria) this;
        }

        public Criteria andVoucherTStoreIdNotEqualTo(Integer value) {
            addCriterion("voucher_t_store_id <>", value, "voucherTStoreId");
            return (Criteria) this;
        }

        public Criteria andVoucherTStoreIdGreaterThan(Integer value) {
            addCriterion("voucher_t_store_id >", value, "voucherTStoreId");
            return (Criteria) this;
        }

        public Criteria andVoucherTStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_store_id >=", value, "voucherTStoreId");
            return (Criteria) this;
        }

        public Criteria andVoucherTStoreIdLessThan(Integer value) {
            addCriterion("voucher_t_store_id <", value, "voucherTStoreId");
            return (Criteria) this;
        }

        public Criteria andVoucherTStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_store_id <=", value, "voucherTStoreId");
            return (Criteria) this;
        }

        public Criteria andVoucherTStoreIdIn(List<Integer> values) {
            addCriterion("voucher_t_store_id in", values, "voucherTStoreId");
            return (Criteria) this;
        }

        public Criteria andVoucherTStoreIdNotIn(List<Integer> values) {
            addCriterion("voucher_t_store_id not in", values, "voucherTStoreId");
            return (Criteria) this;
        }

        public Criteria andVoucherTStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_store_id between", value1, value2, "voucherTStoreId");
            return (Criteria) this;
        }

        public Criteria andVoucherTStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_store_id not between", value1, value2, "voucherTStoreId");
            return (Criteria) this;
        }

        public Criteria andVoucherTStorenameIsNull() {
            addCriterion("voucher_t_storename is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTStorenameIsNotNull() {
            addCriterion("voucher_t_storename is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTStorenameEqualTo(String value) {
            addCriterion("voucher_t_storename =", value, "voucherTStorename");
            return (Criteria) this;
        }

        public Criteria andVoucherTStorenameNotEqualTo(String value) {
            addCriterion("voucher_t_storename <>", value, "voucherTStorename");
            return (Criteria) this;
        }

        public Criteria andVoucherTStorenameGreaterThan(String value) {
            addCriterion("voucher_t_storename >", value, "voucherTStorename");
            return (Criteria) this;
        }

        public Criteria andVoucherTStorenameGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_t_storename >=", value, "voucherTStorename");
            return (Criteria) this;
        }

        public Criteria andVoucherTStorenameLessThan(String value) {
            addCriterion("voucher_t_storename <", value, "voucherTStorename");
            return (Criteria) this;
        }

        public Criteria andVoucherTStorenameLessThanOrEqualTo(String value) {
            addCriterion("voucher_t_storename <=", value, "voucherTStorename");
            return (Criteria) this;
        }

        public Criteria andVoucherTStorenameLike(String value) {
            addCriterion("voucher_t_storename like", value, "voucherTStorename");
            return (Criteria) this;
        }

        public Criteria andVoucherTStorenameNotLike(String value) {
            addCriterion("voucher_t_storename not like", value, "voucherTStorename");
            return (Criteria) this;
        }

        public Criteria andVoucherTStorenameIn(List<String> values) {
            addCriterion("voucher_t_storename in", values, "voucherTStorename");
            return (Criteria) this;
        }

        public Criteria andVoucherTStorenameNotIn(List<String> values) {
            addCriterion("voucher_t_storename not in", values, "voucherTStorename");
            return (Criteria) this;
        }

        public Criteria andVoucherTStorenameBetween(String value1, String value2) {
            addCriterion("voucher_t_storename between", value1, value2, "voucherTStorename");
            return (Criteria) this;
        }

        public Criteria andVoucherTStorenameNotBetween(String value1, String value2) {
            addCriterion("voucher_t_storename not between", value1, value2, "voucherTStorename");
            return (Criteria) this;
        }

        public Criteria andVoucherTCreatorIdIsNull() {
            addCriterion("voucher_t_creator_id is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTCreatorIdIsNotNull() {
            addCriterion("voucher_t_creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTCreatorIdEqualTo(Integer value) {
            addCriterion("voucher_t_creator_id =", value, "voucherTCreatorId");
            return (Criteria) this;
        }

        public Criteria andVoucherTCreatorIdNotEqualTo(Integer value) {
            addCriterion("voucher_t_creator_id <>", value, "voucherTCreatorId");
            return (Criteria) this;
        }

        public Criteria andVoucherTCreatorIdGreaterThan(Integer value) {
            addCriterion("voucher_t_creator_id >", value, "voucherTCreatorId");
            return (Criteria) this;
        }

        public Criteria andVoucherTCreatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_creator_id >=", value, "voucherTCreatorId");
            return (Criteria) this;
        }

        public Criteria andVoucherTCreatorIdLessThan(Integer value) {
            addCriterion("voucher_t_creator_id <", value, "voucherTCreatorId");
            return (Criteria) this;
        }

        public Criteria andVoucherTCreatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_creator_id <=", value, "voucherTCreatorId");
            return (Criteria) this;
        }

        public Criteria andVoucherTCreatorIdIn(List<Integer> values) {
            addCriterion("voucher_t_creator_id in", values, "voucherTCreatorId");
            return (Criteria) this;
        }

        public Criteria andVoucherTCreatorIdNotIn(List<Integer> values) {
            addCriterion("voucher_t_creator_id not in", values, "voucherTCreatorId");
            return (Criteria) this;
        }

        public Criteria andVoucherTCreatorIdBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_creator_id between", value1, value2, "voucherTCreatorId");
            return (Criteria) this;
        }

        public Criteria andVoucherTCreatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_creator_id not between", value1, value2, "voucherTCreatorId");
            return (Criteria) this;
        }

        public Criteria andVoucherTStateIsNull() {
            addCriterion("voucher_t_state is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTStateIsNotNull() {
            addCriterion("voucher_t_state is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTStateEqualTo(Byte value) {
            addCriterion("voucher_t_state =", value, "voucherTState");
            return (Criteria) this;
        }

        public Criteria andVoucherTStateNotEqualTo(Byte value) {
            addCriterion("voucher_t_state <>", value, "voucherTState");
            return (Criteria) this;
        }

        public Criteria andVoucherTStateGreaterThan(Byte value) {
            addCriterion("voucher_t_state >", value, "voucherTState");
            return (Criteria) this;
        }

        public Criteria andVoucherTStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("voucher_t_state >=", value, "voucherTState");
            return (Criteria) this;
        }

        public Criteria andVoucherTStateLessThan(Byte value) {
            addCriterion("voucher_t_state <", value, "voucherTState");
            return (Criteria) this;
        }

        public Criteria andVoucherTStateLessThanOrEqualTo(Byte value) {
            addCriterion("voucher_t_state <=", value, "voucherTState");
            return (Criteria) this;
        }

        public Criteria andVoucherTStateIn(List<Byte> values) {
            addCriterion("voucher_t_state in", values, "voucherTState");
            return (Criteria) this;
        }

        public Criteria andVoucherTStateNotIn(List<Byte> values) {
            addCriterion("voucher_t_state not in", values, "voucherTState");
            return (Criteria) this;
        }

        public Criteria andVoucherTStateBetween(Byte value1, Byte value2) {
            addCriterion("voucher_t_state between", value1, value2, "voucherTState");
            return (Criteria) this;
        }

        public Criteria andVoucherTStateNotBetween(Byte value1, Byte value2) {
            addCriterion("voucher_t_state not between", value1, value2, "voucherTState");
            return (Criteria) this;
        }

        public Criteria andVoucherTTotalIsNull() {
            addCriterion("voucher_t_total is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTTotalIsNotNull() {
            addCriterion("voucher_t_total is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTTotalEqualTo(Integer value) {
            addCriterion("voucher_t_total =", value, "voucherTTotal");
            return (Criteria) this;
        }

        public Criteria andVoucherTTotalNotEqualTo(Integer value) {
            addCriterion("voucher_t_total <>", value, "voucherTTotal");
            return (Criteria) this;
        }

        public Criteria andVoucherTTotalGreaterThan(Integer value) {
            addCriterion("voucher_t_total >", value, "voucherTTotal");
            return (Criteria) this;
        }

        public Criteria andVoucherTTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_total >=", value, "voucherTTotal");
            return (Criteria) this;
        }

        public Criteria andVoucherTTotalLessThan(Integer value) {
            addCriterion("voucher_t_total <", value, "voucherTTotal");
            return (Criteria) this;
        }

        public Criteria andVoucherTTotalLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_total <=", value, "voucherTTotal");
            return (Criteria) this;
        }

        public Criteria andVoucherTTotalIn(List<Integer> values) {
            addCriterion("voucher_t_total in", values, "voucherTTotal");
            return (Criteria) this;
        }

        public Criteria andVoucherTTotalNotIn(List<Integer> values) {
            addCriterion("voucher_t_total not in", values, "voucherTTotal");
            return (Criteria) this;
        }

        public Criteria andVoucherTTotalBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_total between", value1, value2, "voucherTTotal");
            return (Criteria) this;
        }

        public Criteria andVoucherTTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_total not between", value1, value2, "voucherTTotal");
            return (Criteria) this;
        }

        public Criteria andVoucherTGiveoutIsNull() {
            addCriterion("voucher_t_giveout is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTGiveoutIsNotNull() {
            addCriterion("voucher_t_giveout is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTGiveoutEqualTo(Integer value) {
            addCriterion("voucher_t_giveout =", value, "voucherTGiveout");
            return (Criteria) this;
        }

        public Criteria andVoucherTGiveoutNotEqualTo(Integer value) {
            addCriterion("voucher_t_giveout <>", value, "voucherTGiveout");
            return (Criteria) this;
        }

        public Criteria andVoucherTGiveoutGreaterThan(Integer value) {
            addCriterion("voucher_t_giveout >", value, "voucherTGiveout");
            return (Criteria) this;
        }

        public Criteria andVoucherTGiveoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_giveout >=", value, "voucherTGiveout");
            return (Criteria) this;
        }

        public Criteria andVoucherTGiveoutLessThan(Integer value) {
            addCriterion("voucher_t_giveout <", value, "voucherTGiveout");
            return (Criteria) this;
        }

        public Criteria andVoucherTGiveoutLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_giveout <=", value, "voucherTGiveout");
            return (Criteria) this;
        }

        public Criteria andVoucherTGiveoutIn(List<Integer> values) {
            addCriterion("voucher_t_giveout in", values, "voucherTGiveout");
            return (Criteria) this;
        }

        public Criteria andVoucherTGiveoutNotIn(List<Integer> values) {
            addCriterion("voucher_t_giveout not in", values, "voucherTGiveout");
            return (Criteria) this;
        }

        public Criteria andVoucherTGiveoutBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_giveout between", value1, value2, "voucherTGiveout");
            return (Criteria) this;
        }

        public Criteria andVoucherTGiveoutNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_giveout not between", value1, value2, "voucherTGiveout");
            return (Criteria) this;
        }

        public Criteria andVoucherTUsedIsNull() {
            addCriterion("voucher_t_used is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTUsedIsNotNull() {
            addCriterion("voucher_t_used is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTUsedEqualTo(Integer value) {
            addCriterion("voucher_t_used =", value, "voucherTUsed");
            return (Criteria) this;
        }

        public Criteria andVoucherTUsedNotEqualTo(Integer value) {
            addCriterion("voucher_t_used <>", value, "voucherTUsed");
            return (Criteria) this;
        }

        public Criteria andVoucherTUsedGreaterThan(Integer value) {
            addCriterion("voucher_t_used >", value, "voucherTUsed");
            return (Criteria) this;
        }

        public Criteria andVoucherTUsedGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_used >=", value, "voucherTUsed");
            return (Criteria) this;
        }

        public Criteria andVoucherTUsedLessThan(Integer value) {
            addCriterion("voucher_t_used <", value, "voucherTUsed");
            return (Criteria) this;
        }

        public Criteria andVoucherTUsedLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_used <=", value, "voucherTUsed");
            return (Criteria) this;
        }

        public Criteria andVoucherTUsedIn(List<Integer> values) {
            addCriterion("voucher_t_used in", values, "voucherTUsed");
            return (Criteria) this;
        }

        public Criteria andVoucherTUsedNotIn(List<Integer> values) {
            addCriterion("voucher_t_used not in", values, "voucherTUsed");
            return (Criteria) this;
        }

        public Criteria andVoucherTUsedBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_used between", value1, value2, "voucherTUsed");
            return (Criteria) this;
        }

        public Criteria andVoucherTUsedNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_used not between", value1, value2, "voucherTUsed");
            return (Criteria) this;
        }

        public Criteria andVoucherTAddDateIsNull() {
            addCriterion("voucher_t_add_date is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTAddDateIsNotNull() {
            addCriterion("voucher_t_add_date is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTAddDateEqualTo(Integer value) {
            addCriterion("voucher_t_add_date =", value, "voucherTAddDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTAddDateNotEqualTo(Integer value) {
            addCriterion("voucher_t_add_date <>", value, "voucherTAddDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTAddDateGreaterThan(Integer value) {
            addCriterion("voucher_t_add_date >", value, "voucherTAddDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTAddDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_add_date >=", value, "voucherTAddDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTAddDateLessThan(Integer value) {
            addCriterion("voucher_t_add_date <", value, "voucherTAddDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTAddDateLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_add_date <=", value, "voucherTAddDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTAddDateIn(List<Integer> values) {
            addCriterion("voucher_t_add_date in", values, "voucherTAddDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTAddDateNotIn(List<Integer> values) {
            addCriterion("voucher_t_add_date not in", values, "voucherTAddDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTAddDateBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_add_date between", value1, value2, "voucherTAddDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTAddDateNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_add_date not between", value1, value2, "voucherTAddDate");
            return (Criteria) this;
        }

        public Criteria andVoucherTQuotaidIsNull() {
            addCriterion("voucher_t_quotaid is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTQuotaidIsNotNull() {
            addCriterion("voucher_t_quotaid is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTQuotaidEqualTo(Integer value) {
            addCriterion("voucher_t_quotaid =", value, "voucherTQuotaid");
            return (Criteria) this;
        }

        public Criteria andVoucherTQuotaidNotEqualTo(Integer value) {
            addCriterion("voucher_t_quotaid <>", value, "voucherTQuotaid");
            return (Criteria) this;
        }

        public Criteria andVoucherTQuotaidGreaterThan(Integer value) {
            addCriterion("voucher_t_quotaid >", value, "voucherTQuotaid");
            return (Criteria) this;
        }

        public Criteria andVoucherTQuotaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_quotaid >=", value, "voucherTQuotaid");
            return (Criteria) this;
        }

        public Criteria andVoucherTQuotaidLessThan(Integer value) {
            addCriterion("voucher_t_quotaid <", value, "voucherTQuotaid");
            return (Criteria) this;
        }

        public Criteria andVoucherTQuotaidLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_quotaid <=", value, "voucherTQuotaid");
            return (Criteria) this;
        }

        public Criteria andVoucherTQuotaidIn(List<Integer> values) {
            addCriterion("voucher_t_quotaid in", values, "voucherTQuotaid");
            return (Criteria) this;
        }

        public Criteria andVoucherTQuotaidNotIn(List<Integer> values) {
            addCriterion("voucher_t_quotaid not in", values, "voucherTQuotaid");
            return (Criteria) this;
        }

        public Criteria andVoucherTQuotaidBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_quotaid between", value1, value2, "voucherTQuotaid");
            return (Criteria) this;
        }

        public Criteria andVoucherTQuotaidNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_quotaid not between", value1, value2, "voucherTQuotaid");
            return (Criteria) this;
        }

        public Criteria andVoucherTPointsIsNull() {
            addCriterion("voucher_t_points is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTPointsIsNotNull() {
            addCriterion("voucher_t_points is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTPointsEqualTo(Integer value) {
            addCriterion("voucher_t_points =", value, "voucherTPoints");
            return (Criteria) this;
        }

        public Criteria andVoucherTPointsNotEqualTo(Integer value) {
            addCriterion("voucher_t_points <>", value, "voucherTPoints");
            return (Criteria) this;
        }

        public Criteria andVoucherTPointsGreaterThan(Integer value) {
            addCriterion("voucher_t_points >", value, "voucherTPoints");
            return (Criteria) this;
        }

        public Criteria andVoucherTPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_points >=", value, "voucherTPoints");
            return (Criteria) this;
        }

        public Criteria andVoucherTPointsLessThan(Integer value) {
            addCriterion("voucher_t_points <", value, "voucherTPoints");
            return (Criteria) this;
        }

        public Criteria andVoucherTPointsLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_points <=", value, "voucherTPoints");
            return (Criteria) this;
        }

        public Criteria andVoucherTPointsIn(List<Integer> values) {
            addCriterion("voucher_t_points in", values, "voucherTPoints");
            return (Criteria) this;
        }

        public Criteria andVoucherTPointsNotIn(List<Integer> values) {
            addCriterion("voucher_t_points not in", values, "voucherTPoints");
            return (Criteria) this;
        }

        public Criteria andVoucherTPointsBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_points between", value1, value2, "voucherTPoints");
            return (Criteria) this;
        }

        public Criteria andVoucherTPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_points not between", value1, value2, "voucherTPoints");
            return (Criteria) this;
        }

        public Criteria andVoucherTGoodsTypeIsNull() {
            addCriterion("voucher_t_goods_type is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTGoodsTypeIsNotNull() {
            addCriterion("voucher_t_goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTGoodsTypeEqualTo(Byte value) {
            addCriterion("voucher_t_goods_type =", value, "voucherTGoodsType");
            return (Criteria) this;
        }

        public Criteria andVoucherTGoodsTypeNotEqualTo(Byte value) {
            addCriterion("voucher_t_goods_type <>", value, "voucherTGoodsType");
            return (Criteria) this;
        }

        public Criteria andVoucherTGoodsTypeGreaterThan(Byte value) {
            addCriterion("voucher_t_goods_type >", value, "voucherTGoodsType");
            return (Criteria) this;
        }

        public Criteria andVoucherTGoodsTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("voucher_t_goods_type >=", value, "voucherTGoodsType");
            return (Criteria) this;
        }

        public Criteria andVoucherTGoodsTypeLessThan(Byte value) {
            addCriterion("voucher_t_goods_type <", value, "voucherTGoodsType");
            return (Criteria) this;
        }

        public Criteria andVoucherTGoodsTypeLessThanOrEqualTo(Byte value) {
            addCriterion("voucher_t_goods_type <=", value, "voucherTGoodsType");
            return (Criteria) this;
        }

        public Criteria andVoucherTGoodsTypeIn(List<Byte> values) {
            addCriterion("voucher_t_goods_type in", values, "voucherTGoodsType");
            return (Criteria) this;
        }

        public Criteria andVoucherTGoodsTypeNotIn(List<Byte> values) {
            addCriterion("voucher_t_goods_type not in", values, "voucherTGoodsType");
            return (Criteria) this;
        }

        public Criteria andVoucherTGoodsTypeBetween(Byte value1, Byte value2) {
            addCriterion("voucher_t_goods_type between", value1, value2, "voucherTGoodsType");
            return (Criteria) this;
        }

        public Criteria andVoucherTGoodsTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("voucher_t_goods_type not between", value1, value2, "voucherTGoodsType");
            return (Criteria) this;
        }

        public Criteria andVoucherTEachlimitIsNull() {
            addCriterion("voucher_t_eachlimit is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTEachlimitIsNotNull() {
            addCriterion("voucher_t_eachlimit is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTEachlimitEqualTo(Integer value) {
            addCriterion("voucher_t_eachlimit =", value, "voucherTEachlimit");
            return (Criteria) this;
        }

        public Criteria andVoucherTEachlimitNotEqualTo(Integer value) {
            addCriterion("voucher_t_eachlimit <>", value, "voucherTEachlimit");
            return (Criteria) this;
        }

        public Criteria andVoucherTEachlimitGreaterThan(Integer value) {
            addCriterion("voucher_t_eachlimit >", value, "voucherTEachlimit");
            return (Criteria) this;
        }

        public Criteria andVoucherTEachlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_eachlimit >=", value, "voucherTEachlimit");
            return (Criteria) this;
        }

        public Criteria andVoucherTEachlimitLessThan(Integer value) {
            addCriterion("voucher_t_eachlimit <", value, "voucherTEachlimit");
            return (Criteria) this;
        }

        public Criteria andVoucherTEachlimitLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_eachlimit <=", value, "voucherTEachlimit");
            return (Criteria) this;
        }

        public Criteria andVoucherTEachlimitIn(List<Integer> values) {
            addCriterion("voucher_t_eachlimit in", values, "voucherTEachlimit");
            return (Criteria) this;
        }

        public Criteria andVoucherTEachlimitNotIn(List<Integer> values) {
            addCriterion("voucher_t_eachlimit not in", values, "voucherTEachlimit");
            return (Criteria) this;
        }

        public Criteria andVoucherTEachlimitBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_eachlimit between", value1, value2, "voucherTEachlimit");
            return (Criteria) this;
        }

        public Criteria andVoucherTEachlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_eachlimit not between", value1, value2, "voucherTEachlimit");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitTypeIsNull() {
            addCriterion("voucher_t_limit_type is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitTypeIsNotNull() {
            addCriterion("voucher_t_limit_type is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitTypeEqualTo(Byte value) {
            addCriterion("voucher_t_limit_type =", value, "voucherTLimitType");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitTypeNotEqualTo(Byte value) {
            addCriterion("voucher_t_limit_type <>", value, "voucherTLimitType");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitTypeGreaterThan(Byte value) {
            addCriterion("voucher_t_limit_type >", value, "voucherTLimitType");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("voucher_t_limit_type >=", value, "voucherTLimitType");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitTypeLessThan(Byte value) {
            addCriterion("voucher_t_limit_type <", value, "voucherTLimitType");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitTypeLessThanOrEqualTo(Byte value) {
            addCriterion("voucher_t_limit_type <=", value, "voucherTLimitType");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitTypeIn(List<Byte> values) {
            addCriterion("voucher_t_limit_type in", values, "voucherTLimitType");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitTypeNotIn(List<Byte> values) {
            addCriterion("voucher_t_limit_type not in", values, "voucherTLimitType");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitTypeBetween(Byte value1, Byte value2) {
            addCriterion("voucher_t_limit_type between", value1, value2, "voucherTLimitType");
            return (Criteria) this;
        }

        public Criteria andVoucherTLimitTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("voucher_t_limit_type not between", value1, value2, "voucherTLimitType");
            return (Criteria) this;
        }

        public Criteria andVoucherTStyleimgIsNull() {
            addCriterion("voucher_t_styleimg is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTStyleimgIsNotNull() {
            addCriterion("voucher_t_styleimg is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTStyleimgEqualTo(String value) {
            addCriterion("voucher_t_styleimg =", value, "voucherTStyleimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTStyleimgNotEqualTo(String value) {
            addCriterion("voucher_t_styleimg <>", value, "voucherTStyleimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTStyleimgGreaterThan(String value) {
            addCriterion("voucher_t_styleimg >", value, "voucherTStyleimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTStyleimgGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_t_styleimg >=", value, "voucherTStyleimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTStyleimgLessThan(String value) {
            addCriterion("voucher_t_styleimg <", value, "voucherTStyleimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTStyleimgLessThanOrEqualTo(String value) {
            addCriterion("voucher_t_styleimg <=", value, "voucherTStyleimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTStyleimgLike(String value) {
            addCriterion("voucher_t_styleimg like", value, "voucherTStyleimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTStyleimgNotLike(String value) {
            addCriterion("voucher_t_styleimg not like", value, "voucherTStyleimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTStyleimgIn(List<String> values) {
            addCriterion("voucher_t_styleimg in", values, "voucherTStyleimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTStyleimgNotIn(List<String> values) {
            addCriterion("voucher_t_styleimg not in", values, "voucherTStyleimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTStyleimgBetween(String value1, String value2) {
            addCriterion("voucher_t_styleimg between", value1, value2, "voucherTStyleimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTStyleimgNotBetween(String value1, String value2) {
            addCriterion("voucher_t_styleimg not between", value1, value2, "voucherTStyleimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTCustomimgIsNull() {
            addCriterion("voucher_t_customimg is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTCustomimgIsNotNull() {
            addCriterion("voucher_t_customimg is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTCustomimgEqualTo(String value) {
            addCriterion("voucher_t_customimg =", value, "voucherTCustomimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTCustomimgNotEqualTo(String value) {
            addCriterion("voucher_t_customimg <>", value, "voucherTCustomimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTCustomimgGreaterThan(String value) {
            addCriterion("voucher_t_customimg >", value, "voucherTCustomimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTCustomimgGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_t_customimg >=", value, "voucherTCustomimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTCustomimgLessThan(String value) {
            addCriterion("voucher_t_customimg <", value, "voucherTCustomimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTCustomimgLessThanOrEqualTo(String value) {
            addCriterion("voucher_t_customimg <=", value, "voucherTCustomimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTCustomimgLike(String value) {
            addCriterion("voucher_t_customimg like", value, "voucherTCustomimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTCustomimgNotLike(String value) {
            addCriterion("voucher_t_customimg not like", value, "voucherTCustomimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTCustomimgIn(List<String> values) {
            addCriterion("voucher_t_customimg in", values, "voucherTCustomimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTCustomimgNotIn(List<String> values) {
            addCriterion("voucher_t_customimg not in", values, "voucherTCustomimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTCustomimgBetween(String value1, String value2) {
            addCriterion("voucher_t_customimg between", value1, value2, "voucherTCustomimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTCustomimgNotBetween(String value1, String value2) {
            addCriterion("voucher_t_customimg not between", value1, value2, "voucherTCustomimg");
            return (Criteria) this;
        }

        public Criteria andVoucherTCostModeIsNull() {
            addCriterion("voucher_t_cost_mode is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTCostModeIsNotNull() {
            addCriterion("voucher_t_cost_mode is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTCostModeEqualTo(Byte value) {
            addCriterion("voucher_t_cost_mode =", value, "voucherTCostMode");
            return (Criteria) this;
        }

        public Criteria andVoucherTCostModeNotEqualTo(Byte value) {
            addCriterion("voucher_t_cost_mode <>", value, "voucherTCostMode");
            return (Criteria) this;
        }

        public Criteria andVoucherTCostModeGreaterThan(Byte value) {
            addCriterion("voucher_t_cost_mode >", value, "voucherTCostMode");
            return (Criteria) this;
        }

        public Criteria andVoucherTCostModeGreaterThanOrEqualTo(Byte value) {
            addCriterion("voucher_t_cost_mode >=", value, "voucherTCostMode");
            return (Criteria) this;
        }

        public Criteria andVoucherTCostModeLessThan(Byte value) {
            addCriterion("voucher_t_cost_mode <", value, "voucherTCostMode");
            return (Criteria) this;
        }

        public Criteria andVoucherTCostModeLessThanOrEqualTo(Byte value) {
            addCriterion("voucher_t_cost_mode <=", value, "voucherTCostMode");
            return (Criteria) this;
        }

        public Criteria andVoucherTCostModeIn(List<Byte> values) {
            addCriterion("voucher_t_cost_mode in", values, "voucherTCostMode");
            return (Criteria) this;
        }

        public Criteria andVoucherTCostModeNotIn(List<Byte> values) {
            addCriterion("voucher_t_cost_mode not in", values, "voucherTCostMode");
            return (Criteria) this;
        }

        public Criteria andVoucherTCostModeBetween(Byte value1, Byte value2) {
            addCriterion("voucher_t_cost_mode between", value1, value2, "voucherTCostMode");
            return (Criteria) this;
        }

        public Criteria andVoucherTCostModeNotBetween(Byte value1, Byte value2) {
            addCriterion("voucher_t_cost_mode not between", value1, value2, "voucherTCostMode");
            return (Criteria) this;
        }

        public Criteria andVoucherTActivityIdIsNull() {
            addCriterion("voucher_t_activity_id is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTActivityIdIsNotNull() {
            addCriterion("voucher_t_activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTActivityIdEqualTo(Integer value) {
            addCriterion("voucher_t_activity_id =", value, "voucherTActivityId");
            return (Criteria) this;
        }

        public Criteria andVoucherTActivityIdNotEqualTo(Integer value) {
            addCriterion("voucher_t_activity_id <>", value, "voucherTActivityId");
            return (Criteria) this;
        }

        public Criteria andVoucherTActivityIdGreaterThan(Integer value) {
            addCriterion("voucher_t_activity_id >", value, "voucherTActivityId");
            return (Criteria) this;
        }

        public Criteria andVoucherTActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_activity_id >=", value, "voucherTActivityId");
            return (Criteria) this;
        }

        public Criteria andVoucherTActivityIdLessThan(Integer value) {
            addCriterion("voucher_t_activity_id <", value, "voucherTActivityId");
            return (Criteria) this;
        }

        public Criteria andVoucherTActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_t_activity_id <=", value, "voucherTActivityId");
            return (Criteria) this;
        }

        public Criteria andVoucherTActivityIdIn(List<Integer> values) {
            addCriterion("voucher_t_activity_id in", values, "voucherTActivityId");
            return (Criteria) this;
        }

        public Criteria andVoucherTActivityIdNotIn(List<Integer> values) {
            addCriterion("voucher_t_activity_id not in", values, "voucherTActivityId");
            return (Criteria) this;
        }

        public Criteria andVoucherTActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_activity_id between", value1, value2, "voucherTActivityId");
            return (Criteria) this;
        }

        public Criteria andVoucherTActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_t_activity_id not between", value1, value2, "voucherTActivityId");
            return (Criteria) this;
        }

        public Criteria andVoucherTShowStateIsNull() {
            addCriterion("voucher_t_show_state is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTShowStateIsNotNull() {
            addCriterion("voucher_t_show_state is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTShowStateEqualTo(Byte value) {
            addCriterion("voucher_t_show_state =", value, "voucherTShowState");
            return (Criteria) this;
        }

        public Criteria andVoucherTShowStateNotEqualTo(Byte value) {
            addCriterion("voucher_t_show_state <>", value, "voucherTShowState");
            return (Criteria) this;
        }

        public Criteria andVoucherTShowStateGreaterThan(Byte value) {
            addCriterion("voucher_t_show_state >", value, "voucherTShowState");
            return (Criteria) this;
        }

        public Criteria andVoucherTShowStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("voucher_t_show_state >=", value, "voucherTShowState");
            return (Criteria) this;
        }

        public Criteria andVoucherTShowStateLessThan(Byte value) {
            addCriterion("voucher_t_show_state <", value, "voucherTShowState");
            return (Criteria) this;
        }

        public Criteria andVoucherTShowStateLessThanOrEqualTo(Byte value) {
            addCriterion("voucher_t_show_state <=", value, "voucherTShowState");
            return (Criteria) this;
        }

        public Criteria andVoucherTShowStateIn(List<Byte> values) {
            addCriterion("voucher_t_show_state in", values, "voucherTShowState");
            return (Criteria) this;
        }

        public Criteria andVoucherTShowStateNotIn(List<Byte> values) {
            addCriterion("voucher_t_show_state not in", values, "voucherTShowState");
            return (Criteria) this;
        }

        public Criteria andVoucherTShowStateBetween(Byte value1, Byte value2) {
            addCriterion("voucher_t_show_state between", value1, value2, "voucherTShowState");
            return (Criteria) this;
        }

        public Criteria andVoucherTShowStateNotBetween(Byte value1, Byte value2) {
            addCriterion("voucher_t_show_state not between", value1, value2, "voucherTShowState");
            return (Criteria) this;
        }

        public Criteria andVoucherTJumpUrlIsNull() {
            addCriterion("voucher_t_jump_url is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTJumpUrlIsNotNull() {
            addCriterion("voucher_t_jump_url is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTJumpUrlEqualTo(String value) {
            addCriterion("voucher_t_jump_url =", value, "voucherTJumpUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherTJumpUrlNotEqualTo(String value) {
            addCriterion("voucher_t_jump_url <>", value, "voucherTJumpUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherTJumpUrlGreaterThan(String value) {
            addCriterion("voucher_t_jump_url >", value, "voucherTJumpUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherTJumpUrlGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_t_jump_url >=", value, "voucherTJumpUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherTJumpUrlLessThan(String value) {
            addCriterion("voucher_t_jump_url <", value, "voucherTJumpUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherTJumpUrlLessThanOrEqualTo(String value) {
            addCriterion("voucher_t_jump_url <=", value, "voucherTJumpUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherTJumpUrlLike(String value) {
            addCriterion("voucher_t_jump_url like", value, "voucherTJumpUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherTJumpUrlNotLike(String value) {
            addCriterion("voucher_t_jump_url not like", value, "voucherTJumpUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherTJumpUrlIn(List<String> values) {
            addCriterion("voucher_t_jump_url in", values, "voucherTJumpUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherTJumpUrlNotIn(List<String> values) {
            addCriterion("voucher_t_jump_url not in", values, "voucherTJumpUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherTJumpUrlBetween(String value1, String value2) {
            addCriterion("voucher_t_jump_url between", value1, value2, "voucherTJumpUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherTJumpUrlNotBetween(String value1, String value2) {
            addCriterion("voucher_t_jump_url not between", value1, value2, "voucherTJumpUrl");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_voucher_template表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2017-10-17
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_voucher_template 2017-10-17
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