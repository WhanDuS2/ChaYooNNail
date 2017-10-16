package com.thejoeunit.www.chayoonnail;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.thejoeunit.www.chayoonnail.frag.FragmentOne;
import com.thejoeunit.www.chayoonnail.frag.FragmentTwo;

public class MainActivity extends BaseActivity {
    private FragmentOne fragmentOne;
    private FragmentTwo fragmentTwo;
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
                replaceFragment(fragmentOne);
                break;
            case 1 :
                replaceFragment(fragmentTwo);
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

        fragmentOne = new FragmentOne();
        fragmentTwo = new FragmentTwo();
        allTabs.addTab(allTabs.newTab().setText("1번탭"),true);
        allTabs.addTab(allTabs.newTab().setText("2번탭"));
    }

    @Override
    public void bindViews() {

        allTabs = (TabLayout) findViewById(R.id.tabs);
    }
}
