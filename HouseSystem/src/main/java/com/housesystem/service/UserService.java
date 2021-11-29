package com.housesystem.service;

import com.housesystem.entity.User;
import com.housesystem.entity.UserInformation;
import com.housesystem.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PackageName:com.housesystem.service
 * @ClassName:UserService
 * @Description:业务层
 * @Author:Ozred
 * @Date:2021/11/23/17:33
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    //登录业务
    public boolean login(User user) {
        String uid = user.getUid().trim();
        String pwd = user.getPwd().trim();
        User userByName = userMapper.selectUserByName(uid);

        //账号不存在
        if (userByName == null) {
            return false;
        } else {
            //账号存在，密码正确
            if (userByName.getPwd().equals(pwd)) {
                return true;
            }
            //账号存在，密码错误
            else {
                return false;
            }
        }
    }

    //注册业务
    public boolean regist(User user, UserInformation userInformation) {

        User userByName = userMapper.selectUserByName(user.getUid());

        //判断是否有该id
        if (userByName==null){
            //不存在
            if (userMapper.insertUser(user)>0){
                userMapper.insertUserInfo(userInformation);
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }

    }

}
