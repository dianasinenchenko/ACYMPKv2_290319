package com.devitis.acympkv2_290319.db.di.component;



import com.devitis.acympkv2_290319.db.di.module.AddLocationModule;
import com.devitis.acympkv2_290319.db.ui.location.add.AddLocationActivity;

import dagger.Component;

/**
 * Created by Diana on 29.03.2019.
 */

@Component(dependencies = IDataBaseApplicationComponent.class, modules = AddLocationModule.class)
public interface IAddLocationComponent {
    void inject(AddLocationActivity addLocationActivity);
}
