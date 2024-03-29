
package com.gog.applelo.gog.models.embed.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WishlistStatus {

    public final int WISHLIST_PRIVATE = 0;
    public final int WISHLIST_PUBLIC = 1;
    public final int WISHLIST_FOR_FRIENDS = 2;

    @SerializedName("sharing")
    @Expose
    private Integer sharing;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WishlistStatus() {
    }

    /**
     * 
     * @param sharing
     * @param url
     */
    public WishlistStatus(Integer sharing, String url) {
        super();
        this.sharing = sharing;
        this.url = url;
    }

    public Integer getSharing() {
        return sharing;
    }

    public void setSharing(Integer sharing) {
        this.sharing = sharing;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
