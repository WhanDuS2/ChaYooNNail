package com.thejoeunit.www.chayoonnail;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.thejoeunit.www.chayoonnail.fragment.InstagramFragment;
import com.thejoeunit.www.chayoonnail.fragment.DesignViewFragment;
import com.thejoeunit.www.chayoonnail.fragment.PostingFragment;

public class MainActivity extends BaseActivity {

    final int REQ_FOR_CAMERA = 1;
    final int REQ_FOR_GALLERY = 2;

    private InstagramFragment instagramFragment;
    private DesignViewFragment designViewFragment;
    private PostingFragment postingFragment;
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
                replaceFragment(designViewFragment);
                break;
            case 1:
                replaceFragment(postingFragment);
                break;
            case 2:
                replaceFragment(instagramFragment);
                break;
            case 3:
                String[] items = {"사진 촬영", "갤러리", "취소"};

                AlertDialog.Builder alert = new AlertDialog.Builder(mContext);
                alert.setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
//                        아이템이 선택되면 할 일

                        if (which == 0) {
//                            사진 찍기가 눌린 상황

                            Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                            startActivityForResult(takePictureIntent, REQ_FOR_CAMERA);
                        } else if (which == 1) {
//                            카메라 롤에서 선택이 눌린 상황

                            Intent intent = new Intent();
                            intent.setType("image/*");
                            intent.setAction(Intent.ACTION_GET_CONTENT);
                            startActivityForResult(intent, REQ_FOR_GALLERY);
                        }

//                        Toast.makeText(mContext, which + "번 아이템 선택", Toast.LENGTH_SHORT).show();

                    }
                });
                alert.show();

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

        designViewFragment = new DesignViewFragment();
        postingFragment = new PostingFragment();
        instagramFragment = new InstagramFragment();
        tabs.addTab(tabs.newTab().setText("Design"), true);
        tabs.addTab(tabs.newTab().setText("POSTING"));
        tabs.addTab(tabs.newTab().setText("INSTAGRAM"));
        tabs.addTab(tabs.newTab().setText("ADD"));
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
