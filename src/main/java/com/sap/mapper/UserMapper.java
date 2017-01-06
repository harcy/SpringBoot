package com.sap.mapper;

import com.sap.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by on 1/5/2017.
 */
@Mapper
public interface UserMapper {
    User gerUserByUserName(String userName);
}
