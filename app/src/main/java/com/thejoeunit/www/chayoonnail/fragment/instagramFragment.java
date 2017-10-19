package com.thejoeunit.www.chayoonnail.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.thejoeunit.www.chayoonnail.R;

/**
 * Created by the on 2017-10-18.
 */

public class InstagramFragment extends Fragment {


    private android.widget.ImageView instaLogoImg;
    private android.widget.ImageView instaLinkImg;
    private android.widget.Button goInstaBtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.instagram_fragment, container, false);
        this.goInstaBtn = (Button) v.findViewById(R.id.goInstaBtn);


        goInstaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_WEB_SEARCH);
                intent.setData(Uri.parse("https://www.instagram.com/chayoon_nail/?hl=ko"));
                startActivity(intent);
            }
        });


        return v;
    }


}

