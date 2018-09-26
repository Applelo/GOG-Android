
package com.gog.applelo.gog.models.embed.listing.products;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Products {

    @SerializedName("products")
    @Expose
    private List<Product> products = null;
    @SerializedName("ts")
    @Expose
    private Object ts;
    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("totalPages")
    @Expose
    private Integer totalPages;
    @SerializedName("totalResults")
    @Expose
    private String totalResults;
    @SerializedName("totalGamesFound")
    @Expose
    private Integer totalGamesFound;
    @SerializedName("totalMoviesFound")
    @Expose
    private Integer totalMoviesFound;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Products() {
    }

    /**
     * 
     * @param ts
     * @param totalGamesFound
     * @param totalResults
     * @param page
     * @param totalMoviesFound
     * @param products
     * @param totalPages
     */
    public Products(List<Product> products, Object ts, Integer page, Integer totalPages, String totalResults, Integer totalGamesFound, Integer totalMoviesFound) {
        super();
        this.products = products;
        this.ts = ts;
        this.page = page;
        this.totalPages = totalPages;
        this.totalResults = totalResults;
        this.totalGamesFound = totalGamesFound;
        this.totalMoviesFound = totalMoviesFound;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Object getTs() {
        return ts;
    }

    public void setTs(Object ts) {
        this.ts = ts;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public Integer getTotalGamesFound() {
        return totalGamesFound;
    }

    public void setTotalGamesFound(Integer totalGamesFound) {
        this.totalGamesFound = totalGamesFound;
    }

    public Integer getTotalMoviesFound() {
        return totalMoviesFound;
    }

    public void setTotalMoviesFound(Integer totalMoviesFound) {
        this.totalMoviesFound = totalMoviesFound;
    }

}
