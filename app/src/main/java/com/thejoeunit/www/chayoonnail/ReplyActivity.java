package com.thejoeunit.www.chayoonnail;

import android.os.Bundle;
import android.widget.ListView;

import com.thejoeunit.www.chayoonnail.adapter.PostingAdapter;
import com.thejoeunit.www.chayoonnail.adapter.ReplyAdapter;
import com.thejoeunit.www.chayoonnail.data.Reply;
import com.thejoeunit.www.chayoonnail.util.GlobalData;

import java.util.ArrayList;
import java.util.List;

public class ReplyActivity extends BaseActivity {

    ReplyAdapter mAdapter;
    List<Reply> replyLists = new ArrayList<>();
    private android.widget.ListView replyListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reply);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        mAdapter = new ReplyAdapter(mContext, replyLists);
        replyListView.setAdapter(mAdapter);

    }

    @Override
    public void bindViews() {
        this.replyListView = (ListView) findViewById(R.id.replyListView);

    }
}
