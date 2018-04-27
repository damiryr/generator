package com.zlkcxd.dao.mapper;

import com.zlkcxd.dao.domain.Organization;
import com.zlkcxd.dao.domain.OrganizationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationMapper {
    /**
     * organization数据表的操作方法: countByExample  
     * 
     */
    int countByExample(OrganizationCriteria example);

    /**
     * organization数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(OrganizationCriteria example);

    /**
     * organization数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * organization数据表的操作方法: insert  
     * 
     */
    int insert(Organization record);

    /**
     * organization数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(Organization record);

    /**
     * organization数据表的操作方法: selectByExample  
     * 
     */
    List<Organization> selectByExample(OrganizationCriteria example);

    /**
     * organization数据表的操作方法: selectByPrimaryKey  
     * 
     */
    Organization selectByPrimaryKey(Long id);

    /**
     * organization数据表的操作方法: lockByPrimaryKey  
     * 
     */
    Organization lockByPrimaryKey(Long id);

    /**
     * organization数据表的操作方法: lockByExample  
     * 
     */
    Organization lockByExample(OrganizationCriteria example);

    /**
     * organization数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * organization数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") Organization record, @Param("example") OrganizationCriteria example);

    /**
     * organization数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") Organization record, @Param("example") OrganizationCriteria example);

    /**
     * organization数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(Organization record);

    /**
     * organization数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(Organization record);
}