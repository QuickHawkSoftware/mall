package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;

public class SmsHomeRecommendSubject implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long subjectId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String subjectName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer recommendStatus;

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
    public Long getSubjectId() {
        return subjectId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSubjectName() {
        return subjectName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
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
        sb.append(", subjectId=").append(subjectId);
        sb.append(", subjectName=").append(subjectName);
        sb.append(", recommendStatus=").append(recommendStatus);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}