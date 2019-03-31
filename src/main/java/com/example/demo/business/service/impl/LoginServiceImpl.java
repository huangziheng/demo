package com.example.demo.business.service.impl;

import com.example.demo.business.model.Role;
import com.example.demo.business.model.User;
import com.example.demo.business.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public User findByName(String name) {
        return null;
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
