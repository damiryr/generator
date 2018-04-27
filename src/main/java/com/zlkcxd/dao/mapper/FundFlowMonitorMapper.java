package com.zlkcxd.dao.mapper;

import com.zlkcxd.dao.domain.FundFlowMonitor;
import com.zlkcxd.dao.domain.FundFlowMonitorCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundFlowMonitorMapper {
    /**
     * fund_flow_monitor数据表的操作方法: countByExample  
     * 
     */
    int countByExample(FundFlowMonitorCriteria example);

    /**
     * fund_flow_monitor数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(FundFlowMonitorCriteria example);

    /**
     * fund_flow_monitor数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * fund_flow_monitor数据表的操作方法: insert  
     * 
     */
    int insert(FundFlowMonitor record);

    /**
     * fund_flow_monitor数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(FundFlowMonitor record);

    /**
     * fund_flow_monitor数据表的操作方法: selectByExample  
     * 
     */
    List<FundFlowMonitor> selectByExample(FundFlowMonitorCriteria example);

    /**
     * fund_flow_monitor数据表的操作方法: selectByPrimaryKey  
     * 
     */
    FundFlowMonitor selectByPrimaryKey(Long id);

    /**
     * fund_flow_monitor数据表的操作方法: lockByPrimaryKey  
     * 
     */
    FundFlowMonitor lockByPrimaryKey(Long id);

    /**
     * fund_flow_monitor数据表的操作方法: lockByExample  
     * 
     */
    FundFlowMonitor lockByExample(FundFlowMonitorCriteria example);

    /**
     * fund_flow_monitor数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * fund_flow_monitor数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") FundFlowMonitor record, @Param("example") FundFlowMonitorCriteria example);

    /**
     * fund_flow_monitor数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") FundFlowMonitor record, @Param("example") FundFlowMonitorCriteria example);

    /**
     * fund_flow_monitor数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(FundFlowMonitor record);

    /**
     * fund_flow_monitor数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(FundFlowMonitor record);
}