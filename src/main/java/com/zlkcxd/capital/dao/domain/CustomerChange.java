package com.zlkcxd.capital.dao.domain;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CustomerChange implements Serializable {
    /**
     * 主键,自动增长 -- customer_change.id
     * 
     */
    private Long id;

    /**
     * 客户ID “,”隔开 -- customer_change.customer_ids
     * 
     */
    private String customerIds;

    /**
     * 客户经理 -- customer_change.customer_manager
     * 
     */
    private Long customerManager;

    /**
     * 机构id -- customer_change.org_id
     * 
     */
    private Long orgId;

    /**
     * 用户组id -- customer_change.group_id
     * 
     */
    private Long groupId;

    /**
     * 部门id -- customer_change.department_id
     * 
     */
    private Long departmentId;

    /**
     * 交接原因 -- customer_change.change_reason
     * 
     */
    private String changeReason;

    /**
     * 被交接人 -- customer_change.old_manager
     * 
     */
    private Long oldManager;

    /**
     * 审批时间 -- customer_change.approve_date
     * 
     */
    private Date approveDate;

    /**
     * 流程实例id -- customer_change.approval_process_id
     * 
     */
    private String approvalProcessId;

    /**
     * 审批状态 -- customer_change.approve_status
     * 
     */
    private String approveStatus;

    /**
     * 业务经办办人id -- customer_change.operate_user
     * 
     */
    private Long operateUser;

    /**
     * 删除标记（1：正常、0：删除） -- customer_change.is_delete
     * 
     */
    private Integer isDelete;

    /**
     * 备用字段 -- customer_change.remark_info
     * 
     */
    private String remarkInfo;

    /**
     * 创建时间 -- customer_change.create_time
     * 
     */
    private Date createTime;

    /**
     * 更新时间 -- customer_change.update_time
     * 
     */
    private Date updateTime;

    /**
     * customer_change表的操作属性:serialVersionUID
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 customer_change.id的get方法 
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 数据字段 customer_change.id的set方法
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 数据字段 customer_change.customer_ids的get方法 
     * 
     */
    public String getCustomerIds() {
        return customerIds;
    }

    /**
     * 数据字段 customer_change.customer_ids的set方法
     * 
     */
    public void setCustomerIds(String customerIds) {
        this.customerIds = customerIds == null ? null : customerIds.trim();
    }

    /**
     * 数据字段 customer_change.customer_manager的get方法 
     * 
     */
    public Long getCustomerManager() {
        return customerManager;
    }

    /**
     * 数据字段 customer_change.customer_manager的set方法
     * 
     */
    public void setCustomerManager(Long customerManager) {
        this.customerManager = customerManager;
    }

    /**
     * 数据字段 customer_change.org_id的get方法 
     * 
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * 数据字段 customer_change.org_id的set方法
     * 
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 数据字段 customer_change.group_id的get方法 
     * 
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * 数据字段 customer_change.group_id的set方法
     * 
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * 数据字段 customer_change.department_id的get方法 
     * 
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * 数据字段 customer_change.department_id的set方法
     * 
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 数据字段 customer_change.change_reason的get方法 
     * 
     */
    public String getChangeReason() {
        return changeReason;
    }

    /**
     * 数据字段 customer_change.change_reason的set方法
     * 
     */
    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason == null ? null : changeReason.trim();
    }

    /**
     * 数据字段 customer_change.old_manager的get方法 
     * 
     */
    public Long getOldManager() {
        return oldManager;
    }

    /**
     * 数据字段 customer_change.old_manager的set方法
     * 
     */
    public void setOldManager(Long oldManager) {
        this.oldManager = oldManager;
    }

    /**
     * 数据字段 customer_change.approve_date的get方法 
     * 
     */
    public Date getApproveDate() {
        return approveDate;
    }

    /**
     * 数据字段 customer_change.approve_date的set方法
     * 
     */
    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    /**
     * 数据字段 customer_change.approval_process_id的get方法 
     * 
     */
    public String getApprovalProcessId() {
        return approvalProcessId;
    }

    /**
     * 数据字段 customer_change.approval_process_id的set方法
     * 
     */
    public void setApprovalProcessId(String approvalProcessId) {
        this.approvalProcessId = approvalProcessId == null ? null : approvalProcessId.trim();
    }

    /**
     * 数据字段 customer_change.approve_status的get方法 
     * 
     */
    public String getApproveStatus() {
        return approveStatus;
    }

    /**
     * 数据字段 customer_change.approve_status的set方法
     * 
     */
    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus == null ? null : approveStatus.trim();
    }

    /**
     * 数据字段 customer_change.operate_user的get方法 
     * 
     */
    public Long getOperateUser() {
        return operateUser;
    }

    /**
     * 数据字段 customer_change.operate_user的set方法
     * 
     */
    public void setOperateUser(Long operateUser) {
        this.operateUser = operateUser;
    }

    /**
     * 数据字段 customer_change.is_delete的get方法 
     * 
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 数据字段 customer_change.is_delete的set方法
     * 
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 数据字段 customer_change.remark_info的get方法 
     * 
     */
    public String getRemarkInfo() {
        return remarkInfo;
    }

    /**
     * 数据字段 customer_change.remark_info的set方法
     * 
     */
    public void setRemarkInfo(String remarkInfo) {
        this.remarkInfo = remarkInfo == null ? null : remarkInfo.trim();
    }

    /**
     * 数据字段 customer_change.create_time的get方法 
     * 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 数据字段 customer_change.create_time的set方法
     * 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 数据字段 customer_change.update_time的get方法 
     * 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 数据字段 customer_change.update_time的set方法
     * 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}