package com.devitis.acympkv2_290319.auth.di.module;

import android.content.Context;


import com.devitis.acympkv2_290319.auth.di.qualofier.ActivityContext;
import com.devitis.acympkv2_290319.auth.di.scope.ActivityScope;
import com.devitis.acympkv2_290319.auth.ui.login.LoginActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Diana on 22.03.2019.
 */
@Module
public class LoginActivityContextModule {

    private LoginActivity loginActivity;
    private Context context;

    public LoginActivityContextModule(LoginActivity loginActivity) {
        this.loginActivity = loginActivity;
        context = loginActivity;
    }

    @Provides
    @ActivityScope
    public LoginActivity providesLoginActivity() {
        return loginActivity;
    }

    @Provides
    @ActivityScope
    @ActivityContext
    public Context providesContext() {
        return context;
    }
}
