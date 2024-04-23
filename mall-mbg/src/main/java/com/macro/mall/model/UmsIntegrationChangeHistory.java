package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.util.Date;

public class UmsIntegrationChangeHistory implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long memberId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer changeType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer changeCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String operateMan;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String operateNote;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer sourceType;

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
    public Long getMemberId() {
        return memberId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
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
    public Integer getChangeType() {
        return changeType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getChangeCount() {
        return changeCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOperateMan() {
        return operateMan;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOperateNote() {
        return operateNote;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOperateNote(String operateNote) {
        this.operateNote = operateNote;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSourceType() {
        return sourceType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", createTime=").append(createTime);
        sb.append(", changeType=").append(changeType);
        sb.append(", changeCount=").append(changeCount);
        sb.append(", operateMan=").append(operateMan);
        sb.append(", operateNote=").append(operateNote);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}