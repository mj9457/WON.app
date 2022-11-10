package com.wonsapp.wonsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView:WebView = findViewById(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()
        webView.webChromeClient = WebChromeClient()

        webView.loadUrl("https://wons.netlify.app/")
    }

    override fun onBackPressed() {
        val webView:WebView = findViewById(R.id.webView)
        if(webView.canGoBack()) {
            webView.goBack()
        }
        else {
            super.onBackPressed()
        }

    }
}