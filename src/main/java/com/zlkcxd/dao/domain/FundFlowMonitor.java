package com.zlkcxd.dao.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class FundFlowMonitor implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_flow_monitor.id
     * 
     */
    private Long id;

    /**
     * 创建时间 -- fund_flow_monitor.created_time
     * 
     */
    private Date createdTime;

    /**
     * 机构id -- fund_flow_monitor.org_id
     * 
     */
    private Long orgId;

    /**
     * 部门id -- fund_flow_monitor.department_id
     * 
     */
    private Long departmentId;

    /**
     * 户数 -- fund_flow_monitor.number
     * 
     */
    private Long number;

    /**
     * 金额 -- fund_flow_monitor.amount
     * 
     */
    private BigDecimal amount;

    /**
     * 项目 -- fund_flow_monitor.projects
     * 
     */
    private Long projects;

    /**
     * 备注 -- fund_flow_monitor.remark
     * 
     */
    private String remark;

    /**
     * fund_flow_monitor表的操作属性:serialVersionUID
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 fund_flow_monitor.id的get方法 
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 数据字段 fund_flow_monitor.id的set方法
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 数据字段 fund_flow_monitor.created_time的get方法 
     * 
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 数据字段 fund_flow_monitor.created_time的set方法
     * 
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 数据字段 fund_flow_monitor.org_id的get方法 
     * 
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * 数据字段 fund_flow_monitor.org_id的set方法
     * 
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 数据字段 fund_flow_monitor.department_id的get方法 
     * 
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * 数据字段 fund_flow_monitor.department_id的set方法
     * 
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 数据字段 fund_flow_monitor.number的get方法 
     * 
     */
    public Long getNumber() {
        return number;
    }

    /**
     * 数据字段 fund_flow_monitor.number的set方法
     * 
     */
    public void setNumber(Long number) {
        this.number = number;
    }

    /**
     * 数据字段 fund_flow_monitor.amount的get方法 
     * 
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 数据字段 fund_flow_monitor.amount的set方法
     * 
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 数据字段 fund_flow_monitor.projects的get方法 
     * 
     */
    public Long getProjects() {
        return projects;
    }

    /**
     * 数据字段 fund_flow_monitor.projects的set方法
     * 
     */
    public void setProjects(Long projects) {
        this.projects = projects;
    }

    /**
     * 数据字段 fund_flow_monitor.remark的get方法 
     * 
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 数据字段 fund_flow_monitor.remark的set方法
     * 
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}