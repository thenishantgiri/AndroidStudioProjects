package com.example.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_items, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        TextView textView = findViewById(R.id.textView);

        switch (item.getItemId()) {
            case R.id.new_group:
                textView.setText("New Group");
                return true;
            case R.id.new_broadcast:
                textView.setText("New Broadcast");
                return true;
            case R.id.linked_devices:
                textView.setText("Linked Devices");
                return true;
            case R.id.starred_messages:
                textView.setText("Starred Messages");
                return true;
            case R.id.payments:
                textView.setText("Payments");
                return true;
            case R.id.settings:
                textView.setText("Settings");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}