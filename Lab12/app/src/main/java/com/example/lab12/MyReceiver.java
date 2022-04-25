package com.example.lab12;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        CharSequence value = intent.getCharSequenceExtra("msg");
        Toast.makeText(context, "Broadcast Received: " + value, Toast.LENGTH_LONG).show();
    }
}
