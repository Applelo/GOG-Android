package com.gog.applelo.gog.interfaces;

import com.gog.applelo.gog.models.users.User;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UsersGogService {

    String API = "https://users.gog.com";


    /**
     * Returns information about the user
     * @return Call<User>
     */
    @GET(API + "/users/{user_id}")
    Call<User> getUser();

}
