package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UnionBuyerStatisticsExample {
    /**
     * union_buyer_statistics
     */
    protected String orderByClause;

    /**
     * union_buyer_statistics
     */
    protected boolean distinct;

    /**
     * union_buyer_statistics
     */
    protected List<Criteria> oredCriteria;

    public UnionBuyerStatisticsExample() {
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
     * union_buyer_statistics 2018-01-16
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDacsOrderNumIsNull() {
            addCriterion("dacs_order_num is null");
            return (Criteria) this;
        }

        public Criteria andDacsOrderNumIsNotNull() {
            addCriterion("dacs_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andDacsOrderNumEqualTo(Integer value) {
            addCriterion("dacs_order_num =", value, "dacsOrderNum");
            return (Criteria) this;
        }

        public Criteria andDacsOrderNumNotEqualTo(Integer value) {
            addCriterion("dacs_order_num <>", value, "dacsOrderNum");
            return (Criteria) this;
        }

        public Criteria andDacsOrderNumGreaterThan(Integer value) {
            addCriterion("dacs_order_num >", value, "dacsOrderNum");
            return (Criteria) this;
        }

        public Criteria andDacsOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dacs_order_num >=", value, "dacsOrderNum");
            return (Criteria) this;
        }

        public Criteria andDacsOrderNumLessThan(Integer value) {
            addCriterion("dacs_order_num <", value, "dacsOrderNum");
            return (Criteria) this;
        }

        public Criteria andDacsOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("dacs_order_num <=", value, "dacsOrderNum");
            return (Criteria) this;
        }

        public Criteria andDacsOrderNumIn(List<Integer> values) {
            addCriterion("dacs_order_num in", values, "dacsOrderNum");
            return (Criteria) this;
        }

        public Criteria andDacsOrderNumNotIn(List<Integer> values) {
            addCriterion("dacs_order_num not in", values, "dacsOrderNum");
            return (Criteria) this;
        }

        public Criteria andDacsOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("dacs_order_num between", value1, value2, "dacsOrderNum");
            return (Criteria) this;
        }

        public Criteria andDacsOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("dacs_order_num not between", value1, value2, "dacsOrderNum");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsNumIsNull() {
            addCriterion("dacs_goods_num is null");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsNumIsNotNull() {
            addCriterion("dacs_goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsNumEqualTo(Integer value) {
            addCriterion("dacs_goods_num =", value, "dacsGoodsNum");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsNumNotEqualTo(Integer value) {
            addCriterion("dacs_goods_num <>", value, "dacsGoodsNum");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsNumGreaterThan(Integer value) {
            addCriterion("dacs_goods_num >", value, "dacsGoodsNum");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dacs_goods_num >=", value, "dacsGoodsNum");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsNumLessThan(Integer value) {
            addCriterion("dacs_goods_num <", value, "dacsGoodsNum");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("dacs_goods_num <=", value, "dacsGoodsNum");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsNumIn(List<Integer> values) {
            addCriterion("dacs_goods_num in", values, "dacsGoodsNum");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsNumNotIn(List<Integer> values) {
            addCriterion("dacs_goods_num not in", values, "dacsGoodsNum");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("dacs_goods_num between", value1, value2, "dacsGoodsNum");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("dacs_goods_num not between", value1, value2, "dacsGoodsNum");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsAmountIsNull() {
            addCriterion("dacs_goods_amount is null");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsAmountIsNotNull() {
            addCriterion("dacs_goods_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsAmountEqualTo(BigDecimal value) {
            addCriterion("dacs_goods_amount =", value, "dacsGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsAmountNotEqualTo(BigDecimal value) {
            addCriterion("dacs_goods_amount <>", value, "dacsGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsAmountGreaterThan(BigDecimal value) {
            addCriterion("dacs_goods_amount >", value, "dacsGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dacs_goods_amount >=", value, "dacsGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsAmountLessThan(BigDecimal value) {
            addCriterion("dacs_goods_amount <", value, "dacsGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dacs_goods_amount <=", value, "dacsGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsAmountIn(List<BigDecimal> values) {
            addCriterion("dacs_goods_amount in", values, "dacsGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsAmountNotIn(List<BigDecimal> values) {
            addCriterion("dacs_goods_amount not in", values, "dacsGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dacs_goods_amount between", value1, value2, "dacsGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andDacsGoodsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dacs_goods_amount not between", value1, value2, "dacsGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andDacsHelpPriceIsNull() {
            addCriterion("dacs_help_price is null");
            return (Criteria) this;
        }

        public Criteria andDacsHelpPriceIsNotNull() {
            addCriterion("dacs_help_price is not null");
            return (Criteria) this;
        }

        public Criteria andDacsHelpPriceEqualTo(BigDecimal value) {
            addCriterion("dacs_help_price =", value, "dacsHelpPrice");
            return (Criteria) this;
        }

        public Criteria andDacsHelpPriceNotEqualTo(BigDecimal value) {
            addCriterion("dacs_help_price <>", value, "dacsHelpPrice");
            return (Criteria) this;
        }

        public Criteria andDacsHelpPriceGreaterThan(BigDecimal value) {
            addCriterion("dacs_help_price >", value, "dacsHelpPrice");
            return (Criteria) this;
        }

        public Criteria andDacsHelpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dacs_help_price >=", value, "dacsHelpPrice");
            return (Criteria) this;
        }

        public Criteria andDacsHelpPriceLessThan(BigDecimal value) {
            addCriterion("dacs_help_price <", value, "dacsHelpPrice");
            return (Criteria) this;
        }

        public Criteria andDacsHelpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dacs_help_price <=", value, "dacsHelpPrice");
            return (Criteria) this;
        }

        public Criteria andDacsHelpPriceIn(List<BigDecimal> values) {
            addCriterion("dacs_help_price in", values, "dacsHelpPrice");
            return (Criteria) this;
        }

        public Criteria andDacsHelpPriceNotIn(List<BigDecimal> values) {
            addCriterion("dacs_help_price not in", values, "dacsHelpPrice");
            return (Criteria) this;
        }

        public Criteria andDacsHelpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dacs_help_price between", value1, value2, "dacsHelpPrice");
            return (Criteria) this;
        }

        public Criteria andDacsHelpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dacs_help_price not between", value1, value2, "dacsHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOrderNumIsNull() {
            addCriterion("syzx_order_num is null");
            return (Criteria) this;
        }

        public Criteria andSyzxOrderNumIsNotNull() {
            addCriterion("syzx_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andSyzxOrderNumEqualTo(Integer value) {
            addCriterion("syzx_order_num =", value, "syzxOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOrderNumNotEqualTo(Integer value) {
            addCriterion("syzx_order_num <>", value, "syzxOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOrderNumGreaterThan(Integer value) {
            addCriterion("syzx_order_num >", value, "syzxOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("syzx_order_num >=", value, "syzxOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOrderNumLessThan(Integer value) {
            addCriterion("syzx_order_num <", value, "syzxOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("syzx_order_num <=", value, "syzxOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOrderNumIn(List<Integer> values) {
            addCriterion("syzx_order_num in", values, "syzxOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOrderNumNotIn(List<Integer> values) {
            addCriterion("syzx_order_num not in", values, "syzxOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("syzx_order_num between", value1, value2, "syzxOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("syzx_order_num not between", value1, value2, "syzxOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsNumIsNull() {
            addCriterion("syzx_goods_num is null");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsNumIsNotNull() {
            addCriterion("syzx_goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsNumEqualTo(Integer value) {
            addCriterion("syzx_goods_num =", value, "syzxGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsNumNotEqualTo(Integer value) {
            addCriterion("syzx_goods_num <>", value, "syzxGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsNumGreaterThan(Integer value) {
            addCriterion("syzx_goods_num >", value, "syzxGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("syzx_goods_num >=", value, "syzxGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsNumLessThan(Integer value) {
            addCriterion("syzx_goods_num <", value, "syzxGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("syzx_goods_num <=", value, "syzxGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsNumIn(List<Integer> values) {
            addCriterion("syzx_goods_num in", values, "syzxGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsNumNotIn(List<Integer> values) {
            addCriterion("syzx_goods_num not in", values, "syzxGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("syzx_goods_num between", value1, value2, "syzxGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("syzx_goods_num not between", value1, value2, "syzxGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsAmountIsNull() {
            addCriterion("syzx_goods_amount is null");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsAmountIsNotNull() {
            addCriterion("syzx_goods_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsAmountEqualTo(BigDecimal value) {
            addCriterion("syzx_goods_amount =", value, "syzxGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsAmountNotEqualTo(BigDecimal value) {
            addCriterion("syzx_goods_amount <>", value, "syzxGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsAmountGreaterThan(BigDecimal value) {
            addCriterion("syzx_goods_amount >", value, "syzxGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("syzx_goods_amount >=", value, "syzxGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsAmountLessThan(BigDecimal value) {
            addCriterion("syzx_goods_amount <", value, "syzxGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("syzx_goods_amount <=", value, "syzxGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsAmountIn(List<BigDecimal> values) {
            addCriterion("syzx_goods_amount in", values, "syzxGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsAmountNotIn(List<BigDecimal> values) {
            addCriterion("syzx_goods_amount not in", values, "syzxGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("syzx_goods_amount between", value1, value2, "syzxGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxGoodsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("syzx_goods_amount not between", value1, value2, "syzxGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxHelpPriceIsNull() {
            addCriterion("syzx_help_price is null");
            return (Criteria) this;
        }

        public Criteria andSyzxHelpPriceIsNotNull() {
            addCriterion("syzx_help_price is not null");
            return (Criteria) this;
        }

        public Criteria andSyzxHelpPriceEqualTo(BigDecimal value) {
            addCriterion("syzx_help_price =", value, "syzxHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxHelpPriceNotEqualTo(BigDecimal value) {
            addCriterion("syzx_help_price <>", value, "syzxHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxHelpPriceGreaterThan(BigDecimal value) {
            addCriterion("syzx_help_price >", value, "syzxHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxHelpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("syzx_help_price >=", value, "syzxHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxHelpPriceLessThan(BigDecimal value) {
            addCriterion("syzx_help_price <", value, "syzxHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxHelpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("syzx_help_price <=", value, "syzxHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxHelpPriceIn(List<BigDecimal> values) {
            addCriterion("syzx_help_price in", values, "syzxHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxHelpPriceNotIn(List<BigDecimal> values) {
            addCriterion("syzx_help_price not in", values, "syzxHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxHelpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("syzx_help_price between", value1, value2, "syzxHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxHelpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("syzx_help_price not between", value1, value2, "syzxHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyscOrderNumIsNull() {
            addCriterion("sysc_order_num is null");
            return (Criteria) this;
        }

        public Criteria andSyscOrderNumIsNotNull() {
            addCriterion("sysc_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andSyscOrderNumEqualTo(Integer value) {
            addCriterion("sysc_order_num =", value, "syscOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyscOrderNumNotEqualTo(Integer value) {
            addCriterion("sysc_order_num <>", value, "syscOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyscOrderNumGreaterThan(Integer value) {
            addCriterion("sysc_order_num >", value, "syscOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyscOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysc_order_num >=", value, "syscOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyscOrderNumLessThan(Integer value) {
            addCriterion("sysc_order_num <", value, "syscOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyscOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("sysc_order_num <=", value, "syscOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyscOrderNumIn(List<Integer> values) {
            addCriterion("sysc_order_num in", values, "syscOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyscOrderNumNotIn(List<Integer> values) {
            addCriterion("sysc_order_num not in", values, "syscOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyscOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("sysc_order_num between", value1, value2, "syscOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyscOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sysc_order_num not between", value1, value2, "syscOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsNumIsNull() {
            addCriterion("sysc_goods_num is null");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsNumIsNotNull() {
            addCriterion("sysc_goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsNumEqualTo(Integer value) {
            addCriterion("sysc_goods_num =", value, "syscGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsNumNotEqualTo(Integer value) {
            addCriterion("sysc_goods_num <>", value, "syscGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsNumGreaterThan(Integer value) {
            addCriterion("sysc_goods_num >", value, "syscGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysc_goods_num >=", value, "syscGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsNumLessThan(Integer value) {
            addCriterion("sysc_goods_num <", value, "syscGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("sysc_goods_num <=", value, "syscGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsNumIn(List<Integer> values) {
            addCriterion("sysc_goods_num in", values, "syscGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsNumNotIn(List<Integer> values) {
            addCriterion("sysc_goods_num not in", values, "syscGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("sysc_goods_num between", value1, value2, "syscGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sysc_goods_num not between", value1, value2, "syscGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsAmountIsNull() {
            addCriterion("sysc_goods_amount is null");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsAmountIsNotNull() {
            addCriterion("sysc_goods_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsAmountEqualTo(BigDecimal value) {
            addCriterion("sysc_goods_amount =", value, "syscGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsAmountNotEqualTo(BigDecimal value) {
            addCriterion("sysc_goods_amount <>", value, "syscGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsAmountGreaterThan(BigDecimal value) {
            addCriterion("sysc_goods_amount >", value, "syscGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sysc_goods_amount >=", value, "syscGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsAmountLessThan(BigDecimal value) {
            addCriterion("sysc_goods_amount <", value, "syscGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sysc_goods_amount <=", value, "syscGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsAmountIn(List<BigDecimal> values) {
            addCriterion("sysc_goods_amount in", values, "syscGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsAmountNotIn(List<BigDecimal> values) {
            addCriterion("sysc_goods_amount not in", values, "syscGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sysc_goods_amount between", value1, value2, "syscGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSyscGoodsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sysc_goods_amount not between", value1, value2, "syscGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSyscHelpPriceIsNull() {
            addCriterion("sysc_help_price is null");
            return (Criteria) this;
        }

        public Criteria andSyscHelpPriceIsNotNull() {
            addCriterion("sysc_help_price is not null");
            return (Criteria) this;
        }

        public Criteria andSyscHelpPriceEqualTo(BigDecimal value) {
            addCriterion("sysc_help_price =", value, "syscHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyscHelpPriceNotEqualTo(BigDecimal value) {
            addCriterion("sysc_help_price <>", value, "syscHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyscHelpPriceGreaterThan(BigDecimal value) {
            addCriterion("sysc_help_price >", value, "syscHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyscHelpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sysc_help_price >=", value, "syscHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyscHelpPriceLessThan(BigDecimal value) {
            addCriterion("sysc_help_price <", value, "syscHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyscHelpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sysc_help_price <=", value, "syscHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyscHelpPriceIn(List<BigDecimal> values) {
            addCriterion("sysc_help_price in", values, "syscHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyscHelpPriceNotIn(List<BigDecimal> values) {
            addCriterion("sysc_help_price not in", values, "syscHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyscHelpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sysc_help_price between", value1, value2, "syscHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyscHelpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sysc_help_price not between", value1, value2, "syscHelpPrice");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNull() {
            addCriterion("c_time is null");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNotNull() {
            addCriterion("c_time is not null");
            return (Criteria) this;
        }

        public Criteria andCTimeEqualTo(Integer value) {
            addCriterion("c_time =", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotEqualTo(Integer value) {
            addCriterion("c_time <>", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThan(Integer value) {
            addCriterion("c_time >", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_time >=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThan(Integer value) {
            addCriterion("c_time <", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThanOrEqualTo(Integer value) {
            addCriterion("c_time <=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeIn(List<Integer> values) {
            addCriterion("c_time in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotIn(List<Integer> values) {
            addCriterion("c_time not in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeBetween(Integer value1, Integer value2) {
            addCriterion("c_time between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("c_time not between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNull() {
            addCriterion("union_id is null");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNotNull() {
            addCriterion("union_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnionIdEqualTo(Integer value) {
            addCriterion("union_id =", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotEqualTo(Integer value) {
            addCriterion("union_id <>", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThan(Integer value) {
            addCriterion("union_id >", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("union_id >=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThan(Integer value) {
            addCriterion("union_id <", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThanOrEqualTo(Integer value) {
            addCriterion("union_id <=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIn(List<Integer> values) {
            addCriterion("union_id in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotIn(List<Integer> values) {
            addCriterion("union_id not in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdBetween(Integer value1, Integer value2) {
            addCriterion("union_id between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("union_id not between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionNameIsNull() {
            addCriterion("union_name is null");
            return (Criteria) this;
        }

        public Criteria andUnionNameIsNotNull() {
            addCriterion("union_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnionNameEqualTo(String value) {
            addCriterion("union_name =", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameNotEqualTo(String value) {
            addCriterion("union_name <>", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameGreaterThan(String value) {
            addCriterion("union_name >", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameGreaterThanOrEqualTo(String value) {
            addCriterion("union_name >=", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameLessThan(String value) {
            addCriterion("union_name <", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameLessThanOrEqualTo(String value) {
            addCriterion("union_name <=", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameLike(String value) {
            addCriterion("union_name like", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameNotLike(String value) {
            addCriterion("union_name not like", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameIn(List<String> values) {
            addCriterion("union_name in", values, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameNotIn(List<String> values) {
            addCriterion("union_name not in", values, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameBetween(String value1, String value2) {
            addCriterion("union_name between", value1, value2, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameNotBetween(String value1, String value2) {
            addCriterion("union_name not between", value1, value2, "unionName");
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
     * 描述:union_buyer_statistics表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2018-01-16
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * union_buyer_statistics 2018-01-16
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