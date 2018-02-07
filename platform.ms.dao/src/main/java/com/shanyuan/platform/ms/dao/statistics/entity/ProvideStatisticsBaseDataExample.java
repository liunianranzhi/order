package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProvideStatisticsBaseDataExample {
    /**
     * provide_statistics_base_data
     */
    protected String orderByClause;

    /**
     * provide_statistics_base_data
     */
    protected boolean distinct;

    /**
     * provide_statistics_base_data
     */
    protected List<Criteria> oredCriteria;

    public ProvideStatisticsBaseDataExample() {
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
     * provide_statistics_base_data 2018-01-09
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

        public Criteria andAssistSellDaIsNull() {
            addCriterion("assist_sell_da is null");
            return (Criteria) this;
        }

        public Criteria andAssistSellDaIsNotNull() {
            addCriterion("assist_sell_da is not null");
            return (Criteria) this;
        }

        public Criteria andAssistSellDaEqualTo(BigDecimal value) {
            addCriterion("assist_sell_da =", value, "assistSellDa");
            return (Criteria) this;
        }

        public Criteria andAssistSellDaNotEqualTo(BigDecimal value) {
            addCriterion("assist_sell_da <>", value, "assistSellDa");
            return (Criteria) this;
        }

        public Criteria andAssistSellDaGreaterThan(BigDecimal value) {
            addCriterion("assist_sell_da >", value, "assistSellDa");
            return (Criteria) this;
        }

        public Criteria andAssistSellDaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("assist_sell_da >=", value, "assistSellDa");
            return (Criteria) this;
        }

        public Criteria andAssistSellDaLessThan(BigDecimal value) {
            addCriterion("assist_sell_da <", value, "assistSellDa");
            return (Criteria) this;
        }

        public Criteria andAssistSellDaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("assist_sell_da <=", value, "assistSellDa");
            return (Criteria) this;
        }

        public Criteria andAssistSellDaIn(List<BigDecimal> values) {
            addCriterion("assist_sell_da in", values, "assistSellDa");
            return (Criteria) this;
        }

        public Criteria andAssistSellDaNotIn(List<BigDecimal> values) {
            addCriterion("assist_sell_da not in", values, "assistSellDa");
            return (Criteria) this;
        }

        public Criteria andAssistSellDaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assist_sell_da between", value1, value2, "assistSellDa");
            return (Criteria) this;
        }

        public Criteria andAssistSellDaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assist_sell_da not between", value1, value2, "assistSellDa");
            return (Criteria) this;
        }

        public Criteria andAssistSellZxIsNull() {
            addCriterion("assist_sell_zx is null");
            return (Criteria) this;
        }

        public Criteria andAssistSellZxIsNotNull() {
            addCriterion("assist_sell_zx is not null");
            return (Criteria) this;
        }

        public Criteria andAssistSellZxEqualTo(BigDecimal value) {
            addCriterion("assist_sell_zx =", value, "assistSellZx");
            return (Criteria) this;
        }

        public Criteria andAssistSellZxNotEqualTo(BigDecimal value) {
            addCriterion("assist_sell_zx <>", value, "assistSellZx");
            return (Criteria) this;
        }

        public Criteria andAssistSellZxGreaterThan(BigDecimal value) {
            addCriterion("assist_sell_zx >", value, "assistSellZx");
            return (Criteria) this;
        }

        public Criteria andAssistSellZxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("assist_sell_zx >=", value, "assistSellZx");
            return (Criteria) this;
        }

        public Criteria andAssistSellZxLessThan(BigDecimal value) {
            addCriterion("assist_sell_zx <", value, "assistSellZx");
            return (Criteria) this;
        }

        public Criteria andAssistSellZxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("assist_sell_zx <=", value, "assistSellZx");
            return (Criteria) this;
        }

        public Criteria andAssistSellZxIn(List<BigDecimal> values) {
            addCriterion("assist_sell_zx in", values, "assistSellZx");
            return (Criteria) this;
        }

        public Criteria andAssistSellZxNotIn(List<BigDecimal> values) {
            addCriterion("assist_sell_zx not in", values, "assistSellZx");
            return (Criteria) this;
        }

        public Criteria andAssistSellZxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assist_sell_zx between", value1, value2, "assistSellZx");
            return (Criteria) this;
        }

        public Criteria andAssistSellZxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assist_sell_zx not between", value1, value2, "assistSellZx");
            return (Criteria) this;
        }

        public Criteria andAssistBuyDaIsNull() {
            addCriterion("assist_buy_da is null");
            return (Criteria) this;
        }

        public Criteria andAssistBuyDaIsNotNull() {
            addCriterion("assist_buy_da is not null");
            return (Criteria) this;
        }

        public Criteria andAssistBuyDaEqualTo(BigDecimal value) {
            addCriterion("assist_buy_da =", value, "assistBuyDa");
            return (Criteria) this;
        }

        public Criteria andAssistBuyDaNotEqualTo(BigDecimal value) {
            addCriterion("assist_buy_da <>", value, "assistBuyDa");
            return (Criteria) this;
        }

        public Criteria andAssistBuyDaGreaterThan(BigDecimal value) {
            addCriterion("assist_buy_da >", value, "assistBuyDa");
            return (Criteria) this;
        }

        public Criteria andAssistBuyDaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("assist_buy_da >=", value, "assistBuyDa");
            return (Criteria) this;
        }

        public Criteria andAssistBuyDaLessThan(BigDecimal value) {
            addCriterion("assist_buy_da <", value, "assistBuyDa");
            return (Criteria) this;
        }

        public Criteria andAssistBuyDaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("assist_buy_da <=", value, "assistBuyDa");
            return (Criteria) this;
        }

        public Criteria andAssistBuyDaIn(List<BigDecimal> values) {
            addCriterion("assist_buy_da in", values, "assistBuyDa");
            return (Criteria) this;
        }

        public Criteria andAssistBuyDaNotIn(List<BigDecimal> values) {
            addCriterion("assist_buy_da not in", values, "assistBuyDa");
            return (Criteria) this;
        }

        public Criteria andAssistBuyDaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assist_buy_da between", value1, value2, "assistBuyDa");
            return (Criteria) this;
        }

        public Criteria andAssistBuyDaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assist_buy_da not between", value1, value2, "assistBuyDa");
            return (Criteria) this;
        }

        public Criteria andAssistBuyZxIsNull() {
            addCriterion("assist_buy_zx is null");
            return (Criteria) this;
        }

        public Criteria andAssistBuyZxIsNotNull() {
            addCriterion("assist_buy_zx is not null");
            return (Criteria) this;
        }

        public Criteria andAssistBuyZxEqualTo(BigDecimal value) {
            addCriterion("assist_buy_zx =", value, "assistBuyZx");
            return (Criteria) this;
        }

        public Criteria andAssistBuyZxNotEqualTo(BigDecimal value) {
            addCriterion("assist_buy_zx <>", value, "assistBuyZx");
            return (Criteria) this;
        }

        public Criteria andAssistBuyZxGreaterThan(BigDecimal value) {
            addCriterion("assist_buy_zx >", value, "assistBuyZx");
            return (Criteria) this;
        }

        public Criteria andAssistBuyZxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("assist_buy_zx >=", value, "assistBuyZx");
            return (Criteria) this;
        }

        public Criteria andAssistBuyZxLessThan(BigDecimal value) {
            addCriterion("assist_buy_zx <", value, "assistBuyZx");
            return (Criteria) this;
        }

        public Criteria andAssistBuyZxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("assist_buy_zx <=", value, "assistBuyZx");
            return (Criteria) this;
        }

        public Criteria andAssistBuyZxIn(List<BigDecimal> values) {
            addCriterion("assist_buy_zx in", values, "assistBuyZx");
            return (Criteria) this;
        }

        public Criteria andAssistBuyZxNotIn(List<BigDecimal> values) {
            addCriterion("assist_buy_zx not in", values, "assistBuyZx");
            return (Criteria) this;
        }

        public Criteria andAssistBuyZxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assist_buy_zx between", value1, value2, "assistBuyZx");
            return (Criteria) this;
        }

        public Criteria andAssistBuyZxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assist_buy_zx not between", value1, value2, "assistBuyZx");
            return (Criteria) this;
        }

        public Criteria andAssistTotalNumIsNull() {
            addCriterion("assist_total_num is null");
            return (Criteria) this;
        }

        public Criteria andAssistTotalNumIsNotNull() {
            addCriterion("assist_total_num is not null");
            return (Criteria) this;
        }

        public Criteria andAssistTotalNumEqualTo(Integer value) {
            addCriterion("assist_total_num =", value, "assistTotalNum");
            return (Criteria) this;
        }

        public Criteria andAssistTotalNumNotEqualTo(Integer value) {
            addCriterion("assist_total_num <>", value, "assistTotalNum");
            return (Criteria) this;
        }

        public Criteria andAssistTotalNumGreaterThan(Integer value) {
            addCriterion("assist_total_num >", value, "assistTotalNum");
            return (Criteria) this;
        }

        public Criteria andAssistTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("assist_total_num >=", value, "assistTotalNum");
            return (Criteria) this;
        }

        public Criteria andAssistTotalNumLessThan(Integer value) {
            addCriterion("assist_total_num <", value, "assistTotalNum");
            return (Criteria) this;
        }

        public Criteria andAssistTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("assist_total_num <=", value, "assistTotalNum");
            return (Criteria) this;
        }

        public Criteria andAssistTotalNumIn(List<Integer> values) {
            addCriterion("assist_total_num in", values, "assistTotalNum");
            return (Criteria) this;
        }

        public Criteria andAssistTotalNumNotIn(List<Integer> values) {
            addCriterion("assist_total_num not in", values, "assistTotalNum");
            return (Criteria) this;
        }

        public Criteria andAssistTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("assist_total_num between", value1, value2, "assistTotalNum");
            return (Criteria) this;
        }

        public Criteria andAssistTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("assist_total_num not between", value1, value2, "assistTotalNum");
            return (Criteria) this;
        }

        public Criteria andSelfEmpPoorTotalFamilyIsNull() {
            addCriterion("self_emp_poor_total_family is null");
            return (Criteria) this;
        }

        public Criteria andSelfEmpPoorTotalFamilyIsNotNull() {
            addCriterion("self_emp_poor_total_family is not null");
            return (Criteria) this;
        }

        public Criteria andSelfEmpPoorTotalFamilyEqualTo(Integer value) {
            addCriterion("self_emp_poor_total_family =", value, "selfEmpPoorTotalFamily");
            return (Criteria) this;
        }

        public Criteria andSelfEmpPoorTotalFamilyNotEqualTo(Integer value) {
            addCriterion("self_emp_poor_total_family <>", value, "selfEmpPoorTotalFamily");
            return (Criteria) this;
        }

        public Criteria andSelfEmpPoorTotalFamilyGreaterThan(Integer value) {
            addCriterion("self_emp_poor_total_family >", value, "selfEmpPoorTotalFamily");
            return (Criteria) this;
        }

        public Criteria andSelfEmpPoorTotalFamilyGreaterThanOrEqualTo(Integer value) {
            addCriterion("self_emp_poor_total_family >=", value, "selfEmpPoorTotalFamily");
            return (Criteria) this;
        }

        public Criteria andSelfEmpPoorTotalFamilyLessThan(Integer value) {
            addCriterion("self_emp_poor_total_family <", value, "selfEmpPoorTotalFamily");
            return (Criteria) this;
        }

        public Criteria andSelfEmpPoorTotalFamilyLessThanOrEqualTo(Integer value) {
            addCriterion("self_emp_poor_total_family <=", value, "selfEmpPoorTotalFamily");
            return (Criteria) this;
        }

        public Criteria andSelfEmpPoorTotalFamilyIn(List<Integer> values) {
            addCriterion("self_emp_poor_total_family in", values, "selfEmpPoorTotalFamily");
            return (Criteria) this;
        }

        public Criteria andSelfEmpPoorTotalFamilyNotIn(List<Integer> values) {
            addCriterion("self_emp_poor_total_family not in", values, "selfEmpPoorTotalFamily");
            return (Criteria) this;
        }

        public Criteria andSelfEmpPoorTotalFamilyBetween(Integer value1, Integer value2) {
            addCriterion("self_emp_poor_total_family between", value1, value2, "selfEmpPoorTotalFamily");
            return (Criteria) this;
        }

        public Criteria andSelfEmpPoorTotalFamilyNotBetween(Integer value1, Integer value2) {
            addCriterion("self_emp_poor_total_family not between", value1, value2, "selfEmpPoorTotalFamily");
            return (Criteria) this;
        }

        public Criteria andPoorTotalFamilyIsNull() {
            addCriterion("poor_total_family is null");
            return (Criteria) this;
        }

        public Criteria andPoorTotalFamilyIsNotNull() {
            addCriterion("poor_total_family is not null");
            return (Criteria) this;
        }

        public Criteria andPoorTotalFamilyEqualTo(Integer value) {
            addCriterion("poor_total_family =", value, "poorTotalFamily");
            return (Criteria) this;
        }

        public Criteria andPoorTotalFamilyNotEqualTo(Integer value) {
            addCriterion("poor_total_family <>", value, "poorTotalFamily");
            return (Criteria) this;
        }

        public Criteria andPoorTotalFamilyGreaterThan(Integer value) {
            addCriterion("poor_total_family >", value, "poorTotalFamily");
            return (Criteria) this;
        }

        public Criteria andPoorTotalFamilyGreaterThanOrEqualTo(Integer value) {
            addCriterion("poor_total_family >=", value, "poorTotalFamily");
            return (Criteria) this;
        }

        public Criteria andPoorTotalFamilyLessThan(Integer value) {
            addCriterion("poor_total_family <", value, "poorTotalFamily");
            return (Criteria) this;
        }

        public Criteria andPoorTotalFamilyLessThanOrEqualTo(Integer value) {
            addCriterion("poor_total_family <=", value, "poorTotalFamily");
            return (Criteria) this;
        }

        public Criteria andPoorTotalFamilyIn(List<Integer> values) {
            addCriterion("poor_total_family in", values, "poorTotalFamily");
            return (Criteria) this;
        }

        public Criteria andPoorTotalFamilyNotIn(List<Integer> values) {
            addCriterion("poor_total_family not in", values, "poorTotalFamily");
            return (Criteria) this;
        }

        public Criteria andPoorTotalFamilyBetween(Integer value1, Integer value2) {
            addCriterion("poor_total_family between", value1, value2, "poorTotalFamily");
            return (Criteria) this;
        }

        public Criteria andPoorTotalFamilyNotBetween(Integer value1, Integer value2) {
            addCriterion("poor_total_family not between", value1, value2, "poorTotalFamily");
            return (Criteria) this;
        }

        public Criteria andPoorTotalNumIsNull() {
            addCriterion("poor_total_num is null");
            return (Criteria) this;
        }

        public Criteria andPoorTotalNumIsNotNull() {
            addCriterion("poor_total_num is not null");
            return (Criteria) this;
        }

        public Criteria andPoorTotalNumEqualTo(Integer value) {
            addCriterion("poor_total_num =", value, "poorTotalNum");
            return (Criteria) this;
        }

        public Criteria andPoorTotalNumNotEqualTo(Integer value) {
            addCriterion("poor_total_num <>", value, "poorTotalNum");
            return (Criteria) this;
        }

        public Criteria andPoorTotalNumGreaterThan(Integer value) {
            addCriterion("poor_total_num >", value, "poorTotalNum");
            return (Criteria) this;
        }

        public Criteria andPoorTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("poor_total_num >=", value, "poorTotalNum");
            return (Criteria) this;
        }

        public Criteria andPoorTotalNumLessThan(Integer value) {
            addCriterion("poor_total_num <", value, "poorTotalNum");
            return (Criteria) this;
        }

        public Criteria andPoorTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("poor_total_num <=", value, "poorTotalNum");
            return (Criteria) this;
        }

        public Criteria andPoorTotalNumIn(List<Integer> values) {
            addCriterion("poor_total_num in", values, "poorTotalNum");
            return (Criteria) this;
        }

        public Criteria andPoorTotalNumNotIn(List<Integer> values) {
            addCriterion("poor_total_num not in", values, "poorTotalNum");
            return (Criteria) this;
        }

        public Criteria andPoorTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("poor_total_num between", value1, value2, "poorTotalNum");
            return (Criteria) this;
        }

        public Criteria andPoorTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("poor_total_num not between", value1, value2, "poorTotalNum");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsTotalNumIsNull() {
            addCriterion("assist_goods_total_num is null");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsTotalNumIsNotNull() {
            addCriterion("assist_goods_total_num is not null");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsTotalNumEqualTo(Long value) {
            addCriterion("assist_goods_total_num =", value, "assistGoodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsTotalNumNotEqualTo(Long value) {
            addCriterion("assist_goods_total_num <>", value, "assistGoodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsTotalNumGreaterThan(Long value) {
            addCriterion("assist_goods_total_num >", value, "assistGoodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsTotalNumGreaterThanOrEqualTo(Long value) {
            addCriterion("assist_goods_total_num >=", value, "assistGoodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsTotalNumLessThan(Long value) {
            addCriterion("assist_goods_total_num <", value, "assistGoodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsTotalNumLessThanOrEqualTo(Long value) {
            addCriterion("assist_goods_total_num <=", value, "assistGoodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsTotalNumIn(List<Long> values) {
            addCriterion("assist_goods_total_num in", values, "assistGoodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsTotalNumNotIn(List<Long> values) {
            addCriterion("assist_goods_total_num not in", values, "assistGoodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsTotalNumBetween(Long value1, Long value2) {
            addCriterion("assist_goods_total_num between", value1, value2, "assistGoodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andAssistGoodsTotalNumNotBetween(Long value1, Long value2) {
            addCriterion("assist_goods_total_num not between", value1, value2, "assistGoodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsTotalNumIsNull() {
            addCriterion("poor_goods_total_num is null");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsTotalNumIsNotNull() {
            addCriterion("poor_goods_total_num is not null");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsTotalNumEqualTo(Long value) {
            addCriterion("poor_goods_total_num =", value, "poorGoodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsTotalNumNotEqualTo(Long value) {
            addCriterion("poor_goods_total_num <>", value, "poorGoodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsTotalNumGreaterThan(Long value) {
            addCriterion("poor_goods_total_num >", value, "poorGoodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsTotalNumGreaterThanOrEqualTo(Long value) {
            addCriterion("poor_goods_total_num >=", value, "poorGoodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsTotalNumLessThan(Long value) {
            addCriterion("poor_goods_total_num <", value, "poorGoodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsTotalNumLessThanOrEqualTo(Long value) {
            addCriterion("poor_goods_total_num <=", value, "poorGoodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsTotalNumIn(List<Long> values) {
            addCriterion("poor_goods_total_num in", values, "poorGoodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsTotalNumNotIn(List<Long> values) {
            addCriterion("poor_goods_total_num not in", values, "poorGoodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsTotalNumBetween(Long value1, Long value2) {
            addCriterion("poor_goods_total_num between", value1, value2, "poorGoodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andPoorGoodsTotalNumNotBetween(Long value1, Long value2) {
            addCriterion("poor_goods_total_num not between", value1, value2, "poorGoodsTotalNum");
            return (Criteria) this;
        }
    }

    /**
     * 描述:provide_statistics_base_data表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2018-01-09
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * provide_statistics_base_data 2018-01-09
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