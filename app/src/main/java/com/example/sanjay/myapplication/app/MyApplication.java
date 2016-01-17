package com.example.sanjay.myapplication.app;

import android.app.Application;

/**
 * Created by Sanjay on 2016/1/16.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Foreground.init(this);
    }
}
