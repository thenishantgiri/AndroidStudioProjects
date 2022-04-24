package com.example.lab14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startService(View view) {
        Intent startIntent = new Intent(this, MyService.class);
        startService(startIntent);
    }

    public void stopService(View view) {
        Intent stopIntent = new Intent(this, MyService.class);
        stopService(stopIntent);
    }
}