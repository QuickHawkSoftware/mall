package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.math.BigDecimal;

public class PmsProductFullReduction implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal fullPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal reducePrice;

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
    public BigDecimal getFullPrice() {
        return fullPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFullPrice(BigDecimal fullPrice) {
        this.fullPrice = fullPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getReducePrice() {
        return reducePrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReducePrice(BigDecimal reducePrice) {
        this.reducePrice = reducePrice;
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
        sb.append(", fullPrice=").append(fullPrice);
        sb.append(", reducePrice=").append(reducePrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}