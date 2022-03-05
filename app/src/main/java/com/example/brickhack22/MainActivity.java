package com.example.brickhack22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Starting");

        Button toSpam = (Button) findViewById(R.id.spam);

        toSpam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked spam button");
                Intent intent = new Intent(MainActivity.this, spam_email.class);
                startActivity(intent);
            }
        });

        Button toPW = (Button) findViewById(R.id.pw_check);

        toPW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked password button");
                Intent intent = new Intent(MainActivity.this, spam_email.class);
                startActivity(intent);
            }
        });
    }
}