package com.zlkcxd.dao.mapper;

import com.zlkcxd.dao.domain.CustomerCreditScoreInfo;
import com.zlkcxd.dao.domain.CustomerCreditScoreInfoCriteria;
import com.zlkcxd.dao.domain.CustomerCreditScoreInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerCreditScoreInfoMapper {
    /**
     * customer_credit_score_info数据表的操作方法: countByExample  
     * 
     */
    int countByExample(CustomerCreditScoreInfoCriteria example);

    /**
     * customer_credit_score_info数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(CustomerCreditScoreInfoCriteria example);

    /**
     * customer_credit_score_info数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * customer_credit_score_info数据表的操作方法: insert  
     * 
     */
    int insert(CustomerCreditScoreInfoWithBLOBs record);

    /**
     * customer_credit_score_info数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(CustomerCreditScoreInfoWithBLOBs record);

    /**
     * customer_credit_score_info数据表的操作方法: selectByExampleWithBLOBs  
     * 
     */
    List<CustomerCreditScoreInfoWithBLOBs> selectByExampleWithBLOBs(CustomerCreditScoreInfoCriteria example);

    /**
     * customer_credit_score_info数据表的操作方法: selectByExample  
     * 
     */
    List<CustomerCreditScoreInfo> selectByExample(CustomerCreditScoreInfoCriteria example);

    /**
     * customer_credit_score_info数据表的操作方法: selectByPrimaryKey  
     * 
     */
    CustomerCreditScoreInfoWithBLOBs selectByPrimaryKey(Long id);

    /**
     * customer_credit_score_info数据表的操作方法: lockByPrimaryKey  
     * 
     */
    CustomerCreditScoreInfoWithBLOBs lockByPrimaryKey(Long id);

    /**
     * customer_credit_score_info数据表的操作方法: lockByExample  
     * 
     */
    CustomerCreditScoreInfoWithBLOBs lockByExample(CustomerCreditScoreInfoCriteria example);

    /**
     * customer_credit_score_info数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * customer_credit_score_info数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") CustomerCreditScoreInfoWithBLOBs record, @Param("example") CustomerCreditScoreInfoCriteria example);

    /**
     * customer_credit_score_info数据表的操作方法: updateByExampleWithBLOBs  
     * 
     */
    int updateByExampleWithBLOBs(@Param("record") CustomerCreditScoreInfoWithBLOBs record, @Param("example") CustomerCreditScoreInfoCriteria example);

    /**
     * customer_credit_score_info数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") CustomerCreditScoreInfo record, @Param("example") CustomerCreditScoreInfoCriteria example);

    /**
     * customer_credit_score_info数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(CustomerCreditScoreInfoWithBLOBs record);

    /**
     * customer_credit_score_info数据表的操作方法: updateByPrimaryKeyWithBLOBs  
     * 
     */
    int updateByPrimaryKeyWithBLOBs(CustomerCreditScoreInfoWithBLOBs record);

    /**
     * customer_credit_score_info数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(CustomerCreditScoreInfo record);
}