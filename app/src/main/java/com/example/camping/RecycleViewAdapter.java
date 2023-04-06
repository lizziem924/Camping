package com.example.camping;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    ArrayList<Campout> campoutList;
    Context context;

    public RecycleViewAdapter(ArrayList<Campout> campoutList, Context context) {
        this.campoutList = campoutList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.campoutName.setText(campoutList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return campoutList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView campoutName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            campoutName = itemView.findViewById(R.id.campout_name);
        }
    }
}
