package com.gog.applelo.gog.interfaces;

import com.gog.applelo.gog.models.embed.listing.products.Products;
import com.gog.applelo.gog.models.embed.reviews.ReviewWasHelpful;
import com.gog.applelo.gog.models.embed.reviews.Reviews;
import com.gog.applelo.gog.models.embed.user.User;
import com.gog.applelo.gog.models.embed.user.UserData;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EmbedGogService {

    String API = "https://embed.gog.com";

    //region - user

    /**
     * Get the current user data (galaxyuserid...)
     * @return Call<UserData>
     */
    @GET(API + "/userData.json")
    Call<UserData> getUserData();


    /**
     * Get user info
     * @param user_id User id
     * @param expand friendStatus,wishlistStatus,blockedStatus
     * @return Call<User>
     */
    @GET(API + "/users/info/{user_id}")
    Call<User> getUserInfo(
            @Path("user_id") String user_id,
            @Query("expand") String expand
    );

    //endregion

    //region - listing

    /**
     * Searches for all available products matching the given criterias.
     * @param search Search string
     * @param page Page number
     * @return Call<Products>
     */
    @GET(API + "/games/ajax/filtered")
    Call<Products> searchProducts(
            @Query("search") String search,
            @Query("page") String page
    );

    /**
     * Searches for all available products matching the given criterias.
     * @param search Search string
     * @param mediaType game or movie
     * @param page Page number
     * @return Call<Products>
     */
    @GET(API + "/games/ajax/filtered")
    Call<Products> searchProducts(
            @Query("search") String search,
            @Query("mediaType") String mediaType,
            @Query("page") String page
    );

    /**
     * Searches for all available products matching the given criterias.
     * Movies don’t support the parameters category, devpub, feature, release, system.
     * @param mediaType game or movie
     * @param page Page number
     * @param price Price range
     * @param search Search string
     * @param sort Sort order
     * @param limit Max results
     * @return Call<Products>
     */
    @GET(API + "/games/ajax/filtered")
    Call<Products> searchProducts(
            @Query("search") String search,
            @Query("mediaType") String mediaType,
            @Query("page") String page,
            @Query("price") String price,
            @Query("sort") String sort,
            @Query("limit") String limit
    );

    /**
     * Searches for all available products matching the given criterias.
     * Movies don’t support the parameters category, devpub, feature, release, system.
     * @param category Game genre
     * @param devpub Developer or publisher
     * @param feature Game features
     * @param mediaType game or movie
     * @param page Page number
     * @param price Price range
     * @param release Release timeframe
     * @param search Search string
     * @param sort Sort order
     * @param system os
     * @param limit Max results
     * @return Call<Products>
     */
    @GET(API + "/games/ajax/filtered")
    Call<Products> searchProducts(
            @Query("search") String search,
            @Query("mediaType") String mediaType,
            @Query("page") String page,
            @Query("category") String category,
            @Query("devpub") String devpub,
            @Query("feature") String feature ,
            @Query("price") String price,
            @Query("release") String release,
            @Query("sort") String sort,
            @Query("system") String system,
            @Query("limit") String limit
    );

    //endregion

    //region - reviews

    /**
     * Returns the reviews for a game
     * @param product_id product id
     * @param page page of review
     * @return Call<Reviews>
     */
    @GET(API + "/reviews/product/{product_id}.json")
    Call<Reviews> getProductReviews(
        @Path("product_id") String product_id,
        @Query("page") int page
    );

    /**
     * Set a review was helpful or not for the user
     * @param review_id the review id
     * @param review_was_helpful the review was helpful or not
     * @return Call<ResponseBody>
     */
    @Headers("Content-Type: application/json;charset=UTF-8")
    @POST(API + "/reviews/vote/review/{review_id}.json")
    Call<ResponseBody> postReviewWasHelpful(
            @Path("review_id") String review_id,
            @Body ReviewWasHelpful review_was_helpful
    );

    /**
     * Report the review
     * @param review_id the review id
     * @return Call<ResponseBody>
     */
    @Headers("Content-Type: application/json;charset=UTF-8")
    @POST(API + "/reviews/report/review/{review_id}.json")
    Call<ResponseBody> postReviewReport(
            @Path("review_id") String review_id
    );
    //endregion

}
