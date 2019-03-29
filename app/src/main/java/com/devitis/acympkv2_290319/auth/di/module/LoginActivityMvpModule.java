package com.devitis.acympkv2_290319.auth.di.module;





import com.devitis.acympkv2_290319.auth.data.service.IApiService;
import com.devitis.acympkv2_290319.auth.di.scope.ActivityScope;
import com.devitis.acympkv2_290319.auth.ui.presenter.ILoginActivityContract;
import com.devitis.acympkv2_290319.auth.ui.presenter.LoginPresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Diana on 22.03.2019.
 */

@Module
public class LoginActivityMvpModule {

    private ILoginActivityContract.IView iView;

    public LoginActivityMvpModule(ILoginActivityContract.IView iView) {
        this.iView = iView;
    }


    @Provides
    @ActivityScope
    ILoginActivityContract.IView provideView() {
        return iView;
    }

    @Provides
    @ActivityScope
    LoginPresenterImpl providePresenter(IApiService iApiService, ILoginActivityContract.IView iView) {
        return new LoginPresenterImpl(iApiService, iView);
    }

}
