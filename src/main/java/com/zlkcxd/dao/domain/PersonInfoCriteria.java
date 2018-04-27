package com.zlkcxd.dao.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PersonInfoCriteria {
    /**
     * person_info表的操作属性:orderByClause
     * 
     */
    protected String orderByClause;

    /**
     * person_info表的操作属性:start
     * 
     */
    protected int start;

    /**
     * person_info表的操作属性:limit
     * 
     */
    protected int limit;

    /**
     * person_info表的操作属性:distinct
     * 
     */
    protected boolean distinct;

    /**
     * person_info表的操作属性:oredCriteria
     * 
     */
    protected List<Criteria> oredCriteria;

    /**
     * person_info数据表的操作方法: PersonInfoCriteria  
     * 
     */
    public PersonInfoCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * person_info数据表的操作方法: setOrderByClause  
     * 
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * person_info数据表的操作方法: getOrderByClause  
     * 
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * person_info数据表的操作方法: setStart  
     * 
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * person_info数据表的操作方法: getStart  
     * 
     */
    public int getStart() {
        return start;
    }

    /**
     * person_info数据表的操作方法: setLimit  
     * 
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * person_info数据表的操作方法: getLimit  
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * person_info数据表的操作方法: setDistinct  
     * 
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * person_info数据表的操作方法: isDistinct  
     * 
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * person_info数据表的操作方法: getOredCriteria  
     * 
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * person_info数据表的操作方法: or  
     * 
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * person_info数据表的操作方法: or  
     * 
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * person_info数据表的操作方法: createCriteria  
     * 
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * person_info数据表的操作方法: createCriteriaInternal  
     * 
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * person_info数据表的操作方法: clear  
     * 
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * person_info表的操作类
     * 
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNull() {
            addCriterion("person_name is null");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNotNull() {
            addCriterion("person_name is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNameEqualTo(String value) {
            addCriterion("person_name =", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotEqualTo(String value) {
            addCriterion("person_name <>", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThan(String value) {
            addCriterion("person_name >", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("person_name >=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThan(String value) {
            addCriterion("person_name <", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThanOrEqualTo(String value) {
            addCriterion("person_name <=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLike(String value) {
            addCriterion("person_name like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotLike(String value) {
            addCriterion("person_name not like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameIn(List<String> values) {
            addCriterion("person_name in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotIn(List<String> values) {
            addCriterion("person_name not in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameBetween(String value1, String value2) {
            addCriterion("person_name between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotBetween(String value1, String value2) {
            addCriterion("person_name not between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andMobileNo1IsNull() {
            addCriterion("mobile_no1 is null");
            return (Criteria) this;
        }

        public Criteria andMobileNo1IsNotNull() {
            addCriterion("mobile_no1 is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNo1EqualTo(String value) {
            addCriterion("mobile_no1 =", value, "mobileNo1");
            return (Criteria) this;
        }

        public Criteria andMobileNo1NotEqualTo(String value) {
            addCriterion("mobile_no1 <>", value, "mobileNo1");
            return (Criteria) this;
        }

        public Criteria andMobileNo1GreaterThan(String value) {
            addCriterion("mobile_no1 >", value, "mobileNo1");
            return (Criteria) this;
        }

        public Criteria andMobileNo1GreaterThanOrEqualTo(String value) {
            addCriterion("mobile_no1 >=", value, "mobileNo1");
            return (Criteria) this;
        }

        public Criteria andMobileNo1LessThan(String value) {
            addCriterion("mobile_no1 <", value, "mobileNo1");
            return (Criteria) this;
        }

        public Criteria andMobileNo1LessThanOrEqualTo(String value) {
            addCriterion("mobile_no1 <=", value, "mobileNo1");
            return (Criteria) this;
        }

        public Criteria andMobileNo1Like(String value) {
            addCriterion("mobile_no1 like", value, "mobileNo1");
            return (Criteria) this;
        }

        public Criteria andMobileNo1NotLike(String value) {
            addCriterion("mobile_no1 not like", value, "mobileNo1");
            return (Criteria) this;
        }

        public Criteria andMobileNo1In(List<String> values) {
            addCriterion("mobile_no1 in", values, "mobileNo1");
            return (Criteria) this;
        }

        public Criteria andMobileNo1NotIn(List<String> values) {
            addCriterion("mobile_no1 not in", values, "mobileNo1");
            return (Criteria) this;
        }

        public Criteria andMobileNo1Between(String value1, String value2) {
            addCriterion("mobile_no1 between", value1, value2, "mobileNo1");
            return (Criteria) this;
        }

        public Criteria andMobileNo1NotBetween(String value1, String value2) {
            addCriterion("mobile_no1 not between", value1, value2, "mobileNo1");
            return (Criteria) this;
        }

        public Criteria andMobileNo2IsNull() {
            addCriterion("mobile_no2 is null");
            return (Criteria) this;
        }

        public Criteria andMobileNo2IsNotNull() {
            addCriterion("mobile_no2 is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNo2EqualTo(String value) {
            addCriterion("mobile_no2 =", value, "mobileNo2");
            return (Criteria) this;
        }

        public Criteria andMobileNo2NotEqualTo(String value) {
            addCriterion("mobile_no2 <>", value, "mobileNo2");
            return (Criteria) this;
        }

        public Criteria andMobileNo2GreaterThan(String value) {
            addCriterion("mobile_no2 >", value, "mobileNo2");
            return (Criteria) this;
        }

        public Criteria andMobileNo2GreaterThanOrEqualTo(String value) {
            addCriterion("mobile_no2 >=", value, "mobileNo2");
            return (Criteria) this;
        }

        public Criteria andMobileNo2LessThan(String value) {
            addCriterion("mobile_no2 <", value, "mobileNo2");
            return (Criteria) this;
        }

        public Criteria andMobileNo2LessThanOrEqualTo(String value) {
            addCriterion("mobile_no2 <=", value, "mobileNo2");
            return (Criteria) this;
        }

        public Criteria andMobileNo2Like(String value) {
            addCriterion("mobile_no2 like", value, "mobileNo2");
            return (Criteria) this;
        }

        public Criteria andMobileNo2NotLike(String value) {
            addCriterion("mobile_no2 not like", value, "mobileNo2");
            return (Criteria) this;
        }

        public Criteria andMobileNo2In(List<String> values) {
            addCriterion("mobile_no2 in", values, "mobileNo2");
            return (Criteria) this;
        }

        public Criteria andMobileNo2NotIn(List<String> values) {
            addCriterion("mobile_no2 not in", values, "mobileNo2");
            return (Criteria) this;
        }

        public Criteria andMobileNo2Between(String value1, String value2) {
            addCriterion("mobile_no2 between", value1, value2, "mobileNo2");
            return (Criteria) this;
        }

        public Criteria andMobileNo2NotBetween(String value1, String value2) {
            addCriterion("mobile_no2 not between", value1, value2, "mobileNo2");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIsNull() {
            addCriterion("date_of_birth is null");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIsNotNull() {
            addCriterion("date_of_birth is not null");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_birth =", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_birth <>", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("date_of_birth >", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_birth >=", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthLessThan(Date value) {
            addCriterionForJDBCDate("date_of_birth <", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_birth <=", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIn(List<Date> values) {
            addCriterionForJDBCDate("date_of_birth in", values, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("date_of_birth not in", values, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_of_birth between", value1, value2, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_of_birth not between", value1, value2, "dateOfBirth");
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

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andPersonalYearIncomeIsNull() {
            addCriterion("personal_year_income is null");
            return (Criteria) this;
        }

        public Criteria andPersonalYearIncomeIsNotNull() {
            addCriterion("personal_year_income is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalYearIncomeEqualTo(String value) {
            addCriterion("personal_year_income =", value, "personalYearIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalYearIncomeNotEqualTo(String value) {
            addCriterion("personal_year_income <>", value, "personalYearIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalYearIncomeGreaterThan(String value) {
            addCriterion("personal_year_income >", value, "personalYearIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalYearIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("personal_year_income >=", value, "personalYearIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalYearIncomeLessThan(String value) {
            addCriterion("personal_year_income <", value, "personalYearIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalYearIncomeLessThanOrEqualTo(String value) {
            addCriterion("personal_year_income <=", value, "personalYearIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalYearIncomeLike(String value) {
            addCriterion("personal_year_income like", value, "personalYearIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalYearIncomeNotLike(String value) {
            addCriterion("personal_year_income not like", value, "personalYearIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalYearIncomeIn(List<String> values) {
            addCriterion("personal_year_income in", values, "personalYearIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalYearIncomeNotIn(List<String> values) {
            addCriterion("personal_year_income not in", values, "personalYearIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalYearIncomeBetween(String value1, String value2) {
            addCriterion("personal_year_income between", value1, value2, "personalYearIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalYearIncomeNotBetween(String value1, String value2) {
            addCriterion("personal_year_income not between", value1, value2, "personalYearIncome");
            return (Criteria) this;
        }

        public Criteria andPersonMonthIncomeIsNull() {
            addCriterion("person_month_income is null");
            return (Criteria) this;
        }

        public Criteria andPersonMonthIncomeIsNotNull() {
            addCriterion("person_month_income is not null");
            return (Criteria) this;
        }

        public Criteria andPersonMonthIncomeEqualTo(String value) {
            addCriterion("person_month_income =", value, "personMonthIncome");
            return (Criteria) this;
        }

        public Criteria andPersonMonthIncomeNotEqualTo(String value) {
            addCriterion("person_month_income <>", value, "personMonthIncome");
            return (Criteria) this;
        }

        public Criteria andPersonMonthIncomeGreaterThan(String value) {
            addCriterion("person_month_income >", value, "personMonthIncome");
            return (Criteria) this;
        }

        public Criteria andPersonMonthIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("person_month_income >=", value, "personMonthIncome");
            return (Criteria) this;
        }

        public Criteria andPersonMonthIncomeLessThan(String value) {
            addCriterion("person_month_income <", value, "personMonthIncome");
            return (Criteria) this;
        }

        public Criteria andPersonMonthIncomeLessThanOrEqualTo(String value) {
            addCriterion("person_month_income <=", value, "personMonthIncome");
            return (Criteria) this;
        }

        public Criteria andPersonMonthIncomeLike(String value) {
            addCriterion("person_month_income like", value, "personMonthIncome");
            return (Criteria) this;
        }

        public Criteria andPersonMonthIncomeNotLike(String value) {
            addCriterion("person_month_income not like", value, "personMonthIncome");
            return (Criteria) this;
        }

        public Criteria andPersonMonthIncomeIn(List<String> values) {
            addCriterion("person_month_income in", values, "personMonthIncome");
            return (Criteria) this;
        }

        public Criteria andPersonMonthIncomeNotIn(List<String> values) {
            addCriterion("person_month_income not in", values, "personMonthIncome");
            return (Criteria) this;
        }

        public Criteria andPersonMonthIncomeBetween(String value1, String value2) {
            addCriterion("person_month_income between", value1, value2, "personMonthIncome");
            return (Criteria) this;
        }

        public Criteria andPersonMonthIncomeNotBetween(String value1, String value2) {
            addCriterion("person_month_income not between", value1, value2, "personMonthIncome");
            return (Criteria) this;
        }

        public Criteria andHasChildrenIsNull() {
            addCriterion("has_children is null");
            return (Criteria) this;
        }

        public Criteria andHasChildrenIsNotNull() {
            addCriterion("has_children is not null");
            return (Criteria) this;
        }

        public Criteria andHasChildrenEqualTo(String value) {
            addCriterion("has_children =", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenNotEqualTo(String value) {
            addCriterion("has_children <>", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenGreaterThan(String value) {
            addCriterion("has_children >", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenGreaterThanOrEqualTo(String value) {
            addCriterion("has_children >=", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenLessThan(String value) {
            addCriterion("has_children <", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenLessThanOrEqualTo(String value) {
            addCriterion("has_children <=", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenLike(String value) {
            addCriterion("has_children like", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenNotLike(String value) {
            addCriterion("has_children not like", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenIn(List<String> values) {
            addCriterion("has_children in", values, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenNotIn(List<String> values) {
            addCriterion("has_children not in", values, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenBetween(String value1, String value2) {
            addCriterion("has_children between", value1, value2, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenNotBetween(String value1, String value2) {
            addCriterion("has_children not between", value1, value2, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andNationalIsNull() {
            addCriterion("national is null");
            return (Criteria) this;
        }

        public Criteria andNationalIsNotNull() {
            addCriterion("national is not null");
            return (Criteria) this;
        }

        public Criteria andNationalEqualTo(String value) {
            addCriterion("national =", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotEqualTo(String value) {
            addCriterion("national <>", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalGreaterThan(String value) {
            addCriterion("national >", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalGreaterThanOrEqualTo(String value) {
            addCriterion("national >=", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLessThan(String value) {
            addCriterion("national <", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLessThanOrEqualTo(String value) {
            addCriterion("national <=", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLike(String value) {
            addCriterion("national like", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotLike(String value) {
            addCriterion("national not like", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalIn(List<String> values) {
            addCriterion("national in", values, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotIn(List<String> values) {
            addCriterion("national not in", values, "national");
            return (Criteria) this;
        }

        public Criteria andNationalBetween(String value1, String value2) {
            addCriterion("national between", value1, value2, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotBetween(String value1, String value2) {
            addCriterion("national not between", value1, value2, "national");
            return (Criteria) this;
        }

        public Criteria andMartialStatusIsNull() {
            addCriterion("martial_status is null");
            return (Criteria) this;
        }

        public Criteria andMartialStatusIsNotNull() {
            addCriterion("martial_status is not null");
            return (Criteria) this;
        }

        public Criteria andMartialStatusEqualTo(String value) {
            addCriterion("martial_status =", value, "martialStatus");
            return (Criteria) this;
        }

        public Criteria andMartialStatusNotEqualTo(String value) {
            addCriterion("martial_status <>", value, "martialStatus");
            return (Criteria) this;
        }

        public Criteria andMartialStatusGreaterThan(String value) {
            addCriterion("martial_status >", value, "martialStatus");
            return (Criteria) this;
        }

        public Criteria andMartialStatusGreaterThanOrEqualTo(String value) {
            addCriterion("martial_status >=", value, "martialStatus");
            return (Criteria) this;
        }

        public Criteria andMartialStatusLessThan(String value) {
            addCriterion("martial_status <", value, "martialStatus");
            return (Criteria) this;
        }

        public Criteria andMartialStatusLessThanOrEqualTo(String value) {
            addCriterion("martial_status <=", value, "martialStatus");
            return (Criteria) this;
        }

        public Criteria andMartialStatusLike(String value) {
            addCriterion("martial_status like", value, "martialStatus");
            return (Criteria) this;
        }

        public Criteria andMartialStatusNotLike(String value) {
            addCriterion("martial_status not like", value, "martialStatus");
            return (Criteria) this;
        }

        public Criteria andMartialStatusIn(List<String> values) {
            addCriterion("martial_status in", values, "martialStatus");
            return (Criteria) this;
        }

        public Criteria andMartialStatusNotIn(List<String> values) {
            addCriterion("martial_status not in", values, "martialStatus");
            return (Criteria) this;
        }

        public Criteria andMartialStatusBetween(String value1, String value2) {
            addCriterion("martial_status between", value1, value2, "martialStatus");
            return (Criteria) this;
        }

        public Criteria andMartialStatusNotBetween(String value1, String value2) {
            addCriterion("martial_status not between", value1, value2, "martialStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Long value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Long value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Long value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Long value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Long> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Long> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Long value1, Long value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andOftenLiveAddressIsNull() {
            addCriterion("often_live_address is null");
            return (Criteria) this;
        }

        public Criteria andOftenLiveAddressIsNotNull() {
            addCriterion("often_live_address is not null");
            return (Criteria) this;
        }

        public Criteria andOftenLiveAddressEqualTo(String value) {
            addCriterion("often_live_address =", value, "oftenLiveAddress");
            return (Criteria) this;
        }

        public Criteria andOftenLiveAddressNotEqualTo(String value) {
            addCriterion("often_live_address <>", value, "oftenLiveAddress");
            return (Criteria) this;
        }

        public Criteria andOftenLiveAddressGreaterThan(String value) {
            addCriterion("often_live_address >", value, "oftenLiveAddress");
            return (Criteria) this;
        }

        public Criteria andOftenLiveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("often_live_address >=", value, "oftenLiveAddress");
            return (Criteria) this;
        }

        public Criteria andOftenLiveAddressLessThan(String value) {
            addCriterion("often_live_address <", value, "oftenLiveAddress");
            return (Criteria) this;
        }

        public Criteria andOftenLiveAddressLessThanOrEqualTo(String value) {
            addCriterion("often_live_address <=", value, "oftenLiveAddress");
            return (Criteria) this;
        }

        public Criteria andOftenLiveAddressLike(String value) {
            addCriterion("often_live_address like", value, "oftenLiveAddress");
            return (Criteria) this;
        }

        public Criteria andOftenLiveAddressNotLike(String value) {
            addCriterion("often_live_address not like", value, "oftenLiveAddress");
            return (Criteria) this;
        }

        public Criteria andOftenLiveAddressIn(List<String> values) {
            addCriterion("often_live_address in", values, "oftenLiveAddress");
            return (Criteria) this;
        }

        public Criteria andOftenLiveAddressNotIn(List<String> values) {
            addCriterion("often_live_address not in", values, "oftenLiveAddress");
            return (Criteria) this;
        }

        public Criteria andOftenLiveAddressBetween(String value1, String value2) {
            addCriterion("often_live_address between", value1, value2, "oftenLiveAddress");
            return (Criteria) this;
        }

        public Criteria andOftenLiveAddressNotBetween(String value1, String value2) {
            addCriterion("often_live_address not between", value1, value2, "oftenLiveAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNull() {
            addCriterion("enterprise_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNotNull() {
            addCriterion("enterprise_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualTo(String value) {
            addCriterion("enterprise_name =", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualTo(String value) {
            addCriterion("enterprise_name <>", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThan(String value) {
            addCriterion("enterprise_name >", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_name >=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThan(String value) {
            addCriterion("enterprise_name <", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_name <=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLike(String value) {
            addCriterion("enterprise_name like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotLike(String value) {
            addCriterion("enterprise_name not like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIn(List<String> values) {
            addCriterion("enterprise_name in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotIn(List<String> values) {
            addCriterion("enterprise_name not in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameBetween(String value1, String value2) {
            addCriterion("enterprise_name between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_name not between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIndustryIsNull() {
            addCriterion("enterprise_industry is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIndustryIsNotNull() {
            addCriterion("enterprise_industry is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIndustryEqualTo(String value) {
            addCriterion("enterprise_industry =", value, "enterpriseIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIndustryNotEqualTo(String value) {
            addCriterion("enterprise_industry <>", value, "enterpriseIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIndustryGreaterThan(String value) {
            addCriterion("enterprise_industry >", value, "enterpriseIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_industry >=", value, "enterpriseIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIndustryLessThan(String value) {
            addCriterion("enterprise_industry <", value, "enterpriseIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIndustryLessThanOrEqualTo(String value) {
            addCriterion("enterprise_industry <=", value, "enterpriseIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIndustryLike(String value) {
            addCriterion("enterprise_industry like", value, "enterpriseIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIndustryNotLike(String value) {
            addCriterion("enterprise_industry not like", value, "enterpriseIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIndustryIn(List<String> values) {
            addCriterion("enterprise_industry in", values, "enterpriseIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIndustryNotIn(List<String> values) {
            addCriterion("enterprise_industry not in", values, "enterpriseIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIndustryBetween(String value1, String value2) {
            addCriterion("enterprise_industry between", value1, value2, "enterpriseIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIndustryNotBetween(String value1, String value2) {
            addCriterion("enterprise_industry not between", value1, value2, "enterpriseIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressProvinceIsNull() {
            addCriterion("enterprise_address_province is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressProvinceIsNotNull() {
            addCriterion("enterprise_address_province is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressProvinceEqualTo(String value) {
            addCriterion("enterprise_address_province =", value, "enterpriseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressProvinceNotEqualTo(String value) {
            addCriterion("enterprise_address_province <>", value, "enterpriseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressProvinceGreaterThan(String value) {
            addCriterion("enterprise_address_province >", value, "enterpriseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_address_province >=", value, "enterpriseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressProvinceLessThan(String value) {
            addCriterion("enterprise_address_province <", value, "enterpriseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressProvinceLessThanOrEqualTo(String value) {
            addCriterion("enterprise_address_province <=", value, "enterpriseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressProvinceLike(String value) {
            addCriterion("enterprise_address_province like", value, "enterpriseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressProvinceNotLike(String value) {
            addCriterion("enterprise_address_province not like", value, "enterpriseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressProvinceIn(List<String> values) {
            addCriterion("enterprise_address_province in", values, "enterpriseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressProvinceNotIn(List<String> values) {
            addCriterion("enterprise_address_province not in", values, "enterpriseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressProvinceBetween(String value1, String value2) {
            addCriterion("enterprise_address_province between", value1, value2, "enterpriseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressProvinceNotBetween(String value1, String value2) {
            addCriterion("enterprise_address_province not between", value1, value2, "enterpriseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureIsNull() {
            addCriterion("enterprise_nature is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureIsNotNull() {
            addCriterion("enterprise_nature is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureEqualTo(Integer value) {
            addCriterion("enterprise_nature =", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureNotEqualTo(Integer value) {
            addCriterion("enterprise_nature <>", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureGreaterThan(Integer value) {
            addCriterion("enterprise_nature >", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_nature >=", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureLessThan(Integer value) {
            addCriterion("enterprise_nature <", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_nature <=", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureIn(List<Integer> values) {
            addCriterion("enterprise_nature in", values, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureNotIn(List<Integer> values) {
            addCriterion("enterprise_nature not in", values, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_nature between", value1, value2, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_nature not between", value1, value2, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCityIsNull() {
            addCriterion("enterprise_address_city is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCityIsNotNull() {
            addCriterion("enterprise_address_city is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCityEqualTo(String value) {
            addCriterion("enterprise_address_city =", value, "enterpriseAddressCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCityNotEqualTo(String value) {
            addCriterion("enterprise_address_city <>", value, "enterpriseAddressCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCityGreaterThan(String value) {
            addCriterion("enterprise_address_city >", value, "enterpriseAddressCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCityGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_address_city >=", value, "enterpriseAddressCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCityLessThan(String value) {
            addCriterion("enterprise_address_city <", value, "enterpriseAddressCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCityLessThanOrEqualTo(String value) {
            addCriterion("enterprise_address_city <=", value, "enterpriseAddressCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCityLike(String value) {
            addCriterion("enterprise_address_city like", value, "enterpriseAddressCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCityNotLike(String value) {
            addCriterion("enterprise_address_city not like", value, "enterpriseAddressCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCityIn(List<String> values) {
            addCriterion("enterprise_address_city in", values, "enterpriseAddressCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCityNotIn(List<String> values) {
            addCriterion("enterprise_address_city not in", values, "enterpriseAddressCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCityBetween(String value1, String value2) {
            addCriterion("enterprise_address_city between", value1, value2, "enterpriseAddressCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCityNotBetween(String value1, String value2) {
            addCriterion("enterprise_address_city not between", value1, value2, "enterpriseAddressCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCountryIsNull() {
            addCriterion("enterprise_address_country is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCountryIsNotNull() {
            addCriterion("enterprise_address_country is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCountryEqualTo(String value) {
            addCriterion("enterprise_address_country =", value, "enterpriseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCountryNotEqualTo(String value) {
            addCriterion("enterprise_address_country <>", value, "enterpriseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCountryGreaterThan(String value) {
            addCriterion("enterprise_address_country >", value, "enterpriseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCountryGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_address_country >=", value, "enterpriseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCountryLessThan(String value) {
            addCriterion("enterprise_address_country <", value, "enterpriseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCountryLessThanOrEqualTo(String value) {
            addCriterion("enterprise_address_country <=", value, "enterpriseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCountryLike(String value) {
            addCriterion("enterprise_address_country like", value, "enterpriseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCountryNotLike(String value) {
            addCriterion("enterprise_address_country not like", value, "enterpriseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCountryIn(List<String> values) {
            addCriterion("enterprise_address_country in", values, "enterpriseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCountryNotIn(List<String> values) {
            addCriterion("enterprise_address_country not in", values, "enterpriseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCountryBetween(String value1, String value2) {
            addCriterion("enterprise_address_country between", value1, value2, "enterpriseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressCountryNotBetween(String value1, String value2) {
            addCriterion("enterprise_address_country not between", value1, value2, "enterpriseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProtertiesIsNull() {
            addCriterion("enterprise_proterties is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProtertiesIsNotNull() {
            addCriterion("enterprise_proterties is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProtertiesEqualTo(String value) {
            addCriterion("enterprise_proterties =", value, "enterpriseProterties");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProtertiesNotEqualTo(String value) {
            addCriterion("enterprise_proterties <>", value, "enterpriseProterties");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProtertiesGreaterThan(String value) {
            addCriterion("enterprise_proterties >", value, "enterpriseProterties");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProtertiesGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_proterties >=", value, "enterpriseProterties");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProtertiesLessThan(String value) {
            addCriterion("enterprise_proterties <", value, "enterpriseProterties");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProtertiesLessThanOrEqualTo(String value) {
            addCriterion("enterprise_proterties <=", value, "enterpriseProterties");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProtertiesLike(String value) {
            addCriterion("enterprise_proterties like", value, "enterpriseProterties");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProtertiesNotLike(String value) {
            addCriterion("enterprise_proterties not like", value, "enterpriseProterties");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProtertiesIn(List<String> values) {
            addCriterion("enterprise_proterties in", values, "enterpriseProterties");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProtertiesNotIn(List<String> values) {
            addCriterion("enterprise_proterties not in", values, "enterpriseProterties");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProtertiesBetween(String value1, String value2) {
            addCriterion("enterprise_proterties between", value1, value2, "enterpriseProterties");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProtertiesNotBetween(String value1, String value2) {
            addCriterion("enterprise_proterties not between", value1, value2, "enterpriseProterties");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressDetailIsNull() {
            addCriterion("enterprise_address_detail is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressDetailIsNotNull() {
            addCriterion("enterprise_address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressDetailEqualTo(String value) {
            addCriterion("enterprise_address_detail =", value, "enterpriseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressDetailNotEqualTo(String value) {
            addCriterion("enterprise_address_detail <>", value, "enterpriseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressDetailGreaterThan(String value) {
            addCriterion("enterprise_address_detail >", value, "enterpriseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_address_detail >=", value, "enterpriseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressDetailLessThan(String value) {
            addCriterion("enterprise_address_detail <", value, "enterpriseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("enterprise_address_detail <=", value, "enterpriseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressDetailLike(String value) {
            addCriterion("enterprise_address_detail like", value, "enterpriseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressDetailNotLike(String value) {
            addCriterion("enterprise_address_detail not like", value, "enterpriseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressDetailIn(List<String> values) {
            addCriterion("enterprise_address_detail in", values, "enterpriseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressDetailNotIn(List<String> values) {
            addCriterion("enterprise_address_detail not in", values, "enterpriseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressDetailBetween(String value1, String value2) {
            addCriterion("enterprise_address_detail between", value1, value2, "enterpriseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressDetailNotBetween(String value1, String value2) {
            addCriterion("enterprise_address_detail not between", value1, value2, "enterpriseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyTelAreacodeIsNull() {
            addCriterion("company_tel_areacode is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelAreacodeIsNotNull() {
            addCriterion("company_tel_areacode is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelAreacodeEqualTo(String value) {
            addCriterion("company_tel_areacode =", value, "companyTelAreacode");
            return (Criteria) this;
        }

        public Criteria andCompanyTelAreacodeNotEqualTo(String value) {
            addCriterion("company_tel_areacode <>", value, "companyTelAreacode");
            return (Criteria) this;
        }

        public Criteria andCompanyTelAreacodeGreaterThan(String value) {
            addCriterion("company_tel_areacode >", value, "companyTelAreacode");
            return (Criteria) this;
        }

        public Criteria andCompanyTelAreacodeGreaterThanOrEqualTo(String value) {
            addCriterion("company_tel_areacode >=", value, "companyTelAreacode");
            return (Criteria) this;
        }

        public Criteria andCompanyTelAreacodeLessThan(String value) {
            addCriterion("company_tel_areacode <", value, "companyTelAreacode");
            return (Criteria) this;
        }

        public Criteria andCompanyTelAreacodeLessThanOrEqualTo(String value) {
            addCriterion("company_tel_areacode <=", value, "companyTelAreacode");
            return (Criteria) this;
        }

        public Criteria andCompanyTelAreacodeLike(String value) {
            addCriterion("company_tel_areacode like", value, "companyTelAreacode");
            return (Criteria) this;
        }

        public Criteria andCompanyTelAreacodeNotLike(String value) {
            addCriterion("company_tel_areacode not like", value, "companyTelAreacode");
            return (Criteria) this;
        }

        public Criteria andCompanyTelAreacodeIn(List<String> values) {
            addCriterion("company_tel_areacode in", values, "companyTelAreacode");
            return (Criteria) this;
        }

        public Criteria andCompanyTelAreacodeNotIn(List<String> values) {
            addCriterion("company_tel_areacode not in", values, "companyTelAreacode");
            return (Criteria) this;
        }

        public Criteria andCompanyTelAreacodeBetween(String value1, String value2) {
            addCriterion("company_tel_areacode between", value1, value2, "companyTelAreacode");
            return (Criteria) this;
        }

        public Criteria andCompanyTelAreacodeNotBetween(String value1, String value2) {
            addCriterion("company_tel_areacode not between", value1, value2, "companyTelAreacode");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLandlineIsNull() {
            addCriterion("company_tel_landline is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLandlineIsNotNull() {
            addCriterion("company_tel_landline is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLandlineEqualTo(String value) {
            addCriterion("company_tel_landline =", value, "companyTelLandline");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLandlineNotEqualTo(String value) {
            addCriterion("company_tel_landline <>", value, "companyTelLandline");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLandlineGreaterThan(String value) {
            addCriterion("company_tel_landline >", value, "companyTelLandline");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLandlineGreaterThanOrEqualTo(String value) {
            addCriterion("company_tel_landline >=", value, "companyTelLandline");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLandlineLessThan(String value) {
            addCriterion("company_tel_landline <", value, "companyTelLandline");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLandlineLessThanOrEqualTo(String value) {
            addCriterion("company_tel_landline <=", value, "companyTelLandline");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLandlineLike(String value) {
            addCriterion("company_tel_landline like", value, "companyTelLandline");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLandlineNotLike(String value) {
            addCriterion("company_tel_landline not like", value, "companyTelLandline");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLandlineIn(List<String> values) {
            addCriterion("company_tel_landline in", values, "companyTelLandline");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLandlineNotIn(List<String> values) {
            addCriterion("company_tel_landline not in", values, "companyTelLandline");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLandlineBetween(String value1, String value2) {
            addCriterion("company_tel_landline between", value1, value2, "companyTelLandline");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLandlineNotBetween(String value1, String value2) {
            addCriterion("company_tel_landline not between", value1, value2, "companyTelLandline");
            return (Criteria) this;
        }

        public Criteria andStartWorkDateIsNull() {
            addCriterion("start_work_date is null");
            return (Criteria) this;
        }

        public Criteria andStartWorkDateIsNotNull() {
            addCriterion("start_work_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartWorkDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_work_date =", value, "startWorkDate");
            return (Criteria) this;
        }

        public Criteria andStartWorkDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_work_date <>", value, "startWorkDate");
            return (Criteria) this;
        }

        public Criteria andStartWorkDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_work_date >", value, "startWorkDate");
            return (Criteria) this;
        }

        public Criteria andStartWorkDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_work_date >=", value, "startWorkDate");
            return (Criteria) this;
        }

        public Criteria andStartWorkDateLessThan(Date value) {
            addCriterionForJDBCDate("start_work_date <", value, "startWorkDate");
            return (Criteria) this;
        }

        public Criteria andStartWorkDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_work_date <=", value, "startWorkDate");
            return (Criteria) this;
        }

        public Criteria andStartWorkDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_work_date in", values, "startWorkDate");
            return (Criteria) this;
        }

        public Criteria andStartWorkDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_work_date not in", values, "startWorkDate");
            return (Criteria) this;
        }

        public Criteria andStartWorkDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_work_date between", value1, value2, "startWorkDate");
            return (Criteria) this;
        }

        public Criteria andStartWorkDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_work_date not between", value1, value2, "startWorkDate");
            return (Criteria) this;
        }

        public Criteria andNowCompanyWorkAgeIsNull() {
            addCriterion("now_company_work_age is null");
            return (Criteria) this;
        }

        public Criteria andNowCompanyWorkAgeIsNotNull() {
            addCriterion("now_company_work_age is not null");
            return (Criteria) this;
        }

        public Criteria andNowCompanyWorkAgeEqualTo(Integer value) {
            addCriterion("now_company_work_age =", value, "nowCompanyWorkAge");
            return (Criteria) this;
        }

        public Criteria andNowCompanyWorkAgeNotEqualTo(Integer value) {
            addCriterion("now_company_work_age <>", value, "nowCompanyWorkAge");
            return (Criteria) this;
        }

        public Criteria andNowCompanyWorkAgeGreaterThan(Integer value) {
            addCriterion("now_company_work_age >", value, "nowCompanyWorkAge");
            return (Criteria) this;
        }

        public Criteria andNowCompanyWorkAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("now_company_work_age >=", value, "nowCompanyWorkAge");
            return (Criteria) this;
        }

        public Criteria andNowCompanyWorkAgeLessThan(Integer value) {
            addCriterion("now_company_work_age <", value, "nowCompanyWorkAge");
            return (Criteria) this;
        }

        public Criteria andNowCompanyWorkAgeLessThanOrEqualTo(Integer value) {
            addCriterion("now_company_work_age <=", value, "nowCompanyWorkAge");
            return (Criteria) this;
        }

        public Criteria andNowCompanyWorkAgeIn(List<Integer> values) {
            addCriterion("now_company_work_age in", values, "nowCompanyWorkAge");
            return (Criteria) this;
        }

        public Criteria andNowCompanyWorkAgeNotIn(List<Integer> values) {
            addCriterion("now_company_work_age not in", values, "nowCompanyWorkAge");
            return (Criteria) this;
        }

        public Criteria andNowCompanyWorkAgeBetween(Integer value1, Integer value2) {
            addCriterion("now_company_work_age between", value1, value2, "nowCompanyWorkAge");
            return (Criteria) this;
        }

        public Criteria andNowCompanyWorkAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("now_company_work_age not between", value1, value2, "nowCompanyWorkAge");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeIsNull() {
            addCriterion("occupation_type is null");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeIsNotNull() {
            addCriterion("occupation_type is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeEqualTo(String value) {
            addCriterion("occupation_type =", value, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeNotEqualTo(String value) {
            addCriterion("occupation_type <>", value, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeGreaterThan(String value) {
            addCriterion("occupation_type >", value, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("occupation_type >=", value, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeLessThan(String value) {
            addCriterion("occupation_type <", value, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeLessThanOrEqualTo(String value) {
            addCriterion("occupation_type <=", value, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeLike(String value) {
            addCriterion("occupation_type like", value, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeNotLike(String value) {
            addCriterion("occupation_type not like", value, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeIn(List<String> values) {
            addCriterion("occupation_type in", values, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeNotIn(List<String> values) {
            addCriterion("occupation_type not in", values, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeBetween(String value1, String value2) {
            addCriterion("occupation_type between", value1, value2, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeNotBetween(String value1, String value2) {
            addCriterion("occupation_type not between", value1, value2, "occupationType");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andProfessionalTitleIsNull() {
            addCriterion("professional_title is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalTitleIsNotNull() {
            addCriterion("professional_title is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalTitleEqualTo(String value) {
            addCriterion("professional_title =", value, "professionalTitle");
            return (Criteria) this;
        }

        public Criteria andProfessionalTitleNotEqualTo(String value) {
            addCriterion("professional_title <>", value, "professionalTitle");
            return (Criteria) this;
        }

        public Criteria andProfessionalTitleGreaterThan(String value) {
            addCriterion("professional_title >", value, "professionalTitle");
            return (Criteria) this;
        }

        public Criteria andProfessionalTitleGreaterThanOrEqualTo(String value) {
            addCriterion("professional_title >=", value, "professionalTitle");
            return (Criteria) this;
        }

        public Criteria andProfessionalTitleLessThan(String value) {
            addCriterion("professional_title <", value, "professionalTitle");
            return (Criteria) this;
        }

        public Criteria andProfessionalTitleLessThanOrEqualTo(String value) {
            addCriterion("professional_title <=", value, "professionalTitle");
            return (Criteria) this;
        }

        public Criteria andProfessionalTitleLike(String value) {
            addCriterion("professional_title like", value, "professionalTitle");
            return (Criteria) this;
        }

        public Criteria andProfessionalTitleNotLike(String value) {
            addCriterion("professional_title not like", value, "professionalTitle");
            return (Criteria) this;
        }

        public Criteria andProfessionalTitleIn(List<String> values) {
            addCriterion("professional_title in", values, "professionalTitle");
            return (Criteria) this;
        }

        public Criteria andProfessionalTitleNotIn(List<String> values) {
            addCriterion("professional_title not in", values, "professionalTitle");
            return (Criteria) this;
        }

        public Criteria andProfessionalTitleBetween(String value1, String value2) {
            addCriterion("professional_title between", value1, value2, "professionalTitle");
            return (Criteria) this;
        }

        public Criteria andProfessionalTitleNotBetween(String value1, String value2) {
            addCriterion("professional_title not between", value1, value2, "professionalTitle");
            return (Criteria) this;
        }

        public Criteria andLivingConditionIsNull() {
            addCriterion("living_condition is null");
            return (Criteria) this;
        }

        public Criteria andLivingConditionIsNotNull() {
            addCriterion("living_condition is not null");
            return (Criteria) this;
        }

        public Criteria andLivingConditionEqualTo(String value) {
            addCriterion("living_condition =", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionNotEqualTo(String value) {
            addCriterion("living_condition <>", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionGreaterThan(String value) {
            addCriterion("living_condition >", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionGreaterThanOrEqualTo(String value) {
            addCriterion("living_condition >=", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionLessThan(String value) {
            addCriterion("living_condition <", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionLessThanOrEqualTo(String value) {
            addCriterion("living_condition <=", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionLike(String value) {
            addCriterion("living_condition like", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionNotLike(String value) {
            addCriterion("living_condition not like", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionIn(List<String> values) {
            addCriterion("living_condition in", values, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionNotIn(List<String> values) {
            addCriterion("living_condition not in", values, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionBetween(String value1, String value2) {
            addCriterion("living_condition between", value1, value2, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionNotBetween(String value1, String value2) {
            addCriterion("living_condition not between", value1, value2, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andResidentialPropertiesIsNull() {
            addCriterion("residential_properties is null");
            return (Criteria) this;
        }

        public Criteria andResidentialPropertiesIsNotNull() {
            addCriterion("residential_properties is not null");
            return (Criteria) this;
        }

        public Criteria andResidentialPropertiesEqualTo(String value) {
            addCriterion("residential_properties =", value, "residentialProperties");
            return (Criteria) this;
        }

        public Criteria andResidentialPropertiesNotEqualTo(String value) {
            addCriterion("residential_properties <>", value, "residentialProperties");
            return (Criteria) this;
        }

        public Criteria andResidentialPropertiesGreaterThan(String value) {
            addCriterion("residential_properties >", value, "residentialProperties");
            return (Criteria) this;
        }

        public Criteria andResidentialPropertiesGreaterThanOrEqualTo(String value) {
            addCriterion("residential_properties >=", value, "residentialProperties");
            return (Criteria) this;
        }

        public Criteria andResidentialPropertiesLessThan(String value) {
            addCriterion("residential_properties <", value, "residentialProperties");
            return (Criteria) this;
        }

        public Criteria andResidentialPropertiesLessThanOrEqualTo(String value) {
            addCriterion("residential_properties <=", value, "residentialProperties");
            return (Criteria) this;
        }

        public Criteria andResidentialPropertiesLike(String value) {
            addCriterion("residential_properties like", value, "residentialProperties");
            return (Criteria) this;
        }

        public Criteria andResidentialPropertiesNotLike(String value) {
            addCriterion("residential_properties not like", value, "residentialProperties");
            return (Criteria) this;
        }

        public Criteria andResidentialPropertiesIn(List<String> values) {
            addCriterion("residential_properties in", values, "residentialProperties");
            return (Criteria) this;
        }

        public Criteria andResidentialPropertiesNotIn(List<String> values) {
            addCriterion("residential_properties not in", values, "residentialProperties");
            return (Criteria) this;
        }

        public Criteria andResidentialPropertiesBetween(String value1, String value2) {
            addCriterion("residential_properties between", value1, value2, "residentialProperties");
            return (Criteria) this;
        }

        public Criteria andResidentialPropertiesNotBetween(String value1, String value2) {
            addCriterion("residential_properties not between", value1, value2, "residentialProperties");
            return (Criteria) this;
        }

        public Criteria andIsHouseCertificateIsNull() {
            addCriterion("is_house_certificate is null");
            return (Criteria) this;
        }

        public Criteria andIsHouseCertificateIsNotNull() {
            addCriterion("is_house_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andIsHouseCertificateEqualTo(String value) {
            addCriterion("is_house_certificate =", value, "isHouseCertificate");
            return (Criteria) this;
        }

        public Criteria andIsHouseCertificateNotEqualTo(String value) {
            addCriterion("is_house_certificate <>", value, "isHouseCertificate");
            return (Criteria) this;
        }

        public Criteria andIsHouseCertificateGreaterThan(String value) {
            addCriterion("is_house_certificate >", value, "isHouseCertificate");
            return (Criteria) this;
        }

        public Criteria andIsHouseCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("is_house_certificate >=", value, "isHouseCertificate");
            return (Criteria) this;
        }

        public Criteria andIsHouseCertificateLessThan(String value) {
            addCriterion("is_house_certificate <", value, "isHouseCertificate");
            return (Criteria) this;
        }

        public Criteria andIsHouseCertificateLessThanOrEqualTo(String value) {
            addCriterion("is_house_certificate <=", value, "isHouseCertificate");
            return (Criteria) this;
        }

        public Criteria andIsHouseCertificateLike(String value) {
            addCriterion("is_house_certificate like", value, "isHouseCertificate");
            return (Criteria) this;
        }

        public Criteria andIsHouseCertificateNotLike(String value) {
            addCriterion("is_house_certificate not like", value, "isHouseCertificate");
            return (Criteria) this;
        }

        public Criteria andIsHouseCertificateIn(List<String> values) {
            addCriterion("is_house_certificate in", values, "isHouseCertificate");
            return (Criteria) this;
        }

        public Criteria andIsHouseCertificateNotIn(List<String> values) {
            addCriterion("is_house_certificate not in", values, "isHouseCertificate");
            return (Criteria) this;
        }

        public Criteria andIsHouseCertificateBetween(String value1, String value2) {
            addCriterion("is_house_certificate between", value1, value2, "isHouseCertificate");
            return (Criteria) this;
        }

        public Criteria andIsHouseCertificateNotBetween(String value1, String value2) {
            addCriterion("is_house_certificate not between", value1, value2, "isHouseCertificate");
            return (Criteria) this;
        }

        public Criteria andHouseAreaIsNull() {
            addCriterion("house_area is null");
            return (Criteria) this;
        }

        public Criteria andHouseAreaIsNotNull() {
            addCriterion("house_area is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAreaEqualTo(String value) {
            addCriterion("house_area =", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotEqualTo(String value) {
            addCriterion("house_area <>", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaGreaterThan(String value) {
            addCriterion("house_area >", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaGreaterThanOrEqualTo(String value) {
            addCriterion("house_area >=", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaLessThan(String value) {
            addCriterion("house_area <", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaLessThanOrEqualTo(String value) {
            addCriterion("house_area <=", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaLike(String value) {
            addCriterion("house_area like", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotLike(String value) {
            addCriterion("house_area not like", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaIn(List<String> values) {
            addCriterion("house_area in", values, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotIn(List<String> values) {
            addCriterion("house_area not in", values, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaBetween(String value1, String value2) {
            addCriterion("house_area between", value1, value2, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotBetween(String value1, String value2) {
            addCriterion("house_area not between", value1, value2, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHousePriceIsNull() {
            addCriterion("house_price is null");
            return (Criteria) this;
        }

        public Criteria andHousePriceIsNotNull() {
            addCriterion("house_price is not null");
            return (Criteria) this;
        }

        public Criteria andHousePriceEqualTo(BigDecimal value) {
            addCriterion("house_price =", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotEqualTo(BigDecimal value) {
            addCriterion("house_price <>", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceGreaterThan(BigDecimal value) {
            addCriterion("house_price >", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_price >=", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceLessThan(BigDecimal value) {
            addCriterion("house_price <", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_price <=", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceIn(List<BigDecimal> values) {
            addCriterion("house_price in", values, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotIn(List<BigDecimal> values) {
            addCriterion("house_price not in", values, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_price between", value1, value2, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_price not between", value1, value2, "housePrice");
            return (Criteria) this;
        }

        public Criteria andIsOwnCarIsNull() {
            addCriterion("is_own_car is null");
            return (Criteria) this;
        }

        public Criteria andIsOwnCarIsNotNull() {
            addCriterion("is_own_car is not null");
            return (Criteria) this;
        }

        public Criteria andIsOwnCarEqualTo(String value) {
            addCriterion("is_own_car =", value, "isOwnCar");
            return (Criteria) this;
        }

        public Criteria andIsOwnCarNotEqualTo(String value) {
            addCriterion("is_own_car <>", value, "isOwnCar");
            return (Criteria) this;
        }

        public Criteria andIsOwnCarGreaterThan(String value) {
            addCriterion("is_own_car >", value, "isOwnCar");
            return (Criteria) this;
        }

        public Criteria andIsOwnCarGreaterThanOrEqualTo(String value) {
            addCriterion("is_own_car >=", value, "isOwnCar");
            return (Criteria) this;
        }

        public Criteria andIsOwnCarLessThan(String value) {
            addCriterion("is_own_car <", value, "isOwnCar");
            return (Criteria) this;
        }

        public Criteria andIsOwnCarLessThanOrEqualTo(String value) {
            addCriterion("is_own_car <=", value, "isOwnCar");
            return (Criteria) this;
        }

        public Criteria andIsOwnCarLike(String value) {
            addCriterion("is_own_car like", value, "isOwnCar");
            return (Criteria) this;
        }

        public Criteria andIsOwnCarNotLike(String value) {
            addCriterion("is_own_car not like", value, "isOwnCar");
            return (Criteria) this;
        }

        public Criteria andIsOwnCarIn(List<String> values) {
            addCriterion("is_own_car in", values, "isOwnCar");
            return (Criteria) this;
        }

        public Criteria andIsOwnCarNotIn(List<String> values) {
            addCriterion("is_own_car not in", values, "isOwnCar");
            return (Criteria) this;
        }

        public Criteria andIsOwnCarBetween(String value1, String value2) {
            addCriterion("is_own_car between", value1, value2, "isOwnCar");
            return (Criteria) this;
        }

        public Criteria andIsOwnCarNotBetween(String value1, String value2) {
            addCriterion("is_own_car not between", value1, value2, "isOwnCar");
            return (Criteria) this;
        }

        public Criteria andCarBrandIsNull() {
            addCriterion("car_brand is null");
            return (Criteria) this;
        }

        public Criteria andCarBrandIsNotNull() {
            addCriterion("car_brand is not null");
            return (Criteria) this;
        }

        public Criteria andCarBrandEqualTo(String value) {
            addCriterion("car_brand =", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotEqualTo(String value) {
            addCriterion("car_brand <>", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandGreaterThan(String value) {
            addCriterion("car_brand >", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandGreaterThanOrEqualTo(String value) {
            addCriterion("car_brand >=", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLessThan(String value) {
            addCriterion("car_brand <", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLessThanOrEqualTo(String value) {
            addCriterion("car_brand <=", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLike(String value) {
            addCriterion("car_brand like", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotLike(String value) {
            addCriterion("car_brand not like", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandIn(List<String> values) {
            addCriterion("car_brand in", values, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotIn(List<String> values) {
            addCriterion("car_brand not in", values, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandBetween(String value1, String value2) {
            addCriterion("car_brand between", value1, value2, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotBetween(String value1, String value2) {
            addCriterion("car_brand not between", value1, value2, "carBrand");
            return (Criteria) this;
        }

        public Criteria andIsDriveLicenseIsNull() {
            addCriterion("is_drive_license is null");
            return (Criteria) this;
        }

        public Criteria andIsDriveLicenseIsNotNull() {
            addCriterion("is_drive_license is not null");
            return (Criteria) this;
        }

        public Criteria andIsDriveLicenseEqualTo(String value) {
            addCriterion("is_drive_license =", value, "isDriveLicense");
            return (Criteria) this;
        }

        public Criteria andIsDriveLicenseNotEqualTo(String value) {
            addCriterion("is_drive_license <>", value, "isDriveLicense");
            return (Criteria) this;
        }

        public Criteria andIsDriveLicenseGreaterThan(String value) {
            addCriterion("is_drive_license >", value, "isDriveLicense");
            return (Criteria) this;
        }

        public Criteria andIsDriveLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("is_drive_license >=", value, "isDriveLicense");
            return (Criteria) this;
        }

        public Criteria andIsDriveLicenseLessThan(String value) {
            addCriterion("is_drive_license <", value, "isDriveLicense");
            return (Criteria) this;
        }

        public Criteria andIsDriveLicenseLessThanOrEqualTo(String value) {
            addCriterion("is_drive_license <=", value, "isDriveLicense");
            return (Criteria) this;
        }

        public Criteria andIsDriveLicenseLike(String value) {
            addCriterion("is_drive_license like", value, "isDriveLicense");
            return (Criteria) this;
        }

        public Criteria andIsDriveLicenseNotLike(String value) {
            addCriterion("is_drive_license not like", value, "isDriveLicense");
            return (Criteria) this;
        }

        public Criteria andIsDriveLicenseIn(List<String> values) {
            addCriterion("is_drive_license in", values, "isDriveLicense");
            return (Criteria) this;
        }

        public Criteria andIsDriveLicenseNotIn(List<String> values) {
            addCriterion("is_drive_license not in", values, "isDriveLicense");
            return (Criteria) this;
        }

        public Criteria andIsDriveLicenseBetween(String value1, String value2) {
            addCriterion("is_drive_license between", value1, value2, "isDriveLicense");
            return (Criteria) this;
        }

        public Criteria andIsDriveLicenseNotBetween(String value1, String value2) {
            addCriterion("is_drive_license not between", value1, value2, "isDriveLicense");
            return (Criteria) this;
        }

        public Criteria andCarPriceIsNull() {
            addCriterion("car_price is null");
            return (Criteria) this;
        }

        public Criteria andCarPriceIsNotNull() {
            addCriterion("car_price is not null");
            return (Criteria) this;
        }

        public Criteria andCarPriceEqualTo(BigDecimal value) {
            addCriterion("car_price =", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotEqualTo(BigDecimal value) {
            addCriterion("car_price <>", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceGreaterThan(BigDecimal value) {
            addCriterion("car_price >", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("car_price >=", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceLessThan(BigDecimal value) {
            addCriterion("car_price <", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("car_price <=", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceIn(List<BigDecimal> values) {
            addCriterion("car_price in", values, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotIn(List<BigDecimal> values) {
            addCriterion("car_price not in", values, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("car_price between", value1, value2, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("car_price not between", value1, value2, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNull() {
            addCriterion("car_number is null");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNotNull() {
            addCriterion("car_number is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumberEqualTo(String value) {
            addCriterion("car_number =", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotEqualTo(String value) {
            addCriterion("car_number <>", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThan(String value) {
            addCriterion("car_number >", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThanOrEqualTo(String value) {
            addCriterion("car_number >=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThan(String value) {
            addCriterion("car_number <", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThanOrEqualTo(String value) {
            addCriterion("car_number <=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLike(String value) {
            addCriterion("car_number like", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotLike(String value) {
            addCriterion("car_number not like", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberIn(List<String> values) {
            addCriterion("car_number in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotIn(List<String> values) {
            addCriterion("car_number not in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberBetween(String value1, String value2) {
            addCriterion("car_number between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotBetween(String value1, String value2) {
            addCriterion("car_number not between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarMortgageIsNull() {
            addCriterion("car_mortgage is null");
            return (Criteria) this;
        }

        public Criteria andCarMortgageIsNotNull() {
            addCriterion("car_mortgage is not null");
            return (Criteria) this;
        }

        public Criteria andCarMortgageEqualTo(String value) {
            addCriterion("car_mortgage =", value, "carMortgage");
            return (Criteria) this;
        }

        public Criteria andCarMortgageNotEqualTo(String value) {
            addCriterion("car_mortgage <>", value, "carMortgage");
            return (Criteria) this;
        }

        public Criteria andCarMortgageGreaterThan(String value) {
            addCriterion("car_mortgage >", value, "carMortgage");
            return (Criteria) this;
        }

        public Criteria andCarMortgageGreaterThanOrEqualTo(String value) {
            addCriterion("car_mortgage >=", value, "carMortgage");
            return (Criteria) this;
        }

        public Criteria andCarMortgageLessThan(String value) {
            addCriterion("car_mortgage <", value, "carMortgage");
            return (Criteria) this;
        }

        public Criteria andCarMortgageLessThanOrEqualTo(String value) {
            addCriterion("car_mortgage <=", value, "carMortgage");
            return (Criteria) this;
        }

        public Criteria andCarMortgageLike(String value) {
            addCriterion("car_mortgage like", value, "carMortgage");
            return (Criteria) this;
        }

        public Criteria andCarMortgageNotLike(String value) {
            addCriterion("car_mortgage not like", value, "carMortgage");
            return (Criteria) this;
        }

        public Criteria andCarMortgageIn(List<String> values) {
            addCriterion("car_mortgage in", values, "carMortgage");
            return (Criteria) this;
        }

        public Criteria andCarMortgageNotIn(List<String> values) {
            addCriterion("car_mortgage not in", values, "carMortgage");
            return (Criteria) this;
        }

        public Criteria andCarMortgageBetween(String value1, String value2) {
            addCriterion("car_mortgage between", value1, value2, "carMortgage");
            return (Criteria) this;
        }

        public Criteria andCarMortgageNotBetween(String value1, String value2) {
            addCriterion("car_mortgage not between", value1, value2, "carMortgage");
            return (Criteria) this;
        }

        public Criteria andHouseMortgageIsNull() {
            addCriterion("house_mortgage is null");
            return (Criteria) this;
        }

        public Criteria andHouseMortgageIsNotNull() {
            addCriterion("house_mortgage is not null");
            return (Criteria) this;
        }

        public Criteria andHouseMortgageEqualTo(String value) {
            addCriterion("house_mortgage =", value, "houseMortgage");
            return (Criteria) this;
        }

        public Criteria andHouseMortgageNotEqualTo(String value) {
            addCriterion("house_mortgage <>", value, "houseMortgage");
            return (Criteria) this;
        }

        public Criteria andHouseMortgageGreaterThan(String value) {
            addCriterion("house_mortgage >", value, "houseMortgage");
            return (Criteria) this;
        }

        public Criteria andHouseMortgageGreaterThanOrEqualTo(String value) {
            addCriterion("house_mortgage >=", value, "houseMortgage");
            return (Criteria) this;
        }

        public Criteria andHouseMortgageLessThan(String value) {
            addCriterion("house_mortgage <", value, "houseMortgage");
            return (Criteria) this;
        }

        public Criteria andHouseMortgageLessThanOrEqualTo(String value) {
            addCriterion("house_mortgage <=", value, "houseMortgage");
            return (Criteria) this;
        }

        public Criteria andHouseMortgageLike(String value) {
            addCriterion("house_mortgage like", value, "houseMortgage");
            return (Criteria) this;
        }

        public Criteria andHouseMortgageNotLike(String value) {
            addCriterion("house_mortgage not like", value, "houseMortgage");
            return (Criteria) this;
        }

        public Criteria andHouseMortgageIn(List<String> values) {
            addCriterion("house_mortgage in", values, "houseMortgage");
            return (Criteria) this;
        }

        public Criteria andHouseMortgageNotIn(List<String> values) {
            addCriterion("house_mortgage not in", values, "houseMortgage");
            return (Criteria) this;
        }

        public Criteria andHouseMortgageBetween(String value1, String value2) {
            addCriterion("house_mortgage between", value1, value2, "houseMortgage");
            return (Criteria) this;
        }

        public Criteria andHouseMortgageNotBetween(String value1, String value2) {
            addCriterion("house_mortgage not between", value1, value2, "houseMortgage");
            return (Criteria) this;
        }

        public Criteria andCarSituationIsNull() {
            addCriterion("car_situation is null");
            return (Criteria) this;
        }

        public Criteria andCarSituationIsNotNull() {
            addCriterion("car_situation is not null");
            return (Criteria) this;
        }

        public Criteria andCarSituationEqualTo(String value) {
            addCriterion("car_situation =", value, "carSituation");
            return (Criteria) this;
        }

        public Criteria andCarSituationNotEqualTo(String value) {
            addCriterion("car_situation <>", value, "carSituation");
            return (Criteria) this;
        }

        public Criteria andCarSituationGreaterThan(String value) {
            addCriterion("car_situation >", value, "carSituation");
            return (Criteria) this;
        }

        public Criteria andCarSituationGreaterThanOrEqualTo(String value) {
            addCriterion("car_situation >=", value, "carSituation");
            return (Criteria) this;
        }

        public Criteria andCarSituationLessThan(String value) {
            addCriterion("car_situation <", value, "carSituation");
            return (Criteria) this;
        }

        public Criteria andCarSituationLessThanOrEqualTo(String value) {
            addCriterion("car_situation <=", value, "carSituation");
            return (Criteria) this;
        }

        public Criteria andCarSituationLike(String value) {
            addCriterion("car_situation like", value, "carSituation");
            return (Criteria) this;
        }

        public Criteria andCarSituationNotLike(String value) {
            addCriterion("car_situation not like", value, "carSituation");
            return (Criteria) this;
        }

        public Criteria andCarSituationIn(List<String> values) {
            addCriterion("car_situation in", values, "carSituation");
            return (Criteria) this;
        }

        public Criteria andCarSituationNotIn(List<String> values) {
            addCriterion("car_situation not in", values, "carSituation");
            return (Criteria) this;
        }

        public Criteria andCarSituationBetween(String value1, String value2) {
            addCriterion("car_situation between", value1, value2, "carSituation");
            return (Criteria) this;
        }

        public Criteria andCarSituationNotBetween(String value1, String value2) {
            addCriterion("car_situation not between", value1, value2, "carSituation");
            return (Criteria) this;
        }

        public Criteria andDailyAssetsIsNull() {
            addCriterion("daily_assets is null");
            return (Criteria) this;
        }

        public Criteria andDailyAssetsIsNotNull() {
            addCriterion("daily_assets is not null");
            return (Criteria) this;
        }

        public Criteria andDailyAssetsEqualTo(String value) {
            addCriterion("daily_assets =", value, "dailyAssets");
            return (Criteria) this;
        }

        public Criteria andDailyAssetsNotEqualTo(String value) {
            addCriterion("daily_assets <>", value, "dailyAssets");
            return (Criteria) this;
        }

        public Criteria andDailyAssetsGreaterThan(String value) {
            addCriterion("daily_assets >", value, "dailyAssets");
            return (Criteria) this;
        }

        public Criteria andDailyAssetsGreaterThanOrEqualTo(String value) {
            addCriterion("daily_assets >=", value, "dailyAssets");
            return (Criteria) this;
        }

        public Criteria andDailyAssetsLessThan(String value) {
            addCriterion("daily_assets <", value, "dailyAssets");
            return (Criteria) this;
        }

        public Criteria andDailyAssetsLessThanOrEqualTo(String value) {
            addCriterion("daily_assets <=", value, "dailyAssets");
            return (Criteria) this;
        }

        public Criteria andDailyAssetsLike(String value) {
            addCriterion("daily_assets like", value, "dailyAssets");
            return (Criteria) this;
        }

        public Criteria andDailyAssetsNotLike(String value) {
            addCriterion("daily_assets not like", value, "dailyAssets");
            return (Criteria) this;
        }

        public Criteria andDailyAssetsIn(List<String> values) {
            addCriterion("daily_assets in", values, "dailyAssets");
            return (Criteria) this;
        }

        public Criteria andDailyAssetsNotIn(List<String> values) {
            addCriterion("daily_assets not in", values, "dailyAssets");
            return (Criteria) this;
        }

        public Criteria andDailyAssetsBetween(String value1, String value2) {
            addCriterion("daily_assets between", value1, value2, "dailyAssets");
            return (Criteria) this;
        }

        public Criteria andDailyAssetsNotBetween(String value1, String value2) {
            addCriterion("daily_assets not between", value1, value2, "dailyAssets");
            return (Criteria) this;
        }

        public Criteria andDayAssetsIsNull() {
            addCriterion("day_assets is null");
            return (Criteria) this;
        }

        public Criteria andDayAssetsIsNotNull() {
            addCriterion("day_assets is not null");
            return (Criteria) this;
        }

        public Criteria andDayAssetsEqualTo(String value) {
            addCriterion("day_assets =", value, "dayAssets");
            return (Criteria) this;
        }

        public Criteria andDayAssetsNotEqualTo(String value) {
            addCriterion("day_assets <>", value, "dayAssets");
            return (Criteria) this;
        }

        public Criteria andDayAssetsGreaterThan(String value) {
            addCriterion("day_assets >", value, "dayAssets");
            return (Criteria) this;
        }

        public Criteria andDayAssetsGreaterThanOrEqualTo(String value) {
            addCriterion("day_assets >=", value, "dayAssets");
            return (Criteria) this;
        }

        public Criteria andDayAssetsLessThan(String value) {
            addCriterion("day_assets <", value, "dayAssets");
            return (Criteria) this;
        }

        public Criteria andDayAssetsLessThanOrEqualTo(String value) {
            addCriterion("day_assets <=", value, "dayAssets");
            return (Criteria) this;
        }

        public Criteria andDayAssetsLike(String value) {
            addCriterion("day_assets like", value, "dayAssets");
            return (Criteria) this;
        }

        public Criteria andDayAssetsNotLike(String value) {
            addCriterion("day_assets not like", value, "dayAssets");
            return (Criteria) this;
        }

        public Criteria andDayAssetsIn(List<String> values) {
            addCriterion("day_assets in", values, "dayAssets");
            return (Criteria) this;
        }

        public Criteria andDayAssetsNotIn(List<String> values) {
            addCriterion("day_assets not in", values, "dayAssets");
            return (Criteria) this;
        }

        public Criteria andDayAssetsBetween(String value1, String value2) {
            addCriterion("day_assets between", value1, value2, "dayAssets");
            return (Criteria) this;
        }

        public Criteria andDayAssetsNotBetween(String value1, String value2) {
            addCriterion("day_assets not between", value1, value2, "dayAssets");
            return (Criteria) this;
        }

        public Criteria andBusinessDaysIsNull() {
            addCriterion("business_days is null");
            return (Criteria) this;
        }

        public Criteria andBusinessDaysIsNotNull() {
            addCriterion("business_days is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessDaysEqualTo(String value) {
            addCriterion("business_days =", value, "businessDays");
            return (Criteria) this;
        }

        public Criteria andBusinessDaysNotEqualTo(String value) {
            addCriterion("business_days <>", value, "businessDays");
            return (Criteria) this;
        }

        public Criteria andBusinessDaysGreaterThan(String value) {
            addCriterion("business_days >", value, "businessDays");
            return (Criteria) this;
        }

        public Criteria andBusinessDaysGreaterThanOrEqualTo(String value) {
            addCriterion("business_days >=", value, "businessDays");
            return (Criteria) this;
        }

        public Criteria andBusinessDaysLessThan(String value) {
            addCriterion("business_days <", value, "businessDays");
            return (Criteria) this;
        }

        public Criteria andBusinessDaysLessThanOrEqualTo(String value) {
            addCriterion("business_days <=", value, "businessDays");
            return (Criteria) this;
        }

        public Criteria andBusinessDaysLike(String value) {
            addCriterion("business_days like", value, "businessDays");
            return (Criteria) this;
        }

        public Criteria andBusinessDaysNotLike(String value) {
            addCriterion("business_days not like", value, "businessDays");
            return (Criteria) this;
        }

        public Criteria andBusinessDaysIn(List<String> values) {
            addCriterion("business_days in", values, "businessDays");
            return (Criteria) this;
        }

        public Criteria andBusinessDaysNotIn(List<String> values) {
            addCriterion("business_days not in", values, "businessDays");
            return (Criteria) this;
        }

        public Criteria andBusinessDaysBetween(String value1, String value2) {
            addCriterion("business_days between", value1, value2, "businessDays");
            return (Criteria) this;
        }

        public Criteria andBusinessDaysNotBetween(String value1, String value2) {
            addCriterion("business_days not between", value1, value2, "businessDays");
            return (Criteria) this;
        }

        public Criteria andIdentityCheckIsNull() {
            addCriterion("identity_check is null");
            return (Criteria) this;
        }

        public Criteria andIdentityCheckIsNotNull() {
            addCriterion("identity_check is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityCheckEqualTo(String value) {
            addCriterion("identity_check =", value, "identityCheck");
            return (Criteria) this;
        }

        public Criteria andIdentityCheckNotEqualTo(String value) {
            addCriterion("identity_check <>", value, "identityCheck");
            return (Criteria) this;
        }

        public Criteria andIdentityCheckGreaterThan(String value) {
            addCriterion("identity_check >", value, "identityCheck");
            return (Criteria) this;
        }

        public Criteria andIdentityCheckGreaterThanOrEqualTo(String value) {
            addCriterion("identity_check >=", value, "identityCheck");
            return (Criteria) this;
        }

        public Criteria andIdentityCheckLessThan(String value) {
            addCriterion("identity_check <", value, "identityCheck");
            return (Criteria) this;
        }

        public Criteria andIdentityCheckLessThanOrEqualTo(String value) {
            addCriterion("identity_check <=", value, "identityCheck");
            return (Criteria) this;
        }

        public Criteria andIdentityCheckLike(String value) {
            addCriterion("identity_check like", value, "identityCheck");
            return (Criteria) this;
        }

        public Criteria andIdentityCheckNotLike(String value) {
            addCriterion("identity_check not like", value, "identityCheck");
            return (Criteria) this;
        }

        public Criteria andIdentityCheckIn(List<String> values) {
            addCriterion("identity_check in", values, "identityCheck");
            return (Criteria) this;
        }

        public Criteria andIdentityCheckNotIn(List<String> values) {
            addCriterion("identity_check not in", values, "identityCheck");
            return (Criteria) this;
        }

        public Criteria andIdentityCheckBetween(String value1, String value2) {
            addCriterion("identity_check between", value1, value2, "identityCheck");
            return (Criteria) this;
        }

        public Criteria andIdentityCheckNotBetween(String value1, String value2) {
            addCriterion("identity_check not between", value1, value2, "identityCheck");
            return (Criteria) this;
        }

        public Criteria andHouseSituationIsNull() {
            addCriterion("house_situation is null");
            return (Criteria) this;
        }

        public Criteria andHouseSituationIsNotNull() {
            addCriterion("house_situation is not null");
            return (Criteria) this;
        }

        public Criteria andHouseSituationEqualTo(String value) {
            addCriterion("house_situation =", value, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationNotEqualTo(String value) {
            addCriterion("house_situation <>", value, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationGreaterThan(String value) {
            addCriterion("house_situation >", value, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationGreaterThanOrEqualTo(String value) {
            addCriterion("house_situation >=", value, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationLessThan(String value) {
            addCriterion("house_situation <", value, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationLessThanOrEqualTo(String value) {
            addCriterion("house_situation <=", value, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationLike(String value) {
            addCriterion("house_situation like", value, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationNotLike(String value) {
            addCriterion("house_situation not like", value, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationIn(List<String> values) {
            addCriterion("house_situation in", values, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationNotIn(List<String> values) {
            addCriterion("house_situation not in", values, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationBetween(String value1, String value2) {
            addCriterion("house_situation between", value1, value2, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationNotBetween(String value1, String value2) {
            addCriterion("house_situation not between", value1, value2, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseAddressProvinceIsNull() {
            addCriterion("house_address_province is null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressProvinceIsNotNull() {
            addCriterion("house_address_province is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressProvinceEqualTo(String value) {
            addCriterion("house_address_province =", value, "houseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andHouseAddressProvinceNotEqualTo(String value) {
            addCriterion("house_address_province <>", value, "houseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andHouseAddressProvinceGreaterThan(String value) {
            addCriterion("house_address_province >", value, "houseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andHouseAddressProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("house_address_province >=", value, "houseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andHouseAddressProvinceLessThan(String value) {
            addCriterion("house_address_province <", value, "houseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andHouseAddressProvinceLessThanOrEqualTo(String value) {
            addCriterion("house_address_province <=", value, "houseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andHouseAddressProvinceLike(String value) {
            addCriterion("house_address_province like", value, "houseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andHouseAddressProvinceNotLike(String value) {
            addCriterion("house_address_province not like", value, "houseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andHouseAddressProvinceIn(List<String> values) {
            addCriterion("house_address_province in", values, "houseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andHouseAddressProvinceNotIn(List<String> values) {
            addCriterion("house_address_province not in", values, "houseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andHouseAddressProvinceBetween(String value1, String value2) {
            addCriterion("house_address_province between", value1, value2, "houseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andHouseAddressProvinceNotBetween(String value1, String value2) {
            addCriterion("house_address_province not between", value1, value2, "houseAddressProvince");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCityIsNull() {
            addCriterion("house_address_city is null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCityIsNotNull() {
            addCriterion("house_address_city is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCityEqualTo(String value) {
            addCriterion("house_address_city =", value, "houseAddressCity");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCityNotEqualTo(String value) {
            addCriterion("house_address_city <>", value, "houseAddressCity");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCityGreaterThan(String value) {
            addCriterion("house_address_city >", value, "houseAddressCity");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCityGreaterThanOrEqualTo(String value) {
            addCriterion("house_address_city >=", value, "houseAddressCity");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCityLessThan(String value) {
            addCriterion("house_address_city <", value, "houseAddressCity");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCityLessThanOrEqualTo(String value) {
            addCriterion("house_address_city <=", value, "houseAddressCity");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCityLike(String value) {
            addCriterion("house_address_city like", value, "houseAddressCity");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCityNotLike(String value) {
            addCriterion("house_address_city not like", value, "houseAddressCity");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCityIn(List<String> values) {
            addCriterion("house_address_city in", values, "houseAddressCity");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCityNotIn(List<String> values) {
            addCriterion("house_address_city not in", values, "houseAddressCity");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCityBetween(String value1, String value2) {
            addCriterion("house_address_city between", value1, value2, "houseAddressCity");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCityNotBetween(String value1, String value2) {
            addCriterion("house_address_city not between", value1, value2, "houseAddressCity");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCountryIsNull() {
            addCriterion("house_address_country is null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCountryIsNotNull() {
            addCriterion("house_address_country is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCountryEqualTo(String value) {
            addCriterion("house_address_country =", value, "houseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCountryNotEqualTo(String value) {
            addCriterion("house_address_country <>", value, "houseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCountryGreaterThan(String value) {
            addCriterion("house_address_country >", value, "houseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCountryGreaterThanOrEqualTo(String value) {
            addCriterion("house_address_country >=", value, "houseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCountryLessThan(String value) {
            addCriterion("house_address_country <", value, "houseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCountryLessThanOrEqualTo(String value) {
            addCriterion("house_address_country <=", value, "houseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCountryLike(String value) {
            addCriterion("house_address_country like", value, "houseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCountryNotLike(String value) {
            addCriterion("house_address_country not like", value, "houseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCountryIn(List<String> values) {
            addCriterion("house_address_country in", values, "houseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCountryNotIn(List<String> values) {
            addCriterion("house_address_country not in", values, "houseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCountryBetween(String value1, String value2) {
            addCriterion("house_address_country between", value1, value2, "houseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andHouseAddressCountryNotBetween(String value1, String value2) {
            addCriterion("house_address_country not between", value1, value2, "houseAddressCountry");
            return (Criteria) this;
        }

        public Criteria andHouseAddressDetailIsNull() {
            addCriterion("house_address_detail is null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressDetailIsNotNull() {
            addCriterion("house_address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressDetailEqualTo(String value) {
            addCriterion("house_address_detail =", value, "houseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHouseAddressDetailNotEqualTo(String value) {
            addCriterion("house_address_detail <>", value, "houseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHouseAddressDetailGreaterThan(String value) {
            addCriterion("house_address_detail >", value, "houseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHouseAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("house_address_detail >=", value, "houseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHouseAddressDetailLessThan(String value) {
            addCriterion("house_address_detail <", value, "houseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHouseAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("house_address_detail <=", value, "houseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHouseAddressDetailLike(String value) {
            addCriterion("house_address_detail like", value, "houseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHouseAddressDetailNotLike(String value) {
            addCriterion("house_address_detail not like", value, "houseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHouseAddressDetailIn(List<String> values) {
            addCriterion("house_address_detail in", values, "houseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHouseAddressDetailNotIn(List<String> values) {
            addCriterion("house_address_detail not in", values, "houseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHouseAddressDetailBetween(String value1, String value2) {
            addCriterion("house_address_detail between", value1, value2, "houseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHouseAddressDetailNotBetween(String value1, String value2) {
            addCriterion("house_address_detail not between", value1, value2, "houseAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCertValidityStartIsNull() {
            addCriterion("cert_validity_start is null");
            return (Criteria) this;
        }

        public Criteria andCertValidityStartIsNotNull() {
            addCriterion("cert_validity_start is not null");
            return (Criteria) this;
        }

        public Criteria andCertValidityStartEqualTo(Date value) {
            addCriterion("cert_validity_start =", value, "certValidityStart");
            return (Criteria) this;
        }

        public Criteria andCertValidityStartNotEqualTo(Date value) {
            addCriterion("cert_validity_start <>", value, "certValidityStart");
            return (Criteria) this;
        }

        public Criteria andCertValidityStartGreaterThan(Date value) {
            addCriterion("cert_validity_start >", value, "certValidityStart");
            return (Criteria) this;
        }

        public Criteria andCertValidityStartGreaterThanOrEqualTo(Date value) {
            addCriterion("cert_validity_start >=", value, "certValidityStart");
            return (Criteria) this;
        }

        public Criteria andCertValidityStartLessThan(Date value) {
            addCriterion("cert_validity_start <", value, "certValidityStart");
            return (Criteria) this;
        }

        public Criteria andCertValidityStartLessThanOrEqualTo(Date value) {
            addCriterion("cert_validity_start <=", value, "certValidityStart");
            return (Criteria) this;
        }

        public Criteria andCertValidityStartIn(List<Date> values) {
            addCriterion("cert_validity_start in", values, "certValidityStart");
            return (Criteria) this;
        }

        public Criteria andCertValidityStartNotIn(List<Date> values) {
            addCriterion("cert_validity_start not in", values, "certValidityStart");
            return (Criteria) this;
        }

        public Criteria andCertValidityStartBetween(Date value1, Date value2) {
            addCriterion("cert_validity_start between", value1, value2, "certValidityStart");
            return (Criteria) this;
        }

        public Criteria andCertValidityStartNotBetween(Date value1, Date value2) {
            addCriterion("cert_validity_start not between", value1, value2, "certValidityStart");
            return (Criteria) this;
        }

        public Criteria andCertValidityEndIsNull() {
            addCriterion("cert_validity_end is null");
            return (Criteria) this;
        }

        public Criteria andCertValidityEndIsNotNull() {
            addCriterion("cert_validity_end is not null");
            return (Criteria) this;
        }

        public Criteria andCertValidityEndEqualTo(Date value) {
            addCriterion("cert_validity_end =", value, "certValidityEnd");
            return (Criteria) this;
        }

        public Criteria andCertValidityEndNotEqualTo(Date value) {
            addCriterion("cert_validity_end <>", value, "certValidityEnd");
            return (Criteria) this;
        }

        public Criteria andCertValidityEndGreaterThan(Date value) {
            addCriterion("cert_validity_end >", value, "certValidityEnd");
            return (Criteria) this;
        }

        public Criteria andCertValidityEndGreaterThanOrEqualTo(Date value) {
            addCriterion("cert_validity_end >=", value, "certValidityEnd");
            return (Criteria) this;
        }

        public Criteria andCertValidityEndLessThan(Date value) {
            addCriterion("cert_validity_end <", value, "certValidityEnd");
            return (Criteria) this;
        }

        public Criteria andCertValidityEndLessThanOrEqualTo(Date value) {
            addCriterion("cert_validity_end <=", value, "certValidityEnd");
            return (Criteria) this;
        }

        public Criteria andCertValidityEndIn(List<Date> values) {
            addCriterion("cert_validity_end in", values, "certValidityEnd");
            return (Criteria) this;
        }

        public Criteria andCertValidityEndNotIn(List<Date> values) {
            addCriterion("cert_validity_end not in", values, "certValidityEnd");
            return (Criteria) this;
        }

        public Criteria andCertValidityEndBetween(Date value1, Date value2) {
            addCriterion("cert_validity_end between", value1, value2, "certValidityEnd");
            return (Criteria) this;
        }

        public Criteria andCertValidityEndNotBetween(Date value1, Date value2) {
            addCriterion("cert_validity_end not between", value1, value2, "certValidityEnd");
            return (Criteria) this;
        }

        public Criteria andProfessionalIsNull() {
            addCriterion("professional is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalIsNotNull() {
            addCriterion("professional is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalEqualTo(String value) {
            addCriterion("professional =", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotEqualTo(String value) {
            addCriterion("professional <>", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalGreaterThan(String value) {
            addCriterion("professional >", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalGreaterThanOrEqualTo(String value) {
            addCriterion("professional >=", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLessThan(String value) {
            addCriterion("professional <", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLessThanOrEqualTo(String value) {
            addCriterion("professional <=", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLike(String value) {
            addCriterion("professional like", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotLike(String value) {
            addCriterion("professional not like", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalIn(List<String> values) {
            addCriterion("professional in", values, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotIn(List<String> values) {
            addCriterion("professional not in", values, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalBetween(String value1, String value2) {
            addCriterion("professional between", value1, value2, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotBetween(String value1, String value2) {
            addCriterion("professional not between", value1, value2, "professional");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIsNull() {
            addCriterion("is_effective is null");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIsNotNull() {
            addCriterion("is_effective is not null");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveEqualTo(Integer value) {
            addCriterion("is_effective =", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotEqualTo(Integer value) {
            addCriterion("is_effective <>", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveGreaterThan(Integer value) {
            addCriterion("is_effective >", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_effective >=", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLessThan(Integer value) {
            addCriterion("is_effective <", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLessThanOrEqualTo(Integer value) {
            addCriterion("is_effective <=", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIn(List<Integer> values) {
            addCriterion("is_effective in", values, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotIn(List<Integer> values) {
            addCriterion("is_effective not in", values, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveBetween(Integer value1, Integer value2) {
            addCriterion("is_effective between", value1, value2, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotBetween(Integer value1, Integer value2) {
            addCriterion("is_effective not between", value1, value2, "isEffective");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreIsNull() {
            addCriterion("zhima_score is null");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreIsNotNull() {
            addCriterion("zhima_score is not null");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreEqualTo(Integer value) {
            addCriterion("zhima_score =", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreNotEqualTo(Integer value) {
            addCriterion("zhima_score <>", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreGreaterThan(Integer value) {
            addCriterion("zhima_score >", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhima_score >=", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreLessThan(Integer value) {
            addCriterion("zhima_score <", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreLessThanOrEqualTo(Integer value) {
            addCriterion("zhima_score <=", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreIn(List<Integer> values) {
            addCriterion("zhima_score in", values, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreNotIn(List<Integer> values) {
            addCriterion("zhima_score not in", values, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreBetween(Integer value1, Integer value2) {
            addCriterion("zhima_score between", value1, value2, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("zhima_score not between", value1, value2, "zhimaScore");
            return (Criteria) this;
        }
    }

    /**
     * person_info表的操作类
     * 
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * person_info表的操作类
     * 
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