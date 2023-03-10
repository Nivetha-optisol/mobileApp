package com.example.madrasmedicalmission;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        WebView webview;
        webview=(WebView)findViewById(R.id.webview);
        webview.loadUrl(("https://www.madrasmedicalmission.org.in"));
    }
}


   
