package com.sap;

import com.sap.entity.User;
import com.sap.mapper.UserMapper;
import org.apache.ibatis.scripting.xmltags.ForEachSqlNode;
import org.springframework.cache.CacheManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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

        /**
        * .yml配置打开执行的sql语句,当访问数据库拿数据时会显示sql
        * 而从缓存中直接get数据不会显示执行了sql
        * 如何确定cacheManager对象的实例, spring的CacheManager
        * 如何与Ehcache结合起来的
        * */
        User u1 = userMapper.findByUserName("lucy");
        System.out.println(u1.getUserAge());

        User u2 = userMapper.findByUserName("lucy");
        System.out.println(u2.getUserAge());

        /*net.sf.ehcache.CacheManager cacheManager1 =
                net.sf.ehcache.CacheManager.newInstance("/ehcache.xml");
        String[] strs = cacheManager1.getCacheNames();//classpath:Conf
        for (int i=0; i<strs.length; i++) {
            System.out.println("--hello--"+strs[i]);
        }*/
        /**
         * asList(Object o)参数支持基本类型之后的坑
         * 传入基本类型的数组后,所有的元素将全部转化为list的第一个元素
         * list的size永远都是1
         * */
        Collection<String> strings = cacheManager.getCacheNames();
        char[] chars = new char[]{'h','i','i','l'};
        List list = Arrays.asList(chars);
        System.out.println(list.size());
        for (String str:strings
                ) {
            System.out.println("----------");
            System.out.println(str);
            System.out.println("----------");
        }

        /*u1.setUserAge(22);
        userMapper.save(u1);*/
        User u3 = userMapper.findByUserName("lucy");
        System.out.println(u3.getUserAge());
    }

    /*@Test
    public void contextLoads() {
    }*/

}
