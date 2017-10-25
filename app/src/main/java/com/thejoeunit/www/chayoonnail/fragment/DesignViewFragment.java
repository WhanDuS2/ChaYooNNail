package com.thejoeunit.www.chayoonnail.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.thejoeunit.www.chayoonnail.PostingActivity;
import com.thejoeunit.www.chayoonnail.R;
import com.thejoeunit.www.chayoonnail.adapter.DesignViewAdapter;
import com.thejoeunit.www.chayoonnail.data.Photo;
import com.thejoeunit.www.chayoonnail.util.GlobalData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2017-10-16.
 */

//빨간색 프래그먼트

public class DesignViewFragment extends Fragment {

    private android.widget.GridView designPhotoGridView;
    DesignViewAdapter mAdapter;
    List<Photo> photoLists = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.photo_view_fragment, container, false);
        this.designPhotoGridView = (GridView) v.findViewById(R.id.designPhotoGridView);


        return v;


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        designPhotoGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), PostingActivity.class);
                startActivity(intent);
            }
        });

        mAdapter = new DesignViewAdapter(getActivity(), GlobalData.photoLists);
        designPhotoGridView.setAdapter(mAdapter);


    }
}

