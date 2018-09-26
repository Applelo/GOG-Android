package com.gog.applelo.gog.interfaces;

import com.gog.applelo.gog.models.api.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiGogService {

    String API = "https://api.gog.com";

    /**
     * Returns information about a product.
     * @param product_id The product id
     * @param expand downloads, expanded_dlcs, description, screenshots, videos, related_products, changelog separated by comma
     * @param locale no doc info
     * @return Call<Product>
     */
    @GET(API + "/products/{user_id}")
    Call<Product> getProduct(
            @Path("product_id") String product_id,
            @Query("expand") String expand,
            @Query("locale") String locale
    );


    /**
     * Returns information about products.
     * @param ids Products ids
     * @param expand downloads, expanded_dlcs, description, screenshots, videos, related_products, changelog separated by comma
     * @param locale no doc info
     * @return Call<List<Product>>
     */
    @GET(API + "/products")
    Call<List<Product>> getProducts(
            @Query("ids") String ids,
            @Query("expand") String expand,
            @Query("locale") String locale
    );

}
