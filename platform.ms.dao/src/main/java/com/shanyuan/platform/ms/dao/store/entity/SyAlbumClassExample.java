package com.shanyuan.platform.ms.dao.store.entity;

import java.util.ArrayList;
import java.util.List;

public class SyAlbumClassExample {
    /**
     * sy_album_class
     */
    protected String orderByClause;

    /**
     * sy_album_class
     */
    protected boolean distinct;

    /**
     * sy_album_class
     */
    protected List<Criteria> oredCriteria;

    public SyAlbumClassExample() {
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
     * sy_album_class 2017-10-19
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

        public Criteria andAclassIdIsNull() {
            addCriterion("aclass_id is null");
            return (Criteria) this;
        }

        public Criteria andAclassIdIsNotNull() {
            addCriterion("aclass_id is not null");
            return (Criteria) this;
        }

        public Criteria andAclassIdEqualTo(Integer value) {
            addCriterion("aclass_id =", value, "aclassId");
            return (Criteria) this;
        }

        public Criteria andAclassIdNotEqualTo(Integer value) {
            addCriterion("aclass_id <>", value, "aclassId");
            return (Criteria) this;
        }

        public Criteria andAclassIdGreaterThan(Integer value) {
            addCriterion("aclass_id >", value, "aclassId");
            return (Criteria) this;
        }

        public Criteria andAclassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aclass_id >=", value, "aclassId");
            return (Criteria) this;
        }

        public Criteria andAclassIdLessThan(Integer value) {
            addCriterion("aclass_id <", value, "aclassId");
            return (Criteria) this;
        }

        public Criteria andAclassIdLessThanOrEqualTo(Integer value) {
            addCriterion("aclass_id <=", value, "aclassId");
            return (Criteria) this;
        }

        public Criteria andAclassIdIn(List<Integer> values) {
            addCriterion("aclass_id in", values, "aclassId");
            return (Criteria) this;
        }

        public Criteria andAclassIdNotIn(List<Integer> values) {
            addCriterion("aclass_id not in", values, "aclassId");
            return (Criteria) this;
        }

        public Criteria andAclassIdBetween(Integer value1, Integer value2) {
            addCriterion("aclass_id between", value1, value2, "aclassId");
            return (Criteria) this;
        }

