
package com.gog.applelo.gog.models.users;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Avatar {

    @SerializedName("gog_image_id")
    @Expose
    private String gogImageId;
    @SerializedName("small")
    @Expose
    private String small;
    @SerializedName("small_2x")
    @Expose
    private String small2x;
    @SerializedName("medium")
    @Expose
    private String medium;
    @SerializedName("medium_2x")
    @Expose
    private String medium2x;
    @SerializedName("large")
    @Expose
    private String large;
    @SerializedName("large_2x")
    @Expose
    private String large2x;
    @SerializedName("sdk_img_32")
    @Expose
    private String sdkImg32;
    @SerializedName("sdk_img_64")
    @Expose
    private String sdkImg64;
    @SerializedName("sdk_img_184")
    @Expose
    private String sdkImg184;
    @SerializedName("menu_small")
    @Expose
    private String menuSmall;
    @SerializedName("menu_small_2")
    @Expose
    private String menuSmall2;
    @SerializedName("menu_big")
    @Expose
    private String menuBig;
    @SerializedName("menu_big_2")
    @Expose
    private String menuBig2;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Avatar() {
    }

    /**
     * 
     * @param medium2x
     * @param gogImageId
     * @param menuBig
     * @param sdkImg184
     * @param small2x
     * @param menuSmall2
     * @param menuBig2
     * @param sdkImg64
     * @param sdkImg32
     * @param small
     * @param menuSmall
     * @param large
     * @param medium
     * @param large2x
     */
    public Avatar(String gogImageId, String small, String small2x, String medium, String medium2x, String large, String large2x, String sdkImg32, String sdkImg64, String sdkImg184, String menuSmall, String menuSmall2, String menuBig, String menuBig2) {
        super();
        this.gogImageId = gogImageId;
        this.small = small;
        this.small2x = small2x;
        this.medium = medium;
        this.medium2x = medium2x;
        this.large = large;
        this.large2x = large2x;
        this.sdkImg32 = sdkImg32;
        this.sdkImg64 = sdkImg64;
        this.sdkImg184 = sdkImg184;
        this.menuSmall = menuSmall;
        this.menuSmall2 = menuSmall2;
        this.menuBig = menuBig;
        this.menuBig2 = menuBig2;
    }

    public String getGogImageId() {
        return gogImageId;
    }

    public void setGogImageId(String gogImageId) {
        this.gogImageId = gogImageId;
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

    public String getSdkImg32() {
        return sdkImg32;
    }

    public void setSdkImg32(String sdkImg32) {
        this.sdkImg32 = sdkImg32;
    }

    public String getSdkImg64() {
        return sdkImg64;
    }

    public void setSdkImg64(String sdkImg64) {
        this.sdkImg64 = sdkImg64;
    }

    public String getSdkImg184() {
        return sdkImg184;
    }

    public void setSdkImg184(String sdkImg184) {
        this.sdkImg184 = sdkImg184;
    }

    public String getMenuSmall() {
        return menuSmall;
    }

    public void setMenuSmall(String menuSmall) {
        this.menuSmall = menuSmall;
    }

    public String getMenuSmall2() {
        return menuSmall2;
    }

    public void setMenuSmall2(String menuSmall2) {
        this.menuSmall2 = menuSmall2;
    }

    public String getMenuBig() {
        return menuBig;
    }

    public void setMenuBig(String menuBig) {
        this.menuBig = menuBig;
    }

    public String getMenuBig2() {
        return menuBig2;
    }

    public void setMenuBig2(String menuBig2) {
        this.menuBig2 = menuBig2;
    }

}
