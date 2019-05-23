package com.example.dika;
/** Created on 5/21/2019 by Andika IF7
 */

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List <Fragment> lstfragment = new ArrayList();
    private final List <String> lstTitles = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return lstfragment.get(position);
    }

    @Override
    public int getCount() {
        return lstTitles.size()   ;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return lstTitles.get(position);
    }

    public void AddFragment (Fragment fragment,String title ){

        lstfragment.add(fragment);
        lstTitles.add(title);

    }
}



