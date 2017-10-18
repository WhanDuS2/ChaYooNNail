package com.thejoeunit.www.chayoonnail;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import com.thejoeunit.www.chayoonnail.adapter.helpSearchAdapter;
import com.thejoeunit.www.chayoonnail.data.Search;
import com.thejoeunit.www.chayoonnail.util.GlobalData;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends BaseActivity {

    List<Search> SearchDatas = new ArrayList<>();
    helpSearchAdapter mAdapter;
    private android.widget.ListView helpSearchListView;
    private android.widget.ImageView backImg;
    private android.widget.ImageView searchImg;
    private android.widget.EditText inputTextEdt;
    private android.widget.ImageView deleteImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(mContext, MainActivity.class);
                startActivity(myIntent);
                finish();
            }
        });
    }

    @Override
    public void setValues() {

        mAdapter = new helpSearchAdapter(SearchActivity.this, GlobalData.searchDatas);
        helpSearchListView.setAdapter(mAdapter);

    }

    @Override
    public void bindViews() {
        this.helpSearchListView = (ListView) findViewById(R.id.helpSearchListView);
        this.deleteImg = (ImageView) findViewById(R.id.deleteImg);
        this.inputTextEdt = (EditText) findViewById(R.id.inputTextEdt);
        this.searchImg = (ImageView) findViewById(R.id.searchImg);
        this.backImg = (ImageView) findViewById(R.id.backImg);
    }
}
