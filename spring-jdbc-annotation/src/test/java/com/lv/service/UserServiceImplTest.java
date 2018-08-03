package com.lv.service;

import com.lv.ApplicationContext;
import com.lv.entiy.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by houfalv on 2018/7/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationContext.class)
public class UserServiceImplTest {
    @Autowired
    private UserServiceImpl userService;

    @Test
    public void insert() {
        User user = new User();
        user.setUsername("张三");
        user.setPassword("张三");
        userService.insert(user);
    }
}