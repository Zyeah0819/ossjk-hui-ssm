package com.ossjk.ossjkssm.system.mapper;

import com.ossjk.core.base.mapper.BaseMapper;
import com.ossjk.ossjkssm.system.entity.Role;

import java.util.List;

public interface RoleMapper extends BaseMapper<Role> {
    /**
     * 查询role表的所有数据
     * @return
     */
    List<Role> selectAll();
}
