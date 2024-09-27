package com.example.javacomponentsandroid;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EvenOddCheckerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_even_odd_checker);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText editText = findViewById(R.id.editText);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button = findViewById(R.id.button);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textView = findViewById(R.id.textView);

        button.setOnClickListener(v -> {
            int number;
            number = Integer.parseInt(editText.getText().toString());
            String result = (number % 2 == 0) ? "Even" : "Odd";
            textView.setText(result);
        });
    }
}