package com.zlkcxd.dao.mapper;

import com.zlkcxd.dao.domain.Blacklist;
import com.zlkcxd.dao.domain.BlacklistCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlacklistMapper {
    /**
     * blacklist数据表的操作方法: countByExample  
     * 
     */
    int countByExample(BlacklistCriteria example);

    /**
     * blacklist数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(BlacklistCriteria example);

    /**
     * blacklist数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * blacklist数据表的操作方法: insert  
     * 
     */
    int insert(Blacklist record);

    /**
     * blacklist数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(Blacklist record);

    /**
     * blacklist数据表的操作方法: selectByExample  
     * 
     */
    List<Blacklist> selectByExample(BlacklistCriteria example);

    /**
     * blacklist数据表的操作方法: selectByPrimaryKey  
     * 
     */
    Blacklist selectByPrimaryKey(Long id);

    /**
     * blacklist数据表的操作方法: lockByPrimaryKey  
     * 
     */
    Blacklist lockByPrimaryKey(Long id);

    /**
     * blacklist数据表的操作方法: lockByExample  
     * 
     */
    Blacklist lockByExample(BlacklistCriteria example);

    /**
     * blacklist数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * blacklist数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") Blacklist record, @Param("example") BlacklistCriteria example);

    /**
     * blacklist数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") Blacklist record, @Param("example") BlacklistCriteria example);

    /**
     * blacklist数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(Blacklist record);

    /**
     * blacklist数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(Blacklist record);
}