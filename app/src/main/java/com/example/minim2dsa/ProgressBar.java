package com.example.minim2dsa;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class ProgressBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);


        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(ProgressBar.this, FollowersRepos.class);
                startActivity(intent);
                finish();
            }
        };
        Timer t = new Timer();
        t.schedule(tarea, 2000);
    }

}
