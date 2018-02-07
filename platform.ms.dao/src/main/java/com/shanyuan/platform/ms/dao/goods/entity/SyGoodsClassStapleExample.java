package com.shanyuan.platform.ms.dao.goods.entity;

import java.util.ArrayList;
import java.util.List;

public class SyGoodsClassStapleExample {
    /**
     * sy_goods_class_staple
     */
    protected String orderByClause;

    /**
     * sy_goods_class_staple
     */
    protected boolean distinct;

    /**
     * sy_goods_class_staple
     */
    protected List<Criteria> oredCriteria;

    public SyGoodsClassStapleExample() {
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
     * sy_goods_class_staple 2017-10-16
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

        public Criteria andStapleIdIsNull() {
            addCriterion("staple_id is null");
            return (Criteria) this;
        }

        public Criteria andStapleIdIsNotNull() {
            addCriterion("staple_id is not null");
            return (Criteria) this;
        }

        public Criteria andStapleIdEqualTo(Integer value) {
            addCriterion("staple_id =", value, "stapleId");
            return (Criteria) this;
        }

        public Criteria andStapleIdNotEqualTo(Integer value) {
            addCriterion("staple_id <>", value, "stapleId");
            return (Criteria) this;
        }

        public Criteria andStapleIdGreaterThan(Integer value) {
            addCriterion("staple_id >", value, "stapleId");
            return (Criteria) this;
        }

        public Criteria andStapleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staple_id >=", value, "stapleId");
            return (Criteria) this;
        }

        public Criteria andStapleIdLessThan(Integer value) {
            addCriterion("staple_id <", value, "stapleId");
            return (Criteria) this;
        }

        public Criteria andStapleIdLessThanOrEqualTo(Integer value) {
            addCriterion("staple_id <=", value, "stapleId");
            return (Criteria) this;
        }

        public Criteria andStapleIdIn(List<Integer> values) {
            addCriterion("staple_id in", values, "stapleId");
            return (Criteria) this;
        }

        public Criteria andStapleIdNotIn(List<Integer> values) {
            addCriterion("staple_id not in", values, "stapleId");
            return (Criteria) this;
        }

        public Criteria andStapleIdBetween(Integer value1, Integer value2) {
            addCriterion("staple_id between", value1, value2, "stapleId");
            return (Criteria) this;
        }

