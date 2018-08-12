package com.ksit.erp.vo;

/**
 * Created by houfalv on 2018/8/10.
 */
public class ErpServiceVo {

    private String id;

    /**
     * 服务名称
     */
    private String serviceName;

    /**
     * 服务编号
     */
    private String serviceNo;

    /**
     * 服务工时
     */
    private String serviceHour;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(String serviceNo) {
        this.serviceNo = serviceNo;
    }

    public String getServiceHour() {
        return serviceHour;
    }

    public void setServiceHour(String serviceHour) {
        this.serviceHour = serviceHour;
    }
}
