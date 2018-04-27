package com.zlkcxd.dao.mapper;

import com.zlkcxd.dao.domain.WorkflowGroup;
import com.zlkcxd.dao.domain.WorkflowGroupCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkflowGroupMapper {
    /**
     * workflow_group数据表的操作方法: countByExample  
     * 
     */
    int countByExample(WorkflowGroupCriteria example);

    /**
     * workflow_group数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(WorkflowGroupCriteria example);

    /**
     * workflow_group数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * workflow_group数据表的操作方法: insert  
     * 
     */
    int insert(WorkflowGroup record);

    /**
     * workflow_group数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(WorkflowGroup record);

    /**
     * workflow_group数据表的操作方法: selectByExample  
     * 
     */
    List<WorkflowGroup> selectByExample(WorkflowGroupCriteria example);

    /**
     * workflow_group数据表的操作方法: selectByPrimaryKey  
     * 
     */
    WorkflowGroup selectByPrimaryKey(Long id);

    /**
     * workflow_group数据表的操作方法: lockByPrimaryKey  
     * 
     */
    WorkflowGroup lockByPrimaryKey(Long id);

    /**
     * workflow_group数据表的操作方法: lockByExample  
     * 
     */
    WorkflowGroup lockByExample(WorkflowGroupCriteria example);

    /**
     * workflow_group数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * workflow_group数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") WorkflowGroup record, @Param("example") WorkflowGroupCriteria example);

    /**
     * workflow_group数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") WorkflowGroup record, @Param("example") WorkflowGroupCriteria example);

    /**
     * workflow_group数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(WorkflowGroup record);

    /**
     * workflow_group数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(WorkflowGroup record);
}