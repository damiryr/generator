package com.zlkcxd.dao.mapper;

import com.zlkcxd.dao.domain.CustomerInfoUpdateRecord;
import com.zlkcxd.dao.domain.CustomerInfoUpdateRecordCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerInfoUpdateRecordMapper {
    /**
     * customer_info_update_record数据表的操作方法: countByExample  
     * 
     */
    int countByExample(CustomerInfoUpdateRecordCriteria example);

    /**
     * customer_info_update_record数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(CustomerInfoUpdateRecordCriteria example);

    /**
     * customer_info_update_record数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * customer_info_update_record数据表的操作方法: insert  
     * 
     */
    int insert(CustomerInfoUpdateRecord record);

    /**
     * customer_info_update_record数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(CustomerInfoUpdateRecord record);

    /**
     * customer_info_update_record数据表的操作方法: selectByExample  
     * 
     */
    List<CustomerInfoUpdateRecord> selectByExample(CustomerInfoUpdateRecordCriteria example);

    /**
     * customer_info_update_record数据表的操作方法: selectByPrimaryKey  
     * 
     */
    CustomerInfoUpdateRecord selectByPrimaryKey(Long id);

    /**
     * customer_info_update_record数据表的操作方法: lockByPrimaryKey  
     * 
     */
    CustomerInfoUpdateRecord lockByPrimaryKey(Long id);

    /**
     * customer_info_update_record数据表的操作方法: lockByExample  
     * 
     */
    CustomerInfoUpdateRecord lockByExample(CustomerInfoUpdateRecordCriteria example);

    /**
     * customer_info_update_record数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * customer_info_update_record数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") CustomerInfoUpdateRecord record, @Param("example") CustomerInfoUpdateRecordCriteria example);

    /**
     * customer_info_update_record数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") CustomerInfoUpdateRecord record, @Param("example") CustomerInfoUpdateRecordCriteria example);

    /**
     * customer_info_update_record数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(CustomerInfoUpdateRecord record);

    /**
     * customer_info_update_record数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(CustomerInfoUpdateRecord record);
}