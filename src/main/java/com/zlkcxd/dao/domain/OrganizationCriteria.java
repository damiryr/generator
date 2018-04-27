package com.zlkcxd.dao.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationCriteria {
    /**
     * organization表的操作属性:orderByClause
     * 
     */
    protected String orderByClause;

    /**
     * organization表的操作属性:start
     * 
     */
    protected int start;

    /**
     * organization表的操作属性:limit
     * 
     */
    protected int limit;

    /**
     * organization表的操作属性:distinct
     * 
     */
    protected boolean distinct;

    /**
     * organization表的操作属性:oredCriteria
     * 
     */
    protected List<Criteria> oredCriteria;

    /**
     * organization数据表的操作方法: OrganizationCriteria  
     * 
     */
    public OrganizationCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * organization数据表的操作方法: setOrderByClause  
     * 
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * organization数据表的操作方法: getOrderByClause  
     * 
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * organization数据表的操作方法: setStart  
     * 
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * organization数据表的操作方法: getStart  
     * 
     */
    public int getStart() {
        return start;
    }

    /**
     * organization数据表的操作方法: setLimit  
     * 
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * organization数据表的操作方法: getLimit  
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * organization数据表的操作方法: setDistinct  
     * 
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * organization数据表的操作方法: isDistinct  
     * 
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * organization数据表的操作方法: getOredCriteria  
     * 
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * organization数据表的操作方法: or  
     * 
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * organization数据表的操作方法: or  
     * 
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * organization数据表的操作方法: createCriteria  
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
     * organization数据表的操作方法: createCriteriaInternal  
     * 
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * organization数据表的操作方法: clear  
     * 
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * organization表的操作类
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

        public Criteria andOrgNoIsNull() {
            addCriterion("org_no is null");
            return (Criteria) this;
        }

        public Criteria andOrgNoIsNotNull() {
            addCriterion("org_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNoEqualTo(String value) {
            addCriterion("org_no =", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotEqualTo(String value) {
            addCriterion("org_no <>", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThan(String value) {
            addCriterion("org_no >", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThanOrEqualTo(String value) {
            addCriterion("org_no >=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThan(String value) {
            addCriterion("org_no <", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThanOrEqualTo(String value) {
            addCriterion("org_no <=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLike(String value) {
            addCriterion("org_no like", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotLike(String value) {
            addCriterion("org_no not like", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoIn(List<String> values) {
            addCriterion("org_no in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotIn(List<String> values) {
            addCriterion("org_no not in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoBetween(String value1, String value2) {
            addCriterion("org_no between", value1, value2, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotBetween(String value1, String value2) {
            addCriterion("org_no not between", value1, value2, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andUpperOrgIdIsNull() {
            addCriterion("upper_org_id is null");
            return (Criteria) this;
        }

        public Criteria andUpperOrgIdIsNotNull() {
            addCriterion("upper_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpperOrgIdEqualTo(Long value) {
            addCriterion("upper_org_id =", value, "upperOrgId");
            return (Criteria) this;
        }

        public Criteria andUpperOrgIdNotEqualTo(Long value) {
            addCriterion("upper_org_id <>", value, "upperOrgId");
            return (Criteria) this;
        }

        public Criteria andUpperOrgIdGreaterThan(Long value) {
            addCriterion("upper_org_id >", value, "upperOrgId");
            return (Criteria) this;
        }

        public Criteria andUpperOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("upper_org_id >=", value, "upperOrgId");
            return (Criteria) this;
        }

        public Criteria andUpperOrgIdLessThan(Long value) {
            addCriterion("upper_org_id <", value, "upperOrgId");
            return (Criteria) this;
        }

        public Criteria andUpperOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("upper_org_id <=", value, "upperOrgId");
            return (Criteria) this;
        }

        public Criteria andUpperOrgIdIn(List<Long> values) {
            addCriterion("upper_org_id in", values, "upperOrgId");
            return (Criteria) this;
        }

        public Criteria andUpperOrgIdNotIn(List<Long> values) {
            addCriterion("upper_org_id not in", values, "upperOrgId");
            return (Criteria) this;
        }

        public Criteria andUpperOrgIdBetween(Long value1, Long value2) {
            addCriterion("upper_org_id between", value1, value2, "upperOrgId");
            return (Criteria) this;
        }

        public Criteria andUpperOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("upper_org_id not between", value1, value2, "upperOrgId");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNull() {
            addCriterion("org_type is null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNotNull() {
            addCriterion("org_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeEqualTo(Long value) {
            addCriterion("org_type =", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotEqualTo(Long value) {
            addCriterion("org_type <>", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThan(Long value) {
            addCriterion("org_type >", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("org_type >=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThan(Long value) {
            addCriterion("org_type <", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThanOrEqualTo(Long value) {
            addCriterion("org_type <=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIn(List<Long> values) {
            addCriterion("org_type in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotIn(List<Long> values) {
            addCriterion("org_type not in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeBetween(Long value1, Long value2) {
            addCriterion("org_type between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotBetween(Long value1, Long value2) {
            addCriterion("org_type not between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andFinancialInstituteNoIsNull() {
            addCriterion("financial_institute_no is null");
            return (Criteria) this;
        }

        public Criteria andFinancialInstituteNoIsNotNull() {
            addCriterion("financial_institute_no is not null");
            return (Criteria) this;
        }

        public Criteria andFinancialInstituteNoEqualTo(String value) {
            addCriterion("financial_institute_no =", value, "financialInstituteNo");
            return (Criteria) this;
        }

        public Criteria andFinancialInstituteNoNotEqualTo(String value) {
            addCriterion("financial_institute_no <>", value, "financialInstituteNo");
            return (Criteria) this;
        }

        public Criteria andFinancialInstituteNoGreaterThan(String value) {
            addCriterion("financial_institute_no >", value, "financialInstituteNo");
            return (Criteria) this;
        }

        public Criteria andFinancialInstituteNoGreaterThanOrEqualTo(String value) {
            addCriterion("financial_institute_no >=", value, "financialInstituteNo");
            return (Criteria) this;
        }

        public Criteria andFinancialInstituteNoLessThan(String value) {
            addCriterion("financial_institute_no <", value, "financialInstituteNo");
            return (Criteria) this;
        }

        public Criteria andFinancialInstituteNoLessThanOrEqualTo(String value) {
            addCriterion("financial_institute_no <=", value, "financialInstituteNo");
            return (Criteria) this;
        }

        public Criteria andFinancialInstituteNoLike(String value) {
            addCriterion("financial_institute_no like", value, "financialInstituteNo");
            return (Criteria) this;
        }

        public Criteria andFinancialInstituteNoNotLike(String value) {
            addCriterion("financial_institute_no not like", value, "financialInstituteNo");
            return (Criteria) this;
        }

        public Criteria andFinancialInstituteNoIn(List<String> values) {
            addCriterion("financial_institute_no in", values, "financialInstituteNo");
            return (Criteria) this;
        }

        public Criteria andFinancialInstituteNoNotIn(List<String> values) {
            addCriterion("financial_institute_no not in", values, "financialInstituteNo");
            return (Criteria) this;
        }

        public Criteria andFinancialInstituteNoBetween(String value1, String value2) {
            addCriterion("financial_institute_no between", value1, value2, "financialInstituteNo");
            return (Criteria) this;
        }

        public Criteria andFinancialInstituteNoNotBetween(String value1, String value2) {
            addCriterion("financial_institute_no not between", value1, value2, "financialInstituteNo");
            return (Criteria) this;
        }

        public Criteria andFinancialInstitueLicenseIsNull() {
            addCriterion("financial_institue_license is null");
            return (Criteria) this;
        }

        public Criteria andFinancialInstitueLicenseIsNotNull() {
            addCriterion("financial_institue_license is not null");
            return (Criteria) this;
        }

        public Criteria andFinancialInstitueLicenseEqualTo(String value) {
            addCriterion("financial_institue_license =", value, "financialInstitueLicense");
            return (Criteria) this;
        }

        public Criteria andFinancialInstitueLicenseNotEqualTo(String value) {
            addCriterion("financial_institue_license <>", value, "financialInstitueLicense");
            return (Criteria) this;
        }

        public Criteria andFinancialInstitueLicenseGreaterThan(String value) {
            addCriterion("financial_institue_license >", value, "financialInstitueLicense");
            return (Criteria) this;
        }

        public Criteria andFinancialInstitueLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("financial_institue_license >=", value, "financialInstitueLicense");
            return (Criteria) this;
        }

        public Criteria andFinancialInstitueLicenseLessThan(String value) {
            addCriterion("financial_institue_license <", value, "financialInstitueLicense");
            return (Criteria) this;
        }

        public Criteria andFinancialInstitueLicenseLessThanOrEqualTo(String value) {
            addCriterion("financial_institue_license <=", value, "financialInstitueLicense");
            return (Criteria) this;
        }

        public Criteria andFinancialInstitueLicenseLike(String value) {
            addCriterion("financial_institue_license like", value, "financialInstitueLicense");
            return (Criteria) this;
        }

        public Criteria andFinancialInstitueLicenseNotLike(String value) {
            addCriterion("financial_institue_license not like", value, "financialInstitueLicense");
            return (Criteria) this;
        }

        public Criteria andFinancialInstitueLicenseIn(List<String> values) {
            addCriterion("financial_institue_license in", values, "financialInstitueLicense");
            return (Criteria) this;
        }

        public Criteria andFinancialInstitueLicenseNotIn(List<String> values) {
            addCriterion("financial_institue_license not in", values, "financialInstitueLicense");
            return (Criteria) this;
        }

        public Criteria andFinancialInstitueLicenseBetween(String value1, String value2) {
            addCriterion("financial_institue_license between", value1, value2, "financialInstitueLicense");
            return (Criteria) this;
        }

        public Criteria andFinancialInstitueLicenseNotBetween(String value1, String value2) {
            addCriterion("financial_institue_license not between", value1, value2, "financialInstitueLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNull() {
            addCriterion("business_license is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNotNull() {
            addCriterion("business_license is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEqualTo(String value) {
            addCriterion("business_license =", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotEqualTo(String value) {
            addCriterion("business_license <>", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThan(String value) {
            addCriterion("business_license >", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("business_license >=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThan(String value) {
            addCriterion("business_license <", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThanOrEqualTo(String value) {
            addCriterion("business_license <=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLike(String value) {
            addCriterion("business_license like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotLike(String value) {
            addCriterion("business_license not like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIn(List<String> values) {
            addCriterion("business_license in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotIn(List<String> values) {
            addCriterion("business_license not in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseBetween(String value1, String value2) {
            addCriterion("business_license between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotBetween(String value1, String value2) {
            addCriterion("business_license not between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBranchNoIsNull() {
            addCriterion("branch_no is null");
            return (Criteria) this;
        }

        public Criteria andBranchNoIsNotNull() {
            addCriterion("branch_no is not null");
            return (Criteria) this;
        }

        public Criteria andBranchNoEqualTo(String value) {
            addCriterion("branch_no =", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoNotEqualTo(String value) {
            addCriterion("branch_no <>", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoGreaterThan(String value) {
            addCriterion("branch_no >", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoGreaterThanOrEqualTo(String value) {
            addCriterion("branch_no >=", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoLessThan(String value) {
            addCriterion("branch_no <", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoLessThanOrEqualTo(String value) {
            addCriterion("branch_no <=", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoLike(String value) {
            addCriterion("branch_no like", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoNotLike(String value) {
            addCriterion("branch_no not like", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoIn(List<String> values) {
            addCriterion("branch_no in", values, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoNotIn(List<String> values) {
            addCriterion("branch_no not in", values, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoBetween(String value1, String value2) {
            addCriterion("branch_no between", value1, value2, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoNotBetween(String value1, String value2) {
            addCriterion("branch_no not between", value1, value2, "branchNo");
            return (Criteria) this;
        }

        public Criteria andExchangeNoIsNull() {
            addCriterion("exchange_no is null");
            return (Criteria) this;
        }

        public Criteria andExchangeNoIsNotNull() {
            addCriterion("exchange_no is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeNoEqualTo(String value) {
            addCriterion("exchange_no =", value, "exchangeNo");
            return (Criteria) this;
        }

        public Criteria andExchangeNoNotEqualTo(String value) {
            addCriterion("exchange_no <>", value, "exchangeNo");
            return (Criteria) this;
        }

        public Criteria andExchangeNoGreaterThan(String value) {
            addCriterion("exchange_no >", value, "exchangeNo");
            return (Criteria) this;
        }

        public Criteria andExchangeNoGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_no >=", value, "exchangeNo");
            return (Criteria) this;
        }

        public Criteria andExchangeNoLessThan(String value) {
            addCriterion("exchange_no <", value, "exchangeNo");
            return (Criteria) this;
        }

        public Criteria andExchangeNoLessThanOrEqualTo(String value) {
            addCriterion("exchange_no <=", value, "exchangeNo");
            return (Criteria) this;
        }

        public Criteria andExchangeNoLike(String value) {
            addCriterion("exchange_no like", value, "exchangeNo");
            return (Criteria) this;
        }

        public Criteria andExchangeNoNotLike(String value) {
            addCriterion("exchange_no not like", value, "exchangeNo");
            return (Criteria) this;
        }

        public Criteria andExchangeNoIn(List<String> values) {
            addCriterion("exchange_no in", values, "exchangeNo");
            return (Criteria) this;
        }

        public Criteria andExchangeNoNotIn(List<String> values) {
            addCriterion("exchange_no not in", values, "exchangeNo");
            return (Criteria) this;
        }

        public Criteria andExchangeNoBetween(String value1, String value2) {
            addCriterion("exchange_no between", value1, value2, "exchangeNo");
            return (Criteria) this;
        }

        public Criteria andExchangeNoNotBetween(String value1, String value2) {
            addCriterion("exchange_no not between", value1, value2, "exchangeNo");
            return (Criteria) this;
        }

        public Criteria andOrgJurisdictionIsNull() {
            addCriterion("org_jurisdiction is null");
            return (Criteria) this;
        }

        public Criteria andOrgJurisdictionIsNotNull() {
            addCriterion("org_jurisdiction is not null");
            return (Criteria) this;
        }

        public Criteria andOrgJurisdictionEqualTo(String value) {
            addCriterion("org_jurisdiction =", value, "orgJurisdiction");
            return (Criteria) this;
        }

        public Criteria andOrgJurisdictionNotEqualTo(String value) {
            addCriterion("org_jurisdiction <>", value, "orgJurisdiction");
            return (Criteria) this;
        }

        public Criteria andOrgJurisdictionGreaterThan(String value) {
            addCriterion("org_jurisdiction >", value, "orgJurisdiction");
            return (Criteria) this;
        }

        public Criteria andOrgJurisdictionGreaterThanOrEqualTo(String value) {
            addCriterion("org_jurisdiction >=", value, "orgJurisdiction");
            return (Criteria) this;
        }

        public Criteria andOrgJurisdictionLessThan(String value) {
            addCriterion("org_jurisdiction <", value, "orgJurisdiction");
            return (Criteria) this;
        }

        public Criteria andOrgJurisdictionLessThanOrEqualTo(String value) {
            addCriterion("org_jurisdiction <=", value, "orgJurisdiction");
            return (Criteria) this;
        }

        public Criteria andOrgJurisdictionLike(String value) {
            addCriterion("org_jurisdiction like", value, "orgJurisdiction");
            return (Criteria) this;
        }

        public Criteria andOrgJurisdictionNotLike(String value) {
            addCriterion("org_jurisdiction not like", value, "orgJurisdiction");
            return (Criteria) this;
        }

        public Criteria andOrgJurisdictionIn(List<String> values) {
            addCriterion("org_jurisdiction in", values, "orgJurisdiction");
            return (Criteria) this;
        }

        public Criteria andOrgJurisdictionNotIn(List<String> values) {
            addCriterion("org_jurisdiction not in", values, "orgJurisdiction");
            return (Criteria) this;
        }

        public Criteria andOrgJurisdictionBetween(String value1, String value2) {
            addCriterion("org_jurisdiction between", value1, value2, "orgJurisdiction");
            return (Criteria) this;
        }

        public Criteria andOrgJurisdictionNotBetween(String value1, String value2) {
            addCriterion("org_jurisdiction not between", value1, value2, "orgJurisdiction");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIsNull() {
            addCriterion("org_address is null");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIsNotNull() {
            addCriterion("org_address is not null");
            return (Criteria) this;
        }

        public Criteria andOrgAddressEqualTo(String value) {
            addCriterion("org_address =", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotEqualTo(String value) {
            addCriterion("org_address <>", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressGreaterThan(String value) {
            addCriterion("org_address >", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressGreaterThanOrEqualTo(String value) {
            addCriterion("org_address >=", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLessThan(String value) {
            addCriterion("org_address <", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLessThanOrEqualTo(String value) {
            addCriterion("org_address <=", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLike(String value) {
            addCriterion("org_address like", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotLike(String value) {
            addCriterion("org_address not like", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIn(List<String> values) {
            addCriterion("org_address in", values, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotIn(List<String> values) {
            addCriterion("org_address not in", values, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressBetween(String value1, String value2) {
            addCriterion("org_address between", value1, value2, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotBetween(String value1, String value2) {
            addCriterion("org_address not between", value1, value2, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgZipCodeIsNull() {
            addCriterion("org_zip_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgZipCodeIsNotNull() {
            addCriterion("org_zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgZipCodeEqualTo(String value) {
            addCriterion("org_zip_code =", value, "orgZipCode");
            return (Criteria) this;
        }

        public Criteria andOrgZipCodeNotEqualTo(String value) {
            addCriterion("org_zip_code <>", value, "orgZipCode");
            return (Criteria) this;
        }

        public Criteria andOrgZipCodeGreaterThan(String value) {
            addCriterion("org_zip_code >", value, "orgZipCode");
            return (Criteria) this;
        }

        public Criteria andOrgZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_zip_code >=", value, "orgZipCode");
            return (Criteria) this;
        }

        public Criteria andOrgZipCodeLessThan(String value) {
            addCriterion("org_zip_code <", value, "orgZipCode");
            return (Criteria) this;
        }

        public Criteria andOrgZipCodeLessThanOrEqualTo(String value) {
            addCriterion("org_zip_code <=", value, "orgZipCode");
            return (Criteria) this;
        }

        public Criteria andOrgZipCodeLike(String value) {
            addCriterion("org_zip_code like", value, "orgZipCode");
            return (Criteria) this;
        }

        public Criteria andOrgZipCodeNotLike(String value) {
            addCriterion("org_zip_code not like", value, "orgZipCode");
            return (Criteria) this;
        }

        public Criteria andOrgZipCodeIn(List<String> values) {
            addCriterion("org_zip_code in", values, "orgZipCode");
            return (Criteria) this;
        }

        public Criteria andOrgZipCodeNotIn(List<String> values) {
            addCriterion("org_zip_code not in", values, "orgZipCode");
            return (Criteria) this;
        }

        public Criteria andOrgZipCodeBetween(String value1, String value2) {
            addCriterion("org_zip_code between", value1, value2, "orgZipCode");
            return (Criteria) this;
        }

        public Criteria andOrgZipCodeNotBetween(String value1, String value2) {
            addCriterion("org_zip_code not between", value1, value2, "orgZipCode");
            return (Criteria) this;
        }

        public Criteria andOrgPrincipalIsNull() {
            addCriterion("org_principal is null");
            return (Criteria) this;
        }

        public Criteria andOrgPrincipalIsNotNull() {
            addCriterion("org_principal is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPrincipalEqualTo(String value) {
            addCriterion("org_principal =", value, "orgPrincipal");
            return (Criteria) this;
        }

        public Criteria andOrgPrincipalNotEqualTo(String value) {
            addCriterion("org_principal <>", value, "orgPrincipal");
            return (Criteria) this;
        }

        public Criteria andOrgPrincipalGreaterThan(String value) {
            addCriterion("org_principal >", value, "orgPrincipal");
            return (Criteria) this;
        }

        public Criteria andOrgPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("org_principal >=", value, "orgPrincipal");
            return (Criteria) this;
        }

        public Criteria andOrgPrincipalLessThan(String value) {
            addCriterion("org_principal <", value, "orgPrincipal");
            return (Criteria) this;
        }

        public Criteria andOrgPrincipalLessThanOrEqualTo(String value) {
            addCriterion("org_principal <=", value, "orgPrincipal");
            return (Criteria) this;
        }

        public Criteria andOrgPrincipalLike(String value) {
            addCriterion("org_principal like", value, "orgPrincipal");
            return (Criteria) this;
        }

        public Criteria andOrgPrincipalNotLike(String value) {
            addCriterion("org_principal not like", value, "orgPrincipal");
            return (Criteria) this;
        }

        public Criteria andOrgPrincipalIn(List<String> values) {
            addCriterion("org_principal in", values, "orgPrincipal");
            return (Criteria) this;
        }

        public Criteria andOrgPrincipalNotIn(List<String> values) {
            addCriterion("org_principal not in", values, "orgPrincipal");
            return (Criteria) this;
        }

        public Criteria andOrgPrincipalBetween(String value1, String value2) {
            addCriterion("org_principal between", value1, value2, "orgPrincipal");
            return (Criteria) this;
        }

        public Criteria andOrgPrincipalNotBetween(String value1, String value2) {
            addCriterion("org_principal not between", value1, value2, "orgPrincipal");
            return (Criteria) this;
        }

        public Criteria andOrgContactPhoneIsNull() {
            addCriterion("org_contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andOrgContactPhoneIsNotNull() {
            addCriterion("org_contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOrgContactPhoneEqualTo(String value) {
            addCriterion("org_contact_phone =", value, "orgContactPhone");
            return (Criteria) this;
        }

        public Criteria andOrgContactPhoneNotEqualTo(String value) {
            addCriterion("org_contact_phone <>", value, "orgContactPhone");
            return (Criteria) this;
        }

        public Criteria andOrgContactPhoneGreaterThan(String value) {
            addCriterion("org_contact_phone >", value, "orgContactPhone");
            return (Criteria) this;
        }

        public Criteria andOrgContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("org_contact_phone >=", value, "orgContactPhone");
            return (Criteria) this;
        }

        public Criteria andOrgContactPhoneLessThan(String value) {
            addCriterion("org_contact_phone <", value, "orgContactPhone");
            return (Criteria) this;
        }

        public Criteria andOrgContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("org_contact_phone <=", value, "orgContactPhone");
            return (Criteria) this;
        }

        public Criteria andOrgContactPhoneLike(String value) {
            addCriterion("org_contact_phone like", value, "orgContactPhone");
            return (Criteria) this;
        }

        public Criteria andOrgContactPhoneNotLike(String value) {
            addCriterion("org_contact_phone not like", value, "orgContactPhone");
            return (Criteria) this;
        }

        public Criteria andOrgContactPhoneIn(List<String> values) {
            addCriterion("org_contact_phone in", values, "orgContactPhone");
            return (Criteria) this;
        }

        public Criteria andOrgContactPhoneNotIn(List<String> values) {
            addCriterion("org_contact_phone not in", values, "orgContactPhone");
            return (Criteria) this;
        }

        public Criteria andOrgContactPhoneBetween(String value1, String value2) {
            addCriterion("org_contact_phone between", value1, value2, "orgContactPhone");
            return (Criteria) this;
        }

        public Criteria andOrgContactPhoneNotBetween(String value1, String value2) {
            addCriterion("org_contact_phone not between", value1, value2, "orgContactPhone");
            return (Criteria) this;
        }

        public Criteria andUsedNameIsNull() {
            addCriterion("used_name is null");
            return (Criteria) this;
        }

        public Criteria andUsedNameIsNotNull() {
            addCriterion("used_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsedNameEqualTo(String value) {
            addCriterion("used_name =", value, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameNotEqualTo(String value) {
            addCriterion("used_name <>", value, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameGreaterThan(String value) {
            addCriterion("used_name >", value, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameGreaterThanOrEqualTo(String value) {
            addCriterion("used_name >=", value, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameLessThan(String value) {
            addCriterion("used_name <", value, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameLessThanOrEqualTo(String value) {
            addCriterion("used_name <=", value, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameLike(String value) {
            addCriterion("used_name like", value, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameNotLike(String value) {
            addCriterion("used_name not like", value, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameIn(List<String> values) {
            addCriterion("used_name in", values, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameNotIn(List<String> values) {
            addCriterion("used_name not in", values, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameBetween(String value1, String value2) {
            addCriterion("used_name between", value1, value2, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameNotBetween(String value1, String value2) {
            addCriterion("used_name not between", value1, value2, "usedName");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateIsNull() {
            addCriterion("established_date is null");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateIsNotNull() {
            addCriterion("established_date is not null");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateEqualTo(Date value) {
            addCriterion("established_date =", value, "establishedDate");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateNotEqualTo(Date value) {
            addCriterion("established_date <>", value, "establishedDate");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateGreaterThan(Date value) {
            addCriterion("established_date >", value, "establishedDate");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("established_date >=", value, "establishedDate");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateLessThan(Date value) {
            addCriterion("established_date <", value, "establishedDate");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateLessThanOrEqualTo(Date value) {
            addCriterion("established_date <=", value, "establishedDate");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateIn(List<Date> values) {
            addCriterion("established_date in", values, "establishedDate");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateNotIn(List<Date> values) {
            addCriterion("established_date not in", values, "establishedDate");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateBetween(Date value1, Date value2) {
            addCriterion("established_date between", value1, value2, "establishedDate");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateNotBetween(Date value1, Date value2) {
            addCriterion("established_date not between", value1, value2, "establishedDate");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIsNull() {
            addCriterion("org_status is null");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIsNotNull() {
            addCriterion("org_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrgStatusEqualTo(Integer value) {
            addCriterion("org_status =", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotEqualTo(Integer value) {
            addCriterion("org_status <>", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusGreaterThan(Integer value) {
            addCriterion("org_status >", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_status >=", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusLessThan(Integer value) {
            addCriterion("org_status <", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusLessThanOrEqualTo(Integer value) {
            addCriterion("org_status <=", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIn(List<Integer> values) {
            addCriterion("org_status in", values, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotIn(List<Integer> values) {
            addCriterion("org_status not in", values, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusBetween(Integer value1, Integer value2) {
            addCriterion("org_status between", value1, value2, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("org_status not between", value1, value2, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStatusTimeIsNull() {
            addCriterion("status_time is null");
            return (Criteria) this;
        }

        public Criteria andStatusTimeIsNotNull() {
            addCriterion("status_time is not null");
            return (Criteria) this;
        }

        public Criteria andStatusTimeEqualTo(Date value) {
            addCriterion("status_time =", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeNotEqualTo(Date value) {
            addCriterion("status_time <>", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeGreaterThan(Date value) {
            addCriterion("status_time >", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("status_time >=", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeLessThan(Date value) {
            addCriterion("status_time <", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeLessThanOrEqualTo(Date value) {
            addCriterion("status_time <=", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeIn(List<Date> values) {
            addCriterion("status_time in", values, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeNotIn(List<Date> values) {
            addCriterion("status_time not in", values, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeBetween(Date value1, Date value2) {
            addCriterion("status_time between", value1, value2, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeNotBetween(Date value1, Date value2) {
            addCriterion("status_time not between", value1, value2, "statusTime");
            return (Criteria) this;
        }

        public Criteria andBranchesInChargeIsNull() {
            addCriterion("branches_in_charge is null");
            return (Criteria) this;
        }

        public Criteria andBranchesInChargeIsNotNull() {
            addCriterion("branches_in_charge is not null");
            return (Criteria) this;
        }

        public Criteria andBranchesInChargeEqualTo(Integer value) {
            addCriterion("branches_in_charge =", value, "branchesInCharge");
            return (Criteria) this;
        }

        public Criteria andBranchesInChargeNotEqualTo(Integer value) {
            addCriterion("branches_in_charge <>", value, "branchesInCharge");
            return (Criteria) this;
        }

        public Criteria andBranchesInChargeGreaterThan(Integer value) {
            addCriterion("branches_in_charge >", value, "branchesInCharge");
            return (Criteria) this;
        }

        public Criteria andBranchesInChargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("branches_in_charge >=", value, "branchesInCharge");
            return (Criteria) this;
        }

        public Criteria andBranchesInChargeLessThan(Integer value) {
            addCriterion("branches_in_charge <", value, "branchesInCharge");
            return (Criteria) this;
        }

        public Criteria andBranchesInChargeLessThanOrEqualTo(Integer value) {
            addCriterion("branches_in_charge <=", value, "branchesInCharge");
            return (Criteria) this;
        }

        public Criteria andBranchesInChargeIn(List<Integer> values) {
            addCriterion("branches_in_charge in", values, "branchesInCharge");
            return (Criteria) this;
        }

        public Criteria andBranchesInChargeNotIn(List<Integer> values) {
            addCriterion("branches_in_charge not in", values, "branchesInCharge");
            return (Criteria) this;
        }

        public Criteria andBranchesInChargeBetween(Integer value1, Integer value2) {
            addCriterion("branches_in_charge between", value1, value2, "branchesInCharge");
            return (Criteria) this;
        }

        public Criteria andBranchesInChargeNotBetween(Integer value1, Integer value2) {
            addCriterion("branches_in_charge not between", value1, value2, "branchesInCharge");
            return (Criteria) this;
        }

        public Criteria andClientManagerNoIsNull() {
            addCriterion("client_manager_no is null");
            return (Criteria) this;
        }

        public Criteria andClientManagerNoIsNotNull() {
            addCriterion("client_manager_no is not null");
            return (Criteria) this;
        }

        public Criteria andClientManagerNoEqualTo(Integer value) {
            addCriterion("client_manager_no =", value, "clientManagerNo");
            return (Criteria) this;
        }

        public Criteria andClientManagerNoNotEqualTo(Integer value) {
            addCriterion("client_manager_no <>", value, "clientManagerNo");
            return (Criteria) this;
        }

        public Criteria andClientManagerNoGreaterThan(Integer value) {
            addCriterion("client_manager_no >", value, "clientManagerNo");
            return (Criteria) this;
        }

        public Criteria andClientManagerNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("client_manager_no >=", value, "clientManagerNo");
            return (Criteria) this;
        }

        public Criteria andClientManagerNoLessThan(Integer value) {
            addCriterion("client_manager_no <", value, "clientManagerNo");
            return (Criteria) this;
        }

        public Criteria andClientManagerNoLessThanOrEqualTo(Integer value) {
            addCriterion("client_manager_no <=", value, "clientManagerNo");
            return (Criteria) this;
        }

        public Criteria andClientManagerNoIn(List<Integer> values) {
            addCriterion("client_manager_no in", values, "clientManagerNo");
            return (Criteria) this;
        }

        public Criteria andClientManagerNoNotIn(List<Integer> values) {
            addCriterion("client_manager_no not in", values, "clientManagerNo");
            return (Criteria) this;
        }

        public Criteria andClientManagerNoBetween(Integer value1, Integer value2) {
            addCriterion("client_manager_no between", value1, value2, "clientManagerNo");
            return (Criteria) this;
        }

        public Criteria andClientManagerNoNotBetween(Integer value1, Integer value2) {
            addCriterion("client_manager_no not between", value1, value2, "clientManagerNo");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andEnableIsNull() {
            addCriterion("enable is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("enable is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(Integer value) {
            addCriterion("enable =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(Integer value) {
            addCriterion("enable <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(Integer value) {
            addCriterion("enable >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("enable >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(Integer value) {
            addCriterion("enable <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(Integer value) {
            addCriterion("enable <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<Integer> values) {
            addCriterion("enable in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<Integer> values) {
            addCriterion("enable not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(Integer value1, Integer value2) {
            addCriterion("enable between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("enable not between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLenIsNull() {
            addCriterion("customer_code_len is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLenIsNotNull() {
            addCriterion("customer_code_len is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLenEqualTo(Integer value) {
            addCriterion("customer_code_len =", value, "customerCodeLen");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLenNotEqualTo(Integer value) {
            addCriterion("customer_code_len <>", value, "customerCodeLen");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLenGreaterThan(Integer value) {
            addCriterion("customer_code_len >", value, "customerCodeLen");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLenGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_code_len >=", value, "customerCodeLen");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLenLessThan(Integer value) {
            addCriterion("customer_code_len <", value, "customerCodeLen");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLenLessThanOrEqualTo(Integer value) {
            addCriterion("customer_code_len <=", value, "customerCodeLen");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLenIn(List<Integer> values) {
            addCriterion("customer_code_len in", values, "customerCodeLen");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLenNotIn(List<Integer> values) {
            addCriterion("customer_code_len not in", values, "customerCodeLen");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLenBetween(Integer value1, Integer value2) {
            addCriterion("customer_code_len between", value1, value2, "customerCodeLen");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLenNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_code_len not between", value1, value2, "customerCodeLen");
            return (Criteria) this;
        }

        public Criteria andOrgAttributeIsNull() {
            addCriterion("org_attribute is null");
            return (Criteria) this;
        }

        public Criteria andOrgAttributeIsNotNull() {
            addCriterion("org_attribute is not null");
            return (Criteria) this;
        }

        public Criteria andOrgAttributeEqualTo(Integer value) {
            addCriterion("org_attribute =", value, "orgAttribute");
            return (Criteria) this;
        }

        public Criteria andOrgAttributeNotEqualTo(Integer value) {
            addCriterion("org_attribute <>", value, "orgAttribute");
            return (Criteria) this;
        }

        public Criteria andOrgAttributeGreaterThan(Integer value) {
            addCriterion("org_attribute >", value, "orgAttribute");
            return (Criteria) this;
        }

        public Criteria andOrgAttributeGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_attribute >=", value, "orgAttribute");
            return (Criteria) this;
        }

        public Criteria andOrgAttributeLessThan(Integer value) {
            addCriterion("org_attribute <", value, "orgAttribute");
            return (Criteria) this;
        }

        public Criteria andOrgAttributeLessThanOrEqualTo(Integer value) {
            addCriterion("org_attribute <=", value, "orgAttribute");
            return (Criteria) this;
        }

        public Criteria andOrgAttributeIn(List<Integer> values) {
            addCriterion("org_attribute in", values, "orgAttribute");
            return (Criteria) this;
        }

        public Criteria andOrgAttributeNotIn(List<Integer> values) {
            addCriterion("org_attribute not in", values, "orgAttribute");
            return (Criteria) this;
        }

        public Criteria andOrgAttributeBetween(Integer value1, Integer value2) {
            addCriterion("org_attribute between", value1, value2, "orgAttribute");
            return (Criteria) this;
        }

        public Criteria andOrgAttributeNotBetween(Integer value1, Integer value2) {
            addCriterion("org_attribute not between", value1, value2, "orgAttribute");
            return (Criteria) this;
        }
    }

    /**
     * organization表的操作类
     * 
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * organization表的操作类
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