package com.lv.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class Scenic implements Serializable {
    private Integer id;

    /**
     * 景区名称
     */
    private String scenicName;

    /**
     * 景区经度
     */
    private String scenicGeoLongitude;

    /**
     * 景区纬度
     */
    private String scenicGeoLatitude;

    /**
     * 景区级别
     */
    private String scenicLevel;

    /**
     * 景区地址
     */
    private String scenicAddress;

    /**
     * 景区价格
     */
    private BigDecimal scenicPrice;

    /**
     * 景区访问次数
     */
    private Integer scenicViewTime;

    /**
     * 景区创建时间
     */
    private Date scenicCreateTime;

    /**
     * 景区更新时间
     */
    private Date scenicUpdateTime;

    /**
     * 景区照片
     */
    private String scenicImage;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName;
    }

    public String getScenicGeoLongitude() {
        return scenicGeoLongitude;
    }

    public void setScenicGeoLongitude(String scenicGeoLongitude) {
        this.scenicGeoLongitude = scenicGeoLongitude;
    }

    public String getScenicGeoLatitude() {
        return scenicGeoLatitude;
    }

    public void setScenicGeoLatitude(String scenicGeoLatitude) {
        this.scenicGeoLatitude = scenicGeoLatitude;
    }

    public String getScenicLevel() {
        return scenicLevel;
    }

    public void setScenicLevel(String scenicLevel) {
        this.scenicLevel = scenicLevel;
    }

    public String getScenicAddress() {
        return scenicAddress;
    }

    public void setScenicAddress(String scenicAddress) {
        this.scenicAddress = scenicAddress;
    }

    public BigDecimal getScenicPrice() {
        return scenicPrice;
    }

    public void setScenicPrice(BigDecimal scenicPrice) {
        this.scenicPrice = scenicPrice;
    }

    public Integer getScenicViewTime() {
        return scenicViewTime;
    }

    public void setScenicViewTime(Integer scenicViewTime) {
        this.scenicViewTime = scenicViewTime;
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

    public String getScenicImage() {
        return scenicImage;
    }

    public void setScenicImage(String scenicImage) {
        this.scenicImage = scenicImage;
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
        Scenic other = (Scenic) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getScenicName() == null ? other.getScenicName() == null : this.getScenicName().equals(other.getScenicName()))
            && (this.getScenicGeoLongitude() == null ? other.getScenicGeoLongitude() == null : this.getScenicGeoLongitude().equals(other.getScenicGeoLongitude()))
            && (this.getScenicGeoLatitude() == null ? other.getScenicGeoLatitude() == null : this.getScenicGeoLatitude().equals(other.getScenicGeoLatitude()))
            && (this.getScenicLevel() == null ? other.getScenicLevel() == null : this.getScenicLevel().equals(other.getScenicLevel()))
            && (this.getScenicAddress() == null ? other.getScenicAddress() == null : this.getScenicAddress().equals(other.getScenicAddress()))
            && (this.getScenicPrice() == null ? other.getScenicPrice() == null : this.getScenicPrice().equals(other.getScenicPrice()))
            && (this.getScenicViewTime() == null ? other.getScenicViewTime() == null : this.getScenicViewTime().equals(other.getScenicViewTime()))
            && (this.getScenicCreateTime() == null ? other.getScenicCreateTime() == null : this.getScenicCreateTime().equals(other.getScenicCreateTime()))
            && (this.getScenicUpdateTime() == null ? other.getScenicUpdateTime() == null : this.getScenicUpdateTime().equals(other.getScenicUpdateTime()))
            && (this.getScenicImage() == null ? other.getScenicImage() == null : this.getScenicImage().equals(other.getScenicImage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getScenicName() == null) ? 0 : getScenicName().hashCode());
        result = prime * result + ((getScenicGeoLongitude() == null) ? 0 : getScenicGeoLongitude().hashCode());
        result = prime * result + ((getScenicGeoLatitude() == null) ? 0 : getScenicGeoLatitude().hashCode());
        result = prime * result + ((getScenicLevel() == null) ? 0 : getScenicLevel().hashCode());
        result = prime * result + ((getScenicAddress() == null) ? 0 : getScenicAddress().hashCode());
        result = prime * result + ((getScenicPrice() == null) ? 0 : getScenicPrice().hashCode());
        result = prime * result + ((getScenicViewTime() == null) ? 0 : getScenicViewTime().hashCode());
        result = prime * result + ((getScenicCreateTime() == null) ? 0 : getScenicCreateTime().hashCode());
        result = prime * result + ((getScenicUpdateTime() == null) ? 0 : getScenicUpdateTime().hashCode());
        result = prime * result + ((getScenicImage() == null) ? 0 : getScenicImage().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", scenicName=").append(scenicName);
        sb.append(", scenicGeoLongitude=").append(scenicGeoLongitude);
        sb.append(", scenicGeoLatitude=").append(scenicGeoLatitude);
        sb.append(", scenicLevel=").append(scenicLevel);
        sb.append(", scenicAddress=").append(scenicAddress);
        sb.append(", scenicPrice=").append(scenicPrice);
        sb.append(", scenicViewTime=").append(scenicViewTime);
        sb.append(", scenicCreateTime=").append(scenicCreateTime);
        sb.append(", scenicUpdateTime=").append(scenicUpdateTime);
        sb.append(", scenicImage=").append(scenicImage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}