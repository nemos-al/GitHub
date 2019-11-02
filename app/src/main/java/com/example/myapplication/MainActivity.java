package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText) findViewById(R.id.editText);
        txt2 = (EditText) findViewById(R.id.editText2);
        bt = (Button) findViewById(R.id.Button);


        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String et1 = txt1.getText().toString();
                String et2 = txt2.getText().toString();
                if((et1.equals(R.string.login))&&(et2.equals(R.string.password))){
                    bt.setText(R.string.button_green);
                    bt.setBackgroundColor(R.color.green1);}
                else {bt.setText(R.string.button_red);
                bt.setBackgroundColor(R.color.red1);}

            }
        });


    }

        }
