
package com.gog.applelo.gog.models.embed.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChatStatus {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("isChatRestricted")
    @Expose
    private Boolean isChatRestricted;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ChatStatus() {
    }

    /**
     * 
     * @param isChatRestricted
     * @param url
     */
    public ChatStatus(String url, Boolean isChatRestricted) {
        super();
        this.url = url;
        this.isChatRestricted = isChatRestricted;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getIsChatRestricted() {
        return isChatRestricted;
    }

    public void setIsChatRestricted(Boolean isChatRestricted) {
        this.isChatRestricted = isChatRestricted;
    }

}
