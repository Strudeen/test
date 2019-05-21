package com.example.x.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button c_to_f;
    Button f_to_c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c_to_f = (Button)findViewById(R.id.c_to_f);
        f_to_c = (Button)findViewById(R.id.f_to_c);

        c_to_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c_tof = new Intent(MainActivity.this, Celcius_to_farenheit.class);
                startActivity(c_tof);
            }
        });

        f_to_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f_toc = new Intent(MainActivity.this, far_to_cel.class);
                startActivity(f_toc);
            }
        });

    }
}
