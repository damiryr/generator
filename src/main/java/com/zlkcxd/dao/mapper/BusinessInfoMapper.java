package com.zlkcxd.dao.mapper;

import com.zlkcxd.dao.domain.BusinessInfo;
import com.zlkcxd.dao.domain.BusinessInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessInfoMapper {
    /**
     * business_info数据表的操作方法: countByExample  
     * 
     */
    int countByExample(BusinessInfoCriteria example);

    /**
     * business_info数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(BusinessInfoCriteria example);

    /**
     * business_info数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * business_info数据表的操作方法: insert  
     * 
     */
    int insert(BusinessInfo record);

    /**
     * business_info数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(BusinessInfo record);

    /**
     * business_info数据表的操作方法: selectByExample  
     * 
     */
    List<BusinessInfo> selectByExample(BusinessInfoCriteria example);

    /**
     * business_info数据表的操作方法: selectByPrimaryKey  
     * 
     */
    BusinessInfo selectByPrimaryKey(Long id);

    /**
     * business_info数据表的操作方法: lockByPrimaryKey  
     * 
     */
    BusinessInfo lockByPrimaryKey(Long id);

    /**
     * business_info数据表的操作方法: lockByExample  
     * 
     */
    BusinessInfo lockByExample(BusinessInfoCriteria example);

    /**
     * business_info数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * business_info数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") BusinessInfo record, @Param("example") BusinessInfoCriteria example);

    /**
     * business_info数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") BusinessInfo record, @Param("example") BusinessInfoCriteria example);

    /**
     * business_info数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(BusinessInfo record);

    /**
     * business_info数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(BusinessInfo record);
}