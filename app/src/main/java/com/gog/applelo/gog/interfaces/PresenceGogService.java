package com.gog.applelo.gog.interfaces;

import com.gog.applelo.gog.models.presence.GetStatuses;
import com.gog.applelo.gog.models.presence.OptionsStatuses;

import okhttp3.Response;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.OPTIONS;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface PresenceGogService {

    String API = "https://presence.gog.com";


    @FormUrlEncoded
    @POST(API + " /users/{user_id}/status")
    Call<Response> pingUserStatus(
            @Field("version") String version// last version of galaxy client 1.1.22.11
    );

    @DELETE(API + "/users/{user_id}/status")
    Call<Response> setUserOfflineStatus();

    @OPTIONS(API + "/statuses")
    Call<OptionsStatuses> optionsStatuses(
            @Query("user_id") String user_id//like 46988961654682898,46988886297334688,47510856674996320
    );

    @GET(API + "/statuses")
    Call<GetStatuses> getStatuses(
            @Query("user_id") String user_id//like 46988961654682898,46988886297334688,47510856674996320
    );




}
