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

public class PersegiPanjangActivity extends Activity {
    EditText Ppersegipanjang, Lpersegipanjang;
    TextView H1persegipanjang, H2persegipanjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);
        Ppersegipanjang = findViewById(R.id.Ppersegipanjang);
        Lpersegipanjang = findViewById(R.id.Lpersegipanjang);
        H1persegipanjang = findViewById(R.id.H1persegipanjang);
        H2persegipanjang = findViewById(R.id.H2persegipanjang);
        Button buttonKembali = findViewById(R.id.button_kembali);
        buttonKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PersegiPanjangActivity.this, MainActivity.class);
                Toast.makeText(PersegiPanjangActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }

    public void tombolhitungpersegipanjang(View view) {
        String inputpanjang = Ppersegipanjang.getText().toString();
        String inputlebar = Lpersegipanjang.getText().toString();

        if (TextUtils.isEmpty(inputpanjang)) {
            Ppersegipanjang.setError("Panjang Harus Diisi");
            Ppersegipanjang.requestFocus();
        } else if (TextUtils.isEmpty(inputlebar)) {
            Lpersegipanjang.setError("Lebar Harus Diisi");
            Lpersegipanjang.requestFocus();
        } else {
            Double nilaipanjang = Double.parseDouble(inputpanjang);
            Double nilailebar = Double.parseDouble(inputlebar);
            Double hasilhitung1 = 2 * (nilaipanjang + nilailebar);
            Double hasilhitung2 = nilaipanjang * nilailebar;
            H1persegipanjang.setText(hasilhitung1.toString());
            H2persegipanjang.setText(hasilhitung2.toString());
        }
    }
}