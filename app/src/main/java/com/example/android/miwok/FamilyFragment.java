package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FamilyFragment extends Fragment {


    public FamilyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //TODO: Add Family activity
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "әpә",R.drawable.family_father));

        //String [] words = new String[10];
        words.add(new Word("mother", "әṭa",R.drawable.family_mother));

        words.add(new Word("son", "angsi",R.drawable.family_son));
        words.add(new Word("daughter", "tune",R.drawable.family_daughter));
        words.add(new Word("older brother", "taachi",R.drawable.family_older_brother));
        words.add(new Word("younger brother" , "chalitti",R.drawable.family_younger_brother));
        words.add(new Word("older sister", "teṭe",R.drawable.family_older_sister));
        words.add(new Word("younger sister", "kolliti",R.drawable.family_younger_sister));

        words.add(new Word("grandmother", "ama",R.drawable.family_grandmother));
        words.add(new Word("grandfather", "paapa",R.drawable.family_grandfather));

        WordAdapter adapter= new WordAdapter(getActivity(),words,R.color.category_family);
        ListView listview = (ListView) rootView.findViewById(R.id.list);
        listview.setAdapter(adapter);


        return rootView;
    }

}
