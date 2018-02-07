package com.shanyuan.platform.ms.dao.union.entity;

import java.util.ArrayList;
import java.util.List;

public class SyAreaChannelExample {
    /**
     * sy_area_channel
     */
    protected String orderByClause;

    /**
     * sy_area_channel
     */
    protected boolean distinct;

    /**
     * sy_area_channel
     */
    protected List<Criteria> oredCriteria;

    public SyAreaChannelExample() {
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
     * sy_area_channel 2017-11-08
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

        public Criteria andAcIdIsNull() {
            addCriterion("ac_id is null");
            return (Criteria) this;
        }

        public Criteria andAcIdIsNotNull() {
            addCriterion("ac_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcIdEqualTo(Integer value) {
            addCriterion("ac_id =", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotEqualTo(Integer value) {
            addCriterion("ac_id <>", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdGreaterThan(Integer value) {
            addCriterion("ac_id >", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ac_id >=", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLessThan(Integer value) {
            addCriterion("ac_id <", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLessThanOrEqualTo(Integer value) {
            addCriterion("ac_id <=", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdIn(List<Integer> values) {
            addCriterion("ac_id in", values, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotIn(List<Integer> values) {
            addCriterion("ac_id not in", values, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdBetween(Integer value1, Integer value2) {
            addCriterion("ac_id between", value1, value2, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ac_id not between", value1, value2, "acId");
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

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Long value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Long value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Long value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Long value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Long> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Long> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Long value1, Long value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSpecialtyStoreIsNull() {
            addCriterion("specialty_store is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyStoreIsNotNull() {
            addCriterion("specialty_store is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyStoreEqualTo(String value) {
            addCriterion("specialty_store =", value, "specialtyStore");
            return (Criteria) this;
        }

        public Criteria andSpecialtyStoreNotEqualTo(String value) {
            addCriterion("specialty_store <>", value, "specialtyStore");
            return (Criteria) this;
        }

        public Criteria andSpecialtyStoreGreaterThan(String value) {
            addCriterion("specialty_store >", value, "specialtyStore");
            return (Criteria) this;
        }

        public Criteria andSpecialtyStoreGreaterThanOrEqualTo(String value) {
            addCriterion("specialty_store >=", value, "specialtyStore");
            return (Criteria) this;
        }

        public Criteria andSpecialtyStoreLessThan(String value) {
            addCriterion("specialty_store <", value, "specialtyStore");
            return (Criteria) this;
        }

        public Criteria andSpecialtyStoreLessThanOrEqualTo(String value) {
            addCriterion("specialty_store <=", value, "specialtyStore");
            return (Criteria) this;
        }

        public Criteria andSpecialtyStoreLike(String value) {
            addCriterion("specialty_store like", value, "specialtyStore");
            return (Criteria) this;
        }

        public Criteria andSpecialtyStoreNotLike(String value) {
            addCriterion("specialty_store not like", value, "specialtyStore");
            return (Criteria) this;
        }

        public Criteria andSpecialtyStoreIn(List<String> values) {
            addCriterion("specialty_store in", values, "specialtyStore");
            return (Criteria) this;
        }

        public Criteria andSpecialtyStoreNotIn(List<String> values) {
            addCriterion("specialty_store not in", values, "specialtyStore");
            return (Criteria) this;
        }

        public Criteria andSpecialtyStoreBetween(String value1, String value2) {
            addCriterion("specialty_store between", value1, value2, "specialtyStore");
            return (Criteria) this;
        }

        public Criteria andSpecialtyStoreNotBetween(String value1, String value2) {
            addCriterion("specialty_store not between", value1, value2, "specialtyStore");
            return (Criteria) this;
        }

        public Criteria andStoreScoreIsNull() {
            addCriterion("store_score is null");
            return (Criteria) this;
        }

        public Criteria andStoreScoreIsNotNull() {
            addCriterion("store_score is not null");
            return (Criteria) this;
        }

        public Criteria andStoreScoreEqualTo(Short value) {
            addCriterion("store_score =", value, "storeScore");
            return (Criteria) this;
        }

        public Criteria andStoreScoreNotEqualTo(Short value) {
            addCriterion("store_score <>", value, "storeScore");
            return (Criteria) this;
        }

        public Criteria andStoreScoreGreaterThan(Short value) {
            addCriterion("store_score >", value, "storeScore");
            return (Criteria) this;
        }

        public Criteria andStoreScoreGreaterThanOrEqualTo(Short value) {
            addCriterion("store_score >=", value, "storeScore");
            return (Criteria) this;
        }

        public Criteria andStoreScoreLessThan(Short value) {
            addCriterion("store_score <", value, "storeScore");
            return (Criteria) this;
        }

        public Criteria andStoreScoreLessThanOrEqualTo(Short value) {
            addCriterion("store_score <=", value, "storeScore");
            return (Criteria) this;
        }

        public Criteria andStoreScoreIn(List<Short> values) {
            addCriterion("store_score in", values, "storeScore");
            return (Criteria) this;
        }

        public Criteria andStoreScoreNotIn(List<Short> values) {
            addCriterion("store_score not in", values, "storeScore");
            return (Criteria) this;
        }

        public Criteria andStoreScoreBetween(Short value1, Short value2) {
            addCriterion("store_score between", value1, value2, "storeScore");
            return (Criteria) this;
        }

        public Criteria andStoreScoreNotBetween(Short value1, Short value2) {
            addCriterion("store_score not between", value1, value2, "storeScore");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_area_channel表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2017-11-08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_area_channel 2017-11-08
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