package com.housesystem.entity.question;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Qeighth {

    //账号
    private String Uid;

    //选项
    private String QcOne;
    private String QcTwo;
    private String QcThree;
    private String QcFour;

    //多选
    private String QcFive;

}
