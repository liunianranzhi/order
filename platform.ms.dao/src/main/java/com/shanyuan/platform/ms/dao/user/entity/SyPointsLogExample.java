package com.shanyuan.platform.ms.dao.user.entity;

import java.util.ArrayList;
import java.util.List;

public class SyPointsLogExample {
    /**
     * sy_points_log
     */
    protected String orderByClause;

    /**
     * sy_points_log
     */
    protected boolean distinct;

    /**
     * sy_points_log
     */
    protected List<Criteria> oredCriteria;

    public SyPointsLogExample() {
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
     * sy_points_log 2017-10-17
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

        public Criteria andPlIdIsNull() {
            addCriterion("pl_id is null");
            return (Criteria) this;
        }

        public Criteria andPlIdIsNotNull() {
            addCriterion("pl_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlIdEqualTo(Integer value) {
            addCriterion("pl_id =", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdNotEqualTo(Integer value) {
            addCriterion("pl_id <>", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdGreaterThan(Integer value) {
            addCriterion("pl_id >", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pl_id >=", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdLessThan(Integer value) {
            addCriterion("pl_id <", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdLessThanOrEqualTo(Integer value) {
            addCriterion("pl_id <=", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdIn(List<Integer> values) {
            addCriterion("pl_id in", values, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdNotIn(List<Integer> values) {
            addCriterion("pl_id not in", values, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdBetween(Integer value1, Integer value2) {
            addCriterion("pl_id between", value1, value2, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pl_id not between", value1, value2, "plId");
            return (Criteria) this;
        }

        public Criteria andPlMemberidIsNull() {
            addCriterion("pl_memberid is null");
            return (Criteria) this;
        }

        public Criteria andPlMemberidIsNotNull() {
            addCriterion("pl_memberid is not null");
            return (Criteria) this;
        }

        public Criteria andPlMemberidEqualTo(Integer value) {
            addCriterion("pl_memberid =", value, "plMemberid");
            return (Criteria) this;
        }

        public Criteria andPlMemberidNotEqualTo(Integer value) {
            addCriterion("pl_memberid <>", value, "plMemberid");
            return (Criteria) this;
        }

        public Criteria andPlMemberidGreaterThan(Integer value) {
            addCriterion("pl_memberid >", value, "plMemberid");
            return (Criteria) this;
        }

        public Criteria andPlMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pl_memberid >=", value, "plMemberid");
            return (Criteria) this;
        }

        public Criteria andPlMemberidLessThan(Integer value) {
            addCriterion("pl_memberid <", value, "plMemberid");
            return (Criteria) this;
        }

        public Criteria andPlMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("pl_memberid <=", value, "plMemberid");
            return (Criteria) this;
        }

        public Criteria andPlMemberidIn(List<Integer> values) {
            addCriterion("pl_memberid in", values, "plMemberid");
            return (Criteria) this;
        }

        public Criteria andPlMemberidNotIn(List<Integer> values) {
            addCriterion("pl_memberid not in", values, "plMemberid");
            return (Criteria) this;
        }

        public Criteria andPlMemberidBetween(Integer value1, Integer value2) {
            addCriterion("pl_memberid between", value1, value2, "plMemberid");
            return (Criteria) this;
        }

        public Criteria andPlMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("pl_memberid not between", value1, value2, "plMemberid");
            return (Criteria) this;
        }

        public Criteria andPlMembernameIsNull() {
            addCriterion("pl_membername is null");
            return (Criteria) this;
        }

        public Criteria andPlMembernameIsNotNull() {
            addCriterion("pl_membername is not null");
            return (Criteria) this;
        }

        public Criteria andPlMembernameEqualTo(String value) {
            addCriterion("pl_membername =", value, "plMembername");
            return (Criteria) this;
        }

        public Criteria andPlMembernameNotEqualTo(String value) {
            addCriterion("pl_membername <>", value, "plMembername");
            return (Criteria) this;
        }

        public Criteria andPlMembernameGreaterThan(String value) {
            addCriterion("pl_membername >", value, "plMembername");
            return (Criteria) this;
        }

        public Criteria andPlMembernameGreaterThanOrEqualTo(String value) {
            addCriterion("pl_membername >=", value, "plMembername");
            return (Criteria) this;
        }

        public Criteria andPlMembernameLessThan(String value) {
            addCriterion("pl_membername <", value, "plMembername");
            return (Criteria) this;
        }

        public Criteria andPlMembernameLessThanOrEqualTo(String value) {
            addCriterion("pl_membername <=", value, "plMembername");
            return (Criteria) this;
        }

        public Criteria andPlMembernameLike(String value) {
            addCriterion("pl_membername like", value, "plMembername");
            return (Criteria) this;
        }

        public Criteria andPlMembernameNotLike(String value) {
            addCriterion("pl_membername not like", value, "plMembername");
            return (Criteria) this;
        }

        public Criteria andPlMembernameIn(List<String> values) {
            addCriterion("pl_membername in", values, "plMembername");
            return (Criteria) this;
        }

        public Criteria andPlMembernameNotIn(List<String> values) {
            addCriterion("pl_membername not in", values, "plMembername");
            return (Criteria) this;
        }

        public Criteria andPlMembernameBetween(String value1, String value2) {
            addCriterion("pl_membername between", value1, value2, "plMembername");
            return (Criteria) this;
        }

        public Criteria andPlMembernameNotBetween(String value1, String value2) {
            addCriterion("pl_membername not between", value1, value2, "plMembername");
            return (Criteria) this;
        }

        public Criteria andPlMemberTruenameIsNull() {
            addCriterion("pl_member_truename is null");
            return (Criteria) this;
        }

        public Criteria andPlMemberTruenameIsNotNull() {
            addCriterion("pl_member_truename is not null");
            return (Criteria) this;
        }

        public Criteria andPlMemberTruenameEqualTo(String value) {
            addCriterion("pl_member_truename =", value, "plMemberTruename");
            return (Criteria) this;
        }

        public Criteria andPlMemberTruenameNotEqualTo(String value) {
            addCriterion("pl_member_truename <>", value, "plMemberTruename");
            return (Criteria) this;
        }

        public Criteria andPlMemberTruenameGreaterThan(String value) {
            addCriterion("pl_member_truename >", value, "plMemberTruename");
            return (Criteria) this;
        }

        public Criteria andPlMemberTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("pl_member_truename >=", value, "plMemberTruename");
            return (Criteria) this;
        }

        public Criteria andPlMemberTruenameLessThan(String value) {
            addCriterion("pl_member_truename <", value, "plMemberTruename");
            return (Criteria) this;
        }

        public Criteria andPlMemberTruenameLessThanOrEqualTo(String value) {
            addCriterion("pl_member_truename <=", value, "plMemberTruename");
            return (Criteria) this;
        }

        public Criteria andPlMemberTruenameLike(String value) {
            addCriterion("pl_member_truename like", value, "plMemberTruename");
            return (Criteria) this;
        }

        public Criteria andPlMemberTruenameNotLike(String value) {
            addCriterion("pl_member_truename not like", value, "plMemberTruename");
            return (Criteria) this;
        }

        public Criteria andPlMemberTruenameIn(List<String> values) {
            addCriterion("pl_member_truename in", values, "plMemberTruename");
            return (Criteria) this;
        }

        public Criteria andPlMemberTruenameNotIn(List<String> values) {
            addCriterion("pl_member_truename not in", values, "plMemberTruename");
            return (Criteria) this;
        }

        public Criteria andPlMemberTruenameBetween(String value1, String value2) {
            addCriterion("pl_member_truename between", value1, value2, "plMemberTruename");
            return (Criteria) this;
        }

        public Criteria andPlMemberTruenameNotBetween(String value1, String value2) {
            addCriterion("pl_member_truename not between", value1, value2, "plMemberTruename");
            return (Criteria) this;
        }

        public Criteria andPlMemberIdcardIsNull() {
            addCriterion("pl_member_idcard is null");
            return (Criteria) this;
        }

        public Criteria andPlMemberIdcardIsNotNull() {
            addCriterion("pl_member_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andPlMemberIdcardEqualTo(String value) {
            addCriterion("pl_member_idcard =", value, "plMemberIdcard");
            return (Criteria) this;
        }

        public Criteria andPlMemberIdcardNotEqualTo(String value) {
            addCriterion("pl_member_idcard <>", value, "plMemberIdcard");
            return (Criteria) this;
        }

        public Criteria andPlMemberIdcardGreaterThan(String value) {
            addCriterion("pl_member_idcard >", value, "plMemberIdcard");
            return (Criteria) this;
        }

        public Criteria andPlMemberIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("pl_member_idcard >=", value, "plMemberIdcard");
            return (Criteria) this;
        }

        public Criteria andPlMemberIdcardLessThan(String value) {
            addCriterion("pl_member_idcard <", value, "plMemberIdcard");
            return (Criteria) this;
        }

        public Criteria andPlMemberIdcardLessThanOrEqualTo(String value) {
            addCriterion("pl_member_idcard <=", value, "plMemberIdcard");
            return (Criteria) this;
        }

        public Criteria andPlMemberIdcardLike(String value) {
            addCriterion("pl_member_idcard like", value, "plMemberIdcard");
            return (Criteria) this;
        }

        public Criteria andPlMemberIdcardNotLike(String value) {
            addCriterion("pl_member_idcard not like", value, "plMemberIdcard");
            return (Criteria) this;
        }

        public Criteria andPlMemberIdcardIn(List<String> values) {
            addCriterion("pl_member_idcard in", values, "plMemberIdcard");
            return (Criteria) this;
        }

        public Criteria andPlMemberIdcardNotIn(List<String> values) {
            addCriterion("pl_member_idcard not in", values, "plMemberIdcard");
            return (Criteria) this;
        }

        public Criteria andPlMemberIdcardBetween(String value1, String value2) {
            addCriterion("pl_member_idcard between", value1, value2, "plMemberIdcard");
            return (Criteria) this;
        }

        public Criteria andPlMemberIdcardNotBetween(String value1, String value2) {
            addCriterion("pl_member_idcard not between", value1, value2, "plMemberIdcard");
            return (Criteria) this;
        }

        public Criteria andPlOrderidIsNull() {
            addCriterion("pl_orderid is null");
            return (Criteria) this;
        }

        public Criteria andPlOrderidIsNotNull() {
            addCriterion("pl_orderid is not null");
            return (Criteria) this;
        }

        public Criteria andPlOrderidEqualTo(Integer value) {
            addCriterion("pl_orderid =", value, "plOrderid");
            return (Criteria) this;
        }

        public Criteria andPlOrderidNotEqualTo(Integer value) {
            addCriterion("pl_orderid <>", value, "plOrderid");
            return (Criteria) this;
        }

        public Criteria andPlOrderidGreaterThan(Integer value) {
            addCriterion("pl_orderid >", value, "plOrderid");
            return (Criteria) this;
        }

        public Criteria andPlOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pl_orderid >=", value, "plOrderid");
            return (Criteria) this;
        }

        public Criteria andPlOrderidLessThan(Integer value) {
            addCriterion("pl_orderid <", value, "plOrderid");
            return (Criteria) this;
        }

        public Criteria andPlOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("pl_orderid <=", value, "plOrderid");
            return (Criteria) this;
        }

        public Criteria andPlOrderidIn(List<Integer> values) {
            addCriterion("pl_orderid in", values, "plOrderid");
            return (Criteria) this;
        }

        public Criteria andPlOrderidNotIn(List<Integer> values) {
            addCriterion("pl_orderid not in", values, "plOrderid");
            return (Criteria) this;
        }

        public Criteria andPlOrderidBetween(Integer value1, Integer value2) {
            addCriterion("pl_orderid between", value1, value2, "plOrderid");
            return (Criteria) this;
        }

        public Criteria andPlOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("pl_orderid not between", value1, value2, "plOrderid");
            return (Criteria) this;
        }

        public Criteria andPlAdminidIsNull() {
            addCriterion("pl_adminid is null");
            return (Criteria) this;
        }

        public Criteria andPlAdminidIsNotNull() {
            addCriterion("pl_adminid is not null");
            return (Criteria) this;
        }

        public Criteria andPlAdminidEqualTo(Integer value) {
            addCriterion("pl_adminid =", value, "plAdminid");
            return (Criteria) this;
        }

        public Criteria andPlAdminidNotEqualTo(Integer value) {
            addCriterion("pl_adminid <>", value, "plAdminid");
            return (Criteria) this;
        }

        public Criteria andPlAdminidGreaterThan(Integer value) {
            addCriterion("pl_adminid >", value, "plAdminid");
            return (Criteria) this;
        }

        public Criteria andPlAdminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pl_adminid >=", value, "plAdminid");
            return (Criteria) this;
        }

        public Criteria andPlAdminidLessThan(Integer value) {
            addCriterion("pl_adminid <", value, "plAdminid");
            return (Criteria) this;
        }

        public Criteria andPlAdminidLessThanOrEqualTo(Integer value) {
            addCriterion("pl_adminid <=", value, "plAdminid");
            return (Criteria) this;
        }

        public Criteria andPlAdminidIn(List<Integer> values) {
            addCriterion("pl_adminid in", values, "plAdminid");
            return (Criteria) this;
        }

        public Criteria andPlAdminidNotIn(List<Integer> values) {
            addCriterion("pl_adminid not in", values, "plAdminid");
            return (Criteria) this;
        }

        public Criteria andPlAdminidBetween(Integer value1, Integer value2) {
            addCriterion("pl_adminid between", value1, value2, "plAdminid");
            return (Criteria) this;
        }

        public Criteria andPlAdminidNotBetween(Integer value1, Integer value2) {
            addCriterion("pl_adminid not between", value1, value2, "plAdminid");
            return (Criteria) this;
        }

        public Criteria andPlAdminnameIsNull() {
            addCriterion("pl_adminname is null");
            return (Criteria) this;
        }

        public Criteria andPlAdminnameIsNotNull() {
            addCriterion("pl_adminname is not null");
            return (Criteria) this;
        }

        public Criteria andPlAdminnameEqualTo(String value) {
            addCriterion("pl_adminname =", value, "plAdminname");
            return (Criteria) this;
        }

        public Criteria andPlAdminnameNotEqualTo(String value) {
            addCriterion("pl_adminname <>", value, "plAdminname");
            return (Criteria) this;
        }

        public Criteria andPlAdminnameGreaterThan(String value) {
            addCriterion("pl_adminname >", value, "plAdminname");
            return (Criteria) this;
        }

        public Criteria andPlAdminnameGreaterThanOrEqualTo(String value) {
            addCriterion("pl_adminname >=", value, "plAdminname");
            return (Criteria) this;
        }

        public Criteria andPlAdminnameLessThan(String value) {
            addCriterion("pl_adminname <", value, "plAdminname");
            return (Criteria) this;
        }

        public Criteria andPlAdminnameLessThanOrEqualTo(String value) {
            addCriterion("pl_adminname <=", value, "plAdminname");
            return (Criteria) this;
        }

        public Criteria andPlAdminnameLike(String value) {
            addCriterion("pl_adminname like", value, "plAdminname");
            return (Criteria) this;
        }

        public Criteria andPlAdminnameNotLike(String value) {
            addCriterion("pl_adminname not like", value, "plAdminname");
            return (Criteria) this;
        }

        public Criteria andPlAdminnameIn(List<String> values) {
            addCriterion("pl_adminname in", values, "plAdminname");
            return (Criteria) this;
        }

        public Criteria andPlAdminnameNotIn(List<String> values) {
            addCriterion("pl_adminname not in", values, "plAdminname");
            return (Criteria) this;
        }

        public Criteria andPlAdminnameBetween(String value1, String value2) {
            addCriterion("pl_adminname between", value1, value2, "plAdminname");
            return (Criteria) this;
        }

        public Criteria andPlAdminnameNotBetween(String value1, String value2) {
            addCriterion("pl_adminname not between", value1, value2, "plAdminname");
            return (Criteria) this;
        }

        public Criteria andPlPointsIsNull() {
            addCriterion("pl_points is null");
            return (Criteria) this;
        }

        public Criteria andPlPointsIsNotNull() {
            addCriterion("pl_points is not null");
            return (Criteria) this;
        }

        public Criteria andPlPointsEqualTo(Integer value) {
            addCriterion("pl_points =", value, "plPoints");
            return (Criteria) this;
        }

        public Criteria andPlPointsNotEqualTo(Integer value) {
            addCriterion("pl_points <>", value, "plPoints");
            return (Criteria) this;
        }

        public Criteria andPlPointsGreaterThan(Integer value) {
            addCriterion("pl_points >", value, "plPoints");
            return (Criteria) this;
        }

        public Criteria andPlPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("pl_points >=", value, "plPoints");
            return (Criteria) this;
        }

        public Criteria andPlPointsLessThan(Integer value) {
            addCriterion("pl_points <", value, "plPoints");
            return (Criteria) this;
        }

        public Criteria andPlPointsLessThanOrEqualTo(Integer value) {
            addCriterion("pl_points <=", value, "plPoints");
            return (Criteria) this;
        }

        public Criteria andPlPointsIn(List<Integer> values) {
            addCriterion("pl_points in", values, "plPoints");
            return (Criteria) this;
        }

        public Criteria andPlPointsNotIn(List<Integer> values) {
            addCriterion("pl_points not in", values, "plPoints");
            return (Criteria) this;
        }

        public Criteria andPlPointsBetween(Integer value1, Integer value2) {
            addCriterion("pl_points between", value1, value2, "plPoints");
            return (Criteria) this;
        }

        public Criteria andPlPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("pl_points not between", value1, value2, "plPoints");
            return (Criteria) this;
        }

        public Criteria andPlAddtimeIsNull() {
            addCriterion("pl_addtime is null");
            return (Criteria) this;
        }

        public Criteria andPlAddtimeIsNotNull() {
            addCriterion("pl_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andPlAddtimeEqualTo(Integer value) {
            addCriterion("pl_addtime =", value, "plAddtime");
            return (Criteria) this;
        }

        public Criteria andPlAddtimeNotEqualTo(Integer value) {
            addCriterion("pl_addtime <>", value, "plAddtime");
            return (Criteria) this;
        }

        public Criteria andPlAddtimeGreaterThan(Integer value) {
            addCriterion("pl_addtime >", value, "plAddtime");
            return (Criteria) this;
        }

        public Criteria andPlAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pl_addtime >=", value, "plAddtime");
            return (Criteria) this;
        }

        public Criteria andPlAddtimeLessThan(Integer value) {
            addCriterion("pl_addtime <", value, "plAddtime");
            return (Criteria) this;
        }

        public Criteria andPlAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("pl_addtime <=", value, "plAddtime");
            return (Criteria) this;
        }

        public Criteria andPlAddtimeIn(List<Integer> values) {
            addCriterion("pl_addtime in", values, "plAddtime");
            return (Criteria) this;
        }

        public Criteria andPlAddtimeNotIn(List<Integer> values) {
            addCriterion("pl_addtime not in", values, "plAddtime");
            return (Criteria) this;
        }

        public Criteria andPlAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("pl_addtime between", value1, value2, "plAddtime");
            return (Criteria) this;
        }

        public Criteria andPlAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("pl_addtime not between", value1, value2, "plAddtime");
            return (Criteria) this;
        }

        public Criteria andPlDescIsNull() {
            addCriterion("pl_desc is null");
            return (Criteria) this;
        }

        public Criteria andPlDescIsNotNull() {
            addCriterion("pl_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPlDescEqualTo(String value) {
            addCriterion("pl_desc =", value, "plDesc");
            return (Criteria) this;
        }

        public Criteria andPlDescNotEqualTo(String value) {
            addCriterion("pl_desc <>", value, "plDesc");
            return (Criteria) this;
        }

        public Criteria andPlDescGreaterThan(String value) {
            addCriterion("pl_desc >", value, "plDesc");
            return (Criteria) this;
        }

        public Criteria andPlDescGreaterThanOrEqualTo(String value) {
            addCriterion("pl_desc >=", value, "plDesc");
            return (Criteria) this;
        }

        public Criteria andPlDescLessThan(String value) {
            addCriterion("pl_desc <", value, "plDesc");
            return (Criteria) this;
        }

        public Criteria andPlDescLessThanOrEqualTo(String value) {
            addCriterion("pl_desc <=", value, "plDesc");
            return (Criteria) this;
        }

        public Criteria andPlDescLike(String value) {
            addCriterion("pl_desc like", value, "plDesc");
            return (Criteria) this;
        }

        public Criteria andPlDescNotLike(String value) {
            addCriterion("pl_desc not like", value, "plDesc");
            return (Criteria) this;
        }

        public Criteria andPlDescIn(List<String> values) {
            addCriterion("pl_desc in", values, "plDesc");
            return (Criteria) this;
        }

        public Criteria andPlDescNotIn(List<String> values) {
            addCriterion("pl_desc not in", values, "plDesc");
            return (Criteria) this;
        }

        public Criteria andPlDescBetween(String value1, String value2) {
            addCriterion("pl_desc between", value1, value2, "plDesc");
            return (Criteria) this;
        }

        public Criteria andPlDescNotBetween(String value1, String value2) {
            addCriterion("pl_desc not between", value1, value2, "plDesc");
            return (Criteria) this;
        }

        public Criteria andPlStageIsNull() {
            addCriterion("pl_stage is null");
            return (Criteria) this;
        }

        public Criteria andPlStageIsNotNull() {
            addCriterion("pl_stage is not null");
            return (Criteria) this;
        }

        public Criteria andPlStageEqualTo(String value) {
            addCriterion("pl_stage =", value, "plStage");
            return (Criteria) this;
        }

        public Criteria andPlStageNotEqualTo(String value) {
            addCriterion("pl_stage <>", value, "plStage");
            return (Criteria) this;
        }

        public Criteria andPlStageGreaterThan(String value) {
            addCriterion("pl_stage >", value, "plStage");
            return (Criteria) this;
        }

        public Criteria andPlStageGreaterThanOrEqualTo(String value) {
            addCriterion("pl_stage >=", value, "plStage");
            return (Criteria) this;
        }

        public Criteria andPlStageLessThan(String value) {
            addCriterion("pl_stage <", value, "plStage");
            return (Criteria) this;
        }

        public Criteria andPlStageLessThanOrEqualTo(String value) {
            addCriterion("pl_stage <=", value, "plStage");
            return (Criteria) this;
        }

        public Criteria andPlStageLike(String value) {
            addCriterion("pl_stage like", value, "plStage");
            return (Criteria) this;
        }

        public Criteria andPlStageNotLike(String value) {
            addCriterion("pl_stage not like", value, "plStage");
            return (Criteria) this;
        }

        public Criteria andPlStageIn(List<String> values) {
            addCriterion("pl_stage in", values, "plStage");
            return (Criteria) this;
        }

        public Criteria andPlStageNotIn(List<String> values) {
            addCriterion("pl_stage not in", values, "plStage");
            return (Criteria) this;
        }

        public Criteria andPlStageBetween(String value1, String value2) {
            addCriterion("pl_stage between", value1, value2, "plStage");
            return (Criteria) this;
        }

        public Criteria andPlStageNotBetween(String value1, String value2) {
            addCriterion("pl_stage not between", value1, value2, "plStage");
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

        public Criteria andPlMemberid2IsNull() {
            addCriterion("pl_memberid2 is null");
            return (Criteria) this;
        }

        public Criteria andPlMemberid2IsNotNull() {
            addCriterion("pl_memberid2 is not null");
            return (Criteria) this;
        }

        public Criteria andPlMemberid2EqualTo(Integer value) {
            addCriterion("pl_memberid2 =", value, "plMemberid2");
            return (Criteria) this;
        }

        public Criteria andPlMemberid2NotEqualTo(Integer value) {
            addCriterion("pl_memberid2 <>", value, "plMemberid2");
            return (Criteria) this;
        }

        public Criteria andPlMemberid2GreaterThan(Integer value) {
            addCriterion("pl_memberid2 >", value, "plMemberid2");
            return (Criteria) this;
        }

        public Criteria andPlMemberid2GreaterThanOrEqualTo(Integer value) {
            addCriterion("pl_memberid2 >=", value, "plMemberid2");
            return (Criteria) this;
        }

        public Criteria andPlMemberid2LessThan(Integer value) {
            addCriterion("pl_memberid2 <", value, "plMemberid2");
            return (Criteria) this;
        }

        public Criteria andPlMemberid2LessThanOrEqualTo(Integer value) {
            addCriterion("pl_memberid2 <=", value, "plMemberid2");
            return (Criteria) this;
        }

        public Criteria andPlMemberid2In(List<Integer> values) {
            addCriterion("pl_memberid2 in", values, "plMemberid2");
            return (Criteria) this;
        }

        public Criteria andPlMemberid2NotIn(List<Integer> values) {
            addCriterion("pl_memberid2 not in", values, "plMemberid2");
            return (Criteria) this;
        }

        public Criteria andPlMemberid2Between(Integer value1, Integer value2) {
            addCriterion("pl_memberid2 between", value1, value2, "plMemberid2");
            return (Criteria) this;
        }

        public Criteria andPlMemberid2NotBetween(Integer value1, Integer value2) {
            addCriterion("pl_memberid2 not between", value1, value2, "plMemberid2");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_points_log表的实体类
     * @version
     * @author:  win10
     * @创建时间: 2017-10-17
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sy_points_log 2017-10-17
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