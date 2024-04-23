package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.util.Date;

public class SmsFlashPromotionLog implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer memberId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String memberPhone;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date subscribeTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date sendTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private static final long serialVersionUID = 1L;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getMemberId() {
        return memberId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getProductId() {
        return productId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMemberPhone() {
        return memberPhone;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProductName() {
        return productName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getSubscribeTime() {
        return subscribeTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSubscribeTime(Date subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getSendTime() {
        return sendTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
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
        sb.append(", productId=").append(productId);
        sb.append(", memberPhone=").append(memberPhone);
        sb.append(", productName=").append(productName);
        sb.append(", subscribeTime=").append(subscribeTime);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}