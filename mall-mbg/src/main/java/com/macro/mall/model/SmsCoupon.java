package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SmsCoupon implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer type;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer platform;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer count;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal amount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer perLimit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal minPoint;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date startTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date endTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer useType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String note;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer publishCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer useCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer receiveCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date enableTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String code;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer memberLevel;

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
    public Integer getType() {
        return type;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setType(Integer type) {
        this.type = type;
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
    public Integer getPlatform() {
        return platform;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPlatform(Integer platform) {
        this.platform = platform;
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
    public BigDecimal getAmount() {
        return amount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPerLimit() {
        return perLimit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPerLimit(Integer perLimit) {
        this.perLimit = perLimit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getMinPoint() {
        return minPoint;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMinPoint(BigDecimal minPoint) {
        this.minPoint = minPoint;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getStartTime() {
        return startTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getEndTime() {
        return endTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getUseType() {
        return useType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUseType(Integer useType) {
        this.useType = useType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getNote() {
        return note;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNote(String note) {
        this.note = note;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPublishCount() {
        return publishCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPublishCount(Integer publishCount) {
        this.publishCount = publishCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getUseCount() {
        return useCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getReceiveCount() {
        return receiveCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiveCount(Integer receiveCount) {
        this.receiveCount = receiveCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getEnableTime() {
        return enableTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEnableTime(Date enableTime) {
        this.enableTime = enableTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCode() {
        return code;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCode(String code) {
        this.code = code;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getMemberLevel() {
        return memberLevel;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberLevel(Integer memberLevel) {
        this.memberLevel = memberLevel;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", platform=").append(platform);
        sb.append(", count=").append(count);
        sb.append(", amount=").append(amount);
        sb.append(", perLimit=").append(perLimit);
        sb.append(", minPoint=").append(minPoint);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", useType=").append(useType);
        sb.append(", note=").append(note);
        sb.append(", publishCount=").append(publishCount);
        sb.append(", useCount=").append(useCount);
        sb.append(", receiveCount=").append(receiveCount);
        sb.append(", enableTime=").append(enableTime);
        sb.append(", code=").append(code);
        sb.append(", memberLevel=").append(memberLevel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}