
package com.gog.applelo.gog.models.cfg.desktop_galaxy_client;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CloudSyncControl {

    @SerializedName("periodicPermil")
    @Expose
    private Integer periodicPermil;
    @SerializedName("userActionPermil")
    @Expose
    private Integer userActionPermil;
    @SerializedName("enableLocalFileDeletion")
    @Expose
    private Boolean enableLocalFileDeletion;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CloudSyncControl() {
    }

    /**
     * 
     * @param periodicPermil
     * @param userActionPermil
     * @param enableLocalFileDeletion
     */
    public CloudSyncControl(Integer periodicPermil, Integer userActionPermil, Boolean enableLocalFileDeletion) {
        super();
        this.periodicPermil = periodicPermil;
        this.userActionPermil = userActionPermil;
        this.enableLocalFileDeletion = enableLocalFileDeletion;
    }

    public Integer getPeriodicPermil() {
        return periodicPermil;
    }

    public void setPeriodicPermil(Integer periodicPermil) {
        this.periodicPermil = periodicPermil;
    }

    public Integer getUserActionPermil() {
        return userActionPermil;
    }

    public void setUserActionPermil(Integer userActionPermil) {
        this.userActionPermil = userActionPermil;
    }

    public Boolean getEnableLocalFileDeletion() {
        return enableLocalFileDeletion;
    }

    public void setEnableLocalFileDeletion(Boolean enableLocalFileDeletion) {
        this.enableLocalFileDeletion = enableLocalFileDeletion;
    }

}
