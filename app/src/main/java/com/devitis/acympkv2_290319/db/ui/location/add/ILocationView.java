package com.devitis.acympkv2_290319.db.ui.location.add;



import com.devitis.acympkv2_290319.db.data.realmmodel.Location;
import com.devitis.acympkv2_290319.db.ui.main.IDataBaseMainView;

import io.realm.RealmResults;

/**
 * Created by Diana on 29.03.2019.
 */

public interface ILocationView extends IDataBaseMainView {

    void showLocation(RealmResults<Location> locations);

    void onLocationClick(String id);
}
