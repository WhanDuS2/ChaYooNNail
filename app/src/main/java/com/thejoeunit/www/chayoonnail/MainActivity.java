package com.thejoeunit.www.chayoonnail;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.thejoeunit.www.chayoonnail.fragment.photoViewFragment;
import com.thejoeunit.www.chayoonnail.fragment.postFragment;

public class MainActivity extends BaseActivity {
    private photoViewFragment photoViewFragment;
    private postFragment postFragment;
    private android.widget.ImageView menuImg;
    private android.widget.FrameLayout framecontainer;
    private TabLayout tabs;
    private android.support.v4.widget.DrawerLayout naviMenu;
    private ImageView searchImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setupEvents();
        setValues();
    }

    private void setCurrentTabFragment(int tabPosition) {
        switch (tabPosition) {
            case 0:
                replaceFragment(photoViewFragment);
                break;
            case 1:
                replaceFragment(postFragment);
                break;
        }
    }

    public void replaceFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame_container, fragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();
    }

    @Override
    public void setupEvents() {

        searchImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
                finish();
            }
        });

        menuImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naviMenu.openDrawer(GravityCompat.START);
            }
        });
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                setCurrentTabFragment(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

    @Override
    public void setValues() {

        photoViewFragment = new photoViewFragment();
        postFragment = new postFragment();
        tabs.addTab(tabs.newTab().setText("Design"), true);
        tabs.addTab(tabs.newTab().setText("ADD"));
        tabs.addTab(tabs.newTab().setText("POSTING"));
        tabs.addTab(tabs.newTab().setText("INSTAGRAM"));
    }

    @Override
    public void bindViews() {
        this.naviMenu = (DrawerLayout) findViewById(R.id.naviMenu);
        this.tabs = (TabLayout) findViewById(R.id.tabs);
        this.framecontainer = (FrameLayout) findViewById(R.id.frame_container);
        this.searchImg = (ImageView) findViewById(R.id.searchImg);
        this.menuImg = (ImageView) findViewById(R.id.menuImg);
    }
}
