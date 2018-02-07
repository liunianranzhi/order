package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PlatformStatisticsSellerDataExample {
    /**
     * platform_statistics_seller_data
     */
    protected String orderByClause;

    /**
     * platform_statistics_seller_data
     */
    protected boolean distinct;

    /**
     * platform_statistics_seller_data
     */
    protected List<Criteria> oredCriteria;

    public PlatformStatisticsSellerDataExample() {
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
     * platform_statistics_seller_data 2018-01-16
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

        public Criteria andAssistGoodsNumIsNull() {
            addCriterion("assist_goods_num is null");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsNumIsNotNull() {
            addCriterion("assist_goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsNumEqualTo(Integer value) {
            addCriterion("assist_goods_num =", value, "assistGoodsNum");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsNumNotEqualTo(Integer value) {
            addCriterion("assist_goods_num <>", value, "assistGoodsNum");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsNumGreaterThan(Integer value) {
            addCriterion("assist_goods_num >", value, "assistGoodsNum");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("assist_goods_num >=", value, "assistGoodsNum");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsNumLessThan(Integer value) {
            addCriterion("assist_goods_num <", value, "assistGoodsNum");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("assist_goods_num <=", value, "assistGoodsNum");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsNumIn(List<Integer> values) {
            addCriterion("assist_goods_num in", values, "assistGoodsNum");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsNumNotIn(List<Integer> values) {
            addCriterion("assist_goods_num not in", values, "assistGoodsNum");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("assist_goods_num between", value1, value2, "assistGoodsNum");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("assist_goods_num not between", value1, value2, "assistGoodsNum");
            return (Criteria) this;
        }

        public Criteria andAssistOrderAmountIsNull() {
            addCriterion("assist_order_amount is null");
            return (Criteria) this;
        }

        public Criteria andAssistOrderAmountIsNotNull() {
            addCriterion("assist_order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAssistOrderAmountEqualTo(BigDecimal value) {
            addCriterion("assist_order_amount =", value, "assistOrderAmount");
            return (Criteria) this;
        }

        public Criteria andAssistOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("assist_order_amount <>", value, "assistOrderAmount");
            return (Criteria) this;
        }

        public Criteria andAssistOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("assist_order_amount >", value, "assistOrderAmount");
            return (Criteria) this;
        }

        public Criteria andAssistOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("assist_order_amount >=", value, "assistOrderAmount");
            return (Criteria) this;
        }

        public Criteria andAssistOrderAmountLessThan(BigDecimal value) {
            addCriterion("assist_order_amount <", value, "assistOrderAmount");
            return (Criteria) this;
        }

        public Criteria andAssistOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("assist_order_amount <=", value, "assistOrderAmount");
            return (Criteria) this;
        }

        public Criteria andAssistOrderAmountIn(List<BigDecimal> values) {
            addCriterion("assist_order_amount in", values, "assistOrderAmount");
            return (Criteria) this;
        }

        public Criteria andAssistOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("assist_order_amount not in", values, "assistOrderAmount");
            return (Criteria) this;
        }

        public Criteria andAssistOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assist_order_amount between", value1, value2, "assistOrderAmount");
            return (Criteria) this;
        }

        public Criteria andAssistOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assist_order_amount not between", value1, value2, "assistOrderAmount");
            return (Criteria) this;
        }

        public Criteria andAssitHelpPriceIsNull() {
            addCriterion("assit_help_price is null");
            return (Criteria) this;
        }

        public Criteria andAssitHelpPriceIsNotNull() {
            addCriterion("assit_help_price is not null");
            return (Criteria) this;
        }

        public Criteria andAssitHelpPriceEqualTo(BigDecimal value) {
            addCriterion("assit_help_price =", value, "assitHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssitHelpPriceNotEqualTo(BigDecimal value) {
            addCriterion("assit_help_price <>", value, "assitHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssitHelpPriceGreaterThan(BigDecimal value) {
            addCriterion("assit_help_price >", value, "assitHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssitHelpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("assit_help_price >=", value, "assitHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssitHelpPriceLessThan(BigDecimal value) {
            addCriterion("assit_help_price <", value, "assitHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssitHelpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("assit_help_price <=", value, "assitHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssitHelpPriceIn(List<BigDecimal> values) {
            addCriterion("assit_help_price in", values, "assitHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssitHelpPriceNotIn(List<BigDecimal> values) {
            addCriterion("assit_help_price not in", values, "assitHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssitHelpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assit_help_price between", value1, value2, "assitHelpPrice");
            return (Criteria) this;
        }

        public Criteria andAssitHelpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assit_help_price not between", value1, value2, "assitHelpPrice");
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

        public Criteria andPoorGoodsNumIsNull() {
            addCriterion("poor_goods_num is null");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsNumIsNotNull() {
            addCriterion("poor_goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsNumEqualTo(Integer value) {
            addCriterion("poor_goods_num =", value, "poorGoodsNum");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsNumNotEqualTo(Integer value) {
            addCriterion("poor_goods_num <>", value, "poorGoodsNum");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsNumGreaterThan(Integer value) {
            addCriterion("poor_goods_num >", value, "poorGoodsNum");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("poor_goods_num >=", value, "poorGoodsNum");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsNumLessThan(Integer value) {
            addCriterion("poor_goods_num <", value, "poorGoodsNum");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("poor_goods_num <=", value, "poorGoodsNum");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsNumIn(List<Integer> values) {
            addCriterion("poor_goods_num in", values, "poorGoodsNum");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsNumNotIn(List<Integer> values) {
            addCriterion("poor_goods_num not in", values, "poorGoodsNum");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("poor_goods_num between", value1, value2, "poorGoodsNum");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("poor_goods_num not between", value1, value2, "poorGoodsNum");
            return (Criteria) this;
        }

        public Criteria andPoorOrderAmountIsNull() {
            addCriterion("poor_order_amount is null");
            return (Criteria) this;
        }

        public Criteria andPoorOrderAmountIsNotNull() {
            addCriterion("poor_order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPoorOrderAmountEqualTo(BigDecimal value) {
            addCriterion("poor_order_amount =", value, "poorOrderAmount");
            return (Criteria) this;
        }

        public Criteria andPoorOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("poor_order_amount <>", value, "poorOrderAmount");
            return (Criteria) this;
        }

        public Criteria andPoorOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("poor_order_amount >", value, "poorOrderAmount");
            return (Criteria) this;
        }

        public Criteria andPoorOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("poor_order_amount >=", value, "poorOrderAmount");
            return (Criteria) this;
        }

        public Criteria andPoorOrderAmountLessThan(BigDecimal value) {
            addCriterion("poor_order_amount <", value, "poorOrderAmount");
            return (Criteria) this;
        }

        public Criteria andPoorOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("poor_order_amount <=", value, "poorOrderAmount");
            return (Criteria) this;
        }

        public Criteria andPoorOrderAmountIn(List<BigDecimal> values) {
            addCriterion("poor_order_amount in", values, "poorOrderAmount");
            return (Criteria) this;
        }

        public Criteria andPoorOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("poor_order_amount not in", values, "poorOrderAmount");
            return (Criteria) this;
        }

        public Criteria andPoorOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("poor_order_amount between", value1, value2, "poorOrderAmount");
            return (Criteria) this;
        }

        public Criteria andPoorOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("poor_order_amount not between", value1, value2, "poorOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderNumIsNull() {
            addCriterion("online_order_num is null");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderNumIsNotNull() {
            addCriterion("online_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderNumEqualTo(Integer value) {
            addCriterion("online_order_num =", value, "onlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderNumNotEqualTo(Integer value) {
            addCriterion("online_order_num <>", value, "onlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderNumGreaterThan(Integer value) {
            addCriterion("online_order_num >", value, "onlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("online_order_num >=", value, "onlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderNumLessThan(Integer value) {
            addCriterion("online_order_num <", value, "onlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("online_order_num <=", value, "onlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderNumIn(List<Integer> values) {
            addCriterion("online_order_num in", values, "onlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderNumNotIn(List<Integer> values) {
            addCriterion("online_order_num not in", values, "onlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("online_order_num between", value1, value2, "onlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("online_order_num not between", value1, value2, "onlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsNumIsNull() {
            addCriterion("online_goods_num is null");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsNumIsNotNull() {
            addCriterion("online_goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsNumEqualTo(Integer value) {
            addCriterion("online_goods_num =", value, "onlineGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsNumNotEqualTo(Integer value) {
            addCriterion("online_goods_num <>", value, "onlineGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsNumGreaterThan(Integer value) {
            addCriterion("online_goods_num >", value, "onlineGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("online_goods_num >=", value, "onlineGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsNumLessThan(Integer value) {
            addCriterion("online_goods_num <", value, "onlineGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("online_goods_num <=", value, "onlineGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsNumIn(List<Integer> values) {
            addCriterion("online_goods_num in", values, "onlineGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsNumNotIn(List<Integer> values) {
            addCriterion("online_goods_num not in", values, "onlineGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("online_goods_num between", value1, value2, "onlineGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("online_goods_num not between", value1, value2, "onlineGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderAmountIsNull() {
            addCriterion("online_order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderAmountIsNotNull() {
            addCriterion("online_order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderAmountEqualTo(BigDecimal value) {
            addCriterion("online_order_amount =", value, "onlineOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("online_order_amount <>", value, "onlineOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("online_order_amount >", value, "onlineOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("online_order_amount >=", value, "onlineOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderAmountLessThan(BigDecimal value) {
            addCriterion("online_order_amount <", value, "onlineOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("online_order_amount <=", value, "onlineOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderAmountIn(List<BigDecimal> values) {
            addCriterion("online_order_amount in", values, "onlineOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("online_order_amount not in", values, "onlineOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("online_order_amount between", value1, value2, "onlineOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("online_order_amount not between", value1, value2, "onlineOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineHelpPriceIsNull() {
            addCriterion("online_help_price is null");
            return (Criteria) this;
        }

        public Criteria andOnlineHelpPriceIsNotNull() {
            addCriterion("online_help_price is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineHelpPriceEqualTo(BigDecimal value) {
            addCriterion("online_help_price =", value, "onlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andOnlineHelpPriceNotEqualTo(BigDecimal value) {
            addCriterion("online_help_price <>", value, "onlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andOnlineHelpPriceGreaterThan(BigDecimal value) {
            addCriterion("online_help_price >", value, "onlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andOnlineHelpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("online_help_price >=", value, "onlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andOnlineHelpPriceLessThan(BigDecimal value) {
            addCriterion("online_help_price <", value, "onlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andOnlineHelpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("online_help_price <=", value, "onlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andOnlineHelpPriceIn(List<BigDecimal> values) {
            addCriterion("online_help_price in", values, "onlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andOnlineHelpPriceNotIn(List<BigDecimal> values) {
            addCriterion("online_help_price not in", values, "onlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andOnlineHelpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("online_help_price between", value1, value2, "onlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andOnlineHelpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("online_help_price not between", value1, value2, "onlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderNumIsNull() {
            addCriterion("offline_order_num is null");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderNumIsNotNull() {
            addCriterion("offline_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderNumEqualTo(Integer value) {
            addCriterion("offline_order_num =", value, "offlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderNumNotEqualTo(Integer value) {
            addCriterion("offline_order_num <>", value, "offlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderNumGreaterThan(Integer value) {
            addCriterion("offline_order_num >", value, "offlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("offline_order_num >=", value, "offlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderNumLessThan(Integer value) {
            addCriterion("offline_order_num <", value, "offlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("offline_order_num <=", value, "offlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderNumIn(List<Integer> values) {
            addCriterion("offline_order_num in", values, "offlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderNumNotIn(List<Integer> values) {
            addCriterion("offline_order_num not in", values, "offlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("offline_order_num between", value1, value2, "offlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("offline_order_num not between", value1, value2, "offlineOrderNum");
            return (Criteria) this;
        }

        public Criteria andOfflineGoodsNumIsNull() {
            addCriterion("offline_goods_num is null");
            return (Criteria) this;
        }

        public Criteria andOfflineGoodsNumIsNotNull() {
            addCriterion("offline_goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineGoodsNumEqualTo(Integer value) {
            addCriterion("offline_goods_num =", value, "offlineGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOfflineGoodsNumNotEqualTo(Integer value) {
            addCriterion("offline_goods_num <>", value, "offlineGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOfflineGoodsNumGreaterThan(Integer value) {
            addCriterion("offline_goods_num >", value, "offlineGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOfflineGoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("offline_goods_num >=", value, "offlineGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOfflineGoodsNumLessThan(Integer value) {
            addCriterion("offline_goods_num <", value, "offlineGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOfflineGoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("offline_goods_num <=", value, "offlineGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOfflineGoodsNumIn(List<Integer> values) {
            addCriterion("offline_goods_num in", values, "offlineGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOfflineGoodsNumNotIn(List<Integer> values) {
            addCriterion("offline_goods_num not in", values, "offlineGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOfflineGoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("offline_goods_num between", value1, value2, "offlineGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOfflineGoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("offline_goods_num not between", value1, value2, "offlineGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderAmountIsNull() {
            addCriterion("offline_order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderAmountIsNotNull() {
            addCriterion("offline_order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderAmountEqualTo(BigDecimal value) {
            addCriterion("offline_order_amount =", value, "offlineOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("offline_order_amount <>", value, "offlineOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("offline_order_amount >", value, "offlineOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("offline_order_amount >=", value, "offlineOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderAmountLessThan(BigDecimal value) {
            addCriterion("offline_order_amount <", value, "offlineOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("offline_order_amount <=", value, "offlineOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderAmountIn(List<BigDecimal> values) {
            addCriterion("offline_order_amount in", values, "offlineOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("offline_order_amount not in", values, "offlineOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offline_order_amount between", value1, value2, "offlineOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOfflineOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offline_order_amount not between", value1, value2, "offlineOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOfflineHelpPriceIsNull() {
            addCriterion("offline_help_price is null");
            return (Criteria) this;
        }

        public Criteria andOfflineHelpPriceIsNotNull() {
            addCriterion("offline_help_price is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineHelpPriceEqualTo(BigDecimal value) {
            addCriterion("offline_help_price =", value, "offlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andOfflineHelpPriceNotEqualTo(BigDecimal value) {
            addCriterion("offline_help_price <>", value, "offlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andOfflineHelpPriceGreaterThan(BigDecimal value) {
            addCriterion("offline_help_price >", value, "offlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andOfflineHelpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("offline_help_price >=", value, "offlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andOfflineHelpPriceLessThan(BigDecimal value) {
            addCriterion("offline_help_price <", value, "offlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andOfflineHelpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("offline_help_price <=", value, "offlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andOfflineHelpPriceIn(List<BigDecimal> values) {
            addCriterion("offline_help_price in", values, "offlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andOfflineHelpPriceNotIn(List<BigDecimal> values) {
            addCriterion("offline_help_price not in", values, "offlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andOfflineHelpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offline_help_price between", value1, value2, "offlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andOfflineHelpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offline_help_price not between", value1, value2, "offlineHelpPrice");
            return (Criteria) this;
        }

        public Criteria andSyOrderNumIsNull() {
            addCriterion("sy_order_num is null");
            return (Criteria) this;
        }

        public Criteria andSyOrderNumIsNotNull() {
            addCriterion("sy_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andSyOrderNumEqualTo(Integer value) {
            addCriterion("sy_order_num =", value, "syOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyOrderNumNotEqualTo(Integer value) {
            addCriterion("sy_order_num <>", value, "syOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyOrderNumGreaterThan(Integer value) {
            addCriterion("sy_order_num >", value, "syOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sy_order_num >=", value, "syOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyOrderNumLessThan(Integer value) {
            addCriterion("sy_order_num <", value, "syOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("sy_order_num <=", value, "syOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyOrderNumIn(List<Integer> values) {
            addCriterion("sy_order_num in", values, "syOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyOrderNumNotIn(List<Integer> values) {
            addCriterion("sy_order_num not in", values, "syOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("sy_order_num between", value1, value2, "syOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sy_order_num not between", value1, value2, "syOrderNum");
            return (Criteria) this;
        }

        public Criteria andSyGoodsNumIsNull() {
            addCriterion("sy_goods_num is null");
            return (Criteria) this;
        }

        public Criteria andSyGoodsNumIsNotNull() {
            addCriterion("sy_goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andSyGoodsNumEqualTo(Integer value) {
            addCriterion("sy_goods_num =", value, "syGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyGoodsNumNotEqualTo(Integer value) {
            addCriterion("sy_goods_num <>", value, "syGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyGoodsNumGreaterThan(Integer value) {
            addCriterion("sy_goods_num >", value, "syGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyGoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sy_goods_num >=", value, "syGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyGoodsNumLessThan(Integer value) {
            addCriterion("sy_goods_num <", value, "syGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyGoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("sy_goods_num <=", value, "syGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyGoodsNumIn(List<Integer> values) {
            addCriterion("sy_goods_num in", values, "syGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyGoodsNumNotIn(List<Integer> values) {
            addCriterion("sy_goods_num not in", values, "syGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyGoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("sy_goods_num between", value1, value2, "syGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyGoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sy_goods_num not between", value1, value2, "syGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSyOrderAmountIsNull() {
            addCriterion("sy_order_amount is null");
            return (Criteria) this;
        }

        public Criteria andSyOrderAmountIsNotNull() {
            addCriterion("sy_order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSyOrderAmountEqualTo(BigDecimal value) {
            addCriterion("sy_order_amount =", value, "syOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSyOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("sy_order_amount <>", value, "syOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSyOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("sy_order_amount >", value, "syOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSyOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sy_order_amount >=", value, "syOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSyOrderAmountLessThan(BigDecimal value) {
            addCriterion("sy_order_amount <", value, "syOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSyOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sy_order_amount <=", value, "syOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSyOrderAmountIn(List<BigDecimal> values) {
            addCriterion("sy_order_amount in", values, "syOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSyOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("sy_order_amount not in", values, "syOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSyOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sy_order_amount between", value1, value2, "syOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSyOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sy_order_amount not between", value1, value2, "syOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSyDonationAmountIsNull() {
            addCriterion("sy_donation_amount is null");
            return (Criteria) this;
        }

        public Criteria andSyDonationAmountIsNotNull() {
            addCriterion("sy_donation_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSyDonationAmountEqualTo(BigDecimal value) {
            addCriterion("sy_donation_amount =", value, "syDonationAmount");
            return (Criteria) this;
        }

        public Criteria andSyDonationAmountNotEqualTo(BigDecimal value) {
            addCriterion("sy_donation_amount <>", value, "syDonationAmount");
            return (Criteria) this;
        }

        public Criteria andSyDonationAmountGreaterThan(BigDecimal value) {
            addCriterion("sy_donation_amount >", value, "syDonationAmount");
            return (Criteria) this;
        }

        public Criteria andSyDonationAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sy_donation_amount >=", value, "syDonationAmount");
            return (Criteria) this;
        }

        public Criteria andSyDonationAmountLessThan(BigDecimal value) {
            addCriterion("sy_donation_amount <", value, "syDonationAmount");
            return (Criteria) this;
        }

        public Criteria andSyDonationAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sy_donation_amount <=", value, "syDonationAmount");
            return (Criteria) this;
        }

        public Criteria andSyDonationAmountIn(List<BigDecimal> values) {
            addCriterion("sy_donation_amount in", values, "syDonationAmount");
            return (Criteria) this;
        }

        public Criteria andSyDonationAmountNotIn(List<BigDecimal> values) {
            addCriterion("sy_donation_amount not in", values, "syDonationAmount");
            return (Criteria) this;
        }

        public Criteria andSyDonationAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sy_donation_amount between", value1, value2, "syDonationAmount");
            return (Criteria) this;
        }

        public Criteria andSyDonationAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sy_donation_amount not between", value1, value2, "syDonationAmount");
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
    }

    /**
     * 描述:platform_statistics_seller_data表的实体类
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
     * platform_statistics_seller_data 2018-01-16
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