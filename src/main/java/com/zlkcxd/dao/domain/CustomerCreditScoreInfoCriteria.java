package com.zlkcxd.dao.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerCreditScoreInfoCriteria {
    /**
     * customer_credit_score_info表的操作属性:orderByClause
     * 
     */
    protected String orderByClause;

    /**
     * customer_credit_score_info表的操作属性:start
     * 
     */
    protected int start;

    /**
     * customer_credit_score_info表的操作属性:limit
     * 
     */
    protected int limit;

    /**
     * customer_credit_score_info表的操作属性:distinct
     * 
     */
    protected boolean distinct;

    /**
     * customer_credit_score_info表的操作属性:oredCriteria
     * 
     */
    protected List<Criteria> oredCriteria;

    /**
     * customer_credit_score_info数据表的操作方法: CustomerCreditScoreInfoCriteria  
     * 
     */
    public CustomerCreditScoreInfoCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * customer_credit_score_info数据表的操作方法: setOrderByClause  
     * 
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * customer_credit_score_info数据表的操作方法: getOrderByClause  
     * 
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * customer_credit_score_info数据表的操作方法: setStart  
     * 
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * customer_credit_score_info数据表的操作方法: getStart  
     * 
     */
    public int getStart() {
        return start;
    }

    /**
     * customer_credit_score_info数据表的操作方法: setLimit  
     * 
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * customer_credit_score_info数据表的操作方法: getLimit  
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * customer_credit_score_info数据表的操作方法: setDistinct  
     * 
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * customer_credit_score_info数据表的操作方法: isDistinct  
     * 
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * customer_credit_score_info数据表的操作方法: getOredCriteria  
     * 
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * customer_credit_score_info数据表的操作方法: or  
     * 
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * customer_credit_score_info数据表的操作方法: or  
     * 
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * customer_credit_score_info数据表的操作方法: createCriteria  
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
     * customer_credit_score_info数据表的操作方法: createCriteriaInternal  
     * 
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * customer_credit_score_info数据表的操作方法: clear  
     * 
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * customer_credit_score_info表的操作类
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

        public Criteria andCustomerCreditIdIsNull() {
            addCriterion("customer_credit_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditIdIsNotNull() {
            addCriterion("customer_credit_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditIdEqualTo(Long value) {
            addCriterion("customer_credit_id =", value, "customerCreditId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditIdNotEqualTo(Long value) {
            addCriterion("customer_credit_id <>", value, "customerCreditId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditIdGreaterThan(Long value) {
            addCriterion("customer_credit_id >", value, "customerCreditId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditIdGreaterThanOrEqualTo(Long value) {
            addCriterion("customer_credit_id >=", value, "customerCreditId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditIdLessThan(Long value) {
            addCriterion("customer_credit_id <", value, "customerCreditId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditIdLessThanOrEqualTo(Long value) {
            addCriterion("customer_credit_id <=", value, "customerCreditId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditIdIn(List<Long> values) {
            addCriterion("customer_credit_id in", values, "customerCreditId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditIdNotIn(List<Long> values) {
            addCriterion("customer_credit_id not in", values, "customerCreditId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditIdBetween(Long value1, Long value2) {
            addCriterion("customer_credit_id between", value1, value2, "customerCreditId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditIdNotBetween(Long value1, Long value2) {
            addCriterion("customer_credit_id not between", value1, value2, "customerCreditId");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckDataIsNull() {
            addCriterion("td_preloancheck_data is null");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckDataIsNotNull() {
            addCriterion("td_preloancheck_data is not null");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckDataEqualTo(String value) {
            addCriterion("td_preloancheck_data =", value, "tdPreloancheckData");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckDataNotEqualTo(String value) {
            addCriterion("td_preloancheck_data <>", value, "tdPreloancheckData");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckDataGreaterThan(String value) {
            addCriterion("td_preloancheck_data >", value, "tdPreloancheckData");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckDataGreaterThanOrEqualTo(String value) {
            addCriterion("td_preloancheck_data >=", value, "tdPreloancheckData");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckDataLessThan(String value) {
            addCriterion("td_preloancheck_data <", value, "tdPreloancheckData");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckDataLessThanOrEqualTo(String value) {
            addCriterion("td_preloancheck_data <=", value, "tdPreloancheckData");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckDataLike(String value) {
            addCriterion("td_preloancheck_data like", value, "tdPreloancheckData");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckDataNotLike(String value) {
            addCriterion("td_preloancheck_data not like", value, "tdPreloancheckData");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckDataIn(List<String> values) {
            addCriterion("td_preloancheck_data in", values, "tdPreloancheckData");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckDataNotIn(List<String> values) {
            addCriterion("td_preloancheck_data not in", values, "tdPreloancheckData");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckDataBetween(String value1, String value2) {
            addCriterion("td_preloancheck_data between", value1, value2, "tdPreloancheckData");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckDataNotBetween(String value1, String value2) {
            addCriterion("td_preloancheck_data not between", value1, value2, "tdPreloancheckData");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionDataIsNull() {
            addCriterion("bqs_risk_decision_data is null");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionDataIsNotNull() {
            addCriterion("bqs_risk_decision_data is not null");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionDataEqualTo(String value) {
            addCriterion("bqs_risk_decision_data =", value, "bqsRiskDecisionData");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionDataNotEqualTo(String value) {
            addCriterion("bqs_risk_decision_data <>", value, "bqsRiskDecisionData");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionDataGreaterThan(String value) {
            addCriterion("bqs_risk_decision_data >", value, "bqsRiskDecisionData");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionDataGreaterThanOrEqualTo(String value) {
            addCriterion("bqs_risk_decision_data >=", value, "bqsRiskDecisionData");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionDataLessThan(String value) {
            addCriterion("bqs_risk_decision_data <", value, "bqsRiskDecisionData");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionDataLessThanOrEqualTo(String value) {
            addCriterion("bqs_risk_decision_data <=", value, "bqsRiskDecisionData");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionDataLike(String value) {
            addCriterion("bqs_risk_decision_data like", value, "bqsRiskDecisionData");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionDataNotLike(String value) {
            addCriterion("bqs_risk_decision_data not like", value, "bqsRiskDecisionData");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionDataIn(List<String> values) {
            addCriterion("bqs_risk_decision_data in", values, "bqsRiskDecisionData");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionDataNotIn(List<String> values) {
            addCriterion("bqs_risk_decision_data not in", values, "bqsRiskDecisionData");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionDataBetween(String value1, String value2) {
            addCriterion("bqs_risk_decision_data between", value1, value2, "bqsRiskDecisionData");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionDataNotBetween(String value1, String value2) {
            addCriterion("bqs_risk_decision_data not between", value1, value2, "bqsRiskDecisionData");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskDataIsNull() {
            addCriterion("py_person_risk_data is null");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskDataIsNotNull() {
            addCriterion("py_person_risk_data is not null");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskDataEqualTo(String value) {
            addCriterion("py_person_risk_data =", value, "pyPersonRiskData");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskDataNotEqualTo(String value) {
            addCriterion("py_person_risk_data <>", value, "pyPersonRiskData");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskDataGreaterThan(String value) {
            addCriterion("py_person_risk_data >", value, "pyPersonRiskData");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskDataGreaterThanOrEqualTo(String value) {
            addCriterion("py_person_risk_data >=", value, "pyPersonRiskData");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskDataLessThan(String value) {
            addCriterion("py_person_risk_data <", value, "pyPersonRiskData");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskDataLessThanOrEqualTo(String value) {
            addCriterion("py_person_risk_data <=", value, "pyPersonRiskData");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskDataLike(String value) {
            addCriterion("py_person_risk_data like", value, "pyPersonRiskData");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskDataNotLike(String value) {
            addCriterion("py_person_risk_data not like", value, "pyPersonRiskData");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskDataIn(List<String> values) {
            addCriterion("py_person_risk_data in", values, "pyPersonRiskData");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskDataNotIn(List<String> values) {
            addCriterion("py_person_risk_data not in", values, "pyPersonRiskData");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskDataBetween(String value1, String value2) {
            addCriterion("py_person_risk_data between", value1, value2, "pyPersonRiskData");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskDataNotBetween(String value1, String value2) {
            addCriterion("py_person_risk_data not between", value1, value2, "pyPersonRiskData");
            return (Criteria) this;
        }

        public Criteria andPyEducationDataIsNull() {
            addCriterion("py_education_data is null");
            return (Criteria) this;
        }

        public Criteria andPyEducationDataIsNotNull() {
            addCriterion("py_education_data is not null");
            return (Criteria) this;
        }

        public Criteria andPyEducationDataEqualTo(String value) {
            addCriterion("py_education_data =", value, "pyEducationData");
            return (Criteria) this;
        }

        public Criteria andPyEducationDataNotEqualTo(String value) {
            addCriterion("py_education_data <>", value, "pyEducationData");
            return (Criteria) this;
        }

        public Criteria andPyEducationDataGreaterThan(String value) {
            addCriterion("py_education_data >", value, "pyEducationData");
            return (Criteria) this;
        }

        public Criteria andPyEducationDataGreaterThanOrEqualTo(String value) {
            addCriterion("py_education_data >=", value, "pyEducationData");
            return (Criteria) this;
        }

        public Criteria andPyEducationDataLessThan(String value) {
            addCriterion("py_education_data <", value, "pyEducationData");
            return (Criteria) this;
        }

        public Criteria andPyEducationDataLessThanOrEqualTo(String value) {
            addCriterion("py_education_data <=", value, "pyEducationData");
            return (Criteria) this;
        }

        public Criteria andPyEducationDataLike(String value) {
            addCriterion("py_education_data like", value, "pyEducationData");
            return (Criteria) this;
        }

        public Criteria andPyEducationDataNotLike(String value) {
            addCriterion("py_education_data not like", value, "pyEducationData");
            return (Criteria) this;
        }

        public Criteria andPyEducationDataIn(List<String> values) {
            addCriterion("py_education_data in", values, "pyEducationData");
            return (Criteria) this;
        }

        public Criteria andPyEducationDataNotIn(List<String> values) {
            addCriterion("py_education_data not in", values, "pyEducationData");
            return (Criteria) this;
        }

        public Criteria andPyEducationDataBetween(String value1, String value2) {
            addCriterion("py_education_data between", value1, value2, "pyEducationData");
            return (Criteria) this;
        }

        public Criteria andPyEducationDataNotBetween(String value1, String value2) {
            addCriterion("py_education_data not between", value1, value2, "pyEducationData");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeDataIsNull() {
            addCriterion("py_phone_usetime_data is null");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeDataIsNotNull() {
            addCriterion("py_phone_usetime_data is not null");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeDataEqualTo(String value) {
            addCriterion("py_phone_usetime_data =", value, "pyPhoneUsetimeData");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeDataNotEqualTo(String value) {
            addCriterion("py_phone_usetime_data <>", value, "pyPhoneUsetimeData");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeDataGreaterThan(String value) {
            addCriterion("py_phone_usetime_data >", value, "pyPhoneUsetimeData");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeDataGreaterThanOrEqualTo(String value) {
            addCriterion("py_phone_usetime_data >=", value, "pyPhoneUsetimeData");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeDataLessThan(String value) {
            addCriterion("py_phone_usetime_data <", value, "pyPhoneUsetimeData");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeDataLessThanOrEqualTo(String value) {
            addCriterion("py_phone_usetime_data <=", value, "pyPhoneUsetimeData");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeDataLike(String value) {
            addCriterion("py_phone_usetime_data like", value, "pyPhoneUsetimeData");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeDataNotLike(String value) {
            addCriterion("py_phone_usetime_data not like", value, "pyPhoneUsetimeData");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeDataIn(List<String> values) {
            addCriterion("py_phone_usetime_data in", values, "pyPhoneUsetimeData");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeDataNotIn(List<String> values) {
            addCriterion("py_phone_usetime_data not in", values, "pyPhoneUsetimeData");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeDataBetween(String value1, String value2) {
            addCriterion("py_phone_usetime_data between", value1, value2, "pyPhoneUsetimeData");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeDataNotBetween(String value1, String value2) {
            addCriterion("py_phone_usetime_data not between", value1, value2, "pyPhoneUsetimeData");
            return (Criteria) this;
        }

        public Criteria andZmScoreIsNull() {
            addCriterion("zm_score is null");
            return (Criteria) this;
        }

        public Criteria andZmScoreIsNotNull() {
            addCriterion("zm_score is not null");
            return (Criteria) this;
        }

        public Criteria andZmScoreEqualTo(Integer value) {
            addCriterion("zm_score =", value, "zmScore");
            return (Criteria) this;
        }

        public Criteria andZmScoreNotEqualTo(Integer value) {
            addCriterion("zm_score <>", value, "zmScore");
            return (Criteria) this;
        }

        public Criteria andZmScoreGreaterThan(Integer value) {
            addCriterion("zm_score >", value, "zmScore");
            return (Criteria) this;
        }

        public Criteria andZmScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("zm_score >=", value, "zmScore");
            return (Criteria) this;
        }

        public Criteria andZmScoreLessThan(Integer value) {
            addCriterion("zm_score <", value, "zmScore");
            return (Criteria) this;
        }

        public Criteria andZmScoreLessThanOrEqualTo(Integer value) {
            addCriterion("zm_score <=", value, "zmScore");
            return (Criteria) this;
        }

        public Criteria andZmScoreIn(List<Integer> values) {
            addCriterion("zm_score in", values, "zmScore");
            return (Criteria) this;
        }

        public Criteria andZmScoreNotIn(List<Integer> values) {
            addCriterion("zm_score not in", values, "zmScore");
            return (Criteria) this;
        }

        public Criteria andZmScoreBetween(Integer value1, Integer value2) {
            addCriterion("zm_score between", value1, value2, "zmScore");
            return (Criteria) this;
        }

        public Criteria andZmScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("zm_score not between", value1, value2, "zmScore");
            return (Criteria) this;
        }

        public Criteria andPyEducationIsNull() {
            addCriterion("py_education is null");
            return (Criteria) this;
        }

        public Criteria andPyEducationIsNotNull() {
            addCriterion("py_education is not null");
            return (Criteria) this;
        }

        public Criteria andPyEducationEqualTo(String value) {
            addCriterion("py_education =", value, "pyEducation");
            return (Criteria) this;
        }

        public Criteria andPyEducationNotEqualTo(String value) {
            addCriterion("py_education <>", value, "pyEducation");
            return (Criteria) this;
        }

        public Criteria andPyEducationGreaterThan(String value) {
            addCriterion("py_education >", value, "pyEducation");
            return (Criteria) this;
        }

        public Criteria andPyEducationGreaterThanOrEqualTo(String value) {
            addCriterion("py_education >=", value, "pyEducation");
            return (Criteria) this;
        }

        public Criteria andPyEducationLessThan(String value) {
            addCriterion("py_education <", value, "pyEducation");
            return (Criteria) this;
        }

        public Criteria andPyEducationLessThanOrEqualTo(String value) {
            addCriterion("py_education <=", value, "pyEducation");
            return (Criteria) this;
        }

        public Criteria andPyEducationLike(String value) {
            addCriterion("py_education like", value, "pyEducation");
            return (Criteria) this;
        }

        public Criteria andPyEducationNotLike(String value) {
            addCriterion("py_education not like", value, "pyEducation");
            return (Criteria) this;
        }

        public Criteria andPyEducationIn(List<String> values) {
            addCriterion("py_education in", values, "pyEducation");
            return (Criteria) this;
        }

        public Criteria andPyEducationNotIn(List<String> values) {
            addCriterion("py_education not in", values, "pyEducation");
            return (Criteria) this;
        }

        public Criteria andPyEducationBetween(String value1, String value2) {
            addCriterion("py_education between", value1, value2, "pyEducation");
            return (Criteria) this;
        }

        public Criteria andPyEducationNotBetween(String value1, String value2) {
            addCriterion("py_education not between", value1, value2, "pyEducation");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckScoreIsNull() {
            addCriterion("td_preloancheck_score is null");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckScoreIsNotNull() {
            addCriterion("td_preloancheck_score is not null");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckScoreEqualTo(Integer value) {
            addCriterion("td_preloancheck_score =", value, "tdPreloancheckScore");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckScoreNotEqualTo(Integer value) {
            addCriterion("td_preloancheck_score <>", value, "tdPreloancheckScore");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckScoreGreaterThan(Integer value) {
            addCriterion("td_preloancheck_score >", value, "tdPreloancheckScore");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("td_preloancheck_score >=", value, "tdPreloancheckScore");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckScoreLessThan(Integer value) {
            addCriterion("td_preloancheck_score <", value, "tdPreloancheckScore");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckScoreLessThanOrEqualTo(Integer value) {
            addCriterion("td_preloancheck_score <=", value, "tdPreloancheckScore");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckScoreIn(List<Integer> values) {
            addCriterion("td_preloancheck_score in", values, "tdPreloancheckScore");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckScoreNotIn(List<Integer> values) {
            addCriterion("td_preloancheck_score not in", values, "tdPreloancheckScore");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckScoreBetween(Integer value1, Integer value2) {
            addCriterion("td_preloancheck_score between", value1, value2, "tdPreloancheckScore");
            return (Criteria) this;
        }

        public Criteria andTdPreloancheckScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("td_preloancheck_score not between", value1, value2, "tdPreloancheckScore");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionIsNull() {
            addCriterion("bqs_risk_decision is null");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionIsNotNull() {
            addCriterion("bqs_risk_decision is not null");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionEqualTo(String value) {
            addCriterion("bqs_risk_decision =", value, "bqsRiskDecision");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionNotEqualTo(String value) {
            addCriterion("bqs_risk_decision <>", value, "bqsRiskDecision");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionGreaterThan(String value) {
            addCriterion("bqs_risk_decision >", value, "bqsRiskDecision");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionGreaterThanOrEqualTo(String value) {
            addCriterion("bqs_risk_decision >=", value, "bqsRiskDecision");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionLessThan(String value) {
            addCriterion("bqs_risk_decision <", value, "bqsRiskDecision");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionLessThanOrEqualTo(String value) {
            addCriterion("bqs_risk_decision <=", value, "bqsRiskDecision");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionLike(String value) {
            addCriterion("bqs_risk_decision like", value, "bqsRiskDecision");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionNotLike(String value) {
            addCriterion("bqs_risk_decision not like", value, "bqsRiskDecision");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionIn(List<String> values) {
            addCriterion("bqs_risk_decision in", values, "bqsRiskDecision");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionNotIn(List<String> values) {
            addCriterion("bqs_risk_decision not in", values, "bqsRiskDecision");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionBetween(String value1, String value2) {
            addCriterion("bqs_risk_decision between", value1, value2, "bqsRiskDecision");
            return (Criteria) this;
        }

        public Criteria andBqsRiskDecisionNotBetween(String value1, String value2) {
            addCriterion("bqs_risk_decision not between", value1, value2, "bqsRiskDecision");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskScoreIsNull() {
            addCriterion("py_person_risk_score is null");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskScoreIsNotNull() {
            addCriterion("py_person_risk_score is not null");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskScoreEqualTo(Integer value) {
            addCriterion("py_person_risk_score =", value, "pyPersonRiskScore");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskScoreNotEqualTo(Integer value) {
            addCriterion("py_person_risk_score <>", value, "pyPersonRiskScore");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskScoreGreaterThan(Integer value) {
            addCriterion("py_person_risk_score >", value, "pyPersonRiskScore");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("py_person_risk_score >=", value, "pyPersonRiskScore");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskScoreLessThan(Integer value) {
            addCriterion("py_person_risk_score <", value, "pyPersonRiskScore");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskScoreLessThanOrEqualTo(Integer value) {
            addCriterion("py_person_risk_score <=", value, "pyPersonRiskScore");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskScoreIn(List<Integer> values) {
            addCriterion("py_person_risk_score in", values, "pyPersonRiskScore");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskScoreNotIn(List<Integer> values) {
            addCriterion("py_person_risk_score not in", values, "pyPersonRiskScore");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskScoreBetween(Integer value1, Integer value2) {
            addCriterion("py_person_risk_score between", value1, value2, "pyPersonRiskScore");
            return (Criteria) this;
        }

        public Criteria andPyPersonRiskScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("py_person_risk_score not between", value1, value2, "pyPersonRiskScore");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeIsNull() {
            addCriterion("py_phone_usetime is null");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeIsNotNull() {
            addCriterion("py_phone_usetime is not null");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeEqualTo(String value) {
            addCriterion("py_phone_usetime =", value, "pyPhoneUsetime");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeNotEqualTo(String value) {
            addCriterion("py_phone_usetime <>", value, "pyPhoneUsetime");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeGreaterThan(String value) {
            addCriterion("py_phone_usetime >", value, "pyPhoneUsetime");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeGreaterThanOrEqualTo(String value) {
            addCriterion("py_phone_usetime >=", value, "pyPhoneUsetime");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeLessThan(String value) {
            addCriterion("py_phone_usetime <", value, "pyPhoneUsetime");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeLessThanOrEqualTo(String value) {
            addCriterion("py_phone_usetime <=", value, "pyPhoneUsetime");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeLike(String value) {
            addCriterion("py_phone_usetime like", value, "pyPhoneUsetime");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeNotLike(String value) {
            addCriterion("py_phone_usetime not like", value, "pyPhoneUsetime");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeIn(List<String> values) {
            addCriterion("py_phone_usetime in", values, "pyPhoneUsetime");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeNotIn(List<String> values) {
            addCriterion("py_phone_usetime not in", values, "pyPhoneUsetime");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeBetween(String value1, String value2) {
            addCriterion("py_phone_usetime between", value1, value2, "pyPhoneUsetime");
            return (Criteria) this;
        }

        public Criteria andPyPhoneUsetimeNotBetween(String value1, String value2) {
            addCriterion("py_phone_usetime not between", value1, value2, "pyPhoneUsetime");
            return (Criteria) this;
        }

        public Criteria andCreditScoreIsNull() {
            addCriterion("credit_score is null");
            return (Criteria) this;
        }

        public Criteria andCreditScoreIsNotNull() {
            addCriterion("credit_score is not null");
            return (Criteria) this;
        }

        public Criteria andCreditScoreEqualTo(Integer value) {
            addCriterion("credit_score =", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotEqualTo(Integer value) {
            addCriterion("credit_score <>", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreGreaterThan(Integer value) {
            addCriterion("credit_score >", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_score >=", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreLessThan(Integer value) {
            addCriterion("credit_score <", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreLessThanOrEqualTo(Integer value) {
            addCriterion("credit_score <=", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreIn(List<Integer> values) {
            addCriterion("credit_score in", values, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotIn(List<Integer> values) {
            addCriterion("credit_score not in", values, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreBetween(Integer value1, Integer value2) {
            addCriterion("credit_score between", value1, value2, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_score not between", value1, value2, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIsNull() {
            addCriterion("credit_amount is null");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIsNotNull() {
            addCriterion("credit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCreditAmountEqualTo(Long value) {
            addCriterion("credit_amount =", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotEqualTo(Long value) {
            addCriterion("credit_amount <>", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountGreaterThan(Long value) {
            addCriterion("credit_amount >", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("credit_amount >=", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountLessThan(Long value) {
            addCriterion("credit_amount <", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountLessThanOrEqualTo(Long value) {
            addCriterion("credit_amount <=", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIn(List<Long> values) {
            addCriterion("credit_amount in", values, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotIn(List<Long> values) {
            addCriterion("credit_amount not in", values, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountBetween(Long value1, Long value2) {
            addCriterion("credit_amount between", value1, value2, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotBetween(Long value1, Long value2) {
            addCriterion("credit_amount not between", value1, value2, "creditAmount");
            return (Criteria) this;
        }
    }

    /**
     * customer_credit_score_info表的操作类
     * 
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * customer_credit_score_info表的操作类
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