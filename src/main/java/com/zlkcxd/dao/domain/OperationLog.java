package com.zlkcxd.dao.domain;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OperationLog implements Serializable {
    /**
     * 自增长ID -- s_operation_log.id
     * 
     */
    private Long id;

    /**
     * 操作者 -- s_operation_log.operator
     * 
     */
    private String operator;

    /**
     * 类型 -- s_operation_log.type
     * 
     */
    private String type;

    /**
     * 创建时间 -- s_operation_log.create_time
     * 
     */
    private Date createTime;

    /**
     * 操作内容 -- s_operation_log.content
     * 
     */
    private String content;

    /**
     * 备注 -- s_operation_log.remark
     * 
     */
    private String remark;

    /**
     * 业务id -- s_operation_log.business_id
     * 
     */
    private Long businessId;

    /**
     * 业务类型 -- s_operation_log.business_type
     * 
     */
    private String businessType;

    /**
     * 审批结果 -- s_operation_log.approvl_status
     * 
     */
    private String approvlStatus;

    /**
     * s_operation_log表的操作属性:serialVersionUID
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 s_operation_log.id的get方法 
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 数据字段 s_operation_log.id的set方法
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 数据字段 s_operation_log.operator的get方法 
     * 
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 数据字段 s_operation_log.operator的set方法
     * 
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * 数据字段 s_operation_log.type的get方法 
     * 
     */
    public String getType() {
        return type;
    }

    /**
     * 数据字段 s_operation_log.type的set方法
     * 
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 数据字段 s_operation_log.create_time的get方法 
     * 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 数据字段 s_operation_log.create_time的set方法
     * 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 数据字段 s_operation_log.content的get方法 
     * 
     */
    public String getContent() {
        return content;
    }

    /**
     * 数据字段 s_operation_log.content的set方法
     * 
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 数据字段 s_operation_log.remark的get方法 
     * 
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 数据字段 s_operation_log.remark的set方法
     * 
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 数据字段 s_operation_log.business_id的get方法 
     * 
     */
    public Long getBusinessId() {
        return businessId;
    }

    /**
     * 数据字段 s_operation_log.business_id的set方法
     * 
     */
    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    /**
     * 数据字段 s_operation_log.business_type的get方法 
     * 
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * 数据字段 s_operation_log.business_type的set方法
     * 
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    /**
     * 数据字段 s_operation_log.approvl_status的get方法 
     * 
     */
    public String getApprovlStatus() {
        return approvlStatus;
    }

    /**
     * 数据字段 s_operation_log.approvl_status的set方法
     * 
     */
    public void setApprovlStatus(String approvlStatus) {
        this.approvlStatus = approvlStatus == null ? null : approvlStatus.trim();
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}