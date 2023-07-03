package com.example.tcaresit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String loginUsername = "login";
        final String loginPassword = "login";

        EditText username = findViewById(R.id.loginUsername);
        EditText password = findViewById(R.id.loginPassword);

        Button login = findViewById(R.id.loginButton);

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                String getUser = username.getText().toString();
                String getPass = password.getText().toString();

                if(!getUser.isEmpty() || !getPass.isEmpty()){
                    if(getUser.equals(loginUsername) && getPass.equals(loginPassword)) {
                        Intent menu = new Intent(getApplicationContext(), menuPage.class);
                        startActivity(menu);
                    }
                }

            }
        });

    }
}