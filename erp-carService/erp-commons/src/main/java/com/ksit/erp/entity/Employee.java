package com.ksit.erp.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * employee
 * @author 
 */
public class Employee implements Serializable {
    /**
     * 员工ID
     */
    private Integer id;

    /**
     * 员工姓名
     */
    private String employeeName;

    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 密码
     */
    private String employeePassword;

    /**
     * 权限ID
     */
    private Integer permissionId;

    /**
     * 创建时间
     */
    private Date employeeCreateTime;

    /**
     * 状态：1.禁用 2启用
     */
    private Integer employeeState;

    /**
     * 员工正面照片
     */
    private String employeePicFront;

    /**
     * 员工级别
     */
    private String employeeLevel;

    /**
     * 员工电话
     */
    private String employeeTel;

    private Integer departmentId;

    private String employeeEmail;

    private List<Role> roleList;

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Date getEmployeeCreateTime() {
        return employeeCreateTime;
    }

    public void setEmployeeCreateTime(Date employeeCreateTime) {
        this.employeeCreateTime = employeeCreateTime;
    }

    public Integer getEmployeeState() {
        return employeeState;
    }

    public void setEmployeeState(Integer employeeState) {
        this.employeeState = employeeState;
    }

    public String getEmployeePicFront() {
        return employeePicFront;
    }

    public void setEmployeePicFront(String employeePicFront) {
        this.employeePicFront = employeePicFront;
    }

    public String getEmployeeLevel() {
        return employeeLevel;
    }

    public void setEmployeeLevel(String employeeLevel) {
        this.employeeLevel = employeeLevel;
    }

    public String getEmployeeTel() {
        return employeeTel;
    }

    public void setEmployeeTel(String employeeTel) {
        this.employeeTel = employeeTel;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
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
        Employee other = (Employee) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEmployeeName() == null ? other.getEmployeeName() == null : this.getEmployeeName().equals(other.getEmployeeName()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getEmployeePassword() == null ? other.getEmployeePassword() == null : this.getEmployeePassword().equals(other.getEmployeePassword()))
            && (this.getPermissionId() == null ? other.getPermissionId() == null : this.getPermissionId().equals(other.getPermissionId()))
            && (this.getEmployeeCreateTime() == null ? other.getEmployeeCreateTime() == null : this.getEmployeeCreateTime().equals(other.getEmployeeCreateTime()))
            && (this.getEmployeeState() == null ? other.getEmployeeState() == null : this.getEmployeeState().equals(other.getEmployeeState()))
            && (this.getEmployeePicFront() == null ? other.getEmployeePicFront() == null : this.getEmployeePicFront().equals(other.getEmployeePicFront()))
            && (this.getEmployeeLevel() == null ? other.getEmployeeLevel() == null : this.getEmployeeLevel().equals(other.getEmployeeLevel()))
            && (this.getEmployeeTel() == null ? other.getEmployeeTel() == null : this.getEmployeeTel().equals(other.getEmployeeTel()))
            && (this.getDepartmentId() == null ? other.getDepartmentId() == null : this.getDepartmentId().equals(other.getDepartmentId()))
            && (this.getEmployeeEmail() == null ? other.getEmployeeEmail() == null : this.getEmployeeEmail().equals(other.getEmployeeEmail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEmployeeName() == null) ? 0 : getEmployeeName().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getEmployeePassword() == null) ? 0 : getEmployeePassword().hashCode());
        result = prime * result + ((getPermissionId() == null) ? 0 : getPermissionId().hashCode());
        result = prime * result + ((getEmployeeCreateTime() == null) ? 0 : getEmployeeCreateTime().hashCode());
        result = prime * result + ((getEmployeeState() == null) ? 0 : getEmployeeState().hashCode());
        result = prime * result + ((getEmployeePicFront() == null) ? 0 : getEmployeePicFront().hashCode());
        result = prime * result + ((getEmployeeLevel() == null) ? 0 : getEmployeeLevel().hashCode());
        result = prime * result + ((getEmployeeTel() == null) ? 0 : getEmployeeTel().hashCode());
        result = prime * result + ((getDepartmentId() == null) ? 0 : getDepartmentId().hashCode());
        result = prime * result + ((getEmployeeEmail() == null) ? 0 : getEmployeeEmail().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", employeeName=").append(employeeName);
        sb.append(", roleId=").append(roleId);
        sb.append(", employeePassword=").append(employeePassword);
        sb.append(", permissionId=").append(permissionId);
        sb.append(", employeeCreateTime=").append(employeeCreateTime);
        sb.append(", employeeState=").append(employeeState);
        sb.append(", employeePicFront=").append(employeePicFront);
        sb.append(", employeeLevel=").append(employeeLevel);
        sb.append(", employeeTel=").append(employeeTel);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", employeeEmail=").append(employeeEmail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}