package com.thejoeunit.www.chayoonnail;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends BaseActivity {

    private android.widget.ImageView mainImage;
    private android.widget.EditText idEdt;
    private android.widget.EditText pwEdt;
    private android.widget.Button loginBtn;
    private android.widget.TextView sinInWithTxt;
    private android.widget.ImageView facebookLogin;
    private android.widget.ImageView kakaoLogin;
    private android.widget.ImageView LineLogin;
    private android.widget.TextView signupBtn;
    private android.widget.TextView forgotPasswordTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, SignUpActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.forgotPasswordTxt = (TextView) findViewById(R.id.forgotPasswordTxt);
        this.signupBtn = (TextView) findViewById(R.id.signupBtn);
        this.LineLogin = (ImageView) findViewById(R.id.LineLogin);
        this.kakaoLogin = (ImageView) findViewById(R.id.kakaoLogin);
        this.facebookLogin = (ImageView) findViewById(R.id.facebookLogin);
        this.sinInWithTxt = (TextView) findViewById(R.id.sinInWithTxt);
        this.loginBtn = (Button) findViewById(R.id.loginBtn);
        this.pwEdt = (EditText) findViewById(R.id.pwEdt);
        this.idEdt = (EditText) findViewById(R.id.idEdt);
        this.mainImage = (ImageView) findViewById(R.id.mainImage);

    }
}
