package com.example.recyclerview.myadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.modelclass.ModelClass;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    ArrayList<ModelClass> modelClassArrayList;

    public MyAdapter(ArrayList<ModelClass> modelClassArrayList) {
        this.modelClassArrayList = modelClassArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View customRow = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_row,parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(customRow);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        ModelClass modelClass = modelClassArrayList.get(i);
        myViewHolder.contactPic.setImageResource(modelClass.getContactPic());

        myViewHolder.contactName.setText(modelClass.getContactName());
        myViewHolder.contactEmail.setText(modelClass.getContactEmail());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView contactPic;
        TextView contactName,contactEmail;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            contactPic = itemView.findViewById(R.id.image_contact);
            contactName = itemView.findViewById(R.id.contact_name);
            contactEmail = itemView.findViewById(R.id.contact_email);

        }
    }
}
