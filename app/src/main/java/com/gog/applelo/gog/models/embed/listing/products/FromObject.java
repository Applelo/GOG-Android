
package com.gog.applelo.gog.models.embed.listing.products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FromObject {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("timezone_type")
    @Expose
    private Integer timezoneType;
    @SerializedName("timezone")
    @Expose
    private String timezone;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FromObject() {
    }

    /**
     * 
     * @param timezone
     * @param timezoneType
     * @param date
     */
    public FromObject(String date, Integer timezoneType, String timezone) {
        super();
        this.date = date;
        this.timezoneType = timezoneType;
        this.timezone = timezone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getTimezoneType() {
        return timezoneType;
    }

    public void setTimezoneType(Integer timezoneType) {
        this.timezoneType = timezoneType;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

}
