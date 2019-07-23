package com.ossjk.ossjkssm.system.mapper;

import com.ossjk.core.base.mapper.BaseMapper;
import com.ossjk.ossjkssm.system.entity.Organization;

import java.util.List;

public interface OrganizationMapper extends BaseMapper<Organization> {
    /**
     * 查询organization表的所有数据
     * @return
     */
    List<Organization> selectAll();
}
