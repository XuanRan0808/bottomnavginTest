package com.XuanRan.BottomTest;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.XuanRan.BottomTest.adapter.MyFragmentAdapter;
import com.XuanRan.BottomTest.fragment.Expect_Fragment;
import com.XuanRan.BottomTest.fragment.Home_Fragment;
import com.XuanRan.BottomTest.fragment.Me_Fragment;
import com.XuanRan.BottomTest.fragment.Total_Fragment;
import com.gauravk.bubblenavigation.BubbleNavigationLinearView;
import com.gauravk.bubblenavigation.listener.BubbleNavigationChangeListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    FragmentPagerAdapter fm;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final BubbleNavigationLinearView bubbleNavigationLinearView = findViewById(R.id.bottom_navigation_view_linear);
        //list Fragment集合
        List<Fragment> list = new ArrayList<Fragment>();
        list.add(new Home_Fragment());
        list.add(new Total_Fragment());
        list.add(new Expect_Fragment());
        list.add(new Me_Fragment());
        MyFragmentAdapter myadapter = new MyFragmentAdapter(getSupportFragmentManager(), (ArrayList<Fragment>) list);
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(myadapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                viewPager.setCurrentItem(position);
                bubbleNavigationLinearView.setCurrentActiveItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        //   bubbleNavigationLinearView.setTypeface(Typeface.createFromAsset(getAssets(), "rubik.ttf"));

        bubbleNavigationLinearView.setBadgeValue(0, "40");
        bubbleNavigationLinearView.setBadgeValue(1, null); //invisible badge
        bubbleNavigationLinearView.setBadgeValue(2, "7");
        bubbleNavigationLinearView.setBadgeValue(3, "2");
        bubbleNavigationLinearView.setBadgeValue(4, ""); //empty badge


        bubbleNavigationLinearView.setNavigationChangeListener(new BubbleNavigationChangeListener() {
            @Override
            public void onNavigationChanged(View view, int position) {
                //Toast.makeText(MainActivity.this, "点击了底栏", Toast.LENGTH_SHORT).show();
                viewPager.setCurrentItem(position, true);
            }
        });
    }
}