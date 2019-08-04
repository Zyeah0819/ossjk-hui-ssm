package com.ossjk.ossjkssm.system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ossjk.core.base.service.impl.BaseServiceImpl;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.system.entity.Organization;
import com.ossjk.ossjkssm.system.entity.User;
import com.ossjk.ossjkssm.system.mapper.OrganizationMapper;
import com.ossjk.ossjkssm.system.mapper.RoleMapper;
import com.ossjk.ossjkssm.system.service.OrganizationService;
import com.ossjk.ossjkssm.system.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrganizationServiceImpl extends BaseServiceImpl<OrganizationMapper, Organization> implements OrganizationService {

    @Override
    public List<Organization> selectAll() {
        return baseMapper.selectAll();
    }

    @Override
    public Page<Organization> selectPage(Page page, Map map) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        page.toPage(new PageInfo(baseMapper.selectPage(map)));
        return page;
    }

    @Override
    public int batchDelete(Integer[] ids) {
        return baseMapper.batchDelete(ids);
    }
}
