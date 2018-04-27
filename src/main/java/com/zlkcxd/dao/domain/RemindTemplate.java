package com.zlkcxd.dao.domain;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RemindTemplate implements Serializable {
    /**
     * 主键id -- remind_template.id
     * 
     */
    private Long id;

    /**
     * 创建时间 -- remind_template.created_time
     * 
     */
    private Date createdTime;

    /**
     * 修改时间 -- remind_template.update_time
     * 
     */
    private Date updateTime;

    /**
     * 提醒类型： 1:本金到期（随借随还） 2:20号收息（随借随还）3: 本金到期+利息（分期客户） -- remind_template.remind_type
     * 
     */
    private String remindType;

    /**
     * 信息主体，如：温馨提醒：尊敬的#{customerName}先生/女士，您本月归还的利息已收到，感谢您的配合，祝您生意兴隆！退订TD -- remind_template.msg_body
     * 
     */
    private String msgBody;

    /**
     * 模板字段，格式为：loanAmount,principalAmount,interestAmount -- remind_template.template_fields
     * 
     */
    private String templateFields;

    /**
     * 提前天数，数据格式：5,3,1，表示提前5天、3天、1天都有一条提醒信息发给客户，在生成信息的时候会有三条信息记录到remind_event表中。如果提前天数为空，表示该提醒事件在事件产生的当天发送 -- remind_template.advance_days
     * 
     */
    private String advanceDays;

    /**
     * 1-启用 2-停用 -- remind_template.status
     * 
     */
    private Integer status;

    /**
     * 发送时间 -- remind_template.send_time
     * 
     */
    private Date sendTime;

    /**
     * 提醒时间，枚举类型
1：提前
2：当天某一时刻
3：逾期
4：立即 -- remind_template.remind_time
     * 
     */
    private String remindTime;

    /**
     * 模板名称 -- remind_template.template_name
     * 
     */
    private String templateName;

    /**
     * remind_template表的操作属性:serialVersionUID
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 remind_template.id的get方法 
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 数据字段 remind_template.id的set方法
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 数据字段 remind_template.created_time的get方法 
     * 
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 数据字段 remind_template.created_time的set方法
     * 
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 数据字段 remind_template.update_time的get方法 
     * 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 数据字段 remind_template.update_time的set方法
     * 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 数据字段 remind_template.remind_type的get方法 
     * 
     */
    public String getRemindType() {
        return remindType;
    }

    /**
     * 数据字段 remind_template.remind_type的set方法
     * 
     */
    public void setRemindType(String remindType) {
        this.remindType = remindType == null ? null : remindType.trim();
    }

    /**
     * 数据字段 remind_template.msg_body的get方法 
     * 
     */
    public String getMsgBody() {
        return msgBody;
    }

    /**
     * 数据字段 remind_template.msg_body的set方法
     * 
     */
    public void setMsgBody(String msgBody) {
        this.msgBody = msgBody == null ? null : msgBody.trim();
    }

    /**
     * 数据字段 remind_template.template_fields的get方法 
     * 
     */
    public String getTemplateFields() {
        return templateFields;
    }

    /**
     * 数据字段 remind_template.template_fields的set方法
     * 
     */
    public void setTemplateFields(String templateFields) {
        this.templateFields = templateFields == null ? null : templateFields.trim();
    }

    /**
     * 数据字段 remind_template.advance_days的get方法 
     * 
     */
    public String getAdvanceDays() {
        return advanceDays;
    }

    /**
     * 数据字段 remind_template.advance_days的set方法
     * 
     */
    public void setAdvanceDays(String advanceDays) {
        this.advanceDays = advanceDays == null ? null : advanceDays.trim();
    }

    /**
     * 数据字段 remind_template.status的get方法 
     * 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 数据字段 remind_template.status的set方法
     * 
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 数据字段 remind_template.send_time的get方法 
     * 
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 数据字段 remind_template.send_time的set方法
     * 
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 数据字段 remind_template.remind_time的get方法 
     * 
     */
    public String getRemindTime() {
        return remindTime;
    }

    /**
     * 数据字段 remind_template.remind_time的set方法
     * 
     */
    public void setRemindTime(String remindTime) {
        this.remindTime = remindTime == null ? null : remindTime.trim();
    }

    /**
     * 数据字段 remind_template.template_name的get方法 
     * 
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * 数据字段 remind_template.template_name的set方法
     * 
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName == null ? null : templateName.trim();
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}