package com.example.lab11;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView textView = findViewById(R.id.welcomeMsg);

        Bundle myIntent = getIntent().getExtras();
        String data = myIntent.getString("username");

        textView.setText("Welcome " + data);

        Button btn = findViewById(R.id.logoutBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder warning = new AlertDialog.Builder(Activity2.this);
                warning.setTitle("Logout?");
                warning.setMessage("Are you sure?");
                warning.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Activity2.this, "Successful Logout", Toast.LENGTH_SHORT).show();
                        Intent logout = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(logout);
                    }
                });
                warning.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog alertObj = warning.create();
                alertObj.show();
            }
        });
    }
}
