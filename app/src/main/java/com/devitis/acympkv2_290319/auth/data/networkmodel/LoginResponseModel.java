package com.devitis.acympkv2_290319.auth.data.networkmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Diana on 29.03.2019.
 */

public class LoginResponseModel {
    @SerializedName("status")
    @Expose
    public int status;

    @SerializedName("statusMsg")
    @Expose
    public String statusMsg;
}
