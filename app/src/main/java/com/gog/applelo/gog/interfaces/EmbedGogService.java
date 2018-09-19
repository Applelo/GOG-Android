package com.gog.applelo.gog.interfaces;

import com.gog.applelo.gog.models.user.User;
import com.gog.applelo.gog.models.user.UserData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EmbedGogService {

    String API = "https://embed.gog.com";

    //region - user

    @GET(API + "/userData.json")
    Call<UserData> userData();

    @GET(API + "/users/info/{user_id}")
    Call<User> userInfo(
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


}
