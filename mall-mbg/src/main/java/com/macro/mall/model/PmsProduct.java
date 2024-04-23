package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PmsProduct implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long brandId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long productCategoryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long feightTemplateId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long productAttributeCategoryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String pic;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productSn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer deleteStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer publishStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer newStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer recommandStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer verifyStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer sale;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal price;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal promotionPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer giftGrowth;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer giftPoint;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer usePointLimit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String subTitle;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal originalPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer stock;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer lowStock;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String unit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal weight;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer previewStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String serviceIds;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String keywords;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String note;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String albumPics;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String detailTitle;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date promotionStartTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date promotionEndTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer promotionPerLimit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer promotionType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String brandName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String productCategoryName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String description;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String detailDesc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String detailHtml;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String detailMobileHtml;

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
    public Long getBrandId() {
        return brandId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
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
    public Long getFeightTemplateId() {
        return feightTemplateId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFeightTemplateId(Long feightTemplateId) {
        this.feightTemplateId = feightTemplateId;
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
    public String getPic() {
        return pic;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPic(String pic) {
        this.pic = pic;
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
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPublishStatus() {
        return publishStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getNewStatus() {
        return newStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNewStatus(Integer newStatus) {
        this.newStatus = newStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getRecommandStatus() {
        return recommandStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRecommandStatus(Integer recommandStatus) {
        this.recommandStatus = recommandStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
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
    public Integer getSale() {
        return sale;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSale(Integer sale) {
        this.sale = sale;
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
    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getGiftPoint() {
        return giftPoint;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGiftPoint(Integer giftPoint) {
        this.giftPoint = giftPoint;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getUsePointLimit() {
        return usePointLimit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUsePointLimit(Integer usePointLimit) {
        this.usePointLimit = usePointLimit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSubTitle() {
        return subTitle;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getStock() {
        return stock;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getLowStock() {
        return lowStock;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUnit() {
        return unit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getWeight() {
        return weight;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPreviewStatus() {
        return previewStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPreviewStatus(Integer previewStatus) {
        this.previewStatus = previewStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getServiceIds() {
        return serviceIds;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setServiceIds(String serviceIds) {
        this.serviceIds = serviceIds;
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
    public String getNote() {
        return note;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNote(String note) {
        this.note = note;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAlbumPics() {
        return albumPics;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDetailTitle() {
        return detailTitle;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDetailTitle(String detailTitle) {
        this.detailTitle = detailTitle;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getPromotionStartTime() {
        return promotionStartTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPromotionStartTime(Date promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getPromotionEndTime() {
        return promotionEndTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPromotionEndTime(Date promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPromotionPerLimit() {
        return promotionPerLimit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPromotionPerLimit(Integer promotionPerLimit) {
        this.promotionPerLimit = promotionPerLimit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPromotionType() {
        return promotionType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getBrandName() {
        return brandName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProductCategoryName() {
        return productCategoryName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
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
    public String getDetailDesc() {
        return detailDesc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDetailHtml() {
        return detailHtml;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDetailHtml(String detailHtml) {
        this.detailHtml = detailHtml;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDetailMobileHtml() {
        return detailMobileHtml;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDetailMobileHtml(String detailMobileHtml) {
        this.detailMobileHtml = detailMobileHtml;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", brandId=").append(brandId);
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", feightTemplateId=").append(feightTemplateId);
        sb.append(", productAttributeCategoryId=").append(productAttributeCategoryId);
        sb.append(", name=").append(name);
        sb.append(", pic=").append(pic);
        sb.append(", productSn=").append(productSn);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", publishStatus=").append(publishStatus);
        sb.append(", newStatus=").append(newStatus);
        sb.append(", recommandStatus=").append(recommandStatus);
        sb.append(", verifyStatus=").append(verifyStatus);
        sb.append(", sort=").append(sort);
        sb.append(", sale=").append(sale);
        sb.append(", price=").append(price);
        sb.append(", promotionPrice=").append(promotionPrice);
        sb.append(", giftGrowth=").append(giftGrowth);
        sb.append(", giftPoint=").append(giftPoint);
        sb.append(", usePointLimit=").append(usePointLimit);
        sb.append(", subTitle=").append(subTitle);
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", stock=").append(stock);
        sb.append(", lowStock=").append(lowStock);
        sb.append(", unit=").append(unit);
        sb.append(", weight=").append(weight);
        sb.append(", previewStatus=").append(previewStatus);
        sb.append(", serviceIds=").append(serviceIds);
        sb.append(", keywords=").append(keywords);
        sb.append(", note=").append(note);
        sb.append(", albumPics=").append(albumPics);
        sb.append(", detailTitle=").append(detailTitle);
        sb.append(", promotionStartTime=").append(promotionStartTime);
        sb.append(", promotionEndTime=").append(promotionEndTime);
        sb.append(", promotionPerLimit=").append(promotionPerLimit);
        sb.append(", promotionType=").append(promotionType);
        sb.append(", brandName=").append(brandName);
        sb.append(", productCategoryName=").append(productCategoryName);
        sb.append(", description=").append(description);
        sb.append(", detailDesc=").append(detailDesc);
        sb.append(", detailHtml=").append(detailHtml);
        sb.append(", detailMobileHtml=").append(detailMobileHtml);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}