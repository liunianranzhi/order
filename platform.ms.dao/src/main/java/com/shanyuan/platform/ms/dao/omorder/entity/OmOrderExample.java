package com.shanyuan.platform.ms.dao.omorder.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OmOrderExample {
    /**
     * om_order
     */
    protected String orderByClause;

    /**
     * om_order
     */
    protected boolean distinct;

    /**
     * om_order
     */
    protected List<Criteria> oredCriteria;

    public OmOrderExample() {
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
     * om_order 2017-11-10
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andMainIdIsNull() {
            addCriterion("main_id is null");
            return (Criteria) this;
        }

        public Criteria andMainIdIsNotNull() {
            addCriterion("main_id is not null");
            return (Criteria) this;
        }

        public Criteria andMainIdEqualTo(String value) {
            addCriterion("main_id =", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotEqualTo(String value) {
            addCriterion("main_id <>", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdGreaterThan(String value) {
            addCriterion("main_id >", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdGreaterThanOrEqualTo(String value) {
            addCriterion("main_id >=", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLessThan(String value) {
            addCriterion("main_id <", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLessThanOrEqualTo(String value) {
            addCriterion("main_id <=", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLike(String value) {
            addCriterion("main_id like", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotLike(String value) {
            addCriterion("main_id not like", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdIn(List<String> values) {
            addCriterion("main_id in", values, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotIn(List<String> values) {
            addCriterion("main_id not in", values, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdBetween(String value1, String value2) {
            addCriterion("main_id between", value1, value2, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotBetween(String value1, String value2) {
            addCriterion("main_id not between", value1, value2, "mainId");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNull() {
            addCriterion("order_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("order_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(Long value) {
            addCriterion("order_code =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(Long value) {
            addCriterion("order_code <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(Long value) {
            addCriterion("order_code >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("order_code >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(Long value) {
            addCriterion("order_code <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(Long value) {
            addCriterion("order_code <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<Long> values) {
            addCriterion("order_code in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<Long> values) {
            addCriterion("order_code not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(Long value1, Long value2) {
            addCriterion("order_code between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(Long value1, Long value2) {
            addCriterion("order_code not between", value1, value2, "orderCode");
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

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Integer value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Integer value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Integer value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Integer value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Integer value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Integer> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Integer> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Integer value1, Integer value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andPoorIdIsNull() {
            addCriterion("poor_id is null");
            return (Criteria) this;
        }

        public Criteria andPoorIdIsNotNull() {
            addCriterion("poor_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoorIdEqualTo(Integer value) {
            addCriterion("poor_id =", value, "poorId");
            return (Criteria) this;
        }

        public Criteria andPoorIdNotEqualTo(Integer value) {
            addCriterion("poor_id <>", value, "poorId");
            return (Criteria) this;
        }

        public Criteria andPoorIdGreaterThan(Integer value) {
            addCriterion("poor_id >", value, "poorId");
            return (Criteria) this;
        }

        public Criteria andPoorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("poor_id >=", value, "poorId");
            return (Criteria) this;
        }

        public Criteria andPoorIdLessThan(Integer value) {
            addCriterion("poor_id <", value, "poorId");
            return (Criteria) this;
        }

        public Criteria andPoorIdLessThanOrEqualTo(Integer value) {
            addCriterion("poor_id <=", value, "poorId");
            return (Criteria) this;
        }

        public Criteria andPoorIdIn(List<Integer> values) {
            addCriterion("poor_id in", values, "poorId");
            return (Criteria) this;
        }

        public Criteria andPoorIdNotIn(List<Integer> values) {
            addCriterion("poor_id not in", values, "poorId");
            return (Criteria) this;
        }

        public Criteria andPoorIdBetween(Integer value1, Integer value2) {
            addCriterion("poor_id between", value1, value2, "poorId");
            return (Criteria) this;
        }

        public Criteria andPoorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("poor_id not between", value1, value2, "poorId");
            return (Criteria) this;
        }

        public Criteria andOpeCenterIdIsNull() {
            addCriterion("ope_center_id is null");
            return (Criteria) this;
        }

        public Criteria andOpeCenterIdIsNotNull() {
            addCriterion("ope_center_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpeCenterIdEqualTo(Integer value) {
            addCriterion("ope_center_id =", value, "opeCenterId");
            return (Criteria) this;
        }

        public Criteria andOpeCenterIdNotEqualTo(Integer value) {
            addCriterion("ope_center_id <>", value, "opeCenterId");
            return (Criteria) this;
        }

        public Criteria andOpeCenterIdGreaterThan(Integer value) {
            addCriterion("ope_center_id >", value, "opeCenterId");
            return (Criteria) this;
        }

        public Criteria andOpeCenterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ope_center_id >=", value, "opeCenterId");
            return (Criteria) this;
        }

        public Criteria andOpeCenterIdLessThan(Integer value) {
            addCriterion("ope_center_id <", value, "opeCenterId");
            return (Criteria) this;
        }

        public Criteria andOpeCenterIdLessThanOrEqualTo(Integer value) {
            addCriterion("ope_center_id <=", value, "opeCenterId");
            return (Criteria) this;
        }

        public Criteria andOpeCenterIdIn(List<Integer> values) {
            addCriterion("ope_center_id in", values, "opeCenterId");
            return (Criteria) this;
        }

        public Criteria andOpeCenterIdNotIn(List<Integer> values) {
            addCriterion("ope_center_id not in", values, "opeCenterId");
            return (Criteria) this;
        }

        public Criteria andOpeCenterIdBetween(Integer value1, Integer value2) {
            addCriterion("ope_center_id between", value1, value2, "opeCenterId");
            return (Criteria) this;
        }

        public Criteria andOpeCenterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ope_center_id not between", value1, value2, "opeCenterId");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Byte value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Byte value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Byte value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Byte value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Byte value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Byte> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Byte> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Byte value1, Byte value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderChannelIsNull() {
            addCriterion("order_channel is null");
            return (Criteria) this;
        }

        public Criteria andOrderChannelIsNotNull() {
            addCriterion("order_channel is not null");
            return (Criteria) this;
        }

        public Criteria andOrderChannelEqualTo(String value) {
            addCriterion("order_channel =", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelNotEqualTo(String value) {
            addCriterion("order_channel <>", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelGreaterThan(String value) {
            addCriterion("order_channel >", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelGreaterThanOrEqualTo(String value) {
            addCriterion("order_channel >=", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelLessThan(String value) {
            addCriterion("order_channel <", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelLessThanOrEqualTo(String value) {
            addCriterion("order_channel <=", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelLike(String value) {
            addCriterion("order_channel like", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelNotLike(String value) {
            addCriterion("order_channel not like", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelIn(List<String> values) {
            addCriterion("order_channel in", values, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelNotIn(List<String> values) {
            addCriterion("order_channel not in", values, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelBetween(String value1, String value2) {
            addCriterion("order_channel between", value1, value2, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelNotBetween(String value1, String value2) {
            addCriterion("order_channel not between", value1, value2, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeIsNull() {
            addCriterion("goods_project_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeIsNotNull() {
            addCriterion("goods_project_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeEqualTo(Byte value) {
            addCriterion("goods_project_type =", value, "goodsProjectType");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeNotEqualTo(Byte value) {
            addCriterion("goods_project_type <>", value, "goodsProjectType");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeGreaterThan(Byte value) {
            addCriterion("goods_project_type >", value, "goodsProjectType");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_project_type >=", value, "goodsProjectType");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeLessThan(Byte value) {
            addCriterion("goods_project_type <", value, "goodsProjectType");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeLessThanOrEqualTo(Byte value) {
            addCriterion("goods_project_type <=", value, "goodsProjectType");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeIn(List<Byte> values) {
            addCriterion("goods_project_type in", values, "goodsProjectType");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeNotIn(List<Byte> values) {
            addCriterion("goods_project_type not in", values, "goodsProjectType");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeBetween(Byte value1, Byte value2) {
            addCriterion("goods_project_type between", value1, value2, "goodsProjectType");
            return (Criteria) this;
        }

        public Criteria andGoodsProjectTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_project_type not between", value1, value2, "goodsProjectType");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Byte value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Byte value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Byte value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Byte value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Byte value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Byte> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Byte> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Byte value1, Byte value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderCancleReasonIsNull() {
            addCriterion("order_cancle_reason is null");
            return (Criteria) this;
        }

        public Criteria andOrderCancleReasonIsNotNull() {
            addCriterion("order_cancle_reason is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCancleReasonEqualTo(String value) {
            addCriterion("order_cancle_reason =", value, "orderCancleReason");
            return (Criteria) this;
        }

        public Criteria andOrderCancleReasonNotEqualTo(String value) {
            addCriterion("order_cancle_reason <>", value, "orderCancleReason");
            return (Criteria) this;
        }

        public Criteria andOrderCancleReasonGreaterThan(String value) {
            addCriterion("order_cancle_reason >", value, "orderCancleReason");
            return (Criteria) this;
        }

        public Criteria andOrderCancleReasonGreaterThanOrEqualTo(String value) {
            addCriterion("order_cancle_reason >=", value, "orderCancleReason");
            return (Criteria) this;
        }

        public Criteria andOrderCancleReasonLessThan(String value) {
            addCriterion("order_cancle_reason <", value, "orderCancleReason");
            return (Criteria) this;
        }

        public Criteria andOrderCancleReasonLessThanOrEqualTo(String value) {
            addCriterion("order_cancle_reason <=", value, "orderCancleReason");
            return (Criteria) this;
        }

        public Criteria andOrderCancleReasonLike(String value) {
            addCriterion("order_cancle_reason like", value, "orderCancleReason");
            return (Criteria) this;
        }

        public Criteria andOrderCancleReasonNotLike(String value) {
            addCriterion("order_cancle_reason not like", value, "orderCancleReason");
            return (Criteria) this;
        }

        public Criteria andOrderCancleReasonIn(List<String> values) {
            addCriterion("order_cancle_reason in", values, "orderCancleReason");
            return (Criteria) this;
        }

        public Criteria andOrderCancleReasonNotIn(List<String> values) {
            addCriterion("order_cancle_reason not in", values, "orderCancleReason");
            return (Criteria) this;
        }

        public Criteria andOrderCancleReasonBetween(String value1, String value2) {
            addCriterion("order_cancle_reason between", value1, value2, "orderCancleReason");
            return (Criteria) this;
        }

        public Criteria andOrderCancleReasonNotBetween(String value1, String value2) {
            addCriterion("order_cancle_reason not between", value1, value2, "orderCancleReason");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Byte value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Byte value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Byte value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Byte value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Byte value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Byte> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Byte> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Byte value1, Byte value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayCenterIsNull() {
            addCriterion("pay_center is null");
            return (Criteria) this;
        }

        public Criteria andPayCenterIsNotNull() {
            addCriterion("pay_center is not null");
            return (Criteria) this;
        }

        public Criteria andPayCenterEqualTo(String value) {
            addCriterion("pay_center =", value, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterNotEqualTo(String value) {
            addCriterion("pay_center <>", value, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterGreaterThan(String value) {
            addCriterion("pay_center >", value, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterGreaterThanOrEqualTo(String value) {
            addCriterion("pay_center >=", value, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterLessThan(String value) {
            addCriterion("pay_center <", value, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterLessThanOrEqualTo(String value) {
            addCriterion("pay_center <=", value, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterLike(String value) {
            addCriterion("pay_center like", value, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterNotLike(String value) {
            addCriterion("pay_center not like", value, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterIn(List<String> values) {
            addCriterion("pay_center in", values, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterNotIn(List<String> values) {
            addCriterion("pay_center not in", values, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterBetween(String value1, String value2) {
            addCriterion("pay_center between", value1, value2, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayCenterNotBetween(String value1, String value2) {
            addCriterion("pay_center not between", value1, value2, "payCenter");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Byte value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Byte value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Byte value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Byte value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Byte value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Byte> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Byte> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Byte value1, Byte value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andOrderMessageIsNull() {
            addCriterion("order_message is null");
            return (Criteria) this;
        }

        public Criteria andOrderMessageIsNotNull() {
            addCriterion("order_message is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMessageEqualTo(String value) {
            addCriterion("order_message =", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageNotEqualTo(String value) {
            addCriterion("order_message <>", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageGreaterThan(String value) {
            addCriterion("order_message >", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageGreaterThanOrEqualTo(String value) {
            addCriterion("order_message >=", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageLessThan(String value) {
            addCriterion("order_message <", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageLessThanOrEqualTo(String value) {
            addCriterion("order_message <=", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageLike(String value) {
            addCriterion("order_message like", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageNotLike(String value) {
            addCriterion("order_message not like", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageIn(List<String> values) {
            addCriterion("order_message in", values, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageNotIn(List<String> values) {
            addCriterion("order_message not in", values, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageBetween(String value1, String value2) {
            addCriterion("order_message between", value1, value2, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageNotBetween(String value1, String value2) {
            addCriterion("order_message not between", value1, value2, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andCustServiceStatusIsNull() {
            addCriterion("cust_service_status is null");
            return (Criteria) this;
        }

        public Criteria andCustServiceStatusIsNotNull() {
            addCriterion("cust_service_status is not null");
            return (Criteria) this;
        }

        public Criteria andCustServiceStatusEqualTo(Byte value) {
            addCriterion("cust_service_status =", value, "custServiceStatus");
            return (Criteria) this;
        }

        public Criteria andCustServiceStatusNotEqualTo(Byte value) {
            addCriterion("cust_service_status <>", value, "custServiceStatus");
            return (Criteria) this;
        }

        public Criteria andCustServiceStatusGreaterThan(Byte value) {
            addCriterion("cust_service_status >", value, "custServiceStatus");
            return (Criteria) this;
        }

        public Criteria andCustServiceStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("cust_service_status >=", value, "custServiceStatus");
            return (Criteria) this;
        }

        public Criteria andCustServiceStatusLessThan(Byte value) {
            addCriterion("cust_service_status <", value, "custServiceStatus");
            return (Criteria) this;
        }

        public Criteria andCustServiceStatusLessThanOrEqualTo(Byte value) {
            addCriterion("cust_service_status <=", value, "custServiceStatus");
            return (Criteria) this;
        }

        public Criteria andCustServiceStatusIn(List<Byte> values) {
            addCriterion("cust_service_status in", values, "custServiceStatus");
            return (Criteria) this;
        }

        public Criteria andCustServiceStatusNotIn(List<Byte> values) {
            addCriterion("cust_service_status not in", values, "custServiceStatus");
            return (Criteria) this;
        }

        public Criteria andCustServiceStatusBetween(Byte value1, Byte value2) {
            addCriterion("cust_service_status between", value1, value2, "custServiceStatus");
            return (Criteria) this;
        }

        public Criteria andCustServiceStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("cust_service_status not between", value1, value2, "custServiceStatus");
            return (Criteria) this;
        }

        public Criteria andOrderAllPriceIsNull() {
            addCriterion("order_all_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderAllPriceIsNotNull() {
            addCriterion("order_all_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAllPriceEqualTo(Integer value) {
            addCriterion("order_all_price =", value, "orderAllPrice");
            return (Criteria) this;
        }

        public Criteria andOrderAllPriceNotEqualTo(Integer value) {
            addCriterion("order_all_price <>", value, "orderAllPrice");
            return (Criteria) this;
        }

        public Criteria andOrderAllPriceGreaterThan(Integer value) {
            addCriterion("order_all_price >", value, "orderAllPrice");
            return (Criteria) this;
        }

        public Criteria andOrderAllPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_all_price >=", value, "orderAllPrice");
            return (Criteria) this;
        }

        public Criteria andOrderAllPriceLessThan(Integer value) {
            addCriterion("order_all_price <", value, "orderAllPrice");
            return (Criteria) this;
        }

        public Criteria andOrderAllPriceLessThanOrEqualTo(Integer value) {
            addCriterion("order_all_price <=", value, "orderAllPrice");
            return (Criteria) this;
        }

        public Criteria andOrderAllPriceIn(List<Integer> values) {
            addCriterion("order_all_price in", values, "orderAllPrice");
            return (Criteria) this;
        }

        public Criteria andOrderAllPriceNotIn(List<Integer> values) {
            addCriterion("order_all_price not in", values, "orderAllPrice");
            return (Criteria) this;
        }

        public Criteria andOrderAllPriceBetween(Integer value1, Integer value2) {
            addCriterion("order_all_price between", value1, value2, "orderAllPrice");
            return (Criteria) this;
        }

        public Criteria andOrderAllPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("order_all_price not between", value1, value2, "orderAllPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceIsNull() {
            addCriterion("order_goods_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceIsNotNull() {
            addCriterion("order_goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceEqualTo(Integer value) {
            addCriterion("order_goods_price =", value, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceNotEqualTo(Integer value) {
            addCriterion("order_goods_price <>", value, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceGreaterThan(Integer value) {
            addCriterion("order_goods_price >", value, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_goods_price >=", value, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceLessThan(Integer value) {
            addCriterion("order_goods_price <", value, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceLessThanOrEqualTo(Integer value) {
            addCriterion("order_goods_price <=", value, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceIn(List<Integer> values) {
            addCriterion("order_goods_price in", values, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceNotIn(List<Integer> values) {
            addCriterion("order_goods_price not in", values, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceBetween(Integer value1, Integer value2) {
            addCriterion("order_goods_price between", value1, value2, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("order_goods_price not between", value1, value2, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderLogistPriceIsNull() {
            addCriterion("order_logist_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderLogistPriceIsNotNull() {
            addCriterion("order_logist_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLogistPriceEqualTo(Integer value) {
            addCriterion("order_logist_price =", value, "orderLogistPrice");
            return (Criteria) this;
        }

        public Criteria andOrderLogistPriceNotEqualTo(Integer value) {
            addCriterion("order_logist_price <>", value, "orderLogistPrice");
            return (Criteria) this;
        }

        public Criteria andOrderLogistPriceGreaterThan(Integer value) {
            addCriterion("order_logist_price >", value, "orderLogistPrice");
            return (Criteria) this;
        }

        public Criteria andOrderLogistPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_logist_price >=", value, "orderLogistPrice");
            return (Criteria) this;
        }

        public Criteria andOrderLogistPriceLessThan(Integer value) {
            addCriterion("order_logist_price <", value, "orderLogistPrice");
            return (Criteria) this;
        }

        public Criteria andOrderLogistPriceLessThanOrEqualTo(Integer value) {
            addCriterion("order_logist_price <=", value, "orderLogistPrice");
            return (Criteria) this;
        }

        public Criteria andOrderLogistPriceIn(List<Integer> values) {
            addCriterion("order_logist_price in", values, "orderLogistPrice");
            return (Criteria) this;
        }

        public Criteria andOrderLogistPriceNotIn(List<Integer> values) {
            addCriterion("order_logist_price not in", values, "orderLogistPrice");
            return (Criteria) this;
        }

        public Criteria andOrderLogistPriceBetween(Integer value1, Integer value2) {
            addCriterion("order_logist_price between", value1, value2, "orderLogistPrice");
            return (Criteria) this;
        }

        public Criteria andOrderLogistPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("order_logist_price not between", value1, value2, "orderLogistPrice");
            return (Criteria) this;
        }

        public Criteria andOrderVoucherPriceIsNull() {
            addCriterion("order_voucher_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderVoucherPriceIsNotNull() {
            addCriterion("order_voucher_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderVoucherPriceEqualTo(Integer value) {
            addCriterion("order_voucher_price =", value, "orderVoucherPrice");
            return (Criteria) this;
        }

        public Criteria andOrderVoucherPriceNotEqualTo(Integer value) {
            addCriterion("order_voucher_price <>", value, "orderVoucherPrice");
            return (Criteria) this;
        }

        public Criteria andOrderVoucherPriceGreaterThan(Integer value) {
            addCriterion("order_voucher_price >", value, "orderVoucherPrice");
            return (Criteria) this;
        }

        public Criteria andOrderVoucherPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_voucher_price >=", value, "orderVoucherPrice");
            return (Criteria) this;
        }

        public Criteria andOrderVoucherPriceLessThan(Integer value) {
            addCriterion("order_voucher_price <", value, "orderVoucherPrice");
            return (Criteria) this;
        }

        public Criteria andOrderVoucherPriceLessThanOrEqualTo(Integer value) {
            addCriterion("order_voucher_price <=", value, "orderVoucherPrice");
            return (Criteria) this;
        }

        public Criteria andOrderVoucherPriceIn(List<Integer> values) {
            addCriterion("order_voucher_price in", values, "orderVoucherPrice");
            return (Criteria) this;
        }

        public Criteria andOrderVoucherPriceNotIn(List<Integer> values) {
            addCriterion("order_voucher_price not in", values, "orderVoucherPrice");
            return (Criteria) this;
        }

        public Criteria andOrderVoucherPriceBetween(Integer value1, Integer value2) {
            addCriterion("order_voucher_price between", value1, value2, "orderVoucherPrice");
            return (Criteria) this;
        }

        public Criteria andOrderVoucherPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("order_voucher_price not between", value1, value2, "orderVoucherPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCouponPriceIsNull() {
            addCriterion("order_coupon_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderCouponPriceIsNotNull() {
            addCriterion("order_coupon_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCouponPriceEqualTo(Integer value) {
            addCriterion("order_coupon_price =", value, "orderCouponPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCouponPriceNotEqualTo(Integer value) {
            addCriterion("order_coupon_price <>", value, "orderCouponPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCouponPriceGreaterThan(Integer value) {
            addCriterion("order_coupon_price >", value, "orderCouponPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCouponPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_coupon_price >=", value, "orderCouponPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCouponPriceLessThan(Integer value) {
            addCriterion("order_coupon_price <", value, "orderCouponPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCouponPriceLessThanOrEqualTo(Integer value) {
            addCriterion("order_coupon_price <=", value, "orderCouponPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCouponPriceIn(List<Integer> values) {
            addCriterion("order_coupon_price in", values, "orderCouponPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCouponPriceNotIn(List<Integer> values) {
            addCriterion("order_coupon_price not in", values, "orderCouponPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCouponPriceBetween(Integer value1, Integer value2) {
            addCriterion("order_coupon_price between", value1, value2, "orderCouponPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCouponPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("order_coupon_price not between", value1, value2, "orderCouponPrice");
            return (Criteria) this;
        }

        public Criteria andOrderUsedPointIsNull() {
            addCriterion("order_used_point is null");
            return (Criteria) this;
        }

        public Criteria andOrderUsedPointIsNotNull() {
            addCriterion("order_used_point is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUsedPointEqualTo(Integer value) {
            addCriterion("order_used_point =", value, "orderUsedPoint");
            return (Criteria) this;
        }

        public Criteria andOrderUsedPointNotEqualTo(Integer value) {
            addCriterion("order_used_point <>", value, "orderUsedPoint");
            return (Criteria) this;
        }

        public Criteria andOrderUsedPointGreaterThan(Integer value) {
            addCriterion("order_used_point >", value, "orderUsedPoint");
            return (Criteria) this;
        }

        public Criteria andOrderUsedPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_used_point >=", value, "orderUsedPoint");
            return (Criteria) this;
        }

        public Criteria andOrderUsedPointLessThan(Integer value) {
            addCriterion("order_used_point <", value, "orderUsedPoint");
            return (Criteria) this;
        }

        public Criteria andOrderUsedPointLessThanOrEqualTo(Integer value) {
            addCriterion("order_used_point <=", value, "orderUsedPoint");
            return (Criteria) this;
        }

        public Criteria andOrderUsedPointIn(List<Integer> values) {
            addCriterion("order_used_point in", values, "orderUsedPoint");
            return (Criteria) this;
        }

        public Criteria andOrderUsedPointNotIn(List<Integer> values) {
            addCriterion("order_used_point not in", values, "orderUsedPoint");
            return (Criteria) this;
        }

        public Criteria andOrderUsedPointBetween(Integer value1, Integer value2) {
            addCriterion("order_used_point between", value1, value2, "orderUsedPoint");
            return (Criteria) this;
        }

        public Criteria andOrderUsedPointNotBetween(Integer value1, Integer value2) {
            addCriterion("order_used_point not between", value1, value2, "orderUsedPoint");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeIsNull() {
            addCriterion("order_pay_fee is null");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeIsNotNull() {
            addCriterion("order_pay_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeEqualTo(Integer value) {
            addCriterion("order_pay_fee =", value, "orderPayFee");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeNotEqualTo(Integer value) {
            addCriterion("order_pay_fee <>", value, "orderPayFee");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeGreaterThan(Integer value) {
            addCriterion("order_pay_fee >", value, "orderPayFee");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_pay_fee >=", value, "orderPayFee");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeLessThan(Integer value) {
            addCriterion("order_pay_fee <", value, "orderPayFee");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeLessThanOrEqualTo(Integer value) {
            addCriterion("order_pay_fee <=", value, "orderPayFee");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeIn(List<Integer> values) {
            addCriterion("order_pay_fee in", values, "orderPayFee");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeNotIn(List<Integer> values) {
            addCriterion("order_pay_fee not in", values, "orderPayFee");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeBetween(Integer value1, Integer value2) {
            addCriterion("order_pay_fee between", value1, value2, "orderPayFee");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_pay_fee not between", value1, value2, "orderPayFee");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNull() {
            addCriterion("order_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNotNull() {
            addCriterion("order_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeEqualTo(Date value) {
            addCriterion("order_create_time =", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotEqualTo(Date value) {
            addCriterion("order_create_time <>", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThan(Date value) {
            addCriterion("order_create_time >", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_create_time >=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThan(Date value) {
            addCriterion("order_create_time <", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_create_time <=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIn(List<Date> values) {
            addCriterion("order_create_time in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotIn(List<Date> values) {
            addCriterion("order_create_time not in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeBetween(Date value1, Date value2) {
            addCriterion("order_create_time between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_create_time not between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeIsNull() {
            addCriterion("order_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeIsNotNull() {
            addCriterion("order_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeEqualTo(Date value) {
            addCriterion("order_pay_time =", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeNotEqualTo(Date value) {
            addCriterion("order_pay_time <>", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeGreaterThan(Date value) {
            addCriterion("order_pay_time >", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_pay_time >=", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeLessThan(Date value) {
            addCriterion("order_pay_time <", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_pay_time <=", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeIn(List<Date> values) {
            addCriterion("order_pay_time in", values, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeNotIn(List<Date> values) {
            addCriterion("order_pay_time not in", values, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeBetween(Date value1, Date value2) {
            addCriterion("order_pay_time between", value1, value2, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_pay_time not between", value1, value2, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeIsNull() {
            addCriterion("order_send_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeIsNotNull() {
            addCriterion("order_send_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeEqualTo(Date value) {
            addCriterion("order_send_time =", value, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeNotEqualTo(Date value) {
            addCriterion("order_send_time <>", value, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeGreaterThan(Date value) {
            addCriterion("order_send_time >", value, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_send_time >=", value, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeLessThan(Date value) {
            addCriterion("order_send_time <", value, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_send_time <=", value, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeIn(List<Date> values) {
            addCriterion("order_send_time in", values, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeNotIn(List<Date> values) {
            addCriterion("order_send_time not in", values, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeBetween(Date value1, Date value2) {
            addCriterion("order_send_time between", value1, value2, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_send_time not between", value1, value2, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderCheckTimeIsNull() {
            addCriterion("order_check_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCheckTimeIsNotNull() {
            addCriterion("order_check_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCheckTimeEqualTo(Date value) {
            addCriterion("order_check_time =", value, "orderCheckTime");
            return (Criteria) this;
        }

        public Criteria andOrderCheckTimeNotEqualTo(Date value) {
            addCriterion("order_check_time <>", value, "orderCheckTime");
            return (Criteria) this;
        }

        public Criteria andOrderCheckTimeGreaterThan(Date value) {
            addCriterion("order_check_time >", value, "orderCheckTime");
            return (Criteria) this;
        }

        public Criteria andOrderCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_check_time >=", value, "orderCheckTime");
            return (Criteria) this;
        }

        public Criteria andOrderCheckTimeLessThan(Date value) {
            addCriterion("order_check_time <", value, "orderCheckTime");
            return (Criteria) this;
        }

        public Criteria andOrderCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_check_time <=", value, "orderCheckTime");
            return (Criteria) this;
        }

        public Criteria andOrderCheckTimeIn(List<Date> values) {
            addCriterion("order_check_time in", values, "orderCheckTime");
            return (Criteria) this;
        }

        public Criteria andOrderCheckTimeNotIn(List<Date> values) {
            addCriterion("order_check_time not in", values, "orderCheckTime");
            return (Criteria) this;
        }

        public Criteria andOrderCheckTimeBetween(Date value1, Date value2) {
            addCriterion("order_check_time between", value1, value2, "orderCheckTime");
            return (Criteria) this;
        }

        public Criteria andOrderCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_check_time not between", value1, value2, "orderCheckTime");
            return (Criteria) this;
        }

        public Criteria andOrderEvaStatusIsNull() {
            addCriterion("order_eva_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderEvaStatusIsNotNull() {
            addCriterion("order_eva_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEvaStatusEqualTo(Byte value) {
            addCriterion("order_eva_status =", value, "orderEvaStatus");
            return (Criteria) this;
        }

        public Criteria andOrderEvaStatusNotEqualTo(Byte value) {
            addCriterion("order_eva_status <>", value, "orderEvaStatus");
            return (Criteria) this;
        }

        public Criteria andOrderEvaStatusGreaterThan(Byte value) {
            addCriterion("order_eva_status >", value, "orderEvaStatus");
            return (Criteria) this;
        }

        public Criteria andOrderEvaStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_eva_status >=", value, "orderEvaStatus");
            return (Criteria) this;
        }

        public Criteria andOrderEvaStatusLessThan(Byte value) {
            addCriterion("order_eva_status <", value, "orderEvaStatus");
            return (Criteria) this;
        }

        public Criteria andOrderEvaStatusLessThanOrEqualTo(Byte value) {
            addCriterion("order_eva_status <=", value, "orderEvaStatus");
            return (Criteria) this;
        }

        public Criteria andOrderEvaStatusIn(List<Byte> values) {
            addCriterion("order_eva_status in", values, "orderEvaStatus");
            return (Criteria) this;
        }

        public Criteria andOrderEvaStatusNotIn(List<Byte> values) {
            addCriterion("order_eva_status not in", values, "orderEvaStatus");
            return (Criteria) this;
        }

        public Criteria andOrderEvaStatusBetween(Byte value1, Byte value2) {
            addCriterion("order_eva_status between", value1, value2, "orderEvaStatus");
            return (Criteria) this;
        }

        public Criteria andOrderEvaStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("order_eva_status not between", value1, value2, "orderEvaStatus");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andOtherInfo1IsNull() {
            addCriterion("other_info1 is null");
            return (Criteria) this;
        }

        public Criteria andOtherInfo1IsNotNull() {
            addCriterion("other_info1 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherInfo1EqualTo(String value) {
            addCriterion("other_info1 =", value, "otherInfo1");
            return (Criteria) this;
        }

        public Criteria andOtherInfo1NotEqualTo(String value) {
            addCriterion("other_info1 <>", value, "otherInfo1");
            return (Criteria) this;
        }

        public Criteria andOtherInfo1GreaterThan(String value) {
            addCriterion("other_info1 >", value, "otherInfo1");
            return (Criteria) this;
        }

        public Criteria andOtherInfo1GreaterThanOrEqualTo(String value) {
            addCriterion("other_info1 >=", value, "otherInfo1");
            return (Criteria) this;
        }

        public Criteria andOtherInfo1LessThan(String value) {
            addCriterion("other_info1 <", value, "otherInfo1");
            return (Criteria) this;
        }

        public Criteria andOtherInfo1LessThanOrEqualTo(String value) {
            addCriterion("other_info1 <=", value, "otherInfo1");
            return (Criteria) this;
        }

        public Criteria andOtherInfo1Like(String value) {
            addCriterion("other_info1 like", value, "otherInfo1");
            return (Criteria) this;
        }

        public Criteria andOtherInfo1NotLike(String value) {
            addCriterion("other_info1 not like", value, "otherInfo1");
            return (Criteria) this;
        }

        public Criteria andOtherInfo1In(List<String> values) {
            addCriterion("other_info1 in", values, "otherInfo1");
            return (Criteria) this;
        }

        public Criteria andOtherInfo1NotIn(List<String> values) {
            addCriterion("other_info1 not in", values, "otherInfo1");
            return (Criteria) this;
        }

        public Criteria andOtherInfo1Between(String value1, String value2) {
            addCriterion("other_info1 between", value1, value2, "otherInfo1");
            return (Criteria) this;
        }

        public Criteria andOtherInfo1NotBetween(String value1, String value2) {
            addCriterion("other_info1 not between", value1, value2, "otherInfo1");
            return (Criteria) this;
        }

        public Criteria andOtherInfo2IsNull() {
            addCriterion("other_info2 is null");
            return (Criteria) this;
        }

        public Criteria andOtherInfo2IsNotNull() {
            addCriterion("other_info2 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherInfo2EqualTo(String value) {
            addCriterion("other_info2 =", value, "otherInfo2");
            return (Criteria) this;
        }

        public Criteria andOtherInfo2NotEqualTo(String value) {
            addCriterion("other_info2 <>", value, "otherInfo2");
            return (Criteria) this;
        }

        public Criteria andOtherInfo2GreaterThan(String value) {
            addCriterion("other_info2 >", value, "otherInfo2");
            return (Criteria) this;
        }

        public Criteria andOtherInfo2GreaterThanOrEqualTo(String value) {
            addCriterion("other_info2 >=", value, "otherInfo2");
            return (Criteria) this;
        }

        public Criteria andOtherInfo2LessThan(String value) {
            addCriterion("other_info2 <", value, "otherInfo2");
            return (Criteria) this;
        }

        public Criteria andOtherInfo2LessThanOrEqualTo(String value) {
            addCriterion("other_info2 <=", value, "otherInfo2");
            return (Criteria) this;
        }

        public Criteria andOtherInfo2Like(String value) {
            addCriterion("other_info2 like", value, "otherInfo2");
            return (Criteria) this;
        }

        public Criteria andOtherInfo2NotLike(String value) {
            addCriterion("other_info2 not like", value, "otherInfo2");
            return (Criteria) this;
        }

        public Criteria andOtherInfo2In(List<String> values) {
            addCriterion("other_info2 in", values, "otherInfo2");
            return (Criteria) this;
        }

        public Criteria andOtherInfo2NotIn(List<String> values) {
            addCriterion("other_info2 not in", values, "otherInfo2");
            return (Criteria) this;
        }

        public Criteria andOtherInfo2Between(String value1, String value2) {
            addCriterion("other_info2 between", value1, value2, "otherInfo2");
            return (Criteria) this;
        }

        public Criteria andOtherInfo2NotBetween(String value1, String value2) {
            addCriterion("other_info2 not between", value1, value2, "otherInfo2");
            return (Criteria) this;
        }
    }

    /**
     * 描述:om_order表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-11-10
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * om_order 2017-11-10
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