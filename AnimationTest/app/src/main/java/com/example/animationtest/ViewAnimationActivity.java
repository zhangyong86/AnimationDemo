package com.example.animationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewAnimationActivity extends AppCompatActivity {
    
    private static final String TAG = ViewAnimationActivity.class.getSimpleName();

    @BindView(R.id.tv_view_animation)
    TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_animation);
        ButterKnife.bind(this);
        showAnimation();
    }

    public void showAnimation(){
        //Java代码实现
        AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
        alphaAnimation.setDuration(3000);
        RotateAnimation rotateAnimation = new RotateAnimation(0, 90);
        rotateAnimation.setDuration(3000);
        //xml实现
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.view_animation);
//        view.startAnimation(alphaAnimation);
//        view.startAnimation(rotateAnimation);
        view.startAnimation(animation);
    }

    @Override
    public void onBackPressed() {
        Log.i(TAG, "onBackPressed: ");
        super.onBackPressed();
    }

    /**
     * onBackPressed->finish->onPause->onStop->onDestroy
     * onBackPressed方法中调用activity finish
     */
    @Override
    public void finish() {
        Log.i(TAG, "finish: ");
        super.finish();
        overridePendingTransition(R.anim.enter_anim, R.anim.exit_anim);
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "onPause: ");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "onStop: ");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy: ");
        super.onDestroy();
    }
}
