package com.lv.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class ScenicCommon implements Serializable {
    private Integer id;

    /**
     * 景区id
     */
    private Integer scenicId;

    /**
     * 景区评论
     */
    private String scenicCommon;

    /**
     * 评论图片
     */
    private String scenicCommonPic;

    /**
     * 几星好评
     */
    private String scenicCommonStart;

    /**
     * 评论创建时间
     */
    private Date scenicCreateTime;

    /**
     * 景区更新时间
     */
    private Date scenicUpdateTime;

    /**
     * 当前这条评论状态 是否可用
     */
    private String scenicState;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
    }

    public String getScenicCommon() {
        return scenicCommon;
    }

    public void setScenicCommon(String scenicCommon) {
        this.scenicCommon = scenicCommon;
    }

    public String getScenicCommonPic() {
        return scenicCommonPic;
    }

    public void setScenicCommonPic(String scenicCommonPic) {
        this.scenicCommonPic = scenicCommonPic;
    }

    public String getScenicCommonStart() {
        return scenicCommonStart;
    }

    public void setScenicCommonStart(String scenicCommonStart) {
        this.scenicCommonStart = scenicCommonStart;
    }

    public Date getScenicCreateTime() {
        return scenicCreateTime;
    }

    public void setScenicCreateTime(Date scenicCreateTime) {
        this.scenicCreateTime = scenicCreateTime;
    }

    public Date getScenicUpdateTime() {
        return scenicUpdateTime;
    }

    public void setScenicUpdateTime(Date scenicUpdateTime) {
        this.scenicUpdateTime = scenicUpdateTime;
    }

    public String getScenicState() {
        return scenicState;
    }

    public void setScenicState(String scenicState) {
        this.scenicState = scenicState;
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
        ScenicCommon other = (ScenicCommon) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getScenicId() == null ? other.getScenicId() == null : this.getScenicId().equals(other.getScenicId()))
            && (this.getScenicCommon() == null ? other.getScenicCommon() == null : this.getScenicCommon().equals(other.getScenicCommon()))
            && (this.getScenicCommonPic() == null ? other.getScenicCommonPic() == null : this.getScenicCommonPic().equals(other.getScenicCommonPic()))
            && (this.getScenicCommonStart() == null ? other.getScenicCommonStart() == null : this.getScenicCommonStart().equals(other.getScenicCommonStart()))
            && (this.getScenicCreateTime() == null ? other.getScenicCreateTime() == null : this.getScenicCreateTime().equals(other.getScenicCreateTime()))
            && (this.getScenicUpdateTime() == null ? other.getScenicUpdateTime() == null : this.getScenicUpdateTime().equals(other.getScenicUpdateTime()))
            && (this.getScenicState() == null ? other.getScenicState() == null : this.getScenicState().equals(other.getScenicState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getScenicId() == null) ? 0 : getScenicId().hashCode());
        result = prime * result + ((getScenicCommon() == null) ? 0 : getScenicCommon().hashCode());
        result = prime * result + ((getScenicCommonPic() == null) ? 0 : getScenicCommonPic().hashCode());
        result = prime * result + ((getScenicCommonStart() == null) ? 0 : getScenicCommonStart().hashCode());
        result = prime * result + ((getScenicCreateTime() == null) ? 0 : getScenicCreateTime().hashCode());
        result = prime * result + ((getScenicUpdateTime() == null) ? 0 : getScenicUpdateTime().hashCode());
        result = prime * result + ((getScenicState() == null) ? 0 : getScenicState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", scenicId=").append(scenicId);
        sb.append(", scenicCommon=").append(scenicCommon);
        sb.append(", scenicCommonPic=").append(scenicCommonPic);
        sb.append(", scenicCommonStart=").append(scenicCommonStart);
        sb.append(", scenicCreateTime=").append(scenicCreateTime);
        sb.append(", scenicUpdateTime=").append(scenicUpdateTime);
        sb.append(", scenicState=").append(scenicState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}