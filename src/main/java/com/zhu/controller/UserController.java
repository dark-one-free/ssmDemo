package com.zhu.controller;

import com.zhu.bean.User;
import com.zhu.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author blueboy
 * @create ***2022-04-2022/4/11***
 */
@Controller
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("success");
        List<User> all=service.findAll();
        model.addAttribute("user",all);
//        service.findAll();
        return "list";
    }

    @RequestMapping("/save")
    public String save(Model model){
        System.out.println("success");
        User u=new User();
        u.setEmail("xxxxxx@qq.com");
        u.setGender("male");
        u.setName("xxx");
        boolean b=service.Save(u);
        System.out.println(b);
        return "success";
    }
}
