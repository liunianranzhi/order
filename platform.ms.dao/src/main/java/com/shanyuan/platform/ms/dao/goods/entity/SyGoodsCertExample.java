package com.shanyuan.platform.ms.dao.goods.entity;

import java.util.ArrayList;
import java.util.List;

public class SyGoodsCertExample {
    /**
     * sy_goods_cert
     */
    protected String orderByClause;

    /**
     * sy_goods_cert
     */
    protected boolean distinct;

    /**
     * sy_goods_cert
     */
    protected List<Criteria> oredCriteria;

    public SyGoodsCertExample() {
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
     * sy_goods_cert 2017-10-16
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

        public Criteria andGoodsCertIdIsNull() {
            addCriterion("goods_cert_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCertIdIsNotNull() {
            addCriterion("goods_cert_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCertIdEqualTo(Integer value) {
            addCriterion("goods_cert_id =", value, "goodsCertId");
            return (Criteria) this;
        }

        public Criteria andGoodsCertIdNotEqualTo(Integer value) {
            addCriterion("goods_cert_id <>", value, "goodsCertId");
            return (Criteria) this;
        }

        public Criteria andGoodsCertIdGreaterThan(Integer value) {
            addCriterion("goods_cert_id >", value, "goodsCertId");
            return (Criteria) this;
        }

        public Criteria andGoodsCertIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_cert_id >=", value, "goodsCertId");
            return (Criteria) this;
        }

        public Criteria andGoodsCertIdLessThan(Integer value) {
            addCriterion("goods_cert_id <", value, "goodsCertId");
            return (Criteria) this;
        }

        public Criteria andGoodsCertIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_cert_id <=", value, "goodsCertId");
            return (Criteria) this;
        }

        public Criteria andGoodsCertIdIn(List<Integer> values) {
            addCriterion("goods_cert_id in", values, "goodsCertId");
            return (Criteria) this;
        }

        public Criteria andGoodsCertIdNotIn(List<Integer> values) {
            addCriterion("goods_cert_id not in", values, "goodsCertId");
            return (Criteria) this;
        }

        public Criteria andGoodsCertIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_cert_id between", value1, value2, "goodsCertId");
            return (Criteria) this;
        }

