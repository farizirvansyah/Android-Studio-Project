package com.example.a2211500141_appgabungan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ScrollViewActivity extends AppCompatActivity {
    Button cupcake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
        cupcake = findViewById(R.id.cupcake);
        cupcake.setOnClickListener(View -> {
            startActivity(new Intent(ScrollViewActivity.this, CupcakeActivity.class));
        });
    }
}
