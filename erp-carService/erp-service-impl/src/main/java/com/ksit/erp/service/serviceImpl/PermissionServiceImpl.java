package com.ksit.erp.service.serviceImpl;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.ksit.erp.dto.PermissionDTO;
import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.entity.Permission;
import com.ksit.erp.exception.ServiceException;
import com.ksit.erp.mapper.PermissionMapper;
import com.ksit.erp.mapper.RolePermissionMapper;
import com.ksit.erp.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by houfalv on 2018/7/27.
 */
@Service
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private PermissionMapper permissionMapper;
    @Autowired
    private RolePermissionMapper rolePermissionMapper;

    /**
     * 查询所有权限
     *
     * @return
     */
    @Override
    public List<Permission> listPermission() {
        return permissionMapper.listPermission();
    }

    /**
     * 添加权限
     * @param permission
     * @return
     */
    @Override
    public ServerResponse<String> newPermission(Permission permission) {

        int resultCount = permissionMapper.validatePermission(permission.getPermissionName());
        if (resultCount>0) {
            return ServerResponse.createByErrorMessage("权限已经存在，无法添加");
        }

        permission.setCreateTime(new Date());
        permission.setUpdateTime(new Date());

        int insert = permissionMapper.insert(permission);
        if (!(insert>0)) {
            return ServerResponse.createBySuccessMessage("添加权限失败");
        }
        return ServerResponse.createBySuccess("添加权限成功");
    }

    /**
     * 根据id 查询对应的权限信息
     *
     * @param id
     * @return
     */
    @Override
    public Permission queryPermissionById(Integer id) {
        return permissionMapper.selectByPrimaryKey(id);
    }

    /**
     * 删除权限
     *
     * @param id
     * @return
     */
    @Override
    public ServerResponse delPermission(Integer id) {
        Permission permission = permissionMapper.selectByPrimaryKey(id);
        if (permission!=null) {
            int resultCount = permissionMapper.queryHasChildNode(id);
            if (resultCount>0) {
                return ServerResponse.createByErrorMessage("该权限存在子节点，无法删除!");
            }

            //判断该权限有没有被使用
            int result = rolePermissionMapper.queryByPermissionId(id);
            if (result>0) {
                return ServerResponse.createByErrorMessage("该权限已经被使用，无法删除");
            }


            int i = permissionMapper.deleteByPrimaryKey(id);
            if (i>0) {
                return ServerResponse.createBySuccess("删除成功!");
            }
            return ServerResponse.createByErrorMessage("删除失败!");

        }
        return ServerResponse.createByErrorMessage("权限不存在，删除失败!");
    }

    /**
     * 返回排除当前权限的List
     *
     * @param id
     * @return
     */
    @Override
    public ServerResponse queryPermissionListExcludeId(Integer id) {

        Permission permission = queryPermissionById(id);

        if (permission==null) {
            return ServerResponse.createByErrorMessage("未找到权限！");
        }
        List<Permission> permissionList = listPermission();

        //递归排除当前权限和当前权限下所有的子权限
        removeChildNode(permissionList,permission);
        return ServerResponse.createBySuccess(permissionList);
    }

    /**
     * 递归去除所有的子权限
     * @param permissionList
     * @param permission
     */
    private void removeChildNode(List<Permission> permissionList, Permission permission) {
        //临时变量
        List<Permission> temp = Lists.newArrayList(permissionList);

        for (int i = 0; i < temp.size(); i++) {

            //如果我还有子节点
            if (temp.get(i).getParentId().equals(permission.getId())){
                //再次调用
                removeChildNode(permissionList,temp.get(i));
            }
        }
        //remove元素
        permissionList.remove(permission);
    }

    /**
     * 添加权限
     *
     * @param permission
     */
    @Override
    public void addPermission(Permission permission) throws ServiceException {
        int resultCount = permissionMapper.validatePermission(permission.getPermissionName());
        if (resultCount>0) {
            throw new ServiceException("权限已经存在，无法添加!");
        }

        permissionMapper.insert(permission);
    }

    /**
     * 更新权限,updateSelective
     * @param permissionDTO
     * @return
     */
    @Override
    public ServerResponse updatePermission(PermissionDTO permissionDTO) {
        Permission permission = new Permission();
        permission.setId(Integer.valueOf(permissionDTO.getId()));
        permission.setParentId(Integer.valueOf(permissionDTO.getParentId()));
        permission.setPermissionName(permissionDTO.getPermissionName());
        permission.setPermissionCode(permissionDTO.getPermissionCode());
        permission.setPermissionType(permissionDTO.getPermissionType());
        permission.setUrl(permissionDTO.getUrl());
        permission.setUpdateTime(new Date());

        //处理更新权限逻辑
        int resultCount = permissionMapper.updateByPrimaryKeySelective(permission);

        if (resultCount>0) {
            return ServerResponse.createBySuccessMessage("更新权限成功");
        }
        return ServerResponse.createByErrorMessage("更新权限失败");
    }


    /**
     * 将所有权限排序返回
     */
    @Override
    public List<Permission> findAllPermissionSort() {

        List<Permission> permissionList = listPermission();
        //组建树形结构，将parent id 一样的按照顺序组建
        //直接查出来的列表是不能使用的，因为如果新增了权限，新增的会排在最后，树形结构会打乱，要将数据排序一下再返回给前端
        List<Permission> endList = new ArrayList<>();

        //将无需集合和空集合传进去
        treeList(permissionList,endList,0);

        return endList;
    }

    /**
     * 递归排序
     * @param sourceList
     * @param endList
     * @param parentId
     */
    private void treeList(List<Permission> sourceList, List<Permission> endList, int parentId) {

        List<Permission> tempList = Lists.newArrayList(Collections2.filter(sourceList, new Predicate<Permission>() {
            @Override
            public boolean apply(Permission permission) {
                return permission.getParentId().equals(parentId);
            }
        }));

        for (Permission permission : tempList) {
            //添加Permission 就是重新组建树形结构
            endList.add(permission);
            treeList(sourceList,endList,permission.getId());
        }
    }

}
