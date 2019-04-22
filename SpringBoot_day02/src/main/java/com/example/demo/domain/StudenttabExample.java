package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class StudenttabExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudenttabExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSdateIsNull() {
            addCriterion("sdate is null");
            return (Criteria) this;
        }

        public Criteria andSdateIsNotNull() {
            addCriterion("sdate is not null");
            return (Criteria) this;
        }

        public Criteria andSdateEqualTo(String value) {
            addCriterion("sdate =", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateNotEqualTo(String value) {
            addCriterion("sdate <>", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateGreaterThan(String value) {
            addCriterion("sdate >", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateGreaterThanOrEqualTo(String value) {
            addCriterion("sdate >=", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateLessThan(String value) {
            addCriterion("sdate <", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateLessThanOrEqualTo(String value) {
            addCriterion("sdate <=", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateLike(String value) {
            addCriterion("sdate like", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateNotLike(String value) {
            addCriterion("sdate not like", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateIn(List<String> values) {
            addCriterion("sdate in", values, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateNotIn(List<String> values) {
            addCriterion("sdate not in", values, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateBetween(String value1, String value2) {
            addCriterion("sdate between", value1, value2, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateNotBetween(String value1, String value2) {
            addCriterion("sdate not between", value1, value2, "sdate");
            return (Criteria) this;
        }

        public Criteria andSsfzIsNull() {
            addCriterion("ssfz is null");
            return (Criteria) this;
        }

        public Criteria andSsfzIsNotNull() {
            addCriterion("ssfz is not null");
            return (Criteria) this;
        }

        public Criteria andSsfzEqualTo(String value) {
            addCriterion("ssfz =", value, "ssfz");
            return (Criteria) this;
        }

        public Criteria andSsfzNotEqualTo(String value) {
            addCriterion("ssfz <>", value, "ssfz");
            return (Criteria) this;
        }

        public Criteria andSsfzGreaterThan(String value) {
            addCriterion("ssfz >", value, "ssfz");
            return (Criteria) this;
        }

        public Criteria andSsfzGreaterThanOrEqualTo(String value) {
            addCriterion("ssfz >=", value, "ssfz");
            return (Criteria) this;
        }

        public Criteria andSsfzLessThan(String value) {
            addCriterion("ssfz <", value, "ssfz");
            return (Criteria) this;
        }

        public Criteria andSsfzLessThanOrEqualTo(String value) {
            addCriterion("ssfz <=", value, "ssfz");
            return (Criteria) this;
        }

        public Criteria andSsfzLike(String value) {
            addCriterion("ssfz like", value, "ssfz");
            return (Criteria) this;
        }

        public Criteria andSsfzNotLike(String value) {
            addCriterion("ssfz not like", value, "ssfz");
            return (Criteria) this;
        }

        public Criteria andSsfzIn(List<String> values) {
            addCriterion("ssfz in", values, "ssfz");
            return (Criteria) this;
        }

        public Criteria andSsfzNotIn(List<String> values) {
            addCriterion("ssfz not in", values, "ssfz");
            return (Criteria) this;
        }

        public Criteria andSsfzBetween(String value1, String value2) {
            addCriterion("ssfz between", value1, value2, "ssfz");
            return (Criteria) this;
        }

        public Criteria andSsfzNotBetween(String value1, String value2) {
            addCriterion("ssfz not between", value1, value2, "ssfz");
            return (Criteria) this;
        }

        public Criteria andSphoneIsNull() {
            addCriterion("sphone is null");
            return (Criteria) this;
        }

        public Criteria andSphoneIsNotNull() {
            addCriterion("sphone is not null");
            return (Criteria) this;
        }

        public Criteria andSphoneEqualTo(String value) {
            addCriterion("sphone =", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotEqualTo(String value) {
            addCriterion("sphone <>", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneGreaterThan(String value) {
            addCriterion("sphone >", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneGreaterThanOrEqualTo(String value) {
            addCriterion("sphone >=", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLessThan(String value) {
            addCriterion("sphone <", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLessThanOrEqualTo(String value) {
            addCriterion("sphone <=", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLike(String value) {
            addCriterion("sphone like", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotLike(String value) {
            addCriterion("sphone not like", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneIn(List<String> values) {
            addCriterion("sphone in", values, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotIn(List<String> values) {
            addCriterion("sphone not in", values, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneBetween(String value1, String value2) {
            addCriterion("sphone between", value1, value2, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotBetween(String value1, String value2) {
            addCriterion("sphone not between", value1, value2, "sphone");
            return (Criteria) this;
        }

        public Criteria andSemailIsNull() {
            addCriterion("semail is null");
            return (Criteria) this;
        }

        public Criteria andSemailIsNotNull() {
            addCriterion("semail is not null");
            return (Criteria) this;
        }

        public Criteria andSemailEqualTo(String value) {
            addCriterion("semail =", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailNotEqualTo(String value) {
            addCriterion("semail <>", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailGreaterThan(String value) {
            addCriterion("semail >", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailGreaterThanOrEqualTo(String value) {
            addCriterion("semail >=", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailLessThan(String value) {
            addCriterion("semail <", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailLessThanOrEqualTo(String value) {
            addCriterion("semail <=", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailLike(String value) {
            addCriterion("semail like", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailNotLike(String value) {
            addCriterion("semail not like", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailIn(List<String> values) {
            addCriterion("semail in", values, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailNotIn(List<String> values) {
            addCriterion("semail not in", values, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailBetween(String value1, String value2) {
            addCriterion("semail between", value1, value2, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailNotBetween(String value1, String value2) {
            addCriterion("semail not between", value1, value2, "semail");
            return (Criteria) this;
        }

        public Criteria andSadressIsNull() {
            addCriterion("sadress is null");
            return (Criteria) this;
        }

        public Criteria andSadressIsNotNull() {
            addCriterion("sadress is not null");
            return (Criteria) this;
        }

        public Criteria andSadressEqualTo(String value) {
            addCriterion("sadress =", value, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressNotEqualTo(String value) {
            addCriterion("sadress <>", value, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressGreaterThan(String value) {
            addCriterion("sadress >", value, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressGreaterThanOrEqualTo(String value) {
            addCriterion("sadress >=", value, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressLessThan(String value) {
            addCriterion("sadress <", value, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressLessThanOrEqualTo(String value) {
            addCriterion("sadress <=", value, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressLike(String value) {
            addCriterion("sadress like", value, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressNotLike(String value) {
            addCriterion("sadress not like", value, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressIn(List<String> values) {
            addCriterion("sadress in", values, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressNotIn(List<String> values) {
            addCriterion("sadress not in", values, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressBetween(String value1, String value2) {
            addCriterion("sadress between", value1, value2, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressNotBetween(String value1, String value2) {
            addCriterion("sadress not between", value1, value2, "sadress");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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