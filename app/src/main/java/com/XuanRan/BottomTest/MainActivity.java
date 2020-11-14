package com.XuanRan.BottomTest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gauravk.bubblenavigation.BubbleNavigationLinearView;
import com.gauravk.bubblenavigation.listener.BubbleNavigationChangeListener;
import java.util.ArrayList;

public class MainActivity extends FragmentActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final BubbleNavigationLinearView bubbleNavigationLinearView = findViewById(R.id.bottom_navigation_view_linear);
     //   bubbleNavigationLinearView.setTypeface(Typeface.createFromAsset(getAssets(), "rubik.ttf"));

        bubbleNavigationLinearView.setBadgeValue(0, "40");
        bubbleNavigationLinearView.setBadgeValue(1, null); //invisible badge
        bubbleNavigationLinearView.setBadgeValue(2, "7");
        bubbleNavigationLinearView.setBadgeValue(3, "2");
        bubbleNavigationLinearView.setBadgeValue(4, ""); //empty badge

   

        bubbleNavigationLinearView.setNavigationChangeListener(new BubbleNavigationChangeListener() {
            @Override
            public void onNavigationChanged(View view, int position) {
                Toast.makeText(MainActivity.this, "点击了底栏", Toast.LENGTH_SHORT).show();
                //viewPager.setCurrentItem(position, true);
            }
        });
    }
}