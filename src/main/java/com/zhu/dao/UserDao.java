package com.zhu.dao;

import com.zhu.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author blueboy
 * @create ***2022-04-2022/4/11***
 */

@Repository
public interface UserDao {

    // 使用注解查询
    @Select("select * from user")
    public List<User> findAll();

    @Insert("inset into user(name,gender,email) values(#{name},#{gender},#{email})")
    boolean Save(User u);
}
