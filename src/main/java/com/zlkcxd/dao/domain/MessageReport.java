package com.zlkcxd.dao.domain;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MessageReport implements Serializable {
    /**
     * 主键 -- message_report.id
     * 
     */
    private Long id;

    /**
     * 创建时间 -- message_report.create_time
     * 
     */
    private Date createTime;

    /**
     * 修改时间 -- message_report.update_time
     * 
     */
    private Date updateTime;

    /**
     * 手机号 -- message_report.srcterm_id
     * 
     */
    private String srctermId;

    /**
     * 提交时间 -- message_report.submit_date
     * 
     */
    private Date submitDate;

    /**
     * 处理时间 -- message_report.receive_date
     * 
     */
    private Date receiveDate;

    /**
     * 扩展码 -- message_report.add_serial_rev
     * 
     */
    private String addSerialRev;

    /**
     * 状态值 -- message_report.state
     * 
     */
    private String state;

    /**
     * 消息id -- message_report.seq_id
     * 
     */
    private String seqId;

    /**
     * 短信内容 -- message_report.message
     * 
     */
    private String message;

    /**
     * 发送类型 -- message_report.send_type
     * 
     */
    private String sendType;

    /**
     * 发送方式 -- message_report.send_method
     * 
     */
    private String sendMethod;

    /**
     * 发送状态 -- message_report.send_status
     * 
     */
    private String sendStatus;

    /**
     * 状态码 -- message_report.status_code
     * 
     */
    private String statusCode;

    /**
     * 状态码描述 -- message_report.code_message
     * 
     */
    private String codeMessage;

    /**
     * 短信账号 -- message_report.message_account
     * 
     */
    private String messageAccount;

    /**
     * message_report表的操作属性:serialVersionUID
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 message_report.id的get方法 
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 数据字段 message_report.id的set方法
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 数据字段 message_report.create_time的get方法 
     * 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 数据字段 message_report.create_time的set方法
     * 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 数据字段 message_report.update_time的get方法 
     * 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 数据字段 message_report.update_time的set方法
     * 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 数据字段 message_report.srcterm_id的get方法 
     * 
     */
    public String getSrctermId() {
        return srctermId;
    }

    /**
     * 数据字段 message_report.srcterm_id的set方法
     * 
     */
    public void setSrctermId(String srctermId) {
        this.srctermId = srctermId == null ? null : srctermId.trim();
    }

    /**
     * 数据字段 message_report.submit_date的get方法 
     * 
     */
    public Date getSubmitDate() {
        return submitDate;
    }

    /**
     * 数据字段 message_report.submit_date的set方法
     * 
     */
    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    /**
     * 数据字段 message_report.receive_date的get方法 
     * 
     */
    public Date getReceiveDate() {
        return receiveDate;
    }

    /**
     * 数据字段 message_report.receive_date的set方法
     * 
     */
    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    /**
     * 数据字段 message_report.add_serial_rev的get方法 
     * 
     */
    public String getAddSerialRev() {
        return addSerialRev;
    }

    /**
     * 数据字段 message_report.add_serial_rev的set方法
     * 
     */
    public void setAddSerialRev(String addSerialRev) {
        this.addSerialRev = addSerialRev == null ? null : addSerialRev.trim();
    }

    /**
     * 数据字段 message_report.state的get方法 
     * 
     */
    public String getState() {
        return state;
    }

    /**
     * 数据字段 message_report.state的set方法
     * 
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * 数据字段 message_report.seq_id的get方法 
     * 
     */
    public String getSeqId() {
        return seqId;
    }

    /**
     * 数据字段 message_report.seq_id的set方法
     * 
     */
    public void setSeqId(String seqId) {
        this.seqId = seqId == null ? null : seqId.trim();
    }

    /**
     * 数据字段 message_report.message的get方法 
     * 
     */
    public String getMessage() {
        return message;
    }

    /**
     * 数据字段 message_report.message的set方法
     * 
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * 数据字段 message_report.send_type的get方法 
     * 
     */
    public String getSendType() {
        return sendType;
    }

    /**
     * 数据字段 message_report.send_type的set方法
     * 
     */
    public void setSendType(String sendType) {
        this.sendType = sendType == null ? null : sendType.trim();
    }

    /**
     * 数据字段 message_report.send_method的get方法 
     * 
     */
    public String getSendMethod() {
        return sendMethod;
    }

    /**
     * 数据字段 message_report.send_method的set方法
     * 
     */
    public void setSendMethod(String sendMethod) {
        this.sendMethod = sendMethod == null ? null : sendMethod.trim();
    }

    /**
     * 数据字段 message_report.send_status的get方法 
     * 
     */
    public String getSendStatus() {
        return sendStatus;
    }

    /**
     * 数据字段 message_report.send_status的set方法
     * 
     */
    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus == null ? null : sendStatus.trim();
    }

    /**
     * 数据字段 message_report.status_code的get方法 
     * 
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * 数据字段 message_report.status_code的set方法
     * 
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    /**
     * 数据字段 message_report.code_message的get方法 
     * 
     */
    public String getCodeMessage() {
        return codeMessage;
    }

    /**
     * 数据字段 message_report.code_message的set方法
     * 
     */
    public void setCodeMessage(String codeMessage) {
        this.codeMessage = codeMessage == null ? null : codeMessage.trim();
    }

    /**
     * 数据字段 message_report.message_account的get方法 
     * 
     */
    public String getMessageAccount() {
        return messageAccount;
    }

    /**
     * 数据字段 message_report.message_account的set方法
     * 
     */
    public void setMessageAccount(String messageAccount) {
        this.messageAccount = messageAccount == null ? null : messageAccount.trim();
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}