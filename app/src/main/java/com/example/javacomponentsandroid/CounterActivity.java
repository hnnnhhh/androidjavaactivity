package com.example.javacomponentsandroid;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CounterActivity extends AppCompatActivity {
    private int count = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button = findViewById(R.id.button);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textView;
        textView = findViewById(R.id.textView);

        button.setOnClickListener(v -> {
            count++;
            textView.setText(String.valueOf(count));
        });
    }
}