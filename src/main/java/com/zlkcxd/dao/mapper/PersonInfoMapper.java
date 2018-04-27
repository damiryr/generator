package com.zlkcxd.dao.mapper;

import com.zlkcxd.dao.domain.PersonInfo;
import com.zlkcxd.dao.domain.PersonInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonInfoMapper {
    /**
     * person_info数据表的操作方法: countByExample  
     * 
     */
    int countByExample(PersonInfoCriteria example);

    /**
     * person_info数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(PersonInfoCriteria example);

    /**
     * person_info数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * person_info数据表的操作方法: insert  
     * 
     */
    int insert(PersonInfo record);

    /**
     * person_info数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(PersonInfo record);

    /**
     * person_info数据表的操作方法: selectByExample  
     * 
     */
    List<PersonInfo> selectByExample(PersonInfoCriteria example);

    /**
     * person_info数据表的操作方法: selectByPrimaryKey  
     * 
     */
    PersonInfo selectByPrimaryKey(Long id);

    /**
     * person_info数据表的操作方法: lockByPrimaryKey  
     * 
     */
    PersonInfo lockByPrimaryKey(Long id);

    /**
     * person_info数据表的操作方法: lockByExample  
     * 
     */
    PersonInfo lockByExample(PersonInfoCriteria example);

    /**
     * person_info数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * person_info数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") PersonInfo record, @Param("example") PersonInfoCriteria example);

    /**
     * person_info数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") PersonInfo record, @Param("example") PersonInfoCriteria example);

    /**
     * person_info数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(PersonInfo record);

    /**
     * person_info数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(PersonInfo record);
}