package com.shanyuan.platform.ms.dao.user.entity;

import java.util.ArrayList;
import java.util.List;

public class SyGloryDetailsExample {
    /**
     * sy_glory_detials
     */
    protected String orderByClause;

    /**
     * sy_glory_detials
     */
    protected boolean distinct;

    /**
     * sy_glory_detials
     */
    protected List<Criteria> oredCriteria;

    public SyGloryDetailsExample() {
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
     * sy_glory_detials 2017-10-18
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

        public Criteria andGloryDetialIdIsNull() {
            addCriterion("glory_detial_id is null");
            return (Criteria) this;
        }

        public Criteria andGloryDetialIdIsNotNull() {
            addCriterion("glory_detial_id is not null");
            return (Criteria) this;
        }

        public Criteria andGloryDetialIdEqualTo(Integer value) {
            addCriterion("glory_detial_id =", value, "gloryDetialId");
            return (Criteria) this;
        }

        public Criteria andGloryDetialIdNotEqualTo(Integer value) {
            addCriterion("glory_detial_id <>", value, "gloryDetialId");
            return (Criteria) this;
        }

        public Criteria andGloryDetialIdGreaterThan(Integer value) {
            addCriterion("glory_detial_id >", value, "gloryDetialId");
            return (Criteria) this;
        }

        public Criteria andGloryDetialIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("glory_detial_id >=", value, "gloryDetialId");
            return (Criteria) this;
        }

        public Criteria andGloryDetialIdLessThan(Integer value) {
            addCriterion("glory_detial_id <", value, "gloryDetialId");
            return (Criteria) this;
        }

        public Criteria andGloryDetialIdLessThanOrEqualTo(Integer value) {
            addCriterion("glory_detial_id <=", value, "gloryDetialId");
            return (Criteria) this;
        }

        public Criteria andGloryDetialIdIn(List<Integer> values) {
            addCriterion("glory_detial_id in", values, "gloryDetialId");
            return (Criteria) this;
        }

        public Criteria andGloryDetialIdNotIn(List<Integer> values) {
            addCriterion("glory_detial_id not in", values, "gloryDetialId");
            return (Criteria) this;
        }

        public Criteria andGloryDetialIdBetween(Integer value1, Integer value2) {
            addCriterion("glory_detial_id between", value1, value2, "gloryDetialId");
            return (Criteria) this;
        }

        public Criteria andGloryDetialIdNotBetween(Integer value1, Integer value2) {
            addCriterion("glory_detial_id not between", value1, value2, "gloryDetialId");
            return (Criteria) this;
        }

        public Criteria andGloryUserIdIsNull() {
            addCriterion("glory_user_id is null");
            return (Criteria) this;
        }

        public Criteria andGloryUserIdIsNotNull() {
            addCriterion("glory_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andGloryUserIdEqualTo(Integer value) {
            addCriterion("glory_user_id =", value, "gloryUserId");
            return (Criteria) this;
        }

        public Criteria andGloryUserIdNotEqualTo(Integer value) {
            addCriterion("glory_user_id <>", value, "gloryUserId");
            return (Criteria) this;
        }

        public Criteria andGloryUserIdGreaterThan(Integer value) {
            addCriterion("glory_user_id >", value, "gloryUserId");
            return (Criteria) this;
        }

        public Criteria andGloryUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("glory_user_id >=", value, "gloryUserId");
            return (Criteria) this;
        }

        public Criteria andGloryUserIdLessThan(Integer value) {
            addCriterion("glory_user_id <", value, "gloryUserId");
            return (Criteria) this;
        }

