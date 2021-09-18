package com.atguigu.mybatis_plus;

import com.atguigu.mybatis_plus.entity.User;
import com.atguigu.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/9/17  10:24
 */
@SpringBootTest
public class CRUDTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public  void testInsert(){
        User user=new User();
        user.setName("Aurora");
        user.setEmail("1354529884@qq.com");
        user.setAge(18);
        user.setCreateTime(new Date());

        int result=userMapper.insert(user);
        System.out.println("影响的行数："+result);
        System.out.println("user id: "+user.getId());
    }
}
