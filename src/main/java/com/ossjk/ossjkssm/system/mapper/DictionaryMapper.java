package com.ossjk.ossjkssm.system.mapper;

import com.ossjk.core.base.mapper.BaseMapper;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.system.entity.Dictionary;
import com.ossjk.ossjkssm.system.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DictionaryMapper extends BaseMapper<Dictionary> {
    /**
     * 带条件查询所有数据
     * @param dkey
     * @return
     */
    /*注解没了不行，在SSM框架中，@Param主要是用来注解dao类中方法的参数，便于在对应的dao.xml文件中引用*/
    List<Dictionary> selectAll(@Param(value = "dkey")String dkey);

    /**
     * 根据id，批量删除
     * @param ids
     * @return
     */
    int batchDelete(Integer[] ids);
}
