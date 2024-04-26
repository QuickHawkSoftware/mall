package com.macro.mall.service.impl;

import com.macro.mall.mapper.UmsAdminDynamicSqlSupport;
import com.macro.mall.mapper.UmsAdminMapper;
import com.macro.mall.model.UmsAdmin;
import com.macro.mall.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Service
public class UmsAdminServiceImpl implements UmsAdminService {

  @Autowired
  private UmsAdminMapper adminMapper;


  @Override
  public UmsAdmin getAdminByUsername(String username) {
    return adminMapper
        .selectOne(c -> c.where(UmsAdminDynamicSqlSupport.username, isEqualTo(username)))
        .get();
  }

}
