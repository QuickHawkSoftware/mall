package com.macro.mall.controller;

import com.macro.mall.bo.CommonResult;
import com.macro.mall.dto.PmsBrandParam;
import com.macro.mall.service.PmsBrandService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 品牌功能 Controller
 */
@Controller
@RequestMapping("/brand")
@Tag(name = "PmsBrand", description = "PmsBrandController")
public class PmsBrandController {
  @Autowired
  private PmsBrandService pmsBrandService;

  private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

  @Operation(summary = "获取全部品牌列表")
  @RequestMapping(value = "/listAll", method = RequestMethod.GET)
  @ResponseBody
  public Object getBrandList() {
    return new CommonResult().success(pmsBrandService.listAllBrand());
  }

  @Operation(summary = "添加品牌")
  @RequestMapping(value = "/create", method = RequestMethod.POST)
  @ResponseBody
  public Object createBrand(@Validated @RequestBody PmsBrandParam pmsBrand, BindingResult result) {
    if (result.hasErrors()) {
      return new CommonResult().validateFailed(result.getFieldError().getDefaultMessage());
    }
    CommonResult commonResult;
    int count = pmsBrandService.createBrand(pmsBrand);
    if (count == 1) {
      commonResult = new CommonResult().success(pmsBrand);
      LOGGER.debug("createBrand success:{}", pmsBrand);
    } else {
      commonResult = new CommonResult().failed();
      LOGGER.debug("createBrand failed:{}", pmsBrand);
    }
    return commonResult;
  }

  @Operation(summary = "更新品牌")
  @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
  @ResponseBody
  public Object updateBrand(@PathVariable("id") Long id, @Validated @RequestBody PmsBrandParam pmsBrandParam, BindingResult result) {
    if (result.hasErrors()) {
      return new CommonResult().validateFailed(result.getFieldError().getDefaultMessage());
    }
    CommonResult commonResult;
    int count = pmsBrandService.updateBrand(id, pmsBrandParam);
    if (count == 1) {
      commonResult = new CommonResult().success(pmsBrandParam);
      LOGGER.debug("updateBrand success:{}", pmsBrandParam);
    } else {
      commonResult = new CommonResult().failed();
      LOGGER.debug("updateBrand failed:{}", pmsBrandParam);
    }
    return commonResult;
  }

  @Operation(summary = "删除品牌")
  @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
  @ResponseBody
  public Object deleteBrand(@PathVariable("id") Long id) {
    int count = pmsBrandService.deleteBrand(id);
    if (count == 1) {
      LOGGER.debug("deleteBrand success :id={}", id);
      return new CommonResult().success(null);
    } else {
      LOGGER.debug("deleteBrand failed :id={}", id);
      return new CommonResult().failed();
    }
  }

  @Operation(summary = "分页获取品牌列表")
  @RequestMapping(value = "/list", method = RequestMethod.GET)
  @ResponseBody
  public Object listBrand(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                          @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
    return new CommonResult().pageSuccess(pmsBrandService.listBrand(pageNum, pageSize));
  }

  @Operation(summary = "根据编号查询品牌信息")
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  @ResponseBody
  public Object getBrand(@PathVariable("id") Long id) {
    return new CommonResult().success(pmsBrandService.getBrand(id));
  }
}
