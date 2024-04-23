package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;

public class OmsOrderSetting implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer flashOrderOvertime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer normalOrderOvertime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer confirmOvertime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer finishOvertime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer commentOvertime;

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
    public Integer getFlashOrderOvertime() {
        return flashOrderOvertime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFlashOrderOvertime(Integer flashOrderOvertime) {
        this.flashOrderOvertime = flashOrderOvertime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getNormalOrderOvertime() {
        return normalOrderOvertime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNormalOrderOvertime(Integer normalOrderOvertime) {
        this.normalOrderOvertime = normalOrderOvertime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getConfirmOvertime() {
        return confirmOvertime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setConfirmOvertime(Integer confirmOvertime) {
        this.confirmOvertime = confirmOvertime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getFinishOvertime() {
        return finishOvertime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFinishOvertime(Integer finishOvertime) {
        this.finishOvertime = finishOvertime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCommentOvertime() {
        return commentOvertime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCommentOvertime(Integer commentOvertime) {
        this.commentOvertime = commentOvertime;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flashOrderOvertime=").append(flashOrderOvertime);
        sb.append(", normalOrderOvertime=").append(normalOrderOvertime);
        sb.append(", confirmOvertime=").append(confirmOvertime);
        sb.append(", finishOvertime=").append(finishOvertime);
        sb.append(", commentOvertime=").append(commentOvertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}