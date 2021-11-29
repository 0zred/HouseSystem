package com.housesystem.mapper;

import com.housesystem.entity.User;
import com.housesystem.entity.UserInformation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    //通过名字查找用户
    public User selectUserByName(String uid);

    //添加用户账号信息
    public int insertUser(User user);

    //添加用户个人信息
    public int insertUserInfo(UserInformation userInformation);

}
