package org.mzy.service.impl;

import org.mzy.dao.UserDaoI;
import org.mzy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.mzy.service.UserServiceI;

import java.io.Serializable;

//使用Spring提供的@Service注解将UserServiceImpl标注为一个Service
@Service("userService")
public class UserServiceImpl implements UserServiceI {

    /**
     * 注入userDao
     */
    @Autowired
    private UserDaoI userDao;

    @Override
    public void test() {
        System.out.println("Hello World!");
    }

    @Override
    public Serializable save(User user) {
        return userDao.save(user);
    }


}
