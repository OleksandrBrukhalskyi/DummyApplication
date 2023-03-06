package com.example.dummyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class MainActivity extends AppCompatActivity {
    String[] tags;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView2);

        tags = getResources().getStringArray(R.array.colors);
        for(String tag : tags) {
            String[] pair = tag.split(":");

            String key = pair[0];
            String value = pair[1];

            // do whatever you want with key and value
            textView.setText(key);
            textView.setTextColor(Color.parseColor(value));
        }
    }

    private void updateTextView() {
        TextView textView = (TextView) findViewById(R.id.textView2);
        Random random = new Random();
        List<String> list = new ArrayList<>();
        List<String> colors = new ArrayList<>();
        for (String tag : tags) {
            String[] pair = tag.split(":");

            String key = pair[0];
            String value = pair[1];
            list.add(key);
            colors.add(value);
            // do whatever you want with key and value
//            textView.setText(key);
//            textView.setTextColor(Color.parseColor(value));


        }
        int maxIndex = list.size();
        int colorIndex = colors.size();
        int generatedIndex = random.nextInt(maxIndex);
        int generatedIndexColor = random.nextInt(colorIndex);
        textView.setText(list.get(generatedIndex));
        textView.setTextColor(Color.parseColor(colors.get(generatedIndexColor)));

    }
    public void clickYes(View view) {
        updateTextView();

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
        updateTextView();
    }
}