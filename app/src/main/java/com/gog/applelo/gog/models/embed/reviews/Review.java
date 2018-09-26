
package com.gog.applelo.gog.models.embed.reviews;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Review {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("teaser")
    @Expose
    private String teaser;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("author")
    @Expose
    private Author author;
    @SerializedName("helpfulVotes")
    @Expose
    private Integer helpfulVotes;
    @SerializedName("totalVotes")
    @Expose
    private Integer totalVotes;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("added")
    @Expose
    private Integer added;
    @SerializedName("edited")
    @Expose
    private Integer edited;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Review() {
    }

    /**
     * 
     * @param edited
     * @param id
     * @param author
     * @param title
     * @param added
     * @param description
     * @param totalVotes
     * @param teaser
     * @param rating
     * @param helpfulVotes
     */
    public Review(Integer id, String title, String teaser, String description, Author author, Integer helpfulVotes, Integer totalVotes, Integer rating, Integer added, Integer edited) {
        super();
        this.id = id;
        this.title = title;
        this.teaser = teaser;
        this.description = description;
        this.author = author;
        this.helpfulVotes = helpfulVotes;
        this.totalVotes = totalVotes;
        this.rating = rating;
        this.added = added;
        this.edited = edited;
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

    public String getTeaser() {
        return teaser;
    }

    public void setTeaser(String teaser) {
        this.teaser = teaser;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getHelpfulVotes() {
        return helpfulVotes;
    }

    public void setHelpfulVotes(Integer helpfulVotes) {
        this.helpfulVotes = helpfulVotes;
    }

    public Integer getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(Integer totalVotes) {
        this.totalVotes = totalVotes;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getAdded() {
        return added;
    }

    public void setAdded(Integer added) {
        this.added = added;
    }

    public Integer getEdited() {
        return edited;
    }

    public void setEdited(Integer edited) {
        this.edited = edited;
    }

}
