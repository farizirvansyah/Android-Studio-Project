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

public class SegitigaActivity extends Activity {
    EditText Asegitiga, Tsegitiga;
    TextView H1segitiga, H2segitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        Asegitiga = findViewById(R.id.Asegitiga);
        Tsegitiga = findViewById(R.id.Tsegitiga);
        H1segitiga = findViewById(R.id.H1segitiga);
        H2segitiga = findViewById(R.id.H2segitiga);
        Button buttonKembali = findViewById(R.id.button_kembali);
        buttonKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SegitigaActivity.this, MainActivity.class);
                Toast.makeText(SegitigaActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }

    public void tombolhitungsegitiga(View view) {
        String inputalas = Asegitiga.getText().toString();
        String inputtinggi = Tsegitiga.getText().toString();
        if (TextUtils.isEmpty(inputalas)) {
            Asegitiga.setError("Alas Harus Diisi");
            Asegitiga.requestFocus();
        } else if (TextUtils.isEmpty(inputtinggi)) {
            Tsegitiga.setError("Tinggi Harus Diisi");
            Tsegitiga.requestFocus();
        } else {
            Double nilaialas = Double.parseDouble(inputalas);
            Double nilaitinggi = Double.parseDouble(inputtinggi);
            // Menghitung sisi miring
            Double sisi1 = nilaialas;
            Double sisi2 = nilaitinggi;
            Double sisi3 = Math.sqrt((nilaialas * nilaialas) + (nilaitinggi * nilaitinggi));
            // Menghitung keliling segitiga
            Double hasilhitung1 = sisi1 + sisi2 + sisi3;
            // Menghitung luas segitiga
            Double hasilhitung2 = 0.5 * nilaialas * nilaitinggi;
            H1segitiga.setText(hasilhitung1.toString());
            H2segitiga.setText(hasilhitung2.toString());
        }
    }
}