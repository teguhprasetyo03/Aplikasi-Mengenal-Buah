package com.studiomasteguh.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivityBuah extends AppCompatActivity {

    private static final String TAG = "DetailActivityBuah";

    TextView tvdetailbuah;
    ImageView imgdetailbuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buah);

        String namabuah = getIntent().getStringExtra(Konstanta.DATANAMABUAH);
        int gambarbuah = getIntent().getIntExtra(Konstanta.DATAGAMBARBUAH,0);

        // log 
        Log.d(TAG, "Nama : " +namabuah);
        Log.d(TAG, "Gambar : " +gambarbuah);

        tvdetailbuah = findViewById(R.id.tv_detail_nama_buah);
        imgdetailbuah = findViewById(R.id.img_detail_buah);

        tvdetailbuah.setText(namabuah);
        imgdetailbuah.setImageResource(gambarbuah);
    }
}
