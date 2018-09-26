
package com.gog.applelo.gog.models.embed.listing.products;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("customAttributes")
    @Expose
    private List<Object> customAttributes = null;
    @SerializedName("developer")
    @Expose
    private String developer;
    @SerializedName("publisher")
    @Expose
    private String publisher;
    @SerializedName("gallery")
    @Expose
    private List<String> gallery = null;
    @SerializedName("video")
    @Expose
    private Video video;
    @SerializedName("supportedOperatingSystems")
    @Expose
    private List<String> supportedOperatingSystems = null;
    @SerializedName("genres")
    @Expose
    private List<String> genres = null;
    @SerializedName("globalReleaseDate")
    @Expose
    private Integer globalReleaseDate;
    @SerializedName("isTBA")
    @Expose
    private Boolean isTBA;
    @SerializedName("price")
    @Expose
    private Price price;
    @SerializedName("isDiscounted")
    @Expose
    private Boolean isDiscounted;
    @SerializedName("isInDevelopment")
    @Expose
    private Boolean isInDevelopment;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("releaseDate")
    @Expose
    private Integer releaseDate;
    @SerializedName("availability")
    @Expose
    private Availability availability;
    @SerializedName("salesVisibility")
    @Expose
    private SalesVisibility salesVisibility;
    @SerializedName("buyable")
    @Expose
    private Boolean buyable;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("supportUrl")
    @Expose
    private String supportUrl;
    @SerializedName("forumUrl")
    @Expose
    private String forumUrl;
    @SerializedName("worksOn")
    @Expose
    private WorksOn worksOn;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("originalCategory")
    @Expose
    private String originalCategory;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("isComingSoon")
    @Expose
    private Boolean isComingSoon;
    @SerializedName("isPriceVisible")
    @Expose
    private Boolean isPriceVisible;
    @SerializedName("isMovie")
    @Expose
    private Boolean isMovie;
    @SerializedName("isGame")
    @Expose
    private Boolean isGame;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("isWishlistable")
    @Expose
    private Boolean isWishlistable;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param globalReleaseDate
     * @param isComingSoon
     * @param genres
     * @param worksOn
     * @param isMovie
     * @param forumUrl
     * @param type
     * @param publisher
     * @param customAttributes
     * @param id
     * @param title
     * @param isWishlistable
     * @param releaseDate
     * @param isTBA
     * @param video
     * @param availability
     * @param salesVisibility
     * @param supportedOperatingSystems
     * @param isInDevelopment
     * @param gallery
     * @param supportUrl
     * @param originalCategory
     * @param image
     * @param url
     * @param category
     * @param price
     * @param isPriceVisible
     * @param developer
     * @param buyable
     * @param slug
     * @param rating
     * @param isGame
     * @param isDiscounted
     */
    public Product(List<Object> customAttributes, String developer, String publisher, List<String> gallery, Video video, List<String> supportedOperatingSystems, List<String> genres, Integer globalReleaseDate, Boolean isTBA, Price price, Boolean isDiscounted, Boolean isInDevelopment, Integer id, Integer releaseDate, Availability availability, SalesVisibility salesVisibility, Boolean buyable, String title, String image, String url, String supportUrl, String forumUrl, WorksOn worksOn, String category, String originalCategory, Integer rating, Integer type, Boolean isComingSoon, Boolean isPriceVisible, Boolean isMovie, Boolean isGame, String slug, Boolean isWishlistable) {
        super();
        this.customAttributes = customAttributes;
        this.developer = developer;
        this.publisher = publisher;
        this.gallery = gallery;
        this.video = video;
        this.supportedOperatingSystems = supportedOperatingSystems;
        this.genres = genres;
        this.globalReleaseDate = globalReleaseDate;
        this.isTBA = isTBA;
        this.price = price;
        this.isDiscounted = isDiscounted;
        this.isInDevelopment = isInDevelopment;
        this.id = id;
        this.releaseDate = releaseDate;
        this.availability = availability;
        this.salesVisibility = salesVisibility;
        this.buyable = buyable;
        this.title = title;
        this.image = image;
        this.url = url;
        this.supportUrl = supportUrl;
        this.forumUrl = forumUrl;
        this.worksOn = worksOn;
        this.category = category;
        this.originalCategory = originalCategory;
        this.rating = rating;
        this.type = type;
        this.isComingSoon = isComingSoon;
        this.isPriceVisible = isPriceVisible;
        this.isMovie = isMovie;
        this.isGame = isGame;
        this.slug = slug;
        this.isWishlistable = isWishlistable;
    }

    public List<Object> getCustomAttributes() {
        return customAttributes;
    }

    public void setCustomAttributes(List<Object> customAttributes) {
        this.customAttributes = customAttributes;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<String> getGallery() {
        return gallery;
    }

    public void setGallery(List<String> gallery) {
        this.gallery = gallery;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public List<String> getSupportedOperatingSystems() {
        return supportedOperatingSystems;
    }

    public void setSupportedOperatingSystems(List<String> supportedOperatingSystems) {
        this.supportedOperatingSystems = supportedOperatingSystems;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public Integer getGlobalReleaseDate() {
        return globalReleaseDate;
    }

    public void setGlobalReleaseDate(Integer globalReleaseDate) {
        this.globalReleaseDate = globalReleaseDate;
    }

    public Boolean getIsTBA() {
        return isTBA;
    }

    public void setIsTBA(Boolean isTBA) {
        this.isTBA = isTBA;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Boolean getIsDiscounted() {
        return isDiscounted;
    }

    public void setIsDiscounted(Boolean isDiscounted) {
        this.isDiscounted = isDiscounted;
    }

    public Boolean getIsInDevelopment() {
        return isInDevelopment;
    }

    public void setIsInDevelopment(Boolean isInDevelopment) {
        this.isInDevelopment = isInDevelopment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public SalesVisibility getSalesVisibility() {
        return salesVisibility;
    }

    public void setSalesVisibility(SalesVisibility salesVisibility) {
        this.salesVisibility = salesVisibility;
    }

    public Boolean getBuyable() {
        return buyable;
    }

    public void setBuyable(Boolean buyable) {
        this.buyable = buyable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSupportUrl() {
        return supportUrl;
    }

    public void setSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
    }

    public String getForumUrl() {
        return forumUrl;
    }

    public void setForumUrl(String forumUrl) {
        this.forumUrl = forumUrl;
    }

    public WorksOn getWorksOn() {
        return worksOn;
    }

    public void setWorksOn(WorksOn worksOn) {
        this.worksOn = worksOn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOriginalCategory() {
        return originalCategory;
    }

    public void setOriginalCategory(String originalCategory) {
        this.originalCategory = originalCategory;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getIsComingSoon() {
        return isComingSoon;
    }

    public void setIsComingSoon(Boolean isComingSoon) {
        this.isComingSoon = isComingSoon;
    }

    public Boolean getIsPriceVisible() {
        return isPriceVisible;
    }

    public void setIsPriceVisible(Boolean isPriceVisible) {
        this.isPriceVisible = isPriceVisible;
    }

    public Boolean getIsMovie() {
        return isMovie;
    }

    public void setIsMovie(Boolean isMovie) {
        this.isMovie = isMovie;
    }

    public Boolean getIsGame() {
        return isGame;
    }

    public void setIsGame(Boolean isGame) {
        this.isGame = isGame;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Boolean getIsWishlistable() {
        return isWishlistable;
    }

    public void setIsWishlistable(Boolean isWishlistable) {
        this.isWishlistable = isWishlistable;
    }

}
