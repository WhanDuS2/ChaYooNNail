package com.thejoeunit.www.chayoonnail.util;

import com.thejoeunit.www.chayoonnail.data.Search;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by the on 2017-10-18.
 */

public class GlobalData {

    // 앱에서 공통적으로 사용되는 데이터를 임시 저장하는 클래스
    // 대부분의 변수/메쏘드는 public static으로
    // GlobalData.메쏘드(), GlobalData.변수

    public static List<Search> searchDatas = new ArrayList<>();


    public static void initDatas() {

        searchDatas.clear();

        searchDatas.add(new Search("가을"));
        searchDatas.add(new Search("버건디"));
        searchDatas.add(new Search("웨딩네일"));
        searchDatas.add(new Search("프렌치"));
        searchDatas.add(new Search("그라데이션"));
        searchDatas.add(new Search("진주"));
        searchDatas.add(new Search("청순"));
        searchDatas.add(new Search("페디"));
        searchDatas.add(new Search("스톤"));
        searchDatas.add(new Search("화려한"));


    }
}
