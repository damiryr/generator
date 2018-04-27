package com.zlkcxd.dao.mapper;

import com.zlkcxd.dao.domain.LmjOrderInfo;
import com.zlkcxd.dao.domain.LmjOrderInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LmjOrderInfoMapper {
    /**
     * lmj_order_info数据表的操作方法: countByExample  
     * 
     */
    int countByExample(LmjOrderInfoCriteria example);

    /**
     * lmj_order_info数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(LmjOrderInfoCriteria example);

    /**
     * lmj_order_info数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * lmj_order_info数据表的操作方法: insert  
     * 
     */
    int insert(LmjOrderInfo record);

    /**
     * lmj_order_info数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(LmjOrderInfo record);

    /**
     * lmj_order_info数据表的操作方法: selectByExample  
     * 
     */
    List<LmjOrderInfo> selectByExample(LmjOrderInfoCriteria example);

    /**
     * lmj_order_info数据表的操作方法: selectByPrimaryKey  
     * 
     */
    LmjOrderInfo selectByPrimaryKey(Long id);

    /**
     * lmj_order_info数据表的操作方法: lockByPrimaryKey  
     * 
     */
    LmjOrderInfo lockByPrimaryKey(Long id);

    /**
     * lmj_order_info数据表的操作方法: lockByExample  
     * 
     */
    LmjOrderInfo lockByExample(LmjOrderInfoCriteria example);

    /**
     * lmj_order_info数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * lmj_order_info数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") LmjOrderInfo record, @Param("example") LmjOrderInfoCriteria example);

    /**
     * lmj_order_info数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") LmjOrderInfo record, @Param("example") LmjOrderInfoCriteria example);

    /**
     * lmj_order_info数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(LmjOrderInfo record);

    /**
     * lmj_order_info数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(LmjOrderInfo record);
}