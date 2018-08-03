package com.mmall.service.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mmall.common.Const;
import com.mmall.common.ResponseCode;
import com.mmall.common.ServerResponse;
import com.mmall.dao.MmallCategoryMapper;
import com.mmall.pojo.MmallCategory;
import com.mmall.pojo.MmallUser;
import com.mmall.service.ICategoryService;
import com.mmall.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Created by houfalv on 2018/7/16.
 */
@Service(value = "iCategoryService")
public class ICategoryServiceImpl implements ICategoryService {
    @Autowired
    private IUserService iUserService;

    @Autowired
    private MmallCategoryMapper mmallCategoryMapper;

    /**
     * 获取品类子节点(平级)
     *
     * @param httpSession
     * @param categoryId
     * @return
     */
    @Override
    public ServerResponse<List<MmallCategory>> getCategory(HttpSession httpSession, String categoryId) {
        Map<String, Object> resultMap = iUserService.checkLogin(httpSession);
        boolean isLogin = (boolean) resultMap.get(Const.IS_LOGIN);

        if (isLogin) {
            MmallUser mmallUser = (MmallUser) resultMap.get(Const.CURRENT_USER);
            if (iUserService.checkAdminRole(mmallUser)) {
                //获取品类子节点(平级)
                List<MmallCategory> mmallCategoryList = mmallCategoryMapper.selectCategoryChildrenByParentId(categoryId);

                if (mmallCategoryList.size()>0) {
                    return ServerResponse.createBySuccess(mmallCategoryList);
                }
                return ServerResponse.createByErrorMessage("未找到该品类");
            }
            return ServerResponse.createByErrorMessage("用户权限不足，需要管理员权限");
        }
        return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), "用户未登录,请登录");
    }

    /**
     * 添加品类
     *
     * @param httpSession
     * @param parentId
     * @param paramName
     * @return
     */
    @Override
    public ServerResponse<String> addCategory(HttpSession httpSession, String parentId, String paramName) {

        Map<String, Object> resultMap = iUserService.checkLogin(httpSession);
        boolean isLogin = (boolean) resultMap.get(Const.IS_LOGIN);
        if (isLogin){
            MmallUser mmallUser = (MmallUser) resultMap.get(Const.CURRENT_USER);
            if (iUserService.checkAdminRole(mmallUser)) {
                int resultCount = mmallCategoryMapper.selectParentType(parentId);
                if (resultCount>0) {
                    if (!(StringUtils.isBlank(parentId) || StringUtils.isBlank(paramName))){
                        MmallCategory mmallCategory = new MmallCategory();
                        mmallCategory.setName(paramName);
                        mmallCategory.setParentId(Integer.valueOf(parentId));
                        mmallCategory.setCreateTime(new Date());
                        mmallCategory.setUpdateTime(new Date());
                        mmallCategory.setStatus(true);
                        int insertCount = mmallCategoryMapper.insertSelective(mmallCategory);
                        if (insertCount>0) {
                            return ServerResponse.createBySuccessMessage("添加品类成功");
                        }
                    }
                    return ServerResponse.createByErrorMessage("添加品类失败");
                }
                return ServerResponse.createByErrorMessage("品类不存在，添加失败");
            }
            return ServerResponse.createByErrorMessage("用户权限不足，需要管理员权限");
        }
        return ServerResponse.createByErrorMessage("用户未登录,请登录");

    }

    /**
     * 更新品类名称
     *
     * @param httpSession
     * @param categoryId
     * @param categoryName
     * @return
     */
    @Override
    public ServerResponse<String> setCategoryName(HttpSession httpSession, final String categoryId, String categoryName) {
        Map<String, Object> resultMap = iUserService.checkLogin(httpSession);
        boolean isLogin = (boolean) resultMap.get(Const.IS_LOGIN);

        if (isLogin) {
            MmallUser mmallUser = (MmallUser) resultMap.get(Const.CURRENT_USER);
            if (iUserService.checkAdminRole(mmallUser)) {
                int resultCount = mmallCategoryMapper.validateCategory(new HashMap<String,Object>(){
                    {
                        put("id",categoryId);
                    }
                });

                if (resultCount>0) {
                    int rowCount =  mmallCategoryMapper.setCategoryName(categoryId,categoryName);
                    if (rowCount>0) {
                        return ServerResponse.createBySuccessMessage("修改成功");
                    }
                }
                return ServerResponse.createByErrorMessage("品类不存在");
            }
            return ServerResponse.createByErrorMessage("用户权限不足，需要管理员权限");
        }
        return ServerResponse.createByErrorMessage("用户未登录,请登录");
    }

    /**
     * 获取当前分类id 及递归子节点id
     *
     * @param httpSession
     * @param categoryId
     * @return
     */
    @Override
    public ServerResponse getDeepCategory(HttpSession httpSession, String categoryId) {
        Map<String, Object> resultMap = iUserService.checkLogin(httpSession);
        boolean isLogin = (boolean) resultMap.get(Const.IS_LOGIN);

        if (isLogin) {
            MmallUser mmallUser = (MmallUser) resultMap.get(Const.CURRENT_USER);
            boolean isAdmin = iUserService.checkAdminRole(mmallUser);
            if (isAdmin) {

                //递归获取当前分类id，及递归子节点id
                Set<MmallCategory> categorySet = Sets.newLinkedHashSet();
                findChildCategory(categorySet,categoryId);

                List<Integer> categoryIdList = Lists.newArrayList();

                //将结果集封装到List中去
                if (categoryId!=null) {
                    for (MmallCategory mmallCategory : categorySet) {
                        categoryIdList.add(mmallCategory.getId());
                    }
                }

                return ServerResponse.createBySuccess(categoryIdList);

            }
            return ServerResponse.createByErrorMessage("未授权");
        }
        return ServerResponse.createByErrorMessage("未登录");
    }

    /**
     * 算出本节点和子节点
     *
     * @param categorySet
     * @param categoryId
     */
    private void findChildCategory(Set<MmallCategory> categorySet, String categoryId) {

        MmallCategory mmallCategory = mmallCategoryMapper.selectByPrimaryKey(Integer.valueOf(categoryId));
        if (mmallCategory!=null) {
            //添加本节点
            categorySet.add(mmallCategory);
        }

        //根据传过来的品类id 查询这个id下临级的品类id
        List<MmallCategory> mmallCategoryList = mmallCategoryMapper.selectCategoryChildrenByParentId(categoryId);


        for (MmallCategory category : mmallCategoryList) {
            //对每个品类id 再进行查找，看看还有没有下一级节点
            findChildCategory(categorySet, String.valueOf(category.getId()));
        }
    }


}

