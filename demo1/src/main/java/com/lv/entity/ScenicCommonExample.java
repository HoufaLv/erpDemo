package com.lv.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScenicCommonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicCommonExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andScenicIdIsNull() {
            addCriterion("scenic_id is null");
            return (Criteria) this;
        }

        public Criteria andScenicIdIsNotNull() {
            addCriterion("scenic_id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicIdEqualTo(Integer value) {
            addCriterion("scenic_id =", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotEqualTo(Integer value) {
            addCriterion("scenic_id <>", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThan(Integer value) {
            addCriterion("scenic_id >", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_id >=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThan(Integer value) {
            addCriterion("scenic_id <", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_id <=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdIn(List<Integer> values) {
            addCriterion("scenic_id in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotIn(List<Integer> values) {
            addCriterion("scenic_id not in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdBetween(Integer value1, Integer value2) {
            addCriterion("scenic_id between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_id not between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicCommonIsNull() {
            addCriterion("scenic_common is null");
            return (Criteria) this;
        }

        public Criteria andScenicCommonIsNotNull() {
            addCriterion("scenic_common is not null");
            return (Criteria) this;
        }

        public Criteria andScenicCommonEqualTo(String value) {
            addCriterion("scenic_common =", value, "scenicCommon");
            return (Criteria) this;
        }

        public Criteria andScenicCommonNotEqualTo(String value) {
            addCriterion("scenic_common <>", value, "scenicCommon");
            return (Criteria) this;
        }

        public Criteria andScenicCommonGreaterThan(String value) {
            addCriterion("scenic_common >", value, "scenicCommon");
            return (Criteria) this;
        }

        public Criteria andScenicCommonGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_common >=", value, "scenicCommon");
            return (Criteria) this;
        }

        public Criteria andScenicCommonLessThan(String value) {
            addCriterion("scenic_common <", value, "scenicCommon");
            return (Criteria) this;
        }

        public Criteria andScenicCommonLessThanOrEqualTo(String value) {
            addCriterion("scenic_common <=", value, "scenicCommon");
            return (Criteria) this;
        }

        public Criteria andScenicCommonLike(String value) {
            addCriterion("scenic_common like", value, "scenicCommon");
            return (Criteria) this;
        }

        public Criteria andScenicCommonNotLike(String value) {
            addCriterion("scenic_common not like", value, "scenicCommon");
            return (Criteria) this;
        }

        public Criteria andScenicCommonIn(List<String> values) {
            addCriterion("scenic_common in", values, "scenicCommon");
            return (Criteria) this;
        }

        public Criteria andScenicCommonNotIn(List<String> values) {
            addCriterion("scenic_common not in", values, "scenicCommon");
            return (Criteria) this;
        }

        public Criteria andScenicCommonBetween(String value1, String value2) {
            addCriterion("scenic_common between", value1, value2, "scenicCommon");
            return (Criteria) this;
        }

        public Criteria andScenicCommonNotBetween(String value1, String value2) {
            addCriterion("scenic_common not between", value1, value2, "scenicCommon");
            return (Criteria) this;
        }

        public Criteria andScenicCommonPicIsNull() {
            addCriterion("scenic_common_pic is null");
            return (Criteria) this;
        }

        public Criteria andScenicCommonPicIsNotNull() {
            addCriterion("scenic_common_pic is not null");
            return (Criteria) this;
        }

        public Criteria andScenicCommonPicEqualTo(String value) {
            addCriterion("scenic_common_pic =", value, "scenicCommonPic");
            return (Criteria) this;
        }

        public Criteria andScenicCommonPicNotEqualTo(String value) {
            addCriterion("scenic_common_pic <>", value, "scenicCommonPic");
            return (Criteria) this;
        }

        public Criteria andScenicCommonPicGreaterThan(String value) {
            addCriterion("scenic_common_pic >", value, "scenicCommonPic");
            return (Criteria) this;
        }

        public Criteria andScenicCommonPicGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_common_pic >=", value, "scenicCommonPic");
            return (Criteria) this;
        }

        public Criteria andScenicCommonPicLessThan(String value) {
            addCriterion("scenic_common_pic <", value, "scenicCommonPic");
            return (Criteria) this;
        }

        public Criteria andScenicCommonPicLessThanOrEqualTo(String value) {
            addCriterion("scenic_common_pic <=", value, "scenicCommonPic");
            return (Criteria) this;
        }

        public Criteria andScenicCommonPicLike(String value) {
            addCriterion("scenic_common_pic like", value, "scenicCommonPic");
            return (Criteria) this;
        }

        public Criteria andScenicCommonPicNotLike(String value) {
            addCriterion("scenic_common_pic not like", value, "scenicCommonPic");
            return (Criteria) this;
        }

        public Criteria andScenicCommonPicIn(List<String> values) {
            addCriterion("scenic_common_pic in", values, "scenicCommonPic");
            return (Criteria) this;
        }

        public Criteria andScenicCommonPicNotIn(List<String> values) {
            addCriterion("scenic_common_pic not in", values, "scenicCommonPic");
            return (Criteria) this;
        }

        public Criteria andScenicCommonPicBetween(String value1, String value2) {
            addCriterion("scenic_common_pic between", value1, value2, "scenicCommonPic");
            return (Criteria) this;
        }

        public Criteria andScenicCommonPicNotBetween(String value1, String value2) {
            addCriterion("scenic_common_pic not between", value1, value2, "scenicCommonPic");
            return (Criteria) this;
        }

        public Criteria andScenicCommonStartIsNull() {
            addCriterion("scenic_common_start is null");
            return (Criteria) this;
        }

        public Criteria andScenicCommonStartIsNotNull() {
            addCriterion("scenic_common_start is not null");
            return (Criteria) this;
        }

        public Criteria andScenicCommonStartEqualTo(String value) {
            addCriterion("scenic_common_start =", value, "scenicCommonStart");
            return (Criteria) this;
        }

        public Criteria andScenicCommonStartNotEqualTo(String value) {
            addCriterion("scenic_common_start <>", value, "scenicCommonStart");
            return (Criteria) this;
        }

        public Criteria andScenicCommonStartGreaterThan(String value) {
            addCriterion("scenic_common_start >", value, "scenicCommonStart");
            return (Criteria) this;
        }

        public Criteria andScenicCommonStartGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_common_start >=", value, "scenicCommonStart");
            return (Criteria) this;
        }

        public Criteria andScenicCommonStartLessThan(String value) {
            addCriterion("scenic_common_start <", value, "scenicCommonStart");
            return (Criteria) this;
        }

        public Criteria andScenicCommonStartLessThanOrEqualTo(String value) {
            addCriterion("scenic_common_start <=", value, "scenicCommonStart");
            return (Criteria) this;
        }

        public Criteria andScenicCommonStartLike(String value) {
            addCriterion("scenic_common_start like", value, "scenicCommonStart");
            return (Criteria) this;
        }

        public Criteria andScenicCommonStartNotLike(String value) {
            addCriterion("scenic_common_start not like", value, "scenicCommonStart");
            return (Criteria) this;
        }

        public Criteria andScenicCommonStartIn(List<String> values) {
            addCriterion("scenic_common_start in", values, "scenicCommonStart");
            return (Criteria) this;
        }

        public Criteria andScenicCommonStartNotIn(List<String> values) {
            addCriterion("scenic_common_start not in", values, "scenicCommonStart");
            return (Criteria) this;
        }

        public Criteria andScenicCommonStartBetween(String value1, String value2) {
            addCriterion("scenic_common_start between", value1, value2, "scenicCommonStart");
            return (Criteria) this;
        }

        public Criteria andScenicCommonStartNotBetween(String value1, String value2) {
            addCriterion("scenic_common_start not between", value1, value2, "scenicCommonStart");
            return (Criteria) this;
        }

        public Criteria andScenicCreateTimeIsNull() {
            addCriterion("scenic_create_time is null");
            return (Criteria) this;
        }

        public Criteria andScenicCreateTimeIsNotNull() {
            addCriterion("scenic_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andScenicCreateTimeEqualTo(Date value) {
            addCriterion("scenic_create_time =", value, "scenicCreateTime");
            return (Criteria) this;
        }

        public Criteria andScenicCreateTimeNotEqualTo(Date value) {
            addCriterion("scenic_create_time <>", value, "scenicCreateTime");
            return (Criteria) this;
        }

        public Criteria andScenicCreateTimeGreaterThan(Date value) {
            addCriterion("scenic_create_time >", value, "scenicCreateTime");
            return (Criteria) this;
        }

        public Criteria andScenicCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("scenic_create_time >=", value, "scenicCreateTime");
            return (Criteria) this;
        }

        public Criteria andScenicCreateTimeLessThan(Date value) {
            addCriterion("scenic_create_time <", value, "scenicCreateTime");
            return (Criteria) this;
        }

        public Criteria andScenicCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("scenic_create_time <=", value, "scenicCreateTime");
            return (Criteria) this;
        }

        public Criteria andScenicCreateTimeIn(List<Date> values) {
            addCriterion("scenic_create_time in", values, "scenicCreateTime");
            return (Criteria) this;
        }

        public Criteria andScenicCreateTimeNotIn(List<Date> values) {
            addCriterion("scenic_create_time not in", values, "scenicCreateTime");
            return (Criteria) this;
        }

        public Criteria andScenicCreateTimeBetween(Date value1, Date value2) {
            addCriterion("scenic_create_time between", value1, value2, "scenicCreateTime");
            return (Criteria) this;
        }

        public Criteria andScenicCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("scenic_create_time not between", value1, value2, "scenicCreateTime");
            return (Criteria) this;
        }

        public Criteria andScenicUpdateTimeIsNull() {
            addCriterion("scenic_update_time is null");
            return (Criteria) this;
        }

        public Criteria andScenicUpdateTimeIsNotNull() {
            addCriterion("scenic_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andScenicUpdateTimeEqualTo(Date value) {
            addCriterion("scenic_update_time =", value, "scenicUpdateTime");
            return (Criteria) this;
        }

        public Criteria andScenicUpdateTimeNotEqualTo(Date value) {
            addCriterion("scenic_update_time <>", value, "scenicUpdateTime");
            return (Criteria) this;
        }

        public Criteria andScenicUpdateTimeGreaterThan(Date value) {
            addCriterion("scenic_update_time >", value, "scenicUpdateTime");
            return (Criteria) this;
        }

        public Criteria andScenicUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("scenic_update_time >=", value, "scenicUpdateTime");
            return (Criteria) this;
        }

        public Criteria andScenicUpdateTimeLessThan(Date value) {
            addCriterion("scenic_update_time <", value, "scenicUpdateTime");
            return (Criteria) this;
        }

        public Criteria andScenicUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("scenic_update_time <=", value, "scenicUpdateTime");
            return (Criteria) this;
        }

        public Criteria andScenicUpdateTimeIn(List<Date> values) {
            addCriterion("scenic_update_time in", values, "scenicUpdateTime");
            return (Criteria) this;
        }

        public Criteria andScenicUpdateTimeNotIn(List<Date> values) {
            addCriterion("scenic_update_time not in", values, "scenicUpdateTime");
            return (Criteria) this;
        }

        public Criteria andScenicUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("scenic_update_time between", value1, value2, "scenicUpdateTime");
            return (Criteria) this;
        }

        public Criteria andScenicUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("scenic_update_time not between", value1, value2, "scenicUpdateTime");
            return (Criteria) this;
        }

        public Criteria andScenicStateIsNull() {
            addCriterion("scenic_state is null");
            return (Criteria) this;
        }

        public Criteria andScenicStateIsNotNull() {
            addCriterion("scenic_state is not null");
            return (Criteria) this;
        }

        public Criteria andScenicStateEqualTo(String value) {
            addCriterion("scenic_state =", value, "scenicState");
            return (Criteria) this;
        }

        public Criteria andScenicStateNotEqualTo(String value) {
            addCriterion("scenic_state <>", value, "scenicState");
            return (Criteria) this;
        }

        public Criteria andScenicStateGreaterThan(String value) {
            addCriterion("scenic_state >", value, "scenicState");
            return (Criteria) this;
        }

        public Criteria andScenicStateGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_state >=", value, "scenicState");
            return (Criteria) this;
        }

        public Criteria andScenicStateLessThan(String value) {
            addCriterion("scenic_state <", value, "scenicState");
            return (Criteria) this;
        }

        public Criteria andScenicStateLessThanOrEqualTo(String value) {
            addCriterion("scenic_state <=", value, "scenicState");
            return (Criteria) this;
        }

        public Criteria andScenicStateLike(String value) {
            addCriterion("scenic_state like", value, "scenicState");
            return (Criteria) this;
        }

        public Criteria andScenicStateNotLike(String value) {
            addCriterion("scenic_state not like", value, "scenicState");
            return (Criteria) this;
        }

        public Criteria andScenicStateIn(List<String> values) {
            addCriterion("scenic_state in", values, "scenicState");
            return (Criteria) this;
        }

        public Criteria andScenicStateNotIn(List<String> values) {
            addCriterion("scenic_state not in", values, "scenicState");
            return (Criteria) this;
        }

        public Criteria andScenicStateBetween(String value1, String value2) {
            addCriterion("scenic_state between", value1, value2, "scenicState");
            return (Criteria) this;
        }

        public Criteria andScenicStateNotBetween(String value1, String value2) {
            addCriterion("scenic_state not between", value1, value2, "scenicState");
            return (Criteria) this;
        }
    }

    /**
     */
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