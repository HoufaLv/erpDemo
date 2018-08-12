package com.ksit.erp.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * erp_car
 * @author 
 */
public class ErpCar implements Serializable {
    /**
     * 车辆ID
     */
    private Integer id;

    /**
     * 车辆型号
     */
    private String carType;

    /**
     * 车牌号
     */
    private String carLicenceNo;

    /**
     * 车辆识别码
     */
    private String carNo;

    /**
     * 车辆颜色
     */
    private String carColor;

    /**
     * 行驶公里数
     */
    private String carKilometer;

    /**
     * 注册时间
     */
    private Date carCreateTime;

    /**
     * 车辆正面照片
     */
    private String carPicFront;

    /**
     * 车辆背面照片
     */
    private String carPicBack;

    /**
     * 客户ID
     */
    private Integer customerId;

    /**
     * 车辆维修次数
     */
    private Integer carFixTime;

    private ErpCustomer erpCustomer;

    public ErpCustomer getErpCustomer() {
        return erpCustomer;
    }

    public void setErpCustomer(ErpCustomer erpCustomer) {
        this.erpCustomer = erpCustomer;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarLicenceNo() {
        return carLicenceNo;
    }

    public void setCarLicenceNo(String carLicenceNo) {
        this.carLicenceNo = carLicenceNo;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarKilometer() {
        return carKilometer;
    }

    public void setCarKilometer(String carKilometer) {
        this.carKilometer = carKilometer;
    }

    public Date getCarCreateTime() {
        return carCreateTime;
    }

    public void setCarCreateTime(Date carCreateTime) {
        this.carCreateTime = carCreateTime;
    }

    public String getCarPicFront() {
        return carPicFront;
    }

    public void setCarPicFront(String carPicFront) {
        this.carPicFront = carPicFront;
    }

    public String getCarPicBack() {
        return carPicBack;
    }

    public void setCarPicBack(String carPicBack) {
        this.carPicBack = carPicBack;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCarFixTime() {
        return carFixTime;
    }

    public void setCarFixTime(Integer carFixTime) {
        this.carFixTime = carFixTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ErpCar other = (ErpCar) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCarType() == null ? other.getCarType() == null : this.getCarType().equals(other.getCarType()))
            && (this.getCarLicenceNo() == null ? other.getCarLicenceNo() == null : this.getCarLicenceNo().equals(other.getCarLicenceNo()))
            && (this.getCarNo() == null ? other.getCarNo() == null : this.getCarNo().equals(other.getCarNo()))
            && (this.getCarColor() == null ? other.getCarColor() == null : this.getCarColor().equals(other.getCarColor()))
            && (this.getCarKilometer() == null ? other.getCarKilometer() == null : this.getCarKilometer().equals(other.getCarKilometer()))
            && (this.getCarCreateTime() == null ? other.getCarCreateTime() == null : this.getCarCreateTime().equals(other.getCarCreateTime()))
            && (this.getCarPicFront() == null ? other.getCarPicFront() == null : this.getCarPicFront().equals(other.getCarPicFront()))
            && (this.getCarPicBack() == null ? other.getCarPicBack() == null : this.getCarPicBack().equals(other.getCarPicBack()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getCarFixTime() == null ? other.getCarFixTime() == null : this.getCarFixTime().equals(other.getCarFixTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCarType() == null) ? 0 : getCarType().hashCode());
        result = prime * result + ((getCarLicenceNo() == null) ? 0 : getCarLicenceNo().hashCode());
        result = prime * result + ((getCarNo() == null) ? 0 : getCarNo().hashCode());
        result = prime * result + ((getCarColor() == null) ? 0 : getCarColor().hashCode());
        result = prime * result + ((getCarKilometer() == null) ? 0 : getCarKilometer().hashCode());
        result = prime * result + ((getCarCreateTime() == null) ? 0 : getCarCreateTime().hashCode());
        result = prime * result + ((getCarPicFront() == null) ? 0 : getCarPicFront().hashCode());
        result = prime * result + ((getCarPicBack() == null) ? 0 : getCarPicBack().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getCarFixTime() == null) ? 0 : getCarFixTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", carType=").append(carType);
        sb.append(", carLicenceNo=").append(carLicenceNo);
        sb.append(", carNo=").append(carNo);
        sb.append(", carColor=").append(carColor);
        sb.append(", carKilometer=").append(carKilometer);
        sb.append(", carCreateTime=").append(carCreateTime);
        sb.append(", carPicFront=").append(carPicFront);
        sb.append(", carPicBack=").append(carPicBack);
        sb.append(", customerId=").append(customerId);
        sb.append(", carFixTime=").append(carFixTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}