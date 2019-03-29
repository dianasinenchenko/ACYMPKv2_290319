package com.devitis.acympkv2_290319.db.di.module;

import android.app.Application;


import com.devitis.acympkv2_290319.db.ui.main.LocationApplication;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Diana on 29.03.2019.
 */

@Module
public class DataBaseApplicationModule {

    private final LocationApplication locationApplication;

    public DataBaseApplicationModule(LocationApplication locationApplication) {
        this.locationApplication = locationApplication;
    }

    @Provides
    public Application provideApplication() {
        return locationApplication;
    }
}
