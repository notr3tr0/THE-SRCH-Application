package com.example.fiftypidobir.thesrch;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView sunImageView = (ImageView) findViewById(R.id.imageView);
        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.logo_animation);
        sunImageView.startAnimation(sunRiseAnimation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeintent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(homeintent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
