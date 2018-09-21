
package com.gog.applelo.gog.models.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Video {

    @SerializedName("video_url")
    @Expose
    private String videoUrl;
    @SerializedName("thumbnail_url")
    @Expose
    private String thumbnailUrl;
    @SerializedName("provider")
    @Expose
    private String provider;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Video() {
    }

    /**
     * 
     * @param videoUrl
     * @param thumbnailUrl
     * @param provider
     */
    public Video(String videoUrl, String thumbnailUrl, String provider) {
        super();
        this.videoUrl = videoUrl;
        this.thumbnailUrl = thumbnailUrl;
        this.provider = provider;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

}
