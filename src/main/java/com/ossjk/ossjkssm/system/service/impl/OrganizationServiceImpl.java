package com.ossjk.ossjkssm.system.service.impl;

import com.ossjk.core.base.service.impl.BaseServiceImpl;
import com.ossjk.ossjkssm.system.entity.Organization;
import com.ossjk.ossjkssm.system.mapper.OrganizationMapper;
import com.ossjk.ossjkssm.system.mapper.RoleMapper;
import com.ossjk.ossjkssm.system.service.OrganizationService;
import com.ossjk.ossjkssm.system.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrganizationServiceImpl extends BaseServiceImpl<OrganizationMapper, Organization> implements OrganizationService {

    @Override
    public List<Organization> selectAll() {
        return baseMapper.selectAll();
    }
}
