package com.example.lenovo.bitmapwithanimation;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int duration=2500;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView iv=(ImageView)findViewById(R.id.iv);
        Button start=(Button)findViewById(R.id.start);
        Button stop=(Button)findViewById(R.id.stop);


        BitmapDrawable frame1=(BitmapDrawable)getResources().getDrawable(R.drawable.apple);
        BitmapDrawable frame2=(BitmapDrawable)getResources().getDrawable(R.drawable.asus);
        BitmapDrawable frame3=(BitmapDrawable)getResources().getDrawable(R.drawable.lenovo);

        final AnimationDrawable manimation=new AnimationDrawable();

        manimation.addFrame(frame1,duration);
        manimation.addFrame(frame2,duration);
        manimation.addFrame(frame3,duration);
        iv.setBackgroundDrawable(manimation);
        manimation.setOneShot(false);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manimation.start();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manimation.stop();
            }
        });
    }
}
