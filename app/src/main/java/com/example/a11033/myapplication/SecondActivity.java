package com.example.a11033.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "you clicked here";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Button btn_start;
        Button btn_stop;
        Button btn_unbind;
        Button btn_bind;
        {
            btn_start =(Button) findViewById(R.id. button_2_1);
            btn_stop = (Button) findViewById(R.id.button_2_2);
            btn_bind = (Button) findViewById(R.id.button_2_3);
            btn_unbind = (Button) findViewById(R.id.button_2_4);
        }
        setContentView(R.layout.activity_second);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: StatrService");
            }
        });
        btn_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_bind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_unbind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

}
