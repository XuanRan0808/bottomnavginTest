package com.XuanRan.BottomTest.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.XuanRan.BottomTest.R;

/**
 * Created By XuanRan on 2020/11/14
 */
public class Total_Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.total_fragment, container, false);
        TextView tv = view.findViewById(R.id.Total_Fragment_Text);
        return view;
    }
}
