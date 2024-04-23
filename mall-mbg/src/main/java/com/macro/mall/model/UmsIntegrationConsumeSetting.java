package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;

public class UmsIntegrationConsumeSetting implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer deductionPerAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer maxPercentPerOrder;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer useUnit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer couponStatus;

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
    public Integer getDeductionPerAmount() {
        return deductionPerAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeductionPerAmount(Integer deductionPerAmount) {
        this.deductionPerAmount = deductionPerAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getMaxPercentPerOrder() {
        return maxPercentPerOrder;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMaxPercentPerOrder(Integer maxPercentPerOrder) {
        this.maxPercentPerOrder = maxPercentPerOrder;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getUseUnit() {
        return useUnit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUseUnit(Integer useUnit) {
        this.useUnit = useUnit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCouponStatus() {
        return couponStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCouponStatus(Integer couponStatus) {
        this.couponStatus = couponStatus;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", deductionPerAmount=").append(deductionPerAmount);
        sb.append(", maxPercentPerOrder=").append(maxPercentPerOrder);
        sb.append(", useUnit=").append(useUnit);
        sb.append(", couponStatus=").append(couponStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}