package com.example.android.mydj;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayerActivity extends AppCompatActivity implements View.OnClickListener {

    //Initialize variables
    private String selectedGenre;
    private int melodyLogoId;
    private String melodyTitle;
    private String melodySinger;
    private boolean isPlaying;

    //Initialize Views
    private ImageView melodyLogoImageView;
    private TextView melodyTitleTextView;
    private TextView melodySingerTextView;

    //Initialize Controls
    private ImageButton playPauseButton;
    private ImageButton stopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        Bundle extras = getIntent().getExtras();

        selectedGenre = extras.getString("genre");
        melodyLogoId = extras.getInt("melodyLogoId");
        melodyTitle = extras.getString("melodyTitle");
        melodySinger = extras.getString("melodySinger");
        isPlaying = extras.getBoolean("isPlaying");

        // Get Views Id
        melodyLogoImageView = (ImageView) findViewById(R.id.melody_logo);
        melodyTitleTextView = (TextView) findViewById(R.id.melody_title_text);
        melodySingerTextView = (TextView) findViewById(R.id.melody_singer_text);

        // Get Controls Id
        playPauseButton = (ImageButton) findViewById(R.id.play_pause_button);
        stopButton = (ImageButton) findViewById(R.id.stop_button);

        //Display melody details
        settingMelodyDetails();

        //Set OnClickListener on Controls
        playPauseButton.setOnClickListener(this);
        stopButton.setOnClickListener(this);

        //help to handle play pause button behavior until I implement MediaPlayer
    }

    //setting and displaying melody details
    public void settingMelodyDetails() {
        melodyLogoImageView.setImageResource(melodyLogoId);
        melodyTitleTextView.setText(melodyTitle);
        melodySingerTextView.setText(melodySinger);
        if (isPlaying) {
            playPauseButton.setBackgroundResource(R.drawable.pause_circle_outline_black_24dp);
            playPauseButton.setTag(R.drawable.pause_circle_outline_black_24dp);
        } else {
            playPauseButton.setTag(R.drawable.play_circle_outline_black_24dp);
        }
    }

    @Override
    public void onClick(View view) {
        if (view.equals(playPauseButton)) {
            if (playPauseButton.getTag().equals(R.drawable.play_circle_outline_black_24dp)) {
                playPauseButton.setBackgroundResource(R.drawable.pause_circle_outline_black_24dp);
                playPauseButton.setTag(R.drawable.pause_circle_outline_black_24dp);
            } else {
                playPauseButton.setBackgroundResource(R.drawable.play_circle_outline_black_24dp);
                playPauseButton.setTag(R.drawable.play_circle_outline_black_24dp);
            }
        } else if (view.equals(stopButton)) {
            if (playPauseButton.getTag().equals(R.drawable.pause_circle_outline_black_24dp)) {
                playPauseButton.setBackgroundResource(R.drawable.play_circle_outline_black_24dp);
                playPauseButton.setTag(R.drawable.play_circle_outline_black_24dp);
            }
        }
    }

    @Override
    public void onBackPressed() {

        //Intent that retains now playing melody
        Intent retainNowPlayingMelody = new Intent();
        Bundle nowPlayingExtras = new Bundle();

        if (playPauseButton.getTag().equals(R.drawable.pause_circle_outline_black_24dp)) {

            //put in the bundle the melody title, singer and selected music genre
            nowPlayingExtras.putString("genre", selectedGenre);
            nowPlayingExtras.putString("melodyTitle", melodyTitle);
            nowPlayingExtras.putString("melodySinger", melodySinger);

            //transfer the extras to the MelodiesActivity
            retainNowPlayingMelody.putExtras(nowPlayingExtras);

            setResult(Activity.RESULT_OK, retainNowPlayingMelody);
            finish();
        } else {
            //put in the bundle the selected music genre
            nowPlayingExtras.putString("genre", selectedGenre);
            //transfer the extras to the MelodiesActivity
            retainNowPlayingMelody.putExtras(nowPlayingExtras);

            setResult(Activity.RESULT_OK, retainNowPlayingMelody);
            finish();
        }

    }
}
