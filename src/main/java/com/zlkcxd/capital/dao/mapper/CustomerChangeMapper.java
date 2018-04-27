package com.zlkcxd.capital.dao.mapper;

import com.zlkcxd.capital.dao.domain.CustomerChange;
import com.zlkcxd.capital.dao.domain.CustomerChangeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerChangeMapper {
    /**
     * customer_change数据表的操作方法: countByExample  
     * 
     */
    int countByExample(CustomerChangeCriteria example);

    /**
     * customer_change数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(CustomerChangeCriteria example);

    /**
     * customer_change数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * customer_change数据表的操作方法: insert  
     * 
     */
    int insert(CustomerChange record);

    /**
     * customer_change数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(CustomerChange record);

    /**
     * customer_change数据表的操作方法: selectByExample  
     * 
     */
    List<CustomerChange> selectByExample(CustomerChangeCriteria example);

    /**
     * customer_change数据表的操作方法: selectByPrimaryKey  
     * 
     */
    CustomerChange selectByPrimaryKey(Long id);

    /**
     * customer_change数据表的操作方法: lockByPrimaryKey  
     * 
     */
    CustomerChange lockByPrimaryKey(Long id);

    /**
     * customer_change数据表的操作方法: lockByExample  
     * 
     */
    CustomerChange lockByExample(CustomerChangeCriteria example);

    /**
     * customer_change数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * customer_change数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") CustomerChange record, @Param("example") CustomerChangeCriteria example);

    /**
     * customer_change数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") CustomerChange record, @Param("example") CustomerChangeCriteria example);

    /**
     * customer_change数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(CustomerChange record);

    /**
     * customer_change数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(CustomerChange record);
}