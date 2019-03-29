package com.devitis.acympkv2_290319.auth.data.service;

import com.devitis.acympkv2_290319.auth.data.networkmodel.LoginResponseModel;

import io.reactivex.Observable;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Diana on 29.03.2019.
 */

public interface IApiService {
    @POST("login")
    Observable<LoginResponseModel> getLoginResponse(
            @Query("username") String username,
            @Query("password") String password);


}
