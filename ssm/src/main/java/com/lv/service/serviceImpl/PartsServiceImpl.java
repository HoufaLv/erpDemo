package com.lv.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lv.common.Const;
import com.lv.common.ServerResponse;
import com.lv.entity.Parts;
import com.lv.entity.Type;
import com.lv.exception.ServiceException;
import com.lv.mapper.PartsMapper;
import com.lv.mapper.TypeMapper;
import com.lv.service.IPartsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by houfalv on 2018/7/24.
 */
@Service
public class PartsServiceImpl implements IPartsService {

    @Autowired
    private PartsMapper partsMapper;
    @Autowired
    private TypeMapper typeMapper;

    /**
     * 分页查询Parts
     *
     * @param pageNo
     * @return
     */
    @Override
    public ServerResponse<List<Parts>> listByPageNo(Integer pageNo) {
        if (pageNo < 1) {
            pageNo = Const.ONE;
        }

        PageHelper.startPage(pageNo, Const.DEFAULT_PAGESIZE);

        List<Parts> partsList = partsMapper.findPageWithType();

        PageInfo<Parts> partsPageInfo = new PageInfo<>(partsList);

        return ServerResponse.createBySuccess(partsPageInfo.getList());
    }

    /**
     * 根据id 查询对应的Parts 对象
     *
     * @param id
     * @return
     */
    @Override
    public ServerResponse<Parts> findPartsById(String id) {
        Parts parts = null;

        if (StringUtils.isBlank(id)) {
            return ServerResponse.createByErrorMessage("id不能为空");
        }

        try {
            parts = partsMapper.selectByPrimaryKey(Integer.valueOf(id));
            if (parts == null) {
                return ServerResponse.createByErrorMessage("不存在");
            }

            return ServerResponse.createBySuccess(parts);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return ServerResponse.createByErrorMessage("非法值");
        }

    }

    /**
     * 查询所有 Type
     *
     * @return
     */
    @Override
    public List<Type> listType() {
        return typeMapper.listType();
    }

    /**
     * 分页查询Parts 数据
     *
     * @param pageNo
     * @return
     */
    @Override
    public PageInfo<Parts> listPartsByPageNo(Integer pageNo) {
        PageHelper.startPage(pageNo,Const.DEFAULT_PAGESIZE);

        List<Parts> partsList = partsMapper.listPartsByPageNo();
        PageInfo<Parts> partsPageInfo = new PageInfo<>(partsList);

        return partsPageInfo;
    }

    /**
     * 根据 条件动态搜索，分页
     *
     * @param pageNo
     * @param partsName
     * @param inventory
     * @param partsType
     * @return
     */
    @Override
    public PageInfo<Parts> queryPartsByConditionWithPage(Integer pageNo, String partsName, Integer inventory, Integer partsType) {
        PageHelper.startPage(pageNo,Const.DEFAULT_PAGESIZE);

        Map<String,Object> queryMap = new HashMap<>();
        queryMap.put("partsName",partsName);
        queryMap.put("inventory",inventory);
        queryMap.put("partsType",partsType);

        List<Parts> partsList = partsMapper.queryPartsByConditionWithPage(queryMap);

        PageInfo<Parts> partsPageInfo = new PageInfo<>(partsList);
        return partsPageInfo;
    }


    /**
     * 添加配件
     *
     * @param parts
     */
    @Override
    public void addParts(Parts parts) {
        Map<String,Object> queryMap = new HashMap<>();
        queryMap.put("parts_no",parts.getPartsNo());

        int result = validateParts(queryMap);
        if (result>0) {
            throw new RuntimeException("商品编号不能重复");
        }

        partsMapper.insertSelective(parts);
    }

    /**
     * 动态验证配件信息
     *
     * @param queryMap
     * @return
     */
    @Override
    public int validateParts(Map<String, Object> queryMap) {
        return partsMapper.validateParts(queryMap);
    }

    /**
     * 根据id 查询对应的Parts 信息
     *
     * @param id
     * @return
     */
    @Override
    public Parts queryPartsById(Integer id) {
        return partsMapper.selectByPrimaryKey(id);
    }

}
