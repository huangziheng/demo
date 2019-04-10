package com.example.demo.business.service.impl;

import com.example.demo.business.model.Role;
import com.example.demo.business.model.User;
import com.example.demo.business.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {

   /* @Autowired
    private UserMapper userMapper;*/
    @Override
    public User findByName(String name) {
       // User user = userMapper.selectByUserName(name);
        User user = new User();
        user.setName("黄子恒");
        user.setPassword("12345");
        return user;
    }

    @Override
    public User addUser(Map map) {
        return null;
    }

    @Override
    public Role addRole(Map map) {
        return null;
    }
}
