package com.example.animationtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Android的动画分为三种：View动画、帧动画和属性动画
 * 显示隐式intent的使用
 * 改变Activity的切换效果
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.view_animation) void showViewAnimation(){
        //使用ComponentName显式启动
        Intent intent = new Intent(this, ViewAnimationActivity.class);
        startActivity(intent);
        //使用指定Activity的切花样式(必须放在startActivity或者finish()之后)
        overridePendingTransition(R.anim.enter_anim, R.anim.exit_anim);
    }

    @OnClick(R.id.frame_animation) void showFrameAnimation(){
        //使用action隐式启动
        Intent intent = new Intent();
        intent.setAction("android.intent.action.FRAME_ANIMATION");
        startActivity(intent);
    }

    @OnClick(R.id.frame_animation) void showPropertyAnimation(){

    }

}
