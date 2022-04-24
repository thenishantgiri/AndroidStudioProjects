package com.example.lab13;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button notifyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notifyBtn = findViewById(R.id.notifyBtn);

        // if the api version is greater than oreo then we have to create a notification channel
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel
                    channel = new NotificationChannel("notifyChannel", "Demo Notification", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }

            notifyBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // notification  code
                    NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this, "notifyChannel");
                    builder.setContentTitle("Demo Notification Title");
                    builder.setContentText("This is a demo notification.");
                    builder.setSmallIcon(R.drawable.messageicon);
                    builder.setAutoCancel(true); // swipe away the notification

                    // notify the user
                    NotificationManagerCompat manager = NotificationManagerCompat.from(MainActivity.this);
                    manager.notify(1, builder.build());
                }
            });
        }
    }