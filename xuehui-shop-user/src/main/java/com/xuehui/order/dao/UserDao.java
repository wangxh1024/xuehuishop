package com.xuehui.order.dao;

import com.xuehui.order.model.user.User;
import com.xuehui.order.mapper.UserMappper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by youfan on 2018/6/6 0006.
 */
@Component
public class UserDao {

    @Autowired
    private UserMappper userMappper;

    public User findUserInfo(){
        return userMappper.findUserInfo();
    }

    public void inseruserInfo(User user){
        userMappper.inseruserInfo(user);
    }
}
