package com.zlkcxd.dao.mapper;

import com.zlkcxd.dao.domain.ProductDistributionRecord;
import com.zlkcxd.dao.domain.ProductDistributionRecordCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductDistributionRecordMapper {
    /**
     * product_distribution_record数据表的操作方法: countByExample  
     * 
     */
    int countByExample(ProductDistributionRecordCriteria example);

    /**
     * product_distribution_record数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(ProductDistributionRecordCriteria example);

    /**
     * product_distribution_record数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * product_distribution_record数据表的操作方法: insert  
     * 
     */
    int insert(ProductDistributionRecord record);

    /**
     * product_distribution_record数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(ProductDistributionRecord record);

    /**
     * product_distribution_record数据表的操作方法: selectByExample  
     * 
     */
    List<ProductDistributionRecord> selectByExample(ProductDistributionRecordCriteria example);

    /**
     * product_distribution_record数据表的操作方法: selectByPrimaryKey  
     * 
     */
    ProductDistributionRecord selectByPrimaryKey(Long id);

    /**
     * product_distribution_record数据表的操作方法: lockByPrimaryKey  
     * 
     */
    ProductDistributionRecord lockByPrimaryKey(Long id);

    /**
     * product_distribution_record数据表的操作方法: lockByExample  
     * 
     */
    ProductDistributionRecord lockByExample(ProductDistributionRecordCriteria example);

    /**
     * product_distribution_record数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * product_distribution_record数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") ProductDistributionRecord record, @Param("example") ProductDistributionRecordCriteria example);

    /**
     * product_distribution_record数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") ProductDistributionRecord record, @Param("example") ProductDistributionRecordCriteria example);

    /**
     * product_distribution_record数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(ProductDistributionRecord record);

    /**
     * product_distribution_record数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(ProductDistributionRecord record);
}