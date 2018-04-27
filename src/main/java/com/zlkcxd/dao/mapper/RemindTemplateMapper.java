package com.zlkcxd.dao.mapper;

import com.zlkcxd.dao.domain.RemindTemplate;
import com.zlkcxd.dao.domain.RemindTemplateCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RemindTemplateMapper {
    /**
     * remind_template数据表的操作方法: countByExample  
     * 
     */
    int countByExample(RemindTemplateCriteria example);

    /**
     * remind_template数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(RemindTemplateCriteria example);

    /**
     * remind_template数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * remind_template数据表的操作方法: insert  
     * 
     */
    int insert(RemindTemplate record);

    /**
     * remind_template数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(RemindTemplate record);

    /**
     * remind_template数据表的操作方法: selectByExample  
     * 
     */
    List<RemindTemplate> selectByExample(RemindTemplateCriteria example);

    /**
     * remind_template数据表的操作方法: selectByPrimaryKey  
     * 
     */
    RemindTemplate selectByPrimaryKey(Long id);

    /**
     * remind_template数据表的操作方法: lockByPrimaryKey  
     * 
     */
    RemindTemplate lockByPrimaryKey(Long id);

    /**
     * remind_template数据表的操作方法: lockByExample  
     * 
     */
    RemindTemplate lockByExample(RemindTemplateCriteria example);

    /**
     * remind_template数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * remind_template数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") RemindTemplate record, @Param("example") RemindTemplateCriteria example);

    /**
     * remind_template数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") RemindTemplate record, @Param("example") RemindTemplateCriteria example);

    /**
     * remind_template数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(RemindTemplate record);

    /**
     * remind_template数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(RemindTemplate record);
}