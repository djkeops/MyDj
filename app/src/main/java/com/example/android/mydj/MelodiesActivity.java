package com.example.android.mydj;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MelodiesActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener {

    //Initialize variables
    private String selectedGenre;
    private String nowPMelodyTitle;
    private String nowPMmelodySinger;
    private int melodyLogoId;

    //Initialize Views
    private LinearLayout nowPlayingMelody;
    private ImageButton genresButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_melodies);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            selectedGenre = bundle.getString("genre");
        }
        createPlaylist();
    }

    public void createPlaylist() {

        //Create an ArrayList of Melody objects
        ArrayList<Melody> melodies = new ArrayList<Melody>();

        //Depending on the user's choice by genre, the Melody objects are created
        //All melodies images are from http://www.shazam.com
        if (selectedGenre.equals(getString(R.string.electronic_genre))) {
            melodies.add(new Melody("Like I Do", "David Guetta, Martin Garrix & Brooks", R.drawable.david_guetta__martin_garrix___brooks_like_i_do, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Breathe", "Jax Jones Feat. Ina Wroldsen", R.drawable.jax_jones_ft__ina_wroldsen_breathe, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("The Middle", "Zedd, Maren Morris & Grey", R.drawable.zedd__maren_morris___grey___the_middle, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Drunk Groove", "Maruv & Boosin", R.drawable.maruv___boosin___drunk_groove, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Katchi", "Ofenbach vs. Nick Waterhouse", R.drawable.ofenbach_vs__nick_waterhouse___katchi, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Mad Love", "Sean Paul & David Guetta Feat. Becky G", R.drawable.sean_paul___david_guetta_feat__becky_g___mad_love, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Cola", "CamelPhat & Elderbrook", R.drawable.camelphat___elderbrook___cola, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Crazy", "Lost Frequencies & Zonderling", R.drawable.lost_frequencies___zonderling___crazy, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Best Friend", "Sofi Tukker", R.drawable.sofi_tukker___best_friend, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Dooset Daram", "Arash Feat. Helena", R.drawable.arash_feat__helena___dooset_daram, R.raw.jax_jones_ft__ina_wroldsen_breathe));
        } else if (selectedGenre.equals(getString(R.string.disco_genre))) {
            melodies.add(new Melody("Back In My Life", "Alice DeeJay", R.drawable.alice_deejay___back_in_my_life, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Mr Vain", "Culture Beat", R.drawable.culture_beat___mr_vain, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Be My Lover", "La Bouche", R.drawable.la_bouche___be_my_lover, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("U Can't Touch This", "Mc Hammer", R.drawable.mc_hammer___u_can_t_touch_this, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Coco Jambo", "Mr President", R.drawable.mr_president___coco_jambo, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Scatman", "Scatman John", R.drawable.scatman_john___scatman, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Rame", "Snap", R.drawable.snap___rame, R.raw.jax_jones_ft__ina_wroldsen_breathe));
        } else if (selectedGenre.equals(getString(R.string.latin_genre))) {
            melodies.add(new Melody("Livin La Vida Loca", "Ricky Martin", R.drawable.ricky_martin___livin_la_vida_loca, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Sway", "Shaft", R.drawable.shaft___sway, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Conga", "Gloria Estefan & Miami Sound Machine", R.drawable.gloria_estefan___miami_sound_machine___conga, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Mambo No5", "Lou Bega", R.drawable.lou_bega___mambo_no5, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("The Ketchup Song", "Las Ketchups", R.drawable.las_ketchups___the_ketchup_song, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Carnaval de Paris", "Dario G", R.drawable.dario_g___carnaval_de_paris, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Oye Como Va", "Tito Puente", R.drawable.tito_puente___oye_como_va, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Lambada", "Kaoma", R.drawable.kaoma___lambada, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("La Bamba", "Los Lobos", R.drawable.los_lobos___la_bamba, R.raw.jax_jones_ft__ina_wroldsen_breathe));
        } else if (selectedGenre.equals(getString(R.string.pop_genre))) {
            melodies.add(new Melody("Speed Of Sound", "Coldplay", R.drawable.coldplay___speed_of_sound, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Smile", "Lily Allen", R.drawable.lily_allen___smile, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Put Your Records On", "Corinne Bailey Rae", R.drawable.corinne_bailey_rae___put_your_records_on, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Love Me Like You", "The Magic Numbers", R.drawable.the_magic_numbers___love_me_like_you, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("See It In A Boy's Eyes", "Jamelia", R.drawable.jamelia___see_it_in_a_boy_s_eyes, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Super Duper Love", "Joss Stone", R.drawable.joss_stone___super_duper_love, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Love Doesn't Have To Hurt", "Atomic Kitten", R.drawable.atomic_kitten___love_doesn_t_have_to_hurt, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Four Minute Warning", "Mark Owen", R.drawable.mark_owen___four_minute_warning, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Long Distance", "Turin Brakes", R.drawable.turin_brakes___long_distance, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("There Goes The Fear", "Doves", R.drawable.doves___there_goes_the_fear, R.raw.jax_jones_ft__ina_wroldsen_breathe));
        } else if (selectedGenre.equals(getString(R.string.rap_genre))) {
            melodies.add(new Melody("California Love", "2Pac ", R.drawable.s_2pac____california_love, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("In Da Club", "50 Cent", R.drawable.s_50_cent___in_da_club, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Gimme Some More", "Busta Rhymes", R.drawable.busta_rhymes___gimme_some_more, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Still D.R.E.", "Dr. Dre & Snoop Dogg", R.drawable.dr__dre___snoop_dogg___still_d_r_e, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Gin And Juice", "Snoop Dogg", R.drawable.snoop_dogg___gin_and_juice, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("The Next Episode", "Dr. Dre", R.drawable.dr__dre___the_next_episode, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Fu-Gee-La", "The Fugees", R.drawable.the_fugees___fu_gee_la, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("X", "Xzibit", R.drawable.xzibit___x, R.raw.jax_jones_ft__ina_wroldsen_breathe));
        } else if (selectedGenre.equals(getString(R.string.rock_genre))) {
            melodies.add(new Melody("Stairway To Heaven", "Led Zeppelin", R.drawable.led_zeppelin___stairway_to_heaven, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Purple Haze", "Jimi Hendrix", R.drawable.jimi_hendrix___purple_haze, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Bohemian Rhapsody", "Queen", R.drawable.queen___bohemian_rhapsody, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Sweet Emotion", "Aerosmith", R.drawable.aerosmith___sweet_emotion, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Enter Sandman", "Metallica", R.drawable.metallica___enter_sandman, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Welcome To The Jungle", "Guns N' Roses", R.drawable.guns_n__roses___welcome_to_the_jungle, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Cocaine", "Eric Clapton", R.drawable.eric_clapton___cocaine, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Break On Through", "The Doors", R.drawable.the_doors___break_on_through, R.raw.jax_jones_ft__ina_wroldsen_breathe));
            melodies.add(new Melody("Satisfaction", "Rolling Stones", R.drawable.rolling_stones___satisfaction, R.raw.jax_jones_ft__ina_wroldsen_breathe));
        }

        //Find the ListView object in the view hierarchy of the Activity.
        ListView listView = (ListView) findViewById(R.id.melodies_list);

        //Create an MelodyAdapter with data source the above ArrayList<Melody>
        MelodyAdapter adapter = new MelodyAdapter(this, melodies);

        //Make the GridView to use the GenreAdapter created above
        listView.setAdapter(adapter);

        //Set OnItemClickListener on the GridView to identify the accessed item
        listView.setOnItemClickListener(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                //get extras from GenresActivity and from PlayerActivity
                Bundle bundle = data.getExtras();
                if (bundle != null) {
                    selectedGenre = bundle.getString("genre");
                    nowPMelodyTitle = bundle.getString("melodyTitle");
                    nowPMmelodySinger = bundle.getString("melodySinger");
                    displayNowPlayingMelody();
                }
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Write your code if there's no result
                Bundle bundle = getIntent().getExtras();
                if (bundle != null) {
                    selectedGenre = bundle.getString("genre");
                }
            }
        }
    }


    public void displayNowPlayingMelody() {

        //Find the components of the nowPlayingLayout
        TextView nowPlayingMelodyTitle = (TextView) findViewById(R.id.now_playing_melody_title);
        TextView nowPlayingMelodySinger = (TextView) findViewById(R.id.now_playing_melody_singer);
        RelativeLayout nowPlayingLayout = (RelativeLayout) findViewById(R.id.now_playing_layout);
        nowPlayingMelody = (LinearLayout) findViewById(R.id.now_playing_melody);
        genresButton = (ImageButton) findViewById(R.id.genres_button);

        //Display nowPlayingLayout if a melody is playing
        if (nowPMelodyTitle != null && nowPMmelodySinger != null) {
            nowPlayingLayout.setVisibility(View.VISIBLE);
            nowPlayingMelody.setOnClickListener(this);
            genresButton.setOnClickListener(this);
            nowPlayingMelodyTitle.setText(nowPMelodyTitle);
            nowPlayingMelodySinger.setText(nowPMmelodySinger);
        } else {
            nowPlayingLayout.setVisibility(View.GONE);
        }
    }

    //Depending on the clicked item from the playlist starts the PlayerActivity
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        //Find the TextView with the id melody_title_text
        TextView melodyTitleView = (TextView) view.findViewById(R.id.melody_title_text);
        //Store the value of melody_title_text in a variable
        String melodyTitle = melodyTitleView.getText().toString();

        //Find the TextView with the id melody_singer_text
        TextView melodySingerView = (TextView) view.findViewById(R.id.melody_singer_text);
        //Store the value of melody_singer_text in a variable
        String melodySinger = melodySingerView.getText().toString();

        //Find the ImageView with the id melody_logo
        ImageView melodyLogoView = (ImageView) view.findViewById(R.id.melody_logo);

        //Store the tag value in a variable
        melodyLogoId = (int) melodyLogoView.getTag();

        //Intent that open the MelodiesActivity
        Intent openPlayerActivity = new Intent(this, PlayerActivity.class);
        Bundle extras = new Bundle();
        extras.putString("genre", selectedGenre);
        extras.putString("melodyTitle", melodyTitle);
        extras.putString("melodySinger", melodySinger);
        extras.putInt("melodyLogoId", melodyLogoId);

        //transfer the selected music genre to the MelodiesActivity
        openPlayerActivity.putExtras(extras);
        startActivityForResult(openPlayerActivity, 1);
    }

    @Override
    public void onClick(View view) {

        //If the LinearLayout with now playing melody is clicked starts the PlayerActivity
        if (view.equals(nowPlayingMelody)) {
            Intent openPlayerActivity = new Intent(this, PlayerActivity.class);
            Bundle extras = new Bundle();
            extras.putString("genre", selectedGenre);
            extras.putString("melodyTitle", nowPMelodyTitle);
            extras.putString("melodySinger", nowPMmelodySinger);
            extras.putInt("melodyLogoId", melodyLogoId);
            extras.putBoolean("isPlaying", true);

            //transfer the selected music genre to the MelodiesActivity
            openPlayerActivity.putExtras(extras);
            startActivityForResult(openPlayerActivity, 1);

        }
        //If the genresButton is clicked the user is returned to the GenresActivity
        else if (view.equals(genresButton)) {
            super.onBackPressed();
        }
    }
}
