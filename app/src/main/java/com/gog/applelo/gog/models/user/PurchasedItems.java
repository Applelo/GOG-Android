
package com.gog.applelo.gog.models.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PurchasedItems {

    @SerializedName("games")
    @Expose
    private Integer games;
    @SerializedName("movies")
    @Expose
    private Integer movies;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PurchasedItems() {
    }

    /**
     * 
     * @param games
     * @param movies
     */
    public PurchasedItems(Integer games, Integer movies) {
        super();
        this.games = games;
        this.movies = movies;
    }

    public Integer getGames() {
        return games;
    }

    public void setGames(Integer games) {
        this.games = games;
    }

    public Integer getMovies() {
        return movies;
    }

    public void setMovies(Integer movies) {
        this.movies = movies;
    }

}
