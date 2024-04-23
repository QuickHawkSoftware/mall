package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.util.Date;

public class CmsSubjectComment implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long subjectId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String memberNickName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String memberIcon;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String content;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer showStatus;

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
    public Long getSubjectId() {
        return subjectId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMemberNickName() {
        return memberNickName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMemberIcon() {
        return memberIcon;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getContent() {
        return content;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setContent(String content) {
        this.content = content;
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
    public Integer getShowStatus() {
        return showStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", memberNickName=").append(memberNickName);
        sb.append(", memberIcon=").append(memberIcon);
        sb.append(", content=").append(content);
        sb.append(", createTime=").append(createTime);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}