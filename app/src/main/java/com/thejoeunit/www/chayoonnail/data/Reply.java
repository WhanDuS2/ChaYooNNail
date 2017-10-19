package com.thejoeunit.www.chayoonnail.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by the on 2017-10-19.
 */

public class Reply implements Serializable {

    // 댓글이 고유하게 갖는 속성.
    private String replyId; // DB와의 연동을 고려한 id
    private String content; // 댓글의 내용
    private Calendar createdAt; // 댓글이 쓰여진 시간

    // 댓글과 다른 객체들간의 관계
    // 댓글 -> 작성자 (1) : 일반 사용자 객체.
    private User writerData;
    // 댓글 -> 좋아한 사람들. (N) : List 사용자
    private List<User> likeUsers = new ArrayList<>();

    // 댓글 <- 부모댓글
    // 부모댓글의 id값을 저장함으로써, 대댓글임을 명시.
    // id가 유효하지 않은값 (Ex. -1) 이면 부모가 없는 원본 댓글임을 명시.
    // id가 유효한값 (Ex. > 1) 이면 부모댓글에 매달려있는 대댓글임을 명시.
    private int parentReplyId;


    public Reply() {
    }

    public Reply(String replyId, String content, Calendar createdAt, User writerData, int parentReplyId) {
        this.replyId = replyId;
        this.content = content;
        this.createdAt = createdAt;
        this.writerData = writerData;
        this.parentReplyId = parentReplyId;
    }

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Calendar getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Calendar createdAt) {
        this.createdAt = createdAt;
    }

    public User getWriterData() {
        return writerData;
    }

    public void setWriterData(User writerData) {
        this.writerData = writerData;
    }

    public int getParentReplyId() {
        return parentReplyId;
    }

    public void setParentReplyId(int parentReplyId) {
        this.parentReplyId = parentReplyId;
    }
}
