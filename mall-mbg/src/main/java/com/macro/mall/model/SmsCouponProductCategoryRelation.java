package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;

public class SmsCouponProductCategoryRelation implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long couponId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long productCategoryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productCategoryName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String parentCategoryName;

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
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProductCategoryName() {
        return productCategoryName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getParentCategoryName() {
        return parentCategoryName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setParentCategoryName(String parentCategoryName) {
        this.parentCategoryName = parentCategoryName;
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
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", productCategoryName=").append(productCategoryName);
        sb.append(", parentCategoryName=").append(parentCategoryName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}