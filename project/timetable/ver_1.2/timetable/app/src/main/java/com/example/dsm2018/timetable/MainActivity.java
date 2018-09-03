package com.example.dsm2018.timetable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button time1;
    Button time3;
    Button time2;
    Button time4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        time1 = (Button) findViewById(R.id.time1);
        time2 = (Button) findViewById(R.id.time2);
        time3 = (Button) findViewById(R.id.time3);
        time4 = (Button) findViewById(R.id.time4);


        init();
    }
    public void init(){
        time4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, FourthClassTimeActivity.class);
                startActivity(intent);
            }
        });
        time3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, ThirdClassTimeActivity.class);
                startActivity(intent);
            }
        });
        time2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, SecondClassTimeActivity.class);
                startActivity(intent);
            }
        });

        time1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, FirstClassTimeActivity.class);
                startActivity(intent);
            }
        });
    }

}
