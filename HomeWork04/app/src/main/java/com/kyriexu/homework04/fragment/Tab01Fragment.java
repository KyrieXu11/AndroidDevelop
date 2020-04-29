package com.kyriexu.homework04.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kyriexu.homework04.R;
import com.kyriexu.homework04.adapter.Tab01Adapter;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab01Fragment extends Fragment {
    private List<String> dataSet;

    public Tab01Fragment(List<String> dataSet) {
        this.dataSet = dataSet;
    }

    public Tab01Fragment() {
        // Required empty public constructor
    }


    // 将xml文件变成fragment对象,方便java控制
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        View view = inflater.inflate(R.layout.tab01, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.rcy_view);
        // change content not change layout size of recyclerview
        recyclerView.setHasFixedSize(true);
        // layout manager
        FragmentActivity activity = getActivity();
        LinearLayoutManager layoutManager = new LinearLayoutManager(activity,
                LinearLayoutManager.VERTICAL,false);
        // set layout manager
        recyclerView.setLayoutManager(layoutManager);
        // get an adapter instance
        Tab01Adapter adapter = new Tab01Adapter<>(dataSet, activity);
        // set adapter for recyclerview
        recyclerView.setAdapter(adapter);
        return view;
    }
}
