package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Story story;
    Character player;
    LinearLayout Messages_field;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void out() {
        String[] all_messages = story.current.text.split("/n");
        for (String messages : all_messages) {
            TextView tw = new TextView(this);
            tw.setGravity(Gravity.LEFT);
            RelativeLayout.LayoutParams ip=(RelativeLayout.LayoutParams)tw.getLayoutParams();
            ip.setMargins(5,5,5,5);
            tw.setLayoutParams(ip);
            tw.setText(messages);
            tw.setBackground(ContextCompat.getDrawable(this, R.color.colorPrimary));

            Messages_field.addView(tw);
        }
    }
}
