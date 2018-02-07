package com.shanyuan.platform.ms.dao.goods.entity;

import java.util.ArrayList;
import java.util.List;

public class SySupportAreaExample {
    /**
     * sy_support_area
     */
    protected String orderByClause;

    /**
     * sy_support_area
     */
    protected boolean distinct;

    /**
     * sy_support_area
     */
    protected List<Criteria> oredCriteria;

    public SySupportAreaExample() {
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
     * sy_support_area 2017-11-02
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

        public Criteria andAreaid1IsNull() {
            addCriterion("areaid_1 is null");
            return (Criteria) this;
        }

        public Criteria andAreaid1IsNotNull() {
            addCriterion("areaid_1 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaid1EqualTo(Long value) {
            addCriterion("areaid_1 =", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1NotEqualTo(Long value) {
            addCriterion("areaid_1 <>", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1GreaterThan(Long value) {
            addCriterion("areaid_1 >", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1GreaterThanOrEqualTo(Long value) {
            addCriterion("areaid_1 >=", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1LessThan(Long value) {
            addCriterion("areaid_1 <", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1LessThanOrEqualTo(Long value) {
            addCriterion("areaid_1 <=", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1In(List<Long> values) {
            addCriterion("areaid_1 in", values, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1NotIn(List<Long> values) {
            addCriterion("areaid_1 not in", values, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1Between(Long value1, Long value2) {
            addCriterion("areaid_1 between", value1, value2, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1NotBetween(Long value1, Long value2) {
            addCriterion("areaid_1 not between", value1, value2, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid2IsNull() {
            addCriterion("areaid_2 is null");
            return (Criteria) this;
        }

        public Criteria andAreaid2IsNotNull() {
            addCriterion("areaid_2 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaid2EqualTo(Long value) {
            addCriterion("areaid_2 =", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2NotEqualTo(Long value) {
            addCriterion("areaid_2 <>", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2GreaterThan(Long value) {
            addCriterion("areaid_2 >", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2GreaterThanOrEqualTo(Long value) {
            addCriterion("areaid_2 >=", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2LessThan(Long value) {
            addCriterion("areaid_2 <", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2LessThanOrEqualTo(Long value) {
            addCriterion("areaid_2 <=", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2In(List<Long> values) {
            addCriterion("areaid_2 in", values, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2NotIn(List<Long> values) {
            addCriterion("areaid_2 not in", values, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2Between(Long value1, Long value2) {
            addCriterion("areaid_2 between", value1, value2, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2NotBetween(Long value1, Long value2) {
            addCriterion("areaid_2 not between", value1, value2, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid3IsNull() {
            addCriterion("areaid_3 is null");
            return (Criteria) this;
        }

        public Criteria andAreaid3IsNotNull() {
            addCriterion("areaid_3 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaid3EqualTo(Long value) {
            addCriterion("areaid_3 =", value, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3NotEqualTo(Long value) {
            addCriterion("areaid_3 <>", value, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3GreaterThan(Long value) {
            addCriterion("areaid_3 >", value, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3GreaterThanOrEqualTo(Long value) {
            addCriterion("areaid_3 >=", value, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3LessThan(Long value) {
            addCriterion("areaid_3 <", value, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3LessThanOrEqualTo(Long value) {
            addCriterion("areaid_3 <=", value, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3In(List<Long> values) {
            addCriterion("areaid_3 in", values, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3NotIn(List<Long> values) {
            addCriterion("areaid_3 not in", values, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3Between(Long value1, Long value2) {
            addCriterion("areaid_3 between", value1, value2, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaid3NotBetween(Long value1, Long value2) {
            addCriterion("areaid_3 not between", value1, value2, "areaid3");
            return (Criteria) this;
        }

        public Criteria andAreaname1IsNull() {
            addCriterion("areaname_1 is null");
            return (Criteria) this;
        }

        public Criteria andAreaname1IsNotNull() {
            addCriterion("areaname_1 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaname1EqualTo(String value) {
            addCriterion("areaname_1 =", value, "areaname1");
            return (Criteria) this;
        }

        public Criteria andAreaname1NotEqualTo(String value) {
            addCriterion("areaname_1 <>", value, "areaname1");
            return (Criteria) this;
        }

        public Criteria andAreaname1GreaterThan(String value) {
            addCriterion("areaname_1 >", value, "areaname1");
            return (Criteria) this;
        }

        public Criteria andAreaname1GreaterThanOrEqualTo(String value) {
            addCriterion("areaname_1 >=", value, "areaname1");
            return (Criteria) this;
        }

        public Criteria andAreaname1LessThan(String value) {
            addCriterion("areaname_1 <", value, "areaname1");
            return (Criteria) this;
        }

        public Criteria andAreaname1LessThanOrEqualTo(String value) {
            addCriterion("areaname_1 <=", value, "areaname1");
            return (Criteria) this;
        }

        public Criteria andAreaname1Like(String value) {
            addCriterion("areaname_1 like", value, "areaname1");
            return (Criteria) this;
        }

        public Criteria andAreaname1NotLike(String value) {
            addCriterion("areaname_1 not like", value, "areaname1");
            return (Criteria) this;
        }

        public Criteria andAreaname1In(List<String> values) {
            addCriterion("areaname_1 in", values, "areaname1");
            return (Criteria) this;
        }

        public Criteria andAreaname1NotIn(List<String> values) {
            addCriterion("areaname_1 not in", values, "areaname1");
            return (Criteria) this;
        }

        public Criteria andAreaname1Between(String value1, String value2) {
            addCriterion("areaname_1 between", value1, value2, "areaname1");
            return (Criteria) this;
        }

        public Criteria andAreaname1NotBetween(String value1, String value2) {
            addCriterion("areaname_1 not between", value1, value2, "areaname1");
            return (Criteria) this;
        }

        public Criteria andAreaname2IsNull() {
            addCriterion("areaname_2 is null");
            return (Criteria) this;
        }

        public Criteria andAreaname2IsNotNull() {
            addCriterion("areaname_2 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaname2EqualTo(String value) {
            addCriterion("areaname_2 =", value, "areaname2");
            return (Criteria) this;
        }

        public Criteria andAreaname2NotEqualTo(String value) {
            addCriterion("areaname_2 <>", value, "areaname2");
            return (Criteria) this;
        }

        public Criteria andAreaname2GreaterThan(String value) {
            addCriterion("areaname_2 >", value, "areaname2");
            return (Criteria) this;
        }

        public Criteria andAreaname2GreaterThanOrEqualTo(String value) {
            addCriterion("areaname_2 >=", value, "areaname2");
            return (Criteria) this;
        }

        public Criteria andAreaname2LessThan(String value) {
            addCriterion("areaname_2 <", value, "areaname2");
            return (Criteria) this;
        }

        public Criteria andAreaname2LessThanOrEqualTo(String value) {
            addCriterion("areaname_2 <=", value, "areaname2");
            return (Criteria) this;
        }

        public Criteria andAreaname2Like(String value) {
            addCriterion("areaname_2 like", value, "areaname2");
            return (Criteria) this;
        }

        public Criteria andAreaname2NotLike(String value) {
            addCriterion("areaname_2 not like", value, "areaname2");
            return (Criteria) this;
        }

        public Criteria andAreaname2In(List<String> values) {
            addCriterion("areaname_2 in", values, "areaname2");
            return (Criteria) this;
        }

        public Criteria andAreaname2NotIn(List<String> values) {
            addCriterion("areaname_2 not in", values, "areaname2");
            return (Criteria) this;
        }

        public Criteria andAreaname2Between(String value1, String value2) {
            addCriterion("areaname_2 between", value1, value2, "areaname2");
            return (Criteria) this;
        }

        public Criteria andAreaname2NotBetween(String value1, String value2) {
            addCriterion("areaname_2 not between", value1, value2, "areaname2");
            return (Criteria) this;
        }

        public Criteria andAreaname3IsNull() {
            addCriterion("areaname_3 is null");
            return (Criteria) this;
        }

        public Criteria andAreaname3IsNotNull() {
            addCriterion("areaname_3 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaname3EqualTo(String value) {
            addCriterion("areaname_3 =", value, "areaname3");
            return (Criteria) this;
        }

        public Criteria andAreaname3NotEqualTo(String value) {
            addCriterion("areaname_3 <>", value, "areaname3");
            return (Criteria) this;
        }

        public Criteria andAreaname3GreaterThan(String value) {
            addCriterion("areaname_3 >", value, "areaname3");
            return (Criteria) this;
        }

        public Criteria andAreaname3GreaterThanOrEqualTo(String value) {
            addCriterion("areaname_3 >=", value, "areaname3");
            return (Criteria) this;
        }

        public Criteria andAreaname3LessThan(String value) {
            addCriterion("areaname_3 <", value, "areaname3");
            return (Criteria) this;
        }

        public Criteria andAreaname3LessThanOrEqualTo(String value) {
            addCriterion("areaname_3 <=", value, "areaname3");
            return (Criteria) this;
        }

        public Criteria andAreaname3Like(String value) {
            addCriterion("areaname_3 like", value, "areaname3");
            return (Criteria) this;
        }

        public Criteria andAreaname3NotLike(String value) {
            addCriterion("areaname_3 not like", value, "areaname3");
            return (Criteria) this;
        }

        public Criteria andAreaname3In(List<String> values) {
            addCriterion("areaname_3 in", values, "areaname3");
            return (Criteria) this;
        }

        public Criteria andAreaname3NotIn(List<String> values) {
            addCriterion("areaname_3 not in", values, "areaname3");
            return (Criteria) this;
        }

        public Criteria andAreaname3Between(String value1, String value2) {
            addCriterion("areaname_3 between", value1, value2, "areaname3");
            return (Criteria) this;
        }

        public Criteria andAreaname3NotBetween(String value1, String value2) {
            addCriterion("areaname_3 not between", value1, value2, "areaname3");
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
    }

    /**
     * 描述:sy_support_area表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2017-11-02
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_support_area 2017-11-02
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