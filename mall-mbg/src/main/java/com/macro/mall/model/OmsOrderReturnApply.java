package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OmsOrderReturnApply implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long orderId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long companyAddressId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String orderSn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String memberUsername;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal returnAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String returnName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String returnPhone;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer status;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date handleTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productPic;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productBrand;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productAttr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer productCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal productPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal productRealPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String reason;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String description;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String proofPics;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String handleNote;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String handleMan;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String receiveMan;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date receiveTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String receiveNote;

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
    public Long getOrderId() {
        return orderId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getCompanyAddressId() {
        return companyAddressId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCompanyAddressId(Long companyAddressId) {
        this.companyAddressId = companyAddressId;
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
    public String getOrderSn() {
        return orderSn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
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
    public String getMemberUsername() {
        return memberUsername;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReturnName() {
        return returnName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReturnPhone() {
        return returnPhone;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReturnPhone(String returnPhone) {
        this.returnPhone = returnPhone;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getStatus() {
        return status;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getHandleTime() {
        return handleTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProductPic() {
        return productPic;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductPic(String productPic) {
        this.productPic = productPic;
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
    public String getProductBrand() {
        return productBrand;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProductAttr() {
        return productAttr;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
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
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getProductRealPrice() {
        return productRealPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductRealPrice(BigDecimal productRealPrice) {
        this.productRealPrice = productRealPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReason() {
        return reason;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReason(String reason) {
        this.reason = reason;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDescription() {
        return description;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProofPics() {
        return proofPics;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProofPics(String proofPics) {
        this.proofPics = proofPics;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getHandleNote() {
        return handleNote;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHandleNote(String handleNote) {
        this.handleNote = handleNote;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getHandleMan() {
        return handleMan;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHandleMan(String handleMan) {
        this.handleMan = handleMan;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReceiveMan() {
        return receiveMan;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiveMan(String receiveMan) {
        this.receiveMan = receiveMan;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getReceiveTime() {
        return receiveTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReceiveNote() {
        return receiveNote;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiveNote(String receiveNote) {
        this.receiveNote = receiveNote;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", companyAddressId=").append(companyAddressId);
        sb.append(", productId=").append(productId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", createTime=").append(createTime);
        sb.append(", memberUsername=").append(memberUsername);
        sb.append(", returnAmount=").append(returnAmount);
        sb.append(", returnName=").append(returnName);
        sb.append(", returnPhone=").append(returnPhone);
        sb.append(", status=").append(status);
        sb.append(", handleTime=").append(handleTime);
        sb.append(", productPic=").append(productPic);
        sb.append(", productName=").append(productName);
        sb.append(", productBrand=").append(productBrand);
        sb.append(", productAttr=").append(productAttr);
        sb.append(", productCount=").append(productCount);
        sb.append(", productPrice=").append(productPrice);
        sb.append(", productRealPrice=").append(productRealPrice);
        sb.append(", reason=").append(reason);
        sb.append(", description=").append(description);
        sb.append(", proofPics=").append(proofPics);
        sb.append(", handleNote=").append(handleNote);
        sb.append(", handleMan=").append(handleMan);
        sb.append(", receiveMan=").append(receiveMan);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", receiveNote=").append(receiveNote);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}