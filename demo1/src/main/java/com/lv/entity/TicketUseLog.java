package com.lv.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TicketUseLog implements Serializable {
    private Integer id;

    /**
     * 刷票时间
     */
    private Date ticketUseTime;

    /**
     * 票id
     */
    private Integer ticketId;

    /**
     * 景区id
     */
    private Integer scenicId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTicketUseTime() {
        return ticketUseTime;
    }

    public void setTicketUseTime(Date ticketUseTime) {
        this.ticketUseTime = ticketUseTime;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
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
        TicketUseLog other = (TicketUseLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTicketUseTime() == null ? other.getTicketUseTime() == null : this.getTicketUseTime().equals(other.getTicketUseTime()))
            && (this.getTicketId() == null ? other.getTicketId() == null : this.getTicketId().equals(other.getTicketId()))
            && (this.getScenicId() == null ? other.getScenicId() == null : this.getScenicId().equals(other.getScenicId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTicketUseTime() == null) ? 0 : getTicketUseTime().hashCode());
        result = prime * result + ((getTicketId() == null) ? 0 : getTicketId().hashCode());
        result = prime * result + ((getScenicId() == null) ? 0 : getScenicId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ticketUseTime=").append(ticketUseTime);
        sb.append(", ticketId=").append(ticketId);
        sb.append(", scenicId=").append(scenicId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}