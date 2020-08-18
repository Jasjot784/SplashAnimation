package com.jasjotsingh.splashanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import me.wangyuwei.particleview.ParticleView;

public class MainActivity extends AppCompatActivity implements ParticleView.ParticleAnimListener {
    ParticleView view1,view2,view3,view4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        animate();
        listen();
    }

    private void listen() {
        view1.setOnParticleAnimListener(this);
    }

    private void animate() {
        view1.startAnim();
        view2.startAnim();
        view3.startAnim();
        view4.startAnim();
    }

    private void init() {
    view1 = findViewById(R.id.pv_1);
    view2 = findViewById(R.id.pv_2);
    view3 = findViewById(R.id.pv_3);
    view4 = findViewById(R.id.pv_4);
    }

    @Override
    public void onAnimationEnd() {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}