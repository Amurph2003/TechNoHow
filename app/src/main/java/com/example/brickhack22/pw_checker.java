package com.example.brickhack22;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class pw_checker extends AppCompatActivity {
    private static final String TAG = "pw_checker";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pw_check_layout);

        Button home_from_pw = (Button) findViewById(R.id.home_pw);

        home_from_pw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked home button from pw");
                Intent intent = new Intent(pw_checker.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
