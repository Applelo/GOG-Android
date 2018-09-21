
package com.gog.applelo.gog.models.embed.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Avatars {

    @SerializedName("small")
    @Expose
    private String small;
    @SerializedName("small2x")
    @Expose
    private String small2x;
    @SerializedName("medium")
    @Expose
    private String medium;
    @SerializedName("medium2x")
    @Expose
    private String medium2x;
    @SerializedName("large")
    @Expose
    private String large;
    @SerializedName("large2x")
    @Expose
    private String large2x;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Avatars() {
    }

    /**
     * 
     * @param medium2x
     * @param small2x
     * @param small
     * @param large
     * @param medium
     * @param large2x
     */
    public Avatars(String small, String small2x, String medium, String medium2x, String large, String large2x) {
        super();
        this.small = small;
        this.small2x = small2x;
        this.medium = medium;
        this.medium2x = medium2x;
        this.large = large;
        this.large2x = large2x;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getSmall2x() {
        return small2x;
    }

    public void setSmall2x(String small2x) {
        this.small2x = small2x;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getMedium2x() {
        return medium2x;
    }

    public void setMedium2x(String medium2x) {
        this.medium2x = medium2x;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getLarge2x() {
        return large2x;
    }

    public void setLarge2x(String large2x) {
        this.large2x = large2x;
    }

}
