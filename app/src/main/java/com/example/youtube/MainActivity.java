package com.example.youtube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView=findViewById(R.id.webView);
        String video="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/-YRl9zZJP1w?si=WVgbAS9Hc7Nr0A-W\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\"></iframe>";
//          String video="https://www.fmcweekend.in";
           webView.loadData(video,"text/html","utf-8");
           webView.getSettings().setJavaScriptEnabled(true);
           webView.setWebChromeClient(new WebChromeClient());




    }
}