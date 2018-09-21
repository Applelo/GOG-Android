
package com.gog.applelo.gog.models.api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("purchase_link")
    @Expose
    private String purchaseLink;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("content_system_compatibility")
    @Expose
    private ContentSystemCompatibility contentSystemCompatibility;
    @SerializedName("languages")
    @Expose
    private Languages languages;
    @SerializedName("links")
    @Expose
    private Links links;
    @SerializedName("in_development")
    @Expose
    private InDevelopment inDevelopment;
    @SerializedName("is_secret")
    @Expose
    private Boolean isSecret;
    @SerializedName("is_installable")
    @Expose
    private Boolean isInstallable;
    @SerializedName("game_type")
    @Expose
    private String gameType;
    @SerializedName("is_pre_order")
    @Expose
    private Boolean isPreOrder;
    @SerializedName("release_date")
    @Expose
    private String releaseDate;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("dlcs")
    @Expose
    private List<Object> dlcs = null;
    @SerializedName("downloads")
    @Expose
    private Downloads downloads;
    @SerializedName("expanded_dlcs")
    @Expose
    private List<Object> expandedDlcs = null;
    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("screenshots")
    @Expose
    private List<Screenshot> screenshots = null;
    @SerializedName("videos")
    @Expose
    private List<Video> videos = null;
    @SerializedName("related_products")
    @Expose
    private List<Object> relatedProducts = null;
    @SerializedName("changelog")
    @Expose
    private Object changelog;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param isPreOrder
     * @param relatedProducts
     * @param dlcs
     * @param gameType
     * @param videos
     * @param changelog
     * @param links
     * @param isInstallable
     * @param purchaseLink
     * @param downloads
     * @param id
     * @param languages
     * @param title
     * @param releaseDate
     * @param screenshots
     * @param description
     * @param inDevelopment
     * @param expandedDlcs
     * @param images
     * @param slug
     * @param isSecret
     * @param contentSystemCompatibility
     */
    public Product(Integer id, String title, String purchaseLink, String slug, ContentSystemCompatibility contentSystemCompatibility, Languages languages, Links links, InDevelopment inDevelopment, Boolean isSecret, Boolean isInstallable, String gameType, Boolean isPreOrder, String releaseDate, Images images, List<Object> dlcs, Downloads downloads, List<Object> expandedDlcs, Description description, List<Screenshot> screenshots, List<Video> videos, List<Object> relatedProducts, Object changelog) {
        super();
        this.id = id;
        this.title = title;
        this.purchaseLink = purchaseLink;
        this.slug = slug;
        this.contentSystemCompatibility = contentSystemCompatibility;
        this.languages = languages;
        this.links = links;
        this.inDevelopment = inDevelopment;
        this.isSecret = isSecret;
        this.isInstallable = isInstallable;
        this.gameType = gameType;
        this.isPreOrder = isPreOrder;
        this.releaseDate = releaseDate;
        this.images = images;
        this.dlcs = dlcs;
        this.downloads = downloads;
        this.expandedDlcs = expandedDlcs;
        this.description = description;
        this.screenshots = screenshots;
        this.videos = videos;
        this.relatedProducts = relatedProducts;
        this.changelog = changelog;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPurchaseLink() {
        return purchaseLink;
    }

    public void setPurchaseLink(String purchaseLink) {
        this.purchaseLink = purchaseLink;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public ContentSystemCompatibility getContentSystemCompatibility() {
        return contentSystemCompatibility;
    }

    public void setContentSystemCompatibility(ContentSystemCompatibility contentSystemCompatibility) {
        this.contentSystemCompatibility = contentSystemCompatibility;
    }

    public Languages getLanguages() {
        return languages;
    }

    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public InDevelopment getInDevelopment() {
        return inDevelopment;
    }

    public void setInDevelopment(InDevelopment inDevelopment) {
        this.inDevelopment = inDevelopment;
    }

    public Boolean getIsSecret() {
        return isSecret;
    }

    public void setIsSecret(Boolean isSecret) {
        this.isSecret = isSecret;
    }

    public Boolean getIsInstallable() {
        return isInstallable;
    }

    public void setIsInstallable(Boolean isInstallable) {
        this.isInstallable = isInstallable;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public Boolean getIsPreOrder() {
        return isPreOrder;
    }

    public void setIsPreOrder(Boolean isPreOrder) {
        this.isPreOrder = isPreOrder;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public List<Object> getDlcs() {
        return dlcs;
    }

    public void setDlcs(List<Object> dlcs) {
        this.dlcs = dlcs;
    }

    public Downloads getDownloads() {
        return downloads;
    }

    public void setDownloads(Downloads downloads) {
        this.downloads = downloads;
    }

    public List<Object> getExpandedDlcs() {
        return expandedDlcs;
    }

    public void setExpandedDlcs(List<Object> expandedDlcs) {
        this.expandedDlcs = expandedDlcs;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public List<Screenshot> getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(List<Screenshot> screenshots) {
        this.screenshots = screenshots;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public List<Object> getRelatedProducts() {
        return relatedProducts;
    }

    public void setRelatedProducts(List<Object> relatedProducts) {
        this.relatedProducts = relatedProducts;
    }

    public Object getChangelog() {
        return changelog;
    }

    public void setChangelog(Object changelog) {
        this.changelog = changelog;
    }

}
