package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.util.Date;

public class PmsCommentReplay implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long commentId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String memberNickName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String memberIcon;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String content;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer type;

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
    public Long getCommentId() {
        return commentId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
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
    public Integer getType() {
        return type;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", commentId=").append(commentId);
        sb.append(", memberNickName=").append(memberNickName);
        sb.append(", memberIcon=").append(memberIcon);
        sb.append(", content=").append(content);
        sb.append(", createTime=").append(createTime);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}