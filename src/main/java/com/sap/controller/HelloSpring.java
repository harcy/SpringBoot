package com.sap.controller;

import com.sap.entity.Girl;
import com.sap.entity.User;
import com.sap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by  on 1/4/2017.
 */
@RestController
public class HelloSpring {

    @Autowired
    private Girl girl;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "hi," + girl.getName() + " Welcome SpringBoot";
    }

    @RequestMapping(value = "/user/{userName}", method = RequestMethod.GET)
    public User getUser(@PathVariable String userName) {
        User user = new User();
        user = userService.getUserByName(userName);
        return user;
    }
}
