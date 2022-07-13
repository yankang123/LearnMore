package com.example.learnmore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.learnmore.Animation.AnimateActivity;
import com.example.learnmore.ContentProvider.ContentProviderActivity;
import com.example.learnmore.Service.ServiceActivity;
import com.example.learnmore.VIewPager.ViewPagerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(MainActivity.this, ContentProviderActivity.class));
    }
}