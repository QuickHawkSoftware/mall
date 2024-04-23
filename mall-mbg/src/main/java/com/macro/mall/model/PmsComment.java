package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.util.Date;

public class PmsComment implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String memberNickName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer star;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String memberIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer showStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productAttribute;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer collectCouont;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer readCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String pics;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String memberIcon;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer replayCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String content;

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
    public Long getProductId() {
        return productId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMemberNickName() {
        return memberNickName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProductName() {
        return productName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getStar() {
        return star;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStar(Integer star) {
        this.star = star;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMemberIp() {
        return memberIp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberIp(String memberIp) {
        this.memberIp = memberIp;
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
    public Integer getShowStatus() {
        return showStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProductAttribute() {
        return productAttribute;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCollectCouont() {
        return collectCouont;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCollectCouont(Integer collectCouont) {
        this.collectCouont = collectCouont;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getReadCount() {
        return readCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPics() {
        return pics;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPics(String pics) {
        this.pics = pics;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMemberIcon() {
        return memberIcon;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getReplayCount() {
        return replayCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReplayCount(Integer replayCount) {
        this.replayCount = replayCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getContent() {
        return content;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", memberNickName=").append(memberNickName);
        sb.append(", productName=").append(productName);
        sb.append(", star=").append(star);
        sb.append(", memberIp=").append(memberIp);
        sb.append(", createTime=").append(createTime);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", productAttribute=").append(productAttribute);
        sb.append(", collectCouont=").append(collectCouont);
        sb.append(", readCount=").append(readCount);
        sb.append(", pics=").append(pics);
        sb.append(", memberIcon=").append(memberIcon);
        sb.append(", replayCount=").append(replayCount);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}