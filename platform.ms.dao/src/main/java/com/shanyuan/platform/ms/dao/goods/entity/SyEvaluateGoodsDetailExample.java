package com.shanyuan.platform.ms.dao.goods.entity;

import java.util.ArrayList;
import java.util.List;

public class SyEvaluateGoodsDetailExample {
    /**
     * sy_evaluate_goods_detail
     */
    protected String orderByClause;

    /**
     * sy_evaluate_goods_detail
     */
    protected boolean distinct;

    /**
     * sy_evaluate_goods_detail
     */
    protected List<Criteria> oredCriteria;

    public SyEvaluateGoodsDetailExample() {
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
     * sy_evaluate_goods_detail 2017-10-19
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

        public Criteria andGevalDetailIdIsNull() {
            addCriterion("geval_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andGevalDetailIdIsNotNull() {
            addCriterion("geval_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andGevalDetailIdEqualTo(Integer value) {
            addCriterion("geval_detail_id =", value, "gevalDetailId");
            return (Criteria) this;
        }

        public Criteria andGevalDetailIdNotEqualTo(Integer value) {
            addCriterion("geval_detail_id <>", value, "gevalDetailId");
            return (Criteria) this;
        }

        public Criteria andGevalDetailIdGreaterThan(Integer value) {
            addCriterion("geval_detail_id >", value, "gevalDetailId");
            return (Criteria) this;
        }

        public Criteria andGevalDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("geval_detail_id >=", value, "gevalDetailId");
            return (Criteria) this;
        }

        public Criteria andGevalDetailIdLessThan(Integer value) {
            addCriterion("geval_detail_id <", value, "gevalDetailId");
            return (Criteria) this;
        }

        public Criteria andGevalDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("geval_detail_id <=", value, "gevalDetailId");
            return (Criteria) this;
        }

        public Criteria andGevalDetailIdIn(List<Integer> values) {
            addCriterion("geval_detail_id in", values, "gevalDetailId");
            return (Criteria) this;
        }

        public Criteria andGevalDetailIdNotIn(List<Integer> values) {
            addCriterion("geval_detail_id not in", values, "gevalDetailId");
            return (Criteria) this;
        }

        public Criteria andGevalDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("geval_detail_id between", value1, value2, "gevalDetailId");
            return (Criteria) this;
        }

