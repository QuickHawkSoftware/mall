package com.macro.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.dto.PmsBrandDto;
import com.macro.mall.service.PmsBrandService;
import com.macro.mall.mapper.PmsBrandMapper;
import com.macro.mall.model.PmsBrand;

import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmsBrandServiceImpl implements PmsBrandService {
  @Autowired
  private PmsBrandMapper brandMapper;

  @Override
  public List<PmsBrand> listAllBrand() {
    return brandMapper.select(SelectDSLCompleter.allRows());
  }

  @Override
  public int createBrand(PmsBrandDto pmsBrandDto) {
    PmsBrand pmsBrand = new PmsBrand();
    BeanUtils.copyProperties(pmsBrandDto, pmsBrand);
    return brandMapper.insertSelective(pmsBrand);
  }

  @Override
  public int updateBrand(Long id, PmsBrandDto pmsBrandDto) {
    PmsBrand pmsBrand = new PmsBrand();
    BeanUtils.copyProperties(pmsBrandDto, pmsBrand);
    pmsBrand.setId(id);
    return brandMapper.updateByPrimaryKeySelective(pmsBrand);
  }

  @Override
  public int deleteBrand(Long id) {
    return brandMapper.deleteByPrimaryKey(id);
  }

  @Override
  public List<PmsBrand> listBrand(int pageNum, int pageSize) {
    PageHelper.startPage(pageNum, pageSize);
    return brandMapper.select(SelectDSLCompleter.allRows());
  }

  @Override
  public PmsBrand getBrand(Long id) {
    return brandMapper.selectByPrimaryKey(id).orElse(null);
  }
}
