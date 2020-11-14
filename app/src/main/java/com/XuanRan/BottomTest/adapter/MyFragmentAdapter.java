package com.XuanRan.BottomTest.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By XuanRan on 2020/11/14
 */
public class MyFragmentAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> list;
    public MyFragmentAdapter(FragmentManager fm, ArrayList<Fragment> list) {
        super(fm);
        this.list=list;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
         if (position>=0&&position<list.size()){
             return list.get(position);
         }
         return new Fragment();
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
