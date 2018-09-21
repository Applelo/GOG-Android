
package com.gog.applelo.gog.models.presence;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OptionsStatuses {

    @SerializedName("items")
    @Expose
    private List<Object> items = null;
    @SerializedName("limit")
    @Expose
    private Integer limit;
    @SerializedName("total_count")
    @Expose
    private Integer totalCount;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OptionsStatuses() {
    }

    /**
     * 
     * @param limit
     * @param totalCount
     * @param items
     */
    public OptionsStatuses(List<Object> items, Integer limit, Integer totalCount) {
        super();
        this.items = items;
        this.limit = limit;
        this.totalCount = totalCount;
    }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

}
