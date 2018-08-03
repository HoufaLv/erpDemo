package com.lv.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Account implements Serializable {
    /**
     * 主键，un表示无符号，没有负数

     */
    private Integer id;

    /**
     * 账号名称
     */
    private String accountName;

    /**
     * 用户手机号
     */
    private String accountMobile;

    /**
     * 密码使用md5加密
     */
    private String accountPassword;

    /**
     * 用户创建时间
     */
    private Date accountCreateTime;

    /**
     * 账户更新时间
     */
    private Date accountUpdateTime;

    /**
     * 账号状态
     */
    private String accountState;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountMobile() {
        return accountMobile;
    }

    public void setAccountMobile(String accountMobile) {
        this.accountMobile = accountMobile;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public Date getAccountCreateTime() {
        return accountCreateTime;
    }

    public void setAccountCreateTime(Date accountCreateTime) {
        this.accountCreateTime = accountCreateTime;
    }

    public Date getAccountUpdateTime() {
        return accountUpdateTime;
    }

    public void setAccountUpdateTime(Date accountUpdateTime) {
        this.accountUpdateTime = accountUpdateTime;
    }

    public String getAccountState() {
        return accountState;
    }

    public void setAccountState(String accountState) {
        this.accountState = accountState;
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
        Account other = (Account) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccountName() == null ? other.getAccountName() == null : this.getAccountName().equals(other.getAccountName()))
            && (this.getAccountMobile() == null ? other.getAccountMobile() == null : this.getAccountMobile().equals(other.getAccountMobile()))
            && (this.getAccountPassword() == null ? other.getAccountPassword() == null : this.getAccountPassword().equals(other.getAccountPassword()))
            && (this.getAccountCreateTime() == null ? other.getAccountCreateTime() == null : this.getAccountCreateTime().equals(other.getAccountCreateTime()))
            && (this.getAccountUpdateTime() == null ? other.getAccountUpdateTime() == null : this.getAccountUpdateTime().equals(other.getAccountUpdateTime()))
            && (this.getAccountState() == null ? other.getAccountState() == null : this.getAccountState().equals(other.getAccountState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        result = prime * result + ((getAccountMobile() == null) ? 0 : getAccountMobile().hashCode());
        result = prime * result + ((getAccountPassword() == null) ? 0 : getAccountPassword().hashCode());
        result = prime * result + ((getAccountCreateTime() == null) ? 0 : getAccountCreateTime().hashCode());
        result = prime * result + ((getAccountUpdateTime() == null) ? 0 : getAccountUpdateTime().hashCode());
        result = prime * result + ((getAccountState() == null) ? 0 : getAccountState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", accountName=").append(accountName);
        sb.append(", accountMobile=").append(accountMobile);
        sb.append(", accountPassword=").append(accountPassword);
        sb.append(", accountCreateTime=").append(accountCreateTime);
        sb.append(", accountUpdateTime=").append(accountUpdateTime);
        sb.append(", accountState=").append(accountState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}