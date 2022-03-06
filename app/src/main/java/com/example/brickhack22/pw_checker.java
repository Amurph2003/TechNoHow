package com.example.brickhack22;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import me.gosimple.nbvcxz.Nbvcxz;
import me.gosimple.nbvcxz.scoring.Result;


public class pw_checker extends AppCompatActivity {
    private static final String TAG = "pw_checker";
    // With all defaults...
    Nbvcxz nbvcxz = new Nbvcxz();

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

        TextView password = (TextView) findViewById(R.id.passwordbox);
        TextView scored = (TextView) findViewById(R.id.score);
        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked submit for pw");
                String phrase = password.getText().toString();
                Result score = nbvcxz.estimate(phrase);
                scored.setText(score.getBasicScore());
            }
        });



    }
}
