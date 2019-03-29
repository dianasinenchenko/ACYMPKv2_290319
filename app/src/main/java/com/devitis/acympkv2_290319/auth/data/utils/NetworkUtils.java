package com.devitis.acympkv2_290319.auth.data.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Diana on 29.03.2019.
 */

public class NetworkUtils {
    static Toast toast;
    public static String BASE_URL = "url...";

    public static void showToast(Context context, String message) {
        if (toast != null) toast.cancel();
        toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
