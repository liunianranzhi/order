package com.shanyuan.platform.ms.dao.user.entity;

import java.util.ArrayList;
import java.util.List;

public class SyCropInfoExample {
    /**
     * sy_corp_info
     */
    protected String orderByClause;

    /**
     * sy_corp_info
     */
    protected boolean distinct;

    /**
     * sy_corp_info
     */
    protected List<Criteria> oredCriteria;

    public SyCropInfoExample() {
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
     * sy_corp_info 2017-10-17
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

        public Criteria andChnlIdIsNull() {
            addCriterion("chnl_id is null");
            return (Criteria) this;
        }

        public Criteria andChnlIdIsNotNull() {
            addCriterion("chnl_id is not null");
            return (Criteria) this;
        }

        public Criteria andChnlIdEqualTo(String value) {
            addCriterion("chnl_id =", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdNotEqualTo(String value) {
            addCriterion("chnl_id <>", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdGreaterThan(String value) {
            addCriterion("chnl_id >", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdGreaterThanOrEqualTo(String value) {
            addCriterion("chnl_id >=", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdLessThan(String value) {
            addCriterion("chnl_id <", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdLessThanOrEqualTo(String value) {
            addCriterion("chnl_id <=", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdLike(String value) {
            addCriterion("chnl_id like", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdNotLike(String value) {
            addCriterion("chnl_id not like", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdIn(List<String> values) {
            addCriterion("chnl_id in", values, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdNotIn(List<String> values) {
            addCriterion("chnl_id not in", values, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdBetween(String value1, String value2) {
            addCriterion("chnl_id between", value1, value2, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdNotBetween(String value1, String value2) {
            addCriterion("chnl_id not between", value1, value2, "chnlId");
            return (Criteria) this;
        }

        public Criteria andCorpUidIsNull() {
            addCriterion("corp_uid is null");
            return (Criteria) this;
        }

        public Criteria andCorpUidIsNotNull() {
            addCriterion("corp_uid is not null");
            return (Criteria) this;
        }

        public Criteria andCorpUidEqualTo(String value) {
            addCriterion("corp_uid =", value, "corpUid");
            return (Criteria) this;
        }

        public Criteria andCorpUidNotEqualTo(String value) {
            addCriterion("corp_uid <>", value, "corpUid");
            return (Criteria) this;
        }

        public Criteria andCorpUidGreaterThan(String value) {
            addCriterion("corp_uid >", value, "corpUid");
            return (Criteria) this;
        }

        public Criteria andCorpUidGreaterThanOrEqualTo(String value) {
            addCriterion("corp_uid >=", value, "corpUid");
            return (Criteria) this;
        }

        public Criteria andCorpUidLessThan(String value) {
            addCriterion("corp_uid <", value, "corpUid");
            return (Criteria) this;
        }

        public Criteria andCorpUidLessThanOrEqualTo(String value) {
            addCriterion("corp_uid <=", value, "corpUid");
            return (Criteria) this;
        }

        public Criteria andCorpUidLike(String value) {
            addCriterion("corp_uid like", value, "corpUid");
            return (Criteria) this;
        }

        public Criteria andCorpUidNotLike(String value) {
            addCriterion("corp_uid not like", value, "corpUid");
            return (Criteria) this;
        }

        public Criteria andCorpUidIn(List<String> values) {
            addCriterion("corp_uid in", values, "corpUid");
            return (Criteria) this;
        }

        public Criteria andCorpUidNotIn(List<String> values) {
            addCriterion("corp_uid not in", values, "corpUid");
            return (Criteria) this;
        }

        public Criteria andCorpUidBetween(String value1, String value2) {
            addCriterion("corp_uid between", value1, value2, "corpUid");
            return (Criteria) this;
        }

        public Criteria andCorpUidNotBetween(String value1, String value2) {
            addCriterion("corp_uid not between", value1, value2, "corpUid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNull() {
            addCriterion("last_update is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNotNull() {
            addCriterion("last_update is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEqualTo(Integer value) {
            addCriterion("last_update =", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotEqualTo(Integer value) {
            addCriterion("last_update <>", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThan(Integer value) {
            addCriterion("last_update >", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_update >=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThan(Integer value) {
            addCriterion("last_update <", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThanOrEqualTo(Integer value) {
            addCriterion("last_update <=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIn(List<Integer> values) {
            addCriterion("last_update in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotIn(List<Integer> values) {
            addCriterion("last_update not in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBetween(Integer value1, Integer value2) {
            addCriterion("last_update between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotBetween(Integer value1, Integer value2) {
            addCriterion("last_update not between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andBindTimeIsNull() {
            addCriterion("bind_time is null");
            return (Criteria) this;
        }

        public Criteria andBindTimeIsNotNull() {
            addCriterion("bind_time is not null");
            return (Criteria) this;
        }

        public Criteria andBindTimeEqualTo(Integer value) {
            addCriterion("bind_time =", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotEqualTo(Integer value) {
            addCriterion("bind_time <>", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeGreaterThan(Integer value) {
            addCriterion("bind_time >", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bind_time >=", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeLessThan(Integer value) {
            addCriterion("bind_time <", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeLessThanOrEqualTo(Integer value) {
            addCriterion("bind_time <=", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeIn(List<Integer> values) {
            addCriterion("bind_time in", values, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotIn(List<Integer> values) {
            addCriterion("bind_time not in", values, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeBetween(Integer value1, Integer value2) {
            addCriterion("bind_time between", value1, value2, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("bind_time not between", value1, value2, "bindTime");
            return (Criteria) this;
        }

        public Criteria andLastBindTimeIsNull() {
            addCriterion("last_bind_time is null");
            return (Criteria) this;
        }

        public Criteria andLastBindTimeIsNotNull() {
            addCriterion("last_bind_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastBindTimeEqualTo(Integer value) {
            addCriterion("last_bind_time =", value, "lastBindTime");
            return (Criteria) this;
        }

        public Criteria andLastBindTimeNotEqualTo(Integer value) {
            addCriterion("last_bind_time <>", value, "lastBindTime");
            return (Criteria) this;
        }

        public Criteria andLastBindTimeGreaterThan(Integer value) {
            addCriterion("last_bind_time >", value, "lastBindTime");
            return (Criteria) this;
        }

        public Criteria andLastBindTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_bind_time >=", value, "lastBindTime");
            return (Criteria) this;
        }

        public Criteria andLastBindTimeLessThan(Integer value) {
            addCriterion("last_bind_time <", value, "lastBindTime");
            return (Criteria) this;
        }

        public Criteria andLastBindTimeLessThanOrEqualTo(Integer value) {
            addCriterion("last_bind_time <=", value, "lastBindTime");
            return (Criteria) this;
        }

        public Criteria andLastBindTimeIn(List<Integer> values) {
            addCriterion("last_bind_time in", values, "lastBindTime");
            return (Criteria) this;
        }

        public Criteria andLastBindTimeNotIn(List<Integer> values) {
            addCriterion("last_bind_time not in", values, "lastBindTime");
            return (Criteria) this;
        }

        public Criteria andLastBindTimeBetween(Integer value1, Integer value2) {
            addCriterion("last_bind_time between", value1, value2, "lastBindTime");
            return (Criteria) this;
        }

        public Criteria andLastBindTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_bind_time not between", value1, value2, "lastBindTime");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_corp_info表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-10-17
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_corp_info 2017-10-17
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