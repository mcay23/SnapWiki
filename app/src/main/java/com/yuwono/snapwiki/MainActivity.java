package com.yuwono.snapwiki;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl("https://en.wikipedia.org/wiki/Carnival_of_Venice");
        myWebView.setWebViewClient(new WebViewClient());
    }
}
