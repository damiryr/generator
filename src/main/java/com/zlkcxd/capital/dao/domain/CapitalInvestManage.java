package com.zlkcxd.capital.dao.domain;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CapitalInvestManage implements Serializable {
    /**
     * 主键,自动增长 -- capital_invest_manage.id
     * 
     */
    private Long id;

    /**
     * 投资方名称 -- capital_invest_manage.customer_name
     * 
     */
    private String customerName;

    /**
     * 联系人 -- capital_invest_manage.first_contact_person
     * 
     */
    private String firstContactPerson;

    /**
     * 联系方式 -- capital_invest_manage.first_contact_number
     * 
     */
    private String firstContactNumber;

    /**
     * 通讯地址 -- capital_invest_manage.contact_address
     * 
     */
    private String contactAddress;

    /**
     * 用途 -- capital_invest_manage.purpose
     * 
     */
    private String purpose;

    /**
     * 业务经办人 -- capital_invest_manage.operate_user
     * 
     */
    private Long operateUser;

    /**
     * 开户银行 -- capital_invest_manage.bank_name
     * 
     */
    private String bankName;

    /**
     * 银行支行名称 -- capital_invest_manage.branch_bank_name
     * 
     */
    private String branchBankName;

    /**
     * 银行账号 -- capital_invest_manage.bank_card_no
     * 
     */
    private String bankCardNo;

    /**
     * 备用字段 -- capital_invest_manage.remark_info
     * 
     */
    private String remarkInfo;

    /**
     * 创建时间 -- capital_invest_manage.create_time
     * 
     */
    private Date createTime;

    /**
     * 删除标记（1：正常、0：删除） -- capital_invest_manage.is_delete
     * 
     */
    private Integer isDelete;

    /**
     * 更新时间 -- capital_invest_manage.update_time
     * 
     */
    private Date updateTime;

    /**
     * 省份 -- capital_invest_manage.province
     * 
     */
    private String province;

    /**
     * 市 -- capital_invest_manage.city
     * 
     */
    private String city;

    /**
     * 县 -- capital_invest_manage.country
     * 
     */
    private String country;

    /**
     * capital_invest_manage表的操作属性:serialVersionUID
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 capital_invest_manage.id的get方法 
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 数据字段 capital_invest_manage.id的set方法
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 数据字段 capital_invest_manage.customer_name的get方法 
     * 
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 数据字段 capital_invest_manage.customer_name的set方法
     * 
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    /**
     * 数据字段 capital_invest_manage.first_contact_person的get方法 
     * 
     */
    public String getFirstContactPerson() {
        return firstContactPerson;
    }

    /**
     * 数据字段 capital_invest_manage.first_contact_person的set方法
     * 
     */
    public void setFirstContactPerson(String firstContactPerson) {
        this.firstContactPerson = firstContactPerson == null ? null : firstContactPerson.trim();
    }

    /**
     * 数据字段 capital_invest_manage.first_contact_number的get方法 
     * 
     */
    public String getFirstContactNumber() {
        return firstContactNumber;
    }

    /**
     * 数据字段 capital_invest_manage.first_contact_number的set方法
     * 
     */
    public void setFirstContactNumber(String firstContactNumber) {
        this.firstContactNumber = firstContactNumber == null ? null : firstContactNumber.trim();
    }

    /**
     * 数据字段 capital_invest_manage.contact_address的get方法 
     * 
     */
    public String getContactAddress() {
        return contactAddress;
    }

    /**
     * 数据字段 capital_invest_manage.contact_address的set方法
     * 
     */
    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    /**
     * 数据字段 capital_invest_manage.purpose的get方法 
     * 
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * 数据字段 capital_invest_manage.purpose的set方法
     * 
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    /**
     * 数据字段 capital_invest_manage.operate_user的get方法 
     * 
     */
    public Long getOperateUser() {
        return operateUser;
    }

    /**
     * 数据字段 capital_invest_manage.operate_user的set方法
     * 
     */
    public void setOperateUser(Long operateUser) {
        this.operateUser = operateUser;
    }

    /**
     * 数据字段 capital_invest_manage.bank_name的get方法 
     * 
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 数据字段 capital_invest_manage.bank_name的set方法
     * 
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * 数据字段 capital_invest_manage.branch_bank_name的get方法 
     * 
     */
    public String getBranchBankName() {
        return branchBankName;
    }

    /**
     * 数据字段 capital_invest_manage.branch_bank_name的set方法
     * 
     */
    public void setBranchBankName(String branchBankName) {
        this.branchBankName = branchBankName == null ? null : branchBankName.trim();
    }

    /**
     * 数据字段 capital_invest_manage.bank_card_no的get方法 
     * 
     */
    public String getBankCardNo() {
        return bankCardNo;
    }

    /**
     * 数据字段 capital_invest_manage.bank_card_no的set方法
     * 
     */
    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo == null ? null : bankCardNo.trim();
    }

    /**
     * 数据字段 capital_invest_manage.remark_info的get方法 
     * 
     */
    public String getRemarkInfo() {
        return remarkInfo;
    }

    /**
     * 数据字段 capital_invest_manage.remark_info的set方法
     * 
     */
    public void setRemarkInfo(String remarkInfo) {
        this.remarkInfo = remarkInfo == null ? null : remarkInfo.trim();
    }

    /**
     * 数据字段 capital_invest_manage.create_time的get方法 
     * 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 数据字段 capital_invest_manage.create_time的set方法
     * 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 数据字段 capital_invest_manage.is_delete的get方法 
     * 
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 数据字段 capital_invest_manage.is_delete的set方法
     * 
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 数据字段 capital_invest_manage.update_time的get方法 
     * 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 数据字段 capital_invest_manage.update_time的set方法
     * 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 数据字段 capital_invest_manage.province的get方法 
     * 
     */
    public String getProvince() {
        return province;
    }

    /**
     * 数据字段 capital_invest_manage.province的set方法
     * 
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 数据字段 capital_invest_manage.city的get方法 
     * 
     */
    public String getCity() {
        return city;
    }

    /**
     * 数据字段 capital_invest_manage.city的set方法
     * 
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 数据字段 capital_invest_manage.country的get方法 
     * 
     */
    public String getCountry() {
        return country;
    }

    /**
     * 数据字段 capital_invest_manage.country的set方法
     * 
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}