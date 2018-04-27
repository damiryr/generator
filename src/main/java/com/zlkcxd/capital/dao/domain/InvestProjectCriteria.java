package com.zlkcxd.capital.dao.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InvestProjectCriteria {
    /**
     * invest_project表的操作属性:orderByClause
     * 
     */
    protected String orderByClause;

    /**
     * invest_project表的操作属性:start
     * 
     */
    protected int start;

    /**
     * invest_project表的操作属性:limit
     * 
     */
    protected int limit;

    /**
     * invest_project表的操作属性:distinct
     * 
     */
    protected boolean distinct;

    /**
     * invest_project表的操作属性:oredCriteria
     * 
     */
    protected List<Criteria> oredCriteria;

    /**
     * invest_project数据表的操作方法: InvestProjectCriteria  
     * 
     */
    public InvestProjectCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * invest_project数据表的操作方法: setOrderByClause  
     * 
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * invest_project数据表的操作方法: getOrderByClause  
     * 
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * invest_project数据表的操作方法: setStart  
     * 
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * invest_project数据表的操作方法: getStart  
     * 
     */
    public int getStart() {
        return start;
    }

    /**
     * invest_project数据表的操作方法: setLimit  
     * 
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * invest_project数据表的操作方法: getLimit  
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * invest_project数据表的操作方法: setDistinct  
     * 
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * invest_project数据表的操作方法: isDistinct  
     * 
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * invest_project数据表的操作方法: getOredCriteria  
     * 
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * invest_project数据表的操作方法: or  
     * 
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * invest_project数据表的操作方法: or  
     * 
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * invest_project数据表的操作方法: createCriteria  
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
     * invest_project数据表的操作方法: createCriteriaInternal  
     * 
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * invest_project数据表的操作方法: clear  
     * 
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * invest_project表的操作类
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

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andInvestProjectIdIsNull() {
            addCriterion("invest_project_id is null");
            return (Criteria) this;
        }

        public Criteria andInvestProjectIdIsNotNull() {
            addCriterion("invest_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvestProjectIdEqualTo(Long value) {
            addCriterion("invest_project_id =", value, "investProjectId");
            return (Criteria) this;
        }

        public Criteria andInvestProjectIdNotEqualTo(Long value) {
            addCriterion("invest_project_id <>", value, "investProjectId");
            return (Criteria) this;
        }

        public Criteria andInvestProjectIdGreaterThan(Long value) {
            addCriterion("invest_project_id >", value, "investProjectId");
            return (Criteria) this;
        }

        public Criteria andInvestProjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("invest_project_id >=", value, "investProjectId");
            return (Criteria) this;
        }

        public Criteria andInvestProjectIdLessThan(Long value) {
            addCriterion("invest_project_id <", value, "investProjectId");
            return (Criteria) this;
        }

        public Criteria andInvestProjectIdLessThanOrEqualTo(Long value) {
            addCriterion("invest_project_id <=", value, "investProjectId");
            return (Criteria) this;
        }

        public Criteria andInvestProjectIdIn(List<Long> values) {
            addCriterion("invest_project_id in", values, "investProjectId");
            return (Criteria) this;
        }

        public Criteria andInvestProjectIdNotIn(List<Long> values) {
            addCriterion("invest_project_id not in", values, "investProjectId");
            return (Criteria) this;
        }

        public Criteria andInvestProjectIdBetween(Long value1, Long value2) {
            addCriterion("invest_project_id between", value1, value2, "investProjectId");
            return (Criteria) this;
        }

        public Criteria andInvestProjectIdNotBetween(Long value1, Long value2) {
            addCriterion("invest_project_id not between", value1, value2, "investProjectId");
            return (Criteria) this;
        }

        public Criteria andInvestTypeIsNull() {
            addCriterion("invest_type is null");
            return (Criteria) this;
        }

        public Criteria andInvestTypeIsNotNull() {
            addCriterion("invest_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvestTypeEqualTo(Integer value) {
            addCriterion("invest_type =", value, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeNotEqualTo(Integer value) {
            addCriterion("invest_type <>", value, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeGreaterThan(Integer value) {
            addCriterion("invest_type >", value, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("invest_type >=", value, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeLessThan(Integer value) {
            addCriterion("invest_type <", value, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeLessThanOrEqualTo(Integer value) {
            addCriterion("invest_type <=", value, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeIn(List<Integer> values) {
            addCriterion("invest_type in", values, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeNotIn(List<Integer> values) {
            addCriterion("invest_type not in", values, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeBetween(Integer value1, Integer value2) {
            addCriterion("invest_type between", value1, value2, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("invest_type not between", value1, value2, "investType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNull() {
            addCriterion("project_type is null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNotNull() {
            addCriterion("project_type is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeEqualTo(Integer value) {
            addCriterion("project_type =", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotEqualTo(Integer value) {
            addCriterion("project_type <>", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThan(Integer value) {
            addCriterion("project_type >", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_type >=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThan(Integer value) {
            addCriterion("project_type <", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThanOrEqualTo(Integer value) {
            addCriterion("project_type <=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIn(List<Integer> values) {
            addCriterion("project_type in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotIn(List<Integer> values) {
            addCriterion("project_type not in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeBetween(Integer value1, Integer value2) {
            addCriterion("project_type between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("project_type not between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectAmountIsNull() {
            addCriterion("project_amount is null");
            return (Criteria) this;
        }

        public Criteria andProjectAmountIsNotNull() {
            addCriterion("project_amount is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAmountEqualTo(BigDecimal value) {
            addCriterion("project_amount =", value, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountNotEqualTo(BigDecimal value) {
            addCriterion("project_amount <>", value, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountGreaterThan(BigDecimal value) {
            addCriterion("project_amount >", value, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("project_amount >=", value, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountLessThan(BigDecimal value) {
            addCriterion("project_amount <", value, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("project_amount <=", value, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountIn(List<BigDecimal> values) {
            addCriterion("project_amount in", values, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountNotIn(List<BigDecimal> values) {
            addCriterion("project_amount not in", values, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_amount between", value1, value2, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_amount not between", value1, value2, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectProfitTateIsNull() {
            addCriterion("project_profit_tate is null");
            return (Criteria) this;
        }

        public Criteria andProjectProfitTateIsNotNull() {
            addCriterion("project_profit_tate is not null");
            return (Criteria) this;
        }

        public Criteria andProjectProfitTateEqualTo(BigDecimal value) {
            addCriterion("project_profit_tate =", value, "projectProfitTate");
            return (Criteria) this;
        }

        public Criteria andProjectProfitTateNotEqualTo(BigDecimal value) {
            addCriterion("project_profit_tate <>", value, "projectProfitTate");
            return (Criteria) this;
        }

        public Criteria andProjectProfitTateGreaterThan(BigDecimal value) {
            addCriterion("project_profit_tate >", value, "projectProfitTate");
            return (Criteria) this;
        }

        public Criteria andProjectProfitTateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("project_profit_tate >=", value, "projectProfitTate");
            return (Criteria) this;
        }

        public Criteria andProjectProfitTateLessThan(BigDecimal value) {
            addCriterion("project_profit_tate <", value, "projectProfitTate");
            return (Criteria) this;
        }

        public Criteria andProjectProfitTateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("project_profit_tate <=", value, "projectProfitTate");
            return (Criteria) this;
        }

        public Criteria andProjectProfitTateIn(List<BigDecimal> values) {
            addCriterion("project_profit_tate in", values, "projectProfitTate");
            return (Criteria) this;
        }

        public Criteria andProjectProfitTateNotIn(List<BigDecimal> values) {
            addCriterion("project_profit_tate not in", values, "projectProfitTate");
            return (Criteria) this;
        }

        public Criteria andProjectProfitTateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_profit_tate between", value1, value2, "projectProfitTate");
            return (Criteria) this;
        }

        public Criteria andProjectProfitTateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_profit_tate not between", value1, value2, "projectProfitTate");
            return (Criteria) this;
        }

        public Criteria andCompanyInvestAmountIsNull() {
            addCriterion("company_invest_amount is null");
            return (Criteria) this;
        }

        public Criteria andCompanyInvestAmountIsNotNull() {
            addCriterion("company_invest_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyInvestAmountEqualTo(BigDecimal value) {
            addCriterion("company_invest_amount =", value, "companyInvestAmount");
            return (Criteria) this;
        }

        public Criteria andCompanyInvestAmountNotEqualTo(BigDecimal value) {
            addCriterion("company_invest_amount <>", value, "companyInvestAmount");
            return (Criteria) this;
        }

        public Criteria andCompanyInvestAmountGreaterThan(BigDecimal value) {
            addCriterion("company_invest_amount >", value, "companyInvestAmount");
            return (Criteria) this;
        }

        public Criteria andCompanyInvestAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("company_invest_amount >=", value, "companyInvestAmount");
            return (Criteria) this;
        }

        public Criteria andCompanyInvestAmountLessThan(BigDecimal value) {
            addCriterion("company_invest_amount <", value, "companyInvestAmount");
            return (Criteria) this;
        }

        public Criteria andCompanyInvestAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("company_invest_amount <=", value, "companyInvestAmount");
            return (Criteria) this;
        }

        public Criteria andCompanyInvestAmountIn(List<BigDecimal> values) {
            addCriterion("company_invest_amount in", values, "companyInvestAmount");
            return (Criteria) this;
        }

        public Criteria andCompanyInvestAmountNotIn(List<BigDecimal> values) {
            addCriterion("company_invest_amount not in", values, "companyInvestAmount");
            return (Criteria) this;
        }

        public Criteria andCompanyInvestAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("company_invest_amount between", value1, value2, "companyInvestAmount");
            return (Criteria) this;
        }

        public Criteria andCompanyInvestAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("company_invest_amount not between", value1, value2, "companyInvestAmount");
            return (Criteria) this;
        }

        public Criteria andRaiseCapitalLimitIsNull() {
            addCriterion("raise_capital_limit is null");
            return (Criteria) this;
        }

        public Criteria andRaiseCapitalLimitIsNotNull() {
            addCriterion("raise_capital_limit is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseCapitalLimitEqualTo(BigDecimal value) {
            addCriterion("raise_capital_limit =", value, "raiseCapitalLimit");
            return (Criteria) this;
        }

        public Criteria andRaiseCapitalLimitNotEqualTo(BigDecimal value) {
            addCriterion("raise_capital_limit <>", value, "raiseCapitalLimit");
            return (Criteria) this;
        }

        public Criteria andRaiseCapitalLimitGreaterThan(BigDecimal value) {
            addCriterion("raise_capital_limit >", value, "raiseCapitalLimit");
            return (Criteria) this;
        }

        public Criteria andRaiseCapitalLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("raise_capital_limit >=", value, "raiseCapitalLimit");
            return (Criteria) this;
        }

        public Criteria andRaiseCapitalLimitLessThan(BigDecimal value) {
            addCriterion("raise_capital_limit <", value, "raiseCapitalLimit");
            return (Criteria) this;
        }

        public Criteria andRaiseCapitalLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("raise_capital_limit <=", value, "raiseCapitalLimit");
            return (Criteria) this;
        }

        public Criteria andRaiseCapitalLimitIn(List<BigDecimal> values) {
            addCriterion("raise_capital_limit in", values, "raiseCapitalLimit");
            return (Criteria) this;
        }

        public Criteria andRaiseCapitalLimitNotIn(List<BigDecimal> values) {
            addCriterion("raise_capital_limit not in", values, "raiseCapitalLimit");
            return (Criteria) this;
        }

        public Criteria andRaiseCapitalLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("raise_capital_limit between", value1, value2, "raiseCapitalLimit");
            return (Criteria) this;
        }

        public Criteria andRaiseCapitalLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("raise_capital_limit not between", value1, value2, "raiseCapitalLimit");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateIsNull() {
            addCriterion("project_start_date is null");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateIsNotNull() {
            addCriterion("project_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("project_start_date =", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("project_start_date <>", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("project_start_date >", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_start_date >=", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateLessThan(Date value) {
            addCriterionForJDBCDate("project_start_date <", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_start_date <=", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("project_start_date in", values, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("project_start_date not in", values, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_start_date between", value1, value2, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_start_date not between", value1, value2, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateIsNull() {
            addCriterion("project_end_date is null");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateIsNotNull() {
            addCriterion("project_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("project_end_date =", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("project_end_date <>", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("project_end_date >", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_end_date >=", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateLessThan(Date value) {
            addCriterionForJDBCDate("project_end_date <", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_end_date <=", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("project_end_date in", values, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("project_end_date not in", values, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_end_date between", value1, value2, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_end_date not between", value1, value2, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectDaysIsNull() {
            addCriterion("project_days is null");
            return (Criteria) this;
        }

        public Criteria andProjectDaysIsNotNull() {
            addCriterion("project_days is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDaysEqualTo(Integer value) {
            addCriterion("project_days =", value, "projectDays");
            return (Criteria) this;
        }

        public Criteria andProjectDaysNotEqualTo(Integer value) {
            addCriterion("project_days <>", value, "projectDays");
            return (Criteria) this;
        }

        public Criteria andProjectDaysGreaterThan(Integer value) {
            addCriterion("project_days >", value, "projectDays");
            return (Criteria) this;
        }

        public Criteria andProjectDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_days >=", value, "projectDays");
            return (Criteria) this;
        }

        public Criteria andProjectDaysLessThan(Integer value) {
            addCriterion("project_days <", value, "projectDays");
            return (Criteria) this;
        }

        public Criteria andProjectDaysLessThanOrEqualTo(Integer value) {
            addCriterion("project_days <=", value, "projectDays");
            return (Criteria) this;
        }

        public Criteria andProjectDaysIn(List<Integer> values) {
            addCriterion("project_days in", values, "projectDays");
            return (Criteria) this;
        }

        public Criteria andProjectDaysNotIn(List<Integer> values) {
            addCriterion("project_days not in", values, "projectDays");
            return (Criteria) this;
        }

        public Criteria andProjectDaysBetween(Integer value1, Integer value2) {
            addCriterion("project_days between", value1, value2, "projectDays");
            return (Criteria) this;
        }

        public Criteria andProjectDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("project_days not between", value1, value2, "projectDays");
            return (Criteria) this;
        }

        public Criteria andRaiseDateIsNull() {
            addCriterion("raise_date is null");
            return (Criteria) this;
        }

        public Criteria andRaiseDateIsNotNull() {
            addCriterion("raise_date is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseDateEqualTo(Date value) {
            addCriterionForJDBCDate("raise_date =", value, "raiseDate");
            return (Criteria) this;
        }

        public Criteria andRaiseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("raise_date <>", value, "raiseDate");
            return (Criteria) this;
        }

        public Criteria andRaiseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("raise_date >", value, "raiseDate");
            return (Criteria) this;
        }

        public Criteria andRaiseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("raise_date >=", value, "raiseDate");
            return (Criteria) this;
        }

        public Criteria andRaiseDateLessThan(Date value) {
            addCriterionForJDBCDate("raise_date <", value, "raiseDate");
            return (Criteria) this;
        }

        public Criteria andRaiseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("raise_date <=", value, "raiseDate");
            return (Criteria) this;
        }

        public Criteria andRaiseDateIn(List<Date> values) {
            addCriterionForJDBCDate("raise_date in", values, "raiseDate");
            return (Criteria) this;
        }

        public Criteria andRaiseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("raise_date not in", values, "raiseDate");
            return (Criteria) this;
        }

        public Criteria andRaiseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("raise_date between", value1, value2, "raiseDate");
            return (Criteria) this;
        }

        public Criteria andRaiseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("raise_date not between", value1, value2, "raiseDate");
            return (Criteria) this;
        }

        public Criteria andInvestDayIsNull() {
            addCriterion("Invest_day is null");
            return (Criteria) this;
        }

        public Criteria andInvestDayIsNotNull() {
            addCriterion("Invest_day is not null");
            return (Criteria) this;
        }

        public Criteria andInvestDayEqualTo(Date value) {
            addCriterionForJDBCDate("Invest_day =", value, "investDay");
            return (Criteria) this;
        }

        public Criteria andInvestDayNotEqualTo(Date value) {
            addCriterionForJDBCDate("Invest_day <>", value, "investDay");
            return (Criteria) this;
        }

        public Criteria andInvestDayGreaterThan(Date value) {
            addCriterionForJDBCDate("Invest_day >", value, "investDay");
            return (Criteria) this;
        }

        public Criteria andInvestDayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Invest_day >=", value, "investDay");
            return (Criteria) this;
        }

        public Criteria andInvestDayLessThan(Date value) {
            addCriterionForJDBCDate("Invest_day <", value, "investDay");
            return (Criteria) this;
        }

        public Criteria andInvestDayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Invest_day <=", value, "investDay");
            return (Criteria) this;
        }

        public Criteria andInvestDayIn(List<Date> values) {
            addCriterionForJDBCDate("Invest_day in", values, "investDay");
            return (Criteria) this;
        }

        public Criteria andInvestDayNotIn(List<Date> values) {
            addCriterionForJDBCDate("Invest_day not in", values, "investDay");
            return (Criteria) this;
        }

        public Criteria andInvestDayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Invest_day between", value1, value2, "investDay");
            return (Criteria) this;
        }

        public Criteria andInvestDayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Invest_day not between", value1, value2, "investDay");
            return (Criteria) this;
        }

        public Criteria andYearOpenDateIsNull() {
            addCriterion("year_open_date is null");
            return (Criteria) this;
        }

        public Criteria andYearOpenDateIsNotNull() {
            addCriterion("year_open_date is not null");
            return (Criteria) this;
        }

        public Criteria andYearOpenDateEqualTo(Date value) {
            addCriterionForJDBCDate("year_open_date =", value, "yearOpenDate");
            return (Criteria) this;
        }

        public Criteria andYearOpenDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("year_open_date <>", value, "yearOpenDate");
            return (Criteria) this;
        }

        public Criteria andYearOpenDateGreaterThan(Date value) {
            addCriterionForJDBCDate("year_open_date >", value, "yearOpenDate");
            return (Criteria) this;
        }

        public Criteria andYearOpenDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("year_open_date >=", value, "yearOpenDate");
            return (Criteria) this;
        }

        public Criteria andYearOpenDateLessThan(Date value) {
            addCriterionForJDBCDate("year_open_date <", value, "yearOpenDate");
            return (Criteria) this;
        }

        public Criteria andYearOpenDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("year_open_date <=", value, "yearOpenDate");
            return (Criteria) this;
        }

        public Criteria andYearOpenDateIn(List<Date> values) {
            addCriterionForJDBCDate("year_open_date in", values, "yearOpenDate");
            return (Criteria) this;
        }

        public Criteria andYearOpenDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("year_open_date not in", values, "yearOpenDate");
            return (Criteria) this;
        }

        public Criteria andYearOpenDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("year_open_date between", value1, value2, "yearOpenDate");
            return (Criteria) this;
        }

        public Criteria andYearOpenDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("year_open_date not between", value1, value2, "yearOpenDate");
            return (Criteria) this;
        }

        public Criteria andProjectStageIsNull() {
            addCriterion("project_stage is null");
            return (Criteria) this;
        }

        public Criteria andProjectStageIsNotNull() {
            addCriterion("project_stage is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStageEqualTo(Integer value) {
            addCriterion("project_stage =", value, "projectStage");
            return (Criteria) this;
        }

        public Criteria andProjectStageNotEqualTo(Integer value) {
            addCriterion("project_stage <>", value, "projectStage");
            return (Criteria) this;
        }

        public Criteria andProjectStageGreaterThan(Integer value) {
            addCriterion("project_stage >", value, "projectStage");
            return (Criteria) this;
        }

        public Criteria andProjectStageGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_stage >=", value, "projectStage");
            return (Criteria) this;
        }

        public Criteria andProjectStageLessThan(Integer value) {
            addCriterion("project_stage <", value, "projectStage");
            return (Criteria) this;
        }

        public Criteria andProjectStageLessThanOrEqualTo(Integer value) {
            addCriterion("project_stage <=", value, "projectStage");
            return (Criteria) this;
        }

        public Criteria andProjectStageIn(List<Integer> values) {
            addCriterion("project_stage in", values, "projectStage");
            return (Criteria) this;
        }

        public Criteria andProjectStageNotIn(List<Integer> values) {
            addCriterion("project_stage not in", values, "projectStage");
            return (Criteria) this;
        }

        public Criteria andProjectStageBetween(Integer value1, Integer value2) {
            addCriterion("project_stage between", value1, value2, "projectStage");
            return (Criteria) this;
        }

        public Criteria andProjectStageNotBetween(Integer value1, Integer value2) {
            addCriterion("project_stage not between", value1, value2, "projectStage");
            return (Criteria) this;
        }

        public Criteria andOpenTimesIsNull() {
            addCriterion("open_times is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimesIsNotNull() {
            addCriterion("open_times is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimesEqualTo(Integer value) {
            addCriterion("open_times =", value, "openTimes");
            return (Criteria) this;
        }

        public Criteria andOpenTimesNotEqualTo(Integer value) {
            addCriterion("open_times <>", value, "openTimes");
            return (Criteria) this;
        }

        public Criteria andOpenTimesGreaterThan(Integer value) {
            addCriterion("open_times >", value, "openTimes");
            return (Criteria) this;
        }

        public Criteria andOpenTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("open_times >=", value, "openTimes");
            return (Criteria) this;
        }

        public Criteria andOpenTimesLessThan(Integer value) {
            addCriterion("open_times <", value, "openTimes");
            return (Criteria) this;
        }

        public Criteria andOpenTimesLessThanOrEqualTo(Integer value) {
            addCriterion("open_times <=", value, "openTimes");
            return (Criteria) this;
        }

        public Criteria andOpenTimesIn(List<Integer> values) {
            addCriterion("open_times in", values, "openTimes");
            return (Criteria) this;
        }

        public Criteria andOpenTimesNotIn(List<Integer> values) {
            addCriterion("open_times not in", values, "openTimes");
            return (Criteria) this;
        }

        public Criteria andOpenTimesBetween(Integer value1, Integer value2) {
            addCriterion("open_times between", value1, value2, "openTimes");
            return (Criteria) this;
        }

        public Criteria andOpenTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("open_times not between", value1, value2, "openTimes");
            return (Criteria) this;
        }

        public Criteria andIsOpenRaiseIsNull() {
            addCriterion("is_open_raise is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenRaiseIsNotNull() {
            addCriterion("is_open_raise is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenRaiseEqualTo(Integer value) {
            addCriterion("is_open_raise =", value, "isOpenRaise");
            return (Criteria) this;
        }

        public Criteria andIsOpenRaiseNotEqualTo(Integer value) {
            addCriterion("is_open_raise <>", value, "isOpenRaise");
            return (Criteria) this;
        }

        public Criteria andIsOpenRaiseGreaterThan(Integer value) {
            addCriterion("is_open_raise >", value, "isOpenRaise");
            return (Criteria) this;
        }

        public Criteria andIsOpenRaiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_open_raise >=", value, "isOpenRaise");
            return (Criteria) this;
        }

        public Criteria andIsOpenRaiseLessThan(Integer value) {
            addCriterion("is_open_raise <", value, "isOpenRaise");
            return (Criteria) this;
        }

        public Criteria andIsOpenRaiseLessThanOrEqualTo(Integer value) {
            addCriterion("is_open_raise <=", value, "isOpenRaise");
            return (Criteria) this;
        }

        public Criteria andIsOpenRaiseIn(List<Integer> values) {
            addCriterion("is_open_raise in", values, "isOpenRaise");
            return (Criteria) this;
        }

        public Criteria andIsOpenRaiseNotIn(List<Integer> values) {
            addCriterion("is_open_raise not in", values, "isOpenRaise");
            return (Criteria) this;
        }

        public Criteria andIsOpenRaiseBetween(Integer value1, Integer value2) {
            addCriterion("is_open_raise between", value1, value2, "isOpenRaise");
            return (Criteria) this;
        }

        public Criteria andIsOpenRaiseNotBetween(Integer value1, Integer value2) {
            addCriterion("is_open_raise not between", value1, value2, "isOpenRaise");
            return (Criteria) this;
        }

        public Criteria andProjectDescribeIsNull() {
            addCriterion("project_describe is null");
            return (Criteria) this;
        }

        public Criteria andProjectDescribeIsNotNull() {
            addCriterion("project_describe is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDescribeEqualTo(String value) {
            addCriterion("project_describe =", value, "projectDescribe");
            return (Criteria) this;
        }

        public Criteria andProjectDescribeNotEqualTo(String value) {
            addCriterion("project_describe <>", value, "projectDescribe");
            return (Criteria) this;
        }

        public Criteria andProjectDescribeGreaterThan(String value) {
            addCriterion("project_describe >", value, "projectDescribe");
            return (Criteria) this;
        }

        public Criteria andProjectDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("project_describe >=", value, "projectDescribe");
            return (Criteria) this;
        }

        public Criteria andProjectDescribeLessThan(String value) {
            addCriterion("project_describe <", value, "projectDescribe");
            return (Criteria) this;
        }

        public Criteria andProjectDescribeLessThanOrEqualTo(String value) {
            addCriterion("project_describe <=", value, "projectDescribe");
            return (Criteria) this;
        }

        public Criteria andProjectDescribeLike(String value) {
            addCriterion("project_describe like", value, "projectDescribe");
            return (Criteria) this;
        }

        public Criteria andProjectDescribeNotLike(String value) {
            addCriterion("project_describe not like", value, "projectDescribe");
            return (Criteria) this;
        }

        public Criteria andProjectDescribeIn(List<String> values) {
            addCriterion("project_describe in", values, "projectDescribe");
            return (Criteria) this;
        }

        public Criteria andProjectDescribeNotIn(List<String> values) {
            addCriterion("project_describe not in", values, "projectDescribe");
            return (Criteria) this;
        }

        public Criteria andProjectDescribeBetween(String value1, String value2) {
            addCriterion("project_describe between", value1, value2, "projectDescribe");
            return (Criteria) this;
        }

        public Criteria andProjectDescribeNotBetween(String value1, String value2) {
            addCriterion("project_describe not between", value1, value2, "projectDescribe");
            return (Criteria) this;
        }

        public Criteria andProjectBalanceIsNull() {
            addCriterion("project_balance is null");
            return (Criteria) this;
        }

        public Criteria andProjectBalanceIsNotNull() {
            addCriterion("project_balance is not null");
            return (Criteria) this;
        }

        public Criteria andProjectBalanceEqualTo(BigDecimal value) {
            addCriterion("project_balance =", value, "projectBalance");
            return (Criteria) this;
        }

        public Criteria andProjectBalanceNotEqualTo(BigDecimal value) {
            addCriterion("project_balance <>", value, "projectBalance");
            return (Criteria) this;
        }

        public Criteria andProjectBalanceGreaterThan(BigDecimal value) {
            addCriterion("project_balance >", value, "projectBalance");
            return (Criteria) this;
        }

        public Criteria andProjectBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("project_balance >=", value, "projectBalance");
            return (Criteria) this;
        }

        public Criteria andProjectBalanceLessThan(BigDecimal value) {
            addCriterion("project_balance <", value, "projectBalance");
            return (Criteria) this;
        }

        public Criteria andProjectBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("project_balance <=", value, "projectBalance");
            return (Criteria) this;
        }

        public Criteria andProjectBalanceIn(List<BigDecimal> values) {
            addCriterion("project_balance in", values, "projectBalance");
            return (Criteria) this;
        }

        public Criteria andProjectBalanceNotIn(List<BigDecimal> values) {
            addCriterion("project_balance not in", values, "projectBalance");
            return (Criteria) this;
        }

        public Criteria andProjectBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_balance between", value1, value2, "projectBalance");
            return (Criteria) this;
        }

        public Criteria andProjectBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_balance not between", value1, value2, "projectBalance");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusIsNull() {
            addCriterion("settlement_status is null");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusIsNotNull() {
            addCriterion("settlement_status is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusEqualTo(Integer value) {
            addCriterion("settlement_status =", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotEqualTo(Integer value) {
            addCriterion("settlement_status <>", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusGreaterThan(Integer value) {
            addCriterion("settlement_status >", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("settlement_status >=", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusLessThan(Integer value) {
            addCriterion("settlement_status <", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusLessThanOrEqualTo(Integer value) {
            addCriterion("settlement_status <=", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusIn(List<Integer> values) {
            addCriterion("settlement_status in", values, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotIn(List<Integer> values) {
            addCriterion("settlement_status not in", values, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusBetween(Integer value1, Integer value2) {
            addCriterion("settlement_status between", value1, value2, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("settlement_status not between", value1, value2, "settlementStatus");
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
    }

    /**
     * invest_project表的操作类
     * 
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * invest_project表的操作类
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