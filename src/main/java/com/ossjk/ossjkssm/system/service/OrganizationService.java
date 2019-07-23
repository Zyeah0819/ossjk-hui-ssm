package com.ossjk.ossjkssm.system.service;

import com.ossjk.core.base.service.BaseService;
import com.ossjk.ossjkssm.system.entity.Organization;

import java.util.List;

public interface OrganizationService extends BaseService<Organization> {
    /**
     * 查询所有数据
     * @return
     */
    List<Organization> selectAll();
}
