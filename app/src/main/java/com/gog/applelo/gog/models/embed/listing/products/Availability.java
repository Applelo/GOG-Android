
package com.gog.applelo.gog.models.embed.listing.products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Availability {

    @SerializedName("isAvailable")
    @Expose
    private Boolean isAvailable;
    @SerializedName("isAvailableInAccount")
    @Expose
    private Boolean isAvailableInAccount;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Availability() {
    }

    /**
     * 
     * @param isAvailableInAccount
     * @param isAvailable
     */
    public Availability(Boolean isAvailable, Boolean isAvailableInAccount) {
        super();
        this.isAvailable = isAvailable;
        this.isAvailableInAccount = isAvailableInAccount;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Boolean getIsAvailableInAccount() {
        return isAvailableInAccount;
    }

    public void setIsAvailableInAccount(Boolean isAvailableInAccount) {
        this.isAvailableInAccount = isAvailableInAccount;
    }

}
