package com.shanyuan.platform.ms.dao.stats.entity;

import java.util.ArrayList;
import java.util.List;

public class SyBizPoorStatsExample {
    /**
     * sy_biz_poor_stats
     */
    protected String orderByClause;

    /**
     * sy_biz_poor_stats
     */
    protected boolean distinct;

    /**
     * sy_biz_poor_stats
     */
    protected List<Criteria> oredCriteria;

    public SyBizPoorStatsExample() {
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
     * sy_biz_poor_stats 2017-11-13
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

        public Criteria andStatsIdIsNull() {
            addCriterion("stats_id is null");
            return (Criteria) this;
        }

        public Criteria andStatsIdIsNotNull() {
            addCriterion("stats_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatsIdEqualTo(Integer value) {
            addCriterion("stats_id =", value, "statsId");
            return (Criteria) this;
        }

        public Criteria andStatsIdNotEqualTo(Integer value) {
            addCriterion("stats_id <>", value, "statsId");
            return (Criteria) this;
        }

        public Criteria andStatsIdGreaterThan(Integer value) {
            addCriterion("stats_id >", value, "statsId");
            return (Criteria) this;
        }

        public Criteria andStatsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stats_id >=", value, "statsId");
            return (Criteria) this;
        }

        public Criteria andStatsIdLessThan(Integer value) {
            addCriterion("stats_id <", value, "statsId");
            return (Criteria) this;
        }

        public Criteria andStatsIdLessThanOrEqualTo(Integer value) {
            addCriterion("stats_id <=", value, "statsId");
            return (Criteria) this;
        }

        public Criteria andStatsIdIn(List<Integer> values) {
            addCriterion("stats_id in", values, "statsId");
            return (Criteria) this;
        }

        public Criteria andStatsIdNotIn(List<Integer> values) {
            addCriterion("stats_id not in", values, "statsId");
            return (Criteria) this;
        }

        public Criteria andStatsIdBetween(Integer value1, Integer value2) {
            addCriterion("stats_id between", value1, value2, "statsId");
            return (Criteria) this;
        }

        public Criteria andStatsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stats_id not between", value1, value2, "statsId");
            return (Criteria) this;
        }

        public Criteria andAgentMidIsNull() {
            addCriterion("agent_mid is null");
            return (Criteria) this;
        }

        public Criteria andAgentMidIsNotNull() {
            addCriterion("agent_mid is not null");
            return (Criteria) this;
        }

        public Criteria andAgentMidEqualTo(Integer value) {
            addCriterion("agent_mid =", value, "agentMid");
            return (Criteria) this;
        }

        public Criteria andAgentMidNotEqualTo(Integer value) {
            addCriterion("agent_mid <>", value, "agentMid");
            return (Criteria) this;
        }

        public Criteria andAgentMidGreaterThan(Integer value) {
            addCriterion("agent_mid >", value, "agentMid");
            return (Criteria) this;
        }

        public Criteria andAgentMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_mid >=", value, "agentMid");
            return (Criteria) this;
        }

        public Criteria andAgentMidLessThan(Integer value) {
            addCriterion("agent_mid <", value, "agentMid");
            return (Criteria) this;
        }

        public Criteria andAgentMidLessThanOrEqualTo(Integer value) {
            addCriterion("agent_mid <=", value, "agentMid");
            return (Criteria) this;
        }

        public Criteria andAgentMidIn(List<Integer> values) {
            addCriterion("agent_mid in", values, "agentMid");
            return (Criteria) this;
        }

        public Criteria andAgentMidNotIn(List<Integer> values) {
            addCriterion("agent_mid not in", values, "agentMid");
            return (Criteria) this;
        }

        public Criteria andAgentMidBetween(Integer value1, Integer value2) {
            addCriterion("agent_mid between", value1, value2, "agentMid");
            return (Criteria) this;
        }

        public Criteria andAgentMidNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_mid not between", value1, value2, "agentMid");
            return (Criteria) this;
        }

        public Criteria andPoorIdIsNull() {
            addCriterion("poor_id is null");
            return (Criteria) this;
        }

        public Criteria andPoorIdIsNotNull() {
            addCriterion("poor_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoorIdEqualTo(Integer value) {
            addCriterion("poor_id =", value, "poorId");
            return (Criteria) this;
        }

        public Criteria andPoorIdNotEqualTo(Integer value) {
            addCriterion("poor_id <>", value, "poorId");
            return (Criteria) this;
        }

        public Criteria andPoorIdGreaterThan(Integer value) {
            addCriterion("poor_id >", value, "poorId");
            return (Criteria) this;
        }

        public Criteria andPoorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("poor_id >=", value, "poorId");
            return (Criteria) this;
        }

        public Criteria andPoorIdLessThan(Integer value) {
            addCriterion("poor_id <", value, "poorId");
            return (Criteria) this;
        }

        public Criteria andPoorIdLessThanOrEqualTo(Integer value) {
            addCriterion("poor_id <=", value, "poorId");
            return (Criteria) this;
        }

        public Criteria andPoorIdIn(List<Integer> values) {
            addCriterion("poor_id in", values, "poorId");
            return (Criteria) this;
        }

        public Criteria andPoorIdNotIn(List<Integer> values) {
            addCriterion("poor_id not in", values, "poorId");
            return (Criteria) this;
        }

        public Criteria andPoorIdBetween(Integer value1, Integer value2) {
            addCriterion("poor_id between", value1, value2, "poorId");
            return (Criteria) this;
        }

        public Criteria andPoorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("poor_id not between", value1, value2, "poorId");
            return (Criteria) this;
        }

        public Criteria andPoorMidIsNull() {
            addCriterion("poor_mid is null");
            return (Criteria) this;
        }

        public Criteria andPoorMidIsNotNull() {
            addCriterion("poor_mid is not null");
            return (Criteria) this;
        }

        public Criteria andPoorMidEqualTo(Integer value) {
            addCriterion("poor_mid =", value, "poorMid");
            return (Criteria) this;
        }

        public Criteria andPoorMidNotEqualTo(Integer value) {
            addCriterion("poor_mid <>", value, "poorMid");
            return (Criteria) this;
        }

        public Criteria andPoorMidGreaterThan(Integer value) {
            addCriterion("poor_mid >", value, "poorMid");
            return (Criteria) this;
        }

        public Criteria andPoorMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("poor_mid >=", value, "poorMid");
            return (Criteria) this;
        }

        public Criteria andPoorMidLessThan(Integer value) {
            addCriterion("poor_mid <", value, "poorMid");
            return (Criteria) this;
        }

        public Criteria andPoorMidLessThanOrEqualTo(Integer value) {
            addCriterion("poor_mid <=", value, "poorMid");
            return (Criteria) this;
        }

        public Criteria andPoorMidIn(List<Integer> values) {
            addCriterion("poor_mid in", values, "poorMid");
            return (Criteria) this;
        }

        public Criteria andPoorMidNotIn(List<Integer> values) {
            addCriterion("poor_mid not in", values, "poorMid");
            return (Criteria) this;
        }

        public Criteria andPoorMidBetween(Integer value1, Integer value2) {
            addCriterion("poor_mid between", value1, value2, "poorMid");
            return (Criteria) this;
        }

        public Criteria andPoorMidNotBetween(Integer value1, Integer value2) {
            addCriterion("poor_mid not between", value1, value2, "poorMid");
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
    }

    /**
     * 描述:sy_biz_poor_stats表的实体类
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
     * sy_biz_poor_stats 2017-11-13
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