        public Criteria andStapleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staple_id not between", value1, value2, "stapleId");
            return (Criteria) this;
        }

        public Criteria andStapleNameIsNull() {
            addCriterion("staple_name is null");
            return (Criteria) this;
        }

        public Criteria andStapleNameIsNotNull() {
            addCriterion("staple_name is not null");
            return (Criteria) this;
        }

        public Criteria andStapleNameEqualTo(String value) {
            addCriterion("staple_name =", value, "stapleName");
            return (Criteria) this;
        }

        public Criteria andStapleNameNotEqualTo(String value) {
            addCriterion("staple_name <>", value, "stapleName");
            return (Criteria) this;
        }

        public Criteria andStapleNameGreaterThan(String value) {
            addCriterion("staple_name >", value, "stapleName");
            return (Criteria) this;
        }

        public Criteria andStapleNameGreaterThanOrEqualTo(String value) {
            addCriterion("staple_name >=", value, "stapleName");
            return (Criteria) this;
        }

        public Criteria andStapleNameLessThan(String value) {
            addCriterion("staple_name <", value, "stapleName");
            return (Criteria) this;
        }

        public Criteria andStapleNameLessThanOrEqualTo(String value) {
            addCriterion("staple_name <=", value, "stapleName");
            return (Criteria) this;
        }

        public Criteria andStapleNameLike(String value) {
            addCriterion("staple_name like", value, "stapleName");
            return (Criteria) this;
        }

        public Criteria andStapleNameNotLike(String value) {
            addCriterion("staple_name not like", value, "stapleName");
            return (Criteria) this;
        }

        public Criteria andStapleNameIn(List<String> values) {
            addCriterion("staple_name in", values, "stapleName");
            return (Criteria) this;
        }

        public Criteria andStapleNameNotIn(List<String> values) {
            addCriterion("staple_name not in", values, "stapleName");
            return (Criteria) this;
        }

        public Criteria andStapleNameBetween(String value1, String value2) {
            addCriterion("staple_name between", value1, value2, "stapleName");
            return (Criteria) this;
        }

        public Criteria andStapleNameNotBetween(String value1, String value2) {
            addCriterion("staple_name not between", value1, value2, "stapleName");
            return (Criteria) this;
        }

        public Criteria andGcId1IsNull() {
            addCriterion("gc_id_1 is null");
            return (Criteria) this;
        }

        public Criteria andGcId1IsNotNull() {
            addCriterion("gc_id_1 is not null");
            return (Criteria) this;
        }

        public Criteria andGcId1EqualTo(Integer value) {
            addCriterion("gc_id_1 =", value, "gcId1");
            return (Criteria) this;
        }

        public Criteria andGcId1NotEqualTo(Integer value) {
            addCriterion("gc_id_1 <>", value, "gcId1");
            return (Criteria) this;
        }

        public Criteria andGcId1GreaterThan(Integer value) {
            addCriterion("gc_id_1 >", value, "gcId1");
            return (Criteria) this;
        }

        public Criteria andGcId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("gc_id_1 >=", value, "gcId1");
            return (Criteria) this;
        }

        public Criteria andGcId1LessThan(Integer value) {
            addCriterion("gc_id_1 <", value, "gcId1");
            return (Criteria) this;
        }

        public Criteria andGcId1LessThanOrEqualTo(Integer value) {
            addCriterion("gc_id_1 <=", value, "gcId1");
            return (Criteria) this;
        }

        public Criteria andGcId1In(List<Integer> values) {
            addCriterion("gc_id_1 in", values, "gcId1");
            return (Criteria) this;
        }

        public Criteria andGcId1NotIn(List<Integer> values) {
            addCriterion("gc_id_1 not in", values, "gcId1");
            return (Criteria) this;
        }

        public Criteria andGcId1Between(Integer value1, Integer value2) {
            addCriterion("gc_id_1 between", value1, value2, "gcId1");
            return (Criteria) this;
        }

        public Criteria andGcId1NotBetween(Integer value1, Integer value2) {
            addCriterion("gc_id_1 not between", value1, value2, "gcId1");
            return (Criteria) this;
        }

        public Criteria andGcId2IsNull() {
            addCriterion("gc_id_2 is null");
            return (Criteria) this;
        }

        public Criteria andGcId2IsNotNull() {
            addCriterion("gc_id_2 is not null");
            return (Criteria) this;
        }

        public Criteria andGcId2EqualTo(Integer value) {
            addCriterion("gc_id_2 =", value, "gcId2");
            return (Criteria) this;
        }

        public Criteria andGcId2NotEqualTo(Integer value) {
            addCriterion("gc_id_2 <>", value, "gcId2");
            return (Criteria) this;
        }

        public Criteria andGcId2GreaterThan(Integer value) {
            addCriterion("gc_id_2 >", value, "gcId2");
            return (Criteria) this;
        }

        public Criteria andGcId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("gc_id_2 >=", value, "gcId2");
            return (Criteria) this;
        }

        public Criteria andGcId2LessThan(Integer value) {
            addCriterion("gc_id_2 <", value, "gcId2");
            return (Criteria) this;
        }

        public Criteria andGcId2LessThanOrEqualTo(Integer value) {
            addCriterion("gc_id_2 <=", value, "gcId2");
            return (Criteria) this;
        }

        public Criteria andGcId2In(List<Integer> values) {
            addCriterion("gc_id_2 in", values, "gcId2");
            return (Criteria) this;
        }

        public Criteria andGcId2NotIn(List<Integer> values) {
            addCriterion("gc_id_2 not in", values, "gcId2");
            return (Criteria) this;
        }

        public Criteria andGcId2Between(Integer value1, Integer value2) {
            addCriterion("gc_id_2 between", value1, value2, "gcId2");
            return (Criteria) this;
        }

        public Criteria andGcId2NotBetween(Integer value1, Integer value2) {
            addCriterion("gc_id_2 not between", value1, value2, "gcId2");
            return (Criteria) this;
        }

        public Criteria andGcId3IsNull() {
            addCriterion("gc_id_3 is null");
            return (Criteria) this;
        }

        public Criteria andGcId3IsNotNull() {
            addCriterion("gc_id_3 is not null");
            return (Criteria) this;
        }

        public Criteria andGcId3EqualTo(Integer value) {
            addCriterion("gc_id_3 =", value, "gcId3");
            return (Criteria) this;
        }

        public Criteria andGcId3NotEqualTo(Integer value) {
            addCriterion("gc_id_3 <>", value, "gcId3");
            return (Criteria) this;
        }

        public Criteria andGcId3GreaterThan(Integer value) {
            addCriterion("gc_id_3 >", value, "gcId3");
            return (Criteria) this;
        }

        public Criteria andGcId3GreaterThanOrEqualTo(Integer value) {
            addCriterion("gc_id_3 >=", value, "gcId3");
            return (Criteria) this;
        }

        public Criteria andGcId3LessThan(Integer value) {
            addCriterion("gc_id_3 <", value, "gcId3");
            return (Criteria) this;
        }

        public Criteria andGcId3LessThanOrEqualTo(Integer value) {
            addCriterion("gc_id_3 <=", value, "gcId3");
            return (Criteria) this;
        }

        public Criteria andGcId3In(List<Integer> values) {
            addCriterion("gc_id_3 in", values, "gcId3");
            return (Criteria) this;
        }

        public Criteria andGcId3NotIn(List<Integer> values) {
            addCriterion("gc_id_3 not in", values, "gcId3");
            return (Criteria) this;
        }

        public Criteria andGcId3Between(Integer value1, Integer value2) {
            addCriterion("gc_id_3 between", value1, value2, "gcId3");
            return (Criteria) this;
        }

        public Criteria andGcId3NotBetween(Integer value1, Integer value2) {
            addCriterion("gc_id_3 not between", value1, value2, "gcId3");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
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

        public Criteria andCounterIsNull() {
            addCriterion("counter is null");
            return (Criteria) this;
        }

        public Criteria andCounterIsNotNull() {
            addCriterion("counter is not null");
            return (Criteria) this;
        }

        public Criteria andCounterEqualTo(Integer value) {
            addCriterion("counter =", value, "counter");
            return (Criteria) this;
        }

        public Criteria andCounterNotEqualTo(Integer value) {
            addCriterion("counter <>", value, "counter");
            return (Criteria) this;
        }

        public Criteria andCounterGreaterThan(Integer value) {
            addCriterion("counter >", value, "counter");
            return (Criteria) this;
        }

        public Criteria andCounterGreaterThanOrEqualTo(Integer value) {
            addCriterion("counter >=", value, "counter");
            return (Criteria) this;
        }

        public Criteria andCounterLessThan(Integer value) {
            addCriterion("counter <", value, "counter");
            return (Criteria) this;
        }

        public Criteria andCounterLessThanOrEqualTo(Integer value) {
            addCriterion("counter <=", value, "counter");
            return (Criteria) this;
        }

        public Criteria andCounterIn(List<Integer> values) {
            addCriterion("counter in", values, "counter");
            return (Criteria) this;
        }

        public Criteria andCounterNotIn(List<Integer> values) {
            addCriterion("counter not in", values, "counter");
            return (Criteria) this;
        }

        public Criteria andCounterBetween(Integer value1, Integer value2) {
            addCriterion("counter between", value1, value2, "counter");
            return (Criteria) this;
        }

        public Criteria andCounterNotBetween(Integer value1, Integer value2) {
            addCriterion("counter not between", value1, value2, "counter");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_goods_class_staple表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2017-10-16
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_goods_class_staple 2017-10-16
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