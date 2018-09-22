
package com.gog.applelo.gog.models.chat.invitations;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FriendImages {

    @SerializedName("medium")
    @Expose
    private String medium;
    @SerializedName("medium_2x")
    @Expose
    private String medium2x;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FriendImages() {
    }

    /**
     * 
     * @param medium2x
     * @param medium
     */
    public FriendImages(String medium, String medium2x) {
        super();
        this.medium = medium;
        this.medium2x = medium2x;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getMedium2x() {
        return medium2x;
    }

    public void setMedium2x(String medium2x) {
        this.medium2x = medium2x;
    }

}
