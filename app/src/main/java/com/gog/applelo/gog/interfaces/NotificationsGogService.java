package com.gog.applelo.gog.interfaces;

import com.gog.applelo.gog.models.embed.user.UserData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface NotificationsGogService {

    String API = "https://notifications.gog.com";


    @GET(API + "/clients/46899977096215655/users/{galaxy_user_id}/notifications")
    Call<UserData> getNotifications(
            @Path("galaxy_user_id") String galaxy_user_id,
            @Query("access_token") String access_token,
            @Query("types") String types//filter types chat,friends,user_notification,activity_feed
    );

}
