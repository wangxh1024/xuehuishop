package com.xuehui.order.mapper;

import com.xuehui.order.model.user.User;

/**
 * Created by youfan on 2018/6/6 0006.
 */
public interface UserMappper {

    User findUserInfo();
    void inseruserInfo(User user);

}
