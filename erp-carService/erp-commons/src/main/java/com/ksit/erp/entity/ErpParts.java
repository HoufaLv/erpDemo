package com.ksit.erp.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * erp_parts
 * @author 
 */
public class ErpParts implements Serializable {
    /**
     * ID
     */
    private Integer id;

    /**
     * 备件编号
     */
    private String partsNo;

    /**
     * 备件名称
     */
    private String partsName;

    /**
     * 进价
     */
    private BigDecimal partsInPrice;

    /**
     * 售价
     */
    private BigDecimal partsSalePrice;

    /**
     * 库存
     */
    private Integer partsInventory;

    /**
     * 类型
     */
    private Integer partsTypeId;

    /**
     * 进货地址
     */
    private String partsAddress;

    /**
     * 配件照片
     */
    private String partsPicFront;

    private Date partsRegisterTime;

    private Integer partsVenderId;

    private Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getPartsVenderId() {
        return partsVenderId;
    }

    public void setPartsVenderId(Integer partsVenderId) {
        this.partsVenderId = partsVenderId;
    }

    public ErpPartsType getErpPartsType() {
        return erpPartsType;
    }

    public void setErpPartsType(ErpPartsType erpPartsType) {
        this.erpPartsType = erpPartsType;
    }

    /**
     * 配件对应的类型
     */

    private ErpPartsType erpPartsType;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPartsNo() {
        return partsNo;
    }

    public void setPartsNo(String partsNo) {
        this.partsNo = partsNo;
    }

    public String getPartsName() {
        return partsName;
    }

    public void setPartsName(String partsName) {
        this.partsName = partsName;
    }

    public BigDecimal getPartsInPrice() {
        return partsInPrice;
    }

    public void setPartsInPrice(BigDecimal partsInPrice) {
        this.partsInPrice = partsInPrice;
    }

    public BigDecimal getPartsSalePrice() {
        return partsSalePrice;
    }

    public void setPartsSalePrice(BigDecimal partsSalePrice) {
        this.partsSalePrice = partsSalePrice;
    }

    public Integer getPartsInventory() {
        return partsInventory;
    }

    public void setPartsInventory(Integer partsInventory) {
        this.partsInventory = partsInventory;
    }

    public Integer getPartsTypeId() {
        return partsTypeId;
    }

    public void setPartsTypeId(Integer partsTypeId) {
        this.partsTypeId = partsTypeId;
    }

    public String getPartsAddress() {
        return partsAddress;
    }

    public void setPartsAddress(String partsAddress) {
        this.partsAddress = partsAddress;
    }

    public String getPartsPicFront() {
        return partsPicFront;
    }

    public void setPartsPicFront(String partsPicFront) {
        this.partsPicFront = partsPicFront;
    }

    public Date getPartsRegisterTime() {
        return partsRegisterTime;
    }

    public void setPartsRegisterTime(Date partsRegisterTime) {
        this.partsRegisterTime = partsRegisterTime;
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
        ErpParts other = (ErpParts) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPartsNo() == null ? other.getPartsNo() == null : this.getPartsNo().equals(other.getPartsNo()))
            && (this.getPartsName() == null ? other.getPartsName() == null : this.getPartsName().equals(other.getPartsName()))
            && (this.getPartsInPrice() == null ? other.getPartsInPrice() == null : this.getPartsInPrice().equals(other.getPartsInPrice()))
            && (this.getPartsSalePrice() == null ? other.getPartsSalePrice() == null : this.getPartsSalePrice().equals(other.getPartsSalePrice()))
            && (this.getPartsInventory() == null ? other.getPartsInventory() == null : this.getPartsInventory().equals(other.getPartsInventory()))
            && (this.getPartsTypeId() == null ? other.getPartsTypeId() == null : this.getPartsTypeId().equals(other.getPartsTypeId()))
            && (this.getPartsAddress() == null ? other.getPartsAddress() == null : this.getPartsAddress().equals(other.getPartsAddress()))
            && (this.getPartsPicFront() == null ? other.getPartsPicFront() == null : this.getPartsPicFront().equals(other.getPartsPicFront()))
            && (this.getPartsRegisterTime() == null ? other.getPartsRegisterTime() == null : this.getPartsRegisterTime().equals(other.getPartsRegisterTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPartsNo() == null) ? 0 : getPartsNo().hashCode());
        result = prime * result + ((getPartsName() == null) ? 0 : getPartsName().hashCode());
        result = prime * result + ((getPartsInPrice() == null) ? 0 : getPartsInPrice().hashCode());
        result = prime * result + ((getPartsSalePrice() == null) ? 0 : getPartsSalePrice().hashCode());
        result = prime * result + ((getPartsInventory() == null) ? 0 : getPartsInventory().hashCode());
        result = prime * result + ((getPartsTypeId() == null) ? 0 : getPartsTypeId().hashCode());
        result = prime * result + ((getPartsAddress() == null) ? 0 : getPartsAddress().hashCode());
        result = prime * result + ((getPartsPicFront() == null) ? 0 : getPartsPicFront().hashCode());
        result = prime * result + ((getPartsRegisterTime() == null) ? 0 : getPartsRegisterTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", partsNo=").append(partsNo);
        sb.append(", partsName=").append(partsName);
        sb.append(", partsInPrice=").append(partsInPrice);
        sb.append(", partsSalePrice=").append(partsSalePrice);
        sb.append(", partsInventory=").append(partsInventory);
        sb.append(", partsTypeId=").append(partsTypeId);
        sb.append(", partsAddress=").append(partsAddress);
        sb.append(", partsPicFront=").append(partsPicFront);
        sb.append(", partsRegisterTime=").append(partsRegisterTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}