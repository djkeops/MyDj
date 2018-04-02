package com.example.android.mydj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class GenresActivity extends AppCompatActivity implements GridView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);

        //Create an ArrayList of Genre objects
        ArrayList<Genre> genres = new ArrayList<Genre>();
        genres.add(new Genre(getString(R.string.electronic_genre), R.drawable.electronic));
        genres.add(new Genre(getString(R.string.disco_genre), R.drawable.disco));
        genres.add(new Genre(getString(R.string.pop_genre), R.drawable.pop));
        genres.add(new Genre(getString(R.string.latin_genre), R.drawable.latin));
        genres.add(new Genre(getString(R.string.rap_genre), R.drawable.rap));
        genres.add(new Genre(getString(R.string.rock_genre), R.drawable.rock));

        //Find the GridView object in the view hierarchy of the Activity.
        GridView gridView = (GridView) findViewById(R.id.genres_list);

        //Create an GenreAdapter with data source the above ArrayList<Genre>
        GenreAdapter adapter = new GenreAdapter(this, genres);

        //Make the GridView to use the GenreAdapter created above
        gridView.setAdapter(adapter);

        //Set OnItemClickListener on the GridView to identify the accessed item
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        //Find the TextView with the id genre_text
        TextView textView = (TextView) view.findViewById(R.id.genre_text);
        //Store the value of genre_text in a variable
        String genre = textView.getText().toString();

        //Intent that open the MelodiesActivity
        Intent openMelodiesActivity = new Intent(this, MelodiesActivity.class);

        //transfer the selected music genre to the MelodiesActivity
        openMelodiesActivity.putExtra("genre", genre);
        startActivity(openMelodiesActivity);
    }
}
