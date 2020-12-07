package com.app.kradel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Ignore the class name, its used for all web views via url
public class ASMR extends AppCompatActivity {
    WebView weB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_s_m_r);

        String Path = ((MyApplication) this.getApplication()).getUrl();

        weB = findViewById(R.id.WebView);
        weB.getSettings().setJavaScriptEnabled(true);
        weB.setWebChromeClient(new WebChromeClient());
        weB.loadUrl(Path);
    }
}