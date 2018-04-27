package com.zlkcxd.dao.domain;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CustomerInfoUpdateRecord implements Serializable {
    /**
     * 主键id -- customer_info_update_record.id
     * 
     */
    private Long id;

    /**
     * 客户id -- customer_info_update_record.customer_id
     * 
     */
    private Long customerId;

    /**
     * 修改前客户名称 -- customer_info_update_record.before_customer_name
     * 
     */
    private String beforeCustomerName;

    /**
     * 修改前证件号码 -- customer_info_update_record.before_cert_no
     * 
     */
    private String beforeCertNo;

    /**
     * 修改后客户名称 -- customer_info_update_record.after_customer_name
     * 
     */
    private String afterCustomerName;

    /**
     * 修改后证件号码 -- customer_info_update_record.after_cert_no
     * 
     */
    private String afterCertNo;

    /**
     * 客户修改前的json串 -- customer_info_update_record.before_customer_info
     * 
     */
    private String beforeCustomerInfo;

    /**
     * 修改后的客户信息json串 -- customer_info_update_record.after_customer_info
     * 
     */
    private String afterCustomerInfo;

    /**
     * 流程实例id -- customer_info_update_record.process_instance_id
     * 
     */
    private String processInstanceId;

    /**
     * 修改原因 -- customer_info_update_record.reason
     * 
     */
    private String reason;

    /**
     * 创建时间 -- customer_info_update_record.create_time
     * 
     */
    private Date createTime;

    /**
     * 创建人 -- customer_info_update_record.create_user_id
     * 
     */
    private Long createUserId;

    /**
     * 修改时间 -- customer_info_update_record.update_time
     * 
     */
    private Date updateTime;

    /**
     * 修改人 -- customer_info_update_record.update_user_id
     * 
     */
    private Long updateUserId;

    /**
     * customer_info_update_record表的操作属性:serialVersionUID
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 customer_info_update_record.id的get方法 
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 数据字段 customer_info_update_record.id的set方法
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 数据字段 customer_info_update_record.customer_id的get方法 
     * 
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * 数据字段 customer_info_update_record.customer_id的set方法
     * 
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * 数据字段 customer_info_update_record.before_customer_name的get方法 
     * 
     */
    public String getBeforeCustomerName() {
        return beforeCustomerName;
    }

    /**
     * 数据字段 customer_info_update_record.before_customer_name的set方法
     * 
     */
    public void setBeforeCustomerName(String beforeCustomerName) {
        this.beforeCustomerName = beforeCustomerName == null ? null : beforeCustomerName.trim();
    }

    /**
     * 数据字段 customer_info_update_record.before_cert_no的get方法 
     * 
     */
    public String getBeforeCertNo() {
        return beforeCertNo;
    }

    /**
     * 数据字段 customer_info_update_record.before_cert_no的set方法
     * 
     */
    public void setBeforeCertNo(String beforeCertNo) {
        this.beforeCertNo = beforeCertNo == null ? null : beforeCertNo.trim();
    }

    /**
     * 数据字段 customer_info_update_record.after_customer_name的get方法 
     * 
     */
    public String getAfterCustomerName() {
        return afterCustomerName;
    }

    /**
     * 数据字段 customer_info_update_record.after_customer_name的set方法
     * 
     */
    public void setAfterCustomerName(String afterCustomerName) {
        this.afterCustomerName = afterCustomerName == null ? null : afterCustomerName.trim();
    }

    /**
     * 数据字段 customer_info_update_record.after_cert_no的get方法 
     * 
     */
    public String getAfterCertNo() {
        return afterCertNo;
    }

    /**
     * 数据字段 customer_info_update_record.after_cert_no的set方法
     * 
     */
    public void setAfterCertNo(String afterCertNo) {
        this.afterCertNo = afterCertNo == null ? null : afterCertNo.trim();
    }

    /**
     * 数据字段 customer_info_update_record.before_customer_info的get方法 
     * 
     */
    public String getBeforeCustomerInfo() {
        return beforeCustomerInfo;
    }

    /**
     * 数据字段 customer_info_update_record.before_customer_info的set方法
     * 
     */
    public void setBeforeCustomerInfo(String beforeCustomerInfo) {
        this.beforeCustomerInfo = beforeCustomerInfo == null ? null : beforeCustomerInfo.trim();
    }

    /**
     * 数据字段 customer_info_update_record.after_customer_info的get方法 
     * 
     */
    public String getAfterCustomerInfo() {
        return afterCustomerInfo;
    }

    /**
     * 数据字段 customer_info_update_record.after_customer_info的set方法
     * 
     */
    public void setAfterCustomerInfo(String afterCustomerInfo) {
        this.afterCustomerInfo = afterCustomerInfo == null ? null : afterCustomerInfo.trim();
    }

    /**
     * 数据字段 customer_info_update_record.process_instance_id的get方法 
     * 
     */
    public String getProcessInstanceId() {
        return processInstanceId;
    }

    /**
     * 数据字段 customer_info_update_record.process_instance_id的set方法
     * 
     */
    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId == null ? null : processInstanceId.trim();
    }

    /**
     * 数据字段 customer_info_update_record.reason的get方法 
     * 
     */
    public String getReason() {
        return reason;
    }

    /**
     * 数据字段 customer_info_update_record.reason的set方法
     * 
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * 数据字段 customer_info_update_record.create_time的get方法 
     * 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 数据字段 customer_info_update_record.create_time的set方法
     * 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 数据字段 customer_info_update_record.create_user_id的get方法 
     * 
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * 数据字段 customer_info_update_record.create_user_id的set方法
     * 
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 数据字段 customer_info_update_record.update_time的get方法 
     * 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 数据字段 customer_info_update_record.update_time的set方法
     * 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 数据字段 customer_info_update_record.update_user_id的get方法 
     * 
     */
    public Long getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 数据字段 customer_info_update_record.update_user_id的set方法
     * 
     */
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}