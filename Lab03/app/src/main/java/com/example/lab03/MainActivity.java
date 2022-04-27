package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String username;
    String password;

    EditText Username;
    EditText Password;

    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = findViewById(R.id.Username);
        Password = findViewById(R.id.Password);
        Login = findViewById(R.id.Login);

        Login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                username = Username.getText().toString();
                password = Password.getText().toString();

                Context context = getApplicationContext();
                CharSequence text1 = "Login Successful!";
                CharSequence text2 = "Invalid Credentials!";

                Toast t1 = Toast.makeText(context, text1, Toast.LENGTH_SHORT);
                Toast t2 = Toast.makeText(context, text2, Toast.LENGTH_SHORT);

                if (username.equals("thenishantgiri") && password.equals("demopass")) t1.show();
                else
                    t2.show();
            }
        });
    }
}