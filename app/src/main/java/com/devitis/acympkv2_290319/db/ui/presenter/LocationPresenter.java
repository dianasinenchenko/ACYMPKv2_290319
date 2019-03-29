package com.devitis.acympkv2_290319.db.ui.presenter;


import com.devitis.acympkv2_290319.db.data.service.RealmServiceDB;
import com.devitis.acympkv2_290319.db.ui.location.add.ILocationView;

/**
 * Created by Diana on 29.03.2019.
 */

public class LocationPresenter extends DataBaseMainPresenter<ILocationView> {
    private boolean location = false;

    public LocationPresenter(ILocationView view, RealmServiceDB realmService) {
        super(view, realmService);
    }


    public void showLocation() {
        if (!location) {
            view.showLocation(realmService.getAllLocation());
            location = true;
        }
    }
}

