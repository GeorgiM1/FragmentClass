package com.example.android.fragmentclass;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.pager)
    ViewPager pager;
    @BindView(R.id.tabLayout)
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setUpViewPager(pager);
        tabLayout.setupWithViewPager(pager);

    }

    public void setUpViewPager(ViewPager upViewPager) {
        MyPageAdapter adapter = new MyPageAdapter(this.getSupportFragmentManager());
        adapter.addFragment(new Fragment1(), "tab 1");
        adapter.addFragment(new Fragment2(), "tab 2");
        adapter.addFragment(new Fragment3(), "tab 3");
        adapter.addFragment(new Fragment3(), "tab 4");
        pager.setAdapter(adapter);
    }
}
