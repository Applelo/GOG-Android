
package com.gog.applelo.gog.models.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContentSystemCompatibility {

    @SerializedName("windows")
    @Expose
    private Boolean windows;
    @SerializedName("osx")
    @Expose
    private Boolean osx;
    @SerializedName("linux")
    @Expose
    private Boolean linux;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContentSystemCompatibility() {
    }

    /**
     * 
     * @param osx
     * @param windows
     * @param linux
     */
    public ContentSystemCompatibility(Boolean windows, Boolean osx, Boolean linux) {
        super();
        this.windows = windows;
        this.osx = osx;
        this.linux = linux;
    }

    public Boolean getWindows() {
        return windows;
    }

    public void setWindows(Boolean windows) {
        this.windows = windows;
    }

    public Boolean getOsx() {
        return osx;
    }

    public void setOsx(Boolean osx) {
        this.osx = osx;
    }

    public Boolean getLinux() {
        return linux;
    }

    public void setLinux(Boolean linux) {
        this.linux = linux;
    }

}
