package com.example.a2211500141_aplikasiscorekeeper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    int mscore_1=0, mscore_2=0;
    TextView score_1, score_2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goalkeeper_01);
        score_1 =(TextView) findViewById(R.id.score_1);
        score_2 =(TextView) findViewById(R.id.score_2);
    }
    public void addscore_1(View view){
        mscore_1++;
        score_1.setText(String.valueOf(mscore_1));
    }
    public void addscore_2(View view){
        mscore_2++;
        score_2.setText(String.valueOf(mscore_2));
    }
    public void minusscore_1(View view){
        mscore_1--;
        score_1.setText(String.valueOf(mscore_1));
    }
    public void minusscore_2(View view){
        mscore_2--;
        score_2.setText(String.valueOf(mscore_2));
    }
}