package com.macro.mall.demo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/**
 * 品牌传递参数
 */
@Schema(description = "PmsBrandDto")
public class PmsBrandDto {
    @Schema(description = "品牌名称")
    @NotNull(message = "名称不能为空")
    private String name;
    @Schema(description = "品牌首字母")
    @NotNull(message = "首字母不能为空")
    private String firstLetter;
    @Schema(description = "排序字段")
    @Min(value = 0, message = "排序最小为0")
    private Integer sort;
    @Schema(description = "是否为厂家制造商")
    private Integer factoryStatus;
    @Schema(description = "是否进行显示")
    private Integer showStatus;
    @Schema(description = "品牌logo")
    private String logo;
    @Schema(description = "品牌大图")
    private String bigPic;
    @Schema(description = "品牌故事")
    private String brandStory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    public String getBrandStory() {
        return brandStory;
    }

    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory;
    }
}
