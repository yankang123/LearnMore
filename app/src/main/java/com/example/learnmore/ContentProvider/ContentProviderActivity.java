package com.example.learnmore.ContentProvider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.learnmore.R;

import java.util.ArrayList;
import java.util.List;

public class ContentProviderActivity extends AppCompatActivity {
private List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list.add("1");
        list.add("2");
        list.add("2");

        setContentView(R.layout.activity_content_provider);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        RecycleAdapter adapter = new RecycleAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}