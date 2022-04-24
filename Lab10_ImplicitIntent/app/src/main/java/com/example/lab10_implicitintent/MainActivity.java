package com.example.lab10_implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
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

        EditText urlText = findViewById(R.id.url);
        Button searchBtn = findViewById(R.id.searchBtn);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www." + urlText.getText().toString();
                Uri web = Uri.parse(url);
                Intent myIntent = new Intent(Intent.ACTION_VIEW, web);

                if (myIntent.resolveActivity(getPackageManager()) == null) {
                    Toast.makeText(MainActivity.this, "Invalid URL", Toast.LENGTH_SHORT).show();
                }

                if (myIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(myIntent);
                }
            }
        });
    }
}