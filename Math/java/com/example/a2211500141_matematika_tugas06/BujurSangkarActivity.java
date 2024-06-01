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

public class BujurSangkarActivity extends Activity {
    EditText Pbujursangkar;
    TextView H1bujursangkar, H2bujursangkar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bujur_sangkar);
        Pbujursangkar = findViewById(R.id.Pbujursangkar);
        H1bujursangkar = findViewById(R.id.H1bujursangkar);
        H2bujursangkar = findViewById(R.id.H2bujursangkar);
        Button buttonKembali = findViewById(R.id.button_kembali);
        buttonKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BujurSangkarActivity.this, MainActivity.class);
                Toast.makeText(BujurSangkarActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }

    public void tombolhitungbujursangkar(View view) {
        String inputpanjang = Pbujursangkar.getText().toString();

        if (TextUtils.isEmpty(inputpanjang)) {
            Pbujursangkar.setError("Panjang Harus Diisi");
            Pbujursangkar.requestFocus();
        } else {
            Double nilaipanjang = Double.parseDouble(inputpanjang);
            Double hasilhitung1 = 4 * nilaipanjang;
            Double hasilhitung2 = nilaipanjang * nilaipanjang;
            H1bujursangkar.setText(hasilhitung1.toString());
            H2bujursangkar.setText(hasilhitung2.toString());
        }
    }
}