package com.thejoeunit.www.chayoonnail.data;

import java.io.Serializable;

/**
 * Created by the on 2017-10-18.
 */

public class Post implements Serializable {

    private String name;
    private String profileURL;
    private String imageURL;
    private String intro;

    boolean isLike = false;


    public Post(boolean b) {
    }

    public Post(String name, String profileURL, String imageURL, String intro, boolean isLike) {
        this.name = name;
        this.profileURL = profileURL;
        this.imageURL = imageURL;
        this.intro = intro;
        this.isLike = isLike;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileURL() {
        return profileURL;
    }

    public void setProfileURL(String profileURL) {
        this.profileURL = profileURL;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public boolean isLike() {
        return isLike;
    }

    public void setLike(boolean like) {
        isLike = like;
    }
}
