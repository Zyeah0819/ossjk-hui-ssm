package com.ossjk.ossjkssm.system.service;

import java.util.List;
import java.util.Map;

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
     * 登录时间和ip
     * @param username
     * @param loginip
     * @return
     */
/*	int loginipAndtime(String username,String loginip);*/

	/**
	 * 登录时间和ip，map实现
	 * @param map
	 * @return
	 */
	int loginipAndtime(Map map);

	/**分页显示数据，带查询条件
	 *
	 * @param page
	 * @param username
	 * @return
	 */
/*	Page<User> selectPage(Page page,String username,Integer ogid);*/

	/**
	 * 用map函数传参查询
	 * @param page
	 * @param map
	 * @return
	 */
	Page<User> selectPage(Page page, Map map);

	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	int batchDelete(Integer[] ids);

}
