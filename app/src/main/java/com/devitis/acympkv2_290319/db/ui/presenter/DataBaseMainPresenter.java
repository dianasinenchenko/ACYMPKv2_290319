package com.devitis.acympkv2_290319.db.ui.presenter;


import com.devitis.acympkv2_290319.db.data.service.RealmServiceDB;
import com.devitis.acympkv2_290319.db.ui.main.IDataBaseMainView;

/**
 * Created by Diana on 29.03.2019.
 */

public class DataBaseMainPresenter <T extends IDataBaseMainView> {

    protected T view;
    protected RealmServiceDB realmService;

    public DataBaseMainPresenter(T view, RealmServiceDB realmService) {
        this.view = view;
        this.realmService = realmService;
    }

    public void clearView() {
        view = null;
    }

    public void closeRealm() {
        realmService.closeRealm();
    }
}

