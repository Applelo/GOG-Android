
package com.gog.applelo.gog.models.embed.listing.products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WorksOn {

    @SerializedName("Windows")
    @Expose
    private Boolean windows;
    @SerializedName("Mac")
    @Expose
    private Boolean mac;
    @SerializedName("Linux")
    @Expose
    private Boolean linux;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WorksOn() {
    }

    /**
     * 
     * @param mac
     * @param windows
     * @param linux
     */
    public WorksOn(Boolean windows, Boolean mac, Boolean linux) {
        super();
        this.windows = windows;
        this.mac = mac;
        this.linux = linux;
    }

    public Boolean getWindows() {
        return windows;
    }

    public void setWindows(Boolean windows) {
        this.windows = windows;
    }

    public Boolean getMac() {
        return mac;
    }

    public void setMac(Boolean mac) {
        this.mac = mac;
    }

    public Boolean getLinux() {
        return linux;
    }

    public void setLinux(Boolean linux) {
        this.linux = linux;
    }

}
