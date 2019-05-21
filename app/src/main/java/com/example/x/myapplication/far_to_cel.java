package com.example.x.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class far_to_cel extends AppCompatActivity {
    EditText far;
    TextView cent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_far_to_cel);

        far = (EditText)findViewById(R.id.editText);
        cent = (TextView)findViewById(R.id.textView5);

        try{
            far.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {


                    float centi;
                    centi = (Float.parseFloat(far.getText().toString())-32)/(1.8f);
                    cent.setText(""+centi);
                    return false;
                }
            });
        } catch (Exception e){
            Toast.makeText(getApplicationContext(), "El texto no puede estar vacio",Toast.LENGTH_SHORT).show();
        }

    }
}
