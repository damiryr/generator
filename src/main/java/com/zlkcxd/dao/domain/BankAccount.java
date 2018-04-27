package com.zlkcxd.dao.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BankAccount implements Serializable {
    /**
     * 主键 -- bank_account.id
     * 
     */
    private Long id;

    /**
     * 创建时间 -- bank_account.create_time
     * 
     */
    private Date createTime;

    /**
     * 更新时间 -- bank_account.update_time
     * 
     */
    private Date updateTime;

    /**
     * 银行名称 -- bank_account.bank_name
     * 
     */
    private String bankName;

    /**
     *  支行 -- bank_account.branch
     * 
     */
    private String branch;

    /**
     * 银行类别 -- bank_account.bank_type
     * 
     */
    private String bankType;

    /**
     * 银行账号 -- bank_account.bank_account
     * 
     */
    private String bankAccount;

    /**
     * 初始化余额 -- bank_account.initialization_balance
     * 
     */
    private BigDecimal initializationBalance;

    /**
     * 开户日期 -- bank_account.open_date
     * 
     */
    private Date openDate;

    /**
     * 期末结账判断 -- bank_account.end_bill_judgment
     * 
     */
    private String endBillJudgment;

    /**
     * 销户日期 -- bank_account.delete_date
     * 
     */
    private Date deleteDate;

    /**
     * 账户编号 -- bank_account.account_number
     * 
     */
    private String accountNumber;

    /**
     * 银行官网 -- bank_account.bank_official_web
     * 
     */
    private String bankOfficialWeb;

    /**
     * 银行所属 -- bank_account.account_belongs
     * 
     */
    private String accountBelongs;

    /**
     * 账户使用者 -- bank_account.account_user
     * 
     */
    private String accountUser;

    /**
     * 备注 -- bank_account.remarks
     * 
     */
    private String remarks;

    /**
     * 1-正常 2-禁用 -- bank_account.status
     * 
     */
    private String status;

    /**
     * 下级辅助核算 -- bank_account.subordinate_acc_accounting
     * 
     */
    private BigDecimal subordinateAccAccounting;

    /**
     * 会记账户 -- bank_account.will_account
     * 
     */
    private String willAccount;

    /**
     * 是否银企直连 1-是 2-否 -- bank_account.direct_account
     * 
     */
    private Integer directAccount;

    /**
     * bank_account表的操作属性:serialVersionUID
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 bank_account.id的get方法 
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 数据字段 bank_account.id的set方法
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 数据字段 bank_account.create_time的get方法 
     * 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 数据字段 bank_account.create_time的set方法
     * 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 数据字段 bank_account.update_time的get方法 
     * 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 数据字段 bank_account.update_time的set方法
     * 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 数据字段 bank_account.bank_name的get方法 
     * 
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 数据字段 bank_account.bank_name的set方法
     * 
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * 数据字段 bank_account.branch的get方法 
     * 
     */
    public String getBranch() {
        return branch;
    }

    /**
     * 数据字段 bank_account.branch的set方法
     * 
     */
    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    /**
     * 数据字段 bank_account.bank_type的get方法 
     * 
     */
    public String getBankType() {
        return bankType;
    }

    /**
     * 数据字段 bank_account.bank_type的set方法
     * 
     */
    public void setBankType(String bankType) {
        this.bankType = bankType == null ? null : bankType.trim();
    }

    /**
     * 数据字段 bank_account.bank_account的get方法 
     * 
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * 数据字段 bank_account.bank_account的set方法
     * 
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    /**
     * 数据字段 bank_account.initialization_balance的get方法 
     * 
     */
    public BigDecimal getInitializationBalance() {
        return initializationBalance;
    }

    /**
     * 数据字段 bank_account.initialization_balance的set方法
     * 
     */
    public void setInitializationBalance(BigDecimal initializationBalance) {
        this.initializationBalance = initializationBalance;
    }

    /**
     * 数据字段 bank_account.open_date的get方法 
     * 
     */
    public Date getOpenDate() {
        return openDate;
    }

    /**
     * 数据字段 bank_account.open_date的set方法
     * 
     */
    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    /**
     * 数据字段 bank_account.end_bill_judgment的get方法 
     * 
     */
    public String getEndBillJudgment() {
        return endBillJudgment;
    }

    /**
     * 数据字段 bank_account.end_bill_judgment的set方法
     * 
     */
    public void setEndBillJudgment(String endBillJudgment) {
        this.endBillJudgment = endBillJudgment == null ? null : endBillJudgment.trim();
    }

    /**
     * 数据字段 bank_account.delete_date的get方法 
     * 
     */
    public Date getDeleteDate() {
        return deleteDate;
    }

    /**
     * 数据字段 bank_account.delete_date的set方法
     * 
     */
    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }

    /**
     * 数据字段 bank_account.account_number的get方法 
     * 
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * 数据字段 bank_account.account_number的set方法
     * 
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber == null ? null : accountNumber.trim();
    }

    /**
     * 数据字段 bank_account.bank_official_web的get方法 
     * 
     */
    public String getBankOfficialWeb() {
        return bankOfficialWeb;
    }

    /**
     * 数据字段 bank_account.bank_official_web的set方法
     * 
     */
    public void setBankOfficialWeb(String bankOfficialWeb) {
        this.bankOfficialWeb = bankOfficialWeb == null ? null : bankOfficialWeb.trim();
    }

    /**
     * 数据字段 bank_account.account_belongs的get方法 
     * 
     */
    public String getAccountBelongs() {
        return accountBelongs;
    }

    /**
     * 数据字段 bank_account.account_belongs的set方法
     * 
     */
    public void setAccountBelongs(String accountBelongs) {
        this.accountBelongs = accountBelongs == null ? null : accountBelongs.trim();
    }

    /**
     * 数据字段 bank_account.account_user的get方法 
     * 
     */
    public String getAccountUser() {
        return accountUser;
    }

    /**
     * 数据字段 bank_account.account_user的set方法
     * 
     */
    public void setAccountUser(String accountUser) {
        this.accountUser = accountUser == null ? null : accountUser.trim();
    }

    /**
     * 数据字段 bank_account.remarks的get方法 
     * 
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 数据字段 bank_account.remarks的set方法
     * 
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * 数据字段 bank_account.status的get方法 
     * 
     */
    public String getStatus() {
        return status;
    }

    /**
     * 数据字段 bank_account.status的set方法
     * 
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 数据字段 bank_account.subordinate_acc_accounting的get方法 
     * 
     */
    public BigDecimal getSubordinateAccAccounting() {
        return subordinateAccAccounting;
    }

    /**
     * 数据字段 bank_account.subordinate_acc_accounting的set方法
     * 
     */
    public void setSubordinateAccAccounting(BigDecimal subordinateAccAccounting) {
        this.subordinateAccAccounting = subordinateAccAccounting;
    }

    /**
     * 数据字段 bank_account.will_account的get方法 
     * 
     */
    public String getWillAccount() {
        return willAccount;
    }

    /**
     * 数据字段 bank_account.will_account的set方法
     * 
     */
    public void setWillAccount(String willAccount) {
        this.willAccount = willAccount == null ? null : willAccount.trim();
    }

    /**
     * 数据字段 bank_account.direct_account的get方法 
     * 
     */
    public Integer getDirectAccount() {
        return directAccount;
    }

    /**
     * 数据字段 bank_account.direct_account的set方法
     * 
     */
    public void setDirectAccount(Integer directAccount) {
        this.directAccount = directAccount;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}