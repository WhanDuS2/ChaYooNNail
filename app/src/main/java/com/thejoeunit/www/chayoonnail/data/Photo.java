package com.thejoeunit.www.chayoonnail.data;

import java.io.Serializable;

/**
 * Created by the on 2017-10-16.
 */

public class Photo implements Serializable {

    private String nailPhotoViews; // 네일사진들


    public Photo() {
    }

    public Photo(String nailPhotoViews) {
        this.nailPhotoViews = nailPhotoViews;
    }

    public String getNailPhotoViews() {
        return nailPhotoViews;
    }

    public void setNailPhotoViews(String nailPhotoViews) {
        this.nailPhotoViews = nailPhotoViews;
    }
}