        public Criteria andGevalDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("geval_detail_id not between", value1, value2, "gevalDetailId");
            return (Criteria) this;
        }

        public Criteria andGevalIdIsNull() {
            addCriterion("geval_id is null");
            return (Criteria) this;
        }

        public Criteria andGevalIdIsNotNull() {
            addCriterion("geval_id is not null");
            return (Criteria) this;
        }

        public Criteria andGevalIdEqualTo(Integer value) {
            addCriterion("geval_id =", value, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdNotEqualTo(Integer value) {
            addCriterion("geval_id <>", value, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdGreaterThan(Integer value) {
            addCriterion("geval_id >", value, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("geval_id >=", value, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdLessThan(Integer value) {
            addCriterion("geval_id <", value, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdLessThanOrEqualTo(Integer value) {
            addCriterion("geval_id <=", value, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdIn(List<Integer> values) {
            addCriterion("geval_id in", values, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdNotIn(List<Integer> values) {
            addCriterion("geval_id not in", values, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdBetween(Integer value1, Integer value2) {
            addCriterion("geval_id between", value1, value2, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("geval_id not between", value1, value2, "gevalId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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

        public Criteria andEdittimeIsNull() {
            addCriterion("edittime is null");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNotNull() {
            addCriterion("edittime is not null");
            return (Criteria) this;
        }

        public Criteria andEdittimeEqualTo(Integer value) {
            addCriterion("edittime =", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotEqualTo(Integer value) {
            addCriterion("edittime <>", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThan(Integer value) {
            addCriterion("edittime >", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("edittime >=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThan(Integer value) {
            addCriterion("edittime <", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThanOrEqualTo(Integer value) {
            addCriterion("edittime <=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIn(List<Integer> values) {
            addCriterion("edittime in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotIn(List<Integer> values) {
            addCriterion("edittime not in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeBetween(Integer value1, Integer value2) {
            addCriterion("edittime between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotBetween(Integer value1, Integer value2) {
            addCriterion("edittime not between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andReplyerIdIsNull() {
            addCriterion("replyer_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyerIdIsNotNull() {
            addCriterion("replyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyerIdEqualTo(Integer value) {
            addCriterion("replyer_id =", value, "replyerId");
            return (Criteria) this;
        }

        public Criteria andReplyerIdNotEqualTo(Integer value) {
            addCriterion("replyer_id <>", value, "replyerId");
            return (Criteria) this;
        }

        public Criteria andReplyerIdGreaterThan(Integer value) {
            addCriterion("replyer_id >", value, "replyerId");
            return (Criteria) this;
        }

        public Criteria andReplyerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("replyer_id >=", value, "replyerId");
            return (Criteria) this;
        }

        public Criteria andReplyerIdLessThan(Integer value) {
            addCriterion("replyer_id <", value, "replyerId");
            return (Criteria) this;
        }

        public Criteria andReplyerIdLessThanOrEqualTo(Integer value) {
            addCriterion("replyer_id <=", value, "replyerId");
            return (Criteria) this;
        }

        public Criteria andReplyerIdIn(List<Integer> values) {
            addCriterion("replyer_id in", values, "replyerId");
            return (Criteria) this;
        }

        public Criteria andReplyerIdNotIn(List<Integer> values) {
            addCriterion("replyer_id not in", values, "replyerId");
            return (Criteria) this;
        }

        public Criteria andReplyerIdBetween(Integer value1, Integer value2) {
            addCriterion("replyer_id between", value1, value2, "replyerId");
            return (Criteria) this;
        }

        public Criteria andReplyerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("replyer_id not between", value1, value2, "replyerId");
            return (Criteria) this;
        }

        public Criteria andReplyerNameIsNull() {
            addCriterion("replyer_name is null");
            return (Criteria) this;
        }

        public Criteria andReplyerNameIsNotNull() {
            addCriterion("replyer_name is not null");
            return (Criteria) this;
        }

        public Criteria andReplyerNameEqualTo(String value) {
            addCriterion("replyer_name =", value, "replyerName");
            return (Criteria) this;
        }

        public Criteria andReplyerNameNotEqualTo(String value) {
            addCriterion("replyer_name <>", value, "replyerName");
            return (Criteria) this;
        }

        public Criteria andReplyerNameGreaterThan(String value) {
            addCriterion("replyer_name >", value, "replyerName");
            return (Criteria) this;
        }

        public Criteria andReplyerNameGreaterThanOrEqualTo(String value) {
            addCriterion("replyer_name >=", value, "replyerName");
            return (Criteria) this;
        }

        public Criteria andReplyerNameLessThan(String value) {
            addCriterion("replyer_name <", value, "replyerName");
            return (Criteria) this;
        }

        public Criteria andReplyerNameLessThanOrEqualTo(String value) {
            addCriterion("replyer_name <=", value, "replyerName");
            return (Criteria) this;
        }

        public Criteria andReplyerNameLike(String value) {
            addCriterion("replyer_name like", value, "replyerName");
            return (Criteria) this;
        }

        public Criteria andReplyerNameNotLike(String value) {
            addCriterion("replyer_name not like", value, "replyerName");
            return (Criteria) this;
        }

        public Criteria andReplyerNameIn(List<String> values) {
            addCriterion("replyer_name in", values, "replyerName");
            return (Criteria) this;
        }

        public Criteria andReplyerNameNotIn(List<String> values) {
            addCriterion("replyer_name not in", values, "replyerName");
            return (Criteria) this;
        }

        public Criteria andReplyerNameBetween(String value1, String value2) {
            addCriterion("replyer_name between", value1, value2, "replyerName");
            return (Criteria) this;
        }

        public Criteria andReplyerNameNotBetween(String value1, String value2) {
            addCriterion("replyer_name not between", value1, value2, "replyerName");
            return (Criteria) this;
        }

        public Criteria andToIdIsNull() {
            addCriterion("to_id is null");
            return (Criteria) this;
        }

        public Criteria andToIdIsNotNull() {
            addCriterion("to_id is not null");
            return (Criteria) this;
        }

        public Criteria andToIdEqualTo(Integer value) {
            addCriterion("to_id =", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdNotEqualTo(Integer value) {
            addCriterion("to_id <>", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdGreaterThan(Integer value) {
            addCriterion("to_id >", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_id >=", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdLessThan(Integer value) {
            addCriterion("to_id <", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdLessThanOrEqualTo(Integer value) {
            addCriterion("to_id <=", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdIn(List<Integer> values) {
            addCriterion("to_id in", values, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdNotIn(List<Integer> values) {
            addCriterion("to_id not in", values, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdBetween(Integer value1, Integer value2) {
            addCriterion("to_id between", value1, value2, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdNotBetween(Integer value1, Integer value2) {
            addCriterion("to_id not between", value1, value2, "toId");
            return (Criteria) this;
        }

        public Criteria andToNameIsNull() {
            addCriterion("to_name is null");
            return (Criteria) this;
        }

        public Criteria andToNameIsNotNull() {
            addCriterion("to_name is not null");
            return (Criteria) this;
        }

        public Criteria andToNameEqualTo(String value) {
            addCriterion("to_name =", value, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameNotEqualTo(String value) {
            addCriterion("to_name <>", value, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameGreaterThan(String value) {
            addCriterion("to_name >", value, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameGreaterThanOrEqualTo(String value) {
            addCriterion("to_name >=", value, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameLessThan(String value) {
            addCriterion("to_name <", value, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameLessThanOrEqualTo(String value) {
            addCriterion("to_name <=", value, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameLike(String value) {
            addCriterion("to_name like", value, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameNotLike(String value) {
            addCriterion("to_name not like", value, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameIn(List<String> values) {
            addCriterion("to_name in", values, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameNotIn(List<String> values) {
            addCriterion("to_name not in", values, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameBetween(String value1, String value2) {
            addCriterion("to_name between", value1, value2, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameNotBetween(String value1, String value2) {
            addCriterion("to_name not between", value1, value2, "toName");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_evaluate_goods_detail表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-10-19
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_evaluate_goods_detail 2017-10-19
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