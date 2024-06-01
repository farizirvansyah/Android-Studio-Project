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

public class LayangLayangActivity extends Activity {
    EditText D1layanglayang, D2layanglayang;
    TextView H1layanglayang, H2layanglayang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layang_layang);
        D1layanglayang = findViewById(R.id.D1layanglayang);
        D2layanglayang = findViewById(R.id.D2layanglayang);
        H1layanglayang = findViewById(R.id.H1layanglayang);
        H2layanglayang = findViewById(R.id.H2layanglayang);
        Button buttonKembali = findViewById(R.id.button_kembali);
        buttonKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LayangLayangActivity.this, MainActivity.class);
                Toast.makeText(LayangLayangActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }

    public void tombolhitunglayanglayang(View view) {
        String inputd1 = D1layanglayang.getText().toString();
        String inputd2 = D2layanglayang.getText().toString();
        if (TextUtils.isEmpty(inputd1)) {
            D1layanglayang.setError("Diagonal 1 Harus Diisi");
            D1layanglayang.requestFocus();
        } else if (TextUtils.isEmpty(inputd2)) {
            D2layanglayang.setError("Diagonal 2 Harus Diisi");
            D2layanglayang.requestFocus();
        } else {
            Double nilaid1 = Double.parseDouble(inputd1);
            Double nilaid2 = Double.parseDouble(inputd2);
            // Menghitung sisi miring
            double sisi1 = nilaid1 / 2;
            double sisi2 = nilaid2 / 2;
            // Menghitung keliling layang-layang
            double hasilhitung1 = 2 * Math.sqrt((sisi1 * sisi1) + (sisi2 * sisi2));
            // Menghitung luas layang-layang
            double hasilhitung2 = (nilaid1 * nilaid2) / 2;
            H1layanglayang.setText(String.valueOf(hasilhitung1));
            H2layanglayang.setText(String.valueOf(hasilhitung2));
        }
    }
}