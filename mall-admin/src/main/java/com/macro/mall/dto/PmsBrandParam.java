package com.macro.mall.dto;

import com.macro.mall.validator.FlagValidator;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * 品牌传递参数
 */
@Schema(description = "PmsBrandParam")
@Data
public class PmsBrandParam {
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
  @FlagValidator(value = {"0", "1"}, message = "厂家状态不正确")
  private Integer factoryStatus;

  @Schema(description = "是否进行显示")
  @FlagValidator(value = {"0", "1"}, message = "显示状态不正确")
  private Integer showStatus;

  @Schema(description = "品牌logo")
  private String logo;

  @Schema(description = "品牌大图")
  private String bigPic;

  @Schema(description = "品牌故事")
  private String brandStory;

}
