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

import com.thejoeunit.www.chayoonnail.R;
import com.thejoeunit.www.chayoonnail.data.Post;
import com.thejoeunit.www.chayoonnail.data.Search;
import com.thejoeunit.www.chayoonnail.util.GlobalData;

import java.util.List;

/**
 * Created by the on 2017-10-18.
 */

public class PostingAdapter extends ArrayAdapter<Post> {


    Context mContext;
    List<Post> mList;
    LayoutInflater inf;

    public PostingAdapter(Context context, List<Post> list) {
        super(context, R.layout.posting_list, list);
        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = inf.inflate(R.layout.posting_list, null);
        }

        final Post data = mList.get(position);

        ImageView userImg = (ImageView) row.findViewById(R.id.userImg);

        TextView writerNickNameTxt = (TextView) row.findViewById(R.id.writerNickNameTxt);
        writerNickNameTxt.setText(data.getName());

        ImageView postingImg = (ImageView) row.findViewById(R.id.postingImg);

        ImageView moreImg = (ImageView) row.findViewById(R.id.moreImg);





        final ImageView likeImg = (ImageView) row.findViewById(R.id.likeImg);
        likeImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (data.isLike() == true) {
                    likeImg.setImageResource(R.drawable.heart);
                    data.setLike(false);
                }
                else {
                    likeImg.setImageResource(R.drawable.like_heart);
                    data.setLike(true);
                }

            }
        });



        return row;
    }

}