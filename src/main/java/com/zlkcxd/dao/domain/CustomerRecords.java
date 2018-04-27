package com.zlkcxd.dao.domain;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CustomerRecords implements Serializable {
    /**
     * 自增长主键 -- customer_records.id
     * 
     */
    private Long id;

    /**
     * 记录标记字段（1-正常、0-删除） -- customer_records.status
     * 
     */
    private Integer status;

    /**
     * 创建时间 -- customer_records.create_time
     * 
     */
    private Date createTime;

    /**
     * 修改时间 -- customer_records.update_time
     * 
     */
    private Date updateTime;

    /**
     * 创建人 -- customer_records.creator
     * 
     */
    private String creator;

    /**
     * 更新人 -- customer_records.editor
     * 
     */
    private String editor;

    /**
     * 客户ID（关联customer_info.id字段） -- customer_records.customer_id
     * 
     */
    private Long customerId;

    /**
     * 交往方式
（1-电话、2-实地调查、3-主动上门、4-其他，源于数据字典） -- customer_records.contact_mode
     * 
     */
    private String contactMode;

    /**
     * 交往时间（由客户经理手动输入） -- customer_records.contact_time
     * 
     */
    private Date contactTime;

    /**
     * 目前阶段（1-意向、2-贷前、3-贷中、4-贷后，从数据字典获取） -- customer_records.stage
     * 
     */
    private String stage;

    /**
     * 省（省市区数据字段） -- customer_records.province
     * 
     */
    private String province;

    /**
     * 市（省市区数据字段） -- customer_records.city
     * 
     */
    private String city;

    /**
     * 区（省市区数据字段） -- customer_records.area
     * 
     */
    private String area;

    /**
     * 地址 -- customer_records.address
     * 
     */
    private String address;

    /**
     * 详细信息 -- customer_records.remark
     * 
     */
    private String remark;

    /**
     * customer_records表的操作属性:serialVersionUID
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 customer_records.id的get方法 
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 数据字段 customer_records.id的set方法
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 数据字段 customer_records.status的get方法 
     * 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 数据字段 customer_records.status的set方法
     * 
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 数据字段 customer_records.create_time的get方法 
     * 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 数据字段 customer_records.create_time的set方法
     * 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 数据字段 customer_records.update_time的get方法 
     * 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 数据字段 customer_records.update_time的set方法
     * 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 数据字段 customer_records.creator的get方法 
     * 
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 数据字段 customer_records.creator的set方法
     * 
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 数据字段 customer_records.editor的get方法 
     * 
     */
    public String getEditor() {
        return editor;
    }

    /**
     * 数据字段 customer_records.editor的set方法
     * 
     */
    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    /**
     * 数据字段 customer_records.customer_id的get方法 
     * 
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * 数据字段 customer_records.customer_id的set方法
     * 
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * 数据字段 customer_records.contact_mode的get方法 
     * 
     */
    public String getContactMode() {
        return contactMode;
    }

    /**
     * 数据字段 customer_records.contact_mode的set方法
     * 
     */
    public void setContactMode(String contactMode) {
        this.contactMode = contactMode == null ? null : contactMode.trim();
    }

    /**
     * 数据字段 customer_records.contact_time的get方法 
     * 
     */
    public Date getContactTime() {
        return contactTime;
    }

    /**
     * 数据字段 customer_records.contact_time的set方法
     * 
     */
    public void setContactTime(Date contactTime) {
        this.contactTime = contactTime;
    }

    /**
     * 数据字段 customer_records.stage的get方法 
     * 
     */
    public String getStage() {
        return stage;
    }

    /**
     * 数据字段 customer_records.stage的set方法
     * 
     */
    public void setStage(String stage) {
        this.stage = stage == null ? null : stage.trim();
    }

    /**
     * 数据字段 customer_records.province的get方法 
     * 
     */
    public String getProvince() {
        return province;
    }

    /**
     * 数据字段 customer_records.province的set方法
     * 
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 数据字段 customer_records.city的get方法 
     * 
     */
    public String getCity() {
        return city;
    }

    /**
     * 数据字段 customer_records.city的set方法
     * 
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 数据字段 customer_records.area的get方法 
     * 
     */
    public String getArea() {
        return area;
    }

    /**
     * 数据字段 customer_records.area的set方法
     * 
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * 数据字段 customer_records.address的get方法 
     * 
     */
    public String getAddress() {
        return address;
    }

    /**
     * 数据字段 customer_records.address的set方法
     * 
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 数据字段 customer_records.remark的get方法 
     * 
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 数据字段 customer_records.remark的set方法
     * 
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}