package com.zlkcxd.dao.domain;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Score implements Serializable {
    /**
     * 主键ID -- score.id
     * 
     */
    private Long id;

    /**
     * 名称 -- score.category_name
     * 
     */
    private String categoryName;

    /**
     * 指标 -- score.indictators
     * 
     */
    private String indictators;

    /**
     * 数据备注 -- score.data_source
     * 
     */
    private String dataSource;

    /**
     * 打分办法 -- score.score_method
     * 
     */
    private String scoreMethod;

    /**
     * 得分 -- score.score
     * 
     */
    private Float score;

    /**
     * 分类ID（维护在字典表） -- score.classify_id
     * 
     */
    private Integer classifyId;

    /**
     * 状态 1-有效 2-无效 -- score.status
     * 
     */
    private Integer status;

    /**
     * 创建时间 -- score.create_time
     * 
     */
    private Date createTime;

    /**
     * 修改时间 -- score.update_time
     * 
     */
    private Date updateTime;

    /**
     * 用户id -- score.user_id
     * 
     */
    private Long userId;

    /**
     * 权重 -- score.weight
     * 
     */
    private String weight;

    /**
     * 单项分值 -- score.single_score
     * 
     */
    private Integer singleScore;

    /**
     * 父id -- score.parent_id
     * 
     */
    private Long parentId;

    /**
     * 记分条件 -- score.scoring
     * 
     */
    private Integer scoring;

    /**
     * 优先级 -- score.priority
     * 
     */
    private Integer priority;

    /**
     * score表的操作属性:serialVersionUID
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 score.id的get方法 
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 数据字段 score.id的set方法
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 数据字段 score.category_name的get方法 
     * 
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 数据字段 score.category_name的set方法
     * 
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * 数据字段 score.indictators的get方法 
     * 
     */
    public String getIndictators() {
        return indictators;
    }

    /**
     * 数据字段 score.indictators的set方法
     * 
     */
    public void setIndictators(String indictators) {
        this.indictators = indictators == null ? null : indictators.trim();
    }

    /**
     * 数据字段 score.data_source的get方法 
     * 
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * 数据字段 score.data_source的set方法
     * 
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
    }

    /**
     * 数据字段 score.score_method的get方法 
     * 
     */
    public String getScoreMethod() {
        return scoreMethod;
    }

    /**
     * 数据字段 score.score_method的set方法
     * 
     */
    public void setScoreMethod(String scoreMethod) {
        this.scoreMethod = scoreMethod == null ? null : scoreMethod.trim();
    }

    /**
     * 数据字段 score.score的get方法 
     * 
     */
    public Float getScore() {
        return score;
    }

    /**
     * 数据字段 score.score的set方法
     * 
     */
    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * 数据字段 score.classify_id的get方法 
     * 
     */
    public Integer getClassifyId() {
        return classifyId;
    }

    /**
     * 数据字段 score.classify_id的set方法
     * 
     */
    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    /**
     * 数据字段 score.status的get方法 
     * 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 数据字段 score.status的set方法
     * 
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 数据字段 score.create_time的get方法 
     * 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 数据字段 score.create_time的set方法
     * 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 数据字段 score.update_time的get方法 
     * 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 数据字段 score.update_time的set方法
     * 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 数据字段 score.user_id的get方法 
     * 
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 数据字段 score.user_id的set方法
     * 
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 数据字段 score.weight的get方法 
     * 
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 数据字段 score.weight的set方法
     * 
     */
    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    /**
     * 数据字段 score.single_score的get方法 
     * 
     */
    public Integer getSingleScore() {
        return singleScore;
    }

    /**
     * 数据字段 score.single_score的set方法
     * 
     */
    public void setSingleScore(Integer singleScore) {
        this.singleScore = singleScore;
    }

    /**
     * 数据字段 score.parent_id的get方法 
     * 
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 数据字段 score.parent_id的set方法
     * 
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 数据字段 score.scoring的get方法 
     * 
     */
    public Integer getScoring() {
        return scoring;
    }

    /**
     * 数据字段 score.scoring的set方法
     * 
     */
    public void setScoring(Integer scoring) {
        this.scoring = scoring;
    }

    /**
     * 数据字段 score.priority的get方法 
     * 
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * 数据字段 score.priority的set方法
     * 
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}