package com.gog.applelo.gog.models.auth;

import com.google.gson.annotations.SerializedName;

public class Token {

    @SerializedName("expires_in")
    private int expires_in;

    @SerializedName("scope")
    private String scope;

    @SerializedName("token_type")
    private String token_type;

    @SerializedName("access_token")
    private String access_token;

    @SerializedName("user_id")
    private String user_id;

    @SerializedName("refresh_token")
    private String refresh_token;

    @SerializedName("session_id")
    private String session_id;

    public Token(int expires_in, String scope, String token_type, String access_token, String user_id, String refresh_token, String session_id) {
        this.expires_in = expires_in;
        this.scope = scope;
        this.token_type = token_type;
        this.access_token = access_token;
        this.user_id = user_id;
        this.refresh_token = refresh_token;
        this.session_id = session_id;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }
}
