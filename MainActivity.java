package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView webView = new WebView(this);
        setContentView(webView);

        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);

        String videoId = "dQw4w9WgXcQ";
        String html = "<html><body style='margin:0;padding:0;'><iframe width='100%' height='100%' src='https://www.youtube.com/embed/" + videoId + "' frameborder='0' allowfullscreen></iframe></body></html>";
        webView.loadData(html, "text/html", "utf-8");
    }
}