package com.thejoeunit.www.chayoonnail.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.thejoeunit.www.chayoonnail.R;
import com.thejoeunit.www.chayoonnail.data.Photo;
import com.thejoeunit.www.chayoonnail.data.Search;
import com.thejoeunit.www.chayoonnail.util.GlobalData;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by the on 2017-10-18.
 */

public class helpSearchAdapter extends ArrayAdapter<Search> {
    Context mContext;
    List<Search> mList;
    LayoutInflater inf;

    public helpSearchAdapter(Context context, List<Search> list) {
        super(context, R.layout.help_search_list, list);
        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = inf.inflate(R.layout.help_search_list, null);
        }

        Search data = mList.get(position);

        TextView helpSearchTxt = (TextView) row.findViewById(R.id.helpSearchTxt);
        helpSearchTxt.setText(data.getAutoSearchName());

        return row;
    }

}
