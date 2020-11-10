package com.example.foody;

import android.content.res.ColorStateList;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class main extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lsu);

        tabLayout= (TabLayout) findViewById(R.id.tablayout_id);
        viewPager=(ViewPager) findViewById(R.id.viewpage_id);
        adapter = new ViewPageAdapter(getSupportFragmentManager());

        //add fragment
        adapter.AddFragment(new Fragmentdanggiao(),"Đang giao");
        adapter.AddFragment(new Fragmentlichsu(),"Lịch sử");
        adapter.AddFragment(new Fragmentdonnhap(),"Đơn nháp");



        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
