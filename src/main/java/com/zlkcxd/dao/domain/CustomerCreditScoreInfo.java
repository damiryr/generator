package com.zlkcxd.dao.domain;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CustomerCreditScoreInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_credit_score_info.id
     * 
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_credit_score_info.created_time
     * 
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_credit_score_info.updated_time
     * 
     */
    private Date updatedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_credit_score_info.customer_credit_id
     * 
     */
    private Long customerCreditId;

    /**
     * 同盾贷前检查数据 -- customer_credit_score_info.td_preloancheck_data
     * 
     */
    private String tdPreloancheckData;

    /**
     * 白骑士征信评估数据 -- customer_credit_score_info.bqs_risk_decision_data
     * 
     */
    private String bqsRiskDecisionData;

    /**
     * 鹏元个人风险评估数据 -- customer_credit_score_info.py_person_risk_data
     * 
     */
    private String pyPersonRiskData;

    /**
     * 鹏元学历数据 -- customer_credit_score_info.py_education_data
     * 
     */
    private String pyEducationData;

    /**
     * 鹏元时机时长数据 -- customer_credit_score_info.py_phone_usetime_data
     * 
     */
    private String pyPhoneUsetimeData;

    /**
     * 芝麻分 -- customer_credit_score_info.zm_score
     * 
     */
    private Integer zmScore;

    /**
     * 鹏元学历 -- customer_credit_score_info.py_education
     * 
     */
    private String pyEducation;

    /**
     * 同盾贷钱检查分 -- customer_credit_score_info.td_preloancheck_score
     * 
     */
    private Integer tdPreloancheckScore;

    /**
     * 白骑士风险决策 -- customer_credit_score_info.bqs_risk_decision
     * 
     */
    private String bqsRiskDecision;

    /**
     * 鹏元个人风险分 -- customer_credit_score_info.py_person_risk_score
     * 
     */
    private Integer pyPersonRiskScore;

    /**
     * 鹏元手机号使用时长 -- customer_credit_score_info.py_phone_usetime
     * 
     */
    private String pyPhoneUsetime;

    /**
     * 征信跑分 -- customer_credit_score_info.credit_score
     * 
     */
    private Integer creditScore;

    /**
     * 征信额度 -- customer_credit_score_info.credit_amount
     * 
     */
    private Long creditAmount;

    /**
     * customer_credit_score_info表的操作属性:serialVersionUID
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 customer_credit_score_info.id的get方法 
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 数据字段 customer_credit_score_info.id的set方法
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 数据字段 customer_credit_score_info.created_time的get方法 
     * 
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 数据字段 customer_credit_score_info.created_time的set方法
     * 
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 数据字段 customer_credit_score_info.updated_time的get方法 
     * 
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 数据字段 customer_credit_score_info.updated_time的set方法
     * 
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * 数据字段 customer_credit_score_info.customer_credit_id的get方法 
     * 
     */
    public Long getCustomerCreditId() {
        return customerCreditId;
    }

    /**
     * 数据字段 customer_credit_score_info.customer_credit_id的set方法
     * 
     */
    public void setCustomerCreditId(Long customerCreditId) {
        this.customerCreditId = customerCreditId;
    }

    /**
     * 数据字段 customer_credit_score_info.td_preloancheck_data的get方法 
     * 
     */
    public String getTdPreloancheckData() {
        return tdPreloancheckData;
    }

    /**
     * 数据字段 customer_credit_score_info.td_preloancheck_data的set方法
     * 
     */
    public void setTdPreloancheckData(String tdPreloancheckData) {
        this.tdPreloancheckData = tdPreloancheckData == null ? null : tdPreloancheckData.trim();
    }

    /**
     * 数据字段 customer_credit_score_info.bqs_risk_decision_data的get方法 
     * 
     */
    public String getBqsRiskDecisionData() {
        return bqsRiskDecisionData;
    }

    /**
     * 数据字段 customer_credit_score_info.bqs_risk_decision_data的set方法
     * 
     */
    public void setBqsRiskDecisionData(String bqsRiskDecisionData) {
        this.bqsRiskDecisionData = bqsRiskDecisionData == null ? null : bqsRiskDecisionData.trim();
    }

    /**
     * 数据字段 customer_credit_score_info.py_person_risk_data的get方法 
     * 
     */
    public String getPyPersonRiskData() {
        return pyPersonRiskData;
    }

    /**
     * 数据字段 customer_credit_score_info.py_person_risk_data的set方法
     * 
     */
    public void setPyPersonRiskData(String pyPersonRiskData) {
        this.pyPersonRiskData = pyPersonRiskData == null ? null : pyPersonRiskData.trim();
    }

    /**
     * 数据字段 customer_credit_score_info.py_education_data的get方法 
     * 
     */
    public String getPyEducationData() {
        return pyEducationData;
    }

    /**
     * 数据字段 customer_credit_score_info.py_education_data的set方法
     * 
     */
    public void setPyEducationData(String pyEducationData) {
        this.pyEducationData = pyEducationData == null ? null : pyEducationData.trim();
    }

    /**
     * 数据字段 customer_credit_score_info.py_phone_usetime_data的get方法 
     * 
     */
    public String getPyPhoneUsetimeData() {
        return pyPhoneUsetimeData;
    }

    /**
     * 数据字段 customer_credit_score_info.py_phone_usetime_data的set方法
     * 
     */
    public void setPyPhoneUsetimeData(String pyPhoneUsetimeData) {
        this.pyPhoneUsetimeData = pyPhoneUsetimeData == null ? null : pyPhoneUsetimeData.trim();
    }

    /**
     * 数据字段 customer_credit_score_info.zm_score的get方法 
     * 
     */
    public Integer getZmScore() {
        return zmScore;
    }

    /**
     * 数据字段 customer_credit_score_info.zm_score的set方法
     * 
     */
    public void setZmScore(Integer zmScore) {
        this.zmScore = zmScore;
    }

    /**
     * 数据字段 customer_credit_score_info.py_education的get方法 
     * 
     */
    public String getPyEducation() {
        return pyEducation;
    }

    /**
     * 数据字段 customer_credit_score_info.py_education的set方法
     * 
     */
    public void setPyEducation(String pyEducation) {
        this.pyEducation = pyEducation == null ? null : pyEducation.trim();
    }

    /**
     * 数据字段 customer_credit_score_info.td_preloancheck_score的get方法 
     * 
     */
    public Integer getTdPreloancheckScore() {
        return tdPreloancheckScore;
    }

    /**
     * 数据字段 customer_credit_score_info.td_preloancheck_score的set方法
     * 
     */
    public void setTdPreloancheckScore(Integer tdPreloancheckScore) {
        this.tdPreloancheckScore = tdPreloancheckScore;
    }

    /**
     * 数据字段 customer_credit_score_info.bqs_risk_decision的get方法 
     * 
     */
    public String getBqsRiskDecision() {
        return bqsRiskDecision;
    }

    /**
     * 数据字段 customer_credit_score_info.bqs_risk_decision的set方法
     * 
     */
    public void setBqsRiskDecision(String bqsRiskDecision) {
        this.bqsRiskDecision = bqsRiskDecision == null ? null : bqsRiskDecision.trim();
    }

    /**
     * 数据字段 customer_credit_score_info.py_person_risk_score的get方法 
     * 
     */
    public Integer getPyPersonRiskScore() {
        return pyPersonRiskScore;
    }

    /**
     * 数据字段 customer_credit_score_info.py_person_risk_score的set方法
     * 
     */
    public void setPyPersonRiskScore(Integer pyPersonRiskScore) {
        this.pyPersonRiskScore = pyPersonRiskScore;
    }

    /**
     * 数据字段 customer_credit_score_info.py_phone_usetime的get方法 
     * 
     */
    public String getPyPhoneUsetime() {
        return pyPhoneUsetime;
    }

    /**
     * 数据字段 customer_credit_score_info.py_phone_usetime的set方法
     * 
     */
    public void setPyPhoneUsetime(String pyPhoneUsetime) {
        this.pyPhoneUsetime = pyPhoneUsetime == null ? null : pyPhoneUsetime.trim();
    }

    /**
     * 数据字段 customer_credit_score_info.credit_score的get方法 
     * 
     */
    public Integer getCreditScore() {
        return creditScore;
    }

    /**
     * 数据字段 customer_credit_score_info.credit_score的set方法
     * 
     */
    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    /**
     * 数据字段 customer_credit_score_info.credit_amount的get方法 
     * 
     */
    public Long getCreditAmount() {
        return creditAmount;
    }

    /**
     * 数据字段 customer_credit_score_info.credit_amount的set方法
     * 
     */
    public void setCreditAmount(Long creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}