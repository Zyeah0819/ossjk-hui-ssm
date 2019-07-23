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

	/**
	 * 记录上次登录的时间
	 * @param username
	 * @return
	 */
	int logintime(String username);

	/**分页显示数据，带查询条件
	 *
	 * @param page
	 * @param username
	 * @return
	 */
	Page<User> selectPage(Page page,String username);

	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	int batchDelete(Integer[] ids);

}
