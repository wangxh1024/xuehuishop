package com.xuehui.user.service;

import com.xuehui.order.model.user.User;
import com.xuehui.order.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by youfan on 2018/6/6 0006.
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User findUserInfo(){
        return userDao.findUserInfo();
    }

    public void inseruserInfo(User user){
        userDao.inseruserInfo(user);
    }
}
