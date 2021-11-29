package com.housesystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInformation {

    //账号
    private String Uid;

    //名字
    private String Uname;

    //电话
    private String tel;

    //性别,0女,1男
    private int sex;

    //地址
    private String address;
}
