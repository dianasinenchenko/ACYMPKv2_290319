package com.devitis.acympkv2_290319.auth.di.component;

import android.content.Context;


import com.devitis.acympkv2_290319.auth.data.service.IApiService;
import com.devitis.acympkv2_290319.auth.di.module.ContextModule;
import com.devitis.acympkv2_290319.auth.di.module.RetrofitModule;
import com.devitis.acympkv2_290319.auth.di.qualofier.ApplicationContext;
import com.devitis.acympkv2_290319.auth.di.scope.ApplicationScope;
import com.devitis.acympkv2_290319.auth.ui.main.MyApplication;

import dagger.Component;

/**
 * Created by Diana on 22.03.2019.
 */
@ApplicationScope
@Component(modules = {ContextModule.class, RetrofitModule.class})
public interface IApplicationComponent {

    IApiService getApiService();

    @ApplicationContext
    Context getContext();

    void injectApplication(MyApplication myApplication);

}
