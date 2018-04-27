package com.zlkcxd.dao.mapper;

import com.zlkcxd.dao.domain.Score;
import com.zlkcxd.dao.domain.ScoreCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoreMapper {
    /**
     * score数据表的操作方法: countByExample  
     * 
     */
    int countByExample(ScoreCriteria example);

    /**
     * score数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(ScoreCriteria example);

    /**
     * score数据表的操作方法: deleteByPrimaryKey  
     * 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * score数据表的操作方法: insert  
     * 
     */
    int insert(Score record);

    /**
     * score数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(Score record);

    /**
     * score数据表的操作方法: selectByExample  
     * 
     */
    List<Score> selectByExample(ScoreCriteria example);

    /**
     * score数据表的操作方法: selectByPrimaryKey  
     * 
     */
    Score selectByPrimaryKey(Long id);

    /**
     * score数据表的操作方法: lockByPrimaryKey  
     * 
     */
    Score lockByPrimaryKey(Long id);

    /**
     * score数据表的操作方法: lockByExample  
     * 
     */
    Score lockByExample(ScoreCriteria example);

    /**
     * score数据表的操作方法: lastInsertId  
     * 线程安全的获得当前连接，最近一个自增长主键的值（针对insert操作）
     * 使用last_insert_id()时要注意，当一次插入多条记录时(批量插入)，只是获得第一次插入的id值，务必注意。
     * 
     */
    Long lastInsertId();

    /**
     * score数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") Score record, @Param("example") ScoreCriteria example);

    /**
     * score数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") Score record, @Param("example") ScoreCriteria example);

    /**
     * score数据表的操作方法: updateByPrimaryKeySelective  
     * 
     */
    int updateByPrimaryKeySelective(Score record);

    /**
     * score数据表的操作方法: updateByPrimaryKey  
     * 
     */
    int updateByPrimaryKey(Score record);
}