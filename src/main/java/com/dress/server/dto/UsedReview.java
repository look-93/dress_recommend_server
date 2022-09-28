package com.dress.server.dto;

import lombok.Data;

@Data
public class UsedReview {
    private int urPk;
    private String contents;
    private int rating;
    private String fileUrl;
    private String title;
    private int rPk;
    private String urCreateDate;
    private String uId;
    private int sPk;
    private  int uPk;
    private int hPk;
    private int hCnt;  //하트갯수
    private String uimgUrl;

}
