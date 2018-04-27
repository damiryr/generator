package com.zlkcxd.dao.mapper;

import com.zlkcxd.dao.domain.CustomerRecords;
import com.zlkcxd.dao.domain.CustomerRecordsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerRecordsMapper {
    /**
     * customer_records数据表的操作方法: countByExample  
     * 
     */
    int countByExample(CustomerRecordsCriteria example);

    /**
     * customer_records数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(CustomerRecordsCriteria example);

    /**
     * customer_records数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * customer_records数据表的操作方法: insert  
     * 
     */
    int insert(CustomerRecords record);

    /**
     * customer_records数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(CustomerRecords record);

    /**
     * customer_records数据表的操作方法: selectByExample  
     * 
     */
    List<CustomerRecords> selectByExample(CustomerRecordsCriteria example);

    /**
     * customer_records数据表的操作方法: selectByPrimaryKey  
     * 
     */
    CustomerRecords selectByPrimaryKey(Long id);

    /**
     * customer_records数据表的操作方法: lockByPrimaryKey  
     * 
     */
    CustomerRecords lockByPrimaryKey(Long id);

    /**
     * customer_records数据表的操作方法: lockByExample  
     * 
     */
    CustomerRecords lockByExample(CustomerRecordsCriteria example);

    /**
     * customer_records数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * customer_records数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") CustomerRecords record, @Param("example") CustomerRecordsCriteria example);

    /**
     * customer_records数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") CustomerRecords record, @Param("example") CustomerRecordsCriteria example);

    /**
     * customer_records数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(CustomerRecords record);

    /**
     * customer_records数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(CustomerRecords record);
}