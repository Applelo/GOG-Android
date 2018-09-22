package com.gog.applelo.gog.interfaces;

import com.gog.applelo.gog.models.chat.friends.Friends;
import com.gog.applelo.gog.models.chat.invitations.Invitations;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ChatGogService {

    String API = "https://chat.gog.com";

    @GET(API + "/users/{galaxy_user_id}/friends")
    Call<Friends> getFriends(
            @Path("galaxy_user_id") String galaxy_user_id
    );

    @GET(API + "/users/{galaxy_user_id}/invitations")
    Call<Invitations> getInvitations(
            @Path("galaxy_user_id") String galaxy_user_id
    );


}

