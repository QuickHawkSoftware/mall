package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.math.BigDecimal;

public class PmsSkuStock implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String skuCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal price;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer stock;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer lowStock;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String pic;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer sale;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal promotionPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer lockStock;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String spData;

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
    public String getSkuCode() {
        return skuCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getPrice() {
        return price;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getStock() {
        return stock;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getLowStock() {
        return lowStock;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPic() {
        return pic;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPic(String pic) {
        this.pic = pic;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSale() {
        return sale;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSale(Integer sale) {
        this.sale = sale;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getLockStock() {
        return lockStock;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLockStock(Integer lockStock) {
        this.lockStock = lockStock;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSpData() {
        return spData;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSpData(String spData) {
        this.spData = spData;
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
        sb.append(", skuCode=").append(skuCode);
        sb.append(", price=").append(price);
        sb.append(", stock=").append(stock);
        sb.append(", lowStock=").append(lowStock);
        sb.append(", pic=").append(pic);
        sb.append(", sale=").append(sale);
        sb.append(", promotionPrice=").append(promotionPrice);
        sb.append(", lockStock=").append(lockStock);
        sb.append(", spData=").append(spData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}