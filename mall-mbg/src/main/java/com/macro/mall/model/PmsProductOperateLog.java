package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PmsProductOperateLog implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal priceOld;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal priceNew;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal salePriceOld;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal salePriceNew;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer giftPointOld;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer giftPointNew;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer usePointLimitOld;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer usePointLimitNew;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String operateMan;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

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
    public BigDecimal getPriceOld() {
        return priceOld;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPriceOld(BigDecimal priceOld) {
        this.priceOld = priceOld;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getPriceNew() {
        return priceNew;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPriceNew(BigDecimal priceNew) {
        this.priceNew = priceNew;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getSalePriceOld() {
        return salePriceOld;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSalePriceOld(BigDecimal salePriceOld) {
        this.salePriceOld = salePriceOld;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getSalePriceNew() {
        return salePriceNew;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSalePriceNew(BigDecimal salePriceNew) {
        this.salePriceNew = salePriceNew;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getGiftPointOld() {
        return giftPointOld;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGiftPointOld(Integer giftPointOld) {
        this.giftPointOld = giftPointOld;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getGiftPointNew() {
        return giftPointNew;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGiftPointNew(Integer giftPointNew) {
        this.giftPointNew = giftPointNew;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getUsePointLimitOld() {
        return usePointLimitOld;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUsePointLimitOld(Integer usePointLimitOld) {
        this.usePointLimitOld = usePointLimitOld;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getUsePointLimitNew() {
        return usePointLimitNew;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUsePointLimitNew(Integer usePointLimitNew) {
        this.usePointLimitNew = usePointLimitNew;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOperateMan() {
        return operateMan;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        sb.append(", priceOld=").append(priceOld);
        sb.append(", priceNew=").append(priceNew);
        sb.append(", salePriceOld=").append(salePriceOld);
        sb.append(", salePriceNew=").append(salePriceNew);
        sb.append(", giftPointOld=").append(giftPointOld);
        sb.append(", giftPointNew=").append(giftPointNew);
        sb.append(", usePointLimitOld=").append(usePointLimitOld);
        sb.append(", usePointLimitNew=").append(usePointLimitNew);
        sb.append(", operateMan=").append(operateMan);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}