package com.shanyuan.platform.ms.dao.union.entity;

import java.util.ArrayList;
import java.util.List;

public class SyUnionExample {
    /**
     * sy_union
     */
    protected String orderByClause;

    /**
     * sy_union
     */
    protected boolean distinct;

    /**
     * sy_union
     */
    protected List<Criteria> oredCriteria;

    public SyUnionExample() {
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
     * sy_union 2017-10-31
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

        public Criteria andUnionIdIsNull() {
            addCriterion("union_id is null");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNotNull() {
            addCriterion("union_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnionIdEqualTo(Integer value) {
            addCriterion("union_id =", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotEqualTo(Integer value) {
            addCriterion("union_id <>", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThan(Integer value) {
            addCriterion("union_id >", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("union_id >=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThan(Integer value) {
            addCriterion("union_id <", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThanOrEqualTo(Integer value) {
            addCriterion("union_id <=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIn(List<Integer> values) {
            addCriterion("union_id in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotIn(List<Integer> values) {
            addCriterion("union_id not in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdBetween(Integer value1, Integer value2) {
            addCriterion("union_id between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("union_id not between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionNameIsNull() {
            addCriterion("union_name is null");
            return (Criteria) this;
        }

        public Criteria andUnionNameIsNotNull() {
            addCriterion("union_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnionNameEqualTo(String value) {
            addCriterion("union_name =", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameNotEqualTo(String value) {
            addCriterion("union_name <>", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameGreaterThan(String value) {
            addCriterion("union_name >", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameGreaterThanOrEqualTo(String value) {
            addCriterion("union_name >=", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameLessThan(String value) {
            addCriterion("union_name <", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameLessThanOrEqualTo(String value) {
            addCriterion("union_name <=", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameLike(String value) {
            addCriterion("union_name like", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameNotLike(String value) {
            addCriterion("union_name not like", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameIn(List<String> values) {
            addCriterion("union_name in", values, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameNotIn(List<String> values) {
            addCriterion("union_name not in", values, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameBetween(String value1, String value2) {
            addCriterion("union_name between", value1, value2, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameNotBetween(String value1, String value2) {
            addCriterion("union_name not between", value1, value2, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionChannelIsNull() {
            addCriterion("union_channel is null");
            return (Criteria) this;
        }

        public Criteria andUnionChannelIsNotNull() {
            addCriterion("union_channel is not null");
            return (Criteria) this;
        }

        public Criteria andUnionChannelEqualTo(String value) {
            addCriterion("union_channel =", value, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelNotEqualTo(String value) {
            addCriterion("union_channel <>", value, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelGreaterThan(String value) {
            addCriterion("union_channel >", value, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelGreaterThanOrEqualTo(String value) {
            addCriterion("union_channel >=", value, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelLessThan(String value) {
            addCriterion("union_channel <", value, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelLessThanOrEqualTo(String value) {
            addCriterion("union_channel <=", value, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelLike(String value) {
            addCriterion("union_channel like", value, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelNotLike(String value) {
            addCriterion("union_channel not like", value, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelIn(List<String> values) {
            addCriterion("union_channel in", values, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelNotIn(List<String> values) {
            addCriterion("union_channel not in", values, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelBetween(String value1, String value2) {
            addCriterion("union_channel between", value1, value2, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionChannelNotBetween(String value1, String value2) {
            addCriterion("union_channel not between", value1, value2, "unionChannel");
            return (Criteria) this;
        }

        public Criteria andUnionImageIsNull() {
            addCriterion("union_image is null");
            return (Criteria) this;
        }

        public Criteria andUnionImageIsNotNull() {
            addCriterion("union_image is not null");
            return (Criteria) this;
        }

        public Criteria andUnionImageEqualTo(String value) {
            addCriterion("union_image =", value, "unionImage");
            return (Criteria) this;
        }

        public Criteria andUnionImageNotEqualTo(String value) {
            addCriterion("union_image <>", value, "unionImage");
            return (Criteria) this;
        }

        public Criteria andUnionImageGreaterThan(String value) {
            addCriterion("union_image >", value, "unionImage");
            return (Criteria) this;
        }

        public Criteria andUnionImageGreaterThanOrEqualTo(String value) {
            addCriterion("union_image >=", value, "unionImage");
            return (Criteria) this;
        }

        public Criteria andUnionImageLessThan(String value) {
            addCriterion("union_image <", value, "unionImage");
            return (Criteria) this;
        }

        public Criteria andUnionImageLessThanOrEqualTo(String value) {
            addCriterion("union_image <=", value, "unionImage");
            return (Criteria) this;
        }

        public Criteria andUnionImageLike(String value) {
            addCriterion("union_image like", value, "unionImage");
            return (Criteria) this;
        }

        public Criteria andUnionImageNotLike(String value) {
            addCriterion("union_image not like", value, "unionImage");
            return (Criteria) this;
        }

        public Criteria andUnionImageIn(List<String> values) {
            addCriterion("union_image in", values, "unionImage");
            return (Criteria) this;
        }

        public Criteria andUnionImageNotIn(List<String> values) {
            addCriterion("union_image not in", values, "unionImage");
            return (Criteria) this;
        }

        public Criteria andUnionImageBetween(String value1, String value2) {
            addCriterion("union_image between", value1, value2, "unionImage");
            return (Criteria) this;
        }

        public Criteria andUnionImageNotBetween(String value1, String value2) {
            addCriterion("union_image not between", value1, value2, "unionImage");
            return (Criteria) this;
        }

        public Criteria andUnionDisImageIsNull() {
            addCriterion("union_dis_image is null");
            return (Criteria) this;
        }

        public Criteria andUnionDisImageIsNotNull() {
            addCriterion("union_dis_image is not null");
            return (Criteria) this;
        }

        public Criteria andUnionDisImageEqualTo(String value) {
            addCriterion("union_dis_image =", value, "unionDisImage");
            return (Criteria) this;
        }

        public Criteria andUnionDisImageNotEqualTo(String value) {
            addCriterion("union_dis_image <>", value, "unionDisImage");
            return (Criteria) this;
        }

        public Criteria andUnionDisImageGreaterThan(String value) {
            addCriterion("union_dis_image >", value, "unionDisImage");
            return (Criteria) this;
        }

        public Criteria andUnionDisImageGreaterThanOrEqualTo(String value) {
            addCriterion("union_dis_image >=", value, "unionDisImage");
            return (Criteria) this;
        }

        public Criteria andUnionDisImageLessThan(String value) {
            addCriterion("union_dis_image <", value, "unionDisImage");
            return (Criteria) this;
        }

        public Criteria andUnionDisImageLessThanOrEqualTo(String value) {
            addCriterion("union_dis_image <=", value, "unionDisImage");
            return (Criteria) this;
        }

        public Criteria andUnionDisImageLike(String value) {
            addCriterion("union_dis_image like", value, "unionDisImage");
            return (Criteria) this;
        }

        public Criteria andUnionDisImageNotLike(String value) {
            addCriterion("union_dis_image not like", value, "unionDisImage");
            return (Criteria) this;
        }

        public Criteria andUnionDisImageIn(List<String> values) {
            addCriterion("union_dis_image in", values, "unionDisImage");
            return (Criteria) this;
        }

        public Criteria andUnionDisImageNotIn(List<String> values) {
            addCriterion("union_dis_image not in", values, "unionDisImage");
            return (Criteria) this;
        }

        public Criteria andUnionDisImageBetween(String value1, String value2) {
            addCriterion("union_dis_image between", value1, value2, "unionDisImage");
            return (Criteria) this;
        }

        public Criteria andUnionDisImageNotBetween(String value1, String value2) {
            addCriterion("union_dis_image not between", value1, value2, "unionDisImage");
            return (Criteria) this;
        }

        public Criteria andUnionTypeIsNull() {
            addCriterion("union_type is null");
            return (Criteria) this;
        }

        public Criteria andUnionTypeIsNotNull() {
            addCriterion("union_type is not null");
            return (Criteria) this;
        }

        public Criteria andUnionTypeEqualTo(Byte value) {
            addCriterion("union_type =", value, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionTypeNotEqualTo(Byte value) {
            addCriterion("union_type <>", value, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionTypeGreaterThan(Byte value) {
            addCriterion("union_type >", value, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("union_type >=", value, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionTypeLessThan(Byte value) {
            addCriterion("union_type <", value, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionTypeLessThanOrEqualTo(Byte value) {
            addCriterion("union_type <=", value, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionTypeIn(List<Byte> values) {
            addCriterion("union_type in", values, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionTypeNotIn(List<Byte> values) {
            addCriterion("union_type not in", values, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionTypeBetween(Byte value1, Byte value2) {
            addCriterion("union_type between", value1, value2, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("union_type not between", value1, value2, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionHiddenIsNull() {
            addCriterion("union_hidden is null");
            return (Criteria) this;
        }

        public Criteria andUnionHiddenIsNotNull() {
            addCriterion("union_hidden is not null");
            return (Criteria) this;
        }

        public Criteria andUnionHiddenEqualTo(Byte value) {
            addCriterion("union_hidden =", value, "unionHidden");
            return (Criteria) this;
        }

        public Criteria andUnionHiddenNotEqualTo(Byte value) {
            addCriterion("union_hidden <>", value, "unionHidden");
            return (Criteria) this;
        }

        public Criteria andUnionHiddenGreaterThan(Byte value) {
            addCriterion("union_hidden >", value, "unionHidden");
            return (Criteria) this;
        }

        public Criteria andUnionHiddenGreaterThanOrEqualTo(Byte value) {
            addCriterion("union_hidden >=", value, "unionHidden");
            return (Criteria) this;
        }

        public Criteria andUnionHiddenLessThan(Byte value) {
            addCriterion("union_hidden <", value, "unionHidden");
            return (Criteria) this;
        }

        public Criteria andUnionHiddenLessThanOrEqualTo(Byte value) {
            addCriterion("union_hidden <=", value, "unionHidden");
            return (Criteria) this;
        }

        public Criteria andUnionHiddenIn(List<Byte> values) {
            addCriterion("union_hidden in", values, "unionHidden");
            return (Criteria) this;
        }

        public Criteria andUnionHiddenNotIn(List<Byte> values) {
            addCriterion("union_hidden not in", values, "unionHidden");
            return (Criteria) this;
        }

        public Criteria andUnionHiddenBetween(Byte value1, Byte value2) {
            addCriterion("union_hidden between", value1, value2, "unionHidden");
            return (Criteria) this;
        }

        public Criteria andUnionHiddenNotBetween(Byte value1, Byte value2) {
            addCriterion("union_hidden not between", value1, value2, "unionHidden");
            return (Criteria) this;
        }

        public Criteria andUnionFreeIsNull() {
            addCriterion("union_free is null");
            return (Criteria) this;
        }

        public Criteria andUnionFreeIsNotNull() {
            addCriterion("union_free is not null");
            return (Criteria) this;
        }

        public Criteria andUnionFreeEqualTo(Byte value) {
            addCriterion("union_free =", value, "unionFree");
            return (Criteria) this;
        }

        public Criteria andUnionFreeNotEqualTo(Byte value) {
            addCriterion("union_free <>", value, "unionFree");
            return (Criteria) this;
        }

        public Criteria andUnionFreeGreaterThan(Byte value) {
            addCriterion("union_free >", value, "unionFree");
            return (Criteria) this;
        }

        public Criteria andUnionFreeGreaterThanOrEqualTo(Byte value) {
            addCriterion("union_free >=", value, "unionFree");
            return (Criteria) this;
        }

        public Criteria andUnionFreeLessThan(Byte value) {
            addCriterion("union_free <", value, "unionFree");
            return (Criteria) this;
        }

        public Criteria andUnionFreeLessThanOrEqualTo(Byte value) {
            addCriterion("union_free <=", value, "unionFree");
            return (Criteria) this;
        }

        public Criteria andUnionFreeIn(List<Byte> values) {
            addCriterion("union_free in", values, "unionFree");
            return (Criteria) this;
        }

        public Criteria andUnionFreeNotIn(List<Byte> values) {
            addCriterion("union_free not in", values, "unionFree");
            return (Criteria) this;
        }

        public Criteria andUnionFreeBetween(Byte value1, Byte value2) {
            addCriterion("union_free between", value1, value2, "unionFree");
            return (Criteria) this;
        }

        public Criteria andUnionFreeNotBetween(Byte value1, Byte value2) {
            addCriterion("union_free not between", value1, value2, "unionFree");
            return (Criteria) this;
        }

        public Criteria andUnionSortIsNull() {
            addCriterion("union_sort is null");
            return (Criteria) this;
        }

        public Criteria andUnionSortIsNotNull() {
            addCriterion("union_sort is not null");
            return (Criteria) this;
        }

        public Criteria andUnionSortEqualTo(Integer value) {
            addCriterion("union_sort =", value, "unionSort");
            return (Criteria) this;
        }

        public Criteria andUnionSortNotEqualTo(Integer value) {
            addCriterion("union_sort <>", value, "unionSort");
            return (Criteria) this;
        }

        public Criteria andUnionSortGreaterThan(Integer value) {
            addCriterion("union_sort >", value, "unionSort");
            return (Criteria) this;
        }

        public Criteria andUnionSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("union_sort >=", value, "unionSort");
            return (Criteria) this;
        }

        public Criteria andUnionSortLessThan(Integer value) {
            addCriterion("union_sort <", value, "unionSort");
            return (Criteria) this;
        }

        public Criteria andUnionSortLessThanOrEqualTo(Integer value) {
            addCriterion("union_sort <=", value, "unionSort");
            return (Criteria) this;
        }

        public Criteria andUnionSortIn(List<Integer> values) {
            addCriterion("union_sort in", values, "unionSort");
            return (Criteria) this;
        }

        public Criteria andUnionSortNotIn(List<Integer> values) {
            addCriterion("union_sort not in", values, "unionSort");
            return (Criteria) this;
        }

        public Criteria andUnionSortBetween(Integer value1, Integer value2) {
            addCriterion("union_sort between", value1, value2, "unionSort");
            return (Criteria) this;
        }

        public Criteria andUnionSortNotBetween(Integer value1, Integer value2) {
            addCriterion("union_sort not between", value1, value2, "unionSort");
            return (Criteria) this;
        }

        public Criteria andUnionDelIsNull() {
            addCriterion("union_del is null");
            return (Criteria) this;
        }

        public Criteria andUnionDelIsNotNull() {
            addCriterion("union_del is not null");
            return (Criteria) this;
        }

        public Criteria andUnionDelEqualTo(Byte value) {
            addCriterion("union_del =", value, "unionDel");
            return (Criteria) this;
        }

        public Criteria andUnionDelNotEqualTo(Byte value) {
            addCriterion("union_del <>", value, "unionDel");
            return (Criteria) this;
        }

        public Criteria andUnionDelGreaterThan(Byte value) {
            addCriterion("union_del >", value, "unionDel");
            return (Criteria) this;
        }

        public Criteria andUnionDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("union_del >=", value, "unionDel");
            return (Criteria) this;
        }

        public Criteria andUnionDelLessThan(Byte value) {
            addCriterion("union_del <", value, "unionDel");
            return (Criteria) this;
        }

        public Criteria andUnionDelLessThanOrEqualTo(Byte value) {
            addCriterion("union_del <=", value, "unionDel");
            return (Criteria) this;
        }

        public Criteria andUnionDelIn(List<Byte> values) {
            addCriterion("union_del in", values, "unionDel");
            return (Criteria) this;
        }

        public Criteria andUnionDelNotIn(List<Byte> values) {
            addCriterion("union_del not in", values, "unionDel");
            return (Criteria) this;
        }

        public Criteria andUnionDelBetween(Byte value1, Byte value2) {
            addCriterion("union_del between", value1, value2, "unionDel");
            return (Criteria) this;
        }

        public Criteria andUnionDelNotBetween(Byte value1, Byte value2) {
            addCriterion("union_del not between", value1, value2, "unionDel");
            return (Criteria) this;
        }

        public Criteria andUnionOperationIsNull() {
            addCriterion("union_operation is null");
            return (Criteria) this;
        }

        public Criteria andUnionOperationIsNotNull() {
            addCriterion("union_operation is not null");
            return (Criteria) this;
        }

        public Criteria andUnionOperationEqualTo(Byte value) {
            addCriterion("union_operation =", value, "unionOperation");
            return (Criteria) this;
        }

        public Criteria andUnionOperationNotEqualTo(Byte value) {
            addCriterion("union_operation <>", value, "unionOperation");
            return (Criteria) this;
        }

        public Criteria andUnionOperationGreaterThan(Byte value) {
            addCriterion("union_operation >", value, "unionOperation");
            return (Criteria) this;
        }

        public Criteria andUnionOperationGreaterThanOrEqualTo(Byte value) {
            addCriterion("union_operation >=", value, "unionOperation");
            return (Criteria) this;
        }

        public Criteria andUnionOperationLessThan(Byte value) {
            addCriterion("union_operation <", value, "unionOperation");
            return (Criteria) this;
        }

        public Criteria andUnionOperationLessThanOrEqualTo(Byte value) {
            addCriterion("union_operation <=", value, "unionOperation");
            return (Criteria) this;
        }

        public Criteria andUnionOperationIn(List<Byte> values) {
            addCriterion("union_operation in", values, "unionOperation");
            return (Criteria) this;
        }

        public Criteria andUnionOperationNotIn(List<Byte> values) {
            addCriterion("union_operation not in", values, "unionOperation");
            return (Criteria) this;
        }

        public Criteria andUnionOperationBetween(Byte value1, Byte value2) {
            addCriterion("union_operation between", value1, value2, "unionOperation");
            return (Criteria) this;
        }

        public Criteria andUnionOperationNotBetween(Byte value1, Byte value2) {
            addCriterion("union_operation not between", value1, value2, "unionOperation");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIsNull() {
            addCriterion("banner_url is null");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIsNotNull() {
            addCriterion("banner_url is not null");
            return (Criteria) this;
        }

        public Criteria andBannerUrlEqualTo(String value) {
            addCriterion("banner_url =", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotEqualTo(String value) {
            addCriterion("banner_url <>", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlGreaterThan(String value) {
            addCriterion("banner_url >", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("banner_url >=", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLessThan(String value) {
            addCriterion("banner_url <", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLessThanOrEqualTo(String value) {
            addCriterion("banner_url <=", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLike(String value) {
            addCriterion("banner_url like", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotLike(String value) {
            addCriterion("banner_url not like", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIn(List<String> values) {
            addCriterion("banner_url in", values, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotIn(List<String> values) {
            addCriterion("banner_url not in", values, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlBetween(String value1, String value2) {
            addCriterion("banner_url between", value1, value2, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotBetween(String value1, String value2) {
            addCriterion("banner_url not between", value1, value2, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andRegistableIsNull() {
            addCriterion("registable is null");
            return (Criteria) this;
        }

        public Criteria andRegistableIsNotNull() {
            addCriterion("registable is not null");
            return (Criteria) this;
        }

        public Criteria andRegistableEqualTo(Byte value) {
            addCriterion("registable =", value, "registable");
            return (Criteria) this;
        }

        public Criteria andRegistableNotEqualTo(Byte value) {
            addCriterion("registable <>", value, "registable");
            return (Criteria) this;
        }

        public Criteria andRegistableGreaterThan(Byte value) {
            addCriterion("registable >", value, "registable");
            return (Criteria) this;
        }

        public Criteria andRegistableGreaterThanOrEqualTo(Byte value) {
            addCriterion("registable >=", value, "registable");
            return (Criteria) this;
        }

        public Criteria andRegistableLessThan(Byte value) {
            addCriterion("registable <", value, "registable");
            return (Criteria) this;
        }

        public Criteria andRegistableLessThanOrEqualTo(Byte value) {
            addCriterion("registable <=", value, "registable");
            return (Criteria) this;
        }

        public Criteria andRegistableIn(List<Byte> values) {
            addCriterion("registable in", values, "registable");
            return (Criteria) this;
        }

        public Criteria andRegistableNotIn(List<Byte> values) {
            addCriterion("registable not in", values, "registable");
            return (Criteria) this;
        }

        public Criteria andRegistableBetween(Byte value1, Byte value2) {
            addCriterion("registable between", value1, value2, "registable");
            return (Criteria) this;
        }

        public Criteria andRegistableNotBetween(Byte value1, Byte value2) {
            addCriterion("registable not between", value1, value2, "registable");
            return (Criteria) this;
        }

        public Criteria andUnionDescIsNull() {
            addCriterion("union_desc is null");
            return (Criteria) this;
        }

        public Criteria andUnionDescIsNotNull() {
            addCriterion("union_desc is not null");
            return (Criteria) this;
        }

        public Criteria andUnionDescEqualTo(String value) {
            addCriterion("union_desc =", value, "unionDesc");
            return (Criteria) this;
        }

        public Criteria andUnionDescNotEqualTo(String value) {
            addCriterion("union_desc <>", value, "unionDesc");
            return (Criteria) this;
        }

        public Criteria andUnionDescGreaterThan(String value) {
            addCriterion("union_desc >", value, "unionDesc");
            return (Criteria) this;
        }

        public Criteria andUnionDescGreaterThanOrEqualTo(String value) {
            addCriterion("union_desc >=", value, "unionDesc");
            return (Criteria) this;
        }

        public Criteria andUnionDescLessThan(String value) {
            addCriterion("union_desc <", value, "unionDesc");
            return (Criteria) this;
        }

        public Criteria andUnionDescLessThanOrEqualTo(String value) {
            addCriterion("union_desc <=", value, "unionDesc");
            return (Criteria) this;
        }

        public Criteria andUnionDescLike(String value) {
            addCriterion("union_desc like", value, "unionDesc");
            return (Criteria) this;
        }

        public Criteria andUnionDescNotLike(String value) {
            addCriterion("union_desc not like", value, "unionDesc");
            return (Criteria) this;
        }

        public Criteria andUnionDescIn(List<String> values) {
            addCriterion("union_desc in", values, "unionDesc");
            return (Criteria) this;
        }

        public Criteria andUnionDescNotIn(List<String> values) {
            addCriterion("union_desc not in", values, "unionDesc");
            return (Criteria) this;
        }

        public Criteria andUnionDescBetween(String value1, String value2) {
            addCriterion("union_desc between", value1, value2, "unionDesc");
            return (Criteria) this;
        }

        public Criteria andUnionDescNotBetween(String value1, String value2) {
            addCriterion("union_desc not between", value1, value2, "unionDesc");
            return (Criteria) this;
        }

        public Criteria andUnionCircleLevelIsNull() {
            addCriterion("union_circle_level is null");
            return (Criteria) this;
        }

        public Criteria andUnionCircleLevelIsNotNull() {
            addCriterion("union_circle_level is not null");
            return (Criteria) this;
        }

        public Criteria andUnionCircleLevelEqualTo(Byte value) {
            addCriterion("union_circle_level =", value, "unionCircleLevel");
            return (Criteria) this;
        }

        public Criteria andUnionCircleLevelNotEqualTo(Byte value) {
            addCriterion("union_circle_level <>", value, "unionCircleLevel");
            return (Criteria) this;
        }

        public Criteria andUnionCircleLevelGreaterThan(Byte value) {
            addCriterion("union_circle_level >", value, "unionCircleLevel");
            return (Criteria) this;
        }

        public Criteria andUnionCircleLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("union_circle_level >=", value, "unionCircleLevel");
            return (Criteria) this;
        }

        public Criteria andUnionCircleLevelLessThan(Byte value) {
            addCriterion("union_circle_level <", value, "unionCircleLevel");
            return (Criteria) this;
        }

        public Criteria andUnionCircleLevelLessThanOrEqualTo(Byte value) {
            addCriterion("union_circle_level <=", value, "unionCircleLevel");
            return (Criteria) this;
        }

        public Criteria andUnionCircleLevelIn(List<Byte> values) {
            addCriterion("union_circle_level in", values, "unionCircleLevel");
            return (Criteria) this;
        }

        public Criteria andUnionCircleLevelNotIn(List<Byte> values) {
            addCriterion("union_circle_level not in", values, "unionCircleLevel");
            return (Criteria) this;
        }

        public Criteria andUnionCircleLevelBetween(Byte value1, Byte value2) {
            addCriterion("union_circle_level between", value1, value2, "unionCircleLevel");
            return (Criteria) this;
        }

        public Criteria andUnionCircleLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("union_circle_level not between", value1, value2, "unionCircleLevel");
            return (Criteria) this;
        }

        public Criteria andUnionBannerIsNull() {
            addCriterion("union_banner is null");
            return (Criteria) this;
        }

        public Criteria andUnionBannerIsNotNull() {
            addCriterion("union_banner is not null");
            return (Criteria) this;
        }

        public Criteria andUnionBannerEqualTo(String value) {
            addCriterion("union_banner =", value, "unionBanner");
            return (Criteria) this;
        }

        public Criteria andUnionBannerNotEqualTo(String value) {
            addCriterion("union_banner <>", value, "unionBanner");
            return (Criteria) this;
        }

        public Criteria andUnionBannerGreaterThan(String value) {
            addCriterion("union_banner >", value, "unionBanner");
            return (Criteria) this;
        }

        public Criteria andUnionBannerGreaterThanOrEqualTo(String value) {
            addCriterion("union_banner >=", value, "unionBanner");
            return (Criteria) this;
        }

        public Criteria andUnionBannerLessThan(String value) {
            addCriterion("union_banner <", value, "unionBanner");
            return (Criteria) this;
        }

        public Criteria andUnionBannerLessThanOrEqualTo(String value) {
            addCriterion("union_banner <=", value, "unionBanner");
            return (Criteria) this;
        }

        public Criteria andUnionBannerLike(String value) {
            addCriterion("union_banner like", value, "unionBanner");
            return (Criteria) this;
        }

        public Criteria andUnionBannerNotLike(String value) {
            addCriterion("union_banner not like", value, "unionBanner");
            return (Criteria) this;
        }

        public Criteria andUnionBannerIn(List<String> values) {
            addCriterion("union_banner in", values, "unionBanner");
            return (Criteria) this;
        }

        public Criteria andUnionBannerNotIn(List<String> values) {
            addCriterion("union_banner not in", values, "unionBanner");
            return (Criteria) this;
        }

        public Criteria andUnionBannerBetween(String value1, String value2) {
            addCriterion("union_banner between", value1, value2, "unionBanner");
            return (Criteria) this;
        }

        public Criteria andUnionBannerNotBetween(String value1, String value2) {
            addCriterion("union_banner not between", value1, value2, "unionBanner");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Integer value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Integer value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Integer> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUnionTopListFlagIsNull() {
            addCriterion("union_top_list_flag is null");
            return (Criteria) this;
        }

        public Criteria andUnionTopListFlagIsNotNull() {
            addCriterion("union_top_list_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUnionTopListFlagEqualTo(Byte value) {
            addCriterion("union_top_list_flag =", value, "unionTopListFlag");
            return (Criteria) this;
        }

        public Criteria andUnionTopListFlagNotEqualTo(Byte value) {
            addCriterion("union_top_list_flag <>", value, "unionTopListFlag");
            return (Criteria) this;
        }

        public Criteria andUnionTopListFlagGreaterThan(Byte value) {
            addCriterion("union_top_list_flag >", value, "unionTopListFlag");
            return (Criteria) this;
        }

        public Criteria andUnionTopListFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("union_top_list_flag >=", value, "unionTopListFlag");
            return (Criteria) this;
        }

        public Criteria andUnionTopListFlagLessThan(Byte value) {
            addCriterion("union_top_list_flag <", value, "unionTopListFlag");
            return (Criteria) this;
        }

        public Criteria andUnionTopListFlagLessThanOrEqualTo(Byte value) {
            addCriterion("union_top_list_flag <=", value, "unionTopListFlag");
            return (Criteria) this;
        }

        public Criteria andUnionTopListFlagIn(List<Byte> values) {
            addCriterion("union_top_list_flag in", values, "unionTopListFlag");
            return (Criteria) this;
        }

        public Criteria andUnionTopListFlagNotIn(List<Byte> values) {
            addCriterion("union_top_list_flag not in", values, "unionTopListFlag");
            return (Criteria) this;
        }

        public Criteria andUnionTopListFlagBetween(Byte value1, Byte value2) {
            addCriterion("union_top_list_flag between", value1, value2, "unionTopListFlag");
            return (Criteria) this;
        }

        public Criteria andUnionTopListFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("union_top_list_flag not between", value1, value2, "unionTopListFlag");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_union表的实体类
     * @version
     * @author:  k
     * @创建时间: 2017-10-31
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_union 2017-10-31
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