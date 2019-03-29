package com.devitis.acympkv2_290319.db.data.service;



import com.devitis.acympkv2_290319.db.data.realmmodel.Location;
import com.devitis.acympkv2_290319.db.ui.location.add.IAddLocationView;

import java.util.UUID;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by Diana on 29.03.2019.
 */

public class RealmServiceDB {

    Realm realmService;

    public RealmServiceDB(final Realm realm) {
        realmService = realm;
    }

    public void closeRealm() {
        realmService.close();
    }

    public RealmResults<Location> getAllLocation() {
        return realmService.where(Location.class).findAll();
    }

    public Location getLocationById(final String locationId) {
        return realmService.where(Location.class).equalTo("id", locationId).findFirst();
    }

    public void addLocationAsync(final String name, final String lat, final String lon, final IAddLocationView iAddLocationView) {
        realmService.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                try {
                    Location location = realm.createObject(Location.class, UUID.randomUUID().toString());
                    location.setName(name);
                    location.setLat(lat);
                    location.setLon(lon);
                    if (iAddLocationView != null) {
                        iAddLocationView.finish();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    if (iAddLocationView != null) {
                        iAddLocationView.showAddLocationError();
                    }
                }
            }
        });
    }

    public interface IOnTransactionCallback {
        void onRealmSuccess();
        void onRealmError(final Exception e);
    }
}
