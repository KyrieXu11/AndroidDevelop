package com.kyriexu.homework02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private String[] dataSet;
    private Context context;

    public Adapter(String[] dataSet, Context context) {
        this.dataSet = dataSet;
        this.context = context;
    }

    public Adapter(String[] dataSet) {
        this.dataSet = dataSet;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        private TextView textView;

        public MyViewHolder(View v) {
            super(v);
             textView = v.findViewById(R.id.item);
        }
    }
        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            // create a new view
            View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
            return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // set text for textview
        holder.textView.setText(dataSet[position]);
    }

    // retuern dataset's length
    @Override
    public int getItemCount() {
        return dataSet.length;
    }
}
