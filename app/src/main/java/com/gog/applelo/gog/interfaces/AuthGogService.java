package com.gog.applelo.gog.interfaces;

import com.gog.applelo.gog.models.Token;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AuthGogService {

    String API = "https://auth.gog.com";

    @GET(API + "/token")
    Call<Token> newToken(
            @Query("client_id") String client_id,
            @Query("client_secret") String client_secret,
            @Query("grant_type") String grant_type,
            @Query("code") String code,
            @Query("redirect_uri") String redirect_uri
    );

    @GET(API + "/token")
    Call<Token> refreshToken(
            @Query("client_id") String client_id,
            @Query("client_secret") String client_secret,
            @Query("grant_type") String grant_type,
            @Query("refresh_token") String refresh_token
    );

}
