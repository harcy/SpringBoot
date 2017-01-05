package com.sap.mapper;

import com.sap.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by I337300 on 1/5/2017.
 */
@Repository
public interface UserMapper {
    User gerUserByUserName(String userName);
}
