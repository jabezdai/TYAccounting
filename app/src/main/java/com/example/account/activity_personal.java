package com.example.account;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_personal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
    }
    public void fin(View v){
        finish();
    }
    public void group(View v) {
        Intent itgroup = new Intent(this,group.class);

        startActivity(itgroup);
    }
}
