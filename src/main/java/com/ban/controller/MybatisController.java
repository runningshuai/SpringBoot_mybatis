package com.ban.controller;

import com.ban.domain.User;
import com.ban.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MybatisController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/mybatis")
    @ResponseBody
    public List<User> queryUserList(){
        List<User> users = userMapper.queryUserList();
        return users;

    }
}
