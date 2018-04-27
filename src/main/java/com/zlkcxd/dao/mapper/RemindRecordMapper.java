package com.zlkcxd.dao.mapper;

import com.zlkcxd.dao.domain.RemindRecord;
import com.zlkcxd.dao.domain.RemindRecordCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RemindRecordMapper {
    /**
     * remind_record数据表的操作方法: countByExample  
     * 
     */
    int countByExample(RemindRecordCriteria example);

    /**
     * remind_record数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(RemindRecordCriteria example);

    /**
     * remind_record数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * remind_record数据表的操作方法: insert  
     * 
     */
    int insert(RemindRecord record);

    /**
     * remind_record数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(RemindRecord record);

    /**
     * remind_record数据表的操作方法: selectByExample  
     * 
     */
    List<RemindRecord> selectByExample(RemindRecordCriteria example);

    /**
     * remind_record数据表的操作方法: selectByPrimaryKey  
     * 
     */
    RemindRecord selectByPrimaryKey(Long id);

    /**
     * remind_record数据表的操作方法: lockByPrimaryKey  
     * 
     */
    RemindRecord lockByPrimaryKey(Long id);

    /**
     * remind_record数据表的操作方法: lockByExample  
     * 
     */
    RemindRecord lockByExample(RemindRecordCriteria example);

    /**
     * remind_record数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * remind_record数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") RemindRecord record, @Param("example") RemindRecordCriteria example);

    /**
     * remind_record数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") RemindRecord record, @Param("example") RemindRecordCriteria example);

    /**
     * remind_record数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(RemindRecord record);

    /**
     * remind_record数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(RemindRecord record);
}