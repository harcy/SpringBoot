package com.sap.controller;

import com.sap.entity.Girl;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "hi," + girl.getName() + " Welcome SpringBoot";
    }
}
