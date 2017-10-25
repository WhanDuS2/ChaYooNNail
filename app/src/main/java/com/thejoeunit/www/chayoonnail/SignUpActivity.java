package com.thejoeunit.www.chayoonnail;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class SignUpActivity extends BaseActivity {

    private android.widget.EditText idEdt;
    private android.widget.TextView idStatusTxt;
    private android.widget.EditText pwEdt;
    private android.widget.EditText pwCheckEdt;
    private android.widget.EditText nameEdt;
    private android.widget.TextView birthDayTxt;
    private android.widget.Button selectBirthDayBtn;
    private android.widget.RadioButton manRadioBtn;
    private android.widget.RadioButton womanRadioBtn;
    private android.widget.EditText phoneEdt;
    private android.widget.Button okBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.okBtn = (Button) findViewById(R.id.okBtn);
        this.phoneEdt = (EditText) findViewById(R.id.phoneEdt);
        this.womanRadioBtn = (RadioButton) findViewById(R.id.womanRadioBtn);
        this.manRadioBtn = (RadioButton) findViewById(R.id.manRadioBtn);
        this.selectBirthDayBtn = (Button) findViewById(R.id.selectBirthDayBtn);
        this.birthDayTxt = (TextView) findViewById(R.id.birthDayTxt);
        this.nameEdt = (EditText) findViewById(R.id.nameEdt);
        this.pwCheckEdt = (EditText) findViewById(R.id.pwCheckEdt);
        this.pwEdt = (EditText) findViewById(R.id.pwEdt);
        this.idStatusTxt = (TextView) findViewById(R.id.idStatusTxt);
        this.idEdt = (EditText) findViewById(R.id.idEdt);

    }
}
