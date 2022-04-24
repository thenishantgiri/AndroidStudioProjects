package com.example.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerFn();
    }

    public void spinnerFn() {
        Spinner spinner;
        ImageView img;

        spinner = findViewById(R.id.spinner);
        img = findViewById(R.id.imageView);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spinner.getSelectedItemId() == 0) img.setImageResource(R.drawable.android);
                else if (spinner.getSelectedItemId() == 1) img.setImageResource(R.drawable.mac);
                else if (spinner.getSelectedItemId() == 2) img.setImageResource(R.drawable.ios);
                else if (spinner.getSelectedItemId() == 3) img.setImageResource(R.drawable.mslogo);
                else if (spinner.getSelectedItemId() == 4) img.setImageResource(R.drawable.linux);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
    }
}