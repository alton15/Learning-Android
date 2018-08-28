package com.example.dsm2018.timetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button time4 = (Button) findViewById(R.id.time4);
        time4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, time4.class);
                startActivity(intent);
                finish();
            }
        });
        Button time3 = (Button) findViewById(R.id.time3);
        time3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, time3.class);
                startActivity(intent);
                finish();
            }
        });
        Button time2 = (Button) findViewById(R.id.time2);
        time2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, time2.class);
                startActivity(intent);
                finish();
            }
        });
        Button time1 = (Button) findViewById(R.id.time1);
        time1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, time1.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
