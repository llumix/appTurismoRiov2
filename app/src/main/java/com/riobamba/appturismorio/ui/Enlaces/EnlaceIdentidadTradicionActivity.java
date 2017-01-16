package com.riobamba.appturismorio.ui.Enlaces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.riobamba.appturismorio.R;

public class EnlaceIdentidadTradicionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enlace_pagina_web);

            WebView myWebView = (WebView) this.findViewById(R.id.webViewEnlace);
            myWebView.loadUrl("http://riobamba.com.ec/identidad.html");


    }
}
