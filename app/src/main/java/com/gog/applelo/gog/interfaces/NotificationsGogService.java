package com.gog.applelo.gog.interfaces;

import com.gog.applelo.gog.models.embed.user.UserData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface NotificationsGogService {

    String API = "https://notifications.gog.com";


    /**
     * Get user notifications
     * @param user_id
     * @param access_token
     * @param types
     * @return Call<UserData>
     */
    @GET(API + "/clients/46899977096215655/users/{user_id}/notifications")
    Call<UserData> getNotifications(
            @Path("galaxy_user_id") String user_id,
            @Query("access_token") String access_token,
            @Query("types") String types//filter types chat,friends,user_notification,activity_feed
    );

}
