package com.devitis.acympkv2_290319.db.di.component;



import com.devitis.acympkv2_290319.db.di.module.LocationModule;
import com.devitis.acympkv2_290319.db.ui.location.add.LocationActivity;

import dagger.Component;

/**
 * Created by Diana on 29.03.2019.
 */

@Component(dependencies = IDataBaseApplicationComponent.class, modules = LocationModule.class)
public interface ILocationComponent {
    void inject(LocationActivity locationActivity);
}
