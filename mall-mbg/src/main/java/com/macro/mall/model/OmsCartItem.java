package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OmsCartItem implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long productSkuId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long memberId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer quantity;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal price;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productPic;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productSubTitle;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productSkuCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String memberNickname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createDate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date modifyDate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer deleteStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long productCategoryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productBrand;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productSn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productAttr;

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
    public Long getProductSkuId() {
        return productSkuId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductSkuId(Long productSkuId) {
        this.productSkuId = productSkuId;
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
    public Integer getQuantity() {
        return quantity;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getPrice() {
        return price;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPrice(BigDecimal price) {
        this.price = price;
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
    public String getProductSubTitle() {
        return productSubTitle;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductSubTitle(String productSubTitle) {
        this.productSubTitle = productSubTitle;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProductSkuCode() {
        return productSkuCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMemberNickname() {
        return memberNickname;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCreateDate() {
        return createDate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getModifyDate() {
        return modifyDate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
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
    public String getProductSn() {
        return productSn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProductAttr() {
        return productAttr;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
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
        sb.append(", productSkuId=").append(productSkuId);
        sb.append(", memberId=").append(memberId);
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append(", productPic=").append(productPic);
        sb.append(", productName=").append(productName);
        sb.append(", productSubTitle=").append(productSubTitle);
        sb.append(", productSkuCode=").append(productSkuCode);
        sb.append(", memberNickname=").append(memberNickname);
        sb.append(", createDate=").append(createDate);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", productBrand=").append(productBrand);
        sb.append(", productSn=").append(productSn);
        sb.append(", productAttr=").append(productAttr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}