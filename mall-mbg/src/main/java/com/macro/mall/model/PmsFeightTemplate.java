package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.math.BigDecimal;

public class PmsFeightTemplate implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer chargeType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal firstWeight;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal firstFee;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal continueWeight;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal continmeFee;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String dest;

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
    public String getName() {
        return name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setName(String name) {
        this.name = name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getChargeType() {
        return chargeType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getFirstWeight() {
        return firstWeight;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFirstWeight(BigDecimal firstWeight) {
        this.firstWeight = firstWeight;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getFirstFee() {
        return firstFee;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFirstFee(BigDecimal firstFee) {
        this.firstFee = firstFee;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getContinueWeight() {
        return continueWeight;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setContinueWeight(BigDecimal continueWeight) {
        this.continueWeight = continueWeight;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getContinmeFee() {
        return continmeFee;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setContinmeFee(BigDecimal continmeFee) {
        this.continmeFee = continmeFee;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDest() {
        return dest;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDest(String dest) {
        this.dest = dest;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", chargeType=").append(chargeType);
        sb.append(", firstWeight=").append(firstWeight);
        sb.append(", firstFee=").append(firstFee);
        sb.append(", continueWeight=").append(continueWeight);
        sb.append(", continmeFee=").append(continmeFee);
        sb.append(", dest=").append(dest);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}