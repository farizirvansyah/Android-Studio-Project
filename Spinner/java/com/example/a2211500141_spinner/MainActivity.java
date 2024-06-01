package com.example.a2211500141_spinner;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    Spinner spinnerku;
    TextView textku;
    ImageView imageku;
    String[] namahewan = {"cat","chicken","cow","horse","sheep"};
    int[] gambarhewan = {R.drawable.cat,R.drawable.chicken,R.drawable.cow,R.drawable.horse,R.drawable.sheep};
    int[] suarahewan = {R.raw.cat,R.raw.chicken,R.raw.cow,R.raw.horse,R.raw.sheep};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerku = (Spinner) findViewById(R.id.spnfariz);
        textku = (TextView) findViewById(R.id.textspn);
        imageku = (ImageView) findViewById(R.id.gbrspn);

        ArrayAdapter adapterhewan = new ArrayAdapter(this, android.R.layout.simple_spinner_item, namahewan);
        spinnerku.setAdapter(adapterhewan);
        spinnerku.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long id) {
                textku.setText(namahewan[i]);
                imageku.setImageResource(gambarhewan[i]);
                MediaPlayer suara = MediaPlayer.create(MainActivity.this, suarahewan[i]);
                suara.start();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
