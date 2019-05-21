package com.example.x.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

public class Celcius_to_farenheit extends AppCompatActivity {
    EditText cent;
    TextView far;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celcius_to_farenheit);

        cent = (EditText)findViewById(R.id.editText);
        far = (TextView)findViewById(R.id.textView5);

        cent.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                float faren;
                faren = (1.8f)*Float.parseFloat(cent.getText().toString())+32;
                far.setText(""+faren);

                return false;
            }
        });

    }
}
