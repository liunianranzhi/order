package com.shanyuan.platform.ms.dao.recommend.entity;

import java.util.ArrayList;
import java.util.List;

public class SyRecommendPoorExample {
    /**
     * sy_recommend_poor
     */
    protected String orderByClause;

    /**
     * sy_recommend_poor
     */
    protected boolean distinct;

    /**
     * sy_recommend_poor
     */
    protected List<Criteria> oredCriteria;

    public SyRecommendPoorExample() {
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
     * sy_recommend_poor 2017-10-31
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

        public Criteria andRecommendPidIsNull() {
            addCriterion("recommend_pid is null");
            return (Criteria) this;
        }

        public Criteria andRecommendPidIsNotNull() {
            addCriterion("recommend_pid is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendPidEqualTo(Integer value) {
            addCriterion("recommend_pid =", value, "recommendPid");
            return (Criteria) this;
        }

        public Criteria andRecommendPidNotEqualTo(Integer value) {
            addCriterion("recommend_pid <>", value, "recommendPid");
            return (Criteria) this;
        }

        public Criteria andRecommendPidGreaterThan(Integer value) {
            addCriterion("recommend_pid >", value, "recommendPid");
            return (Criteria) this;
        }

        public Criteria andRecommendPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommend_pid >=", value, "recommendPid");
            return (Criteria) this;
        }

        public Criteria andRecommendPidLessThan(Integer value) {
            addCriterion("recommend_pid <", value, "recommendPid");
            return (Criteria) this;
        }

        public Criteria andRecommendPidLessThanOrEqualTo(Integer value) {
            addCriterion("recommend_pid <=", value, "recommendPid");
            return (Criteria) this;
        }

        public Criteria andRecommendPidIn(List<Integer> values) {
            addCriterion("recommend_pid in", values, "recommendPid");
            return (Criteria) this;
        }

        public Criteria andRecommendPidNotIn(List<Integer> values) {
            addCriterion("recommend_pid not in", values, "recommendPid");
            return (Criteria) this;
        }

        public Criteria andRecommendPidBetween(Integer value1, Integer value2) {
            addCriterion("recommend_pid between", value1, value2, "recommendPid");
            return (Criteria) this;
        }

        public Criteria andRecommendPidNotBetween(Integer value1, Integer value2) {
            addCriterion("recommend_pid not between", value1, value2, "recommendPid");
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

        public Criteria andPoorNameIsNull() {
            addCriterion("poor_name is null");
            return (Criteria) this;
        }

        public Criteria andPoorNameIsNotNull() {
            addCriterion("poor_name is not null");
            return (Criteria) this;
        }

        public Criteria andPoorNameEqualTo(String value) {
            addCriterion("poor_name =", value, "poorName");
            return (Criteria) this;
        }

        public Criteria andPoorNameNotEqualTo(String value) {
            addCriterion("poor_name <>", value, "poorName");
            return (Criteria) this;
        }

        public Criteria andPoorNameGreaterThan(String value) {
            addCriterion("poor_name >", value, "poorName");
            return (Criteria) this;
        }

        public Criteria andPoorNameGreaterThanOrEqualTo(String value) {
            addCriterion("poor_name >=", value, "poorName");
            return (Criteria) this;
        }

        public Criteria andPoorNameLessThan(String value) {
            addCriterion("poor_name <", value, "poorName");
            return (Criteria) this;
        }

        public Criteria andPoorNameLessThanOrEqualTo(String value) {
            addCriterion("poor_name <=", value, "poorName");
            return (Criteria) this;
        }

        public Criteria andPoorNameLike(String value) {
            addCriterion("poor_name like", value, "poorName");
            return (Criteria) this;
        }

        public Criteria andPoorNameNotLike(String value) {
            addCriterion("poor_name not like", value, "poorName");
            return (Criteria) this;
        }

        public Criteria andPoorNameIn(List<String> values) {
            addCriterion("poor_name in", values, "poorName");
            return (Criteria) this;
        }

        public Criteria andPoorNameNotIn(List<String> values) {
            addCriterion("poor_name not in", values, "poorName");
            return (Criteria) this;
        }

        public Criteria andPoorNameBetween(String value1, String value2) {
            addCriterion("poor_name between", value1, value2, "poorName");
            return (Criteria) this;
        }

        public Criteria andPoorNameNotBetween(String value1, String value2) {
            addCriterion("poor_name not between", value1, value2, "poorName");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeIsNull() {
            addCriterion("recommend_time is null");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeIsNotNull() {
            addCriterion("recommend_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeEqualTo(Integer value) {
            addCriterion("recommend_time =", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeNotEqualTo(Integer value) {
            addCriterion("recommend_time <>", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeGreaterThan(Integer value) {
            addCriterion("recommend_time >", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommend_time >=", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeLessThan(Integer value) {
            addCriterion("recommend_time <", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeLessThanOrEqualTo(Integer value) {
            addCriterion("recommend_time <=", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeIn(List<Integer> values) {
            addCriterion("recommend_time in", values, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeNotIn(List<Integer> values) {
            addCriterion("recommend_time not in", values, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeBetween(Integer value1, Integer value2) {
            addCriterion("recommend_time between", value1, value2, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("recommend_time not between", value1, value2, "recommendTime");
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
     * 描述:sy_recommend_poor表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2017-10-31
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_recommend_poor 2017-10-31
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