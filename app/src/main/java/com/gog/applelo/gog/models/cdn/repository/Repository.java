
package com.gog.applelo.gog.models.cdn.repository;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Repository {

    @SerializedName("product")
    @Expose
    private Product product;
    @SerializedName("version")
    @Expose
    private Integer version;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Repository() {
    }

    /**
     * 
     * @param product
     * @param version
     */
    public Repository(Product product, Integer version) {
        super();
        this.product = product;
        this.version = version;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

}
