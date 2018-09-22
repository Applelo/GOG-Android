
package com.gog.applelo.gog.models.contentsystem;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("build_id")
    @Expose
    private String buildId;
    @SerializedName("product_id")
    @Expose
    private String productId;
    @SerializedName("os")
    @Expose
    private String os;
    @SerializedName("branch")
    @Expose
    private Object branch;
    @SerializedName("version_name")
    @Expose
    private String versionName;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("public")
    @Expose
    private Boolean _public;
    @SerializedName("date_published")
    @Expose
    private String datePublished;
    @SerializedName("generation")
    @Expose
    private Integer generation;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("legacy_build_id")
    @Expose
    private Integer legacyBuildId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param tags
     * @param os
     * @param _public
     * @param buildId
     * @param link
     * @param datePublished
     * @param legacyBuildId
     * @param branch
     * @param versionName
     * @param generation
     * @param productId
     */
    public Item(String buildId, String productId, String os, Object branch, String versionName, List<String> tags, Boolean _public, String datePublished, Integer generation, String link, Integer legacyBuildId) {
        super();
        this.buildId = buildId;
        this.productId = productId;
        this.os = os;
        this.branch = branch;
        this.versionName = versionName;
        this.tags = tags;
        this._public = _public;
        this.datePublished = datePublished;
        this.generation = generation;
        this.link = link;
        this.legacyBuildId = legacyBuildId;
    }

    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Object getBranch() {
        return branch;
    }

    public void setBranch(Object branch) {
        this.branch = branch;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public Integer getGeneration() {
        return generation;
    }

    public void setGeneration(Integer generation) {
        this.generation = generation;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getLegacyBuildId() {
        return legacyBuildId;
    }

    public void setLegacyBuildId(Integer legacyBuildId) {
        this.legacyBuildId = legacyBuildId;
    }

}
