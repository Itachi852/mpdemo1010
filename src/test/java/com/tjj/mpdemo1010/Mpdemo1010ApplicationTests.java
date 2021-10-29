package com.tjj.mpdemo1010;

import com.tjj.mpdemo1010.entity.User;
import com.tjj.mpdemo1010.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Mpdemo1010ApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        User user = userMapper.selectById(1);
        System.out.println(user);

    }

}
