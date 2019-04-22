package com.example.nurtaufik.resepmasakan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.selfproject.hotelreservation.R;

public class MainActivity extends AppCompatActivity {
    public Button Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9, Button10;
    public static final String nama_masakan1 = "";
    public static final String nama_masakan2 = "";
    public static final String nama_masakan3 = "";
    public static final String nama_masakan4 = "";
    public static final String nama_masakan5 = "";
    public static final String nama_masakan6 = "";
    public static final String nama_masakan7 = "";
    public static final String nama_masakan8 = "";
    public static final String nama_masakan9 = "";
    public static final String nama_masakan10 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button1 =(Button)findViewById(R.id.btn1);
        Button2 = (Button) findViewById(R.id.btn2);
        Button3 = (Button) findViewById(R.id.btn3);
        Button4 = (Button) findViewById(R.id.btn4);
        Button5 = (Button) findViewById(R.id.btn5);
        Button6 = (Button) findViewById(R.id.btn6);
        Button7 = (Button) findViewById(R.id.btn7);
        Button8 = (Button) findViewById(R.id.btn8);
        Button9 = (Button) findViewById(R.id.btn9);
        Button10 = (Button) findViewById(R.id.btn10);


        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra(nama_masakan1,getString(R.string.judul_masakan1));
                startActivity(intent);
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra(nama_masakan2,getString(R.string.judul_masakan2));
                startActivity(intent);
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra(nama_masakan3,getString(R.string.judul_masakan3));
                startActivity(intent);
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra(nama_masakan4,getString(R.string.judul_masakan4));
                startActivity(intent);
            }
        });

        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra(nama_masakan5,getString(R.string.judul_masakan5));
                startActivity(intent);
            }
        });

        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra(nama_masakan6,getString(R.string.judul_masakan6));
                startActivity(intent);
            }
        });

        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra(nama_masakan7,getString(R.string.judul_masakan7));
                startActivity(intent);
            }
        });

        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra(nama_masakan8,getString(R.string.judul_masakan8));
                startActivity(intent);
            }
        });

        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra(nama_masakan9,getString(R.string.judul_masakan9));
                startActivity(intent);
            }
        });

        Button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra(nama_masakan10,getString(R.string.judul_masakan10));
                startActivity(intent);
            }
        });
    }
}


