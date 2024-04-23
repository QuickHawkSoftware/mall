package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;

public class PmsProductAttributeCategory implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer attributeCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer paramCount;

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
    public Integer getAttributeCount() {
        return attributeCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAttributeCount(Integer attributeCount) {
        this.attributeCount = attributeCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getParamCount() {
        return paramCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setParamCount(Integer paramCount) {
        this.paramCount = paramCount;
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
        sb.append(", attributeCount=").append(attributeCount);
        sb.append(", paramCount=").append(paramCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}