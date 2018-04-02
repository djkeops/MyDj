package com.example.android.mydj;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        final Handler delayer = new Handler();
        delayer.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent startGenresActivity = new Intent(IntroActivity.this, GenresActivity.class);
                startActivity(startGenresActivity);
                finish();
            }
        }, 2000);
    }
}
