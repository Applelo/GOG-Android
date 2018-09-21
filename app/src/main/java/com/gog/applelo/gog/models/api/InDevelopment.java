
package com.gog.applelo.gog.models.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InDevelopment {

    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("until")
    @Expose
    private Object until;

    /**
     * No args constructor for use in serialization
     * 
     */
    public InDevelopment() {
    }

    /**
     * 
     * @param active
     * @param until
     */
    public InDevelopment(Boolean active, Object until) {
        super();
        this.active = active;
        this.until = until;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Object getUntil() {
        return until;
    }

    public void setUntil(Object until) {
        this.until = until;
    }

}
