package com.kyriexu.homework;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab01Fragment extends Fragment {

    public Tab01Fragment() {
        // Required empty public constructor
    }


    // 将xml文件变成fragment对象,方便java控制
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab01,container,false);
    }
}
