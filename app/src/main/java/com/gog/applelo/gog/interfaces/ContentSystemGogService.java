package com.gog.applelo.gog.interfaces;


import com.gog.applelo.gog.models.content_system.Products;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ContentSystemGogService {

    String API = "https://content-system.gog.com";

    /**
     * Returns the available builds for a game.
     * @param product_id The product id
     * @param os  Game OS. Possible values: windows, osx
     * @param generation Max manifest version. Can be 1 or 2.
     * @return Call<Products>
     */
    @GET(API + "/users/{product_id}/os/{os}/builds")
    Call<Products> getProduct(
            @Path("product_id") String product_id,
            @Path("os") String os,
            @Query("generation") int generation
    );



}
