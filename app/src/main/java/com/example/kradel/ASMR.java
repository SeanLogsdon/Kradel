package com.example.kradel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class ASMR extends AppCompatActivity {
    WebView webVASMR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_s_m_r);

        String asmrPath = "https://www.youtube.com/watch?v=O830yXVvxiM&list=PL6OBhoc6fvu0PFlEtJzlS2XJV9GQO7iKr&ab_channel=pokiASMR";

        webVASMR = findViewById(R.id.webASMR);
        webVASMR.getSettings().setJavaScriptEnabled(true);
        webVASMR.setWebChromeClient(new WebChromeClient());
        webVASMR.loadUrl(asmrPath);
    }
}