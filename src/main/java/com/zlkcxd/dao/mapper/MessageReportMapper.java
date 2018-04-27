package com.zlkcxd.dao.mapper;

import com.zlkcxd.dao.domain.MessageReport;
import com.zlkcxd.dao.domain.MessageReportCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageReportMapper {
    /**
     * message_report数据表的操作方法: countByExample  
     * 
     */
    int countByExample(MessageReportCriteria example);

    /**
     * message_report数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(MessageReportCriteria example);

    /**
     * message_report数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * message_report数据表的操作方法: insert  
     * 
     */
    int insert(MessageReport record);

    /**
     * message_report数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(MessageReport record);

    /**
     * message_report数据表的操作方法: selectByExample  
     * 
     */
    List<MessageReport> selectByExample(MessageReportCriteria example);

    /**
     * message_report数据表的操作方法: selectByPrimaryKey  
     * 
     */
    MessageReport selectByPrimaryKey(Long id);

    /**
     * message_report数据表的操作方法: lockByPrimaryKey  
     * 
     */
    MessageReport lockByPrimaryKey(Long id);

    /**
     * message_report数据表的操作方法: lockByExample  
     * 
     */
    MessageReport lockByExample(MessageReportCriteria example);

    /**
     * message_report数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * message_report数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") MessageReport record, @Param("example") MessageReportCriteria example);

    /**
     * message_report数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") MessageReport record, @Param("example") MessageReportCriteria example);

    /**
     * message_report数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(MessageReport record);

    /**
     * message_report数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(MessageReport record);
}