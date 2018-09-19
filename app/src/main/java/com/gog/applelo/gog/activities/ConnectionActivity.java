package com.gog.applelo.gog.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.gog.applelo.gog.R;
import com.gog.applelo.gog.interfaces.AuthGogService;
import com.gog.applelo.gog.models.auth.Token;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ConnectionActivity extends AppCompatActivity {

    private String client_id = "46899977096215655";
    private String client_secret = "9d85c43b1482497dbbce61f6e4aa173a433796eeae2ca8c5f6129f2dc4de46d9";
    private String redirect_uri = "https://embed.gog.com/on_login_success?origin=client";
    private String response_type = "code";
    private String layout = "client2";
    private String code;

    private Handler refreshToken;
    public Token token;

    public Retrofit retrofit;
    private OkHttpClient client;
    private AuthGogService authGogService;

    @BindView(R.id.connectionWebView) WebView webView;
    @BindView(R.id.connectionProgressBar) ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);
        ButterKnife.bind(this);
        updateRetrofit(false);
        authGogService = retrofit.create(AuthGogService.class);


        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient(){

                @Override
                public void onPageFinished(WebView view, String url) {
                    if (url.contains(redirect_uri)) {
                        final HttpUrl parsedUrl = HttpUrl.parse(url);
                        if (parsedUrl != null) {
                            code = parsedUrl.queryParameter("code");
                            webView.setVisibility(View.GONE);
                            progressBar.setVisibility(View.VISIBLE);
                            gogGetToken();
                        }
                    }
                }

        });


        gogConnexion();
    }

    private void gogConnexion() {
        webView.loadUrl(Uri.parse("https://auth.gog.com/auth?client_id=" + client_id + "&redirect_uri="  + redirect_uri + "&response_type=" + response_type + "&layout=" + layout).toString());
    }

    private void gogGetToken() {

        Call<Token> call = authGogService.newToken(client_id, client_secret, "authorization_code", code, redirect_uri);
        call.enqueue(new Callback<Token>() {
            @Override
            public void onResponse(Call<Token> call, retrofit2.Response<Token> response) {

                token = response.body();
                Log.d("get", token.getAccess_token());
                updateRetrofit(true);

                Intent i = new Intent(getBaseContext(), MainActivity.class);
                startActivity(i);


                //refresh token every hour
                refreshToken = new Handler();
                refreshToken.postDelayed(new Runnable() {
                    public void run() {
                        gogRefreshToken();
                    }
                }, 600000 * 60);//one hour
            }

            @Override
            public void onFailure(Call<Token> call, Throwable t) {

            }
        });

    }

    private void gogRefreshToken() {

        Call<Token> call = authGogService.refreshToken(client_id, client_secret, "refresh_token", token.getRefresh_token());
        call.enqueue(new Callback<Token>() {
            @Override
            public void onResponse(Call<Token> call, retrofit2.Response<Token> response) {
                token = response.body();
                Log.d("refresh", token.getAccess_token());
                updateRetrofit(true);
            }

            @Override
            public void onFailure(Call<Token> call, Throwable t) {

            }
        });
    }

    private void updateRetrofit(boolean haveToken) {
        if (haveToken) {
            client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
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

}
