
package com.gog.applelo.gog.models.embed.listing.products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SalesVisibility {

    @SerializedName("isActive")
    @Expose
    private Boolean isActive;
    @SerializedName("fromObject")
    @Expose
    private FromObject fromObject;
    @SerializedName("from")
    @Expose
    private Integer from;
    @SerializedName("toObject")
    @Expose
    private ToObject toObject;
    @SerializedName("to")
    @Expose
    private Integer to;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SalesVisibility() {
    }

    /**
     * 
     * @param to
     * @param isActive
     * @param toObject
     * @param from
     * @param fromObject
     */
    public SalesVisibility(Boolean isActive, FromObject fromObject, Integer from, ToObject toObject, Integer to) {
        super();
        this.isActive = isActive;
        this.fromObject = fromObject;
        this.from = from;
        this.toObject = toObject;
        this.to = to;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public FromObject getFromObject() {
        return fromObject;
    }

    public void setFromObject(FromObject fromObject) {
        this.fromObject = fromObject;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public ToObject getToObject() {
        return toObject;
    }

    public void setToObject(ToObject toObject) {
        this.toObject = toObject;
    }

    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

}
