package com.kyriexu.homework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Fragment tab01 = new Tab01Fragment();

    private Fragment tab02 = new Tab02Fragment();
    private Fragment tab03 = new Tab03Fragment();
    private Fragment tab04 = new Tab04Fragment();
    // fragment通讯的控制器

    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        welcomPage();
        initView();
    }

    // demo 方法
    private void initFragment(){
        // 要换成这种方式，原来的getFragmentManager()被弃用了，官方文档说明使用这个
        manager = getSupportFragmentManager();
        // 开启事务
        FragmentTransaction transaction = manager.beginTransaction();
        // 将fragment放入content中
        transaction.add(R.id.content,tab01);
        transaction.add(R.id.content,tab02);
        transaction.add(R.id.content,tab03);
        transaction.add(R.id.content,tab04);
        // 事务提交
        transaction.commit();
    }

    // 默认的页面
    private void welcomPage(){
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.content,tab01);
        transaction.commit();
    }

    private void initView(){
        ImageButton btn1 = findViewById(R.id.bottom_icon_btn1);
        ImageButton btn2 = findViewById(R.id.bottom_icon_btn2);
        ImageButton btn3 = findViewById(R.id.bottom_icon_btn3);
        ImageButton btn4 = findViewById(R.id.bottom_icon_btn4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction transaction = manager.beginTransaction();
        switch (v.getId()){
            case R.id.bottom_icon_btn1:
                Log.i(v.getId()+"",v.getId()+"");
                transaction.replace(R.id.content,tab01);
                break;
            case R.id.bottom_icon_btn2:
                Log.i(v.getId()+"",v.getId()+"");
                transaction.replace(R.id.content,tab02);
                break;
            case R.id.bottom_icon_btn3:
                Log.i(v.getId()+"",v.getId()+"");
                transaction.replace(R.id.content,tab03);
                break;
            case R.id.bottom_icon_btn4:
                Log.i(v.getId()+"",v.getId()+"");
                transaction.replace(R.id.content,tab04);
                break;
        }
        transaction.commit();
    }



}
