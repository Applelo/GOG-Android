
package com.gog.applelo.gog.models.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links {

    @SerializedName("purchase_link")
    @Expose
    private String purchaseLink;
    @SerializedName("product_card")
    @Expose
    private String productCard;
    @SerializedName("support")
    @Expose
    private String support;
    @SerializedName("forum")
    @Expose
    private String forum;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Links() {
    }

    /**
     * 
     * @param forum
     * @param support
     * @param productCard
     * @param purchaseLink
     */
    public Links(String purchaseLink, String productCard, String support, String forum) {
        super();
        this.purchaseLink = purchaseLink;
        this.productCard = productCard;
        this.support = support;
        this.forum = forum;
    }

    public String getPurchaseLink() {
        return purchaseLink;
    }

    public void setPurchaseLink(String purchaseLink) {
        this.purchaseLink = purchaseLink;
    }

    public String getProductCard() {
        return productCard;
    }

    public void setProductCard(String productCard) {
        this.productCard = productCard;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public String getForum() {
        return forum;
    }

    public void setForum(String forum) {
        this.forum = forum;
    }

}
