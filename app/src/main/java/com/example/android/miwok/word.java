package com.example.android.miwok;

import android.media.Image;

/**
 * Created by Admin on 31-Oct-16.
 */

public class word {
    private String mEnglish;
    private String mMiwok;
    private  int mAudioResourceId;
    private int mImage;
    public word(String Miwok, String English, int Image,int audioResourceId){
        mEnglish=English;
        mMiwok=Miwok;
        mImage=Image;
        mAudioResourceId=audioResourceId;
    }
    public String getEnglishWord(){
        return mEnglish;
    }
    public String getMiwokWord(){
        return mMiwok;
    }

    public int getImage() {
        return mImage;
    }

    public int getAudioResourceId(){
        return mAudioResourceId;
    }

}
