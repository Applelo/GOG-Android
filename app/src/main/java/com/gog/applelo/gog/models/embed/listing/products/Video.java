
package com.gog.applelo.gog.models.embed.listing.products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Video {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("provider")
    @Expose
    private String provider;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Video() {
    }

    /**
     * 
     * @param id
     * @param provider
     */
    public Video(String id, String provider) {
        super();
        this.id = id;
        this.provider = provider;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

}
