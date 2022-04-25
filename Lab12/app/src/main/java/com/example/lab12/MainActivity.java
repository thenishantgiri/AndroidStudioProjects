package com.example.lab12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter intentFilter = new IntentFilter("Com.app.CUSTOM_INTENT");
        MyReceiver objReceiver = new MyReceiver();

        registerReceiver(objReceiver, intentFilter);
    }

    public void showBroadcast(View view) {
        EditText editText = (EditText) findViewById(R.id.et);
        Intent intent = new Intent();
        intent.putExtra("msg", editText.getText());
        intent.setAction("Com.app.CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}
