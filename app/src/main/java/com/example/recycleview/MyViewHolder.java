package com.example.recycleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView image;
    TextView nameView,emailView;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        image  = itemView.findViewById(R.id.imageView);
        nameView= itemView.findViewById(R.id.name);
        emailView =itemView.findViewById(R.id.email);

    }
}
