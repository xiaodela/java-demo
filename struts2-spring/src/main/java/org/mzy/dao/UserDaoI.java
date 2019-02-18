package org.mzy.dao;

import org.mzy.model.User;

import java.io.Serializable;

/**
 * @description: 数据层
 * @author: MeiZhiYuan(梅致远)
 * @create: 2019-02-13-17-09-23
 * @copyright: www.mzy.org .@版权所有，仿冒必究
 **/
public interface UserDaoI {
    /**
     * 保存用户
     * @param user
     * @return
     */
    Serializable save(User user);
}
