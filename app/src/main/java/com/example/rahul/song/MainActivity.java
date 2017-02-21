package com.example.rahul.song;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ToggleButton tb;
    boolean play = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 /*       final Button play = (Button) findViewById(R.id.button1);
        Button pause = (Button) findViewById(R.id.button2);
        Button stop = (Button) findViewById(R.id.button3);
      */
        tb=(ToggleButton)findViewById(R.id.togglebutton);

        final MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.nd);

        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tb.isChecked()) {
                    mp.start();
                } else {
                    mp.pause();
                }
            }
        });




    }
}
     /*   mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {

                mp.start();


                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (play) {


                            mp.start();

                            imageView.setImageResource(R.drawable.ic_play_arrow_black_24dp);

                            play = false;


                        } else {

                            imageView.setImageResource(R.drawable.ic_pause_black_24dp);
                            mp.pause();
                            play = true;
                        }
                    }
                });
            }

        });*/









        /*play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.stop();
                MainActivity.this.finish();
            }
        });

    }*/


