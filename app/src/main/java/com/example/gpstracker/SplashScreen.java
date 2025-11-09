package com.example.gpstracker;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.os.*;

public class SplashScreen extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);

                player = MediaPlayer.create(SplashScreen.this, R.raw.sound);
                player.start();


        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent intent=new Intent(SplashScreen.this, Login.class);
                startActivity(intent);
                finish();
            }
        },3500);

    }
}