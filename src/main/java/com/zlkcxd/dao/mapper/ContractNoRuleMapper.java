package com.zlkcxd.dao.mapper;

import com.zlkcxd.dao.domain.ContractNoRule;
import com.zlkcxd.dao.domain.ContractNoRuleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractNoRuleMapper {
    /**
     * contract_no_rule数据表的操作方法: countByExample  
     * 
     */
    int countByExample(ContractNoRuleCriteria example);

    /**
     * contract_no_rule数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(ContractNoRuleCriteria example);

    /**
     * contract_no_rule数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * contract_no_rule数据表的操作方法: insert  
     * 
     */
    int insert(ContractNoRule record);

    /**
     * contract_no_rule数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(ContractNoRule record);

    /**
     * contract_no_rule数据表的操作方法: selectByExample  
     * 
     */
    List<ContractNoRule> selectByExample(ContractNoRuleCriteria example);

    /**
     * contract_no_rule数据表的操作方法: selectByPrimaryKey  
     * 
     */
    ContractNoRule selectByPrimaryKey(Long id);

    /**
     * contract_no_rule数据表的操作方法: lockByPrimaryKey  
     * 
     */
    ContractNoRule lockByPrimaryKey(Long id);

    /**
     * contract_no_rule数据表的操作方法: lockByExample  
     * 
     */
    ContractNoRule lockByExample(ContractNoRuleCriteria example);

    /**
     * contract_no_rule数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * contract_no_rule数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") ContractNoRule record, @Param("example") ContractNoRuleCriteria example);

    /**
     * contract_no_rule数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") ContractNoRule record, @Param("example") ContractNoRuleCriteria example);

    /**
     * contract_no_rule数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(ContractNoRule record);

    /**
     * contract_no_rule数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(ContractNoRule record);
}