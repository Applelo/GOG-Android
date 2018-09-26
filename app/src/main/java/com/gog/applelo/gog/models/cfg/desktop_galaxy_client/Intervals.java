
package com.gog.applelo.gog.models.cfg.desktop_galaxy_client;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Intervals {

    @SerializedName("quick")
    @Expose
    private Integer quick;
    @SerializedName("presence")
    @Expose
    private Integer presence;
    @SerializedName("short")
    @Expose
    private Integer _short;
    @SerializedName("normal")
    @Expose
    private Integer normal;
    @SerializedName("selfUpdateCheck")
    @Expose
    private Integer selfUpdateCheck;
    @SerializedName("long")
    @Expose
    private Integer _long;
    @SerializedName("eternity")
    @Expose
    private Integer eternity;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Intervals() {
    }

    /**
     * 
     * @param _long
     * @param presence
     * @param selfUpdateCheck
     * @param normal
     * @param _short
     * @param quick
     * @param eternity
     */
    public Intervals(Integer quick, Integer presence, Integer _short, Integer normal, Integer selfUpdateCheck, Integer _long, Integer eternity) {
        super();
        this.quick = quick;
        this.presence = presence;
        this._short = _short;
        this.normal = normal;
        this.selfUpdateCheck = selfUpdateCheck;
        this._long = _long;
        this.eternity = eternity;
    }

    public Integer getQuick() {
        return quick;
    }

    public void setQuick(Integer quick) {
        this.quick = quick;
    }

    public Integer getPresence() {
        return presence;
    }

    public void setPresence(Integer presence) {
        this.presence = presence;
    }

    public Integer getShort() {
        return _short;
    }

    public void setShort(Integer _short) {
        this._short = _short;
    }

    public Integer getNormal() {
        return normal;
    }

    public void setNormal(Integer normal) {
        this.normal = normal;
    }

    public Integer getSelfUpdateCheck() {
        return selfUpdateCheck;
    }

    public void setSelfUpdateCheck(Integer selfUpdateCheck) {
        this.selfUpdateCheck = selfUpdateCheck;
    }

    public Integer getLong() {
        return _long;
    }

    public void setLong(Integer _long) {
        this._long = _long;
    }

    public Integer getEternity() {
        return eternity;
    }

    public void setEternity(Integer eternity) {
        this.eternity = eternity;
    }

}
