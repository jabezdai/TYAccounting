package com.example.account;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class data extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
    }

    public void back(View v){
        finish();
    }
}
