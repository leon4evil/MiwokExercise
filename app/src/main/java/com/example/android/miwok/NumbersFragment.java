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
public class NumbersFragment extends Fragment {

    @Override
    public void onStop() {
        super.onStop();
        // When the activity is stopped, release the media player resources because we won't
        // be playing any more sounds.
        //releaseMediaPlayer();
    }

    public NumbersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);


        //TODO: Add words activity
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti",R.drawable.number_one));

        //String [] words = new String[10];
        words.add(new Word("two", "otiiko",R.drawable.number_two));

        words.add(new Word("three", "tolookosu",R.drawable.number_three));
        words.add(new Word("four", "oyyisa",R.drawable.number_four));
        words.add(new Word("five", "massokka",R.drawable.number_five));
        words.add(new Word("six", "temmokka",R.drawable.number_six));
        words.add(new Word("seven", "kenekaku",R.drawable.number_seven));
        words.add(new Word("eight", "kawinta",R.drawable.number_eight));
        words.add(new Word("nine", "wo'e",R.drawable.number_nine));
        words.add(new Word("ten", "na'aacha",R.drawable.number_ten));


        WordAdapter adapter= new WordAdapter(getActivity(),words,R.color.category_numbers);
        ListView listview = (ListView) rootView.findViewById(R.id.list);
        listview.setAdapter(adapter);

//        /**
//         * Clean up the media player by releasing its resources.
//         */
//        private void releaseMediaPlayer() {
//            // If the media player is not null, then it may be currently playing a sound.
//            if (mMediaPlayer != null) {
//                // Regardless of the current state of the media player, release its resources
//                // because we no longer need it.
//                mMediaPlayer.release();
//
//                // Set the media player back to null. For our code, we've decided that
//                // setting the media player to null is an easy way to tell that the media player
//                // is not configured to play an audio file at the moment.
//                mMediaPlayer = null;
//
//                // Regardless of whether or not we were granted audio focus, abandon it. This also
//                // unregisters the AudioFocusChangeListener so we don't get anymore callbacks.
//                mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
//            }
//        }








        return rootView;
    }

}
