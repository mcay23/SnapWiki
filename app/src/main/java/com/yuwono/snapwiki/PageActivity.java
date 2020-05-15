package com.yuwono.snapwiki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        final WebView webview = (WebView) findViewById(R.id.webView);

        webview.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url)
            {
                webview.getSettings().setJavaScriptEnabled(true);
                webview.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('header-container header-chrome')[0].style.display='none';" +
                        "document.getElementsByClassName('post-content footer-content')[0].style.display='none'; })()");
            }
            @Override
            public boolean shouldOverrideUrlLoading(WebView  view, String  url){
                view.loadUrl(url);
                return false;
            }
        });

        webview.loadUrl("https://en.m.wikipedia.org/wiki/Patriarch");
        webview.getSettings().setDefaultFontSize(20);
    }
}
