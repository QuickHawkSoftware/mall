package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;

public class PmsProductAttribute implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long productAttributeCategoryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer selectType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer inputType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String inputList;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer filterType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer searchType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer relatedStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer handAddStatus;

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
    public Long getProductAttributeCategoryId() {
        return productAttributeCategoryId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductAttributeCategoryId(Long productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
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
    public Integer getSelectType() {
        return selectType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSelectType(Integer selectType) {
        this.selectType = selectType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getInputType() {
        return inputType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setInputType(Integer inputType) {
        this.inputType = inputType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getInputList() {
        return inputList;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setInputList(String inputList) {
        this.inputList = inputList;
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
    public Integer getFilterType() {
        return filterType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFilterType(Integer filterType) {
        this.filterType = filterType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSearchType() {
        return searchType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSearchType(Integer searchType) {
        this.searchType = searchType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getRelatedStatus() {
        return relatedStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRelatedStatus(Integer relatedStatus) {
        this.relatedStatus = relatedStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getHandAddStatus() {
        return handAddStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHandAddStatus(Integer handAddStatus) {
        this.handAddStatus = handAddStatus;
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
        sb.append(", productAttributeCategoryId=").append(productAttributeCategoryId);
        sb.append(", name=").append(name);
        sb.append(", selectType=").append(selectType);
        sb.append(", inputType=").append(inputType);
        sb.append(", inputList=").append(inputList);
        sb.append(", sort=").append(sort);
        sb.append(", filterType=").append(filterType);
        sb.append(", searchType=").append(searchType);
        sb.append(", relatedStatus=").append(relatedStatus);
        sb.append(", handAddStatus=").append(handAddStatus);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}