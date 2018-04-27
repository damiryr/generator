package com.zlkcxd.dao.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractNoRuleCriteria {
    /**
     * contract_no_rule表的操作属性:orderByClause
     * 
     */
    protected String orderByClause;

    /**
     * contract_no_rule表的操作属性:start
     * 
     */
    protected int start;

    /**
     * contract_no_rule表的操作属性:limit
     * 
     */
    protected int limit;

    /**
     * contract_no_rule表的操作属性:distinct
     * 
     */
    protected boolean distinct;

    /**
     * contract_no_rule表的操作属性:oredCriteria
     * 
     */
    protected List<Criteria> oredCriteria;

    /**
     * contract_no_rule数据表的操作方法: ContractNoRuleCriteria  
     * 
     */
    public ContractNoRuleCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * contract_no_rule数据表的操作方法: setOrderByClause  
     * 
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * contract_no_rule数据表的操作方法: getOrderByClause  
     * 
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * contract_no_rule数据表的操作方法: setStart  
     * 
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * contract_no_rule数据表的操作方法: getStart  
     * 
     */
    public int getStart() {
        return start;
    }

    /**
     * contract_no_rule数据表的操作方法: setLimit  
     * 
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * contract_no_rule数据表的操作方法: getLimit  
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * contract_no_rule数据表的操作方法: setDistinct  
     * 
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * contract_no_rule数据表的操作方法: isDistinct  
     * 
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * contract_no_rule数据表的操作方法: getOredCriteria  
     * 
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * contract_no_rule数据表的操作方法: or  
     * 
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * contract_no_rule数据表的操作方法: or  
     * 
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * contract_no_rule数据表的操作方法: createCriteria  
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
     * contract_no_rule数据表的操作方法: createCriteriaInternal  
     * 
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * contract_no_rule数据表的操作方法: clear  
     * 
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * contract_no_rule表的操作类
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

        public Criteria andSortNoIsNull() {
            addCriterion("sort_no is null");
            return (Criteria) this;
        }

        public Criteria andSortNoIsNotNull() {
            addCriterion("sort_no is not null");
            return (Criteria) this;
        }

        public Criteria andSortNoEqualTo(String value) {
            addCriterion("sort_no =", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotEqualTo(String value) {
            addCriterion("sort_no <>", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoGreaterThan(String value) {
            addCriterion("sort_no >", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoGreaterThanOrEqualTo(String value) {
            addCriterion("sort_no >=", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLessThan(String value) {
            addCriterion("sort_no <", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLessThanOrEqualTo(String value) {
            addCriterion("sort_no <=", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLike(String value) {
            addCriterion("sort_no like", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotLike(String value) {
            addCriterion("sort_no not like", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoIn(List<String> values) {
            addCriterion("sort_no in", values, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotIn(List<String> values) {
            addCriterion("sort_no not in", values, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoBetween(String value1, String value2) {
            addCriterion("sort_no between", value1, value2, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotBetween(String value1, String value2) {
            addCriterion("sort_no not between", value1, value2, "sortNo");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNull() {
            addCriterion("contract_type is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNotNull() {
            addCriterion("contract_type is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeEqualTo(Integer value) {
            addCriterion("contract_type =", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotEqualTo(Integer value) {
            addCriterion("contract_type <>", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThan(Integer value) {
            addCriterion("contract_type >", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_type >=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThan(Integer value) {
            addCriterion("contract_type <", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThanOrEqualTo(Integer value) {
            addCriterion("contract_type <=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeIn(List<Integer> values) {
            addCriterion("contract_type in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotIn(List<Integer> values) {
            addCriterion("contract_type not in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeBetween(Integer value1, Integer value2) {
            addCriterion("contract_type between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_type not between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andRuleGistIsNull() {
            addCriterion("rule_gist is null");
            return (Criteria) this;
        }

        public Criteria andRuleGistIsNotNull() {
            addCriterion("rule_gist is not null");
            return (Criteria) this;
        }

        public Criteria andRuleGistEqualTo(Integer value) {
            addCriterion("rule_gist =", value, "ruleGist");
            return (Criteria) this;
        }

        public Criteria andRuleGistNotEqualTo(Integer value) {
            addCriterion("rule_gist <>", value, "ruleGist");
            return (Criteria) this;
        }

        public Criteria andRuleGistGreaterThan(Integer value) {
            addCriterion("rule_gist >", value, "ruleGist");
            return (Criteria) this;
        }

        public Criteria andRuleGistGreaterThanOrEqualTo(Integer value) {
            addCriterion("rule_gist >=", value, "ruleGist");
            return (Criteria) this;
        }

        public Criteria andRuleGistLessThan(Integer value) {
            addCriterion("rule_gist <", value, "ruleGist");
            return (Criteria) this;
        }

        public Criteria andRuleGistLessThanOrEqualTo(Integer value) {
            addCriterion("rule_gist <=", value, "ruleGist");
            return (Criteria) this;
        }

        public Criteria andRuleGistIn(List<Integer> values) {
            addCriterion("rule_gist in", values, "ruleGist");
            return (Criteria) this;
        }

        public Criteria andRuleGistNotIn(List<Integer> values) {
            addCriterion("rule_gist not in", values, "ruleGist");
            return (Criteria) this;
        }

        public Criteria andRuleGistBetween(Integer value1, Integer value2) {
            addCriterion("rule_gist between", value1, value2, "ruleGist");
            return (Criteria) this;
        }

        public Criteria andRuleGistNotBetween(Integer value1, Integer value2) {
            addCriterion("rule_gist not between", value1, value2, "ruleGist");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNull() {
            addCriterion("rule_name is null");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNotNull() {
            addCriterion("rule_name is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNameEqualTo(String value) {
            addCriterion("rule_name =", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotEqualTo(String value) {
            addCriterion("rule_name <>", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThan(String value) {
            addCriterion("rule_name >", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("rule_name >=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThan(String value) {
            addCriterion("rule_name <", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThanOrEqualTo(String value) {
            addCriterion("rule_name <=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLike(String value) {
            addCriterion("rule_name like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotLike(String value) {
            addCriterion("rule_name not like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameIn(List<String> values) {
            addCriterion("rule_name in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotIn(List<String> values) {
            addCriterion("rule_name not in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameBetween(String value1, String value2) {
            addCriterion("rule_name between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotBetween(String value1, String value2) {
            addCriterion("rule_name not between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleMemoIsNull() {
            addCriterion("rule_memo is null");
            return (Criteria) this;
        }

        public Criteria andRuleMemoIsNotNull() {
            addCriterion("rule_memo is not null");
            return (Criteria) this;
        }

        public Criteria andRuleMemoEqualTo(String value) {
            addCriterion("rule_memo =", value, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoNotEqualTo(String value) {
            addCriterion("rule_memo <>", value, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoGreaterThan(String value) {
            addCriterion("rule_memo >", value, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoGreaterThanOrEqualTo(String value) {
            addCriterion("rule_memo >=", value, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoLessThan(String value) {
            addCriterion("rule_memo <", value, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoLessThanOrEqualTo(String value) {
            addCriterion("rule_memo <=", value, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoLike(String value) {
            addCriterion("rule_memo like", value, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoNotLike(String value) {
            addCriterion("rule_memo not like", value, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoIn(List<String> values) {
            addCriterion("rule_memo in", values, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoNotIn(List<String> values) {
            addCriterion("rule_memo not in", values, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoBetween(String value1, String value2) {
            addCriterion("rule_memo between", value1, value2, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoNotBetween(String value1, String value2) {
            addCriterion("rule_memo not between", value1, value2, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleIsNull() {
            addCriterion("rule is null");
            return (Criteria) this;
        }

        public Criteria andRuleIsNotNull() {
            addCriterion("rule is not null");
            return (Criteria) this;
        }

        public Criteria andRuleEqualTo(String value) {
            addCriterion("rule =", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleNotEqualTo(String value) {
            addCriterion("rule <>", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleGreaterThan(String value) {
            addCriterion("rule >", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleGreaterThanOrEqualTo(String value) {
            addCriterion("rule >=", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleLessThan(String value) {
            addCriterion("rule <", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleLessThanOrEqualTo(String value) {
            addCriterion("rule <=", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleLike(String value) {
            addCriterion("rule like", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleNotLike(String value) {
            addCriterion("rule not like", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleIn(List<String> values) {
            addCriterion("rule in", values, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleNotIn(List<String> values) {
            addCriterion("rule not in", values, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleBetween(String value1, String value2) {
            addCriterion("rule between", value1, value2, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleNotBetween(String value1, String value2) {
            addCriterion("rule not between", value1, value2, "rule");
            return (Criteria) this;
        }

        public Criteria andTimeParamRuleIsNull() {
            addCriterion("time_param_rule is null");
            return (Criteria) this;
        }

        public Criteria andTimeParamRuleIsNotNull() {
            addCriterion("time_param_rule is not null");
            return (Criteria) this;
        }

        public Criteria andTimeParamRuleEqualTo(Integer value) {
            addCriterion("time_param_rule =", value, "timeParamRule");
            return (Criteria) this;
        }

        public Criteria andTimeParamRuleNotEqualTo(Integer value) {
            addCriterion("time_param_rule <>", value, "timeParamRule");
            return (Criteria) this;
        }

        public Criteria andTimeParamRuleGreaterThan(Integer value) {
            addCriterion("time_param_rule >", value, "timeParamRule");
            return (Criteria) this;
        }

        public Criteria andTimeParamRuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_param_rule >=", value, "timeParamRule");
            return (Criteria) this;
        }

        public Criteria andTimeParamRuleLessThan(Integer value) {
            addCriterion("time_param_rule <", value, "timeParamRule");
            return (Criteria) this;
        }

        public Criteria andTimeParamRuleLessThanOrEqualTo(Integer value) {
            addCriterion("time_param_rule <=", value, "timeParamRule");
            return (Criteria) this;
        }

        public Criteria andTimeParamRuleIn(List<Integer> values) {
            addCriterion("time_param_rule in", values, "timeParamRule");
            return (Criteria) this;
        }

        public Criteria andTimeParamRuleNotIn(List<Integer> values) {
            addCriterion("time_param_rule not in", values, "timeParamRule");
            return (Criteria) this;
        }

        public Criteria andTimeParamRuleBetween(Integer value1, Integer value2) {
            addCriterion("time_param_rule between", value1, value2, "timeParamRule");
            return (Criteria) this;
        }

        public Criteria andTimeParamRuleNotBetween(Integer value1, Integer value2) {
            addCriterion("time_param_rule not between", value1, value2, "timeParamRule");
            return (Criteria) this;
        }

        public Criteria andContractParamRuleIsNull() {
            addCriterion("contract_param_rule is null");
            return (Criteria) this;
        }

        public Criteria andContractParamRuleIsNotNull() {
            addCriterion("contract_param_rule is not null");
            return (Criteria) this;
        }

        public Criteria andContractParamRuleEqualTo(Integer value) {
            addCriterion("contract_param_rule =", value, "contractParamRule");
            return (Criteria) this;
        }

        public Criteria andContractParamRuleNotEqualTo(Integer value) {
            addCriterion("contract_param_rule <>", value, "contractParamRule");
            return (Criteria) this;
        }

        public Criteria andContractParamRuleGreaterThan(Integer value) {
            addCriterion("contract_param_rule >", value, "contractParamRule");
            return (Criteria) this;
        }

        public Criteria andContractParamRuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_param_rule >=", value, "contractParamRule");
            return (Criteria) this;
        }

        public Criteria andContractParamRuleLessThan(Integer value) {
            addCriterion("contract_param_rule <", value, "contractParamRule");
            return (Criteria) this;
        }

        public Criteria andContractParamRuleLessThanOrEqualTo(Integer value) {
            addCriterion("contract_param_rule <=", value, "contractParamRule");
            return (Criteria) this;
        }

        public Criteria andContractParamRuleIn(List<Integer> values) {
            addCriterion("contract_param_rule in", values, "contractParamRule");
            return (Criteria) this;
        }

        public Criteria andContractParamRuleNotIn(List<Integer> values) {
            addCriterion("contract_param_rule not in", values, "contractParamRule");
            return (Criteria) this;
        }

        public Criteria andContractParamRuleBetween(Integer value1, Integer value2) {
            addCriterion("contract_param_rule between", value1, value2, "contractParamRule");
            return (Criteria) this;
        }

        public Criteria andContractParamRuleNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_param_rule not between", value1, value2, "contractParamRule");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * contract_no_rule表的操作类
     * 
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * contract_no_rule表的操作类
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