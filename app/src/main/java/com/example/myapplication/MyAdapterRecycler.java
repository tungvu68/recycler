package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapterRecycler extends RecyclerView.Adapter<MyAdapterRecycler.MyViewHolderrecycler> {

    private List<Integer> listImagedIds;
    private List<String> listTexts;

    public MyAdapterRecycler(List<Integer> listImagedIds, List<String> listTexts) {
        this.listImagedIds = listImagedIds;
        this.listTexts = listTexts;
    }

    @NonNull
    @Override
    public MyAdapterRecycler.MyViewHolderrecycler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_item, parent, false);
        return new MyAdapterRecycler.MyViewHolderrecycler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapterRecycler.MyViewHolderrecycler holder, int position) {
        holder.imageView.setImageResource(listImagedIds.get(position));
        holder.textView.setText(listTexts.get(position));
    }

    @Override
    public int getItemCount() {
        return listTexts.size();
    }

    public class MyViewHolderrecycler extends RecyclerView.ViewHolder {
        private CardView cardView;
        private ImageView imageView;
        private TextView textView;
        public MyViewHolderrecycler(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardView);
            imageView = itemView.findViewById(R.id.item_image_view);
            textView = itemView.findViewById(R.id.item_text);
        }
    }
}
