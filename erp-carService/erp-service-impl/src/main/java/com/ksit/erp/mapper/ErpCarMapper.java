package com.ksit.erp.mapper;

import com.ksit.erp.entity.ErpCar;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

@Mapper
public interface ErpCarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ErpCar record);

    int insertSelective(ErpCar record);

    ErpCar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ErpCar record);

    int updateByPrimaryKey(ErpCar record);

    int validate(@Param("paramMap") Map<String,Object> paramMap);

    /**
     * 根据车牌号查找车辆
     * @param licenceNo
     * @return
     */
    ErpCar selectByLicenceNo(String licenceNo);

    /**
     * 根据车牌号 查找对应的车辆和车主信息
     * @param licenceNo
     * @return
     */
    ErpCar queryCarWithCustomerByLicenceNo(String licenceNo);
}