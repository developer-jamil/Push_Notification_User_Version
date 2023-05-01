package com.jamillabltd.pushnotificationuserversion;

import static com.jamillabltd.pushnotificationuserversion.Constants.TOPIC;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //firebase message subscribe - push notification
        FirebaseMessaging.getInstance().subscribeToTopic(TOPIC);



    }
}