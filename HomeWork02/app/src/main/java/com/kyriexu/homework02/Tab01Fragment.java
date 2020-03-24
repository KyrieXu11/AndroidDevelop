package com.kyriexu.homework02;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Objects;

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
        super.onActivityCreated(savedInstanceState);
        View view = inflater.inflate(R.layout.tab01, container, false);
        String[] dataSet = new String[]{
                "123","234","456"
        };
        // getActivity().findViewByid
        RecyclerView recyclerView = view.findViewById(R.id.rcy_view);
        // change content not change layout size of recyclerview
        recyclerView.setHasFixedSize(true);
        // layout manager
        FragmentActivity activity = getActivity();
        LinearLayoutManager layoutManager = new LinearLayoutManager(activity,
                LinearLayoutManager.VERTICAL,false);
        // set layoout manager
        recyclerView.setLayoutManager(layoutManager);
        // get an adapter instance
        Adapter adapter = new Adapter(dataSet,activity);
        // set adapter for recyclerview
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
    }
}
