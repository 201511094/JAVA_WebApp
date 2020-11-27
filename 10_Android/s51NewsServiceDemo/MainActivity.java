package com.example.s51newsservicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.newsstart) {
            //서비스 실행
            Intent intent = new Intent(this, NewsService.class);
            startService(intent);
        }
        else if (view.getId() == R.id.newsend) {
            //서비스 종료
            Intent intent = new Intent(this, NewsService.class);
            stopService(intent);
        }
    }
}