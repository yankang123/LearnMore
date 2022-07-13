package com.example.learnmore.ContentProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learnmore.R;

import java.util.ArrayList;
import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder>{
    private List<String> myList = new ArrayList<>();
    public RecycleAdapter (List<String> list){
        myList = list;
    }
    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.recy_item_text);
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String str = myList.get(position);
        holder.textView.setText(str);
        Log.d("haha", "onBindViewHolder: "+myList);
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }
}
