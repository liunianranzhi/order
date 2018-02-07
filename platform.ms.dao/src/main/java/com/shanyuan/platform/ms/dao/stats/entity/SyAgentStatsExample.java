package com.shanyuan.platform.ms.dao.stats.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyAgentStatsExample {
    /**
     * sy_agent_stats
     */
    protected String orderByClause;

    /**
     * sy_agent_stats
     */
    protected boolean distinct;

    /**
     * sy_agent_stats
     */
    protected List<Criteria> oredCriteria;

    public SyAgentStatsExample() {
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
     * sy_agent_stats 2017-11-13
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

        public Criteria andTargetMoneyIsNull() {
            addCriterion("target_money is null");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyIsNotNull() {
            addCriterion("target_money is not null");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyEqualTo(Integer value) {
            addCriterion("target_money =", value, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyNotEqualTo(Integer value) {
            addCriterion("target_money <>", value, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyGreaterThan(Integer value) {
            addCriterion("target_money >", value, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("target_money >=", value, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyLessThan(Integer value) {
            addCriterion("target_money <", value, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("target_money <=", value, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyIn(List<Integer> values) {
            addCriterion("target_money in", values, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyNotIn(List<Integer> values) {
            addCriterion("target_money not in", values, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyBetween(Integer value1, Integer value2) {
            addCriterion("target_money between", value1, value2, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("target_money not between", value1, value2, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyIsNull() {
            addCriterion("finished_money is null");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyIsNotNull() {
            addCriterion("finished_money is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyEqualTo(Integer value) {
            addCriterion("finished_money =", value, "finishedMoney");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyNotEqualTo(Integer value) {
            addCriterion("finished_money <>", value, "finishedMoney");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyGreaterThan(Integer value) {
            addCriterion("finished_money >", value, "finishedMoney");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("finished_money >=", value, "finishedMoney");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyLessThan(Integer value) {
            addCriterion("finished_money <", value, "finishedMoney");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("finished_money <=", value, "finishedMoney");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyIn(List<Integer> values) {
            addCriterion("finished_money in", values, "finishedMoney");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyNotIn(List<Integer> values) {
            addCriterion("finished_money not in", values, "finishedMoney");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyBetween(Integer value1, Integer value2) {
            addCriterion("finished_money between", value1, value2, "finishedMoney");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("finished_money not between", value1, value2, "finishedMoney");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsCountIsNull() {
            addCriterion("online_goods_count is null");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsCountIsNotNull() {
            addCriterion("online_goods_count is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsCountEqualTo(Integer value) {
            addCriterion("online_goods_count =", value, "onlineGoodsCount");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsCountNotEqualTo(Integer value) {
            addCriterion("online_goods_count <>", value, "onlineGoodsCount");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsCountGreaterThan(Integer value) {
            addCriterion("online_goods_count >", value, "onlineGoodsCount");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("online_goods_count >=", value, "onlineGoodsCount");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsCountLessThan(Integer value) {
            addCriterion("online_goods_count <", value, "onlineGoodsCount");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsCountLessThanOrEqualTo(Integer value) {
            addCriterion("online_goods_count <=", value, "onlineGoodsCount");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsCountIn(List<Integer> values) {
            addCriterion("online_goods_count in", values, "onlineGoodsCount");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsCountNotIn(List<Integer> values) {
            addCriterion("online_goods_count not in", values, "onlineGoodsCount");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsCountBetween(Integer value1, Integer value2) {
            addCriterion("online_goods_count between", value1, value2, "onlineGoodsCount");
            return (Criteria) this;
        }

        public Criteria andOnlineGoodsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("online_goods_count not between", value1, value2, "onlineGoodsCount");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Integer value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Integer value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Integer> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andRefundRateIsNull() {
            addCriterion("refund_rate is null");
            return (Criteria) this;
        }

        public Criteria andRefundRateIsNotNull() {
            addCriterion("refund_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRefundRateEqualTo(BigDecimal value) {
            addCriterion("refund_rate =", value, "refundRate");
            return (Criteria) this;
        }

        public Criteria andRefundRateNotEqualTo(BigDecimal value) {
            addCriterion("refund_rate <>", value, "refundRate");
            return (Criteria) this;
        }

        public Criteria andRefundRateGreaterThan(BigDecimal value) {
            addCriterion("refund_rate >", value, "refundRate");
            return (Criteria) this;
        }

        public Criteria andRefundRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_rate >=", value, "refundRate");
            return (Criteria) this;
        }

        public Criteria andRefundRateLessThan(BigDecimal value) {
            addCriterion("refund_rate <", value, "refundRate");
            return (Criteria) this;
        }

        public Criteria andRefundRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_rate <=", value, "refundRate");
            return (Criteria) this;
        }

        public Criteria andRefundRateIn(List<BigDecimal> values) {
            addCriterion("refund_rate in", values, "refundRate");
            return (Criteria) this;
        }

        public Criteria andRefundRateNotIn(List<BigDecimal> values) {
            addCriterion("refund_rate not in", values, "refundRate");
            return (Criteria) this;
        }

        public Criteria andRefundRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_rate between", value1, value2, "refundRate");
            return (Criteria) this;
        }

        public Criteria andRefundRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_rate not between", value1, value2, "refundRate");
            return (Criteria) this;
        }

        public Criteria andComplainRateIsNull() {
            addCriterion("complain_rate is null");
            return (Criteria) this;
        }

        public Criteria andComplainRateIsNotNull() {
            addCriterion("complain_rate is not null");
            return (Criteria) this;
        }

        public Criteria andComplainRateEqualTo(BigDecimal value) {
            addCriterion("complain_rate =", value, "complainRate");
            return (Criteria) this;
        }

        public Criteria andComplainRateNotEqualTo(BigDecimal value) {
            addCriterion("complain_rate <>", value, "complainRate");
            return (Criteria) this;
        }

        public Criteria andComplainRateGreaterThan(BigDecimal value) {
            addCriterion("complain_rate >", value, "complainRate");
            return (Criteria) this;
        }

        public Criteria andComplainRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("complain_rate >=", value, "complainRate");
            return (Criteria) this;
        }

        public Criteria andComplainRateLessThan(BigDecimal value) {
            addCriterion("complain_rate <", value, "complainRate");
            return (Criteria) this;
        }

        public Criteria andComplainRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("complain_rate <=", value, "complainRate");
            return (Criteria) this;
        }

        public Criteria andComplainRateIn(List<BigDecimal> values) {
            addCriterion("complain_rate in", values, "complainRate");
            return (Criteria) this;
        }

        public Criteria andComplainRateNotIn(List<BigDecimal> values) {
            addCriterion("complain_rate not in", values, "complainRate");
            return (Criteria) this;
        }

        public Criteria andComplainRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("complain_rate between", value1, value2, "complainRate");
            return (Criteria) this;
        }

        public Criteria andComplainRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("complain_rate not between", value1, value2, "complainRate");
            return (Criteria) this;
        }

        public Criteria andSendSpeedIsNull() {
            addCriterion("send_speed is null");
            return (Criteria) this;
        }

        public Criteria andSendSpeedIsNotNull() {
            addCriterion("send_speed is not null");
            return (Criteria) this;
        }

        public Criteria andSendSpeedEqualTo(BigDecimal value) {
            addCriterion("send_speed =", value, "sendSpeed");
            return (Criteria) this;
        }

        public Criteria andSendSpeedNotEqualTo(BigDecimal value) {
            addCriterion("send_speed <>", value, "sendSpeed");
            return (Criteria) this;
        }

        public Criteria andSendSpeedGreaterThan(BigDecimal value) {
            addCriterion("send_speed >", value, "sendSpeed");
            return (Criteria) this;
        }

        public Criteria andSendSpeedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("send_speed >=", value, "sendSpeed");
            return (Criteria) this;
        }

        public Criteria andSendSpeedLessThan(BigDecimal value) {
            addCriterion("send_speed <", value, "sendSpeed");
            return (Criteria) this;
        }

        public Criteria andSendSpeedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("send_speed <=", value, "sendSpeed");
            return (Criteria) this;
        }

        public Criteria andSendSpeedIn(List<BigDecimal> values) {
            addCriterion("send_speed in", values, "sendSpeed");
            return (Criteria) this;
        }

        public Criteria andSendSpeedNotIn(List<BigDecimal> values) {
            addCriterion("send_speed not in", values, "sendSpeed");
            return (Criteria) this;
        }

        public Criteria andSendSpeedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("send_speed between", value1, value2, "sendSpeed");
            return (Criteria) this;
        }

        public Criteria andSendSpeedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("send_speed not between", value1, value2, "sendSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgDesccreditIsNull() {
            addCriterion("avg_desccredit is null");
            return (Criteria) this;
        }

        public Criteria andAvgDesccreditIsNotNull() {
            addCriterion("avg_desccredit is not null");
            return (Criteria) this;
        }

        public Criteria andAvgDesccreditEqualTo(BigDecimal value) {
            addCriterion("avg_desccredit =", value, "avgDesccredit");
            return (Criteria) this;
        }

        public Criteria andAvgDesccreditNotEqualTo(BigDecimal value) {
            addCriterion("avg_desccredit <>", value, "avgDesccredit");
            return (Criteria) this;
        }

        public Criteria andAvgDesccreditGreaterThan(BigDecimal value) {
            addCriterion("avg_desccredit >", value, "avgDesccredit");
            return (Criteria) this;
        }

        public Criteria andAvgDesccreditGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_desccredit >=", value, "avgDesccredit");
            return (Criteria) this;
        }

        public Criteria andAvgDesccreditLessThan(BigDecimal value) {
            addCriterion("avg_desccredit <", value, "avgDesccredit");
            return (Criteria) this;
        }

        public Criteria andAvgDesccreditLessThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_desccredit <=", value, "avgDesccredit");
            return (Criteria) this;
        }

        public Criteria andAvgDesccreditIn(List<BigDecimal> values) {
            addCriterion("avg_desccredit in", values, "avgDesccredit");
            return (Criteria) this;
        }

        public Criteria andAvgDesccreditNotIn(List<BigDecimal> values) {
            addCriterion("avg_desccredit not in", values, "avgDesccredit");
            return (Criteria) this;
        }

        public Criteria andAvgDesccreditBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_desccredit between", value1, value2, "avgDesccredit");
            return (Criteria) this;
        }

        public Criteria andAvgDesccreditNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_desccredit not between", value1, value2, "avgDesccredit");
            return (Criteria) this;
        }

        public Criteria andNegEvalRateIsNull() {
            addCriterion("neg_eval_rate is null");
            return (Criteria) this;
        }

        public Criteria andNegEvalRateIsNotNull() {
            addCriterion("neg_eval_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNegEvalRateEqualTo(BigDecimal value) {
            addCriterion("neg_eval_rate =", value, "negEvalRate");
            return (Criteria) this;
        }

        public Criteria andNegEvalRateNotEqualTo(BigDecimal value) {
            addCriterion("neg_eval_rate <>", value, "negEvalRate");
            return (Criteria) this;
        }

        public Criteria andNegEvalRateGreaterThan(BigDecimal value) {
            addCriterion("neg_eval_rate >", value, "negEvalRate");
            return (Criteria) this;
        }

        public Criteria andNegEvalRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("neg_eval_rate >=", value, "negEvalRate");
            return (Criteria) this;
        }

        public Criteria andNegEvalRateLessThan(BigDecimal value) {
            addCriterion("neg_eval_rate <", value, "negEvalRate");
            return (Criteria) this;
        }

        public Criteria andNegEvalRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("neg_eval_rate <=", value, "negEvalRate");
            return (Criteria) this;
        }

        public Criteria andNegEvalRateIn(List<BigDecimal> values) {
            addCriterion("neg_eval_rate in", values, "negEvalRate");
            return (Criteria) this;
        }

        public Criteria andNegEvalRateNotIn(List<BigDecimal> values) {
            addCriterion("neg_eval_rate not in", values, "negEvalRate");
            return (Criteria) this;
        }

        public Criteria andNegEvalRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("neg_eval_rate between", value1, value2, "negEvalRate");
            return (Criteria) this;
        }

        public Criteria andNegEvalRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("neg_eval_rate not between", value1, value2, "negEvalRate");
            return (Criteria) this;
        }

        public Criteria andAvgServicecreditIsNull() {
            addCriterion("avg_servicecredit is null");
            return (Criteria) this;
        }

        public Criteria andAvgServicecreditIsNotNull() {
            addCriterion("avg_servicecredit is not null");
            return (Criteria) this;
        }

        public Criteria andAvgServicecreditEqualTo(BigDecimal value) {
            addCriterion("avg_servicecredit =", value, "avgServicecredit");
            return (Criteria) this;
        }

        public Criteria andAvgServicecreditNotEqualTo(BigDecimal value) {
            addCriterion("avg_servicecredit <>", value, "avgServicecredit");
            return (Criteria) this;
        }

        public Criteria andAvgServicecreditGreaterThan(BigDecimal value) {
            addCriterion("avg_servicecredit >", value, "avgServicecredit");
            return (Criteria) this;
        }

        public Criteria andAvgServicecreditGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_servicecredit >=", value, "avgServicecredit");
            return (Criteria) this;
        }

        public Criteria andAvgServicecreditLessThan(BigDecimal value) {
            addCriterion("avg_servicecredit <", value, "avgServicecredit");
            return (Criteria) this;
        }

        public Criteria andAvgServicecreditLessThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_servicecredit <=", value, "avgServicecredit");
            return (Criteria) this;
        }

        public Criteria andAvgServicecreditIn(List<BigDecimal> values) {
            addCriterion("avg_servicecredit in", values, "avgServicecredit");
            return (Criteria) this;
        }

        public Criteria andAvgServicecreditNotIn(List<BigDecimal> values) {
            addCriterion("avg_servicecredit not in", values, "avgServicecredit");
            return (Criteria) this;
        }

        public Criteria andAvgServicecreditBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_servicecredit between", value1, value2, "avgServicecredit");
            return (Criteria) this;
        }

        public Criteria andAvgServicecreditNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_servicecredit not between", value1, value2, "avgServicecredit");
            return (Criteria) this;
        }

        public Criteria andAvgDeliverycreditIsNull() {
            addCriterion("avg_deliverycredit is null");
            return (Criteria) this;
        }

        public Criteria andAvgDeliverycreditIsNotNull() {
            addCriterion("avg_deliverycredit is not null");
            return (Criteria) this;
        }

        public Criteria andAvgDeliverycreditEqualTo(BigDecimal value) {
            addCriterion("avg_deliverycredit =", value, "avgDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andAvgDeliverycreditNotEqualTo(BigDecimal value) {
            addCriterion("avg_deliverycredit <>", value, "avgDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andAvgDeliverycreditGreaterThan(BigDecimal value) {
            addCriterion("avg_deliverycredit >", value, "avgDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andAvgDeliverycreditGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_deliverycredit >=", value, "avgDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andAvgDeliverycreditLessThan(BigDecimal value) {
            addCriterion("avg_deliverycredit <", value, "avgDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andAvgDeliverycreditLessThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_deliverycredit <=", value, "avgDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andAvgDeliverycreditIn(List<BigDecimal> values) {
            addCriterion("avg_deliverycredit in", values, "avgDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andAvgDeliverycreditNotIn(List<BigDecimal> values) {
            addCriterion("avg_deliverycredit not in", values, "avgDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andAvgDeliverycreditBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_deliverycredit between", value1, value2, "avgDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andAvgDeliverycreditNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_deliverycredit not between", value1, value2, "avgDeliverycredit");
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

        public Criteria andLatestRefundRateIsNull() {
            addCriterion("latest_refund_rate is null");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateIsNotNull() {
            addCriterion("latest_refund_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateEqualTo(BigDecimal value) {
            addCriterion("latest_refund_rate =", value, "latestRefundRate");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateNotEqualTo(BigDecimal value) {
            addCriterion("latest_refund_rate <>", value, "latestRefundRate");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateGreaterThan(BigDecimal value) {
            addCriterion("latest_refund_rate >", value, "latestRefundRate");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latest_refund_rate >=", value, "latestRefundRate");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateLessThan(BigDecimal value) {
            addCriterion("latest_refund_rate <", value, "latestRefundRate");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latest_refund_rate <=", value, "latestRefundRate");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateIn(List<BigDecimal> values) {
            addCriterion("latest_refund_rate in", values, "latestRefundRate");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateNotIn(List<BigDecimal> values) {
            addCriterion("latest_refund_rate not in", values, "latestRefundRate");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latest_refund_rate between", value1, value2, "latestRefundRate");
            return (Criteria) this;
        }

        public Criteria andLatestRefundRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latest_refund_rate not between", value1, value2, "latestRefundRate");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateIsNull() {
            addCriterion("latest_complain_rate is null");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateIsNotNull() {
            addCriterion("latest_complain_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateEqualTo(BigDecimal value) {
            addCriterion("latest_complain_rate =", value, "latestComplainRate");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateNotEqualTo(BigDecimal value) {
            addCriterion("latest_complain_rate <>", value, "latestComplainRate");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateGreaterThan(BigDecimal value) {
            addCriterion("latest_complain_rate >", value, "latestComplainRate");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latest_complain_rate >=", value, "latestComplainRate");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateLessThan(BigDecimal value) {
            addCriterion("latest_complain_rate <", value, "latestComplainRate");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latest_complain_rate <=", value, "latestComplainRate");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateIn(List<BigDecimal> values) {
            addCriterion("latest_complain_rate in", values, "latestComplainRate");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateNotIn(List<BigDecimal> values) {
            addCriterion("latest_complain_rate not in", values, "latestComplainRate");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latest_complain_rate between", value1, value2, "latestComplainRate");
            return (Criteria) this;
        }

        public Criteria andLatestComplainRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latest_complain_rate not between", value1, value2, "latestComplainRate");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedIsNull() {
            addCriterion("latest_send_speed is null");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedIsNotNull() {
            addCriterion("latest_send_speed is not null");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedEqualTo(BigDecimal value) {
            addCriterion("latest_send_speed =", value, "latestSendSpeed");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedNotEqualTo(BigDecimal value) {
            addCriterion("latest_send_speed <>", value, "latestSendSpeed");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedGreaterThan(BigDecimal value) {
            addCriterion("latest_send_speed >", value, "latestSendSpeed");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latest_send_speed >=", value, "latestSendSpeed");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedLessThan(BigDecimal value) {
            addCriterion("latest_send_speed <", value, "latestSendSpeed");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latest_send_speed <=", value, "latestSendSpeed");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedIn(List<BigDecimal> values) {
            addCriterion("latest_send_speed in", values, "latestSendSpeed");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedNotIn(List<BigDecimal> values) {
            addCriterion("latest_send_speed not in", values, "latestSendSpeed");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latest_send_speed between", value1, value2, "latestSendSpeed");
            return (Criteria) this;
        }

        public Criteria andLatestSendSpeedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latest_send_speed not between", value1, value2, "latestSendSpeed");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_agent_stats表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2017-11-13
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_agent_stats 2017-11-13
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