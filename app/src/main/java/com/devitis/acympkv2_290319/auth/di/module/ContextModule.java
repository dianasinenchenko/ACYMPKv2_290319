package com.devitis.acympkv2_290319.auth.di.module;

import android.content.Context;


import com.devitis.acympkv2_290319.auth.di.qualofier.ApplicationContext;
import com.devitis.acympkv2_290319.auth.di.scope.ApplicationScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Diana on 22.03.2019.
 */
@Module
public class ContextModule {

    private Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @ApplicationScope
    @ApplicationContext
    public Context provideContext() {
        return context;
    }
}
