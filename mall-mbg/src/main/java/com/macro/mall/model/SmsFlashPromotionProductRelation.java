package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.math.BigDecimal;

public class SmsFlashPromotionProductRelation implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long flashPromotionId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long flashPromotionSessionId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal flashPromotionPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer flashPromotionCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer flashPromotionLimit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer sort;

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
    public Long getFlashPromotionId() {
        return flashPromotionId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFlashPromotionId(Long flashPromotionId) {
        this.flashPromotionId = flashPromotionId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getFlashPromotionSessionId() {
        return flashPromotionSessionId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFlashPromotionSessionId(Long flashPromotionSessionId) {
        this.flashPromotionSessionId = flashPromotionSessionId;
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
    public BigDecimal getFlashPromotionPrice() {
        return flashPromotionPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFlashPromotionPrice(BigDecimal flashPromotionPrice) {
        this.flashPromotionPrice = flashPromotionPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getFlashPromotionCount() {
        return flashPromotionCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFlashPromotionCount(Integer flashPromotionCount) {
        this.flashPromotionCount = flashPromotionCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getFlashPromotionLimit() {
        return flashPromotionLimit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFlashPromotionLimit(Integer flashPromotionLimit) {
        this.flashPromotionLimit = flashPromotionLimit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSort() {
        return sort;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flashPromotionId=").append(flashPromotionId);
        sb.append(", flashPromotionSessionId=").append(flashPromotionSessionId);
        sb.append(", productId=").append(productId);
        sb.append(", flashPromotionPrice=").append(flashPromotionPrice);
        sb.append(", flashPromotionCount=").append(flashPromotionCount);
        sb.append(", flashPromotionLimit=").append(flashPromotionLimit);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}