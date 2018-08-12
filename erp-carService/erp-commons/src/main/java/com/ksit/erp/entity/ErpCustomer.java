package com.ksit.erp.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * erp_customer
 * @author 
 */
public class ErpCustomer implements Serializable {
    /**
     * 用户ID
     */
    private Integer id;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 身份证
     */
    private String customerIdCard;

    /**
     * 客户邮箱
     */
    private String customerEmail;

    /**
     * 手机号
     */
    private String customerTel;

    private Date customerUpdateTime;

    /**
     * 创建时间
     */
    private Date customerCreateTime;

    /**
     * 客户正面照片
     */
    private String customerPicFront;

    /**
     * 客户积分
     */
    private Integer customerIntegrate;

    /**
     * 客户级别
     */
    private Integer customerLevel;

    /**
     * 客户所在省
     */
    private String customerProvice;

    /**
     * 客户所在市
     */
    private String customerCity;

    /**
     * 客户所在区
     */
    private String customerRegion;

    private String customerPassword;

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }

    public Date getCustomerUpdateTime() {
        return customerUpdateTime;
    }

    public void setCustomerUpdateTime(Date customerUpdateTime) {
        this.customerUpdateTime = customerUpdateTime;
    }

    public Date getCustomerCreateTime() {
        return customerCreateTime;
    }

    public void setCustomerCreateTime(Date customerCreateTime) {
        this.customerCreateTime = customerCreateTime;
    }

    public String getCustomerPicFront() {
        return customerPicFront;
    }

    public void setCustomerPicFront(String customerPicFront) {
        this.customerPicFront = customerPicFront;
    }

    public Integer getCustomerIntegrate() {
        return customerIntegrate;
    }

    public void setCustomerIntegrate(Integer customerIntegrate) {
        this.customerIntegrate = customerIntegrate;
    }

    public Integer getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(Integer customerLevel) {
        this.customerLevel = customerLevel;
    }

    public String getCustomerProvice() {
        return customerProvice;
    }

    public void setCustomerProvice(String customerProvice) {
        this.customerProvice = customerProvice;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerRegion() {
        return customerRegion;
    }

    public void setCustomerRegion(String customerRegion) {
        this.customerRegion = customerRegion;
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
        ErpCustomer other = (ErpCustomer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getCustomerIdCard() == null ? other.getCustomerIdCard() == null : this.getCustomerIdCard().equals(other.getCustomerIdCard()))
            && (this.getCustomerEmail() == null ? other.getCustomerEmail() == null : this.getCustomerEmail().equals(other.getCustomerEmail()))
            && (this.getCustomerTel() == null ? other.getCustomerTel() == null : this.getCustomerTel().equals(other.getCustomerTel()))
            && (this.getCustomerUpdateTime() == null ? other.getCustomerUpdateTime() == null : this.getCustomerUpdateTime().equals(other.getCustomerUpdateTime()))
            && (this.getCustomerCreateTime() == null ? other.getCustomerCreateTime() == null : this.getCustomerCreateTime().equals(other.getCustomerCreateTime()))
            && (this.getCustomerPicFront() == null ? other.getCustomerPicFront() == null : this.getCustomerPicFront().equals(other.getCustomerPicFront()))
            && (this.getCustomerIntegrate() == null ? other.getCustomerIntegrate() == null : this.getCustomerIntegrate().equals(other.getCustomerIntegrate()))
            && (this.getCustomerLevel() == null ? other.getCustomerLevel() == null : this.getCustomerLevel().equals(other.getCustomerLevel()))
            && (this.getCustomerProvice() == null ? other.getCustomerProvice() == null : this.getCustomerProvice().equals(other.getCustomerProvice()))
            && (this.getCustomerCity() == null ? other.getCustomerCity() == null : this.getCustomerCity().equals(other.getCustomerCity()))
            && (this.getCustomerRegion() == null ? other.getCustomerRegion() == null : this.getCustomerRegion().equals(other.getCustomerRegion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getCustomerIdCard() == null) ? 0 : getCustomerIdCard().hashCode());
        result = prime * result + ((getCustomerEmail() == null) ? 0 : getCustomerEmail().hashCode());
        result = prime * result + ((getCustomerTel() == null) ? 0 : getCustomerTel().hashCode());
        result = prime * result + ((getCustomerUpdateTime() == null) ? 0 : getCustomerUpdateTime().hashCode());
        result = prime * result + ((getCustomerCreateTime() == null) ? 0 : getCustomerCreateTime().hashCode());
        result = prime * result + ((getCustomerPicFront() == null) ? 0 : getCustomerPicFront().hashCode());
        result = prime * result + ((getCustomerIntegrate() == null) ? 0 : getCustomerIntegrate().hashCode());
        result = prime * result + ((getCustomerLevel() == null) ? 0 : getCustomerLevel().hashCode());
        result = prime * result + ((getCustomerProvice() == null) ? 0 : getCustomerProvice().hashCode());
        result = prime * result + ((getCustomerCity() == null) ? 0 : getCustomerCity().hashCode());
        result = prime * result + ((getCustomerRegion() == null) ? 0 : getCustomerRegion().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", customerName=").append(customerName);
        sb.append(", customerIdCard=").append(customerIdCard);
        sb.append(", customerEmail=").append(customerEmail);
        sb.append(", customerTel=").append(customerTel);
        sb.append(", customerUpdateTime=").append(customerUpdateTime);
        sb.append(", customerCreateTime=").append(customerCreateTime);
        sb.append(", customerPicFront=").append(customerPicFront);
        sb.append(", customerIntegrate=").append(customerIntegrate);
        sb.append(", customerLevel=").append(customerLevel);
        sb.append(", customerProvice=").append(customerProvice);
        sb.append(", customerCity=").append(customerCity);
        sb.append(", customerRegion=").append(customerRegion);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}