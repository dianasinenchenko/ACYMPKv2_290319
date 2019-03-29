package com.devitis.acympkv2_290319.auth.ui.main;

import android.app.Activity;
import android.app.Application;

import com.devitis.acympkv2_290319.auth.di.component.DaggerIApplicationComponent;
import com.devitis.acympkv2_290319.auth.di.component.IApplicationComponent;
import com.devitis.acympkv2_290319.auth.di.module.ContextModule;


/**
 * Created by Diana on 22.03.2019.
 */

public class MyApplication extends Application {

  public   IApplicationComponent iApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        dependencyInjection();

    }


    private void dependencyInjection() {
            iApplicationComponent = DaggerIApplicationComponent.builder()
                    .contextModule(new ContextModule(this)).build();

            iApplicationComponent.injectApplication(this);
    }

    public IApplicationComponent getiApplicationComponent() {
        return iApplicationComponent;
    }

    public static MyApplication get(Activity activity) {
        return (MyApplication) activity.getApplication();
    }

}
