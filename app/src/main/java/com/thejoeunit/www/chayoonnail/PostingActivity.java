package com.thejoeunit.www.chayoonnail;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.thejoeunit.www.chayoonnail.adapter.PostingAdapter;
import com.thejoeunit.www.chayoonnail.data.Post;
import com.thejoeunit.www.chayoonnail.util.GlobalData;

import java.util.ArrayList;
import java.util.List;

public class PostingActivity extends BaseActivity {

    PostingAdapter mAdapter;
    List<Post> postLists = new ArrayList<>();
    private android.widget.ImageView userImg;
    private android.widget.TextView writerNickNameTxt;
    private android.widget.TextView textView2;
    private android.widget.ImageView postingImg;
    private android.widget.ImageView likeImg;
    private android.widget.ImageView replyImg;
    private android.widget.ImageView moreImg;
    private android.widget.TextView textView;
    private android.widget.TextView contentTxt;
    private android.widget.ListView postingListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posting);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {


    }

    @Override
    public void setValues() {

        mAdapter = new PostingAdapter(mContext, GlobalData.postsLists);

    }

    @Override
    public void bindViews() {

        this.postingListView = (ListView) findViewById(R.id.postingListView);
        this.contentTxt = (TextView) findViewById(R.id.contentTxt);
        this.textView = (TextView) findViewById(R.id.textView);
        this.moreImg = (ImageView) findViewById(R.id.moreImg);
        this.replyImg = (ImageView) findViewById(R.id.replyImg);
        this.likeImg = (ImageView) findViewById(R.id.likeImg);
        this.postingImg = (ImageView) findViewById(R.id.postingImg);
        this.textView2 = (TextView) findViewById(R.id.textView2);
        this.writerNickNameTxt = (TextView) findViewById(R.id.writerNickNameTxt);
        this.userImg = (ImageView) findViewById(R.id.userImg);


    }
}
