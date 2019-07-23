package com.ossjk.ossjkssm.system.controller;

import com.ossjk.core.base.controller.BaseController;
import com.ossjk.core.vo.AjaxReturn;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.common.Constant;
import com.ossjk.ossjkssm.system.entity.Dictionary;
import com.ossjk.ossjkssm.system.entity.User;
import com.ossjk.ossjkssm.system.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/system/dictionary")
public class DictionaryContrller extends BaseController {

    @Autowired
    private DictionaryService dictionaryService;


    /**
     * 列表
     */
    @RequestMapping("/list")
    public String list(String dkey,Page page, ModelMap map) {
        map.put("dkey", dkey);
        map.put("page", dictionaryService.selectPage(page,dkey));
        return "system/dictionary/list";
    }
    /**
     * 去增加
     */
    @RequestMapping("/toInsert")
    public String toInsert() {
        return "system/dictionary/edit";
    }

    /**
     * 去更新
     */
    @RequestMapping("/toUpdate")
    public String toUpdate(Integer id, ModelMap map) {
        map.put("record", dictionaryService.selectByPrimaryKey(id));
        return "system/dictionary/edit";
    }


    /**
     * 增加
     */
    @RequestMapping("/insert")
    @ResponseBody
    public Object insert(Dictionary dictionary) {
        if (dictionaryService.insert(dictionary) > 0) {
            return new AjaxReturn(Constant.RETURN_CODE_SUCCESS, Constant.RETURN_MESSAGE_SUCCESS);
        } else {
            return new AjaxReturn(Constant.RETURN_CODE_ERROR, Constant.RETURN_MESSAGE_ERROR);
        }
    }

    /**
     * 更新
     */
    @RequestMapping("/update")
    @ResponseBody
    public Object update(Dictionary dictionary) {
        if (dictionaryService.updateByPrimaryKey(dictionary) > 0) {
            return new AjaxReturn(Constant.RETURN_CODE_SUCCESS, Constant.RETURN_MESSAGE_SUCCESS);
        } else {
            return new AjaxReturn(Constant.RETURN_CODE_ERROR, Constant.RETURN_MESSAGE_ERROR);
        }
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @ResponseBody
    public Object delete(Integer id) {
        if (dictionaryService.deleteByPrimaryKey(id) > 0) {
            return new AjaxReturn(Constant.RETURN_CODE_SUCCESS, Constant.RETURN_MESSAGE_SUCCESS);
        } else {
            return new AjaxReturn(Constant.RETURN_CODE_ERROR, Constant.RETURN_MESSAGE_ERROR);
        }
    }

    /**
     * 批量删除
     */
    @RequestMapping("/batchDelete")
    @ResponseBody
    public Object batchDelete(Integer[] ids) {
        if (dictionaryService.batchDelete(ids) > 0) {
            return new AjaxReturn(Constant.RETURN_CODE_SUCCESS, Constant.RETURN_MESSAGE_SUCCESS);
        } else {
            return new AjaxReturn(Constant.RETURN_CODE_ERROR, Constant.RETURN_MESSAGE_ERROR);
        }
    }
}
