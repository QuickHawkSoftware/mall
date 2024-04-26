package com.macro.mall.service;

import com.macro.mall.model.UmsAdmin;

/**
 * 后台管理员接口
 */
public interface UmsAdminService {

  UmsAdmin getAdminByUsername(String username);

}
