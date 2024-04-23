package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.math.BigDecimal;

public class UmsMemberLevel implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer growthPoint;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer defaultStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal freeFreightPoint;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer commentGrowthPoint;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer priviledgeFreeFreight;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer priviledgeSignIn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer priviledgeComment;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer priviledgePromotion;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer priviledgeMemberPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer priviledgeBirthday;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String note;

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
    public String getName() {
        return name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setName(String name) {
        this.name = name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getGrowthPoint() {
        return growthPoint;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGrowthPoint(Integer growthPoint) {
        this.growthPoint = growthPoint;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getFreeFreightPoint() {
        return freeFreightPoint;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFreeFreightPoint(BigDecimal freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCommentGrowthPoint(Integer commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPriviledgeFreeFreight() {
        return priviledgeFreeFreight;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPriviledgeFreeFreight(Integer priviledgeFreeFreight) {
        this.priviledgeFreeFreight = priviledgeFreeFreight;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPriviledgeSignIn() {
        return priviledgeSignIn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPriviledgeSignIn(Integer priviledgeSignIn) {
        this.priviledgeSignIn = priviledgeSignIn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPriviledgeComment() {
        return priviledgeComment;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPriviledgeComment(Integer priviledgeComment) {
        this.priviledgeComment = priviledgeComment;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPriviledgePromotion() {
        return priviledgePromotion;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPriviledgePromotion(Integer priviledgePromotion) {
        this.priviledgePromotion = priviledgePromotion;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPriviledgeMemberPrice(Integer priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPriviledgeBirthday(Integer priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getNote() {
        return note;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNote(String note) {
        this.note = note;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", growthPoint=").append(growthPoint);
        sb.append(", defaultStatus=").append(defaultStatus);
        sb.append(", freeFreightPoint=").append(freeFreightPoint);
        sb.append(", commentGrowthPoint=").append(commentGrowthPoint);
        sb.append(", priviledgeFreeFreight=").append(priviledgeFreeFreight);
        sb.append(", priviledgeSignIn=").append(priviledgeSignIn);
        sb.append(", priviledgeComment=").append(priviledgeComment);
        sb.append(", priviledgePromotion=").append(priviledgePromotion);
        sb.append(", priviledgeMemberPrice=").append(priviledgeMemberPrice);
        sb.append(", priviledgeBirthday=").append(priviledgeBirthday);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}