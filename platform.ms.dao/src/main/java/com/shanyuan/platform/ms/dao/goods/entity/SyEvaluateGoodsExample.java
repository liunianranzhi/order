package com.shanyuan.platform.ms.dao.goods.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SyEvaluateGoodsExample {
    /**
     * sy_evaluate_goods
     */
    protected String orderByClause;

    /**
     * sy_evaluate_goods
     */
    protected boolean distinct;

    /**
     * sy_evaluate_goods
     */
    protected List<Criteria> oredCriteria;

    public SyEvaluateGoodsExample() {
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
     * sy_evaluate_goods 2017-10-16
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

        public Criteria andGevalIdIsNull() {
            addCriterion("geval_id is null");
            return (Criteria) this;
        }

        public Criteria andGevalIdIsNotNull() {
            addCriterion("geval_id is not null");
            return (Criteria) this;
        }

        public Criteria andGevalIdEqualTo(Integer value) {
            addCriterion("geval_id =", value, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdNotEqualTo(Integer value) {
            addCriterion("geval_id <>", value, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdGreaterThan(Integer value) {
            addCriterion("geval_id >", value, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("geval_id >=", value, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdLessThan(Integer value) {
            addCriterion("geval_id <", value, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdLessThanOrEqualTo(Integer value) {
            addCriterion("geval_id <=", value, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdIn(List<Integer> values) {
            addCriterion("geval_id in", values, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdNotIn(List<Integer> values) {
            addCriterion("geval_id not in", values, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdBetween(Integer value1, Integer value2) {
            addCriterion("geval_id between", value1, value2, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("geval_id not between", value1, value2, "gevalId");
            return (Criteria) this;
        }

        public Criteria andGevalOrderidIsNull() {
            addCriterion("geval_orderid is null");
            return (Criteria) this;
        }

        public Criteria andGevalOrderidIsNotNull() {
            addCriterion("geval_orderid is not null");
            return (Criteria) this;
        }

        public Criteria andGevalOrderidEqualTo(Integer value) {
            addCriterion("geval_orderid =", value, "gevalOrderid");
            return (Criteria) this;
        }

        public Criteria andGevalOrderidNotEqualTo(Integer value) {
            addCriterion("geval_orderid <>", value, "gevalOrderid");
            return (Criteria) this;
        }

        public Criteria andGevalOrderidGreaterThan(Integer value) {
            addCriterion("geval_orderid >", value, "gevalOrderid");
            return (Criteria) this;
        }

        public Criteria andGevalOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("geval_orderid >=", value, "gevalOrderid");
            return (Criteria) this;
        }

        public Criteria andGevalOrderidLessThan(Integer value) {
            addCriterion("geval_orderid <", value, "gevalOrderid");
            return (Criteria) this;
        }

        public Criteria andGevalOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("geval_orderid <=", value, "gevalOrderid");
            return (Criteria) this;
        }

        public Criteria andGevalOrderidIn(List<Integer> values) {
            addCriterion("geval_orderid in", values, "gevalOrderid");
            return (Criteria) this;
        }

        public Criteria andGevalOrderidNotIn(List<Integer> values) {
            addCriterion("geval_orderid not in", values, "gevalOrderid");
            return (Criteria) this;
        }

        public Criteria andGevalOrderidBetween(Integer value1, Integer value2) {
            addCriterion("geval_orderid between", value1, value2, "gevalOrderid");
            return (Criteria) this;
        }

        public Criteria andGevalOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("geval_orderid not between", value1, value2, "gevalOrderid");
            return (Criteria) this;
        }

        public Criteria andGevalOrdernoIsNull() {
            addCriterion("geval_orderno is null");
            return (Criteria) this;
        }

        public Criteria andGevalOrdernoIsNotNull() {
            addCriterion("geval_orderno is not null");
            return (Criteria) this;
        }

        public Criteria andGevalOrdernoEqualTo(Long value) {
            addCriterion("geval_orderno =", value, "gevalOrderno");
            return (Criteria) this;
        }

        public Criteria andGevalOrdernoNotEqualTo(Long value) {
            addCriterion("geval_orderno <>", value, "gevalOrderno");
            return (Criteria) this;
        }

        public Criteria andGevalOrdernoGreaterThan(Long value) {
            addCriterion("geval_orderno >", value, "gevalOrderno");
            return (Criteria) this;
        }

        public Criteria andGevalOrdernoGreaterThanOrEqualTo(Long value) {
            addCriterion("geval_orderno >=", value, "gevalOrderno");
            return (Criteria) this;
        }

        public Criteria andGevalOrdernoLessThan(Long value) {
            addCriterion("geval_orderno <", value, "gevalOrderno");
            return (Criteria) this;
        }

        public Criteria andGevalOrdernoLessThanOrEqualTo(Long value) {
            addCriterion("geval_orderno <=", value, "gevalOrderno");
            return (Criteria) this;
        }

        public Criteria andGevalOrdernoIn(List<Long> values) {
            addCriterion("geval_orderno in", values, "gevalOrderno");
            return (Criteria) this;
        }

        public Criteria andGevalOrdernoNotIn(List<Long> values) {
            addCriterion("geval_orderno not in", values, "gevalOrderno");
            return (Criteria) this;
        }

        public Criteria andGevalOrdernoBetween(Long value1, Long value2) {
            addCriterion("geval_orderno between", value1, value2, "gevalOrderno");
            return (Criteria) this;
        }

        public Criteria andGevalOrdernoNotBetween(Long value1, Long value2) {
            addCriterion("geval_orderno not between", value1, value2, "gevalOrderno");
            return (Criteria) this;
        }

        public Criteria andGevalOrdergoodsidIsNull() {
            addCriterion("geval_ordergoodsid is null");
            return (Criteria) this;
        }

        public Criteria andGevalOrdergoodsidIsNotNull() {
            addCriterion("geval_ordergoodsid is not null");
            return (Criteria) this;
        }

        public Criteria andGevalOrdergoodsidEqualTo(Integer value) {
            addCriterion("geval_ordergoodsid =", value, "gevalOrdergoodsid");
            return (Criteria) this;
        }

        public Criteria andGevalOrdergoodsidNotEqualTo(Integer value) {
            addCriterion("geval_ordergoodsid <>", value, "gevalOrdergoodsid");
            return (Criteria) this;
        }

        public Criteria andGevalOrdergoodsidGreaterThan(Integer value) {
            addCriterion("geval_ordergoodsid >", value, "gevalOrdergoodsid");
            return (Criteria) this;
        }

        public Criteria andGevalOrdergoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("geval_ordergoodsid >=", value, "gevalOrdergoodsid");
            return (Criteria) this;
        }

        public Criteria andGevalOrdergoodsidLessThan(Integer value) {
            addCriterion("geval_ordergoodsid <", value, "gevalOrdergoodsid");
            return (Criteria) this;
        }

        public Criteria andGevalOrdergoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("geval_ordergoodsid <=", value, "gevalOrdergoodsid");
            return (Criteria) this;
        }

        public Criteria andGevalOrdergoodsidIn(List<Integer> values) {
            addCriterion("geval_ordergoodsid in", values, "gevalOrdergoodsid");
            return (Criteria) this;
        }

        public Criteria andGevalOrdergoodsidNotIn(List<Integer> values) {
            addCriterion("geval_ordergoodsid not in", values, "gevalOrdergoodsid");
            return (Criteria) this;
        }

        public Criteria andGevalOrdergoodsidBetween(Integer value1, Integer value2) {
            addCriterion("geval_ordergoodsid between", value1, value2, "gevalOrdergoodsid");
            return (Criteria) this;
        }

        public Criteria andGevalOrdergoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("geval_ordergoodsid not between", value1, value2, "gevalOrdergoodsid");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsidIsNull() {
            addCriterion("geval_goodsid is null");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsidIsNotNull() {
            addCriterion("geval_goodsid is not null");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsidEqualTo(Integer value) {
            addCriterion("geval_goodsid =", value, "gevalGoodsid");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsidNotEqualTo(Integer value) {
            addCriterion("geval_goodsid <>", value, "gevalGoodsid");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsidGreaterThan(Integer value) {
            addCriterion("geval_goodsid >", value, "gevalGoodsid");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("geval_goodsid >=", value, "gevalGoodsid");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsidLessThan(Integer value) {
            addCriterion("geval_goodsid <", value, "gevalGoodsid");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("geval_goodsid <=", value, "gevalGoodsid");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsidIn(List<Integer> values) {
            addCriterion("geval_goodsid in", values, "gevalGoodsid");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsidNotIn(List<Integer> values) {
            addCriterion("geval_goodsid not in", values, "gevalGoodsid");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("geval_goodsid between", value1, value2, "gevalGoodsid");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("geval_goodsid not between", value1, value2, "gevalGoodsid");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsnameIsNull() {
            addCriterion("geval_goodsname is null");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsnameIsNotNull() {
            addCriterion("geval_goodsname is not null");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsnameEqualTo(String value) {
            addCriterion("geval_goodsname =", value, "gevalGoodsname");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsnameNotEqualTo(String value) {
            addCriterion("geval_goodsname <>", value, "gevalGoodsname");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsnameGreaterThan(String value) {
            addCriterion("geval_goodsname >", value, "gevalGoodsname");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("geval_goodsname >=", value, "gevalGoodsname");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsnameLessThan(String value) {
            addCriterion("geval_goodsname <", value, "gevalGoodsname");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("geval_goodsname <=", value, "gevalGoodsname");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsnameLike(String value) {
            addCriterion("geval_goodsname like", value, "gevalGoodsname");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsnameNotLike(String value) {
            addCriterion("geval_goodsname not like", value, "gevalGoodsname");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsnameIn(List<String> values) {
            addCriterion("geval_goodsname in", values, "gevalGoodsname");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsnameNotIn(List<String> values) {
            addCriterion("geval_goodsname not in", values, "gevalGoodsname");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsnameBetween(String value1, String value2) {
            addCriterion("geval_goodsname between", value1, value2, "gevalGoodsname");
            return (Criteria) this;
        }

        public Criteria andGevalGoodsnameNotBetween(String value1, String value2) {
            addCriterion("geval_goodsname not between", value1, value2, "gevalGoodsname");
            return (Criteria) this;
        }

        public Criteria andGevalGoodspriceIsNull() {
            addCriterion("geval_goodsprice is null");
            return (Criteria) this;
        }

        public Criteria andGevalGoodspriceIsNotNull() {
            addCriterion("geval_goodsprice is not null");
            return (Criteria) this;
        }

        public Criteria andGevalGoodspriceEqualTo(BigDecimal value) {
            addCriterion("geval_goodsprice =", value, "gevalGoodsprice");
            return (Criteria) this;
        }

        public Criteria andGevalGoodspriceNotEqualTo(BigDecimal value) {
            addCriterion("geval_goodsprice <>", value, "gevalGoodsprice");
            return (Criteria) this;
        }

        public Criteria andGevalGoodspriceGreaterThan(BigDecimal value) {
            addCriterion("geval_goodsprice >", value, "gevalGoodsprice");
            return (Criteria) this;
        }

        public Criteria andGevalGoodspriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("geval_goodsprice >=", value, "gevalGoodsprice");
            return (Criteria) this;
        }

        public Criteria andGevalGoodspriceLessThan(BigDecimal value) {
            addCriterion("geval_goodsprice <", value, "gevalGoodsprice");
            return (Criteria) this;
        }

        public Criteria andGevalGoodspriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("geval_goodsprice <=", value, "gevalGoodsprice");
            return (Criteria) this;
        }

        public Criteria andGevalGoodspriceIn(List<BigDecimal> values) {
            addCriterion("geval_goodsprice in", values, "gevalGoodsprice");
            return (Criteria) this;
        }

        public Criteria andGevalGoodspriceNotIn(List<BigDecimal> values) {
            addCriterion("geval_goodsprice not in", values, "gevalGoodsprice");
            return (Criteria) this;
        }

        public Criteria andGevalGoodspriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("geval_goodsprice between", value1, value2, "gevalGoodsprice");
            return (Criteria) this;
        }

        public Criteria andGevalGoodspriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("geval_goodsprice not between", value1, value2, "gevalGoodsprice");
            return (Criteria) this;
        }

        public Criteria andGevalScoresIsNull() {
            addCriterion("geval_scores is null");
            return (Criteria) this;
        }

        public Criteria andGevalScoresIsNotNull() {
            addCriterion("geval_scores is not null");
            return (Criteria) this;
        }

        public Criteria andGevalScoresEqualTo(Byte value) {
            addCriterion("geval_scores =", value, "gevalScores");
            return (Criteria) this;
        }

        public Criteria andGevalScoresNotEqualTo(Byte value) {
            addCriterion("geval_scores <>", value, "gevalScores");
            return (Criteria) this;
        }

        public Criteria andGevalScoresGreaterThan(Byte value) {
            addCriterion("geval_scores >", value, "gevalScores");
            return (Criteria) this;
        }

        public Criteria andGevalScoresGreaterThanOrEqualTo(Byte value) {
            addCriterion("geval_scores >=", value, "gevalScores");
            return (Criteria) this;
        }

        public Criteria andGevalScoresLessThan(Byte value) {
            addCriterion("geval_scores <", value, "gevalScores");
            return (Criteria) this;
        }

        public Criteria andGevalScoresLessThanOrEqualTo(Byte value) {
            addCriterion("geval_scores <=", value, "gevalScores");
            return (Criteria) this;
        }

        public Criteria andGevalScoresIn(List<Byte> values) {
            addCriterion("geval_scores in", values, "gevalScores");
            return (Criteria) this;
        }

        public Criteria andGevalScoresNotIn(List<Byte> values) {
            addCriterion("geval_scores not in", values, "gevalScores");
            return (Criteria) this;
        }

        public Criteria andGevalScoresBetween(Byte value1, Byte value2) {
            addCriterion("geval_scores between", value1, value2, "gevalScores");
            return (Criteria) this;
        }

        public Criteria andGevalScoresNotBetween(Byte value1, Byte value2) {
            addCriterion("geval_scores not between", value1, value2, "gevalScores");
            return (Criteria) this;
        }

        public Criteria andGevalContentIsNull() {
            addCriterion("geval_content is null");
            return (Criteria) this;
        }

        public Criteria andGevalContentIsNotNull() {
            addCriterion("geval_content is not null");
            return (Criteria) this;
        }

        public Criteria andGevalContentEqualTo(String value) {
            addCriterion("geval_content =", value, "gevalContent");
            return (Criteria) this;
        }

        public Criteria andGevalContentNotEqualTo(String value) {
            addCriterion("geval_content <>", value, "gevalContent");
            return (Criteria) this;
        }

        public Criteria andGevalContentGreaterThan(String value) {
            addCriterion("geval_content >", value, "gevalContent");
            return (Criteria) this;
        }

        public Criteria andGevalContentGreaterThanOrEqualTo(String value) {
            addCriterion("geval_content >=", value, "gevalContent");
            return (Criteria) this;
        }

        public Criteria andGevalContentLessThan(String value) {
            addCriterion("geval_content <", value, "gevalContent");
            return (Criteria) this;
        }

        public Criteria andGevalContentLessThanOrEqualTo(String value) {
            addCriterion("geval_content <=", value, "gevalContent");
            return (Criteria) this;
        }

        public Criteria andGevalContentLike(String value) {
            addCriterion("geval_content like", value, "gevalContent");
            return (Criteria) this;
        }

        public Criteria andGevalContentNotLike(String value) {
            addCriterion("geval_content not like", value, "gevalContent");
            return (Criteria) this;
        }

        public Criteria andGevalContentIn(List<String> values) {
            addCriterion("geval_content in", values, "gevalContent");
            return (Criteria) this;
        }

        public Criteria andGevalContentNotIn(List<String> values) {
            addCriterion("geval_content not in", values, "gevalContent");
            return (Criteria) this;
        }

        public Criteria andGevalContentBetween(String value1, String value2) {
            addCriterion("geval_content between", value1, value2, "gevalContent");
            return (Criteria) this;
        }

        public Criteria andGevalContentNotBetween(String value1, String value2) {
            addCriterion("geval_content not between", value1, value2, "gevalContent");
            return (Criteria) this;
        }

        public Criteria andGevalIsanonymousIsNull() {
            addCriterion("geval_isanonymous is null");
            return (Criteria) this;
        }

        public Criteria andGevalIsanonymousIsNotNull() {
            addCriterion("geval_isanonymous is not null");
            return (Criteria) this;
        }

        public Criteria andGevalIsanonymousEqualTo(Byte value) {
            addCriterion("geval_isanonymous =", value, "gevalIsanonymous");
            return (Criteria) this;
        }

        public Criteria andGevalIsanonymousNotEqualTo(Byte value) {
            addCriterion("geval_isanonymous <>", value, "gevalIsanonymous");
            return (Criteria) this;
        }

        public Criteria andGevalIsanonymousGreaterThan(Byte value) {
            addCriterion("geval_isanonymous >", value, "gevalIsanonymous");
            return (Criteria) this;
        }

        public Criteria andGevalIsanonymousGreaterThanOrEqualTo(Byte value) {
            addCriterion("geval_isanonymous >=", value, "gevalIsanonymous");
            return (Criteria) this;
        }

        public Criteria andGevalIsanonymousLessThan(Byte value) {
            addCriterion("geval_isanonymous <", value, "gevalIsanonymous");
            return (Criteria) this;
        }

        public Criteria andGevalIsanonymousLessThanOrEqualTo(Byte value) {
            addCriterion("geval_isanonymous <=", value, "gevalIsanonymous");
            return (Criteria) this;
        }

        public Criteria andGevalIsanonymousIn(List<Byte> values) {
            addCriterion("geval_isanonymous in", values, "gevalIsanonymous");
            return (Criteria) this;
        }

        public Criteria andGevalIsanonymousNotIn(List<Byte> values) {
            addCriterion("geval_isanonymous not in", values, "gevalIsanonymous");
            return (Criteria) this;
        }

        public Criteria andGevalIsanonymousBetween(Byte value1, Byte value2) {
            addCriterion("geval_isanonymous between", value1, value2, "gevalIsanonymous");
            return (Criteria) this;
        }

        public Criteria andGevalIsanonymousNotBetween(Byte value1, Byte value2) {
            addCriterion("geval_isanonymous not between", value1, value2, "gevalIsanonymous");
            return (Criteria) this;
        }

        public Criteria andGevalAddtimeIsNull() {
            addCriterion("geval_addtime is null");
            return (Criteria) this;
        }

        public Criteria andGevalAddtimeIsNotNull() {
            addCriterion("geval_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andGevalAddtimeEqualTo(Integer value) {
            addCriterion("geval_addtime =", value, "gevalAddtime");
            return (Criteria) this;
        }

        public Criteria andGevalAddtimeNotEqualTo(Integer value) {
            addCriterion("geval_addtime <>", value, "gevalAddtime");
            return (Criteria) this;
        }

        public Criteria andGevalAddtimeGreaterThan(Integer value) {
            addCriterion("geval_addtime >", value, "gevalAddtime");
            return (Criteria) this;
        }

        public Criteria andGevalAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("geval_addtime >=", value, "gevalAddtime");
            return (Criteria) this;
        }

        public Criteria andGevalAddtimeLessThan(Integer value) {
            addCriterion("geval_addtime <", value, "gevalAddtime");
            return (Criteria) this;
        }

        public Criteria andGevalAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("geval_addtime <=", value, "gevalAddtime");
            return (Criteria) this;
        }

        public Criteria andGevalAddtimeIn(List<Integer> values) {
            addCriterion("geval_addtime in", values, "gevalAddtime");
            return (Criteria) this;
        }

        public Criteria andGevalAddtimeNotIn(List<Integer> values) {
            addCriterion("geval_addtime not in", values, "gevalAddtime");
            return (Criteria) this;
        }

        public Criteria andGevalAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("geval_addtime between", value1, value2, "gevalAddtime");
            return (Criteria) this;
        }

        public Criteria andGevalAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("geval_addtime not between", value1, value2, "gevalAddtime");
            return (Criteria) this;
        }

        public Criteria andGevalStoreidIsNull() {
            addCriterion("geval_storeid is null");
            return (Criteria) this;
        }

        public Criteria andGevalStoreidIsNotNull() {
            addCriterion("geval_storeid is not null");
            return (Criteria) this;
        }

        public Criteria andGevalStoreidEqualTo(Integer value) {
            addCriterion("geval_storeid =", value, "gevalStoreid");
            return (Criteria) this;
        }

        public Criteria andGevalStoreidNotEqualTo(Integer value) {
            addCriterion("geval_storeid <>", value, "gevalStoreid");
            return (Criteria) this;
        }

        public Criteria andGevalStoreidGreaterThan(Integer value) {
            addCriterion("geval_storeid >", value, "gevalStoreid");
            return (Criteria) this;
        }

        public Criteria andGevalStoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("geval_storeid >=", value, "gevalStoreid");
            return (Criteria) this;
        }

        public Criteria andGevalStoreidLessThan(Integer value) {
            addCriterion("geval_storeid <", value, "gevalStoreid");
            return (Criteria) this;
        }

        public Criteria andGevalStoreidLessThanOrEqualTo(Integer value) {
            addCriterion("geval_storeid <=", value, "gevalStoreid");
            return (Criteria) this;
        }

        public Criteria andGevalStoreidIn(List<Integer> values) {
            addCriterion("geval_storeid in", values, "gevalStoreid");
            return (Criteria) this;
        }

        public Criteria andGevalStoreidNotIn(List<Integer> values) {
            addCriterion("geval_storeid not in", values, "gevalStoreid");
            return (Criteria) this;
        }

        public Criteria andGevalStoreidBetween(Integer value1, Integer value2) {
            addCriterion("geval_storeid between", value1, value2, "gevalStoreid");
            return (Criteria) this;
        }

        public Criteria andGevalStoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("geval_storeid not between", value1, value2, "gevalStoreid");
            return (Criteria) this;
        }

        public Criteria andGevalStorenameIsNull() {
            addCriterion("geval_storename is null");
            return (Criteria) this;
        }

        public Criteria andGevalStorenameIsNotNull() {
            addCriterion("geval_storename is not null");
            return (Criteria) this;
        }

        public Criteria andGevalStorenameEqualTo(String value) {
            addCriterion("geval_storename =", value, "gevalStorename");
            return (Criteria) this;
        }

        public Criteria andGevalStorenameNotEqualTo(String value) {
            addCriterion("geval_storename <>", value, "gevalStorename");
            return (Criteria) this;
        }

        public Criteria andGevalStorenameGreaterThan(String value) {
            addCriterion("geval_storename >", value, "gevalStorename");
            return (Criteria) this;
        }

        public Criteria andGevalStorenameGreaterThanOrEqualTo(String value) {
            addCriterion("geval_storename >=", value, "gevalStorename");
            return (Criteria) this;
        }

        public Criteria andGevalStorenameLessThan(String value) {
            addCriterion("geval_storename <", value, "gevalStorename");
            return (Criteria) this;
        }

        public Criteria andGevalStorenameLessThanOrEqualTo(String value) {
            addCriterion("geval_storename <=", value, "gevalStorename");
            return (Criteria) this;
        }

        public Criteria andGevalStorenameLike(String value) {
            addCriterion("geval_storename like", value, "gevalStorename");
            return (Criteria) this;
        }

        public Criteria andGevalStorenameNotLike(String value) {
            addCriterion("geval_storename not like", value, "gevalStorename");
            return (Criteria) this;
        }

        public Criteria andGevalStorenameIn(List<String> values) {
            addCriterion("geval_storename in", values, "gevalStorename");
            return (Criteria) this;
        }

        public Criteria andGevalStorenameNotIn(List<String> values) {
            addCriterion("geval_storename not in", values, "gevalStorename");
            return (Criteria) this;
        }

        public Criteria andGevalStorenameBetween(String value1, String value2) {
            addCriterion("geval_storename between", value1, value2, "gevalStorename");
            return (Criteria) this;
        }

        public Criteria andGevalStorenameNotBetween(String value1, String value2) {
            addCriterion("geval_storename not between", value1, value2, "gevalStorename");
            return (Criteria) this;
        }

        public Criteria andGevalFrommemberidIsNull() {
            addCriterion("geval_frommemberid is null");
            return (Criteria) this;
        }

        public Criteria andGevalFrommemberidIsNotNull() {
            addCriterion("geval_frommemberid is not null");
            return (Criteria) this;
        }

        public Criteria andGevalFrommemberidEqualTo(Integer value) {
            addCriterion("geval_frommemberid =", value, "gevalFrommemberid");
            return (Criteria) this;
        }

        public Criteria andGevalFrommemberidNotEqualTo(Integer value) {
            addCriterion("geval_frommemberid <>", value, "gevalFrommemberid");
            return (Criteria) this;
        }

        public Criteria andGevalFrommemberidGreaterThan(Integer value) {
            addCriterion("geval_frommemberid >", value, "gevalFrommemberid");
            return (Criteria) this;
        }

        public Criteria andGevalFrommemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("geval_frommemberid >=", value, "gevalFrommemberid");
            return (Criteria) this;
        }

        public Criteria andGevalFrommemberidLessThan(Integer value) {
            addCriterion("geval_frommemberid <", value, "gevalFrommemberid");
            return (Criteria) this;
        }

        public Criteria andGevalFrommemberidLessThanOrEqualTo(Integer value) {
            addCriterion("geval_frommemberid <=", value, "gevalFrommemberid");
            return (Criteria) this;
        }

        public Criteria andGevalFrommemberidIn(List<Integer> values) {
            addCriterion("geval_frommemberid in", values, "gevalFrommemberid");
            return (Criteria) this;
        }

        public Criteria andGevalFrommemberidNotIn(List<Integer> values) {
            addCriterion("geval_frommemberid not in", values, "gevalFrommemberid");
            return (Criteria) this;
        }

        public Criteria andGevalFrommemberidBetween(Integer value1, Integer value2) {
            addCriterion("geval_frommemberid between", value1, value2, "gevalFrommemberid");
            return (Criteria) this;
        }

        public Criteria andGevalFrommemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("geval_frommemberid not between", value1, value2, "gevalFrommemberid");
            return (Criteria) this;
        }

        public Criteria andGevalFrommembernameIsNull() {
            addCriterion("geval_frommembername is null");
            return (Criteria) this;
        }

        public Criteria andGevalFrommembernameIsNotNull() {
            addCriterion("geval_frommembername is not null");
            return (Criteria) this;
        }

        public Criteria andGevalFrommembernameEqualTo(String value) {
            addCriterion("geval_frommembername =", value, "gevalFrommembername");
            return (Criteria) this;
        }

        public Criteria andGevalFrommembernameNotEqualTo(String value) {
            addCriterion("geval_frommembername <>", value, "gevalFrommembername");
            return (Criteria) this;
        }

        public Criteria andGevalFrommembernameGreaterThan(String value) {
            addCriterion("geval_frommembername >", value, "gevalFrommembername");
            return (Criteria) this;
        }

        public Criteria andGevalFrommembernameGreaterThanOrEqualTo(String value) {
            addCriterion("geval_frommembername >=", value, "gevalFrommembername");
            return (Criteria) this;
        }

        public Criteria andGevalFrommembernameLessThan(String value) {
            addCriterion("geval_frommembername <", value, "gevalFrommembername");
            return (Criteria) this;
        }

        public Criteria andGevalFrommembernameLessThanOrEqualTo(String value) {
            addCriterion("geval_frommembername <=", value, "gevalFrommembername");
            return (Criteria) this;
        }

        public Criteria andGevalFrommembernameLike(String value) {
            addCriterion("geval_frommembername like", value, "gevalFrommembername");
            return (Criteria) this;
        }

        public Criteria andGevalFrommembernameNotLike(String value) {
            addCriterion("geval_frommembername not like", value, "gevalFrommembername");
            return (Criteria) this;
        }

        public Criteria andGevalFrommembernameIn(List<String> values) {
            addCriterion("geval_frommembername in", values, "gevalFrommembername");
            return (Criteria) this;
        }

        public Criteria andGevalFrommembernameNotIn(List<String> values) {
            addCriterion("geval_frommembername not in", values, "gevalFrommembername");
            return (Criteria) this;
        }

        public Criteria andGevalFrommembernameBetween(String value1, String value2) {
            addCriterion("geval_frommembername between", value1, value2, "gevalFrommembername");
            return (Criteria) this;
        }

        public Criteria andGevalFrommembernameNotBetween(String value1, String value2) {
            addCriterion("geval_frommembername not between", value1, value2, "gevalFrommembername");
            return (Criteria) this;
        }

        public Criteria andGevalStateIsNull() {
            addCriterion("geval_state is null");
            return (Criteria) this;
        }

        public Criteria andGevalStateIsNotNull() {
            addCriterion("geval_state is not null");
            return (Criteria) this;
        }

        public Criteria andGevalStateEqualTo(Byte value) {
            addCriterion("geval_state =", value, "gevalState");
            return (Criteria) this;
        }

        public Criteria andGevalStateNotEqualTo(Byte value) {
            addCriterion("geval_state <>", value, "gevalState");
            return (Criteria) this;
        }

        public Criteria andGevalStateGreaterThan(Byte value) {
            addCriterion("geval_state >", value, "gevalState");
            return (Criteria) this;
        }

        public Criteria andGevalStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("geval_state >=", value, "gevalState");
            return (Criteria) this;
        }

        public Criteria andGevalStateLessThan(Byte value) {
            addCriterion("geval_state <", value, "gevalState");
            return (Criteria) this;
        }

        public Criteria andGevalStateLessThanOrEqualTo(Byte value) {
            addCriterion("geval_state <=", value, "gevalState");
            return (Criteria) this;
        }

        public Criteria andGevalStateIn(List<Byte> values) {
            addCriterion("geval_state in", values, "gevalState");
            return (Criteria) this;
        }

        public Criteria andGevalStateNotIn(List<Byte> values) {
            addCriterion("geval_state not in", values, "gevalState");
            return (Criteria) this;
        }

        public Criteria andGevalStateBetween(Byte value1, Byte value2) {
            addCriterion("geval_state between", value1, value2, "gevalState");
            return (Criteria) this;
        }

        public Criteria andGevalStateNotBetween(Byte value1, Byte value2) {
            addCriterion("geval_state not between", value1, value2, "gevalState");
            return (Criteria) this;
        }

        public Criteria andGevalRemarkIsNull() {
            addCriterion("geval_remark is null");
            return (Criteria) this;
        }

        public Criteria andGevalRemarkIsNotNull() {
            addCriterion("geval_remark is not null");
            return (Criteria) this;
        }

        public Criteria andGevalRemarkEqualTo(String value) {
            addCriterion("geval_remark =", value, "gevalRemark");
            return (Criteria) this;
        }

        public Criteria andGevalRemarkNotEqualTo(String value) {
            addCriterion("geval_remark <>", value, "gevalRemark");
            return (Criteria) this;
        }

        public Criteria andGevalRemarkGreaterThan(String value) {
            addCriterion("geval_remark >", value, "gevalRemark");
            return (Criteria) this;
        }

        public Criteria andGevalRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("geval_remark >=", value, "gevalRemark");
            return (Criteria) this;
        }

        public Criteria andGevalRemarkLessThan(String value) {
            addCriterion("geval_remark <", value, "gevalRemark");
            return (Criteria) this;
        }

        public Criteria andGevalRemarkLessThanOrEqualTo(String value) {
            addCriterion("geval_remark <=", value, "gevalRemark");
            return (Criteria) this;
        }

        public Criteria andGevalRemarkLike(String value) {
            addCriterion("geval_remark like", value, "gevalRemark");
            return (Criteria) this;
        }

        public Criteria andGevalRemarkNotLike(String value) {
            addCriterion("geval_remark not like", value, "gevalRemark");
            return (Criteria) this;
        }

        public Criteria andGevalRemarkIn(List<String> values) {
            addCriterion("geval_remark in", values, "gevalRemark");
            return (Criteria) this;
        }

        public Criteria andGevalRemarkNotIn(List<String> values) {
            addCriterion("geval_remark not in", values, "gevalRemark");
            return (Criteria) this;
        }

        public Criteria andGevalRemarkBetween(String value1, String value2) {
            addCriterion("geval_remark between", value1, value2, "gevalRemark");
            return (Criteria) this;
        }

        public Criteria andGevalRemarkNotBetween(String value1, String value2) {
            addCriterion("geval_remark not between", value1, value2, "gevalRemark");
            return (Criteria) this;
        }

        public Criteria andGevalExplainIsNull() {
            addCriterion("geval_explain is null");
            return (Criteria) this;
        }

        public Criteria andGevalExplainIsNotNull() {
            addCriterion("geval_explain is not null");
            return (Criteria) this;
        }

        public Criteria andGevalExplainEqualTo(String value) {
            addCriterion("geval_explain =", value, "gevalExplain");
            return (Criteria) this;
        }

        public Criteria andGevalExplainNotEqualTo(String value) {
            addCriterion("geval_explain <>", value, "gevalExplain");
            return (Criteria) this;
        }

        public Criteria andGevalExplainGreaterThan(String value) {
            addCriterion("geval_explain >", value, "gevalExplain");
            return (Criteria) this;
        }

        public Criteria andGevalExplainGreaterThanOrEqualTo(String value) {
            addCriterion("geval_explain >=", value, "gevalExplain");
            return (Criteria) this;
        }

        public Criteria andGevalExplainLessThan(String value) {
            addCriterion("geval_explain <", value, "gevalExplain");
            return (Criteria) this;
        }

        public Criteria andGevalExplainLessThanOrEqualTo(String value) {
            addCriterion("geval_explain <=", value, "gevalExplain");
            return (Criteria) this;
        }

        public Criteria andGevalExplainLike(String value) {
            addCriterion("geval_explain like", value, "gevalExplain");
            return (Criteria) this;
        }

        public Criteria andGevalExplainNotLike(String value) {
            addCriterion("geval_explain not like", value, "gevalExplain");
            return (Criteria) this;
        }

        public Criteria andGevalExplainIn(List<String> values) {
            addCriterion("geval_explain in", values, "gevalExplain");
            return (Criteria) this;
        }

        public Criteria andGevalExplainNotIn(List<String> values) {
            addCriterion("geval_explain not in", values, "gevalExplain");
            return (Criteria) this;
        }

        public Criteria andGevalExplainBetween(String value1, String value2) {
            addCriterion("geval_explain between", value1, value2, "gevalExplain");
            return (Criteria) this;
        }

        public Criteria andGevalExplainNotBetween(String value1, String value2) {
            addCriterion("geval_explain not between", value1, value2, "gevalExplain");
            return (Criteria) this;
        }

        public Criteria andGevalImageIsNull() {
            addCriterion("geval_image is null");
            return (Criteria) this;
        }

        public Criteria andGevalImageIsNotNull() {
            addCriterion("geval_image is not null");
            return (Criteria) this;
        }

        public Criteria andGevalImageEqualTo(String value) {
            addCriterion("geval_image =", value, "gevalImage");
            return (Criteria) this;
        }

        public Criteria andGevalImageNotEqualTo(String value) {
            addCriterion("geval_image <>", value, "gevalImage");
            return (Criteria) this;
        }

        public Criteria andGevalImageGreaterThan(String value) {
            addCriterion("geval_image >", value, "gevalImage");
            return (Criteria) this;
        }

        public Criteria andGevalImageGreaterThanOrEqualTo(String value) {
            addCriterion("geval_image >=", value, "gevalImage");
            return (Criteria) this;
        }

        public Criteria andGevalImageLessThan(String value) {
            addCriterion("geval_image <", value, "gevalImage");
            return (Criteria) this;
        }

        public Criteria andGevalImageLessThanOrEqualTo(String value) {
            addCriterion("geval_image <=", value, "gevalImage");
            return (Criteria) this;
        }

        public Criteria andGevalImageLike(String value) {
            addCriterion("geval_image like", value, "gevalImage");
            return (Criteria) this;
        }

        public Criteria andGevalImageNotLike(String value) {
            addCriterion("geval_image not like", value, "gevalImage");
            return (Criteria) this;
        }

        public Criteria andGevalImageIn(List<String> values) {
            addCriterion("geval_image in", values, "gevalImage");
            return (Criteria) this;
        }

        public Criteria andGevalImageNotIn(List<String> values) {
            addCriterion("geval_image not in", values, "gevalImage");
            return (Criteria) this;
        }

        public Criteria andGevalImageBetween(String value1, String value2) {
            addCriterion("geval_image between", value1, value2, "gevalImage");
            return (Criteria) this;
        }

        public Criteria andGevalImageNotBetween(String value1, String value2) {
            addCriterion("geval_image not between", value1, value2, "gevalImage");
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

        public Criteria andEdittimeIsNull() {
            addCriterion("edittime is null");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNotNull() {
            addCriterion("edittime is not null");
            return (Criteria) this;
        }

        public Criteria andEdittimeEqualTo(Integer value) {
            addCriterion("edittime =", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotEqualTo(Integer value) {
            addCriterion("edittime <>", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThan(Integer value) {
            addCriterion("edittime >", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("edittime >=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThan(Integer value) {
            addCriterion("edittime <", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThanOrEqualTo(Integer value) {
            addCriterion("edittime <=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIn(List<Integer> values) {
            addCriterion("edittime in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotIn(List<Integer> values) {
            addCriterion("edittime not in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeBetween(Integer value1, Integer value2) {
            addCriterion("edittime between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotBetween(Integer value1, Integer value2) {
            addCriterion("edittime not between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andGevalTypeIsNull() {
            addCriterion("geval_type is null");
            return (Criteria) this;
        }

        public Criteria andGevalTypeIsNotNull() {
            addCriterion("geval_type is not null");
            return (Criteria) this;
        }

        public Criteria andGevalTypeEqualTo(Byte value) {
            addCriterion("geval_type =", value, "gevalType");
            return (Criteria) this;
        }

        public Criteria andGevalTypeNotEqualTo(Byte value) {
            addCriterion("geval_type <>", value, "gevalType");
            return (Criteria) this;
        }

        public Criteria andGevalTypeGreaterThan(Byte value) {
            addCriterion("geval_type >", value, "gevalType");
            return (Criteria) this;
        }

        public Criteria andGevalTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("geval_type >=", value, "gevalType");
            return (Criteria) this;
        }

        public Criteria andGevalTypeLessThan(Byte value) {
            addCriterion("geval_type <", value, "gevalType");
            return (Criteria) this;
        }

        public Criteria andGevalTypeLessThanOrEqualTo(Byte value) {
            addCriterion("geval_type <=", value, "gevalType");
            return (Criteria) this;
        }

        public Criteria andGevalTypeIn(List<Byte> values) {
            addCriterion("geval_type in", values, "gevalType");
            return (Criteria) this;
        }

        public Criteria andGevalTypeNotIn(List<Byte> values) {
            addCriterion("geval_type not in", values, "gevalType");
            return (Criteria) this;
        }

        public Criteria andGevalTypeBetween(Byte value1, Byte value2) {
            addCriterion("geval_type between", value1, value2, "gevalType");
            return (Criteria) this;
        }

        public Criteria andGevalTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("geval_type not between", value1, value2, "gevalType");
            return (Criteria) this;
        }

        public Criteria andGevalCommunicationStatusIsNull() {
            addCriterion("geval_communication_status is null");
            return (Criteria) this;
        }

        public Criteria andGevalCommunicationStatusIsNotNull() {
            addCriterion("geval_communication_status is not null");
            return (Criteria) this;
        }

        public Criteria andGevalCommunicationStatusEqualTo(Byte value) {
            addCriterion("geval_communication_status =", value, "gevalCommunicationStatus");
            return (Criteria) this;
        }

        public Criteria andGevalCommunicationStatusNotEqualTo(Byte value) {
            addCriterion("geval_communication_status <>", value, "gevalCommunicationStatus");
            return (Criteria) this;
        }

        public Criteria andGevalCommunicationStatusGreaterThan(Byte value) {
            addCriterion("geval_communication_status >", value, "gevalCommunicationStatus");
            return (Criteria) this;
        }

        public Criteria andGevalCommunicationStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("geval_communication_status >=", value, "gevalCommunicationStatus");
            return (Criteria) this;
        }

        public Criteria andGevalCommunicationStatusLessThan(Byte value) {
            addCriterion("geval_communication_status <", value, "gevalCommunicationStatus");
            return (Criteria) this;
        }

        public Criteria andGevalCommunicationStatusLessThanOrEqualTo(Byte value) {
            addCriterion("geval_communication_status <=", value, "gevalCommunicationStatus");
            return (Criteria) this;
        }

        public Criteria andGevalCommunicationStatusIn(List<Byte> values) {
            addCriterion("geval_communication_status in", values, "gevalCommunicationStatus");
            return (Criteria) this;
        }

        public Criteria andGevalCommunicationStatusNotIn(List<Byte> values) {
            addCriterion("geval_communication_status not in", values, "gevalCommunicationStatus");
            return (Criteria) this;
        }

        public Criteria andGevalCommunicationStatusBetween(Byte value1, Byte value2) {
            addCriterion("geval_communication_status between", value1, value2, "gevalCommunicationStatus");
            return (Criteria) this;
        }

        public Criteria andGevalCommunicationStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("geval_communication_status not between", value1, value2, "gevalCommunicationStatus");
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

        public Criteria andGevalImage2IsNull() {
            addCriterion("geval_image2 is null");
            return (Criteria) this;
        }

        public Criteria andGevalImage2IsNotNull() {
            addCriterion("geval_image2 is not null");
            return (Criteria) this;
        }

        public Criteria andGevalImage2EqualTo(String value) {
            addCriterion("geval_image2 =", value, "gevalImage2");
            return (Criteria) this;
        }

        public Criteria andGevalImage2NotEqualTo(String value) {
            addCriterion("geval_image2 <>", value, "gevalImage2");
            return (Criteria) this;
        }

        public Criteria andGevalImage2GreaterThan(String value) {
            addCriterion("geval_image2 >", value, "gevalImage2");
            return (Criteria) this;
        }

        public Criteria andGevalImage2GreaterThanOrEqualTo(String value) {
            addCriterion("geval_image2 >=", value, "gevalImage2");
            return (Criteria) this;
        }

        public Criteria andGevalImage2LessThan(String value) {
            addCriterion("geval_image2 <", value, "gevalImage2");
            return (Criteria) this;
        }

        public Criteria andGevalImage2LessThanOrEqualTo(String value) {
            addCriterion("geval_image2 <=", value, "gevalImage2");
            return (Criteria) this;
        }

        public Criteria andGevalImage2Like(String value) {
            addCriterion("geval_image2 like", value, "gevalImage2");
            return (Criteria) this;
        }

        public Criteria andGevalImage2NotLike(String value) {
            addCriterion("geval_image2 not like", value, "gevalImage2");
            return (Criteria) this;
        }

        public Criteria andGevalImage2In(List<String> values) {
            addCriterion("geval_image2 in", values, "gevalImage2");
            return (Criteria) this;
        }

        public Criteria andGevalImage2NotIn(List<String> values) {
            addCriterion("geval_image2 not in", values, "gevalImage2");
            return (Criteria) this;
        }

        public Criteria andGevalImage2Between(String value1, String value2) {
            addCriterion("geval_image2 between", value1, value2, "gevalImage2");
            return (Criteria) this;
        }

        public Criteria andGevalImage2NotBetween(String value1, String value2) {
            addCriterion("geval_image2 not between", value1, value2, "gevalImage2");
            return (Criteria) this;
        }

        public Criteria andGevalImage3IsNull() {
            addCriterion("geval_image3 is null");
            return (Criteria) this;
        }

        public Criteria andGevalImage3IsNotNull() {
            addCriterion("geval_image3 is not null");
            return (Criteria) this;
        }

        public Criteria andGevalImage3EqualTo(String value) {
            addCriterion("geval_image3 =", value, "gevalImage3");
            return (Criteria) this;
        }

        public Criteria andGevalImage3NotEqualTo(String value) {
            addCriterion("geval_image3 <>", value, "gevalImage3");
            return (Criteria) this;
        }

        public Criteria andGevalImage3GreaterThan(String value) {
            addCriterion("geval_image3 >", value, "gevalImage3");
            return (Criteria) this;
        }

        public Criteria andGevalImage3GreaterThanOrEqualTo(String value) {
            addCriterion("geval_image3 >=", value, "gevalImage3");
            return (Criteria) this;
        }

        public Criteria andGevalImage3LessThan(String value) {
            addCriterion("geval_image3 <", value, "gevalImage3");
            return (Criteria) this;
        }

        public Criteria andGevalImage3LessThanOrEqualTo(String value) {
            addCriterion("geval_image3 <=", value, "gevalImage3");
            return (Criteria) this;
        }

        public Criteria andGevalImage3Like(String value) {
            addCriterion("geval_image3 like", value, "gevalImage3");
            return (Criteria) this;
        }

        public Criteria andGevalImage3NotLike(String value) {
            addCriterion("geval_image3 not like", value, "gevalImage3");
            return (Criteria) this;
        }

        public Criteria andGevalImage3In(List<String> values) {
            addCriterion("geval_image3 in", values, "gevalImage3");
            return (Criteria) this;
        }

        public Criteria andGevalImage3NotIn(List<String> values) {
            addCriterion("geval_image3 not in", values, "gevalImage3");
            return (Criteria) this;
        }

        public Criteria andGevalImage3Between(String value1, String value2) {
            addCriterion("geval_image3 between", value1, value2, "gevalImage3");
            return (Criteria) this;
        }

        public Criteria andGevalImage3NotBetween(String value1, String value2) {
            addCriterion("geval_image3 not between", value1, value2, "gevalImage3");
            return (Criteria) this;
        }
    }

    /**
     * 描述:sy_evaluate_goods表的实体类
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
     * sy_evaluate_goods 2017-10-16
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