package com.ksit.erp.entity;

import java.io.Serializable;

/**
 * erp_service
 * @author 
 */
public class ErpService implements Serializable {
    private Integer id;

    /**
     * 服务名称
     */
    private String serviceName;

    /**
     * 服务编号
     */
    private Integer serviceNo;

    /**
     * 服务工时
     */
    private Integer serviceHour;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(Integer serviceNo) {
        this.serviceNo = serviceNo;
    }

    public Integer getServiceHour() {
        return serviceHour;
    }

    public void setServiceHour(Integer serviceHour) {
        this.serviceHour = serviceHour;
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
        ErpService other = (ErpService) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getServiceName() == null ? other.getServiceName() == null : this.getServiceName().equals(other.getServiceName()))
            && (this.getServiceNo() == null ? other.getServiceNo() == null : this.getServiceNo().equals(other.getServiceNo()))
            && (this.getServiceHour() == null ? other.getServiceHour() == null : this.getServiceHour().equals(other.getServiceHour()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        result = prime * result + ((getServiceNo() == null) ? 0 : getServiceNo().hashCode());
        result = prime * result + ((getServiceHour() == null) ? 0 : getServiceHour().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serviceName=").append(serviceName);
        sb.append(", serviceNo=").append(serviceNo);
        sb.append(", serviceHour=").append(serviceHour);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}