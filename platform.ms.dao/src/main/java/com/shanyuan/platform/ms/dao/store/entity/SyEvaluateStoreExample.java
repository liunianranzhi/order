package com.shanyuan.platform.ms.dao.store.entity;

import java.util.ArrayList;
import java.util.List;

public class SyEvaluateStoreExample {
    /**
     * sy_evaluate_store
     */
    protected String orderByClause;

    /**
     * sy_evaluate_store
     */
    protected boolean distinct;

    /**
     * sy_evaluate_store
     */
    protected List<Criteria> oredCriteria;

    public SyEvaluateStoreExample() {
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
     * sy_evaluate_store 2017-10-16
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

        public Criteria andSevalIdIsNull() {
            addCriterion("seval_id is null");
            return (Criteria) this;
        }

        public Criteria andSevalIdIsNotNull() {
            addCriterion("seval_id is not null");
            return (Criteria) this;
        }

        public Criteria andSevalIdEqualTo(Integer value) {
            addCriterion("seval_id =", value, "sevalId");
            return (Criteria) this;
        }

        public Criteria andSevalIdNotEqualTo(Integer value) {
            addCriterion("seval_id <>", value, "sevalId");
            return (Criteria) this;
        }

        public Criteria andSevalIdGreaterThan(Integer value) {
            addCriterion("seval_id >", value, "sevalId");
            return (Criteria) this;
        }

        public Criteria andSevalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seval_id >=", value, "sevalId");
            return (Criteria) this;
        }

        public Criteria andSevalIdLessThan(Integer value) {
            addCriterion("seval_id <", value, "sevalId");
            return (Criteria) this;
        }

        public Criteria andSevalIdLessThanOrEqualTo(Integer value) {
            addCriterion("seval_id <=", value, "sevalId");
            return (Criteria) this;
        }

        public Criteria andSevalIdIn(List<Integer> values) {
            addCriterion("seval_id in", values, "sevalId");
            return (Criteria) this;
        }

        public Criteria andSevalIdNotIn(List<Integer> values) {
            addCriterion("seval_id not in", values, "sevalId");
            return (Criteria) this;
        }

        public Criteria andSevalIdBetween(Integer value1, Integer value2) {
            addCriterion("seval_id between", value1, value2, "sevalId");
            return (Criteria) this;
        }

