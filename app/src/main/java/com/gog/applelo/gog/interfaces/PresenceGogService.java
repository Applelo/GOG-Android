package com.gog.applelo.gog.interfaces;

import com.gog.applelo.gog.models.presence.GetStatuses;
import com.gog.applelo.gog.models.presence.OptionsStatuses;

import okhttp3.ResponseBody;
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


    /**
     * Ping user status
     * @param version last version of galaxy client (example: 1.2.45)
     * @return Call<ResponseBody>
     */
    @FormUrlEncoded
    @POST(API + " /users/{user_id}/status")
    Call<ResponseBody> pingUserStatus(
            @Field("version") String version
    );

    /**
     * Set the user status to offline
     * @return Call<ResponseBody>
     */
    @DELETE(API + "/users/{user_id}/status")
    Call<ResponseBody> setUserOfflineStatus();

    /**
     * No idea what this does, but the official client uses it every time before doing the GET request. Response never contains any items.
     * @param user_id Users ids separated by commas
     * @return Call<OptionsStatuses>
     */
    @OPTIONS(API + "/statuses")
    Call<OptionsStatuses> optionsStatuses(
            @Query("user_id") String user_id//like 46988961654682898,46988886297334688,47510856674996320
    );

    /**
     * Returns the users who are online at the moment.
     * @param user_id Users ids separated by commas
     * @return Call<GetStatuses>
     */
    @GET(API + "/statuses")
    Call<GetStatuses> getStatuses(
            @Query("user_id") String user_id//like 46988961654682898,46988886297334688,47510856674996320
    );




}
