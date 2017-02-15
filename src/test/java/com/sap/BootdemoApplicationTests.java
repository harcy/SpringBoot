package com.sap;

import com.sap.entity.User;
import com.sap.mapper.UserMapper;
import org.springframework.cache.CacheManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
//@SpringApplicationConfiguration(BootdemoApplication.class)
public class BootdemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CacheManager cacheManager;

    @Test
    public void test() {
        User u1 = userMapper.findByUserName("lucy");
        System.out.println(u1.getUserAge());

        User u2 = userMapper.findByUserName("lucy");
        System.out.println(u2.getUserAge());

        /*u1.setUserAge(22);
        userMapper.save(u1);*/
        User u3 = userMapper.findByUserName("lucy");
        System.out.println(u3.getUserAge());
    }

    /*@Test
    public void contextLoads() {
    }*/

}
