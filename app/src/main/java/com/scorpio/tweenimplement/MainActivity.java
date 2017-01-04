package com.scorpio.tweenimplement;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public ImageView img;
    AnimatorSet animRotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView)findViewById(R.id.rotation);
        animRotate = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),
                R.animator.rotate);
        animRotate.setTarget(img);
        animRotate.setDuration(3600);

    }

    public void rotate(View v){
        animRotate.start();
    }
}
