package com.gog.applelo.gog.models.embed.reviews;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReviewWasHelpful {

    @SerializedName("wasHelpful")
    @Expose
    private Boolean wasHelpful;

    /**
     * No args constructor for use in serialization
     *
     */
    public ReviewWasHelpful() {
    }

    /**
     *
     * @param wasHelpful
     */
    public ReviewWasHelpful(Boolean wasHelpful) {
        super();
        this.wasHelpful = wasHelpful;
    }

    public Boolean getWasHelpful() {
        return wasHelpful;
    }

    public void setWasHelpful(Boolean wasHelpful) {
        this.wasHelpful = wasHelpful;
    }

}