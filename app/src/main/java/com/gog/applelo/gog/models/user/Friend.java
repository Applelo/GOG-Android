
package com.gog.applelo.gog.models.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Friend {

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("userSince")
    @Expose
    private Integer userSince;
    @SerializedName("galaxyId")
    @Expose
    private String galaxyId;
    @SerializedName("avatar")
    @Expose
    private String avatar;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Friend() {
    }

    /**
     * 
     * @param username
     * @param galaxyId
     * @param avatar
     * @param userSince
     */
    public Friend(String username, Integer userSince, String galaxyId, String avatar) {
        super();
        this.username = username;
        this.userSince = userSince;
        this.galaxyId = galaxyId;
        this.avatar = avatar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserSince() {
        return userSince;
    }

    public void setUserSince(Integer userSince) {
        this.userSince = userSince;
    }

    public String getGalaxyId() {
        return galaxyId;
    }

    public void setGalaxyId(String galaxyId) {
        this.galaxyId = galaxyId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

}