        public Criteria andGloryUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("glory_user_id <=", value, "gloryUserId");
            return (Criteria) this;
        }

        public Criteria andGloryUserIdIn(List<Integer> values) {
            addCriterion("glory_user_id in", values, "gloryUserId");
            return (Criteria) this;
        }

        public Criteria andGloryUserIdNotIn(List<Integer> values) {
            addCriterion("glory_user_id not in", values, "gloryUserId");
            return (Criteria) this;
        }

        public Criteria andGloryUserIdBetween(Integer value1, Integer value2) {
            addCriterion("glory_user_id between", value1, value2, "gloryUserId");
            return (Criteria) this;
        }

        public Criteria andGloryUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("glory_user_id not between", value1, value2, "gloryUserId");
            return (Criteria) this;
        }

        public Criteria andGloryIdDIsNull() {
            addCriterion("glory_id_d is null");
            return (Criteria) this;
        }

        public Criteria andGloryIdDIsNotNull() {
            addCriterion("glory_id_d is not null");
            return (Criteria) this;
        }

        public Criteria andGloryIdDEqualTo(Integer value) {
            addCriterion("glory_id_d =", value, "gloryIdD");
            return (Criteria) this;
        }

        public Criteria andGloryIdDNotEqualTo(Integer value) {
            addCriterion("glory_id_d <>", value, "gloryIdD");
            return (Criteria) this;
        }

        public Criteria andGloryIdDGreaterThan(Integer value) {
            addCriterion("glory_id_d >", value, "gloryIdD");
            return (Criteria) this;
        }

        public Criteria andGloryIdDGreaterThanOrEqualTo(Integer value) {
            addCriterion("glory_id_d >=", value, "gloryIdD");
            return (Criteria) this;
        }

        public Criteria andGloryIdDLessThan(Integer value) {
            addCriterion("glory_id_d <", value, "gloryIdD");
            return (Criteria) this;
        }

        public Criteria andGloryIdDLessThanOrEqualTo(Integer value) {
            addCriterion("glory_id_d <=", value, "gloryIdD");
            return (Criteria) this;
        }

        public Criteria andGloryIdDIn(List<Integer> values) {
            addCriterion("glory_id_d in", values, "gloryIdD");
            return (Criteria) this;
        }

        public Criteria andGloryIdDNotIn(List<Integer> values) {
            addCriterion("glory_id_d not in", values, "gloryIdD");
            return (Criteria) this;
        }

        public Criteria andGloryIdDBetween(Integer value1, Integer value2) {
            addCriterion("glory_id_d between", value1, value2, "gloryIdD");
            return (Criteria) this;
        }

        public Criteria andGloryIdDNotBetween(Integer value1, Integer value2) {
            addCriterion("glory_id_d not between", value1, value2, "gloryIdD");
            return (Criteria) this;
        }

        public Criteria andAchieveStateIsNull() {
            addCriterion("achieve_state is null");
            return (Criteria) this;
        }

        public Criteria andAchieveStateIsNotNull() {
            addCriterion("achieve_state is not null");
            return (Criteria) this;
        }

        public Criteria andAchieveStateEqualTo(Integer value) {
            addCriterion("achieve_state =", value, "achieveState");
            return (Criteria) this;
        }

        public Criteria andAchieveStateNotEqualTo(Integer value) {
            addCriterion("achieve_state <>", value, "achieveState");
            return (Criteria) this;
        }

        public Criteria andAchieveStateGreaterThan(Integer value) {
            addCriterion("achieve_state >", value, "achieveState");
            return (Criteria) this;
        }

        public Criteria andAchieveStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("achieve_state >=", value, "achieveState");
            return (Criteria) this;
        }

        public Criteria andAchieveStateLessThan(Integer value) {
            addCriterion("achieve_state <", value, "achieveState");
            return (Criteria) this;
        }

        public Criteria andAchieveStateLessThanOrEqualTo(Integer value) {
            addCriterion("achieve_state <=", value, "achieveState");
            return (Criteria) this;
        }

        public Criteria andAchieveStateIn(List<Integer> values) {
            addCriterion("achieve_state in", values, "achieveState");
            return (Criteria) this;
        }

        public Criteria andAchieveStateNotIn(List<Integer> values) {
            addCriterion("achieve_state not in", values, "achieveState");
            return (Criteria) this;
        }

        public Criteria andAchieveStateBetween(Integer value1, Integer value2) {
            addCriterion("achieve_state between", value1, value2, "achieveState");
            return (Criteria) this;
        }

        public Criteria andAchieveStateNotBetween(Integer value1, Integer value2) {
            addCriterion("achieve_state not between", value1, value2, "achieveState");
            return (Criteria) this;
        }

        public Criteria andTotalProgressStepIsNull() {
            addCriterion("total_progress_step is null");
            return (Criteria) this;
        }

        public Criteria andTotalProgressStepIsNotNull() {
            addCriterion("total_progress_step is not null");
            return (Criteria) this;
        }

        public Criteria andTotalProgressStepEqualTo(Integer value) {
            addCriterion("total_progress_step =", value, "totalProgressStep");
            return (Criteria) this;
        }

        public Criteria andTotalProgressStepNotEqualTo(Integer value) {
            addCriterion("total_progress_step <>", value, "totalProgressStep");
            return (Criteria) this;
        }

        public Criteria andTotalProgressStepGreaterThan(Integer value) {
            addCriterion("total_progress_step >", value, "totalProgressStep");
            return (Criteria) this;
        }

        public Criteria andTotalProgressStepGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_progress_step >=", value, "totalProgressStep");
            return (Criteria) this;
        }

        public Criteria andTotalProgressStepLessThan(Integer value) {
            addCriterion("total_progress_step <", value, "totalProgressStep");
            return (Criteria) this;
        }

        public Criteria andTotalProgressStepLessThanOrEqualTo(Integer value) {
            addCriterion("total_progress_step <=", value, "totalProgressStep");
            return (Criteria) this;
        }

        public Criteria andTotalProgressStepIn(List<Integer> values) {
            addCriterion("total_progress_step in", values, "totalProgressStep");
            return (Criteria) this;
        }

        public Criteria andTotalProgressStepNotIn(List<Integer> values) {
            addCriterion("total_progress_step not in", values, "totalProgressStep");
            return (Criteria) this;
        }

        public Criteria andTotalProgressStepBetween(Integer value1, Integer value2) {
            addCriterion("total_progress_step between", value1, value2, "totalProgressStep");
            return (Criteria) this;
        }

        public Criteria andTotalProgressStepNotBetween(Integer value1, Integer value2) {
            addCriterion("total_progress_step not between", value1, value2, "totalProgressStep");
            return (Criteria) this;
        }

        public Criteria andProgressStepIsNull() {
            addCriterion("progress_step is null");
            return (Criteria) this;
        }

        public Criteria andProgressStepIsNotNull() {
            addCriterion("progress_step is not null");
            return (Criteria) this;
        }

        public Criteria andProgressStepEqualTo(Integer value) {
            addCriterion("progress_step =", value, "progressStep");
            return (Criteria) this;
        }

        public Criteria andProgressStepNotEqualTo(Integer value) {
            addCriterion("progress_step <>", value, "progressStep");
            return (Criteria) this;
        }

        public Criteria andProgressStepGreaterThan(Integer value) {
            addCriterion("progress_step >", value, "progressStep");
            return (Criteria) this;
        }

        public Criteria andProgressStepGreaterThanOrEqualTo(Integer value) {
            addCriterion("progress_step >=", value, "progressStep");
            return (Criteria) this;
        }

        public Criteria andProgressStepLessThan(Integer value) {
            addCriterion("progress_step <", value, "progressStep");
            return (Criteria) this;
        }

        public Criteria andProgressStepLessThanOrEqualTo(Integer value) {
            addCriterion("progress_step <=", value, "progressStep");
            return (Criteria) this;
        }

        public Criteria andProgressStepIn(List<Integer> values) {
            addCriterion("progress_step in", values, "progressStep");
            return (Criteria) this;
        }

        public Criteria andProgressStepNotIn(List<Integer> values) {
            addCriterion("progress_step not in", values, "progressStep");
            return (Criteria) this;
        }

        public Criteria andProgressStepBetween(Integer value1, Integer value2) {
            addCriterion("progress_step between", value1, value2, "progressStep");
            return (Criteria) this;
        }

        public Criteria andProgressStepNotBetween(Integer value1, Integer value2) {
            addCriterion("progress_step not between", value1, value2, "progressStep");
            return (Criteria) this;
        }

        public Criteria andAchieveCountIndexIsNull() {
            addCriterion("achieve_count_index is null");
            return (Criteria) this;
        }

        public Criteria andAchieveCountIndexIsNotNull() {
            addCriterion("achieve_count_index is not null");
            return (Criteria) this;
        }

        public Criteria andAchieveCountIndexEqualTo(Integer value) {
            addCriterion("achieve_count_index =", value, "achieveCountIndex");
            return (Criteria) this;
        }

        public Criteria andAchieveCountIndexNotEqualTo(Integer value) {
            addCriterion("achieve_count_index <>", value, "achieveCountIndex");
            return (Criteria) this;
        }

        public Criteria andAchieveCountIndexGreaterThan(Integer value) {
            addCriterion("achieve_count_index >", value, "achieveCountIndex");
            return (Criteria) this;
        }

        public Criteria andAchieveCountIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("achieve_count_index >=", value, "achieveCountIndex");
            return (Criteria) this;
        }

        public Criteria andAchieveCountIndexLessThan(Integer value) {
            addCriterion("achieve_count_index <", value, "achieveCountIndex");
            return (Criteria) this;
        }

        public Criteria andAchieveCountIndexLessThanOrEqualTo(Integer value) {
            addCriterion("achieve_count_index <=", value, "achieveCountIndex");
            return (Criteria) this;
        }

        public Criteria andAchieveCountIndexIn(List<Integer> values) {
            addCriterion("achieve_count_index in", values, "achieveCountIndex");
            return (Criteria) this;
        }

        public Criteria andAchieveCountIndexNotIn(List<Integer> values) {
            addCriterion("achieve_count_index not in", values, "achieveCountIndex");
            return (Criteria) this;
        }

        public Criteria andAchieveCountIndexBetween(Integer value1, Integer value2) {
            addCriterion("achieve_count_index between", value1, value2, "achieveCountIndex");
            return (Criteria) this;
        }

        public Criteria andAchieveCountIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("achieve_count_index not between", value1, value2, "achieveCountIndex");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeIsNull() {
            addCriterion("achieve_time is null");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeIsNotNull() {
            addCriterion("achieve_time is not null");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeEqualTo(Integer value) {
            addCriterion("achieve_time =", value, "achieveTime");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeNotEqualTo(Integer value) {
            addCriterion("achieve_time <>", value, "achieveTime");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeGreaterThan(Integer value) {
            addCriterion("achieve_time >", value, "achieveTime");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("achieve_time >=", value, "achieveTime");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeLessThan(Integer value) {
            addCriterion("achieve_time <", value, "achieveTime");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeLessThanOrEqualTo(Integer value) {
            addCriterion("achieve_time <=", value, "achieveTime");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeIn(List<Integer> values) {
            addCriterion("achieve_time in", values, "achieveTime");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeNotIn(List<Integer> values) {
            addCriterion("achieve_time not in", values, "achieveTime");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeBetween(Integer value1, Integer value2) {
            addCriterion("achieve_time between", value1, value2, "achieveTime");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("achieve_time not between", value1, value2, "achieveTime");
            return (Criteria) this;
        }

        public Criteria andSplashFlagIsNull() {
            addCriterion("splash_flag is null");
            return (Criteria) this;
        }

        public Criteria andSplashFlagIsNotNull() {
            addCriterion("splash_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSplashFlagEqualTo(String value) {
            addCriterion("splash_flag =", value, "splashFlag");
            return (Criteria) this;
        }

        public Criteria andSplashFlagNotEqualTo(String value) {
            addCriterion("splash_flag <>", value, "splashFlag");
            return (Criteria) this;
        }

        public Criteria andSplashFlagGreaterThan(String value) {
            addCriterion("splash_flag >", value, "splashFlag");
            return (Criteria) this;
        }

        public Criteria andSplashFlagGreaterThanOrEqualTo(String value) {
            addCriterion("splash_flag >=", value, "splashFlag");
            return (Criteria) this;
        }

        public Criteria andSplashFlagLessThan(String value) {
            addCriterion("splash_flag <", value, "splashFlag");
            return (Criteria) this;
        }

        public Criteria andSplashFlagLessThanOrEqualTo(String value) {
            addCriterion("splash_flag <=", value, "splashFlag");
            return (Criteria) this;
        }

        public Criteria andSplashFlagLike(String value) {
            addCriterion("splash_flag like", value, "splashFlag");
            return (Criteria) this;
        }

        public Criteria andSplashFlagNotLike(String value) {
            addCriterion("splash_flag not like", value, "splashFlag");
            return (Criteria) this;
        }

        public Criteria andSplashFlagIn(List<String> values) {
            addCriterion("splash_flag in", values, "splashFlag");
            return (Criteria) this;
        }

        public Criteria andSplashFlagNotIn(List<String> values) {
            addCriterion("splash_flag not in", values, "splashFlag");
            return (Criteria) this;
        }

        public Criteria andSplashFlagBetween(String value1, String value2) {
            addCriterion("splash_flag between", value1, value2, "splashFlag");
            return (Criteria) this;
        }

        public Criteria andSplashFlagNotBetween(String value1, String value2) {
            addCriterion("splash_flag not between", value1, value2, "splashFlag");
            return (Criteria) this;
        }

        public Criteria andExtraInfoIsNull() {
            addCriterion("extra_info is null");
            return (Criteria) this;
        }

        public Criteria andExtraInfoIsNotNull() {
            addCriterion("extra_info is not null");
            return (Criteria) this;
        }

        public Criteria andExtraInfoEqualTo(String value) {
            addCriterion("extra_info =", value, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoNotEqualTo(String value) {
            addCriterion("extra_info <>", value, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoGreaterThan(String value) {
            addCriterion("extra_info >", value, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoGreaterThanOrEqualTo(String value) {
            addCriterion("extra_info >=", value, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoLessThan(String value) {
            addCriterion("extra_info <", value, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoLessThanOrEqualTo(String value) {
            addCriterion("extra_info <=", value, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoLike(String value) {
            addCriterion("extra_info like", value, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoNotLike(String value) {
            addCriterion("extra_info not like", value, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoIn(List<String> values) {
            addCriterion("extra_info in", values, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoNotIn(List<String> values) {
            addCriterion("extra_info not in", values, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoBetween(String value1, String value2) {
            addCriterion("extra_info between", value1, value2, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoNotBetween(String value1, String value2) {
            addCriterion("extra_info not between", value1, value2, "extraInfo");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_glory_detials表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-10-18
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_glory_detials 2017-10-18
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