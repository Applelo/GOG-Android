
package com.gog.applelo.gog.models.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Checksum {

    @SerializedName("cart")
    @Expose
    private Object cart;
    @SerializedName("games")
    @Expose
    private String games;
    @SerializedName("wishlist")
    @Expose
    private String wishlist;
    @SerializedName("reviews_votes")
    @Expose
    private Object reviewsVotes;
    @SerializedName("games_rating")
    @Expose
    private Object gamesRating;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Checksum() {
    }

    /**
     * 
     * @param games
     * @param reviewsVotes
     * @param wishlist
     * @param cart
     * @param gamesRating
     */
    public Checksum(Object cart, String games, String wishlist, Object reviewsVotes, Object gamesRating) {
        super();
        this.cart = cart;
        this.games = games;
        this.wishlist = wishlist;
        this.reviewsVotes = reviewsVotes;
        this.gamesRating = gamesRating;
    }

    public Object getCart() {
        return cart;
    }

    public void setCart(Object cart) {
        this.cart = cart;
    }

    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }

    public String getWishlist() {
        return wishlist;
    }

    public void setWishlist(String wishlist) {
        this.wishlist = wishlist;
    }

    public Object getReviewsVotes() {
        return reviewsVotes;
    }

    public void setReviewsVotes(Object reviewsVotes) {
        this.reviewsVotes = reviewsVotes;
    }

    public Object getGamesRating() {
        return gamesRating;
    }

    public void setGamesRating(Object gamesRating) {
        this.gamesRating = gamesRating;
    }

}
