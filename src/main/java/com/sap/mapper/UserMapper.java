package com.sap.mapper;

import com.sap.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by on 1/5/2017.
 */
@Repository
public interface UserMapper {
    User getUserByUserName(String userName);
}
