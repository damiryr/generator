package com.zlkcxd.dao.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerInfoCriteria {
    /**
     * customer_info表的操作属性:orderByClause
     * 
     */
    protected String orderByClause;

    /**
     * customer_info表的操作属性:start
     * 
     */
    protected int start;

    /**
     * customer_info表的操作属性:limit
     * 
     */
    protected int limit;

    /**
     * customer_info表的操作属性:distinct
     * 
     */
    protected boolean distinct;

    /**
     * customer_info表的操作属性:oredCriteria
     * 
     */
    protected List<Criteria> oredCriteria;

    /**
     * customer_info数据表的操作方法: CustomerInfoCriteria  
     * 
     */
    public CustomerInfoCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * customer_info数据表的操作方法: setOrderByClause  
     * 
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * customer_info数据表的操作方法: getOrderByClause  
     * 
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * customer_info数据表的操作方法: setStart  
     * 
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * customer_info数据表的操作方法: getStart  
     * 
     */
    public int getStart() {
        return start;
    }

    /**
     * customer_info数据表的操作方法: setLimit  
     * 
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * customer_info数据表的操作方法: getLimit  
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * customer_info数据表的操作方法: setDistinct  
     * 
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * customer_info数据表的操作方法: isDistinct  
     * 
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * customer_info数据表的操作方法: getOredCriteria  
     * 
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * customer_info数据表的操作方法: or  
     * 
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * customer_info数据表的操作方法: or  
     * 
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * customer_info数据表的操作方法: createCriteria  
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
     * customer_info数据表的操作方法: createCriteriaInternal  
     * 
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * customer_info数据表的操作方法: clear  
     * 
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * customer_info表的操作类
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

        public Criteria andCustomerNoIsNull() {
            addCriterion("customer_no is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIsNotNull() {
            addCriterion("customer_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNoEqualTo(String value) {
            addCriterion("customer_no =", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotEqualTo(String value) {
            addCriterion("customer_no <>", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoGreaterThan(String value) {
            addCriterion("customer_no >", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoGreaterThanOrEqualTo(String value) {
            addCriterion("customer_no >=", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLessThan(String value) {
            addCriterion("customer_no <", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLessThanOrEqualTo(String value) {
            addCriterion("customer_no <=", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLike(String value) {
            addCriterion("customer_no like", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotLike(String value) {
            addCriterion("customer_no not like", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIn(List<String> values) {
            addCriterion("customer_no in", values, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotIn(List<String> values) {
            addCriterion("customer_no not in", values, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoBetween(String value1, String value2) {
            addCriterion("customer_no between", value1, value2, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotBetween(String value1, String value2) {
            addCriterion("customer_no not between", value1, value2, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerClassIsNull() {
            addCriterion("customer_class is null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassIsNotNull() {
            addCriterion("customer_class is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassEqualTo(String value) {
            addCriterion("customer_class =", value, "customerClass");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNotEqualTo(String value) {
            addCriterion("customer_class <>", value, "customerClass");
            return (Criteria) this;
        }

        public Criteria andCustomerClassGreaterThan(String value) {
            addCriterion("customer_class >", value, "customerClass");
            return (Criteria) this;
        }

        public Criteria andCustomerClassGreaterThanOrEqualTo(String value) {
            addCriterion("customer_class >=", value, "customerClass");
            return (Criteria) this;
        }

        public Criteria andCustomerClassLessThan(String value) {
            addCriterion("customer_class <", value, "customerClass");
            return (Criteria) this;
        }

        public Criteria andCustomerClassLessThanOrEqualTo(String value) {
            addCriterion("customer_class <=", value, "customerClass");
            return (Criteria) this;
        }

        public Criteria andCustomerClassLike(String value) {
            addCriterion("customer_class like", value, "customerClass");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNotLike(String value) {
            addCriterion("customer_class not like", value, "customerClass");
            return (Criteria) this;
        }

        public Criteria andCustomerClassIn(List<String> values) {
            addCriterion("customer_class in", values, "customerClass");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNotIn(List<String> values) {
            addCriterion("customer_class not in", values, "customerClass");
            return (Criteria) this;
        }

        public Criteria andCustomerClassBetween(String value1, String value2) {
            addCriterion("customer_class between", value1, value2, "customerClass");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNotBetween(String value1, String value2) {
            addCriterion("customer_class not between", value1, value2, "customerClass");
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

        public Criteria andCustomerManagerNameIsNull() {
            addCriterion("customer_manager_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameIsNotNull() {
            addCriterion("customer_manager_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameEqualTo(String value) {
            addCriterion("customer_manager_name =", value, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameNotEqualTo(String value) {
            addCriterion("customer_manager_name <>", value, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameGreaterThan(String value) {
            addCriterion("customer_manager_name >", value, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_manager_name >=", value, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameLessThan(String value) {
            addCriterion("customer_manager_name <", value, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_manager_name <=", value, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameLike(String value) {
            addCriterion("customer_manager_name like", value, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameNotLike(String value) {
            addCriterion("customer_manager_name not like", value, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameIn(List<String> values) {
            addCriterion("customer_manager_name in", values, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameNotIn(List<String> values) {
            addCriterion("customer_manager_name not in", values, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameBetween(String value1, String value2) {
            addCriterion("customer_manager_name between", value1, value2, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameNotBetween(String value1, String value2) {
            addCriterion("customer_manager_name not between", value1, value2, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNull() {
            addCriterion("customer_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("customer_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(String value) {
            addCriterion("customer_type =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(String value) {
            addCriterion("customer_type <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(String value) {
            addCriterion("customer_type >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_type >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(String value) {
            addCriterion("customer_type <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(String value) {
            addCriterion("customer_type <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLike(String value) {
            addCriterion("customer_type like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotLike(String value) {
            addCriterion("customer_type not like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<String> values) {
            addCriterion("customer_type in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<String> values) {
            addCriterion("customer_type not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(String value1, String value2) {
            addCriterion("customer_type between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(String value1, String value2) {
            addCriterion("customer_type not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceIsNull() {
            addCriterion("customer_source is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceIsNotNull() {
            addCriterion("customer_source is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceEqualTo(String value) {
            addCriterion("customer_source =", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceNotEqualTo(String value) {
            addCriterion("customer_source <>", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceGreaterThan(String value) {
            addCriterion("customer_source >", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceGreaterThanOrEqualTo(String value) {
            addCriterion("customer_source >=", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceLessThan(String value) {
            addCriterion("customer_source <", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceLessThanOrEqualTo(String value) {
            addCriterion("customer_source <=", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceLike(String value) {
            addCriterion("customer_source like", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceNotLike(String value) {
            addCriterion("customer_source not like", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceIn(List<String> values) {
            addCriterion("customer_source in", values, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceNotIn(List<String> values) {
            addCriterion("customer_source not in", values, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceBetween(String value1, String value2) {
            addCriterion("customer_source between", value1, value2, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceNotBetween(String value1, String value2) {
            addCriterion("customer_source not between", value1, value2, "customerSource");
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

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("department_id like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("department_id not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Long value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Long value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Long value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Long value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Long> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Long> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Long value1, Long value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Long value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Long value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Long value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Long value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Long> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Long> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Long value1, Long value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andReserveCustomerIsNull() {
            addCriterion("reserve_customer is null");
            return (Criteria) this;
        }

        public Criteria andReserveCustomerIsNotNull() {
            addCriterion("reserve_customer is not null");
            return (Criteria) this;
        }

        public Criteria andReserveCustomerEqualTo(String value) {
            addCriterion("reserve_customer =", value, "reserveCustomer");
            return (Criteria) this;
        }

        public Criteria andReserveCustomerNotEqualTo(String value) {
            addCriterion("reserve_customer <>", value, "reserveCustomer");
            return (Criteria) this;
        }

        public Criteria andReserveCustomerGreaterThan(String value) {
            addCriterion("reserve_customer >", value, "reserveCustomer");
            return (Criteria) this;
        }

        public Criteria andReserveCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_customer >=", value, "reserveCustomer");
            return (Criteria) this;
        }

        public Criteria andReserveCustomerLessThan(String value) {
            addCriterion("reserve_customer <", value, "reserveCustomer");
            return (Criteria) this;
        }

        public Criteria andReserveCustomerLessThanOrEqualTo(String value) {
            addCriterion("reserve_customer <=", value, "reserveCustomer");
            return (Criteria) this;
        }

        public Criteria andReserveCustomerLike(String value) {
            addCriterion("reserve_customer like", value, "reserveCustomer");
            return (Criteria) this;
        }

        public Criteria andReserveCustomerNotLike(String value) {
            addCriterion("reserve_customer not like", value, "reserveCustomer");
            return (Criteria) this;
        }

        public Criteria andReserveCustomerIn(List<String> values) {
            addCriterion("reserve_customer in", values, "reserveCustomer");
            return (Criteria) this;
        }

        public Criteria andReserveCustomerNotIn(List<String> values) {
            addCriterion("reserve_customer not in", values, "reserveCustomer");
            return (Criteria) this;
        }

        public Criteria andReserveCustomerBetween(String value1, String value2) {
            addCriterion("reserve_customer between", value1, value2, "reserveCustomer");
            return (Criteria) this;
        }

        public Criteria andReserveCustomerNotBetween(String value1, String value2) {
            addCriterion("reserve_customer not between", value1, value2, "reserveCustomer");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNull() {
            addCriterion("customer_status is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNotNull() {
            addCriterion("customer_status is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusEqualTo(String value) {
            addCriterion("customer_status =", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotEqualTo(String value) {
            addCriterion("customer_status <>", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThan(String value) {
            addCriterion("customer_status >", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThanOrEqualTo(String value) {
            addCriterion("customer_status >=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThan(String value) {
            addCriterion("customer_status <", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThanOrEqualTo(String value) {
            addCriterion("customer_status <=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLike(String value) {
            addCriterion("customer_status like", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotLike(String value) {
            addCriterion("customer_status not like", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIn(List<String> values) {
            addCriterion("customer_status in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotIn(List<String> values) {
            addCriterion("customer_status not in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusBetween(String value1, String value2) {
            addCriterion("customer_status between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotBetween(String value1, String value2) {
            addCriterion("customer_status not between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNull() {
            addCriterion("cert_type is null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNotNull() {
            addCriterion("cert_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypeEqualTo(String value) {
            addCriterion("cert_type =", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotEqualTo(String value) {
            addCriterion("cert_type <>", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThan(String value) {
            addCriterion("cert_type >", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cert_type >=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThan(String value) {
            addCriterion("cert_type <", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThanOrEqualTo(String value) {
            addCriterion("cert_type <=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLike(String value) {
            addCriterion("cert_type like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotLike(String value) {
            addCriterion("cert_type not like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeIn(List<String> values) {
            addCriterion("cert_type in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotIn(List<String> values) {
            addCriterion("cert_type not in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeBetween(String value1, String value2) {
            addCriterion("cert_type between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotBetween(String value1, String value2) {
            addCriterion("cert_type not between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNull() {
            addCriterion("cert_no is null");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNotNull() {
            addCriterion("cert_no is not null");
            return (Criteria) this;
        }

        public Criteria andCertNoEqualTo(String value) {
            addCriterion("cert_no =", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotEqualTo(String value) {
            addCriterion("cert_no <>", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThan(String value) {
            addCriterion("cert_no >", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("cert_no >=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThan(String value) {
            addCriterion("cert_no <", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThanOrEqualTo(String value) {
            addCriterion("cert_no <=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLike(String value) {
            addCriterion("cert_no like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotLike(String value) {
            addCriterion("cert_no not like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoIn(List<String> values) {
            addCriterion("cert_no in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotIn(List<String> values) {
            addCriterion("cert_no not in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoBetween(String value1, String value2) {
            addCriterion("cert_no between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotBetween(String value1, String value2) {
            addCriterion("cert_no not between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andApprovedDateIsNull() {
            addCriterion("approved_date is null");
            return (Criteria) this;
        }

        public Criteria andApprovedDateIsNotNull() {
            addCriterion("approved_date is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedDateEqualTo(Date value) {
            addCriterion("approved_date =", value, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateNotEqualTo(Date value) {
            addCriterion("approved_date <>", value, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateGreaterThan(Date value) {
            addCriterion("approved_date >", value, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("approved_date >=", value, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateLessThan(Date value) {
            addCriterion("approved_date <", value, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateLessThanOrEqualTo(Date value) {
            addCriterion("approved_date <=", value, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateIn(List<Date> values) {
            addCriterion("approved_date in", values, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateNotIn(List<Date> values) {
            addCriterion("approved_date not in", values, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateBetween(Date value1, Date value2) {
            addCriterion("approved_date between", value1, value2, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateNotBetween(Date value1, Date value2) {
            addCriterion("approved_date not between", value1, value2, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovalProcessIdIsNull() {
            addCriterion("approval_process_id is null");
            return (Criteria) this;
        }

        public Criteria andApprovalProcessIdIsNotNull() {
            addCriterion("approval_process_id is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalProcessIdEqualTo(String value) {
            addCriterion("approval_process_id =", value, "approvalProcessId");
            return (Criteria) this;
        }

        public Criteria andApprovalProcessIdNotEqualTo(String value) {
            addCriterion("approval_process_id <>", value, "approvalProcessId");
            return (Criteria) this;
        }

        public Criteria andApprovalProcessIdGreaterThan(String value) {
            addCriterion("approval_process_id >", value, "approvalProcessId");
            return (Criteria) this;
        }

        public Criteria andApprovalProcessIdGreaterThanOrEqualTo(String value) {
            addCriterion("approval_process_id >=", value, "approvalProcessId");
            return (Criteria) this;
        }

        public Criteria andApprovalProcessIdLessThan(String value) {
            addCriterion("approval_process_id <", value, "approvalProcessId");
            return (Criteria) this;
        }

        public Criteria andApprovalProcessIdLessThanOrEqualTo(String value) {
            addCriterion("approval_process_id <=", value, "approvalProcessId");
            return (Criteria) this;
        }

        public Criteria andApprovalProcessIdLike(String value) {
            addCriterion("approval_process_id like", value, "approvalProcessId");
            return (Criteria) this;
        }

        public Criteria andApprovalProcessIdNotLike(String value) {
            addCriterion("approval_process_id not like", value, "approvalProcessId");
            return (Criteria) this;
        }

        public Criteria andApprovalProcessIdIn(List<String> values) {
            addCriterion("approval_process_id in", values, "approvalProcessId");
            return (Criteria) this;
        }

        public Criteria andApprovalProcessIdNotIn(List<String> values) {
            addCriterion("approval_process_id not in", values, "approvalProcessId");
            return (Criteria) this;
        }

        public Criteria andApprovalProcessIdBetween(String value1, String value2) {
            addCriterion("approval_process_id between", value1, value2, "approvalProcessId");
            return (Criteria) this;
        }

        public Criteria andApprovalProcessIdNotBetween(String value1, String value2) {
            addCriterion("approval_process_id not between", value1, value2, "approvalProcessId");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIsNull() {
            addCriterion("approval_status is null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIsNotNull() {
            addCriterion("approval_status is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusEqualTo(String value) {
            addCriterion("approval_status =", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotEqualTo(String value) {
            addCriterion("approval_status <>", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusGreaterThan(String value) {
            addCriterion("approval_status >", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("approval_status >=", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLessThan(String value) {
            addCriterion("approval_status <", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLessThanOrEqualTo(String value) {
            addCriterion("approval_status <=", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLike(String value) {
            addCriterion("approval_status like", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotLike(String value) {
            addCriterion("approval_status not like", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIn(List<String> values) {
            addCriterion("approval_status in", values, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotIn(List<String> values) {
            addCriterion("approval_status not in", values, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusBetween(String value1, String value2) {
            addCriterion("approval_status between", value1, value2, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotBetween(String value1, String value2) {
            addCriterion("approval_status not between", value1, value2, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusTimeIsNull() {
            addCriterion("approval_status_time is null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusTimeIsNotNull() {
            addCriterion("approval_status_time is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusTimeEqualTo(String value) {
            addCriterion("approval_status_time =", value, "approvalStatusTime");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusTimeNotEqualTo(String value) {
            addCriterion("approval_status_time <>", value, "approvalStatusTime");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusTimeGreaterThan(String value) {
            addCriterion("approval_status_time >", value, "approvalStatusTime");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusTimeGreaterThanOrEqualTo(String value) {
            addCriterion("approval_status_time >=", value, "approvalStatusTime");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusTimeLessThan(String value) {
            addCriterion("approval_status_time <", value, "approvalStatusTime");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusTimeLessThanOrEqualTo(String value) {
            addCriterion("approval_status_time <=", value, "approvalStatusTime");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusTimeLike(String value) {
            addCriterion("approval_status_time like", value, "approvalStatusTime");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusTimeNotLike(String value) {
            addCriterion("approval_status_time not like", value, "approvalStatusTime");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusTimeIn(List<String> values) {
            addCriterion("approval_status_time in", values, "approvalStatusTime");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusTimeNotIn(List<String> values) {
            addCriterion("approval_status_time not in", values, "approvalStatusTime");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusTimeBetween(String value1, String value2) {
            addCriterion("approval_status_time between", value1, value2, "approvalStatusTime");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusTimeNotBetween(String value1, String value2) {
            addCriterion("approval_status_time not between", value1, value2, "approvalStatusTime");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusMsgIsNull() {
            addCriterion("approval_status_msg is null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusMsgIsNotNull() {
            addCriterion("approval_status_msg is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusMsgEqualTo(String value) {
            addCriterion("approval_status_msg =", value, "approvalStatusMsg");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusMsgNotEqualTo(String value) {
            addCriterion("approval_status_msg <>", value, "approvalStatusMsg");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusMsgGreaterThan(String value) {
            addCriterion("approval_status_msg >", value, "approvalStatusMsg");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusMsgGreaterThanOrEqualTo(String value) {
            addCriterion("approval_status_msg >=", value, "approvalStatusMsg");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusMsgLessThan(String value) {
            addCriterion("approval_status_msg <", value, "approvalStatusMsg");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusMsgLessThanOrEqualTo(String value) {
            addCriterion("approval_status_msg <=", value, "approvalStatusMsg");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusMsgLike(String value) {
            addCriterion("approval_status_msg like", value, "approvalStatusMsg");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusMsgNotLike(String value) {
            addCriterion("approval_status_msg not like", value, "approvalStatusMsg");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusMsgIn(List<String> values) {
            addCriterion("approval_status_msg in", values, "approvalStatusMsg");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusMsgNotIn(List<String> values) {
            addCriterion("approval_status_msg not in", values, "approvalStatusMsg");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusMsgBetween(String value1, String value2) {
            addCriterion("approval_status_msg between", value1, value2, "approvalStatusMsg");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusMsgNotBetween(String value1, String value2) {
            addCriterion("approval_status_msg not between", value1, value2, "approvalStatusMsg");
            return (Criteria) this;
        }

        public Criteria andDistrictProvinceIsNull() {
            addCriterion("district_province is null");
            return (Criteria) this;
        }

        public Criteria andDistrictProvinceIsNotNull() {
            addCriterion("district_province is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictProvinceEqualTo(String value) {
            addCriterion("district_province =", value, "districtProvince");
            return (Criteria) this;
        }

        public Criteria andDistrictProvinceNotEqualTo(String value) {
            addCriterion("district_province <>", value, "districtProvince");
            return (Criteria) this;
        }

        public Criteria andDistrictProvinceGreaterThan(String value) {
            addCriterion("district_province >", value, "districtProvince");
            return (Criteria) this;
        }

        public Criteria andDistrictProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("district_province >=", value, "districtProvince");
            return (Criteria) this;
        }

        public Criteria andDistrictProvinceLessThan(String value) {
            addCriterion("district_province <", value, "districtProvince");
            return (Criteria) this;
        }

        public Criteria andDistrictProvinceLessThanOrEqualTo(String value) {
            addCriterion("district_province <=", value, "districtProvince");
            return (Criteria) this;
        }

        public Criteria andDistrictProvinceLike(String value) {
            addCriterion("district_province like", value, "districtProvince");
            return (Criteria) this;
        }

        public Criteria andDistrictProvinceNotLike(String value) {
            addCriterion("district_province not like", value, "districtProvince");
            return (Criteria) this;
        }

        public Criteria andDistrictProvinceIn(List<String> values) {
            addCriterion("district_province in", values, "districtProvince");
            return (Criteria) this;
        }

        public Criteria andDistrictProvinceNotIn(List<String> values) {
            addCriterion("district_province not in", values, "districtProvince");
            return (Criteria) this;
        }

        public Criteria andDistrictProvinceBetween(String value1, String value2) {
            addCriterion("district_province between", value1, value2, "districtProvince");
            return (Criteria) this;
        }

        public Criteria andDistrictProvinceNotBetween(String value1, String value2) {
            addCriterion("district_province not between", value1, value2, "districtProvince");
            return (Criteria) this;
        }

        public Criteria andDistrictCityIsNull() {
            addCriterion("district_city is null");
            return (Criteria) this;
        }

        public Criteria andDistrictCityIsNotNull() {
            addCriterion("district_city is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictCityEqualTo(String value) {
            addCriterion("district_city =", value, "districtCity");
            return (Criteria) this;
        }

        public Criteria andDistrictCityNotEqualTo(String value) {
            addCriterion("district_city <>", value, "districtCity");
            return (Criteria) this;
        }

        public Criteria andDistrictCityGreaterThan(String value) {
            addCriterion("district_city >", value, "districtCity");
            return (Criteria) this;
        }

        public Criteria andDistrictCityGreaterThanOrEqualTo(String value) {
            addCriterion("district_city >=", value, "districtCity");
            return (Criteria) this;
        }

        public Criteria andDistrictCityLessThan(String value) {
            addCriterion("district_city <", value, "districtCity");
            return (Criteria) this;
        }

        public Criteria andDistrictCityLessThanOrEqualTo(String value) {
            addCriterion("district_city <=", value, "districtCity");
            return (Criteria) this;
        }

        public Criteria andDistrictCityLike(String value) {
            addCriterion("district_city like", value, "districtCity");
            return (Criteria) this;
        }

        public Criteria andDistrictCityNotLike(String value) {
            addCriterion("district_city not like", value, "districtCity");
            return (Criteria) this;
        }

        public Criteria andDistrictCityIn(List<String> values) {
            addCriterion("district_city in", values, "districtCity");
            return (Criteria) this;
        }

        public Criteria andDistrictCityNotIn(List<String> values) {
            addCriterion("district_city not in", values, "districtCity");
            return (Criteria) this;
        }

        public Criteria andDistrictCityBetween(String value1, String value2) {
            addCriterion("district_city between", value1, value2, "districtCity");
            return (Criteria) this;
        }

        public Criteria andDistrictCityNotBetween(String value1, String value2) {
            addCriterion("district_city not between", value1, value2, "districtCity");
            return (Criteria) this;
        }

        public Criteria andDistrictCountyIsNull() {
            addCriterion("district_county is null");
            return (Criteria) this;
        }

        public Criteria andDistrictCountyIsNotNull() {
            addCriterion("district_county is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictCountyEqualTo(String value) {
            addCriterion("district_county =", value, "districtCounty");
            return (Criteria) this;
        }

        public Criteria andDistrictCountyNotEqualTo(String value) {
            addCriterion("district_county <>", value, "districtCounty");
            return (Criteria) this;
        }

        public Criteria andDistrictCountyGreaterThan(String value) {
            addCriterion("district_county >", value, "districtCounty");
            return (Criteria) this;
        }

        public Criteria andDistrictCountyGreaterThanOrEqualTo(String value) {
            addCriterion("district_county >=", value, "districtCounty");
            return (Criteria) this;
        }

        public Criteria andDistrictCountyLessThan(String value) {
            addCriterion("district_county <", value, "districtCounty");
            return (Criteria) this;
        }

        public Criteria andDistrictCountyLessThanOrEqualTo(String value) {
            addCriterion("district_county <=", value, "districtCounty");
            return (Criteria) this;
        }

        public Criteria andDistrictCountyLike(String value) {
            addCriterion("district_county like", value, "districtCounty");
            return (Criteria) this;
        }

        public Criteria andDistrictCountyNotLike(String value) {
            addCriterion("district_county not like", value, "districtCounty");
            return (Criteria) this;
        }

        public Criteria andDistrictCountyIn(List<String> values) {
            addCriterion("district_county in", values, "districtCounty");
            return (Criteria) this;
        }

        public Criteria andDistrictCountyNotIn(List<String> values) {
            addCriterion("district_county not in", values, "districtCounty");
            return (Criteria) this;
        }

        public Criteria andDistrictCountyBetween(String value1, String value2) {
            addCriterion("district_county between", value1, value2, "districtCounty");
            return (Criteria) this;
        }

        public Criteria andDistrictCountyNotBetween(String value1, String value2) {
            addCriterion("district_county not between", value1, value2, "districtCounty");
            return (Criteria) this;
        }

        public Criteria andIdentityDetailIsNull() {
            addCriterion("identity_detail is null");
            return (Criteria) this;
        }

        public Criteria andIdentityDetailIsNotNull() {
            addCriterion("identity_detail is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityDetailEqualTo(String value) {
            addCriterion("identity_detail =", value, "identityDetail");
            return (Criteria) this;
        }

        public Criteria andIdentityDetailNotEqualTo(String value) {
            addCriterion("identity_detail <>", value, "identityDetail");
            return (Criteria) this;
        }

        public Criteria andIdentityDetailGreaterThan(String value) {
            addCriterion("identity_detail >", value, "identityDetail");
            return (Criteria) this;
        }

        public Criteria andIdentityDetailGreaterThanOrEqualTo(String value) {
            addCriterion("identity_detail >=", value, "identityDetail");
            return (Criteria) this;
        }

        public Criteria andIdentityDetailLessThan(String value) {
            addCriterion("identity_detail <", value, "identityDetail");
            return (Criteria) this;
        }

        public Criteria andIdentityDetailLessThanOrEqualTo(String value) {
            addCriterion("identity_detail <=", value, "identityDetail");
            return (Criteria) this;
        }

        public Criteria andIdentityDetailLike(String value) {
            addCriterion("identity_detail like", value, "identityDetail");
            return (Criteria) this;
        }

        public Criteria andIdentityDetailNotLike(String value) {
            addCriterion("identity_detail not like", value, "identityDetail");
            return (Criteria) this;
        }

        public Criteria andIdentityDetailIn(List<String> values) {
            addCriterion("identity_detail in", values, "identityDetail");
            return (Criteria) this;
        }

        public Criteria andIdentityDetailNotIn(List<String> values) {
            addCriterion("identity_detail not in", values, "identityDetail");
            return (Criteria) this;
        }

        public Criteria andIdentityDetailBetween(String value1, String value2) {
            addCriterion("identity_detail between", value1, value2, "identityDetail");
            return (Criteria) this;
        }

        public Criteria andIdentityDetailNotBetween(String value1, String value2) {
            addCriterion("identity_detail not between", value1, value2, "identityDetail");
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

        public Criteria andRegisterAddressProvinceIsNull() {
            addCriterion("register_address_province is null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressProvinceIsNotNull() {
            addCriterion("register_address_province is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressProvinceEqualTo(String value) {
            addCriterion("register_address_province =", value, "registerAddressProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressProvinceNotEqualTo(String value) {
            addCriterion("register_address_province <>", value, "registerAddressProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressProvinceGreaterThan(String value) {
            addCriterion("register_address_province >", value, "registerAddressProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("register_address_province >=", value, "registerAddressProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressProvinceLessThan(String value) {
            addCriterion("register_address_province <", value, "registerAddressProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressProvinceLessThanOrEqualTo(String value) {
            addCriterion("register_address_province <=", value, "registerAddressProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressProvinceLike(String value) {
            addCriterion("register_address_province like", value, "registerAddressProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressProvinceNotLike(String value) {
            addCriterion("register_address_province not like", value, "registerAddressProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressProvinceIn(List<String> values) {
            addCriterion("register_address_province in", values, "registerAddressProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressProvinceNotIn(List<String> values) {
            addCriterion("register_address_province not in", values, "registerAddressProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressProvinceBetween(String value1, String value2) {
            addCriterion("register_address_province between", value1, value2, "registerAddressProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressProvinceNotBetween(String value1, String value2) {
            addCriterion("register_address_province not between", value1, value2, "registerAddressProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCityIsNull() {
            addCriterion("register_address_city is null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCityIsNotNull() {
            addCriterion("register_address_city is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCityEqualTo(String value) {
            addCriterion("register_address_city =", value, "registerAddressCity");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCityNotEqualTo(String value) {
            addCriterion("register_address_city <>", value, "registerAddressCity");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCityGreaterThan(String value) {
            addCriterion("register_address_city >", value, "registerAddressCity");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCityGreaterThanOrEqualTo(String value) {
            addCriterion("register_address_city >=", value, "registerAddressCity");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCityLessThan(String value) {
            addCriterion("register_address_city <", value, "registerAddressCity");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCityLessThanOrEqualTo(String value) {
            addCriterion("register_address_city <=", value, "registerAddressCity");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCityLike(String value) {
            addCriterion("register_address_city like", value, "registerAddressCity");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCityNotLike(String value) {
            addCriterion("register_address_city not like", value, "registerAddressCity");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCityIn(List<String> values) {
            addCriterion("register_address_city in", values, "registerAddressCity");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCityNotIn(List<String> values) {
            addCriterion("register_address_city not in", values, "registerAddressCity");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCityBetween(String value1, String value2) {
            addCriterion("register_address_city between", value1, value2, "registerAddressCity");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCityNotBetween(String value1, String value2) {
            addCriterion("register_address_city not between", value1, value2, "registerAddressCity");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCountryIsNull() {
            addCriterion("register_address_country is null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCountryIsNotNull() {
            addCriterion("register_address_country is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCountryEqualTo(String value) {
            addCriterion("register_address_country =", value, "registerAddressCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCountryNotEqualTo(String value) {
            addCriterion("register_address_country <>", value, "registerAddressCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCountryGreaterThan(String value) {
            addCriterion("register_address_country >", value, "registerAddressCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCountryGreaterThanOrEqualTo(String value) {
            addCriterion("register_address_country >=", value, "registerAddressCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCountryLessThan(String value) {
            addCriterion("register_address_country <", value, "registerAddressCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCountryLessThanOrEqualTo(String value) {
            addCriterion("register_address_country <=", value, "registerAddressCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCountryLike(String value) {
            addCriterion("register_address_country like", value, "registerAddressCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCountryNotLike(String value) {
            addCriterion("register_address_country not like", value, "registerAddressCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCountryIn(List<String> values) {
            addCriterion("register_address_country in", values, "registerAddressCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCountryNotIn(List<String> values) {
            addCriterion("register_address_country not in", values, "registerAddressCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCountryBetween(String value1, String value2) {
            addCriterion("register_address_country between", value1, value2, "registerAddressCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressCountryNotBetween(String value1, String value2) {
            addCriterion("register_address_country not between", value1, value2, "registerAddressCountry");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailIsNull() {
            addCriterion("register_address_detail is null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailIsNotNull() {
            addCriterion("register_address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailEqualTo(String value) {
            addCriterion("register_address_detail =", value, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailNotEqualTo(String value) {
            addCriterion("register_address_detail <>", value, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailGreaterThan(String value) {
            addCriterion("register_address_detail >", value, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("register_address_detail >=", value, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailLessThan(String value) {
            addCriterion("register_address_detail <", value, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("register_address_detail <=", value, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailLike(String value) {
            addCriterion("register_address_detail like", value, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailNotLike(String value) {
            addCriterion("register_address_detail not like", value, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailIn(List<String> values) {
            addCriterion("register_address_detail in", values, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailNotIn(List<String> values) {
            addCriterion("register_address_detail not in", values, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailBetween(String value1, String value2) {
            addCriterion("register_address_detail between", value1, value2, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailNotBetween(String value1, String value2) {
            addCriterion("register_address_detail not between", value1, value2, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andLiveAddressProvinceIsNull() {
            addCriterion("live_address_province is null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressProvinceIsNotNull() {
            addCriterion("live_address_province is not null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressProvinceEqualTo(String value) {
            addCriterion("live_address_province =", value, "liveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andLiveAddressProvinceNotEqualTo(String value) {
            addCriterion("live_address_province <>", value, "liveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andLiveAddressProvinceGreaterThan(String value) {
            addCriterion("live_address_province >", value, "liveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andLiveAddressProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("live_address_province >=", value, "liveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andLiveAddressProvinceLessThan(String value) {
            addCriterion("live_address_province <", value, "liveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andLiveAddressProvinceLessThanOrEqualTo(String value) {
            addCriterion("live_address_province <=", value, "liveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andLiveAddressProvinceLike(String value) {
            addCriterion("live_address_province like", value, "liveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andLiveAddressProvinceNotLike(String value) {
            addCriterion("live_address_province not like", value, "liveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andLiveAddressProvinceIn(List<String> values) {
            addCriterion("live_address_province in", values, "liveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andLiveAddressProvinceNotIn(List<String> values) {
            addCriterion("live_address_province not in", values, "liveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andLiveAddressProvinceBetween(String value1, String value2) {
            addCriterion("live_address_province between", value1, value2, "liveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andLiveAddressProvinceNotBetween(String value1, String value2) {
            addCriterion("live_address_province not between", value1, value2, "liveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCityIsNull() {
            addCriterion("live_address_city is null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCityIsNotNull() {
            addCriterion("live_address_city is not null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCityEqualTo(String value) {
            addCriterion("live_address_city =", value, "liveAddressCity");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCityNotEqualTo(String value) {
            addCriterion("live_address_city <>", value, "liveAddressCity");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCityGreaterThan(String value) {
            addCriterion("live_address_city >", value, "liveAddressCity");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCityGreaterThanOrEqualTo(String value) {
            addCriterion("live_address_city >=", value, "liveAddressCity");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCityLessThan(String value) {
            addCriterion("live_address_city <", value, "liveAddressCity");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCityLessThanOrEqualTo(String value) {
            addCriterion("live_address_city <=", value, "liveAddressCity");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCityLike(String value) {
            addCriterion("live_address_city like", value, "liveAddressCity");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCityNotLike(String value) {
            addCriterion("live_address_city not like", value, "liveAddressCity");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCityIn(List<String> values) {
            addCriterion("live_address_city in", values, "liveAddressCity");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCityNotIn(List<String> values) {
            addCriterion("live_address_city not in", values, "liveAddressCity");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCityBetween(String value1, String value2) {
            addCriterion("live_address_city between", value1, value2, "liveAddressCity");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCityNotBetween(String value1, String value2) {
            addCriterion("live_address_city not between", value1, value2, "liveAddressCity");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCountryIsNull() {
            addCriterion("live_address_country is null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCountryIsNotNull() {
            addCriterion("live_address_country is not null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCountryEqualTo(String value) {
            addCriterion("live_address_country =", value, "liveAddressCountry");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCountryNotEqualTo(String value) {
            addCriterion("live_address_country <>", value, "liveAddressCountry");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCountryGreaterThan(String value) {
            addCriterion("live_address_country >", value, "liveAddressCountry");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCountryGreaterThanOrEqualTo(String value) {
            addCriterion("live_address_country >=", value, "liveAddressCountry");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCountryLessThan(String value) {
            addCriterion("live_address_country <", value, "liveAddressCountry");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCountryLessThanOrEqualTo(String value) {
            addCriterion("live_address_country <=", value, "liveAddressCountry");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCountryLike(String value) {
            addCriterion("live_address_country like", value, "liveAddressCountry");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCountryNotLike(String value) {
            addCriterion("live_address_country not like", value, "liveAddressCountry");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCountryIn(List<String> values) {
            addCriterion("live_address_country in", values, "liveAddressCountry");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCountryNotIn(List<String> values) {
            addCriterion("live_address_country not in", values, "liveAddressCountry");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCountryBetween(String value1, String value2) {
            addCriterion("live_address_country between", value1, value2, "liveAddressCountry");
            return (Criteria) this;
        }

        public Criteria andLiveAddressCountryNotBetween(String value1, String value2) {
            addCriterion("live_address_country not between", value1, value2, "liveAddressCountry");
            return (Criteria) this;
        }

        public Criteria andLiveAddressDetailIsNull() {
            addCriterion("live_address_detail is null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressDetailIsNotNull() {
            addCriterion("live_address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressDetailEqualTo(String value) {
            addCriterion("live_address_detail =", value, "liveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andLiveAddressDetailNotEqualTo(String value) {
            addCriterion("live_address_detail <>", value, "liveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andLiveAddressDetailGreaterThan(String value) {
            addCriterion("live_address_detail >", value, "liveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andLiveAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("live_address_detail >=", value, "liveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andLiveAddressDetailLessThan(String value) {
            addCriterion("live_address_detail <", value, "liveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andLiveAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("live_address_detail <=", value, "liveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andLiveAddressDetailLike(String value) {
            addCriterion("live_address_detail like", value, "liveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andLiveAddressDetailNotLike(String value) {
            addCriterion("live_address_detail not like", value, "liveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andLiveAddressDetailIn(List<String> values) {
            addCriterion("live_address_detail in", values, "liveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andLiveAddressDetailNotIn(List<String> values) {
            addCriterion("live_address_detail not in", values, "liveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andLiveAddressDetailBetween(String value1, String value2) {
            addCriterion("live_address_detail between", value1, value2, "liveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andLiveAddressDetailNotBetween(String value1, String value2) {
            addCriterion("live_address_detail not between", value1, value2, "liveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeIsNull() {
            addCriterion("customer_grade is null");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeIsNotNull() {
            addCriterion("customer_grade is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeEqualTo(String value) {
            addCriterion("customer_grade =", value, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeNotEqualTo(String value) {
            addCriterion("customer_grade <>", value, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeGreaterThan(String value) {
            addCriterion("customer_grade >", value, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_grade >=", value, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeLessThan(String value) {
            addCriterion("customer_grade <", value, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeLessThanOrEqualTo(String value) {
            addCriterion("customer_grade <=", value, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeLike(String value) {
            addCriterion("customer_grade like", value, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeNotLike(String value) {
            addCriterion("customer_grade not like", value, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeIn(List<String> values) {
            addCriterion("customer_grade in", values, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeNotIn(List<String> values) {
            addCriterion("customer_grade not in", values, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeBetween(String value1, String value2) {
            addCriterion("customer_grade between", value1, value2, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeNotBetween(String value1, String value2) {
            addCriterion("customer_grade not between", value1, value2, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeIsNull() {
            addCriterion("financial_code is null");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeIsNotNull() {
            addCriterion("financial_code is not null");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeEqualTo(String value) {
            addCriterion("financial_code =", value, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeNotEqualTo(String value) {
            addCriterion("financial_code <>", value, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeGreaterThan(String value) {
            addCriterion("financial_code >", value, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("financial_code >=", value, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeLessThan(String value) {
            addCriterion("financial_code <", value, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeLessThanOrEqualTo(String value) {
            addCriterion("financial_code <=", value, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeLike(String value) {
            addCriterion("financial_code like", value, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeNotLike(String value) {
            addCriterion("financial_code not like", value, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeIn(List<String> values) {
            addCriterion("financial_code in", values, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeNotIn(List<String> values) {
            addCriterion("financial_code not in", values, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeBetween(String value1, String value2) {
            addCriterion("financial_code between", value1, value2, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeNotBetween(String value1, String value2) {
            addCriterion("financial_code not between", value1, value2, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFirstContactNameIsNull() {
            addCriterion("first_contact_name is null");
            return (Criteria) this;
        }

        public Criteria andFirstContactNameIsNotNull() {
            addCriterion("first_contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirstContactNameEqualTo(String value) {
            addCriterion("first_contact_name =", value, "firstContactName");
            return (Criteria) this;
        }

        public Criteria andFirstContactNameNotEqualTo(String value) {
            addCriterion("first_contact_name <>", value, "firstContactName");
            return (Criteria) this;
        }

        public Criteria andFirstContactNameGreaterThan(String value) {
            addCriterion("first_contact_name >", value, "firstContactName");
            return (Criteria) this;
        }

        public Criteria andFirstContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("first_contact_name >=", value, "firstContactName");
            return (Criteria) this;
        }

        public Criteria andFirstContactNameLessThan(String value) {
            addCriterion("first_contact_name <", value, "firstContactName");
            return (Criteria) this;
        }

        public Criteria andFirstContactNameLessThanOrEqualTo(String value) {
            addCriterion("first_contact_name <=", value, "firstContactName");
            return (Criteria) this;
        }

        public Criteria andFirstContactNameLike(String value) {
            addCriterion("first_contact_name like", value, "firstContactName");
            return (Criteria) this;
        }

        public Criteria andFirstContactNameNotLike(String value) {
            addCriterion("first_contact_name not like", value, "firstContactName");
            return (Criteria) this;
        }

        public Criteria andFirstContactNameIn(List<String> values) {
            addCriterion("first_contact_name in", values, "firstContactName");
            return (Criteria) this;
        }

        public Criteria andFirstContactNameNotIn(List<String> values) {
            addCriterion("first_contact_name not in", values, "firstContactName");
            return (Criteria) this;
        }

        public Criteria andFirstContactNameBetween(String value1, String value2) {
            addCriterion("first_contact_name between", value1, value2, "firstContactName");
            return (Criteria) this;
        }

        public Criteria andFirstContactNameNotBetween(String value1, String value2) {
            addCriterion("first_contact_name not between", value1, value2, "firstContactName");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneIsNull() {
            addCriterion("first_contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneIsNotNull() {
            addCriterion("first_contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneEqualTo(String value) {
            addCriterion("first_contact_phone =", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneNotEqualTo(String value) {
            addCriterion("first_contact_phone <>", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneGreaterThan(String value) {
            addCriterion("first_contact_phone >", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("first_contact_phone >=", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneLessThan(String value) {
            addCriterion("first_contact_phone <", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("first_contact_phone <=", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneLike(String value) {
            addCriterion("first_contact_phone like", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneNotLike(String value) {
            addCriterion("first_contact_phone not like", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneIn(List<String> values) {
            addCriterion("first_contact_phone in", values, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneNotIn(List<String> values) {
            addCriterion("first_contact_phone not in", values, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneBetween(String value1, String value2) {
            addCriterion("first_contact_phone between", value1, value2, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneNotBetween(String value1, String value2) {
            addCriterion("first_contact_phone not between", value1, value2, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerIndustryIsNull() {
            addCriterion("customer_industry is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIndustryIsNotNull() {
            addCriterion("customer_industry is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIndustryEqualTo(String value) {
            addCriterion("customer_industry =", value, "customerIndustry");
            return (Criteria) this;
        }

        public Criteria andCustomerIndustryNotEqualTo(String value) {
            addCriterion("customer_industry <>", value, "customerIndustry");
            return (Criteria) this;
        }

        public Criteria andCustomerIndustryGreaterThan(String value) {
            addCriterion("customer_industry >", value, "customerIndustry");
            return (Criteria) this;
        }

        public Criteria andCustomerIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("customer_industry >=", value, "customerIndustry");
            return (Criteria) this;
        }

        public Criteria andCustomerIndustryLessThan(String value) {
            addCriterion("customer_industry <", value, "customerIndustry");
            return (Criteria) this;
        }

        public Criteria andCustomerIndustryLessThanOrEqualTo(String value) {
            addCriterion("customer_industry <=", value, "customerIndustry");
            return (Criteria) this;
        }

        public Criteria andCustomerIndustryLike(String value) {
            addCriterion("customer_industry like", value, "customerIndustry");
            return (Criteria) this;
        }

        public Criteria andCustomerIndustryNotLike(String value) {
            addCriterion("customer_industry not like", value, "customerIndustry");
            return (Criteria) this;
        }

        public Criteria andCustomerIndustryIn(List<String> values) {
            addCriterion("customer_industry in", values, "customerIndustry");
            return (Criteria) this;
        }

        public Criteria andCustomerIndustryNotIn(List<String> values) {
            addCriterion("customer_industry not in", values, "customerIndustry");
            return (Criteria) this;
        }

        public Criteria andCustomerIndustryBetween(String value1, String value2) {
            addCriterion("customer_industry between", value1, value2, "customerIndustry");
            return (Criteria) this;
        }

        public Criteria andCustomerIndustryNotBetween(String value1, String value2) {
            addCriterion("customer_industry not between", value1, value2, "customerIndustry");
            return (Criteria) this;
        }

        public Criteria andFrequentCustomerIsNull() {
            addCriterion("frequent_customer is null");
            return (Criteria) this;
        }

        public Criteria andFrequentCustomerIsNotNull() {
            addCriterion("frequent_customer is not null");
            return (Criteria) this;
        }

        public Criteria andFrequentCustomerEqualTo(String value) {
            addCriterion("frequent_customer =", value, "frequentCustomer");
            return (Criteria) this;
        }

        public Criteria andFrequentCustomerNotEqualTo(String value) {
            addCriterion("frequent_customer <>", value, "frequentCustomer");
            return (Criteria) this;
        }

        public Criteria andFrequentCustomerGreaterThan(String value) {
            addCriterion("frequent_customer >", value, "frequentCustomer");
            return (Criteria) this;
        }

        public Criteria andFrequentCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("frequent_customer >=", value, "frequentCustomer");
            return (Criteria) this;
        }

        public Criteria andFrequentCustomerLessThan(String value) {
            addCriterion("frequent_customer <", value, "frequentCustomer");
            return (Criteria) this;
        }

        public Criteria andFrequentCustomerLessThanOrEqualTo(String value) {
            addCriterion("frequent_customer <=", value, "frequentCustomer");
            return (Criteria) this;
        }

        public Criteria andFrequentCustomerLike(String value) {
            addCriterion("frequent_customer like", value, "frequentCustomer");
            return (Criteria) this;
        }

        public Criteria andFrequentCustomerNotLike(String value) {
            addCriterion("frequent_customer not like", value, "frequentCustomer");
            return (Criteria) this;
        }

        public Criteria andFrequentCustomerIn(List<String> values) {
            addCriterion("frequent_customer in", values, "frequentCustomer");
            return (Criteria) this;
        }

        public Criteria andFrequentCustomerNotIn(List<String> values) {
            addCriterion("frequent_customer not in", values, "frequentCustomer");
            return (Criteria) this;
        }

        public Criteria andFrequentCustomerBetween(String value1, String value2) {
            addCriterion("frequent_customer between", value1, value2, "frequentCustomer");
            return (Criteria) this;
        }

        public Criteria andFrequentCustomerNotBetween(String value1, String value2) {
            addCriterion("frequent_customer not between", value1, value2, "frequentCustomer");
            return (Criteria) this;
        }

        public Criteria andIsblackIsNull() {
            addCriterion("isBlack is null");
            return (Criteria) this;
        }

        public Criteria andIsblackIsNotNull() {
            addCriterion("isBlack is not null");
            return (Criteria) this;
        }

        public Criteria andIsblackEqualTo(Integer value) {
            addCriterion("isBlack =", value, "isblack");
            return (Criteria) this;
        }

        public Criteria andIsblackNotEqualTo(Integer value) {
            addCriterion("isBlack <>", value, "isblack");
            return (Criteria) this;
        }

        public Criteria andIsblackGreaterThan(Integer value) {
            addCriterion("isBlack >", value, "isblack");
            return (Criteria) this;
        }

        public Criteria andIsblackGreaterThanOrEqualTo(Integer value) {
            addCriterion("isBlack >=", value, "isblack");
            return (Criteria) this;
        }

        public Criteria andIsblackLessThan(Integer value) {
            addCriterion("isBlack <", value, "isblack");
            return (Criteria) this;
        }

        public Criteria andIsblackLessThanOrEqualTo(Integer value) {
            addCriterion("isBlack <=", value, "isblack");
            return (Criteria) this;
        }

        public Criteria andIsblackIn(List<Integer> values) {
            addCriterion("isBlack in", values, "isblack");
            return (Criteria) this;
        }

        public Criteria andIsblackNotIn(List<Integer> values) {
            addCriterion("isBlack not in", values, "isblack");
            return (Criteria) this;
        }

        public Criteria andIsblackBetween(Integer value1, Integer value2) {
            addCriterion("isBlack between", value1, value2, "isblack");
            return (Criteria) this;
        }

        public Criteria andIsblackNotBetween(Integer value1, Integer value2) {
            addCriterion("isBlack not between", value1, value2, "isblack");
            return (Criteria) this;
        }
    }

    /**
     * customer_info表的操作类
     * 
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * customer_info表的操作类
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