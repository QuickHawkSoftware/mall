package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.math.BigDecimal;

public class PmsMemberPrice implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long memberLevelId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal memberPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String memberLevelName;

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
    public Long getProductId() {
        return productId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getMemberLevelId() {
        return memberLevelId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMemberLevelName() {
        return memberLevelName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", memberLevelId=").append(memberLevelId);
        sb.append(", memberPrice=").append(memberPrice);
        sb.append(", memberLevelName=").append(memberLevelName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}