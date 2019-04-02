package com.devitis.acympkv2_290319.maps.ui.presenter;

import com.devitis.acympkv2_290319.maps.ui.main.IMainView;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Diana on 02.04.2019.
 */

public interface IMapContract {

    interface IView extends IMainView<IPresenter> {
        void showProgressDialog(String message);
        void hideProgressDialog();
        void addMarker(double lat, double lng, String locality);
        void drawRoutes(LatLng origin, LatLng destination, String originAddress, String destinationAddress, String polylinePoints);
    }

    interface IPresenter extends IMainPresenter {
        void searchPlace(String locationName);
        void findRoutes(String startPoint, String endPoint);
    }
}
