package com.sap.service;

import com.sap.entity.User;
import com.sap.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by  on 1/5/2017.
 */

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserByName(String name) {
        User user = userMapper.findByUserName(name);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.findAll();
    }
}
