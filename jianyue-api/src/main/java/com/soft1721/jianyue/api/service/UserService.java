package com.soft1721.jianyue.api.service;

import com.soft1721.jianyue.api.entity.User;
import com.soft1721.jianyue.api.entity.dto.UserDTO;

public interface UserService {

    /**
     * 根据手机号获取用户信息
     *
     * @param mobile
     * @return
     */
    User getUserByMobile(String mobile);

    /**
     * 登录方法
     *
     * @param userDTO
     * @return boolean
     */
    int signIn(UserDTO userDTO);

    /**
     * 根据id获取用户数据
     *
     * */
    User getUserById(int id);

    /**
     * 更改头像
     * */
    void updateUser(User user);
    /*
    更改昵称
    */
    void updateUser1(User user);

}