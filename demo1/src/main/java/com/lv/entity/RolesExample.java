package com.lv.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RolesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RolesExample() {
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

        public Criteria andRolesNameIsNull() {
            addCriterion("roles_name is null");
            return (Criteria) this;
        }

        public Criteria andRolesNameIsNotNull() {
            addCriterion("roles_name is not null");
            return (Criteria) this;
        }

        public Criteria andRolesNameEqualTo(String value) {
            addCriterion("roles_name =", value, "rolesName");
            return (Criteria) this;
        }

        public Criteria andRolesNameNotEqualTo(String value) {
            addCriterion("roles_name <>", value, "rolesName");
            return (Criteria) this;
        }

        public Criteria andRolesNameGreaterThan(String value) {
            addCriterion("roles_name >", value, "rolesName");
            return (Criteria) this;
        }

        public Criteria andRolesNameGreaterThanOrEqualTo(String value) {
            addCriterion("roles_name >=", value, "rolesName");
            return (Criteria) this;
        }

        public Criteria andRolesNameLessThan(String value) {
            addCriterion("roles_name <", value, "rolesName");
            return (Criteria) this;
        }

        public Criteria andRolesNameLessThanOrEqualTo(String value) {
            addCriterion("roles_name <=", value, "rolesName");
            return (Criteria) this;
        }

        public Criteria andRolesNameLike(String value) {
            addCriterion("roles_name like", value, "rolesName");
            return (Criteria) this;
        }

        public Criteria andRolesNameNotLike(String value) {
            addCriterion("roles_name not like", value, "rolesName");
            return (Criteria) this;
        }

        public Criteria andRolesNameIn(List<String> values) {
            addCriterion("roles_name in", values, "rolesName");
            return (Criteria) this;
        }

        public Criteria andRolesNameNotIn(List<String> values) {
            addCriterion("roles_name not in", values, "rolesName");
            return (Criteria) this;
        }

        public Criteria andRolesNameBetween(String value1, String value2) {
            addCriterion("roles_name between", value1, value2, "rolesName");
            return (Criteria) this;
        }

        public Criteria andRolesNameNotBetween(String value1, String value2) {
            addCriterion("roles_name not between", value1, value2, "rolesName");
            return (Criteria) this;
        }

        public Criteria andRolesCodeIsNull() {
            addCriterion("roles_code is null");
            return (Criteria) this;
        }

        public Criteria andRolesCodeIsNotNull() {
            addCriterion("roles_code is not null");
            return (Criteria) this;
        }

        public Criteria andRolesCodeEqualTo(String value) {
            addCriterion("roles_code =", value, "rolesCode");
            return (Criteria) this;
        }

        public Criteria andRolesCodeNotEqualTo(String value) {
            addCriterion("roles_code <>", value, "rolesCode");
            return (Criteria) this;
        }

        public Criteria andRolesCodeGreaterThan(String value) {
            addCriterion("roles_code >", value, "rolesCode");
            return (Criteria) this;
        }

        public Criteria andRolesCodeGreaterThanOrEqualTo(String value) {
            addCriterion("roles_code >=", value, "rolesCode");
            return (Criteria) this;
        }

        public Criteria andRolesCodeLessThan(String value) {
            addCriterion("roles_code <", value, "rolesCode");
            return (Criteria) this;
        }

        public Criteria andRolesCodeLessThanOrEqualTo(String value) {
            addCriterion("roles_code <=", value, "rolesCode");
            return (Criteria) this;
        }

        public Criteria andRolesCodeLike(String value) {
            addCriterion("roles_code like", value, "rolesCode");
            return (Criteria) this;
        }

        public Criteria andRolesCodeNotLike(String value) {
            addCriterion("roles_code not like", value, "rolesCode");
            return (Criteria) this;
        }

        public Criteria andRolesCodeIn(List<String> values) {
            addCriterion("roles_code in", values, "rolesCode");
            return (Criteria) this;
        }

        public Criteria andRolesCodeNotIn(List<String> values) {
            addCriterion("roles_code not in", values, "rolesCode");
            return (Criteria) this;
        }

        public Criteria andRolesCodeBetween(String value1, String value2) {
            addCriterion("roles_code between", value1, value2, "rolesCode");
            return (Criteria) this;
        }

        public Criteria andRolesCodeNotBetween(String value1, String value2) {
            addCriterion("roles_code not between", value1, value2, "rolesCode");
            return (Criteria) this;
        }

        public Criteria andRolesCreateTimeIsNull() {
            addCriterion("roles_create_time is null");
            return (Criteria) this;
        }

        public Criteria andRolesCreateTimeIsNotNull() {
            addCriterion("roles_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andRolesCreateTimeEqualTo(Date value) {
            addCriterion("roles_create_time =", value, "rolesCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolesCreateTimeNotEqualTo(Date value) {
            addCriterion("roles_create_time <>", value, "rolesCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolesCreateTimeGreaterThan(Date value) {
            addCriterion("roles_create_time >", value, "rolesCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolesCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("roles_create_time >=", value, "rolesCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolesCreateTimeLessThan(Date value) {
            addCriterion("roles_create_time <", value, "rolesCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolesCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("roles_create_time <=", value, "rolesCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolesCreateTimeIn(List<Date> values) {
            addCriterion("roles_create_time in", values, "rolesCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolesCreateTimeNotIn(List<Date> values) {
            addCriterion("roles_create_time not in", values, "rolesCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolesCreateTimeBetween(Date value1, Date value2) {
            addCriterion("roles_create_time between", value1, value2, "rolesCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolesCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("roles_create_time not between", value1, value2, "rolesCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolesUpdateTimeIsNull() {
            addCriterion("roles_update_time is null");
            return (Criteria) this;
        }

        public Criteria andRolesUpdateTimeIsNotNull() {
            addCriterion("roles_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andRolesUpdateTimeEqualTo(Date value) {
            addCriterion("roles_update_time =", value, "rolesUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRolesUpdateTimeNotEqualTo(Date value) {
            addCriterion("roles_update_time <>", value, "rolesUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRolesUpdateTimeGreaterThan(Date value) {
            addCriterion("roles_update_time >", value, "rolesUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRolesUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("roles_update_time >=", value, "rolesUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRolesUpdateTimeLessThan(Date value) {
            addCriterion("roles_update_time <", value, "rolesUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRolesUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("roles_update_time <=", value, "rolesUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRolesUpdateTimeIn(List<Date> values) {
            addCriterion("roles_update_time in", values, "rolesUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRolesUpdateTimeNotIn(List<Date> values) {
            addCriterion("roles_update_time not in", values, "rolesUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRolesUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("roles_update_time between", value1, value2, "rolesUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRolesUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("roles_update_time not between", value1, value2, "rolesUpdateTime");
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