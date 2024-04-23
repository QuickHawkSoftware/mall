package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;

public class PmsAlbumPic implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long albumId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String pic;

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
    public Long getAlbumId() {
        return albumId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPic() {
        return pic;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", albumId=").append(albumId);
        sb.append(", pic=").append(pic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}