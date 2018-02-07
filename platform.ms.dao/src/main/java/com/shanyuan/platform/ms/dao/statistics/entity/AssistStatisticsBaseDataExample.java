package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AssistStatisticsBaseDataExample {
    /**
     * assist_statistics_base_data
     */
    protected String orderByClause;

    /**
     * assist_statistics_base_data
     */
    protected boolean distinct;

    /**
     * assist_statistics_base_data
     */
    protected List<Criteria> oredCriteria;

    public AssistStatisticsBaseDataExample() {
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
     * assist_statistics_base_data 2018-01-08
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

        public Criteria andEmployeeDealAmountIsNull() {
            addCriterion("employee_deal_amount is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeDealAmountIsNotNull() {
            addCriterion("employee_deal_amount is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeDealAmountEqualTo(BigDecimal value) {
            addCriterion("employee_deal_amount =", value, "employeeDealAmount");
            return (Criteria) this;
        }

        public Criteria andEmployeeDealAmountNotEqualTo(BigDecimal value) {
            addCriterion("employee_deal_amount <>", value, "employeeDealAmount");
            return (Criteria) this;
        }

        public Criteria andEmployeeDealAmountGreaterThan(BigDecimal value) {
            addCriterion("employee_deal_amount >", value, "employeeDealAmount");
            return (Criteria) this;
        }

        public Criteria andEmployeeDealAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_deal_amount >=", value, "employeeDealAmount");
            return (Criteria) this;
        }

        public Criteria andEmployeeDealAmountLessThan(BigDecimal value) {
            addCriterion("employee_deal_amount <", value, "employeeDealAmount");
            return (Criteria) this;
        }

        public Criteria andEmployeeDealAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_deal_amount <=", value, "employeeDealAmount");
            return (Criteria) this;
        }

        public Criteria andEmployeeDealAmountIn(List<BigDecimal> values) {
            addCriterion("employee_deal_amount in", values, "employeeDealAmount");
            return (Criteria) this;
        }

        public Criteria andEmployeeDealAmountNotIn(List<BigDecimal> values) {
            addCriterion("employee_deal_amount not in", values, "employeeDealAmount");
            return (Criteria) this;
        }

        public Criteria andEmployeeDealAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_deal_amount between", value1, value2, "employeeDealAmount");
            return (Criteria) this;
        }

        public Criteria andEmployeeDealAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_deal_amount not between", value1, value2, "employeeDealAmount");
            return (Criteria) this;
        }

        public Criteria andYkDealAmountIsNull() {
            addCriterion("yk_deal_amount is null");
            return (Criteria) this;
        }

        public Criteria andYkDealAmountIsNotNull() {
            addCriterion("yk_deal_amount is not null");
            return (Criteria) this;
        }

        public Criteria andYkDealAmountEqualTo(BigDecimal value) {
            addCriterion("yk_deal_amount =", value, "ykDealAmount");
            return (Criteria) this;
        }

        public Criteria andYkDealAmountNotEqualTo(BigDecimal value) {
            addCriterion("yk_deal_amount <>", value, "ykDealAmount");
            return (Criteria) this;
        }

        public Criteria andYkDealAmountGreaterThan(BigDecimal value) {
            addCriterion("yk_deal_amount >", value, "ykDealAmount");
            return (Criteria) this;
        }

        public Criteria andYkDealAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yk_deal_amount >=", value, "ykDealAmount");
            return (Criteria) this;
        }

        public Criteria andYkDealAmountLessThan(BigDecimal value) {
            addCriterion("yk_deal_amount <", value, "ykDealAmount");
            return (Criteria) this;
        }

        public Criteria andYkDealAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yk_deal_amount <=", value, "ykDealAmount");
            return (Criteria) this;
        }

        public Criteria andYkDealAmountIn(List<BigDecimal> values) {
            addCriterion("yk_deal_amount in", values, "ykDealAmount");
            return (Criteria) this;
        }

        public Criteria andYkDealAmountNotIn(List<BigDecimal> values) {
            addCriterion("yk_deal_amount not in", values, "ykDealAmount");
            return (Criteria) this;
        }

        public Criteria andYkDealAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yk_deal_amount between", value1, value2, "ykDealAmount");
            return (Criteria) this;
        }

        public Criteria andYkDealAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yk_deal_amount not between", value1, value2, "ykDealAmount");
            return (Criteria) this;
        }

        public Criteria andUserAddedNumIsNull() {
            addCriterion("user_added_num is null");
            return (Criteria) this;
        }

        public Criteria andUserAddedNumIsNotNull() {
            addCriterion("user_added_num is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddedNumEqualTo(Long value) {
            addCriterion("user_added_num =", value, "userAddedNum");
            return (Criteria) this;
        }

        public Criteria andUserAddedNumNotEqualTo(Long value) {
            addCriterion("user_added_num <>", value, "userAddedNum");
            return (Criteria) this;
        }

        public Criteria andUserAddedNumGreaterThan(Long value) {
            addCriterion("user_added_num >", value, "userAddedNum");
            return (Criteria) this;
        }

        public Criteria andUserAddedNumGreaterThanOrEqualTo(Long value) {
            addCriterion("user_added_num >=", value, "userAddedNum");
            return (Criteria) this;
        }

        public Criteria andUserAddedNumLessThan(Long value) {
            addCriterion("user_added_num <", value, "userAddedNum");
            return (Criteria) this;
        }

        public Criteria andUserAddedNumLessThanOrEqualTo(Long value) {
            addCriterion("user_added_num <=", value, "userAddedNum");
            return (Criteria) this;
        }

        public Criteria andUserAddedNumIn(List<Long> values) {
            addCriterion("user_added_num in", values, "userAddedNum");
            return (Criteria) this;
        }

        public Criteria andUserAddedNumNotIn(List<Long> values) {
            addCriterion("user_added_num not in", values, "userAddedNum");
            return (Criteria) this;
        }

        public Criteria andUserAddedNumBetween(Long value1, Long value2) {
            addCriterion("user_added_num between", value1, value2, "userAddedNum");
            return (Criteria) this;
        }

        public Criteria andUserAddedNumNotBetween(Long value1, Long value2) {
            addCriterion("user_added_num not between", value1, value2, "userAddedNum");
            return (Criteria) this;
        }

        public Criteria andUserTotalNumIsNull() {
            addCriterion("user_total_num is null");
            return (Criteria) this;
        }

        public Criteria andUserTotalNumIsNotNull() {
            addCriterion("user_total_num is not null");
            return (Criteria) this;
        }

        public Criteria andUserTotalNumEqualTo(Long value) {
            addCriterion("user_total_num =", value, "userTotalNum");
            return (Criteria) this;
        }

        public Criteria andUserTotalNumNotEqualTo(Long value) {
            addCriterion("user_total_num <>", value, "userTotalNum");
            return (Criteria) this;
        }

        public Criteria andUserTotalNumGreaterThan(Long value) {
            addCriterion("user_total_num >", value, "userTotalNum");
            return (Criteria) this;
        }

        public Criteria andUserTotalNumGreaterThanOrEqualTo(Long value) {
            addCriterion("user_total_num >=", value, "userTotalNum");
            return (Criteria) this;
        }

        public Criteria andUserTotalNumLessThan(Long value) {
            addCriterion("user_total_num <", value, "userTotalNum");
            return (Criteria) this;
        }

        public Criteria andUserTotalNumLessThanOrEqualTo(Long value) {
            addCriterion("user_total_num <=", value, "userTotalNum");
            return (Criteria) this;
        }

        public Criteria andUserTotalNumIn(List<Long> values) {
            addCriterion("user_total_num in", values, "userTotalNum");
            return (Criteria) this;
        }

        public Criteria andUserTotalNumNotIn(List<Long> values) {
            addCriterion("user_total_num not in", values, "userTotalNum");
            return (Criteria) this;
        }

        public Criteria andUserTotalNumBetween(Long value1, Long value2) {
            addCriterion("user_total_num between", value1, value2, "userTotalNum");
            return (Criteria) this;
        }

        public Criteria andUserTotalNumNotBetween(Long value1, Long value2) {
            addCriterion("user_total_num not between", value1, value2, "userTotalNum");
            return (Criteria) this;
        }

        public Criteria andInviteYkNumIsNull() {
            addCriterion("invite_yk_num is null");
            return (Criteria) this;
        }

        public Criteria andInviteYkNumIsNotNull() {
            addCriterion("invite_yk_num is not null");
            return (Criteria) this;
        }

        public Criteria andInviteYkNumEqualTo(Long value) {
            addCriterion("invite_yk_num =", value, "inviteYkNum");
            return (Criteria) this;
        }

        public Criteria andInviteYkNumNotEqualTo(Long value) {
            addCriterion("invite_yk_num <>", value, "inviteYkNum");
            return (Criteria) this;
        }

        public Criteria andInviteYkNumGreaterThan(Long value) {
            addCriterion("invite_yk_num >", value, "inviteYkNum");
            return (Criteria) this;
        }

        public Criteria andInviteYkNumGreaterThanOrEqualTo(Long value) {
            addCriterion("invite_yk_num >=", value, "inviteYkNum");
            return (Criteria) this;
        }

        public Criteria andInviteYkNumLessThan(Long value) {
            addCriterion("invite_yk_num <", value, "inviteYkNum");
            return (Criteria) this;
        }

        public Criteria andInviteYkNumLessThanOrEqualTo(Long value) {
            addCriterion("invite_yk_num <=", value, "inviteYkNum");
            return (Criteria) this;
        }

        public Criteria andInviteYkNumIn(List<Long> values) {
            addCriterion("invite_yk_num in", values, "inviteYkNum");
            return (Criteria) this;
        }

        public Criteria andInviteYkNumNotIn(List<Long> values) {
            addCriterion("invite_yk_num not in", values, "inviteYkNum");
            return (Criteria) this;
        }

        public Criteria andInviteYkNumBetween(Long value1, Long value2) {
            addCriterion("invite_yk_num between", value1, value2, "inviteYkNum");
            return (Criteria) this;
        }

        public Criteria andInviteYkNumNotBetween(Long value1, Long value2) {
            addCriterion("invite_yk_num not between", value1, value2, "inviteYkNum");
            return (Criteria) this;
        }

        public Criteria andRegEmployeeNumIsNull() {
            addCriterion("reg_employee_num is null");
            return (Criteria) this;
        }

        public Criteria andRegEmployeeNumIsNotNull() {
            addCriterion("reg_employee_num is not null");
            return (Criteria) this;
        }

        public Criteria andRegEmployeeNumEqualTo(Long value) {
            addCriterion("reg_employee_num =", value, "regEmployeeNum");
            return (Criteria) this;
        }

        public Criteria andRegEmployeeNumNotEqualTo(Long value) {
            addCriterion("reg_employee_num <>", value, "regEmployeeNum");
            return (Criteria) this;
        }

        public Criteria andRegEmployeeNumGreaterThan(Long value) {
            addCriterion("reg_employee_num >", value, "regEmployeeNum");
            return (Criteria) this;
        }

        public Criteria andRegEmployeeNumGreaterThanOrEqualTo(Long value) {
            addCriterion("reg_employee_num >=", value, "regEmployeeNum");
            return (Criteria) this;
        }

        public Criteria andRegEmployeeNumLessThan(Long value) {
            addCriterion("reg_employee_num <", value, "regEmployeeNum");
            return (Criteria) this;
        }

        public Criteria andRegEmployeeNumLessThanOrEqualTo(Long value) {
            addCriterion("reg_employee_num <=", value, "regEmployeeNum");
            return (Criteria) this;
        }

        public Criteria andRegEmployeeNumIn(List<Long> values) {
            addCriterion("reg_employee_num in", values, "regEmployeeNum");
            return (Criteria) this;
        }

        public Criteria andRegEmployeeNumNotIn(List<Long> values) {
            addCriterion("reg_employee_num not in", values, "regEmployeeNum");
            return (Criteria) this;
        }

        public Criteria andRegEmployeeNumBetween(Long value1, Long value2) {
            addCriterion("reg_employee_num between", value1, value2, "regEmployeeNum");
            return (Criteria) this;
        }

        public Criteria andRegEmployeeNumNotBetween(Long value1, Long value2) {
            addCriterion("reg_employee_num not between", value1, value2, "regEmployeeNum");
            return (Criteria) this;
        }
    }

    /**
     * 描述:assist_statistics_base_data表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2018-01-08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * assist_statistics_base_data 2018-01-08
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