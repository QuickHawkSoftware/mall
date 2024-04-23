package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.math.BigDecimal;

public class PmsProductLadder implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer count;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal discount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal price;

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
    public Integer getCount() {
        return count;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCount(Integer count) {
        this.count = count;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getDiscount() {
        return discount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getPrice() {
        return price;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPrice(BigDecimal price) {
        this.price = price;
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
        sb.append(", count=").append(count);
        sb.append(", discount=").append(discount);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}