package com.lv.service;

import com.lv.entiy.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by houfalv on 2018/7/17.
 */
@Service
public class UserServiceImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(User user){
        String sql = "insert into user (username,password) values(?,?)";
        int update = jdbcTemplate.update(sql, user.getUsername(), user.getPassword());
        System.out.println(update);
    }
}
