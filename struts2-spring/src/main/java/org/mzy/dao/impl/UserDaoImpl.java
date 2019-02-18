package org.mzy.dao.impl;

import org.mzy.dao.UserDaoI;
import org.mzy.model.User;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * @description:
 * @author: MeiZhiYuan(梅致远)
 * @create: 2019-02-13-17-11-06
 * @copyright: www.mzy.org .@版权所有，仿冒必究
 **/


@Repository("userDao")
public class UserDaoImpl implements UserDaoI {

    /**
     * 使用@Autowired注解将sessionFactory注入到UserDaoImpl中
     */
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Serializable save(User user) {
        return sessionFactory.getCurrentSession().save(user);
    }
}
