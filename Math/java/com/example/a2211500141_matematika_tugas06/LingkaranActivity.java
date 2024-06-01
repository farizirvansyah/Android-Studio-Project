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

public class LingkaranActivity extends Activity {
    EditText Dlingkaran, JJlingkaran;
    TextView H1lingkaran, H2lingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        Dlingkaran = findViewById(R.id.Dlingkaran);
        JJlingkaran = findViewById(R.id.JJlingkaran);
        H1lingkaran = findViewById(R.id.H1lingkaran);
        H2lingkaran = findViewById(R.id.H2lingkaran);
        Button buttonKembali = findViewById(R.id.button_kembali);
        buttonKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LingkaranActivity.this, MainActivity.class);
                Toast.makeText(LingkaranActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }

    public void tombolhitunglingkaran(View view) {
        String inputdiameter = Dlingkaran.getText().toString();
        String inputjarijari = JJlingkaran.getText().toString();

        if (TextUtils.isEmpty(inputdiameter) && TextUtils.isEmpty(inputjarijari)) {
            Dlingkaran.setError("Diameter atau Jari-jari harus diisi");
            Dlingkaran.requestFocus();
            JJlingkaran.setError("Diameter atau Jari-jari harus diisi");
            JJlingkaran.requestFocus();
        } else {
            double nilaiDiameter = TextUtils.isEmpty(inputdiameter) ? 0 : Double.parseDouble(inputdiameter);
            double nilaiJariJari = TextUtils.isEmpty(inputjarijari) ? 0 : Double.parseDouble(inputjarijari);
            double hasilhitung1;
            double hasilhitung2;
            if (nilaiDiameter != 0) {
                // Menghitung menggunakan diameter
                double nilaiJariJariDariDiameter = nilaiDiameter / 2;
                hasilhitung1 = 2 * Math.PI * nilaiJariJariDariDiameter;
                hasilhitung2 = Math.PI * nilaiDiameter;
            } else {
                // Menghitung menggunakan jari-jari
                hasilhitung1 = 2 * Math.PI * nilaiJariJari;
                hasilhitung2 = Math.PI * Math.pow(nilaiJariJari, 2);
            }
            H1lingkaran.setText(String.valueOf(hasilhitung1));
            H2lingkaran.setText(String.valueOf(hasilhitung2));
        }
    }
}