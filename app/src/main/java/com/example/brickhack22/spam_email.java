package com.example.brickhack22;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class spam_email extends AppCompatActivity {
    private static final String TAG = "spam_email";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spam_email_layout);

        Log.d(TAG, "onCreate: Starting");

        Button home_from_spam = findViewById(R.id.home_spam);

        home_from_spam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked home from spam");
                Intent intent = new Intent(spam_email.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button desp = findViewById(R.id.desperate);
        Button inj = findViewById(R.id.injury);
        Button win = findViewById(R.id.prizes);
        Button friend = findViewById(R.id.friend);
        TextView recip = findViewById(R.id.recipient);
        TextView addy = findViewById(R.id.emailaddress);

        desp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked desperate");

                Intent email = new Intent(Intent.ACTION_SENDTO);

                email.setData(Uri.parse("mailto:"));

                email.putExtra(Intent.EXTRA_EMAIL, new String[]{addy.getText().toString()});
                email.putExtra(Intent.EXTRA_SUBJECT, "My phone bill is almost due!!");
                email.putExtra(Intent.EXTRA_TEXT, "Hi " + recip.getText().toString() + ", \n My phone bill is due tomorrow and I don't get paid for another three days. Can you give me $55 using the link below?? I'd really appreciate it! \n\n https://technohow.tech/you-were-phished");
                if (email.resolveActivity(getPackageManager()) != null) {
                    startActivity(email);
                } else {
                    Log.d(TAG, "onClick: no email?");
                }
            }
        });

        inj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked injury");

                Intent email = new Intent(Intent.ACTION_SENDTO);

                email.setData(Uri.parse("mailto:"));

                email.putExtra(Intent.EXTRA_EMAIL, new String[]{addy.getText().toString()});
                email.putExtra(Intent.EXTRA_SUBJECT, "Car Accident");
                email.putExtra(Intent.EXTRA_TEXT, "Hi " + recip.getText().toString() + ", \n I was in a car accident last week and I'm being released from the hospital today. However, I'm unable to work and I therefore won't be able to work and make money. Could you send me $3,825.69 to cover my bills for the next few weeks until I can go back to work? I'd really appreciate it and I'll pay you back as soon as I can. \n\n https://technohow.tech/you-were-phished");
                if (email.resolveActivity(getPackageManager()) != null) {
                    startActivity(email);
                } else {
                    Log.d(TAG, "onClick: no email?");
                }
            }
        });


        win.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked win");

                Intent email = new Intent(Intent.ACTION_SENDTO);

                email.setData(Uri.parse("mailto:"));

                email.putExtra(Intent.EXTRA_EMAIL, new String[]{addy.getText().toString()});
                email.putExtra(Intent.EXTRA_SUBJECT, "Claim your prize!!!");
                email.putExtra(Intent.EXTRA_TEXT, "Congratulations " + recip.getText().toString() + ", \n You've won a $300 Visa giftcard! Claim your prize at the link below by confirming your email address and address! \n\n https://technohow.tech/you-were-phished");

                if (email.resolveActivity(getPackageManager()) != null) {
                    startActivity(email);
                } else {
                    Log.d(TAG, "onClick: no email?");
                }
            }
        });


        friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked friend");

                Intent email = new Intent(Intent.ACTION_SENDTO);

                email.setData(Uri.parse("mailto:"));

                email.putExtra(Intent.EXTRA_EMAIL, new String[]{addy.getText().toString()});
                email.putExtra(Intent.EXTRA_SUBJECT, "Remember me?!!");
                email.putExtra(Intent.EXTRA_TEXT, "Hi " + recip.getText().toString() + ", \n Remember me?! We had a few classes together in highschool. I think they were math and bio if I remember correctly, and I really enjoyed being your lab partner in that class. Anyways my daughter is currently in the hospital, and I've been keeping her company which has prevented me from working. Unfortunately I now can't afford the last procedure she needs to be cured, which if we don't do it tonight she won't make it. Any chance you could help a buddy out? I'd owe you big time! if you can, I'm including a link to my paypal with the amount. Thanks man, I really appreciate it!  \n\n https://technohow.tech/you-were-phished");
                if (email.resolveActivity(getPackageManager()) != null) {
                    startActivity(email);
                } else {
                    Log.d(TAG, "onClick: no email?");
                }
            }
        });
    }
}
