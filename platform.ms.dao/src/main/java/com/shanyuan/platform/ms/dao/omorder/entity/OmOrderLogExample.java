package com.shanyuan.platform.ms.dao.omorder.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OmOrderLogExample {
    /**
     * om_order_logist
     */
    protected String orderByClause;

    /**
     * om_order_logist
     */
    protected boolean distinct;

    /**
     * om_order_logist
     */
    protected List<Criteria> oredCriteria;

    public OmOrderLogExample() {
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
     * om_order_logist 2017-11-10
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

        public Criteria andReciverAddrIdIsNull() {
            addCriterion("reciver_addr_id is null");
            return (Criteria) this;
        }

        public Criteria andReciverAddrIdIsNotNull() {
            addCriterion("reciver_addr_id is not null");
            return (Criteria) this;
        }

        public Criteria andReciverAddrIdEqualTo(Integer value) {
            addCriterion("reciver_addr_id =", value, "reciverAddrId");
            return (Criteria) this;
        }

        public Criteria andReciverAddrIdNotEqualTo(Integer value) {
            addCriterion("reciver_addr_id <>", value, "reciverAddrId");
            return (Criteria) this;
        }

        public Criteria andReciverAddrIdGreaterThan(Integer value) {
            addCriterion("reciver_addr_id >", value, "reciverAddrId");
            return (Criteria) this;
        }

        public Criteria andReciverAddrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reciver_addr_id >=", value, "reciverAddrId");
            return (Criteria) this;
        }

        public Criteria andReciverAddrIdLessThan(Integer value) {
            addCriterion("reciver_addr_id <", value, "reciverAddrId");
            return (Criteria) this;
        }

        public Criteria andReciverAddrIdLessThanOrEqualTo(Integer value) {
            addCriterion("reciver_addr_id <=", value, "reciverAddrId");
            return (Criteria) this;
        }

        public Criteria andReciverAddrIdIn(List<Integer> values) {
            addCriterion("reciver_addr_id in", values, "reciverAddrId");
            return (Criteria) this;
        }

        public Criteria andReciverAddrIdNotIn(List<Integer> values) {
            addCriterion("reciver_addr_id not in", values, "reciverAddrId");
            return (Criteria) this;
        }

        public Criteria andReciverAddrIdBetween(Integer value1, Integer value2) {
            addCriterion("reciver_addr_id between", value1, value2, "reciverAddrId");
            return (Criteria) this;
        }

        public Criteria andReciverAddrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reciver_addr_id not between", value1, value2, "reciverAddrId");
            return (Criteria) this;
        }

        public Criteria andReciverNameIsNull() {
            addCriterion("reciver_name is null");
            return (Criteria) this;
        }

        public Criteria andReciverNameIsNotNull() {
            addCriterion("reciver_name is not null");
            return (Criteria) this;
        }

        public Criteria andReciverNameEqualTo(String value) {
            addCriterion("reciver_name =", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameNotEqualTo(String value) {
            addCriterion("reciver_name <>", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameGreaterThan(String value) {
            addCriterion("reciver_name >", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameGreaterThanOrEqualTo(String value) {
            addCriterion("reciver_name >=", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameLessThan(String value) {
            addCriterion("reciver_name <", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameLessThanOrEqualTo(String value) {
            addCriterion("reciver_name <=", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameLike(String value) {
            addCriterion("reciver_name like", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameNotLike(String value) {
            addCriterion("reciver_name not like", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameIn(List<String> values) {
            addCriterion("reciver_name in", values, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameNotIn(List<String> values) {
            addCriterion("reciver_name not in", values, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameBetween(String value1, String value2) {
            addCriterion("reciver_name between", value1, value2, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameNotBetween(String value1, String value2) {
            addCriterion("reciver_name not between", value1, value2, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverPhoneIsNull() {
            addCriterion("reciver_phone is null");
            return (Criteria) this;
        }

        public Criteria andReciverPhoneIsNotNull() {
            addCriterion("reciver_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReciverPhoneEqualTo(String value) {
            addCriterion("reciver_phone =", value, "reciverPhone");
            return (Criteria) this;
        }

        public Criteria andReciverPhoneNotEqualTo(String value) {
            addCriterion("reciver_phone <>", value, "reciverPhone");
            return (Criteria) this;
        }

        public Criteria andReciverPhoneGreaterThan(String value) {
            addCriterion("reciver_phone >", value, "reciverPhone");
            return (Criteria) this;
        }

        public Criteria andReciverPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("reciver_phone >=", value, "reciverPhone");
            return (Criteria) this;
        }

        public Criteria andReciverPhoneLessThan(String value) {
            addCriterion("reciver_phone <", value, "reciverPhone");
            return (Criteria) this;
        }

        public Criteria andReciverPhoneLessThanOrEqualTo(String value) {
            addCriterion("reciver_phone <=", value, "reciverPhone");
            return (Criteria) this;
        }

        public Criteria andReciverPhoneLike(String value) {
            addCriterion("reciver_phone like", value, "reciverPhone");
            return (Criteria) this;
        }

        public Criteria andReciverPhoneNotLike(String value) {
            addCriterion("reciver_phone not like", value, "reciverPhone");
            return (Criteria) this;
        }

        public Criteria andReciverPhoneIn(List<String> values) {
            addCriterion("reciver_phone in", values, "reciverPhone");
            return (Criteria) this;
        }

        public Criteria andReciverPhoneNotIn(List<String> values) {
            addCriterion("reciver_phone not in", values, "reciverPhone");
            return (Criteria) this;
        }

        public Criteria andReciverPhoneBetween(String value1, String value2) {
            addCriterion("reciver_phone between", value1, value2, "reciverPhone");
            return (Criteria) this;
        }

        public Criteria andReciverPhoneNotBetween(String value1, String value2) {
            addCriterion("reciver_phone not between", value1, value2, "reciverPhone");
            return (Criteria) this;
        }

        public Criteria andReciverProvIdIsNull() {
            addCriterion("reciver_prov_id is null");
            return (Criteria) this;
        }

        public Criteria andReciverProvIdIsNotNull() {
            addCriterion("reciver_prov_id is not null");
            return (Criteria) this;
        }

        public Criteria andReciverProvIdEqualTo(Integer value) {
            addCriterion("reciver_prov_id =", value, "reciverProvId");
            return (Criteria) this;
        }

        public Criteria andReciverProvIdNotEqualTo(Integer value) {
            addCriterion("reciver_prov_id <>", value, "reciverProvId");
            return (Criteria) this;
        }

        public Criteria andReciverProvIdGreaterThan(Integer value) {
            addCriterion("reciver_prov_id >", value, "reciverProvId");
            return (Criteria) this;
        }

        public Criteria andReciverProvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reciver_prov_id >=", value, "reciverProvId");
            return (Criteria) this;
        }

        public Criteria andReciverProvIdLessThan(Integer value) {
            addCriterion("reciver_prov_id <", value, "reciverProvId");
            return (Criteria) this;
        }

        public Criteria andReciverProvIdLessThanOrEqualTo(Integer value) {
            addCriterion("reciver_prov_id <=", value, "reciverProvId");
            return (Criteria) this;
        }

        public Criteria andReciverProvIdIn(List<Integer> values) {
            addCriterion("reciver_prov_id in", values, "reciverProvId");
            return (Criteria) this;
        }

        public Criteria andReciverProvIdNotIn(List<Integer> values) {
            addCriterion("reciver_prov_id not in", values, "reciverProvId");
            return (Criteria) this;
        }

        public Criteria andReciverProvIdBetween(Integer value1, Integer value2) {
            addCriterion("reciver_prov_id between", value1, value2, "reciverProvId");
            return (Criteria) this;
        }

        public Criteria andReciverProvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reciver_prov_id not between", value1, value2, "reciverProvId");
            return (Criteria) this;
        }

        public Criteria andReciverCityIdIsNull() {
            addCriterion("reciver_city_id is null");
            return (Criteria) this;
        }

        public Criteria andReciverCityIdIsNotNull() {
            addCriterion("reciver_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andReciverCityIdEqualTo(Integer value) {
            addCriterion("reciver_city_id =", value, "reciverCityId");
            return (Criteria) this;
        }

        public Criteria andReciverCityIdNotEqualTo(Integer value) {
            addCriterion("reciver_city_id <>", value, "reciverCityId");
            return (Criteria) this;
        }

        public Criteria andReciverCityIdGreaterThan(Integer value) {
            addCriterion("reciver_city_id >", value, "reciverCityId");
            return (Criteria) this;
        }

        public Criteria andReciverCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reciver_city_id >=", value, "reciverCityId");
            return (Criteria) this;
        }

        public Criteria andReciverCityIdLessThan(Integer value) {
            addCriterion("reciver_city_id <", value, "reciverCityId");
            return (Criteria) this;
        }

        public Criteria andReciverCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("reciver_city_id <=", value, "reciverCityId");
            return (Criteria) this;
        }

        public Criteria andReciverCityIdIn(List<Integer> values) {
            addCriterion("reciver_city_id in", values, "reciverCityId");
            return (Criteria) this;
        }

        public Criteria andReciverCityIdNotIn(List<Integer> values) {
            addCriterion("reciver_city_id not in", values, "reciverCityId");
            return (Criteria) this;
        }

        public Criteria andReciverCityIdBetween(Integer value1, Integer value2) {
            addCriterion("reciver_city_id between", value1, value2, "reciverCityId");
            return (Criteria) this;
        }

        public Criteria andReciverCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reciver_city_id not between", value1, value2, "reciverCityId");
            return (Criteria) this;
        }

        public Criteria andReciverAreaIdIsNull() {
            addCriterion("reciver_area_id is null");
            return (Criteria) this;
        }

        public Criteria andReciverAreaIdIsNotNull() {
            addCriterion("reciver_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andReciverAreaIdEqualTo(Integer value) {
            addCriterion("reciver_area_id =", value, "reciverAreaId");
            return (Criteria) this;
        }

        public Criteria andReciverAreaIdNotEqualTo(Integer value) {
            addCriterion("reciver_area_id <>", value, "reciverAreaId");
            return (Criteria) this;
        }

        public Criteria andReciverAreaIdGreaterThan(Integer value) {
            addCriterion("reciver_area_id >", value, "reciverAreaId");
            return (Criteria) this;
        }

        public Criteria andReciverAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reciver_area_id >=", value, "reciverAreaId");
            return (Criteria) this;
        }

        public Criteria andReciverAreaIdLessThan(Integer value) {
            addCriterion("reciver_area_id <", value, "reciverAreaId");
            return (Criteria) this;
        }

        public Criteria andReciverAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("reciver_area_id <=", value, "reciverAreaId");
            return (Criteria) this;
        }

        public Criteria andReciverAreaIdIn(List<Integer> values) {
            addCriterion("reciver_area_id in", values, "reciverAreaId");
            return (Criteria) this;
        }

        public Criteria andReciverAreaIdNotIn(List<Integer> values) {
            addCriterion("reciver_area_id not in", values, "reciverAreaId");
            return (Criteria) this;
        }

        public Criteria andReciverAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("reciver_area_id between", value1, value2, "reciverAreaId");
            return (Criteria) this;
        }

        public Criteria andReciverAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reciver_area_id not between", value1, value2, "reciverAreaId");
            return (Criteria) this;
        }

        public Criteria andReciverAddrInfoIsNull() {
            addCriterion("reciver_addr_info is null");
            return (Criteria) this;
        }

        public Criteria andReciverAddrInfoIsNotNull() {
            addCriterion("reciver_addr_info is not null");
            return (Criteria) this;
        }

        public Criteria andReciverAddrInfoEqualTo(String value) {
            addCriterion("reciver_addr_info =", value, "reciverAddrInfo");
            return (Criteria) this;
        }

        public Criteria andReciverAddrInfoNotEqualTo(String value) {
            addCriterion("reciver_addr_info <>", value, "reciverAddrInfo");
            return (Criteria) this;
        }

        public Criteria andReciverAddrInfoGreaterThan(String value) {
            addCriterion("reciver_addr_info >", value, "reciverAddrInfo");
            return (Criteria) this;
        }

        public Criteria andReciverAddrInfoGreaterThanOrEqualTo(String value) {
            addCriterion("reciver_addr_info >=", value, "reciverAddrInfo");
            return (Criteria) this;
        }

        public Criteria andReciverAddrInfoLessThan(String value) {
            addCriterion("reciver_addr_info <", value, "reciverAddrInfo");
            return (Criteria) this;
        }

        public Criteria andReciverAddrInfoLessThanOrEqualTo(String value) {
            addCriterion("reciver_addr_info <=", value, "reciverAddrInfo");
            return (Criteria) this;
        }

        public Criteria andReciverAddrInfoLike(String value) {
            addCriterion("reciver_addr_info like", value, "reciverAddrInfo");
            return (Criteria) this;
        }

        public Criteria andReciverAddrInfoNotLike(String value) {
            addCriterion("reciver_addr_info not like", value, "reciverAddrInfo");
            return (Criteria) this;
        }

        public Criteria andReciverAddrInfoIn(List<String> values) {
            addCriterion("reciver_addr_info in", values, "reciverAddrInfo");
            return (Criteria) this;
        }

        public Criteria andReciverAddrInfoNotIn(List<String> values) {
            addCriterion("reciver_addr_info not in", values, "reciverAddrInfo");
            return (Criteria) this;
        }

        public Criteria andReciverAddrInfoBetween(String value1, String value2) {
            addCriterion("reciver_addr_info between", value1, value2, "reciverAddrInfo");
            return (Criteria) this;
        }

        public Criteria andReciverAddrInfoNotBetween(String value1, String value2) {
            addCriterion("reciver_addr_info not between", value1, value2, "reciverAddrInfo");
            return (Criteria) this;
        }

        public Criteria andDeliverAddrIdIsNull() {
            addCriterion("deliver_addr_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliverAddrIdIsNotNull() {
            addCriterion("deliver_addr_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverAddrIdEqualTo(Integer value) {
            addCriterion("deliver_addr_id =", value, "deliverAddrId");
            return (Criteria) this;
        }

        public Criteria andDeliverAddrIdNotEqualTo(Integer value) {
            addCriterion("deliver_addr_id <>", value, "deliverAddrId");
            return (Criteria) this;
        }

        public Criteria andDeliverAddrIdGreaterThan(Integer value) {
            addCriterion("deliver_addr_id >", value, "deliverAddrId");
            return (Criteria) this;
        }

        public Criteria andDeliverAddrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliver_addr_id >=", value, "deliverAddrId");
            return (Criteria) this;
        }

        public Criteria andDeliverAddrIdLessThan(Integer value) {
            addCriterion("deliver_addr_id <", value, "deliverAddrId");
            return (Criteria) this;
        }

        public Criteria andDeliverAddrIdLessThanOrEqualTo(Integer value) {
            addCriterion("deliver_addr_id <=", value, "deliverAddrId");
            return (Criteria) this;
        }

        public Criteria andDeliverAddrIdIn(List<Integer> values) {
            addCriterion("deliver_addr_id in", values, "deliverAddrId");
            return (Criteria) this;
        }

        public Criteria andDeliverAddrIdNotIn(List<Integer> values) {
            addCriterion("deliver_addr_id not in", values, "deliverAddrId");
            return (Criteria) this;
        }

        public Criteria andDeliverAddrIdBetween(Integer value1, Integer value2) {
            addCriterion("deliver_addr_id between", value1, value2, "deliverAddrId");
            return (Criteria) this;
        }

        public Criteria andDeliverAddrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("deliver_addr_id not between", value1, value2, "deliverAddrId");
            return (Criteria) this;
        }

        public Criteria andDeliverMsgIsNull() {
            addCriterion("deliver_msg is null");
            return (Criteria) this;
        }

        public Criteria andDeliverMsgIsNotNull() {
            addCriterion("deliver_msg is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverMsgEqualTo(String value) {
            addCriterion("deliver_msg =", value, "deliverMsg");
            return (Criteria) this;
        }

        public Criteria andDeliverMsgNotEqualTo(String value) {
            addCriterion("deliver_msg <>", value, "deliverMsg");
            return (Criteria) this;
        }

        public Criteria andDeliverMsgGreaterThan(String value) {
            addCriterion("deliver_msg >", value, "deliverMsg");
            return (Criteria) this;
        }

        public Criteria andDeliverMsgGreaterThanOrEqualTo(String value) {
            addCriterion("deliver_msg >=", value, "deliverMsg");
            return (Criteria) this;
        }

        public Criteria andDeliverMsgLessThan(String value) {
            addCriterion("deliver_msg <", value, "deliverMsg");
            return (Criteria) this;
        }

        public Criteria andDeliverMsgLessThanOrEqualTo(String value) {
            addCriterion("deliver_msg <=", value, "deliverMsg");
            return (Criteria) this;
        }

        public Criteria andDeliverMsgLike(String value) {
            addCriterion("deliver_msg like", value, "deliverMsg");
            return (Criteria) this;
        }

        public Criteria andDeliverMsgNotLike(String value) {
            addCriterion("deliver_msg not like", value, "deliverMsg");
            return (Criteria) this;
        }

        public Criteria andDeliverMsgIn(List<String> values) {
            addCriterion("deliver_msg in", values, "deliverMsg");
            return (Criteria) this;
        }

        public Criteria andDeliverMsgNotIn(List<String> values) {
            addCriterion("deliver_msg not in", values, "deliverMsg");
            return (Criteria) this;
        }

        public Criteria andDeliverMsgBetween(String value1, String value2) {
            addCriterion("deliver_msg between", value1, value2, "deliverMsg");
            return (Criteria) this;
        }

        public Criteria andDeliverMsgNotBetween(String value1, String value2) {
            addCriterion("deliver_msg not between", value1, value2, "deliverMsg");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIsNull() {
            addCriterion("deliver_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIsNotNull() {
            addCriterion("deliver_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeEqualTo(Date value) {
            addCriterion("deliver_time =", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotEqualTo(Date value) {
            addCriterion("deliver_time <>", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeGreaterThan(Date value) {
            addCriterion("deliver_time >", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deliver_time >=", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLessThan(Date value) {
            addCriterion("deliver_time <", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLessThanOrEqualTo(Date value) {
            addCriterion("deliver_time <=", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIn(List<Date> values) {
            addCriterion("deliver_time in", values, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotIn(List<Date> values) {
            addCriterion("deliver_time not in", values, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeBetween(Date value1, Date value2) {
            addCriterion("deliver_time between", value1, value2, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotBetween(Date value1, Date value2) {
            addCriterion("deliver_time not between", value1, value2, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andShippingIdIsNull() {
            addCriterion("shipping_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingIdIsNotNull() {
            addCriterion("shipping_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingIdEqualTo(String value) {
            addCriterion("shipping_id =", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotEqualTo(String value) {
            addCriterion("shipping_id <>", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThan(String value) {
            addCriterion("shipping_id >", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_id >=", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThan(String value) {
            addCriterion("shipping_id <", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThanOrEqualTo(String value) {
            addCriterion("shipping_id <=", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLike(String value) {
            addCriterion("shipping_id like", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotLike(String value) {
            addCriterion("shipping_id not like", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdIn(List<String> values) {
            addCriterion("shipping_id in", values, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotIn(List<String> values) {
            addCriterion("shipping_id not in", values, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdBetween(String value1, String value2) {
            addCriterion("shipping_id between", value1, value2, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotBetween(String value1, String value2) {
            addCriterion("shipping_id not between", value1, value2, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingSnIsNull() {
            addCriterion("shipping_sn is null");
            return (Criteria) this;
        }

        public Criteria andShippingSnIsNotNull() {
            addCriterion("shipping_sn is not null");
            return (Criteria) this;
        }

        public Criteria andShippingSnEqualTo(String value) {
            addCriterion("shipping_sn =", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnNotEqualTo(String value) {
            addCriterion("shipping_sn <>", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnGreaterThan(String value) {
            addCriterion("shipping_sn >", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_sn >=", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnLessThan(String value) {
            addCriterion("shipping_sn <", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnLessThanOrEqualTo(String value) {
            addCriterion("shipping_sn <=", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnLike(String value) {
            addCriterion("shipping_sn like", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnNotLike(String value) {
            addCriterion("shipping_sn not like", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnIn(List<String> values) {
            addCriterion("shipping_sn in", values, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnNotIn(List<String> values) {
            addCriterion("shipping_sn not in", values, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnBetween(String value1, String value2) {
            addCriterion("shipping_sn between", value1, value2, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnNotBetween(String value1, String value2) {
            addCriterion("shipping_sn not between", value1, value2, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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
     * 描述:om_order_logist表的实体类
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
     * om_order_logist 2017-11-10
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