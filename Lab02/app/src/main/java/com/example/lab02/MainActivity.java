package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {

    int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.quantity);
        quantityTextView.setText(MessageFormat.format("{0}", number));
    }

    public void increment(View view) {
        ++number;
        display(number);
    }

    public void decrement(View view) {
        --number;
        display(number);
    }

    public void reset(View view) {
        number = 0;
        display(number);
    }
}