package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FixedTabsPagerAdapter extends FragmentPagerAdapter {

    public FixedTabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new ColorsFragment();
            case 1:
                return new NumbersFragment();
            case 2:
                return new FamilyFragment();
            case 3:
                return  new PhrasesFragment();

            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Colors";
            case 1:
                return "Numbers";
            case 2:
                return "Family";
            case 3:
                return  "Phrases";

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 4;
    }
}
