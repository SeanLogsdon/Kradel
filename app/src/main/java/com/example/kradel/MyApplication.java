package com.example.kradel;

import android.app.Application;

public class MyApplication extends Application {

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    private String Url = "";



}
