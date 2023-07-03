package com.example.tcaresit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        final int min = 1;
        final int max = 20;

        EditText number = findViewById(R.id.insertNumber);

        Button comparison = findViewById(R.id.compareButton);

        TextView text = findViewById(R.id.textOutcome);

        comparison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int randomNumber = (int)Math.floor(Math.random()*(max-min+1)+min);
                int inputNumber = Integer.parseInt(number.getText().toString());

                if(randomNumber == inputNumber){
                    text.setText("You guessed the number! Well done!");
                }else {
                    text.setText("The number was: " + randomNumber + ". Try again.");
                }

            }
        });

    }
}