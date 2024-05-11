package com.example.recycleview;
import android.content.ClipData;
import android.content.Context;
import android.media.RouteListingPreference;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MyAdepter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<items> items;


    public MyAdepter(Context context, List<items> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view ,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.emailView.setText(items.get(position).getEmail());
        holder.image.setImageResource(items.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
