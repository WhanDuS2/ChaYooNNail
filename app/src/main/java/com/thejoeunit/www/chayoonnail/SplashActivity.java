package com.thejoeunit.www.chayoonnail;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.thejoeunit.www.chayoonnail.util.GlobalData;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        bindViews();
        setValues();
        setupEvents();
    }

    @Override
    public void setupEvents() {



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent myIntent = new Intent(mContext, MainActivity.class);
                startActivity(myIntent);
                finish();
            }
        }, 2000);
    }

    @Override
    public void setValues() {

        GlobalData.initDatas();
    }

    @Override
    public void bindViews() {

// dd
    }
}
