package com.zlkcxd.capital.dao.mapper;

import com.zlkcxd.capital.dao.domain.InvestProject;
import com.zlkcxd.capital.dao.domain.InvestProjectCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvestProjectMapper {
    /**
     * invest_project数据表的操作方法: countByExample  
     * 
     */
    int countByExample(InvestProjectCriteria example);

    /**
     * invest_project数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(InvestProjectCriteria example);

    /**
     * invest_project数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * invest_project数据表的操作方法: insert  
     * 
     */
    int insert(InvestProject record);

    /**
     * invest_project数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(InvestProject record);

    /**
     * invest_project数据表的操作方法: selectByExample  
     * 
     */
    List<InvestProject> selectByExample(InvestProjectCriteria example);

    /**
     * invest_project数据表的操作方法: selectByPrimaryKey  
     * 
     */
    InvestProject selectByPrimaryKey(Long id);

    /**
     * invest_project数据表的操作方法: lockByPrimaryKey  
     * 
     */
    InvestProject lockByPrimaryKey(Long id);

    /**
     * invest_project数据表的操作方法: lockByExample  
     * 
     */
    InvestProject lockByExample(InvestProjectCriteria example);

    /**
     * invest_project数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * invest_project数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") InvestProject record, @Param("example") InvestProjectCriteria example);

    /**
     * invest_project数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") InvestProject record, @Param("example") InvestProjectCriteria example);

    /**
     * invest_project数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(InvestProject record);

    /**
     * invest_project数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(InvestProject record);
}