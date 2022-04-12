package com.zhu.service.impl.impl;

import com.zhu.bean.User;
import com.zhu.dao.UserDao;
import com.zhu.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author blueboy
 * @create ***2022-04-2022/4/11***
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    @Override
    public List<User> findAll() {
        System.out.println("查询所有用户");
        return dao.findAll();
    }

    @Override
    public boolean Save(User u) {
        return dao.Save(u);
    }
}
