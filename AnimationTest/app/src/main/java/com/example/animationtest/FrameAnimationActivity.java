package com.example.animationtest;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FrameAnimationActivity extends AppCompatActivity {

    @BindView(R.id.iv_frame_animation)
    ImageView imageView;

    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);
        ButterKnife.bind(this);
        animationDrawable = (AnimationDrawable) imageView.getBackground();
        animationDrawable.start();
    }
}
