package com.example.lab14;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {

    public MyService() {
    }

    private static String TAG = "My Service";

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Service Created", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Service is Created");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Service is Started");
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Service is Destroyed");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
