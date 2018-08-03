package com.lv.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class StoreAccount implements Serializable {
    private Integer id;

    /**
     * 账户
     */
    private String storeAccountName;

    /**
     * 密码
     */
    private String storeAccountPassword;

    /**
     * 创建时间
     */
    private Date storeAccountCreateTime;

    /**
     * 更新时间
     */
    private Date storeAccountUpdateTime;

    /**
     * 状态：正常 | 过期 | 挂失
     */
    private String storeAccountState;

    private Integer ticketStoreId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoreAccountName() {
        return storeAccountName;
    }

    public void setStoreAccountName(String storeAccountName) {
        this.storeAccountName = storeAccountName;
    }

    public String getStoreAccountPassword() {
        return storeAccountPassword;
    }

    public void setStoreAccountPassword(String storeAccountPassword) {
        this.storeAccountPassword = storeAccountPassword;
    }

    public Date getStoreAccountCreateTime() {
        return storeAccountCreateTime;
    }

    public void setStoreAccountCreateTime(Date storeAccountCreateTime) {
        this.storeAccountCreateTime = storeAccountCreateTime;
    }

    public Date getStoreAccountUpdateTime() {
        return storeAccountUpdateTime;
    }

    public void setStoreAccountUpdateTime(Date storeAccountUpdateTime) {
        this.storeAccountUpdateTime = storeAccountUpdateTime;
    }

    public String getStoreAccountState() {
        return storeAccountState;
    }

    public void setStoreAccountState(String storeAccountState) {
        this.storeAccountState = storeAccountState;
    }

    public Integer getTicketStoreId() {
        return ticketStoreId;
    }

    public void setTicketStoreId(Integer ticketStoreId) {
        this.ticketStoreId = ticketStoreId;
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
        StoreAccount other = (StoreAccount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStoreAccountName() == null ? other.getStoreAccountName() == null : this.getStoreAccountName().equals(other.getStoreAccountName()))
            && (this.getStoreAccountPassword() == null ? other.getStoreAccountPassword() == null : this.getStoreAccountPassword().equals(other.getStoreAccountPassword()))
            && (this.getStoreAccountCreateTime() == null ? other.getStoreAccountCreateTime() == null : this.getStoreAccountCreateTime().equals(other.getStoreAccountCreateTime()))
            && (this.getStoreAccountUpdateTime() == null ? other.getStoreAccountUpdateTime() == null : this.getStoreAccountUpdateTime().equals(other.getStoreAccountUpdateTime()))
            && (this.getStoreAccountState() == null ? other.getStoreAccountState() == null : this.getStoreAccountState().equals(other.getStoreAccountState()))
            && (this.getTicketStoreId() == null ? other.getTicketStoreId() == null : this.getTicketStoreId().equals(other.getTicketStoreId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStoreAccountName() == null) ? 0 : getStoreAccountName().hashCode());
        result = prime * result + ((getStoreAccountPassword() == null) ? 0 : getStoreAccountPassword().hashCode());
        result = prime * result + ((getStoreAccountCreateTime() == null) ? 0 : getStoreAccountCreateTime().hashCode());
        result = prime * result + ((getStoreAccountUpdateTime() == null) ? 0 : getStoreAccountUpdateTime().hashCode());
        result = prime * result + ((getStoreAccountState() == null) ? 0 : getStoreAccountState().hashCode());
        result = prime * result + ((getTicketStoreId() == null) ? 0 : getTicketStoreId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", storeAccountName=").append(storeAccountName);
        sb.append(", storeAccountPassword=").append(storeAccountPassword);
        sb.append(", storeAccountCreateTime=").append(storeAccountCreateTime);
        sb.append(", storeAccountUpdateTime=").append(storeAccountUpdateTime);
        sb.append(", storeAccountState=").append(storeAccountState);
        sb.append(", ticketStoreId=").append(ticketStoreId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}