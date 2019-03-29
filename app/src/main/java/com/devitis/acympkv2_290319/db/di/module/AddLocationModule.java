package com.devitis.acympkv2_290319.db.di.module;



import com.devitis.acympkv2_290319.db.data.service.RealmServiceDB;
import com.devitis.acympkv2_290319.db.ui.location.add.IAddLocationView;
import com.devitis.acympkv2_290319.db.ui.presenter.AddLocationPresenter;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;

/**
 * Created by Diana on 29.03.2019.
 */

@Module
public class AddLocationModule {

    private final IAddLocationView iAddLocationView;

    public AddLocationModule(IAddLocationView iAddLocationView) {
        this.iAddLocationView = iAddLocationView;
    }


    @Provides
    AddLocationPresenter provideAddLocationPresenter() {
        RealmServiceDB realmService = new RealmServiceDB(Realm.getDefaultInstance());
        return new AddLocationPresenter(iAddLocationView, realmService);
    }


}
