package com.lv.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Ticket implements Serializable {
    private Long id;

    /**
     * 票数
     */
    private String ticketNum;

    /**
     * 下发时间
     */
    private Date ticketInTime;

    /**
     * 状态：已入库 | 已出库 | 已作废
     */
    private String ticketState;

    /**
     * 创建时间
     */
    private Date ticketCreateTime;

    /**
     * 更新时间
     */
    private Date ticketUpdateTime;

    /**
     * 出库时间
     */
    private String ticketOutTime;

    /**
     * 有效期开始时间
     */
    private Date ticketValidityStart;

    /**
     * 票有效期结束时间
     */
    private Date ticketValidityEnd;

    /**
     * 顾客id
     */
    private Long customerId;

    /**
     * 存储帐户id
     */
    private Integer storeAccountId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(String ticketNum) {
        this.ticketNum = ticketNum;
    }

    public Date getTicketInTime() {
        return ticketInTime;
    }

    public void setTicketInTime(Date ticketInTime) {
        this.ticketInTime = ticketInTime;
    }

    public String getTicketState() {
        return ticketState;
    }

    public void setTicketState(String ticketState) {
        this.ticketState = ticketState;
    }

    public Date getTicketCreateTime() {
        return ticketCreateTime;
    }

    public void setTicketCreateTime(Date ticketCreateTime) {
        this.ticketCreateTime = ticketCreateTime;
    }

    public Date getTicketUpdateTime() {
        return ticketUpdateTime;
    }

    public void setTicketUpdateTime(Date ticketUpdateTime) {
        this.ticketUpdateTime = ticketUpdateTime;
    }

    public String getTicketOutTime() {
        return ticketOutTime;
    }

    public void setTicketOutTime(String ticketOutTime) {
        this.ticketOutTime = ticketOutTime;
    }

    public Date getTicketValidityStart() {
        return ticketValidityStart;
    }

    public void setTicketValidityStart(Date ticketValidityStart) {
        this.ticketValidityStart = ticketValidityStart;
    }

    public Date getTicketValidityEnd() {
        return ticketValidityEnd;
    }

    public void setTicketValidityEnd(Date ticketValidityEnd) {
        this.ticketValidityEnd = ticketValidityEnd;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Integer getStoreAccountId() {
        return storeAccountId;
    }

    public void setStoreAccountId(Integer storeAccountId) {
        this.storeAccountId = storeAccountId;
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
        Ticket other = (Ticket) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTicketNum() == null ? other.getTicketNum() == null : this.getTicketNum().equals(other.getTicketNum()))
            && (this.getTicketInTime() == null ? other.getTicketInTime() == null : this.getTicketInTime().equals(other.getTicketInTime()))
            && (this.getTicketState() == null ? other.getTicketState() == null : this.getTicketState().equals(other.getTicketState()))
            && (this.getTicketCreateTime() == null ? other.getTicketCreateTime() == null : this.getTicketCreateTime().equals(other.getTicketCreateTime()))
            && (this.getTicketUpdateTime() == null ? other.getTicketUpdateTime() == null : this.getTicketUpdateTime().equals(other.getTicketUpdateTime()))
            && (this.getTicketOutTime() == null ? other.getTicketOutTime() == null : this.getTicketOutTime().equals(other.getTicketOutTime()))
            && (this.getTicketValidityStart() == null ? other.getTicketValidityStart() == null : this.getTicketValidityStart().equals(other.getTicketValidityStart()))
            && (this.getTicketValidityEnd() == null ? other.getTicketValidityEnd() == null : this.getTicketValidityEnd().equals(other.getTicketValidityEnd()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getStoreAccountId() == null ? other.getStoreAccountId() == null : this.getStoreAccountId().equals(other.getStoreAccountId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTicketNum() == null) ? 0 : getTicketNum().hashCode());
        result = prime * result + ((getTicketInTime() == null) ? 0 : getTicketInTime().hashCode());
        result = prime * result + ((getTicketState() == null) ? 0 : getTicketState().hashCode());
        result = prime * result + ((getTicketCreateTime() == null) ? 0 : getTicketCreateTime().hashCode());
        result = prime * result + ((getTicketUpdateTime() == null) ? 0 : getTicketUpdateTime().hashCode());
        result = prime * result + ((getTicketOutTime() == null) ? 0 : getTicketOutTime().hashCode());
        result = prime * result + ((getTicketValidityStart() == null) ? 0 : getTicketValidityStart().hashCode());
        result = prime * result + ((getTicketValidityEnd() == null) ? 0 : getTicketValidityEnd().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getStoreAccountId() == null) ? 0 : getStoreAccountId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ticketNum=").append(ticketNum);
        sb.append(", ticketInTime=").append(ticketInTime);
        sb.append(", ticketState=").append(ticketState);
        sb.append(", ticketCreateTime=").append(ticketCreateTime);
        sb.append(", ticketUpdateTime=").append(ticketUpdateTime);
        sb.append(", ticketOutTime=").append(ticketOutTime);
        sb.append(", ticketValidityStart=").append(ticketValidityStart);
        sb.append(", ticketValidityEnd=").append(ticketValidityEnd);
        sb.append(", customerId=").append(customerId);
        sb.append(", storeAccountId=").append(storeAccountId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}