package com.devitis.acympkv2_290319.db.ui.main;

import android.app.Application;
import android.content.Context;


import com.devitis.acympkv2_290319.db.di.component.DaggerIDataBaseApplicationComponent;
import com.devitis.acympkv2_290319.db.di.component.IDataBaseApplicationComponent;
import com.devitis.acympkv2_290319.db.di.module.DataBaseApplicationModule;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Diana on 29.03.2019.
 */

public class LocationApplication extends Application {

    private static LocationApplication locationApplication;

    private IDataBaseApplicationComponent iDataBaseApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        locationApplication = this;
        initRealmConfiguration();
        initDagger();
    }

    public static LocationApplication get(Context context) {
        return (LocationApplication) context.getApplicationContext();
    }

    public static LocationApplication getInstance() {
        return locationApplication;
    }

    private void initRealmConfiguration() {

        Realm.init(this);
        RealmConfiguration realmConfiguration = new RealmConfiguration
                .Builder()
                .name("database.realm")
                .schemaVersion(0)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }

    private void initDagger() {
        iDataBaseApplicationComponent = DaggerIDataBaseApplicationComponent
                .builder()
                .dataBaseApplicationModule(new DataBaseApplicationModule(locationApplication))
                .build();
        iDataBaseApplicationComponent.inject(this);
    }

    public IDataBaseApplicationComponent component() {
        return iDataBaseApplicationComponent;
    }
}