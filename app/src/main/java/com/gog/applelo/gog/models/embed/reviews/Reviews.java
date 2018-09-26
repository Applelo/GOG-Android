
package com.gog.applelo.gog.models.embed.reviews;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reviews {

    @SerializedName("reviews")
    @Expose
    private List<Review> reviews = null;
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

    /**
     * No args constructor for use in serialization
     * 
     */
    public Reviews() {
    }

    /**
     * 
     * @param reviews
     * @param ts
     * @param totalResults
     * @param page
     * @param totalPages
     */
    public Reviews(List<Review> reviews, Object ts, Integer page, Integer totalPages, String totalResults) {
        super();
        this.reviews = reviews;
        this.ts = ts;
        this.page = page;
        this.totalPages = totalPages;
        this.totalResults = totalResults;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
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

}
