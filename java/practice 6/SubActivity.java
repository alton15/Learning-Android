package com.example.dsm2018.practice6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sub);
        TextView nameT = (TextView) findViewById(R.id.nameT);
        Intent intent = getIntent();
        nameT.setText(intent.getStringExtra("nameT").toString());
    }
}
