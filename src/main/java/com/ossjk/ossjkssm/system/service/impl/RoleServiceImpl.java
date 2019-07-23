package com.ossjk.ossjkssm.system.service.impl;

import com.ossjk.core.base.service.impl.BaseServiceImpl;
import com.ossjk.ossjkssm.system.entity.Role;
import com.ossjk.ossjkssm.system.mapper.RoleMapper;
import com.ossjk.ossjkssm.system.mapper.UserMapper;
import com.ossjk.ossjkssm.system.service.RoleService;
import com.ossjk.ossjkssm.system.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl extends BaseServiceImpl<RoleMapper, Role> implements RoleService {


    @Override
    public List<Role> selectAll() {
        return baseMapper.selectAll();
    }
}
