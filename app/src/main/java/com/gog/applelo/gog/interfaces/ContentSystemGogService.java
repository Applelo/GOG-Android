package com.gog.applelo.gog.interfaces;


import com.gog.applelo.gog.models.contentsystem.Products;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ContentSystemGogService {

    String API = "https://chat.gog.com";

    @GET(API + "/users/{product_id}/os/{os}/builds")
    Call<Products> getProduct(
            @Path("product_id") String product_id,
            @Path("os") String os,
            @Query("generation") int generation
    );



}
