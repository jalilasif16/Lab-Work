package com.example.backgroundcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splashscreen_activity extends AppCompatActivity {

    TextView textView_textLogo;
    ImageView imageView_ballLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen_activity);

        textView_textLogo = findViewById(R.id.textView);
        imageView_ballLogo = findViewById(R.id.imageView);
        rotate_ball();
        scale_text();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainActivity_intent = new Intent(splashscreen_activity.this,MainActivity.class);
            }
        },4000);
    }

    public void rotate_ball(){
        Animation rotate_animation = AnimationUtils.loadAnimation(this,R.anim.rotate_animation);
        imageView_ballLogo.startAnimation(rotate_animation);
    }

    public void scale_text(){
        Animation rotate_animation = AnimationUtils.loadAnimation(this,R.anim.scale_animation);
        textView_textLogo.startAnimation(rotate_animation);
    }

}