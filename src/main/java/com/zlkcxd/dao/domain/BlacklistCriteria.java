package com.zlkcxd.dao.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlacklistCriteria {
    /**
     * blacklist表的操作属性:orderByClause
     * 
     */
    protected String orderByClause;

    /**
     * blacklist表的操作属性:start
     * 
     */
    protected int start;

    /**
     * blacklist表的操作属性:limit
     * 
     */
    protected int limit;

    /**
     * blacklist表的操作属性:distinct
     * 
     */
    protected boolean distinct;

    /**
     * blacklist表的操作属性:oredCriteria
     * 
     */
    protected List<Criteria> oredCriteria;

    /**
     * blacklist数据表的操作方法: BlacklistCriteria  
     * 
     */
    public BlacklistCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * blacklist数据表的操作方法: setOrderByClause  
     * 
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * blacklist数据表的操作方法: getOrderByClause  
     * 
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * blacklist数据表的操作方法: setStart  
     * 
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * blacklist数据表的操作方法: getStart  
     * 
     */
    public int getStart() {
        return start;
    }

    /**
     * blacklist数据表的操作方法: setLimit  
     * 
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * blacklist数据表的操作方法: getLimit  
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * blacklist数据表的操作方法: setDistinct  
     * 
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * blacklist数据表的操作方法: isDistinct  
     * 
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * blacklist数据表的操作方法: getOredCriteria  
     * 
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * blacklist数据表的操作方法: or  
     * 
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * blacklist数据表的操作方法: or  
     * 
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * blacklist数据表的操作方法: createCriteria  
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
     * blacklist数据表的操作方法: createCriteriaInternal  
     * 
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * blacklist数据表的操作方法: clear  
     * 
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * blacklist表的操作类
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

        public Criteria andApplicationTypeIsNull() {
            addCriterion("application_type is null");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeIsNotNull() {
            addCriterion("application_type is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeEqualTo(String value) {
            addCriterion("application_type =", value, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeNotEqualTo(String value) {
            addCriterion("application_type <>", value, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeGreaterThan(String value) {
            addCriterion("application_type >", value, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("application_type >=", value, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeLessThan(String value) {
            addCriterion("application_type <", value, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeLessThanOrEqualTo(String value) {
            addCriterion("application_type <=", value, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeLike(String value) {
            addCriterion("application_type like", value, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeNotLike(String value) {
            addCriterion("application_type not like", value, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeIn(List<String> values) {
            addCriterion("application_type in", values, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeNotIn(List<String> values) {
            addCriterion("application_type not in", values, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeBetween(String value1, String value2) {
            addCriterion("application_type between", value1, value2, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeNotBetween(String value1, String value2) {
            addCriterion("application_type not between", value1, value2, "applicationType");
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

        public Criteria andCreateNameIsNull() {
            addCriterion("create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("create_name not between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateReasonIsNull() {
            addCriterion("create_reason is null");
            return (Criteria) this;
        }

        public Criteria andCreateReasonIsNotNull() {
            addCriterion("create_reason is not null");
            return (Criteria) this;
        }

        public Criteria andCreateReasonEqualTo(String value) {
            addCriterion("create_reason =", value, "createReason");
            return (Criteria) this;
        }

        public Criteria andCreateReasonNotEqualTo(String value) {
            addCriterion("create_reason <>", value, "createReason");
            return (Criteria) this;
        }

        public Criteria andCreateReasonGreaterThan(String value) {
            addCriterion("create_reason >", value, "createReason");
            return (Criteria) this;
        }

        public Criteria andCreateReasonGreaterThanOrEqualTo(String value) {
            addCriterion("create_reason >=", value, "createReason");
            return (Criteria) this;
        }

        public Criteria andCreateReasonLessThan(String value) {
            addCriterion("create_reason <", value, "createReason");
            return (Criteria) this;
        }

        public Criteria andCreateReasonLessThanOrEqualTo(String value) {
            addCriterion("create_reason <=", value, "createReason");
            return (Criteria) this;
        }

        public Criteria andCreateReasonLike(String value) {
            addCriterion("create_reason like", value, "createReason");
            return (Criteria) this;
        }

        public Criteria andCreateReasonNotLike(String value) {
            addCriterion("create_reason not like", value, "createReason");
            return (Criteria) this;
        }

        public Criteria andCreateReasonIn(List<String> values) {
            addCriterion("create_reason in", values, "createReason");
            return (Criteria) this;
        }

        public Criteria andCreateReasonNotIn(List<String> values) {
            addCriterion("create_reason not in", values, "createReason");
            return (Criteria) this;
        }

        public Criteria andCreateReasonBetween(String value1, String value2) {
            addCriterion("create_reason between", value1, value2, "createReason");
            return (Criteria) this;
        }

        public Criteria andCreateReasonNotBetween(String value1, String value2) {
            addCriterion("create_reason not between", value1, value2, "createReason");
            return (Criteria) this;
        }

        public Criteria andApproverIsNull() {
            addCriterion("approver is null");
            return (Criteria) this;
        }

        public Criteria andApproverIsNotNull() {
            addCriterion("approver is not null");
            return (Criteria) this;
        }

        public Criteria andApproverEqualTo(String value) {
            addCriterion("approver =", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotEqualTo(String value) {
            addCriterion("approver <>", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThan(String value) {
            addCriterion("approver >", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThanOrEqualTo(String value) {
            addCriterion("approver >=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThan(String value) {
            addCriterion("approver <", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThanOrEqualTo(String value) {
            addCriterion("approver <=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLike(String value) {
            addCriterion("approver like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotLike(String value) {
            addCriterion("approver not like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverIn(List<String> values) {
            addCriterion("approver in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotIn(List<String> values) {
            addCriterion("approver not in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverBetween(String value1, String value2) {
            addCriterion("approver between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotBetween(String value1, String value2) {
            addCriterion("approver not between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApprovelTimeIsNull() {
            addCriterion("approvel_time is null");
            return (Criteria) this;
        }

        public Criteria andApprovelTimeIsNotNull() {
            addCriterion("approvel_time is not null");
            return (Criteria) this;
        }

        public Criteria andApprovelTimeEqualTo(Date value) {
            addCriterion("approvel_time =", value, "approvelTime");
            return (Criteria) this;
        }

        public Criteria andApprovelTimeNotEqualTo(Date value) {
            addCriterion("approvel_time <>", value, "approvelTime");
            return (Criteria) this;
        }

        public Criteria andApprovelTimeGreaterThan(Date value) {
            addCriterion("approvel_time >", value, "approvelTime");
            return (Criteria) this;
        }

        public Criteria andApprovelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("approvel_time >=", value, "approvelTime");
            return (Criteria) this;
        }

        public Criteria andApprovelTimeLessThan(Date value) {
            addCriterion("approvel_time <", value, "approvelTime");
            return (Criteria) this;
        }

        public Criteria andApprovelTimeLessThanOrEqualTo(Date value) {
            addCriterion("approvel_time <=", value, "approvelTime");
            return (Criteria) this;
        }

        public Criteria andApprovelTimeIn(List<Date> values) {
            addCriterion("approvel_time in", values, "approvelTime");
            return (Criteria) this;
        }

        public Criteria andApprovelTimeNotIn(List<Date> values) {
            addCriterion("approvel_time not in", values, "approvelTime");
            return (Criteria) this;
        }

        public Criteria andApprovelTimeBetween(Date value1, Date value2) {
            addCriterion("approvel_time between", value1, value2, "approvelTime");
            return (Criteria) this;
        }

        public Criteria andApprovelTimeNotBetween(Date value1, Date value2) {
            addCriterion("approvel_time not between", value1, value2, "approvelTime");
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

        public Criteria andJoinReasonIsNull() {
            addCriterion("join_reason is null");
            return (Criteria) this;
        }

        public Criteria andJoinReasonIsNotNull() {
            addCriterion("join_reason is not null");
            return (Criteria) this;
        }

        public Criteria andJoinReasonEqualTo(String value) {
            addCriterion("join_reason =", value, "joinReason");
            return (Criteria) this;
        }

        public Criteria andJoinReasonNotEqualTo(String value) {
            addCriterion("join_reason <>", value, "joinReason");
            return (Criteria) this;
        }

        public Criteria andJoinReasonGreaterThan(String value) {
            addCriterion("join_reason >", value, "joinReason");
            return (Criteria) this;
        }

        public Criteria andJoinReasonGreaterThanOrEqualTo(String value) {
            addCriterion("join_reason >=", value, "joinReason");
            return (Criteria) this;
        }

        public Criteria andJoinReasonLessThan(String value) {
            addCriterion("join_reason <", value, "joinReason");
            return (Criteria) this;
        }

        public Criteria andJoinReasonLessThanOrEqualTo(String value) {
            addCriterion("join_reason <=", value, "joinReason");
            return (Criteria) this;
        }

        public Criteria andJoinReasonLike(String value) {
            addCriterion("join_reason like", value, "joinReason");
            return (Criteria) this;
        }

        public Criteria andJoinReasonNotLike(String value) {
            addCriterion("join_reason not like", value, "joinReason");
            return (Criteria) this;
        }

        public Criteria andJoinReasonIn(List<String> values) {
            addCriterion("join_reason in", values, "joinReason");
            return (Criteria) this;
        }

        public Criteria andJoinReasonNotIn(List<String> values) {
            addCriterion("join_reason not in", values, "joinReason");
            return (Criteria) this;
        }

        public Criteria andJoinReasonBetween(String value1, String value2) {
            addCriterion("join_reason between", value1, value2, "joinReason");
            return (Criteria) this;
        }

        public Criteria andJoinReasonNotBetween(String value1, String value2) {
            addCriterion("join_reason not between", value1, value2, "joinReason");
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

        public Criteria andProcessIdIsNull() {
            addCriterion("process_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNotNull() {
            addCriterion("process_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessIdEqualTo(Long value) {
            addCriterion("process_id =", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotEqualTo(Long value) {
            addCriterion("process_id <>", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThan(Long value) {
            addCriterion("process_id >", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThanOrEqualTo(Long value) {
            addCriterion("process_id >=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThan(Long value) {
            addCriterion("process_id <", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThanOrEqualTo(Long value) {
            addCriterion("process_id <=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIn(List<Long> values) {
            addCriterion("process_id in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotIn(List<Long> values) {
            addCriterion("process_id not in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdBetween(Long value1, Long value2) {
            addCriterion("process_id between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotBetween(Long value1, Long value2) {
            addCriterion("process_id not between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andApprovlStatusIsNull() {
            addCriterion("approvl_status is null");
            return (Criteria) this;
        }

        public Criteria andApprovlStatusIsNotNull() {
            addCriterion("approvl_status is not null");
            return (Criteria) this;
        }

        public Criteria andApprovlStatusEqualTo(Integer value) {
            addCriterion("approvl_status =", value, "approvlStatus");
            return (Criteria) this;
        }

        public Criteria andApprovlStatusNotEqualTo(Integer value) {
            addCriterion("approvl_status <>", value, "approvlStatus");
            return (Criteria) this;
        }

        public Criteria andApprovlStatusGreaterThan(Integer value) {
            addCriterion("approvl_status >", value, "approvlStatus");
            return (Criteria) this;
        }

        public Criteria andApprovlStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("approvl_status >=", value, "approvlStatus");
            return (Criteria) this;
        }

        public Criteria andApprovlStatusLessThan(Integer value) {
            addCriterion("approvl_status <", value, "approvlStatus");
            return (Criteria) this;
        }

        public Criteria andApprovlStatusLessThanOrEqualTo(Integer value) {
            addCriterion("approvl_status <=", value, "approvlStatus");
            return (Criteria) this;
        }

        public Criteria andApprovlStatusIn(List<Integer> values) {
            addCriterion("approvl_status in", values, "approvlStatus");
            return (Criteria) this;
        }

        public Criteria andApprovlStatusNotIn(List<Integer> values) {
            addCriterion("approvl_status not in", values, "approvlStatus");
            return (Criteria) this;
        }

        public Criteria andApprovlStatusBetween(Integer value1, Integer value2) {
            addCriterion("approvl_status between", value1, value2, "approvlStatus");
            return (Criteria) this;
        }

        public Criteria andApprovlStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("approvl_status not between", value1, value2, "approvlStatus");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("file_path is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("file_path =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("file_path <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("file_path >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("file_path >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("file_path <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("file_path <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("file_path like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("file_path not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("file_path in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("file_path not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("file_path between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("file_path not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andApprovelOpinionIsNull() {
            addCriterion("approvel_opinion is null");
            return (Criteria) this;
        }

        public Criteria andApprovelOpinionIsNotNull() {
            addCriterion("approvel_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andApprovelOpinionEqualTo(String value) {
            addCriterion("approvel_opinion =", value, "approvelOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovelOpinionNotEqualTo(String value) {
            addCriterion("approvel_opinion <>", value, "approvelOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovelOpinionGreaterThan(String value) {
            addCriterion("approvel_opinion >", value, "approvelOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovelOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("approvel_opinion >=", value, "approvelOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovelOpinionLessThan(String value) {
            addCriterion("approvel_opinion <", value, "approvelOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovelOpinionLessThanOrEqualTo(String value) {
            addCriterion("approvel_opinion <=", value, "approvelOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovelOpinionLike(String value) {
            addCriterion("approvel_opinion like", value, "approvelOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovelOpinionNotLike(String value) {
            addCriterion("approvel_opinion not like", value, "approvelOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovelOpinionIn(List<String> values) {
            addCriterion("approvel_opinion in", values, "approvelOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovelOpinionNotIn(List<String> values) {
            addCriterion("approvel_opinion not in", values, "approvelOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovelOpinionBetween(String value1, String value2) {
            addCriterion("approvel_opinion between", value1, value2, "approvelOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovelOpinionNotBetween(String value1, String value2) {
            addCriterion("approvel_opinion not between", value1, value2, "approvelOpinion");
            return (Criteria) this;
        }
    }

    /**
     * blacklist表的操作类
     * 
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * blacklist表的操作类
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