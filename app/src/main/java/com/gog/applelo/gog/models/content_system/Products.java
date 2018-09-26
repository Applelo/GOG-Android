
package com.gog.applelo.gog.models.content_system;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Products {

    @SerializedName("total_count")
    @Expose
    private Integer totalCount;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    @SerializedName("has_private_branches")
    @Expose
    private Boolean hasPrivateBranches;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Products() {
    }

    /**
     * 
     * @param hasPrivateBranches
     * @param count
     * @param items
     * @param totalCount
     */
    public Products(Integer totalCount, Integer count, List<Item> items, Boolean hasPrivateBranches) {
        super();
        this.totalCount = totalCount;
        this.count = count;
        this.items = items;
        this.hasPrivateBranches = hasPrivateBranches;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Boolean getHasPrivateBranches() {
        return hasPrivateBranches;
    }

    public void setHasPrivateBranches(Boolean hasPrivateBranches) {
        this.hasPrivateBranches = hasPrivateBranches;
    }

}
