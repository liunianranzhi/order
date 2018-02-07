package com.shanyuan.platform.ms.dao.syshop.entity;

import java.util.ArrayList;
import java.util.List;

public class SyshopAreaExample {
    /**
     * sy_syshop_area
     */
    protected String orderByClause;

    /**
     * sy_syshop_area
     */
    protected boolean distinct;

    /**
     * sy_syshop_area
     */
    protected List<Criteria> oredCriteria;

    public SyshopAreaExample() {
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
     * sy_syshop_area 2017-11-02
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

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Integer value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Integer value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Integer value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Integer value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Integer> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Integer> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAreaStateIsNull() {
            addCriterion("area_state is null");
            return (Criteria) this;
        }

        public Criteria andAreaStateIsNotNull() {
            addCriterion("area_state is not null");
            return (Criteria) this;
        }

        public Criteria andAreaStateEqualTo(Byte value) {
            addCriterion("area_state =", value, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateNotEqualTo(Byte value) {
            addCriterion("area_state <>", value, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateGreaterThan(Byte value) {
            addCriterion("area_state >", value, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("area_state >=", value, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateLessThan(Byte value) {
            addCriterion("area_state <", value, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateLessThanOrEqualTo(Byte value) {
            addCriterion("area_state <=", value, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateIn(List<Byte> values) {
            addCriterion("area_state in", values, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateNotIn(List<Byte> values) {
            addCriterion("area_state not in", values, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateBetween(Byte value1, Byte value2) {
            addCriterion("area_state between", value1, value2, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateNotBetween(Byte value1, Byte value2) {
            addCriterion("area_state not between", value1, value2, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaLogoIsNull() {
            addCriterion("area_logo is null");
            return (Criteria) this;
        }

        public Criteria andAreaLogoIsNotNull() {
            addCriterion("area_logo is not null");
            return (Criteria) this;
        }

        public Criteria andAreaLogoEqualTo(String value) {
            addCriterion("area_logo =", value, "areaLogo");
            return (Criteria) this;
        }

        public Criteria andAreaLogoNotEqualTo(String value) {
            addCriterion("area_logo <>", value, "areaLogo");
            return (Criteria) this;
        }

        public Criteria andAreaLogoGreaterThan(String value) {
            addCriterion("area_logo >", value, "areaLogo");
            return (Criteria) this;
        }

        public Criteria andAreaLogoGreaterThanOrEqualTo(String value) {
            addCriterion("area_logo >=", value, "areaLogo");
            return (Criteria) this;
        }

        public Criteria andAreaLogoLessThan(String value) {
            addCriterion("area_logo <", value, "areaLogo");
            return (Criteria) this;
        }

        public Criteria andAreaLogoLessThanOrEqualTo(String value) {
            addCriterion("area_logo <=", value, "areaLogo");
            return (Criteria) this;
        }

        public Criteria andAreaLogoLike(String value) {
            addCriterion("area_logo like", value, "areaLogo");
            return (Criteria) this;
        }

        public Criteria andAreaLogoNotLike(String value) {
            addCriterion("area_logo not like", value, "areaLogo");
            return (Criteria) this;
        }

        public Criteria andAreaLogoIn(List<String> values) {
            addCriterion("area_logo in", values, "areaLogo");
            return (Criteria) this;
        }

        public Criteria andAreaLogoNotIn(List<String> values) {
            addCriterion("area_logo not in", values, "areaLogo");
            return (Criteria) this;
        }

        public Criteria andAreaLogoBetween(String value1, String value2) {
            addCriterion("area_logo between", value1, value2, "areaLogo");
            return (Criteria) this;
        }

        public Criteria andAreaLogoNotBetween(String value1, String value2) {
            addCriterion("area_logo not between", value1, value2, "areaLogo");
            return (Criteria) this;
        }

        public Criteria andAreaDesIsNull() {
            addCriterion("area_des is null");
            return (Criteria) this;
        }

        public Criteria andAreaDesIsNotNull() {
            addCriterion("area_des is not null");
            return (Criteria) this;
        }

        public Criteria andAreaDesEqualTo(String value) {
            addCriterion("area_des =", value, "areaDes");
            return (Criteria) this;
        }

        public Criteria andAreaDesNotEqualTo(String value) {
            addCriterion("area_des <>", value, "areaDes");
            return (Criteria) this;
        }

        public Criteria andAreaDesGreaterThan(String value) {
            addCriterion("area_des >", value, "areaDes");
            return (Criteria) this;
        }

        public Criteria andAreaDesGreaterThanOrEqualTo(String value) {
            addCriterion("area_des >=", value, "areaDes");
            return (Criteria) this;
        }

        public Criteria andAreaDesLessThan(String value) {
            addCriterion("area_des <", value, "areaDes");
            return (Criteria) this;
        }

        public Criteria andAreaDesLessThanOrEqualTo(String value) {
            addCriterion("area_des <=", value, "areaDes");
            return (Criteria) this;
        }

        public Criteria andAreaDesLike(String value) {
            addCriterion("area_des like", value, "areaDes");
            return (Criteria) this;
        }

        public Criteria andAreaDesNotLike(String value) {
            addCriterion("area_des not like", value, "areaDes");
            return (Criteria) this;
        }

        public Criteria andAreaDesIn(List<String> values) {
            addCriterion("area_des in", values, "areaDes");
            return (Criteria) this;
        }

        public Criteria andAreaDesNotIn(List<String> values) {
            addCriterion("area_des not in", values, "areaDes");
            return (Criteria) this;
        }

        public Criteria andAreaDesBetween(String value1, String value2) {
            addCriterion("area_des between", value1, value2, "areaDes");
            return (Criteria) this;
        }

        public Criteria andAreaDesNotBetween(String value1, String value2) {
            addCriterion("area_des not between", value1, value2, "areaDes");
            return (Criteria) this;
        }

        public Criteria andAreaSortIsNull() {
            addCriterion("area_sort is null");
            return (Criteria) this;
        }

        public Criteria andAreaSortIsNotNull() {
            addCriterion("area_sort is not null");
            return (Criteria) this;
        }

        public Criteria andAreaSortEqualTo(Integer value) {
            addCriterion("area_sort =", value, "areaSort");
            return (Criteria) this;
        }

        public Criteria andAreaSortNotEqualTo(Integer value) {
            addCriterion("area_sort <>", value, "areaSort");
            return (Criteria) this;
        }

        public Criteria andAreaSortGreaterThan(Integer value) {
            addCriterion("area_sort >", value, "areaSort");
            return (Criteria) this;
        }

        public Criteria andAreaSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_sort >=", value, "areaSort");
            return (Criteria) this;
        }

        public Criteria andAreaSortLessThan(Integer value) {
            addCriterion("area_sort <", value, "areaSort");
            return (Criteria) this;
        }

        public Criteria andAreaSortLessThanOrEqualTo(Integer value) {
            addCriterion("area_sort <=", value, "areaSort");
            return (Criteria) this;
        }

        public Criteria andAreaSortIn(List<Integer> values) {
            addCriterion("area_sort in", values, "areaSort");
            return (Criteria) this;
        }

        public Criteria andAreaSortNotIn(List<Integer> values) {
            addCriterion("area_sort not in", values, "areaSort");
            return (Criteria) this;
        }

        public Criteria andAreaSortBetween(Integer value1, Integer value2) {
            addCriterion("area_sort between", value1, value2, "areaSort");
            return (Criteria) this;
        }

        public Criteria andAreaSortNotBetween(Integer value1, Integer value2) {
            addCriterion("area_sort not between", value1, value2, "areaSort");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_syshop_area表的实体类
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
     * sy_syshop_area 2017-11-02
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