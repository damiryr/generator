package com.zlkcxd.dao.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerInfoUpdateRecordCriteria {
    /**
     * customer_info_update_record表的操作属性:orderByClause
     * 
     */
    protected String orderByClause;

    /**
     * customer_info_update_record表的操作属性:start
     * 
     */
    protected int start;

    /**
     * customer_info_update_record表的操作属性:limit
     * 
     */
    protected int limit;

    /**
     * customer_info_update_record表的操作属性:distinct
     * 
     */
    protected boolean distinct;

    /**
     * customer_info_update_record表的操作属性:oredCriteria
     * 
     */
    protected List<Criteria> oredCriteria;

    /**
     * customer_info_update_record数据表的操作方法: CustomerInfoUpdateRecordCriteria  
     * 
     */
    public CustomerInfoUpdateRecordCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * customer_info_update_record数据表的操作方法: setOrderByClause  
     * 
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * customer_info_update_record数据表的操作方法: getOrderByClause  
     * 
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * customer_info_update_record数据表的操作方法: setStart  
     * 
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * customer_info_update_record数据表的操作方法: getStart  
     * 
     */
    public int getStart() {
        return start;
    }

    /**
     * customer_info_update_record数据表的操作方法: setLimit  
     * 
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * customer_info_update_record数据表的操作方法: getLimit  
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * customer_info_update_record数据表的操作方法: setDistinct  
     * 
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * customer_info_update_record数据表的操作方法: isDistinct  
     * 
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * customer_info_update_record数据表的操作方法: getOredCriteria  
     * 
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * customer_info_update_record数据表的操作方法: or  
     * 
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * customer_info_update_record数据表的操作方法: or  
     * 
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * customer_info_update_record数据表的操作方法: createCriteria  
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
     * customer_info_update_record数据表的操作方法: createCriteriaInternal  
     * 
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * customer_info_update_record数据表的操作方法: clear  
     * 
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * customer_info_update_record表的操作类
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

        public Criteria andBeforeCustomerNameIsNull() {
            addCriterion("before_customer_name is null");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerNameIsNotNull() {
            addCriterion("before_customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerNameEqualTo(String value) {
            addCriterion("before_customer_name =", value, "beforeCustomerName");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerNameNotEqualTo(String value) {
            addCriterion("before_customer_name <>", value, "beforeCustomerName");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerNameGreaterThan(String value) {
            addCriterion("before_customer_name >", value, "beforeCustomerName");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("before_customer_name >=", value, "beforeCustomerName");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerNameLessThan(String value) {
            addCriterion("before_customer_name <", value, "beforeCustomerName");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("before_customer_name <=", value, "beforeCustomerName");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerNameLike(String value) {
            addCriterion("before_customer_name like", value, "beforeCustomerName");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerNameNotLike(String value) {
            addCriterion("before_customer_name not like", value, "beforeCustomerName");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerNameIn(List<String> values) {
            addCriterion("before_customer_name in", values, "beforeCustomerName");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerNameNotIn(List<String> values) {
            addCriterion("before_customer_name not in", values, "beforeCustomerName");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerNameBetween(String value1, String value2) {
            addCriterion("before_customer_name between", value1, value2, "beforeCustomerName");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerNameNotBetween(String value1, String value2) {
            addCriterion("before_customer_name not between", value1, value2, "beforeCustomerName");
            return (Criteria) this;
        }

        public Criteria andBeforeCertNoIsNull() {
            addCriterion("before_cert_no is null");
            return (Criteria) this;
        }

        public Criteria andBeforeCertNoIsNotNull() {
            addCriterion("before_cert_no is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeCertNoEqualTo(String value) {
            addCriterion("before_cert_no =", value, "beforeCertNo");
            return (Criteria) this;
        }

        public Criteria andBeforeCertNoNotEqualTo(String value) {
            addCriterion("before_cert_no <>", value, "beforeCertNo");
            return (Criteria) this;
        }

        public Criteria andBeforeCertNoGreaterThan(String value) {
            addCriterion("before_cert_no >", value, "beforeCertNo");
            return (Criteria) this;
        }

        public Criteria andBeforeCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("before_cert_no >=", value, "beforeCertNo");
            return (Criteria) this;
        }

        public Criteria andBeforeCertNoLessThan(String value) {
            addCriterion("before_cert_no <", value, "beforeCertNo");
            return (Criteria) this;
        }

        public Criteria andBeforeCertNoLessThanOrEqualTo(String value) {
            addCriterion("before_cert_no <=", value, "beforeCertNo");
            return (Criteria) this;
        }

        public Criteria andBeforeCertNoLike(String value) {
            addCriterion("before_cert_no like", value, "beforeCertNo");
            return (Criteria) this;
        }

        public Criteria andBeforeCertNoNotLike(String value) {
            addCriterion("before_cert_no not like", value, "beforeCertNo");
            return (Criteria) this;
        }

        public Criteria andBeforeCertNoIn(List<String> values) {
            addCriterion("before_cert_no in", values, "beforeCertNo");
            return (Criteria) this;
        }

        public Criteria andBeforeCertNoNotIn(List<String> values) {
            addCriterion("before_cert_no not in", values, "beforeCertNo");
            return (Criteria) this;
        }

        public Criteria andBeforeCertNoBetween(String value1, String value2) {
            addCriterion("before_cert_no between", value1, value2, "beforeCertNo");
            return (Criteria) this;
        }

        public Criteria andBeforeCertNoNotBetween(String value1, String value2) {
            addCriterion("before_cert_no not between", value1, value2, "beforeCertNo");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerNameIsNull() {
            addCriterion("after_customer_name is null");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerNameIsNotNull() {
            addCriterion("after_customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerNameEqualTo(String value) {
            addCriterion("after_customer_name =", value, "afterCustomerName");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerNameNotEqualTo(String value) {
            addCriterion("after_customer_name <>", value, "afterCustomerName");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerNameGreaterThan(String value) {
            addCriterion("after_customer_name >", value, "afterCustomerName");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("after_customer_name >=", value, "afterCustomerName");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerNameLessThan(String value) {
            addCriterion("after_customer_name <", value, "afterCustomerName");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("after_customer_name <=", value, "afterCustomerName");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerNameLike(String value) {
            addCriterion("after_customer_name like", value, "afterCustomerName");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerNameNotLike(String value) {
            addCriterion("after_customer_name not like", value, "afterCustomerName");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerNameIn(List<String> values) {
            addCriterion("after_customer_name in", values, "afterCustomerName");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerNameNotIn(List<String> values) {
            addCriterion("after_customer_name not in", values, "afterCustomerName");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerNameBetween(String value1, String value2) {
            addCriterion("after_customer_name between", value1, value2, "afterCustomerName");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerNameNotBetween(String value1, String value2) {
            addCriterion("after_customer_name not between", value1, value2, "afterCustomerName");
            return (Criteria) this;
        }

        public Criteria andAfterCertNoIsNull() {
            addCriterion("after_cert_no is null");
            return (Criteria) this;
        }

        public Criteria andAfterCertNoIsNotNull() {
            addCriterion("after_cert_no is not null");
            return (Criteria) this;
        }

        public Criteria andAfterCertNoEqualTo(String value) {
            addCriterion("after_cert_no =", value, "afterCertNo");
            return (Criteria) this;
        }

        public Criteria andAfterCertNoNotEqualTo(String value) {
            addCriterion("after_cert_no <>", value, "afterCertNo");
            return (Criteria) this;
        }

        public Criteria andAfterCertNoGreaterThan(String value) {
            addCriterion("after_cert_no >", value, "afterCertNo");
            return (Criteria) this;
        }

        public Criteria andAfterCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("after_cert_no >=", value, "afterCertNo");
            return (Criteria) this;
        }

        public Criteria andAfterCertNoLessThan(String value) {
            addCriterion("after_cert_no <", value, "afterCertNo");
            return (Criteria) this;
        }

        public Criteria andAfterCertNoLessThanOrEqualTo(String value) {
            addCriterion("after_cert_no <=", value, "afterCertNo");
            return (Criteria) this;
        }

        public Criteria andAfterCertNoLike(String value) {
            addCriterion("after_cert_no like", value, "afterCertNo");
            return (Criteria) this;
        }

        public Criteria andAfterCertNoNotLike(String value) {
            addCriterion("after_cert_no not like", value, "afterCertNo");
            return (Criteria) this;
        }

        public Criteria andAfterCertNoIn(List<String> values) {
            addCriterion("after_cert_no in", values, "afterCertNo");
            return (Criteria) this;
        }

        public Criteria andAfterCertNoNotIn(List<String> values) {
            addCriterion("after_cert_no not in", values, "afterCertNo");
            return (Criteria) this;
        }

        public Criteria andAfterCertNoBetween(String value1, String value2) {
            addCriterion("after_cert_no between", value1, value2, "afterCertNo");
            return (Criteria) this;
        }

        public Criteria andAfterCertNoNotBetween(String value1, String value2) {
            addCriterion("after_cert_no not between", value1, value2, "afterCertNo");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerInfoIsNull() {
            addCriterion("before_customer_info is null");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerInfoIsNotNull() {
            addCriterion("before_customer_info is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerInfoEqualTo(String value) {
            addCriterion("before_customer_info =", value, "beforeCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerInfoNotEqualTo(String value) {
            addCriterion("before_customer_info <>", value, "beforeCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerInfoGreaterThan(String value) {
            addCriterion("before_customer_info >", value, "beforeCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerInfoGreaterThanOrEqualTo(String value) {
            addCriterion("before_customer_info >=", value, "beforeCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerInfoLessThan(String value) {
            addCriterion("before_customer_info <", value, "beforeCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerInfoLessThanOrEqualTo(String value) {
            addCriterion("before_customer_info <=", value, "beforeCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerInfoLike(String value) {
            addCriterion("before_customer_info like", value, "beforeCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerInfoNotLike(String value) {
            addCriterion("before_customer_info not like", value, "beforeCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerInfoIn(List<String> values) {
            addCriterion("before_customer_info in", values, "beforeCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerInfoNotIn(List<String> values) {
            addCriterion("before_customer_info not in", values, "beforeCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerInfoBetween(String value1, String value2) {
            addCriterion("before_customer_info between", value1, value2, "beforeCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andBeforeCustomerInfoNotBetween(String value1, String value2) {
            addCriterion("before_customer_info not between", value1, value2, "beforeCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerInfoIsNull() {
            addCriterion("after_customer_info is null");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerInfoIsNotNull() {
            addCriterion("after_customer_info is not null");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerInfoEqualTo(String value) {
            addCriterion("after_customer_info =", value, "afterCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerInfoNotEqualTo(String value) {
            addCriterion("after_customer_info <>", value, "afterCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerInfoGreaterThan(String value) {
            addCriterion("after_customer_info >", value, "afterCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerInfoGreaterThanOrEqualTo(String value) {
            addCriterion("after_customer_info >=", value, "afterCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerInfoLessThan(String value) {
            addCriterion("after_customer_info <", value, "afterCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerInfoLessThanOrEqualTo(String value) {
            addCriterion("after_customer_info <=", value, "afterCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerInfoLike(String value) {
            addCriterion("after_customer_info like", value, "afterCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerInfoNotLike(String value) {
            addCriterion("after_customer_info not like", value, "afterCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerInfoIn(List<String> values) {
            addCriterion("after_customer_info in", values, "afterCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerInfoNotIn(List<String> values) {
            addCriterion("after_customer_info not in", values, "afterCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerInfoBetween(String value1, String value2) {
            addCriterion("after_customer_info between", value1, value2, "afterCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andAfterCustomerInfoNotBetween(String value1, String value2) {
            addCriterion("after_customer_info not between", value1, value2, "afterCustomerInfo");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIsNull() {
            addCriterion("process_instance_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIsNotNull() {
            addCriterion("process_instance_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdEqualTo(String value) {
            addCriterion("process_instance_id =", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotEqualTo(String value) {
            addCriterion("process_instance_id <>", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThan(String value) {
            addCriterion("process_instance_id >", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("process_instance_id >=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThan(String value) {
            addCriterion("process_instance_id <", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThanOrEqualTo(String value) {
            addCriterion("process_instance_id <=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLike(String value) {
            addCriterion("process_instance_id like", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotLike(String value) {
            addCriterion("process_instance_id not like", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIn(List<String> values) {
            addCriterion("process_instance_id in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotIn(List<String> values) {
            addCriterion("process_instance_id not in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdBetween(String value1, String value2) {
            addCriterion("process_instance_id between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotBetween(String value1, String value2) {
            addCriterion("process_instance_id not between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Long value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Long value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Long value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Long value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Long> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Long> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Long value1, Long value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("update_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("update_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(Long value) {
            addCriterion("update_user_id =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(Long value) {
            addCriterion("update_user_id <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(Long value) {
            addCriterion("update_user_id >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_user_id >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(Long value) {
            addCriterion("update_user_id <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("update_user_id <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<Long> values) {
            addCriterion("update_user_id in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<Long> values) {
            addCriterion("update_user_id not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(Long value1, Long value2) {
            addCriterion("update_user_id between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("update_user_id not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }
    }

    /**
     * customer_info_update_record表的操作类
     * 
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * customer_info_update_record表的操作类
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