package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;

public class UmsMemberReceiveAddress implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long memberId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String phoneNumber;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer defaultStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String postCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String province;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String city;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String region;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String detailAddress;

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
    public Long getMemberId() {
        return memberId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
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
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPostCode() {
        return postCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProvince() {
        return province;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProvince(String province) {
        this.province = province;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCity() {
        return city;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCity(String city) {
        this.city = city;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRegion() {
        return region;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRegion(String region) {
        this.region = region;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDetailAddress() {
        return detailAddress;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", name=").append(name);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", defaultStatus=").append(defaultStatus);
        sb.append(", postCode=").append(postCode);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", region=").append(region);
        sb.append(", detailAddress=").append(detailAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}