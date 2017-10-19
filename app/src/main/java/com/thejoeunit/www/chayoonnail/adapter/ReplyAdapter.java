package com.thejoeunit.www.chayoonnail.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.thejoeunit.www.chayoonnail.R;
import com.thejoeunit.www.chayoonnail.data.Post;
import com.thejoeunit.www.chayoonnail.data.Reply;
import com.thejoeunit.www.chayoonnail.data.Search;

import java.util.List;

/**
 * Created by the on 2017-10-19.
 */

public class ReplyAdapter extends ArrayAdapter<Reply> {

    Context mContext;
    List<Reply> mList;
    LayoutInflater inf;

    public ReplyAdapter(Context context, List<Reply> list) {
        super(context, R.layout.reply_list_item, list);
        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if ( row == null) {
            row = inf.inflate(R.layout.reply_list_item, null);
        }

//        Reply data = mList.get(position);

        TextView writerNickNameTxt = (TextView) row.findViewById(R.id.writerNickNameTxt);
        TextView contentTxt = (TextView) row.findViewById(R.id.contentTxt);

//        writerNickNameTxt.setText(data.getWriterData().getNickName());
//        contentTxt.setText(data.getContent());

        return row;
    }

    @Override
    public int getCount() {
        return 20;
    }
}

