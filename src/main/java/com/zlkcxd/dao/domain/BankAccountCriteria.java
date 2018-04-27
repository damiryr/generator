package com.zlkcxd.dao.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccountCriteria {
    /**
     * bank_account表的操作属性:orderByClause
     * 
     */
    protected String orderByClause;

    /**
     * bank_account表的操作属性:start
     * 
     */
    protected int start;

    /**
     * bank_account表的操作属性:limit
     * 
     */
    protected int limit;

    /**
     * bank_account表的操作属性:distinct
     * 
     */
    protected boolean distinct;

    /**
     * bank_account表的操作属性:oredCriteria
     * 
     */
    protected List<Criteria> oredCriteria;

    /**
     * bank_account数据表的操作方法: BankAccountCriteria  
     * 
     */
    public BankAccountCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * bank_account数据表的操作方法: setOrderByClause  
     * 
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * bank_account数据表的操作方法: getOrderByClause  
     * 
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * bank_account数据表的操作方法: setStart  
     * 
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * bank_account数据表的操作方法: getStart  
     * 
     */
    public int getStart() {
        return start;
    }

    /**
     * bank_account数据表的操作方法: setLimit  
     * 
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * bank_account数据表的操作方法: getLimit  
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * bank_account数据表的操作方法: setDistinct  
     * 
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * bank_account数据表的操作方法: isDistinct  
     * 
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * bank_account数据表的操作方法: getOredCriteria  
     * 
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * bank_account数据表的操作方法: or  
     * 
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * bank_account数据表的操作方法: or  
     * 
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * bank_account数据表的操作方法: createCriteria  
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
     * bank_account数据表的操作方法: createCriteriaInternal  
     * 
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * bank_account数据表的操作方法: clear  
     * 
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * bank_account表的操作类
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

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBranchIsNull() {
            addCriterion("branch is null");
            return (Criteria) this;
        }

        public Criteria andBranchIsNotNull() {
            addCriterion("branch is not null");
            return (Criteria) this;
        }

        public Criteria andBranchEqualTo(String value) {
            addCriterion("branch =", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotEqualTo(String value) {
            addCriterion("branch <>", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThan(String value) {
            addCriterion("branch >", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThanOrEqualTo(String value) {
            addCriterion("branch >=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThan(String value) {
            addCriterion("branch <", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThanOrEqualTo(String value) {
            addCriterion("branch <=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLike(String value) {
            addCriterion("branch like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotLike(String value) {
            addCriterion("branch not like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchIn(List<String> values) {
            addCriterion("branch in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotIn(List<String> values) {
            addCriterion("branch not in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchBetween(String value1, String value2) {
            addCriterion("branch between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotBetween(String value1, String value2) {
            addCriterion("branch not between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andBankTypeIsNull() {
            addCriterion("bank_type is null");
            return (Criteria) this;
        }

        public Criteria andBankTypeIsNotNull() {
            addCriterion("bank_type is not null");
            return (Criteria) this;
        }

        public Criteria andBankTypeEqualTo(String value) {
            addCriterion("bank_type =", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotEqualTo(String value) {
            addCriterion("bank_type <>", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeGreaterThan(String value) {
            addCriterion("bank_type >", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_type >=", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLessThan(String value) {
            addCriterion("bank_type <", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLessThanOrEqualTo(String value) {
            addCriterion("bank_type <=", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLike(String value) {
            addCriterion("bank_type like", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotLike(String value) {
            addCriterion("bank_type not like", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeIn(List<String> values) {
            addCriterion("bank_type in", values, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotIn(List<String> values) {
            addCriterion("bank_type not in", values, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeBetween(String value1, String value2) {
            addCriterion("bank_type between", value1, value2, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotBetween(String value1, String value2) {
            addCriterion("bank_type not between", value1, value2, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andInitializationBalanceIsNull() {
            addCriterion("initialization_balance is null");
            return (Criteria) this;
        }

        public Criteria andInitializationBalanceIsNotNull() {
            addCriterion("initialization_balance is not null");
            return (Criteria) this;
        }

        public Criteria andInitializationBalanceEqualTo(BigDecimal value) {
            addCriterion("initialization_balance =", value, "initializationBalance");
            return (Criteria) this;
        }

        public Criteria andInitializationBalanceNotEqualTo(BigDecimal value) {
            addCriterion("initialization_balance <>", value, "initializationBalance");
            return (Criteria) this;
        }

        public Criteria andInitializationBalanceGreaterThan(BigDecimal value) {
            addCriterion("initialization_balance >", value, "initializationBalance");
            return (Criteria) this;
        }

        public Criteria andInitializationBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("initialization_balance >=", value, "initializationBalance");
            return (Criteria) this;
        }

        public Criteria andInitializationBalanceLessThan(BigDecimal value) {
            addCriterion("initialization_balance <", value, "initializationBalance");
            return (Criteria) this;
        }

        public Criteria andInitializationBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("initialization_balance <=", value, "initializationBalance");
            return (Criteria) this;
        }

        public Criteria andInitializationBalanceIn(List<BigDecimal> values) {
            addCriterion("initialization_balance in", values, "initializationBalance");
            return (Criteria) this;
        }

        public Criteria andInitializationBalanceNotIn(List<BigDecimal> values) {
            addCriterion("initialization_balance not in", values, "initializationBalance");
            return (Criteria) this;
        }

        public Criteria andInitializationBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("initialization_balance between", value1, value2, "initializationBalance");
            return (Criteria) this;
        }

        public Criteria andInitializationBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("initialization_balance not between", value1, value2, "initializationBalance");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNull() {
            addCriterion("open_date is null");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNotNull() {
            addCriterion("open_date is not null");
            return (Criteria) this;
        }

        public Criteria andOpenDateEqualTo(Date value) {
            addCriterion("open_date =", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotEqualTo(Date value) {
            addCriterion("open_date <>", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThan(Date value) {
            addCriterion("open_date >", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThanOrEqualTo(Date value) {
            addCriterion("open_date >=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThan(Date value) {
            addCriterion("open_date <", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThanOrEqualTo(Date value) {
            addCriterion("open_date <=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateIn(List<Date> values) {
            addCriterion("open_date in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotIn(List<Date> values) {
            addCriterion("open_date not in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateBetween(Date value1, Date value2) {
            addCriterion("open_date between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotBetween(Date value1, Date value2) {
            addCriterion("open_date not between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andEndBillJudgmentIsNull() {
            addCriterion("end_bill_judgment is null");
            return (Criteria) this;
        }

        public Criteria andEndBillJudgmentIsNotNull() {
            addCriterion("end_bill_judgment is not null");
            return (Criteria) this;
        }

        public Criteria andEndBillJudgmentEqualTo(String value) {
            addCriterion("end_bill_judgment =", value, "endBillJudgment");
            return (Criteria) this;
        }

        public Criteria andEndBillJudgmentNotEqualTo(String value) {
            addCriterion("end_bill_judgment <>", value, "endBillJudgment");
            return (Criteria) this;
        }

        public Criteria andEndBillJudgmentGreaterThan(String value) {
            addCriterion("end_bill_judgment >", value, "endBillJudgment");
            return (Criteria) this;
        }

        public Criteria andEndBillJudgmentGreaterThanOrEqualTo(String value) {
            addCriterion("end_bill_judgment >=", value, "endBillJudgment");
            return (Criteria) this;
        }

        public Criteria andEndBillJudgmentLessThan(String value) {
            addCriterion("end_bill_judgment <", value, "endBillJudgment");
            return (Criteria) this;
        }

        public Criteria andEndBillJudgmentLessThanOrEqualTo(String value) {
            addCriterion("end_bill_judgment <=", value, "endBillJudgment");
            return (Criteria) this;
        }

        public Criteria andEndBillJudgmentLike(String value) {
            addCriterion("end_bill_judgment like", value, "endBillJudgment");
            return (Criteria) this;
        }

        public Criteria andEndBillJudgmentNotLike(String value) {
            addCriterion("end_bill_judgment not like", value, "endBillJudgment");
            return (Criteria) this;
        }

        public Criteria andEndBillJudgmentIn(List<String> values) {
            addCriterion("end_bill_judgment in", values, "endBillJudgment");
            return (Criteria) this;
        }

        public Criteria andEndBillJudgmentNotIn(List<String> values) {
            addCriterion("end_bill_judgment not in", values, "endBillJudgment");
            return (Criteria) this;
        }

        public Criteria andEndBillJudgmentBetween(String value1, String value2) {
            addCriterion("end_bill_judgment between", value1, value2, "endBillJudgment");
            return (Criteria) this;
        }

        public Criteria andEndBillJudgmentNotBetween(String value1, String value2) {
            addCriterion("end_bill_judgment not between", value1, value2, "endBillJudgment");
            return (Criteria) this;
        }

        public Criteria andDeleteDateIsNull() {
            addCriterion("delete_date is null");
            return (Criteria) this;
        }

        public Criteria andDeleteDateIsNotNull() {
            addCriterion("delete_date is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteDateEqualTo(Date value) {
            addCriterion("delete_date =", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateNotEqualTo(Date value) {
            addCriterion("delete_date <>", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateGreaterThan(Date value) {
            addCriterion("delete_date >", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateGreaterThanOrEqualTo(Date value) {
            addCriterion("delete_date >=", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateLessThan(Date value) {
            addCriterion("delete_date <", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateLessThanOrEqualTo(Date value) {
            addCriterion("delete_date <=", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateIn(List<Date> values) {
            addCriterion("delete_date in", values, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateNotIn(List<Date> values) {
            addCriterion("delete_date not in", values, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateBetween(Date value1, Date value2) {
            addCriterion("delete_date between", value1, value2, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateNotBetween(Date value1, Date value2) {
            addCriterion("delete_date not between", value1, value2, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIsNull() {
            addCriterion("account_number is null");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIsNotNull() {
            addCriterion("account_number is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNumberEqualTo(String value) {
            addCriterion("account_number =", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotEqualTo(String value) {
            addCriterion("account_number <>", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberGreaterThan(String value) {
            addCriterion("account_number >", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("account_number >=", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLessThan(String value) {
            addCriterion("account_number <", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("account_number <=", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLike(String value) {
            addCriterion("account_number like", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotLike(String value) {
            addCriterion("account_number not like", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIn(List<String> values) {
            addCriterion("account_number in", values, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotIn(List<String> values) {
            addCriterion("account_number not in", values, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberBetween(String value1, String value2) {
            addCriterion("account_number between", value1, value2, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotBetween(String value1, String value2) {
            addCriterion("account_number not between", value1, value2, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andBankOfficialWebIsNull() {
            addCriterion("bank_official_web is null");
            return (Criteria) this;
        }

        public Criteria andBankOfficialWebIsNotNull() {
            addCriterion("bank_official_web is not null");
            return (Criteria) this;
        }

        public Criteria andBankOfficialWebEqualTo(String value) {
            addCriterion("bank_official_web =", value, "bankOfficialWeb");
            return (Criteria) this;
        }

        public Criteria andBankOfficialWebNotEqualTo(String value) {
            addCriterion("bank_official_web <>", value, "bankOfficialWeb");
            return (Criteria) this;
        }

        public Criteria andBankOfficialWebGreaterThan(String value) {
            addCriterion("bank_official_web >", value, "bankOfficialWeb");
            return (Criteria) this;
        }

        public Criteria andBankOfficialWebGreaterThanOrEqualTo(String value) {
            addCriterion("bank_official_web >=", value, "bankOfficialWeb");
            return (Criteria) this;
        }

        public Criteria andBankOfficialWebLessThan(String value) {
            addCriterion("bank_official_web <", value, "bankOfficialWeb");
            return (Criteria) this;
        }

        public Criteria andBankOfficialWebLessThanOrEqualTo(String value) {
            addCriterion("bank_official_web <=", value, "bankOfficialWeb");
            return (Criteria) this;
        }

        public Criteria andBankOfficialWebLike(String value) {
            addCriterion("bank_official_web like", value, "bankOfficialWeb");
            return (Criteria) this;
        }

        public Criteria andBankOfficialWebNotLike(String value) {
            addCriterion("bank_official_web not like", value, "bankOfficialWeb");
            return (Criteria) this;
        }

        public Criteria andBankOfficialWebIn(List<String> values) {
            addCriterion("bank_official_web in", values, "bankOfficialWeb");
            return (Criteria) this;
        }

        public Criteria andBankOfficialWebNotIn(List<String> values) {
            addCriterion("bank_official_web not in", values, "bankOfficialWeb");
            return (Criteria) this;
        }

        public Criteria andBankOfficialWebBetween(String value1, String value2) {
            addCriterion("bank_official_web between", value1, value2, "bankOfficialWeb");
            return (Criteria) this;
        }

        public Criteria andBankOfficialWebNotBetween(String value1, String value2) {
            addCriterion("bank_official_web not between", value1, value2, "bankOfficialWeb");
            return (Criteria) this;
        }

        public Criteria andAccountBelongsIsNull() {
            addCriterion("account_belongs is null");
            return (Criteria) this;
        }

        public Criteria andAccountBelongsIsNotNull() {
            addCriterion("account_belongs is not null");
            return (Criteria) this;
        }

        public Criteria andAccountBelongsEqualTo(String value) {
            addCriterion("account_belongs =", value, "accountBelongs");
            return (Criteria) this;
        }

        public Criteria andAccountBelongsNotEqualTo(String value) {
            addCriterion("account_belongs <>", value, "accountBelongs");
            return (Criteria) this;
        }

        public Criteria andAccountBelongsGreaterThan(String value) {
            addCriterion("account_belongs >", value, "accountBelongs");
            return (Criteria) this;
        }

        public Criteria andAccountBelongsGreaterThanOrEqualTo(String value) {
            addCriterion("account_belongs >=", value, "accountBelongs");
            return (Criteria) this;
        }

        public Criteria andAccountBelongsLessThan(String value) {
            addCriterion("account_belongs <", value, "accountBelongs");
            return (Criteria) this;
        }

        public Criteria andAccountBelongsLessThanOrEqualTo(String value) {
            addCriterion("account_belongs <=", value, "accountBelongs");
            return (Criteria) this;
        }

        public Criteria andAccountBelongsLike(String value) {
            addCriterion("account_belongs like", value, "accountBelongs");
            return (Criteria) this;
        }

        public Criteria andAccountBelongsNotLike(String value) {
            addCriterion("account_belongs not like", value, "accountBelongs");
            return (Criteria) this;
        }

        public Criteria andAccountBelongsIn(List<String> values) {
            addCriterion("account_belongs in", values, "accountBelongs");
            return (Criteria) this;
        }

        public Criteria andAccountBelongsNotIn(List<String> values) {
            addCriterion("account_belongs not in", values, "accountBelongs");
            return (Criteria) this;
        }

        public Criteria andAccountBelongsBetween(String value1, String value2) {
            addCriterion("account_belongs between", value1, value2, "accountBelongs");
            return (Criteria) this;
        }

        public Criteria andAccountBelongsNotBetween(String value1, String value2) {
            addCriterion("account_belongs not between", value1, value2, "accountBelongs");
            return (Criteria) this;
        }

        public Criteria andAccountUserIsNull() {
            addCriterion("account_user is null");
            return (Criteria) this;
        }

        public Criteria andAccountUserIsNotNull() {
            addCriterion("account_user is not null");
            return (Criteria) this;
        }

        public Criteria andAccountUserEqualTo(String value) {
            addCriterion("account_user =", value, "accountUser");
            return (Criteria) this;
        }

        public Criteria andAccountUserNotEqualTo(String value) {
            addCriterion("account_user <>", value, "accountUser");
            return (Criteria) this;
        }

        public Criteria andAccountUserGreaterThan(String value) {
            addCriterion("account_user >", value, "accountUser");
            return (Criteria) this;
        }

        public Criteria andAccountUserGreaterThanOrEqualTo(String value) {
            addCriterion("account_user >=", value, "accountUser");
            return (Criteria) this;
        }

        public Criteria andAccountUserLessThan(String value) {
            addCriterion("account_user <", value, "accountUser");
            return (Criteria) this;
        }

        public Criteria andAccountUserLessThanOrEqualTo(String value) {
            addCriterion("account_user <=", value, "accountUser");
            return (Criteria) this;
        }

        public Criteria andAccountUserLike(String value) {
            addCriterion("account_user like", value, "accountUser");
            return (Criteria) this;
        }

        public Criteria andAccountUserNotLike(String value) {
            addCriterion("account_user not like", value, "accountUser");
            return (Criteria) this;
        }

        public Criteria andAccountUserIn(List<String> values) {
            addCriterion("account_user in", values, "accountUser");
            return (Criteria) this;
        }

        public Criteria andAccountUserNotIn(List<String> values) {
            addCriterion("account_user not in", values, "accountUser");
            return (Criteria) this;
        }

        public Criteria andAccountUserBetween(String value1, String value2) {
            addCriterion("account_user between", value1, value2, "accountUser");
            return (Criteria) this;
        }

        public Criteria andAccountUserNotBetween(String value1, String value2) {
            addCriterion("account_user not between", value1, value2, "accountUser");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSubordinateAccAccountingIsNull() {
            addCriterion("subordinate_acc_accounting is null");
            return (Criteria) this;
        }

        public Criteria andSubordinateAccAccountingIsNotNull() {
            addCriterion("subordinate_acc_accounting is not null");
            return (Criteria) this;
        }

        public Criteria andSubordinateAccAccountingEqualTo(BigDecimal value) {
            addCriterion("subordinate_acc_accounting =", value, "subordinateAccAccounting");
            return (Criteria) this;
        }

        public Criteria andSubordinateAccAccountingNotEqualTo(BigDecimal value) {
            addCriterion("subordinate_acc_accounting <>", value, "subordinateAccAccounting");
            return (Criteria) this;
        }

        public Criteria andSubordinateAccAccountingGreaterThan(BigDecimal value) {
            addCriterion("subordinate_acc_accounting >", value, "subordinateAccAccounting");
            return (Criteria) this;
        }

        public Criteria andSubordinateAccAccountingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("subordinate_acc_accounting >=", value, "subordinateAccAccounting");
            return (Criteria) this;
        }

        public Criteria andSubordinateAccAccountingLessThan(BigDecimal value) {
            addCriterion("subordinate_acc_accounting <", value, "subordinateAccAccounting");
            return (Criteria) this;
        }

        public Criteria andSubordinateAccAccountingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("subordinate_acc_accounting <=", value, "subordinateAccAccounting");
            return (Criteria) this;
        }

        public Criteria andSubordinateAccAccountingIn(List<BigDecimal> values) {
            addCriterion("subordinate_acc_accounting in", values, "subordinateAccAccounting");
            return (Criteria) this;
        }

        public Criteria andSubordinateAccAccountingNotIn(List<BigDecimal> values) {
            addCriterion("subordinate_acc_accounting not in", values, "subordinateAccAccounting");
            return (Criteria) this;
        }

        public Criteria andSubordinateAccAccountingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subordinate_acc_accounting between", value1, value2, "subordinateAccAccounting");
            return (Criteria) this;
        }

        public Criteria andSubordinateAccAccountingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subordinate_acc_accounting not between", value1, value2, "subordinateAccAccounting");
            return (Criteria) this;
        }

        public Criteria andWillAccountIsNull() {
            addCriterion("will_account is null");
            return (Criteria) this;
        }

        public Criteria andWillAccountIsNotNull() {
            addCriterion("will_account is not null");
            return (Criteria) this;
        }

        public Criteria andWillAccountEqualTo(String value) {
            addCriterion("will_account =", value, "willAccount");
            return (Criteria) this;
        }

        public Criteria andWillAccountNotEqualTo(String value) {
            addCriterion("will_account <>", value, "willAccount");
            return (Criteria) this;
        }

        public Criteria andWillAccountGreaterThan(String value) {
            addCriterion("will_account >", value, "willAccount");
            return (Criteria) this;
        }

        public Criteria andWillAccountGreaterThanOrEqualTo(String value) {
            addCriterion("will_account >=", value, "willAccount");
            return (Criteria) this;
        }

        public Criteria andWillAccountLessThan(String value) {
            addCriterion("will_account <", value, "willAccount");
            return (Criteria) this;
        }

        public Criteria andWillAccountLessThanOrEqualTo(String value) {
            addCriterion("will_account <=", value, "willAccount");
            return (Criteria) this;
        }

        public Criteria andWillAccountLike(String value) {
            addCriterion("will_account like", value, "willAccount");
            return (Criteria) this;
        }

        public Criteria andWillAccountNotLike(String value) {
            addCriterion("will_account not like", value, "willAccount");
            return (Criteria) this;
        }

        public Criteria andWillAccountIn(List<String> values) {
            addCriterion("will_account in", values, "willAccount");
            return (Criteria) this;
        }

        public Criteria andWillAccountNotIn(List<String> values) {
            addCriterion("will_account not in", values, "willAccount");
            return (Criteria) this;
        }

        public Criteria andWillAccountBetween(String value1, String value2) {
            addCriterion("will_account between", value1, value2, "willAccount");
            return (Criteria) this;
        }

        public Criteria andWillAccountNotBetween(String value1, String value2) {
            addCriterion("will_account not between", value1, value2, "willAccount");
            return (Criteria) this;
        }

        public Criteria andDirectAccountIsNull() {
            addCriterion("direct_account is null");
            return (Criteria) this;
        }

        public Criteria andDirectAccountIsNotNull() {
            addCriterion("direct_account is not null");
            return (Criteria) this;
        }

        public Criteria andDirectAccountEqualTo(Integer value) {
            addCriterion("direct_account =", value, "directAccount");
            return (Criteria) this;
        }

        public Criteria andDirectAccountNotEqualTo(Integer value) {
            addCriterion("direct_account <>", value, "directAccount");
            return (Criteria) this;
        }

        public Criteria andDirectAccountGreaterThan(Integer value) {
            addCriterion("direct_account >", value, "directAccount");
            return (Criteria) this;
        }

        public Criteria andDirectAccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("direct_account >=", value, "directAccount");
            return (Criteria) this;
        }

        public Criteria andDirectAccountLessThan(Integer value) {
            addCriterion("direct_account <", value, "directAccount");
            return (Criteria) this;
        }

        public Criteria andDirectAccountLessThanOrEqualTo(Integer value) {
            addCriterion("direct_account <=", value, "directAccount");
            return (Criteria) this;
        }

        public Criteria andDirectAccountIn(List<Integer> values) {
            addCriterion("direct_account in", values, "directAccount");
            return (Criteria) this;
        }

        public Criteria andDirectAccountNotIn(List<Integer> values) {
            addCriterion("direct_account not in", values, "directAccount");
            return (Criteria) this;
        }

        public Criteria andDirectAccountBetween(Integer value1, Integer value2) {
            addCriterion("direct_account between", value1, value2, "directAccount");
            return (Criteria) this;
        }

        public Criteria andDirectAccountNotBetween(Integer value1, Integer value2) {
            addCriterion("direct_account not between", value1, value2, "directAccount");
            return (Criteria) this;
        }
    }

    /**
     * bank_account表的操作类
     * 
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * bank_account表的操作类
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