        public Criteria andSevalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seval_id not between", value1, value2, "sevalId");
            return (Criteria) this;
        }

        public Criteria andSevalOrderidIsNull() {
            addCriterion("seval_orderid is null");
            return (Criteria) this;
        }

        public Criteria andSevalOrderidIsNotNull() {
            addCriterion("seval_orderid is not null");
            return (Criteria) this;
        }

        public Criteria andSevalOrderidEqualTo(Integer value) {
            addCriterion("seval_orderid =", value, "sevalOrderid");
            return (Criteria) this;
        }

        public Criteria andSevalOrderidNotEqualTo(Integer value) {
            addCriterion("seval_orderid <>", value, "sevalOrderid");
            return (Criteria) this;
        }

        public Criteria andSevalOrderidGreaterThan(Integer value) {
            addCriterion("seval_orderid >", value, "sevalOrderid");
            return (Criteria) this;
        }

        public Criteria andSevalOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("seval_orderid >=", value, "sevalOrderid");
            return (Criteria) this;
        }

        public Criteria andSevalOrderidLessThan(Integer value) {
            addCriterion("seval_orderid <", value, "sevalOrderid");
            return (Criteria) this;
        }

        public Criteria andSevalOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("seval_orderid <=", value, "sevalOrderid");
            return (Criteria) this;
        }

        public Criteria andSevalOrderidIn(List<Integer> values) {
            addCriterion("seval_orderid in", values, "sevalOrderid");
            return (Criteria) this;
        }

        public Criteria andSevalOrderidNotIn(List<Integer> values) {
            addCriterion("seval_orderid not in", values, "sevalOrderid");
            return (Criteria) this;
        }

        public Criteria andSevalOrderidBetween(Integer value1, Integer value2) {
            addCriterion("seval_orderid between", value1, value2, "sevalOrderid");
            return (Criteria) this;
        }

        public Criteria andSevalOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("seval_orderid not between", value1, value2, "sevalOrderid");
            return (Criteria) this;
        }

        public Criteria andSevalOrdernoIsNull() {
            addCriterion("seval_orderno is null");
            return (Criteria) this;
        }

        public Criteria andSevalOrdernoIsNotNull() {
            addCriterion("seval_orderno is not null");
            return (Criteria) this;
        }

        public Criteria andSevalOrdernoEqualTo(String value) {
            addCriterion("seval_orderno =", value, "sevalOrderno");
            return (Criteria) this;
        }

        public Criteria andSevalOrdernoNotEqualTo(String value) {
            addCriterion("seval_orderno <>", value, "sevalOrderno");
            return (Criteria) this;
        }

        public Criteria andSevalOrdernoGreaterThan(String value) {
            addCriterion("seval_orderno >", value, "sevalOrderno");
            return (Criteria) this;
        }

        public Criteria andSevalOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("seval_orderno >=", value, "sevalOrderno");
            return (Criteria) this;
        }

        public Criteria andSevalOrdernoLessThan(String value) {
            addCriterion("seval_orderno <", value, "sevalOrderno");
            return (Criteria) this;
        }

        public Criteria andSevalOrdernoLessThanOrEqualTo(String value) {
            addCriterion("seval_orderno <=", value, "sevalOrderno");
            return (Criteria) this;
        }

        public Criteria andSevalOrdernoLike(String value) {
            addCriterion("seval_orderno like", value, "sevalOrderno");
            return (Criteria) this;
        }

        public Criteria andSevalOrdernoNotLike(String value) {
            addCriterion("seval_orderno not like", value, "sevalOrderno");
            return (Criteria) this;
        }

        public Criteria andSevalOrdernoIn(List<String> values) {
            addCriterion("seval_orderno in", values, "sevalOrderno");
            return (Criteria) this;
        }

        public Criteria andSevalOrdernoNotIn(List<String> values) {
            addCriterion("seval_orderno not in", values, "sevalOrderno");
            return (Criteria) this;
        }

        public Criteria andSevalOrdernoBetween(String value1, String value2) {
            addCriterion("seval_orderno between", value1, value2, "sevalOrderno");
            return (Criteria) this;
        }

        public Criteria andSevalOrdernoNotBetween(String value1, String value2) {
            addCriterion("seval_orderno not between", value1, value2, "sevalOrderno");
            return (Criteria) this;
        }

        public Criteria andSevalAddtimeIsNull() {
            addCriterion("seval_addtime is null");
            return (Criteria) this;
        }

        public Criteria andSevalAddtimeIsNotNull() {
            addCriterion("seval_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andSevalAddtimeEqualTo(Integer value) {
            addCriterion("seval_addtime =", value, "sevalAddtime");
            return (Criteria) this;
        }

        public Criteria andSevalAddtimeNotEqualTo(Integer value) {
            addCriterion("seval_addtime <>", value, "sevalAddtime");
            return (Criteria) this;
        }

        public Criteria andSevalAddtimeGreaterThan(Integer value) {
            addCriterion("seval_addtime >", value, "sevalAddtime");
            return (Criteria) this;
        }

        public Criteria andSevalAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("seval_addtime >=", value, "sevalAddtime");
            return (Criteria) this;
        }

        public Criteria andSevalAddtimeLessThan(Integer value) {
            addCriterion("seval_addtime <", value, "sevalAddtime");
            return (Criteria) this;
        }

        public Criteria andSevalAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("seval_addtime <=", value, "sevalAddtime");
            return (Criteria) this;
        }

        public Criteria andSevalAddtimeIn(List<Integer> values) {
            addCriterion("seval_addtime in", values, "sevalAddtime");
            return (Criteria) this;
        }

        public Criteria andSevalAddtimeNotIn(List<Integer> values) {
            addCriterion("seval_addtime not in", values, "sevalAddtime");
            return (Criteria) this;
        }

        public Criteria andSevalAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("seval_addtime between", value1, value2, "sevalAddtime");
            return (Criteria) this;
        }

        public Criteria andSevalAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("seval_addtime not between", value1, value2, "sevalAddtime");
            return (Criteria) this;
        }

        public Criteria andSevalStoreidIsNull() {
            addCriterion("seval_storeid is null");
            return (Criteria) this;
        }

        public Criteria andSevalStoreidIsNotNull() {
            addCriterion("seval_storeid is not null");
            return (Criteria) this;
        }

        public Criteria andSevalStoreidEqualTo(Integer value) {
            addCriterion("seval_storeid =", value, "sevalStoreid");
            return (Criteria) this;
        }

        public Criteria andSevalStoreidNotEqualTo(Integer value) {
            addCriterion("seval_storeid <>", value, "sevalStoreid");
            return (Criteria) this;
        }

        public Criteria andSevalStoreidGreaterThan(Integer value) {
            addCriterion("seval_storeid >", value, "sevalStoreid");
            return (Criteria) this;
        }

        public Criteria andSevalStoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("seval_storeid >=", value, "sevalStoreid");
            return (Criteria) this;
        }

        public Criteria andSevalStoreidLessThan(Integer value) {
            addCriterion("seval_storeid <", value, "sevalStoreid");
            return (Criteria) this;
        }

        public Criteria andSevalStoreidLessThanOrEqualTo(Integer value) {
            addCriterion("seval_storeid <=", value, "sevalStoreid");
            return (Criteria) this;
        }

        public Criteria andSevalStoreidIn(List<Integer> values) {
            addCriterion("seval_storeid in", values, "sevalStoreid");
            return (Criteria) this;
        }

        public Criteria andSevalStoreidNotIn(List<Integer> values) {
            addCriterion("seval_storeid not in", values, "sevalStoreid");
            return (Criteria) this;
        }

        public Criteria andSevalStoreidBetween(Integer value1, Integer value2) {
            addCriterion("seval_storeid between", value1, value2, "sevalStoreid");
            return (Criteria) this;
        }

        public Criteria andSevalStoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("seval_storeid not between", value1, value2, "sevalStoreid");
            return (Criteria) this;
        }

        public Criteria andSevalStorenameIsNull() {
            addCriterion("seval_storename is null");
            return (Criteria) this;
        }

        public Criteria andSevalStorenameIsNotNull() {
            addCriterion("seval_storename is not null");
            return (Criteria) this;
        }

        public Criteria andSevalStorenameEqualTo(String value) {
            addCriterion("seval_storename =", value, "sevalStorename");
            return (Criteria) this;
        }

        public Criteria andSevalStorenameNotEqualTo(String value) {
            addCriterion("seval_storename <>", value, "sevalStorename");
            return (Criteria) this;
        }

        public Criteria andSevalStorenameGreaterThan(String value) {
            addCriterion("seval_storename >", value, "sevalStorename");
            return (Criteria) this;
        }

        public Criteria andSevalStorenameGreaterThanOrEqualTo(String value) {
            addCriterion("seval_storename >=", value, "sevalStorename");
            return (Criteria) this;
        }

        public Criteria andSevalStorenameLessThan(String value) {
            addCriterion("seval_storename <", value, "sevalStorename");
            return (Criteria) this;
        }

        public Criteria andSevalStorenameLessThanOrEqualTo(String value) {
            addCriterion("seval_storename <=", value, "sevalStorename");
            return (Criteria) this;
        }

        public Criteria andSevalStorenameLike(String value) {
            addCriterion("seval_storename like", value, "sevalStorename");
            return (Criteria) this;
        }

        public Criteria andSevalStorenameNotLike(String value) {
            addCriterion("seval_storename not like", value, "sevalStorename");
            return (Criteria) this;
        }

        public Criteria andSevalStorenameIn(List<String> values) {
            addCriterion("seval_storename in", values, "sevalStorename");
            return (Criteria) this;
        }

        public Criteria andSevalStorenameNotIn(List<String> values) {
            addCriterion("seval_storename not in", values, "sevalStorename");
            return (Criteria) this;
        }

        public Criteria andSevalStorenameBetween(String value1, String value2) {
            addCriterion("seval_storename between", value1, value2, "sevalStorename");
            return (Criteria) this;
        }

        public Criteria andSevalStorenameNotBetween(String value1, String value2) {
            addCriterion("seval_storename not between", value1, value2, "sevalStorename");
            return (Criteria) this;
        }

        public Criteria andSevalMemberidIsNull() {
            addCriterion("seval_memberid is null");
            return (Criteria) this;
        }

        public Criteria andSevalMemberidIsNotNull() {
            addCriterion("seval_memberid is not null");
            return (Criteria) this;
        }

        public Criteria andSevalMemberidEqualTo(Integer value) {
            addCriterion("seval_memberid =", value, "sevalMemberid");
            return (Criteria) this;
        }

        public Criteria andSevalMemberidNotEqualTo(Integer value) {
            addCriterion("seval_memberid <>", value, "sevalMemberid");
            return (Criteria) this;
        }

        public Criteria andSevalMemberidGreaterThan(Integer value) {
            addCriterion("seval_memberid >", value, "sevalMemberid");
            return (Criteria) this;
        }

        public Criteria andSevalMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("seval_memberid >=", value, "sevalMemberid");
            return (Criteria) this;
        }

        public Criteria andSevalMemberidLessThan(Integer value) {
            addCriterion("seval_memberid <", value, "sevalMemberid");
            return (Criteria) this;
        }

        public Criteria andSevalMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("seval_memberid <=", value, "sevalMemberid");
            return (Criteria) this;
        }

        public Criteria andSevalMemberidIn(List<Integer> values) {
            addCriterion("seval_memberid in", values, "sevalMemberid");
            return (Criteria) this;
        }

        public Criteria andSevalMemberidNotIn(List<Integer> values) {
            addCriterion("seval_memberid not in", values, "sevalMemberid");
            return (Criteria) this;
        }

        public Criteria andSevalMemberidBetween(Integer value1, Integer value2) {
            addCriterion("seval_memberid between", value1, value2, "sevalMemberid");
            return (Criteria) this;
        }

        public Criteria andSevalMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("seval_memberid not between", value1, value2, "sevalMemberid");
            return (Criteria) this;
        }

        public Criteria andSevalMembernameIsNull() {
            addCriterion("seval_membername is null");
            return (Criteria) this;
        }

        public Criteria andSevalMembernameIsNotNull() {
            addCriterion("seval_membername is not null");
            return (Criteria) this;
        }

        public Criteria andSevalMembernameEqualTo(String value) {
            addCriterion("seval_membername =", value, "sevalMembername");
            return (Criteria) this;
        }

        public Criteria andSevalMembernameNotEqualTo(String value) {
            addCriterion("seval_membername <>", value, "sevalMembername");
            return (Criteria) this;
        }

        public Criteria andSevalMembernameGreaterThan(String value) {
            addCriterion("seval_membername >", value, "sevalMembername");
            return (Criteria) this;
        }

        public Criteria andSevalMembernameGreaterThanOrEqualTo(String value) {
            addCriterion("seval_membername >=", value, "sevalMembername");
            return (Criteria) this;
        }

        public Criteria andSevalMembernameLessThan(String value) {
            addCriterion("seval_membername <", value, "sevalMembername");
            return (Criteria) this;
        }

        public Criteria andSevalMembernameLessThanOrEqualTo(String value) {
            addCriterion("seval_membername <=", value, "sevalMembername");
            return (Criteria) this;
        }

        public Criteria andSevalMembernameLike(String value) {
            addCriterion("seval_membername like", value, "sevalMembername");
            return (Criteria) this;
        }

        public Criteria andSevalMembernameNotLike(String value) {
            addCriterion("seval_membername not like", value, "sevalMembername");
            return (Criteria) this;
        }

        public Criteria andSevalMembernameIn(List<String> values) {
            addCriterion("seval_membername in", values, "sevalMembername");
            return (Criteria) this;
        }

        public Criteria andSevalMembernameNotIn(List<String> values) {
            addCriterion("seval_membername not in", values, "sevalMembername");
            return (Criteria) this;
        }

        public Criteria andSevalMembernameBetween(String value1, String value2) {
            addCriterion("seval_membername between", value1, value2, "sevalMembername");
            return (Criteria) this;
        }

        public Criteria andSevalMembernameNotBetween(String value1, String value2) {
            addCriterion("seval_membername not between", value1, value2, "sevalMembername");
            return (Criteria) this;
        }

        public Criteria andSevalDesccreditIsNull() {
            addCriterion("seval_desccredit is null");
            return (Criteria) this;
        }

        public Criteria andSevalDesccreditIsNotNull() {
            addCriterion("seval_desccredit is not null");
            return (Criteria) this;
        }

        public Criteria andSevalDesccreditEqualTo(Byte value) {
            addCriterion("seval_desccredit =", value, "sevalDesccredit");
            return (Criteria) this;
        }

        public Criteria andSevalDesccreditNotEqualTo(Byte value) {
            addCriterion("seval_desccredit <>", value, "sevalDesccredit");
            return (Criteria) this;
        }

        public Criteria andSevalDesccreditGreaterThan(Byte value) {
            addCriterion("seval_desccredit >", value, "sevalDesccredit");
            return (Criteria) this;
        }

        public Criteria andSevalDesccreditGreaterThanOrEqualTo(Byte value) {
            addCriterion("seval_desccredit >=", value, "sevalDesccredit");
            return (Criteria) this;
        }

        public Criteria andSevalDesccreditLessThan(Byte value) {
            addCriterion("seval_desccredit <", value, "sevalDesccredit");
            return (Criteria) this;
        }

        public Criteria andSevalDesccreditLessThanOrEqualTo(Byte value) {
            addCriterion("seval_desccredit <=", value, "sevalDesccredit");
            return (Criteria) this;
        }

        public Criteria andSevalDesccreditIn(List<Byte> values) {
            addCriterion("seval_desccredit in", values, "sevalDesccredit");
            return (Criteria) this;
        }

        public Criteria andSevalDesccreditNotIn(List<Byte> values) {
            addCriterion("seval_desccredit not in", values, "sevalDesccredit");
            return (Criteria) this;
        }

        public Criteria andSevalDesccreditBetween(Byte value1, Byte value2) {
            addCriterion("seval_desccredit between", value1, value2, "sevalDesccredit");
            return (Criteria) this;
        }

        public Criteria andSevalDesccreditNotBetween(Byte value1, Byte value2) {
            addCriterion("seval_desccredit not between", value1, value2, "sevalDesccredit");
            return (Criteria) this;
        }

        public Criteria andSevalServicecreditIsNull() {
            addCriterion("seval_servicecredit is null");
            return (Criteria) this;
        }

        public Criteria andSevalServicecreditIsNotNull() {
            addCriterion("seval_servicecredit is not null");
            return (Criteria) this;
        }

        public Criteria andSevalServicecreditEqualTo(Byte value) {
            addCriterion("seval_servicecredit =", value, "sevalServicecredit");
            return (Criteria) this;
        }

        public Criteria andSevalServicecreditNotEqualTo(Byte value) {
            addCriterion("seval_servicecredit <>", value, "sevalServicecredit");
            return (Criteria) this;
        }

        public Criteria andSevalServicecreditGreaterThan(Byte value) {
            addCriterion("seval_servicecredit >", value, "sevalServicecredit");
            return (Criteria) this;
        }

        public Criteria andSevalServicecreditGreaterThanOrEqualTo(Byte value) {
            addCriterion("seval_servicecredit >=", value, "sevalServicecredit");
            return (Criteria) this;
        }

        public Criteria andSevalServicecreditLessThan(Byte value) {
            addCriterion("seval_servicecredit <", value, "sevalServicecredit");
            return (Criteria) this;
        }

        public Criteria andSevalServicecreditLessThanOrEqualTo(Byte value) {
            addCriterion("seval_servicecredit <=", value, "sevalServicecredit");
            return (Criteria) this;
        }

        public Criteria andSevalServicecreditIn(List<Byte> values) {
            addCriterion("seval_servicecredit in", values, "sevalServicecredit");
            return (Criteria) this;
        }

        public Criteria andSevalServicecreditNotIn(List<Byte> values) {
            addCriterion("seval_servicecredit not in", values, "sevalServicecredit");
            return (Criteria) this;
        }

        public Criteria andSevalServicecreditBetween(Byte value1, Byte value2) {
            addCriterion("seval_servicecredit between", value1, value2, "sevalServicecredit");
            return (Criteria) this;
        }

        public Criteria andSevalServicecreditNotBetween(Byte value1, Byte value2) {
            addCriterion("seval_servicecredit not between", value1, value2, "sevalServicecredit");
            return (Criteria) this;
        }

        public Criteria andSevalDeliverycreditIsNull() {
            addCriterion("seval_deliverycredit is null");
            return (Criteria) this;
        }

        public Criteria andSevalDeliverycreditIsNotNull() {
            addCriterion("seval_deliverycredit is not null");
            return (Criteria) this;
        }

        public Criteria andSevalDeliverycreditEqualTo(Byte value) {
            addCriterion("seval_deliverycredit =", value, "sevalDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andSevalDeliverycreditNotEqualTo(Byte value) {
            addCriterion("seval_deliverycredit <>", value, "sevalDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andSevalDeliverycreditGreaterThan(Byte value) {
            addCriterion("seval_deliverycredit >", value, "sevalDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andSevalDeliverycreditGreaterThanOrEqualTo(Byte value) {
            addCriterion("seval_deliverycredit >=", value, "sevalDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andSevalDeliverycreditLessThan(Byte value) {
            addCriterion("seval_deliverycredit <", value, "sevalDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andSevalDeliverycreditLessThanOrEqualTo(Byte value) {
            addCriterion("seval_deliverycredit <=", value, "sevalDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andSevalDeliverycreditIn(List<Byte> values) {
            addCriterion("seval_deliverycredit in", values, "sevalDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andSevalDeliverycreditNotIn(List<Byte> values) {
            addCriterion("seval_deliverycredit not in", values, "sevalDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andSevalDeliverycreditBetween(Byte value1, Byte value2) {
            addCriterion("seval_deliverycredit between", value1, value2, "sevalDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andSevalDeliverycreditNotBetween(Byte value1, Byte value2) {
            addCriterion("seval_deliverycredit not between", value1, value2, "sevalDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andPublisherIdIsNull() {
            addCriterion("publisher_id is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIdIsNotNull() {
            addCriterion("publisher_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherIdEqualTo(Integer value) {
            addCriterion("publisher_id =", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdNotEqualTo(Integer value) {
            addCriterion("publisher_id <>", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdGreaterThan(Integer value) {
            addCriterion("publisher_id >", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("publisher_id >=", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdLessThan(Integer value) {
            addCriterion("publisher_id <", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdLessThanOrEqualTo(Integer value) {
            addCriterion("publisher_id <=", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdIn(List<Integer> values) {
            addCriterion("publisher_id in", values, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdNotIn(List<Integer> values) {
            addCriterion("publisher_id not in", values, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdBetween(Integer value1, Integer value2) {
            addCriterion("publisher_id between", value1, value2, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("publisher_id not between", value1, value2, "publisherId");
            return (Criteria) this;
        }

        public Criteria andSevalTypeIsNull() {
            addCriterion("seval_type is null");
            return (Criteria) this;
        }

        public Criteria andSevalTypeIsNotNull() {
            addCriterion("seval_type is not null");
            return (Criteria) this;
        }

        public Criteria andSevalTypeEqualTo(Byte value) {
            addCriterion("seval_type =", value, "sevalType");
            return (Criteria) this;
        }

        public Criteria andSevalTypeNotEqualTo(Byte value) {
            addCriterion("seval_type <>", value, "sevalType");
            return (Criteria) this;
        }

        public Criteria andSevalTypeGreaterThan(Byte value) {
            addCriterion("seval_type >", value, "sevalType");
            return (Criteria) this;
        }

        public Criteria andSevalTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("seval_type >=", value, "sevalType");
            return (Criteria) this;
        }

        public Criteria andSevalTypeLessThan(Byte value) {
            addCriterion("seval_type <", value, "sevalType");
            return (Criteria) this;
        }

        public Criteria andSevalTypeLessThanOrEqualTo(Byte value) {
            addCriterion("seval_type <=", value, "sevalType");
            return (Criteria) this;
        }

        public Criteria andSevalTypeIn(List<Byte> values) {
            addCriterion("seval_type in", values, "sevalType");
            return (Criteria) this;
        }

        public Criteria andSevalTypeNotIn(List<Byte> values) {
            addCriterion("seval_type not in", values, "sevalType");
            return (Criteria) this;
        }

        public Criteria andSevalTypeBetween(Byte value1, Byte value2) {
            addCriterion("seval_type between", value1, value2, "sevalType");
            return (Criteria) this;
        }

        public Criteria andSevalTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("seval_type not between", value1, value2, "sevalType");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_evaluate_store表的实体类
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
     * sy_evaluate_store 2017-10-16
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