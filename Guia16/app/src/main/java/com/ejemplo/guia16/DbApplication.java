package com.ejemplo.guia16;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Janis on 6/10/2017.
 */

public class DbApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);

        RealmConfiguration configuration = new RealmConfiguration.Builder()
                .name("Mibasededatos.realm")
                .build();

        Realm.setDefaultConfiguration(configuration);
    }
}

