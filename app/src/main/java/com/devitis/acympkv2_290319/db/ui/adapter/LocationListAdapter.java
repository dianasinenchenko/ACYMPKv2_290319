package com.devitis.acympkv2_290319.db.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.devitis.acympkv2_290319.R;
import com.devitis.acympkv2_290319.db.data.realmmodel.Location1;
import com.devitis.acympkv2_290319.db.ui.location.add.ILocationView;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.RealmChangeListener;
import io.realm.RealmResults;

/**
 * Created by Diana on 29.03.2019.
 */

public class LocationListAdapter extends RecyclerView.Adapter<LocationListAdapter.ViewHolder> implements RealmChangeListener {


    private RealmResults<Location1> locations;
    private ILocationView iLocationView;

    public LocationListAdapter(ILocationView locationView) {
        iLocationView = locationView;
    }

    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_location, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final Location1 location = locations.get(position);

        holder.textName.setText(location.getName());
        holder.textLat.setText(location.getLat());
        holder.textLon.setText(location.getLon());

        //  holder.mTextDetails.setText(book.getDetails());
        holder.layoutItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                if (iLocationView != null) {
                    iLocationView.onLocationClick(location.getId());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return locations != null ? locations.size() : 0;
    }


    public void setLocations(final RealmResults<Location1> location) {
        locations = location;
        locations.addChangeListener(this);
        notifyDataSetChanged();
    }

    @Override
    public void onChange(Object o) {
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.layout_item_container)
        LinearLayout layoutItem;
        @BindView(R.id.text_name)
        TextView textName;
        @BindView(R.id.text_lat)
        TextView textLat;
        @BindView(R.id.text_lon)
        TextView textLon;



        public ViewHolder(final View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
