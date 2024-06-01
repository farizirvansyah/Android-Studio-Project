package com.example.a2211500141_matematika_tugas06;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void persegipanjang(View view) {
        AlertDialog.Builder persegipanjangalert = new AlertDialog.Builder(MainActivity.this);
        persegipanjangalert.setMessage("Apakah Anda ingin menghitung Persegi Panjang");
        persegipanjangalert.setTitle("Persegi Panjang");
        persegipanjangalert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, PersegiPanjangActivity.class));
            }
        });
        persegipanjangalert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });
        persegipanjangalert.create().show();
    }

    public void bujursangkar(View view) {
        AlertDialog.Builder bujursangkaralert = new AlertDialog.Builder(MainActivity.this);
        bujursangkaralert.setMessage("Apakah Anda ingin menghitung Bujur Sangkar");
        bujursangkaralert.setTitle("Bujur Sangkar");
        bujursangkaralert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, BujurSangkarActivity.class));
            }
        });
        bujursangkaralert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });
        bujursangkaralert.create().show();
    }

    public void segitiga(View view) {
        AlertDialog.Builder segitigaalert = new AlertDialog.Builder(MainActivity.this);
        segitigaalert.setMessage("Apakah Anda ingin menghitung Segitiga");
        segitigaalert.setTitle("Segitiga");
        segitigaalert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, SegitigaActivity.class));
            }
        });
        segitigaalert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });
        segitigaalert.create().show();
    }

    public void lingkaran(View view) {
        AlertDialog.Builder lingkaranalert = new AlertDialog.Builder(MainActivity.this);
        lingkaranalert.setMessage("Apakah Anda ingin menghitung Lingkaran");
        lingkaranalert.setTitle("Persegi Panjang");
        lingkaranalert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, LingkaranActivity.class));
            }
        });
        lingkaranalert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });
        lingkaranalert.create().show();
    }

    public void belahketupat(View view) {
        AlertDialog.Builder belahketupatalert = new AlertDialog.Builder(MainActivity.this);
        belahketupatalert.setMessage("Apakah Anda ingin menghitung Belah Ketupat");
        belahketupatalert.setTitle("Bujur Sangkar");
        belahketupatalert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, BelahKetupatActivity.class));
            }
        });
        belahketupatalert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });
        belahketupatalert.create().show();
    }

    public void layanglayang(View view) {
        AlertDialog.Builder layanglayangalert = new AlertDialog.Builder(MainActivity.this);
        layanglayangalert.setMessage("Apakah Anda ingin menghitung Layang-layang");
        layanglayangalert.setTitle("Layang-layang");
        layanglayangalert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, LayangLayangActivity.class));
            }
        });
        layanglayangalert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });
        layanglayangalert.create().show();
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder tombolkeluar = new AlertDialog.Builder(MainActivity.this);
        tombolkeluar.setMessage("Apakah Anda Yakin Ingin Keluar Dari Aplikasi ini? ");
        tombolkeluar.setTitle("Keluar Aplikasi");
        tombolkeluar.setIcon(R.drawable.baseline_exit_to_app_24);
        tombolkeluar.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                finishAffinity();
            }
        });
        tombolkeluar.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        tombolkeluar.setNeutralButton("Batal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Fariz Irvansyah", Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });
        tombolkeluar.show();
    }
}