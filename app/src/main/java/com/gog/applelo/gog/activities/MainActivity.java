package com.gog.applelo.gog.activities;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.gog.applelo.gog.R;

import java.net.MalformedURLException;
import java.net.URL;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.HttpUrl;


public class MainActivity extends AppCompatActivity {

    private String client_id = "46899977096215655";
    private String client_secret = "9d85c43b1482497dbbce61f6e4aa173a433796eeae2ca8c5f6129f2dc4de46d9";
    private String redirect_uri = "https://embed.gog.com/on_login_success?origin=client";
    private String response_type = "code";
    private String layout = "client2";

    private String grant_type;

    //new login
    private String code;

    //refresh
    private String refresh_token;

    private String access_token;

    @BindView(R.id.connectionWebView) WebView webView;
    @BindView(R.id.connectionProgressBar) ProgressBar progressBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

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

    }

    private void gogRefreshToken() {

    }

}
