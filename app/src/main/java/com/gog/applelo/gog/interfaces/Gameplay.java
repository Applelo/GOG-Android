package com.gog.applelo.gog.interfaces;

import com.gog.applelo.gog.models.gameplay.achievements.Achievements;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Gameplay {

    String API = "https://gameplay.gog.com";

    @GET(API + "/clients/{product_id}/users/{user_id}/achievements")
    Call<Achievements> getAchievements(
        @Path("product_id") String product_id,
        @Path("user_id") String user_id
    );

}
