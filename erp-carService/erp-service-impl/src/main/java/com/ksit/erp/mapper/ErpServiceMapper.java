package com.ksit.erp.mapper;

import com.ksit.erp.entity.ErpService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ErpServiceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ErpService record);

    int insertSelective(ErpService record);

    ErpService selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ErpService record);

    int updateByPrimaryKey(ErpService record);

    /**
     * 根据服务编号查询
     * @param serviceNo
     * @return
     */
    int selectByServiceNo(Integer serviceNo);

    List<ErpService> listService();
}