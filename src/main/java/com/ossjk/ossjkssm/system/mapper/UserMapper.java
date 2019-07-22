package com.ossjk.ossjkssm.system.mapper;

import java.io.Serializable;
import java.util.List;

import com.ossjk.core.base.mapper.BaseMapper;
import com.ossjk.ossjkssm.system.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {

	User selectByName(String username);
    /*
    There is no getter for property named 'name' in 'class java.lang.String'
    如果出现以上报错，那就是没有加注解@Param(value = "name")。
    */
	List<User> selectAll(@Param(value = "username") String username);

	int batchDelete(Integer[] ids);
	
	
}