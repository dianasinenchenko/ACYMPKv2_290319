package com.devitis.acympkv2_290319.db.ui.presenter;


import com.devitis.acympkv2_290319.db.data.service.RealmServiceDB;
import com.devitis.acympkv2_290319.db.ui.location.add.IAddLocationView;

/**
 * Created by Diana on 29.03.2019.
 */

public class AddLocationPresenter extends DataBaseMainPresenter<IAddLocationView> {
    public AddLocationPresenter(IAddLocationView view, RealmServiceDB realmService) {
        super(view, realmService);
    }

    public void onAddClick(final String name, final String lat, final String lon) {
        realmService.addLocationAsync(name, lat, lon, view);
    }
}
