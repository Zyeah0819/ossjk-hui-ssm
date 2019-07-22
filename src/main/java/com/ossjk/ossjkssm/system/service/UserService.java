package com.ossjk.ossjkssm.system.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.ossjk.core.base.service.BaseService;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.system.entity.User;

public interface UserService extends BaseService<User> {
    /**
     * 登录
     * @param name
     * @return
     */
	User selectByName(String name);

	Page<User> selectPage(Page page,String name);

	int batchDelete(Integer[] ids);

}
