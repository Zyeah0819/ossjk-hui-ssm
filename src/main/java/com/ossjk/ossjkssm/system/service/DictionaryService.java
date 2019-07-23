package com.ossjk.ossjkssm.system.service;

import com.ossjk.core.base.service.BaseService;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.system.entity.Dictionary;
import com.ossjk.ossjkssm.system.entity.User;

import java.util.List;

public interface DictionaryService extends BaseService<Dictionary> {
    /**
     * 分页显示，带查询条件
     * @param page
     * @param dkey
     * @return
     */
    Page<Dictionary> selectPage(Page page,String dkey);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int batchDelete(Integer[] ids);
}
