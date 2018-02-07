package com.shanyuan.platform.ms.dao.user.entity;

import java.util.ArrayList;
import java.util.List;

public class SyMessageExample {
    /**
     * sy_message
     */
    protected String orderByClause;

    /**
     * sy_message
     */
    protected boolean distinct;

    /**
     * sy_message
     */
    protected List<Criteria> oredCriteria;

    public SyMessageExample() {
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
     * sy_message 2017-10-16
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

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(Integer value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(Integer value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(Integer value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(Integer value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<Integer> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<Integer> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(Integer value1, Integer value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageParentIdIsNull() {
            addCriterion("message_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageParentIdIsNotNull() {
            addCriterion("message_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageParentIdEqualTo(Integer value) {
            addCriterion("message_parent_id =", value, "messageParentId");
            return (Criteria) this;
        }

        public Criteria andMessageParentIdNotEqualTo(Integer value) {
            addCriterion("message_parent_id <>", value, "messageParentId");
            return (Criteria) this;
        }

        public Criteria andMessageParentIdGreaterThan(Integer value) {
            addCriterion("message_parent_id >", value, "messageParentId");
            return (Criteria) this;
        }

        public Criteria andMessageParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_parent_id >=", value, "messageParentId");
            return (Criteria) this;
        }

        public Criteria andMessageParentIdLessThan(Integer value) {
            addCriterion("message_parent_id <", value, "messageParentId");
            return (Criteria) this;
        }

        public Criteria andMessageParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_parent_id <=", value, "messageParentId");
            return (Criteria) this;
        }

        public Criteria andMessageParentIdIn(List<Integer> values) {
            addCriterion("message_parent_id in", values, "messageParentId");
            return (Criteria) this;
        }

        public Criteria andMessageParentIdNotIn(List<Integer> values) {
            addCriterion("message_parent_id not in", values, "messageParentId");
            return (Criteria) this;
        }

        public Criteria andMessageParentIdBetween(Integer value1, Integer value2) {
            addCriterion("message_parent_id between", value1, value2, "messageParentId");
            return (Criteria) this;
        }

        public Criteria andMessageParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_parent_id not between", value1, value2, "messageParentId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdIsNull() {
            addCriterion("from_member_id is null");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdIsNotNull() {
            addCriterion("from_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdEqualTo(Integer value) {
            addCriterion("from_member_id =", value, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdNotEqualTo(Integer value) {
            addCriterion("from_member_id <>", value, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdGreaterThan(Integer value) {
            addCriterion("from_member_id >", value, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_member_id >=", value, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdLessThan(Integer value) {
            addCriterion("from_member_id <", value, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("from_member_id <=", value, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdIn(List<Integer> values) {
            addCriterion("from_member_id in", values, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdNotIn(List<Integer> values) {
            addCriterion("from_member_id not in", values, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("from_member_id between", value1, value2, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("from_member_id not between", value1, value2, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdIsNull() {
            addCriterion("to_member_id is null");
            return (Criteria) this;
        }

        public Criteria andToMemberIdIsNotNull() {
            addCriterion("to_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andToMemberIdEqualTo(String value) {
            addCriterion("to_member_id =", value, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdNotEqualTo(String value) {
            addCriterion("to_member_id <>", value, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdGreaterThan(String value) {
            addCriterion("to_member_id >", value, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("to_member_id >=", value, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdLessThan(String value) {
            addCriterion("to_member_id <", value, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdLessThanOrEqualTo(String value) {
            addCriterion("to_member_id <=", value, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdLike(String value) {
            addCriterion("to_member_id like", value, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdNotLike(String value) {
            addCriterion("to_member_id not like", value, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdIn(List<String> values) {
            addCriterion("to_member_id in", values, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdNotIn(List<String> values) {
            addCriterion("to_member_id not in", values, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdBetween(String value1, String value2) {
            addCriterion("to_member_id between", value1, value2, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdNotBetween(String value1, String value2) {
            addCriterion("to_member_id not between", value1, value2, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andMessageTitleIsNull() {
            addCriterion("message_title is null");
            return (Criteria) this;
        }

        public Criteria andMessageTitleIsNotNull() {
            addCriterion("message_title is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTitleEqualTo(String value) {
            addCriterion("message_title =", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotEqualTo(String value) {
            addCriterion("message_title <>", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleGreaterThan(String value) {
            addCriterion("message_title >", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleGreaterThanOrEqualTo(String value) {
            addCriterion("message_title >=", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLessThan(String value) {
            addCriterion("message_title <", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLessThanOrEqualTo(String value) {
            addCriterion("message_title <=", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLike(String value) {
            addCriterion("message_title like", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotLike(String value) {
            addCriterion("message_title not like", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleIn(List<String> values) {
            addCriterion("message_title in", values, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotIn(List<String> values) {
            addCriterion("message_title not in", values, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleBetween(String value1, String value2) {
            addCriterion("message_title between", value1, value2, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotBetween(String value1, String value2) {
            addCriterion("message_title not between", value1, value2, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageBodyIsNull() {
            addCriterion("message_body is null");
            return (Criteria) this;
        }

        public Criteria andMessageBodyIsNotNull() {
            addCriterion("message_body is not null");
            return (Criteria) this;
        }

        public Criteria andMessageBodyEqualTo(String value) {
            addCriterion("message_body =", value, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyNotEqualTo(String value) {
            addCriterion("message_body <>", value, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyGreaterThan(String value) {
            addCriterion("message_body >", value, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyGreaterThanOrEqualTo(String value) {
            addCriterion("message_body >=", value, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyLessThan(String value) {
            addCriterion("message_body <", value, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyLessThanOrEqualTo(String value) {
            addCriterion("message_body <=", value, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyLike(String value) {
            addCriterion("message_body like", value, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyNotLike(String value) {
            addCriterion("message_body not like", value, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyIn(List<String> values) {
            addCriterion("message_body in", values, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyNotIn(List<String> values) {
            addCriterion("message_body not in", values, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyBetween(String value1, String value2) {
            addCriterion("message_body between", value1, value2, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyNotBetween(String value1, String value2) {
            addCriterion("message_body not between", value1, value2, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIsNull() {
            addCriterion("message_time is null");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIsNotNull() {
            addCriterion("message_time is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTimeEqualTo(String value) {
            addCriterion("message_time =", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotEqualTo(String value) {
            addCriterion("message_time <>", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeGreaterThan(String value) {
            addCriterion("message_time >", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeGreaterThanOrEqualTo(String value) {
            addCriterion("message_time >=", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeLessThan(String value) {
            addCriterion("message_time <", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeLessThanOrEqualTo(String value) {
            addCriterion("message_time <=", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeLike(String value) {
            addCriterion("message_time like", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotLike(String value) {
            addCriterion("message_time not like", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIn(List<String> values) {
            addCriterion("message_time in", values, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotIn(List<String> values) {
            addCriterion("message_time not in", values, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeBetween(String value1, String value2) {
            addCriterion("message_time between", value1, value2, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotBetween(String value1, String value2) {
            addCriterion("message_time not between", value1, value2, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageUpdateTimeIsNull() {
            addCriterion("message_update_time is null");
            return (Criteria) this;
        }

        public Criteria andMessageUpdateTimeIsNotNull() {
            addCriterion("message_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUpdateTimeEqualTo(String value) {
            addCriterion("message_update_time =", value, "messageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMessageUpdateTimeNotEqualTo(String value) {
            addCriterion("message_update_time <>", value, "messageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMessageUpdateTimeGreaterThan(String value) {
            addCriterion("message_update_time >", value, "messageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMessageUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("message_update_time >=", value, "messageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMessageUpdateTimeLessThan(String value) {
            addCriterion("message_update_time <", value, "messageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMessageUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("message_update_time <=", value, "messageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMessageUpdateTimeLike(String value) {
            addCriterion("message_update_time like", value, "messageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMessageUpdateTimeNotLike(String value) {
            addCriterion("message_update_time not like", value, "messageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMessageUpdateTimeIn(List<String> values) {
            addCriterion("message_update_time in", values, "messageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMessageUpdateTimeNotIn(List<String> values) {
            addCriterion("message_update_time not in", values, "messageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMessageUpdateTimeBetween(String value1, String value2) {
            addCriterion("message_update_time between", value1, value2, "messageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMessageUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("message_update_time not between", value1, value2, "messageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMessageOpenIsNull() {
            addCriterion("message_open is null");
            return (Criteria) this;
        }

        public Criteria andMessageOpenIsNotNull() {
            addCriterion("message_open is not null");
            return (Criteria) this;
        }

        public Criteria andMessageOpenEqualTo(Byte value) {
            addCriterion("message_open =", value, "messageOpen");
            return (Criteria) this;
        }

        public Criteria andMessageOpenNotEqualTo(Byte value) {
            addCriterion("message_open <>", value, "messageOpen");
            return (Criteria) this;
        }

        public Criteria andMessageOpenGreaterThan(Byte value) {
            addCriterion("message_open >", value, "messageOpen");
            return (Criteria) this;
        }

        public Criteria andMessageOpenGreaterThanOrEqualTo(Byte value) {
            addCriterion("message_open >=", value, "messageOpen");
            return (Criteria) this;
        }

        public Criteria andMessageOpenLessThan(Byte value) {
            addCriterion("message_open <", value, "messageOpen");
            return (Criteria) this;
        }

        public Criteria andMessageOpenLessThanOrEqualTo(Byte value) {
            addCriterion("message_open <=", value, "messageOpen");
            return (Criteria) this;
        }

        public Criteria andMessageOpenIn(List<Byte> values) {
            addCriterion("message_open in", values, "messageOpen");
            return (Criteria) this;
        }

        public Criteria andMessageOpenNotIn(List<Byte> values) {
            addCriterion("message_open not in", values, "messageOpen");
            return (Criteria) this;
        }

        public Criteria andMessageOpenBetween(Byte value1, Byte value2) {
            addCriterion("message_open between", value1, value2, "messageOpen");
            return (Criteria) this;
        }

        public Criteria andMessageOpenNotBetween(Byte value1, Byte value2) {
            addCriterion("message_open not between", value1, value2, "messageOpen");
            return (Criteria) this;
        }

        public Criteria andMessageStateIsNull() {
            addCriterion("message_state is null");
            return (Criteria) this;
        }

        public Criteria andMessageStateIsNotNull() {
            addCriterion("message_state is not null");
            return (Criteria) this;
        }

        public Criteria andMessageStateEqualTo(Byte value) {
            addCriterion("message_state =", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateNotEqualTo(Byte value) {
            addCriterion("message_state <>", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateGreaterThan(Byte value) {
            addCriterion("message_state >", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("message_state >=", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateLessThan(Byte value) {
            addCriterion("message_state <", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateLessThanOrEqualTo(Byte value) {
            addCriterion("message_state <=", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateIn(List<Byte> values) {
            addCriterion("message_state in", values, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateNotIn(List<Byte> values) {
            addCriterion("message_state not in", values, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateBetween(Byte value1, Byte value2) {
            addCriterion("message_state between", value1, value2, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateNotBetween(Byte value1, Byte value2) {
            addCriterion("message_state not between", value1, value2, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIsNull() {
            addCriterion("message_type is null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIsNotNull() {
            addCriterion("message_type is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeEqualTo(Byte value) {
            addCriterion("message_type =", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotEqualTo(Byte value) {
            addCriterion("message_type <>", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThan(Byte value) {
            addCriterion("message_type >", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("message_type >=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThan(Byte value) {
            addCriterion("message_type <", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThanOrEqualTo(Byte value) {
            addCriterion("message_type <=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIn(List<Byte> values) {
            addCriterion("message_type in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotIn(List<Byte> values) {
            addCriterion("message_type not in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeBetween(Byte value1, Byte value2) {
            addCriterion("message_type between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("message_type not between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andReadMemberIdIsNull() {
            addCriterion("read_member_id is null");
            return (Criteria) this;
        }

        public Criteria andReadMemberIdIsNotNull() {
            addCriterion("read_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andReadMemberIdEqualTo(String value) {
            addCriterion("read_member_id =", value, "readMemberId");
            return (Criteria) this;
        }

        public Criteria andReadMemberIdNotEqualTo(String value) {
            addCriterion("read_member_id <>", value, "readMemberId");
            return (Criteria) this;
        }

        public Criteria andReadMemberIdGreaterThan(String value) {
            addCriterion("read_member_id >", value, "readMemberId");
            return (Criteria) this;
        }

        public Criteria andReadMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("read_member_id >=", value, "readMemberId");
            return (Criteria) this;
        }

        public Criteria andReadMemberIdLessThan(String value) {
            addCriterion("read_member_id <", value, "readMemberId");
            return (Criteria) this;
        }

        public Criteria andReadMemberIdLessThanOrEqualTo(String value) {
            addCriterion("read_member_id <=", value, "readMemberId");
            return (Criteria) this;
        }

        public Criteria andReadMemberIdLike(String value) {
            addCriterion("read_member_id like", value, "readMemberId");
            return (Criteria) this;
        }

        public Criteria andReadMemberIdNotLike(String value) {
            addCriterion("read_member_id not like", value, "readMemberId");
            return (Criteria) this;
        }

        public Criteria andReadMemberIdIn(List<String> values) {
            addCriterion("read_member_id in", values, "readMemberId");
            return (Criteria) this;
        }

        public Criteria andReadMemberIdNotIn(List<String> values) {
            addCriterion("read_member_id not in", values, "readMemberId");
            return (Criteria) this;
        }

        public Criteria andReadMemberIdBetween(String value1, String value2) {
            addCriterion("read_member_id between", value1, value2, "readMemberId");
            return (Criteria) this;
        }

        public Criteria andReadMemberIdNotBetween(String value1, String value2) {
            addCriterion("read_member_id not between", value1, value2, "readMemberId");
            return (Criteria) this;
        }

        public Criteria andDelMemberIdIsNull() {
            addCriterion("del_member_id is null");
            return (Criteria) this;
        }

        public Criteria andDelMemberIdIsNotNull() {
            addCriterion("del_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andDelMemberIdEqualTo(String value) {
            addCriterion("del_member_id =", value, "delMemberId");
            return (Criteria) this;
        }

        public Criteria andDelMemberIdNotEqualTo(String value) {
            addCriterion("del_member_id <>", value, "delMemberId");
            return (Criteria) this;
        }

        public Criteria andDelMemberIdGreaterThan(String value) {
            addCriterion("del_member_id >", value, "delMemberId");
            return (Criteria) this;
        }

        public Criteria andDelMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("del_member_id >=", value, "delMemberId");
            return (Criteria) this;
        }

        public Criteria andDelMemberIdLessThan(String value) {
            addCriterion("del_member_id <", value, "delMemberId");
            return (Criteria) this;
        }

        public Criteria andDelMemberIdLessThanOrEqualTo(String value) {
            addCriterion("del_member_id <=", value, "delMemberId");
            return (Criteria) this;
        }

        public Criteria andDelMemberIdLike(String value) {
            addCriterion("del_member_id like", value, "delMemberId");
            return (Criteria) this;
        }

        public Criteria andDelMemberIdNotLike(String value) {
            addCriterion("del_member_id not like", value, "delMemberId");
            return (Criteria) this;
        }

        public Criteria andDelMemberIdIn(List<String> values) {
            addCriterion("del_member_id in", values, "delMemberId");
            return (Criteria) this;
        }

        public Criteria andDelMemberIdNotIn(List<String> values) {
            addCriterion("del_member_id not in", values, "delMemberId");
            return (Criteria) this;
        }

        public Criteria andDelMemberIdBetween(String value1, String value2) {
            addCriterion("del_member_id between", value1, value2, "delMemberId");
            return (Criteria) this;
        }

        public Criteria andDelMemberIdNotBetween(String value1, String value2) {
            addCriterion("del_member_id not between", value1, value2, "delMemberId");
            return (Criteria) this;
        }

        public Criteria andMessageIsmoreIsNull() {
            addCriterion("message_ismore is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsmoreIsNotNull() {
            addCriterion("message_ismore is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIsmoreEqualTo(Byte value) {
            addCriterion("message_ismore =", value, "messageIsmore");
            return (Criteria) this;
        }

        public Criteria andMessageIsmoreNotEqualTo(Byte value) {
            addCriterion("message_ismore <>", value, "messageIsmore");
            return (Criteria) this;
        }

        public Criteria andMessageIsmoreGreaterThan(Byte value) {
            addCriterion("message_ismore >", value, "messageIsmore");
            return (Criteria) this;
        }

        public Criteria andMessageIsmoreGreaterThanOrEqualTo(Byte value) {
            addCriterion("message_ismore >=", value, "messageIsmore");
            return (Criteria) this;
        }

        public Criteria andMessageIsmoreLessThan(Byte value) {
            addCriterion("message_ismore <", value, "messageIsmore");
            return (Criteria) this;
        }

        public Criteria andMessageIsmoreLessThanOrEqualTo(Byte value) {
            addCriterion("message_ismore <=", value, "messageIsmore");
            return (Criteria) this;
        }

        public Criteria andMessageIsmoreIn(List<Byte> values) {
            addCriterion("message_ismore in", values, "messageIsmore");
            return (Criteria) this;
        }

        public Criteria andMessageIsmoreNotIn(List<Byte> values) {
            addCriterion("message_ismore not in", values, "messageIsmore");
            return (Criteria) this;
        }

        public Criteria andMessageIsmoreBetween(Byte value1, Byte value2) {
            addCriterion("message_ismore between", value1, value2, "messageIsmore");
            return (Criteria) this;
        }

        public Criteria andMessageIsmoreNotBetween(Byte value1, Byte value2) {
            addCriterion("message_ismore not between", value1, value2, "messageIsmore");
            return (Criteria) this;
        }

        public Criteria andFromMemberNameIsNull() {
            addCriterion("from_member_name is null");
            return (Criteria) this;
        }

        public Criteria andFromMemberNameIsNotNull() {
            addCriterion("from_member_name is not null");
            return (Criteria) this;
        }

        public Criteria andFromMemberNameEqualTo(String value) {
            addCriterion("from_member_name =", value, "fromMemberName");
            return (Criteria) this;
        }

        public Criteria andFromMemberNameNotEqualTo(String value) {
            addCriterion("from_member_name <>", value, "fromMemberName");
            return (Criteria) this;
        }

        public Criteria andFromMemberNameGreaterThan(String value) {
            addCriterion("from_member_name >", value, "fromMemberName");
            return (Criteria) this;
        }

        public Criteria andFromMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("from_member_name >=", value, "fromMemberName");
            return (Criteria) this;
        }

        public Criteria andFromMemberNameLessThan(String value) {
            addCriterion("from_member_name <", value, "fromMemberName");
            return (Criteria) this;
        }

        public Criteria andFromMemberNameLessThanOrEqualTo(String value) {
            addCriterion("from_member_name <=", value, "fromMemberName");
            return (Criteria) this;
        }

        public Criteria andFromMemberNameLike(String value) {
            addCriterion("from_member_name like", value, "fromMemberName");
            return (Criteria) this;
        }

        public Criteria andFromMemberNameNotLike(String value) {
            addCriterion("from_member_name not like", value, "fromMemberName");
            return (Criteria) this;
        }

        public Criteria andFromMemberNameIn(List<String> values) {
            addCriterion("from_member_name in", values, "fromMemberName");
            return (Criteria) this;
        }

        public Criteria andFromMemberNameNotIn(List<String> values) {
            addCriterion("from_member_name not in", values, "fromMemberName");
            return (Criteria) this;
        }

        public Criteria andFromMemberNameBetween(String value1, String value2) {
            addCriterion("from_member_name between", value1, value2, "fromMemberName");
            return (Criteria) this;
        }

        public Criteria andFromMemberNameNotBetween(String value1, String value2) {
            addCriterion("from_member_name not between", value1, value2, "fromMemberName");
            return (Criteria) this;
        }

        public Criteria andToMemberNameIsNull() {
            addCriterion("to_member_name is null");
            return (Criteria) this;
        }

        public Criteria andToMemberNameIsNotNull() {
            addCriterion("to_member_name is not null");
            return (Criteria) this;
        }

        public Criteria andToMemberNameEqualTo(String value) {
            addCriterion("to_member_name =", value, "toMemberName");
            return (Criteria) this;
        }

        public Criteria andToMemberNameNotEqualTo(String value) {
            addCriterion("to_member_name <>", value, "toMemberName");
            return (Criteria) this;
        }

        public Criteria andToMemberNameGreaterThan(String value) {
            addCriterion("to_member_name >", value, "toMemberName");
            return (Criteria) this;
        }

        public Criteria andToMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("to_member_name >=", value, "toMemberName");
            return (Criteria) this;
        }

        public Criteria andToMemberNameLessThan(String value) {
            addCriterion("to_member_name <", value, "toMemberName");
            return (Criteria) this;
        }

        public Criteria andToMemberNameLessThanOrEqualTo(String value) {
            addCriterion("to_member_name <=", value, "toMemberName");
            return (Criteria) this;
        }

        public Criteria andToMemberNameLike(String value) {
            addCriterion("to_member_name like", value, "toMemberName");
            return (Criteria) this;
        }

        public Criteria andToMemberNameNotLike(String value) {
            addCriterion("to_member_name not like", value, "toMemberName");
            return (Criteria) this;
        }

        public Criteria andToMemberNameIn(List<String> values) {
            addCriterion("to_member_name in", values, "toMemberName");
            return (Criteria) this;
        }

        public Criteria andToMemberNameNotIn(List<String> values) {
            addCriterion("to_member_name not in", values, "toMemberName");
            return (Criteria) this;
        }

        public Criteria andToMemberNameBetween(String value1, String value2) {
            addCriterion("to_member_name between", value1, value2, "toMemberName");
            return (Criteria) this;
        }

        public Criteria andToMemberNameNotBetween(String value1, String value2) {
            addCriterion("to_member_name not between", value1, value2, "toMemberName");
            return (Criteria) this;
        }

        public Criteria andLinkNameIsNull() {
            addCriterion("link_name is null");
            return (Criteria) this;
        }

        public Criteria andLinkNameIsNotNull() {
            addCriterion("link_name is not null");
            return (Criteria) this;
        }

        public Criteria andLinkNameEqualTo(String value) {
            addCriterion("link_name =", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotEqualTo(String value) {
            addCriterion("link_name <>", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameGreaterThan(String value) {
            addCriterion("link_name >", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameGreaterThanOrEqualTo(String value) {
            addCriterion("link_name >=", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLessThan(String value) {
            addCriterion("link_name <", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLessThanOrEqualTo(String value) {
            addCriterion("link_name <=", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLike(String value) {
            addCriterion("link_name like", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotLike(String value) {
            addCriterion("link_name not like", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameIn(List<String> values) {
            addCriterion("link_name in", values, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotIn(List<String> values) {
            addCriterion("link_name not in", values, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameBetween(String value1, String value2) {
            addCriterion("link_name between", value1, value2, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotBetween(String value1, String value2) {
            addCriterion("link_name not between", value1, value2, "linkName");
            return (Criteria) this;
        }

        public Criteria andMessageLinkIsNull() {
            addCriterion("message_link is null");
            return (Criteria) this;
        }

        public Criteria andMessageLinkIsNotNull() {
            addCriterion("message_link is not null");
            return (Criteria) this;
        }

        public Criteria andMessageLinkEqualTo(String value) {
            addCriterion("message_link =", value, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageLinkNotEqualTo(String value) {
            addCriterion("message_link <>", value, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageLinkGreaterThan(String value) {
            addCriterion("message_link >", value, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageLinkGreaterThanOrEqualTo(String value) {
            addCriterion("message_link >=", value, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageLinkLessThan(String value) {
            addCriterion("message_link <", value, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageLinkLessThanOrEqualTo(String value) {
            addCriterion("message_link <=", value, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageLinkLike(String value) {
            addCriterion("message_link like", value, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageLinkNotLike(String value) {
            addCriterion("message_link not like", value, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageLinkIn(List<String> values) {
            addCriterion("message_link in", values, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageLinkNotIn(List<String> values) {
            addCriterion("message_link not in", values, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageLinkBetween(String value1, String value2) {
            addCriterion("message_link between", value1, value2, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageLinkNotBetween(String value1, String value2) {
            addCriterion("message_link not between", value1, value2, "messageLink");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Long value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Long value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Long value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Long value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Long value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Long value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Long> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Long> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Long value1, Long value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Long value1, Long value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_message表的实体类
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
     * sy_message 2017-10-16
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