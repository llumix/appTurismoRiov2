package com.riobamba.appturismorio.ui.Enlaces;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.riobamba.appturismorio.R;

/**
 * Created by Administrador on 11-Jan-17.
 */

public class EnlacePuntosDeInformacion extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enlace_pagina_web);

        WebView myWebView = (WebView) this.findViewById(R.id.webViewEnlace);
        myWebView.loadUrl("http://riobamba.com.ec/puntos-de-informacion-turistica.html");


    }
}
