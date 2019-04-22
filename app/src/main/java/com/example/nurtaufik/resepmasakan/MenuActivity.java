package com.example.nurtaufik.resepmasakan;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.selfproject.hotelreservation.R;

public class MenuActivity extends AppCompatActivity {
    ImageView ImageView1, ImageView2, ImageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ImageView1 = (ImageView) findViewById(R.id.utama);
        ImageView2 = (ImageView) findViewById(R.id.tentang);
        ImageView3 = (ImageView) findViewById(R.id.keluar);
        ImageView1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void btntentang(View v) {
        switch (v.getId()) {
            case R.id.tentang:
                new android.app.AlertDialog.Builder(this)
                        .setTitle("Resep Masakan")
                        .setMessage("Aplikasi ini dibuat oleh Hirzi Karami")
                        .setCancelable(false)
                        .setNegativeButton("OK", null)
                        .show();
                break;
            case R.id.keluar:
                new android.app.AlertDialog.Builder(this)
                        .setMessage("Apakah Kamu Yakin Ingin Keluar?")
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                MenuActivity.this.finish();
                            }
                        })
                        .setNegativeButton("Tidak", null)
                        .show();
        }
    }
}
