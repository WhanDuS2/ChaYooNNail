package com.thejoeunit.www.chayoonnail.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.thejoeunit.www.chayoonnail.R;
import com.thejoeunit.www.chayoonnail.data.Photo;
import com.thejoeunit.www.chayoonnail.data.Search;
import com.thejoeunit.www.chayoonnail.util.GlobalData;

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
        if (row == null) {
            row = inf.inflate(R.layout.design_view_list_tiem, null);
        }

        Photo data = mList.get(position);

        ImageView nailDesignImg = (ImageView) row.findViewById(R.id.nailDesignImg);

        Glide.with(mContext).load(data.getNailPhotoViews()).into(nailDesignImg);
//        Glide.with(mContext).load("https://scontent-atl3-1.cdninstagram.com/t51.2885-15/s640x640/sh0.08/e35/c86.0.908.908/18298925_1441385802619927_700897482560765952_n.jpg").into(nailDesignImg);
//        Glide.with(mContext).load("https://scontent.cdninstagram.com/t51.2885-15/s480x480/e35/c135.0.809.809/18809413_230194397478330_3938254353508335616_n.jpg?ig_cache_key=MTUyNTE0NjI1Mjc5MDQwNjk1Mg%3D%3D.2.c").into(nailDesignImg);
//        Glide.with(mContext).load("https://scontent-atl3-1.cdninstagram.com/t51.2885-15/s640x640/sh0.08/e35/19367550_140730239832370_3000554952889204736_n.jpg").into(nailDesignImg);


        return row;
    }

}