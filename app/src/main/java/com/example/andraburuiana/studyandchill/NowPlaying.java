package com.example.andraburuiana.studyandchill;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlaying extends AppCompatActivity {
    public class MainActivity extends AppCompatActivity {
        Button play;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            play = (Button) findViewById(R.id.button);
            final MediaPlayer mP = MediaPlayer.create(com.example.andraburuiana.studyandchill.NowPlaying.this, R.raw.mozart);
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mP.isPlaying()) {
                        mP.pause();
                        play.setBackgroundResource(R.drawable.play);
                    } else {
                        mP.start();
                        play.setBackgroundResource(R.drawable.pause);
                    }
                }
            });
        }

    }
}