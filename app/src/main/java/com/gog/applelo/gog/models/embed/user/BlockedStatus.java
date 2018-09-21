
package com.gog.applelo.gog.models.embed.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BlockedStatus {

    @SerializedName("blocked")
    @Expose
    private Boolean blocked;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BlockedStatus() {
    }

    /**
     * 
     * @param blocked
     */
    public BlockedStatus(Boolean blocked) {
        super();
        this.blocked = blocked;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

}
