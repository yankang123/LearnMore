package com.example.learnmore.VIewPager;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import java.util.List;

public class PagerAdapter extends androidx.viewpager.widget.PagerAdapter {
  private List<View> views ;

  public PagerAdapter(List<View> mViewList){
      views =mViewList;
  }
    @Override
    public int getCount() {
        return views.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
           container.addView(views.get(position));
           return views.get(position);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(views.get(position));
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }
}
