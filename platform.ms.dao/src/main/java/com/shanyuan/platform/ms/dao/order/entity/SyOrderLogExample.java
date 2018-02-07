package com.shanyuan.platform.ms.dao.order.entity;

import java.util.ArrayList;
import java.util.List;

public class SyOrderLogExample {
    /**
     * sy_order_log
     */
    protected String orderByClause;

    /**
     * sy_order_log
     */
    protected boolean distinct;

    /**
     * sy_order_log
     */
    protected List<Criteria> oredCriteria;

    public SyOrderLogExample() {
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
     * sy_order_log 2017-10-16
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andLogMsgIsNull() {
            addCriterion("log_msg is null");
            return (Criteria) this;
        }

        public Criteria andLogMsgIsNotNull() {
            addCriterion("log_msg is not null");
            return (Criteria) this;
        }

        public Criteria andLogMsgEqualTo(String value) {
            addCriterion("log_msg =", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgNotEqualTo(String value) {
            addCriterion("log_msg <>", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgGreaterThan(String value) {
            addCriterion("log_msg >", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgGreaterThanOrEqualTo(String value) {
            addCriterion("log_msg >=", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgLessThan(String value) {
            addCriterion("log_msg <", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgLessThanOrEqualTo(String value) {
            addCriterion("log_msg <=", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgLike(String value) {
            addCriterion("log_msg like", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgNotLike(String value) {
            addCriterion("log_msg not like", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgIn(List<String> values) {
            addCriterion("log_msg in", values, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgNotIn(List<String> values) {
            addCriterion("log_msg not in", values, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgBetween(String value1, String value2) {
            addCriterion("log_msg between", value1, value2, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgNotBetween(String value1, String value2) {
            addCriterion("log_msg not between", value1, value2, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNull() {
            addCriterion("log_time is null");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNotNull() {
            addCriterion("log_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogTimeEqualTo(Integer value) {
            addCriterion("log_time =", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotEqualTo(Integer value) {
            addCriterion("log_time <>", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThan(Integer value) {
            addCriterion("log_time >", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_time >=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThan(Integer value) {
            addCriterion("log_time <", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThanOrEqualTo(Integer value) {
            addCriterion("log_time <=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeIn(List<Integer> values) {
            addCriterion("log_time in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotIn(List<Integer> values) {
            addCriterion("log_time not in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeBetween(Integer value1, Integer value2) {
            addCriterion("log_time between", value1, value2, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("log_time not between", value1, value2, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogRoleIsNull() {
            addCriterion("log_role is null");
            return (Criteria) this;
        }

        public Criteria andLogRoleIsNotNull() {
            addCriterion("log_role is not null");
            return (Criteria) this;
        }

        public Criteria andLogRoleEqualTo(String value) {
            addCriterion("log_role =", value, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleNotEqualTo(String value) {
            addCriterion("log_role <>", value, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleGreaterThan(String value) {
            addCriterion("log_role >", value, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleGreaterThanOrEqualTo(String value) {
            addCriterion("log_role >=", value, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleLessThan(String value) {
            addCriterion("log_role <", value, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleLessThanOrEqualTo(String value) {
            addCriterion("log_role <=", value, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleLike(String value) {
            addCriterion("log_role like", value, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleNotLike(String value) {
            addCriterion("log_role not like", value, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleIn(List<String> values) {
            addCriterion("log_role in", values, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleNotIn(List<String> values) {
            addCriterion("log_role not in", values, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleBetween(String value1, String value2) {
            addCriterion("log_role between", value1, value2, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleNotBetween(String value1, String value2) {
            addCriterion("log_role not between", value1, value2, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogUserIsNull() {
            addCriterion("log_user is null");
            return (Criteria) this;
        }

        public Criteria andLogUserIsNotNull() {
            addCriterion("log_user is not null");
            return (Criteria) this;
        }

        public Criteria andLogUserEqualTo(String value) {
            addCriterion("log_user =", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserNotEqualTo(String value) {
            addCriterion("log_user <>", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserGreaterThan(String value) {
            addCriterion("log_user >", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserGreaterThanOrEqualTo(String value) {
            addCriterion("log_user >=", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserLessThan(String value) {
            addCriterion("log_user <", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserLessThanOrEqualTo(String value) {
            addCriterion("log_user <=", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserLike(String value) {
            addCriterion("log_user like", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserNotLike(String value) {
            addCriterion("log_user not like", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserIn(List<String> values) {
            addCriterion("log_user in", values, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserNotIn(List<String> values) {
            addCriterion("log_user not in", values, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserBetween(String value1, String value2) {
            addCriterion("log_user between", value1, value2, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserNotBetween(String value1, String value2) {
            addCriterion("log_user not between", value1, value2, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogOrderstateIsNull() {
            addCriterion("log_orderstate is null");
            return (Criteria) this;
        }

        public Criteria andLogOrderstateIsNotNull() {
            addCriterion("log_orderstate is not null");
            return (Criteria) this;
        }

        public Criteria andLogOrderstateEqualTo(String value) {
            addCriterion("log_orderstate =", value, "logOrderstate");
            return (Criteria) this;
        }

        public Criteria andLogOrderstateNotEqualTo(String value) {
            addCriterion("log_orderstate <>", value, "logOrderstate");
            return (Criteria) this;
        }

        public Criteria andLogOrderstateGreaterThan(String value) {
            addCriterion("log_orderstate >", value, "logOrderstate");
            return (Criteria) this;
        }

        public Criteria andLogOrderstateGreaterThanOrEqualTo(String value) {
            addCriterion("log_orderstate >=", value, "logOrderstate");
            return (Criteria) this;
        }

        public Criteria andLogOrderstateLessThan(String value) {
            addCriterion("log_orderstate <", value, "logOrderstate");
            return (Criteria) this;
        }

        public Criteria andLogOrderstateLessThanOrEqualTo(String value) {
            addCriterion("log_orderstate <=", value, "logOrderstate");
            return (Criteria) this;
        }

        public Criteria andLogOrderstateLike(String value) {
            addCriterion("log_orderstate like", value, "logOrderstate");
            return (Criteria) this;
        }

        public Criteria andLogOrderstateNotLike(String value) {
            addCriterion("log_orderstate not like", value, "logOrderstate");
            return (Criteria) this;
        }

        public Criteria andLogOrderstateIn(List<String> values) {
            addCriterion("log_orderstate in", values, "logOrderstate");
            return (Criteria) this;
        }

        public Criteria andLogOrderstateNotIn(List<String> values) {
            addCriterion("log_orderstate not in", values, "logOrderstate");
            return (Criteria) this;
        }

        public Criteria andLogOrderstateBetween(String value1, String value2) {
            addCriterion("log_orderstate between", value1, value2, "logOrderstate");
            return (Criteria) this;
        }

        public Criteria andLogOrderstateNotBetween(String value1, String value2) {
            addCriterion("log_orderstate not between", value1, value2, "logOrderstate");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_order_log表的实体类
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
     * sy_order_log 2017-10-16
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