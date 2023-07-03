package com.example.tcaresit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);

        Button file = findViewById(R.id.fileButton);
        Button calculator = findViewById(R.id.calculatorButton);
        Button game = findViewById(R.id.gameButton);

        file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fileInt = new Intent(getApplicationContext(), createFile.class);
                startActivity(fileInt);
            }
        });

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calculatorInt = new Intent(getApplicationContext(), calculator.class);
                startActivity(calculatorInt);
            }
        });

        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gameInt = new Intent(getApplicationContext(), game.class);
                startActivity(gameInt);
            }
        });

    }
}