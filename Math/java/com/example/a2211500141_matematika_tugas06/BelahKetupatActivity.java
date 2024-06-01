package com.example.a2211500141_matematika_tugas06;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BelahKetupatActivity extends Activity {
    EditText D1belahketupat, D2belahketupat;
    TextView H1belahketupat, H2belahketupat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belah_ketupat);
        D1belahketupat = findViewById(R.id.D1belahketupat);
        D2belahketupat = findViewById(R.id.D2belahketupat);
        H1belahketupat = findViewById(R.id.H1belahketupat);
        H2belahketupat = findViewById(R.id.H2belahketupat);
        Button buttonKembali = findViewById(R.id.button_kembali);
        buttonKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BelahKetupatActivity.this, MainActivity.class);
                Toast.makeText(BelahKetupatActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }

    public void tombolhitungbelahketupat(View view) {
        String inputd1 = D1belahketupat.getText().toString();
        String inputd2 = D2belahketupat.getText().toString();
        if (TextUtils.isEmpty(inputd1) || TextUtils.isEmpty(inputd2)) {
            D1belahketupat.setError("Diagonal 1 Harus Diisi");
            D1belahketupat.requestFocus();
        } else if (TextUtils.isEmpty(inputd2) || TextUtils.isEmpty(inputd2)) {
            D2belahketupat.setError("Diagonal 2 Harus Diisi");
            D2belahketupat.requestFocus();
        } else {
            Double d1 = Double.parseDouble(inputd1);
            Double d2 = Double.parseDouble(inputd2);
            // Menghitung sisi belah ketupat
            Double sisi = Math.sqrt(Math.pow(d1 / 2, 2) + Math.pow(d2 / 2, 2));
            // Menghitung luas belah ketupat
            Double luas = (d1 * d2) / 2;
            // Menghitung keliling belah ketupat
            Double keliling = 4 * sisi;
            // Menampilkan hasil
            H1belahketupat.setText(keliling.toString());
            H2belahketupat.setText(luas.toString());
        }
    }
}