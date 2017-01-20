package com.sap.service;

import com.sap.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by  on 1/5/2017.
 *
 * interface
 *   方法默认修饰符 public abstract
 *   属性默认修饰符 pubic static final
 */
public interface UserService {

    public  User getUserByName(String name);

    public List<User> getAllUsers();
}
