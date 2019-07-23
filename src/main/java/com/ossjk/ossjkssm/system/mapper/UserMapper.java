package com.ossjk.ossjkssm.system.mapper;

import java.io.Serializable;
import java.util.List;

import com.ossjk.core.base.mapper.BaseMapper;
import com.ossjk.ossjkssm.system.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {
	/**
	 * 登录
	 * @param username
	 * @return
	 */
	User selectByName(String username);

	/**
	 * 记录上一次登录时间
	 * @param username
	 * @return
	 */
	int logintime(String username);
	/**
	 * 查询user表数据，带条件
	 * @param username
	 * @return
	 */
    /*
    There is no getter for property named 'name' in 'class java.lang.String'
    如果出现以上报错，那就是没有加注解@Param(value = "name")。
    */
	List<User> selectAll(@Param(value = "username") String username);

	/**
	 * 根据id，批量删除数据
	 * @param ids
	 * @return
	 */
	int batchDelete(Integer[] ids);
	
	
}