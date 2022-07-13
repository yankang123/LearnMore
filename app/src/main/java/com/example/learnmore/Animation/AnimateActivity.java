package com.example.learnmore.Animation;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.SurfaceControl;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.learnmore.R;

public class AnimateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animate);
        ImageView imageView=(ImageView) findViewById(R.id.image);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.translate_anim);
        animation.setFillAfter(true);
        imageView.startAnimation(animation);
    }
}