package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.util.Date;

public class SmsCouponHistory implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long couponId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long memberId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String couponCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String memberNickname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer getType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer useStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date useTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long orderId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String orderSn;

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
    public Long getCouponId() {
        return couponId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
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
    public String getCouponCode() {
        return couponCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMemberNickname() {
        return memberNickname;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getGetType() {
        return getType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGetType(Integer getType) {
        this.getType = getType;
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
    public Integer getUseStatus() {
        return useStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getUseTime() {
        return useTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getOrderId() {
        return orderId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOrderSn() {
        return orderSn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", couponId=").append(couponId);
        sb.append(", memberId=").append(memberId);
        sb.append(", couponCode=").append(couponCode);
        sb.append(", memberNickname=").append(memberNickname);
        sb.append(", getType=").append(getType);
        sb.append(", createTime=").append(createTime);
        sb.append(", useStatus=").append(useStatus);
        sb.append(", useTime=").append(useTime);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}