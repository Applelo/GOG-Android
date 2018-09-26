package com.gog.applelo.gog.interfaces;

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
     * @param user_id
     * @param expand
     * @return
     */
    @GET(API + "/users/info/{user_id}")
    Call<User> getUserInfo(
            @Path("user_id") String user_id,
            @Query("expand") String expand //friendStatus,wishlistStatus,blockedStatus
    );

    //endregion

    //region - games & movies

    //endregion

    //region - wishlist

    //endregion

    //region - tags

    //endregion

    //region - settings

    //endregion

    //region - friends

    //endregion


    //region - reviews

    /**
     * Returns the reviews for a game
     * @param product_id
     * @param page
     * @return Call<Reviews>
     */
    @GET(API + "/reviews/product/{product_id}.json")
    Call<Reviews> getProductReviews(
        @Path("product_id") String product_id,
        @Query("page") int page
    );

    /**
     * Set a review was helpful or not for the user
     * @param review_id
     * @param review_was_helpful
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
     * @param review_id
     * @return Call<ResponseBody>
     */
    @Headers("Content-Type: application/json;charset=UTF-8")
    @POST(API + "/reviews/report/review/{review_id}.json")
    Call<ResponseBody> postReviewReport(
            @Path("review_id") String review_id
    );
    //endregion

}
