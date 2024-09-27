package com.example.javacomponentsandroid;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText editText1 = findViewById(R.id.editText1);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText editText2 = findViewById(R.id.editText2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textView = findViewById(R.id.textView);

        findViewById(R.id.buttonAdd).setOnClickListener(v -> calculate(editText1, editText2, textView, "add"));
        findViewById(R.id.buttonSubtract).setOnClickListener(v -> calculate(editText1, editText2, textView, "subtract"));
        findViewById(R.id.buttonMultiply).setOnClickListener(v -> calculate(editText1, editText2, textView, "multiply"));
        findViewById(R.id.buttonDivide).setOnClickListener(v -> calculate(editText1, editText2, textView, "divide"));
    }

    @SuppressLint("SetTextI18n")
    private void calculate(EditText editText1, EditText editText2, TextView textView, String operation) {
        double num1 = Double.parseDouble(editText1.getText().toString());
        double num2 = Double.parseDouble(editText2.getText().toString());
        double result = 0;

        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                result = num1 / num2;
                break;
        }
        textView.setText("Result: " + result);
    }
}