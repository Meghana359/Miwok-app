package com.example.android.miwok;

/**
 * Created by Admin on 24-Feb-17.
 */

public class phrases {
    private String mEnglish;
    private String mMiwok;
    private  int mAudioResourceId;

    public phrases(String Miwok, String English,int AudioResourceId){
        mEnglish=English;
        mMiwok=Miwok;
        mAudioResourceId=AudioResourceId;

    }
    public String getEnglishWord1(){
        return mEnglish;
    }
    public String getMiwokWord1(){
        return mMiwok;
    }
    public int getAudioResourceId(){
        return mAudioResourceId;
    }

}
