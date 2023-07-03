package com.example.tcaresit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);

        Button add = findViewById(R.id.addButton);
        Button subtract = findViewById(R.id.subtractButton);
        Button multiply = findViewById(R.id.multiplyButton);
        Button divide = findViewById(R.id.divideButton);

        TextView outcome = findViewById(R.id.calculatorOutcome);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float inputNumber1 = Float.parseFloat(number1.getText().toString());
                float inputNumber2 = Float.parseFloat(number2.getText().toString());

                float result = inputNumber1 + inputNumber2;
                String resultS = Float.toString(result);

                outcome.setText(resultS);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float inputNumber1 = Float.parseFloat(number1.getText().toString());
                float inputNumber2 = Float.parseFloat(number2.getText().toString());

                float result = inputNumber1 - inputNumber2;
                String resultS = Float.toString(result);

                outcome.setText(resultS);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float inputNumber1 = Float.parseFloat(number1.getText().toString());
                float inputNumber2 = Float.parseFloat(number2.getText().toString());

                float result = inputNumber1 * inputNumber2;
                String resultS = Float.toString(result);

                outcome.setText(resultS);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float inputNumber1 = Float.parseFloat(number1.getText().toString());
                float inputNumber2 = Float.parseFloat(number2.getText().toString());

                float result = inputNumber1 / inputNumber2;
                String resultS = Float.toString(result);

                outcome.setText(resultS);
            }
        });

    }
}