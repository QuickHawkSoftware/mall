package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;

public class OmsCompanyAddress implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String addressName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer sendStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer receiveStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String phone;

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
    public String getAddressName() {
        return addressName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSendStatus() {
        return sendStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getReceiveStatus() {
        return receiveStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiveStatus(Integer receiveStatus) {
        this.receiveStatus = receiveStatus;
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
    public String getPhone() {
        return phone;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPhone(String phone) {
        this.phone = phone;
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
        sb.append(", addressName=").append(addressName);
        sb.append(", sendStatus=").append(sendStatus);
        sb.append(", receiveStatus=").append(receiveStatus);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", region=").append(region);
        sb.append(", detailAddress=").append(detailAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}