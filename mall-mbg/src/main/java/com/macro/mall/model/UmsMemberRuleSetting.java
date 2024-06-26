package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.math.BigDecimal;

public class UmsMemberRuleSetting implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer continueSignDay;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer continueSignPoint;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal consumePerPoint;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal lowOrderAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer maxPointPerOrder;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer type;

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
    public Integer getContinueSignDay() {
        return continueSignDay;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setContinueSignDay(Integer continueSignDay) {
        this.continueSignDay = continueSignDay;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getContinueSignPoint() {
        return continueSignPoint;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setContinueSignPoint(Integer continueSignPoint) {
        this.continueSignPoint = continueSignPoint;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getConsumePerPoint() {
        return consumePerPoint;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setConsumePerPoint(BigDecimal consumePerPoint) {
        this.consumePerPoint = consumePerPoint;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getLowOrderAmount() {
        return lowOrderAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLowOrderAmount(BigDecimal lowOrderAmount) {
        this.lowOrderAmount = lowOrderAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getMaxPointPerOrder() {
        return maxPointPerOrder;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMaxPointPerOrder(Integer maxPointPerOrder) {
        this.maxPointPerOrder = maxPointPerOrder;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getType() {
        return type;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", continueSignDay=").append(continueSignDay);
        sb.append(", continueSignPoint=").append(continueSignPoint);
        sb.append(", consumePerPoint=").append(consumePerPoint);
        sb.append(", lowOrderAmount=").append(lowOrderAmount);
        sb.append(", maxPointPerOrder=").append(maxPointPerOrder);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}