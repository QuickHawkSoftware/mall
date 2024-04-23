package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;

public class PmsProductCategory implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long parentId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer level;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer productCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productUnit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer navStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer showStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String icon;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String keywords;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String description;

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
    public Long getParentId() {
        return parentId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setParentId(Long parentId) {
        this.parentId = parentId;
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
    public Integer getLevel() {
        return level;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLevel(Integer level) {
        this.level = level;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getProductCount() {
        return productCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProductUnit() {
        return productUnit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getNavStatus() {
        return navStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNavStatus(Integer navStatus) {
        this.navStatus = navStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getShowStatus() {
        return showStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSort() {
        return sort;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getIcon() {
        return icon;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getKeywords() {
        return keywords;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDescription() {
        return description;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", name=").append(name);
        sb.append(", level=").append(level);
        sb.append(", productCount=").append(productCount);
        sb.append(", productUnit=").append(productUnit);
        sb.append(", navStatus=").append(navStatus);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", sort=").append(sort);
        sb.append(", icon=").append(icon);
        sb.append(", keywords=").append(keywords);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}