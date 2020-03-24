package com.kyriexu.homework02;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Random;

public class Adapter<T> extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private List<T> dataSet;
    private Context context;

    public Adapter(List<T> dataSet, Context context) {
        this.dataSet = dataSet;
        this.context = context;
    }

    public Adapter(List<T> dataSet) {
        this.dataSet = dataSet;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        private TextView textView;
        private CardView cardView;

        public MyViewHolder(View v) {
            super(v);
            textView = v.findViewById(R.id.card_text);
            cardView = v.findViewById(R.id.cardItem);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // create a new view
        View view = LayoutInflater.from(context).inflate(R.layout.item_card, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Random random = new Random();
        GradientDrawable drawable = new GradientDrawable();
        // set color for drawable
        // set random color
        drawable.setColor(Color.parseColor(com.kyriexu.homework02.Color.getColor(random.nextInt(5)).getColor()));
        // set drawable
        holder.cardView.setBackground(drawable);
        // set text for textview
        holder.textView.setText(String.valueOf(dataSet.get(position)));
    }

    // retuern dataset's length
    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
