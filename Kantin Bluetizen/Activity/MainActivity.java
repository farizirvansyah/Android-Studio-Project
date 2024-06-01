package com.example.uts_kantin_bluetizen.Activity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uts_kantin_bluetizen.Adapter.FoodListAdapter;
import com.example.uts_kantin_bluetizen.Domain.FoodDomain;
import com.example.uts_kantin_bluetizen.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterFoodList;
    private RecyclerView recyclerViewFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerview();
        bottomNavigation();
    }

    private void bottomNavigation() {
        LinearLayout homeBtn=findViewById(R.id.homeBtn);
        LinearLayout cartBtn=findViewById(R.id.cartBtn);

        homeBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,MainActivity.class)));

        cartBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,CartActivity.class)));
    }

    private void initRecyclerview() {
        ArrayList<FoodDomain> items=new ArrayList<>();
        items.add(new FoodDomain("Nasi Goreng", "Nasi goreng lezat dengan campuran telur dadar, potongan daging ayam, dan sayuran segar. Disajikan dengan irisan mentimun dan kerupuk untuk menambah cita rasa.", "fast_1", 20000, 15, 150, 4.5));
        items.add(new FoodDomain("Mie Ayam", "Mie pangsit ayam dengan kuah kaldu ayam yang kaya rasa, potongan daging ayam, daun bawang, dan irisan bakso. Tersedia dalam porsi besar untuk memuaskan lapar Anda.", "fast_2", 20000, 12, 180, 4.8));
        items.add(new FoodDomain("Ayam Goreng", "Potongan ayam goreng renyah dengan rempah-rempah khas, disajikan dengan sambal dan acar segar. Sangat cocok untuk dinikmati sebagai lauk pendamping nasi atau sebagai camilan.", "fast_3", 18000, 15, 220, 4.6));
        items.add(new FoodDomain("Jus Jeruk", "Jus segar dari buah jeruk yang diperas langsung, tanpa tambahan gula atau pengawet. Menyegarkan dan kaya akan vitamin C, cocok dinikmati kapan saja.", "fast_4", 10000, 5, 80, 4.3));
        items.add(new FoodDomain("Bakso", "Bakso lezat dengan tekstur kenyal, disajikan dalam kuah kaldu sapi yang gurih. Tersedia dengan tambahan mie atau bihun sesuai selera.", "fast_5", 12000, 6, 200, 4.9));
        items.add(new FoodDomain("Oreo", "Sajian klasik Oreo dengan dua biskuit cokelat renyah yang diisi dengan krim vanilla lembut di tengahnya. Sempurna untuk camilan manis di tengah hari.", "fast_6", 2000, 1, 150, 4.2));
        items.add(new FoodDomain("Coca Cola", "Minuman bersoda Coca Cola yang menyegarkan dengan rasa khasnya yang unik. Dingin dan cocok dinikmati untuk melepas dahaga.", "fast_7", 8000, 1, 90, 4.4));

        recyclerViewFood=findViewById(R.id.view1);
        recyclerViewFood.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterFoodList=new FoodListAdapter(items);
        recyclerViewFood.setAdapter(adapterFoodList);
    }

    @Override
    public void onBackPressed() {
        AlertDialog alertDialog=new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Keluar Aplikasi");
        alertDialog.setMessage("Apakah anda yakin ingin keluar dari aplikasi?");
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Ya", (dialog, which) -> {
            finishAffinity();
        });
        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Tidak", (dialog, which) -> {
            dialog.dismiss();
        });
        alertDialog.show();
    }
}