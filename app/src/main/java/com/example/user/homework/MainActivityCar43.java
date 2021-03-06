package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityCar43 extends Activity {

    Button mButton1,mButton2,mButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maincar1);

        mButton1 = findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);
        mButton3 = findViewById(R.id.button3);

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.cathaybk.com.tw/cathaybk/";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E5%9C%8B%E6%B3%B0%E4%B8%96%E8%8F%AFATM+(%E5%AE%9C%E8%98%AD%E5%88%86%E8%A1%8C)/@24.7787586,121.7624926,14z/data=!4m8!1m2!2m1!1z5ZyL5rOw5LiW6I-vQVRN!3m4!1s0x3467e4e9d86ee7cb:0x2a40c43fbfc2634c!8m2!3d24.7492505!4d121.7502798";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:03-935-8797"));
                startActivity(intent);
            }
        });
    }
}
