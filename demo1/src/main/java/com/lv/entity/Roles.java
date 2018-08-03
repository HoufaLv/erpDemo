package com.lv.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Roles implements Serializable {
    private Integer id;

    /**
     * 角色名称
     */
    private String rolesName;

    /**
     * 角色代号
     */
    private String rolesCode;

    /**
     * 创建时间
     */
    private Date rolesCreateTime;

    /**
     * 更新时间
     */
    private Date rolesUpdateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolesName() {
        return rolesName;
    }

    public void setRolesName(String rolesName) {
        this.rolesName = rolesName;
    }

    public String getRolesCode() {
        return rolesCode;
    }

    public void setRolesCode(String rolesCode) {
        this.rolesCode = rolesCode;
    }

    public Date getRolesCreateTime() {
        return rolesCreateTime;
    }

    public void setRolesCreateTime(Date rolesCreateTime) {
        this.rolesCreateTime = rolesCreateTime;
    }

    public Date getRolesUpdateTime() {
        return rolesUpdateTime;
    }

    public void setRolesUpdateTime(Date rolesUpdateTime) {
        this.rolesUpdateTime = rolesUpdateTime;
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
        Roles other = (Roles) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRolesName() == null ? other.getRolesName() == null : this.getRolesName().equals(other.getRolesName()))
            && (this.getRolesCode() == null ? other.getRolesCode() == null : this.getRolesCode().equals(other.getRolesCode()))
            && (this.getRolesCreateTime() == null ? other.getRolesCreateTime() == null : this.getRolesCreateTime().equals(other.getRolesCreateTime()))
            && (this.getRolesUpdateTime() == null ? other.getRolesUpdateTime() == null : this.getRolesUpdateTime().equals(other.getRolesUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRolesName() == null) ? 0 : getRolesName().hashCode());
        result = prime * result + ((getRolesCode() == null) ? 0 : getRolesCode().hashCode());
        result = prime * result + ((getRolesCreateTime() == null) ? 0 : getRolesCreateTime().hashCode());
        result = prime * result + ((getRolesUpdateTime() == null) ? 0 : getRolesUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rolesName=").append(rolesName);
        sb.append(", rolesCode=").append(rolesCode);
        sb.append(", rolesCreateTime=").append(rolesCreateTime);
        sb.append(", rolesUpdateTime=").append(rolesUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}