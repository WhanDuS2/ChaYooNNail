package com.thejoeunit.www.chayoonnail;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;

import com.thejoeunit.www.chayoonnail.fragment.photoViewFragment;
import com.thejoeunit.www.chayoonnail.fragment.postFragment;

public class MainActivity extends BaseActivity {
    private photoViewFragment photoViewFragment;
    private postFragment postFragment;
    private TabLayout allTabs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setupEvents();
        setValues();
    }

    private void setCurrentTabFragment(int tabPosition)
    {
        switch (tabPosition)
        {
            case 0 :
                replaceFragment(photoViewFragment);
                break;
            case 1 :
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
        allTabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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
        allTabs.addTab(allTabs.newTab().setText("1번탭"),true);
        allTabs.addTab(allTabs.newTab().setText("2번탭"));
    }

    @Override
    public void bindViews() {

        allTabs = (TabLayout) findViewById(R.id.tabs);
    }
}
