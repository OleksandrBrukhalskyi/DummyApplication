package com.example.dummyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickYes(View view) {
//        Button button = findViewById(R.id.button);
//        Drawable background = button.getBackground();
//
//        button.setOnClickListener(view1 -> {
//            TextView textView = findViewById(R.id.textView);
//            textView.setBackground(background);
//        });
//        button.setOnClickListener(view2 -> {
//            TextView textView = findViewById(R.id.textView);
//            textView.setText(R.string.click_me);
//        });

    }

    public void clickNo(View view) {

    }
}