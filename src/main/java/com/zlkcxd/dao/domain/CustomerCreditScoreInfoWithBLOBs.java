package com.zlkcxd.dao.domain;

import java.io.Serializable;

public class CustomerCreditScoreInfoWithBLOBs extends CustomerCreditScoreInfo implements Serializable {
    /**
     * 电商认证数据 -- customer_credit_score_info.ds_cert_data
     * 
     */
    private String dsCertData;

    /**
     * 运营商认证数据 -- customer_credit_score_info.yys_cert_data
     * 
     */
    private String yysCertData;

    /**
     * customer_credit_score_info表的操作属性:serialVersionUID
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 customer_credit_score_info.ds_cert_data的get方法 
     * 
     */
    public String getDsCertData() {
        return dsCertData;
    }

    /**
     * 数据字段 customer_credit_score_info.ds_cert_data的set方法
     * 
     */
    public void setDsCertData(String dsCertData) {
        this.dsCertData = dsCertData == null ? null : dsCertData.trim();
    }

    /**
     * 数据字段 customer_credit_score_info.yys_cert_data的get方法 
     * 
     */
    public String getYysCertData() {
        return yysCertData;
    }

    /**
     * 数据字段 customer_credit_score_info.yys_cert_data的set方法
     * 
     */
    public void setYysCertData(String yysCertData) {
        this.yysCertData = yysCertData == null ? null : yysCertData.trim();
    }
}