package com.example.lab10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Validate(View view) {
        String username = "thenishantgiri";
        String password = "rootpass";

        EditText userValidation = findViewById(R.id.username);
        EditText passValidation = findViewById(R.id.password);

        if (userValidation.getText().toString().equals(username)
                && passValidation.getText().toString().equals(password)) {
            Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Try Again", Toast.LENGTH_SHORT).show();
        }
    }
}