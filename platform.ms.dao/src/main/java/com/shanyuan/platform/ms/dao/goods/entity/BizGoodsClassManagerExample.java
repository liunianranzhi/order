package com.shanyuan.platform.ms.dao.goods.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BizGoodsClassManagerExample {
    /**
     * sy_biz_goods_class_manager
     */
    protected String orderByClause;

    /**
     * sy_biz_goods_class_manager
     */
    protected boolean distinct;

    /**
     * sy_biz_goods_class_manager
     */
    protected List<Criteria> oredCriteria;

    public BizGoodsClassManagerExample() {
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
     * sy_biz_goods_class_manager 2017-12-25
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

        public Criteria andGcIdIsNull() {
            addCriterion("gc_id is null");
            return (Criteria) this;
        }

        public Criteria andGcIdIsNotNull() {
            addCriterion("gc_id is not null");
            return (Criteria) this;
        }

        public Criteria andGcIdEqualTo(Integer value) {
            addCriterion("gc_id =", value, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdNotEqualTo(Integer value) {
            addCriterion("gc_id <>", value, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdGreaterThan(Integer value) {
            addCriterion("gc_id >", value, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gc_id >=", value, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdLessThan(Integer value) {
            addCriterion("gc_id <", value, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdLessThanOrEqualTo(Integer value) {
            addCriterion("gc_id <=", value, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdIn(List<Integer> values) {
            addCriterion("gc_id in", values, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdNotIn(List<Integer> values) {
            addCriterion("gc_id not in", values, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdBetween(Integer value1, Integer value2) {
            addCriterion("gc_id between", value1, value2, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gc_id not between", value1, value2, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcNameIsNull() {
            addCriterion("gc_name is null");
            return (Criteria) this;
        }

        public Criteria andGcNameIsNotNull() {
            addCriterion("gc_name is not null");
            return (Criteria) this;
        }

        public Criteria andGcNameEqualTo(String value) {
            addCriterion("gc_name =", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameNotEqualTo(String value) {
            addCriterion("gc_name <>", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameGreaterThan(String value) {
            addCriterion("gc_name >", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameGreaterThanOrEqualTo(String value) {
            addCriterion("gc_name >=", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameLessThan(String value) {
            addCriterion("gc_name <", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameLessThanOrEqualTo(String value) {
            addCriterion("gc_name <=", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameLike(String value) {
            addCriterion("gc_name like", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameNotLike(String value) {
            addCriterion("gc_name not like", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameIn(List<String> values) {
            addCriterion("gc_name in", values, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameNotIn(List<String> values) {
            addCriterion("gc_name not in", values, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameBetween(String value1, String value2) {
            addCriterion("gc_name between", value1, value2, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameNotBetween(String value1, String value2) {
            addCriterion("gc_name not between", value1, value2, "gcName");
            return (Criteria) this;
        }

        public Criteria andClassRecommendImageIsNull() {
            addCriterion("class_recommend_image is null");
            return (Criteria) this;
        }

        public Criteria andClassRecommendImageIsNotNull() {
            addCriterion("class_recommend_image is not null");
            return (Criteria) this;
        }

        public Criteria andClassRecommendImageEqualTo(String value) {
            addCriterion("class_recommend_image =", value, "classRecommendImage");
            return (Criteria) this;
        }

        public Criteria andClassRecommendImageNotEqualTo(String value) {
            addCriterion("class_recommend_image <>", value, "classRecommendImage");
            return (Criteria) this;
        }

        public Criteria andClassRecommendImageGreaterThan(String value) {
            addCriterion("class_recommend_image >", value, "classRecommendImage");
            return (Criteria) this;
        }

        public Criteria andClassRecommendImageGreaterThanOrEqualTo(String value) {
            addCriterion("class_recommend_image >=", value, "classRecommendImage");
            return (Criteria) this;
        }

        public Criteria andClassRecommendImageLessThan(String value) {
            addCriterion("class_recommend_image <", value, "classRecommendImage");
            return (Criteria) this;
        }

        public Criteria andClassRecommendImageLessThanOrEqualTo(String value) {
            addCriterion("class_recommend_image <=", value, "classRecommendImage");
            return (Criteria) this;
        }

        public Criteria andClassRecommendImageLike(String value) {
            addCriterion("class_recommend_image like", value, "classRecommendImage");
            return (Criteria) this;
        }

        public Criteria andClassRecommendImageNotLike(String value) {
            addCriterion("class_recommend_image not like", value, "classRecommendImage");
            return (Criteria) this;
        }

        public Criteria andClassRecommendImageIn(List<String> values) {
            addCriterion("class_recommend_image in", values, "classRecommendImage");
            return (Criteria) this;
        }

        public Criteria andClassRecommendImageNotIn(List<String> values) {
            addCriterion("class_recommend_image not in", values, "classRecommendImage");
            return (Criteria) this;
        }

        public Criteria andClassRecommendImageBetween(String value1, String value2) {
            addCriterion("class_recommend_image between", value1, value2, "classRecommendImage");
            return (Criteria) this;
        }

        public Criteria andClassRecommendImageNotBetween(String value1, String value2) {
            addCriterion("class_recommend_image not between", value1, value2, "classRecommendImage");
            return (Criteria) this;
        }

        public Criteria andRecommendImageTouchUrlIsNull() {
            addCriterion("recommend_image_touch_url is null");
            return (Criteria) this;
        }

        public Criteria andRecommendImageTouchUrlIsNotNull() {
            addCriterion("recommend_image_touch_url is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendImageTouchUrlEqualTo(String value) {
            addCriterion("recommend_image_touch_url =", value, "recommendImageTouchUrl");
            return (Criteria) this;
        }

        public Criteria andRecommendImageTouchUrlNotEqualTo(String value) {
            addCriterion("recommend_image_touch_url <>", value, "recommendImageTouchUrl");
            return (Criteria) this;
        }

        public Criteria andRecommendImageTouchUrlGreaterThan(String value) {
            addCriterion("recommend_image_touch_url >", value, "recommendImageTouchUrl");
            return (Criteria) this;
        }

        public Criteria andRecommendImageTouchUrlGreaterThanOrEqualTo(String value) {
            addCriterion("recommend_image_touch_url >=", value, "recommendImageTouchUrl");
            return (Criteria) this;
        }

        public Criteria andRecommendImageTouchUrlLessThan(String value) {
            addCriterion("recommend_image_touch_url <", value, "recommendImageTouchUrl");
            return (Criteria) this;
        }

        public Criteria andRecommendImageTouchUrlLessThanOrEqualTo(String value) {
            addCriterion("recommend_image_touch_url <=", value, "recommendImageTouchUrl");
            return (Criteria) this;
        }

        public Criteria andRecommendImageTouchUrlLike(String value) {
            addCriterion("recommend_image_touch_url like", value, "recommendImageTouchUrl");
            return (Criteria) this;
        }

        public Criteria andRecommendImageTouchUrlNotLike(String value) {
            addCriterion("recommend_image_touch_url not like", value, "recommendImageTouchUrl");
            return (Criteria) this;
        }

        public Criteria andRecommendImageTouchUrlIn(List<String> values) {
            addCriterion("recommend_image_touch_url in", values, "recommendImageTouchUrl");
            return (Criteria) this;
        }

        public Criteria andRecommendImageTouchUrlNotIn(List<String> values) {
            addCriterion("recommend_image_touch_url not in", values, "recommendImageTouchUrl");
            return (Criteria) this;
        }

        public Criteria andRecommendImageTouchUrlBetween(String value1, String value2) {
            addCriterion("recommend_image_touch_url between", value1, value2, "recommendImageTouchUrl");
            return (Criteria) this;
        }

        public Criteria andRecommendImageTouchUrlNotBetween(String value1, String value2) {
            addCriterion("recommend_image_touch_url not between", value1, value2, "recommendImageTouchUrl");
            return (Criteria) this;
        }

        public Criteria andClassStateIsNull() {
            addCriterion("class_state is null");
            return (Criteria) this;
        }

        public Criteria andClassStateIsNotNull() {
            addCriterion("class_state is not null");
            return (Criteria) this;
        }

        public Criteria andClassStateEqualTo(Byte value) {
            addCriterion("class_state =", value, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateNotEqualTo(Byte value) {
            addCriterion("class_state <>", value, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateGreaterThan(Byte value) {
            addCriterion("class_state >", value, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("class_state >=", value, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateLessThan(Byte value) {
            addCriterion("class_state <", value, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateLessThanOrEqualTo(Byte value) {
            addCriterion("class_state <=", value, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateIn(List<Byte> values) {
            addCriterion("class_state in", values, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateNotIn(List<Byte> values) {
            addCriterion("class_state not in", values, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateBetween(Byte value1, Byte value2) {
            addCriterion("class_state between", value1, value2, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateNotBetween(Byte value1, Byte value2) {
            addCriterion("class_state not between", value1, value2, "classState");
            return (Criteria) this;
        }

        public Criteria andUpdateAuthorIsNull() {
            addCriterion("update_author is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAuthorIsNotNull() {
            addCriterion("update_author is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAuthorEqualTo(String value) {
            addCriterion("update_author =", value, "updateAuthor");
            return (Criteria) this;
        }

        public Criteria andUpdateAuthorNotEqualTo(String value) {
            addCriterion("update_author <>", value, "updateAuthor");
            return (Criteria) this;
        }

        public Criteria andUpdateAuthorGreaterThan(String value) {
            addCriterion("update_author >", value, "updateAuthor");
            return (Criteria) this;
        }

        public Criteria andUpdateAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("update_author >=", value, "updateAuthor");
            return (Criteria) this;
        }

        public Criteria andUpdateAuthorLessThan(String value) {
            addCriterion("update_author <", value, "updateAuthor");
            return (Criteria) this;
        }

        public Criteria andUpdateAuthorLessThanOrEqualTo(String value) {
            addCriterion("update_author <=", value, "updateAuthor");
            return (Criteria) this;
        }

        public Criteria andUpdateAuthorLike(String value) {
            addCriterion("update_author like", value, "updateAuthor");
            return (Criteria) this;
        }

        public Criteria andUpdateAuthorNotLike(String value) {
            addCriterion("update_author not like", value, "updateAuthor");
            return (Criteria) this;
        }

        public Criteria andUpdateAuthorIn(List<String> values) {
            addCriterion("update_author in", values, "updateAuthor");
            return (Criteria) this;
        }

        public Criteria andUpdateAuthorNotIn(List<String> values) {
            addCriterion("update_author not in", values, "updateAuthor");
            return (Criteria) this;
        }

        public Criteria andUpdateAuthorBetween(String value1, String value2) {
            addCriterion("update_author between", value1, value2, "updateAuthor");
            return (Criteria) this;
        }

        public Criteria andUpdateAuthorNotBetween(String value1, String value2) {
            addCriterion("update_author not between", value1, value2, "updateAuthor");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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
    }

    /**
     * 描述:sy_biz_goods_class_manager表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-12-25
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_biz_goods_class_manager 2017-12-25
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