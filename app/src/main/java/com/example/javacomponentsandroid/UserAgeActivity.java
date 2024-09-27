package com.example.javacomponentsandroid;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserAgeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_age);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText editText = findViewById(R.id.editText);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button = findViewById(R.id.button);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int birthYear;
                birthYear = Integer.parseInt(editText.getText().toString());
                int age = 2023 - birthYear; // Adjust as needed for current year
                textView.setText("Your age is: " + age);
            }
        });
    }
}