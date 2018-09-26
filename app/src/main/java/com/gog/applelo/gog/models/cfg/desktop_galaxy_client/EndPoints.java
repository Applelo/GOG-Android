
package com.gog.applelo.gog.models.cfg.desktop_galaxy_client;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EndPoints {

    @SerializedName("files")
    @Expose
    private String files;
    @SerializedName("products")
    @Expose
    private String products;
    @SerializedName("users")
    @Expose
    private String users;
    @SerializedName("auth")
    @Expose
    private String auth;
    @SerializedName("cdn")
    @Expose
    private String cdn;
    @SerializedName("productsDetails")
    @Expose
    private String productsDetails;
    @SerializedName("gameplay")
    @Expose
    private String gameplay;
    @SerializedName("gog-api")
    @Expose
    private String gogApi;
    @SerializedName("remoteConfig")
    @Expose
    private String remoteConfig;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EndPoints() {
    }

    /**
     * 
     * @param productsDetails
     * @param files
     * @param users
     * @param remoteConfig
     * @param cdn
     * @param gameplay
     * @param gogApi
     * @param products
     * @param auth
     */
    public EndPoints(String files, String products, String users, String auth, String cdn, String productsDetails, String gameplay, String gogApi, String remoteConfig) {
        super();
        this.files = files;
        this.products = products;
        this.users = users;
        this.auth = auth;
        this.cdn = cdn;
        this.productsDetails = productsDetails;
        this.gameplay = gameplay;
        this.gogApi = gogApi;
        this.remoteConfig = remoteConfig;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getCdn() {
        return cdn;
    }

    public void setCdn(String cdn) {
        this.cdn = cdn;
    }

    public String getProductsDetails() {
        return productsDetails;
    }

    public void setProductsDetails(String productsDetails) {
        this.productsDetails = productsDetails;
    }

    public String getGameplay() {
        return gameplay;
    }

    public void setGameplay(String gameplay) {
        this.gameplay = gameplay;
    }

    public String getGogApi() {
        return gogApi;
    }

    public void setGogApi(String gogApi) {
        this.gogApi = gogApi;
    }

    public String getRemoteConfig() {
        return remoteConfig;
    }

    public void setRemoteConfig(String remoteConfig) {
        this.remoteConfig = remoteConfig;
    }

}
