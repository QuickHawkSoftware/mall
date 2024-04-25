package com.macro.mall.demo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * 品牌传递参数
 */
@Schema(description = "PmsBrandDto")
@Data
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

}
