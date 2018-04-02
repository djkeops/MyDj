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
 * Created by Adrian on 25.03.2018.
 * <p>
 * An ArrayAdapter that provide the layout for each melody
 */

public class MelodyAdapter extends ArrayAdapter<Melody> {

    public MelodyAdapter(Activity context, ArrayList<Melody> melodies) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, melodies);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.melodies_item_layout, parent, false);
        }

        // Get the Genre object located at this position in the list
        Melody currentMelody = getItem(position);

        //Find the ImageView in the melodies_item_layout.xml with the id melody_logo
        ImageView melodyLogo = (ImageView) listItemView.findViewById(R.id.melody_logo);
        //Get the id of the logo from drawable folder for the current Melody object and
        //set this id on the src attribute of the ImageView
        melodyLogo.setTag(currentMelody.getMelodyLogoId());
        melodyLogo.setImageResource(currentMelody.getMelodyLogoId());

        //Find the TextView in the melodies_item_layout.xml with the id melody_title_text
        TextView melodyTitle = (TextView) listItemView.findViewById(R.id.melody_title_text);
        //Get the melody title for the current Melody object and
        //set this text on the TextView
        melodyTitle.setText(currentMelody.getMelodyTitle());

        //Find the TextView in the melodies_item_layout.xml with the id melody_singer_text
        TextView melodySinger = (TextView) listItemView.findViewById(R.id.melody_singer_text);
        //Get the melody singer for the current Melody object and
        //set this text on the TextView
        melodySinger.setText(currentMelody.getMelodySinger());

        // Return the whole list item layout (containing 1 ImageView and 2 TextViews)
        // so that it can be shown in the GridView
        return listItemView;
    }
}
