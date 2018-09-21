package com.gog.applelo.gog;

import com.gog.applelo.gog.models.auth.Token;
import com.gog.applelo.gog.models.embed.user.UserData;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Singleton {

    private static Singleton INSTANCE = null;

    // other instance variables can be here

    private Singleton() {}

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return(INSTANCE);
    }


    //region - retrofit
    private static Retrofit retrofit = null;

    private static void updateRetrofit() {
        if (token != null) {
            OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
                @Override
                public okhttp3.Response intercept(Chain chain) throws IOException {
                    Request newRequest  = chain.request().newBuilder()
                            .addHeader("Authorization", "Bearer " + token.getAccess_token())
                            .build();
                    return chain.proceed(newRequest);
                }
            }).build();

            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .baseUrl("https://embed.gog.com")
                    .build();
        }
        else {
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://embed.gog.com")
                    .build();
        }

    }

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            updateRetrofit();
        }
        return retrofit;
    }

    //endregion


    //region - userData
    private static UserData user = null;

    public static UserData getUser() {
        return user;
    }

    public static void setUser(UserData user) {
        Singleton.user = user;
    }
    //endregion

    //region - token
    private static Token token = null;

    public static Token getToken() {
        return token;
    }

    public static void setToken(Token token) {
        Singleton.token = token;
        updateRetrofit();
    }
    //endregion
}

