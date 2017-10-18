package com.thejoeunit.www.chayoonnail.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.thejoeunit.www.chayoonnail.R;
import com.thejoeunit.www.chayoonnail.adapter.PostingAdapter;
import com.thejoeunit.www.chayoonnail.data.Post;
import com.thejoeunit.www.chayoonnail.util.GlobalData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2017-10-16.
 */

//빨간색 프래그먼트

public class PostingFragment extends Fragment {

    PostingAdapter mAdapter;
    List<Post> postLists = new ArrayList<>();
    private android.widget.ListView postListview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.posting_fragment, container, false);
        this.postListview = (ListView) v.findViewById(R.id.postListview);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mAdapter = new PostingAdapter(getActivity(), GlobalData.postsLists);
        postListview.setAdapter(mAdapter);
    }
}
