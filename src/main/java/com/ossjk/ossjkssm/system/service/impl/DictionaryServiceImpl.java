package com.ossjk.ossjkssm.system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ossjk.core.base.service.impl.BaseServiceImpl;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.system.entity.Dictionary;
import com.ossjk.ossjkssm.system.entity.User;
import com.ossjk.ossjkssm.system.mapper.DictionaryMapper;
import com.ossjk.ossjkssm.system.mapper.UserMapper;
import com.ossjk.ossjkssm.system.service.DictionaryService;
import com.ossjk.ossjkssm.system.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/*注释别忘啊兄dei*/
@Service
public class DictionaryServiceImpl extends BaseServiceImpl<DictionaryMapper, Dictionary> implements DictionaryService {
    @Override
    public Page<Dictionary> selectPage(Page page,String dkey) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        page.toPage(new PageInfo(baseMapper.selectAll(dkey)));
        return page;
    }

    @Override
    public int batchDelete(Integer[] ids) {
      return baseMapper.batchDelete(ids);
    }
}
