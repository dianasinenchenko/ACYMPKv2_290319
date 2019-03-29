package com.devitis.acympkv2_290319.db.ui.location.add;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.widget.EditText;
import android.widget.LinearLayout;


import com.devitis.acympkv2_290319.R;
import com.devitis.acympkv2_290319.db.di.component.DaggerIAddLocationComponent;
import com.devitis.acympkv2_290319.db.di.component.IDataBaseApplicationComponent;
import com.devitis.acympkv2_290319.db.di.module.AddLocationModule;
import com.devitis.acympkv2_290319.db.ui.main.DataBaseMainActivity;
import com.devitis.acympkv2_290319.db.ui.presenter.AddLocationPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Diana on 29.03.2019.
 */

public class AddLocationActivity extends DataBaseMainActivity implements IAddLocationView {


    @BindView(R.id.layout_container)
    LinearLayout layoutContainer;
    @BindView(R.id.edit_name)
    EditText editName;
    @BindView(R.id.edit_lat)
    EditText editLat;
    @BindView(R.id.edit_lon)
    EditText editLon;


    @Inject
    AddLocationPresenter addLocationPresenter;


    @Override
    public void showAddLocationError() {
        Snackbar.make(layoutContainer, "cannot add", Snackbar.LENGTH_SHORT).show();

    }

    @Override
    protected void setupComponent(IDataBaseApplicationComponent iDataBaseApplicationComponent) {
        DaggerIAddLocationComponent.builder()
                .iDataBaseApplicationComponent(iDataBaseApplicationComponent)
                .addLocationModule(getModule())
                .build()
                .inject(this);


    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_location);
        ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        addLocationPresenter.clearView();
    }

    @Override
    protected void closeRealm() {
        addLocationPresenter.closeRealm();

    }

    @Override
    public AddLocationModule getModule() {
        return new AddLocationModule(this);
    }


    @OnClick(R.id.button_add)
    public void onAddClick() {
        addLocationPresenter.onAddClick(
                editName.getText().toString(),
                editLat.getText().toString(),
                editLon.getText().toString());

    }

}
