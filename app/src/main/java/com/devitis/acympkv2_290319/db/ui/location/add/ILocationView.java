package com.devitis.acympkv2_290319.db.ui.location.add;



import com.devitis.acympkv2_290319.db.data.realmmodel.Location1;
import com.devitis.acympkv2_290319.db.ui.main.IDataBaseMainView;

import io.realm.RealmResults;

/**
 * Created by Diana on 29.03.2019.
 */

public interface ILocationView extends IDataBaseMainView {

    void showLocation(RealmResults<Location1> locations);

    void onLocationClick(String id);
}
