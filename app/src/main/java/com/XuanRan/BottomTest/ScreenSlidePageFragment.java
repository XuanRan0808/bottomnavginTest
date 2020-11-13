package com.XuanRan.BottomTest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Created By XuanRan on 2020/11/9
 */
class ScreenSlidePageFragment extends Fragment {

    String title="XuanRan";
    int color=Integer.parseInt("#FFFFFF");
    View inflatedView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflatedView = inflater.inflate(R.layout.fragment_screen_slide_page, container, false);
        return inflatedView;
    }

    public static ScreenSlidePageFragment newInstance(String title, int color){


        return null;
    }
}
