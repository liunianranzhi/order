package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PovertyAlleviationOverviewExample {
    /**
     * poverty_alleviation_overview
     */
    protected String orderByClause;

    /**
     * poverty_alleviation_overview
     */
    protected boolean distinct;

    /**
     * poverty_alleviation_overview
     */
    protected List<Criteria> oredCriteria;

    public PovertyAlleviationOverviewExample() {
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
     * poverty_alleviation_overview 2018-01-06
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

        public Criteria andRecIdIsNull() {
            addCriterion("rec_id is null");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNotNull() {
            addCriterion("rec_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecIdEqualTo(Integer value) {
            addCriterion("rec_id =", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotEqualTo(Integer value) {
            addCriterion("rec_id <>", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThan(Integer value) {
            addCriterion("rec_id >", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_id >=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThan(Integer value) {
            addCriterion("rec_id <", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThanOrEqualTo(Integer value) {
            addCriterion("rec_id <=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdIn(List<Integer> values) {
            addCriterion("rec_id in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotIn(List<Integer> values) {
            addCriterion("rec_id not in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdBetween(Integer value1, Integer value2) {
            addCriterion("rec_id between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_id not between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNull() {
            addCriterion("c_time is null");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNotNull() {
            addCriterion("c_time is not null");
            return (Criteria) this;
        }

        public Criteria andCTimeEqualTo(Integer value) {
            addCriterion("c_time =", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotEqualTo(Integer value) {
            addCriterion("c_time <>", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThan(Integer value) {
            addCriterion("c_time >", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_time >=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThan(Integer value) {
            addCriterion("c_time <", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThanOrEqualTo(Integer value) {
            addCriterion("c_time <=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeIn(List<Integer> values) {
            addCriterion("c_time in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotIn(List<Integer> values) {
            addCriterion("c_time not in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeBetween(Integer value1, Integer value2) {
            addCriterion("c_time between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("c_time not between", value1, value2, "cTime");
            return (Criteria) this;
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

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Long value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Long value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Long value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Long value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Long> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Long> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Long value1, Long value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("province_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("province_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("province_name =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("province_name <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("province_name >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_name >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("province_name <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("province_name <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("province_name like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("province_name not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("province_name in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("province_name not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("province_name between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("province_name not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Long value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Long value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Long value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Long value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Long value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Long> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Long> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Long value1, Long value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Long value1, Long value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(Long value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(Long value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(Long value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(Long value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(Long value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<Long> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<Long> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(Long value1, Long value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(Long value1, Long value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNull() {
            addCriterion("country_name is null");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNotNull() {
            addCriterion("country_name is not null");
            return (Criteria) this;
        }

        public Criteria andCountryNameEqualTo(String value) {
            addCriterion("country_name =", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotEqualTo(String value) {
            addCriterion("country_name <>", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThan(String value) {
            addCriterion("country_name >", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("country_name >=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThan(String value) {
            addCriterion("country_name <", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThanOrEqualTo(String value) {
            addCriterion("country_name <=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLike(String value) {
            addCriterion("country_name like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotLike(String value) {
            addCriterion("country_name not like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameIn(List<String> values) {
            addCriterion("country_name in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotIn(List<String> values) {
            addCriterion("country_name not in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameBetween(String value1, String value2) {
            addCriterion("country_name between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotBetween(String value1, String value2) {
            addCriterion("country_name not between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andTownshipIdIsNull() {
            addCriterion("township_id is null");
            return (Criteria) this;
        }

        public Criteria andTownshipIdIsNotNull() {
            addCriterion("township_id is not null");
            return (Criteria) this;
        }

        public Criteria andTownshipIdEqualTo(Long value) {
            addCriterion("township_id =", value, "townshipId");
            return (Criteria) this;
        }

        public Criteria andTownshipIdNotEqualTo(Long value) {
            addCriterion("township_id <>", value, "townshipId");
            return (Criteria) this;
        }

        public Criteria andTownshipIdGreaterThan(Long value) {
            addCriterion("township_id >", value, "townshipId");
            return (Criteria) this;
        }

        public Criteria andTownshipIdGreaterThanOrEqualTo(Long value) {
            addCriterion("township_id >=", value, "townshipId");
            return (Criteria) this;
        }

        public Criteria andTownshipIdLessThan(Long value) {
            addCriterion("township_id <", value, "townshipId");
            return (Criteria) this;
        }

        public Criteria andTownshipIdLessThanOrEqualTo(Long value) {
            addCriterion("township_id <=", value, "townshipId");
            return (Criteria) this;
        }

        public Criteria andTownshipIdIn(List<Long> values) {
            addCriterion("township_id in", values, "townshipId");
            return (Criteria) this;
        }

        public Criteria andTownshipIdNotIn(List<Long> values) {
            addCriterion("township_id not in", values, "townshipId");
            return (Criteria) this;
        }

        public Criteria andTownshipIdBetween(Long value1, Long value2) {
            addCriterion("township_id between", value1, value2, "townshipId");
            return (Criteria) this;
        }

        public Criteria andTownshipIdNotBetween(Long value1, Long value2) {
            addCriterion("township_id not between", value1, value2, "townshipId");
            return (Criteria) this;
        }

        public Criteria andTownshipNameIsNull() {
            addCriterion("township_name is null");
            return (Criteria) this;
        }

        public Criteria andTownshipNameIsNotNull() {
            addCriterion("township_name is not null");
            return (Criteria) this;
        }

        public Criteria andTownshipNameEqualTo(String value) {
            addCriterion("township_name =", value, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameNotEqualTo(String value) {
            addCriterion("township_name <>", value, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameGreaterThan(String value) {
            addCriterion("township_name >", value, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameGreaterThanOrEqualTo(String value) {
            addCriterion("township_name >=", value, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameLessThan(String value) {
            addCriterion("township_name <", value, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameLessThanOrEqualTo(String value) {
            addCriterion("township_name <=", value, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameLike(String value) {
            addCriterion("township_name like", value, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameNotLike(String value) {
            addCriterion("township_name not like", value, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameIn(List<String> values) {
            addCriterion("township_name in", values, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameNotIn(List<String> values) {
            addCriterion("township_name not in", values, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameBetween(String value1, String value2) {
            addCriterion("township_name between", value1, value2, "townshipName");
            return (Criteria) this;
        }

        public Criteria andTownshipNameNotBetween(String value1, String value2) {
            addCriterion("township_name not between", value1, value2, "townshipName");
            return (Criteria) this;
        }

        public Criteria andVillageIdIsNull() {
            addCriterion("village_id is null");
            return (Criteria) this;
        }

        public Criteria andVillageIdIsNotNull() {
            addCriterion("village_id is not null");
            return (Criteria) this;
        }

        public Criteria andVillageIdEqualTo(Long value) {
            addCriterion("village_id =", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotEqualTo(Long value) {
            addCriterion("village_id <>", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdGreaterThan(Long value) {
            addCriterion("village_id >", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("village_id >=", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdLessThan(Long value) {
            addCriterion("village_id <", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdLessThanOrEqualTo(Long value) {
            addCriterion("village_id <=", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdIn(List<Long> values) {
            addCriterion("village_id in", values, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotIn(List<Long> values) {
            addCriterion("village_id not in", values, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdBetween(Long value1, Long value2) {
            addCriterion("village_id between", value1, value2, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotBetween(Long value1, Long value2) {
            addCriterion("village_id not between", value1, value2, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageNameIsNull() {
            addCriterion("village_name is null");
            return (Criteria) this;
        }

        public Criteria andVillageNameIsNotNull() {
            addCriterion("village_name is not null");
            return (Criteria) this;
        }

        public Criteria andVillageNameEqualTo(String value) {
            addCriterion("village_name =", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameNotEqualTo(String value) {
            addCriterion("village_name <>", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameGreaterThan(String value) {
            addCriterion("village_name >", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameGreaterThanOrEqualTo(String value) {
            addCriterion("village_name >=", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameLessThan(String value) {
            addCriterion("village_name <", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameLessThanOrEqualTo(String value) {
            addCriterion("village_name <=", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameLike(String value) {
            addCriterion("village_name like", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameNotLike(String value) {
            addCriterion("village_name not like", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameIn(List<String> values) {
            addCriterion("village_name in", values, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameNotIn(List<String> values) {
            addCriterion("village_name not in", values, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameBetween(String value1, String value2) {
            addCriterion("village_name between", value1, value2, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameNotBetween(String value1, String value2) {
            addCriterion("village_name not between", value1, value2, "villageName");
            return (Criteria) this;
        }

        public Criteria andDonateAmountIsNull() {
            addCriterion("donate_amount is null");
            return (Criteria) this;
        }

        public Criteria andDonateAmountIsNotNull() {
            addCriterion("donate_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDonateAmountEqualTo(BigDecimal value) {
            addCriterion("donate_amount =", value, "donateAmount");
            return (Criteria) this;
        }

        public Criteria andDonateAmountNotEqualTo(BigDecimal value) {
            addCriterion("donate_amount <>", value, "donateAmount");
            return (Criteria) this;
        }

        public Criteria andDonateAmountGreaterThan(BigDecimal value) {
            addCriterion("donate_amount >", value, "donateAmount");
            return (Criteria) this;
        }

        public Criteria andDonateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("donate_amount >=", value, "donateAmount");
            return (Criteria) this;
        }

        public Criteria andDonateAmountLessThan(BigDecimal value) {
            addCriterion("donate_amount <", value, "donateAmount");
            return (Criteria) this;
        }

        public Criteria andDonateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("donate_amount <=", value, "donateAmount");
            return (Criteria) this;
        }

        public Criteria andDonateAmountIn(List<BigDecimal> values) {
            addCriterion("donate_amount in", values, "donateAmount");
            return (Criteria) this;
        }

        public Criteria andDonateAmountNotIn(List<BigDecimal> values) {
            addCriterion("donate_amount not in", values, "donateAmount");
            return (Criteria) this;
        }

        public Criteria andDonateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("donate_amount between", value1, value2, "donateAmount");
            return (Criteria) this;
        }

        public Criteria andDonateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("donate_amount not between", value1, value2, "donateAmount");
            return (Criteria) this;
        }

        public Criteria andHelpAmountIsNull() {
            addCriterion("help_amount is null");
            return (Criteria) this;
        }

        public Criteria andHelpAmountIsNotNull() {
            addCriterion("help_amount is not null");
            return (Criteria) this;
        }

        public Criteria andHelpAmountEqualTo(BigDecimal value) {
            addCriterion("help_amount =", value, "helpAmount");
            return (Criteria) this;
        }

        public Criteria andHelpAmountNotEqualTo(BigDecimal value) {
            addCriterion("help_amount <>", value, "helpAmount");
            return (Criteria) this;
        }

        public Criteria andHelpAmountGreaterThan(BigDecimal value) {
            addCriterion("help_amount >", value, "helpAmount");
            return (Criteria) this;
        }

        public Criteria andHelpAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("help_amount >=", value, "helpAmount");
            return (Criteria) this;
        }

        public Criteria andHelpAmountLessThan(BigDecimal value) {
            addCriterion("help_amount <", value, "helpAmount");
            return (Criteria) this;
        }

        public Criteria andHelpAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("help_amount <=", value, "helpAmount");
            return (Criteria) this;
        }

        public Criteria andHelpAmountIn(List<BigDecimal> values) {
            addCriterion("help_amount in", values, "helpAmount");
            return (Criteria) this;
        }

        public Criteria andHelpAmountNotIn(List<BigDecimal> values) {
            addCriterion("help_amount not in", values, "helpAmount");
            return (Criteria) this;
        }

        public Criteria andHelpAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("help_amount between", value1, value2, "helpAmount");
            return (Criteria) this;
        }

        public Criteria andHelpAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("help_amount not between", value1, value2, "helpAmount");
            return (Criteria) this;
        }

        public Criteria andFundAmountIsNull() {
            addCriterion("fund_amount is null");
            return (Criteria) this;
        }

        public Criteria andFundAmountIsNotNull() {
            addCriterion("fund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFundAmountEqualTo(BigDecimal value) {
            addCriterion("fund_amount =", value, "fundAmount");
            return (Criteria) this;
        }

        public Criteria andFundAmountNotEqualTo(BigDecimal value) {
            addCriterion("fund_amount <>", value, "fundAmount");
            return (Criteria) this;
        }

        public Criteria andFundAmountGreaterThan(BigDecimal value) {
            addCriterion("fund_amount >", value, "fundAmount");
            return (Criteria) this;
        }

        public Criteria andFundAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fund_amount >=", value, "fundAmount");
            return (Criteria) this;
        }

        public Criteria andFundAmountLessThan(BigDecimal value) {
            addCriterion("fund_amount <", value, "fundAmount");
            return (Criteria) this;
        }

        public Criteria andFundAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fund_amount <=", value, "fundAmount");
            return (Criteria) this;
        }

        public Criteria andFundAmountIn(List<BigDecimal> values) {
            addCriterion("fund_amount in", values, "fundAmount");
            return (Criteria) this;
        }

        public Criteria andFundAmountNotIn(List<BigDecimal> values) {
            addCriterion("fund_amount not in", values, "fundAmount");
            return (Criteria) this;
        }

        public Criteria andFundAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fund_amount between", value1, value2, "fundAmount");
            return (Criteria) this;
        }

        public Criteria andFundAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fund_amount not between", value1, value2, "fundAmount");
            return (Criteria) this;
        }
    }

    /**
     * 描述:poverty_alleviation_overview表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2018-01-06
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * poverty_alleviation_overview 2018-01-06
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