package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.MmallCategory;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by houfalv on 2018/7/16.
 */
public interface ICategoryService {
    /**
     * 获取品类子节点(平级)
     * @param categoryId
     * @return
     */
    ServerResponse<List<MmallCategory>> getCategory(HttpSession httpSession, String categoryId);

    /**
     * 添加品类
     * @param httpSession
     * @param parentId
     * @param paramName
     * @return
     */
    ServerResponse<String> addCategory(HttpSession httpSession, String parentId, String paramName);

    /**
     * 更新品类名称
     * @param httpSession
     * @param categoryId
     * @param categoryName
     * @return
     */
    ServerResponse<String> setCategoryName(HttpSession httpSession, String categoryId, String categoryName);

    /**
     * 获取当前分类id 及递归子节点id
     * @param httpSession
     * @param categoryId
     * @return
     */
    ServerResponse getDeepCategory(HttpSession httpSession, String categoryId);
}
