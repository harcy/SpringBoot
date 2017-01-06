package com.sap.service;

import com.sap.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by  on 1/5/2017.
 */
@Component
public interface UserService {

    User getUserByName(String name);
}
