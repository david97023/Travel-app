package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends Activity {
    ImageButton mImageButton1,mImageButton2,mImageButton3,mImageButton4,mImageButton5,mImageButton6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mImageButton1 = findViewById(R.id.imageButton1);
        mImageButton2 = findViewById(R.id.imageButton2);
        mImageButton3 = findViewById(R.id.imageButton3);
        mImageButton4 = findViewById(R.id.imageButton4);
        mImageButton5 = findViewById(R.id.imageButton5);
        mImageButton6 = findViewById(R.id.imageButton6);
        mImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity2.this, MainActivityFood.class);
                startActivity(mIntent);
            }
        });
        mImageButton2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent mIntent = new Intent(MainActivity2.this, MainActivity3.class);
                 startActivity(mIntent);
             }
         });
        mImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity2.this, MainActivityLiving.class);
                startActivity(mIntent);
            }
        });
        mImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity2.this, MainActivityFun.class);
                startActivity(mIntent);
            }
        });
        mImageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity2.this, MainActivity5.class);
                startActivity(mIntent);
            }
        });
        mImageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity2.this, MainActivityPlan.class);
                startActivity(mIntent);
            }
        });
    }
}