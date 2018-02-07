package com.shanyuan.platform.ms.dao.statistics.entity;

import java.util.ArrayList;
import java.util.List;

public class PointDetailsCountExample {
    /**
     * statistics_point_details_count
     */
    protected String orderByClause;
    
    protected String groupByClause;

    public String getGroupByClause() {
		return groupByClause;
	}

	public void setGroupByClause(String groupByClause) {
		this.groupByClause = groupByClause;
	}

	/**
     * statistics_point_details_count
     */
    protected boolean distinct;

    /**
     * statistics_point_details_count
     */
    protected List<Criteria> oredCriteria;

    public PointDetailsCountExample() {
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
     * statistics_point_details_count 2018-01-23
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

        public Criteria andUnionChannelIsNull() {
            addCriterion("union_channel is null");
            return (Criteria) this;
        }

        public Criteria andUnionChannelIsNotNull() {
            addCriterion("union_channel is not null");
            return (Criteria) this;
        }

        public Criteria andUnionChannelEqualTo(String value) {
            addCriterion("union_channel =", value, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelNotEqualTo(String value) {
            addCriterion("union_channel <>", value, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelGreaterThan(String value) {
            addCriterion("union_channel >", value, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelGreaterThanOrEqualTo(String value) {
            addCriterion("union_channel >=", value, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelLessThan(String value) {
            addCriterion("union_channel <", value, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelLessThanOrEqualTo(String value) {
            addCriterion("union_channel <=", value, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelLike(String value) {
            addCriterion("union_channel like", value, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelNotLike(String value) {
            addCriterion("union_channel not like", value, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelIn(List<String> values) {
            addCriterion("union_channel in", values, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelNotIn(List<String> values) {
            addCriterion("union_channel not in", values, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelBetween(String value1, String value2) {
            addCriterion("union_channel between", value1, value2, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelNotBetween(String value1, String value2) {
            addCriterion("union_channel not between", value1, value2, "unionChannel");
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

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(Long value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(Long value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(Long value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(Long value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(Long value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(Long value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<Long> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<Long> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(Long value1, Long value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(Long value1, Long value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("total_num is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("total_num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(Integer value) {
            addCriterion("total_num =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(Integer value) {
            addCriterion("total_num <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(Integer value) {
            addCriterion("total_num >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_num >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(Integer value) {
            addCriterion("total_num <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("total_num <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<Integer> values) {
            addCriterion("total_num in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<Integer> values) {
            addCriterion("total_num not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("total_num between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_num not between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andValidNumIsNull() {
            addCriterion("valid_num is null");
            return (Criteria) this;
        }

        public Criteria andValidNumIsNotNull() {
            addCriterion("valid_num is not null");
            return (Criteria) this;
        }

        public Criteria andValidNumEqualTo(Integer value) {
            addCriterion("valid_num =", value, "validNum");
            return (Criteria) this;
        }

        public Criteria andValidNumNotEqualTo(Integer value) {
            addCriterion("valid_num <>", value, "validNum");
            return (Criteria) this;
        }

        public Criteria andValidNumGreaterThan(Integer value) {
            addCriterion("valid_num >", value, "validNum");
            return (Criteria) this;
        }

        public Criteria andValidNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid_num >=", value, "validNum");
            return (Criteria) this;
        }

        public Criteria andValidNumLessThan(Integer value) {
            addCriterion("valid_num <", value, "validNum");
            return (Criteria) this;
        }

        public Criteria andValidNumLessThanOrEqualTo(Integer value) {
            addCriterion("valid_num <=", value, "validNum");
            return (Criteria) this;
        }

        public Criteria andValidNumIn(List<Integer> values) {
            addCriterion("valid_num in", values, "validNum");
            return (Criteria) this;
        }

        public Criteria andValidNumNotIn(List<Integer> values) {
            addCriterion("valid_num not in", values, "validNum");
            return (Criteria) this;
        }

        public Criteria andValidNumBetween(Integer value1, Integer value2) {
            addCriterion("valid_num between", value1, value2, "validNum");
            return (Criteria) this;
        }

        public Criteria andValidNumNotBetween(Integer value1, Integer value2) {
            addCriterion("valid_num not between", value1, value2, "validNum");
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
     * 描述:statistics_point_details_count表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2018-01-23
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * statistics_point_details_count 2018-01-23
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