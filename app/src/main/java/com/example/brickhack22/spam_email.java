package com.example.brickhack22;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class spam_email extends AppCompatActivity {
    private static final String TAG = "spam_email";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spam_email_layout);

        Log.d(TAG, "onCreate: Starting");

        Button home_from_spam = (Button) findViewById(R.id.home_spam);

        home_from_spam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked home from spam");
                Intent intent = new Intent(spam_email.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button desp = (Button) findViewById(R.id.desperate);
        Button inj = (Button) findViewById(R.id.injury);
        Button win = (Button) findViewById(R.id.prizes);
        Button friend = (Button) findViewById(R.id.friend);




    }
}
