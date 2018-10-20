package com.example.android.miwok;

/**
 * Created by leon on 3/22/18.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation,String miwokTranslation){
       mMiwokTranslation=miwokTranslation;
       mDefaultTranslation=defaultTranslation;

    }
    public Word(String defaultTranslation,String miwokTranslation, int imageResource){
        mMiwokTranslation=miwokTranslation;
        mDefaultTranslation=defaultTranslation;
        mImageResourceId = imageResource;

    }

    //Setters
    public void setmMiwokTranslation(String maMiwokWord){
        mMiwokTranslation=maMiwokWord;
    }

    public  void setmDefaultTranslation(String maDefaultWord){
        mDefaultTranslation =maDefaultWord;
    }
    public void setImageResourceId(int maImageResourceId){
        mImageResourceId = maImageResourceId;

    }

    //Getters
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    //other methods
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
