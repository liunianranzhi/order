package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UnionSaleStatisticsExample {
    /**
     * union_sale_statistics
     */
    protected String orderByClause;

    /**
     * union_sale_statistics
     */
    protected boolean distinct;

    /**
     * union_sale_statistics
     */
    protected List<Criteria> oredCriteria;

    public UnionSaleStatisticsExample() {
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
     * union_sale_statistics 2018-01-16
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

        public Criteria andAssistOrderNumIsNull() {
            addCriterion("assist_order_num is null");
            return (Criteria) this;
        }

        public Criteria andAssistOrderNumIsNotNull() {
            addCriterion("assist_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andAssistOrderNumEqualTo(Integer value) {
            addCriterion("assist_order_num =", value, "assistOrderNum");
            return (Criteria) this;
        }

        public Criteria andAssistOrderNumNotEqualTo(Integer value) {
            addCriterion("assist_order_num <>", value, "assistOrderNum");
            return (Criteria) this;
        }

        public Criteria andAssistOrderNumGreaterThan(Integer value) {
            addCriterion("assist_order_num >", value, "assistOrderNum");
            return (Criteria) this;
        }

        public Criteria andAssistOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("assist_order_num >=", value, "assistOrderNum");
            return (Criteria) this;
        }

        public Criteria andAssistOrderNumLessThan(Integer value) {
            addCriterion("assist_order_num <", value, "assistOrderNum");
            return (Criteria) this;
        }

        public Criteria andAssistOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("assist_order_num <=", value, "assistOrderNum");
            return (Criteria) this;
        }

        public Criteria andAssistOrderNumIn(List<Integer> values) {
            addCriterion("assist_order_num in", values, "assistOrderNum");
            return (Criteria) this;
        }

        public Criteria andAssistOrderNumNotIn(List<Integer> values) {
            addCriterion("assist_order_num not in", values, "assistOrderNum");
            return (Criteria) this;
        }

        public Criteria andAssistOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("assist_order_num between", value1, value2, "assistOrderNum");
            return (Criteria) this;
        }

        public Criteria andAssistOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("assist_order_num not between", value1, value2, "assistOrderNum");
            return (Criteria) this;
        }

        public Criteria andAssistSaleNumIsNull() {
            addCriterion("assist_sale_num is null");
            return (Criteria) this;
        }

        public Criteria andAssistSaleNumIsNotNull() {
            addCriterion("assist_sale_num is not null");
            return (Criteria) this;
        }

        public Criteria andAssistSaleNumEqualTo(Integer value) {
            addCriterion("assist_sale_num =", value, "assistSaleNum");
            return (Criteria) this;
        }

        public Criteria andAssistSaleNumNotEqualTo(Integer value) {
            addCriterion("assist_sale_num <>", value, "assistSaleNum");
            return (Criteria) this;
        }

        public Criteria andAssistSaleNumGreaterThan(Integer value) {
            addCriterion("assist_sale_num >", value, "assistSaleNum");
            return (Criteria) this;
        }

        public Criteria andAssistSaleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("assist_sale_num >=", value, "assistSaleNum");
            return (Criteria) this;
        }

        public Criteria andAssistSaleNumLessThan(Integer value) {
            addCriterion("assist_sale_num <", value, "assistSaleNum");
            return (Criteria) this;
        }

        public Criteria andAssistSaleNumLessThanOrEqualTo(Integer value) {
            addCriterion("assist_sale_num <=", value, "assistSaleNum");
            return (Criteria) this;
        }

        public Criteria andAssistSaleNumIn(List<Integer> values) {
            addCriterion("assist_sale_num in", values, "assistSaleNum");
            return (Criteria) this;
        }

        public Criteria andAssistSaleNumNotIn(List<Integer> values) {
            addCriterion("assist_sale_num not in", values, "assistSaleNum");
            return (Criteria) this;
        }

        public Criteria andAssistSaleNumBetween(Integer value1, Integer value2) {
            addCriterion("assist_sale_num between", value1, value2, "assistSaleNum");
            return (Criteria) this;
        }

        public Criteria andAssistSaleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("assist_sale_num not between", value1, value2, "assistSaleNum");
            return (Criteria) this;
        }

        public Criteria andAssistSaleAmountIsNull() {
            addCriterion("assist_sale_amount is null");
            return (Criteria) this;
        }

        public Criteria andAssistSaleAmountIsNotNull() {
            addCriterion("assist_sale_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAssistSaleAmountEqualTo(BigDecimal value) {
            addCriterion("assist_sale_amount =", value, "assistSaleAmount");
            return (Criteria) this;
        }

        public Criteria andAssistSaleAmountNotEqualTo(BigDecimal value) {
            addCriterion("assist_sale_amount <>", value, "assistSaleAmount");
            return (Criteria) this;
        }

        public Criteria andAssistSaleAmountGreaterThan(BigDecimal value) {
            addCriterion("assist_sale_amount >", value, "assistSaleAmount");
            return (Criteria) this;
        }

        public Criteria andAssistSaleAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("assist_sale_amount >=", value, "assistSaleAmount");
            return (Criteria) this;
        }

        public Criteria andAssistSaleAmountLessThan(BigDecimal value) {
            addCriterion("assist_sale_amount <", value, "assistSaleAmount");
            return (Criteria) this;
        }

        public Criteria andAssistSaleAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("assist_sale_amount <=", value, "assistSaleAmount");
            return (Criteria) this;
        }

        public Criteria andAssistSaleAmountIn(List<BigDecimal> values) {
            addCriterion("assist_sale_amount in", values, "assistSaleAmount");
            return (Criteria) this;
        }

        public Criteria andAssistSaleAmountNotIn(List<BigDecimal> values) {
            addCriterion("assist_sale_amount not in", values, "assistSaleAmount");
            return (Criteria) this;
        }

        public Criteria andAssistSaleAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assist_sale_amount between", value1, value2, "assistSaleAmount");
            return (Criteria) this;
        }

        public Criteria andAssistSaleAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assist_sale_amount not between", value1, value2, "assistSaleAmount");
            return (Criteria) this;
        }

        public Criteria andAssistHelpPriceIsNull() {
            addCriterion("assist_help_price is null");
            return (Criteria) this;
        }

        public Criteria andAssistHelpPriceIsNotNull() {
            addCriterion("assist_help_price is not null");
            return (Criteria) this;
        }

        public Criteria andAssistHelpPriceEqualTo(BigDecimal value) {
            addCriterion("assist_help_price =", value, "assistHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssistHelpPriceNotEqualTo(BigDecimal value) {
            addCriterion("assist_help_price <>", value, "assistHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssistHelpPriceGreaterThan(BigDecimal value) {
            addCriterion("assist_help_price >", value, "assistHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssistHelpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("assist_help_price >=", value, "assistHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssistHelpPriceLessThan(BigDecimal value) {
            addCriterion("assist_help_price <", value, "assistHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssistHelpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("assist_help_price <=", value, "assistHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssistHelpPriceIn(List<BigDecimal> values) {
            addCriterion("assist_help_price in", values, "assistHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssistHelpPriceNotIn(List<BigDecimal> values) {
            addCriterion("assist_help_price not in", values, "assistHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssistHelpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assist_help_price between", value1, value2, "assistHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssistHelpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assist_help_price not between", value1, value2, "assistHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssistSelfHelpPriceIsNull() {
            addCriterion("assist_self_help_price is null");
            return (Criteria) this;
        }

        public Criteria andAssistSelfHelpPriceIsNotNull() {
            addCriterion("assist_self_help_price is not null");
            return (Criteria) this;
        }

        public Criteria andAssistSelfHelpPriceEqualTo(BigDecimal value) {
            addCriterion("assist_self_help_price =", value, "assistSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssistSelfHelpPriceNotEqualTo(BigDecimal value) {
            addCriterion("assist_self_help_price <>", value, "assistSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssistSelfHelpPriceGreaterThan(BigDecimal value) {
            addCriterion("assist_self_help_price >", value, "assistSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssistSelfHelpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("assist_self_help_price >=", value, "assistSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssistSelfHelpPriceLessThan(BigDecimal value) {
            addCriterion("assist_self_help_price <", value, "assistSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssistSelfHelpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("assist_self_help_price <=", value, "assistSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssistSelfHelpPriceIn(List<BigDecimal> values) {
            addCriterion("assist_self_help_price in", values, "assistSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssistSelfHelpPriceNotIn(List<BigDecimal> values) {
            addCriterion("assist_self_help_price not in", values, "assistSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssistSelfHelpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assist_self_help_price between", value1, value2, "assistSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssistSelfHelpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assist_self_help_price not between", value1, value2, "assistSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andPoorOrderNumIsNull() {
            addCriterion("poor_order_num is null");
            return (Criteria) this;
        }

        public Criteria andPoorOrderNumIsNotNull() {
            addCriterion("poor_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andPoorOrderNumEqualTo(Integer value) {
            addCriterion("poor_order_num =", value, "poorOrderNum");
            return (Criteria) this;
        }

        public Criteria andPoorOrderNumNotEqualTo(Integer value) {
            addCriterion("poor_order_num <>", value, "poorOrderNum");
            return (Criteria) this;
        }

        public Criteria andPoorOrderNumGreaterThan(Integer value) {
            addCriterion("poor_order_num >", value, "poorOrderNum");
            return (Criteria) this;
        }

        public Criteria andPoorOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("poor_order_num >=", value, "poorOrderNum");
            return (Criteria) this;
        }

        public Criteria andPoorOrderNumLessThan(Integer value) {
            addCriterion("poor_order_num <", value, "poorOrderNum");
            return (Criteria) this;
        }

        public Criteria andPoorOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("poor_order_num <=", value, "poorOrderNum");
            return (Criteria) this;
        }

        public Criteria andPoorOrderNumIn(List<Integer> values) {
            addCriterion("poor_order_num in", values, "poorOrderNum");
            return (Criteria) this;
        }

        public Criteria andPoorOrderNumNotIn(List<Integer> values) {
            addCriterion("poor_order_num not in", values, "poorOrderNum");
            return (Criteria) this;
        }

        public Criteria andPoorOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("poor_order_num between", value1, value2, "poorOrderNum");
            return (Criteria) this;
        }

        public Criteria andPoorOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("poor_order_num not between", value1, value2, "poorOrderNum");
            return (Criteria) this;
        }

        public Criteria andPoorSaleNumIsNull() {
            addCriterion("poor_sale_num is null");
            return (Criteria) this;
        }

        public Criteria andPoorSaleNumIsNotNull() {
            addCriterion("poor_sale_num is not null");
            return (Criteria) this;
        }

        public Criteria andPoorSaleNumEqualTo(Integer value) {
            addCriterion("poor_sale_num =", value, "poorSaleNum");
            return (Criteria) this;
        }

        public Criteria andPoorSaleNumNotEqualTo(Integer value) {
            addCriterion("poor_sale_num <>", value, "poorSaleNum");
            return (Criteria) this;
        }

        public Criteria andPoorSaleNumGreaterThan(Integer value) {
            addCriterion("poor_sale_num >", value, "poorSaleNum");
            return (Criteria) this;
        }

        public Criteria andPoorSaleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("poor_sale_num >=", value, "poorSaleNum");
            return (Criteria) this;
        }

        public Criteria andPoorSaleNumLessThan(Integer value) {
            addCriterion("poor_sale_num <", value, "poorSaleNum");
            return (Criteria) this;
        }

        public Criteria andPoorSaleNumLessThanOrEqualTo(Integer value) {
            addCriterion("poor_sale_num <=", value, "poorSaleNum");
            return (Criteria) this;
        }

        public Criteria andPoorSaleNumIn(List<Integer> values) {
            addCriterion("poor_sale_num in", values, "poorSaleNum");
            return (Criteria) this;
        }

        public Criteria andPoorSaleNumNotIn(List<Integer> values) {
            addCriterion("poor_sale_num not in", values, "poorSaleNum");
            return (Criteria) this;
        }

        public Criteria andPoorSaleNumBetween(Integer value1, Integer value2) {
            addCriterion("poor_sale_num between", value1, value2, "poorSaleNum");
            return (Criteria) this;
        }

        public Criteria andPoorSaleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("poor_sale_num not between", value1, value2, "poorSaleNum");
            return (Criteria) this;
        }

        public Criteria andPoorSaleAmountIsNull() {
            addCriterion("poor_sale_amount is null");
            return (Criteria) this;
        }

        public Criteria andPoorSaleAmountIsNotNull() {
            addCriterion("poor_sale_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPoorSaleAmountEqualTo(BigDecimal value) {
            addCriterion("poor_sale_amount =", value, "poorSaleAmount");
            return (Criteria) this;
        }

        public Criteria andPoorSaleAmountNotEqualTo(BigDecimal value) {
            addCriterion("poor_sale_amount <>", value, "poorSaleAmount");
            return (Criteria) this;
        }

        public Criteria andPoorSaleAmountGreaterThan(BigDecimal value) {
            addCriterion("poor_sale_amount >", value, "poorSaleAmount");
            return (Criteria) this;
        }

        public Criteria andPoorSaleAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("poor_sale_amount >=", value, "poorSaleAmount");
            return (Criteria) this;
        }

        public Criteria andPoorSaleAmountLessThan(BigDecimal value) {
            addCriterion("poor_sale_amount <", value, "poorSaleAmount");
            return (Criteria) this;
        }

        public Criteria andPoorSaleAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("poor_sale_amount <=", value, "poorSaleAmount");
            return (Criteria) this;
        }

        public Criteria andPoorSaleAmountIn(List<BigDecimal> values) {
            addCriterion("poor_sale_amount in", values, "poorSaleAmount");
            return (Criteria) this;
        }

        public Criteria andPoorSaleAmountNotIn(List<BigDecimal> values) {
            addCriterion("poor_sale_amount not in", values, "poorSaleAmount");
            return (Criteria) this;
        }

        public Criteria andPoorSaleAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("poor_sale_amount between", value1, value2, "poorSaleAmount");
            return (Criteria) this;
        }

        public Criteria andPoorSaleAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("poor_sale_amount not between", value1, value2, "poorSaleAmount");
            return (Criteria) this;
        }

        public Criteria andPoorSelfHelpPriceIsNull() {
            addCriterion("poor_self_help_price is null");
            return (Criteria) this;
        }

        public Criteria andPoorSelfHelpPriceIsNotNull() {
            addCriterion("poor_self_help_price is not null");
            return (Criteria) this;
        }

        public Criteria andPoorSelfHelpPriceEqualTo(BigDecimal value) {
            addCriterion("poor_self_help_price =", value, "poorSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andPoorSelfHelpPriceNotEqualTo(BigDecimal value) {
            addCriterion("poor_self_help_price <>", value, "poorSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andPoorSelfHelpPriceGreaterThan(BigDecimal value) {
            addCriterion("poor_self_help_price >", value, "poorSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andPoorSelfHelpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("poor_self_help_price >=", value, "poorSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andPoorSelfHelpPriceLessThan(BigDecimal value) {
            addCriterion("poor_self_help_price <", value, "poorSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andPoorSelfHelpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("poor_self_help_price <=", value, "poorSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andPoorSelfHelpPriceIn(List<BigDecimal> values) {
            addCriterion("poor_self_help_price in", values, "poorSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andPoorSelfHelpPriceNotIn(List<BigDecimal> values) {
            addCriterion("poor_self_help_price not in", values, "poorSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andPoorSelfHelpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("poor_self_help_price between", value1, value2, "poorSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andPoorSelfHelpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("poor_self_help_price not between", value1, value2, "poorSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineOrderNumIsNull() {
            addCriterion("syzx_online_order_num is null");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineOrderNumIsNotNull() {
            addCriterion("syzx_online_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineOrderNumEqualTo(Integer value) {
            addCriterion("syzx_online_order_num =", value, "syzxOnlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineOrderNumNotEqualTo(Integer value) {
            addCriterion("syzx_online_order_num <>", value, "syzxOnlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineOrderNumGreaterThan(Integer value) {
            addCriterion("syzx_online_order_num >", value, "syzxOnlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("syzx_online_order_num >=", value, "syzxOnlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineOrderNumLessThan(Integer value) {
            addCriterion("syzx_online_order_num <", value, "syzxOnlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("syzx_online_order_num <=", value, "syzxOnlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineOrderNumIn(List<Integer> values) {
            addCriterion("syzx_online_order_num in", values, "syzxOnlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineOrderNumNotIn(List<Integer> values) {
            addCriterion("syzx_online_order_num not in", values, "syzxOnlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("syzx_online_order_num between", value1, value2, "syzxOnlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("syzx_online_order_num not between", value1, value2, "syzxOnlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleNumIsNull() {
            addCriterion("syzx_online_sale_num is null");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleNumIsNotNull() {
            addCriterion("syzx_online_sale_num is not null");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleNumEqualTo(Integer value) {
            addCriterion("syzx_online_sale_num =", value, "syzxOnlineSaleNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleNumNotEqualTo(Integer value) {
            addCriterion("syzx_online_sale_num <>", value, "syzxOnlineSaleNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleNumGreaterThan(Integer value) {
            addCriterion("syzx_online_sale_num >", value, "syzxOnlineSaleNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("syzx_online_sale_num >=", value, "syzxOnlineSaleNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleNumLessThan(Integer value) {
            addCriterion("syzx_online_sale_num <", value, "syzxOnlineSaleNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleNumLessThanOrEqualTo(Integer value) {
            addCriterion("syzx_online_sale_num <=", value, "syzxOnlineSaleNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleNumIn(List<Integer> values) {
            addCriterion("syzx_online_sale_num in", values, "syzxOnlineSaleNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleNumNotIn(List<Integer> values) {
            addCriterion("syzx_online_sale_num not in", values, "syzxOnlineSaleNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleNumBetween(Integer value1, Integer value2) {
            addCriterion("syzx_online_sale_num between", value1, value2, "syzxOnlineSaleNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("syzx_online_sale_num not between", value1, value2, "syzxOnlineSaleNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleAmountIsNull() {
            addCriterion("syzx_online_sale_amount is null");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleAmountIsNotNull() {
            addCriterion("syzx_online_sale_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleAmountEqualTo(BigDecimal value) {
            addCriterion("syzx_online_sale_amount =", value, "syzxOnlineSaleAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleAmountNotEqualTo(BigDecimal value) {
            addCriterion("syzx_online_sale_amount <>", value, "syzxOnlineSaleAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleAmountGreaterThan(BigDecimal value) {
            addCriterion("syzx_online_sale_amount >", value, "syzxOnlineSaleAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("syzx_online_sale_amount >=", value, "syzxOnlineSaleAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleAmountLessThan(BigDecimal value) {
            addCriterion("syzx_online_sale_amount <", value, "syzxOnlineSaleAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("syzx_online_sale_amount <=", value, "syzxOnlineSaleAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleAmountIn(List<BigDecimal> values) {
            addCriterion("syzx_online_sale_amount in", values, "syzxOnlineSaleAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleAmountNotIn(List<BigDecimal> values) {
            addCriterion("syzx_online_sale_amount not in", values, "syzxOnlineSaleAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("syzx_online_sale_amount between", value1, value2, "syzxOnlineSaleAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSaleAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("syzx_online_sale_amount not between", value1, value2, "syzxOnlineSaleAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineHelpPriceIsNull() {
            addCriterion("syzx_online_help_price is null");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineHelpPriceIsNotNull() {
            addCriterion("syzx_online_help_price is not null");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineHelpPriceEqualTo(BigDecimal value) {
            addCriterion("syzx_online_help_price =", value, "syzxOnlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineHelpPriceNotEqualTo(BigDecimal value) {
            addCriterion("syzx_online_help_price <>", value, "syzxOnlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineHelpPriceGreaterThan(BigDecimal value) {
            addCriterion("syzx_online_help_price >", value, "syzxOnlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineHelpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("syzx_online_help_price >=", value, "syzxOnlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineHelpPriceLessThan(BigDecimal value) {
            addCriterion("syzx_online_help_price <", value, "syzxOnlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineHelpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("syzx_online_help_price <=", value, "syzxOnlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineHelpPriceIn(List<BigDecimal> values) {
            addCriterion("syzx_online_help_price in", values, "syzxOnlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineHelpPriceNotIn(List<BigDecimal> values) {
            addCriterion("syzx_online_help_price not in", values, "syzxOnlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineHelpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("syzx_online_help_price between", value1, value2, "syzxOnlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineHelpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("syzx_online_help_price not between", value1, value2, "syzxOnlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSelfHelpPriceIsNull() {
            addCriterion("syzx_online_self_help_price is null");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSelfHelpPriceIsNotNull() {
            addCriterion("syzx_online_self_help_price is not null");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSelfHelpPriceEqualTo(BigDecimal value) {
            addCriterion("syzx_online_self_help_price =", value, "syzxOnlineSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSelfHelpPriceNotEqualTo(BigDecimal value) {
            addCriterion("syzx_online_self_help_price <>", value, "syzxOnlineSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSelfHelpPriceGreaterThan(BigDecimal value) {
            addCriterion("syzx_online_self_help_price >", value, "syzxOnlineSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSelfHelpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("syzx_online_self_help_price >=", value, "syzxOnlineSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSelfHelpPriceLessThan(BigDecimal value) {
            addCriterion("syzx_online_self_help_price <", value, "syzxOnlineSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSelfHelpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("syzx_online_self_help_price <=", value, "syzxOnlineSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSelfHelpPriceIn(List<BigDecimal> values) {
            addCriterion("syzx_online_self_help_price in", values, "syzxOnlineSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSelfHelpPriceNotIn(List<BigDecimal> values) {
            addCriterion("syzx_online_self_help_price not in", values, "syzxOnlineSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSelfHelpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("syzx_online_self_help_price between", value1, value2, "syzxOnlineSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOnlineSelfHelpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("syzx_online_self_help_price not between", value1, value2, "syzxOnlineSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineOrderNumIsNull() {
            addCriterion("syzx_offline_order_num is null");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineOrderNumIsNotNull() {
            addCriterion("syzx_offline_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineOrderNumEqualTo(Integer value) {
            addCriterion("syzx_offline_order_num =", value, "syzxOfflineOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineOrderNumNotEqualTo(Integer value) {
            addCriterion("syzx_offline_order_num <>", value, "syzxOfflineOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineOrderNumGreaterThan(Integer value) {
            addCriterion("syzx_offline_order_num >", value, "syzxOfflineOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("syzx_offline_order_num >=", value, "syzxOfflineOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineOrderNumLessThan(Integer value) {
            addCriterion("syzx_offline_order_num <", value, "syzxOfflineOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("syzx_offline_order_num <=", value, "syzxOfflineOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineOrderNumIn(List<Integer> values) {
            addCriterion("syzx_offline_order_num in", values, "syzxOfflineOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineOrderNumNotIn(List<Integer> values) {
            addCriterion("syzx_offline_order_num not in", values, "syzxOfflineOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("syzx_offline_order_num between", value1, value2, "syzxOfflineOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("syzx_offline_order_num not between", value1, value2, "syzxOfflineOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleNumIsNull() {
            addCriterion("syzx_offline_sale_num is null");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleNumIsNotNull() {
            addCriterion("syzx_offline_sale_num is not null");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleNumEqualTo(Integer value) {
            addCriterion("syzx_offline_sale_num =", value, "syzxOfflineSaleNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleNumNotEqualTo(Integer value) {
            addCriterion("syzx_offline_sale_num <>", value, "syzxOfflineSaleNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleNumGreaterThan(Integer value) {
            addCriterion("syzx_offline_sale_num >", value, "syzxOfflineSaleNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("syzx_offline_sale_num >=", value, "syzxOfflineSaleNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleNumLessThan(Integer value) {
            addCriterion("syzx_offline_sale_num <", value, "syzxOfflineSaleNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleNumLessThanOrEqualTo(Integer value) {
            addCriterion("syzx_offline_sale_num <=", value, "syzxOfflineSaleNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleNumIn(List<Integer> values) {
            addCriterion("syzx_offline_sale_num in", values, "syzxOfflineSaleNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleNumNotIn(List<Integer> values) {
            addCriterion("syzx_offline_sale_num not in", values, "syzxOfflineSaleNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleNumBetween(Integer value1, Integer value2) {
            addCriterion("syzx_offline_sale_num between", value1, value2, "syzxOfflineSaleNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("syzx_offline_sale_num not between", value1, value2, "syzxOfflineSaleNum");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleAmountIsNull() {
            addCriterion("syzx_offline_sale_amount is null");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleAmountIsNotNull() {
            addCriterion("syzx_offline_sale_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleAmountEqualTo(BigDecimal value) {
            addCriterion("syzx_offline_sale_amount =", value, "syzxOfflineSaleAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleAmountNotEqualTo(BigDecimal value) {
            addCriterion("syzx_offline_sale_amount <>", value, "syzxOfflineSaleAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleAmountGreaterThan(BigDecimal value) {
            addCriterion("syzx_offline_sale_amount >", value, "syzxOfflineSaleAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("syzx_offline_sale_amount >=", value, "syzxOfflineSaleAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleAmountLessThan(BigDecimal value) {
            addCriterion("syzx_offline_sale_amount <", value, "syzxOfflineSaleAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("syzx_offline_sale_amount <=", value, "syzxOfflineSaleAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleAmountIn(List<BigDecimal> values) {
            addCriterion("syzx_offline_sale_amount in", values, "syzxOfflineSaleAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleAmountNotIn(List<BigDecimal> values) {
            addCriterion("syzx_offline_sale_amount not in", values, "syzxOfflineSaleAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("syzx_offline_sale_amount between", value1, value2, "syzxOfflineSaleAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSaleAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("syzx_offline_sale_amount not between", value1, value2, "syzxOfflineSaleAmount");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineHelpPriceIsNull() {
            addCriterion("syzx_offline_help_price is null");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineHelpPriceIsNotNull() {
            addCriterion("syzx_offline_help_price is not null");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineHelpPriceEqualTo(BigDecimal value) {
            addCriterion("syzx_offline_help_price =", value, "syzxOfflineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineHelpPriceNotEqualTo(BigDecimal value) {
            addCriterion("syzx_offline_help_price <>", value, "syzxOfflineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineHelpPriceGreaterThan(BigDecimal value) {
            addCriterion("syzx_offline_help_price >", value, "syzxOfflineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineHelpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("syzx_offline_help_price >=", value, "syzxOfflineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineHelpPriceLessThan(BigDecimal value) {
            addCriterion("syzx_offline_help_price <", value, "syzxOfflineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineHelpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("syzx_offline_help_price <=", value, "syzxOfflineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineHelpPriceIn(List<BigDecimal> values) {
            addCriterion("syzx_offline_help_price in", values, "syzxOfflineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineHelpPriceNotIn(List<BigDecimal> values) {
            addCriterion("syzx_offline_help_price not in", values, "syzxOfflineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineHelpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("syzx_offline_help_price between", value1, value2, "syzxOfflineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineHelpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("syzx_offline_help_price not between", value1, value2, "syzxOfflineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSelfHelpPriceIsNull() {
            addCriterion("syzx_offline_self_help_price is null");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSelfHelpPriceIsNotNull() {
            addCriterion("syzx_offline_self_help_price is not null");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSelfHelpPriceEqualTo(BigDecimal value) {
            addCriterion("syzx_offline_self_help_price =", value, "syzxOfflineSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSelfHelpPriceNotEqualTo(BigDecimal value) {
            addCriterion("syzx_offline_self_help_price <>", value, "syzxOfflineSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSelfHelpPriceGreaterThan(BigDecimal value) {
            addCriterion("syzx_offline_self_help_price >", value, "syzxOfflineSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSelfHelpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("syzx_offline_self_help_price >=", value, "syzxOfflineSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSelfHelpPriceLessThan(BigDecimal value) {
            addCriterion("syzx_offline_self_help_price <", value, "syzxOfflineSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSelfHelpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("syzx_offline_self_help_price <=", value, "syzxOfflineSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSelfHelpPriceIn(List<BigDecimal> values) {
            addCriterion("syzx_offline_self_help_price in", values, "syzxOfflineSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSelfHelpPriceNotIn(List<BigDecimal> values) {
            addCriterion("syzx_offline_self_help_price not in", values, "syzxOfflineSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSelfHelpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("syzx_offline_self_help_price between", value1, value2, "syzxOfflineSelfHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyzxOfflineSelfHelpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("syzx_offline_self_help_price not between", value1, value2, "syzxOfflineSelfHelpPrice");
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

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Long value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Long value) {
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

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
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
     * 描述:union_sale_statistics表的实体类
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
     * union_sale_statistics 2018-01-16
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