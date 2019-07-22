package com.ossjk.ossjkssm.system.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.ossjk.core.base.service.BaseService;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.system.entity.User;

public interface UserService extends BaseService<User> {
    /**
     * 登录
     * @param username
     * @return
     */
	User selectByName(String username);

	Page<User> selectPage(Page page,String username);

	int batchDelete(Integer[] ids);

}
