package com.thejoeunit.www.chayoonnail.util;

import com.thejoeunit.www.chayoonnail.data.Photo;
import com.thejoeunit.www.chayoonnail.data.Post;
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
    public static List<Photo> photoLists = new ArrayList<>();
    public static List<Post> postsLists = new ArrayList<>();



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


        photoLists.clear();

        photoLists.add(new Photo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQAY_k-1EhK1C4mGTuO9dKGw2v96m-SZS3ZqHVaCq56XFwkK4t-"));
        photoLists.add(new Photo("https://scontent.cdninstagram.com/t51.2885-15/s480x480/e35/c135.0.809.809/18809413_230194397478330_3938254353508335616_n.jpg?ig_cache_key=MTUyNTE0NjI1Mjc5MDQwNjk1Mg%3D%3D.2.c"));
        photoLists.add(new Photo("https://scontent-atl3-1.cdninstagram.com/t51.2885-15/s640x640/sh0.08/e35/19367550_140730239832370_3000554952889204736_n.jpg"));
        photoLists.add(new Photo("https://scontent-lga3-1.cdninstagram.com/t51.2885-15/s640x640/sh0.08/e35/c168.0.744.744/16908205_377857315931923_7586484297255616512_n.jpg"));
        photoLists.add(new Photo("https://i.pinimg.com/736x/36/f4/fc/36f4fc51326769ce3e23412d8f7609df--korean-nails-nail-art-korean.jpg"));
        photoLists.add(new Photo("https://i.pinimg.com/736x/2d/c4/4a/2dc44ab3059dbf20376ffd2464e039ad--nailart-beautiful.jpg"));
        photoLists.add(new Photo("https://i.ytimg.com/vi/Mdjs3V1uXXg/maxresdefault.jpg"));
        photoLists.add(new Photo("https://i.pinimg.com/736x/36/f4/fc/36f4fc51326769ce3e23412d8f7609df--korean-nails-nail-art-korean.jpg"));
        photoLists.add(new Photo("https://i.pinimg.com/736x/9a/77/a8/9a77a856bc60dafbfceb8f58a5efadea--august--summer-nails.jpg"));
        photoLists.add(new Photo("https://i.ytimg.com/vi/-CxIb-DN69Q/maxresdefault.jpg"));
        photoLists.add(new Photo("https://i.ytimg.com/vi/99u6eDF5LVo/maxresdefault.jpg"));
        photoLists.add(new Photo("https://i.ytimg.com/vi/glXqHQFPDpU/maxresdefault.jpg"));
        photoLists.add(new Photo("https://i.ytimg.com/vi/FAULbSCmwIg/maxresdefault.jpg"));
        photoLists.add(new Photo("https://i.pinimg.com/originals/a9/b6/44/a9b64452bed9afedbc754b0f92af71bb.jpg"));


        postsLists.clear();

//        postsLists.add(new Post(true));
//        postsLists.add(new Post(false));

        postsLists.add(new Post("차윤회원1","https://i.pinimg.com/564x/ef/6b/24/ef6b249df2ad9a0ba7819e6063f8c371.jpg", "https://i.ytimg.com/vi/-CxIb-DN69Q/maxresdefault.jpg", "오랜만에 네일로 기분전환", false));
        postsLists.add(new Post("차윤회원2","https://i.pinimg.com/564x/ef/6b/24/ef6b249df2ad9a0ba7819e6063f8c371.jpg", "https://i.ytimg.com/vi/99u6eDF5LVo/maxresdefault.jpg", "손이 이쁘네요", false));
        postsLists.add(new Post("차윤회원3","https://i.pinimg.com/564x/ef/6b/24/ef6b249df2ad9a0ba7819e6063f8c371.jpg", "https://i.ytimg.com/vi/glXqHQFPDpU/maxresdefault.jpg", "맘에들어~", false));
        postsLists.add(new Post("차윤회원4","https://i.pinimg.com/564x/ef/6b/24/ef6b249df2ad9a0ba7819e6063f8c371.jpg", "https://i.ytimg.com/vi/FAULbSCmwIg/maxresdefault.jpg", "저녁먹기전 네일아트~", false));
        postsLists.add(new Post("차윤회원5","https://i.pinimg.com/564x/ef/6b/24/ef6b249df2ad9a0ba7819e6063f8c371.jpg", "https://i.pinimg.com/originals/a9/b6/44/a9b64452bed9afedbc754b0f92af71bb.jpg", "네일은 사랑입니다.", false));



    }
}
