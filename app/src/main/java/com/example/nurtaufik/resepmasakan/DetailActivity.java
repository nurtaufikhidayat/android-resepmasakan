package com.example.nurtaufik.resepmasakan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.selfproject.hotelreservation.R;


public class DetailActivity extends AppCompatActivity {

    private TextView txCost, txTitle, txLocation, txRating, resep, cara;
    private ImageView image;
    private Button btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        resep = (TextView)findViewById(R.id.resep);
        cara = (TextView)findViewById(R.id.cara);
        txTitle = (TextView)findViewById(R.id.title);
        image = (ImageView) findViewById(R.id.image);

        if(getString(R.string.judul_masakan1).equals(getIntent().getStringExtra(MainActivity.nama_masakan1))){
            image.setImageResource(R.drawable.sate_lilit_bali);
            txTitle.setText(getString(R.string.judul_masakan1));
            resep.setText(getString(R.string.resep_masakan1));
            cara.setText(getString(R.string.cara_masakan1));

        }
        else if(getString(R.string.judul_masakan2).equals(getIntent().getStringExtra(MainActivity.nama_masakan2))){
            image.setImageResource(R.drawable.mie_goreng_jawa);
            txTitle.setText(getString(R.string.judul_masakan2));
            resep.setText(getString(R.string.resep_maskanan2));
            cara.setText(getString(R.string.cara_masakan2));

        }
        else if(getString(R.string.judul_masakan3).equals(getIntent().getStringExtra(MainActivity.nama_masakan3))){
            image.setImageResource(R.drawable.ayam_goreng_kalasan);
            txTitle.setText(getString(R.string.judul_masakan3));
            resep.setText(getString(R.string.resep_masakan3));
            cara.setText(getString(R.string.cara_masakan3));


        }
        else if(getString(R.string.judul_masakan4).equals(getIntent().getStringExtra(MainActivity.nama_masakan4))){
            image.setImageResource(R.drawable.gado_gado_sayur_sederhana);
            txTitle.setText(getString(R.string.judul_masakan4));
            resep.setText(getString(R.string.resep_masakan4));
            cara.setText(getString(R.string.cara_masakan4));
        }
        else if(getString(R.string.judul_masakan5).equals(getIntent().getStringExtra(MainActivity.nama_masakan5))){
            image.setImageResource(R.drawable.lotek_cirebon);
            txTitle.setText(getString(R.string.judul_masakan5));
            resep.setText(getString(R.string.resep_masakan5));
            cara.setText(getString(R.string.cara_masakan5));

        }
        else if(getString(R.string.judul_masakan6).equals(getIntent().getStringExtra(MainActivity.nama_masakan6))){
            image.setImageResource(R.drawable.ayam_goreng_praktis);
            txTitle.setText(getString(R.string.judul_masakan6));
            resep.setText(getString(R.string.resep_masakan6));
            cara.setText(getString(R.string.cara_masakan6));

        }
        else if(getString(R.string.judul_masakan7).equals(getIntent().getStringExtra(MainActivity.nama_masakan7))){
            image.setImageResource(R.drawable.sate_padang);
            txTitle.setText(getString(R.string.judul_masakan7));
            resep.setText(getString(R.string.resep_masakan7));
            cara.setText(getString(R.string.cara_masakan7));

        }
        else if(getString(R.string.judul_masakan8).equals(getIntent().getStringExtra(MainActivity.nama_masakan8))){
            image.setImageResource(R.drawable.soto_jogja);
            txTitle.setText(getString(R.string.judul_masakan8));
            resep.setText(getString(R.string.resep_masakan8));
            cara.setText(getString(R.string.cara_masakan8));

        }
        else if(getString(R.string.judul_masakan9).equals(getIntent().getStringExtra(MainActivity.nama_masakan9))){
            image.setImageResource(R.drawable.mie_godog_jawa);
            txTitle.setText(getString(R.string.judul_masakan9));
            resep.setText(getString(R.string.resep_masakan9));
            cara.setText(getString(R.string.cara_masakan9));

        }
        else if(getString(R.string.judul_masakan10).equals(getIntent().getStringExtra(MainActivity.nama_masakan10))){
            image.setImageResource(R.drawable.sup_ayam_kampung_kuah_bening);
            txTitle.setText(getString(R.string.judul_masakan10));
            resep.setText(getString(R.string.resep_masakan10));
            cara.setText(getString(R.string.cara_masakan10));

        }
    }
}
