package com.dibu0404.developer.ecommerceapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.dibu0404.developer.ecommerceapp.Adapters.MainAdapter;
import com.dibu0404.developer.ecommerceapp.Models.MainModel;
import com.dibu0404.developer.ecommerceapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        ArrayList<MainModel> list=new ArrayList<>();

        list.add(new MainModel(R.drawable.appoearphone,"OPPO-E","20","OPPO ENCO M31 Wireless in-Ear Bluetooth Earphones with Mic"));
        list.add(new MainModel(R.drawable.bluehadphone,"Headphone","35","Sony WH-1000XM4 Industry Leading Wireless Noise Cancelling Headphones, Bluetooth Headset with Mic for Phone Calls, 30 Hours Battery Life, Quick Charge, Touch Control & Alexa Voice Control – (Silver)"));
        list.add(new MainModel(R.drawable.casiowatch,"Casio-Watch ","15","Casio G-Shock World time Analog-Digital Multi-Colour Dial Men's Watch - GA-100CF-1A9DR (G519)"));
        list.add(new MainModel(R.drawable.dellaptop,"Dell Laptop","120","Inspiron 15 5590 Laptop"));
        list.add(new MainModel(R.drawable.dinnerset,"Dinner-Set","95"," Larah by Borosil Twilight Silk Series Opalware Dinner Set, 35 Pieces, White"));
        list.add(new MainModel(R.drawable.gasstove,"Stove","60","NE 4B 60 GF |4 Gas Burner with 1 Triple Ring Burner| Black Tempered Glass (8mm Thick) | Built in Hob"));
        list.add(new MainModel(R.drawable.microwave,"Microwave","200","Samsung 28 L Convection Microwave Oven (MC28H5033CK, Black)"));
        list.add(new MainModel(R.drawable.mixer,"Mixer","40","Lifelong Power VX 750Watt Juicer Mixer Grinder, 3 Stainless Steel Jar+1 Juicer Jar"));
        list.add(new MainModel(R.drawable.oneplus,"OnePLus LED","350","OnePlus 138.8 cm (55 inches) Q1 Series 4K Certified Android QLED TV 55Q1IN Pro (Black) | with Sliding Soundbar"));
        list.add(new MainModel(R.drawable.predeator,"Predator","40","Acer Predator Triton 300 PT315-51 2019 15.6-inch Gaming Laptop (9th Gen Core i7 9750H/16GB/1TB HDD + 256GB SSD/Windows 10 Home/4GB NVIDIA GeForce GTX 1650 Graphics), Abyssal Black"));
        list.add(new MainModel(R.drawable.samsung,"Refrigirator","290"," Whirlpool 190 L 2 Star Direct-Cool Single Door Refrigerator (WDE 205 CLS PLUS 2S, Sapphire Fiesta, Toughened Glass Shelves)\n"));
        list.add(new MainModel(R.drawable.songheadphone,"B-Headphone","85","Zinq Technologies Erupt 4155 Super Bass Bluetooth On-Ear Headphones with Mic (Black)"));
        list.add(new MainModel(R.drawable.vivoearphone,"H-VIVO","45"," vivo Color Wired Earphones with Mic and 3.5mm Jack (White)"));
        list.add(new MainModel(R.drawable.womenwatches,"G-Watch","76","Gully by Timex Dope Analog Green Dial Women's Watch-TWGYL0200"));

        MainAdapter adapter=new MainAdapter(list,this);
        binding.recyclerView.setAdapter(adapter);

        GridLayoutManager layoutManager=new GridLayoutManager(this,2);
        binding.recyclerView.setLayoutManager(layoutManager);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.orders:
                startActivity(new Intent(MainActivity.this,OrderActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}