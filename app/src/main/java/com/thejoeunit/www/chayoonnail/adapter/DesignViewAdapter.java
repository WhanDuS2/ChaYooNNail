package com.thejoeunit.www.chayoonnail.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.thejoeunit.www.chayoonnail.R;
import com.thejoeunit.www.chayoonnail.data.Photo;

import java.util.List;

/**
 * Created by the on 2017-10-16.
 */

public class DesignViewAdapter extends ArrayAdapter<Photo> {

    Context mContext;
    List<Photo> mList;
    LayoutInflater inf;

    public DesignViewAdapter(Context context, List<Photo> list) {
        super(context, R.layout.design_view_list_tiem, list);
        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if ( row == null) {
            row = inf.inflate(R.layout.design_view_list_tiem, null);
        }



        return row;
    }

    @Override
    public int getCount() {
        return 20;
    }
}
