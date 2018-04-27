package com.zlkcxd.dao.domain;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ProductDistributionRecord implements Serializable {
    /**
     * 主键id -- product_distribution_record.id
     * 
     */
    private Long id;

    /**
     * 客户经理id -- product_distribution_record.customer_manager_id
     * 
     */
    private Long customerManagerId;

    /**
     * 所属部门id -- product_distribution_record.org_id
     * 
     */
    private Long orgId;

    /**
     * 产品id -- product_distribution_record.product_id
     * 
     */
    private String productId;

    /**
     * 分配时间 -- product_distribution_record.distribution_time
     * 
     */
    private Date distributionTime;

    /**
     * 操作人 -- product_distribution_record.oper_user_id
     * 
     */
    private Long operUserId;

    /**
     * product_distribution_record表的操作属性:serialVersionUID
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 product_distribution_record.id的get方法 
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 数据字段 product_distribution_record.id的set方法
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 数据字段 product_distribution_record.customer_manager_id的get方法 
     * 
     */
    public Long getCustomerManagerId() {
        return customerManagerId;
    }

    /**
     * 数据字段 product_distribution_record.customer_manager_id的set方法
     * 
     */
    public void setCustomerManagerId(Long customerManagerId) {
        this.customerManagerId = customerManagerId;
    }

    /**
     * 数据字段 product_distribution_record.org_id的get方法 
     * 
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * 数据字段 product_distribution_record.org_id的set方法
     * 
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 数据字段 product_distribution_record.product_id的get方法 
     * 
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 数据字段 product_distribution_record.product_id的set方法
     * 
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * 数据字段 product_distribution_record.distribution_time的get方法 
     * 
     */
    public Date getDistributionTime() {
        return distributionTime;
    }

    /**
     * 数据字段 product_distribution_record.distribution_time的set方法
     * 
     */
    public void setDistributionTime(Date distributionTime) {
        this.distributionTime = distributionTime;
    }

    /**
     * 数据字段 product_distribution_record.oper_user_id的get方法 
     * 
     */
    public Long getOperUserId() {
        return operUserId;
    }

    /**
     * 数据字段 product_distribution_record.oper_user_id的set方法
     * 
     */
    public void setOperUserId(Long operUserId) {
        this.operUserId = operUserId;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}