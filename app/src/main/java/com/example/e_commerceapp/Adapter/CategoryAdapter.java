package com.example.e_commerceapp.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.e_commerceapp.Model.CategoryModelClass;
import com.example.e_commerceapp.R;
import com.example.e_commerceapp.databinding.ItemCategariesBinding;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {
    @NonNull
    Context context;
    ArrayList<CategoryModelClass>categoriesList;

    public CategoryAdapter(@NonNull Context context, ArrayList<CategoryModelClass> categoriesList) {
        this.context = context;
        this.categoriesList = categoriesList;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CategoryViewHolder(LayoutInflater.from(context).inflate(R.layout.item_categaries,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        CategoryModelClass categoryModelClass=categoriesList.get(position);
        holder.binding.label.setText(categoryModelClass.getName());
        Glide.with(context)
                .load(categoryModelClass.getIcon())
                .into((ImageView) holder.binding.image);
        holder.binding.image.setBackgroundColor(Color.parseColor(categoryModelClass.getColor()));
    }

    @Override
    public int getItemCount() {
        return categoriesList.size();
    }

    public  class CategoryViewHolder extends RecyclerView.ViewHolder{

        ItemCategariesBinding binding;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            binding=ItemCategariesBinding.bind(itemView);
        }
    }
}
