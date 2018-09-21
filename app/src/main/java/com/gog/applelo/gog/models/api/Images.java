
package com.gog.applelo.gog.models.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images {

    @SerializedName("background")
    @Expose
    private String background;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("logo2x")
    @Expose
    private String logo2x;
    @SerializedName("sidebarIcon")
    @Expose
    private Object sidebarIcon;
    @SerializedName("sidebarIcon2x")
    @Expose
    private Object sidebarIcon2x;
    @SerializedName("menuNotificationAv")
    @Expose
    private Object menuNotificationAv;
    @SerializedName("menuNotificationAv2")
    @Expose
    private Object menuNotificationAv2;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Images() {
    }

    /**
     * 
     * @param menuNotificationAv2
     * @param menuNotificationAv
     * @param logo
     * @param sidebarIcon
     * @param logo2x
     * @param background
     * @param sidebarIcon2x
     */
    public Images(String background, String logo, String logo2x, Object sidebarIcon, Object sidebarIcon2x, Object menuNotificationAv, Object menuNotificationAv2) {
        super();
        this.background = background;
        this.logo = logo;
        this.logo2x = logo2x;
        this.sidebarIcon = sidebarIcon;
        this.sidebarIcon2x = sidebarIcon2x;
        this.menuNotificationAv = menuNotificationAv;
        this.menuNotificationAv2 = menuNotificationAv2;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogo2x() {
        return logo2x;
    }

    public void setLogo2x(String logo2x) {
        this.logo2x = logo2x;
    }

    public Object getSidebarIcon() {
        return sidebarIcon;
    }

    public void setSidebarIcon(Object sidebarIcon) {
        this.sidebarIcon = sidebarIcon;
    }

    public Object getSidebarIcon2x() {
        return sidebarIcon2x;
    }

    public void setSidebarIcon2x(Object sidebarIcon2x) {
        this.sidebarIcon2x = sidebarIcon2x;
    }

    public Object getMenuNotificationAv() {
        return menuNotificationAv;
    }

    public void setMenuNotificationAv(Object menuNotificationAv) {
        this.menuNotificationAv = menuNotificationAv;
    }

    public Object getMenuNotificationAv2() {
        return menuNotificationAv2;
    }

    public void setMenuNotificationAv2(Object menuNotificationAv2) {
        this.menuNotificationAv2 = menuNotificationAv2;
    }

}
