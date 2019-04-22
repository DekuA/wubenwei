package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class ClasstabExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClasstabExample() {
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

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andRuxueIsNull() {
            addCriterion("ruxue is null");
            return (Criteria) this;
        }

        public Criteria andRuxueIsNotNull() {
            addCriterion("ruxue is not null");
            return (Criteria) this;
        }

        public Criteria andRuxueEqualTo(String value) {
            addCriterion("ruxue =", value, "ruxue");
            return (Criteria) this;
        }

        public Criteria andRuxueNotEqualTo(String value) {
            addCriterion("ruxue <>", value, "ruxue");
            return (Criteria) this;
        }

        public Criteria andRuxueGreaterThan(String value) {
            addCriterion("ruxue >", value, "ruxue");
            return (Criteria) this;
        }

        public Criteria andRuxueGreaterThanOrEqualTo(String value) {
            addCriterion("ruxue >=", value, "ruxue");
            return (Criteria) this;
        }

        public Criteria andRuxueLessThan(String value) {
            addCriterion("ruxue <", value, "ruxue");
            return (Criteria) this;
        }

        public Criteria andRuxueLessThanOrEqualTo(String value) {
            addCriterion("ruxue <=", value, "ruxue");
            return (Criteria) this;
        }

        public Criteria andRuxueLike(String value) {
            addCriterion("ruxue like", value, "ruxue");
            return (Criteria) this;
        }

        public Criteria andRuxueNotLike(String value) {
            addCriterion("ruxue not like", value, "ruxue");
            return (Criteria) this;
        }

        public Criteria andRuxueIn(List<String> values) {
            addCriterion("ruxue in", values, "ruxue");
            return (Criteria) this;
        }

        public Criteria andRuxueNotIn(List<String> values) {
            addCriterion("ruxue not in", values, "ruxue");
            return (Criteria) this;
        }

        public Criteria andRuxueBetween(String value1, String value2) {
            addCriterion("ruxue between", value1, value2, "ruxue");
            return (Criteria) this;
        }

        public Criteria andRuxueNotBetween(String value1, String value2) {
            addCriterion("ruxue not between", value1, value2, "ruxue");
            return (Criteria) this;
        }

        public Criteria andBiyeIsNull() {
            addCriterion("biye is null");
            return (Criteria) this;
        }

        public Criteria andBiyeIsNotNull() {
            addCriterion("biye is not null");
            return (Criteria) this;
        }

        public Criteria andBiyeEqualTo(String value) {
            addCriterion("biye =", value, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeNotEqualTo(String value) {
            addCriterion("biye <>", value, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeGreaterThan(String value) {
            addCriterion("biye >", value, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeGreaterThanOrEqualTo(String value) {
            addCriterion("biye >=", value, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeLessThan(String value) {
            addCriterion("biye <", value, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeLessThanOrEqualTo(String value) {
            addCriterion("biye <=", value, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeLike(String value) {
            addCriterion("biye like", value, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeNotLike(String value) {
            addCriterion("biye not like", value, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeIn(List<String> values) {
            addCriterion("biye in", values, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeNotIn(List<String> values) {
            addCriterion("biye not in", values, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeBetween(String value1, String value2) {
            addCriterion("biye between", value1, value2, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeNotBetween(String value1, String value2) {
            addCriterion("biye not between", value1, value2, "biye");
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