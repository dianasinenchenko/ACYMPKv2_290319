package com.devitis.acympkv2_290319.db.di.component;



import com.devitis.acympkv2_290319.db.di.module.DataBaseApplicationModule;
import com.devitis.acympkv2_290319.db.ui.main.LocationApplication;

import dagger.Component;

/**
 * Created by Diana on 29.03.2019.
 */

@Component(modules = DataBaseApplicationModule.class)
public interface IDataBaseApplicationComponent {
    void inject(LocationApplication locationApplication);
}
