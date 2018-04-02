package com.example.android.mydj;

/**
 * Created by Adrian on 24.03.2018.
 * A list of the genres available to the app.
 */

public class Genre {

    /**
     * Genre name
     */
    private String mGenreName;

    /**
     * Genre Logo Id
     */
    private int mGenreLogoId;

    /**
     * Create a new Genre object.
     *
     * @param genreName   is the name of the Genre
     * @param GenreLogoId is the id of the logo from the drawable folder
     */
    public Genre(String genreName, int GenreLogoId) {
        mGenreName = genreName;
        mGenreLogoId = GenreLogoId;
    }

    /**
     * Get the name of the Genre
     */
    public String getGenreName() {
        return mGenreName;
    }

    /**
     * Get the the id of the logo from the drawable folder
     */
    public int getGenreLogoId() {
        return mGenreLogoId;
    }
}
