package com.example.e_commerceapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.e_commerceapp.Adapter.CategoryAdapter;
import com.example.e_commerceapp.Model.CategoryModelClass;
import com.example.e_commerceapp.R;
import com.example.e_commerceapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
CategoryAdapter categoryAdapter;
ArrayList<CategoryModelClass> categoryArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        categoryArrayList=new ArrayList<>();
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,4);
        binding.categariesRecyclerView.setLayoutManager(gridLayoutManager);
        categoryArrayList.add(new CategoryModelClass("Tanzeel","https://www.svgrepo.com/show/490925/basketball.svg","#FF3700B3","some Discription",1));

        categoryAdapter=new CategoryAdapter(this,categoryArrayList);
        binding.categariesRecyclerView.setAdapter(categoryAdapter);


    }
}