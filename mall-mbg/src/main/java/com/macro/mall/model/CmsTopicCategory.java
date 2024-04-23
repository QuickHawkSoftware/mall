package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;

public class CmsTopicCategory implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String icon;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer subjectCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer showStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer sort;

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
    public String getIcon() {
        return icon;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSubjectCount() {
        return subjectCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSubjectCount(Integer subjectCount) {
        this.subjectCount = subjectCount;
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

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", icon=").append(icon);
        sb.append(", subjectCount=").append(subjectCount);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}