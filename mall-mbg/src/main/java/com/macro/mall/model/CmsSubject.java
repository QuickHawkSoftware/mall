package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.util.Date;

public class CmsSubject implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long categoryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String title;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String pic;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer productCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer recommendStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer collectCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer readCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer commentCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String albumPics;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String description;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer showStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer forwardCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String categoryName;

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
    public Long getCategoryId() {
        return categoryId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTitle() {
        return title;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTitle(String title) {
        this.title = title;
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
    public Integer getProductCount() {
        return productCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
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
    public Date getCreateTime() {
        return createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCollectCount() {
        return collectCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
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
    public Integer getCommentCount() {
        return commentCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
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
    public String getDescription() {
        return description;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDescription(String description) {
        this.description = description;
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
    public Integer getForwardCount() {
        return forwardCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setForwardCount(Integer forwardCount) {
        this.forwardCount = forwardCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCategoryName() {
        return categoryName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
        sb.append(", categoryId=").append(categoryId);
        sb.append(", title=").append(title);
        sb.append(", pic=").append(pic);
        sb.append(", productCount=").append(productCount);
        sb.append(", recommendStatus=").append(recommendStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", collectCount=").append(collectCount);
        sb.append(", readCount=").append(readCount);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", albumPics=").append(albumPics);
        sb.append(", description=").append(description);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", forwardCount=").append(forwardCount);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}