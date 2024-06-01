package com.example.a2211500141_intent;
import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    Button explicitintent;
    Button implicitintent;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicitintent = (Button)findViewById(R.id.explicit);
        explicitintent.setOnClickListener(this);
        implicitintent = (Button)findViewById(R.id.implicit);
        implicitintent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.explicit) {
            Intent explicit = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(explicit);
        } else if (id == R.id.implicit) {
            Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.id/"));
            startActivity(implicit);
        }
    }
}
