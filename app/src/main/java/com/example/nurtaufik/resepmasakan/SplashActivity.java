package com.example.nurtaufik.resepmasakan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.os.Handler;
import android.os.Bundle;


import com.selfproject.hotelreservation.R;

public class SplashActivity extends AppCompatActivity {

    private static int progress = 0;
    private int status = 0;
    ProgressBar progressBar;
    Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        progressBar =(ProgressBar)findViewById(R.id.progressBar1);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(status<100){
                    status = loading();
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setProgress(status);
                        }
                    });
                }
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Intent pindah = new Intent(SplashActivity.this,MenuActivity.class);
                        startActivity(pindah);
                        finish();
                    }
                });

            }
            public int loading(){
                try{
                    Thread.sleep(50);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
                return ++progress;
            }

        }).start();
    }


}
