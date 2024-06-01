package com.example.uts_kantin_bluetizen.Activity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uts_kantin_bluetizen.Adapter.CartListAdapter;
import com.example.uts_kantin_bluetizen.Helper.ChangeNumberItemsListener;
import com.example.uts_kantin_bluetizen.Helper.ManagmentCart;
import com.example.uts_kantin_bluetizen.R;

public class CartActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewList;
    private ManagmentCart managmentCart;
    private TextView totalFeeTxt, taxTxt, serviceTxt, totalTxt, emptyTxt;
    private double tax;
    private ScrollView scrollView;
    private ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        managmentCart = new ManagmentCart(this);

        initView();
        initList();
        calculateCart();
        setVariable();
    }

    private void setVariable() {
        backBtn.setOnClickListener(v -> finish());
    }

    private void initList() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerViewList.setLayoutManager(linearLayoutManager);
        adapter = new CartListAdapter(managmentCart.getListCart(), this, new ChangeNumberItemsListener() {
            @Override
            public void changed() {
                calculateCart();
            }
        });

        recyclerViewList.setAdapter(adapter);

        if(managmentCart.getListCart().isEmpty()){
            emptyTxt.setVisibility(View.VISIBLE);
            scrollView.setVisibility(View.GONE);
        }else{
            emptyTxt.setVisibility(View.GONE);
            scrollView.setVisibility(View.VISIBLE);
        }
    }

    private void calculateCart() {
        double percentTax = 0.11;
        double service = 2000;
        tax = Math.round((managmentCart.getTotalFee() * percentTax * 100)) / 100;

        double total = Math.round((managmentCart.getTotalFee() + tax + service) * 100) / 100;
        double itemTotal = Math.round(managmentCart.getTotalFee() * 100) / 100;

        totalFeeTxt.setText("Rp" + itemTotal);
        taxTxt.setText("Rp" + tax);
        serviceTxt.setText("Rp" + service);
        totalTxt.setText("Rp" + total);
    }

    private void initView() {
        totalFeeTxt = findViewById(R.id.totalFeeTxt);
        taxTxt = findViewById(R.id.taxTxt);
        serviceTxt = findViewById(R.id.serviceTxt);
        totalTxt = findViewById(R.id.totalTxt);
        recyclerViewList = findViewById(R.id.view3);
        scrollView = findViewById(R.id.scrollView);
        backBtn = findViewById(R.id.backBtn);
        emptyTxt = findViewById(R.id.emptyTxt);
    }

    public void ButtonOrder(View view) {
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Konfirmasi");
        alertDialog.setMessage("Apakah pesanan anda sudah benar?");
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Ya", (dialog, which) -> {
            managmentCart.ButtonOrder2();
            finish();
        });
        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Tidak", (dialog, which) -> dialog.dismiss());
        alertDialog.show();
    }
}