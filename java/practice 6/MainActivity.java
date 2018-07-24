package com.example.dsm2018.practice6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nameT = (EditText) findViewById(R.id.nameT); //사용자가 이름을 입력하면 그 값을 저장하는 객체
        Button nameB = (Button) findViewById(R.id.nameB);

        nameB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameT.getText().toString();
                Intent intent = new Intent(getApplicationContext(), SubActivity.class); //새로운 창을 열기 위해 필요한 객체
                intent.putExtra("nameT", name); //변수를 전달할 수 있게 해준다.
                startActivity(intent);
            }
        });
    }
}
