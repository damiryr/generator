package com.zlkcxd.dao.mapper;

import com.zlkcxd.dao.domain.CustomerAccount;
import com.zlkcxd.dao.domain.CustomerAccountCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerAccountMapper {
    /**
     * customer_account数据表的操作方法: countByExample  
     * 
     */
    int countByExample(CustomerAccountCriteria example);

    /**
     * customer_account数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(CustomerAccountCriteria example);

    /**
     * customer_account数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * customer_account数据表的操作方法: insert  
     * 
     */
    int insert(CustomerAccount record);

    /**
     * customer_account数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(CustomerAccount record);

    /**
     * customer_account数据表的操作方法: selectByExample  
     * 
     */
    List<CustomerAccount> selectByExample(CustomerAccountCriteria example);

    /**
     * customer_account数据表的操作方法: selectByPrimaryKey  
     * 
     */
    CustomerAccount selectByPrimaryKey(Long id);

    /**
     * customer_account数据表的操作方法: lockByPrimaryKey  
     * 
     */
    CustomerAccount lockByPrimaryKey(Long id);

    /**
     * customer_account数据表的操作方法: lockByExample  
     * 
     */
    CustomerAccount lockByExample(CustomerAccountCriteria example);

    /**
     * customer_account数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * customer_account数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") CustomerAccount record, @Param("example") CustomerAccountCriteria example);

    /**
     * customer_account数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") CustomerAccount record, @Param("example") CustomerAccountCriteria example);

    /**
     * customer_account数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(CustomerAccount record);

    /**
     * customer_account数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(CustomerAccount record);
}