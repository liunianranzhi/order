package com.shanyuan.platform.ms.dao.user.entity;

import java.util.ArrayList;
import java.util.List;

public class SyIndexPopExample {
    /**
     * sy_index_pop
     */
    protected String orderByClause;

    /**
     * sy_index_pop
     */
    protected boolean distinct;

    /**
     * sy_index_pop
     */
    protected List<Criteria> oredCriteria;

    public SyIndexPopExample() {
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
     * sy_index_pop 2017-11-16
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

        public Criteria andPopIdIsNull() {
            addCriterion("pop_id is null");
            return (Criteria) this;
        }

        public Criteria andPopIdIsNotNull() {
            addCriterion("pop_id is not null");
            return (Criteria) this;
        }

        public Criteria andPopIdEqualTo(Integer value) {
            addCriterion("pop_id =", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdNotEqualTo(Integer value) {
            addCriterion("pop_id <>", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdGreaterThan(Integer value) {
            addCriterion("pop_id >", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pop_id >=", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdLessThan(Integer value) {
            addCriterion("pop_id <", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdLessThanOrEqualTo(Integer value) {
            addCriterion("pop_id <=", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdIn(List<Integer> values) {
            addCriterion("pop_id in", values, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdNotIn(List<Integer> values) {
            addCriterion("pop_id not in", values, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdBetween(Integer value1, Integer value2) {
            addCriterion("pop_id between", value1, value2, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pop_id not between", value1, value2, "popId");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andTouchUrlIsNull() {
            addCriterion("touch_url is null");
            return (Criteria) this;
        }

        public Criteria andTouchUrlIsNotNull() {
            addCriterion("touch_url is not null");
            return (Criteria) this;
        }

        public Criteria andTouchUrlEqualTo(String value) {
            addCriterion("touch_url =", value, "touchUrl");
            return (Criteria) this;
        }

        public Criteria andTouchUrlNotEqualTo(String value) {
            addCriterion("touch_url <>", value, "touchUrl");
            return (Criteria) this;
        }

        public Criteria andTouchUrlGreaterThan(String value) {
            addCriterion("touch_url >", value, "touchUrl");
            return (Criteria) this;
        }

        public Criteria andTouchUrlGreaterThanOrEqualTo(String value) {
            addCriterion("touch_url >=", value, "touchUrl");
            return (Criteria) this;
        }

        public Criteria andTouchUrlLessThan(String value) {
            addCriterion("touch_url <", value, "touchUrl");
            return (Criteria) this;
        }

        public Criteria andTouchUrlLessThanOrEqualTo(String value) {
            addCriterion("touch_url <=", value, "touchUrl");
            return (Criteria) this;
        }

        public Criteria andTouchUrlLike(String value) {
            addCriterion("touch_url like", value, "touchUrl");
            return (Criteria) this;
        }

        public Criteria andTouchUrlNotLike(String value) {
            addCriterion("touch_url not like", value, "touchUrl");
            return (Criteria) this;
        }

        public Criteria andTouchUrlIn(List<String> values) {
            addCriterion("touch_url in", values, "touchUrl");
            return (Criteria) this;
        }

        public Criteria andTouchUrlNotIn(List<String> values) {
            addCriterion("touch_url not in", values, "touchUrl");
            return (Criteria) this;
        }

        public Criteria andTouchUrlBetween(String value1, String value2) {
            addCriterion("touch_url between", value1, value2, "touchUrl");
            return (Criteria) this;
        }

        public Criteria andTouchUrlNotBetween(String value1, String value2) {
            addCriterion("touch_url not between", value1, value2, "touchUrl");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeIsNull() {
            addCriterion("offline_time is null");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeIsNotNull() {
            addCriterion("offline_time is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeEqualTo(Integer value) {
            addCriterion("offline_time =", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeNotEqualTo(Integer value) {
            addCriterion("offline_time <>", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeGreaterThan(Integer value) {
            addCriterion("offline_time >", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("offline_time >=", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeLessThan(Integer value) {
            addCriterion("offline_time <", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeLessThanOrEqualTo(Integer value) {
            addCriterion("offline_time <=", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeIn(List<Integer> values) {
            addCriterion("offline_time in", values, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeNotIn(List<Integer> values) {
            addCriterion("offline_time not in", values, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeBetween(Integer value1, Integer value2) {
            addCriterion("offline_time between", value1, value2, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("offline_time not between", value1, value2, "offlineTime");
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
     * 描述:sy_index_pop表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2017-11-16
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_index_pop 2017-11-16
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