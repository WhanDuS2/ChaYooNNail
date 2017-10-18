package com.thejoeunit.www.chayoonnail.data;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by the on 2017-10-18.
 */

public class Search implements Serializable {

    private String autoSearchName; // 서치하는 칸에 나오는 자동검색기능

    public Search() {
    }

    public Search(String autoSearchName) {
        this.autoSearchName = autoSearchName;
    }

    public String getAutoSearchName() {
        return autoSearchName;
    }

    public void setAutoSearchName(String autoSearchName) {
        this.autoSearchName = autoSearchName;
    }
}

