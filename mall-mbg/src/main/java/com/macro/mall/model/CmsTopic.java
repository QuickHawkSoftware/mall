package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.util.Date;

public class CmsTopic implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long categoryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date startTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date endTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer attendCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer attentionCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer readCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String awardName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String attendType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String content;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private static final long serialVersionUID = 1L;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getCategoryId() {
        return categoryId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getName() {
        return name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setName(String name) {
        this.name = name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getStartTime() {
        return startTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getEndTime() {
        return endTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getAttendCount() {
        return attendCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getAttentionCount() {
        return attentionCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAttentionCount(Integer attentionCount) {
        this.attentionCount = attentionCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getReadCount() {
        return readCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAwardName() {
        return awardName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAttendType() {
        return attendType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAttendType(String attendType) {
        this.attendType = attendType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getContent() {
        return content;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", name=").append(name);
        sb.append(", createTime=").append(createTime);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", attendCount=").append(attendCount);
        sb.append(", attentionCount=").append(attentionCount);
        sb.append(", readCount=").append(readCount);
        sb.append(", awardName=").append(awardName);
        sb.append(", attendType=").append(attendType);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}