        public Criteria andGoodsCertIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_cert_id not between", value1, value2, "goodsCertId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidIsNull() {
            addCriterion("goods_commonid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidIsNotNull() {
            addCriterion("goods_commonid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidEqualTo(Integer value) {
            addCriterion("goods_commonid =", value, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidNotEqualTo(Integer value) {
            addCriterion("goods_commonid <>", value, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidGreaterThan(Integer value) {
            addCriterion("goods_commonid >", value, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_commonid >=", value, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidLessThan(Integer value) {
            addCriterion("goods_commonid <", value, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidLessThanOrEqualTo(Integer value) {
            addCriterion("goods_commonid <=", value, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidIn(List<Integer> values) {
            addCriterion("goods_commonid in", values, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidNotIn(List<Integer> values) {
            addCriterion("goods_commonid not in", values, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidBetween(Integer value1, Integer value2) {
            addCriterion("goods_commonid between", value1, value2, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonidNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_commonid not between", value1, value2, "goodsCommonid");
            return (Criteria) this;
        }

        public Criteria andGoodsCertTypeIsNull() {
            addCriterion("goods_cert_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCertTypeIsNotNull() {
            addCriterion("goods_cert_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCertTypeEqualTo(String value) {
            addCriterion("goods_cert_type =", value, "goodsCertType");
            return (Criteria) this;
        }

        public Criteria andGoodsCertTypeNotEqualTo(String value) {
            addCriterion("goods_cert_type <>", value, "goodsCertType");
            return (Criteria) this;
        }

        public Criteria andGoodsCertTypeGreaterThan(String value) {
            addCriterion("goods_cert_type >", value, "goodsCertType");
            return (Criteria) this;
        }

        public Criteria andGoodsCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_cert_type >=", value, "goodsCertType");
            return (Criteria) this;
        }

        public Criteria andGoodsCertTypeLessThan(String value) {
            addCriterion("goods_cert_type <", value, "goodsCertType");
            return (Criteria) this;
        }

        public Criteria andGoodsCertTypeLessThanOrEqualTo(String value) {
            addCriterion("goods_cert_type <=", value, "goodsCertType");
            return (Criteria) this;
        }

        public Criteria andGoodsCertTypeLike(String value) {
            addCriterion("goods_cert_type like", value, "goodsCertType");
            return (Criteria) this;
        }

        public Criteria andGoodsCertTypeNotLike(String value) {
            addCriterion("goods_cert_type not like", value, "goodsCertType");
            return (Criteria) this;
        }

        public Criteria andGoodsCertTypeIn(List<String> values) {
            addCriterion("goods_cert_type in", values, "goodsCertType");
            return (Criteria) this;
        }

        public Criteria andGoodsCertTypeNotIn(List<String> values) {
            addCriterion("goods_cert_type not in", values, "goodsCertType");
            return (Criteria) this;
        }

        public Criteria andGoodsCertTypeBetween(String value1, String value2) {
            addCriterion("goods_cert_type between", value1, value2, "goodsCertType");
            return (Criteria) this;
        }

        public Criteria andGoodsCertTypeNotBetween(String value1, String value2) {
            addCriterion("goods_cert_type not between", value1, value2, "goodsCertType");
            return (Criteria) this;
        }

        public Criteria andGoodsCertImageIsNull() {
            addCriterion("goods_cert_image is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCertImageIsNotNull() {
            addCriterion("goods_cert_image is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCertImageEqualTo(String value) {
            addCriterion("goods_cert_image =", value, "goodsCertImage");
            return (Criteria) this;
        }

        public Criteria andGoodsCertImageNotEqualTo(String value) {
            addCriterion("goods_cert_image <>", value, "goodsCertImage");
            return (Criteria) this;
        }

        public Criteria andGoodsCertImageGreaterThan(String value) {
            addCriterion("goods_cert_image >", value, "goodsCertImage");
            return (Criteria) this;
        }

        public Criteria andGoodsCertImageGreaterThanOrEqualTo(String value) {
            addCriterion("goods_cert_image >=", value, "goodsCertImage");
            return (Criteria) this;
        }

        public Criteria andGoodsCertImageLessThan(String value) {
            addCriterion("goods_cert_image <", value, "goodsCertImage");
            return (Criteria) this;
        }

        public Criteria andGoodsCertImageLessThanOrEqualTo(String value) {
            addCriterion("goods_cert_image <=", value, "goodsCertImage");
            return (Criteria) this;
        }

        public Criteria andGoodsCertImageLike(String value) {
            addCriterion("goods_cert_image like", value, "goodsCertImage");
            return (Criteria) this;
        }

        public Criteria andGoodsCertImageNotLike(String value) {
            addCriterion("goods_cert_image not like", value, "goodsCertImage");
            return (Criteria) this;
        }

        public Criteria andGoodsCertImageIn(List<String> values) {
            addCriterion("goods_cert_image in", values, "goodsCertImage");
            return (Criteria) this;
        }

        public Criteria andGoodsCertImageNotIn(List<String> values) {
            addCriterion("goods_cert_image not in", values, "goodsCertImage");
            return (Criteria) this;
        }

        public Criteria andGoodsCertImageBetween(String value1, String value2) {
            addCriterion("goods_cert_image between", value1, value2, "goodsCertImage");
            return (Criteria) this;
        }

        public Criteria andGoodsCertImageNotBetween(String value1, String value2) {
            addCriterion("goods_cert_image not between", value1, value2, "goodsCertImage");
            return (Criteria) this;
        }

        public Criteria andGoodsCertNoIsNull() {
            addCriterion("goods_cert_no is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCertNoIsNotNull() {
            addCriterion("goods_cert_no is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCertNoEqualTo(String value) {
            addCriterion("goods_cert_no =", value, "goodsCertNo");
            return (Criteria) this;
        }

        public Criteria andGoodsCertNoNotEqualTo(String value) {
            addCriterion("goods_cert_no <>", value, "goodsCertNo");
            return (Criteria) this;
        }

        public Criteria andGoodsCertNoGreaterThan(String value) {
            addCriterion("goods_cert_no >", value, "goodsCertNo");
            return (Criteria) this;
        }

        public Criteria andGoodsCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("goods_cert_no >=", value, "goodsCertNo");
            return (Criteria) this;
        }

        public Criteria andGoodsCertNoLessThan(String value) {
            addCriterion("goods_cert_no <", value, "goodsCertNo");
            return (Criteria) this;
        }

        public Criteria andGoodsCertNoLessThanOrEqualTo(String value) {
            addCriterion("goods_cert_no <=", value, "goodsCertNo");
            return (Criteria) this;
        }

        public Criteria andGoodsCertNoLike(String value) {
            addCriterion("goods_cert_no like", value, "goodsCertNo");
            return (Criteria) this;
        }

        public Criteria andGoodsCertNoNotLike(String value) {
            addCriterion("goods_cert_no not like", value, "goodsCertNo");
            return (Criteria) this;
        }

        public Criteria andGoodsCertNoIn(List<String> values) {
            addCriterion("goods_cert_no in", values, "goodsCertNo");
            return (Criteria) this;
        }

        public Criteria andGoodsCertNoNotIn(List<String> values) {
            addCriterion("goods_cert_no not in", values, "goodsCertNo");
            return (Criteria) this;
        }

        public Criteria andGoodsCertNoBetween(String value1, String value2) {
            addCriterion("goods_cert_no between", value1, value2, "goodsCertNo");
            return (Criteria) this;
        }

        public Criteria andGoodsCertNoNotBetween(String value1, String value2) {
            addCriterion("goods_cert_no not between", value1, value2, "goodsCertNo");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_goods_cert表的实体类
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
     * sy_goods_cert 2017-10-16
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