package com.devitis.acympkv2_290319.db.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.devitis.acympkv2_290319.db.di.component.IDataBaseApplicationComponent;


/**
 * Created by Diana on 29.03.2019.
 */

public abstract class DataBaseMainActivity extends AppCompatActivity {


    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupComponent(LocationApplication.get(this).component());
    }

    protected abstract void setupComponent(IDataBaseApplicationComponent iDataBaseApplicationComponent);

    @Override
    protected void onDestroy() {
        closeRealm();
        super.onDestroy();
    }

    protected abstract void closeRealm();
}