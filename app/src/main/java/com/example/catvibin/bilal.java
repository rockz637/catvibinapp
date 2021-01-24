package com.example.catvibin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class bilal extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilal);
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {



            @Override

            public void run() {

                Intent i = new Intent(bilal.this,MainActivity.class);

                startActivity(i);


                finish();

            }

        }, 5*1000);

    }
}