package com.zlkcxd.dao.domain;

import java.io.Serializable;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LmjOrderInfo implements Serializable {
    /**
     * 主键 -- lmj_order_info.id
     * 
     */
    private Long id;

    /**
     * 贷款Id -- lmj_order_info.loan_id
     * 
     */
    private Long loanId;

    /**
     * 商品信息(json格式) -- lmj_order_info.goods_info
     * 
     */
    private String goodsInfo;

    /**
     * 收货人 -- lmj_order_info.consignee
     * 
     */
    private String consignee;

    /**
     * 收货人地址 -- lmj_order_info.consignee_address
     * 
     */
    private String consigneeAddress;

    /**
     * lmj_order_info表的操作属性:serialVersionUID
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 lmj_order_info.id的get方法 
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 数据字段 lmj_order_info.id的set方法
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 数据字段 lmj_order_info.loan_id的get方法 
     * 
     */
    public Long getLoanId() {
        return loanId;
    }

    /**
     * 数据字段 lmj_order_info.loan_id的set方法
     * 
     */
    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    /**
     * 数据字段 lmj_order_info.goods_info的get方法 
     * 
     */
    public String getGoodsInfo() {
        return goodsInfo;
    }

    /**
     * 数据字段 lmj_order_info.goods_info的set方法
     * 
     */
    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo == null ? null : goodsInfo.trim();
    }

    /**
     * 数据字段 lmj_order_info.consignee的get方法 
     * 
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * 数据字段 lmj_order_info.consignee的set方法
     * 
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    /**
     * 数据字段 lmj_order_info.consignee_address的get方法 
     * 
     */
    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    /**
     * 数据字段 lmj_order_info.consignee_address的set方法
     * 
     */
    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress == null ? null : consigneeAddress.trim();
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}