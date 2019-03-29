package com.devitis.acympkv2_290319.auth.di.component;

import android.content.Context;


import com.devitis.acympkv2_290319.auth.di.module.LoginActivityContextModule;
import com.devitis.acympkv2_290319.auth.di.module.LoginActivityMvpModule;
import com.devitis.acympkv2_290319.auth.di.qualofier.ActivityContext;
import com.devitis.acympkv2_290319.auth.di.scope.ActivityScope;
import com.devitis.acympkv2_290319.auth.ui.login.LoginActivity;

import dagger.Component;

/**
 * Created by Diana on 22.03.2019.
 */

@ActivityScope
@Component(modules = {LoginActivityContextModule.class, LoginActivityMvpModule.class},
        dependencies = IApplicationComponent.class)
public interface ILogginActivityComponent {

    @ActivityContext
    Context getContext();

    void injectLoginActivity(LoginActivity loginActivity);
}
