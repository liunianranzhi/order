package com.shanyuan.platform.ms.dao.user.entity;

import java.util.ArrayList;
import java.util.List;

public class SyMemberImportTmpExample {
    /**
     * sy_member_import_tmp
     */
    protected String orderByClause;

    /**
     * sy_member_import_tmp
     */
    protected boolean distinct;

    /**
     * sy_member_import_tmp
     */
    protected List<Criteria> oredCriteria;

    public SyMemberImportTmpExample() {
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
     * sy_member_import_tmp 2017-10-19
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

        public Criteria andMemberMobileIsNull() {
            addCriterion("member_mobile is null");
            return (Criteria) this;
        }

        public Criteria andMemberMobileIsNotNull() {
            addCriterion("member_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMemberMobileEqualTo(String value) {
            addCriterion("member_mobile =", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotEqualTo(String value) {
            addCriterion("member_mobile <>", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileGreaterThan(String value) {
            addCriterion("member_mobile >", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileGreaterThanOrEqualTo(String value) {
            addCriterion("member_mobile >=", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileLessThan(String value) {
            addCriterion("member_mobile <", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileLessThanOrEqualTo(String value) {
            addCriterion("member_mobile <=", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileLike(String value) {
            addCriterion("member_mobile like", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotLike(String value) {
            addCriterion("member_mobile not like", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileIn(List<String> values) {
            addCriterion("member_mobile in", values, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotIn(List<String> values) {
            addCriterion("member_mobile not in", values, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileBetween(String value1, String value2) {
            addCriterion("member_mobile between", value1, value2, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotBetween(String value1, String value2) {
            addCriterion("member_mobile not between", value1, value2, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameIsNull() {
            addCriterion("member_truename is null");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameIsNotNull() {
            addCriterion("member_truename is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameEqualTo(String value) {
            addCriterion("member_truename =", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameNotEqualTo(String value) {
            addCriterion("member_truename <>", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameGreaterThan(String value) {
            addCriterion("member_truename >", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("member_truename >=", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameLessThan(String value) {
            addCriterion("member_truename <", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameLessThanOrEqualTo(String value) {
            addCriterion("member_truename <=", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameLike(String value) {
            addCriterion("member_truename like", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameNotLike(String value) {
            addCriterion("member_truename not like", value, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameIn(List<String> values) {
            addCriterion("member_truename in", values, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameNotIn(List<String> values) {
            addCriterion("member_truename not in", values, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameBetween(String value1, String value2) {
            addCriterion("member_truename between", value1, value2, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberTruenameNotBetween(String value1, String value2) {
            addCriterion("member_truename not between", value1, value2, "memberTruename");
            return (Criteria) this;
        }

        public Criteria andMemberSexIsNull() {
            addCriterion("member_sex is null");
            return (Criteria) this;
        }

        public Criteria andMemberSexIsNotNull() {
            addCriterion("member_sex is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSexEqualTo(Byte value) {
            addCriterion("member_sex =", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotEqualTo(Byte value) {
            addCriterion("member_sex <>", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThan(Byte value) {
            addCriterion("member_sex >", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("member_sex >=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThan(Byte value) {
            addCriterion("member_sex <", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThanOrEqualTo(Byte value) {
            addCriterion("member_sex <=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexIn(List<Byte> values) {
            addCriterion("member_sex in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotIn(List<Byte> values) {
            addCriterion("member_sex not in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexBetween(Byte value1, Byte value2) {
            addCriterion("member_sex between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotBetween(Byte value1, Byte value2) {
            addCriterion("member_sex not between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andCircleIdIsNull() {
            addCriterion("circle_id is null");
            return (Criteria) this;
        }

        public Criteria andCircleIdIsNotNull() {
            addCriterion("circle_id is not null");
            return (Criteria) this;
        }

        public Criteria andCircleIdEqualTo(Integer value) {
            addCriterion("circle_id =", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdNotEqualTo(Integer value) {
            addCriterion("circle_id <>", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdGreaterThan(Integer value) {
            addCriterion("circle_id >", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("circle_id >=", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdLessThan(Integer value) {
            addCriterion("circle_id <", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdLessThanOrEqualTo(Integer value) {
            addCriterion("circle_id <=", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdIn(List<Integer> values) {
            addCriterion("circle_id in", values, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdNotIn(List<Integer> values) {
            addCriterion("circle_id not in", values, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdBetween(Integer value1, Integer value2) {
            addCriterion("circle_id between", value1, value2, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("circle_id not between", value1, value2, "circleId");
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
    }

    /**
     * 描述:sy_member_import_tmp表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2017-10-19
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_member_import_tmp 2017-10-19
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