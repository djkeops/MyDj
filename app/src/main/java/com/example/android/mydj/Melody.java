package com.example.android.mydj;

/**
 * Created by Adrian on 25.03.2018.
 * A list of the melodies available to the app.
 */

public class Melody {

    /**
     * Melody title
     */
    private String mMelodyTitle;

    /**
     * Melody singer
     */
    private String mMelodySinger;

    /**
     * Melody Logo Id
     */
    private int mMelodyLogoId;

    /**
     * Melody Res Id
     */
    private int mMelodyResId;

    /**
     * Create a new Melody object.
     *
     * @param melodyTitle  is the melody title
     * @param melodySinger is the melody singer
     */
    public Melody(String melodyTitle, String melodySinger, int melodyLogoId, int melodyResId) {
        mMelodyTitle = melodyTitle;
        mMelodySinger = melodySinger;
        mMelodyLogoId = melodyLogoId;
        mMelodyResId = melodyResId;
    }

    /**
     * Get the title of the Melody
     */
    public String getMelodyTitle() {
        return mMelodyTitle;
    }

    /**
     * Get the singer of the Melody
     */
    public String getMelodySinger() {
        return mMelodySinger;
    }

    /**
     * Get the the id of the logo from the drawable folder
     */
    public int getMelodyLogoId() {
        return mMelodyLogoId;
    }

    /**
     * Get the the id of the melody from the music folder
     */
    public int getMelodyResId() {
        return mMelodyResId;
    }

}
