package com.zlkcxd.dao.domain;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RemindRecord implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remind_record.id
     * 
     */
    private Long id;

    /**
     * 手机号 -- remind_record.phone_number
     * 
     */
    private String phoneNumber;

    /**
     * 短信内容 -- remind_record.message
     * 
     */
    private String message;

    /**
     * 贷款编号 -- remind_record.loan_id
     * 
     */
    private Long loanId;

    /**
     * 发送时间 -- remind_record.send_time
     * 
     */
    private Date sendTime;

    /**
     * 是否成功 1-成功 0-失败 -- remind_record.is_success
     * 
     */
    private String isSuccess;

    /**
     * 发送短信唯一标识 -- remind_record.smsId
     * 
     */
    private String smsid;

    /**
     * remind_record表的操作属性:serialVersionUID
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 remind_record.id的get方法 
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 数据字段 remind_record.id的set方法
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 数据字段 remind_record.phone_number的get方法 
     * 
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 数据字段 remind_record.phone_number的set方法
     * 
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * 数据字段 remind_record.message的get方法 
     * 
     */
    public String getMessage() {
        return message;
    }

    /**
     * 数据字段 remind_record.message的set方法
     * 
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * 数据字段 remind_record.loan_id的get方法 
     * 
     */
    public Long getLoanId() {
        return loanId;
    }

    /**
     * 数据字段 remind_record.loan_id的set方法
     * 
     */
    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    /**
     * 数据字段 remind_record.send_time的get方法 
     * 
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 数据字段 remind_record.send_time的set方法
     * 
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 数据字段 remind_record.is_success的get方法 
     * 
     */
    public String getIsSuccess() {
        return isSuccess;
    }

    /**
     * 数据字段 remind_record.is_success的set方法
     * 
     */
    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess == null ? null : isSuccess.trim();
    }

    /**
     * 数据字段 remind_record.smsId的get方法 
     * 
     */
    public String getSmsid() {
        return smsid;
    }

    /**
     * 数据字段 remind_record.smsId的set方法
     * 
     */
    public void setSmsid(String smsid) {
        this.smsid = smsid == null ? null : smsid.trim();
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}