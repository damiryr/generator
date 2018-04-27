package com.zlkcxd.dao.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageReportCriteria {
    /**
     * message_report表的操作属性:orderByClause
     * 
     */
    protected String orderByClause;

    /**
     * message_report表的操作属性:start
     * 
     */
    protected int start;

    /**
     * message_report表的操作属性:limit
     * 
     */
    protected int limit;

    /**
     * message_report表的操作属性:distinct
     * 
     */
    protected boolean distinct;

    /**
     * message_report表的操作属性:oredCriteria
     * 
     */
    protected List<Criteria> oredCriteria;

    /**
     * message_report数据表的操作方法: MessageReportCriteria  
     * 
     */
    public MessageReportCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * message_report数据表的操作方法: setOrderByClause  
     * 
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * message_report数据表的操作方法: getOrderByClause  
     * 
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * message_report数据表的操作方法: setStart  
     * 
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * message_report数据表的操作方法: getStart  
     * 
     */
    public int getStart() {
        return start;
    }

    /**
     * message_report数据表的操作方法: setLimit  
     * 
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * message_report数据表的操作方法: getLimit  
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * message_report数据表的操作方法: setDistinct  
     * 
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * message_report数据表的操作方法: isDistinct  
     * 
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * message_report数据表的操作方法: getOredCriteria  
     * 
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * message_report数据表的操作方法: or  
     * 
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * message_report数据表的操作方法: or  
     * 
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * message_report数据表的操作方法: createCriteria  
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
     * message_report数据表的操作方法: createCriteriaInternal  
     * 
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * message_report数据表的操作方法: clear  
     * 
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * message_report表的操作类
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

        public Criteria andSrctermIdIsNull() {
            addCriterion("srcterm_id is null");
            return (Criteria) this;
        }

        public Criteria andSrctermIdIsNotNull() {
            addCriterion("srcterm_id is not null");
            return (Criteria) this;
        }

        public Criteria andSrctermIdEqualTo(String value) {
            addCriterion("srcterm_id =", value, "srctermId");
            return (Criteria) this;
        }

        public Criteria andSrctermIdNotEqualTo(String value) {
            addCriterion("srcterm_id <>", value, "srctermId");
            return (Criteria) this;
        }

        public Criteria andSrctermIdGreaterThan(String value) {
            addCriterion("srcterm_id >", value, "srctermId");
            return (Criteria) this;
        }

        public Criteria andSrctermIdGreaterThanOrEqualTo(String value) {
            addCriterion("srcterm_id >=", value, "srctermId");
            return (Criteria) this;
        }

        public Criteria andSrctermIdLessThan(String value) {
            addCriterion("srcterm_id <", value, "srctermId");
            return (Criteria) this;
        }

        public Criteria andSrctermIdLessThanOrEqualTo(String value) {
            addCriterion("srcterm_id <=", value, "srctermId");
            return (Criteria) this;
        }

        public Criteria andSrctermIdLike(String value) {
            addCriterion("srcterm_id like", value, "srctermId");
            return (Criteria) this;
        }

        public Criteria andSrctermIdNotLike(String value) {
            addCriterion("srcterm_id not like", value, "srctermId");
            return (Criteria) this;
        }

        public Criteria andSrctermIdIn(List<String> values) {
            addCriterion("srcterm_id in", values, "srctermId");
            return (Criteria) this;
        }

        public Criteria andSrctermIdNotIn(List<String> values) {
            addCriterion("srcterm_id not in", values, "srctermId");
            return (Criteria) this;
        }

        public Criteria andSrctermIdBetween(String value1, String value2) {
            addCriterion("srcterm_id between", value1, value2, "srctermId");
            return (Criteria) this;
        }

        public Criteria andSrctermIdNotBetween(String value1, String value2) {
            addCriterion("srcterm_id not between", value1, value2, "srctermId");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNull() {
            addCriterion("submit_date is null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNotNull() {
            addCriterion("submit_date is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateEqualTo(Date value) {
            addCriterion("submit_date =", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotEqualTo(Date value) {
            addCriterion("submit_date <>", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThan(Date value) {
            addCriterion("submit_date >", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("submit_date >=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThan(Date value) {
            addCriterion("submit_date <", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThanOrEqualTo(Date value) {
            addCriterion("submit_date <=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIn(List<Date> values) {
            addCriterion("submit_date in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotIn(List<Date> values) {
            addCriterion("submit_date not in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateBetween(Date value1, Date value2) {
            addCriterion("submit_date between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotBetween(Date value1, Date value2) {
            addCriterion("submit_date not between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNull() {
            addCriterion("receive_date is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNotNull() {
            addCriterion("receive_date is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateEqualTo(Date value) {
            addCriterion("receive_date =", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotEqualTo(Date value) {
            addCriterion("receive_date <>", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThan(Date value) {
            addCriterion("receive_date >", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_date >=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThan(Date value) {
            addCriterion("receive_date <", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThanOrEqualTo(Date value) {
            addCriterion("receive_date <=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIn(List<Date> values) {
            addCriterion("receive_date in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotIn(List<Date> values) {
            addCriterion("receive_date not in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateBetween(Date value1, Date value2) {
            addCriterion("receive_date between", value1, value2, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotBetween(Date value1, Date value2) {
            addCriterion("receive_date not between", value1, value2, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andAddSerialRevIsNull() {
            addCriterion("add_serial_rev is null");
            return (Criteria) this;
        }

        public Criteria andAddSerialRevIsNotNull() {
            addCriterion("add_serial_rev is not null");
            return (Criteria) this;
        }

        public Criteria andAddSerialRevEqualTo(String value) {
            addCriterion("add_serial_rev =", value, "addSerialRev");
            return (Criteria) this;
        }

        public Criteria andAddSerialRevNotEqualTo(String value) {
            addCriterion("add_serial_rev <>", value, "addSerialRev");
            return (Criteria) this;
        }

        public Criteria andAddSerialRevGreaterThan(String value) {
            addCriterion("add_serial_rev >", value, "addSerialRev");
            return (Criteria) this;
        }

        public Criteria andAddSerialRevGreaterThanOrEqualTo(String value) {
            addCriterion("add_serial_rev >=", value, "addSerialRev");
            return (Criteria) this;
        }

        public Criteria andAddSerialRevLessThan(String value) {
            addCriterion("add_serial_rev <", value, "addSerialRev");
            return (Criteria) this;
        }

        public Criteria andAddSerialRevLessThanOrEqualTo(String value) {
            addCriterion("add_serial_rev <=", value, "addSerialRev");
            return (Criteria) this;
        }

        public Criteria andAddSerialRevLike(String value) {
            addCriterion("add_serial_rev like", value, "addSerialRev");
            return (Criteria) this;
        }

        public Criteria andAddSerialRevNotLike(String value) {
            addCriterion("add_serial_rev not like", value, "addSerialRev");
            return (Criteria) this;
        }

        public Criteria andAddSerialRevIn(List<String> values) {
            addCriterion("add_serial_rev in", values, "addSerialRev");
            return (Criteria) this;
        }

        public Criteria andAddSerialRevNotIn(List<String> values) {
            addCriterion("add_serial_rev not in", values, "addSerialRev");
            return (Criteria) this;
        }

        public Criteria andAddSerialRevBetween(String value1, String value2) {
            addCriterion("add_serial_rev between", value1, value2, "addSerialRev");
            return (Criteria) this;
        }

        public Criteria andAddSerialRevNotBetween(String value1, String value2) {
            addCriterion("add_serial_rev not between", value1, value2, "addSerialRev");
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

        public Criteria andSeqIdIsNull() {
            addCriterion("seq_id is null");
            return (Criteria) this;
        }

        public Criteria andSeqIdIsNotNull() {
            addCriterion("seq_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeqIdEqualTo(String value) {
            addCriterion("seq_id =", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotEqualTo(String value) {
            addCriterion("seq_id <>", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThan(String value) {
            addCriterion("seq_id >", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("seq_id >=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThan(String value) {
            addCriterion("seq_id <", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThanOrEqualTo(String value) {
            addCriterion("seq_id <=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLike(String value) {
            addCriterion("seq_id like", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotLike(String value) {
            addCriterion("seq_id not like", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdIn(List<String> values) {
            addCriterion("seq_id in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotIn(List<String> values) {
            addCriterion("seq_id not in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdBetween(String value1, String value2) {
            addCriterion("seq_id between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotBetween(String value1, String value2) {
            addCriterion("seq_id not between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNull() {
            addCriterion("send_type is null");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNotNull() {
            addCriterion("send_type is not null");
            return (Criteria) this;
        }

        public Criteria andSendTypeEqualTo(String value) {
            addCriterion("send_type =", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotEqualTo(String value) {
            addCriterion("send_type <>", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThan(String value) {
            addCriterion("send_type >", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThanOrEqualTo(String value) {
            addCriterion("send_type >=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThan(String value) {
            addCriterion("send_type <", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThanOrEqualTo(String value) {
            addCriterion("send_type <=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLike(String value) {
            addCriterion("send_type like", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotLike(String value) {
            addCriterion("send_type not like", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeIn(List<String> values) {
            addCriterion("send_type in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotIn(List<String> values) {
            addCriterion("send_type not in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeBetween(String value1, String value2) {
            addCriterion("send_type between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotBetween(String value1, String value2) {
            addCriterion("send_type not between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendMethodIsNull() {
            addCriterion("send_method is null");
            return (Criteria) this;
        }

        public Criteria andSendMethodIsNotNull() {
            addCriterion("send_method is not null");
            return (Criteria) this;
        }

        public Criteria andSendMethodEqualTo(String value) {
            addCriterion("send_method =", value, "sendMethod");
            return (Criteria) this;
        }

        public Criteria andSendMethodNotEqualTo(String value) {
            addCriterion("send_method <>", value, "sendMethod");
            return (Criteria) this;
        }

        public Criteria andSendMethodGreaterThan(String value) {
            addCriterion("send_method >", value, "sendMethod");
            return (Criteria) this;
        }

        public Criteria andSendMethodGreaterThanOrEqualTo(String value) {
            addCriterion("send_method >=", value, "sendMethod");
            return (Criteria) this;
        }

        public Criteria andSendMethodLessThan(String value) {
            addCriterion("send_method <", value, "sendMethod");
            return (Criteria) this;
        }

        public Criteria andSendMethodLessThanOrEqualTo(String value) {
            addCriterion("send_method <=", value, "sendMethod");
            return (Criteria) this;
        }

        public Criteria andSendMethodLike(String value) {
            addCriterion("send_method like", value, "sendMethod");
            return (Criteria) this;
        }

        public Criteria andSendMethodNotLike(String value) {
            addCriterion("send_method not like", value, "sendMethod");
            return (Criteria) this;
        }

        public Criteria andSendMethodIn(List<String> values) {
            addCriterion("send_method in", values, "sendMethod");
            return (Criteria) this;
        }

        public Criteria andSendMethodNotIn(List<String> values) {
            addCriterion("send_method not in", values, "sendMethod");
            return (Criteria) this;
        }

        public Criteria andSendMethodBetween(String value1, String value2) {
            addCriterion("send_method between", value1, value2, "sendMethod");
            return (Criteria) this;
        }

        public Criteria andSendMethodNotBetween(String value1, String value2) {
            addCriterion("send_method not between", value1, value2, "sendMethod");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNull() {
            addCriterion("send_status is null");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNotNull() {
            addCriterion("send_status is not null");
            return (Criteria) this;
        }

        public Criteria andSendStatusEqualTo(String value) {
            addCriterion("send_status =", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotEqualTo(String value) {
            addCriterion("send_status <>", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThan(String value) {
            addCriterion("send_status >", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThanOrEqualTo(String value) {
            addCriterion("send_status >=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThan(String value) {
            addCriterion("send_status <", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThanOrEqualTo(String value) {
            addCriterion("send_status <=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLike(String value) {
            addCriterion("send_status like", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotLike(String value) {
            addCriterion("send_status not like", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusIn(List<String> values) {
            addCriterion("send_status in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotIn(List<String> values) {
            addCriterion("send_status not in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusBetween(String value1, String value2) {
            addCriterion("send_status between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotBetween(String value1, String value2) {
            addCriterion("send_status not between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIsNull() {
            addCriterion("status_code is null");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIsNotNull() {
            addCriterion("status_code is not null");
            return (Criteria) this;
        }

        public Criteria andStatusCodeEqualTo(String value) {
            addCriterion("status_code =", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotEqualTo(String value) {
            addCriterion("status_code <>", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeGreaterThan(String value) {
            addCriterion("status_code >", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeGreaterThanOrEqualTo(String value) {
            addCriterion("status_code >=", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLessThan(String value) {
            addCriterion("status_code <", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLessThanOrEqualTo(String value) {
            addCriterion("status_code <=", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLike(String value) {
            addCriterion("status_code like", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotLike(String value) {
            addCriterion("status_code not like", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIn(List<String> values) {
            addCriterion("status_code in", values, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotIn(List<String> values) {
            addCriterion("status_code not in", values, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeBetween(String value1, String value2) {
            addCriterion("status_code between", value1, value2, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotBetween(String value1, String value2) {
            addCriterion("status_code not between", value1, value2, "statusCode");
            return (Criteria) this;
        }

        public Criteria andCodeMessageIsNull() {
            addCriterion("code_message is null");
            return (Criteria) this;
        }

        public Criteria andCodeMessageIsNotNull() {
            addCriterion("code_message is not null");
            return (Criteria) this;
        }

        public Criteria andCodeMessageEqualTo(String value) {
            addCriterion("code_message =", value, "codeMessage");
            return (Criteria) this;
        }

        public Criteria andCodeMessageNotEqualTo(String value) {
            addCriterion("code_message <>", value, "codeMessage");
            return (Criteria) this;
        }

        public Criteria andCodeMessageGreaterThan(String value) {
            addCriterion("code_message >", value, "codeMessage");
            return (Criteria) this;
        }

        public Criteria andCodeMessageGreaterThanOrEqualTo(String value) {
            addCriterion("code_message >=", value, "codeMessage");
            return (Criteria) this;
        }

        public Criteria andCodeMessageLessThan(String value) {
            addCriterion("code_message <", value, "codeMessage");
            return (Criteria) this;
        }

        public Criteria andCodeMessageLessThanOrEqualTo(String value) {
            addCriterion("code_message <=", value, "codeMessage");
            return (Criteria) this;
        }

        public Criteria andCodeMessageLike(String value) {
            addCriterion("code_message like", value, "codeMessage");
            return (Criteria) this;
        }

        public Criteria andCodeMessageNotLike(String value) {
            addCriterion("code_message not like", value, "codeMessage");
            return (Criteria) this;
        }

        public Criteria andCodeMessageIn(List<String> values) {
            addCriterion("code_message in", values, "codeMessage");
            return (Criteria) this;
        }

        public Criteria andCodeMessageNotIn(List<String> values) {
            addCriterion("code_message not in", values, "codeMessage");
            return (Criteria) this;
        }

        public Criteria andCodeMessageBetween(String value1, String value2) {
            addCriterion("code_message between", value1, value2, "codeMessage");
            return (Criteria) this;
        }

        public Criteria andCodeMessageNotBetween(String value1, String value2) {
            addCriterion("code_message not between", value1, value2, "codeMessage");
            return (Criteria) this;
        }

        public Criteria andMessageAccountIsNull() {
            addCriterion("message_account is null");
            return (Criteria) this;
        }

        public Criteria andMessageAccountIsNotNull() {
            addCriterion("message_account is not null");
            return (Criteria) this;
        }

        public Criteria andMessageAccountEqualTo(String value) {
            addCriterion("message_account =", value, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountNotEqualTo(String value) {
            addCriterion("message_account <>", value, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountGreaterThan(String value) {
            addCriterion("message_account >", value, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountGreaterThanOrEqualTo(String value) {
            addCriterion("message_account >=", value, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountLessThan(String value) {
            addCriterion("message_account <", value, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountLessThanOrEqualTo(String value) {
            addCriterion("message_account <=", value, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountLike(String value) {
            addCriterion("message_account like", value, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountNotLike(String value) {
            addCriterion("message_account not like", value, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountIn(List<String> values) {
            addCriterion("message_account in", values, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountNotIn(List<String> values) {
            addCriterion("message_account not in", values, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountBetween(String value1, String value2) {
            addCriterion("message_account between", value1, value2, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountNotBetween(String value1, String value2) {
            addCriterion("message_account not between", value1, value2, "messageAccount");
            return (Criteria) this;
        }
    }

    /**
     * message_report表的操作类
     * 
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * message_report表的操作类
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