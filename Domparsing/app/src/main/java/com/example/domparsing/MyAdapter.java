package com.example.domparsing;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {

    ArrayList<Modal> list = new ArrayList<>();

    public MyAdapter(ArrayList<Modal> list) {
        this.list = list;
    }

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.single_row,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.t1.setText(list.get(position).getName());
        holder.t2.setText(list.get(position).getRoll_no());
        holder.t3.setText(list.get(position).getAge());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
