package com.example.cct461firstassignment;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    ImageButton btnPlay;
    ImageButton btnPause;
    ImageButton Travisbtn;
    MediaPlayer mediaPlayer;
    Button btnBack;
    private boolean isPlaying = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        hompage();

    }

    public void hompage(){
        setContentView(R.layout.homepage);


        Travisbtn = findViewById(R.id.btnTravis);

        Travisbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player();
            }
        });
    }

    public void player(){

        setContentView(R.layout.activity_main);

        btnPlay = findViewById(R.id.btnPlay);
        btnPause = findViewById(R.id.btnPause);
        btnBack = findViewById(R.id.btnBack);

        mediaPlayer = MediaPlayer.create(this,R.raw.travisscott);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayer.start();

            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();


            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
                hompage();
            }
        });

    }

}

