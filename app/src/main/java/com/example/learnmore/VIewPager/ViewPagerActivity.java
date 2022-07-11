package com.example.learnmore.VIewPager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.learnmore.R;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerActivity extends AppCompatActivity {

    private View view1,view2,view3;
    private List<View> viewList = new ArrayList<>();
    private PagerAdapter adapter;
    private LayoutInflater inflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        inflater = getLayoutInflater();
        ViewPager viewPager = findViewById(R.id.viewpager_learn);
        view1 = inflater.inflate(R.layout.viewpager1,null);
        view2 = inflater.inflate(R.layout.viewpager2,null);
        view3 = inflater.inflate(R.layout.viewpager3,null);
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);
        adapter = new PagerAdapter(viewList);
        viewPager.setAdapter(adapter);
    }
}