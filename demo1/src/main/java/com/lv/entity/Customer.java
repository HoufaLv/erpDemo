package com.lv.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Customer implements Serializable {
    private Long id;

    /**
     * 用户身份证
     */
    private String customerIdCard;

    /**
     * 用户姓名
     */
    private String customerName;

    /**
     * 客户性别
     */
    private String customerGender;

    /**
     * 客户年龄
     */
    private Integer customerAge;

    /**
     * 客户联系电话
     */
    private String customerTel;

    /**
     * 客户照片
     */
    private String customerPhoto;

    /**
     * 客户身份证正面照片
     */
    private String customerIdCardPhoto;

    /**
     * 客户身份证反面照片
     */
    private String customerIdCardPhotoBack;

    /**
     * 客户地址
     */
    private String customerAddress;

    /**
     * 创建时间
     */
    private Date customerCreateTime;

    /**
     * 更新时间
     */
    private Date customerUpdateTime;

    /**
     * 票id
     */
    private Long ticketId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public Integer getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(Integer customerAge) {
        this.customerAge = customerAge;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }

    public String getCustomerPhoto() {
        return customerPhoto;
    }

    public void setCustomerPhoto(String customerPhoto) {
        this.customerPhoto = customerPhoto;
    }

    public String getCustomerIdCardPhoto() {
        return customerIdCardPhoto;
    }

    public void setCustomerIdCardPhoto(String customerIdCardPhoto) {
        this.customerIdCardPhoto = customerIdCardPhoto;
    }

    public String getCustomerIdCardPhotoBack() {
        return customerIdCardPhotoBack;
    }

    public void setCustomerIdCardPhotoBack(String customerIdCardPhotoBack) {
        this.customerIdCardPhotoBack = customerIdCardPhotoBack;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Date getCustomerCreateTime() {
        return customerCreateTime;
    }

    public void setCustomerCreateTime(Date customerCreateTime) {
        this.customerCreateTime = customerCreateTime;
    }

    public Date getCustomerUpdateTime() {
        return customerUpdateTime;
    }

    public void setCustomerUpdateTime(Date customerUpdateTime) {
        this.customerUpdateTime = customerUpdateTime;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
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
        Customer other = (Customer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCustomerIdCard() == null ? other.getCustomerIdCard() == null : this.getCustomerIdCard().equals(other.getCustomerIdCard()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getCustomerGender() == null ? other.getCustomerGender() == null : this.getCustomerGender().equals(other.getCustomerGender()))
            && (this.getCustomerAge() == null ? other.getCustomerAge() == null : this.getCustomerAge().equals(other.getCustomerAge()))
            && (this.getCustomerTel() == null ? other.getCustomerTel() == null : this.getCustomerTel().equals(other.getCustomerTel()))
            && (this.getCustomerPhoto() == null ? other.getCustomerPhoto() == null : this.getCustomerPhoto().equals(other.getCustomerPhoto()))
            && (this.getCustomerIdCardPhoto() == null ? other.getCustomerIdCardPhoto() == null : this.getCustomerIdCardPhoto().equals(other.getCustomerIdCardPhoto()))
            && (this.getCustomerIdCardPhotoBack() == null ? other.getCustomerIdCardPhotoBack() == null : this.getCustomerIdCardPhotoBack().equals(other.getCustomerIdCardPhotoBack()))
            && (this.getCustomerAddress() == null ? other.getCustomerAddress() == null : this.getCustomerAddress().equals(other.getCustomerAddress()))
            && (this.getCustomerCreateTime() == null ? other.getCustomerCreateTime() == null : this.getCustomerCreateTime().equals(other.getCustomerCreateTime()))
            && (this.getCustomerUpdateTime() == null ? other.getCustomerUpdateTime() == null : this.getCustomerUpdateTime().equals(other.getCustomerUpdateTime()))
            && (this.getTicketId() == null ? other.getTicketId() == null : this.getTicketId().equals(other.getTicketId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCustomerIdCard() == null) ? 0 : getCustomerIdCard().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getCustomerGender() == null) ? 0 : getCustomerGender().hashCode());
        result = prime * result + ((getCustomerAge() == null) ? 0 : getCustomerAge().hashCode());
        result = prime * result + ((getCustomerTel() == null) ? 0 : getCustomerTel().hashCode());
        result = prime * result + ((getCustomerPhoto() == null) ? 0 : getCustomerPhoto().hashCode());
        result = prime * result + ((getCustomerIdCardPhoto() == null) ? 0 : getCustomerIdCardPhoto().hashCode());
        result = prime * result + ((getCustomerIdCardPhotoBack() == null) ? 0 : getCustomerIdCardPhotoBack().hashCode());
        result = prime * result + ((getCustomerAddress() == null) ? 0 : getCustomerAddress().hashCode());
        result = prime * result + ((getCustomerCreateTime() == null) ? 0 : getCustomerCreateTime().hashCode());
        result = prime * result + ((getCustomerUpdateTime() == null) ? 0 : getCustomerUpdateTime().hashCode());
        result = prime * result + ((getTicketId() == null) ? 0 : getTicketId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", customerIdCard=").append(customerIdCard);
        sb.append(", customerName=").append(customerName);
        sb.append(", customerGender=").append(customerGender);
        sb.append(", customerAge=").append(customerAge);
        sb.append(", customerTel=").append(customerTel);
        sb.append(", customerPhoto=").append(customerPhoto);
        sb.append(", customerIdCardPhoto=").append(customerIdCardPhoto);
        sb.append(", customerIdCardPhotoBack=").append(customerIdCardPhotoBack);
        sb.append(", customerAddress=").append(customerAddress);
        sb.append(", customerCreateTime=").append(customerCreateTime);
        sb.append(", customerUpdateTime=").append(customerUpdateTime);
        sb.append(", ticketId=").append(ticketId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}