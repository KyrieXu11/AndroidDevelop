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
import com.kyriexu.homework04.adapter.Tab03Adapter;
import com.kyriexu.homework04.db.SQLUtil;
import com.kyriexu.homework04.pojo.Friend;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab03Fragment extends Fragment {

    public Tab03Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // 获取上下文
        FragmentActivity context = getActivity();
        SQLUtil util = new SQLUtil(context);
        // 查询所有数据
        List<Friend> friends = util.getAllFriends();
        Tab03Adapter adapter = new Tab03Adapter(context, friends);

        View view = inflater.inflate(R.layout.tab03, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.rcy_contact);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context,
                LinearLayoutManager.VERTICAL, false);
        // set layout manager
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
