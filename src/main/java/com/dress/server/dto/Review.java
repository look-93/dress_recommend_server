package com.dress.server.dto;

import lombok.Data;

@Data
public class Review {
    private  int rPk;
    private String imgUrl;
    private String createDate;
    private int uPk;
    private String content;
    private String uId;

}

