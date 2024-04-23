package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.util.Date;

public class CmsMemberReport implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer reportType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String reportMemberName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String reportObject;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer reportStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer handleStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String note;

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
    public Integer getReportType() {
        return reportType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReportMemberName() {
        return reportMemberName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReportMemberName(String reportMemberName) {
        this.reportMemberName = reportMemberName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReportObject() {
        return reportObject;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReportObject(String reportObject) {
        this.reportObject = reportObject;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getReportStatus() {
        return reportStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReportStatus(Integer reportStatus) {
        this.reportStatus = reportStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getHandleStatus() {
        return handleStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHandleStatus(Integer handleStatus) {
        this.handleStatus = handleStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getNote() {
        return note;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNote(String note) {
        this.note = note;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", reportType=").append(reportType);
        sb.append(", reportMemberName=").append(reportMemberName);
        sb.append(", createTime=").append(createTime);
        sb.append(", reportObject=").append(reportObject);
        sb.append(", reportStatus=").append(reportStatus);
        sb.append(", handleStatus=").append(handleStatus);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}