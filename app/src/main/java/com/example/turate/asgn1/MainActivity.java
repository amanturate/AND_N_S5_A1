package com.example.turate.asgn1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//Applying Animation to textview
    public void startBlinkingAnimation(View view) {
        TextView text = (TextView) findViewById(R.id.tv1);
        Animation startAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blinking_anim);
        text.startAnimation(startAnimation);
    }
}
