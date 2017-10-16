package com.thejoeunit.www.chayoonnail.data;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by the on 2017-10-16.
 */

public class User implements Serializable {

    private int id; // 디비에서 날아오는 Primary Key ID
    private String userId; // 사용자가 로그인하려고 타이핑하는 아이디.
    private String name;
    private Calendar birthDay;
    private int gender;
    private String profileURL;
    private String phoneNum;

}