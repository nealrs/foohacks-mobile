package com.nabilfreeman.androidstudiowebviewboilerplate;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends Activity {

    //declaration
    private WebView frame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this is the reference for the webview in layout/activity_main.xml.
        frame = (WebView) findViewById(R.id.webview);

        WebSettings webSettings = frame.getSettings();

        //need javascript in the Webview? don't comment this out.
        webSettings.setJavaScriptEnabled(true);

        //this setting here is to prevent the Webview from opening links in a new window.
        frame.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                view.loadUrl(url);
                return true;
            }
        });

        //one is for loading a URL (external-only for production lol)...
        //the other is for loading an in-app HTML file (located in X).

        //frame.loadUrl("http://10.0.2.2/");
        frame.loadUrl("file:///android_asset/web_content/index.html");
    }
}
