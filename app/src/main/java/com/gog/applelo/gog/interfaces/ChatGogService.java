package com.gog.applelo.gog.interfaces;

import com.gog.applelo.gog.models.chat.friends.Friends;
import com.gog.applelo.gog.models.chat.invitations.Invitations;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ChatGogService {

    String API = "https://chat.gog.com";

    /**
     * Returns the list of friends.
     * @param user_id
     * @return Call<Friends>
     */
    @GET(API + "/users/{user_id}/friends")
    Call<Friends> getFriends(
            @Path("user_id") String user_id
    );


    /**
     * Return the list of invitations
     * @param user_id
     * @return Call<Invitations>
     */
    @GET(API + "/users/{user_id}/invitations")
    Call<Invitations> getInvitations(
            @Path("user_id") String user_id
    );


}

