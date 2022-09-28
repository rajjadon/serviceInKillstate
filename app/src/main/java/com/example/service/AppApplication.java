package com.example.service;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

public class AppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Intent startBackgroundIntent = new Intent();
        startBackgroundIntent.setClass(this, FroGroundService.class);
        startService(startBackgroundIntent);

        //bindService(new Intent(this, FroGroundService.class), mConnection, Context.BIND_AUTO_CREATE | Context.BIND_IMPORTANT);
    }
}
