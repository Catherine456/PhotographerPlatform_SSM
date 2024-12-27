package com.platform.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // 自动生成set get方法
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Photographer {
    private String photographerID;
    private String account;
    private String name;
    private String password;
    private String IDNumber;
    private String phone;
    private String email;
    private Boolean sex;
    private String region;
    private String wechat;
    private String qq;
    private Integer score;
    private String profilePhoto;
    private String introduction;
    private Integer fans;
    private Integer praise;
    private String certificate;
    private String status;
//    private String profound;
//    private String introduce;
    private String title;
    private String prize;
    private String message;
    private Integer status1;
    private Integer money1;
    private Integer visits;


}
