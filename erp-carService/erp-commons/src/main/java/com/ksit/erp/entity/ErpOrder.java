package com.ksit.erp.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * erp_order
 * @author 
 */
public class ErpOrder implements Serializable {
    private Integer id;

    /**
     * 订单总价
     */
    private BigDecimal orderMoney;

    /**
     * 订单状态  完成 | 未完成 | 下发
     */
    private String orderState;

    private Date orderFinishTime;

    /**
     * 创建时间
     */
    private Date orderCreateTime;

    /**
     * 车辆id
     */
    private Integer orderCarId;

    /**
     * 工时费
     */
    private Long orderHourFee;

    /**
     * 订单客户id
     */
    private Integer orderCustomerId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public Date getOrderFinishTime() {
        return orderFinishTime;
    }

    public void setOrderFinishTime(Date orderFinishTime) {
        this.orderFinishTime = orderFinishTime;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Integer getOrderCarId() {
        return orderCarId;
    }

    public void setOrderCarId(Integer orderCarId) {
        this.orderCarId = orderCarId;
    }

    public Long getOrderHourFee() {
        return orderHourFee;
    }

    public void setOrderHourFee(Long orderHourFee) {
        this.orderHourFee = orderHourFee;
    }

    public Integer getOrderCustomerId() {
        return orderCustomerId;
    }

    public void setOrderCustomerId(Integer orderCustomerId) {
        this.orderCustomerId = orderCustomerId;
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
        ErpOrder other = (ErpOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderMoney() == null ? other.getOrderMoney() == null : this.getOrderMoney().equals(other.getOrderMoney()))
            && (this.getOrderState() == null ? other.getOrderState() == null : this.getOrderState().equals(other.getOrderState()))
            && (this.getOrderFinishTime() == null ? other.getOrderFinishTime() == null : this.getOrderFinishTime().equals(other.getOrderFinishTime()))
            && (this.getOrderCreateTime() == null ? other.getOrderCreateTime() == null : this.getOrderCreateTime().equals(other.getOrderCreateTime()))
            && (this.getOrderCarId() == null ? other.getOrderCarId() == null : this.getOrderCarId().equals(other.getOrderCarId()))
            && (this.getOrderHourFee() == null ? other.getOrderHourFee() == null : this.getOrderHourFee().equals(other.getOrderHourFee()))
            && (this.getOrderCustomerId() == null ? other.getOrderCustomerId() == null : this.getOrderCustomerId().equals(other.getOrderCustomerId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderMoney() == null) ? 0 : getOrderMoney().hashCode());
        result = prime * result + ((getOrderState() == null) ? 0 : getOrderState().hashCode());
        result = prime * result + ((getOrderFinishTime() == null) ? 0 : getOrderFinishTime().hashCode());
        result = prime * result + ((getOrderCreateTime() == null) ? 0 : getOrderCreateTime().hashCode());
        result = prime * result + ((getOrderCarId() == null) ? 0 : getOrderCarId().hashCode());
        result = prime * result + ((getOrderHourFee() == null) ? 0 : getOrderHourFee().hashCode());
        result = prime * result + ((getOrderCustomerId() == null) ? 0 : getOrderCustomerId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderMoney=").append(orderMoney);
        sb.append(", orderState=").append(orderState);
        sb.append(", orderFinishTime=").append(orderFinishTime);
        sb.append(", orderCreateTime=").append(orderCreateTime);
        sb.append(", orderCarId=").append(orderCarId);
        sb.append(", orderHourFee=").append(orderHourFee);
        sb.append(", orderCustomerId=").append(orderCustomerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}