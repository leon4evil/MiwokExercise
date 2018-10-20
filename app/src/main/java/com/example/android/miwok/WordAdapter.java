package com.example.android.miwok;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by leon on 3/22/18.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int backgroundColor;

    public WordAdapter(Context context , ArrayList <Word> words,int givenbackgroundColor){ //subclass constructor
        super(context,0,words);
        backgroundColor =givenbackgroundColor;

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Add ImageView
        Word word = getItem(position);
        ImageView miwokimageview = (ImageView) listItemView.findViewById(R.id.image);

        if(word.hasImage()){
            miwokimageview.setImageResource(word.getmImageResourceId());
            miwokimageview.setVisibility(View.VISIBLE);
        }
        else{
            miwokimageview.setVisibility(View.GONE);
        }
        //get miwok translation
        //I guess this is where we're adding miwok text view to listItemView

        TextView miwoktextview = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwoktextview.setText(word.getmMiwokTranslation());

        //get default translation
        //I guess this is where we're adding default text view to listItemView
        TextView defaulttextview = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaulttextview.setText(word.getmDefaultTranslation());


        //set the theme color for the list item
        View textContainer =listItemView.findViewById(R.id.text_container);
        //Find the color that the resource ip maps to
        int color = ContextCompat.getColor(getContext(),backgroundColor);
        //Set the background of the text container view
        textContainer.setBackgroundColor(color);



        return listItemView;
    }
}
