package com.devitis.acympkv2_290319.db.di.module;



import com.devitis.acympkv2_290319.db.data.service.RealmServiceDB;
import com.devitis.acympkv2_290319.db.ui.location.add.ILocationView;
import com.devitis.acympkv2_290319.db.ui.presenter.LocationPresenter;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;

/**
 * Created by Diana on 29.03.2019.
 */

@Module
public class LocationModule {

    private final ILocationView locationView;

    public LocationModule(ILocationView locationView) {
        this.locationView = locationView;
    }

    @Provides
    LocationPresenter provideListPresenter() {
        RealmServiceDB realmService = new RealmServiceDB(Realm.getDefaultInstance());
        return new LocationPresenter(locationView, realmService);
    }
}
