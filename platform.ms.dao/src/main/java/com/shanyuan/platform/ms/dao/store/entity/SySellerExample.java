package com.shanyuan.platform.ms.dao.store.entity;

import java.util.ArrayList;
import java.util.List;

public class SySellerExample {
    /**
     * sy_seller
     */
    protected String orderByClause;

    /**
     * sy_seller
     */
    protected boolean distinct;

    /**
     * sy_seller
     */
    protected List<Criteria> oredCriteria;

    public SySellerExample() {
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
     * sy_seller 2017-10-17
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

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Integer value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Integer value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Integer value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Integer value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Integer> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Integer> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNull() {
            addCriterion("seller_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("seller_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("seller_name =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("seller_name <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("seller_name >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_name >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("seller_name <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("seller_name <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("seller_name like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("seller_name not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("seller_name in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("seller_name not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("seller_name between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("seller_name not between", value1, value2, "sellerName");
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

        public Criteria andSellerGroupIdIsNull() {
            addCriterion("seller_group_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerGroupIdIsNotNull() {
            addCriterion("seller_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerGroupIdEqualTo(Integer value) {
            addCriterion("seller_group_id =", value, "sellerGroupId");
            return (Criteria) this;
        }

        public Criteria andSellerGroupIdNotEqualTo(Integer value) {
            addCriterion("seller_group_id <>", value, "sellerGroupId");
            return (Criteria) this;
        }

        public Criteria andSellerGroupIdGreaterThan(Integer value) {
            addCriterion("seller_group_id >", value, "sellerGroupId");
            return (Criteria) this;
        }

        public Criteria andSellerGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_group_id >=", value, "sellerGroupId");
            return (Criteria) this;
        }

        public Criteria andSellerGroupIdLessThan(Integer value) {
            addCriterion("seller_group_id <", value, "sellerGroupId");
            return (Criteria) this;
        }

        public Criteria andSellerGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_group_id <=", value, "sellerGroupId");
            return (Criteria) this;
        }

        public Criteria andSellerGroupIdIn(List<Integer> values) {
            addCriterion("seller_group_id in", values, "sellerGroupId");
            return (Criteria) this;
        }

        public Criteria andSellerGroupIdNotIn(List<Integer> values) {
            addCriterion("seller_group_id not in", values, "sellerGroupId");
            return (Criteria) this;
        }

        public Criteria andSellerGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_group_id between", value1, value2, "sellerGroupId");
            return (Criteria) this;
        }

        public Criteria andSellerGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_group_id not between", value1, value2, "sellerGroupId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNull() {
            addCriterion("is_admin is null");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNotNull() {
            addCriterion("is_admin is not null");
            return (Criteria) this;
        }

        public Criteria andIsAdminEqualTo(Byte value) {
            addCriterion("is_admin =", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotEqualTo(Byte value) {
            addCriterion("is_admin <>", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThan(Byte value) {
            addCriterion("is_admin >", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_admin >=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThan(Byte value) {
            addCriterion("is_admin <", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThanOrEqualTo(Byte value) {
            addCriterion("is_admin <=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminIn(List<Byte> values) {
            addCriterion("is_admin in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotIn(List<Byte> values) {
            addCriterion("is_admin not in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminBetween(Byte value1, Byte value2) {
            addCriterion("is_admin between", value1, value2, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotBetween(Byte value1, Byte value2) {
            addCriterion("is_admin not between", value1, value2, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andSellerQuicklinkIsNull() {
            addCriterion("seller_quicklink is null");
            return (Criteria) this;
        }

        public Criteria andSellerQuicklinkIsNotNull() {
            addCriterion("seller_quicklink is not null");
            return (Criteria) this;
        }

        public Criteria andSellerQuicklinkEqualTo(String value) {
            addCriterion("seller_quicklink =", value, "sellerQuicklink");
            return (Criteria) this;
        }

        public Criteria andSellerQuicklinkNotEqualTo(String value) {
            addCriterion("seller_quicklink <>", value, "sellerQuicklink");
            return (Criteria) this;
        }

        public Criteria andSellerQuicklinkGreaterThan(String value) {
            addCriterion("seller_quicklink >", value, "sellerQuicklink");
            return (Criteria) this;
        }

        public Criteria andSellerQuicklinkGreaterThanOrEqualTo(String value) {
            addCriterion("seller_quicklink >=", value, "sellerQuicklink");
            return (Criteria) this;
        }

        public Criteria andSellerQuicklinkLessThan(String value) {
            addCriterion("seller_quicklink <", value, "sellerQuicklink");
            return (Criteria) this;
        }

        public Criteria andSellerQuicklinkLessThanOrEqualTo(String value) {
            addCriterion("seller_quicklink <=", value, "sellerQuicklink");
            return (Criteria) this;
        }

        public Criteria andSellerQuicklinkLike(String value) {
            addCriterion("seller_quicklink like", value, "sellerQuicklink");
            return (Criteria) this;
        }

        public Criteria andSellerQuicklinkNotLike(String value) {
            addCriterion("seller_quicklink not like", value, "sellerQuicklink");
            return (Criteria) this;
        }

        public Criteria andSellerQuicklinkIn(List<String> values) {
            addCriterion("seller_quicklink in", values, "sellerQuicklink");
            return (Criteria) this;
        }

        public Criteria andSellerQuicklinkNotIn(List<String> values) {
            addCriterion("seller_quicklink not in", values, "sellerQuicklink");
            return (Criteria) this;
        }

        public Criteria andSellerQuicklinkBetween(String value1, String value2) {
            addCriterion("seller_quicklink between", value1, value2, "sellerQuicklink");
            return (Criteria) this;
        }

        public Criteria andSellerQuicklinkNotBetween(String value1, String value2) {
            addCriterion("seller_quicklink not between", value1, value2, "sellerQuicklink");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Integer value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Integer value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Integer value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Integer value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Integer value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Integer> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Integer> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Integer value1, Integer value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_seller表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-10-17
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_seller 2017-10-17
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