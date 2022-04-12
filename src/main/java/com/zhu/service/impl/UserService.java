package com.zhu.service.impl;

import com.zhu.bean.User;

import java.util.List;

/**
 * @author blueboy
 * @create ***2022-04-2022/4/11***
 */
public interface UserService {

    public List<User> findAll();

    boolean Save(User u);
}
