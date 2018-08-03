package com.lv.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScenicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicExample() {
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

        public Criteria andScenicNameIsNull() {
            addCriterion("scenic_name is null");
            return (Criteria) this;
        }

        public Criteria andScenicNameIsNotNull() {
            addCriterion("scenic_name is not null");
            return (Criteria) this;
        }

        public Criteria andScenicNameEqualTo(String value) {
            addCriterion("scenic_name =", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotEqualTo(String value) {
            addCriterion("scenic_name <>", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameGreaterThan(String value) {
            addCriterion("scenic_name >", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_name >=", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLessThan(String value) {
            addCriterion("scenic_name <", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLessThanOrEqualTo(String value) {
            addCriterion("scenic_name <=", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLike(String value) {
            addCriterion("scenic_name like", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotLike(String value) {
            addCriterion("scenic_name not like", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameIn(List<String> values) {
            addCriterion("scenic_name in", values, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotIn(List<String> values) {
            addCriterion("scenic_name not in", values, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameBetween(String value1, String value2) {
            addCriterion("scenic_name between", value1, value2, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotBetween(String value1, String value2) {
            addCriterion("scenic_name not between", value1, value2, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLongitudeIsNull() {
            addCriterion("scenic_geo_longitude is null");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLongitudeIsNotNull() {
            addCriterion("scenic_geo_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLongitudeEqualTo(String value) {
            addCriterion("scenic_geo_longitude =", value, "scenicGeoLongitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLongitudeNotEqualTo(String value) {
            addCriterion("scenic_geo_longitude <>", value, "scenicGeoLongitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLongitudeGreaterThan(String value) {
            addCriterion("scenic_geo_longitude >", value, "scenicGeoLongitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_geo_longitude >=", value, "scenicGeoLongitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLongitudeLessThan(String value) {
            addCriterion("scenic_geo_longitude <", value, "scenicGeoLongitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLongitudeLessThanOrEqualTo(String value) {
            addCriterion("scenic_geo_longitude <=", value, "scenicGeoLongitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLongitudeLike(String value) {
            addCriterion("scenic_geo_longitude like", value, "scenicGeoLongitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLongitudeNotLike(String value) {
            addCriterion("scenic_geo_longitude not like", value, "scenicGeoLongitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLongitudeIn(List<String> values) {
            addCriterion("scenic_geo_longitude in", values, "scenicGeoLongitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLongitudeNotIn(List<String> values) {
            addCriterion("scenic_geo_longitude not in", values, "scenicGeoLongitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLongitudeBetween(String value1, String value2) {
            addCriterion("scenic_geo_longitude between", value1, value2, "scenicGeoLongitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLongitudeNotBetween(String value1, String value2) {
            addCriterion("scenic_geo_longitude not between", value1, value2, "scenicGeoLongitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLatitudeIsNull() {
            addCriterion("scenic_geo_latitude is null");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLatitudeIsNotNull() {
            addCriterion("scenic_geo_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLatitudeEqualTo(String value) {
            addCriterion("scenic_geo_latitude =", value, "scenicGeoLatitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLatitudeNotEqualTo(String value) {
            addCriterion("scenic_geo_latitude <>", value, "scenicGeoLatitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLatitudeGreaterThan(String value) {
            addCriterion("scenic_geo_latitude >", value, "scenicGeoLatitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_geo_latitude >=", value, "scenicGeoLatitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLatitudeLessThan(String value) {
            addCriterion("scenic_geo_latitude <", value, "scenicGeoLatitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLatitudeLessThanOrEqualTo(String value) {
            addCriterion("scenic_geo_latitude <=", value, "scenicGeoLatitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLatitudeLike(String value) {
            addCriterion("scenic_geo_latitude like", value, "scenicGeoLatitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLatitudeNotLike(String value) {
            addCriterion("scenic_geo_latitude not like", value, "scenicGeoLatitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLatitudeIn(List<String> values) {
            addCriterion("scenic_geo_latitude in", values, "scenicGeoLatitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLatitudeNotIn(List<String> values) {
            addCriterion("scenic_geo_latitude not in", values, "scenicGeoLatitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLatitudeBetween(String value1, String value2) {
            addCriterion("scenic_geo_latitude between", value1, value2, "scenicGeoLatitude");
            return (Criteria) this;
        }

        public Criteria andScenicGeoLatitudeNotBetween(String value1, String value2) {
            addCriterion("scenic_geo_latitude not between", value1, value2, "scenicGeoLatitude");
            return (Criteria) this;
        }

        public Criteria andScenicLevelIsNull() {
            addCriterion("scenic_level is null");
            return (Criteria) this;
        }

        public Criteria andScenicLevelIsNotNull() {
            addCriterion("scenic_level is not null");
            return (Criteria) this;
        }

        public Criteria andScenicLevelEqualTo(String value) {
            addCriterion("scenic_level =", value, "scenicLevel");
            return (Criteria) this;
        }

        public Criteria andScenicLevelNotEqualTo(String value) {
            addCriterion("scenic_level <>", value, "scenicLevel");
            return (Criteria) this;
        }

        public Criteria andScenicLevelGreaterThan(String value) {
            addCriterion("scenic_level >", value, "scenicLevel");
            return (Criteria) this;
        }

        public Criteria andScenicLevelGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_level >=", value, "scenicLevel");
            return (Criteria) this;
        }

        public Criteria andScenicLevelLessThan(String value) {
            addCriterion("scenic_level <", value, "scenicLevel");
            return (Criteria) this;
        }

        public Criteria andScenicLevelLessThanOrEqualTo(String value) {
            addCriterion("scenic_level <=", value, "scenicLevel");
            return (Criteria) this;
        }

        public Criteria andScenicLevelLike(String value) {
            addCriterion("scenic_level like", value, "scenicLevel");
            return (Criteria) this;
        }

        public Criteria andScenicLevelNotLike(String value) {
            addCriterion("scenic_level not like", value, "scenicLevel");
            return (Criteria) this;
        }

        public Criteria andScenicLevelIn(List<String> values) {
            addCriterion("scenic_level in", values, "scenicLevel");
            return (Criteria) this;
        }

        public Criteria andScenicLevelNotIn(List<String> values) {
            addCriterion("scenic_level not in", values, "scenicLevel");
            return (Criteria) this;
        }

        public Criteria andScenicLevelBetween(String value1, String value2) {
            addCriterion("scenic_level between", value1, value2, "scenicLevel");
            return (Criteria) this;
        }

        public Criteria andScenicLevelNotBetween(String value1, String value2) {
            addCriterion("scenic_level not between", value1, value2, "scenicLevel");
            return (Criteria) this;
        }

        public Criteria andScenicAddressIsNull() {
            addCriterion("scenic_address is null");
            return (Criteria) this;
        }

        public Criteria andScenicAddressIsNotNull() {
            addCriterion("scenic_address is not null");
            return (Criteria) this;
        }

        public Criteria andScenicAddressEqualTo(String value) {
            addCriterion("scenic_address =", value, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressNotEqualTo(String value) {
            addCriterion("scenic_address <>", value, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressGreaterThan(String value) {
            addCriterion("scenic_address >", value, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_address >=", value, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressLessThan(String value) {
            addCriterion("scenic_address <", value, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressLessThanOrEqualTo(String value) {
            addCriterion("scenic_address <=", value, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressLike(String value) {
            addCriterion("scenic_address like", value, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressNotLike(String value) {
            addCriterion("scenic_address not like", value, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressIn(List<String> values) {
            addCriterion("scenic_address in", values, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressNotIn(List<String> values) {
            addCriterion("scenic_address not in", values, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressBetween(String value1, String value2) {
            addCriterion("scenic_address between", value1, value2, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressNotBetween(String value1, String value2) {
            addCriterion("scenic_address not between", value1, value2, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicPriceIsNull() {
            addCriterion("scenic_price is null");
            return (Criteria) this;
        }

        public Criteria andScenicPriceIsNotNull() {
            addCriterion("scenic_price is not null");
            return (Criteria) this;
        }

        public Criteria andScenicPriceEqualTo(BigDecimal value) {
            addCriterion("scenic_price =", value, "scenicPrice");
            return (Criteria) this;
        }

        public Criteria andScenicPriceNotEqualTo(BigDecimal value) {
            addCriterion("scenic_price <>", value, "scenicPrice");
            return (Criteria) this;
        }

        public Criteria andScenicPriceGreaterThan(BigDecimal value) {
            addCriterion("scenic_price >", value, "scenicPrice");
            return (Criteria) this;
        }

        public Criteria andScenicPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("scenic_price >=", value, "scenicPrice");
            return (Criteria) this;
        }

        public Criteria andScenicPriceLessThan(BigDecimal value) {
            addCriterion("scenic_price <", value, "scenicPrice");
            return (Criteria) this;
        }

        public Criteria andScenicPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("scenic_price <=", value, "scenicPrice");
            return (Criteria) this;
        }

        public Criteria andScenicPriceIn(List<BigDecimal> values) {
            addCriterion("scenic_price in", values, "scenicPrice");
            return (Criteria) this;
        }

        public Criteria andScenicPriceNotIn(List<BigDecimal> values) {
            addCriterion("scenic_price not in", values, "scenicPrice");
            return (Criteria) this;
        }

        public Criteria andScenicPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("scenic_price between", value1, value2, "scenicPrice");
            return (Criteria) this;
        }

        public Criteria andScenicPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("scenic_price not between", value1, value2, "scenicPrice");
            return (Criteria) this;
        }

        public Criteria andScenicViewTimeIsNull() {
            addCriterion("scenic_view_time is null");
            return (Criteria) this;
        }

        public Criteria andScenicViewTimeIsNotNull() {
            addCriterion("scenic_view_time is not null");
            return (Criteria) this;
        }

        public Criteria andScenicViewTimeEqualTo(Integer value) {
            addCriterion("scenic_view_time =", value, "scenicViewTime");
            return (Criteria) this;
        }

        public Criteria andScenicViewTimeNotEqualTo(Integer value) {
            addCriterion("scenic_view_time <>", value, "scenicViewTime");
            return (Criteria) this;
        }

        public Criteria andScenicViewTimeGreaterThan(Integer value) {
            addCriterion("scenic_view_time >", value, "scenicViewTime");
            return (Criteria) this;
        }

        public Criteria andScenicViewTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_view_time >=", value, "scenicViewTime");
            return (Criteria) this;
        }

        public Criteria andScenicViewTimeLessThan(Integer value) {
            addCriterion("scenic_view_time <", value, "scenicViewTime");
            return (Criteria) this;
        }

        public Criteria andScenicViewTimeLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_view_time <=", value, "scenicViewTime");
            return (Criteria) this;
        }

        public Criteria andScenicViewTimeIn(List<Integer> values) {
            addCriterion("scenic_view_time in", values, "scenicViewTime");
            return (Criteria) this;
        }

        public Criteria andScenicViewTimeNotIn(List<Integer> values) {
            addCriterion("scenic_view_time not in", values, "scenicViewTime");
            return (Criteria) this;
        }

        public Criteria andScenicViewTimeBetween(Integer value1, Integer value2) {
            addCriterion("scenic_view_time between", value1, value2, "scenicViewTime");
            return (Criteria) this;
        }

        public Criteria andScenicViewTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_view_time not between", value1, value2, "scenicViewTime");
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

        public Criteria andScenicImageIsNull() {
            addCriterion("scenic_image is null");
            return (Criteria) this;
        }

        public Criteria andScenicImageIsNotNull() {
            addCriterion("scenic_image is not null");
            return (Criteria) this;
        }

        public Criteria andScenicImageEqualTo(String value) {
            addCriterion("scenic_image =", value, "scenicImage");
            return (Criteria) this;
        }

        public Criteria andScenicImageNotEqualTo(String value) {
            addCriterion("scenic_image <>", value, "scenicImage");
            return (Criteria) this;
        }

        public Criteria andScenicImageGreaterThan(String value) {
            addCriterion("scenic_image >", value, "scenicImage");
            return (Criteria) this;
        }

        public Criteria andScenicImageGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_image >=", value, "scenicImage");
            return (Criteria) this;
        }

        public Criteria andScenicImageLessThan(String value) {
            addCriterion("scenic_image <", value, "scenicImage");
            return (Criteria) this;
        }

        public Criteria andScenicImageLessThanOrEqualTo(String value) {
            addCriterion("scenic_image <=", value, "scenicImage");
            return (Criteria) this;
        }

        public Criteria andScenicImageLike(String value) {
            addCriterion("scenic_image like", value, "scenicImage");
            return (Criteria) this;
        }

        public Criteria andScenicImageNotLike(String value) {
            addCriterion("scenic_image not like", value, "scenicImage");
            return (Criteria) this;
        }

        public Criteria andScenicImageIn(List<String> values) {
            addCriterion("scenic_image in", values, "scenicImage");
            return (Criteria) this;
        }

        public Criteria andScenicImageNotIn(List<String> values) {
            addCriterion("scenic_image not in", values, "scenicImage");
            return (Criteria) this;
        }

        public Criteria andScenicImageBetween(String value1, String value2) {
            addCriterion("scenic_image between", value1, value2, "scenicImage");
            return (Criteria) this;
        }

        public Criteria andScenicImageNotBetween(String value1, String value2) {
            addCriterion("scenic_image not between", value1, value2, "scenicImage");
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