
package com.gog.applelo.gog.models.presence;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetStatuses {

    @SerializedName("total_count")
    @Expose
    private Integer totalCount;
    @SerializedName("limit")
    @Expose
    private Integer limit;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetStatuses() {
    }

    /**
     * 
     * @param limit
     * @param items
     * @param totalCount
     */
    public GetStatuses(Integer totalCount, Integer limit, List<Item> items) {
        super();
        this.totalCount = totalCount;
        this.limit = limit;
        this.items = items;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
