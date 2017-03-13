package com.lyw.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbRecruitResumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbRecruitResumeExample() {
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

        public Criteria andDeliverIdIsNull() {
            addCriterion("deliver_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliverIdIsNotNull() {
            addCriterion("deliver_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverIdEqualTo(Integer value) {
            addCriterion("deliver_id =", value, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdNotEqualTo(Integer value) {
            addCriterion("deliver_id <>", value, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdGreaterThan(Integer value) {
            addCriterion("deliver_id >", value, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliver_id >=", value, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdLessThan(Integer value) {
            addCriterion("deliver_id <", value, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdLessThanOrEqualTo(Integer value) {
            addCriterion("deliver_id <=", value, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdIn(List<Integer> values) {
            addCriterion("deliver_id in", values, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdNotIn(List<Integer> values) {
            addCriterion("deliver_id not in", values, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdBetween(Integer value1, Integer value2) {
            addCriterion("deliver_id between", value1, value2, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("deliver_id not between", value1, value2, "deliverId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andResuIdIsNull() {
            addCriterion("resu_id is null");
            return (Criteria) this;
        }

        public Criteria andResuIdIsNotNull() {
            addCriterion("resu_id is not null");
            return (Criteria) this;
        }

        public Criteria andResuIdEqualTo(Integer value) {
            addCriterion("resu_id =", value, "resuId");
            return (Criteria) this;
        }

        public Criteria andResuIdNotEqualTo(Integer value) {
            addCriterion("resu_id <>", value, "resuId");
            return (Criteria) this;
        }

        public Criteria andResuIdGreaterThan(Integer value) {
            addCriterion("resu_id >", value, "resuId");
            return (Criteria) this;
        }

        public Criteria andResuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resu_id >=", value, "resuId");
            return (Criteria) this;
        }

        public Criteria andResuIdLessThan(Integer value) {
            addCriterion("resu_id <", value, "resuId");
            return (Criteria) this;
        }

        public Criteria andResuIdLessThanOrEqualTo(Integer value) {
            addCriterion("resu_id <=", value, "resuId");
            return (Criteria) this;
        }

        public Criteria andResuIdIn(List<Integer> values) {
            addCriterion("resu_id in", values, "resuId");
            return (Criteria) this;
        }

        public Criteria andResuIdNotIn(List<Integer> values) {
            addCriterion("resu_id not in", values, "resuId");
            return (Criteria) this;
        }

        public Criteria andResuIdBetween(Integer value1, Integer value2) {
            addCriterion("resu_id between", value1, value2, "resuId");
            return (Criteria) this;
        }

        public Criteria andResuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resu_id not between", value1, value2, "resuId");
            return (Criteria) this;
        }

        public Criteria andRecrIdIsNull() {
            addCriterion("recr_id is null");
            return (Criteria) this;
        }

        public Criteria andRecrIdIsNotNull() {
            addCriterion("recr_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecrIdEqualTo(Integer value) {
            addCriterion("recr_id =", value, "recrId");
            return (Criteria) this;
        }

        public Criteria andRecrIdNotEqualTo(Integer value) {
            addCriterion("recr_id <>", value, "recrId");
            return (Criteria) this;
        }

        public Criteria andRecrIdGreaterThan(Integer value) {
            addCriterion("recr_id >", value, "recrId");
            return (Criteria) this;
        }

        public Criteria andRecrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recr_id >=", value, "recrId");
            return (Criteria) this;
        }

        public Criteria andRecrIdLessThan(Integer value) {
            addCriterion("recr_id <", value, "recrId");
            return (Criteria) this;
        }

        public Criteria andRecrIdLessThanOrEqualTo(Integer value) {
            addCriterion("recr_id <=", value, "recrId");
            return (Criteria) this;
        }

        public Criteria andRecrIdIn(List<Integer> values) {
            addCriterion("recr_id in", values, "recrId");
            return (Criteria) this;
        }

        public Criteria andRecrIdNotIn(List<Integer> values) {
            addCriterion("recr_id not in", values, "recrId");
            return (Criteria) this;
        }

        public Criteria andRecrIdBetween(Integer value1, Integer value2) {
            addCriterion("recr_id between", value1, value2, "recrId");
            return (Criteria) this;
        }

        public Criteria andRecrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recr_id not between", value1, value2, "recrId");
            return (Criteria) this;
        }

        public Criteria andDeliverDateIsNull() {
            addCriterion("deliver_date is null");
            return (Criteria) this;
        }

        public Criteria andDeliverDateIsNotNull() {
            addCriterion("deliver_date is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverDateEqualTo(Date value) {
            addCriterion("deliver_date =", value, "deliverDate");
            return (Criteria) this;
        }

        public Criteria andDeliverDateNotEqualTo(Date value) {
            addCriterion("deliver_date <>", value, "deliverDate");
            return (Criteria) this;
        }

        public Criteria andDeliverDateGreaterThan(Date value) {
            addCriterion("deliver_date >", value, "deliverDate");
            return (Criteria) this;
        }

        public Criteria andDeliverDateGreaterThanOrEqualTo(Date value) {
            addCriterion("deliver_date >=", value, "deliverDate");
            return (Criteria) this;
        }

        public Criteria andDeliverDateLessThan(Date value) {
            addCriterion("deliver_date <", value, "deliverDate");
            return (Criteria) this;
        }

        public Criteria andDeliverDateLessThanOrEqualTo(Date value) {
            addCriterion("deliver_date <=", value, "deliverDate");
            return (Criteria) this;
        }

        public Criteria andDeliverDateIn(List<Date> values) {
            addCriterion("deliver_date in", values, "deliverDate");
            return (Criteria) this;
        }

        public Criteria andDeliverDateNotIn(List<Date> values) {
            addCriterion("deliver_date not in", values, "deliverDate");
            return (Criteria) this;
        }

        public Criteria andDeliverDateBetween(Date value1, Date value2) {
            addCriterion("deliver_date between", value1, value2, "deliverDate");
            return (Criteria) this;
        }

        public Criteria andDeliverDateNotBetween(Date value1, Date value2) {
            addCriterion("deliver_date not between", value1, value2, "deliverDate");
            return (Criteria) this;
        }

        public Criteria andDeliverStateIsNull() {
            addCriterion("deliver_state is null");
            return (Criteria) this;
        }

        public Criteria andDeliverStateIsNotNull() {
            addCriterion("deliver_state is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverStateEqualTo(Integer value) {
            addCriterion("deliver_state =", value, "deliverState");
            return (Criteria) this;
        }

        public Criteria andDeliverStateNotEqualTo(Integer value) {
            addCriterion("deliver_state <>", value, "deliverState");
            return (Criteria) this;
        }

        public Criteria andDeliverStateGreaterThan(Integer value) {
            addCriterion("deliver_state >", value, "deliverState");
            return (Criteria) this;
        }

        public Criteria andDeliverStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliver_state >=", value, "deliverState");
            return (Criteria) this;
        }

        public Criteria andDeliverStateLessThan(Integer value) {
            addCriterion("deliver_state <", value, "deliverState");
            return (Criteria) this;
        }

        public Criteria andDeliverStateLessThanOrEqualTo(Integer value) {
            addCriterion("deliver_state <=", value, "deliverState");
            return (Criteria) this;
        }

        public Criteria andDeliverStateIn(List<Integer> values) {
            addCriterion("deliver_state in", values, "deliverState");
            return (Criteria) this;
        }

        public Criteria andDeliverStateNotIn(List<Integer> values) {
            addCriterion("deliver_state not in", values, "deliverState");
            return (Criteria) this;
        }

        public Criteria andDeliverStateBetween(Integer value1, Integer value2) {
            addCriterion("deliver_state between", value1, value2, "deliverState");
            return (Criteria) this;
        }

        public Criteria andDeliverStateNotBetween(Integer value1, Integer value2) {
            addCriterion("deliver_state not between", value1, value2, "deliverState");
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