package com.ossjk.ossjkssm.system.service;

import com.ossjk.core.base.service.BaseService;
import com.ossjk.ossjkssm.system.entity.Role;

import java.util.List;

public interface RoleService extends BaseService<Role> {
    /**
     * 查询所有数据
     * @return
     */
    List<Role> selectAll();
}
