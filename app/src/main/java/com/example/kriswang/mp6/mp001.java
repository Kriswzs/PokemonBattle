package com.example.kriswang.mp6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class mp001 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mp001);

        WebView wv = (WebView) findViewById(R.id.wv);
        wv.loadUrl("https://www.youtube.com/watch?v=p9jY5clw3P0");
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new WebViewClient());

    }
}
