package com.example.lab11;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
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

    public void LoginCheck(View view) {
        EditText username = findViewById(R.id.loginUsername);
        EditText password = findViewById(R.id.loginPassword);

        if (username.getText().toString().equals("thenishantgiri") && password.getText().toString().equals("rootpass")) {
            Toast.makeText(this, "Successful Login", Toast.LENGTH_SHORT).show();

            Intent loginIntent = new Intent(this, Activity2.class);
            String value = username.getText().toString();
            loginIntent.putExtra("username", value);
            startActivity(loginIntent);
        } else {
            Toast.makeText(this, "Unsuccessful Login", Toast.LENGTH_LONG).show();
        }
    }
}