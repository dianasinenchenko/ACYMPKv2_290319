package com.devitis.acympkv2_290319.db.ui.location.add;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;


import com.devitis.acympkv2_290319.R;
import com.devitis.acympkv2_290319.db.data.realmmodel.Location1;
import com.devitis.acympkv2_290319.db.di.component.DaggerILocationComponent;
import com.devitis.acympkv2_290319.db.di.component.IDataBaseApplicationComponent;
import com.devitis.acympkv2_290319.db.di.module.LocationModule;
import com.devitis.acympkv2_290319.db.ui.adapter.LocationListAdapter;
import com.devitis.acympkv2_290319.db.ui.main.DataBaseMainActivity;
import com.devitis.acympkv2_290319.db.ui.presenter.LocationPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.realm.RealmResults;

/**
 * Created by Diana on 29.03.2019.
 */

public class LocationActivity extends DataBaseMainActivity implements ILocationView {

    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;


    @Inject
    LocationPresenter locationPresenter;
    private LocationListAdapter locationListAdapter;


    @Override
    public void showLocation(RealmResults<Location1> locations) {

        locationListAdapter.setLocations(locations);

    }

    @Override
    public void onLocationClick(String id) {
//        startActivity(Deta);

    }

    @Override
    protected void setupComponent(IDataBaseApplicationComponent iDataBaseApplicationComponent) {

        DaggerILocationComponent.builder()
                .iDataBaseApplicationComponent(iDataBaseApplicationComponent)
                .locationModule(getModule())
                .build()
                .inject(this);
    }

    @Override
    protected void closeRealm() {

        locationPresenter.closeRealm();

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_database);
        ButterKnife.bind(this);
        initToolbar();
        initList();
    }


    @Override
    protected void onStart() {
        super.onStart();
        locationPresenter.showLocation();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        locationPresenter.clearView();
    }


    @Override
    public LocationModule getModule() {
        return new LocationModule(this);
    }

    private void initToolbar() {
        setSupportActionBar(mToolbar);
    }


    private void initList() {
        locationListAdapter = new LocationListAdapter(this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(locationListAdapter);
    }

    @OnClick(R.id.fab)
    public void onAddNewBookClick()
    {
        startActivity(new Intent(this, AddLocationActivity.class));
    }

}

