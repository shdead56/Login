package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {
    private static final long SPLASH_SCREEN_DELAY=3000;
Animation top,bot;
ImageView image;
TextView logo,slogan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

   top= AnimationUtils.loadAnimation(this,R.anim.topanimacion);
   bot= AnimationUtils.loadAnimation(this,R.anim.butonanima);

   image=findViewById(R.id.imageView);
   logo=findViewById(R.id.textView);
   slogan.findViewById(R.id.textView2);
   image.setAnimation(top);
   logo.setAnimation(bot);
   slogan.setAnimation(bot);
   new Handler().postDelayed(new Runnable() {
       @Override
       public void run() {
           Intent in = new Intent(splash.this,MainActivity.class);
         startActivity(in);
        finish();
       }
        },SPLASH_SCREEN_DELAY);

    }
}