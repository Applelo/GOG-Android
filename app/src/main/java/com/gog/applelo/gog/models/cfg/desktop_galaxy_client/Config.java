
package com.gog.applelo.gog.models.cfg.desktop_galaxy_client;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Config {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("channel")
    @Expose
    private String channel;
    @SerializedName("talkInterval")
    @Expose
    private Integer talkInterval;
    @SerializedName("complainInterval")
    @Expose
    private Integer complainInterval;
    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;
    @SerializedName("downloadParallelization")
    @Expose
    private Integer downloadParallelization;
    @SerializedName("downloadReceiveTimeout")
    @Expose
    private Integer downloadReceiveTimeout;
    @SerializedName("end_points")
    @Expose
    private EndPoints endPoints;
    @SerializedName("intervals")
    @Expose
    private Intervals intervals;
    @SerializedName("cloudSyncControl")
    @Expose
    private CloudSyncControl cloudSyncControl;
    @SerializedName("oldProductDetailsCachePurgePermil")
    @Expose
    private Integer oldProductDetailsCachePurgePermil;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Config() {
    }

    /**
     * 
     * @param timestamp
     * @param talkInterval
     * @param complainInterval
     * @param downloadReceiveTimeout
     * @param endPoints
     * @param downloadParallelization
     * @param status
     * @param oldProductDetailsCachePurgePermil
     * @param intervals
     * @param cloudSyncControl
     * @param channel
     */
    public Config(String status, String channel, Integer talkInterval, Integer complainInterval, Integer timestamp, Integer downloadParallelization, Integer downloadReceiveTimeout, EndPoints endPoints, Intervals intervals, CloudSyncControl cloudSyncControl, Integer oldProductDetailsCachePurgePermil) {
        super();
        this.status = status;
        this.channel = channel;
        this.talkInterval = talkInterval;
        this.complainInterval = complainInterval;
        this.timestamp = timestamp;
        this.downloadParallelization = downloadParallelization;
        this.downloadReceiveTimeout = downloadReceiveTimeout;
        this.endPoints = endPoints;
        this.intervals = intervals;
        this.cloudSyncControl = cloudSyncControl;
        this.oldProductDetailsCachePurgePermil = oldProductDetailsCachePurgePermil;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Integer getTalkInterval() {
        return talkInterval;
    }

    public void setTalkInterval(Integer talkInterval) {
        this.talkInterval = talkInterval;
    }

    public Integer getComplainInterval() {
        return complainInterval;
    }

    public void setComplainInterval(Integer complainInterval) {
        this.complainInterval = complainInterval;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getDownloadParallelization() {
        return downloadParallelization;
    }

    public void setDownloadParallelization(Integer downloadParallelization) {
        this.downloadParallelization = downloadParallelization;
    }

    public Integer getDownloadReceiveTimeout() {
        return downloadReceiveTimeout;
    }

    public void setDownloadReceiveTimeout(Integer downloadReceiveTimeout) {
        this.downloadReceiveTimeout = downloadReceiveTimeout;
    }

    public EndPoints getEndPoints() {
        return endPoints;
    }

    public void setEndPoints(EndPoints endPoints) {
        this.endPoints = endPoints;
    }

    public Intervals getIntervals() {
        return intervals;
    }

    public void setIntervals(Intervals intervals) {
        this.intervals = intervals;
    }

    public CloudSyncControl getCloudSyncControl() {
        return cloudSyncControl;
    }

    public void setCloudSyncControl(CloudSyncControl cloudSyncControl) {
        this.cloudSyncControl = cloudSyncControl;
    }

    public Integer getOldProductDetailsCachePurgePermil() {
        return oldProductDetailsCachePurgePermil;
    }

    public void setOldProductDetailsCachePurgePermil(Integer oldProductDetailsCachePurgePermil) {
        this.oldProductDetailsCachePurgePermil = oldProductDetailsCachePurgePermil;
    }

}
