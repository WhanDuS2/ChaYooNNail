package com.thejoeunit.www.chayoonnail.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
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
import com.thejoeunit.www.chayoonnail.ReplyActivity;
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
        Glide.with(mContext).load(data.getProfileURL()).into(userImg);

        TextView writerNickNameTxt = (TextView) row.findViewById(R.id.writerNickNameTxt);
        writerNickNameTxt.setText(data.getName());

        ImageView postingImg = (ImageView) row.findViewById(R.id.postingImg);
        Glide.with(mContext).load(data.getImageURL()).into(postingImg);

        ImageView replyImg = (ImageView) row.findViewById(R.id.replyImg);
        replyImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, ReplyActivity.class);
                mContext.startActivity(intent);
            }
        });

        TextView contentTxt = (TextView) row.findViewById(R.id.contentTxt);
        contentTxt.setText(data.getIntro());


        final ImageView likeImg = (ImageView) row.findViewById(R.id.likeImg);
        likeImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (data.isLike() == true) {
                    likeImg.setImageResource(R.drawable.heart);
                    data.setLike(false);
                } else {
                    likeImg.setImageResource(R.drawable.like_heart);
                    data.setLike(true);
                }

            }
        });


        return row;
    }

}