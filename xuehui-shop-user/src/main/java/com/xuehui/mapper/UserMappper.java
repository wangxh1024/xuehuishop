package com.xuehui.mapper;

import com.xuehui.model.User;

/**
 * Created by youfan on 2018/6/6 0006.
 */
public interface UserMappper {

    User findUserInfo();
    void inseruserInfo(User user);

}