        public Criteria andAclassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aclass_id not between", value1, value2, "aclassId");
            return (Criteria) this;
        }

        public Criteria andAclassNameIsNull() {
            addCriterion("aclass_name is null");
            return (Criteria) this;
        }

        public Criteria andAclassNameIsNotNull() {
            addCriterion("aclass_name is not null");
            return (Criteria) this;
        }

        public Criteria andAclassNameEqualTo(String value) {
            addCriterion("aclass_name =", value, "aclassName");
            return (Criteria) this;
        }

        public Criteria andAclassNameNotEqualTo(String value) {
            addCriterion("aclass_name <>", value, "aclassName");
            return (Criteria) this;
        }

        public Criteria andAclassNameGreaterThan(String value) {
            addCriterion("aclass_name >", value, "aclassName");
            return (Criteria) this;
        }

        public Criteria andAclassNameGreaterThanOrEqualTo(String value) {
            addCriterion("aclass_name >=", value, "aclassName");
            return (Criteria) this;
        }

        public Criteria andAclassNameLessThan(String value) {
            addCriterion("aclass_name <", value, "aclassName");
            return (Criteria) this;
        }

        public Criteria andAclassNameLessThanOrEqualTo(String value) {
            addCriterion("aclass_name <=", value, "aclassName");
            return (Criteria) this;
        }

        public Criteria andAclassNameLike(String value) {
            addCriterion("aclass_name like", value, "aclassName");
            return (Criteria) this;
        }

        public Criteria andAclassNameNotLike(String value) {
            addCriterion("aclass_name not like", value, "aclassName");
            return (Criteria) this;
        }

        public Criteria andAclassNameIn(List<String> values) {
            addCriterion("aclass_name in", values, "aclassName");
            return (Criteria) this;
        }

        public Criteria andAclassNameNotIn(List<String> values) {
            addCriterion("aclass_name not in", values, "aclassName");
            return (Criteria) this;
        }

        public Criteria andAclassNameBetween(String value1, String value2) {
            addCriterion("aclass_name between", value1, value2, "aclassName");
            return (Criteria) this;
        }

        public Criteria andAclassNameNotBetween(String value1, String value2) {
            addCriterion("aclass_name not between", value1, value2, "aclassName");
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

        public Criteria andAclassDesIsNull() {
            addCriterion("aclass_des is null");
            return (Criteria) this;
        }

        public Criteria andAclassDesIsNotNull() {
            addCriterion("aclass_des is not null");
            return (Criteria) this;
        }

        public Criteria andAclassDesEqualTo(String value) {
            addCriterion("aclass_des =", value, "aclassDes");
            return (Criteria) this;
        }

        public Criteria andAclassDesNotEqualTo(String value) {
            addCriterion("aclass_des <>", value, "aclassDes");
            return (Criteria) this;
        }

        public Criteria andAclassDesGreaterThan(String value) {
            addCriterion("aclass_des >", value, "aclassDes");
            return (Criteria) this;
        }

        public Criteria andAclassDesGreaterThanOrEqualTo(String value) {
            addCriterion("aclass_des >=", value, "aclassDes");
            return (Criteria) this;
        }

        public Criteria andAclassDesLessThan(String value) {
            addCriterion("aclass_des <", value, "aclassDes");
            return (Criteria) this;
        }

        public Criteria andAclassDesLessThanOrEqualTo(String value) {
            addCriterion("aclass_des <=", value, "aclassDes");
            return (Criteria) this;
        }

        public Criteria andAclassDesLike(String value) {
            addCriterion("aclass_des like", value, "aclassDes");
            return (Criteria) this;
        }

        public Criteria andAclassDesNotLike(String value) {
            addCriterion("aclass_des not like", value, "aclassDes");
            return (Criteria) this;
        }

        public Criteria andAclassDesIn(List<String> values) {
            addCriterion("aclass_des in", values, "aclassDes");
            return (Criteria) this;
        }

        public Criteria andAclassDesNotIn(List<String> values) {
            addCriterion("aclass_des not in", values, "aclassDes");
            return (Criteria) this;
        }

        public Criteria andAclassDesBetween(String value1, String value2) {
            addCriterion("aclass_des between", value1, value2, "aclassDes");
            return (Criteria) this;
        }

        public Criteria andAclassDesNotBetween(String value1, String value2) {
            addCriterion("aclass_des not between", value1, value2, "aclassDes");
            return (Criteria) this;
        }

        public Criteria andAclassSortIsNull() {
            addCriterion("aclass_sort is null");
            return (Criteria) this;
        }

        public Criteria andAclassSortIsNotNull() {
            addCriterion("aclass_sort is not null");
            return (Criteria) this;
        }

        public Criteria andAclassSortEqualTo(Integer value) {
            addCriterion("aclass_sort =", value, "aclassSort");
            return (Criteria) this;
        }

        public Criteria andAclassSortNotEqualTo(Integer value) {
            addCriterion("aclass_sort <>", value, "aclassSort");
            return (Criteria) this;
        }

        public Criteria andAclassSortGreaterThan(Integer value) {
            addCriterion("aclass_sort >", value, "aclassSort");
            return (Criteria) this;
        }

        public Criteria andAclassSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("aclass_sort >=", value, "aclassSort");
            return (Criteria) this;
        }

        public Criteria andAclassSortLessThan(Integer value) {
            addCriterion("aclass_sort <", value, "aclassSort");
            return (Criteria) this;
        }

        public Criteria andAclassSortLessThanOrEqualTo(Integer value) {
            addCriterion("aclass_sort <=", value, "aclassSort");
            return (Criteria) this;
        }

        public Criteria andAclassSortIn(List<Integer> values) {
            addCriterion("aclass_sort in", values, "aclassSort");
            return (Criteria) this;
        }

        public Criteria andAclassSortNotIn(List<Integer> values) {
            addCriterion("aclass_sort not in", values, "aclassSort");
            return (Criteria) this;
        }

        public Criteria andAclassSortBetween(Integer value1, Integer value2) {
            addCriterion("aclass_sort between", value1, value2, "aclassSort");
            return (Criteria) this;
        }

        public Criteria andAclassSortNotBetween(Integer value1, Integer value2) {
            addCriterion("aclass_sort not between", value1, value2, "aclassSort");
            return (Criteria) this;
        }

        public Criteria andAclassCoverIsNull() {
            addCriterion("aclass_cover is null");
            return (Criteria) this;
        }

        public Criteria andAclassCoverIsNotNull() {
            addCriterion("aclass_cover is not null");
            return (Criteria) this;
        }

        public Criteria andAclassCoverEqualTo(String value) {
            addCriterion("aclass_cover =", value, "aclassCover");
            return (Criteria) this;
        }

        public Criteria andAclassCoverNotEqualTo(String value) {
            addCriterion("aclass_cover <>", value, "aclassCover");
            return (Criteria) this;
        }

        public Criteria andAclassCoverGreaterThan(String value) {
            addCriterion("aclass_cover >", value, "aclassCover");
            return (Criteria) this;
        }

        public Criteria andAclassCoverGreaterThanOrEqualTo(String value) {
            addCriterion("aclass_cover >=", value, "aclassCover");
            return (Criteria) this;
        }

        public Criteria andAclassCoverLessThan(String value) {
            addCriterion("aclass_cover <", value, "aclassCover");
            return (Criteria) this;
        }

        public Criteria andAclassCoverLessThanOrEqualTo(String value) {
            addCriterion("aclass_cover <=", value, "aclassCover");
            return (Criteria) this;
        }

        public Criteria andAclassCoverLike(String value) {
            addCriterion("aclass_cover like", value, "aclassCover");
            return (Criteria) this;
        }

        public Criteria andAclassCoverNotLike(String value) {
            addCriterion("aclass_cover not like", value, "aclassCover");
            return (Criteria) this;
        }

        public Criteria andAclassCoverIn(List<String> values) {
            addCriterion("aclass_cover in", values, "aclassCover");
            return (Criteria) this;
        }

        public Criteria andAclassCoverNotIn(List<String> values) {
            addCriterion("aclass_cover not in", values, "aclassCover");
            return (Criteria) this;
        }

        public Criteria andAclassCoverBetween(String value1, String value2) {
            addCriterion("aclass_cover between", value1, value2, "aclassCover");
            return (Criteria) this;
        }

        public Criteria andAclassCoverNotBetween(String value1, String value2) {
            addCriterion("aclass_cover not between", value1, value2, "aclassCover");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNull() {
            addCriterion("upload_time is null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNotNull() {
            addCriterion("upload_time is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeEqualTo(Integer value) {
            addCriterion("upload_time =", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotEqualTo(Integer value) {
            addCriterion("upload_time <>", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThan(Integer value) {
            addCriterion("upload_time >", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("upload_time >=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThan(Integer value) {
            addCriterion("upload_time <", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThanOrEqualTo(Integer value) {
            addCriterion("upload_time <=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIn(List<Integer> values) {
            addCriterion("upload_time in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotIn(List<Integer> values) {
            addCriterion("upload_time not in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeBetween(Integer value1, Integer value2) {
            addCriterion("upload_time between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("upload_time not between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(Byte value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(Byte value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(Byte value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(Byte value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(Byte value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<Byte> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<Byte> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(Byte value1, Byte value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(Byte value1, Byte value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_album_class表的实体类
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
     * sy_album_class 2017-10-19
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