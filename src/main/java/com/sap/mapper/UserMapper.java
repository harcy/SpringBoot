package com.sap.mapper;

import com.sap.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by on 1/5/2017.
 *
 * jpa个人感觉太灵活，使用简单但不太容易理解,对菜鸟我来说，有点懵......
 * 特别是对于sql的执行;另外不知道对于那种特别复杂的sql查询jpa是否能
 * 很好的支持(所以还是要回到mybatis???)
 *
 */

public interface UserMapper extends JpaRepository<User,Integer>{

    User findByUserName(String userName);


    List<User> findAll();
}
