package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;

public class SmsCouponProductRelation implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long couponId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productSn;

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
    public Long getProductId() {
        return productId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductId(Long productId) {
        this.productId = productId;
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
    public String getProductSn() {
        return productSn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductSn(String productSn) {
        this.productSn = productSn;
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
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", productSn=").append(productSn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}