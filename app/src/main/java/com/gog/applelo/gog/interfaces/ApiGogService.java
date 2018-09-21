package com.gog.applelo.gog.interfaces;

import com.gog.applelo.gog.models.api.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiGogService {

    String API = "https://api.gog.com";

    @GET(API + "/products/{user_id}")
    Call<Product> getProduct(
            @Path("product_id") String product_id,
            @Query("expand") String expand, //downloads, expanded_dlcs, description, screenshots, videos, related_products, changelog separated by comma
            @Query("locale") String locale
    );

    @GET(API + "/products")
    Call<List<Product>> getProducts(
            @Query("ids") String ids,
            @Query("expand") String expand, //downloads, expanded_dlcs, description, screenshots, videos, related_products, changelog separated by comma
            @Query("locale") String locale
    );

}
