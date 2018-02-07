package com.shanyuan.platform.ms.dao.project.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyProjectMoneyExample {
    /**
     * sy_project_money
     */
    protected String orderByClause;

    /**
     * sy_project_money
     */
    protected boolean distinct;

    /**
     * sy_project_money
     */
    protected List<Criteria> oredCriteria;

    public SyProjectMoneyExample() {
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
     * sy_project_money 2017-11-01
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

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
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

        public Criteria andTargetMoneyEqualTo(BigDecimal value) {
            addCriterion("target_money =", value, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyNotEqualTo(BigDecimal value) {
            addCriterion("target_money <>", value, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyGreaterThan(BigDecimal value) {
            addCriterion("target_money >", value, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("target_money >=", value, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyLessThan(BigDecimal value) {
            addCriterion("target_money <", value, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("target_money <=", value, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyIn(List<BigDecimal> values) {
            addCriterion("target_money in", values, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyNotIn(List<BigDecimal> values) {
            addCriterion("target_money not in", values, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("target_money between", value1, value2, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("target_money not between", value1, value2, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andPointsMoneyIsNull() {
            addCriterion("points_money is null");
            return (Criteria) this;
        }

        public Criteria andPointsMoneyIsNotNull() {
            addCriterion("points_money is not null");
            return (Criteria) this;
        }

        public Criteria andPointsMoneyEqualTo(Integer value) {
            addCriterion("points_money =", value, "pointsMoney");
            return (Criteria) this;
        }

        public Criteria andPointsMoneyNotEqualTo(Integer value) {
            addCriterion("points_money <>", value, "pointsMoney");
            return (Criteria) this;
        }

        public Criteria andPointsMoneyGreaterThan(Integer value) {
            addCriterion("points_money >", value, "pointsMoney");
            return (Criteria) this;
        }

        public Criteria andPointsMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("points_money >=", value, "pointsMoney");
            return (Criteria) this;
        }

        public Criteria andPointsMoneyLessThan(Integer value) {
            addCriterion("points_money <", value, "pointsMoney");
            return (Criteria) this;
        }

        public Criteria andPointsMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("points_money <=", value, "pointsMoney");
            return (Criteria) this;
        }

        public Criteria andPointsMoneyIn(List<Integer> values) {
            addCriterion("points_money in", values, "pointsMoney");
            return (Criteria) this;
        }

        public Criteria andPointsMoneyNotIn(List<Integer> values) {
            addCriterion("points_money not in", values, "pointsMoney");
            return (Criteria) this;
        }

        public Criteria andPointsMoneyBetween(Integer value1, Integer value2) {
            addCriterion("points_money between", value1, value2, "pointsMoney");
            return (Criteria) this;
        }

        public Criteria andPointsMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("points_money not between", value1, value2, "pointsMoney");
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

        public Criteria andFinishedMoneyEqualTo(BigDecimal value) {
            addCriterion("finished_money =", value, "finishedMoney");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyNotEqualTo(BigDecimal value) {
            addCriterion("finished_money <>", value, "finishedMoney");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyGreaterThan(BigDecimal value) {
            addCriterion("finished_money >", value, "finishedMoney");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("finished_money >=", value, "finishedMoney");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyLessThan(BigDecimal value) {
            addCriterion("finished_money <", value, "finishedMoney");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("finished_money <=", value, "finishedMoney");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyIn(List<BigDecimal> values) {
            addCriterion("finished_money in", values, "finishedMoney");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyNotIn(List<BigDecimal> values) {
            addCriterion("finished_money not in", values, "finishedMoney");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finished_money between", value1, value2, "finishedMoney");
            return (Criteria) this;
        }

        public Criteria andFinishedMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finished_money not between", value1, value2, "finishedMoney");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andPersonTimeIsNull() {
            addCriterion("person_time is null");
            return (Criteria) this;
        }

        public Criteria andPersonTimeIsNotNull() {
            addCriterion("person_time is not null");
            return (Criteria) this;
        }

        public Criteria andPersonTimeEqualTo(Integer value) {
            addCriterion("person_time =", value, "personTime");
            return (Criteria) this;
        }

        public Criteria andPersonTimeNotEqualTo(Integer value) {
            addCriterion("person_time <>", value, "personTime");
            return (Criteria) this;
        }

        public Criteria andPersonTimeGreaterThan(Integer value) {
            addCriterion("person_time >", value, "personTime");
            return (Criteria) this;
        }

        public Criteria andPersonTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_time >=", value, "personTime");
            return (Criteria) this;
        }

        public Criteria andPersonTimeLessThan(Integer value) {
            addCriterion("person_time <", value, "personTime");
            return (Criteria) this;
        }

        public Criteria andPersonTimeLessThanOrEqualTo(Integer value) {
            addCriterion("person_time <=", value, "personTime");
            return (Criteria) this;
        }

        public Criteria andPersonTimeIn(List<Integer> values) {
            addCriterion("person_time in", values, "personTime");
            return (Criteria) this;
        }

        public Criteria andPersonTimeNotIn(List<Integer> values) {
            addCriterion("person_time not in", values, "personTime");
            return (Criteria) this;
        }

        public Criteria andPersonTimeBetween(Integer value1, Integer value2) {
            addCriterion("person_time between", value1, value2, "personTime");
            return (Criteria) this;
        }

        public Criteria andPersonTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("person_time not between", value1, value2, "personTime");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_project_money表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-11-01
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_project_money 2017-11-01
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