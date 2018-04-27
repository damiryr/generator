package com.zlkcxd.dao.mapper;

import com.zlkcxd.dao.domain.MessageProcess;
import com.zlkcxd.dao.domain.MessageProcessCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageProcessMapper {
    /**
     * message_process数据表的操作方法: countByExample  
     * 
     */
    int countByExample(MessageProcessCriteria example);

    /**
     * message_process数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(MessageProcessCriteria example);

    /**
     * message_process数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * message_process数据表的操作方法: insert  
     * 
     */
    int insert(MessageProcess record);

    /**
     * message_process数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(MessageProcess record);

    /**
     * message_process数据表的操作方法: selectByExample  
     * 
     */
    List<MessageProcess> selectByExample(MessageProcessCriteria example);

    /**
     * message_process数据表的操作方法: selectByPrimaryKey  
     * 
     */
    MessageProcess selectByPrimaryKey(Long id);

    /**
     * message_process数据表的操作方法: lockByPrimaryKey  
     * 
     */
    MessageProcess lockByPrimaryKey(Long id);

    /**
     * message_process数据表的操作方法: lockByExample  
     * 
     */
    MessageProcess lockByExample(MessageProcessCriteria example);

    /**
     * message_process数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * message_process数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") MessageProcess record, @Param("example") MessageProcessCriteria example);

    /**
     * message_process数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") MessageProcess record, @Param("example") MessageProcessCriteria example);

    /**
     * message_process数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(MessageProcess record);

    /**
     * message_process数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(MessageProcess record);
}