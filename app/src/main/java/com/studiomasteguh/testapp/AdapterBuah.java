package com.studiomasteguh.testapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class AdapterBuah extends ArrayAdapter {

    private Context context;
    private String[] namabuah;
    private int[] gambarbuah;

    // kik kanan + generate constructor
    public AdapterBuah(MainActivity context1, String[] namabuah, int[] gambarbuah) {
        super(context1,R.layout.item_buah, namabuah);
        this.context = context1;
        this.namabuah = namabuah;
        this.gambarbuah = gambarbuah;

    }

    // get View
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // atur layout item dengan layout inflater
        LayoutInflater layoutInflater;
        View view = LayoutInflater.from(context).inflate(R.layout.item_buah, parent, false);

        // findviewbyid setiap data yang ada di dalam item
        TextView tvnamabuah = view.findViewById(R.id.tv_nama_buah);
        ImageView imgbuah = view.findViewById(R.id.img_buah);

        // set data
        tvnamabuah.setText(namabuah[position]);
        imgbuah.setImageResource(gambarbuah[position]);

        return view;
    }
}
