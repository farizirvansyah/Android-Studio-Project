package com.example.uts_kantin_bluetizen.Helper;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.Toast;

import com.example.uts_kantin_bluetizen.Domain.FoodDomain;

import java.util.ArrayList;

public class ManagmentCart {

    private Context context;
    private TinyDB tinyDB;

    public ManagmentCart(Context context) {
        this.context = context;
        this.tinyDB = new TinyDB(context);
    }

    public void insertFood(FoodDomain item) {
        ArrayList<FoodDomain> listfood = getListCart();
        boolean existAlready = false;
        int n = 0;
        for (int y = 0; y < listfood.size(); y++) {
            if (listfood.get(y).getTitle().equals(item.getTitle())) {
                existAlready = true;
                n = y;
                break;
            }
        }
        if (existAlready) {
            listfood.get(n).setNumberinCart(item.getNumberinCart());
        } else {
            listfood.add(item);
        }
        tinyDB.putListObject("CartList", listfood);
        Toast.makeText(context, "Berhasil tambah ke keranjang", Toast.LENGTH_SHORT).show();
    }

    public ArrayList<FoodDomain> getListCart() {
        return tinyDB.getListObject("CartList");
    }

    public void minusNumberFood(ArrayList<FoodDomain> listfood, int position, ChangeNumberItemsListener changeNumberItemsListener) {
        if (listfood.get(position).getNumberinCart() == 1) {
            AlertDialog alertDialog = new AlertDialog.Builder(context).create();
            alertDialog.setTitle("Hapus Pesanan");
            alertDialog.setMessage("Apakah anda yakin ingin menghapus pesanan ini?");
            alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Ya", (dialog, which) -> {
                listfood.remove(position);
                tinyDB.putListObject("CartList", listfood);
                changeNumberItemsListener.changed();
            });
            alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Tidak", (dialog, which) -> {
                dialog.dismiss();
            });
            alertDialog.show();
        } else {
            listfood.get(position).setNumberinCart(listfood.get(position).getNumberinCart() - 1);
        }
        tinyDB.putListObject("CartList", listfood);
        changeNumberItemsListener.changed();
    }

    public void plusNumberFood(ArrayList<FoodDomain> listfood, int position, ChangeNumberItemsListener changeNumberItemsListener) {
        listfood.get(position).setNumberinCart(listfood.get(position).getNumberinCart() + 1);
        tinyDB.putListObject("CartList", listfood);
        changeNumberItemsListener.changed();
    }

    public Double getTotalFee() {
        ArrayList<FoodDomain> listfood2 = getListCart();
        double fee = 0;
        for (int i = 0; i < listfood2.size(); i++) {
            fee = fee + (listfood2.get(i).getPrice() * listfood2.get(i).getNumberinCart());
        }
        return fee;
    }

    public void ButtonOrder2() {
        tinyDB.clear();
        Toast.makeText(context, "Pesanan berhasil", Toast.LENGTH_SHORT).show();
        }
    }
