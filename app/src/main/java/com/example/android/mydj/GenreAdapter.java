package com.example.android.mydj;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Adrian on 24.03.2018.
 *
 * An ArrayAdapter that provide the layout for each genre
 */

public class GenreAdapter extends ArrayAdapter<Genre> {

    public GenreAdapter(Activity context, ArrayList<Genre> genres){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, genres);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View gridItemView = convertView;
        if(gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.genres_item_layout, parent, false);
        }

        // Get the Genre object located at this position in the list
        Genre currentGenre = getItem(position);

        //Find the ImageView in the genres_item_layout.xml with the id genre_logo
        ImageView genreLogo = (ImageView) gridItemView.findViewById(R.id.genre_logo);
        //Get the id of the logo from drawable folder for the current Genre object and
        //set this id on the src attribute of the ImageView
        genreLogo.setImageResource(currentGenre.getGenreLogoId());

        //Find the TextView in the genres_item_layout.xml with the id genre_text
        TextView genreName = (TextView) gridItemView.findViewById(R.id.genre_text);
        //Get the genre name for the current Genre object and
        //set this text on the TextView
        genreName.setText(currentGenre.getGenreName());

        // Return the whole list item layout (containing 1 ImageView and 1 TextView)
        // so that it can be shown in the GridView
        return gridItemView;
    }
}
