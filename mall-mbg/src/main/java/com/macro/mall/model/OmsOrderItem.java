package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.math.BigDecimal;

public class OmsOrderItem implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long orderId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String orderSn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productPic;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productBrand;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productSn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal productPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer productQuantity;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long productSkuId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productSkuCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long productCategoryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String promotionName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal promotionAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal couponAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal integrationAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal realAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer giftIntegration;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer giftGrowth;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productAttr;

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

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getProductId() {
        return productId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProductPic() {
        return productPic;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductPic(String productPic) {
        this.productPic = productPic;
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
    public String getProductBrand() {
        return productBrand;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProductSn() {
        return productSn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getProductQuantity() {
        return productQuantity;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getProductSkuId() {
        return productSkuId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductSkuId(Long productSkuId) {
        this.productSkuId = productSkuId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProductSkuCode() {
        return productSkuCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
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
    public String getPromotionName() {
        return promotionName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getGiftIntegration() {
        return giftIntegration;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGiftIntegration(Integer giftIntegration) {
        this.giftIntegration = giftIntegration;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProductAttr() {
        return productAttr;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", productId=").append(productId);
        sb.append(", productPic=").append(productPic);
        sb.append(", productName=").append(productName);
        sb.append(", productBrand=").append(productBrand);
        sb.append(", productSn=").append(productSn);
        sb.append(", productPrice=").append(productPrice);
        sb.append(", productQuantity=").append(productQuantity);
        sb.append(", productSkuId=").append(productSkuId);
        sb.append(", productSkuCode=").append(productSkuCode);
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", promotionName=").append(promotionName);
        sb.append(", promotionAmount=").append(promotionAmount);
        sb.append(", couponAmount=").append(couponAmount);
        sb.append(", integrationAmount=").append(integrationAmount);
        sb.append(", realAmount=").append(realAmount);
        sb.append(", giftIntegration=").append(giftIntegration);
        sb.append(", giftGrowth=").append(giftGrowth);
        sb.append(", productAttr=").append(productAttr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}