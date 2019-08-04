package com.ossjk.ossjkssm.system.service;

import com.ossjk.core.base.service.BaseService;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.system.entity.Organization;
import com.ossjk.ossjkssm.system.entity.User;

import java.util.List;
import java.util.Map;

public interface OrganizationService extends BaseService<Organization> {
    /**
     * 查询所有数据
     * @return
     */
    List<Organization> selectAll();
    Page<Organization> selectPage(Page page, Map map);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int batchDelete(Integer[] ids);
}
