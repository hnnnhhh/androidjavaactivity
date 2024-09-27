package com.example.javacomponentsandroid;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SimpleFormActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_form);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText editText1 = findViewById(R.id.editText);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText editText2 = findViewById(R.id.editText2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button = findViewById(R.id.button);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String data1;
                data1 = editText1.getText().toString();
                String data2;
                data2 = editText2.getText().toString();
                textView.setText("Data: " + data1 + ", " + data2);
            }
        });
    }
}