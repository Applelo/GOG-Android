
package com.gog.applelo.gog.models.gameplay.achievements;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Achievements {

    @SerializedName("total_count")
    @Expose
    private Integer totalCount;
    @SerializedName("limit")
    @Expose
    private Integer limit;
    @SerializedName("page_token")
    @Expose
    private String pageToken;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    @SerializedName("achievements_mode")
    @Expose
    private String achievementsMode;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Achievements() {
    }

    /**
     * 
     * @param limit
     * @param achievementsMode
     * @param items
     * @param totalCount
     * @param pageToken
     */
    public Achievements(Integer totalCount, Integer limit, String pageToken, List<Item> items, String achievementsMode) {
        super();
        this.totalCount = totalCount;
        this.limit = limit;
        this.pageToken = pageToken;
        this.items = items;
        this.achievementsMode = achievementsMode;
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

    public String getPageToken() {
        return pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getAchievementsMode() {
        return achievementsMode;
    }

    public void setAchievementsMode(String achievementsMode) {
        this.achievementsMode = achievementsMode;
    }

}
