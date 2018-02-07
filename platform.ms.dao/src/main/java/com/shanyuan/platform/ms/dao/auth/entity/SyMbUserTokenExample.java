package com.shanyuan.platform.ms.dao.auth.entity;

import java.util.ArrayList;
import java.util.List;

public class SyMbUserTokenExample {
    /**
     * sy_mb_user_token
     */
    protected String orderByClause;

    /**
     * sy_mb_user_token
     */
    protected boolean distinct;

    /**
     * sy_mb_user_token
     */
    protected List<Criteria> oredCriteria;

    public SyMbUserTokenExample() {
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
     * sy_mb_user_token 2017-10-16
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

        public Criteria andTokenIdIsNull() {
            addCriterion("token_id is null");
            return (Criteria) this;
        }

        public Criteria andTokenIdIsNotNull() {
            addCriterion("token_id is not null");
            return (Criteria) this;
        }

        public Criteria andTokenIdEqualTo(Integer value) {
            addCriterion("token_id =", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotEqualTo(Integer value) {
            addCriterion("token_id <>", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdGreaterThan(Integer value) {
            addCriterion("token_id >", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("token_id >=", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdLessThan(Integer value) {
            addCriterion("token_id <", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdLessThanOrEqualTo(Integer value) {
            addCriterion("token_id <=", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdIn(List<Integer> values) {
            addCriterion("token_id in", values, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotIn(List<Integer> values) {
            addCriterion("token_id not in", values, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdBetween(Integer value1, Integer value2) {
            addCriterion("token_id between", value1, value2, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotBetween(Integer value1, Integer value2) {
            addCriterion("token_id not between", value1, value2, "tokenId");
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

        public Criteria andMemberNameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "memberName");
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

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Integer value) {
            addCriterion("login_time =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Integer value) {
            addCriterion("login_time <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Integer value) {
            addCriterion("login_time >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_time >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Integer value) {
            addCriterion("login_time <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Integer value) {
            addCriterion("login_time <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Integer> values) {
            addCriterion("login_time in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Integer> values) {
            addCriterion("login_time not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Integer value1, Integer value2) {
            addCriterion("login_time between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("login_time not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNull() {
            addCriterion("client_type is null");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNotNull() {
            addCriterion("client_type is not null");
            return (Criteria) this;
        }

        public Criteria andClientTypeEqualTo(String value) {
            addCriterion("client_type =", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotEqualTo(String value) {
            addCriterion("client_type <>", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThan(String value) {
            addCriterion("client_type >", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThanOrEqualTo(String value) {
            addCriterion("client_type >=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThan(String value) {
            addCriterion("client_type <", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThanOrEqualTo(String value) {
            addCriterion("client_type <=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLike(String value) {
            addCriterion("client_type like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotLike(String value) {
            addCriterion("client_type not like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeIn(List<String> values) {
            addCriterion("client_type in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotIn(List<String> values) {
            addCriterion("client_type not in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeBetween(String value1, String value2) {
            addCriterion("client_type between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotBetween(String value1, String value2) {
            addCriterion("client_type not between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelIsNull() {
            addCriterion("register_channel is null");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelIsNotNull() {
            addCriterion("register_channel is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelEqualTo(String value) {
            addCriterion("register_channel =", value, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelNotEqualTo(String value) {
            addCriterion("register_channel <>", value, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelGreaterThan(String value) {
            addCriterion("register_channel >", value, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelGreaterThanOrEqualTo(String value) {
            addCriterion("register_channel >=", value, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelLessThan(String value) {
            addCriterion("register_channel <", value, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelLessThanOrEqualTo(String value) {
            addCriterion("register_channel <=", value, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelLike(String value) {
            addCriterion("register_channel like", value, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelNotLike(String value) {
            addCriterion("register_channel not like", value, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelIn(List<String> values) {
            addCriterion("register_channel in", values, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelNotIn(List<String> values) {
            addCriterion("register_channel not in", values, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelBetween(String value1, String value2) {
            addCriterion("register_channel between", value1, value2, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelNotBetween(String value1, String value2) {
            addCriterion("register_channel not between", value1, value2, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andPromotionIdxIsNull() {
            addCriterion("promotion_idx is null");
            return (Criteria) this;
        }

        public Criteria andPromotionIdxIsNotNull() {
            addCriterion("promotion_idx is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionIdxEqualTo(Integer value) {
            addCriterion("promotion_idx =", value, "promotionIdx");
            return (Criteria) this;
        }

        public Criteria andPromotionIdxNotEqualTo(Integer value) {
            addCriterion("promotion_idx <>", value, "promotionIdx");
            return (Criteria) this;
        }

        public Criteria andPromotionIdxGreaterThan(Integer value) {
            addCriterion("promotion_idx >", value, "promotionIdx");
            return (Criteria) this;
        }

        public Criteria andPromotionIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("promotion_idx >=", value, "promotionIdx");
            return (Criteria) this;
        }

        public Criteria andPromotionIdxLessThan(Integer value) {
            addCriterion("promotion_idx <", value, "promotionIdx");
            return (Criteria) this;
        }

        public Criteria andPromotionIdxLessThanOrEqualTo(Integer value) {
            addCriterion("promotion_idx <=", value, "promotionIdx");
            return (Criteria) this;
        }

        public Criteria andPromotionIdxIn(List<Integer> values) {
            addCriterion("promotion_idx in", values, "promotionIdx");
            return (Criteria) this;
        }

        public Criteria andPromotionIdxNotIn(List<Integer> values) {
            addCriterion("promotion_idx not in", values, "promotionIdx");
            return (Criteria) this;
        }

        public Criteria andPromotionIdxBetween(Integer value1, Integer value2) {
            addCriterion("promotion_idx between", value1, value2, "promotionIdx");
            return (Criteria) this;
        }

        public Criteria andPromotionIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("promotion_idx not between", value1, value2, "promotionIdx");
            return (Criteria) this;
        }

        public Criteria andAppVariantIsNull() {
            addCriterion("app_variant is null");
            return (Criteria) this;
        }

        public Criteria andAppVariantIsNotNull() {
            addCriterion("app_variant is not null");
            return (Criteria) this;
        }

        public Criteria andAppVariantEqualTo(String value) {
            addCriterion("app_variant =", value, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantNotEqualTo(String value) {
            addCriterion("app_variant <>", value, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantGreaterThan(String value) {
            addCriterion("app_variant >", value, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantGreaterThanOrEqualTo(String value) {
            addCriterion("app_variant >=", value, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantLessThan(String value) {
            addCriterion("app_variant <", value, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantLessThanOrEqualTo(String value) {
            addCriterion("app_variant <=", value, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantLike(String value) {
            addCriterion("app_variant like", value, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantNotLike(String value) {
            addCriterion("app_variant not like", value, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantIn(List<String> values) {
            addCriterion("app_variant in", values, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantNotIn(List<String> values) {
            addCriterion("app_variant not in", values, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantBetween(String value1, String value2) {
            addCriterion("app_variant between", value1, value2, "appVariant");
            return (Criteria) this;
        }

        public Criteria andAppVariantNotBetween(String value1, String value2) {
            addCriterion("app_variant not between", value1, value2, "appVariant");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_mb_user_token表的实体类
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
     * sy_mb_user_token 2017-10-16
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