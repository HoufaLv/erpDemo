package com.lv.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Permission implements Serializable {
    private Integer id;

    /**
     * 权限名称
     */
    private String permissionName;

    /**
     * 权限代号
     */
    private String permissionCode;

    /**
     * 权限类型，菜单 按钮
     */
    private String permissionType;

    /**
     * 父id
     */
    private Integer parentId;

    /**
     * 创建时间
     */
    private Date permissionCreateTime;

    /**
     * 更新时间
     */
    private Date permissionUpdateTime;

    /**
     * 权限对应的url
     */
    private String permissionUrl;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Date getPermissionCreateTime() {
        return permissionCreateTime;
    }

    public void setPermissionCreateTime(Date permissionCreateTime) {
        this.permissionCreateTime = permissionCreateTime;
    }

    public Date getPermissionUpdateTime() {
        return permissionUpdateTime;
    }

    public void setPermissionUpdateTime(Date permissionUpdateTime) {
        this.permissionUpdateTime = permissionUpdateTime;
    }

    public String getPermissionUrl() {
        return permissionUrl;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
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
        Permission other = (Permission) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPermissionName() == null ? other.getPermissionName() == null : this.getPermissionName().equals(other.getPermissionName()))
            && (this.getPermissionCode() == null ? other.getPermissionCode() == null : this.getPermissionCode().equals(other.getPermissionCode()))
            && (this.getPermissionType() == null ? other.getPermissionType() == null : this.getPermissionType().equals(other.getPermissionType()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getPermissionCreateTime() == null ? other.getPermissionCreateTime() == null : this.getPermissionCreateTime().equals(other.getPermissionCreateTime()))
            && (this.getPermissionUpdateTime() == null ? other.getPermissionUpdateTime() == null : this.getPermissionUpdateTime().equals(other.getPermissionUpdateTime()))
            && (this.getPermissionUrl() == null ? other.getPermissionUrl() == null : this.getPermissionUrl().equals(other.getPermissionUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPermissionName() == null) ? 0 : getPermissionName().hashCode());
        result = prime * result + ((getPermissionCode() == null) ? 0 : getPermissionCode().hashCode());
        result = prime * result + ((getPermissionType() == null) ? 0 : getPermissionType().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getPermissionCreateTime() == null) ? 0 : getPermissionCreateTime().hashCode());
        result = prime * result + ((getPermissionUpdateTime() == null) ? 0 : getPermissionUpdateTime().hashCode());
        result = prime * result + ((getPermissionUrl() == null) ? 0 : getPermissionUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", permissionName=").append(permissionName);
        sb.append(", permissionCode=").append(permissionCode);
        sb.append(", permissionType=").append(permissionType);
        sb.append(", parentId=").append(parentId);
        sb.append(", permissionCreateTime=").append(permissionCreateTime);
        sb.append(", permissionUpdateTime=").append(permissionUpdateTime);
        sb.append(", permissionUrl=").append(permissionUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}