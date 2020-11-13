package com.XuanRan.BottomTest;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

/**
 * Created By XuanRan on 2020/11/9
 */


public class ScreenSlidePagerAdapter extends PagerAdapter {
    ArrayList<ScreenSlidePageFragment> fragmentList;
    FragmentManager fragmentManager;

    public ScreenSlidePagerAdapter(ArrayList<ScreenSlidePageFragment> fmlist,FragmentManager fm){

        this.fragmentList=fmlist;
        this.fragmentManager=fm;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }


}
