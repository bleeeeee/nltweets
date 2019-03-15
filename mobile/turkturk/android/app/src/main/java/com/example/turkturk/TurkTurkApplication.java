package com.example.turkturk;

import android.app.Application;
import android.content.Context;

import com.example.inject.component.AppComponent;

import com.example.inject.component.DaggerAppComponent;
import com.example.inject.module.AppModule;

public class TurkTurkApplication extends Application {

    private AppComponent component;

    public static TurkTurkApplication get(Context context) {
        return (TurkTurkApplication) context.getApplicationContext();
    }

    @Override public void onCreate() {
        super.onCreate();
        setupGraph();
    }

    private void setupGraph() {

        component = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        component.inject(this);
    }

    public AppComponent component() {
        return component;
    }

}
