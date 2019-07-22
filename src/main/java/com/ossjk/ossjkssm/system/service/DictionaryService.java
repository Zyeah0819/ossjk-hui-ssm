package com.ossjk.ossjkssm.system.service;

import com.ossjk.core.base.service.BaseService;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.system.entity.Dictionary;
import com.ossjk.ossjkssm.system.entity.User;

import java.util.List;

public interface DictionaryService extends BaseService<Dictionary> {
    Page<Dictionary> selectPage(Page page,String dkey);
    int batchDelete(Integer[] ids);
}
