package com.lsy.myscala.base;

import java.util.List;

/**
 * Created by lisiyu on 2018/8/3.
 */
public class TrailPoint {
    private float lat;
    private float lng;
    private Long timestamp;
    private List<String> linkIds;
    private int passLinkDistance;
    private float pointSpeed;
    private int distanceToStopbar;

    public TrailPoint() {
    }

    public float getLat() {
        return this.lat;
    }

    public float getLng() {
        return this.lng;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public List<String> getLinkIds() {
        return this.linkIds;
    }

    public int getPassLinkDistance() {
        return this.passLinkDistance;
    }

    public float getPointSpeed() {
        return this.pointSpeed;
    }

    public int getDistanceToStopbar() {
        return this.distanceToStopbar;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setLinkIds(List<String> linkIds) {
        this.linkIds = linkIds;
    }

    public void setPassLinkDistance(int passLinkDistance) {
        this.passLinkDistance = passLinkDistance;
    }

    public void setPointSpeed(float pointSpeed) {
        this.pointSpeed = pointSpeed;
    }

    public void setDistanceToStopbar(int distanceToStopbar) {
        this.distanceToStopbar = distanceToStopbar;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof TrailPoint)) {
            return false;
        } else {
            TrailPoint other = (TrailPoint)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (Float.compare(this.getLat(), other.getLat()) != 0) {
                return false;
            } else if (Float.compare(this.getLng(), other.getLng()) != 0) {
                return false;
            } else {
                label52: {
                    Object this$timestamp = this.getTimestamp();
                    Object other$timestamp = other.getTimestamp();
                    if (this$timestamp == null) {
                        if (other$timestamp == null) {
                            break label52;
                        }
                    } else if (this$timestamp.equals(other$timestamp)) {
                        break label52;
                    }

                    return false;
                }

                Object this$linkIds = this.getLinkIds();
                Object other$linkIds = other.getLinkIds();
                if (this$linkIds == null) {
                    if (other$linkIds != null) {
                        return false;
                    }
                } else if (!this$linkIds.equals(other$linkIds)) {
                    return false;
                }

                if (this.getPassLinkDistance() != other.getPassLinkDistance()) {
                    return false;
                } else if (Float.compare(this.getPointSpeed(), other.getPointSpeed()) != 0) {
                    return false;
                } else if (this.getDistanceToStopbar() != other.getDistanceToStopbar()) {
                    return false;
                } else {
                    return true;
                }
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof TrailPoint;
    }


    public String toString() {
        return "TrailPoint(lat=" + this.getLat() + ", lng=" + this.getLng() + ", timestamp=" + this.getTimestamp() + ", linkIds=" + this.getLinkIds() + ", passLinkDistance=" + this.getPassLinkDistance() + ", pointSpeed=" + this.getPointSpeed() + ", distanceToStopbar=" + this.getDistanceToStopbar() + ")";
    }
}
