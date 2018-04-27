package com.zlkcxd.dao.mapper;

import com.zlkcxd.dao.domain.OperationLog;
import com.zlkcxd.dao.domain.OperationLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperationLogMapper {
    /**
     * s_operation_log数据表的操作方法: countByExample  
     * 
     */
    int countByExample(OperationLogCriteria example);

    /**
     * s_operation_log数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(OperationLogCriteria example);

    /**
     * s_operation_log数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * s_operation_log数据表的操作方法: insert  
     * 
     */
    int insert(OperationLog record);

    /**
     * s_operation_log数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(OperationLog record);

    /**
     * s_operation_log数据表的操作方法: selectByExample  
     * 
     */
    List<OperationLog> selectByExample(OperationLogCriteria example);

    /**
     * s_operation_log数据表的操作方法: selectByPrimaryKey  
     * 
     */
    OperationLog selectByPrimaryKey(Long id);

    /**
     * s_operation_log数据表的操作方法: lockByPrimaryKey  
     * 
     */
    OperationLog lockByPrimaryKey(Long id);

    /**
     * s_operation_log数据表的操作方法: lockByExample  
     * 
     */
    OperationLog lockByExample(OperationLogCriteria example);

    /**
     * s_operation_log数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * s_operation_log数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") OperationLog record, @Param("example") OperationLogCriteria example);

    /**
     * s_operation_log数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") OperationLog record, @Param("example") OperationLogCriteria example);

    /**
     * s_operation_log数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(OperationLog record);

    /**
     * s_operation_log数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(OperationLog record);
}