package com.gog.applelo.gog.interfaces;

import com.gog.applelo.gog.models.auth.Token;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AuthGogService {

    String API = "https://auth.gog.com";

    /**
     * Get a new token
     * @param client_id
     * @param client_secret
     * @param grant_type
     * @param code
     * @param redirect_uri
     * @return Call<Token>
     */
    @GET(API + "/token")
    Call<Token> newToken(
            @Query("client_id") String client_id,
            @Query("client_secret") String client_secret,
            @Query("grant_type") String grant_type,
            @Query("code") String code,
            @Query("redirect_uri") String redirect_uri
    );

    /**
     * Refresh token
     * @param client_id
     * @param client_secret
     * @param grant_type
     * @param refresh_token
     * @return Call<Token>
     */
    @GET(API + "/token")
    Call<Token> refreshToken(
            @Query("client_id") String client_id,
            @Query("client_secret") String client_secret,
            @Query("grant_type") String grant_type,
            @Query("refresh_token") String refresh_token
    );

}
