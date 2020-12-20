package com.dibu0404.developer.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toolbar;

import com.dibu0404.developer.ecommerceapp.Adapters.OrderAdapter;
import com.dibu0404.developer.ecommerceapp.Database.DBHelper;
import com.dibu0404.developer.ecommerceapp.Models.OrdersModel;
import com.dibu0404.developer.ecommerceapp.databinding.ActivityOrderBinding;
import java.util.ArrayList;
import java.util.Set;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setTitle("Orders");
        setTitleColor(Color.WHITE);

        DBHelper helper = new DBHelper(this);
        ArrayList<OrdersModel> list = helper.getOrders();

        OrderAdapter adapter = new OrderAdapter(list, this);
        binding.orderRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.orderRecyclerView.setLayoutManager(layoutManager);


    }

}