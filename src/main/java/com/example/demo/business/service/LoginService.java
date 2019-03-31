package com.example.demo.business.service;

import com.example.demo.business.model.Role;
import com.example.demo.business.model.User;

import java.util.Map;

public interface LoginService {

    User findByName(String name);

    User addUser(Map map);

    Role addRole(Map map);
}
